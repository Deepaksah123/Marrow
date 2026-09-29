package kotlin;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes2.dex */
public final class setAlbumArtist implements ImageHeaderParser {
    private static byte[] RemoteActionCompatParcelizer = "Exif\u0000\u0000".getBytes(Charset.forName(CharsetNames.UTF_8));
    private static final int[] AudioAttributesCompatParcelizer = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    private static int IconCompatParcelizer(int i, int i2) {
        return i + 2 + (i2 * 12);
    }

    private static boolean write(int i) {
        return (i & 65496) == 65496 || i == 19789 || i == 18761;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType read(InputStream inputStream) throws IOException {
        return AudioAttributesCompatParcelizer(new AudioAttributesCompatParcelizer((InputStream) moveMediaSource.AudioAttributesCompatParcelizer(inputStream)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType AudioAttributesCompatParcelizer(ByteBuffer byteBuffer) throws IOException {
        return AudioAttributesCompatParcelizer(new IconCompatParcelizer((ByteBuffer) moveMediaSource.AudioAttributesCompatParcelizer(byteBuffer)));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int write(InputStream inputStream, setSubtitleConfigurations setsubtitleconfigurations) throws IOException {
        return AudioAttributesCompatParcelizer(new AudioAttributesCompatParcelizer((InputStream) moveMediaSource.AudioAttributesCompatParcelizer(inputStream)), (setSubtitleConfigurations) moveMediaSource.AudioAttributesCompatParcelizer(setsubtitleconfigurations));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int RemoteActionCompatParcelizer(ByteBuffer byteBuffer, setSubtitleConfigurations setsubtitleconfigurations) throws IOException {
        return AudioAttributesCompatParcelizer(new IconCompatParcelizer((ByteBuffer) moveMediaSource.AudioAttributesCompatParcelizer(byteBuffer)), (setSubtitleConfigurations) moveMediaSource.AudioAttributesCompatParcelizer(setsubtitleconfigurations));
    }

    private static ImageHeaderParser.ImageType AudioAttributesCompatParcelizer(read readVar) throws IOException {
        try {
            int iWrite = readVar.write();
            if (iWrite == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int iAudioAttributesCompatParcelizer = (iWrite << 8) | readVar.AudioAttributesCompatParcelizer();
            if (iAudioAttributesCompatParcelizer == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int iAudioAttributesCompatParcelizer2 = (iAudioAttributesCompatParcelizer << 8) | readVar.AudioAttributesCompatParcelizer();
            if (iAudioAttributesCompatParcelizer2 == -1991225785) {
                readVar.RemoteActionCompatParcelizer(21L);
                try {
                    return readVar.AudioAttributesCompatParcelizer() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (read.write unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            }
            if (iAudioAttributesCompatParcelizer2 != 1380533830) {
                return read(readVar, iAudioAttributesCompatParcelizer2);
            }
            readVar.RemoteActionCompatParcelizer(4L);
            if (((readVar.write() << 16) | readVar.write()) != 1464156752) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int iWrite2 = (readVar.write() << 16) | readVar.write();
            if ((iWrite2 & (-256)) != 1448097792) {
                return ImageHeaderParser.ImageType.UNKNOWN;
            }
            int i = iWrite2 & 255;
            if (i != 88) {
                if (i == 76) {
                    readVar.RemoteActionCompatParcelizer(4L);
                    return (readVar.AudioAttributesCompatParcelizer() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                }
                return ImageHeaderParser.ImageType.WEBP;
            }
            readVar.RemoteActionCompatParcelizer(4L);
            short sAudioAttributesCompatParcelizer = readVar.AudioAttributesCompatParcelizer();
            if ((sAudioAttributesCompatParcelizer & 2) != 0) {
                return ImageHeaderParser.ImageType.ANIMATED_WEBP;
            }
            if ((sAudioAttributesCompatParcelizer & 16) != 0) {
                return ImageHeaderParser.ImageType.WEBP_A;
            }
            return ImageHeaderParser.ImageType.WEBP;
        } catch (read.write unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    private static ImageHeaderParser.ImageType read(read readVar, int i) throws IOException {
        if (((readVar.write() << 16) | readVar.write()) != 1718909296) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        int iWrite = (readVar.write() << 16) | readVar.write();
        if (iWrite == 1635150195) {
            return ImageHeaderParser.ImageType.ANIMATED_AVIF;
        }
        int i2 = 0;
        boolean z = iWrite == 1635150182;
        readVar.RemoteActionCompatParcelizer(4L);
        int i3 = i - 16;
        if (i3 % 4 == 0) {
            while (i2 < 5 && i3 > 0) {
                int iWrite2 = (readVar.write() << 16) | readVar.write();
                if (iWrite2 == 1635150195) {
                    return ImageHeaderParser.ImageType.ANIMATED_AVIF;
                }
                if (iWrite2 == 1635150182) {
                    z = true;
                }
                i2++;
                i3 -= 4;
            }
        }
        return z ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
    }

    private int AudioAttributesCompatParcelizer(read readVar, setSubtitleConfigurations setsubtitleconfigurations) throws IOException {
        try {
            if (!write(readVar.write())) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            int i = read(readVar);
            if (i == -1) {
                return -1;
            }
            byte[] bArr = (byte[]) setsubtitleconfigurations.IconCompatParcelizer(i, byte[].class);
            try {
                return write(readVar, bArr, i);
            } finally {
                setsubtitleconfigurations.read(bArr);
            }
        } catch (read.write unused) {
            return -1;
        }
    }

    private static int write(read readVar, byte[] bArr, int i) throws IOException {
        if (readVar.read(bArr, i) != i) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
        if (read(bArr, i)) {
            return RemoteActionCompatParcelizer(new write(bArr, i));
        }
        return -1;
    }

    private static boolean read(byte[] bArr, int i) {
        boolean z = bArr != null && i > RemoteActionCompatParcelizer.length;
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = RemoteActionCompatParcelizer;
                if (i2 >= bArr2.length) {
                    break;
                }
                if (bArr[i2] != bArr2[i2]) {
                    return false;
                }
                i2++;
            }
        }
        return z;
    }

    private static int read(read readVar) throws IOException {
        short sAudioAttributesCompatParcelizer;
        while (readVar.AudioAttributesCompatParcelizer() == 255 && (sAudioAttributesCompatParcelizer = readVar.AudioAttributesCompatParcelizer()) != 218 && sAudioAttributesCompatParcelizer != 217) {
            int iWrite = readVar.write() - 2;
            if (sAudioAttributesCompatParcelizer == 225) {
                return iWrite;
            }
            long j = iWrite;
            if (readVar.RemoteActionCompatParcelizer(j) != j) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
        }
        return -1;
    }

    private static int RemoteActionCompatParcelizer(write writeVar) {
        ByteOrder byteOrder;
        short sAudioAttributesCompatParcelizer;
        short sAudioAttributesCompatParcelizer2 = writeVar.AudioAttributesCompatParcelizer(6);
        if (sAudioAttributesCompatParcelizer2 == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (sAudioAttributesCompatParcelizer2 == 19789) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        writeVar.write(byteOrder);
        int iIconCompatParcelizer = writeVar.IconCompatParcelizer(10) + 6;
        short sAudioAttributesCompatParcelizer3 = writeVar.AudioAttributesCompatParcelizer(iIconCompatParcelizer);
        for (int i = 0; i < sAudioAttributesCompatParcelizer3; i++) {
            int iIconCompatParcelizer2 = IconCompatParcelizer(iIconCompatParcelizer, i);
            if (writeVar.AudioAttributesCompatParcelizer(iIconCompatParcelizer2) == 274 && (sAudioAttributesCompatParcelizer = writeVar.AudioAttributesCompatParcelizer(iIconCompatParcelizer2 + 2)) > 0 && sAudioAttributesCompatParcelizer <= 12) {
                int iIconCompatParcelizer3 = writeVar.IconCompatParcelizer(iIconCompatParcelizer2 + 4);
                if (iIconCompatParcelizer3 < 0) {
                    Log.isLoggable("DfltImageHeaderParser", 3);
                } else {
                    Log.isLoggable("DfltImageHeaderParser", 3);
                    int i2 = iIconCompatParcelizer3 + AudioAttributesCompatParcelizer[sAudioAttributesCompatParcelizer];
                    if (i2 > 4) {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                    } else {
                        int i3 = iIconCompatParcelizer2 + 8;
                        if (i3 < 0 || i3 > writeVar.write()) {
                            Log.isLoggable("DfltImageHeaderParser", 3);
                        } else if (i2 < 0 || i2 + i3 > writeVar.write()) {
                            Log.isLoggable("DfltImageHeaderParser", 3);
                        } else {
                            return writeVar.AudioAttributesCompatParcelizer(i3);
                        }
                    }
                }
            }
        }
        return -1;
    }

    static final class write {
        private final ByteBuffer AudioAttributesCompatParcelizer;

        write(byte[] bArr, int i) {
            this.AudioAttributesCompatParcelizer = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        final void write(ByteOrder byteOrder) {
            this.AudioAttributesCompatParcelizer.order(byteOrder);
        }

        final int write() {
            return this.AudioAttributesCompatParcelizer.remaining();
        }

        final int IconCompatParcelizer(int i) {
            if (IconCompatParcelizer(i, 4)) {
                return this.AudioAttributesCompatParcelizer.getInt(i);
            }
            return -1;
        }

        final short AudioAttributesCompatParcelizer(int i) {
            if (IconCompatParcelizer(i, 2)) {
                return this.AudioAttributesCompatParcelizer.getShort(i);
            }
            return (short) -1;
        }

        private boolean IconCompatParcelizer(int i, int i2) {
            return this.AudioAttributesCompatParcelizer.remaining() - i >= i2;
        }
    }

    interface read {
        short AudioAttributesCompatParcelizer() throws IOException;

        long RemoteActionCompatParcelizer(long j) throws IOException;

        int read(byte[] bArr, int i) throws IOException;

        int write() throws IOException;

        public static final class write extends IOException {
            public write() {
                super("Unexpectedly reached end of a file");
            }
        }
    }

    static final class IconCompatParcelizer implements read {
        private final ByteBuffer RemoteActionCompatParcelizer;

        IconCompatParcelizer(ByteBuffer byteBuffer) {
            this.RemoteActionCompatParcelizer = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // o.setAlbumArtist.read
        public final short AudioAttributesCompatParcelizer() throws read.write {
            if (this.RemoteActionCompatParcelizer.remaining() <= 0) {
                throw new read.write();
            }
            return (short) (this.RemoteActionCompatParcelizer.get() & 255);
        }

        @Override // o.setAlbumArtist.read
        public final int write() throws read.write {
            return AudioAttributesCompatParcelizer() | (AudioAttributesCompatParcelizer() << 8);
        }

        @Override // o.setAlbumArtist.read
        public final int read(byte[] bArr, int i) {
            int iMin = Math.min(i, this.RemoteActionCompatParcelizer.remaining());
            if (iMin == 0) {
                return -1;
            }
            this.RemoteActionCompatParcelizer.get(bArr, 0, iMin);
            return iMin;
        }

        @Override // o.setAlbumArtist.read
        public final long RemoteActionCompatParcelizer(long j) {
            int iMin = (int) Math.min(this.RemoteActionCompatParcelizer.remaining(), j);
            ByteBuffer byteBuffer = this.RemoteActionCompatParcelizer;
            byteBuffer.position(byteBuffer.position() + iMin);
            return iMin;
        }
    }

    static final class AudioAttributesCompatParcelizer implements read {
        private final InputStream read;

        AudioAttributesCompatParcelizer(InputStream inputStream) {
            this.read = inputStream;
        }

        @Override // o.setAlbumArtist.read
        public final short AudioAttributesCompatParcelizer() throws IOException {
            int i = this.read.read();
            if (i != -1) {
                return (short) i;
            }
            throw new read.write();
        }

        @Override // o.setAlbumArtist.read
        public final int write() throws IOException {
            return AudioAttributesCompatParcelizer() | (AudioAttributesCompatParcelizer() << 8);
        }

        @Override // o.setAlbumArtist.read
        public final int read(byte[] bArr, int i) throws IOException {
            int i2 = 0;
            int i3 = 0;
            while (i3 < i && (i2 = this.read.read(bArr, i3, i - i3)) != -1) {
                i3 += i2;
            }
            if (i3 == 0 && i2 == -1) {
                throw new read.write();
            }
            return i3;
        }

        @Override // o.setAlbumArtist.read
        public final long RemoteActionCompatParcelizer(long j) throws IOException {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                long jSkip = this.read.skip(j2);
                if (jSkip <= 0) {
                    if (this.read.read() == -1) {
                        break;
                    }
                    jSkip = 1;
                }
                j2 -= jSkip;
            }
            return j - j2;
        }
    }
}
