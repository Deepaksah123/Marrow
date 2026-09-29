package com.google.android.exoplayer2.offline;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class StreamKey implements Comparable<StreamKey>, Parcelable, Bundleable {
    public final int groupIndex;
    public final int periodIndex;
    public final int streamIndex;
    public static final Parcelable.Creator<StreamKey> CREATOR = new Parcelable.Creator<StreamKey>() { // from class: com.google.android.exoplayer2.offline.StreamKey.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StreamKey createFromParcel(Parcel parcel) {
            return new StreamKey(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public StreamKey[] newArray(int i) {
            return new StreamKey[i];
        }
    };
    private static final String FIELD_PERIOD_INDEX = Util.intToStringMaxRadix(0);
    private static final String FIELD_GROUP_INDEX = Util.intToStringMaxRadix(1);
    private static final String FIELD_STREAM_INDEX = Util.intToStringMaxRadix(2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public StreamKey(int i, int i2) {
        this(0, i, i2);
    }

    public StreamKey(int i, int i2, int i3) {
        this.periodIndex = i;
        this.groupIndex = i2;
        this.streamIndex = i3;
    }

    StreamKey(Parcel parcel) {
        this.periodIndex = parcel.readInt();
        this.groupIndex = parcel.readInt();
        this.streamIndex = parcel.readInt();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.periodIndex);
        sb.append(".");
        sb.append(this.groupIndex);
        sb.append(".");
        sb.append(this.streamIndex);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StreamKey streamKey = (StreamKey) obj;
        return this.periodIndex == streamKey.periodIndex && this.groupIndex == streamKey.groupIndex && this.streamIndex == streamKey.streamIndex;
    }

    public final int hashCode() {
        return (((this.periodIndex * 31) + this.groupIndex) * 31) + this.streamIndex;
    }

    @Override // java.lang.Comparable
    public final int compareTo(StreamKey streamKey) {
        int i = this.periodIndex - streamKey.periodIndex;
        return (i == 0 && (i = this.groupIndex - streamKey.groupIndex) == 0) ? this.streamIndex - streamKey.streamIndex : i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.periodIndex);
        parcel.writeInt(this.groupIndex);
        parcel.writeInt(this.streamIndex);
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public final Bundle toBundle() {
        Bundle bundle = new Bundle();
        int i = this.periodIndex;
        if (i != 0) {
            bundle.putInt(FIELD_PERIOD_INDEX, i);
        }
        int i2 = this.groupIndex;
        if (i2 != 0) {
            bundle.putInt(FIELD_GROUP_INDEX, i2);
        }
        int i3 = this.streamIndex;
        if (i3 != 0) {
            bundle.putInt(FIELD_STREAM_INDEX, i3);
        }
        return bundle;
    }

    public static StreamKey fromBundle(Bundle bundle) {
        return new StreamKey(bundle.getInt(FIELD_PERIOD_INDEX, 0), bundle.getInt(FIELD_GROUP_INDEX, 0), bundle.getInt(FIELD_STREAM_INDEX, 0));
    }
}
