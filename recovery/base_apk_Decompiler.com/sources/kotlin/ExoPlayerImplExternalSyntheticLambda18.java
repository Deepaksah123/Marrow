package kotlin;

import android.content.Context;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class ExoPlayerImplExternalSyntheticLambda18 {
    private static volatile updateTrackSelectionPlaybackSpeed AudioAttributesCompatParcelizer = null;
    public static boolean IconCompatParcelizer = false;
    private static volatile lambdarelease0comgoogleandroidexoplayer2ExoPlayerImplInternal read;
    private static ExoPlayerImplExternalSyntheticLambda14 RemoteActionCompatParcelizer = ExoPlayerImplExternalSyntheticLambda14.AUTOMATIC;
    private static handlePlaybackParameters write = new hasReadingPeriodFinishedReading();

    public static boolean AudioAttributesImplBaseParcelizer() {
        return false;
    }

    public static void IconCompatParcelizer() {
    }

    public static boolean RemoteActionCompatParcelizer() {
        return true;
    }

    public static float write() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    public static updateTrackSelectionPlaybackSpeed RemoteActionCompatParcelizer(Context context) {
        updateTrackSelectionPlaybackSpeed updatetrackselectionplaybackspeed;
        updateTrackSelectionPlaybackSpeed updatetrackselectionplaybackspeed2 = AudioAttributesCompatParcelizer;
        if (updatetrackselectionplaybackspeed2 != null) {
            return updatetrackselectionplaybackspeed2;
        }
        synchronized (updateTrackSelectionPlaybackSpeed.class) {
            updatetrackselectionplaybackspeed = AudioAttributesCompatParcelizer;
            if (updatetrackselectionplaybackspeed == null) {
                updatetrackselectionplaybackspeed = new updateTrackSelectionPlaybackSpeed(AudioAttributesCompatParcelizer(context), new updateIsLoading());
                AudioAttributesCompatParcelizer = updatetrackselectionplaybackspeed;
            }
        }
        return updatetrackselectionplaybackspeed;
    }

    private static lambdarelease0comgoogleandroidexoplayer2ExoPlayerImplInternal AudioAttributesCompatParcelizer(Context context) {
        lambdarelease0comgoogleandroidexoplayer2ExoPlayerImplInternal lambdarelease0comgoogleandroidexoplayer2exoplayerimplinternal;
        final Context applicationContext = context.getApplicationContext();
        lambdarelease0comgoogleandroidexoplayer2ExoPlayerImplInternal lambdarelease0comgoogleandroidexoplayer2exoplayerimplinternal2 = read;
        if (lambdarelease0comgoogleandroidexoplayer2exoplayerimplinternal2 != null) {
            return lambdarelease0comgoogleandroidexoplayer2exoplayerimplinternal2;
        }
        synchronized (lambdarelease0comgoogleandroidexoplayer2ExoPlayerImplInternal.class) {
            lambdarelease0comgoogleandroidexoplayer2exoplayerimplinternal = read;
            if (lambdarelease0comgoogleandroidexoplayer2exoplayerimplinternal == null) {
                lambdarelease0comgoogleandroidexoplayer2exoplayerimplinternal = new lambdarelease0comgoogleandroidexoplayer2ExoPlayerImplInternal(new lambdasendMessageToTargetThread1comgoogleandroidexoplayer2ExoPlayerImplInternal() { // from class: o.onPlaybackInfoUpdate
                    @Override // kotlin.lambdasendMessageToTargetThread1comgoogleandroidexoplayer2ExoPlayerImplInternal
                    public final File read() {
                        return ExoPlayerImplExternalSyntheticLambda18.write(applicationContext);
                    }
                });
                read = lambdarelease0comgoogleandroidexoplayer2exoplayerimplinternal;
            }
        }
        return lambdarelease0comgoogleandroidexoplayer2exoplayerimplinternal;
    }

    static /* synthetic */ File write(Context context) {
        return new File(context.getCacheDir(), "lottie_network_cache");
    }

    public static ExoPlayerImplExternalSyntheticLambda14 AudioAttributesCompatParcelizer() {
        return RemoteActionCompatParcelizer;
    }

    public static handlePlaybackParameters read() {
        return write;
    }
}
