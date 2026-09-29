package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.FragmentManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new Parcelable.Creator<FragmentManagerState>() { // from class: androidx.fragment.app.FragmentManagerState.3
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FragmentManagerState createFromParcel(Parcel parcel) {
            return AudioAttributesCompatParcelizer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ FragmentManagerState[] newArray(int i) {
            return RemoteActionCompatParcelizer(i);
        }

        private static FragmentManagerState AudioAttributesCompatParcelizer(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        private static FragmentManagerState[] RemoteActionCompatParcelizer(int i) {
            return new FragmentManagerState[i];
        }
    };
    ArrayList<String> AudioAttributesCompatParcelizer;
    ArrayList<FragmentManager.LaunchedFragmentInfo> AudioAttributesImplApi21Parcelizer;
    String AudioAttributesImplApi26Parcelizer;
    ArrayList<String> IconCompatParcelizer;
    ArrayList<BackStackState> MediaBrowserCompatCustomActionResultReceiver;
    ArrayList<String> RemoteActionCompatParcelizer;
    BackStackRecordState[] read;
    int write;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public FragmentManagerState() {
        this.AudioAttributesImplApi26Parcelizer = null;
        this.IconCompatParcelizer = new ArrayList<>();
        this.MediaBrowserCompatCustomActionResultReceiver = new ArrayList<>();
    }

    public FragmentManagerState(Parcel parcel) {
        this.AudioAttributesImplApi26Parcelizer = null;
        this.IconCompatParcelizer = new ArrayList<>();
        this.MediaBrowserCompatCustomActionResultReceiver = new ArrayList<>();
        this.RemoteActionCompatParcelizer = parcel.createStringArrayList();
        this.AudioAttributesCompatParcelizer = parcel.createStringArrayList();
        this.read = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
        this.write = parcel.readInt();
        this.AudioAttributesImplApi26Parcelizer = parcel.readString();
        this.IconCompatParcelizer = parcel.createStringArrayList();
        this.MediaBrowserCompatCustomActionResultReceiver = parcel.createTypedArrayList(BackStackState.CREATOR);
        this.AudioAttributesImplApi21Parcelizer = parcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.RemoteActionCompatParcelizer);
        parcel.writeStringList(this.AudioAttributesCompatParcelizer);
        parcel.writeTypedArray(this.read, i);
        parcel.writeInt(this.write);
        parcel.writeString(this.AudioAttributesImplApi26Parcelizer);
        parcel.writeStringList(this.IconCompatParcelizer);
        parcel.writeTypedList(this.MediaBrowserCompatCustomActionResultReceiver);
        parcel.writeTypedList(this.AudioAttributesImplApi21Parcelizer);
    }
}
