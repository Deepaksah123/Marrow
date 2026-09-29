package kotlin;

import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class isTypeSupported {
    private getTrackFormat AudioAttributesCompatParcelizer;
    private String AudioAttributesImplApi21Parcelizer;
    private Executor IconCompatParcelizer;
    private final HashMap<String, isTrackSelected> MediaBrowserCompatCustomActionResultReceiver;
    private getTrackFormat RemoteActionCompatParcelizer;
    private CleverTapInstanceConfig read;
    private getMediaTrackGroup write;

    isTypeSupported(CleverTapInstanceConfig cleverTapInstanceConfig) {
        getTrackFormat gettrackformat = new getTrackFormat();
        this.RemoteActionCompatParcelizer = gettrackformat;
        this.IconCompatParcelizer = new ObjectIdWriter();
        this.AudioAttributesCompatParcelizer = gettrackformat;
        this.MediaBrowserCompatCustomActionResultReceiver = new HashMap<>();
        this.read = cleverTapInstanceConfig;
        this.write = new getMediaTrackGroup();
    }

    isTypeSupported() {
        getTrackFormat gettrackformat = new getTrackFormat();
        this.RemoteActionCompatParcelizer = gettrackformat;
        this.IconCompatParcelizer = new ObjectIdWriter();
        this.AudioAttributesCompatParcelizer = gettrackformat;
        this.MediaBrowserCompatCustomActionResultReceiver = new HashMap<>();
        this.read = null;
        this.write = new getMediaTrackGroup();
        lambdanotifySeekStarted2 lambdanotifyseekstarted2 = lambdanotifySeekStarted2.INSTANCE;
        this.AudioAttributesImplApi21Parcelizer = lambdanotifySeekStarted2.write();
    }

    public final <TResult> isTrackSupported<TResult> IconCompatParcelizer() {
        return AudioAttributesCompatParcelizer(this.write, this.AudioAttributesCompatParcelizer, "ioTask");
    }

    public final <TResult> isTrackSupported<TResult> write() {
        return AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, "Main");
    }

    public final <TResult> isTrackSupported<TResult> AudioAttributesCompatParcelizer(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Tag can't be null");
        }
        isTrackSelected istrackselected = this.MediaBrowserCompatCustomActionResultReceiver.get(str);
        if (istrackselected == null) {
            istrackselected = new isTrackSelected();
            this.MediaBrowserCompatCustomActionResultReceiver.put(str, istrackselected);
        }
        return AudioAttributesCompatParcelizer(istrackselected, this.AudioAttributesCompatParcelizer, "PostAsyncSafely");
    }

    public final <TResult> isTrackSupported<TResult> read() {
        String strWrite;
        CleverTapInstanceConfig cleverTapInstanceConfig = this.read;
        if (cleverTapInstanceConfig != null) {
            strWrite = cleverTapInstanceConfig.write();
        } else {
            strWrite = this.AudioAttributesImplApi21Parcelizer;
        }
        return AudioAttributesCompatParcelizer(strWrite);
    }

    private <TResult> isTrackSupported<TResult> AudioAttributesCompatParcelizer(Executor executor, Executor executor2, String str) {
        if (executor == null || executor2 == null) {
            StringBuilder sb = new StringBuilder("Can't create task ");
            sb.append(str);
            sb.append(" with null executors");
            throw new IllegalArgumentException(sb.toString());
        }
        return new isTrackSupported<>(this.read, executor, executor2, str);
    }
}
