package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;
import kotlin.getExtractor;
import kotlin.setConstantBitrateSeekingAlwaysEnabled;

/* JADX INFO: loaded from: classes5.dex */
public final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new Parcelable.Creator<Month>() { // from class: com.google.android.material.datepicker.Month.3
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Month createFromParcel(Parcel parcel) {
            return write(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Month[] newArray(int i) {
            return AudioAttributesCompatParcelizer(i);
        }

        private static Month write(Parcel parcel) {
            return Month.AudioAttributesCompatParcelizer(parcel.readInt(), parcel.readInt());
        }

        private static Month[] AudioAttributesCompatParcelizer(int i) {
            return new Month[i];
        }
    };
    public final int AudioAttributesCompatParcelizer;
    private final Calendar AudioAttributesImplApi21Parcelizer;
    private String AudioAttributesImplBaseParcelizer;
    public final int IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final long read;
    public final int write;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    private Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendar2 = getExtractor.read(calendar);
        this.AudioAttributesImplApi21Parcelizer = calendar2;
        this.IconCompatParcelizer = calendar2.get(2);
        this.RemoteActionCompatParcelizer = calendar2.get(1);
        this.write = calendar2.getMaximum(7);
        this.AudioAttributesCompatParcelizer = calendar2.getActualMaximum(5);
        this.read = calendar2.getTimeInMillis();
    }

    public static Month RemoteActionCompatParcelizer(long j) {
        Calendar calendarWrite = getExtractor.write();
        calendarWrite.setTimeInMillis(j);
        return new Month(calendarWrite);
    }

    public static Month AudioAttributesCompatParcelizer(int i, int i2) {
        Calendar calendarWrite = getExtractor.write();
        calendarWrite.set(1, i);
        calendarWrite.set(2, i2);
        return new Month(calendarWrite);
    }

    public static Month AudioAttributesCompatParcelizer() {
        return new Month(getExtractor.AudioAttributesCompatParcelizer());
    }

    public final int write(int i) {
        int i2 = this.AudioAttributesImplApi21Parcelizer.get(7);
        if (i <= 0) {
            i = this.AudioAttributesImplApi21Parcelizer.getFirstDayOfWeek();
        }
        int i3 = i2 - i;
        return i3 < 0 ? i3 + this.write : i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.IconCompatParcelizer == month.IconCompatParcelizer && this.RemoteActionCompatParcelizer == month.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.IconCompatParcelizer), Integer.valueOf(this.RemoteActionCompatParcelizer)});
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final int compareTo(Month month) {
        return this.AudioAttributesImplApi21Parcelizer.compareTo(month.AudioAttributesImplApi21Parcelizer);
    }

    public final int write(Month month) {
        if (this.AudioAttributesImplApi21Parcelizer instanceof GregorianCalendar) {
            return ((month.RemoteActionCompatParcelizer - this.RemoteActionCompatParcelizer) * 12) + (month.IconCompatParcelizer - this.IconCompatParcelizer);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public final long write() {
        return this.AudioAttributesImplApi21Parcelizer.getTimeInMillis();
    }

    public final long read(int i) {
        Calendar calendar = getExtractor.read(this.AudioAttributesImplApi21Parcelizer);
        calendar.set(5, i);
        return calendar.getTimeInMillis();
    }

    public final int read(long j) {
        Calendar calendar = getExtractor.read(this.AudioAttributesImplApi21Parcelizer);
        calendar.setTimeInMillis(j);
        return calendar.get(5);
    }

    public final Month AudioAttributesCompatParcelizer(int i) {
        Calendar calendar = getExtractor.read(this.AudioAttributesImplApi21Parcelizer);
        calendar.add(2, i);
        return new Month(calendar);
    }

    public final String RemoteActionCompatParcelizer() {
        if (this.AudioAttributesImplBaseParcelizer == null) {
            this.AudioAttributesImplBaseParcelizer = setConstantBitrateSeekingAlwaysEnabled.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer.getTimeInMillis());
        }
        return this.AudioAttributesImplBaseParcelizer;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.RemoteActionCompatParcelizer);
        parcel.writeInt(this.IconCompatParcelizer);
    }
}
