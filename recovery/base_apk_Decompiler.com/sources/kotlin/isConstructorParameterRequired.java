package kotlin;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.CRC32;
import java.util.zip.ZipException;

/* JADX INFO: loaded from: classes.dex */
final class isConstructorParameterRequired {

    static class write {
        long RemoteActionCompatParcelizer;
        long read;

        write() {
        }
    }

    isConstructorParameterRequired() {
    }

    static long AudioAttributesCompatParcelizer(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            return RemoteActionCompatParcelizer(randomAccessFile, RemoteActionCompatParcelizer(randomAccessFile));
        } finally {
            randomAccessFile.close();
        }
    }

    private static write RemoteActionCompatParcelizer(RandomAccessFile randomAccessFile) throws IOException {
        long length = randomAccessFile.length();
        long j = length - 22;
        if (j < 0) {
            StringBuilder sb = new StringBuilder("File too short to be a zip file: ");
            sb.append(randomAccessFile.length());
            throw new ZipException(sb.toString());
        }
        long j2 = length - 65558;
        long j3 = j2 >= 0 ? j2 : 0L;
        int iReverseBytes = Integer.reverseBytes(101010256);
        do {
            randomAccessFile.seek(j);
            if (randomAccessFile.readInt() == iReverseBytes) {
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                randomAccessFile.skipBytes(2);
                write writeVar = new write();
                long j4 = -1;
                writeVar.read = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & ((((long) 0) << 32) | (j4 - ((j4 >> 63) << 32)));
                long j5 = -1;
                writeVar.RemoteActionCompatParcelizer = ((long) Integer.reverseBytes(randomAccessFile.readInt())) & ((((long) 0) << 32) | (j5 - ((j5 >> 63) << 32)));
                return writeVar;
            }
            j--;
        } while (j >= j3);
        throw new ZipException("End Of Central Directory signature not found");
    }

    private static long RemoteActionCompatParcelizer(RandomAccessFile randomAccessFile, write writeVar) throws IOException {
        CRC32 crc32 = new CRC32();
        long j = writeVar.read;
        randomAccessFile.seek(writeVar.RemoteActionCompatParcelizer);
        byte[] bArr = new byte[16384];
        int i = randomAccessFile.read(bArr, 0, (int) Math.min(setTimelineAdapter.EMIT_BUFFER_SIZE, j));
        while (i != -1) {
            crc32.update(bArr, 0, i);
            j -= (long) i;
            if (j == 0) {
                break;
            }
            i = randomAccessFile.read(bArr, 0, (int) Math.min(setTimelineAdapter.EMIT_BUFFER_SIZE, j));
        }
        return crc32.getValue();
    }
}
