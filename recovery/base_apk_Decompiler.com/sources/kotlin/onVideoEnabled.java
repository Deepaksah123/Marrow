package kotlin;

import android.graphics.Path;
import android.graphics.PointF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda5;
import kotlin.shouldAdvancePlayingPeriod;

/* JADX INFO: loaded from: classes2.dex */
public final class onVideoEnabled implements ExoPlayerImplComponentListenerExternalSyntheticLambda0, ExoPlayerImplComponentListenerExternalSyntheticLambda5.RemoteActionCompatParcelizer, surfaceChanged {
    private final Path AudioAttributesCompatParcelizer = new Path();
    private final onSurfaceTextureUpdated AudioAttributesImplApi26Parcelizer = new onSurfaceTextureUpdated();
    private final ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, PointF> AudioAttributesImplBaseParcelizer;
    private final String IconCompatParcelizer;
    private final ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, PointF> MediaBrowserCompatCustomActionResultReceiver;
    private final resolveSubsequentPeriod RemoteActionCompatParcelizer;
    private final ExoPlayerImplExternalSyntheticLambda6 read;
    private boolean write;

    public onVideoEnabled(ExoPlayerImplExternalSyntheticLambda6 exoPlayerImplExternalSyntheticLambda6, setShuffleModeEnabledInternal setshufflemodeenabledinternal, resolveSubsequentPeriod resolvesubsequentperiod) {
        this.IconCompatParcelizer = resolvesubsequentperiod.IconCompatParcelizer();
        this.read = exoPlayerImplExternalSyntheticLambda6;
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<PointF, PointF> exoPlayerImplComponentListenerExternalSyntheticLambda5 = resolvesubsequentperiod.read().read();
        this.MediaBrowserCompatCustomActionResultReceiver = exoPlayerImplComponentListenerExternalSyntheticLambda5;
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<PointF, PointF> exoPlayerImplComponentListenerExternalSyntheticLambda52 = resolvesubsequentperiod.RemoteActionCompatParcelizer().read();
        this.AudioAttributesImplBaseParcelizer = exoPlayerImplComponentListenerExternalSyntheticLambda52;
        this.RemoteActionCompatParcelizer = resolvesubsequentperiod;
        setshufflemodeenabledinternal.IconCompatParcelizer(exoPlayerImplComponentListenerExternalSyntheticLambda5);
        setshufflemodeenabledinternal.IconCompatParcelizer(exoPlayerImplComponentListenerExternalSyntheticLambda52);
        exoPlayerImplComponentListenerExternalSyntheticLambda5.RemoteActionCompatParcelizer(this);
        exoPlayerImplComponentListenerExternalSyntheticLambda52.RemoteActionCompatParcelizer(this);
    }

    @Override // o.ExoPlayerImplComponentListenerExternalSyntheticLambda5.RemoteActionCompatParcelizer
    public final void RemoteActionCompatParcelizer() {
        read();
    }

    private void read() {
        this.write = false;
        this.read.invalidateSelf();
    }

    @Override // kotlin.onVideoFrameProcessingOffset
    public final void write(List<onVideoFrameProcessingOffset> list, List<onVideoFrameProcessingOffset> list2) {
        for (int i = 0; i < list.size(); i++) {
            onVideoFrameProcessingOffset onvideoframeprocessingoffset = list.get(i);
            if (onvideoframeprocessingoffset instanceof ExoPlayerImplComponentListenerExternalSyntheticLambda6) {
                ExoPlayerImplComponentListenerExternalSyntheticLambda6 exoPlayerImplComponentListenerExternalSyntheticLambda6 = (ExoPlayerImplComponentListenerExternalSyntheticLambda6) onvideoframeprocessingoffset;
                if (exoPlayerImplComponentListenerExternalSyntheticLambda6.AudioAttributesImplBaseParcelizer() == shouldAdvancePlayingPeriod.IconCompatParcelizer.SIMULTANEOUSLY) {
                    this.AudioAttributesImplApi26Parcelizer.read(exoPlayerImplComponentListenerExternalSyntheticLambda6);
                    exoPlayerImplComponentListenerExternalSyntheticLambda6.read(this);
                }
            }
        }
    }

    @Override // kotlin.onVideoFrameProcessingOffset
    public final String AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda0
    public final Path write() {
        if (this.write) {
            return this.AudioAttributesCompatParcelizer;
        }
        this.AudioAttributesCompatParcelizer.reset();
        if (this.RemoteActionCompatParcelizer.write()) {
            this.write = true;
            return this.AudioAttributesCompatParcelizer;
        }
        PointF pointFAudioAttributesImplApi26Parcelizer = this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer();
        float f = pointFAudioAttributesImplApi26Parcelizer.x / 2.0f;
        float f2 = pointFAudioAttributesImplApi26Parcelizer.y / 2.0f;
        float f3 = f * 0.55228f;
        float f4 = 0.55228f * f2;
        this.AudioAttributesCompatParcelizer.reset();
        if (this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer()) {
            float f5 = -f2;
            this.AudioAttributesCompatParcelizer.moveTo(BitmapDescriptorFactory.HUE_RED, f5);
            Path path = this.AudioAttributesCompatParcelizer;
            float f6 = BitmapDescriptorFactory.HUE_RED - f3;
            float f7 = -f;
            float f8 = BitmapDescriptorFactory.HUE_RED - f4;
            path.cubicTo(f6, f5, f7, f8, f7, BitmapDescriptorFactory.HUE_RED);
            Path path2 = this.AudioAttributesCompatParcelizer;
            float f9 = f4 + BitmapDescriptorFactory.HUE_RED;
            path2.cubicTo(f7, f9, f6, f2, BitmapDescriptorFactory.HUE_RED, f2);
            Path path3 = this.AudioAttributesCompatParcelizer;
            float f10 = f3 + BitmapDescriptorFactory.HUE_RED;
            path3.cubicTo(f10, f2, f, f9, f, BitmapDescriptorFactory.HUE_RED);
            this.AudioAttributesCompatParcelizer.cubicTo(f, f8, f10, f5, BitmapDescriptorFactory.HUE_RED, f5);
        } else {
            float f11 = -f2;
            this.AudioAttributesCompatParcelizer.moveTo(BitmapDescriptorFactory.HUE_RED, f11);
            Path path4 = this.AudioAttributesCompatParcelizer;
            float f12 = f3 + BitmapDescriptorFactory.HUE_RED;
            float f13 = BitmapDescriptorFactory.HUE_RED - f4;
            path4.cubicTo(f12, f11, f, f13, f, BitmapDescriptorFactory.HUE_RED);
            Path path5 = this.AudioAttributesCompatParcelizer;
            float f14 = f4 + BitmapDescriptorFactory.HUE_RED;
            path5.cubicTo(f, f14, f12, f2, BitmapDescriptorFactory.HUE_RED, f2);
            Path path6 = this.AudioAttributesCompatParcelizer;
            float f15 = BitmapDescriptorFactory.HUE_RED - f3;
            float f16 = -f;
            path6.cubicTo(f15, f2, f16, f14, f16, BitmapDescriptorFactory.HUE_RED);
            this.AudioAttributesCompatParcelizer.cubicTo(f16, f13, f15, f11, BitmapDescriptorFactory.HUE_RED, f11);
        }
        PointF pointFAudioAttributesImplApi26Parcelizer2 = this.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi26Parcelizer();
        this.AudioAttributesCompatParcelizer.offset(pointFAudioAttributesImplApi26Parcelizer2.x, pointFAudioAttributesImplApi26Parcelizer2.y);
        this.AudioAttributesCompatParcelizer.close();
        this.AudioAttributesImplApi26Parcelizer.read(this.AudioAttributesCompatParcelizer);
        this.write = true;
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.maybeUpdateReadingPeriod
    public final void RemoteActionCompatParcelizer(maybeTriggerPendingMessages maybetriggerpendingmessages, int i, List<maybeTriggerPendingMessages> list, maybeTriggerPendingMessages maybetriggerpendingmessages2) {
        setColorInfo.IconCompatParcelizer(maybetriggerpendingmessages, i, list, maybetriggerpendingmessages2, this);
    }

    @Override // kotlin.maybeUpdateReadingPeriod
    public final <T> void read(T t, setDrmInitData<T> setdrminitdata) {
        if (t == onAudioPositionAdvancing.MediaBrowserCompatCustomActionResultReceiver) {
            this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer((setDrmInitData<PointF>) setdrminitdata);
        } else if (t == onAudioPositionAdvancing.onFastForward) {
            this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer((setDrmInitData<PointF>) setdrminitdata);
        }
    }
}
