package kotlin;

import androidx.media3.extractor.metadata.flac.PictureFrame;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import kotlin.getGenericSuperclass;

/* JADX INFO: loaded from: classes2.dex */
public final class getEnclosingClass {

    public static final class read {
        public getGenericSuperclass AudioAttributesCompatParcelizer;

        public read(getGenericSuperclass getgenericsuperclass) {
            this.AudioAttributesCompatParcelizer = getgenericsuperclass;
        }
    }

    public static androidx.media3.common.Metadata RemoteActionCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, boolean z) throws IOException {
        androidx.media3.common.Metadata metadata = new isBogusClass().read(closeonfailandthrowasioe, z ? null : constructUsingIndex.IconCompatParcelizer);
        if (metadata == null || metadata.write() == 0) {
            return null;
        }
        return metadata;
    }

    public static boolean RemoteActionCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(4);
        closeonfailandthrowasioe.RemoteActionCompatParcelizer(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), 0, 4);
        return asPropertyTypeDeserializer.onMediaButtonEvent() == 1716281667;
    }

    public static androidx.media3.common.Metadata write(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, boolean z) throws IOException {
        closeonfailandthrowasioe.RemoteActionCompatParcelizer();
        long jWrite = closeonfailandthrowasioe.write();
        androidx.media3.common.Metadata metadataRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(closeonfailandthrowasioe, z);
        closeonfailandthrowasioe.IconCompatParcelizer((int) (closeonfailandthrowasioe.write() - jWrite));
        return metadataRemoteActionCompatParcelizer;
    }

    public static void read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(4);
        closeonfailandthrowasioe.IconCompatParcelizer(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), 0, 4);
        if (asPropertyTypeDeserializer.onMediaButtonEvent() != 1716281667) {
            throw SchemaAware.RemoteActionCompatParcelizer("Failed to read FLAC stream marker.", null);
        }
    }

    public static boolean IconCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, read readVar) throws IOException {
        closeonfailandthrowasioe.RemoteActionCompatParcelizer();
        AsExternalTypeSerializer asExternalTypeSerializer = new AsExternalTypeSerializer(new byte[4]);
        closeonfailandthrowasioe.RemoteActionCompatParcelizer(asExternalTypeSerializer.write, 0, 4);
        boolean z = asExternalTypeSerializer.read();
        int iIconCompatParcelizer = asExternalTypeSerializer.IconCompatParcelizer(7);
        int iIconCompatParcelizer2 = asExternalTypeSerializer.IconCompatParcelizer(24) + 4;
        if (iIconCompatParcelizer == 0) {
            readVar.AudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(closeonfailandthrowasioe);
            return z;
        }
        getGenericSuperclass getgenericsuperclass = readVar.AudioAttributesCompatParcelizer;
        if (getgenericsuperclass == null) {
            throw new IllegalArgumentException();
        }
        if (iIconCompatParcelizer == 3) {
            readVar.AudioAttributesCompatParcelizer = getgenericsuperclass.RemoteActionCompatParcelizer(read(closeonfailandthrowasioe, iIconCompatParcelizer2));
            return z;
        }
        if (iIconCompatParcelizer == 4) {
            readVar.AudioAttributesCompatParcelizer = getgenericsuperclass.AudioAttributesCompatParcelizer(write(closeonfailandthrowasioe, iIconCompatParcelizer2));
            return z;
        }
        if (iIconCompatParcelizer == 6) {
            AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(iIconCompatParcelizer2);
            closeonfailandthrowasioe.IconCompatParcelizer(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), 0, iIconCompatParcelizer2);
            asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(4);
            readVar.AudioAttributesCompatParcelizer = getgenericsuperclass.RemoteActionCompatParcelizer(initExtraTracks.read(PictureFrame.AudioAttributesCompatParcelizer(asPropertyTypeDeserializer)));
            return z;
        }
        closeonfailandthrowasioe.IconCompatParcelizer(iIconCompatParcelizer2);
        return z;
    }

    public static getGenericSuperclass.IconCompatParcelizer IconCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(1);
        int iOnPause = asPropertyTypeDeserializer.onPause();
        long jWrite = asPropertyTypeDeserializer.write();
        long j = iOnPause;
        int i = iOnPause / 18;
        long[] jArrCopyOf = new long[i];
        long[] jArrCopyOf2 = new long[i];
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            long jHandleMediaPlayPauseIfPendingOnHandler = asPropertyTypeDeserializer.handleMediaPlayPauseIfPendingOnHandler();
            if (jHandleMediaPlayPauseIfPendingOnHandler == -1) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
                jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
                break;
            }
            jArrCopyOf[i2] = jHandleMediaPlayPauseIfPendingOnHandler;
            jArrCopyOf2[i2] = asPropertyTypeDeserializer.handleMediaPlayPauseIfPendingOnHandler();
            asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(2);
            i2++;
        }
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer((int) ((jWrite + j) - ((long) asPropertyTypeDeserializer.write())));
        return new getGenericSuperclass.IconCompatParcelizer(jArrCopyOf, jArrCopyOf2);
    }

    public static int write(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        closeonfailandthrowasioe.RemoteActionCompatParcelizer();
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(2);
        closeonfailandthrowasioe.RemoteActionCompatParcelizer(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), 0, 2);
        int iOnPrepare = asPropertyTypeDeserializer.onPrepare();
        if ((iOnPrepare >> 2) != 16382) {
            closeonfailandthrowasioe.RemoteActionCompatParcelizer();
            throw SchemaAware.RemoteActionCompatParcelizer("First frame does not start with sync code.", null);
        }
        closeonfailandthrowasioe.RemoteActionCompatParcelizer();
        return iOnPrepare;
    }

    private static getGenericSuperclass AudioAttributesCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        byte[] bArr = new byte[38];
        closeonfailandthrowasioe.IconCompatParcelizer(bArr, 0, 38);
        return new getGenericSuperclass(bArr, 4);
    }

    private static getGenericSuperclass.IconCompatParcelizer read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, int i) throws IOException {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(i);
        closeonfailandthrowasioe.IconCompatParcelizer(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), 0, i);
        return IconCompatParcelizer(asPropertyTypeDeserializer);
    }

    private static List<String> write(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, int i) throws IOException {
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(i);
        closeonfailandthrowasioe.IconCompatParcelizer(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), 0, i);
        asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(4);
        return Arrays.asList(primitiveType.read(asPropertyTypeDeserializer, false, false).write);
    }
}
