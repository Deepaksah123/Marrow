package androidx.media3.container;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import kotlin.buildTypeSerializer;
import kotlin.parseMdtaMetadataEntryFromIlst;

/* JADX INFO: loaded from: classes2.dex */
public final class Mp4LocationData implements Metadata.Entry {
    public static final Parcelable.Creator<Mp4LocationData> CREATOR = new Parcelable.Creator<Mp4LocationData>() { // from class: androidx.media3.container.Mp4LocationData.4
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Mp4LocationData createFromParcel(Parcel parcel) {
            return read(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Mp4LocationData[] newArray(int i) {
            return IconCompatParcelizer(i);
        }

        private static Mp4LocationData read(Parcel parcel) {
            return new Mp4LocationData(parcel, (byte) 0);
        }

        private static Mp4LocationData[] IconCompatParcelizer(int i) {
            return new Mp4LocationData[i];
        }
    };
    public final float RemoteActionCompatParcelizer;
    public final float read;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* synthetic */ Mp4LocationData(Parcel parcel, byte b) {
        this(parcel);
    }

    public Mp4LocationData(float f, float f2) {
        buildTypeSerializer.write(f >= -90.0f && f <= 90.0f && f2 >= -180.0f && f2 <= 180.0f, "Invalid latitude or longitude");
        this.RemoteActionCompatParcelizer = f;
        this.read = f2;
    }

    private Mp4LocationData(Parcel parcel) {
        this.RemoteActionCompatParcelizer = parcel.readFloat();
        this.read = parcel.readFloat();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Mp4LocationData mp4LocationData = (Mp4LocationData) obj;
        return this.RemoteActionCompatParcelizer == mp4LocationData.RemoteActionCompatParcelizer && this.read == mp4LocationData.read;
    }

    public final int hashCode() {
        return ((parseMdtaMetadataEntryFromIlst.read(this.RemoteActionCompatParcelizer) + 527) * 31) + parseMdtaMetadataEntryFromIlst.read(this.read);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("xyz: latitude=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", longitude=");
        sb.append(this.read);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.RemoteActionCompatParcelizer);
        parcel.writeFloat(this.read);
    }
}
