package com.google.android.exoplayer2.metadata.scte35;

import com.google.android.exoplayer2.metadata.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
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
