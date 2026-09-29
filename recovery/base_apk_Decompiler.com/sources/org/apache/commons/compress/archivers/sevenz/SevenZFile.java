package org.apache.commons.compress.archivers.sevenz;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.LinkedList;
import java.util.zip.CRC32;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.utils.BoundedInputStream;
import org.apache.commons.compress.utils.CRC32VerifyingInputStream;
import org.apache.commons.compress.utils.IOUtils;

/* JADX INFO: loaded from: classes5.dex */
public class SevenZFile implements Closeable {
    static final int SIGNATURE_HEADER_SIZE = 32;
    static final byte[] sevenZSignature = {TarConstants.LF_CONTIG, 122, -68, -81, 39, 28};
    private final Archive archive;
    private int currentEntryIndex;
    private int currentFolderIndex;
    private InputStream currentFolderInputStream;
    private final ArrayList<InputStream> deferredBlockStreams;
    private RandomAccessFile file;
    private final String fileName;
    private byte[] password;

    public SevenZFile(File file, byte[] bArr) throws IOException {
        this.currentEntryIndex = -1;
        this.currentFolderIndex = -1;
        this.currentFolderInputStream = null;
        this.deferredBlockStreams = new ArrayList<>();
        this.file = new RandomAccessFile(file, "r");
        this.fileName = file.getAbsolutePath();
        try {
            this.archive = readHeaders(bArr);
            if (bArr != null) {
                byte[] bArr2 = new byte[bArr.length];
                this.password = bArr2;
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                return;
            }
            this.password = null;
        } catch (Throwable th) {
            this.file.close();
            throw th;
        }
    }

    public SevenZFile(File file) throws IOException {
        this(file, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        RandomAccessFile randomAccessFile = this.file;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
            } finally {
                this.file = null;
                byte[] bArr = this.password;
                if (bArr != null) {
                    Arrays.fill(bArr, (byte) 0);
                }
                this.password = null;
            }
        }
    }

    public SevenZArchiveEntry getNextEntry() throws IOException {
        if (this.currentEntryIndex >= this.archive.files.length - 1) {
            return null;
        }
        this.currentEntryIndex++;
        SevenZArchiveEntry sevenZArchiveEntry = this.archive.files[this.currentEntryIndex];
        buildDecodingStream();
        return sevenZArchiveEntry;
    }

    public Iterable<SevenZArchiveEntry> getEntries() {
        return Arrays.asList(this.archive.files);
    }

    private Archive readHeaders(byte[] bArr) throws Throwable {
        byte[] bArr2 = new byte[6];
        this.file.readFully(bArr2);
        if (!Arrays.equals(bArr2, sevenZSignature)) {
            throw new IOException("Bad 7z signature");
        }
        byte b = this.file.readByte();
        byte b2 = this.file.readByte();
        if (b != 0) {
            throw new IOException(String.format("Unsupported 7z version (%d,%d)", Byte.valueOf(b), Byte.valueOf(b2)));
        }
        long j = -1;
        StartHeader startHeader = readStartHeader(((long) Integer.reverseBytes(this.file.readInt())) & ((((long) 0) << 32) | (j - ((j >> 63) << 32))));
        int i = (int) startHeader.nextHeaderSize;
        if (i != startHeader.nextHeaderSize) {
            StringBuilder sb = new StringBuilder("cannot handle nextHeaderSize ");
            sb.append(startHeader.nextHeaderSize);
            throw new IOException(sb.toString());
        }
        this.file.seek(startHeader.nextHeaderOffset + 32);
        byte[] bArr3 = new byte[i];
        this.file.readFully(bArr3);
        CRC32 crc32 = new CRC32();
        crc32.update(bArr3);
        if (startHeader.nextHeaderCrc != crc32.getValue()) {
            throw new IOException("NextHeader CRC mismatch");
        }
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr3));
        Archive archive = new Archive();
        int unsignedByte = dataInputStream.readUnsignedByte();
        if (unsignedByte == 23) {
            dataInputStream = readEncodedHeader(dataInputStream, archive, bArr);
            archive = new Archive();
            unsignedByte = dataInputStream.readUnsignedByte();
        }
        if (unsignedByte == 1) {
            readHeader(dataInputStream, archive);
            dataInputStream.close();
            return archive;
        }
        throw new IOException("Broken or unsupported archive: no Header");
    }

    private StartHeader readStartHeader(long j) throws Throwable {
        DataInputStream dataInputStream;
        StartHeader startHeader = new StartHeader();
        try {
            dataInputStream = new DataInputStream(new CRC32VerifyingInputStream(new BoundedRandomAccessFileInputStream(this.file, 20L), 20L, j));
        } catch (Throwable th) {
            th = th;
            dataInputStream = null;
        }
        try {
            startHeader.nextHeaderOffset = Long.reverseBytes(dataInputStream.readLong());
            startHeader.nextHeaderSize = Long.reverseBytes(dataInputStream.readLong());
            long j2 = -1;
            startHeader.nextHeaderCrc = ((long) Integer.reverseBytes(dataInputStream.readInt())) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
            dataInputStream.close();
            return startHeader;
        } catch (Throwable th2) {
            th = th2;
            if (dataInputStream != null) {
                dataInputStream.close();
            }
            throw th;
        }
    }

    private void readHeader(DataInput dataInput, Archive archive) throws IOException {
        int unsignedByte = dataInput.readUnsignedByte();
        if (unsignedByte == 2) {
            readArchiveProperties(dataInput);
            unsignedByte = dataInput.readUnsignedByte();
        }
        if (unsignedByte == 3) {
            throw new IOException("Additional streams unsupported");
        }
        if (unsignedByte == 4) {
            readStreamsInfo(dataInput, archive);
            unsignedByte = dataInput.readUnsignedByte();
        }
        if (unsignedByte == 5) {
            readFilesInfo(dataInput, archive);
            unsignedByte = dataInput.readUnsignedByte();
        }
        if (unsignedByte != 0) {
            throw new IOException("Badly terminated header, found ".concat(String.valueOf(unsignedByte)));
        }
    }

    private void readArchiveProperties(DataInput dataInput) throws IOException {
        int unsignedByte = dataInput.readUnsignedByte();
        while (unsignedByte != 0) {
            dataInput.readFully(new byte[(int) readUint64(dataInput)]);
            unsignedByte = dataInput.readUnsignedByte();
        }
    }

    private DataInputStream readEncodedHeader(DataInputStream dataInputStream, Archive archive, byte[] bArr) throws IOException {
        readStreamsInfo(dataInputStream, archive);
        Folder folder = archive.folders[0];
        this.file.seek(archive.packPos + 32);
        BoundedRandomAccessFileInputStream boundedRandomAccessFileInputStream = new BoundedRandomAccessFileInputStream(this.file, archive.packSizes[0]);
        InputStream cRC32VerifyingInputStream = boundedRandomAccessFileInputStream;
        for (Coder coder : folder.getOrderedCoders()) {
            if (coder.numInStreams != 1 || coder.numOutStreams != 1) {
                throw new IOException("Multi input/output stream coders are not yet supported");
            }
            cRC32VerifyingInputStream = Coders.addDecoder(this.fileName, cRC32VerifyingInputStream, folder.getUnpackSizeForCoder(coder), coder, bArr);
        }
        if (folder.hasCrc) {
            cRC32VerifyingInputStream = new CRC32VerifyingInputStream(cRC32VerifyingInputStream, folder.getUnpackSize(), folder.crc);
        }
        byte[] bArr2 = new byte[(int) folder.getUnpackSize()];
        DataInputStream dataInputStream2 = new DataInputStream(cRC32VerifyingInputStream);
        try {
            dataInputStream2.readFully(bArr2);
            dataInputStream2.close();
            return new DataInputStream(new ByteArrayInputStream(bArr2));
        } catch (Throwable th) {
            dataInputStream2.close();
            throw th;
        }
    }

    private void readStreamsInfo(DataInput dataInput, Archive archive) throws IOException {
        int unsignedByte = dataInput.readUnsignedByte();
        if (unsignedByte == 6) {
            readPackInfo(dataInput, archive);
            unsignedByte = dataInput.readUnsignedByte();
        }
        if (unsignedByte == 7) {
            readUnpackInfo(dataInput, archive);
            unsignedByte = dataInput.readUnsignedByte();
        } else {
            archive.folders = new Folder[0];
        }
        if (unsignedByte == 8) {
            readSubStreamsInfo(dataInput, archive);
            unsignedByte = dataInput.readUnsignedByte();
        }
        if (unsignedByte != 0) {
            throw new IOException("Badly terminated StreamsInfo");
        }
    }

    private void readPackInfo(DataInput dataInput, Archive archive) throws IOException {
        archive.packPos = readUint64(dataInput);
        long uint64 = readUint64(dataInput);
        int unsignedByte = dataInput.readUnsignedByte();
        if (unsignedByte == 9) {
            archive.packSizes = new long[(int) uint64];
            for (int i = 0; i < archive.packSizes.length; i++) {
                archive.packSizes[i] = readUint64(dataInput);
            }
            unsignedByte = dataInput.readUnsignedByte();
        }
        if (unsignedByte == 10) {
            int i2 = (int) uint64;
            archive.packCrcsDefined = readAllOrBits(dataInput, i2);
            archive.packCrcs = new long[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                if (archive.packCrcsDefined.get(i3)) {
                    long j = -1;
                    archive.packCrcs[i3] = ((long) Integer.reverseBytes(dataInput.readInt())) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
                }
            }
            unsignedByte = dataInput.readUnsignedByte();
        }
        if (unsignedByte == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder("Badly terminated PackInfo (");
        sb.append(unsignedByte);
        sb.append(")");
        throw new IOException(sb.toString());
    }

    private void readUnpackInfo(DataInput dataInput, Archive archive) throws IOException {
        int unsignedByte = dataInput.readUnsignedByte();
        if (unsignedByte != 11) {
            throw new IOException("Expected kFolder, got ".concat(String.valueOf(unsignedByte)));
        }
        int uint64 = (int) readUint64(dataInput);
        Folder[] folderArr = new Folder[uint64];
        archive.folders = folderArr;
        if (dataInput.readUnsignedByte() != 0) {
            throw new IOException("External unsupported");
        }
        for (int i = 0; i < uint64; i++) {
            folderArr[i] = readFolder(dataInput);
        }
        int unsignedByte2 = dataInput.readUnsignedByte();
        if (unsignedByte2 != 12) {
            throw new IOException("Expected kCodersUnpackSize, got ".concat(String.valueOf(unsignedByte2)));
        }
        for (int i2 = 0; i2 < uint64; i2++) {
            Folder folder = folderArr[i2];
            folder.unpackSizes = new long[(int) folder.totalOutputStreams];
            for (int i3 = 0; i3 < folder.totalOutputStreams; i3++) {
                folder.unpackSizes[i3] = readUint64(dataInput);
            }
        }
        int unsignedByte3 = dataInput.readUnsignedByte();
        if (unsignedByte3 == 10) {
            BitSet allOrBits = readAllOrBits(dataInput, uint64);
            for (int i4 = 0; i4 < uint64; i4++) {
                if (allOrBits.get(i4)) {
                    folderArr[i4].hasCrc = true;
                    long j = -1;
                    folderArr[i4].crc = ((long) Integer.reverseBytes(dataInput.readInt())) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
                } else {
                    folderArr[i4].hasCrc = false;
                }
            }
            unsignedByte3 = dataInput.readUnsignedByte();
        }
        if (unsignedByte3 != 0) {
            throw new IOException("Badly terminated UnpackInfo");
        }
    }

    private void readSubStreamsInfo(DataInput dataInput, Archive archive) throws IOException {
        for (Folder folder : archive.folders) {
            folder.numUnpackSubStreams = 1;
        }
        int length = archive.folders.length;
        int unsignedByte = dataInput.readUnsignedByte();
        if (unsignedByte == 13) {
            int i = 0;
            for (Folder folder2 : archive.folders) {
                long uint64 = readUint64(dataInput);
                folder2.numUnpackSubStreams = (int) uint64;
                i = (int) (((long) i) + uint64);
            }
            unsignedByte = dataInput.readUnsignedByte();
            length = i;
        }
        SubStreamsInfo subStreamsInfo = new SubStreamsInfo();
        subStreamsInfo.unpackSizes = new long[length];
        subStreamsInfo.hasCrc = new BitSet(length);
        subStreamsInfo.crcs = new long[length];
        int i2 = 0;
        for (Folder folder3 : archive.folders) {
            if (folder3.numUnpackSubStreams != 0) {
                long j = 0;
                if (unsignedByte == 9) {
                    int i3 = 0;
                    while (i3 < folder3.numUnpackSubStreams - 1) {
                        long uint642 = readUint64(dataInput);
                        subStreamsInfo.unpackSizes[i2] = uint642;
                        j += uint642;
                        i3++;
                        i2++;
                    }
                }
                subStreamsInfo.unpackSizes[i2] = folder3.getUnpackSize() - j;
                i2++;
            }
        }
        if (unsignedByte == 9) {
            unsignedByte = dataInput.readUnsignedByte();
        }
        int i4 = 0;
        for (Folder folder4 : archive.folders) {
            if (folder4.numUnpackSubStreams != 1 || !folder4.hasCrc) {
                i4 += folder4.numUnpackSubStreams;
            }
        }
        if (unsignedByte == 10) {
            BitSet allOrBits = readAllOrBits(dataInput, i4);
            long[] jArr = new long[i4];
            for (int i5 = 0; i5 < i4; i5++) {
                if (allOrBits.get(i5)) {
                    long j2 = -1;
                    jArr[i5] = ((long) Integer.reverseBytes(dataInput.readInt())) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
                }
            }
            int i6 = 0;
            int i7 = 0;
            for (Folder folder5 : archive.folders) {
                if (folder5.numUnpackSubStreams == 1 && folder5.hasCrc) {
                    subStreamsInfo.hasCrc.set(i6, true);
                    subStreamsInfo.crcs[i6] = folder5.crc;
                    i6++;
                } else {
                    for (int i8 = 0; i8 < folder5.numUnpackSubStreams; i8++) {
                        subStreamsInfo.hasCrc.set(i6, allOrBits.get(i7));
                        subStreamsInfo.crcs[i6] = jArr[i7];
                        i6++;
                        i7++;
                    }
                }
            }
            unsignedByte = dataInput.readUnsignedByte();
        }
        if (unsignedByte != 0) {
            throw new IOException("Badly terminated SubStreamsInfo");
        }
        archive.subStreamsInfo = subStreamsInfo;
    }

    private Folder readFolder(DataInput dataInput) throws IOException {
        int i;
        Folder folder = new Folder();
        int uint64 = (int) readUint64(dataInput);
        Coder[] coderArr = new Coder[uint64];
        long j = 0;
        long j2 = 0;
        for (int i2 = 0; i2 < uint64; i2++) {
            coderArr[i2] = new Coder();
            int unsignedByte = dataInput.readUnsignedByte();
            boolean z = (unsignedByte & 16) == 0;
            boolean z2 = (unsignedByte & 32) != 0;
            boolean z3 = (unsignedByte & 128) != 0;
            coderArr[i2].decompressionMethodId = new byte[unsignedByte & 15];
            dataInput.readFully(coderArr[i2].decompressionMethodId);
            if (z) {
                coderArr[i2].numInStreams = 1L;
                coderArr[i2].numOutStreams = 1L;
            } else {
                coderArr[i2].numInStreams = readUint64(dataInput);
                coderArr[i2].numOutStreams = readUint64(dataInput);
            }
            j += coderArr[i2].numInStreams;
            j2 += coderArr[i2].numOutStreams;
            if (z2) {
                coderArr[i2].properties = new byte[(int) readUint64(dataInput)];
                dataInput.readFully(coderArr[i2].properties);
            }
            if (z3) {
                throw new IOException("Alternative methods are unsupported, please report. The reference implementation doesn't support them either.");
            }
        }
        folder.coders = coderArr;
        folder.totalInputStreams = j;
        folder.totalOutputStreams = j2;
        if (j2 == 0) {
            throw new IOException("Total output streams can't be 0");
        }
        long j3 = j2 - 1;
        int i3 = (int) j3;
        BindPair[] bindPairArr = new BindPair[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            BindPair bindPair = new BindPair();
            bindPairArr[i4] = bindPair;
            bindPair.inIndex = readUint64(dataInput);
            bindPairArr[i4].outIndex = readUint64(dataInput);
        }
        folder.bindPairs = bindPairArr;
        if (j < j3) {
            throw new IOException("Total input streams can't be less than the number of bind pairs");
        }
        long j4 = j - j3;
        int i5 = (int) j4;
        long[] jArr = new long[i5];
        if (j4 == 1) {
            int i6 = 0;
            while (true) {
                i = (int) j;
                if (i6 >= i || folder.findBindPairForInStream(i6) < 0) {
                    break;
                }
                i6++;
            }
            if (i6 == i) {
                throw new IOException("Couldn't find stream's bind pair index");
            }
            jArr[0] = i6;
        } else {
            for (int i7 = 0; i7 < i5; i7++) {
                jArr[i7] = readUint64(dataInput);
            }
        }
        folder.packedStreams = jArr;
        return folder;
    }

    private BitSet readAllOrBits(DataInput dataInput, int i) throws IOException {
        if (dataInput.readUnsignedByte() != 0) {
            BitSet bitSet = new BitSet(i);
            for (int i2 = 0; i2 < i; i2++) {
                bitSet.set(i2, true);
            }
            return bitSet;
        }
        return readBits(dataInput, i);
    }

    private BitSet readBits(DataInput dataInput, int i) throws IOException {
        BitSet bitSet = new BitSet(i);
        int i2 = 0;
        int unsignedByte = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (i2 == 0) {
                unsignedByte = dataInput.readUnsignedByte();
                i2 = 128;
            }
            bitSet.set(i3, (unsignedByte & i2) != 0);
            i2 >>>= 1;
        }
        return bitSet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:103:0x01eb, code lost:
    
        throw new java.io.IOException("Error parsing file names");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void readFilesInfo(java.io.DataInput r17, org.apache.commons.compress.archivers.sevenz.Archive r18) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 602
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.compress.archivers.sevenz.SevenZFile.readFilesInfo(java.io.DataInput, org.apache.commons.compress.archivers.sevenz.Archive):void");
    }

    private void calculateStreamMap(Archive archive) throws IOException {
        StreamMap streamMap = new StreamMap();
        int length = archive.folders != null ? archive.folders.length : 0;
        streamMap.folderFirstPackStreamIndex = new int[length];
        int length2 = 0;
        for (int i = 0; i < length; i++) {
            streamMap.folderFirstPackStreamIndex[i] = length2;
            length2 += archive.folders[i].packedStreams.length;
        }
        int length3 = archive.packSizes != null ? archive.packSizes.length : 0;
        streamMap.packStreamOffsets = new long[length3];
        long j = 0;
        for (int i2 = 0; i2 < length3; i2++) {
            streamMap.packStreamOffsets[i2] = j;
            j += archive.packSizes[i2];
        }
        streamMap.folderFirstFileIndex = new int[length];
        streamMap.fileFolderIndex = new int[archive.files.length];
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < archive.files.length; i5++) {
            if (!archive.files[i5].hasStream() && i3 == 0) {
                streamMap.fileFolderIndex[i5] = -1;
            } else {
                if (i3 == 0) {
                    while (i4 < archive.folders.length) {
                        streamMap.folderFirstFileIndex[i4] = i5;
                        if (archive.folders[i4].numUnpackSubStreams > 0) {
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (i4 >= archive.folders.length) {
                        throw new IOException("Too few folders in archive");
                    }
                }
                streamMap.fileFolderIndex[i5] = i4;
                if (archive.files[i5].hasStream() && (i3 = i3 + 1) >= archive.folders[i4].numUnpackSubStreams) {
                    i4++;
                    i3 = 0;
                }
            }
        }
        archive.streamMap = streamMap;
    }

    private void buildDecodingStream() throws IOException {
        int i = this.archive.streamMap.fileFolderIndex[this.currentEntryIndex];
        if (i < 0) {
            this.deferredBlockStreams.clear();
            return;
        }
        SevenZArchiveEntry sevenZArchiveEntry = this.archive.files[this.currentEntryIndex];
        if (this.currentFolderIndex == i) {
            sevenZArchiveEntry.setContentMethods(this.archive.files[this.currentEntryIndex - 1].getContentMethods());
        } else {
            this.currentFolderIndex = i;
            this.deferredBlockStreams.clear();
            InputStream inputStream = this.currentFolderInputStream;
            if (inputStream != null) {
                inputStream.close();
                this.currentFolderInputStream = null;
            }
            Folder folder = this.archive.folders[i];
            int i2 = this.archive.streamMap.folderFirstPackStreamIndex[i];
            this.currentFolderInputStream = buildDecoderStack(folder, this.archive.streamMap.packStreamOffsets[i2] + this.archive.packPos + 32, i2, sevenZArchiveEntry);
        }
        InputStream boundedInputStream = new BoundedInputStream(this.currentFolderInputStream, sevenZArchiveEntry.getSize());
        if (sevenZArchiveEntry.getHasCrc()) {
            boundedInputStream = new CRC32VerifyingInputStream(boundedInputStream, sevenZArchiveEntry.getSize(), sevenZArchiveEntry.getCrcValue());
        }
        this.deferredBlockStreams.add(boundedInputStream);
    }

    private InputStream buildDecoderStack(Folder folder, long j, int i, SevenZArchiveEntry sevenZArchiveEntry) throws IOException {
        this.file.seek(j);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new BoundedRandomAccessFileInputStream(this.file, this.archive.packSizes[i]));
        LinkedList linkedList = new LinkedList();
        InputStream inputStreamAddDecoder = bufferedInputStream;
        for (Coder coder : folder.getOrderedCoders()) {
            if (coder.numInStreams != 1 || coder.numOutStreams != 1) {
                throw new IOException("Multi input/output stream coders are not yet supported");
            }
            SevenZMethod sevenZMethodById = SevenZMethod.byId(coder.decompressionMethodId);
            inputStreamAddDecoder = Coders.addDecoder(this.fileName, inputStreamAddDecoder, folder.getUnpackSizeForCoder(coder), coder, this.password);
            linkedList.addFirst(new SevenZMethodConfiguration(sevenZMethodById, Coders.findByMethod(sevenZMethodById).getOptionsFromCoder(coder, inputStreamAddDecoder)));
        }
        sevenZArchiveEntry.setContentMethods(linkedList);
        return folder.hasCrc ? new CRC32VerifyingInputStream(inputStreamAddDecoder, folder.getUnpackSize(), folder.crc) : inputStreamAddDecoder;
    }

    public int read() throws IOException {
        return getCurrentStream().read();
    }

    private InputStream getCurrentStream() throws IOException {
        if (this.archive.files[this.currentEntryIndex].getSize() == 0) {
            return new ByteArrayInputStream(new byte[0]);
        }
        if (this.deferredBlockStreams.isEmpty()) {
            throw new IllegalStateException("No current 7z entry (call getNextEntry() first).");
        }
        while (this.deferredBlockStreams.size() > 1) {
            InputStream inputStreamRemove = this.deferredBlockStreams.remove(0);
            IOUtils.skip(inputStreamRemove, Long.MAX_VALUE);
            inputStreamRemove.close();
        }
        return this.deferredBlockStreams.get(0);
    }

    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        return getCurrentStream().read(bArr, i, i2);
    }

    private static long readUint64(DataInput dataInput) throws IOException {
        long unsignedByte = dataInput.readUnsignedByte();
        int i = 128;
        long unsignedByte2 = 0;
        for (int i2 = 0; i2 < 8; i2++) {
            if ((((long) i) & unsignedByte) == 0) {
                return ((unsignedByte & ((long) (i - 1))) << (i2 << 3)) | unsignedByte2;
            }
            unsignedByte2 |= ((long) dataInput.readUnsignedByte()) << (i2 << 3);
            i >>>= 1;
        }
        return unsignedByte2;
    }

    public static boolean matches(byte[] bArr, int i) {
        if (i < sevenZSignature.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = sevenZSignature;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    private static long skipBytesFully(DataInput dataInput, long j) throws IOException {
        int iSkipBytes;
        if (j < 1) {
            return 0L;
        }
        long j2 = 0;
        while (j > 2147483647L) {
            long jSkipBytesFully = skipBytesFully(dataInput, 2147483647L);
            if (jSkipBytesFully == 0) {
                return j2;
            }
            j2 += jSkipBytesFully;
            j -= jSkipBytesFully;
        }
        while (j > 0 && (iSkipBytes = dataInput.skipBytes((int) j)) != 0) {
            long j3 = iSkipBytes;
            j2 += j3;
            j -= j3;
        }
        return j2;
    }

    public String toString() {
        return this.archive.toString();
    }
}
