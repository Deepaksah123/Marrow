package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import kotlin.configureFromStringCreator;
import kotlin.getExtractor;

/* JADX INFO: loaded from: classes5.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new Parcelable.Creator<CalendarConstraints>() { // from class: com.google.android.material.datepicker.CalendarConstraints.2
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CalendarConstraints createFromParcel(Parcel parcel) {
            return RemoteActionCompatParcelizer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CalendarConstraints[] newArray(int i) {
            return write(i);
        }

        private static CalendarConstraints RemoteActionCompatParcelizer(Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), parcel.readInt(), (byte) 0);
        }

        private static CalendarConstraints[] write(int i) {
            return new CalendarConstraints[i];
        }
    };
    private final Month AudioAttributesCompatParcelizer;
    private final int AudioAttributesImplApi21Parcelizer;
    private final DateValidator AudioAttributesImplApi26Parcelizer;
    private final int IconCompatParcelizer;
    private final Month RemoteActionCompatParcelizer;
    private final int read;
    private Month write;

    public interface DateValidator extends Parcelable {
        boolean RemoteActionCompatParcelizer(long j);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* synthetic */ CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i, byte b) {
        this(month, month2, dateValidator, month3, i);
    }

    private CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.AudioAttributesCompatParcelizer = month;
        this.RemoteActionCompatParcelizer = month2;
        this.write = month3;
        this.read = i;
        this.AudioAttributesImplApi26Parcelizer = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > getExtractor.write().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.IconCompatParcelizer = month.write(month2) + 1;
        this.AudioAttributesImplApi21Parcelizer = (month2.RemoteActionCompatParcelizer - month.RemoteActionCompatParcelizer) + 1;
    }

    public final DateValidator write() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final Month AudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final Month RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final Month read() {
        return this.write;
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.read;
    }

    public final int IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final int MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.AudioAttributesCompatParcelizer.equals(calendarConstraints.AudioAttributesCompatParcelizer) && this.RemoteActionCompatParcelizer.equals(calendarConstraints.RemoteActionCompatParcelizer) && configureFromStringCreator.RemoteActionCompatParcelizer(this.write, calendarConstraints.write) && this.read == calendarConstraints.read && this.AudioAttributesImplApi26Parcelizer.equals(calendarConstraints.AudioAttributesImplApi26Parcelizer);
    }

    public final int hashCode() {
        Month month = this.AudioAttributesCompatParcelizer;
        Month month2 = this.RemoteActionCompatParcelizer;
        Month month3 = this.write;
        int i = this.read;
        return Arrays.hashCode(new Object[]{month, month2, month3, Integer.valueOf(i), this.AudioAttributesImplApi26Parcelizer});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.AudioAttributesCompatParcelizer, 0);
        parcel.writeParcelable(this.RemoteActionCompatParcelizer, 0);
        parcel.writeParcelable(this.write, 0);
        parcel.writeParcelable(this.AudioAttributesImplApi26Parcelizer, 0);
        parcel.writeInt(this.read);
    }

    public final Month AudioAttributesCompatParcelizer(Month month) {
        if (month.compareTo(this.AudioAttributesCompatParcelizer) < 0) {
            return this.AudioAttributesCompatParcelizer;
        }
        return month.compareTo(this.RemoteActionCompatParcelizer) > 0 ? this.RemoteActionCompatParcelizer : month;
    }

    public static final class IconCompatParcelizer {
        private int AudioAttributesCompatParcelizer;
        private long AudioAttributesImplApi21Parcelizer;
        private Long IconCompatParcelizer;
        private DateValidator MediaBrowserCompatItemReceiver;
        private long RemoteActionCompatParcelizer;
        private static long write = getExtractor.RemoteActionCompatParcelizer(Month.AudioAttributesCompatParcelizer(1900, 0).read);
        private static long read = getExtractor.RemoteActionCompatParcelizer(Month.AudioAttributesCompatParcelizer(2100, 11).read);

        public IconCompatParcelizer() {
            this.AudioAttributesImplApi21Parcelizer = write;
            this.RemoteActionCompatParcelizer = read;
            this.MediaBrowserCompatItemReceiver = DateValidatorPointForward.IconCompatParcelizer();
        }

        public IconCompatParcelizer(CalendarConstraints calendarConstraints) {
            this.AudioAttributesImplApi21Parcelizer = write;
            this.RemoteActionCompatParcelizer = read;
            this.MediaBrowserCompatItemReceiver = DateValidatorPointForward.IconCompatParcelizer();
            this.AudioAttributesImplApi21Parcelizer = calendarConstraints.AudioAttributesCompatParcelizer.read;
            this.RemoteActionCompatParcelizer = calendarConstraints.RemoteActionCompatParcelizer.read;
            this.IconCompatParcelizer = Long.valueOf(calendarConstraints.write.read);
            this.AudioAttributesCompatParcelizer = calendarConstraints.read;
            this.MediaBrowserCompatItemReceiver = calendarConstraints.AudioAttributesImplApi26Parcelizer;
        }

        public final IconCompatParcelizer RemoteActionCompatParcelizer(long j) {
            this.IconCompatParcelizer = Long.valueOf(j);
            return this;
        }

        public final CalendarConstraints write() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.MediaBrowserCompatItemReceiver);
            Month monthRemoteActionCompatParcelizer = Month.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer);
            Month monthRemoteActionCompatParcelizer2 = Month.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l = this.IconCompatParcelizer;
            return new CalendarConstraints(monthRemoteActionCompatParcelizer, monthRemoteActionCompatParcelizer2, dateValidator, l == null ? null : Month.RemoteActionCompatParcelizer(l.longValue()), this.AudioAttributesCompatParcelizer, (byte) 0);
        }
    }
}
