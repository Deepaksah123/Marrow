package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointForward> CREATOR = new Parcelable.Creator<DateValidatorPointForward>() { // from class: com.google.android.material.datepicker.DateValidatorPointForward.2
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DateValidatorPointForward createFromParcel(Parcel parcel) {
            return read(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DateValidatorPointForward[] newArray(int i) {
            return IconCompatParcelizer(i);
        }

        private static DateValidatorPointForward read(Parcel parcel) {
            return new DateValidatorPointForward(parcel.readLong(), (byte) 0);
        }

        private static DateValidatorPointForward[] IconCompatParcelizer(int i) {
            return new DateValidatorPointForward[i];
        }
    };
    private final long AudioAttributesCompatParcelizer;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* synthetic */ DateValidatorPointForward(long j, byte b) {
        this(j);
    }

    private DateValidatorPointForward(long j) {
        this.AudioAttributesCompatParcelizer = j;
    }

    public static DateValidatorPointForward IconCompatParcelizer() {
        return new DateValidatorPointForward(Long.MIN_VALUE);
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public final boolean RemoteActionCompatParcelizer(long j) {
        return j >= this.AudioAttributesCompatParcelizer;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.AudioAttributesCompatParcelizer);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateValidatorPointForward) && this.AudioAttributesCompatParcelizer == ((DateValidatorPointForward) obj).AudioAttributesCompatParcelizer;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.AudioAttributesCompatParcelizer)});
    }
}
