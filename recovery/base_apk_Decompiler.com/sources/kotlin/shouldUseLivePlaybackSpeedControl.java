package kotlin;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class shouldUseLivePlaybackSpeedControl extends setShuffleModeEnabledInternal {
    private final onVideoDecoderInitialized AudioAttributesImplApi21Parcelizer;
    private onCameraMotionReset MediaBrowserCompatCustomActionResultReceiver;
    private final startRenderers write;

    shouldUseLivePlaybackSpeedControl(ExoPlayerImplExternalSyntheticLambda6 exoPlayerImplExternalSyntheticLambda6, stopRenderers stoprenderers, startRenderers startrenderers, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19) {
        super(exoPlayerImplExternalSyntheticLambda6, stoprenderers);
        this.write = startrenderers;
        onVideoDecoderInitialized onvideodecoderinitialized = new onVideoDecoderInitialized(exoPlayerImplExternalSyntheticLambda6, this, new setOffloadSchedulingEnabledInternal("__container", stoprenderers.MediaDescriptionCompat(), false), exoPlayerImplExternalSyntheticLambda19);
        this.AudioAttributesImplApi21Parcelizer = onvideodecoderinitialized;
        onvideodecoderinitialized.write(Collections.emptyList(), Collections.emptyList());
        if (read() != null) {
            this.MediaBrowserCompatCustomActionResultReceiver = new onCameraMotionReset(this, this, read());
        }
    }

    @Override // kotlin.setShuffleModeEnabledInternal
    final void IconCompatParcelizer(Canvas canvas, Matrix matrix, int i, access3100 access3100Var) {
        onCameraMotionReset oncameramotionreset = this.MediaBrowserCompatCustomActionResultReceiver;
        if (oncameramotionreset != null) {
            access3100Var = oncameramotionreset.write(matrix, i);
        }
        this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(canvas, matrix, i, access3100Var);
    }

    @Override // kotlin.setShuffleModeEnabledInternal, kotlin.onVideoDisabled
    public final void read(RectF rectF, Matrix matrix, boolean z) {
        super.read(rectF, matrix, z);
        this.AudioAttributesImplApi21Parcelizer.read(rectF, this.RemoteActionCompatParcelizer, z);
    }

    @Override // kotlin.setShuffleModeEnabledInternal
    public final resolveSeekPositionUs IconCompatParcelizer() {
        resolveSeekPositionUs resolveseekpositionusIconCompatParcelizer = super.IconCompatParcelizer();
        return resolveseekpositionusIconCompatParcelizer != null ? resolveseekpositionusIconCompatParcelizer : this.write.IconCompatParcelizer();
    }

    @Override // kotlin.setShuffleModeEnabledInternal
    protected final void AudioAttributesCompatParcelizer(maybeTriggerPendingMessages maybetriggerpendingmessages, int i, List<maybeTriggerPendingMessages> list, maybeTriggerPendingMessages maybetriggerpendingmessages2) {
        this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(maybetriggerpendingmessages, i, list, maybetriggerpendingmessages2);
    }

    @Override // kotlin.setShuffleModeEnabledInternal, kotlin.maybeUpdateReadingPeriod
    public final <T> void read(T t, setDrmInitData<T> setdrminitdata) {
        onCameraMotionReset oncameramotionreset;
        onCameraMotionReset oncameramotionreset2;
        onCameraMotionReset oncameramotionreset3;
        onCameraMotionReset oncameramotionreset4;
        onCameraMotionReset oncameramotionreset5;
        super.read(t, setdrminitdata);
        if (t == onAudioPositionAdvancing.IconCompatParcelizer && (oncameramotionreset5 = this.MediaBrowserCompatCustomActionResultReceiver) != null) {
            oncameramotionreset5.IconCompatParcelizer(setdrminitdata);
            return;
        }
        if (t == onAudioPositionAdvancing.AudioAttributesImplApi21Parcelizer && (oncameramotionreset4 = this.MediaBrowserCompatCustomActionResultReceiver) != null) {
            oncameramotionreset4.read(setdrminitdata);
            return;
        }
        if (t == onAudioPositionAdvancing.AudioAttributesImplBaseParcelizer && (oncameramotionreset3 = this.MediaBrowserCompatCustomActionResultReceiver) != null) {
            oncameramotionreset3.RemoteActionCompatParcelizer(setdrminitdata);
            return;
        }
        if (t == onAudioPositionAdvancing.MediaBrowserCompatItemReceiver && (oncameramotionreset2 = this.MediaBrowserCompatCustomActionResultReceiver) != null) {
            oncameramotionreset2.AudioAttributesCompatParcelizer(setdrminitdata);
        } else {
            if (t != onAudioPositionAdvancing.AudioAttributesImplApi26Parcelizer || (oncameramotionreset = this.MediaBrowserCompatCustomActionResultReceiver) == null) {
                return;
            }
            oncameramotionreset.write(setdrminitdata);
        }
    }
}
