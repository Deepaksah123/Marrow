package kotlin;

import com.google.android.exoplayer2.util.MimeTypes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.C0170format;
import kotlin._findConverterType;
import kotlin.primitiveType;

/* JADX INFO: loaded from: classes2.dex */
final class _cloneFormat extends _findConverterType {
    private boolean AudioAttributesCompatParcelizer;
    private IconCompatParcelizer IconCompatParcelizer;
    private int RemoteActionCompatParcelizer;
    private primitiveType.IconCompatParcelizer read;
    private primitiveType.write write;

    private static int AudioAttributesCompatParcelizer(byte b, int i) {
        return (b >> 1) & (255 >>> (8 - i));
    }

    _cloneFormat() {
    }

    public static boolean IconCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        try {
            return primitiveType.IconCompatParcelizer(1, asPropertyTypeDeserializer, true);
        } catch (SchemaAware unused) {
            return false;
        }
    }

    @Override // kotlin._findConverterType
    protected final void AudioAttributesCompatParcelizer(boolean z) {
        super.AudioAttributesCompatParcelizer(z);
        if (z) {
            this.IconCompatParcelizer = null;
            this.write = null;
            this.read = null;
        }
        this.RemoteActionCompatParcelizer = 0;
        this.AudioAttributesCompatParcelizer = false;
    }

    @Override // kotlin._findConverterType
    protected final void IconCompatParcelizer(long j) {
        super.IconCompatParcelizer(j);
        this.AudioAttributesCompatParcelizer = j != 0;
        primitiveType.write writeVar = this.write;
        this.RemoteActionCompatParcelizer = writeVar != null ? writeVar.read : 0;
    }

    @Override // kotlin._findConverterType
    protected final long read(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        if ((asPropertyTypeDeserializer.RemoteActionCompatParcelizer()[0] & 1) == 1) {
            return -1L;
        }
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(asPropertyTypeDeserializer.RemoteActionCompatParcelizer()[0], (IconCompatParcelizer) buildTypeSerializer.AudioAttributesCompatParcelizer(this.IconCompatParcelizer));
        long j = this.AudioAttributesCompatParcelizer ? (this.RemoteActionCompatParcelizer + iRemoteActionCompatParcelizer) / 4 : 0;
        IconCompatParcelizer(asPropertyTypeDeserializer, j);
        this.AudioAttributesCompatParcelizer = true;
        this.RemoteActionCompatParcelizer = iRemoteActionCompatParcelizer;
        return j;
    }

    @Override // kotlin._findConverterType
    protected final boolean write(AsPropertyTypeDeserializer asPropertyTypeDeserializer, long j, _findConverterType.write writeVar) throws IOException {
        if (this.IconCompatParcelizer != null) {
            C0170format c0170format = writeVar.AudioAttributesCompatParcelizer;
            return false;
        }
        IconCompatParcelizer iconCompatParcelizerRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(asPropertyTypeDeserializer);
        this.IconCompatParcelizer = iconCompatParcelizerRemoteActionCompatParcelizer;
        if (iconCompatParcelizerRemoteActionCompatParcelizer == null) {
            return true;
        }
        primitiveType.write writeVar2 = iconCompatParcelizerRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
        ArrayList arrayList = new ArrayList();
        arrayList.add(writeVar2.AudioAttributesImplBaseParcelizer);
        arrayList.add(iconCompatParcelizerRemoteActionCompatParcelizer.write);
        writeVar.AudioAttributesCompatParcelizer = new C0170format.RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer(MimeTypes.AUDIO_VORBIS).write(writeVar2.AudioAttributesCompatParcelizer).MediaDescriptionCompat(writeVar2.IconCompatParcelizer).read(writeVar2.MediaBrowserCompatCustomActionResultReceiver).MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(writeVar2.AudioAttributesImplApi26Parcelizer).RemoteActionCompatParcelizer(arrayList).read(primitiveType.read(initExtraTracks.write(iconCompatParcelizerRemoteActionCompatParcelizer.RemoteActionCompatParcelizer.write))).IconCompatParcelizer();
        return true;
    }

    private IconCompatParcelizer RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) throws IOException {
        primitiveType.write writeVar = this.write;
        if (writeVar == null) {
            this.write = primitiveType.AudioAttributesCompatParcelizer(asPropertyTypeDeserializer);
            return null;
        }
        primitiveType.IconCompatParcelizer iconCompatParcelizer = this.read;
        if (iconCompatParcelizer == null) {
            this.read = primitiveType.read(asPropertyTypeDeserializer);
            return null;
        }
        byte[] bArr = new byte[asPropertyTypeDeserializer.read()];
        System.arraycopy(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), 0, bArr, 0, asPropertyTypeDeserializer.read());
        return new IconCompatParcelizer(writeVar, iconCompatParcelizer, bArr, primitiveType.RemoteActionCompatParcelizer(asPropertyTypeDeserializer, writeVar.MediaBrowserCompatCustomActionResultReceiver), primitiveType.write(r4.length - 1));
    }

    private static void IconCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, long j) {
        if (asPropertyTypeDeserializer.AudioAttributesCompatParcelizer() < asPropertyTypeDeserializer.read() + 4) {
            asPropertyTypeDeserializer.AudioAttributesCompatParcelizer(Arrays.copyOf(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), asPropertyTypeDeserializer.read() + 4));
        } else {
            asPropertyTypeDeserializer.AudioAttributesCompatParcelizer(asPropertyTypeDeserializer.read() + 4);
        }
        byte[] bArrRemoteActionCompatParcelizer = asPropertyTypeDeserializer.RemoteActionCompatParcelizer();
        bArrRemoteActionCompatParcelizer[asPropertyTypeDeserializer.read() - 4] = (byte) (j & 255);
        bArrRemoteActionCompatParcelizer[asPropertyTypeDeserializer.read() - 3] = (byte) ((j >>> 8) & 255);
        bArrRemoteActionCompatParcelizer[asPropertyTypeDeserializer.read() - 2] = (byte) ((j >>> 16) & 255);
        bArrRemoteActionCompatParcelizer[asPropertyTypeDeserializer.read() - 1] = (byte) ((j >>> 24) & 255);
    }

    private static int RemoteActionCompatParcelizer(byte b, IconCompatParcelizer iconCompatParcelizer) {
        if (!iconCompatParcelizer.read[AudioAttributesCompatParcelizer(b, iconCompatParcelizer.IconCompatParcelizer)].write) {
            return iconCompatParcelizer.AudioAttributesCompatParcelizer.read;
        }
        return iconCompatParcelizer.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
    }

    static final class IconCompatParcelizer {
        public final primitiveType.write AudioAttributesCompatParcelizer;
        public final int IconCompatParcelizer;
        public final primitiveType.IconCompatParcelizer RemoteActionCompatParcelizer;
        public final primitiveType.read[] read;
        public final byte[] write;

        public IconCompatParcelizer(primitiveType.write writeVar, primitiveType.IconCompatParcelizer iconCompatParcelizer, byte[] bArr, primitiveType.read[] readVarArr, int i) {
            this.AudioAttributesCompatParcelizer = writeVar;
            this.RemoteActionCompatParcelizer = iconCompatParcelizer;
            this.write = bArr;
            this.read = readVarArr;
            this.IconCompatParcelizer = i;
        }
    }
}
