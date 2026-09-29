package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import kotlin.C0170format;
import kotlin.isJava8TimeClass;
import kotlin.removeFirstOccurrence;

/* JADX INFO: loaded from: classes2.dex */
public final class ViewMatcher implements checkNotEmpty {
    private final AsExternalTypeSerializer AudioAttributesCompatParcelizer;
    private boolean AudioAttributesImplApi21Parcelizer;
    private long AudioAttributesImplApi26Parcelizer;
    private nonNullString AudioAttributesImplBaseParcelizer;
    private final AsPropertyTypeDeserializer IconCompatParcelizer;
    private final int MediaBrowserCompatCustomActionResultReceiver;
    private final String MediaBrowserCompatItemReceiver;
    private int MediaBrowserCompatSearchResultReceiver;
    private long MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private String RemoteActionCompatParcelizer;
    private int read;
    private C0170format write;

    @Override // kotlin.checkNotEmpty
    public final void write(boolean z) {
    }

    public ViewMatcher() {
        this(null, 0);
    }

    public ViewMatcher(String str, int i) {
        AsExternalTypeSerializer asExternalTypeSerializer = new AsExternalTypeSerializer(new byte[128]);
        this.AudioAttributesCompatParcelizer = asExternalTypeSerializer;
        this.IconCompatParcelizer = new AsPropertyTypeDeserializer(asExternalTypeSerializer.write);
        this.MediaMetadataCompat = 0;
        this.MediaDescriptionCompat = C.TIME_UNSET;
        this.MediaBrowserCompatItemReceiver = str;
        this.MediaBrowserCompatCustomActionResultReceiver = i;
    }

    @Override // kotlin.checkNotEmpty
    public final void write() {
        this.MediaMetadataCompat = 0;
        this.read = 0;
        this.AudioAttributesImplApi21Parcelizer = false;
        this.MediaDescriptionCompat = C.TIME_UNSET;
    }

    @Override // kotlin.checkNotEmpty
    public final void write(findRawSuperTypes findrawsupertypes, removeFirstOccurrence.write writeVar) {
        writeVar.read();
        this.RemoteActionCompatParcelizer = writeVar.IconCompatParcelizer();
        this.AudioAttributesImplBaseParcelizer = findrawsupertypes.IconCompatParcelizer(writeVar.write(), 1);
    }

    @Override // kotlin.checkNotEmpty
    public final void IconCompatParcelizer(long j, int i) {
        this.MediaDescriptionCompat = j;
    }

    @Override // kotlin.checkNotEmpty
    public final void read(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.AudioAttributesImplBaseParcelizer);
        while (asPropertyTypeDeserializer.IconCompatParcelizer() > 0) {
            int i = this.MediaMetadataCompat;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int iMin = Math.min(asPropertyTypeDeserializer.IconCompatParcelizer(), this.MediaBrowserCompatSearchResultReceiver - this.read);
                        this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(asPropertyTypeDeserializer, iMin);
                        int i2 = this.read + iMin;
                        this.read = i2;
                        if (i2 == this.MediaBrowserCompatSearchResultReceiver) {
                            buildTypeSerializer.write(this.MediaDescriptionCompat != C.TIME_UNSET);
                            this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(this.MediaDescriptionCompat, 1, this.MediaBrowserCompatSearchResultReceiver, 0, null);
                            this.MediaDescriptionCompat += this.AudioAttributesImplApi26Parcelizer;
                            this.MediaMetadataCompat = 0;
                        }
                    }
                } else if (RemoteActionCompatParcelizer(asPropertyTypeDeserializer, this.IconCompatParcelizer.RemoteActionCompatParcelizer())) {
                    RemoteActionCompatParcelizer();
                    this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(0);
                    this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(this.IconCompatParcelizer, 128);
                    this.MediaMetadataCompat = 2;
                }
            } else if (RemoteActionCompatParcelizer(asPropertyTypeDeserializer)) {
                this.MediaMetadataCompat = 1;
                this.IconCompatParcelizer.RemoteActionCompatParcelizer()[0] = 11;
                this.IconCompatParcelizer.RemoteActionCompatParcelizer()[1] = 119;
                this.read = 2;
            }
        }
    }

    private boolean RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, byte[] bArr) {
        int iMin = Math.min(asPropertyTypeDeserializer.IconCompatParcelizer(), 128 - this.read);
        asPropertyTypeDeserializer.write(bArr, this.read, iMin);
        int i = this.read + iMin;
        this.read = i;
        return i == 128;
    }

    private boolean RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        while (true) {
            if (asPropertyTypeDeserializer.IconCompatParcelizer() <= 0) {
                return false;
            }
            if (!this.AudioAttributesImplApi21Parcelizer) {
                this.AudioAttributesImplApi21Parcelizer = asPropertyTypeDeserializer.onPlayFromMediaId() == 11;
            } else {
                int iOnPlayFromMediaId = asPropertyTypeDeserializer.onPlayFromMediaId();
                if (iOnPlayFromMediaId == 119) {
                    this.AudioAttributesImplApi21Parcelizer = false;
                    return true;
                }
                this.AudioAttributesImplApi21Parcelizer = iOnPlayFromMediaId == 11;
            }
        }
    }

    private void RemoteActionCompatParcelizer() {
        this.AudioAttributesCompatParcelizer.read(0);
        isJava8TimeClass.RemoteActionCompatParcelizer remoteActionCompatParcelizerWrite = isJava8TimeClass.write(this.AudioAttributesCompatParcelizer);
        if (this.write == null || remoteActionCompatParcelizerWrite.RemoteActionCompatParcelizer != this.write.AudioAttributesCompatParcelizer || remoteActionCompatParcelizerWrite.MediaBrowserCompatItemReceiver != this.write.onPrepareFromUri || !LaissezFaireSubTypeValidator.read(remoteActionCompatParcelizerWrite.IconCompatParcelizer, this.write.onPlayFromUri)) {
            C0170format.RemoteActionCompatParcelizer remoteActionCompatParcelizerMediaDescriptionCompat = new C0170format.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer).AudioAttributesImplApi26Parcelizer(remoteActionCompatParcelizerWrite.IconCompatParcelizer).read(remoteActionCompatParcelizerWrite.RemoteActionCompatParcelizer).MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(remoteActionCompatParcelizerWrite.MediaBrowserCompatItemReceiver).read(this.MediaBrowserCompatItemReceiver).MediaBrowserCompatSearchResultReceiver(this.MediaBrowserCompatCustomActionResultReceiver).MediaDescriptionCompat(remoteActionCompatParcelizerWrite.write);
            if (MimeTypes.AUDIO_AC3.equals(remoteActionCompatParcelizerWrite.IconCompatParcelizer)) {
                remoteActionCompatParcelizerMediaDescriptionCompat.write(remoteActionCompatParcelizerWrite.write);
            }
            C0170format c0170formatIconCompatParcelizer = remoteActionCompatParcelizerMediaDescriptionCompat.IconCompatParcelizer();
            this.write = c0170formatIconCompatParcelizer;
            this.AudioAttributesImplBaseParcelizer.write(c0170formatIconCompatParcelizer);
        }
        this.MediaBrowserCompatSearchResultReceiver = remoteActionCompatParcelizerWrite.read;
        this.AudioAttributesImplApi26Parcelizer = (((long) remoteActionCompatParcelizerWrite.AudioAttributesCompatParcelizer) * 1000000) / ((long) this.write.onPrepareFromUri);
    }
}
