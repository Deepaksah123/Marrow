package kotlin;

import com.google.android.exoplayer2.util.MimeTypes;
import kotlin.C0170format;
import kotlin.keys;

/* JADX INFO: loaded from: classes2.dex */
final class Converter extends keys {
    private boolean IconCompatParcelizer;
    private final AsPropertyTypeDeserializer MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    private int RemoteActionCompatParcelizer;
    private final AsPropertyTypeDeserializer read;
    private boolean write;

    public Converter(nonNullString nonnullstring) {
        super(nonnullstring);
        this.MediaBrowserCompatCustomActionResultReceiver = new AsPropertyTypeDeserializer(noTypeInfoBuilder.AudioAttributesCompatParcelizer);
        this.read = new AsPropertyTypeDeserializer(4);
    }

    @Override // kotlin.keys
    protected final boolean read(AsPropertyTypeDeserializer asPropertyTypeDeserializer) throws keys.read {
        int iOnPlayFromMediaId = asPropertyTypeDeserializer.onPlayFromMediaId();
        int i = (iOnPlayFromMediaId >> 4) & 15;
        int i2 = iOnPlayFromMediaId & 15;
        if (i2 != 7) {
            throw new keys.read("Video format not supported: ".concat(String.valueOf(i2)));
        }
        this.RemoteActionCompatParcelizer = i;
        return i != 5;
    }

    @Override // kotlin.keys
    protected final boolean IconCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, long j) throws SchemaAware {
        int iOnPlayFromMediaId = asPropertyTypeDeserializer.onPlayFromMediaId();
        long jAudioAttributesImplApi26Parcelizer = asPropertyTypeDeserializer.AudioAttributesImplApi26Parcelizer();
        if (iOnPlayFromMediaId == 0 && !this.write) {
            AsPropertyTypeDeserializer asPropertyTypeDeserializer2 = new AsPropertyTypeDeserializer(new byte[asPropertyTypeDeserializer.IconCompatParcelizer()]);
            asPropertyTypeDeserializer.write(asPropertyTypeDeserializer2.RemoteActionCompatParcelizer(), 0, asPropertyTypeDeserializer.IconCompatParcelizer());
            apostrophed apostrophedVarAudioAttributesCompatParcelizer = apostrophed.AudioAttributesCompatParcelizer(asPropertyTypeDeserializer2);
            this.MediaBrowserCompatItemReceiver = apostrophedVarAudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver;
            this.AudioAttributesCompatParcelizer.write(new C0170format.RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer(MimeTypes.VIDEO_H264).RemoteActionCompatParcelizer(apostrophedVarAudioAttributesCompatParcelizer.read).onFastForward(apostrophedVarAudioAttributesCompatParcelizer.RatingCompat).MediaBrowserCompatItemReceiver(apostrophedVarAudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer).write(apostrophedVarAudioAttributesCompatParcelizer.MediaMetadataCompat).RemoteActionCompatParcelizer(apostrophedVarAudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver).IconCompatParcelizer());
            this.write = true;
            return false;
        }
        if (iOnPlayFromMediaId != 1 || !this.write) {
            return false;
        }
        int i = this.RemoteActionCompatParcelizer == 1 ? 1 : 0;
        if (!this.IconCompatParcelizer && i == 0) {
            return false;
        }
        byte[] bArrRemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer();
        bArrRemoteActionCompatParcelizer[0] = 0;
        bArrRemoteActionCompatParcelizer[1] = 0;
        bArrRemoteActionCompatParcelizer[2] = 0;
        int i2 = this.MediaBrowserCompatItemReceiver;
        int i3 = 0;
        while (asPropertyTypeDeserializer.IconCompatParcelizer() > 0) {
            asPropertyTypeDeserializer.write(this.read.RemoteActionCompatParcelizer(), 4 - i2, this.MediaBrowserCompatItemReceiver);
            this.read.MediaBrowserCompatCustomActionResultReceiver(0);
            int iOnPrepareFromSearch = this.read.onPrepareFromSearch();
            this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver(0);
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, 4);
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(asPropertyTypeDeserializer, iOnPrepareFromSearch);
            i3 = i3 + 4 + iOnPrepareFromSearch;
        }
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer(j + (jAudioAttributesImplApi26Parcelizer * 1000), i, i3, 0, null);
        this.IconCompatParcelizer = true;
        return true;
    }
}
