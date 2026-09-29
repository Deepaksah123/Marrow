package kotlin;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.isTimelineReady;

/* JADX INFO: loaded from: classes2.dex */
public final class updatePeriods extends setShuffleModeEnabledInternal {
    private final ExoPlayerImplExternalSyntheticLambda19 AudioAttributesImplApi21Parcelizer;
    private ExoPlayerImplComponentListenerExternalSyntheticLambda5<Integer, Integer> AudioAttributesImplApi26Parcelizer;
    private final Paint AudioAttributesImplBaseParcelizer;
    private final Map<maybeNotifyPlaybackInfoChanged, List<onVideoDecoderInitialized>> MediaBrowserCompatCustomActionResultReceiver;
    private ExoPlayerImplComponentListenerExternalSyntheticLambda5<Integer, Integer> MediaBrowserCompatItemReceiver;
    private final RectF MediaBrowserCompatMediaItem;
    private final ExoPlayerImplExternalSyntheticLambda6 MediaBrowserCompatSearchResultReceiver;
    private ExoPlayerImplComponentListenerExternalSyntheticLambda5<Float, Float> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final Matrix MediaDescriptionCompat;
    private final StringBuilder MediaMetadataCompat;
    private ExoPlayerImplComponentListenerExternalSyntheticLambda5<Integer, Integer> RatingCompat;
    private ExoPlayerImplComponentListenerExternalSyntheticLambda5<Integer, Integer> handleMediaPlayPauseIfPendingOnHandler;
    private ExoPlayerImplComponentListenerExternalSyntheticLambda5<Float, Float> onAddQueueItem;
    private ExoPlayerImplComponentListenerExternalSyntheticLambda5<Integer, Integer> onCommand;
    private final Paint onCustomAction;
    private ExoPlayerImplComponentListenerExternalSyntheticLambda5<Integer, Integer> onFastForward;
    private final deliverMessage onMediaButtonEvent;
    private setShuffleOrderInternal onPause;
    private ExoPlayerImplComponentListenerExternalSyntheticLambda5<Integer, Integer> onPlay;
    private ExoPlayerImplComponentListenerExternalSyntheticLambda5<Integer, Integer> onPlayFromMediaId;
    private ExoPlayerImplComponentListenerExternalSyntheticLambda5<Float, Float> onPlayFromSearch;
    private ExoPlayerImplComponentListenerExternalSyntheticLambda5<Float, Float> onPlayFromUri;
    private ExoPlayerImplComponentListenerExternalSyntheticLambda5<Float, Float> onPrepare;
    private ExoPlayerImplComponentListenerExternalSyntheticLambda5<Typeface, Typeface> onPrepareFromMediaId;
    private final List<AudioAttributesCompatParcelizer> onPrepareFromSearch;
    private final setPresenter<String> write;

    updatePeriods(ExoPlayerImplExternalSyntheticLambda6 exoPlayerImplExternalSyntheticLambda6, stopRenderers stoprenderers) {
        super(exoPlayerImplExternalSyntheticLambda6, stoprenderers);
        this.MediaMetadataCompat = new StringBuilder(2);
        this.MediaBrowserCompatMediaItem = new RectF();
        this.MediaDescriptionCompat = new Matrix();
        this.AudioAttributesImplBaseParcelizer = new Paint() { // from class: o.updatePeriods.3
            {
                setStyle(Paint.Style.FILL);
            }
        };
        this.onCustomAction = new Paint() { // from class: o.updatePeriods.2
            {
                setStyle(Paint.Style.STROKE);
            }
        };
        this.MediaBrowserCompatCustomActionResultReceiver = new HashMap();
        this.write = new setPresenter<>();
        this.onPrepareFromSearch = new ArrayList();
        this.onPause = setShuffleOrderInternal.INDEX;
        this.MediaBrowserCompatSearchResultReceiver = exoPlayerImplExternalSyntheticLambda6;
        this.AudioAttributesImplApi21Parcelizer = stoprenderers.read();
        deliverMessage delivermessage = stoprenderers.onAddQueueItem().read();
        this.onMediaButtonEvent = delivermessage;
        delivermessage.RemoteActionCompatParcelizer(this);
        IconCompatParcelizer(delivermessage);
        reselectTracksInternalAndSeek reselecttracksinternalandseekOnMediaButtonEvent = stoprenderers.onMediaButtonEvent();
        if (reselecttracksinternalandseekOnMediaButtonEvent != null && reselecttracksinternalandseekOnMediaButtonEvent.AudioAttributesCompatParcelizer != null && reselecttracksinternalandseekOnMediaButtonEvent.AudioAttributesCompatParcelizer.IconCompatParcelizer != null) {
            ExoPlayerImplComponentListenerExternalSyntheticLambda5<Integer, Integer> exoPlayerImplComponentListenerExternalSyntheticLambda5 = reselecttracksinternalandseekOnMediaButtonEvent.AudioAttributesCompatParcelizer.IconCompatParcelizer.read();
            this.MediaBrowserCompatItemReceiver = exoPlayerImplComponentListenerExternalSyntheticLambda5;
            exoPlayerImplComponentListenerExternalSyntheticLambda5.RemoteActionCompatParcelizer(this);
            IconCompatParcelizer(this.MediaBrowserCompatItemReceiver);
        }
        if (reselecttracksinternalandseekOnMediaButtonEvent != null && reselecttracksinternalandseekOnMediaButtonEvent.AudioAttributesCompatParcelizer != null && reselecttracksinternalandseekOnMediaButtonEvent.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer != null) {
            ExoPlayerImplComponentListenerExternalSyntheticLambda5<Integer, Integer> exoPlayerImplComponentListenerExternalSyntheticLambda52 = reselecttracksinternalandseekOnMediaButtonEvent.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer.read();
            this.onCommand = exoPlayerImplComponentListenerExternalSyntheticLambda52;
            exoPlayerImplComponentListenerExternalSyntheticLambda52.RemoteActionCompatParcelizer(this);
            IconCompatParcelizer(this.onCommand);
        }
        if (reselecttracksinternalandseekOnMediaButtonEvent != null && reselecttracksinternalandseekOnMediaButtonEvent.AudioAttributesCompatParcelizer != null && reselecttracksinternalandseekOnMediaButtonEvent.AudioAttributesCompatParcelizer.write != null) {
            onCameraMotion oncameramotion = reselecttracksinternalandseekOnMediaButtonEvent.AudioAttributesCompatParcelizer.write.read();
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = oncameramotion;
            oncameramotion.RemoteActionCompatParcelizer(this);
            IconCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        }
        if (reselecttracksinternalandseekOnMediaButtonEvent != null && reselecttracksinternalandseekOnMediaButtonEvent.AudioAttributesCompatParcelizer != null && reselecttracksinternalandseekOnMediaButtonEvent.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer != null) {
            onCameraMotion oncameramotion2 = reselecttracksinternalandseekOnMediaButtonEvent.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.read();
            this.onPrepare = oncameramotion2;
            oncameramotion2.RemoteActionCompatParcelizer(this);
            IconCompatParcelizer(this.onPrepare);
        }
        if (reselecttracksinternalandseekOnMediaButtonEvent != null && reselecttracksinternalandseekOnMediaButtonEvent.AudioAttributesCompatParcelizer != null && reselecttracksinternalandseekOnMediaButtonEvent.AudioAttributesCompatParcelizer.read != null) {
            ExoPlayerImplComponentListenerExternalSyntheticLambda5<Integer, Integer> exoPlayerImplComponentListenerExternalSyntheticLambda53 = reselecttracksinternalandseekOnMediaButtonEvent.AudioAttributesCompatParcelizer.read.read();
            this.RatingCompat = exoPlayerImplComponentListenerExternalSyntheticLambda53;
            exoPlayerImplComponentListenerExternalSyntheticLambda53.RemoteActionCompatParcelizer(this);
            IconCompatParcelizer(this.RatingCompat);
        }
        if (reselecttracksinternalandseekOnMediaButtonEvent != null && reselecttracksinternalandseekOnMediaButtonEvent.RemoteActionCompatParcelizer != null && reselecttracksinternalandseekOnMediaButtonEvent.RemoteActionCompatParcelizer.read != null) {
            ExoPlayerImplComponentListenerExternalSyntheticLambda5<Integer, Integer> exoPlayerImplComponentListenerExternalSyntheticLambda54 = reselecttracksinternalandseekOnMediaButtonEvent.RemoteActionCompatParcelizer.read.read();
            this.onPlayFromMediaId = exoPlayerImplComponentListenerExternalSyntheticLambda54;
            exoPlayerImplComponentListenerExternalSyntheticLambda54.RemoteActionCompatParcelizer(this);
            IconCompatParcelizer(this.onPlayFromMediaId);
        }
        if (reselecttracksinternalandseekOnMediaButtonEvent != null && reselecttracksinternalandseekOnMediaButtonEvent.RemoteActionCompatParcelizer != null && reselecttracksinternalandseekOnMediaButtonEvent.RemoteActionCompatParcelizer.write != null) {
            ExoPlayerImplComponentListenerExternalSyntheticLambda5<Integer, Integer> exoPlayerImplComponentListenerExternalSyntheticLambda55 = reselecttracksinternalandseekOnMediaButtonEvent.RemoteActionCompatParcelizer.write.read();
            this.onFastForward = exoPlayerImplComponentListenerExternalSyntheticLambda55;
            exoPlayerImplComponentListenerExternalSyntheticLambda55.RemoteActionCompatParcelizer(this);
            IconCompatParcelizer(this.onFastForward);
        }
        if (reselecttracksinternalandseekOnMediaButtonEvent != null && reselecttracksinternalandseekOnMediaButtonEvent.RemoteActionCompatParcelizer != null && reselecttracksinternalandseekOnMediaButtonEvent.RemoteActionCompatParcelizer.IconCompatParcelizer != null) {
            ExoPlayerImplComponentListenerExternalSyntheticLambda5<Integer, Integer> exoPlayerImplComponentListenerExternalSyntheticLambda56 = reselecttracksinternalandseekOnMediaButtonEvent.RemoteActionCompatParcelizer.IconCompatParcelizer.read();
            this.onPlay = exoPlayerImplComponentListenerExternalSyntheticLambda56;
            exoPlayerImplComponentListenerExternalSyntheticLambda56.RemoteActionCompatParcelizer(this);
            IconCompatParcelizer(this.onPlay);
        }
        if (reselecttracksinternalandseekOnMediaButtonEvent == null || reselecttracksinternalandseekOnMediaButtonEvent.RemoteActionCompatParcelizer == null) {
            return;
        }
        this.onPause = reselecttracksinternalandseekOnMediaButtonEvent.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.setShuffleModeEnabledInternal, kotlin.onVideoDisabled
    public final void read(RectF rectF, Matrix matrix, boolean z) {
        super.read(rectF, matrix, z);
        rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer().width(), this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer().height());
    }

    @Override // kotlin.setShuffleModeEnabledInternal
    final void IconCompatParcelizer(Canvas canvas, Matrix matrix, int i, access3100 access3100Var) {
        isTimelineReady istimelinereadyAudioAttributesImplApi26Parcelizer = this.onMediaButtonEvent.AudioAttributesImplApi26Parcelizer();
        isUsingPlaceholderPeriod isusingplaceholderperiod = this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi26Parcelizer().get(istimelinereadyAudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer);
        if (isusingplaceholderperiod == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        read(istimelinereadyAudioAttributesImplApi26Parcelizer, i, 0);
        if (this.MediaBrowserCompatSearchResultReceiver.onPause()) {
            IconCompatParcelizer(istimelinereadyAudioAttributesImplApi26Parcelizer, matrix, isusingplaceholderperiod, canvas, i);
        } else {
            RemoteActionCompatParcelizer(istimelinereadyAudioAttributesImplApi26Parcelizer, isusingplaceholderperiod, canvas, i);
        }
        canvas.restore();
    }

    private void read(isTimelineReady istimelineready, int i, int i2) {
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<Integer, Integer> exoPlayerImplComponentListenerExternalSyntheticLambda5 = this.AudioAttributesImplApi26Parcelizer;
        if (exoPlayerImplComponentListenerExternalSyntheticLambda5 != null) {
            this.AudioAttributesImplBaseParcelizer.setColor(exoPlayerImplComponentListenerExternalSyntheticLambda5.AudioAttributesImplApi26Parcelizer().intValue());
        } else if (this.MediaBrowserCompatItemReceiver != null && RemoteActionCompatParcelizer(i2)) {
            this.AudioAttributesImplBaseParcelizer.setColor(this.MediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer().intValue());
        } else {
            this.AudioAttributesImplBaseParcelizer.setColor(istimelineready.read);
        }
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<Integer, Integer> exoPlayerImplComponentListenerExternalSyntheticLambda52 = this.handleMediaPlayPauseIfPendingOnHandler;
        if (exoPlayerImplComponentListenerExternalSyntheticLambda52 != null) {
            this.onCustomAction.setColor(exoPlayerImplComponentListenerExternalSyntheticLambda52.AudioAttributesImplApi26Parcelizer().intValue());
        } else if (this.onCommand != null && RemoteActionCompatParcelizer(i2)) {
            this.onCustomAction.setColor(this.onCommand.AudioAttributesImplApi26Parcelizer().intValue());
        } else {
            this.onCustomAction.setColor(istimelineready.AudioAttributesImplApi26Parcelizer);
        }
        int iIntValue = 100;
        int iIntValue2 = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer() == null ? 100 : this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer().AudioAttributesImplApi26Parcelizer().intValue();
        if (this.RatingCompat != null && RemoteActionCompatParcelizer(i2)) {
            iIntValue = this.RatingCompat.AudioAttributesImplApi26Parcelizer().intValue();
        }
        int iRound = Math.round(((((iIntValue2 * 255.0f) / 100.0f) * (iIntValue / 100.0f)) * i) / 255.0f);
        this.AudioAttributesImplBaseParcelizer.setAlpha(iRound);
        this.onCustomAction.setAlpha(iRound);
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<Float, Float> exoPlayerImplComponentListenerExternalSyntheticLambda53 = this.onAddQueueItem;
        if (exoPlayerImplComponentListenerExternalSyntheticLambda53 != null) {
            this.onCustomAction.setStrokeWidth(exoPlayerImplComponentListenerExternalSyntheticLambda53.AudioAttributesImplApi26Parcelizer().floatValue());
        } else if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != null && RemoteActionCompatParcelizer(i2)) {
            this.onCustomAction.setStrokeWidth(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesImplApi26Parcelizer().floatValue());
        } else {
            this.onCustomAction.setStrokeWidth(istimelineready.MediaDescriptionCompat * setEncoderPadding.IconCompatParcelizer());
        }
    }

    private boolean RemoteActionCompatParcelizer(int i) {
        int length = this.onMediaButtonEvent.AudioAttributesImplApi26Parcelizer().MediaBrowserCompatSearchResultReceiver.length();
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<Integer, Integer> exoPlayerImplComponentListenerExternalSyntheticLambda5 = this.onPlayFromMediaId;
        if (exoPlayerImplComponentListenerExternalSyntheticLambda5 == null || this.onFastForward == null) {
            return true;
        }
        int iMin = Math.min(exoPlayerImplComponentListenerExternalSyntheticLambda5.AudioAttributesImplApi26Parcelizer().intValue(), this.onFastForward.AudioAttributesImplApi26Parcelizer().intValue());
        int iMax = Math.max(this.onPlayFromMediaId.AudioAttributesImplApi26Parcelizer().intValue(), this.onFastForward.AudioAttributesImplApi26Parcelizer().intValue());
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<Integer, Integer> exoPlayerImplComponentListenerExternalSyntheticLambda52 = this.onPlay;
        if (exoPlayerImplComponentListenerExternalSyntheticLambda52 != null) {
            int iIntValue = exoPlayerImplComponentListenerExternalSyntheticLambda52.AudioAttributesImplApi26Parcelizer().intValue();
            iMin += iIntValue;
            iMax += iIntValue;
        }
        if (this.onPause == setShuffleOrderInternal.INDEX) {
            return i >= iMin && i < iMax;
        }
        float f = (i / length) * 100.0f;
        return f >= ((float) iMin) && f < ((float) iMax);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void IconCompatParcelizer(kotlin.isTimelineReady r20, android.graphics.Matrix r21, kotlin.isUsingPlaceholderPeriod r22, android.graphics.Canvas r23, int r24) {
        /*
            r19 = this;
            r8 = r19
            r9 = r20
            o.ExoPlayerImplComponentListenerExternalSyntheticLambda5<java.lang.Float, java.lang.Float> r0 = r8.onPlayFromUri
            if (r0 == 0) goto L13
            java.lang.Object r0 = r0.AudioAttributesImplApi26Parcelizer()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            goto L15
        L13:
            float r0 = r9.AudioAttributesImplBaseParcelizer
        L15:
            r1 = 1120403456(0x42c80000, float:100.0)
            float r10 = r0 / r1
            kotlin.setEncoderPadding.read(r21)
            java.lang.String r0 = r9.MediaBrowserCompatSearchResultReceiver
            java.util.List r11 = IconCompatParcelizer(r0)
            int r12 = r11.size()
            int r0 = r9.RatingCompat
            float r0 = (float) r0
            r1 = 1092616192(0x41200000, float:10.0)
            float r0 = r0 / r1
            o.ExoPlayerImplComponentListenerExternalSyntheticLambda5<java.lang.Float, java.lang.Float> r1 = r8.onPlayFromSearch
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r1.AudioAttributesImplApi26Parcelizer()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            goto L49
        L3b:
            o.ExoPlayerImplComponentListenerExternalSyntheticLambda5<java.lang.Float, java.lang.Float> r1 = r8.onPrepare
            if (r1 == 0) goto L4a
            java.lang.Object r1 = r1.AudioAttributesImplApi26Parcelizer()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
        L49:
            float r0 = r0 + r1
        L4a:
            r13 = r0
            r14 = 0
            r0 = -1
            r7 = r0
            r15 = r14
        L4f:
            if (r15 >= r12) goto Lb9
            java.lang.Object r0 = r11.get(r15)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            android.graphics.PointF r0 = r9.AudioAttributesCompatParcelizer
            if (r0 != 0) goto L5e
            r0 = 0
            goto L62
        L5e:
            android.graphics.PointF r0 = r9.AudioAttributesCompatParcelizer
            float r0 = r0.x
        L62:
            r2 = r0
            r6 = 1
            r0 = r19
            r3 = r22
            r4 = r10
            r5 = r13
            java.util.List r6 = r0.RemoteActionCompatParcelizer(r1, r2, r3, r4, r5, r6)
            r5 = r14
        L6f:
            int r0 = r6.size()
            if (r5 >= r0) goto Lb6
            java.lang.Object r0 = r6.get(r5)
            o.updatePeriods$AudioAttributesCompatParcelizer r0 = (o.updatePeriods.AudioAttributesCompatParcelizer) r0
            int r7 = r7 + 1
            r23.save()
            float r1 = o.updatePeriods.AudioAttributesCompatParcelizer.read(r0)
            r4 = r23
            boolean r1 = r8.read(r4, r9, r7, r1)
            if (r1 == 0) goto La6
            java.lang.String r1 = o.updatePeriods.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(r0)
            r0 = r19
            r2 = r20
            r3 = r22
            r4 = r23
            r16 = r5
            r5 = r10
            r17 = r6
            r6 = r13
            r18 = r7
            r7 = r24
            r0.write(r1, r2, r3, r4, r5, r6, r7)
            goto Lac
        La6:
            r16 = r5
            r17 = r6
            r18 = r7
        Lac:
            r23.restore()
            int r5 = r16 + 1
            r6 = r17
            r7 = r18
            goto L6f
        Lb6:
            int r15 = r15 + 1
            goto L4f
        Lb9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.updatePeriods.IconCompatParcelizer(o.isTimelineReady, android.graphics.Matrix, o.isUsingPlaceholderPeriod, android.graphics.Canvas, int):void");
    }

    private void write(String str, isTimelineReady istimelineready, isUsingPlaceholderPeriod isusingplaceholderperiod, Canvas canvas, float f, float f2, int i) {
        for (int i2 = 0; i2 < str.length(); i2++) {
            maybeNotifyPlaybackInfoChanged maybenotifyplaybackinfochangedIconCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.write().IconCompatParcelizer(maybeNotifyPlaybackInfoChanged.AudioAttributesCompatParcelizer(str.charAt(i2), isusingplaceholderperiod.IconCompatParcelizer(), isusingplaceholderperiod.RemoteActionCompatParcelizer()));
            if (maybenotifyplaybackinfochangedIconCompatParcelizer != null) {
                write(maybenotifyplaybackinfochangedIconCompatParcelizer, f, istimelineready, canvas, i2, i);
                canvas.translate((((float) maybenotifyplaybackinfochangedIconCompatParcelizer.write()) * f * setEncoderPadding.IconCompatParcelizer()) + f2, BitmapDescriptorFactory.HUE_RED);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void RemoteActionCompatParcelizer(kotlin.isTimelineReady r21, kotlin.isUsingPlaceholderPeriod r22, android.graphics.Canvas r23, int r24) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.updatePeriods.RemoteActionCompatParcelizer(o.isTimelineReady, o.isUsingPlaceholderPeriod, android.graphics.Canvas, int):void");
    }

    private boolean read(Canvas canvas, isTimelineReady istimelineready, int i, float f) {
        PointF pointF = istimelineready.write;
        PointF pointF2 = istimelineready.AudioAttributesCompatParcelizer;
        float fIconCompatParcelizer = setEncoderPadding.IconCompatParcelizer();
        float f2 = BitmapDescriptorFactory.HUE_RED;
        float f3 = (i * istimelineready.AudioAttributesImplApi21Parcelizer * fIconCompatParcelizer) + (pointF == null ? 0.0f : (istimelineready.AudioAttributesImplApi21Parcelizer * fIconCompatParcelizer) + pointF.y);
        if (this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer() && pointF2 != null && pointF != null && f3 >= pointF.y + pointF2.y + istimelineready.AudioAttributesImplBaseParcelizer) {
            return false;
        }
        float f4 = pointF == null ? 0.0f : pointF.x;
        if (pointF2 != null) {
            f2 = pointF2.x;
        }
        int i2 = AnonymousClass1.write[istimelineready.MediaBrowserCompatItemReceiver.ordinal()];
        if (i2 == 1) {
            canvas.translate(f4, f3);
        } else if (i2 == 2) {
            canvas.translate((f4 + f2) - f, f3);
        } else if (i2 == 3) {
            canvas.translate((f4 + (f2 / 2.0f)) - (f / 2.0f), f3);
        }
        return true;
    }

    /* JADX INFO: renamed from: o.updatePeriods$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[isTimelineReady.RemoteActionCompatParcelizer.values().length];
            write = iArr;
            try {
                iArr[isTimelineReady.RemoteActionCompatParcelizer.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                write[isTimelineReady.RemoteActionCompatParcelizer.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                write[isTimelineReady.RemoteActionCompatParcelizer.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private Typeface write(isUsingPlaceholderPeriod isusingplaceholderperiod) {
        Typeface typefaceAudioAttributesImplApi26Parcelizer;
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<Typeface, Typeface> exoPlayerImplComponentListenerExternalSyntheticLambda5 = this.onPrepareFromMediaId;
        if (exoPlayerImplComponentListenerExternalSyntheticLambda5 != null && (typefaceAudioAttributesImplApi26Parcelizer = exoPlayerImplComponentListenerExternalSyntheticLambda5.AudioAttributesImplApi26Parcelizer()) != null) {
            return typefaceAudioAttributesImplApi26Parcelizer;
        }
        Typeface typefaceRemoteActionCompatParcelizer = this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(isusingplaceholderperiod);
        return typefaceRemoteActionCompatParcelizer != null ? typefaceRemoteActionCompatParcelizer : isusingplaceholderperiod.read();
    }

    private static List<String> IconCompatParcelizer(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private void write(String str, isTimelineReady istimelineready, Canvas canvas, float f, int i, int i2) {
        int length = 0;
        while (length < str.length()) {
            String strIconCompatParcelizer = IconCompatParcelizer(str, length);
            AudioAttributesCompatParcelizer(strIconCompatParcelizer, istimelineready, canvas, i + length, i2);
            canvas.translate(this.AudioAttributesImplBaseParcelizer.measureText(strIconCompatParcelizer) + f, BitmapDescriptorFactory.HUE_RED);
            length += strIconCompatParcelizer.length();
        }
    }

    private List<AudioAttributesCompatParcelizer> RemoteActionCompatParcelizer(String str, float f, isUsingPlaceholderPeriod isusingplaceholderperiod, float f2, float f3, boolean z) {
        float fMeasureText;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char cCharAt = str.charAt(i4);
            if (z) {
                maybeNotifyPlaybackInfoChanged maybenotifyplaybackinfochangedIconCompatParcelizer = this.AudioAttributesImplApi21Parcelizer.write().IconCompatParcelizer(maybeNotifyPlaybackInfoChanged.AudioAttributesCompatParcelizer(cCharAt, isusingplaceholderperiod.IconCompatParcelizer(), isusingplaceholderperiod.RemoteActionCompatParcelizer()));
                if (maybenotifyplaybackinfochangedIconCompatParcelizer != null) {
                    fMeasureText = ((float) maybenotifyplaybackinfochangedIconCompatParcelizer.write()) * f2 * setEncoderPadding.IconCompatParcelizer();
                }
            } else {
                fMeasureText = this.AudioAttributesImplBaseParcelizer.measureText(str.substring(i4, i4 + 1));
            }
            float f7 = fMeasureText + f3;
            if (cCharAt == ' ') {
                z2 = true;
                f6 = f7;
            } else if (z2) {
                z2 = false;
                i3 = i4;
                f5 = f7;
            } else {
                f5 += f7;
            }
            f4 += f7;
            if (f > BitmapDescriptorFactory.HUE_RED && f4 >= f && cCharAt != ' ') {
                i++;
                AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer2 = AudioAttributesCompatParcelizer(i);
                if (i3 == i2) {
                    AudioAttributesCompatParcelizer2.read(str.substring(i2, i4).trim(), (f4 - f7) - ((r9.length() - r7.length()) * f6));
                    i2 = i4;
                    i3 = i2;
                    f4 = f7;
                    f5 = f4;
                } else {
                    AudioAttributesCompatParcelizer2.read(str.substring(i2, i3 - 1).trim(), ((f4 - f5) - ((r7.length() - r13.length()) * f6)) - f6);
                    f4 = f5;
                    i2 = i3;
                }
            }
        }
        if (f4 > BitmapDescriptorFactory.HUE_RED) {
            i++;
            AudioAttributesCompatParcelizer(i).read(str.substring(i2), f4);
        }
        return this.onPrepareFromSearch.subList(0, i);
    }

    private AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(int i) {
        for (int size = this.onPrepareFromSearch.size(); size < i; size++) {
            this.onPrepareFromSearch.add(new AudioAttributesCompatParcelizer((byte) 0));
        }
        return this.onPrepareFromSearch.get(i - 1);
    }

    private void write(maybeNotifyPlaybackInfoChanged maybenotifyplaybackinfochanged, float f, isTimelineReady istimelineready, Canvas canvas, int i, int i2) {
        read(istimelineready, i2, i);
        List<onVideoDecoderInitialized> listWrite = write(maybenotifyplaybackinfochanged);
        for (int i3 = 0; i3 < listWrite.size(); i3++) {
            Path pathWrite = listWrite.get(i3).write();
            pathWrite.computeBounds(this.MediaBrowserCompatMediaItem, false);
            this.MediaDescriptionCompat.reset();
            this.MediaDescriptionCompat.preTranslate(BitmapDescriptorFactory.HUE_RED, (-istimelineready.IconCompatParcelizer) * setEncoderPadding.IconCompatParcelizer());
            this.MediaDescriptionCompat.preScale(f, f);
            pathWrite.transform(this.MediaDescriptionCompat);
            if (istimelineready.MediaBrowserCompatCustomActionResultReceiver) {
                IconCompatParcelizer(pathWrite, this.AudioAttributesImplBaseParcelizer, canvas);
                IconCompatParcelizer(pathWrite, this.onCustomAction, canvas);
            } else {
                IconCompatParcelizer(pathWrite, this.onCustomAction, canvas);
                IconCompatParcelizer(pathWrite, this.AudioAttributesImplBaseParcelizer, canvas);
            }
        }
    }

    private static void IconCompatParcelizer(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == BitmapDescriptorFactory.HUE_RED) {
                return;
            }
            canvas.drawPath(path, paint);
        }
    }

    private void AudioAttributesCompatParcelizer(String str, isTimelineReady istimelineready, Canvas canvas, int i, int i2) {
        read(istimelineready, i2, i);
        if (istimelineready.MediaBrowserCompatCustomActionResultReceiver) {
            AudioAttributesCompatParcelizer(str, this.AudioAttributesImplBaseParcelizer, canvas);
            AudioAttributesCompatParcelizer(str, this.onCustomAction, canvas);
        } else {
            AudioAttributesCompatParcelizer(str, this.onCustomAction, canvas);
            AudioAttributesCompatParcelizer(str, this.AudioAttributesImplBaseParcelizer, canvas);
        }
    }

    private static void AudioAttributesCompatParcelizer(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() != 0) {
            if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == BitmapDescriptorFactory.HUE_RED) {
                return;
            }
            canvas.drawText(str, 0, str.length(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, paint);
        }
    }

    private List<onVideoDecoderInitialized> write(maybeNotifyPlaybackInfoChanged maybenotifyplaybackinfochanged) {
        if (this.MediaBrowserCompatCustomActionResultReceiver.containsKey(maybenotifyplaybackinfochanged)) {
            return this.MediaBrowserCompatCustomActionResultReceiver.get(maybenotifyplaybackinfochanged);
        }
        List<setOffloadSchedulingEnabledInternal> listAudioAttributesCompatParcelizer = maybenotifyplaybackinfochanged.AudioAttributesCompatParcelizer();
        int size = listAudioAttributesCompatParcelizer.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new onVideoDecoderInitialized(this.MediaBrowserCompatSearchResultReceiver, this, listAudioAttributesCompatParcelizer.get(i), this.AudioAttributesImplApi21Parcelizer));
        }
        this.MediaBrowserCompatCustomActionResultReceiver.put(maybenotifyplaybackinfochanged, arrayList);
        return arrayList;
    }

    private String IconCompatParcelizer(String str, int i) {
        int iCodePointAt = str.codePointAt(i);
        int iCharCount = Character.charCount(iCodePointAt) + i;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (!read(iCodePointAt2)) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j = iCodePointAt;
        if (this.write.AudioAttributesCompatParcelizer(j)) {
            return this.write.IconCompatParcelizer(j);
        }
        this.MediaMetadataCompat.setLength(0);
        while (i < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i);
            this.MediaMetadataCompat.appendCodePoint(iCodePointAt3);
            i += Character.charCount(iCodePointAt3);
        }
        String string = this.MediaMetadataCompat.toString();
        this.write.write(j, string);
        return string;
    }

    private static boolean read(int i) {
        return Character.getType(i) == 16 || Character.getType(i) == 27 || Character.getType(i) == 6 || Character.getType(i) == 28 || Character.getType(i) == 8 || Character.getType(i) == 19;
    }

    @Override // kotlin.setShuffleModeEnabledInternal, kotlin.maybeUpdateReadingPeriod
    public final <T> void read(T t, setDrmInitData<T> setdrminitdata) {
        super.read(t, setdrminitdata);
        if (t == onAudioPositionAdvancing.AudioAttributesCompatParcelizer) {
            ExoPlayerImplComponentListenerExternalSyntheticLambda5<Integer, Integer> exoPlayerImplComponentListenerExternalSyntheticLambda5 = this.AudioAttributesImplApi26Parcelizer;
            if (exoPlayerImplComponentListenerExternalSyntheticLambda5 != null) {
                write(exoPlayerImplComponentListenerExternalSyntheticLambda5);
            }
            if (setdrminitdata == null) {
                this.AudioAttributesImplApi26Parcelizer = null;
                return;
            }
            getCurrentLiveOffsetUs getcurrentliveoffsetus = new getCurrentLiveOffsetUs(setdrminitdata);
            this.AudioAttributesImplApi26Parcelizer = getcurrentliveoffsetus;
            getcurrentliveoffsetus.RemoteActionCompatParcelizer(this);
            IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
            return;
        }
        if (t == onAudioPositionAdvancing.onMediaButtonEvent) {
            ExoPlayerImplComponentListenerExternalSyntheticLambda5<Integer, Integer> exoPlayerImplComponentListenerExternalSyntheticLambda52 = this.handleMediaPlayPauseIfPendingOnHandler;
            if (exoPlayerImplComponentListenerExternalSyntheticLambda52 != null) {
                write(exoPlayerImplComponentListenerExternalSyntheticLambda52);
            }
            if (setdrminitdata == null) {
                this.handleMediaPlayPauseIfPendingOnHandler = null;
                return;
            }
            getCurrentLiveOffsetUs getcurrentliveoffsetus2 = new getCurrentLiveOffsetUs(setdrminitdata);
            this.handleMediaPlayPauseIfPendingOnHandler = getcurrentliveoffsetus2;
            getcurrentliveoffsetus2.RemoteActionCompatParcelizer(this);
            IconCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler);
            return;
        }
        if (t == onAudioPositionAdvancing.onPlayFromUri) {
            ExoPlayerImplComponentListenerExternalSyntheticLambda5<Float, Float> exoPlayerImplComponentListenerExternalSyntheticLambda53 = this.onAddQueueItem;
            if (exoPlayerImplComponentListenerExternalSyntheticLambda53 != null) {
                write(exoPlayerImplComponentListenerExternalSyntheticLambda53);
            }
            if (setdrminitdata == null) {
                this.onAddQueueItem = null;
                return;
            }
            getCurrentLiveOffsetUs getcurrentliveoffsetus3 = new getCurrentLiveOffsetUs(setdrminitdata);
            this.onAddQueueItem = getcurrentliveoffsetus3;
            getcurrentliveoffsetus3.RemoteActionCompatParcelizer(this);
            IconCompatParcelizer(this.onAddQueueItem);
            return;
        }
        if (t == onAudioPositionAdvancing.onPlayFromSearch) {
            ExoPlayerImplComponentListenerExternalSyntheticLambda5<Float, Float> exoPlayerImplComponentListenerExternalSyntheticLambda54 = this.onPlayFromSearch;
            if (exoPlayerImplComponentListenerExternalSyntheticLambda54 != null) {
                write(exoPlayerImplComponentListenerExternalSyntheticLambda54);
            }
            if (setdrminitdata == null) {
                this.onPlayFromSearch = null;
                return;
            }
            getCurrentLiveOffsetUs getcurrentliveoffsetus4 = new getCurrentLiveOffsetUs(setdrminitdata);
            this.onPlayFromSearch = getcurrentliveoffsetus4;
            getcurrentliveoffsetus4.RemoteActionCompatParcelizer(this);
            IconCompatParcelizer(this.onPlayFromSearch);
            return;
        }
        if (t == onAudioPositionAdvancing.onPrepareFromMediaId) {
            ExoPlayerImplComponentListenerExternalSyntheticLambda5<Float, Float> exoPlayerImplComponentListenerExternalSyntheticLambda55 = this.onPlayFromUri;
            if (exoPlayerImplComponentListenerExternalSyntheticLambda55 != null) {
                write(exoPlayerImplComponentListenerExternalSyntheticLambda55);
            }
            if (setdrminitdata == null) {
                this.onPlayFromUri = null;
                return;
            }
            getCurrentLiveOffsetUs getcurrentliveoffsetus5 = new getCurrentLiveOffsetUs(setdrminitdata);
            this.onPlayFromUri = getcurrentliveoffsetus5;
            getcurrentliveoffsetus5.RemoteActionCompatParcelizer(this);
            IconCompatParcelizer(this.onPlayFromUri);
            return;
        }
        if (t == onAudioPositionAdvancing.onSkipToQueueItem) {
            ExoPlayerImplComponentListenerExternalSyntheticLambda5<Typeface, Typeface> exoPlayerImplComponentListenerExternalSyntheticLambda56 = this.onPrepareFromMediaId;
            if (exoPlayerImplComponentListenerExternalSyntheticLambda56 != null) {
                write(exoPlayerImplComponentListenerExternalSyntheticLambda56);
            }
            if (setdrminitdata == null) {
                this.onPrepareFromMediaId = null;
                return;
            }
            getCurrentLiveOffsetUs getcurrentliveoffsetus6 = new getCurrentLiveOffsetUs(setdrminitdata);
            this.onPrepareFromMediaId = getcurrentliveoffsetus6;
            getcurrentliveoffsetus6.RemoteActionCompatParcelizer(this);
            IconCompatParcelizer(this.onPrepareFromMediaId);
            return;
        }
        if (t == onAudioPositionAdvancing.onPrepare) {
            this.onMediaButtonEvent.read(setdrminitdata);
        }
    }

    static class AudioAttributesCompatParcelizer {
        private float AudioAttributesCompatParcelizer;
        private String RemoteActionCompatParcelizer;

        private AudioAttributesCompatParcelizer() {
            this.RemoteActionCompatParcelizer = "";
            this.AudioAttributesCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        }

        /* synthetic */ AudioAttributesCompatParcelizer(byte b) {
            this();
        }

        final void read(String str, float f) {
            this.RemoteActionCompatParcelizer = str;
            this.AudioAttributesCompatParcelizer = f;
        }
    }
}
