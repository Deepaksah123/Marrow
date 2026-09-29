package kotlin;

import com.google.android.exoplayer2.audio.OpusUtil;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Arrays;
import java.util.List;
import kotlin.C0170format;
import kotlin._findConverterType;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes2.dex */
final class SimpleBeanPropertyDefinition extends _findConverterType {
    private static final byte[] IconCompatParcelizer = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] write = {79, 112, 117, 115, 84, 97, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, 115};
    private boolean AudioAttributesCompatParcelizer;

    SimpleBeanPropertyDefinition() {
    }

    public static boolean AudioAttributesCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        return AudioAttributesCompatParcelizer(asPropertyTypeDeserializer, IconCompatParcelizer);
    }

    @Override // kotlin._findConverterType
    protected final void AudioAttributesCompatParcelizer(boolean z) {
        super.AudioAttributesCompatParcelizer(z);
        if (z) {
            this.AudioAttributesCompatParcelizer = false;
        }
    }

    @Override // kotlin._findConverterType
    protected final long read(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        return read(isObjectOrPrimitive.IconCompatParcelizer(asPropertyTypeDeserializer.RemoteActionCompatParcelizer()));
    }

    @Override // kotlin._findConverterType
    protected final boolean write(AsPropertyTypeDeserializer asPropertyTypeDeserializer, long j, _findConverterType.write writeVar) throws SchemaAware {
        if (AudioAttributesCompatParcelizer(asPropertyTypeDeserializer, IconCompatParcelizer)) {
            byte[] bArrCopyOf = Arrays.copyOf(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), asPropertyTypeDeserializer.read());
            int iWrite = isObjectOrPrimitive.write(bArrCopyOf);
            List<byte[]> listAudioAttributesCompatParcelizer = isObjectOrPrimitive.AudioAttributesCompatParcelizer(bArrCopyOf);
            if (writeVar.AudioAttributesCompatParcelizer != null) {
                return true;
            }
            writeVar.AudioAttributesCompatParcelizer = new C0170format.RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer(MimeTypes.AUDIO_OPUS).read(iWrite).MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(OpusUtil.SAMPLE_RATE).RemoteActionCompatParcelizer(listAudioAttributesCompatParcelizer).IconCompatParcelizer();
            return true;
        }
        byte[] bArr = write;
        if (AudioAttributesCompatParcelizer(asPropertyTypeDeserializer, bArr)) {
            buildTypeSerializer.AudioAttributesCompatParcelizer(writeVar.AudioAttributesCompatParcelizer);
            if (this.AudioAttributesCompatParcelizer) {
                return true;
            }
            this.AudioAttributesCompatParcelizer = true;
            asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(bArr.length);
            androidx.media3.common.Metadata metadata = primitiveType.read(initExtraTracks.write(primitiveType.read(asPropertyTypeDeserializer, false, false).write));
            if (metadata == null) {
                return true;
            }
            writeVar.AudioAttributesCompatParcelizer = writeVar.AudioAttributesCompatParcelizer.write().read(metadata.RemoteActionCompatParcelizer(writeVar.AudioAttributesCompatParcelizer.onPlay)).IconCompatParcelizer();
            return true;
        }
        buildTypeSerializer.AudioAttributesCompatParcelizer(writeVar.AudioAttributesCompatParcelizer);
        return false;
    }

    private static boolean AudioAttributesCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, byte[] bArr) {
        if (asPropertyTypeDeserializer.IconCompatParcelizer() < bArr.length) {
            return false;
        }
        int iWrite = asPropertyTypeDeserializer.write();
        byte[] bArr2 = new byte[bArr.length];
        asPropertyTypeDeserializer.write(bArr2, 0, bArr.length);
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iWrite);
        return Arrays.equals(bArr2, bArr);
    }
}
