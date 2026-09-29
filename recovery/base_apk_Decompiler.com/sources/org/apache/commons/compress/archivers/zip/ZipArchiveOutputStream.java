package org.apache.commons.compress.archivers.zip;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.zip.Deflater;
import java.util.zip.ZipException;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ArchiveOutputStream;
import org.apache.commons.compress.utils.IOUtils;

/* JADX INFO: loaded from: classes5.dex */
public class ZipArchiveOutputStream extends ArchiveOutputStream {
    static final int BUFFER_SIZE = 512;
    private static final int CFH_COMMENT_LENGTH_OFFSET = 32;
    private static final int CFH_COMPRESSED_SIZE_OFFSET = 20;
    private static final int CFH_CRC_OFFSET = 16;
    private static final int CFH_DISK_NUMBER_OFFSET = 34;
    private static final int CFH_EXTERNAL_ATTRIBUTES_OFFSET = 38;
    private static final int CFH_EXTRA_LENGTH_OFFSET = 30;
    private static final int CFH_FILENAME_LENGTH_OFFSET = 28;
    private static final int CFH_FILENAME_OFFSET = 46;
    private static final int CFH_GPB_OFFSET = 8;
    private static final int CFH_INTERNAL_ATTRIBUTES_OFFSET = 36;
    private static final int CFH_LFH_OFFSET = 42;
    private static final int CFH_METHOD_OFFSET = 10;
    private static final int CFH_ORIGINAL_SIZE_OFFSET = 24;
    private static final int CFH_SIG_OFFSET = 0;
    private static final int CFH_TIME_OFFSET = 12;
    private static final int CFH_VERSION_MADE_BY_OFFSET = 4;
    private static final int CFH_VERSION_NEEDED_OFFSET = 6;
    public static final int DEFAULT_COMPRESSION = -1;
    static final String DEFAULT_ENCODING = "UTF8";
    public static final int DEFLATED = 8;

    @Deprecated
    public static final int EFS_FLAG = 2048;
    private static final int LFH_COMPRESSED_SIZE_OFFSET = 18;
    private static final int LFH_CRC_OFFSET = 14;
    private static final int LFH_EXTRA_LENGTH_OFFSET = 28;
    private static final int LFH_FILENAME_LENGTH_OFFSET = 26;
    private static final int LFH_FILENAME_OFFSET = 30;
    private static final int LFH_GPB_OFFSET = 6;
    private static final int LFH_METHOD_OFFSET = 8;
    private static final int LFH_ORIGINAL_SIZE_OFFSET = 22;
    private static final int LFH_SIG_OFFSET = 0;
    private static final int LFH_TIME_OFFSET = 10;
    private static final int LFH_VERSION_NEEDED_OFFSET = 4;
    public static final int STORED = 0;
    private final Calendar calendarInstance;
    private long cdLength;
    private long cdOffset;
    private String comment;
    private final byte[] copyBuffer;
    private UnicodeExtraFieldPolicy createUnicodeExtraFields;
    protected final Deflater def;
    private String encoding;
    private final List<ZipArchiveEntry> entries;
    private CurrentEntry entry;
    private boolean fallbackToUTF8;
    protected boolean finished;
    private boolean hasCompressionLevelChanged;
    private boolean hasUsedZip64;
    private int level;
    private int method;
    private final Map<ZipArchiveEntry, Long> offsets;
    private final OutputStream out;
    private final RandomAccessFile raf;
    private final StreamCompressor streamCompressor;
    private boolean useUTF8Flag;
    private Zip64Mode zip64Mode;
    private ZipEncoding zipEncoding;
    private static final byte[] EMPTY = new byte[0];
    private static final byte[] ZERO = {0, 0};
    private static final byte[] LZERO = {0, 0, 0, 0};
    private static final byte[] ONE = ZipLong.getBytes(1);
    static final byte[] LFH_SIG = ZipLong.LFH_SIG.getBytes();
    static final byte[] DD_SIG = ZipLong.DD_SIG.getBytes();
    static final byte[] CFH_SIG = ZipLong.CFH_SIG.getBytes();
    static final byte[] EOCD_SIG = ZipLong.getBytes(101010256);
    static final byte[] ZIP64_EOCD_SIG = ZipLong.getBytes(101075792);
    static final byte[] ZIP64_EOCD_LOC_SIG = ZipLong.getBytes(117853008);

    public ZipArchiveOutputStream(OutputStream outputStream) {
        this.finished = false;
        this.comment = "";
        this.level = -1;
        this.hasCompressionLevelChanged = false;
        this.method = 8;
        this.entries = new LinkedList();
        this.cdOffset = 0L;
        this.cdLength = 0L;
        this.offsets = new HashMap();
        this.encoding = DEFAULT_ENCODING;
        this.zipEncoding = ZipEncodingHelper.getZipEncoding(DEFAULT_ENCODING);
        this.useUTF8Flag = true;
        this.fallbackToUTF8 = false;
        this.createUnicodeExtraFields = UnicodeExtraFieldPolicy.NEVER;
        this.hasUsedZip64 = false;
        this.zip64Mode = Zip64Mode.AsNeeded;
        this.copyBuffer = new byte[32768];
        this.calendarInstance = Calendar.getInstance();
        this.out = outputStream;
        this.raf = null;
        Deflater deflater = new Deflater(this.level, true);
        this.def = deflater;
        this.streamCompressor = StreamCompressor.create(outputStream, deflater);
    }

    public ZipArchiveOutputStream(File file) throws IOException {
        RandomAccessFile randomAccessFile;
        FileOutputStream fileOutputStream;
        this.finished = false;
        this.comment = "";
        this.level = -1;
        this.hasCompressionLevelChanged = false;
        this.method = 8;
        this.entries = new LinkedList();
        this.cdOffset = 0L;
        this.cdLength = 0L;
        this.offsets = new HashMap();
        this.encoding = DEFAULT_ENCODING;
        this.zipEncoding = ZipEncodingHelper.getZipEncoding(DEFAULT_ENCODING);
        this.useUTF8Flag = true;
        this.fallbackToUTF8 = false;
        this.createUnicodeExtraFields = UnicodeExtraFieldPolicy.NEVER;
        this.hasUsedZip64 = false;
        this.zip64Mode = Zip64Mode.AsNeeded;
        this.copyBuffer = new byte[32768];
        this.calendarInstance = Calendar.getInstance();
        RandomAccessFile randomAccessFile2 = null;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
        } catch (IOException unused) {
            randomAccessFile = null;
        }
        try {
            randomAccessFile.setLength(0L);
            fileOutputStream = null;
            randomAccessFile2 = randomAccessFile;
        } catch (IOException unused2) {
            IOUtils.closeQuietly(randomAccessFile);
            fileOutputStream = new FileOutputStream(file);
        }
        Deflater deflater = new Deflater(this.level, true);
        this.def = deflater;
        this.streamCompressor = StreamCompressor.create(randomAccessFile2, deflater);
        this.out = fileOutputStream;
        this.raf = randomAccessFile2;
    }

    public boolean isSeekable() {
        return this.raf != null;
    }

    public void setEncoding(String str) {
        this.encoding = str;
        this.zipEncoding = ZipEncodingHelper.getZipEncoding(str);
        if (!this.useUTF8Flag || ZipEncodingHelper.isUTF8(str)) {
            return;
        }
        this.useUTF8Flag = false;
    }

    public String getEncoding() {
        return this.encoding;
    }

    public void setUseLanguageEncodingFlag(boolean z) {
        this.useUTF8Flag = z && ZipEncodingHelper.isUTF8(this.encoding);
    }

    public void setCreateUnicodeExtraFields(UnicodeExtraFieldPolicy unicodeExtraFieldPolicy) {
        this.createUnicodeExtraFields = unicodeExtraFieldPolicy;
    }

    public void setFallbackToUTF8(boolean z) {
        this.fallbackToUTF8 = z;
    }

    public void setUseZip64(Zip64Mode zip64Mode) {
        this.zip64Mode = zip64Mode;
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public void finish() throws IOException {
        if (this.finished) {
            throw new IOException("This archive has already been finished");
        }
        if (this.entry != null) {
            throw new IOException("This archive contains unclosed entries.");
        }
        this.cdOffset = this.streamCompressor.getTotalBytesWritten();
        writeCentralDirectoryInChunks();
        this.cdLength = this.streamCompressor.getTotalBytesWritten() - this.cdOffset;
        writeZip64CentralDirectory();
        writeCentralDirectoryEnd();
        this.offsets.clear();
        this.entries.clear();
        this.streamCompressor.close();
        this.finished = true;
    }

    private void writeCentralDirectoryInChunks() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(70000);
        Iterator<ZipArchiveEntry> it = this.entries.iterator();
        while (true) {
            int i = 0;
            while (it.hasNext()) {
                byteArrayOutputStream.write(createCentralFileHeader(it.next()));
                i++;
                if (i > 1000) {
                    break;
                }
            }
            writeCounted(byteArrayOutputStream.toByteArray());
            return;
            writeCounted(byteArrayOutputStream.toByteArray());
            byteArrayOutputStream.reset();
        }
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public void closeArchiveEntry() throws IOException {
        preClose();
        flushDeflater();
        long totalBytesWritten = this.streamCompressor.getTotalBytesWritten();
        long j = this.entry.dataStart;
        long crc32 = this.streamCompressor.getCrc32();
        this.entry.bytesRead = this.streamCompressor.getBytesRead();
        closeEntry(handleSizesAndCrc(totalBytesWritten - j, crc32, getEffectiveZip64Mode(this.entry.entry)), false);
        this.streamCompressor.reset();
    }

    private void closeCopiedEntry(boolean z) throws IOException {
        preClose();
        CurrentEntry currentEntry = this.entry;
        currentEntry.bytesRead = currentEntry.entry.getSize();
        closeEntry(checkIfNeedsZip64(getEffectiveZip64Mode(this.entry.entry)), z);
    }

    private void closeEntry(boolean z, boolean z2) throws IOException {
        if (!z2 && this.raf != null) {
            rewriteSizesAndCrc(z);
        }
        writeDataDescriptor(this.entry.entry);
        this.entry = null;
    }

    private void preClose() throws IOException {
        if (this.finished) {
            throw new IOException("Stream has already been finished");
        }
        CurrentEntry currentEntry = this.entry;
        if (currentEntry == null) {
            throw new IOException("No current entry to close");
        }
        if (currentEntry.hasWritten) {
            return;
        }
        write(EMPTY, 0, 0);
    }

    public void addRawArchiveEntry(ZipArchiveEntry zipArchiveEntry, InputStream inputStream) throws IOException {
        ZipArchiveEntry zipArchiveEntry2 = new ZipArchiveEntry(zipArchiveEntry);
        if (hasZip64Extra(zipArchiveEntry2)) {
            zipArchiveEntry2.removeExtraField(Zip64ExtendedInformationExtraField.HEADER_ID);
        }
        boolean z = (zipArchiveEntry2.getCrc() == -1 || zipArchiveEntry2.getSize() == -1 || zipArchiveEntry2.getCompressedSize() == -1) ? false : true;
        putArchiveEntry(zipArchiveEntry2, z);
        copyFromZipInputStream(inputStream);
        closeCopiedEntry(z);
    }

    private void flushDeflater() throws IOException {
        if (this.entry.entry.getMethod() == 8) {
            this.streamCompressor.flushDeflater();
        }
    }

    private boolean handleSizesAndCrc(long j, long j2, Zip64Mode zip64Mode) throws ZipException {
        if (this.entry.entry.getMethod() != 8) {
            if (this.raf != null) {
                this.entry.entry.setSize(j);
                this.entry.entry.setCompressedSize(j);
                this.entry.entry.setCrc(j2);
            } else {
                if (this.entry.entry.getCrc() != j2) {
                    StringBuilder sb = new StringBuilder("bad CRC checksum for entry ");
                    sb.append(this.entry.entry.getName());
                    sb.append(": ");
                    sb.append(Long.toHexString(this.entry.entry.getCrc()));
                    sb.append(" instead of ");
                    sb.append(Long.toHexString(j2));
                    throw new ZipException(sb.toString());
                }
                if (this.entry.entry.getSize() != j) {
                    StringBuilder sb2 = new StringBuilder("bad size for entry ");
                    sb2.append(this.entry.entry.getName());
                    sb2.append(": ");
                    sb2.append(this.entry.entry.getSize());
                    sb2.append(" instead of ");
                    sb2.append(j);
                    throw new ZipException(sb2.toString());
                }
            }
        } else {
            this.entry.entry.setSize(this.entry.bytesRead);
            this.entry.entry.setCompressedSize(j);
            this.entry.entry.setCrc(j2);
        }
        return checkIfNeedsZip64(zip64Mode);
    }

    private boolean checkIfNeedsZip64(Zip64Mode zip64Mode) throws ZipException {
        boolean zIsZip64Required = isZip64Required(this.entry.entry, zip64Mode);
        if (zIsZip64Required && zip64Mode == Zip64Mode.Never) {
            throw new Zip64RequiredException(Zip64RequiredException.getEntryTooBigMessage(this.entry.entry));
        }
        return zIsZip64Required;
    }

    private boolean isZip64Required(ZipArchiveEntry zipArchiveEntry, Zip64Mode zip64Mode) {
        return zip64Mode == Zip64Mode.Always || isTooLageForZip32(zipArchiveEntry);
    }

    private boolean isTooLageForZip32(ZipArchiveEntry zipArchiveEntry) {
        long j = -1;
        if (zipArchiveEntry.getSize() >= ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) {
            return true;
        }
        long j2 = -1;
        return zipArchiveEntry.getCompressedSize() >= ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)));
    }

    private void rewriteSizesAndCrc(boolean z) throws IOException {
        long filePointer = this.raf.getFilePointer();
        this.raf.seek(this.entry.localDataStart);
        writeOut(ZipLong.getBytes(this.entry.entry.getCrc()));
        if (hasZip64Extra(this.entry.entry) && z) {
            writeOut(ZipLong.ZIP64_MAGIC.getBytes());
            writeOut(ZipLong.ZIP64_MAGIC.getBytes());
        } else {
            writeOut(ZipLong.getBytes(this.entry.entry.getCompressedSize()));
            writeOut(ZipLong.getBytes(this.entry.entry.getSize()));
        }
        if (hasZip64Extra(this.entry.entry)) {
            ByteBuffer name = getName(this.entry.entry);
            this.raf.seek(this.entry.localDataStart + 16 + ((long) (name.limit() - name.position())) + 4);
            writeOut(ZipEightByteInteger.getBytes(this.entry.entry.getSize()));
            writeOut(ZipEightByteInteger.getBytes(this.entry.entry.getCompressedSize()));
            if (!z) {
                this.raf.seek(this.entry.localDataStart - 10);
                writeOut(ZipShort.getBytes(10));
                this.entry.entry.removeExtraField(Zip64ExtendedInformationExtraField.HEADER_ID);
                this.entry.entry.setExtra();
                if (this.entry.causedUseOfZip64) {
                    this.hasUsedZip64 = false;
                }
            }
        }
        this.raf.seek(filePointer);
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public void putArchiveEntry(ArchiveEntry archiveEntry) throws IOException {
        putArchiveEntry(archiveEntry, false);
    }

    private void putArchiveEntry(ArchiveEntry archiveEntry, boolean z) throws IOException {
        if (this.finished) {
            throw new IOException("Stream has already been finished");
        }
        if (this.entry != null) {
            closeArchiveEntry();
        }
        ZipArchiveEntry zipArchiveEntry = (ZipArchiveEntry) archiveEntry;
        CurrentEntry currentEntry = new CurrentEntry(zipArchiveEntry);
        this.entry = currentEntry;
        this.entries.add(currentEntry.entry);
        setDefaults(this.entry.entry);
        Zip64Mode effectiveZip64Mode = getEffectiveZip64Mode(this.entry.entry);
        validateSizeInformation(effectiveZip64Mode);
        if (shouldAddZip64Extra(this.entry.entry, effectiveZip64Mode)) {
            Zip64ExtendedInformationExtraField zip64Extra = getZip64Extra(this.entry.entry);
            ZipEightByteInteger zipEightByteInteger = ZipEightByteInteger.ZERO;
            ZipEightByteInteger zipEightByteInteger2 = ZipEightByteInteger.ZERO;
            if (z) {
                zipEightByteInteger = new ZipEightByteInteger(this.entry.entry.getSize());
                zipEightByteInteger2 = new ZipEightByteInteger(this.entry.entry.getCompressedSize());
            } else if (this.entry.entry.getMethod() == 0 && this.entry.entry.getSize() != -1) {
                zipEightByteInteger = new ZipEightByteInteger(this.entry.entry.getSize());
                zipEightByteInteger2 = zipEightByteInteger;
            }
            zip64Extra.setSize(zipEightByteInteger);
            zip64Extra.setCompressedSize(zipEightByteInteger2);
            this.entry.entry.setExtra();
        }
        if (this.entry.entry.getMethod() == 8 && this.hasCompressionLevelChanged) {
            this.def.setLevel(this.level);
            this.hasCompressionLevelChanged = false;
        }
        writeLocalFileHeader(zipArchiveEntry, z);
    }

    private void setDefaults(ZipArchiveEntry zipArchiveEntry) {
        if (zipArchiveEntry.getMethod() == -1) {
            zipArchiveEntry.setMethod(this.method);
        }
        if (zipArchiveEntry.getTime() == -1) {
            zipArchiveEntry.setTime(System.currentTimeMillis());
        }
    }

    private void validateSizeInformation(Zip64Mode zip64Mode) throws ZipException {
        if (this.entry.entry.getMethod() == 0 && this.raf == null) {
            if (this.entry.entry.getSize() == -1) {
                throw new ZipException("uncompressed size is required for STORED method when not writing to a file");
            }
            if (this.entry.entry.getCrc() == -1) {
                throw new ZipException("crc checksum is required for STORED method when not writing to a file");
            }
            this.entry.entry.setCompressedSize(this.entry.entry.getSize());
        }
        long j = -1;
        if (this.entry.entry.getSize() < ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) {
            long j2 = -1;
            if (this.entry.entry.getCompressedSize() < ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))) {
                return;
            }
        }
        if (zip64Mode == Zip64Mode.Never) {
            throw new Zip64RequiredException(Zip64RequiredException.getEntryTooBigMessage(this.entry.entry));
        }
    }

    private boolean shouldAddZip64Extra(ZipArchiveEntry zipArchiveEntry, Zip64Mode zip64Mode) {
        if (zip64Mode == Zip64Mode.Always) {
            return true;
        }
        long j = -1;
        if (zipArchiveEntry.getSize() >= ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) {
            return true;
        }
        long j2 = -1;
        if (zipArchiveEntry.getCompressedSize() < ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))) {
            return (zipArchiveEntry.getSize() != -1 || this.raf == null || zip64Mode == Zip64Mode.Never) ? false : true;
        }
        return true;
    }

    public void setComment(String str) {
        this.comment = str;
    }

    public void setLevel(int i) {
        if (i < -1 || i > 9) {
            throw new IllegalArgumentException("Invalid compression level: ".concat(String.valueOf(i)));
        }
        this.hasCompressionLevelChanged = this.level != i;
        this.level = i;
    }

    public void setMethod(int i) {
        this.method = i;
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public boolean canWriteEntryData(ArchiveEntry archiveEntry) {
        if (!(archiveEntry instanceof ZipArchiveEntry)) {
            return false;
        }
        ZipArchiveEntry zipArchiveEntry = (ZipArchiveEntry) archiveEntry;
        return (zipArchiveEntry.getMethod() == ZipMethod.IMPLODING.getCode() || zipArchiveEntry.getMethod() == ZipMethod.UNSHRINKING.getCode() || !ZipUtil.canHandleEntryData(zipArchiveEntry)) ? false : true;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        CurrentEntry currentEntry = this.entry;
        if (currentEntry == null) {
            throw new IllegalStateException("No current entry");
        }
        ZipUtil.checkRequestedFeatures(currentEntry.entry);
        count(this.streamCompressor.write(bArr, i, i2, this.entry.entry.getMethod()));
    }

    private void writeCounted(byte[] bArr) throws IOException {
        this.streamCompressor.writeCounted(bArr);
    }

    private void copyFromZipInputStream(InputStream inputStream) throws IOException {
        CurrentEntry currentEntry = this.entry;
        if (currentEntry == null) {
            throw new IllegalStateException("No current entry");
        }
        ZipUtil.checkRequestedFeatures(currentEntry.entry);
        this.entry.hasWritten = true;
        while (true) {
            int i = inputStream.read(this.copyBuffer);
            if (i < 0) {
                return;
            }
            this.streamCompressor.writeCounted(this.copyBuffer, 0, i);
            count(i);
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.finished) {
            finish();
        }
        destroy();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        OutputStream outputStream = this.out;
        if (outputStream != null) {
            outputStream.flush();
        }
    }

    protected final void deflate() throws IOException {
        this.streamCompressor.deflate();
    }

    protected void writeLocalFileHeader(ZipArchiveEntry zipArchiveEntry) throws IOException {
        writeLocalFileHeader(zipArchiveEntry, false);
    }

    private void writeLocalFileHeader(ZipArchiveEntry zipArchiveEntry, boolean z) throws IOException {
        boolean zCanEncode = this.zipEncoding.canEncode(zipArchiveEntry.getName());
        ByteBuffer name = getName(zipArchiveEntry);
        if (this.createUnicodeExtraFields != UnicodeExtraFieldPolicy.NEVER) {
            addUnicodeExtraFields(zipArchiveEntry, zCanEncode, name);
        }
        byte[] bArrCreateLocalFileHeader = createLocalFileHeader(zipArchiveEntry, name, zCanEncode, z);
        long totalBytesWritten = this.streamCompressor.getTotalBytesWritten();
        this.offsets.put(zipArchiveEntry, Long.valueOf(totalBytesWritten));
        this.entry.localDataStart = totalBytesWritten + 14;
        writeCounted(bArrCreateLocalFileHeader);
        this.entry.dataStart = this.streamCompressor.getTotalBytesWritten();
    }

    private byte[] createLocalFileHeader(ZipArchiveEntry zipArchiveEntry, ByteBuffer byteBuffer, boolean z, boolean z2) {
        byte[] localFileDataExtra = zipArchiveEntry.getLocalFileDataExtra();
        int iLimit = byteBuffer.limit() - byteBuffer.position();
        int i = iLimit + 30;
        byte[] bArr = new byte[localFileDataExtra.length + i];
        System.arraycopy(LFH_SIG, 0, bArr, 0, 4);
        int method = zipArchiveEntry.getMethod();
        if (z2 && !isZip64Required(this.entry.entry, this.zip64Mode)) {
            ZipShort.putShort(10, bArr, 4);
        } else {
            ZipShort.putShort(versionNeededToExtract(method, hasZip64Extra(zipArchiveEntry)), bArr, 4);
        }
        getGeneralPurposeBits(method, !z && this.fallbackToUTF8).encode(bArr, 6);
        ZipShort.putShort(method, bArr, 8);
        ZipUtil.toDosTime(this.calendarInstance, zipArchiveEntry.getTime(), bArr, 10);
        if (z2) {
            ZipLong.putLong(zipArchiveEntry.getCrc(), bArr, 14);
        } else if (method == 8 || this.raf != null) {
            System.arraycopy(LZERO, 0, bArr, 14, 4);
        } else {
            ZipLong.putLong(zipArchiveEntry.getCrc(), bArr, 14);
        }
        if (hasZip64Extra(this.entry.entry)) {
            ZipLong.ZIP64_MAGIC.putLong(bArr, 18);
            ZipLong.ZIP64_MAGIC.putLong(bArr, 22);
        } else if (z2) {
            ZipLong.putLong(zipArchiveEntry.getCompressedSize(), bArr, 18);
            ZipLong.putLong(zipArchiveEntry.getSize(), bArr, 22);
        } else if (method == 8 || this.raf != null) {
            byte[] bArr2 = LZERO;
            System.arraycopy(bArr2, 0, bArr, 18, 4);
            System.arraycopy(bArr2, 0, bArr, 22, 4);
        } else {
            ZipLong.putLong(zipArchiveEntry.getSize(), bArr, 18);
            ZipLong.putLong(zipArchiveEntry.getSize(), bArr, 22);
        }
        ZipShort.putShort(iLimit, bArr, 26);
        ZipShort.putShort(localFileDataExtra.length, bArr, 28);
        System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset(), bArr, 30, iLimit);
        System.arraycopy(localFileDataExtra, 0, bArr, i, localFileDataExtra.length);
        return bArr;
    }

    private void addUnicodeExtraFields(ZipArchiveEntry zipArchiveEntry, boolean z, ByteBuffer byteBuffer) throws IOException {
        if (this.createUnicodeExtraFields == UnicodeExtraFieldPolicy.ALWAYS || !z) {
            zipArchiveEntry.addExtraField(new UnicodePathExtraField(zipArchiveEntry.getName(), byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit() - byteBuffer.position()));
        }
        String comment = zipArchiveEntry.getComment();
        if (comment == null || "".equals(comment)) {
            return;
        }
        boolean zCanEncode = this.zipEncoding.canEncode(comment);
        if (this.createUnicodeExtraFields == UnicodeExtraFieldPolicy.ALWAYS || !zCanEncode) {
            ByteBuffer byteBufferEncode = getEntryEncoding(zipArchiveEntry).encode(comment);
            zipArchiveEntry.addExtraField(new UnicodeCommentExtraField(comment, byteBufferEncode.array(), byteBufferEncode.arrayOffset(), byteBufferEncode.limit() - byteBufferEncode.position()));
        }
    }

    protected void writeDataDescriptor(ZipArchiveEntry zipArchiveEntry) throws IOException {
        if (zipArchiveEntry.getMethod() == 8 && this.raf == null) {
            writeCounted(DD_SIG);
            writeCounted(ZipLong.getBytes(zipArchiveEntry.getCrc()));
            if (!hasZip64Extra(zipArchiveEntry)) {
                writeCounted(ZipLong.getBytes(zipArchiveEntry.getCompressedSize()));
                writeCounted(ZipLong.getBytes(zipArchiveEntry.getSize()));
            } else {
                writeCounted(ZipEightByteInteger.getBytes(zipArchiveEntry.getCompressedSize()));
                writeCounted(ZipEightByteInteger.getBytes(zipArchiveEntry.getSize()));
            }
        }
    }

    protected void writeCentralFileHeader(ZipArchiveEntry zipArchiveEntry) throws IOException {
        writeCounted(createCentralFileHeader(zipArchiveEntry));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private byte[] createCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r15) throws java.io.IOException {
        /*
            r14 = this;
            java.util.Map<org.apache.commons.compress.archivers.zip.ZipArchiveEntry, java.lang.Long> r0 = r14.offsets
            java.lang.Object r0 = r0.get(r15)
            java.lang.Long r0 = (java.lang.Long) r0
            long r4 = r0.longValue()
            boolean r0 = r14.hasZip64Extra(r15)
            if (r0 != 0) goto L4c
            long r0 = r15.getCompressedSize()
            r2 = 0
            long r6 = (long) r2
            r3 = 32
            long r6 = r6 << r3
            r8 = -1
            long r9 = (long) r8
            r11 = 63
            long r12 = r9 >> r11
            long r12 = r12 << r3
            long r9 = r9 - r12
            long r6 = r6 | r9
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 >= 0) goto L4c
            long r0 = r15.getSize()
            long r6 = (long) r2
            long r6 = r6 << r3
            long r9 = (long) r8
            long r12 = r9 >> r11
            long r12 = r12 << r3
            long r9 = r9 - r12
            long r6 = r6 | r9
            int r0 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r0 >= 0) goto L4c
            long r0 = (long) r2
            long r0 = r0 << r3
            long r6 = (long) r8
            long r8 = r6 >> r11
            long r8 = r8 << r3
            long r6 = r6 - r8
            long r0 = r0 | r6
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L4c
            org.apache.commons.compress.archivers.zip.Zip64Mode r0 = r14.zip64Mode
            org.apache.commons.compress.archivers.zip.Zip64Mode r1 = org.apache.commons.compress.archivers.zip.Zip64Mode.Always
            if (r0 == r1) goto L4c
            r6 = r2
            goto L4e
        L4c:
            r0 = 1
            r6 = r0
        L4e:
            if (r6 == 0) goto L5f
            org.apache.commons.compress.archivers.zip.Zip64Mode r0 = r14.zip64Mode
            org.apache.commons.compress.archivers.zip.Zip64Mode r1 = org.apache.commons.compress.archivers.zip.Zip64Mode.Never
            if (r0 == r1) goto L57
            goto L5f
        L57:
            org.apache.commons.compress.archivers.zip.Zip64RequiredException r14 = new org.apache.commons.compress.archivers.zip.Zip64RequiredException
            java.lang.String r15 = "archive's size exceeds the limit of 4GByte."
            r14.<init>(r15)
            throw r14
        L5f:
            r14.handleZip64Extra(r15, r4, r6)
            java.nio.ByteBuffer r3 = r14.getName(r15)
            r1 = r14
            r2 = r15
            byte[] r14 = r1.createCentralFileHeader(r2, r3, r4, r6)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry):byte[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private byte[] createCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r21, java.nio.ByteBuffer r22, long r23, boolean r25) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.createCentralFileHeader(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, java.nio.ByteBuffer, long, boolean):byte[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void handleZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry r17, long r18, boolean r20) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            if (r20 == 0) goto L74
            org.apache.commons.compress.archivers.zip.Zip64ExtendedInformationExtraField r3 = r16.getZip64Extra(r17)
            long r4 = r17.getCompressedSize()
            r6 = 0
            long r7 = (long) r6
            r9 = 32
            long r7 = r7 << r9
            r10 = -1
            long r11 = (long) r10
            r13 = 63
            long r14 = r11 >> r13
            long r14 = r14 << r9
            long r11 = r11 - r14
            long r7 = r7 | r11
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 >= 0) goto L3e
            long r4 = r17.getSize()
            long r7 = (long) r6
            long r7 = r7 << r9
            long r11 = (long) r10
            long r14 = r11 >> r13
            long r14 = r14 << r9
            long r11 = r11 - r14
            long r7 = r7 | r11
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 >= 0) goto L3e
            org.apache.commons.compress.archivers.zip.Zip64Mode r4 = r0.zip64Mode
            org.apache.commons.compress.archivers.zip.Zip64Mode r5 = org.apache.commons.compress.archivers.zip.Zip64Mode.Always
            if (r4 == r5) goto L3e
            r4 = 0
            r3.setCompressedSize(r4)
            r3.setSize(r4)
            goto L56
        L3e:
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r4 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger
            long r7 = r17.getCompressedSize()
            r4.<init>(r7)
            r3.setCompressedSize(r4)
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r4 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger
            long r7 = r17.getSize()
            r4.<init>(r7)
            r3.setSize(r4)
        L56:
            long r4 = (long) r6
            long r4 = r4 << r9
            long r6 = (long) r10
            long r10 = r6 >> r13
            long r8 = r10 << r9
            long r6 = r6 - r8
            long r4 = r4 | r6
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 >= 0) goto L69
            org.apache.commons.compress.archivers.zip.Zip64Mode r0 = r0.zip64Mode
            org.apache.commons.compress.archivers.zip.Zip64Mode r4 = org.apache.commons.compress.archivers.zip.Zip64Mode.Always
            if (r0 != r4) goto L71
        L69:
            org.apache.commons.compress.archivers.zip.ZipEightByteInteger r0 = new org.apache.commons.compress.archivers.zip.ZipEightByteInteger
            r0.<init>(r1)
            r3.setRelativeHeaderOffset(r0)
        L71:
            r17.setExtra()
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.handleZip64Extra(org.apache.commons.compress.archivers.zip.ZipArchiveEntry, long, boolean):void");
    }

    protected void writeCentralDirectoryEnd() throws IOException {
        writeCounted(EOCD_SIG);
        byte[] bArr = ZERO;
        writeCounted(bArr);
        writeCounted(bArr);
        int size = this.entries.size();
        if (size > 65535 && this.zip64Mode == Zip64Mode.Never) {
            throw new Zip64RequiredException("archive contains more than 65535 entries.");
        }
        long j = -1;
        if (this.cdOffset > ((((long) 0) << 32) | (j - ((j >> 63) << 32))) && this.zip64Mode == Zip64Mode.Never) {
            throw new Zip64RequiredException("archive's size exceeds the limit of 4GByte.");
        }
        byte[] bytes = ZipShort.getBytes(Math.min(size, 65535));
        writeCounted(bytes);
        writeCounted(bytes);
        long j2 = -1;
        writeCounted(ZipLong.getBytes(Math.min(this.cdLength, (((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))));
        long j3 = -1;
        writeCounted(ZipLong.getBytes(Math.min(this.cdOffset, (((long) 0) << 32) | (j3 - ((j3 >> 63) << 32)))));
        ByteBuffer byteBufferEncode = this.zipEncoding.encode(this.comment);
        int iLimit = byteBufferEncode.limit() - byteBufferEncode.position();
        writeCounted(ZipShort.getBytes(iLimit));
        this.streamCompressor.writeCounted(byteBufferEncode.array(), byteBufferEncode.arrayOffset(), iLimit);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void writeZip64CentralDirectory() throws java.io.IOException {
        /*
            r12 = this;
            org.apache.commons.compress.archivers.zip.Zip64Mode r0 = r12.zip64Mode
            org.apache.commons.compress.archivers.zip.Zip64Mode r1 = org.apache.commons.compress.archivers.zip.Zip64Mode.Never
            if (r0 == r1) goto La3
            boolean r0 = r12.hasUsedZip64
            if (r0 != 0) goto L3b
            long r0 = r12.cdOffset
            r2 = 0
            long r3 = (long) r2
            r5 = 32
            long r3 = r3 << r5
            r6 = -1
            long r7 = (long) r6
            r9 = 63
            long r10 = r7 >> r9
            long r10 = r10 << r5
            long r7 = r7 - r10
            long r3 = r3 | r7
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L38
            long r0 = r12.cdLength
            long r2 = (long) r2
            long r2 = r2 << r5
            long r6 = (long) r6
            long r8 = r6 >> r9
            long r4 = r8 << r5
            long r6 = r6 - r4
            long r2 = r2 | r6
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L38
            java.util.List<org.apache.commons.compress.archivers.zip.ZipArchiveEntry> r0 = r12.entries
            int r0 = r0.size()
            r1 = 65535(0xffff, float:9.1834E-41)
            if (r0 < r1) goto L3b
        L38:
            r0 = 1
            r12.hasUsedZip64 = r0
        L3b:
            boolean r0 = r12.hasUsedZip64
            if (r0 != 0) goto L40
            goto La3
        L40:
            org.apache.commons.compress.archivers.zip.StreamCompressor r0 = r12.streamCompressor
            long r0 = r0.getTotalBytesWritten()
            byte[] r2 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_SIG
            r12.writeOut(r2)
            r2 = 44
            byte[] r2 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(r2)
            r12.writeOut(r2)
            r2 = 45
            byte[] r3 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes(r2)
            r12.writeOut(r3)
            byte[] r2 = org.apache.commons.compress.archivers.zip.ZipShort.getBytes(r2)
            r12.writeOut(r2)
            byte[] r2 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.LZERO
            r12.writeOut(r2)
            r12.writeOut(r2)
            java.util.List<org.apache.commons.compress.archivers.zip.ZipArchiveEntry> r3 = r12.entries
            int r3 = r3.size()
            long r3 = (long) r3
            byte[] r3 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(r3)
            r12.writeOut(r3)
            r12.writeOut(r3)
            long r3 = r12.cdLength
            byte[] r3 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(r3)
            r12.writeOut(r3)
            long r3 = r12.cdOffset
            byte[] r3 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(r3)
            r12.writeOut(r3)
            byte[] r3 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ZIP64_EOCD_LOC_SIG
            r12.writeOut(r3)
            r12.writeOut(r2)
            byte[] r0 = org.apache.commons.compress.archivers.zip.ZipEightByteInteger.getBytes(r0)
            r12.writeOut(r0)
            byte[] r0 = org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.ONE
            r12.writeOut(r0)
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.compress.archivers.zip.ZipArchiveOutputStream.writeZip64CentralDirectory():void");
    }

    protected final void writeOut(byte[] bArr) throws IOException {
        this.streamCompressor.writeOut(bArr, 0, bArr.length);
    }

    protected final void writeOut(byte[] bArr, int i, int i2) throws IOException {
        this.streamCompressor.writeOut(bArr, i, i2);
    }

    private GeneralPurposeBit getGeneralPurposeBits(int i, boolean z) {
        GeneralPurposeBit generalPurposeBit = new GeneralPurposeBit();
        generalPurposeBit.useUTF8ForNames(this.useUTF8Flag || z);
        if (isDeflatedToOutputStream(i)) {
            generalPurposeBit.useDataDescriptor(true);
        }
        return generalPurposeBit;
    }

    private int versionNeededToExtract(int i, boolean z) {
        if (z) {
            return 45;
        }
        return isDeflatedToOutputStream(i) ? 20 : 10;
    }

    private boolean isDeflatedToOutputStream(int i) {
        return i == 8 && this.raf == null;
    }

    @Override // org.apache.commons.compress.archivers.ArchiveOutputStream
    public ArchiveEntry createArchiveEntry(File file, String str) throws IOException {
        if (this.finished) {
            throw new IOException("Stream has already been finished");
        }
        return new ZipArchiveEntry(file, str);
    }

    private Zip64ExtendedInformationExtraField getZip64Extra(ZipArchiveEntry zipArchiveEntry) {
        CurrentEntry currentEntry = this.entry;
        if (currentEntry != null) {
            currentEntry.causedUseOfZip64 = !this.hasUsedZip64;
        }
        this.hasUsedZip64 = true;
        Zip64ExtendedInformationExtraField zip64ExtendedInformationExtraField = (Zip64ExtendedInformationExtraField) zipArchiveEntry.getExtraField(Zip64ExtendedInformationExtraField.HEADER_ID);
        if (zip64ExtendedInformationExtraField == null) {
            zip64ExtendedInformationExtraField = new Zip64ExtendedInformationExtraField();
        }
        zipArchiveEntry.addAsFirstExtraField(zip64ExtendedInformationExtraField);
        return zip64ExtendedInformationExtraField;
    }

    private boolean hasZip64Extra(ZipArchiveEntry zipArchiveEntry) {
        return zipArchiveEntry.getExtraField(Zip64ExtendedInformationExtraField.HEADER_ID) != null;
    }

    private Zip64Mode getEffectiveZip64Mode(ZipArchiveEntry zipArchiveEntry) {
        if (this.zip64Mode != Zip64Mode.AsNeeded || this.raf != null || zipArchiveEntry.getMethod() != 8 || zipArchiveEntry.getSize() != -1) {
            return this.zip64Mode;
        }
        return Zip64Mode.Never;
    }

    private ZipEncoding getEntryEncoding(ZipArchiveEntry zipArchiveEntry) {
        return (this.zipEncoding.canEncode(zipArchiveEntry.getName()) || !this.fallbackToUTF8) ? this.zipEncoding : ZipEncodingHelper.UTF8_ZIP_ENCODING;
    }

    private ByteBuffer getName(ZipArchiveEntry zipArchiveEntry) throws IOException {
        return getEntryEncoding(zipArchiveEntry).encode(zipArchiveEntry.getName());
    }

    void destroy() throws IOException {
        RandomAccessFile randomAccessFile = this.raf;
        if (randomAccessFile != null) {
            randomAccessFile.close();
        }
        OutputStream outputStream = this.out;
        if (outputStream != null) {
            outputStream.close();
        }
    }

    public static final class UnicodeExtraFieldPolicy {
        public static final UnicodeExtraFieldPolicy ALWAYS = new UnicodeExtraFieldPolicy("always");
        public static final UnicodeExtraFieldPolicy NEVER = new UnicodeExtraFieldPolicy("never");
        public static final UnicodeExtraFieldPolicy NOT_ENCODEABLE = new UnicodeExtraFieldPolicy("not encodeable");
        private final String name;

        private UnicodeExtraFieldPolicy(String str) {
            this.name = str;
        }

        public final String toString() {
            return this.name;
        }
    }

    static final class CurrentEntry {
        private long bytesRead;
        private boolean causedUseOfZip64;
        private long dataStart;
        private final ZipArchiveEntry entry;
        private boolean hasWritten;
        private long localDataStart;

        private CurrentEntry(ZipArchiveEntry zipArchiveEntry) {
            this.localDataStart = 0L;
            this.dataStart = 0L;
            this.bytesRead = 0L;
            this.causedUseOfZip64 = false;
            this.entry = zipArchiveEntry;
        }
    }
}
