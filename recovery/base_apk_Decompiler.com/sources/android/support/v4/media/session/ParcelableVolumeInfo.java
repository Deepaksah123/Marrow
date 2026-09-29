package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new Parcelable.Creator<ParcelableVolumeInfo>() { // from class: android.support.v4.media.session.ParcelableVolumeInfo.5
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return IconCompatParcelizer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ParcelableVolumeInfo[] newArray(int i) {
            return write(i);
        }

        private static ParcelableVolumeInfo IconCompatParcelizer(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        private static ParcelableVolumeInfo[] write(int i) {
            return new ParcelableVolumeInfo[i];
        }
    };
    public int AudioAttributesCompatParcelizer;
    public int IconCompatParcelizer;
    public int RemoteActionCompatParcelizer;
    public int read;
    public int write;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.AudioAttributesCompatParcelizer = parcel.readInt();
        this.IconCompatParcelizer = parcel.readInt();
        this.read = parcel.readInt();
        this.RemoteActionCompatParcelizer = parcel.readInt();
        this.write = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.AudioAttributesCompatParcelizer);
        parcel.writeInt(this.IconCompatParcelizer);
        parcel.writeInt(this.read);
        parcel.writeInt(this.RemoteActionCompatParcelizer);
        parcel.writeInt(this.write);
    }
}
