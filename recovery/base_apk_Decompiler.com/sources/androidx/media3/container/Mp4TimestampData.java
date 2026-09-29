package androidx.media3.container;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import kotlin.setFormatMetadata;

/* JADX INFO: loaded from: classes2.dex */
public final class Mp4TimestampData implements Metadata.Entry {
    public static final Parcelable.Creator<Mp4TimestampData> CREATOR = new Parcelable.Creator<Mp4TimestampData>() { // from class: androidx.media3.container.Mp4TimestampData.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Mp4TimestampData createFromParcel(Parcel parcel) {
            return AudioAttributesCompatParcelizer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Mp4TimestampData[] newArray(int i) {
            return AudioAttributesCompatParcelizer(i);
        }

        private static Mp4TimestampData AudioAttributesCompatParcelizer(Parcel parcel) {
            return new Mp4TimestampData(parcel, (byte) 0);
        }

        private static Mp4TimestampData[] AudioAttributesCompatParcelizer(int i) {
            return new Mp4TimestampData[i];
        }
    };
    public final long AudioAttributesCompatParcelizer;
    public final long IconCompatParcelizer;
    public final long write;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* synthetic */ Mp4TimestampData(Parcel parcel, byte b) {
        this(parcel);
    }

    public Mp4TimestampData(long j, long j2, long j3) {
        this.write = j;
        this.AudioAttributesCompatParcelizer = j2;
        this.IconCompatParcelizer = j3;
    }

    private Mp4TimestampData(Parcel parcel) {
        this.write = parcel.readLong();
        this.AudioAttributesCompatParcelizer = parcel.readLong();
        this.IconCompatParcelizer = parcel.readLong();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Mp4TimestampData)) {
            return false;
        }
        Mp4TimestampData mp4TimestampData = (Mp4TimestampData) obj;
        return this.write == mp4TimestampData.write && this.AudioAttributesCompatParcelizer == mp4TimestampData.AudioAttributesCompatParcelizer && this.IconCompatParcelizer == mp4TimestampData.IconCompatParcelizer;
    }

    public final int hashCode() {
        return ((((setFormatMetadata.AudioAttributesCompatParcelizer(this.write) + 527) * 31) + setFormatMetadata.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer)) * 31) + setFormatMetadata.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Mp4Timestamp: creation time=");
        sb.append(this.write);
        sb.append(", modification time=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", timescale=");
        sb.append(this.IconCompatParcelizer);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.write);
        parcel.writeLong(this.AudioAttributesCompatParcelizer);
        parcel.writeLong(this.IconCompatParcelizer);
    }
}
