package kotlin;

import com.google.android.exoplayer2.C;
import java.io.EOFException;
import java.io.IOException;
import kotlin.isCollectionMapOrArray;
import kotlin.removeFirstOccurrence;

/* JADX INFO: loaded from: classes2.dex */
public final class getPrevious implements findConstructor {
    private long AudioAttributesCompatParcelizer;
    private final AsPropertyTypeDeserializer AudioAttributesImplApi21Parcelizer;
    private final AsPropertyTypeDeserializer AudioAttributesImplApi26Parcelizer;
    private final setNext AudioAttributesImplBaseParcelizer;
    private findRawSuperTypes IconCompatParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private boolean MediaBrowserCompatItemReceiver;
    private final AsExternalTypeSerializer MediaBrowserCompatSearchResultReceiver;
    private boolean RatingCompat;
    private int RemoteActionCompatParcelizer;
    private final int read;
    private long write;

    @Override // kotlin.findConstructor
    public final void RemoteActionCompatParcelizer() {
    }

    static {
        new getClassDescription() { // from class: o.getNext
            @Override // kotlin.getClassDescription
            public final findConstructor[] RemoteActionCompatParcelizer() {
                return getPrevious.IconCompatParcelizer();
            }
        };
    }

    static /* synthetic */ findConstructor[] IconCompatParcelizer() {
        return new findConstructor[]{new getPrevious()};
    }

    public getPrevious() {
        this(0);
    }

    public getPrevious(int i) {
        this.read = 0;
        this.AudioAttributesImplBaseParcelizer = new setNext();
        this.AudioAttributesImplApi21Parcelizer = new AsPropertyTypeDeserializer(2048);
        this.RemoteActionCompatParcelizer = -1;
        this.write = -1L;
        AsPropertyTypeDeserializer asPropertyTypeDeserializer = new AsPropertyTypeDeserializer(10);
        this.AudioAttributesImplApi26Parcelizer = asPropertyTypeDeserializer;
        this.MediaBrowserCompatSearchResultReceiver = new AsExternalTypeSerializer(asPropertyTypeDeserializer.RemoteActionCompatParcelizer());
    }

    @Override // kotlin.findConstructor
    public final boolean read(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        int iIconCompatParcelizer = IconCompatParcelizer(closeonfailandthrowasioe);
        int i = iIconCompatParcelizer;
        int i2 = 0;
        int i3 = 0;
        do {
            closeonfailandthrowasioe.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(), 0, 2);
            this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver(0);
            if (setNext.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.onPrepare())) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                closeonfailandthrowasioe.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(), 0, 4);
                this.MediaBrowserCompatSearchResultReceiver.read(14);
                int iIconCompatParcelizer2 = this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(13);
                if (iIconCompatParcelizer2 <= 6) {
                    i++;
                    closeonfailandthrowasioe.RemoteActionCompatParcelizer();
                    closeonfailandthrowasioe.write(i);
                } else {
                    closeonfailandthrowasioe.write(iIconCompatParcelizer2 - 6);
                    i3 += iIconCompatParcelizer2;
                }
            } else {
                i++;
                closeonfailandthrowasioe.RemoteActionCompatParcelizer();
                closeonfailandthrowasioe.write(i);
            }
            i2 = 0;
            i3 = 0;
        } while (i - iIconCompatParcelizer < 8192);
        return false;
    }

    @Override // kotlin.findConstructor
    public final void read(findRawSuperTypes findrawsupertypes) {
        this.IconCompatParcelizer = findrawsupertypes;
        this.AudioAttributesImplBaseParcelizer.write(findrawsupertypes, new removeFirstOccurrence.write(0, 1));
        findrawsupertypes.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.findConstructor
    public final void write(long j, long j2) {
        this.RatingCompat = false;
        this.AudioAttributesImplBaseParcelizer.write();
        this.AudioAttributesCompatParcelizer = j2;
    }

    @Override // kotlin.findConstructor
    public final int RemoteActionCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe, isJacksonStdImpl isjacksonstdimpl) throws IOException {
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
        long j = closeonfailandthrowasioe.read();
        int i = this.read;
        if ((i & 2) != 0 || ((i & 1) != 0 && j != -1)) {
            write(closeonfailandthrowasioe);
        }
        int iAudioAttributesCompatParcelizer = closeonfailandthrowasioe.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(), 0, 2048);
        boolean z = iAudioAttributesCompatParcelizer == -1;
        IconCompatParcelizer(j, z);
        if (z) {
            return -1;
        }
        this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatCustomActionResultReceiver(0);
        this.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(iAudioAttributesCompatParcelizer);
        if (!this.RatingCompat) {
            this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, 4);
            this.RatingCompat = true;
        }
        this.AudioAttributesImplBaseParcelizer.read(this.AudioAttributesImplApi21Parcelizer);
        return 0;
    }

    private int IconCompatParcelizer(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        int i = 0;
        while (true) {
            closeonfailandthrowasioe.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(), 0, 10);
            this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver(0);
            if (this.AudioAttributesImplApi26Parcelizer.onPause() != 4801587) {
                break;
            }
            this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplBaseParcelizer(3);
            int iOnPlay = this.AudioAttributesImplApi26Parcelizer.onPlay();
            i += iOnPlay + 10;
            closeonfailandthrowasioe.write(iOnPlay);
        }
        closeonfailandthrowasioe.RemoteActionCompatParcelizer();
        closeonfailandthrowasioe.write(i);
        if (this.write == -1) {
            this.write = i;
        }
        return i;
    }

    private void IconCompatParcelizer(long j, boolean z) {
        if (this.MediaBrowserCompatCustomActionResultReceiver) {
            return;
        }
        boolean z2 = (this.read & 1) != 0 && this.RemoteActionCompatParcelizer > 0;
        if (z2 && this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer() == C.TIME_UNSET && !z) {
            return;
        }
        if (z2 && this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer() != C.TIME_UNSET) {
            this.IconCompatParcelizer.read(RemoteActionCompatParcelizer(j, (this.read & 2) != 0));
        } else {
            this.IconCompatParcelizer.read(new isCollectionMapOrArray.write(C.TIME_UNSET));
        }
        this.MediaBrowserCompatCustomActionResultReceiver = true;
    }

    private void write(closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException {
        int iIconCompatParcelizer;
        if (this.MediaBrowserCompatItemReceiver) {
            return;
        }
        this.RemoteActionCompatParcelizer = -1;
        closeonfailandthrowasioe.RemoteActionCompatParcelizer();
        long j = 0;
        if (closeonfailandthrowasioe.IconCompatParcelizer() == 0) {
            IconCompatParcelizer(closeonfailandthrowasioe);
        }
        int i = 0;
        int i2 = 0;
        do {
            try {
                if (!closeonfailandthrowasioe.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(), 0, 2, true)) {
                    break;
                }
                this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatCustomActionResultReceiver(0);
                if (!setNext.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.onPrepare())) {
                    break;
                }
                if (!closeonfailandthrowasioe.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(), 0, 4, true)) {
                    break;
                }
                this.MediaBrowserCompatSearchResultReceiver.read(14);
                iIconCompatParcelizer = this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(13);
                if (iIconCompatParcelizer <= 6) {
                    this.MediaBrowserCompatItemReceiver = true;
                    throw SchemaAware.RemoteActionCompatParcelizer("Malformed ADTS stream", null);
                }
                j += (long) iIconCompatParcelizer;
                i2++;
                if (i2 == 1000) {
                    break;
                }
            } catch (EOFException unused) {
            }
        } while (closeonfailandthrowasioe.write(iIconCompatParcelizer - 6, true));
        i = i2;
        closeonfailandthrowasioe.RemoteActionCompatParcelizer();
        if (i > 0) {
            this.RemoteActionCompatParcelizer = (int) (j / ((long) i));
        } else {
            this.RemoteActionCompatParcelizer = -1;
        }
        this.MediaBrowserCompatItemReceiver = true;
    }

    private isCollectionMapOrArray RemoteActionCompatParcelizer(long j, boolean z) {
        return new backticked(j, this.write, write(this.RemoteActionCompatParcelizer, this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer()), this.RemoteActionCompatParcelizer, z);
    }

    private static int write(int i, long j) {
        return (int) ((((long) i) * 8000000) / j);
    }
}
