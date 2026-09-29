package kotlin;

import java.util.Arrays;
import kotlin._findConverterType;
import kotlin.getGenericSuperclass;

/* JADX INFO: loaded from: classes2.dex */
final class PrimitiveArrayBuilderNode extends _findConverterType {
    private getGenericSuperclass IconCompatParcelizer;
    private write RemoteActionCompatParcelizer;

    PrimitiveArrayBuilderNode() {
    }

    public static boolean RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        return asPropertyTypeDeserializer.IconCompatParcelizer() >= 5 && asPropertyTypeDeserializer.onPlayFromMediaId() == 127 && asPropertyTypeDeserializer.onMediaButtonEvent() == 1179402563;
    }

    @Override // kotlin._findConverterType
    protected final void AudioAttributesCompatParcelizer(boolean z) {
        super.AudioAttributesCompatParcelizer(z);
        if (z) {
            this.IconCompatParcelizer = null;
            this.RemoteActionCompatParcelizer = null;
        }
    }

    private static boolean RemoteActionCompatParcelizer(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // kotlin._findConverterType
    protected final long read(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        if (RemoteActionCompatParcelizer(asPropertyTypeDeserializer.RemoteActionCompatParcelizer())) {
            return AudioAttributesCompatParcelizer(asPropertyTypeDeserializer);
        }
        return -1L;
    }

    @Override // kotlin._findConverterType
    protected final boolean write(AsPropertyTypeDeserializer asPropertyTypeDeserializer, long j, _findConverterType.write writeVar) {
        byte[] bArrRemoteActionCompatParcelizer = asPropertyTypeDeserializer.RemoteActionCompatParcelizer();
        getGenericSuperclass getgenericsuperclass = this.IconCompatParcelizer;
        if (getgenericsuperclass == null) {
            getGenericSuperclass getgenericsuperclass2 = new getGenericSuperclass(bArrRemoteActionCompatParcelizer, 17);
            this.IconCompatParcelizer = getgenericsuperclass2;
            writeVar.AudioAttributesCompatParcelizer = getgenericsuperclass2.read(Arrays.copyOfRange(bArrRemoteActionCompatParcelizer, 9, asPropertyTypeDeserializer.read()), null);
            return true;
        }
        if ((bArrRemoteActionCompatParcelizer[0] & 127) == 3) {
            getGenericSuperclass.IconCompatParcelizer IconCompatParcelizer = getEnclosingClass.IconCompatParcelizer(asPropertyTypeDeserializer);
            getGenericSuperclass getgenericsuperclassRemoteActionCompatParcelizer = getgenericsuperclass.RemoteActionCompatParcelizer(IconCompatParcelizer);
            this.IconCompatParcelizer = getgenericsuperclassRemoteActionCompatParcelizer;
            this.RemoteActionCompatParcelizer = new write(getgenericsuperclassRemoteActionCompatParcelizer, IconCompatParcelizer);
            return true;
        }
        if (!RemoteActionCompatParcelizer(bArrRemoteActionCompatParcelizer)) {
            return true;
        }
        write writeVar2 = this.RemoteActionCompatParcelizer;
        if (writeVar2 != null) {
            writeVar2.RemoteActionCompatParcelizer(j);
            writeVar.read = this.RemoteActionCompatParcelizer;
        }
        C0170format c0170format = writeVar.AudioAttributesCompatParcelizer;
        return false;
    }

    private static int AudioAttributesCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        int i = (asPropertyTypeDeserializer.RemoteActionCompatParcelizer()[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(4);
            asPropertyTypeDeserializer.onPlayFromSearch();
        }
        int iIconCompatParcelizer = findFirstAnnotatedEnumValue.IconCompatParcelizer(asPropertyTypeDeserializer, i);
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(0);
        return iIconCompatParcelizer;
    }

    static final class write implements StdDateFormat {
        private getGenericSuperclass.IconCompatParcelizer AudioAttributesCompatParcelizer;
        private long IconCompatParcelizer = -1;
        private long RemoteActionCompatParcelizer = -1;
        private getGenericSuperclass read;

        public write(getGenericSuperclass getgenericsuperclass, getGenericSuperclass.IconCompatParcelizer iconCompatParcelizer) {
            this.read = getgenericsuperclass;
            this.AudioAttributesCompatParcelizer = iconCompatParcelizer;
        }

        public final void RemoteActionCompatParcelizer(long j) {
            this.IconCompatParcelizer = j;
        }

        @Override // kotlin.StdDateFormat
        public final long write(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) {
            long j = this.RemoteActionCompatParcelizer;
            if (j < 0) {
                return -1L;
            }
            long j2 = -(j + 2);
            this.RemoteActionCompatParcelizer = -1L;
            return j2;
        }

        @Override // kotlin.StdDateFormat
        public final void write(long j) {
            long[] jArr = this.AudioAttributesCompatParcelizer.write;
            this.RemoteActionCompatParcelizer = jArr[LaissezFaireSubTypeValidator.RemoteActionCompatParcelizer(jArr, j, true)];
        }

        @Override // kotlin.StdDateFormat
        public final isCollectionMapOrArray write() {
            buildTypeSerializer.write(this.IconCompatParcelizer != -1);
            return new getClassMethods(this.read, this.IconCompatParcelizer);
        }
    }
}
