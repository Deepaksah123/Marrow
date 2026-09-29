package com.google.firebase.perf.session;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.perf.util.Timer;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.MediaCodecUtilCodecKey;
import kotlin.MetadataDecoderFactory;
import kotlin.MetadataDecoderFactory1;
import kotlin.maybeInitCodecOrBypass;

/* JADX INFO: loaded from: classes3.dex */
public class PerfSession implements Parcelable {
    public static final Parcelable.Creator<PerfSession> CREATOR = new Parcelable.Creator<PerfSession>() { // from class: com.google.firebase.perf.session.PerfSession.2
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PerfSession createFromParcel(Parcel parcel) {
            return IconCompatParcelizer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PerfSession[] newArray(int i) {
            return IconCompatParcelizer(i);
        }

        private static PerfSession IconCompatParcelizer(Parcel parcel) {
            return new PerfSession(parcel, (byte) 0);
        }

        private static PerfSession[] IconCompatParcelizer(int i) {
            return new PerfSession[i];
        }
    };
    private boolean IconCompatParcelizer;
    private final Timer RemoteActionCompatParcelizer;
    private final String write;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* synthetic */ PerfSession(Parcel parcel, byte b) {
        this(parcel);
    }

    public static PerfSession AudioAttributesCompatParcelizer(String str) {
        String strReplace = str.replace("-", "");
        new MediaCodecUtilCodecKey();
        PerfSession perfSession = new PerfSession(strReplace);
        perfSession.AudioAttributesCompatParcelizer(AudioAttributesImplBaseParcelizer());
        return perfSession;
    }

    private PerfSession(String str) {
        this.IconCompatParcelizer = false;
        this.write = str;
        this.RemoteActionCompatParcelizer = MediaCodecUtilCodecKey.AudioAttributesCompatParcelizer();
    }

    private PerfSession(Parcel parcel) {
        this.IconCompatParcelizer = false;
        this.write = parcel.readString();
        this.IconCompatParcelizer = parcel.readByte() != 0;
        this.RemoteActionCompatParcelizer = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
    }

    public final String write() {
        return this.write;
    }

    public final Timer RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    private void AudioAttributesCompatParcelizer(boolean z) {
        this.IconCompatParcelizer = z;
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    private boolean MediaBrowserCompatCustomActionResultReceiver() {
        return this.IconCompatParcelizer;
    }

    public final boolean read() {
        return TimeUnit.MICROSECONDS.toMinutes(this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer()) > maybeInitCodecOrBypass.IconCompatParcelizer().RatingCompat();
    }

    public final MetadataDecoderFactory IconCompatParcelizer() {
        MetadataDecoderFactory.read readVarAudioAttributesCompatParcelizer = MetadataDecoderFactory.IconCompatParcelizer().AudioAttributesCompatParcelizer(this.write);
        if (this.IconCompatParcelizer) {
            readVarAudioAttributesCompatParcelizer.IconCompatParcelizer(MetadataDecoderFactory1.GAUGES_AND_SYSTEM_EVENTS);
        }
        return readVarAudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem();
    }

    public static MetadataDecoderFactory[] IconCompatParcelizer(List<PerfSession> list) {
        if (list.isEmpty()) {
            return null;
        }
        MetadataDecoderFactory[] metadataDecoderFactoryArr = new MetadataDecoderFactory[list.size()];
        MetadataDecoderFactory metadataDecoderFactoryIconCompatParcelizer = list.get(0).IconCompatParcelizer();
        boolean z = false;
        for (int i = 1; i < list.size(); i++) {
            MetadataDecoderFactory metadataDecoderFactoryIconCompatParcelizer2 = list.get(i).IconCompatParcelizer();
            if (!z && list.get(i).MediaBrowserCompatCustomActionResultReceiver()) {
                metadataDecoderFactoryArr[0] = metadataDecoderFactoryIconCompatParcelizer2;
                metadataDecoderFactoryArr[i] = metadataDecoderFactoryIconCompatParcelizer;
                z = true;
            } else {
                metadataDecoderFactoryArr[i] = metadataDecoderFactoryIconCompatParcelizer2;
            }
        }
        if (!z) {
            metadataDecoderFactoryArr[0] = metadataDecoderFactoryIconCompatParcelizer;
        }
        return metadataDecoderFactoryArr;
    }

    private static boolean AudioAttributesImplBaseParcelizer() {
        maybeInitCodecOrBypass maybeinitcodecorbypassIconCompatParcelizer = maybeInitCodecOrBypass.IconCompatParcelizer();
        return maybeinitcodecorbypassIconCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler() && Math.random() < maybeinitcodecorbypassIconCompatParcelizer.MediaBrowserCompatSearchResultReceiver();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.write);
        parcel.writeByte(this.IconCompatParcelizer ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.RemoteActionCompatParcelizer, 0);
    }
}
