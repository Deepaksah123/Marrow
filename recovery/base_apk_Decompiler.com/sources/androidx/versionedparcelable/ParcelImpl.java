package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.getApplicationBanner;
import kotlin.getApplicationInfo;

/* JADX INFO: loaded from: classes2.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new Parcelable.Creator<ParcelImpl>() { // from class: androidx.versionedparcelable.ParcelImpl.4
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ParcelImpl createFromParcel(Parcel parcel) {
            return AudioAttributesCompatParcelizer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ParcelImpl[] newArray(int i) {
            return write(i);
        }

        private static ParcelImpl AudioAttributesCompatParcelizer(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        private static ParcelImpl[] write(int i) {
            return new ParcelImpl[i];
        }
    };
    private final getApplicationInfo RemoteActionCompatParcelizer;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ParcelImpl(getApplicationInfo getapplicationinfo) {
        this.RemoteActionCompatParcelizer = getapplicationinfo;
    }

    protected ParcelImpl(Parcel parcel) {
        this.RemoteActionCompatParcelizer = new getApplicationBanner(parcel).MediaBrowserCompatCustomActionResultReceiver();
    }

    public final <T extends getApplicationInfo> T AudioAttributesCompatParcelizer() {
        return (T) this.RemoteActionCompatParcelizer;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        new getApplicationBanner(parcel).AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
    }
}
