package kotlin;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda5;
import kotlin.setMediaClockPlaybackParameters;
import kotlin.shouldAdvancePlayingPeriod;

/* JADX INFO: loaded from: classes2.dex */
public class ExoPlayerImplComponentListenerExternalSyntheticLambda2 implements ExoPlayerImplComponentListenerExternalSyntheticLambda0, ExoPlayerImplComponentListenerExternalSyntheticLambda5.RemoteActionCompatParcelizer, surfaceChanged {
    private final ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, Float> AudioAttributesCompatParcelizer;
    private final ExoPlayerImplExternalSyntheticLambda6 AudioAttributesImplApi21Parcelizer;
    private final boolean IconCompatParcelizer;
    private final String MediaBrowserCompatItemReceiver;
    private final ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, Float> MediaBrowserCompatMediaItem;
    private final ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, Float> MediaBrowserCompatSearchResultReceiver;
    private final ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, Float> MediaMetadataCompat;
    private final ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, PointF> RatingCompat;
    private boolean RemoteActionCompatParcelizer;
    private final setMediaClockPlaybackParameters.RemoteActionCompatParcelizer handleMediaPlayPauseIfPendingOnHandler;
    private final ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, Float> onCustomAction;
    private final ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, Float> read;
    private final boolean write;
    private static final byte[] $$a = {106, -113, -78, 7, -19, -10, -3, 20, -6, 5};
    private static final int $$b = 206;
    private static int onCommand = 0;
    private static int onAddQueueItem = 1;
    private final Path MediaDescriptionCompat = new Path();
    private final Path AudioAttributesImplApi26Parcelizer = new Path();
    private final PathMeasure AudioAttributesImplBaseParcelizer = new PathMeasure();
    private final float[] MediaBrowserCompatCustomActionResultReceiver = new float[2];
    private final onSurfaceTextureUpdated MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new onSurfaceTextureUpdated();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 39
            int r6 = r6 + 75
            int r7 = r7 + 4
            byte[] r0 = kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda2.$$a
            int r8 = r8 * 2
            int r1 = r8 + 4
            byte[] r1 = new byte[r1]
            int r8 = r8 + 3
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L2e
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            int r7 = r7 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2e:
            int r6 = r6 + r7
            int r6 = r6 + 6
            r7 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda2.a(byte, short, int, java.lang.Object[]):void");
    }

    public ExoPlayerImplComponentListenerExternalSyntheticLambda2(ExoPlayerImplExternalSyntheticLambda6 exoPlayerImplExternalSyntheticLambda6, setShuffleModeEnabledInternal setshufflemodeenabledinternal, setMediaClockPlaybackParameters setmediaclockplaybackparameters) {
        this.AudioAttributesImplApi21Parcelizer = exoPlayerImplExternalSyntheticLambda6;
        this.MediaBrowserCompatItemReceiver = setmediaclockplaybackparameters.AudioAttributesCompatParcelizer();
        setMediaClockPlaybackParameters.RemoteActionCompatParcelizer remoteActionCompatParcelizerMediaBrowserCompatItemReceiver = setmediaclockplaybackparameters.MediaBrowserCompatItemReceiver();
        this.handleMediaPlayPauseIfPendingOnHandler = remoteActionCompatParcelizerMediaBrowserCompatItemReceiver;
        this.IconCompatParcelizer = setmediaclockplaybackparameters.MediaBrowserCompatCustomActionResultReceiver();
        this.write = setmediaclockplaybackparameters.MediaBrowserCompatSearchResultReceiver();
        onCameraMotion oncameramotion = setmediaclockplaybackparameters.AudioAttributesImplApi21Parcelizer().read();
        this.MediaMetadataCompat = oncameramotion;
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<PointF, PointF> exoPlayerImplComponentListenerExternalSyntheticLambda5 = setmediaclockplaybackparameters.AudioAttributesImplApi26Parcelizer().read();
        this.RatingCompat = exoPlayerImplComponentListenerExternalSyntheticLambda5;
        onCameraMotion oncameramotion2 = setmediaclockplaybackparameters.AudioAttributesImplBaseParcelizer().read();
        this.onCustomAction = oncameramotion2;
        onCameraMotion oncameramotion3 = setmediaclockplaybackparameters.IconCompatParcelizer().read();
        this.MediaBrowserCompatMediaItem = oncameramotion3;
        onCameraMotion oncameramotion4 = setmediaclockplaybackparameters.read().read();
        this.MediaBrowserCompatSearchResultReceiver = oncameramotion4;
        if (remoteActionCompatParcelizerMediaBrowserCompatItemReceiver == setMediaClockPlaybackParameters.RemoteActionCompatParcelizer.STAR) {
            this.AudioAttributesCompatParcelizer = setmediaclockplaybackparameters.RemoteActionCompatParcelizer().read();
            this.read = setmediaclockplaybackparameters.write().read();
        } else {
            this.AudioAttributesCompatParcelizer = null;
            this.read = null;
        }
        setshufflemodeenabledinternal.IconCompatParcelizer(oncameramotion);
        setshufflemodeenabledinternal.IconCompatParcelizer(exoPlayerImplComponentListenerExternalSyntheticLambda5);
        setshufflemodeenabledinternal.IconCompatParcelizer(oncameramotion2);
        setshufflemodeenabledinternal.IconCompatParcelizer(oncameramotion3);
        setshufflemodeenabledinternal.IconCompatParcelizer(oncameramotion4);
        if (remoteActionCompatParcelizerMediaBrowserCompatItemReceiver == setMediaClockPlaybackParameters.RemoteActionCompatParcelizer.STAR) {
            setshufflemodeenabledinternal.IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
            setshufflemodeenabledinternal.IconCompatParcelizer(this.read);
        }
        oncameramotion.RemoteActionCompatParcelizer(this);
        exoPlayerImplComponentListenerExternalSyntheticLambda5.RemoteActionCompatParcelizer(this);
        oncameramotion2.RemoteActionCompatParcelizer(this);
        oncameramotion3.RemoteActionCompatParcelizer(this);
        oncameramotion4.RemoteActionCompatParcelizer(this);
        if (remoteActionCompatParcelizerMediaBrowserCompatItemReceiver == setMediaClockPlaybackParameters.RemoteActionCompatParcelizer.STAR) {
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this);
            this.read.RemoteActionCompatParcelizer(this);
        }
    }

    @Override // o.ExoPlayerImplComponentListenerExternalSyntheticLambda5.RemoteActionCompatParcelizer
    public final void RemoteActionCompatParcelizer() {
        MediaBrowserCompatItemReceiver();
    }

    private void MediaBrowserCompatItemReceiver() {
        this.RemoteActionCompatParcelizer = false;
        this.AudioAttributesImplApi21Parcelizer.invalidateSelf();
    }

    @Override // kotlin.onVideoFrameProcessingOffset
    public final void write(List<onVideoFrameProcessingOffset> list, List<onVideoFrameProcessingOffset> list2) {
        for (int i = 0; i < list.size(); i++) {
            onVideoFrameProcessingOffset onvideoframeprocessingoffset = list.get(i);
            if (onvideoframeprocessingoffset instanceof ExoPlayerImplComponentListenerExternalSyntheticLambda6) {
                ExoPlayerImplComponentListenerExternalSyntheticLambda6 exoPlayerImplComponentListenerExternalSyntheticLambda6 = (ExoPlayerImplComponentListenerExternalSyntheticLambda6) onvideoframeprocessingoffset;
                if (exoPlayerImplComponentListenerExternalSyntheticLambda6.AudioAttributesImplBaseParcelizer() == shouldAdvancePlayingPeriod.IconCompatParcelizer.SIMULTANEOUSLY) {
                    this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read(exoPlayerImplComponentListenerExternalSyntheticLambda6);
                    exoPlayerImplComponentListenerExternalSyntheticLambda6.read(this);
                }
            }
        }
    }

    @Override // kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda0
    public final Path write() {
        if (this.RemoteActionCompatParcelizer) {
            return this.MediaDescriptionCompat;
        }
        this.MediaDescriptionCompat.reset();
        if (this.IconCompatParcelizer) {
            this.RemoteActionCompatParcelizer = true;
            return this.MediaDescriptionCompat;
        }
        int i = AnonymousClass2.IconCompatParcelizer[this.handleMediaPlayPauseIfPendingOnHandler.ordinal()];
        if (i == 1) {
            IconCompatParcelizer();
        } else if (i == 2) {
            read();
        }
        this.MediaDescriptionCompat.close();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read(this.MediaDescriptionCompat);
        this.RemoteActionCompatParcelizer = true;
        return this.MediaDescriptionCompat;
    }

    /* JADX INFO: renamed from: o.ExoPlayerImplComponentListenerExternalSyntheticLambda2$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[setMediaClockPlaybackParameters.RemoteActionCompatParcelizer.values().length];
            IconCompatParcelizer = iArr;
            try {
                iArr[setMediaClockPlaybackParameters.RemoteActionCompatParcelizer.STAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                IconCompatParcelizer[setMediaClockPlaybackParameters.RemoteActionCompatParcelizer.POLYGON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @Override // kotlin.onVideoFrameProcessingOffset
    public final String AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompatItemReceiver;
    }

    private void IconCompatParcelizer() {
        int i;
        float f;
        float f2;
        double d;
        float fSin;
        float f3;
        float f4;
        float f5;
        double d2;
        float f6;
        float f7;
        float f8;
        double d3;
        float fFloatValue = this.MediaMetadataCompat.AudioAttributesImplApi26Parcelizer().floatValue();
        double radians = Math.toRadians((this.onCustomAction == null ? 0.0d : r2.AudioAttributesImplApi26Parcelizer().floatValue()) - 90.0d);
        double d4 = fFloatValue;
        float f9 = (float) (6.283185307179586d / d4);
        if (this.write) {
            f9 = -f9;
        }
        float f10 = f9 / 2.0f;
        float f11 = fFloatValue - ((int) fFloatValue);
        int i2 = (f11 > BitmapDescriptorFactory.HUE_RED ? 1 : (f11 == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
        if (i2 != 0) {
            radians += (double) ((1.0f - f11) * f10);
        }
        float fFloatValue2 = this.MediaBrowserCompatMediaItem.AudioAttributesImplApi26Parcelizer().floatValue();
        float fFloatValue3 = this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer().floatValue();
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, Float> exoPlayerImplComponentListenerExternalSyntheticLambda5 = this.read;
        float fFloatValue4 = exoPlayerImplComponentListenerExternalSyntheticLambda5 != null ? exoPlayerImplComponentListenerExternalSyntheticLambda5.AudioAttributesImplApi26Parcelizer().floatValue() / 100.0f : 0.0f;
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, Float> exoPlayerImplComponentListenerExternalSyntheticLambda52 = this.MediaBrowserCompatSearchResultReceiver;
        float fFloatValue5 = exoPlayerImplComponentListenerExternalSyntheticLambda52 != null ? exoPlayerImplComponentListenerExternalSyntheticLambda52.AudioAttributesImplApi26Parcelizer().floatValue() / 100.0f : 0.0f;
        if (i2 != 0) {
            f3 = ((fFloatValue2 - fFloatValue3) * f11) + fFloatValue3;
            i = i2;
            double d5 = f3;
            float fCos = (float) (d5 * Math.cos(radians));
            fSin = (float) (d5 * Math.sin(radians));
            this.MediaDescriptionCompat.moveTo(fCos, fSin);
            d = radians + ((double) ((f9 * f11) / 2.0f));
            f = fCos;
            f2 = f10;
        } else {
            i = i2;
            double d6 = fFloatValue2;
            float fCos2 = (float) (Math.cos(radians) * d6);
            float fSin2 = (float) (d6 * Math.sin(radians));
            this.MediaDescriptionCompat.moveTo(fCos2, fSin2);
            f = fCos2;
            f2 = f10;
            d = radians + ((double) f2);
            fSin = fSin2;
            f3 = BitmapDescriptorFactory.HUE_RED;
        }
        double dCeil = Math.ceil(d4) * 2.0d;
        int i3 = 0;
        float f12 = f2;
        float f13 = f;
        boolean z = false;
        while (true) {
            double d7 = i3;
            if (d7 < dCeil) {
                float f14 = z ? fFloatValue2 : fFloatValue3;
                if (f3 == BitmapDescriptorFactory.HUE_RED || d7 != dCeil - 2.0d) {
                    f4 = f9;
                    f5 = f12;
                } else {
                    f4 = f9;
                    f5 = (f9 * f11) / 2.0f;
                }
                if (f3 == BitmapDescriptorFactory.HUE_RED || d7 != dCeil - 1.0d) {
                    d2 = d7;
                    f6 = f3;
                    f3 = f14;
                } else {
                    d2 = d7;
                    f6 = f3;
                }
                double d8 = f3;
                double d9 = dCeil;
                float fCos3 = (float) (d8 * Math.cos(d));
                float fSin3 = (float) (d8 * Math.sin(d));
                if (fFloatValue4 == BitmapDescriptorFactory.HUE_RED && fFloatValue5 == BitmapDescriptorFactory.HUE_RED) {
                    this.MediaDescriptionCompat.lineTo(fCos3, fSin3);
                    d3 = d;
                    f7 = fFloatValue4;
                    f8 = fFloatValue5;
                } else {
                    f7 = fFloatValue4;
                    double dAtan2 = (float) (Math.atan2(fSin, f13) - 1.5707963267948966d);
                    float fCos4 = (float) Math.cos(dAtan2);
                    float fSin4 = (float) Math.sin(dAtan2);
                    f8 = fFloatValue5;
                    d3 = d;
                    double dAtan22 = (float) (Math.atan2(fSin3, fCos3) - 1.5707963267948966d);
                    float fCos5 = (float) Math.cos(dAtan22);
                    float fSin5 = (float) Math.sin(dAtan22);
                    float f15 = z ? f7 : f8;
                    float f16 = z ? f8 : f7;
                    float f17 = (z ? fFloatValue3 : fFloatValue2) * f15 * 0.47829f;
                    float f18 = fCos4 * f17;
                    float f19 = f17 * fSin4;
                    float f20 = (z ? fFloatValue2 : fFloatValue3) * f16 * 0.47829f;
                    float f21 = fCos5 * f20;
                    float f22 = f20 * fSin5;
                    if (i != 0) {
                        if (i3 == 0) {
                            f18 *= f11;
                            f19 *= f11;
                        } else if (d2 == d9 - 1.0d) {
                            f21 *= f11;
                            f22 *= f11;
                        }
                    }
                    this.MediaDescriptionCompat.cubicTo(f13 - f18, fSin - f19, fCos3 + f21, fSin3 + f22, fCos3, fSin3);
                }
                d = d3 + ((double) f5);
                z = !z;
                i3++;
                f13 = fCos3;
                fSin = fSin3;
                fFloatValue5 = f8;
                fFloatValue4 = f7;
                f3 = f6;
                f9 = f4;
                dCeil = d9;
            } else {
                PointF pointFAudioAttributesImplApi26Parcelizer = this.RatingCompat.AudioAttributesImplApi26Parcelizer();
                this.MediaDescriptionCompat.offset(pointFAudioAttributesImplApi26Parcelizer.x, pointFAudioAttributesImplApi26Parcelizer.y);
                this.MediaDescriptionCompat.close();
                return;
            }
        }
    }

    private void read() {
        double d;
        float f;
        ExoPlayerImplComponentListenerExternalSyntheticLambda2 exoPlayerImplComponentListenerExternalSyntheticLambda2;
        ExoPlayerImplComponentListenerExternalSyntheticLambda2 exoPlayerImplComponentListenerExternalSyntheticLambda22 = this;
        int iFloor = (int) Math.floor(exoPlayerImplComponentListenerExternalSyntheticLambda22.MediaMetadataCompat.AudioAttributesImplApi26Parcelizer().floatValue());
        double radians = Math.toRadians((exoPlayerImplComponentListenerExternalSyntheticLambda22.onCustomAction == null ? 0.0d : r2.AudioAttributesImplApi26Parcelizer().floatValue()) - 90.0d);
        double d2 = iFloor;
        float fFloatValue = exoPlayerImplComponentListenerExternalSyntheticLambda22.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi26Parcelizer().floatValue() / 100.0f;
        float fFloatValue2 = exoPlayerImplComponentListenerExternalSyntheticLambda22.MediaBrowserCompatMediaItem.AudioAttributesImplApi26Parcelizer().floatValue();
        double d3 = fFloatValue2;
        float fCos = (float) (Math.cos(radians) * d3);
        float fSin = (float) (Math.sin(radians) * d3);
        exoPlayerImplComponentListenerExternalSyntheticLambda22.MediaDescriptionCompat.moveTo(fCos, fSin);
        double d4 = (float) (6.283185307179586d / d2);
        double dCeil = Math.ceil(d2);
        double d5 = radians + d4;
        int i = 0;
        while (true) {
            double d6 = i;
            if (d6 < dCeil) {
                int i2 = i;
                float fCos2 = (float) (d3 * Math.cos(d5));
                double d7 = d4;
                float fSin2 = (float) (Math.sin(d5) * d3);
                if (fFloatValue != BitmapDescriptorFactory.HUE_RED) {
                    d = d3;
                    double dAtan2 = (float) (Math.atan2(fSin, fCos) - 1.5707963267948966d);
                    float fCos3 = (float) Math.cos(dAtan2);
                    float fSin3 = (float) Math.sin(dAtan2);
                    f = fSin2;
                    double dAtan22 = (float) (Math.atan2(fSin2, fCos2) - 1.5707963267948966d);
                    float f2 = fFloatValue2 * fFloatValue * 0.25f;
                    float f3 = fCos3 * f2;
                    float f4 = fSin3 * f2;
                    float fCos4 = ((float) Math.cos(dAtan22)) * f2;
                    float fSin4 = f2 * ((float) Math.sin(dAtan22));
                    if (d6 == dCeil - 1.0d) {
                        exoPlayerImplComponentListenerExternalSyntheticLambda2 = this;
                        exoPlayerImplComponentListenerExternalSyntheticLambda2.AudioAttributesImplApi26Parcelizer.reset();
                        exoPlayerImplComponentListenerExternalSyntheticLambda2.AudioAttributesImplApi26Parcelizer.moveTo(fCos, fSin);
                        float f5 = fCos - f3;
                        float f6 = fSin - f4;
                        float f7 = fCos2 + fCos4;
                        float f8 = fSin4 + f;
                        exoPlayerImplComponentListenerExternalSyntheticLambda2.AudioAttributesImplApi26Parcelizer.cubicTo(f5, f6, f7, f8, fCos2, f);
                        exoPlayerImplComponentListenerExternalSyntheticLambda2.AudioAttributesImplBaseParcelizer.setPath(exoPlayerImplComponentListenerExternalSyntheticLambda2.AudioAttributesImplApi26Parcelizer, false);
                        PathMeasure pathMeasure = exoPlayerImplComponentListenerExternalSyntheticLambda2.AudioAttributesImplBaseParcelizer;
                        pathMeasure.getPosTan(pathMeasure.getLength() * 0.9999f, exoPlayerImplComponentListenerExternalSyntheticLambda2.MediaBrowserCompatCustomActionResultReceiver, null);
                        Path path = exoPlayerImplComponentListenerExternalSyntheticLambda2.MediaDescriptionCompat;
                        float[] fArr = exoPlayerImplComponentListenerExternalSyntheticLambda2.MediaBrowserCompatCustomActionResultReceiver;
                        path.cubicTo(f5, f6, f7, f8, fArr[0], fArr[1]);
                    } else {
                        exoPlayerImplComponentListenerExternalSyntheticLambda2 = this;
                        exoPlayerImplComponentListenerExternalSyntheticLambda2.MediaDescriptionCompat.cubicTo(fCos - f3, fSin - f4, fCos2 + fCos4, f + fSin4, fCos2, f);
                    }
                } else {
                    d = d3;
                    f = fSin2;
                    exoPlayerImplComponentListenerExternalSyntheticLambda2 = exoPlayerImplComponentListenerExternalSyntheticLambda22;
                    if (d6 != dCeil - 1.0d) {
                        exoPlayerImplComponentListenerExternalSyntheticLambda2.MediaDescriptionCompat.lineTo(fCos2, f);
                    } else {
                        fSin = f;
                        fCos = fCos2;
                        d4 = d7;
                        i = i2 + 1;
                        exoPlayerImplComponentListenerExternalSyntheticLambda22 = exoPlayerImplComponentListenerExternalSyntheticLambda2;
                        d3 = d;
                    }
                }
                d5 += d7;
                fSin = f;
                fCos = fCos2;
                d4 = d7;
                i = i2 + 1;
                exoPlayerImplComponentListenerExternalSyntheticLambda22 = exoPlayerImplComponentListenerExternalSyntheticLambda2;
                d3 = d;
            } else {
                ExoPlayerImplComponentListenerExternalSyntheticLambda2 exoPlayerImplComponentListenerExternalSyntheticLambda23 = exoPlayerImplComponentListenerExternalSyntheticLambda22;
                PointF pointFAudioAttributesImplApi26Parcelizer = exoPlayerImplComponentListenerExternalSyntheticLambda23.RatingCompat.AudioAttributesImplApi26Parcelizer();
                exoPlayerImplComponentListenerExternalSyntheticLambda23.MediaDescriptionCompat.offset(pointFAudioAttributesImplApi26Parcelizer.x, pointFAudioAttributesImplApi26Parcelizer.y);
                exoPlayerImplComponentListenerExternalSyntheticLambda23.MediaDescriptionCompat.close();
                return;
            }
        }
    }

    @Override // kotlin.maybeUpdateReadingPeriod
    public final void RemoteActionCompatParcelizer(maybeTriggerPendingMessages maybetriggerpendingmessages, int i, List<maybeTriggerPendingMessages> list, maybeTriggerPendingMessages maybetriggerpendingmessages2) {
        setColorInfo.IconCompatParcelizer(maybetriggerpendingmessages, i, list, maybetriggerpendingmessages2, this);
    }

    @Override // kotlin.maybeUpdateReadingPeriod
    public final <T> void read(T t, setDrmInitData<T> setdrminitdata) {
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, Float> exoPlayerImplComponentListenerExternalSyntheticLambda5;
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, Float> exoPlayerImplComponentListenerExternalSyntheticLambda52;
        if (t == onAudioPositionAdvancing.onCustomAction) {
            this.MediaMetadataCompat.AudioAttributesCompatParcelizer((setDrmInitData<Float>) setdrminitdata);
            return;
        }
        if (t == onAudioPositionAdvancing.handleMediaPlayPauseIfPendingOnHandler) {
            this.onCustomAction.AudioAttributesCompatParcelizer((setDrmInitData<Float>) setdrminitdata);
            return;
        }
        if (t == onAudioPositionAdvancing.onFastForward) {
            this.RatingCompat.AudioAttributesCompatParcelizer((setDrmInitData<PointF>) setdrminitdata);
            return;
        }
        if (t == onAudioPositionAdvancing.MediaDescriptionCompat && (exoPlayerImplComponentListenerExternalSyntheticLambda52 = this.AudioAttributesCompatParcelizer) != null) {
            exoPlayerImplComponentListenerExternalSyntheticLambda52.AudioAttributesCompatParcelizer((setDrmInitData<Float>) setdrminitdata);
            return;
        }
        if (t == onAudioPositionAdvancing.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            this.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer((setDrmInitData<Float>) setdrminitdata);
            return;
        }
        if (t == onAudioPositionAdvancing.onCommand && (exoPlayerImplComponentListenerExternalSyntheticLambda5 = this.read) != null) {
            exoPlayerImplComponentListenerExternalSyntheticLambda5.AudioAttributesCompatParcelizer((setDrmInitData<Float>) setdrminitdata);
        } else if (t == onAudioPositionAdvancing.onAddQueueItem) {
            this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer((setDrmInitData<Float>) setdrminitdata);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0640  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object[] IconCompatParcelizer(int r46, int r47, int r48) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda2.IconCompatParcelizer(int, int, int):java.lang.Object[]");
    }
}
