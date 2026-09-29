package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.Collections;
import java.util.List;
import kotlin.C0170format;
import kotlin.removeFirstOccurrence;

/* JADX INFO: loaded from: classes2.dex */
public final class LinkedDeque implements checkNotEmpty {
    private final List<removeFirstOccurrence.RemoteActionCompatParcelizer> AudioAttributesCompatParcelizer;
    private boolean AudioAttributesImplApi26Parcelizer;
    private long IconCompatParcelizer = C.TIME_UNSET;
    private final nonNullString[] RemoteActionCompatParcelizer;
    private int read;
    private int write;

    public LinkedDeque(List<removeFirstOccurrence.RemoteActionCompatParcelizer> list) {
        this.AudioAttributesCompatParcelizer = list;
        this.RemoteActionCompatParcelizer = new nonNullString[list.size()];
    }

    @Override // kotlin.checkNotEmpty
    public final void write() {
        this.AudioAttributesImplApi26Parcelizer = false;
        this.IconCompatParcelizer = C.TIME_UNSET;
    }

    @Override // kotlin.checkNotEmpty
    public final void write(findRawSuperTypes findrawsupertypes, removeFirstOccurrence.write writeVar) {
        for (int i = 0; i < this.RemoteActionCompatParcelizer.length; i++) {
            removeFirstOccurrence.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.AudioAttributesCompatParcelizer.get(i);
            writeVar.read();
            nonNullString nonnullstringIconCompatParcelizer = findrawsupertypes.IconCompatParcelizer(writeVar.write(), 3);
            nonnullstringIconCompatParcelizer.write(new C0170format.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(writeVar.IconCompatParcelizer()).AudioAttributesImplApi26Parcelizer(MimeTypes.APPLICATION_DVBSUBS).RemoteActionCompatParcelizer(Collections.singletonList(remoteActionCompatParcelizer.AudioAttributesCompatParcelizer)).read(remoteActionCompatParcelizer.write).IconCompatParcelizer());
            this.RemoteActionCompatParcelizer[i] = nonnullstringIconCompatParcelizer;
        }
    }

    @Override // kotlin.checkNotEmpty
    public final void IconCompatParcelizer(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.AudioAttributesImplApi26Parcelizer = true;
        this.IconCompatParcelizer = j;
        this.read = 0;
        this.write = 2;
    }

    @Override // kotlin.checkNotEmpty
    public final void write(boolean z) {
        if (this.AudioAttributesImplApi26Parcelizer) {
            buildTypeSerializer.write(this.IconCompatParcelizer != C.TIME_UNSET);
            for (nonNullString nonnullstring : this.RemoteActionCompatParcelizer) {
                nonnullstring.IconCompatParcelizer(this.IconCompatParcelizer, 1, this.read, 0, null);
            }
            this.AudioAttributesImplApi26Parcelizer = false;
        }
    }

    @Override // kotlin.checkNotEmpty
    public final void read(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        if (this.AudioAttributesImplApi26Parcelizer) {
            if (this.write != 2 || write(asPropertyTypeDeserializer, 32)) {
                if (this.write != 1 || write(asPropertyTypeDeserializer, 0)) {
                    int iWrite = asPropertyTypeDeserializer.write();
                    int iIconCompatParcelizer = asPropertyTypeDeserializer.IconCompatParcelizer();
                    for (nonNullString nonnullstring : this.RemoteActionCompatParcelizer) {
                        asPropertyTypeDeserializer.MediaBrowserCompatCustomActionResultReceiver(iWrite);
                        nonnullstring.RemoteActionCompatParcelizer(asPropertyTypeDeserializer, iIconCompatParcelizer);
                    }
                    this.read += iIconCompatParcelizer;
                }
            }
        }
    }

    private boolean write(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i) {
        if (asPropertyTypeDeserializer.IconCompatParcelizer() == 0) {
            return false;
        }
        if (asPropertyTypeDeserializer.onPlayFromMediaId() != i) {
            this.AudioAttributesImplApi26Parcelizer = false;
        }
        this.write--;
        return this.AudioAttributesImplApi26Parcelizer;
    }
}
