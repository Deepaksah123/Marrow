package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public class Counter implements Parcelable {
    public static final Parcelable.Creator<Counter> CREATOR = new Parcelable.Creator<Counter>() { // from class: com.google.firebase.perf.metrics.Counter.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Counter createFromParcel(Parcel parcel) {
            return RemoteActionCompatParcelizer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Counter[] newArray(int i) {
            return write(i);
        }

        private static Counter RemoteActionCompatParcelizer(Parcel parcel) {
            return new Counter(parcel, (byte) 0);
        }

        private static Counter[] write(int i) {
            return new Counter[i];
        }
    };
    private final AtomicLong AudioAttributesCompatParcelizer;
    private final String write;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* synthetic */ Counter(Parcel parcel, byte b) {
        this(parcel);
    }

    public Counter(String str) {
        this.write = str;
        this.AudioAttributesCompatParcelizer = new AtomicLong(0L);
    }

    private Counter(Parcel parcel) {
        this.write = parcel.readString();
        this.AudioAttributesCompatParcelizer = new AtomicLong(parcel.readLong());
    }

    public final String read() {
        return this.write;
    }

    public final long write() {
        return this.AudioAttributesCompatParcelizer.get();
    }

    final void read(long j) {
        this.AudioAttributesCompatParcelizer.set(j);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.write);
        parcel.writeLong(this.AudioAttributesCompatParcelizer.get());
    }
}
