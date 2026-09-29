package kotlin;

import com.google.android.exoplayer2.C;
import kotlin.C0170format;
import kotlin.getTypeDescription;
import kotlin.removeFirstOccurrence;

/* JADX INFO: loaded from: classes2.dex */
public final class getLast implements checkNotEmpty {
    private String AudioAttributesCompatParcelizer;
    private final AsPropertyTypeDeserializer AudioAttributesImplApi21Parcelizer;
    private boolean AudioAttributesImplApi26Parcelizer;
    private final String AudioAttributesImplBaseParcelizer;
    private int IconCompatParcelizer;
    private nonNullString MediaBrowserCompatCustomActionResultReceiver;
    private final getTypeDescription.RemoteActionCompatParcelizer MediaBrowserCompatItemReceiver;
    private int MediaBrowserCompatSearchResultReceiver;
    private long MediaDescriptionCompat;
    private final int MediaMetadataCompat;
    private long RemoteActionCompatParcelizer;
    private boolean read;
    private int write;

    @Override // kotlin.checkNotEmpty
    public final void write(boolean z) {
    }

    public getLast() {
        this(null, 0);
    }

    public getLast(String str, int i) {
        this.MediaBrowserCompatSearchResultReceiver = 0;
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(4);
        this.AudioAttributesImplApi21Parcelizer = asPropertyTypeDeserializer;
        asPropertyTypeDeserializer.RemoteActionCompatParcelizer()[0] = -1;
        this.MediaBrowserCompatItemReceiver = new getTypeDescription.RemoteActionCompatParcelizer();
        this.MediaDescriptionCompat = C.TIME_UNSET;
        this.AudioAttributesImplBaseParcelizer = str;
        this.MediaMetadataCompat = i;
    }

    @Override // kotlin.checkNotEmpty
    public final void write() {
        this.MediaBrowserCompatSearchResultReceiver = 0;
        this.write = 0;
        this.AudioAttributesImplApi26Parcelizer = false;
        this.MediaDescriptionCompat = C.TIME_UNSET;
    }

    @Override // kotlin.checkNotEmpty
    public final void write(findRawSuperTypes findrawsupertypes, removeFirstOccurrence.write writeVar) {
        writeVar.read();
        this.AudioAttributesCompatParcelizer = writeVar.IconCompatParcelizer();
        this.MediaBrowserCompatCustomActionResultReceiver = findrawsupertypes.IconCompatParcelizer(writeVar.write(), 1);
    }

    @Override // kotlin.checkNotEmpty
    public final void IconCompatParcelizer(long j, int i) {
        this.MediaDescriptionCompat = j;
    }

    @Override // kotlin.checkNotEmpty
    public final void read(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
        while (asPropertyTypeDeserializer.IconCompatParcelizer() > 0) {
            int i = this.MediaBrowserCompatSearchResultReceiver;
            if (i == 0) {
                AudioAttributesCompatParcelizer(asPropertyTypeDeserializer);
            } else if (i == 1) {
                RemoteActionCompatParcelizer(asPropertyTypeDeserializer);
            } else if (i == 2) {
                IconCompatParcelizer(asPropertyTypeDeserializer);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    private void AudioAttributesCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        byte[] bArrRemoteActionCompatParcelizer = asPropertyTypeDeserializer.RemoteActionCompatParcelizer();
        int i = asPropertyTypeDeserializer.read();
        for (int iWrite = asPropertyTypeDeserializer.write(); iWrite < i; iWrite++) {
            byte b = bArrRemoteActionCompatParcelizer[iWrite];
            boolean z = (b & 255) == 255;
            boolean z2 = this.AudioAttributesImplApi26Parcelizer && (b & 224) == 224;
            this.AudioAttributesImplApi26Parcelizer = z;
            if (z2) {
                asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iWrite + 1);
                this.AudioAttributesImplApi26Parcelizer = false;
                this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer()[1] = bArrRemoteActionCompatParcelizer[iWrite];
                this.write = 2;
                this.MediaBrowserCompatSearchResultReceiver = 1;
                return;
            }
        }
        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(i);
    }

    private void RemoteActionCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        int iMin = Math.min(asPropertyTypeDeserializer.IconCompatParcelizer(), 4 - this.write);
        asPropertyTypeDeserializer.write(this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(), this.write, iMin);
        int i = this.write + iMin;
        this.write = i;
        if (i < 4) {
            return;
        }
        this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatCustomActionResultReceiver(0);
        if (!this.MediaBrowserCompatItemReceiver.write(this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatItemReceiver())) {
            this.write = 0;
            this.MediaBrowserCompatSearchResultReceiver = 1;
            return;
        }
        this.IconCompatParcelizer = this.MediaBrowserCompatItemReceiver.read;
        if (!this.read) {
            this.RemoteActionCompatParcelizer = (((long) this.MediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer) * 1000000) / ((long) this.MediaBrowserCompatItemReceiver.write);
            this.MediaBrowserCompatCustomActionResultReceiver.write(new C0170format.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer).AudioAttributesImplApi26Parcelizer(this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer).AudioAttributesImplApi26Parcelizer(4096).read(this.MediaBrowserCompatItemReceiver.IconCompatParcelizer).MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(this.MediaBrowserCompatItemReceiver.write).read(this.AudioAttributesImplBaseParcelizer).MediaBrowserCompatSearchResultReceiver(this.MediaMetadataCompat).IconCompatParcelizer());
            this.read = true;
        }
        this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatCustomActionResultReceiver(0);
        this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, 4);
        this.MediaBrowserCompatSearchResultReceiver = 2;
    }

    private void IconCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        int iMin = Math.min(asPropertyTypeDeserializer.IconCompatParcelizer(), this.IconCompatParcelizer - this.write);
        this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(asPropertyTypeDeserializer, iMin);
        int i = this.write + iMin;
        this.write = i;
        if (i < this.IconCompatParcelizer) {
            return;
        }
        buildTypeSerializer.write(this.MediaDescriptionCompat != C.TIME_UNSET);
        this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(this.MediaDescriptionCompat, 1, this.IconCompatParcelizer, 0, null);
        this.MediaDescriptionCompat += this.RemoteActionCompatParcelizer;
        this.write = 0;
        this.MediaBrowserCompatSearchResultReceiver = 0;
    }
}
