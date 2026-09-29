package androidx.media3.extractor.metadata.scte35;

import androidx.media3.common.Metadata;

/* JADX INFO: loaded from: classes2.dex */
public abstract class SpliceCommand implements Metadata.Entry {
    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 splice command: type=");
        sb.append(getClass().getSimpleName());
        return sb.toString();
    }
}
