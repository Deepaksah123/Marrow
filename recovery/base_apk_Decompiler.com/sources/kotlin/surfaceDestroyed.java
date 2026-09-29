package kotlin;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda5;

/* JADX INFO: loaded from: classes2.dex */
public final class surfaceDestroyed implements ExoPlayerImplComponentListenerExternalSyntheticLambda5.RemoteActionCompatParcelizer, surfaceChanged, ExoPlayerImplComponentListenerExternalSyntheticLambda0 {
    private final String AudioAttributesCompatParcelizer;
    private final ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, PointF> AudioAttributesImplApi26Parcelizer;
    private final boolean IconCompatParcelizer;
    private final ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, PointF> MediaBrowserCompatItemReceiver;
    private final ExoPlayerImplExternalSyntheticLambda6 RemoteActionCompatParcelizer;
    private final ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, Float> read;
    private boolean write;
    private final Path AudioAttributesImplApi21Parcelizer = new Path();
    private final RectF AudioAttributesImplBaseParcelizer = new RectF();
    private final onSurfaceTextureUpdated RatingCompat = new onSurfaceTextureUpdated();
    private ExoPlayerImplComponentListenerExternalSyntheticLambda5<Float, Float> MediaBrowserCompatCustomActionResultReceiver = null;

    public surfaceDestroyed(ExoPlayerImplExternalSyntheticLambda6 exoPlayerImplExternalSyntheticLambda6, setShuffleModeEnabledInternal setshufflemodeenabledinternal, setForegroundModeInternal setforegroundmodeinternal) {
        this.AudioAttributesCompatParcelizer = setforegroundmodeinternal.AudioAttributesCompatParcelizer();
        this.IconCompatParcelizer = setforegroundmodeinternal.read();
        this.RemoteActionCompatParcelizer = exoPlayerImplExternalSyntheticLambda6;
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<PointF, PointF> exoPlayerImplComponentListenerExternalSyntheticLambda5 = setforegroundmodeinternal.RemoteActionCompatParcelizer().read();
        this.AudioAttributesImplApi26Parcelizer = exoPlayerImplComponentListenerExternalSyntheticLambda5;
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<PointF, PointF> exoPlayerImplComponentListenerExternalSyntheticLambda52 = setforegroundmodeinternal.IconCompatParcelizer().read();
        this.MediaBrowserCompatItemReceiver = exoPlayerImplComponentListenerExternalSyntheticLambda52;
        onCameraMotion oncameramotion = setforegroundmodeinternal.write().read();
        this.read = oncameramotion;
        setshufflemodeenabledinternal.IconCompatParcelizer(exoPlayerImplComponentListenerExternalSyntheticLambda5);
        setshufflemodeenabledinternal.IconCompatParcelizer(exoPlayerImplComponentListenerExternalSyntheticLambda52);
        setshufflemodeenabledinternal.IconCompatParcelizer(oncameramotion);
        exoPlayerImplComponentListenerExternalSyntheticLambda5.RemoteActionCompatParcelizer(this);
        exoPlayerImplComponentListenerExternalSyntheticLambda52.RemoteActionCompatParcelizer(this);
        oncameramotion.RemoteActionCompatParcelizer(this);
    }

    @Override // kotlin.onVideoFrameProcessingOffset
    public final String AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // o.ExoPlayerImplComponentListenerExternalSyntheticLambda5.RemoteActionCompatParcelizer
    public final void RemoteActionCompatParcelizer() {
        read();
    }

    private void read() {
        this.write = false;
        this.RemoteActionCompatParcelizer.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    @Override // kotlin.onVideoFrameProcessingOffset
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void write(java.util.List<kotlin.onVideoFrameProcessingOffset> r5, java.util.List<kotlin.onVideoFrameProcessingOffset> r6) {
        /*
            r4 = this;
            r6 = 0
        L1:
            int r0 = r5.size()
            if (r6 >= r0) goto L34
            java.lang.Object r0 = r5.get(r6)
            o.onVideoFrameProcessingOffset r0 = (kotlin.onVideoFrameProcessingOffset) r0
            boolean r1 = r0 instanceof kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda6
            if (r1 == 0) goto L25
            r1 = r0
            o.ExoPlayerImplComponentListenerExternalSyntheticLambda6 r1 = (kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda6) r1
            o.shouldAdvancePlayingPeriod$IconCompatParcelizer r2 = r1.AudioAttributesImplBaseParcelizer()
            o.shouldAdvancePlayingPeriod$IconCompatParcelizer r3 = o.shouldAdvancePlayingPeriod.IconCompatParcelizer.SIMULTANEOUSLY
            if (r2 != r3) goto L25
            o.onSurfaceTextureUpdated r0 = r4.RatingCompat
            r0.read(r1)
            r1.read(r4)
            goto L31
        L25:
            boolean r1 = r0 instanceof kotlin.surfaceCreated
            if (r1 == 0) goto L31
            o.surfaceCreated r0 = (kotlin.surfaceCreated) r0
            o.ExoPlayerImplComponentListenerExternalSyntheticLambda5 r0 = r0.write()
            r4.MediaBrowserCompatCustomActionResultReceiver = r0
        L31:
            int r6 = r6 + 1
            goto L1
        L34:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.surfaceDestroyed.write(java.util.List, java.util.List):void");
    }

    @Override // kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda0
    public final Path write() {
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<Float, Float> exoPlayerImplComponentListenerExternalSyntheticLambda5;
        if (this.write) {
            return this.AudioAttributesImplApi21Parcelizer;
        }
        this.AudioAttributesImplApi21Parcelizer.reset();
        if (this.IconCompatParcelizer) {
            this.write = true;
            return this.AudioAttributesImplApi21Parcelizer;
        }
        PointF pointFAudioAttributesImplApi26Parcelizer = this.MediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer();
        float f = pointFAudioAttributesImplApi26Parcelizer.x / 2.0f;
        float f2 = pointFAudioAttributesImplApi26Parcelizer.y / 2.0f;
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, Float> exoPlayerImplComponentListenerExternalSyntheticLambda52 = this.read;
        float fMediaBrowserCompatMediaItem = exoPlayerImplComponentListenerExternalSyntheticLambda52 == null ? 0.0f : ((onCameraMotion) exoPlayerImplComponentListenerExternalSyntheticLambda52).MediaBrowserCompatMediaItem();
        if (fMediaBrowserCompatMediaItem == BitmapDescriptorFactory.HUE_RED && (exoPlayerImplComponentListenerExternalSyntheticLambda5 = this.MediaBrowserCompatCustomActionResultReceiver) != null) {
            fMediaBrowserCompatMediaItem = Math.min(exoPlayerImplComponentListenerExternalSyntheticLambda5.AudioAttributesImplApi26Parcelizer().floatValue(), Math.min(f, f2));
        }
        float fMin = Math.min(f, f2);
        if (fMediaBrowserCompatMediaItem > fMin) {
            fMediaBrowserCompatMediaItem = fMin;
        }
        PointF pointFAudioAttributesImplApi26Parcelizer2 = this.AudioAttributesImplApi26Parcelizer.AudioAttributesImplApi26Parcelizer();
        this.AudioAttributesImplApi21Parcelizer.moveTo(pointFAudioAttributesImplApi26Parcelizer2.x + f, (pointFAudioAttributesImplApi26Parcelizer2.y - f2) + fMediaBrowserCompatMediaItem);
        this.AudioAttributesImplApi21Parcelizer.lineTo(pointFAudioAttributesImplApi26Parcelizer2.x + f, (pointFAudioAttributesImplApi26Parcelizer2.y + f2) - fMediaBrowserCompatMediaItem);
        if (fMediaBrowserCompatMediaItem > BitmapDescriptorFactory.HUE_RED) {
            float f3 = fMediaBrowserCompatMediaItem * 2.0f;
            this.AudioAttributesImplBaseParcelizer.set((pointFAudioAttributesImplApi26Parcelizer2.x + f) - f3, (pointFAudioAttributesImplApi26Parcelizer2.y + f2) - f3, pointFAudioAttributesImplApi26Parcelizer2.x + f, pointFAudioAttributesImplApi26Parcelizer2.y + f2);
            this.AudioAttributesImplApi21Parcelizer.arcTo(this.AudioAttributesImplBaseParcelizer, BitmapDescriptorFactory.HUE_RED, 90.0f, false);
        }
        this.AudioAttributesImplApi21Parcelizer.lineTo((pointFAudioAttributesImplApi26Parcelizer2.x - f) + fMediaBrowserCompatMediaItem, pointFAudioAttributesImplApi26Parcelizer2.y + f2);
        if (fMediaBrowserCompatMediaItem > BitmapDescriptorFactory.HUE_RED) {
            float f4 = fMediaBrowserCompatMediaItem * 2.0f;
            this.AudioAttributesImplBaseParcelizer.set(pointFAudioAttributesImplApi26Parcelizer2.x - f, (pointFAudioAttributesImplApi26Parcelizer2.y + f2) - f4, (pointFAudioAttributesImplApi26Parcelizer2.x - f) + f4, pointFAudioAttributesImplApi26Parcelizer2.y + f2);
            this.AudioAttributesImplApi21Parcelizer.arcTo(this.AudioAttributesImplBaseParcelizer, 90.0f, 90.0f, false);
        }
        this.AudioAttributesImplApi21Parcelizer.lineTo(pointFAudioAttributesImplApi26Parcelizer2.x - f, (pointFAudioAttributesImplApi26Parcelizer2.y - f2) + fMediaBrowserCompatMediaItem);
        if (fMediaBrowserCompatMediaItem > BitmapDescriptorFactory.HUE_RED) {
            float f5 = fMediaBrowserCompatMediaItem * 2.0f;
            this.AudioAttributesImplBaseParcelizer.set(pointFAudioAttributesImplApi26Parcelizer2.x - f, pointFAudioAttributesImplApi26Parcelizer2.y - f2, (pointFAudioAttributesImplApi26Parcelizer2.x - f) + f5, (pointFAudioAttributesImplApi26Parcelizer2.y - f2) + f5);
            this.AudioAttributesImplApi21Parcelizer.arcTo(this.AudioAttributesImplBaseParcelizer, 180.0f, 90.0f, false);
        }
        this.AudioAttributesImplApi21Parcelizer.lineTo((pointFAudioAttributesImplApi26Parcelizer2.x + f) - fMediaBrowserCompatMediaItem, pointFAudioAttributesImplApi26Parcelizer2.y - f2);
        if (fMediaBrowserCompatMediaItem > BitmapDescriptorFactory.HUE_RED) {
            float f6 = fMediaBrowserCompatMediaItem * 2.0f;
            this.AudioAttributesImplBaseParcelizer.set((pointFAudioAttributesImplApi26Parcelizer2.x + f) - f6, pointFAudioAttributesImplApi26Parcelizer2.y - f2, pointFAudioAttributesImplApi26Parcelizer2.x + f, (pointFAudioAttributesImplApi26Parcelizer2.y - f2) + f6);
            this.AudioAttributesImplApi21Parcelizer.arcTo(this.AudioAttributesImplBaseParcelizer, 270.0f, 90.0f, false);
        }
        this.AudioAttributesImplApi21Parcelizer.close();
        this.RatingCompat.read(this.AudioAttributesImplApi21Parcelizer);
        this.write = true;
        return this.AudioAttributesImplApi21Parcelizer;
    }

    @Override // kotlin.maybeUpdateReadingPeriod
    public final void RemoteActionCompatParcelizer(maybeTriggerPendingMessages maybetriggerpendingmessages, int i, List<maybeTriggerPendingMessages> list, maybeTriggerPendingMessages maybetriggerpendingmessages2) {
        setColorInfo.IconCompatParcelizer(maybetriggerpendingmessages, i, list, maybetriggerpendingmessages2, this);
    }

    @Override // kotlin.maybeUpdateReadingPeriod
    public final <T> void read(T t, setDrmInitData<T> setdrminitdata) {
        if (t == onAudioPositionAdvancing.onPause) {
            this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer((setDrmInitData<PointF>) setdrminitdata);
        } else if (t == onAudioPositionAdvancing.onFastForward) {
            this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer((setDrmInitData<PointF>) setdrminitdata);
        } else if (t == onAudioPositionAdvancing.write) {
            this.read.AudioAttributesCompatParcelizer((setDrmInitData<Float>) setdrminitdata);
        }
    }
}
