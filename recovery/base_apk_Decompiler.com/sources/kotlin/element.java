package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import kotlin.C0170format;
import kotlin.removeFirstOccurrence;

/* JADX INFO: loaded from: classes2.dex */
public final class element implements checkNotEmpty {
    private int AudioAttributesCompatParcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private final AsPropertyTypeDeserializer IconCompatParcelizer = new AsPropertyTypeDeserializer(10);
    private long RemoteActionCompatParcelizer = C.TIME_UNSET;
    private nonNullString read;
    private int write;

    @Override // kotlin.checkNotEmpty
    public final void write() {
        this.AudioAttributesImplBaseParcelizer = false;
        this.RemoteActionCompatParcelizer = C.TIME_UNSET;
    }

    @Override // kotlin.checkNotEmpty
    public final void write(findRawSuperTypes findrawsupertypes, removeFirstOccurrence.write writeVar) {
        writeVar.read();
        nonNullString nonnullstringIconCompatParcelizer = findrawsupertypes.IconCompatParcelizer(writeVar.write(), 5);
        this.read = nonnullstringIconCompatParcelizer;
        nonnullstringIconCompatParcelizer.write(new C0170format.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(writeVar.IconCompatParcelizer()).AudioAttributesImplApi26Parcelizer(MimeTypes.APPLICATION_ID3).IconCompatParcelizer());
    }

    @Override // kotlin.checkNotEmpty
    public final void IconCompatParcelizer(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.AudioAttributesImplBaseParcelizer = true;
        this.RemoteActionCompatParcelizer = j;
        this.AudioAttributesCompatParcelizer = 0;
        this.write = 0;
    }

    @Override // kotlin.checkNotEmpty
    public final void read(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.read);
        if (this.AudioAttributesImplBaseParcelizer) {
            int iIconCompatParcelizer = asPropertyTypeDeserializer.IconCompatParcelizer();
            int i = this.write;
            if (i < 10) {
                int iMin = Math.min(iIconCompatParcelizer, 10 - i);
                System.arraycopy(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), asPropertyTypeDeserializer.write(), this.IconCompatParcelizer.RemoteActionCompatParcelizer(), this.write, iMin);
                if (this.write + iMin == 10) {
                    this.IconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver(0);
                    if (73 != this.IconCompatParcelizer.onPlayFromMediaId() || 68 != this.IconCompatParcelizer.onPlayFromMediaId() || 51 != this.IconCompatParcelizer.onPlayFromMediaId()) {
                        prune.RemoteActionCompatParcelizer("Id3Reader", "Discarding invalid ID3 tag");
                        this.AudioAttributesImplBaseParcelizer = false;
                        return;
                    } else {
                        this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer(3);
                        this.AudioAttributesCompatParcelizer = this.IconCompatParcelizer.onPlay() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iIconCompatParcelizer, this.AudioAttributesCompatParcelizer - this.write);
            this.read.RemoteActionCompatParcelizer(asPropertyTypeDeserializer, iMin2);
            this.write += iMin2;
        }
    }

    @Override // kotlin.checkNotEmpty
    public final void write(boolean z) {
        int i;
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.read);
        if (this.AudioAttributesImplBaseParcelizer && (i = this.AudioAttributesCompatParcelizer) != 0 && this.write == i) {
            buildTypeSerializer.write(this.RemoteActionCompatParcelizer != C.TIME_UNSET);
            this.read.IconCompatParcelizer(this.RemoteActionCompatParcelizer, 1, this.AudioAttributesCompatParcelizer, 0, null);
            this.AudioAttributesImplBaseParcelizer = false;
        }
    }
}
