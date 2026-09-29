package kotlin;

import com.google.android.exoplayer2.C;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.C0170format;
import kotlin.findClassAnnotations;
import kotlin.removeFirstOccurrence;

/* JADX INFO: loaded from: classes2.dex */
public final class Linked implements checkNotEmpty {
    private String AudioAttributesCompatParcelizer;
    private final AsPropertyTypeDeserializer AudioAttributesImplApi21Parcelizer;
    private final int AudioAttributesImplApi26Parcelizer;
    private nonNullString AudioAttributesImplBaseParcelizer;
    private C0170format IconCompatParcelizer;
    private long MediaBrowserCompatCustomActionResultReceiver;
    private final String MediaBrowserCompatItemReceiver;
    private int MediaBrowserCompatSearchResultReceiver;
    private int MediaDescriptionCompat;
    private int read;
    private int write;
    private int RatingCompat = 0;
    private long MediaMetadataCompat = C.TIME_UNSET;
    private final AtomicInteger MediaBrowserCompatMediaItem = new AtomicInteger();
    private int RemoteActionCompatParcelizer = -1;
    private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = -1;

    @Override // kotlin.checkNotEmpty
    public final void write(boolean z) {
    }

    public Linked(String str, int i, int i2) {
        this.AudioAttributesImplApi21Parcelizer = new AsPropertyTypeDeserializer(new byte[i2]);
        this.MediaBrowserCompatItemReceiver = str;
        this.AudioAttributesImplApi26Parcelizer = i;
    }

    @Override // kotlin.checkNotEmpty
    public final void write() {
        this.RatingCompat = 0;
        this.write = 0;
        this.MediaDescriptionCompat = 0;
        this.MediaMetadataCompat = C.TIME_UNSET;
        this.MediaBrowserCompatMediaItem.set(0);
    }

    @Override // kotlin.checkNotEmpty
    public final void write(findRawSuperTypes findrawsupertypes, removeFirstOccurrence.write writeVar) {
        writeVar.read();
        this.AudioAttributesCompatParcelizer = writeVar.IconCompatParcelizer();
        this.AudioAttributesImplBaseParcelizer = findrawsupertypes.IconCompatParcelizer(writeVar.write(), 1);
    }

    @Override // kotlin.checkNotEmpty
    public final void IconCompatParcelizer(long j, int i) {
        this.MediaMetadataCompat = j;
    }

    @Override // kotlin.checkNotEmpty
    public final void read(AsPropertyTypeDeserializer asPropertyTypeDeserializer) throws SchemaAware {
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.AudioAttributesImplBaseParcelizer);
        while (asPropertyTypeDeserializer.IconCompatParcelizer() > 0) {
            switch (this.RatingCompat) {
                case 0:
                    if (IconCompatParcelizer(asPropertyTypeDeserializer)) {
                        int i = this.read;
                        if (i == 3 || i == 4) {
                            this.RatingCompat = 4;
                        } else if (i == 1) {
                            this.RatingCompat = 1;
                        } else {
                            this.RatingCompat = 2;
                        }
                    }
                    break;
                case 1:
                    if (read(asPropertyTypeDeserializer, this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(), 18)) {
                        read();
                        this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatCustomActionResultReceiver(0);
                        this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, 18);
                        this.RatingCompat = 6;
                    }
                    break;
                case 2:
                    if (read(asPropertyTypeDeserializer, this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(), 7)) {
                        this.RemoteActionCompatParcelizer = findClassAnnotations.write(this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer());
                        this.RatingCompat = 3;
                    }
                    break;
                case 3:
                    if (read(asPropertyTypeDeserializer, this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(), this.RemoteActionCompatParcelizer)) {
                        AudioAttributesCompatParcelizer();
                        this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatCustomActionResultReceiver(0);
                        this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, this.RemoteActionCompatParcelizer);
                        this.RatingCompat = 6;
                    }
                    break;
                case 4:
                    if (read(asPropertyTypeDeserializer, this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(), 6)) {
                        int i2 = findClassAnnotations.read(this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer());
                        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2;
                        int i3 = this.write;
                        if (i3 > i2) {
                            int i4 = i3 - i2;
                            this.write = i3 - i4;
                            asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(asPropertyTypeDeserializer.write() - i4);
                        }
                        this.RatingCompat = 5;
                    }
                    break;
                case 5:
                    if (read(asPropertyTypeDeserializer, this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(), this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver)) {
                        RemoteActionCompatParcelizer();
                        this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatCustomActionResultReceiver(0);
                        this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                        this.RatingCompat = 6;
                    }
                    break;
                case 6:
                    int iMin = Math.min(asPropertyTypeDeserializer.IconCompatParcelizer(), this.MediaBrowserCompatSearchResultReceiver - this.write);
                    this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(asPropertyTypeDeserializer, iMin);
                    int i5 = this.write + iMin;
                    this.write = i5;
                    if (i5 == this.MediaBrowserCompatSearchResultReceiver) {
                        buildTypeSerializer.write(this.MediaMetadataCompat != C.TIME_UNSET);
                        this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(this.MediaMetadataCompat, this.read == 4 ? 0 : 1, this.MediaBrowserCompatSearchResultReceiver, 0, null);
                        this.MediaMetadataCompat += this.MediaBrowserCompatCustomActionResultReceiver;
                        this.RatingCompat = 0;
                    }
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    private boolean read(AsPropertyTypeDeserializer asPropertyTypeDeserializer, byte[] bArr, int i) {
        int iMin = Math.min(asPropertyTypeDeserializer.IconCompatParcelizer(), i - this.write);
        asPropertyTypeDeserializer.write(bArr, this.write, iMin);
        int i2 = this.write + iMin;
        this.write = i2;
        return i2 == i;
    }

    private boolean IconCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        while (asPropertyTypeDeserializer.IconCompatParcelizer() > 0) {
            int i = this.MediaDescriptionCompat << 8;
            this.MediaDescriptionCompat = i;
            int iOnPlayFromMediaId = i | asPropertyTypeDeserializer.onPlayFromMediaId();
            this.MediaDescriptionCompat = iOnPlayFromMediaId;
            int iAudioAttributesCompatParcelizer = findClassAnnotations.AudioAttributesCompatParcelizer(iOnPlayFromMediaId);
            this.read = iAudioAttributesCompatParcelizer;
            if (iAudioAttributesCompatParcelizer != 0) {
                byte[] bArrRemoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer();
                int i2 = this.MediaDescriptionCompat;
                bArrRemoteActionCompatParcelizer[0] = (byte) (i2 >>> 24);
                bArrRemoteActionCompatParcelizer[1] = (byte) (i2 >> 16);
                bArrRemoteActionCompatParcelizer[2] = (byte) (i2 >> 8);
                bArrRemoteActionCompatParcelizer[3] = (byte) i2;
                this.write = 4;
                this.MediaDescriptionCompat = 0;
                return true;
            }
        }
        return false;
    }

    private void read() {
        byte[] bArrRemoteActionCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer();
        if (this.IconCompatParcelizer == null) {
            C0170format c0170formatIconCompatParcelizer = findClassAnnotations.IconCompatParcelizer(bArrRemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.MediaBrowserCompatItemReceiver, this.AudioAttributesImplApi26Parcelizer);
            this.IconCompatParcelizer = c0170formatIconCompatParcelizer;
            this.AudioAttributesImplBaseParcelizer.write(c0170formatIconCompatParcelizer);
        }
        this.MediaBrowserCompatSearchResultReceiver = findClassAnnotations.AudioAttributesCompatParcelizer(bArrRemoteActionCompatParcelizer);
        this.MediaBrowserCompatCustomActionResultReceiver = parseTextAttribute.RemoteActionCompatParcelizer(LaissezFaireSubTypeValidator.IconCompatParcelizer(findClassAnnotations.RemoteActionCompatParcelizer(bArrRemoteActionCompatParcelizer), this.IconCompatParcelizer.onPrepareFromUri));
    }

    private void AudioAttributesCompatParcelizer() throws SchemaAware {
        findClassAnnotations.IconCompatParcelizer IconCompatParcelizer = findClassAnnotations.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer());
        write(IconCompatParcelizer);
        this.MediaBrowserCompatSearchResultReceiver = IconCompatParcelizer.write;
        this.MediaBrowserCompatCustomActionResultReceiver = IconCompatParcelizer.read == C.TIME_UNSET ? 0L : IconCompatParcelizer.read;
    }

    private void RemoteActionCompatParcelizer() throws SchemaAware {
        findClassAnnotations.IconCompatParcelizer iconCompatParcelizerWrite = findClassAnnotations.write(this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(), this.MediaBrowserCompatMediaItem);
        if (this.read == 3) {
            write(iconCompatParcelizerWrite);
        }
        this.MediaBrowserCompatSearchResultReceiver = iconCompatParcelizerWrite.write;
        this.MediaBrowserCompatCustomActionResultReceiver = iconCompatParcelizerWrite.read == C.TIME_UNSET ? 0L : iconCompatParcelizerWrite.read;
    }

    private void write(findClassAnnotations.IconCompatParcelizer iconCompatParcelizer) {
        if (iconCompatParcelizer.MediaBrowserCompatItemReceiver == -2147483647 || iconCompatParcelizer.AudioAttributesCompatParcelizer == -1) {
            return;
        }
        if (this.IconCompatParcelizer != null && iconCompatParcelizer.AudioAttributesCompatParcelizer == this.IconCompatParcelizer.AudioAttributesCompatParcelizer && iconCompatParcelizer.MediaBrowserCompatItemReceiver == this.IconCompatParcelizer.onPrepareFromUri && LaissezFaireSubTypeValidator.read(iconCompatParcelizer.IconCompatParcelizer, this.IconCompatParcelizer.onPlayFromUri)) {
            return;
        }
        C0170format c0170format = this.IconCompatParcelizer;
        C0170format c0170formatIconCompatParcelizer = (c0170format == null ? new C0170format.RemoteActionCompatParcelizer() : c0170format.write()).AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer).AudioAttributesImplApi26Parcelizer(iconCompatParcelizer.IconCompatParcelizer).read(iconCompatParcelizer.AudioAttributesCompatParcelizer).MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(iconCompatParcelizer.MediaBrowserCompatItemReceiver).read(this.MediaBrowserCompatItemReceiver).MediaBrowserCompatSearchResultReceiver(this.AudioAttributesImplApi26Parcelizer).IconCompatParcelizer();
        this.IconCompatParcelizer = c0170formatIconCompatParcelizer;
        this.AudioAttributesImplBaseParcelizer.write(c0170formatIconCompatParcelizer);
    }
}
