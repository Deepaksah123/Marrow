package com.airbnb.epoxy;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import kotlin.getMaxSeekToPreviousPosition;
import kotlin.setMaxInputSize;
import kotlin.setPresenter;

/* JADX INFO: loaded from: classes2.dex */
public class ViewHolderState extends setPresenter<ViewState> implements Parcelable {
    public static final Parcelable.Creator<ViewHolderState> CREATOR = new Parcelable.Creator<ViewHolderState>() { // from class: com.airbnb.epoxy.ViewHolderState.3
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ViewHolderState createFromParcel(Parcel parcel) {
            return read(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ViewHolderState[] newArray(int i) {
            return read(i);
        }

        private static ViewHolderState[] read(int i) {
            return new ViewHolderState[i];
        }

        /* JADX WARN: Multi-variable type inference failed */
        private static ViewHolderState read(Parcel parcel) {
            int i = parcel.readInt();
            ViewHolderState viewHolderState = new ViewHolderState(i, 0 == true ? 1 : 0);
            for (int i2 = 0; i2 < i; i2++) {
                viewHolderState.write(parcel.readLong(), (ViewState) parcel.readParcelable(ViewState.class.getClassLoader()));
            }
            return viewHolderState;
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* synthetic */ ViewHolderState(int i, byte b) {
        this(i);
    }

    public ViewHolderState() {
    }

    private ViewHolderState(int i) {
        super(i);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iWrite = write();
        parcel.writeInt(iWrite);
        for (int i2 = 0; i2 < iWrite; i2++) {
            parcel.writeLong(AudioAttributesCompatParcelizer(i2));
            parcel.writeParcelable(IconCompatParcelizer(i2), 0);
        }
    }

    public static void write(getMaxSeekToPreviousPosition getmaxseektopreviousposition) {
        getmaxseektopreviousposition.write();
    }

    public static void IconCompatParcelizer(getMaxSeekToPreviousPosition getmaxseektopreviousposition) {
        getmaxseektopreviousposition.write();
    }

    public static class ViewState extends SparseArray<Parcelable> implements Parcelable {
        public static final Parcelable.Creator<ViewState> CREATOR = new Parcelable.ClassLoaderCreator<ViewState>() { // from class: com.airbnb.epoxy.ViewHolderState.ViewState.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return read(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ ViewState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return AudioAttributesCompatParcelizer(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object[] newArray(int i) {
                return read(i);
            }

            private static ViewState AudioAttributesCompatParcelizer(Parcel parcel, ClassLoader classLoader) {
                int i = parcel.readInt();
                int[] iArr = new int[i];
                parcel.readIntArray(iArr);
                return new ViewState(i, iArr, parcel.readParcelableArray(classLoader), (byte) 0);
            }

            private static ViewState read(Parcel parcel) {
                return AudioAttributesCompatParcelizer(parcel, null);
            }

            private static ViewState[] read(int i) {
                return new ViewState[i];
            }
        };

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* synthetic */ ViewState(int i, int[] iArr, Parcelable[] parcelableArr, byte b) {
            this(i, iArr, parcelableArr);
        }

        public ViewState() {
        }

        private ViewState(int i, int[] iArr, Parcelable[] parcelableArr) {
            super(i);
            for (int i2 = 0; i2 < i; i2++) {
                put(iArr[i2], parcelableArr[i2]);
            }
        }

        public final void read(View view) {
            int id = view.getId();
            RemoteActionCompatParcelizer(view);
            view.saveHierarchyState(this);
            view.setId(id);
        }

        private static void RemoteActionCompatParcelizer(View view) {
            if (view.getId() == -1) {
                view.setId(setMaxInputSize.read.view_model_state_saving_id);
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            int size = size();
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i2 = 0; i2 < size; i2++) {
                iArr[i2] = keyAt(i2);
                parcelableArr[i2] = valueAt(i2);
            }
            parcel.writeInt(size);
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i);
        }
    }
}
