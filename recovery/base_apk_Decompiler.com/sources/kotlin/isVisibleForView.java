package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import kotlin.C0170format;
import kotlin._interfaces;
import kotlin.removeFirstOccurrence;

/* JADX INFO: loaded from: classes2.dex */
public final class isVisibleForView implements checkNotEmpty {
    private String AudioAttributesCompatParcelizer;
    private boolean AudioAttributesImplApi21Parcelizer;
    private final String AudioAttributesImplApi26Parcelizer;
    private nonNullString AudioAttributesImplBaseParcelizer;
    private boolean IconCompatParcelizer;
    private final int MediaBrowserCompatCustomActionResultReceiver;
    private final AsPropertyTypeDeserializer MediaBrowserCompatItemReceiver;
    private int MediaBrowserCompatMediaItem;
    private long MediaBrowserCompatSearchResultReceiver;
    private long MediaDescriptionCompat;
    private int RatingCompat;
    private final AsExternalTypeSerializer RemoteActionCompatParcelizer;
    private int read;
    private C0170format write;

    @Override // kotlin.checkNotEmpty
    public final void write(boolean z) {
    }

    public isVisibleForView() {
        this(null, 0);
    }

    public isVisibleForView(String str, int i) {
        AsExternalTypeSerializer asExternalTypeSerializer = new AsExternalTypeSerializer(new byte[16]);
        this.RemoteActionCompatParcelizer = asExternalTypeSerializer;
        this.MediaBrowserCompatItemReceiver = new AsPropertyTypeDeserializer(asExternalTypeSerializer.write);
        this.MediaBrowserCompatMediaItem = 0;
        this.read = 0;
        this.AudioAttributesImplApi21Parcelizer = false;
        this.IconCompatParcelizer = false;
        this.MediaDescriptionCompat = C.TIME_UNSET;
        this.AudioAttributesImplApi26Parcelizer = str;
        this.MediaBrowserCompatCustomActionResultReceiver = i;
    }

    @Override // kotlin.checkNotEmpty
    public final void write() {
        this.MediaBrowserCompatMediaItem = 0;
        this.read = 0;
        this.AudioAttributesImplApi21Parcelizer = false;
        this.IconCompatParcelizer = false;
        this.MediaDescriptionCompat = C.TIME_UNSET;
    }

    @Override // kotlin.checkNotEmpty
    public final void write(findRawSuperTypes findrawsupertypes, removeFirstOccurrence.write writeVar) {
        writeVar.read();
        this.AudioAttributesCompatParcelizer = writeVar.IconCompatParcelizer();
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
            int i = this.MediaBrowserCompatMediaItem;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int iMin = Math.min(asPropertyTypeDeserializer.IconCompatParcelizer(), this.RatingCompat - this.read);
                        this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(asPropertyTypeDeserializer, iMin);
                        int i2 = this.read + iMin;
                        this.read = i2;
                        if (i2 == this.RatingCompat) {
                            buildTypeSerializer.write(this.MediaDescriptionCompat != C.TIME_UNSET);
                            this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(this.MediaDescriptionCompat, 1, this.RatingCompat, 0, null);
                            this.MediaDescriptionCompat += this.MediaBrowserCompatSearchResultReceiver;
                            this.MediaBrowserCompatMediaItem = 0;
                        }
                    }
                } else if (RemoteActionCompatParcelizer(asPropertyTypeDeserializer, this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer())) {
                    read();
                    this.MediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver(0);
                    this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver, 16);
                    this.MediaBrowserCompatMediaItem = 2;
                }
            } else if (RemoteActionCompatParcelizer(asPropertyTypeDeserializer)) {
                this.MediaBrowserCompatMediaItem = 1;
                this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer()[0] = -84;
                this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer()[1] = (byte) (this.IconCompatParcelizer ? 65 : 64);
                this.read = 2;
            }
        }
    }

    private boolean RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, byte[] bArr) {
        int iMin = Math.min(asPropertyTypeDeserializer.IconCompatParcelizer(), 16 - this.read);
        asPropertyTypeDeserializer.write(bArr, this.read, iMin);
        int i = this.read + iMin;
        this.read = i;
        return i == 16;
    }

    private boolean RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        int iOnPlayFromMediaId;
        while (true) {
            if (asPropertyTypeDeserializer.IconCompatParcelizer() <= 0) {
                return false;
            }
            if (!this.AudioAttributesImplApi21Parcelizer) {
                this.AudioAttributesImplApi21Parcelizer = asPropertyTypeDeserializer.onPlayFromMediaId() == 172;
            } else {
                iOnPlayFromMediaId = asPropertyTypeDeserializer.onPlayFromMediaId();
                this.AudioAttributesImplApi21Parcelizer = iOnPlayFromMediaId == 172;
                if (iOnPlayFromMediaId == 64 || iOnPlayFromMediaId == 65) {
                    break;
                }
            }
        }
        this.IconCompatParcelizer = iOnPlayFromMediaId == 65;
        return true;
    }

    private void read() {
        this.RemoteActionCompatParcelizer.read(0);
        _interfaces.RemoteActionCompatParcelizer remoteActionCompatParcelizerWrite = _interfaces.write(this.RemoteActionCompatParcelizer);
        if (this.write == null || remoteActionCompatParcelizerWrite.AudioAttributesCompatParcelizer != this.write.AudioAttributesCompatParcelizer || remoteActionCompatParcelizerWrite.write != this.write.onPrepareFromUri || !MimeTypes.AUDIO_AC4.equals(this.write.onPlayFromUri)) {
            C0170format c0170formatIconCompatParcelizer = new C0170format.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer).AudioAttributesImplApi26Parcelizer(MimeTypes.AUDIO_AC4).read(remoteActionCompatParcelizerWrite.AudioAttributesCompatParcelizer).MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(remoteActionCompatParcelizerWrite.write).read(this.AudioAttributesImplApi26Parcelizer).MediaBrowserCompatSearchResultReceiver(this.MediaBrowserCompatCustomActionResultReceiver).IconCompatParcelizer();
            this.write = c0170formatIconCompatParcelizer;
            this.AudioAttributesImplBaseParcelizer.write(c0170formatIconCompatParcelizer);
        }
        this.RatingCompat = remoteActionCompatParcelizerWrite.read;
        this.MediaBrowserCompatSearchResultReceiver = (((long) remoteActionCompatParcelizerWrite.IconCompatParcelizer) * 1000000) / ((long) this.write.onPrepareFromUri);
    }
}
