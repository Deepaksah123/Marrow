package com.google.android.material.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;
import kotlin.AppCompatCheckBox;

/* JADX INFO: loaded from: classes5.dex */
public class ExtendableSavedState extends AbsSavedState {
    public static final Parcelable.Creator<ExtendableSavedState> CREATOR = new Parcelable.ClassLoaderCreator<ExtendableSavedState>() { // from class: com.google.android.material.stateful.ExtendableSavedState.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object createFromParcel(Parcel parcel) {
            return IconCompatParcelizer(parcel);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        public final /* synthetic */ ExtendableSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            return read(parcel, classLoader);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i) {
            return IconCompatParcelizer(i);
        }

        private static ExtendableSavedState read(Parcel parcel, ClassLoader classLoader) {
            return new ExtendableSavedState(parcel, classLoader, (byte) 0);
        }

        private static ExtendableSavedState IconCompatParcelizer(Parcel parcel) {
            return new ExtendableSavedState(parcel, null, (byte) 0);
        }

        private static ExtendableSavedState[] IconCompatParcelizer(int i) {
            return new ExtendableSavedState[i];
        }
    };
    public final AppCompatCheckBox<String, Bundle> IconCompatParcelizer;

    /* synthetic */ ExtendableSavedState(Parcel parcel, ClassLoader classLoader, byte b) {
        this(parcel, classLoader);
    }

    public ExtendableSavedState(Parcelable parcelable) {
        super(parcelable);
        this.IconCompatParcelizer = new AppCompatCheckBox<>();
    }

    private ExtendableSavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        String[] strArr = new String[i];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[i];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.IconCompatParcelizer = new AppCompatCheckBox<>(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.IconCompatParcelizer.put(strArr[i2], bundleArr[i2]);
        }
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        int remoteActionCompatParcelizer = this.IconCompatParcelizer.getRemoteActionCompatParcelizer();
        parcel.writeInt(remoteActionCompatParcelizer);
        String[] strArr = new String[remoteActionCompatParcelizer];
        Bundle[] bundleArr = new Bundle[remoteActionCompatParcelizer];
        for (int i2 = 0; i2 < remoteActionCompatParcelizer; i2++) {
            strArr[i2] = this.IconCompatParcelizer.write(i2);
            bundleArr[i2] = this.IconCompatParcelizer.IconCompatParcelizer(i2);
        }
        parcel.writeStringArray(strArr);
        parcel.writeTypedArray(bundleArr, 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ExtendableSavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" states=");
        sb.append(this.IconCompatParcelizer);
        sb.append("}");
        return sb.toString();
    }
}
