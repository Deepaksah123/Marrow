package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new Parcelable.Creator<BackStackState>() { // from class: androidx.fragment.app.BackStackState.4
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BackStackState createFromParcel(Parcel parcel) {
            return IconCompatParcelizer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BackStackState[] newArray(int i) {
            return write(i);
        }

        private static BackStackState IconCompatParcelizer(Parcel parcel) {
            return new BackStackState(parcel);
        }

        private static BackStackState[] write(int i) {
            return new BackStackState[i];
        }
    };
    final List<String> AudioAttributesCompatParcelizer;
    final List<BackStackRecordState> RemoteActionCompatParcelizer;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    BackStackState(Parcel parcel) {
        this.AudioAttributesCompatParcelizer = parcel.createStringArrayList();
        this.RemoteActionCompatParcelizer = parcel.createTypedArrayList(BackStackRecordState.CREATOR);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.AudioAttributesCompatParcelizer);
        parcel.writeTypedList(this.RemoteActionCompatParcelizer);
    }
}
