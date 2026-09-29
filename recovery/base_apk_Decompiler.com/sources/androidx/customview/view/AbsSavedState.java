package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AbsSavedState implements Parcelable {
    private final Parcelable AudioAttributesCompatParcelizer;
    public static final AbsSavedState write = new AbsSavedState() { // from class: androidx.customview.view.AbsSavedState.1
    };
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new Parcelable.ClassLoaderCreator<AbsSavedState>() { // from class: androidx.customview.view.AbsSavedState.4
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return write(parcel);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final /* synthetic */ AbsSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return RemoteActionCompatParcelizer(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return RemoteActionCompatParcelizer(i);
        }

        private static AbsSavedState RemoteActionCompatParcelizer(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) != null) {
                throw new IllegalStateException("superState must be null");
            }
            return AbsSavedState.write;
        }

        private static AbsSavedState write(Parcel parcel) {
            return RemoteActionCompatParcelizer(parcel, null);
        }

        private static AbsSavedState[] RemoteActionCompatParcelizer(int i) {
            return new AbsSavedState[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* synthetic */ AbsSavedState(byte b) {
        this();
    }

    private AbsSavedState() {
        this.AudioAttributesCompatParcelizer = null;
    }

    public AbsSavedState(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.AudioAttributesCompatParcelizer = parcelable == write ? null : parcelable;
    }

    public AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable parcelable = parcel.readParcelable(classLoader);
        this.AudioAttributesCompatParcelizer = parcelable == null ? write : parcelable;
    }

    public final Parcelable read() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.AudioAttributesCompatParcelizer, i);
    }
}
