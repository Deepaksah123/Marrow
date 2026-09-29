package kotlin;

import android.util.Base64;
import androidx.media3.extractor.metadata.flac.PictureFrame;
import androidx.media3.extractor.metadata.vorbis.VorbisComment;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class primitiveType {
    public static int write(int i) {
        int i2 = 0;
        while (i > 0) {
            i2++;
            i >>>= 1;
        }
        return i2;
    }

    public static final class IconCompatParcelizer {
        public final int IconCompatParcelizer;
        public final String read;
        public final String[] write;

        public IconCompatParcelizer(String str, String[] strArr, int i) {
            this.read = str;
            this.write = strArr;
            this.IconCompatParcelizer = i;
        }
    }

    public static final class write {
        public final int AudioAttributesCompatParcelizer;
        public final boolean AudioAttributesImplApi21Parcelizer;
        public final int AudioAttributesImplApi26Parcelizer;
        public final byte[] AudioAttributesImplBaseParcelizer;
        public final int IconCompatParcelizer;
        public final int MediaBrowserCompatCustomActionResultReceiver;
        public final int MediaBrowserCompatItemReceiver;
        public final int RemoteActionCompatParcelizer;
        public final int read;
        public final int write;

        public write(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z, byte[] bArr) {
            this.MediaBrowserCompatItemReceiver = i;
            this.MediaBrowserCompatCustomActionResultReceiver = i2;
            this.AudioAttributesImplApi26Parcelizer = i3;
            this.IconCompatParcelizer = i4;
            this.AudioAttributesCompatParcelizer = i5;
            this.write = i6;
            this.read = i7;
            this.RemoteActionCompatParcelizer = i8;
            this.AudioAttributesImplApi21Parcelizer = z;
            this.AudioAttributesImplBaseParcelizer = bArr;
        }
    }

    public static final class read {
        public final int AudioAttributesCompatParcelizer;
        public final int RemoteActionCompatParcelizer;
        public final int read;
        public final boolean write;

        public read(boolean z, int i, int i2, int i3) {
            this.write = z;
            this.RemoteActionCompatParcelizer = i;
            this.AudioAttributesCompatParcelizer = i2;
            this.read = i3;
        }
    }

    public static int[] IconCompatParcelizer(int i) {
        if (i == 3) {
            return new int[]{0, 2, 1};
        }
        if (i == 5) {
            return new int[]{0, 2, 1, 3, 4};
        }
        if (i == 6) {
            return new int[]{0, 2, 1, 5, 3, 4};
        }
        if (i == 7) {
            return new int[]{0, 2, 1, 6, 5, 3, 4};
        }
        if (i != 8) {
            return null;
        }
        return new int[]{0, 2, 1, 7, 5, 6, 3, 4};
    }

    public static initExtraTracks<byte[]> RemoteActionCompatParcelizer(byte[] bArr) {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(bArr);
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(1);
        int i = 0;
        while (asPropertyTypeDeserializer.IconCompatParcelizer() > 0 && asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer() == 255) {
            i += 255;
            asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(1);
        }
        int iOnPlayFromMediaId = i + asPropertyTypeDeserializer.onPlayFromMediaId();
        int i2 = 0;
        while (asPropertyTypeDeserializer.IconCompatParcelizer() > 0 && asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer() == 255) {
            i2 += 255;
            asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(1);
        }
        int iOnPlayFromMediaId2 = asPropertyTypeDeserializer.onPlayFromMediaId();
        byte[] bArr2 = new byte[iOnPlayFromMediaId];
        int iWrite = asPropertyTypeDeserializer.write();
        System.arraycopy(bArr, iWrite, bArr2, 0, iOnPlayFromMediaId);
        int i3 = iWrite + iOnPlayFromMediaId + i2 + iOnPlayFromMediaId2;
        int length = bArr.length - i3;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, i3, bArr3, 0, length);
        return initExtraTracks.AudioAttributesCompatParcelizer(bArr2, bArr3);
    }

    public static write AudioAttributesCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) throws SchemaAware {
        IconCompatParcelizer(1, asPropertyTypeDeserializer, false);
        int iOnCommand = asPropertyTypeDeserializer.onCommand();
        int iOnPlayFromMediaId = asPropertyTypeDeserializer.onPlayFromMediaId();
        int iOnCommand2 = asPropertyTypeDeserializer.onCommand();
        int iMediaMetadataCompat = asPropertyTypeDeserializer.MediaMetadataCompat();
        if (iMediaMetadataCompat <= 0) {
            iMediaMetadataCompat = -1;
        }
        int iMediaMetadataCompat2 = asPropertyTypeDeserializer.MediaMetadataCompat();
        if (iMediaMetadataCompat2 <= 0) {
            iMediaMetadataCompat2 = -1;
        }
        int iMediaMetadataCompat3 = asPropertyTypeDeserializer.MediaMetadataCompat();
        if (iMediaMetadataCompat3 <= 0) {
            iMediaMetadataCompat3 = -1;
        }
        int iOnPlayFromMediaId2 = asPropertyTypeDeserializer.onPlayFromMediaId();
        return new write(iOnCommand, iOnPlayFromMediaId, iOnCommand2, iMediaMetadataCompat, iMediaMetadataCompat2, iMediaMetadataCompat3, (int) Math.pow(2.0d, iOnPlayFromMediaId2 & 15), (int) Math.pow(2.0d, (iOnPlayFromMediaId2 & PsExtractor.VIDEO_STREAM_MASK) >> 4), (asPropertyTypeDeserializer.onPlayFromMediaId() & 1) > 0, Arrays.copyOf(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), asPropertyTypeDeserializer.read()));
    }

    public static IconCompatParcelizer read(AsPropertyTypeDeserializer asPropertyTypeDeserializer) throws SchemaAware {
        return read(asPropertyTypeDeserializer, true, true);
    }

    public static IconCompatParcelizer read(AsPropertyTypeDeserializer asPropertyTypeDeserializer, boolean z, boolean z2) throws SchemaAware {
        if (z) {
            IconCompatParcelizer(3, asPropertyTypeDeserializer, false);
        }
        String str = asPropertyTypeDeserializer.read((int) asPropertyTypeDeserializer.RatingCompat());
        int length = str.length();
        long jRatingCompat = asPropertyTypeDeserializer.RatingCompat();
        String[] strArr = new String[(int) jRatingCompat];
        int length2 = length + 15;
        for (int i = 0; i < jRatingCompat; i++) {
            String str2 = asPropertyTypeDeserializer.read((int) asPropertyTypeDeserializer.RatingCompat());
            strArr[i] = str2;
            length2 = length2 + 4 + str2.length();
        }
        if (z2 && (asPropertyTypeDeserializer.onPlayFromMediaId() & 1) == 0) {
            throw SchemaAware.RemoteActionCompatParcelizer("framing bit expected to be set", null);
        }
        return new IconCompatParcelizer(str, strArr, length2 + 1);
    }

    public static androidx.media3.common.Metadata read(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            String[] strArrRemoteActionCompatParcelizer = LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(str, "=");
            if (strArrRemoteActionCompatParcelizer.length != 2) {
                prune.RemoteActionCompatParcelizer("VorbisUtil", "Failed to parse Vorbis comment: ".concat(String.valueOf(str)));
            } else if (strArrRemoteActionCompatParcelizer[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(PictureFrame.AudioAttributesCompatParcelizer(new AsPropertyTypeDeserializer(Base64.decode(strArrRemoteActionCompatParcelizer[1], 0))));
                } catch (RuntimeException e) {
                    prune.write("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new VorbisComment(strArrRemoteActionCompatParcelizer[0], strArrRemoteActionCompatParcelizer[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new androidx.media3.common.Metadata(arrayList);
    }

    public static boolean IconCompatParcelizer(int i, AsPropertyTypeDeserializer asPropertyTypeDeserializer, boolean z) throws SchemaAware {
        if (asPropertyTypeDeserializer.IconCompatParcelizer() < 7) {
            if (z) {
                return false;
            }
            StringBuilder sb = new StringBuilder("too short header: ");
            sb.append(asPropertyTypeDeserializer.IconCompatParcelizer());
            throw SchemaAware.RemoteActionCompatParcelizer(sb.toString(), null);
        }
        if (asPropertyTypeDeserializer.onPlayFromMediaId() != i) {
            if (z) {
                return false;
            }
            StringBuilder sb2 = new StringBuilder("expected header type ");
            sb2.append(Integer.toHexString(i));
            throw SchemaAware.RemoteActionCompatParcelizer(sb2.toString(), null);
        }
        if (asPropertyTypeDeserializer.onPlayFromMediaId() == 118 && asPropertyTypeDeserializer.onPlayFromMediaId() == 111 && asPropertyTypeDeserializer.onPlayFromMediaId() == 114 && asPropertyTypeDeserializer.onPlayFromMediaId() == 98 && asPropertyTypeDeserializer.onPlayFromMediaId() == 105 && asPropertyTypeDeserializer.onPlayFromMediaId() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw SchemaAware.RemoteActionCompatParcelizer("expected characters 'vorbis'", null);
    }

    public static read[] RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i) throws SchemaAware {
        IconCompatParcelizer(5, asPropertyTypeDeserializer, false);
        int iOnPlayFromMediaId = asPropertyTypeDeserializer.onPlayFromMediaId();
        quotedOr quotedor = new quotedOr(asPropertyTypeDeserializer.RemoteActionCompatParcelizer());
        quotedor.AudioAttributesCompatParcelizer(asPropertyTypeDeserializer.write() << 3);
        for (int i2 = 0; i2 < iOnPlayFromMediaId + 1; i2++) {
            write(quotedor);
        }
        int iRemoteActionCompatParcelizer = quotedor.RemoteActionCompatParcelizer(6);
        for (int i3 = 0; i3 < iRemoteActionCompatParcelizer + 1; i3++) {
            if (quotedor.RemoteActionCompatParcelizer(16) != 0) {
                throw SchemaAware.RemoteActionCompatParcelizer("placeholder of time domain transforms not zeroed out", null);
            }
        }
        read(quotedor);
        AudioAttributesCompatParcelizer(quotedor);
        write(i, quotedor);
        read[] readVarArrIconCompatParcelizer = IconCompatParcelizer(quotedor);
        if (quotedor.IconCompatParcelizer()) {
            return readVarArrIconCompatParcelizer;
        }
        throw SchemaAware.RemoteActionCompatParcelizer("framing bit after modes not set as expected", null);
    }

    private static read[] IconCompatParcelizer(quotedOr quotedor) {
        int iRemoteActionCompatParcelizer = quotedor.RemoteActionCompatParcelizer(6) + 1;
        read[] readVarArr = new read[iRemoteActionCompatParcelizer];
        for (int i = 0; i < iRemoteActionCompatParcelizer; i++) {
            readVarArr[i] = new read(quotedor.IconCompatParcelizer(), quotedor.RemoteActionCompatParcelizer(16), quotedor.RemoteActionCompatParcelizer(16), quotedor.RemoteActionCompatParcelizer(8));
        }
        return readVarArr;
    }

    private static void write(int i, quotedOr quotedor) throws SchemaAware {
        int iRemoteActionCompatParcelizer = quotedor.RemoteActionCompatParcelizer(6);
        for (int i2 = 0; i2 < iRemoteActionCompatParcelizer + 1; i2++) {
            int iRemoteActionCompatParcelizer2 = quotedor.RemoteActionCompatParcelizer(16);
            if (iRemoteActionCompatParcelizer2 != 0) {
                prune.AudioAttributesCompatParcelizer("VorbisUtil", "mapping type other than 0 not supported: ".concat(String.valueOf(iRemoteActionCompatParcelizer2)));
            } else {
                int iRemoteActionCompatParcelizer3 = quotedor.IconCompatParcelizer() ? quotedor.RemoteActionCompatParcelizer(4) + 1 : 1;
                if (quotedor.IconCompatParcelizer()) {
                    int iRemoteActionCompatParcelizer4 = quotedor.RemoteActionCompatParcelizer(8);
                    for (int i3 = 0; i3 < iRemoteActionCompatParcelizer4 + 1; i3++) {
                        int i4 = i - 1;
                        quotedor.AudioAttributesCompatParcelizer(write(i4));
                        quotedor.AudioAttributesCompatParcelizer(write(i4));
                    }
                }
                if (quotedor.RemoteActionCompatParcelizer(2) != 0) {
                    throw SchemaAware.RemoteActionCompatParcelizer("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (iRemoteActionCompatParcelizer3 > 1) {
                    for (int i5 = 0; i5 < i; i5++) {
                        quotedor.AudioAttributesCompatParcelizer(4);
                    }
                }
                for (int i6 = 0; i6 < iRemoteActionCompatParcelizer3; i6++) {
                    quotedor.AudioAttributesCompatParcelizer(8);
                    quotedor.AudioAttributesCompatParcelizer(8);
                    quotedor.AudioAttributesCompatParcelizer(8);
                }
            }
        }
    }

    private static void AudioAttributesCompatParcelizer(quotedOr quotedor) throws SchemaAware {
        int iRemoteActionCompatParcelizer = quotedor.RemoteActionCompatParcelizer(6);
        for (int i = 0; i < iRemoteActionCompatParcelizer + 1; i++) {
            if (quotedor.RemoteActionCompatParcelizer(16) > 2) {
                throw SchemaAware.RemoteActionCompatParcelizer("residueType greater than 2 is not decodable", null);
            }
            quotedor.AudioAttributesCompatParcelizer(24);
            quotedor.AudioAttributesCompatParcelizer(24);
            quotedor.AudioAttributesCompatParcelizer(24);
            int iRemoteActionCompatParcelizer2 = quotedor.RemoteActionCompatParcelizer(6) + 1;
            quotedor.AudioAttributesCompatParcelizer(8);
            int[] iArr = new int[iRemoteActionCompatParcelizer2];
            for (int i2 = 0; i2 < iRemoteActionCompatParcelizer2; i2++) {
                iArr[i2] = ((quotedor.IconCompatParcelizer() ? quotedor.RemoteActionCompatParcelizer(5) : 0) << 3) + quotedor.RemoteActionCompatParcelizer(3);
            }
            for (int i3 = 0; i3 < iRemoteActionCompatParcelizer2; i3++) {
                for (int i4 = 0; i4 < 8; i4++) {
                    if ((iArr[i3] & (1 << i4)) != 0) {
                        quotedor.AudioAttributesCompatParcelizer(8);
                    }
                }
            }
        }
    }

    private static void read(quotedOr quotedor) throws SchemaAware {
        int iRemoteActionCompatParcelizer = quotedor.RemoteActionCompatParcelizer(6);
        for (int i = 0; i < iRemoteActionCompatParcelizer + 1; i++) {
            int iRemoteActionCompatParcelizer2 = quotedor.RemoteActionCompatParcelizer(16);
            if (iRemoteActionCompatParcelizer2 == 0) {
                quotedor.AudioAttributesCompatParcelizer(8);
                quotedor.AudioAttributesCompatParcelizer(16);
                quotedor.AudioAttributesCompatParcelizer(16);
                quotedor.AudioAttributesCompatParcelizer(6);
                quotedor.AudioAttributesCompatParcelizer(8);
                int iRemoteActionCompatParcelizer3 = quotedor.RemoteActionCompatParcelizer(4);
                for (int i2 = 0; i2 < iRemoteActionCompatParcelizer3 + 1; i2++) {
                    quotedor.AudioAttributesCompatParcelizer(8);
                }
            } else if (iRemoteActionCompatParcelizer2 == 1) {
                int iRemoteActionCompatParcelizer4 = quotedor.RemoteActionCompatParcelizer(5);
                int[] iArr = new int[iRemoteActionCompatParcelizer4];
                int i3 = -1;
                for (int i4 = 0; i4 < iRemoteActionCompatParcelizer4; i4++) {
                    int iRemoteActionCompatParcelizer5 = quotedor.RemoteActionCompatParcelizer(4);
                    iArr[i4] = iRemoteActionCompatParcelizer5;
                    if (iRemoteActionCompatParcelizer5 > i3) {
                        i3 = iRemoteActionCompatParcelizer5;
                    }
                }
                int i5 = i3 + 1;
                int[] iArr2 = new int[i5];
                for (int i6 = 0; i6 < i5; i6++) {
                    iArr2[i6] = quotedor.RemoteActionCompatParcelizer(3) + 1;
                    int iRemoteActionCompatParcelizer6 = quotedor.RemoteActionCompatParcelizer(2);
                    if (iRemoteActionCompatParcelizer6 > 0) {
                        quotedor.AudioAttributesCompatParcelizer(8);
                    }
                    for (int i7 = 0; i7 < (1 << iRemoteActionCompatParcelizer6); i7++) {
                        quotedor.AudioAttributesCompatParcelizer(8);
                    }
                }
                quotedor.AudioAttributesCompatParcelizer(2);
                int iRemoteActionCompatParcelizer7 = quotedor.RemoteActionCompatParcelizer(4);
                int i8 = 0;
                int i9 = 0;
                for (int i10 = 0; i10 < iRemoteActionCompatParcelizer4; i10++) {
                    i8 += iArr2[iArr[i10]];
                    while (i9 < i8) {
                        quotedor.AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer7);
                        i9++;
                    }
                }
            } else {
                throw SchemaAware.RemoteActionCompatParcelizer("floor type greater than 1 not decodable: ".concat(String.valueOf(iRemoteActionCompatParcelizer2)), null);
            }
        }
    }

    private static void write(quotedOr quotedor) throws SchemaAware {
        long jAudioAttributesCompatParcelizer;
        if (quotedor.RemoteActionCompatParcelizer(24) != 5653314) {
            StringBuilder sb = new StringBuilder("expected code book to start with [0x56, 0x43, 0x42] at ");
            sb.append(quotedor.read());
            throw SchemaAware.RemoteActionCompatParcelizer(sb.toString(), null);
        }
        int iRemoteActionCompatParcelizer = quotedor.RemoteActionCompatParcelizer(16);
        int iRemoteActionCompatParcelizer2 = quotedor.RemoteActionCompatParcelizer(24);
        int iRemoteActionCompatParcelizer3 = 0;
        if (!quotedor.IconCompatParcelizer()) {
            boolean zIconCompatParcelizer = quotedor.IconCompatParcelizer();
            while (iRemoteActionCompatParcelizer3 < iRemoteActionCompatParcelizer2) {
                if (!zIconCompatParcelizer || quotedor.IconCompatParcelizer()) {
                    quotedor.AudioAttributesCompatParcelizer(5);
                }
                iRemoteActionCompatParcelizer3++;
            }
        } else {
            quotedor.AudioAttributesCompatParcelizer(5);
            while (iRemoteActionCompatParcelizer3 < iRemoteActionCompatParcelizer2) {
                iRemoteActionCompatParcelizer3 += quotedor.RemoteActionCompatParcelizer(write(iRemoteActionCompatParcelizer2 - iRemoteActionCompatParcelizer3));
            }
        }
        int iRemoteActionCompatParcelizer4 = quotedor.RemoteActionCompatParcelizer(4);
        if (iRemoteActionCompatParcelizer4 > 2) {
            throw SchemaAware.RemoteActionCompatParcelizer("lookup type greater than 2 not decodable: ".concat(String.valueOf(iRemoteActionCompatParcelizer4)), null);
        }
        if (iRemoteActionCompatParcelizer4 == 1 || iRemoteActionCompatParcelizer4 == 2) {
            quotedor.AudioAttributesCompatParcelizer(32);
            quotedor.AudioAttributesCompatParcelizer(32);
            int iRemoteActionCompatParcelizer5 = quotedor.RemoteActionCompatParcelizer(4);
            quotedor.AudioAttributesCompatParcelizer(1);
            if (iRemoteActionCompatParcelizer4 == 1) {
                jAudioAttributesCompatParcelizer = iRemoteActionCompatParcelizer != 0 ? AudioAttributesCompatParcelizer(iRemoteActionCompatParcelizer2, iRemoteActionCompatParcelizer) : 0L;
            } else {
                jAudioAttributesCompatParcelizer = ((long) iRemoteActionCompatParcelizer) * ((long) iRemoteActionCompatParcelizer2);
            }
            quotedor.AudioAttributesCompatParcelizer((int) (jAudioAttributesCompatParcelizer * ((long) (iRemoteActionCompatParcelizer5 + 1))));
        }
    }

    private static long AudioAttributesCompatParcelizer(long j, long j2) {
        return (long) Math.floor(Math.pow(j, 1.0d / j2));
    }
}
