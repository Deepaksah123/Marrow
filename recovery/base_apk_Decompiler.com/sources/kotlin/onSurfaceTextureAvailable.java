package kotlin;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda5;

/* JADX INFO: loaded from: classes2.dex */
public abstract class onSurfaceTextureAvailable implements ExoPlayerImplComponentListenerExternalSyntheticLambda5.RemoteActionCompatParcelizer, surfaceChanged, onVideoDisabled {
    protected final setShuffleModeEnabledInternal AudioAttributesCompatParcelizer;
    private final ExoPlayerImplExternalSyntheticLambda6 AudioAttributesImplApi21Parcelizer;
    private final float[] AudioAttributesImplApi26Parcelizer;
    private final ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, Float> AudioAttributesImplBaseParcelizer;
    private ExoPlayerImplComponentListenerExternalSyntheticLambda5<ColorFilter, ColorFilter> IconCompatParcelizer;
    private final ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, Integer> MediaBrowserCompatCustomActionResultReceiver;
    private final List<ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, Float>> MediaBrowserCompatItemReceiver;
    private float RemoteActionCompatParcelizer;
    private final ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, Float> onCommand;
    private ExoPlayerImplComponentListenerExternalSyntheticLambda5<Float, Float> read;
    final Paint write;
    private final PathMeasure RatingCompat = new PathMeasure();
    private final Path MediaBrowserCompatMediaItem = new Path();
    private final Path MediaDescriptionCompat = new Path();
    private final RectF MediaBrowserCompatSearchResultReceiver = new RectF();
    private final List<read> MediaMetadataCompat = new ArrayList();

    onSurfaceTextureAvailable(ExoPlayerImplExternalSyntheticLambda6 exoPlayerImplExternalSyntheticLambda6, setShuffleModeEnabledInternal setshufflemodeenabledinternal, Paint.Cap cap, Paint.Join join, float f, notifyTrackSelectionPlayWhenReadyChanged notifytrackselectionplaywhenreadychanged, mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal, List<mediaSourceListUpdateRequestedInternal> list, mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternal2) {
        onSurfaceTextureDestroyed onsurfacetexturedestroyed = new onSurfaceTextureDestroyed(1);
        this.write = onsurfacetexturedestroyed;
        this.RemoteActionCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        this.AudioAttributesImplApi21Parcelizer = exoPlayerImplExternalSyntheticLambda6;
        this.AudioAttributesCompatParcelizer = setshufflemodeenabledinternal;
        onsurfacetexturedestroyed.setStyle(Paint.Style.STROKE);
        onsurfacetexturedestroyed.setStrokeCap(cap);
        onsurfacetexturedestroyed.setStrokeJoin(join);
        onsurfacetexturedestroyed.setStrokeMiter(f);
        this.MediaBrowserCompatCustomActionResultReceiver = notifytrackselectionplaywhenreadychanged.read();
        this.onCommand = mediasourcelistupdaterequestedinternal.read();
        if (mediasourcelistupdaterequestedinternal2 == null) {
            this.AudioAttributesImplBaseParcelizer = null;
        } else {
            this.AudioAttributesImplBaseParcelizer = mediasourcelistupdaterequestedinternal2.read();
        }
        this.MediaBrowserCompatItemReceiver = new ArrayList(list.size());
        this.AudioAttributesImplApi26Parcelizer = new float[list.size()];
        for (int i = 0; i < list.size(); i++) {
            this.MediaBrowserCompatItemReceiver.add(list.get(i).read());
        }
        setshufflemodeenabledinternal.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
        setshufflemodeenabledinternal.IconCompatParcelizer(this.onCommand);
        for (int i2 = 0; i2 < this.MediaBrowserCompatItemReceiver.size(); i2++) {
            setshufflemodeenabledinternal.IconCompatParcelizer(this.MediaBrowserCompatItemReceiver.get(i2));
        }
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, Float> exoPlayerImplComponentListenerExternalSyntheticLambda5 = this.AudioAttributesImplBaseParcelizer;
        if (exoPlayerImplComponentListenerExternalSyntheticLambda5 != null) {
            setshufflemodeenabledinternal.IconCompatParcelizer(exoPlayerImplComponentListenerExternalSyntheticLambda5);
        }
        this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(this);
        this.onCommand.RemoteActionCompatParcelizer(this);
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.MediaBrowserCompatItemReceiver.get(i3).RemoteActionCompatParcelizer(this);
        }
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, Float> exoPlayerImplComponentListenerExternalSyntheticLambda52 = this.AudioAttributesImplBaseParcelizer;
        if (exoPlayerImplComponentListenerExternalSyntheticLambda52 != null) {
            exoPlayerImplComponentListenerExternalSyntheticLambda52.RemoteActionCompatParcelizer(this);
        }
        if (setshufflemodeenabledinternal.IconCompatParcelizer() != null) {
            onCameraMotion oncameramotion = setshufflemodeenabledinternal.IconCompatParcelizer().IconCompatParcelizer().read();
            this.read = oncameramotion;
            oncameramotion.RemoteActionCompatParcelizer(this);
            setshufflemodeenabledinternal.IconCompatParcelizer(this.read);
        }
    }

    @Override // o.ExoPlayerImplComponentListenerExternalSyntheticLambda5.RemoteActionCompatParcelizer
    public final void RemoteActionCompatParcelizer() {
        this.AudioAttributesImplApi21Parcelizer.invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    @Override // kotlin.onVideoFrameProcessingOffset
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void write(java.util.List<kotlin.onVideoFrameProcessingOffset> r8, java.util.List<kotlin.onVideoFrameProcessingOffset> r9) {
        /*
            r7 = this;
            int r0 = r8.size()
            int r0 = r0 + (-1)
            r1 = 0
            r2 = r1
        L8:
            if (r0 < 0) goto L22
            java.lang.Object r3 = r8.get(r0)
            o.onVideoFrameProcessingOffset r3 = (kotlin.onVideoFrameProcessingOffset) r3
            boolean r4 = r3 instanceof kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda6
            if (r4 == 0) goto L1f
            o.ExoPlayerImplComponentListenerExternalSyntheticLambda6 r3 = (kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda6) r3
            o.shouldAdvancePlayingPeriod$IconCompatParcelizer r4 = r3.AudioAttributesImplBaseParcelizer()
            o.shouldAdvancePlayingPeriod$IconCompatParcelizer r5 = o.shouldAdvancePlayingPeriod.IconCompatParcelizer.INDIVIDUALLY
            if (r4 != r5) goto L1f
            r2 = r3
        L1f:
            int r0 = r0 + (-1)
            goto L8
        L22:
            if (r2 == 0) goto L27
            r2.read(r7)
        L27:
            int r8 = r9.size()
            int r8 = r8 + (-1)
        L2d:
            if (r8 < 0) goto L6d
            java.lang.Object r0 = r9.get(r8)
            o.onVideoFrameProcessingOffset r0 = (kotlin.onVideoFrameProcessingOffset) r0
            boolean r3 = r0 instanceof kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda6
            r4 = 0
            if (r3 == 0) goto L56
            r3 = r0
            o.ExoPlayerImplComponentListenerExternalSyntheticLambda6 r3 = (kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda6) r3
            o.shouldAdvancePlayingPeriod$IconCompatParcelizer r5 = r3.AudioAttributesImplBaseParcelizer()
            o.shouldAdvancePlayingPeriod$IconCompatParcelizer r6 = o.shouldAdvancePlayingPeriod.IconCompatParcelizer.INDIVIDUALLY
            if (r5 != r6) goto L56
            if (r1 == 0) goto L4c
            java.util.List<o.onSurfaceTextureAvailable$read> r0 = r7.MediaMetadataCompat
            r0.add(r1)
        L4c:
            o.onSurfaceTextureAvailable$read r0 = new o.onSurfaceTextureAvailable$read
            r0.<init>(r3, r4)
            r3.read(r7)
            r1 = r0
            goto L6a
        L56:
            boolean r3 = r0 instanceof kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda0
            if (r3 == 0) goto L6a
            if (r1 != 0) goto L61
            o.onSurfaceTextureAvailable$read r1 = new o.onSurfaceTextureAvailable$read
            r1.<init>(r2, r4)
        L61:
            java.util.List r3 = o.onSurfaceTextureAvailable.read.read(r1)
            o.ExoPlayerImplComponentListenerExternalSyntheticLambda0 r0 = (kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda0) r0
            r3.add(r0)
        L6a:
            int r8 = r8 + (-1)
            goto L2d
        L6d:
            if (r1 == 0) goto L74
            java.util.List<o.onSurfaceTextureAvailable$read> r7 = r7.MediaMetadataCompat
            r7.add(r1)
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.onSurfaceTextureAvailable.write(java.util.List, java.util.List):void");
    }

    public void RemoteActionCompatParcelizer(Canvas canvas, Matrix matrix, int i, access3100 access3100Var) {
        ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
        if (setEncoderPadding.write(matrix)) {
            ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
            return;
        }
        float fIntValue = this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer().intValue() / 100.0f;
        this.write.setAlpha(setColorInfo.RemoteActionCompatParcelizer((int) (i * fIntValue)));
        this.write.setStrokeWidth(((onCameraMotion) this.onCommand).MediaBrowserCompatMediaItem());
        if (this.write.getStrokeWidth() <= BitmapDescriptorFactory.HUE_RED) {
            ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
            return;
        }
        read();
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<ColorFilter, ColorFilter> exoPlayerImplComponentListenerExternalSyntheticLambda5 = this.IconCompatParcelizer;
        if (exoPlayerImplComponentListenerExternalSyntheticLambda5 != null) {
            this.write.setColorFilter(exoPlayerImplComponentListenerExternalSyntheticLambda5.AudioAttributesImplApi26Parcelizer());
        }
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<Float, Float> exoPlayerImplComponentListenerExternalSyntheticLambda52 = this.read;
        if (exoPlayerImplComponentListenerExternalSyntheticLambda52 != null) {
            float fFloatValue = exoPlayerImplComponentListenerExternalSyntheticLambda52.AudioAttributesImplApi26Parcelizer().floatValue();
            if (fFloatValue == BitmapDescriptorFactory.HUE_RED) {
                this.write.setMaskFilter(null);
            } else if (fFloatValue != this.RemoteActionCompatParcelizer) {
                this.write.setMaskFilter(this.AudioAttributesCompatParcelizer.read(fFloatValue));
            }
            this.RemoteActionCompatParcelizer = fFloatValue;
        }
        if (access3100Var != null) {
            access3100Var.write((int) (fIntValue * 255.0f), this.write);
        }
        canvas.save();
        canvas.concat(matrix);
        for (int i2 = 0; i2 < this.MediaMetadataCompat.size(); i2++) {
            read readVar = this.MediaMetadataCompat.get(i2);
            if (readVar.IconCompatParcelizer != null) {
                IconCompatParcelizer(canvas, readVar);
            } else {
                ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
                this.MediaBrowserCompatMediaItem.reset();
                for (int size = readVar.write.size() - 1; size >= 0; size--) {
                    this.MediaBrowserCompatMediaItem.addPath(((ExoPlayerImplComponentListenerExternalSyntheticLambda0) readVar.write.get(size)).write());
                }
                ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
                canvas.drawPath(this.MediaBrowserCompatMediaItem, this.write);
                ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
            }
        }
        canvas.restore();
        ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0103  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void IconCompatParcelizer(android.graphics.Canvas r13, o.onSurfaceTextureAvailable.read r14) {
        /*
            Method dump skipped, instruction units count: 323
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.onSurfaceTextureAvailable.IconCompatParcelizer(android.graphics.Canvas, o.onSurfaceTextureAvailable$read):void");
    }

    @Override // kotlin.onVideoDisabled
    public final void read(RectF rectF, Matrix matrix, boolean z) {
        ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
        this.MediaBrowserCompatMediaItem.reset();
        for (int i = 0; i < this.MediaMetadataCompat.size(); i++) {
            read readVar = this.MediaMetadataCompat.get(i);
            for (int i2 = 0; i2 < readVar.write.size(); i2++) {
                this.MediaBrowserCompatMediaItem.addPath(((ExoPlayerImplComponentListenerExternalSyntheticLambda0) readVar.write.get(i2)).write(), matrix);
            }
        }
        this.MediaBrowserCompatMediaItem.computeBounds(this.MediaBrowserCompatSearchResultReceiver, false);
        float fMediaBrowserCompatMediaItem = ((onCameraMotion) this.onCommand).MediaBrowserCompatMediaItem();
        RectF rectF2 = this.MediaBrowserCompatSearchResultReceiver;
        float f = fMediaBrowserCompatMediaItem / 2.0f;
        rectF2.set(rectF2.left - f, this.MediaBrowserCompatSearchResultReceiver.top - f, this.MediaBrowserCompatSearchResultReceiver.right + f, this.MediaBrowserCompatSearchResultReceiver.bottom + f);
        rectF.set(this.MediaBrowserCompatSearchResultReceiver);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
    }

    private void read() {
        ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
        if (this.MediaBrowserCompatItemReceiver.isEmpty()) {
            ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
            return;
        }
        for (int i = 0; i < this.MediaBrowserCompatItemReceiver.size(); i++) {
            this.AudioAttributesImplApi26Parcelizer[i] = this.MediaBrowserCompatItemReceiver.get(i).AudioAttributesImplApi26Parcelizer().floatValue();
            if (i % 2 == 0) {
                float[] fArr = this.AudioAttributesImplApi26Parcelizer;
                if (fArr[i] < 1.0f) {
                    fArr[i] = 1.0f;
                }
            } else {
                float[] fArr2 = this.AudioAttributesImplApi26Parcelizer;
                if (fArr2[i] < 0.1f) {
                    fArr2[i] = 0.1f;
                }
            }
        }
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, Float> exoPlayerImplComponentListenerExternalSyntheticLambda5 = this.AudioAttributesImplBaseParcelizer;
        this.write.setPathEffect(new DashPathEffect(this.AudioAttributesImplApi26Parcelizer, exoPlayerImplComponentListenerExternalSyntheticLambda5 == null ? BitmapDescriptorFactory.HUE_RED : exoPlayerImplComponentListenerExternalSyntheticLambda5.AudioAttributesImplApi26Parcelizer().floatValue()));
        ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
    }

    @Override // kotlin.maybeUpdateReadingPeriod
    public final void RemoteActionCompatParcelizer(maybeTriggerPendingMessages maybetriggerpendingmessages, int i, List<maybeTriggerPendingMessages> list, maybeTriggerPendingMessages maybetriggerpendingmessages2) {
        setColorInfo.IconCompatParcelizer(maybetriggerpendingmessages, i, list, maybetriggerpendingmessages2, this);
    }

    public <T> void read(T t, setDrmInitData<T> setdrminitdata) {
        if (t == onAudioPositionAdvancing.MediaBrowserCompatMediaItem) {
            this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer((setDrmInitData<Integer>) setdrminitdata);
            return;
        }
        if (t == onAudioPositionAdvancing.onPlayFromUri) {
            this.onCommand.AudioAttributesCompatParcelizer((setDrmInitData<Float>) setdrminitdata);
            return;
        }
        if (t == onAudioPositionAdvancing.RemoteActionCompatParcelizer) {
            ExoPlayerImplComponentListenerExternalSyntheticLambda5<ColorFilter, ColorFilter> exoPlayerImplComponentListenerExternalSyntheticLambda5 = this.IconCompatParcelizer;
            if (exoPlayerImplComponentListenerExternalSyntheticLambda5 != null) {
                this.AudioAttributesCompatParcelizer.write(exoPlayerImplComponentListenerExternalSyntheticLambda5);
            }
            if (setdrminitdata == null) {
                this.IconCompatParcelizer = null;
                return;
            }
            getCurrentLiveOffsetUs getcurrentliveoffsetus = new getCurrentLiveOffsetUs(setdrminitdata);
            this.IconCompatParcelizer = getcurrentliveoffsetus;
            getcurrentliveoffsetus.RemoteActionCompatParcelizer(this);
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer(this.IconCompatParcelizer);
            return;
        }
        if (t == onAudioPositionAdvancing.read) {
            ExoPlayerImplComponentListenerExternalSyntheticLambda5<Float, Float> exoPlayerImplComponentListenerExternalSyntheticLambda52 = this.read;
            if (exoPlayerImplComponentListenerExternalSyntheticLambda52 != null) {
                exoPlayerImplComponentListenerExternalSyntheticLambda52.AudioAttributesCompatParcelizer((setDrmInitData<Float>) setdrminitdata);
                return;
            }
            getCurrentLiveOffsetUs getcurrentliveoffsetus2 = new getCurrentLiveOffsetUs(setdrminitdata);
            this.read = getcurrentliveoffsetus2;
            getcurrentliveoffsetus2.RemoteActionCompatParcelizer(this);
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer(this.read);
        }
    }

    static final class read {
        private final ExoPlayerImplComponentListenerExternalSyntheticLambda6 IconCompatParcelizer;
        private final List<ExoPlayerImplComponentListenerExternalSyntheticLambda0> write;

        /* synthetic */ read(ExoPlayerImplComponentListenerExternalSyntheticLambda6 exoPlayerImplComponentListenerExternalSyntheticLambda6, byte b) {
            this(exoPlayerImplComponentListenerExternalSyntheticLambda6);
        }

        private read(ExoPlayerImplComponentListenerExternalSyntheticLambda6 exoPlayerImplComponentListenerExternalSyntheticLambda6) {
            this.write = new ArrayList();
            this.IconCompatParcelizer = exoPlayerImplComponentListenerExternalSyntheticLambda6;
        }
    }
}
