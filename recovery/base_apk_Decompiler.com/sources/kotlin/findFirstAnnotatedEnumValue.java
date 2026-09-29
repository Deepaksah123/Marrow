package kotlin;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
public final class findFirstAnnotatedEnumValue {

    public static final class write {
        public long read;
    }

    public static boolean AudioAttributesCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, getGenericSuperclass getgenericsuperclass, int i, write writeVar) {
        int iWrite = asPropertyTypeDeserializer.write();
        long jOnMediaButtonEvent = asPropertyTypeDeserializer.onMediaButtonEvent();
        long j = jOnMediaButtonEvent >>> 16;
        if (j != i) {
            return false;
        }
        return IconCompatParcelizer((int) ((jOnMediaButtonEvent >> 4) & 15), getgenericsuperclass) && read((int) ((jOnMediaButtonEvent >> 1) & 7), getgenericsuperclass) && !(((jOnMediaButtonEvent & 1) > 1L ? 1 : ((jOnMediaButtonEvent & 1) == 1L ? 0 : -1)) == 0) && read(asPropertyTypeDeserializer, getgenericsuperclass, ((j & 1) > 1L ? 1 : ((j & 1) == 1L ? 0 : -1)) == 0, writeVar) && AudioAttributesCompatParcelizer(asPropertyTypeDeserializer, getgenericsuperclass, (int) ((jOnMediaButtonEvent >> 12) & 15)) && RemoteActionCompatParcelizer(asPropertyTypeDeserializer, getgenericsuperclass, (int) ((jOnMediaButtonEvent >> 8) & 15)) && read(asPropertyTypeDeserializer, iWrite);
    }

    public static boolean RemoteActionCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, getGenericSuperclass getgenericsuperclass, int i, write writeVar) throws IOException {
        long jWrite = closeonfailandthrowasioe.write();
        byte[] bArr = new byte[2];
        closeonfailandthrowasioe.RemoteActionCompatParcelizer(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
            closeonfailandthrowasioe.RemoteActionCompatParcelizer();
            closeonfailandthrowasioe.write((int) (jWrite - closeonfailandthrowasioe.IconCompatParcelizer()));
            return false;
        }
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(16);
        System.arraycopy(bArr, 0, asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), 0, 2);
        asPropertyTypeDeserializer.AudioAttributesCompatParcelizer(findSuperClasses.write(closeonfailandthrowasioe, asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), 2, 14));
        closeonfailandthrowasioe.RemoteActionCompatParcelizer();
        closeonfailandthrowasioe.write((int) (jWrite - closeonfailandthrowasioe.IconCompatParcelizer()));
        return AudioAttributesCompatParcelizer(asPropertyTypeDeserializer, getgenericsuperclass, i, writeVar);
    }

    public static long AudioAttributesCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, getGenericSuperclass getgenericsuperclass) throws IOException {
        closeonfailandthrowasioe.RemoteActionCompatParcelizer();
        closeonfailandthrowasioe.write(1);
        byte[] bArr = new byte[1];
        closeonfailandthrowasioe.RemoteActionCompatParcelizer(bArr, 0, 1);
        boolean z = (bArr[0] & 1) == 1;
        closeonfailandthrowasioe.write(2);
        int i = z ? 7 : 6;
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(i);
        asPropertyTypeDeserializer.AudioAttributesCompatParcelizer(findSuperClasses.write(closeonfailandthrowasioe, asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), 0, i));
        closeonfailandthrowasioe.RemoteActionCompatParcelizer();
        write writeVar = new write();
        if (!read(asPropertyTypeDeserializer, getgenericsuperclass, z, writeVar)) {
            throw SchemaAware.RemoteActionCompatParcelizer(null, null);
        }
        return writeVar.read;
    }

    public static int IconCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i) {
        switch (i) {
            case 1:
                return PsExtractor.AUDIO_STREAM;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return asPropertyTypeDeserializer.onPlayFromMediaId() + 1;
            case 7:
                return asPropertyTypeDeserializer.onPrepare() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    private static boolean IconCompatParcelizer(int i, getGenericSuperclass getgenericsuperclass) {
        return i <= 7 ? i == getgenericsuperclass.AudioAttributesCompatParcelizer - 1 : i <= 10 && getgenericsuperclass.AudioAttributesCompatParcelizer == 2;
    }

    private static boolean read(int i, getGenericSuperclass getgenericsuperclass) {
        return i == 0 || i == getgenericsuperclass.read;
    }

    private static boolean read(AsPropertyTypeDeserializer asPropertyTypeDeserializer, getGenericSuperclass getgenericsuperclass, boolean z, write writeVar) {
        try {
            long jOnPlayFromSearch = asPropertyTypeDeserializer.onPlayFromSearch();
            if (!z) {
                jOnPlayFromSearch *= (long) getgenericsuperclass.write;
            }
            writeVar.read = jOnPlayFromSearch;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    private static boolean AudioAttributesCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, getGenericSuperclass getgenericsuperclass, int i) {
        int iIconCompatParcelizer = IconCompatParcelizer(asPropertyTypeDeserializer, i);
        return iIconCompatParcelizer != -1 && iIconCompatParcelizer <= getgenericsuperclass.write;
    }

    private static boolean RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, getGenericSuperclass getgenericsuperclass, int i) {
        int i2 = getgenericsuperclass.MediaBrowserCompatCustomActionResultReceiver;
        if (i == 0) {
            return true;
        }
        if (i <= 11) {
            return i == getgenericsuperclass.AudioAttributesImplApi26Parcelizer;
        }
        if (i == 12) {
            return asPropertyTypeDeserializer.onPlayFromMediaId() * 1000 == i2;
        }
        if (i <= 14) {
            int iOnPrepare = asPropertyTypeDeserializer.onPrepare();
            if (i == 14) {
                iOnPrepare *= 10;
            }
            if (iOnPrepare == i2) {
                return true;
            }
        }
        return false;
    }

    private static boolean read(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i) {
        return asPropertyTypeDeserializer.onPlayFromMediaId() == LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), i, asPropertyTypeDeserializer.write() - 1, 0);
    }
}
