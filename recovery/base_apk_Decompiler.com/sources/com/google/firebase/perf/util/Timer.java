package com.google.firebase.perf.util;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class Timer implements Parcelable {
    public static final Parcelable.Creator<Timer> CREATOR = new Parcelable.Creator<Timer>() { // from class: com.google.firebase.perf.util.Timer.3
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Timer createFromParcel(Parcel parcel) {
            return RemoteActionCompatParcelizer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Timer[] newArray(int i) {
            return RemoteActionCompatParcelizer(i);
        }

        private static Timer RemoteActionCompatParcelizer(Parcel parcel) {
            return new Timer(parcel, (byte) 0);
        }

        private static Timer[] RemoteActionCompatParcelizer(int i) {
            return new Timer[i];
        }
    };
    private long IconCompatParcelizer;
    private long RemoteActionCompatParcelizer;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* synthetic */ Timer(Parcel parcel, byte b) {
        this(parcel);
    }

    public static Timer IconCompatParcelizer(long j) {
        long micros = TimeUnit.MILLISECONDS.toMicros(j);
        return new Timer(MediaBrowserCompatCustomActionResultReceiver() + (micros - read()), micros);
    }

    private static long MediaBrowserCompatCustomActionResultReceiver() {
        return TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
    }

    private static long read() {
        return TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    public Timer() {
        this(MediaBrowserCompatCustomActionResultReceiver(), read());
    }

    private Timer(long j, long j2) {
        this.RemoteActionCompatParcelizer = j;
        this.IconCompatParcelizer = j2;
    }

    private Timer(Parcel parcel) {
        this(parcel.readLong(), parcel.readLong());
    }

    public final void IconCompatParcelizer() {
        this.RemoteActionCompatParcelizer = MediaBrowserCompatCustomActionResultReceiver();
        this.IconCompatParcelizer = read();
    }

    public final long write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final long AudioAttributesCompatParcelizer() {
        return write(new Timer());
    }

    public final long write(Timer timer) {
        return timer.IconCompatParcelizer - this.IconCompatParcelizer;
    }

    public final long RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer + AudioAttributesCompatParcelizer();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.RemoteActionCompatParcelizer);
        parcel.writeLong(this.IconCompatParcelizer);
    }
}
