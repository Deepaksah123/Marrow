package com.google.firebase.perf.metrics;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.MediaCodecRendererDecoderInitializationException;
import kotlin.MediaCodecUtilCodecKey;
import kotlin.av1LevelNumberToConst;
import kotlin.flushOrReleaseCodec;
import kotlin.getAlternativeCodecMimeType;
import kotlin.getCodecOutputMediaFormat;
import kotlin.getDecoderInfo;
import kotlin.getDecoderInfosInternal;
import kotlin.isAlias;
import kotlin.maybeInitCodecOrBypass;
import kotlin.sortByScore;

/* JADX INFO: loaded from: classes3.dex */
public class Trace extends flushOrReleaseCodec implements Parcelable, getDecoderInfo {
    public static final Parcelable.Creator<Trace> CREATOR;
    private final isAlias AudioAttributesCompatParcelizer;
    private Timer AudioAttributesImplApi21Parcelizer;
    private final String AudioAttributesImplApi26Parcelizer;
    private final Trace AudioAttributesImplBaseParcelizer;
    private final Map<String, String> IconCompatParcelizer;
    private final List<PerfSession> MediaBrowserCompatCustomActionResultReceiver;
    private final WeakReference<getDecoderInfo> MediaBrowserCompatItemReceiver;
    private final List<Trace> MediaBrowserCompatSearchResultReceiver;
    private final sortByScore RatingCompat;
    private final MediaCodecUtilCodecKey RemoteActionCompatParcelizer;
    private Timer read;
    private final Map<String, Counter> write;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* synthetic */ Trace(Parcel parcel, boolean z, byte b) {
        this(parcel, z);
    }

    static {
        MediaCodecRendererDecoderInitializationException.IconCompatParcelizer();
        new ConcurrentHashMap();
        CREATOR = new Parcelable.Creator<Trace>() { // from class: com.google.firebase.perf.metrics.Trace.5
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Trace createFromParcel(Parcel parcel) {
                return RemoteActionCompatParcelizer(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Trace[] newArray(int i) {
                return read(i);
            }

            /* JADX WARN: Multi-variable type inference failed */
            private static Trace RemoteActionCompatParcelizer(Parcel parcel) {
                return new Trace(parcel, false, 0 == true ? 1 : 0);
            }

            private static Trace[] read(int i) {
                return new Trace[i];
            }
        };
        new Parcelable.Creator<Trace>() { // from class: com.google.firebase.perf.metrics.Trace.4
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Trace createFromParcel(Parcel parcel) {
                return write(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Trace[] newArray(int i) {
                return read(i);
            }

            private static Trace write(Parcel parcel) {
                return new Trace(parcel, true, (byte) 0);
            }

            private static Trace[] read(int i) {
                return new Trace[i];
            }
        };
    }

    @Override // kotlin.getDecoderInfo
    public final void write(PerfSession perfSession) {
        if (perfSession == null || !RatingCompat() || onCommand()) {
            return;
        }
        this.MediaBrowserCompatCustomActionResultReceiver.add(perfSession);
    }

    public Trace(String str, sortByScore sortbyscore, MediaCodecUtilCodecKey mediaCodecUtilCodecKey, getCodecOutputMediaFormat getcodecoutputmediaformat) {
        this(str, sortbyscore, mediaCodecUtilCodecKey, getcodecoutputmediaformat, isAlias.read());
    }

    private Trace(String str, sortByScore sortbyscore, MediaCodecUtilCodecKey mediaCodecUtilCodecKey, getCodecOutputMediaFormat getcodecoutputmediaformat, isAlias isalias) {
        super(getcodecoutputmediaformat);
        this.MediaBrowserCompatItemReceiver = new WeakReference<>(this);
        this.AudioAttributesImplBaseParcelizer = null;
        this.AudioAttributesImplApi26Parcelizer = str.trim();
        this.MediaBrowserCompatSearchResultReceiver = new ArrayList();
        this.write = new ConcurrentHashMap();
        this.IconCompatParcelizer = new ConcurrentHashMap();
        this.RemoteActionCompatParcelizer = mediaCodecUtilCodecKey;
        this.RatingCompat = sortbyscore;
        this.MediaBrowserCompatCustomActionResultReceiver = Collections.synchronizedList(new ArrayList());
        this.AudioAttributesCompatParcelizer = isalias;
    }

    private Trace(Parcel parcel, boolean z) {
        super(z ? null : getCodecOutputMediaFormat.RemoteActionCompatParcelizer());
        this.MediaBrowserCompatItemReceiver = new WeakReference<>(this);
        this.AudioAttributesImplBaseParcelizer = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.AudioAttributesImplApi26Parcelizer = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.MediaBrowserCompatSearchResultReceiver = arrayList;
        parcel.readList(arrayList, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.write = concurrentHashMap;
        this.IconCompatParcelizer = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, Counter.class.getClassLoader());
        this.AudioAttributesImplApi21Parcelizer = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        this.read = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        List<PerfSession> listSynchronizedList = Collections.synchronizedList(new ArrayList());
        this.MediaBrowserCompatCustomActionResultReceiver = listSynchronizedList;
        parcel.readList(listSynchronizedList, PerfSession.class.getClassLoader());
        if (z) {
            this.RatingCompat = null;
            this.RemoteActionCompatParcelizer = null;
            this.AudioAttributesCompatParcelizer = null;
        } else {
            this.RatingCompat = sortByScore.read();
            this.RemoteActionCompatParcelizer = new MediaCodecUtilCodecKey();
            this.AudioAttributesCompatParcelizer = isAlias.read();
        }
    }

    public final void MediaBrowserCompatMediaItem() {
        if (maybeInitCodecOrBypass.IconCompatParcelizer().handleMediaPlayPauseIfPendingOnHandler()) {
            String strWrite = getAlternativeCodecMimeType.write(this.AudioAttributesImplApi26Parcelizer);
            if (strWrite != null) {
                new Object[]{this.AudioAttributesImplApi26Parcelizer, strWrite};
                return;
            }
            if (this.AudioAttributesImplApi21Parcelizer != null) {
                new Object[]{this.AudioAttributesImplApi26Parcelizer};
                return;
            }
            this.AudioAttributesImplApi21Parcelizer = MediaCodecUtilCodecKey.AudioAttributesCompatParcelizer();
            read();
            PerfSession perfSessionAudioAttributesCompatParcelizer = getDecoderInfosInternal.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer();
            getDecoderInfosInternal.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver);
            write(perfSessionAudioAttributesCompatParcelizer);
            if (perfSessionAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer()) {
                this.AudioAttributesCompatParcelizer.IconCompatParcelizer(perfSessionAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer());
            }
        }
    }

    public final void MediaDescriptionCompat() {
        if (!RatingCompat()) {
            new Object[]{this.AudioAttributesImplApi26Parcelizer};
            return;
        }
        if (onCommand()) {
            new Object[]{this.AudioAttributesImplApi26Parcelizer};
            return;
        }
        getDecoderInfosInternal.RemoteActionCompatParcelizer().write(this.MediaBrowserCompatItemReceiver);
        IconCompatParcelizer();
        Timer timerAudioAttributesCompatParcelizer = MediaCodecUtilCodecKey.AudioAttributesCompatParcelizer();
        this.read = timerAudioAttributesCompatParcelizer;
        if (this.AudioAttributesImplBaseParcelizer == null) {
            write(timerAudioAttributesCompatParcelizer);
            if (this.AudioAttributesImplApi26Parcelizer.isEmpty()) {
                return;
            }
            this.RatingCompat.IconCompatParcelizer(new av1LevelNumberToConst(this).read(), write());
            if (getDecoderInfosInternal.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer()) {
                this.AudioAttributesCompatParcelizer.IconCompatParcelizer(getDecoderInfosInternal.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer());
            }
        }
    }

    private void write(Timer timer) {
        if (this.MediaBrowserCompatSearchResultReceiver.isEmpty()) {
            return;
        }
        Trace trace = this.MediaBrowserCompatSearchResultReceiver.get(this.MediaBrowserCompatSearchResultReceiver.size() - 1);
        if (trace.read == null) {
            trace.read = timer;
        }
    }

    private Counter IconCompatParcelizer(String str) {
        Counter counter = this.write.get(str);
        if (counter != null) {
            return counter;
        }
        Counter counter2 = new Counter(str);
        this.write.put(str, counter2);
        return counter2;
    }

    public final void write(String str, long j) {
        String str2 = getAlternativeCodecMimeType.read(str);
        if (str2 != null) {
            new Object[]{str, str2};
            return;
        }
        if (!RatingCompat()) {
            new Object[]{str, this.AudioAttributesImplApi26Parcelizer};
        } else {
            if (onCommand()) {
                new Object[]{str, this.AudioAttributesImplApi26Parcelizer};
                return;
            }
            IconCompatParcelizer(str.trim()).read(j);
            new Object[]{str, Long.valueOf(j), this.AudioAttributesImplApi26Parcelizer};
        }
    }

    protected void finalize() throws Throwable {
        try {
            if (MediaBrowserCompatSearchResultReceiver()) {
                new Object[]{this.AudioAttributesImplApi26Parcelizer};
                AudioAttributesCompatParcelizer();
            }
        } finally {
            super.finalize();
        }
    }

    public final String MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final Map<String, Counter> AudioAttributesImplApi21Parcelizer() {
        return this.write;
    }

    public final Timer AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final Timer MediaBrowserCompatCustomActionResultReceiver() {
        return this.read;
    }

    public final List<Trace> MediaMetadataCompat() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    private boolean onCommand() {
        return this.read != null;
    }

    private boolean RatingCompat() {
        return this.AudioAttributesImplApi21Parcelizer != null;
    }

    private boolean MediaBrowserCompatSearchResultReceiver() {
        return RatingCompat() && !onCommand();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.AudioAttributesImplBaseParcelizer, 0);
        parcel.writeString(this.AudioAttributesImplApi26Parcelizer);
        parcel.writeList(this.MediaBrowserCompatSearchResultReceiver);
        parcel.writeMap(this.write);
        parcel.writeParcelable(this.AudioAttributesImplApi21Parcelizer, 0);
        parcel.writeParcelable(this.read, 0);
        synchronized (this.MediaBrowserCompatCustomActionResultReceiver) {
            parcel.writeList(this.MediaBrowserCompatCustomActionResultReceiver);
        }
    }

    public final void write(String str, String str2) {
        boolean z;
        try {
            str = str.trim();
            str2 = str2.trim();
            AudioAttributesCompatParcelizer(str, str2);
            new Object[]{str, str2, this.AudioAttributesImplApi26Parcelizer};
            z = true;
        } catch (Exception e) {
            new Object[]{str, str2, e.getMessage()};
            z = false;
        }
        if (z) {
            this.IconCompatParcelizer.put(str, str2);
        }
    }

    private void AudioAttributesCompatParcelizer(String str, String str2) {
        if (onCommand()) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Trace '%s' has been stopped", this.AudioAttributesImplApi26Parcelizer));
        }
        if (!this.IconCompatParcelizer.containsKey(str) && this.IconCompatParcelizer.size() >= 5) {
            throw new IllegalArgumentException(String.format(Locale.ENGLISH, "Exceeds max limit of number of attributes - %d", 5));
        }
        getAlternativeCodecMimeType.write(str, str2);
    }

    public final Map<String, String> RemoteActionCompatParcelizer() {
        return new HashMap(this.IconCompatParcelizer);
    }

    public final List<PerfSession> AudioAttributesImplApi26Parcelizer() {
        List<PerfSession> listUnmodifiableList;
        synchronized (this.MediaBrowserCompatCustomActionResultReceiver) {
            ArrayList arrayList = new ArrayList();
            for (PerfSession perfSession : this.MediaBrowserCompatCustomActionResultReceiver) {
                if (perfSession != null) {
                    arrayList.add(perfSession);
                }
            }
            listUnmodifiableList = Collections.unmodifiableList(arrayList);
        }
        return listUnmodifiableList;
    }
}
