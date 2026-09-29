package androidx.media3.extractor.metadata.id3;

import androidx.media3.common.Metadata;

/* JADX INFO: loaded from: classes2.dex */
public abstract class Id3Frame implements Metadata.Entry {
    public final String MediaBrowserCompatItemReceiver;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Id3Frame(String str) {
        this.MediaBrowserCompatItemReceiver = str;
    }

    public String toString() {
        return this.MediaBrowserCompatItemReceiver;
    }
}
