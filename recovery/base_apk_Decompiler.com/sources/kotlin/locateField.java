package kotlin;

import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Collections;
import kotlin.ByteBufferBackedOutputStream;
import kotlin.C0170format;
import kotlin.keys;

/* JADX INFO: loaded from: classes2.dex */
final class locateField extends keys {
    private static final int[] write = {5512, 11025, 22050, 44100};
    private boolean IconCompatParcelizer;
    private int RemoteActionCompatParcelizer;
    private boolean read;

    public locateField(nonNullString nonnullstring) {
        super(nonnullstring);
    }

    @Override // kotlin.keys
    protected final boolean read(AsPropertyTypeDeserializer asPropertyTypeDeserializer) throws keys.read {
        if (!this.read) {
            int iOnPlayFromMediaId = asPropertyTypeDeserializer.onPlayFromMediaId();
            int i = (iOnPlayFromMediaId >> 4) & 15;
            this.RemoteActionCompatParcelizer = i;
            if (i == 2) {
                this.AudioAttributesCompatParcelizer.write(new C0170format.RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer(MimeTypes.AUDIO_MPEG).read(1).MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(write[(iOnPlayFromMediaId >> 2) & 3]).IconCompatParcelizer());
                this.IconCompatParcelizer = true;
            } else if (i == 7 || i == 8) {
                this.AudioAttributesCompatParcelizer.write(new C0170format.RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer(i == 7 ? MimeTypes.AUDIO_ALAW : MimeTypes.AUDIO_MLAW).read(1).MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(8000).IconCompatParcelizer());
                this.IconCompatParcelizer = true;
            } else if (i != 10) {
                StringBuilder sb = new StringBuilder("Audio format not supported: ");
                sb.append(this.RemoteActionCompatParcelizer);
                throw new keys.read(sb.toString());
            }
            this.read = true;
        } else {
            asPropertyTypeDeserializer.AudioAttributesImplBaseParcelizer(1);
        }
        return true;
    }

    @Override // kotlin.keys
    protected final boolean IconCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, long j) throws SchemaAware {
        if (this.RemoteActionCompatParcelizer == 2) {
            int iIconCompatParcelizer = asPropertyTypeDeserializer.IconCompatParcelizer();
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(asPropertyTypeDeserializer, iIconCompatParcelizer);
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer(j, 1, iIconCompatParcelizer, 0, null);
            return true;
        }
        int iOnPlayFromMediaId = asPropertyTypeDeserializer.onPlayFromMediaId();
        if (iOnPlayFromMediaId == 0 && !this.IconCompatParcelizer) {
            int iIconCompatParcelizer2 = asPropertyTypeDeserializer.IconCompatParcelizer();
            byte[] bArr = new byte[iIconCompatParcelizer2];
            asPropertyTypeDeserializer.write(bArr, 0, iIconCompatParcelizer2);
            ByteBufferBackedOutputStream.RemoteActionCompatParcelizer remoteActionCompatParcelizer = ByteBufferBackedOutputStream.read(bArr);
            this.AudioAttributesCompatParcelizer.write(new C0170format.RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer(MimeTypes.AUDIO_AAC).RemoteActionCompatParcelizer(remoteActionCompatParcelizer.write).read(remoteActionCompatParcelizer.AudioAttributesCompatParcelizer).MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(remoteActionCompatParcelizer.IconCompatParcelizer).RemoteActionCompatParcelizer(Collections.singletonList(bArr)).IconCompatParcelizer());
            this.IconCompatParcelizer = true;
            return false;
        }
        if (this.RemoteActionCompatParcelizer == 10 && iOnPlayFromMediaId != 1) {
            return false;
        }
        int iIconCompatParcelizer3 = asPropertyTypeDeserializer.IconCompatParcelizer();
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(asPropertyTypeDeserializer, iIconCompatParcelizer3);
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer(j, 1, iIconCompatParcelizer3, 0, null);
        return true;
    }
}
