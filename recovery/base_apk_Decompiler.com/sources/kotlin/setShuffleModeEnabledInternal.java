package kotlin;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda5;
import kotlin.sendMessageToTarget;
import kotlin.stopRenderers;

/* JADX INFO: loaded from: classes2.dex */
public abstract class setShuffleModeEnabledInternal implements onVideoDisabled, ExoPlayerImplComponentListenerExternalSyntheticLambda5.RemoteActionCompatParcelizer, maybeUpdateReadingPeriod {
    public final addMediaItemsInternal AudioAttributesCompatParcelizer;
    private final Paint AudioAttributesImplApi21Parcelizer;
    private BlurMaskFilter AudioAttributesImplApi26Parcelizer;
    final ExoPlayerImplExternalSyntheticLambda6 IconCompatParcelizer;
    private float MediaBrowserCompatCustomActionResultReceiver;
    private final RectF MediaBrowserCompatItemReceiver;
    private onCameraMotion MediaBrowserCompatSearchResultReceiver;
    private final RectF MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final String MediaDescriptionCompat;
    protected final Matrix RemoteActionCompatParcelizer;
    private final RectF onAddQueueItem;
    private setShuffleModeEnabledInternal onCommand;
    private getUid onCustomAction;
    private Paint onFastForward;
    private List<setShuffleModeEnabledInternal> onMediaButtonEvent;
    private final Paint onPause;
    private boolean onPlay;
    private setShuffleModeEnabledInternal onPlayFromMediaId;
    private boolean onPlayFromSearch;
    private onSurfaceTextureDestroyed onPlayFromUri;
    private final RectF onPrepare;
    private final RectF onPrepareFromSearch;
    final stopRenderers read;
    private final List<ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, ?>> write;
    private final Path onPrepareFromMediaId = new Path();
    private final Matrix handleMediaPlayPauseIfPendingOnHandler = new Matrix();
    private final Matrix AudioAttributesImplBaseParcelizer = new Matrix();
    private final Paint MediaBrowserCompatMediaItem = new onSurfaceTextureDestroyed(1);
    private final Paint RatingCompat = new onSurfaceTextureDestroyed(PorterDuff.Mode.DST_IN, (byte) 0);
    private final Paint MediaMetadataCompat = new onSurfaceTextureDestroyed(PorterDuff.Mode.DST_OUT, (byte) 0);

    void AudioAttributesCompatParcelizer(maybeTriggerPendingMessages maybetriggerpendingmessages, int i, List<maybeTriggerPendingMessages> list, maybeTriggerPendingMessages maybetriggerpendingmessages2) {
    }

    abstract void IconCompatParcelizer(Canvas canvas, Matrix matrix, int i, access3100 access3100Var);

    @Override // kotlin.onVideoFrameProcessingOffset
    public final void write(List<onVideoFrameProcessingOffset> list, List<onVideoFrameProcessingOffset> list2) {
    }

    static setShuffleModeEnabledInternal IconCompatParcelizer(startRenderers startrenderers, stopRenderers stoprenderers, ExoPlayerImplExternalSyntheticLambda6 exoPlayerImplExternalSyntheticLambda6, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19) {
        switch (AnonymousClass4.write[stoprenderers.AudioAttributesImplBaseParcelizer().ordinal()]) {
            case 1:
                return new shouldUseLivePlaybackSpeedControl(exoPlayerImplExternalSyntheticLambda6, stoprenderers, startrenderers, exoPlayerImplExternalSyntheticLambda19);
            case 2:
                return new startRenderers(exoPlayerImplExternalSyntheticLambda6, stoprenderers, exoPlayerImplExternalSyntheticLambda19.read(stoprenderers.MediaBrowserCompatMediaItem()), exoPlayerImplExternalSyntheticLambda19);
            case 3:
                return new updatePlaybackPositions(exoPlayerImplExternalSyntheticLambda6, stoprenderers);
            case 4:
                return new shouldTransitionToReadyState(exoPlayerImplExternalSyntheticLambda6, stoprenderers);
            case 5:
                return new shouldPlayWhenReady(exoPlayerImplExternalSyntheticLambda6, stoprenderers);
            case 6:
                return new updatePeriods(exoPlayerImplExternalSyntheticLambda6, stoprenderers);
            default:
                StringBuilder sb = new StringBuilder("Unknown layer type ");
                sb.append(stoprenderers.AudioAttributesImplBaseParcelizer());
                access3000.AudioAttributesCompatParcelizer(sb.toString());
                return null;
        }
    }

    setShuffleModeEnabledInternal(ExoPlayerImplExternalSyntheticLambda6 exoPlayerImplExternalSyntheticLambda6, stopRenderers stoprenderers) {
        onSurfaceTextureDestroyed onsurfacetexturedestroyed = new onSurfaceTextureDestroyed(1);
        this.onPause = onsurfacetexturedestroyed;
        this.AudioAttributesImplApi21Parcelizer = new onSurfaceTextureDestroyed(PorterDuff.Mode.CLEAR);
        this.onPrepareFromSearch = new RectF();
        this.MediaBrowserCompatItemReceiver = new RectF();
        this.onAddQueueItem = new RectF();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new RectF();
        this.onPrepare = new RectF();
        this.RemoteActionCompatParcelizer = new Matrix();
        this.write = new ArrayList();
        this.onPlayFromSearch = true;
        this.MediaBrowserCompatCustomActionResultReceiver = BitmapDescriptorFactory.HUE_RED;
        this.IconCompatParcelizer = exoPlayerImplExternalSyntheticLambda6;
        this.read = stoprenderers;
        StringBuilder sb = new StringBuilder();
        sb.append(stoprenderers.AudioAttributesImplApi21Parcelizer());
        sb.append("#draw");
        this.MediaDescriptionCompat = sb.toString();
        if (stoprenderers.MediaBrowserCompatItemReceiver() == stopRenderers.RemoteActionCompatParcelizer.INVERT) {
            onsurfacetexturedestroyed.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            onsurfacetexturedestroyed.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        addMediaItemsInternal addmediaitemsinternalRemoteActionCompatParcelizer = stoprenderers.onFastForward().RemoteActionCompatParcelizer();
        this.AudioAttributesCompatParcelizer = addmediaitemsinternalRemoteActionCompatParcelizer;
        addmediaitemsinternalRemoteActionCompatParcelizer.IconCompatParcelizer(this);
        if (stoprenderers.MediaBrowserCompatCustomActionResultReceiver() != null && !stoprenderers.MediaBrowserCompatCustomActionResultReceiver().isEmpty()) {
            getUid getuid = new getUid(stoprenderers.MediaBrowserCompatCustomActionResultReceiver());
            this.onCustomAction = getuid;
            Iterator<ExoPlayerImplComponentListenerExternalSyntheticLambda5<setMediaItemsInternal, Path>> it = getuid.write().iterator();
            while (it.hasNext()) {
                it.next().RemoteActionCompatParcelizer(this);
            }
            for (ExoPlayerImplComponentListenerExternalSyntheticLambda5<Integer, Integer> exoPlayerImplComponentListenerExternalSyntheticLambda5 : this.onCustomAction.IconCompatParcelizer()) {
                IconCompatParcelizer(exoPlayerImplComponentListenerExternalSyntheticLambda5);
                exoPlayerImplComponentListenerExternalSyntheticLambda5.RemoteActionCompatParcelizer(this);
            }
        }
        AudioAttributesImplApi26Parcelizer();
    }

    void RemoteActionCompatParcelizer(boolean z) {
        if (z && this.onFastForward == null) {
            this.onFastForward = new onSurfaceTextureDestroyed();
        }
        this.onPlay = z;
    }

    @Override // o.ExoPlayerImplComponentListenerExternalSyntheticLambda5.RemoteActionCompatParcelizer
    public final void RemoteActionCompatParcelizer() {
        MediaBrowserCompatCustomActionResultReceiver();
    }

    final stopRenderers write() {
        return this.read;
    }

    final void AudioAttributesCompatParcelizer(setShuffleModeEnabledInternal setshufflemodeenabledinternal) {
        this.onCommand = setshufflemodeenabledinternal;
    }

    private boolean MediaBrowserCompatMediaItem() {
        return this.onCommand != null;
    }

    final void read(setShuffleModeEnabledInternal setshufflemodeenabledinternal) {
        this.onPlayFromMediaId = setshufflemodeenabledinternal;
    }

    private void AudioAttributesImplApi26Parcelizer() {
        if (!this.read.AudioAttributesImplApi26Parcelizer().isEmpty()) {
            onCameraMotion oncameramotion = new onCameraMotion(this.read.AudioAttributesImplApi26Parcelizer());
            this.MediaBrowserCompatSearchResultReceiver = oncameramotion;
            oncameramotion.MediaBrowserCompatItemReceiver();
            this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(new ExoPlayerImplComponentListenerExternalSyntheticLambda5.RemoteActionCompatParcelizer() { // from class: o.setRepeatModeInternal
                @Override // o.ExoPlayerImplComponentListenerExternalSyntheticLambda5.RemoteActionCompatParcelizer
                public final void RemoteActionCompatParcelizer() {
                    this.write.AudioAttributesImplApi21Parcelizer();
                }
            });
            IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi26Parcelizer().floatValue() == 1.0f);
            IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver);
            return;
        }
        IconCompatParcelizer(true);
    }

    final /* synthetic */ void AudioAttributesImplApi21Parcelizer() {
        IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatMediaItem() == 1.0f);
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        this.IconCompatParcelizer.invalidateSelf();
    }

    public final void IconCompatParcelizer(ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, ?> exoPlayerImplComponentListenerExternalSyntheticLambda5) {
        if (exoPlayerImplComponentListenerExternalSyntheticLambda5 == null) {
            return;
        }
        this.write.add(exoPlayerImplComponentListenerExternalSyntheticLambda5);
    }

    public final void write(ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, ?> exoPlayerImplComponentListenerExternalSyntheticLambda5) {
        this.write.remove(exoPlayerImplComponentListenerExternalSyntheticLambda5);
    }

    @Override // kotlin.onVideoDisabled
    public void read(RectF rectF, Matrix matrix, boolean z) {
        this.onPrepareFromSearch.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        MediaBrowserCompatItemReceiver();
        this.RemoteActionCompatParcelizer.set(matrix);
        if (z) {
            List<setShuffleModeEnabledInternal> list = this.onMediaButtonEvent;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.RemoteActionCompatParcelizer.preConcat(this.onMediaButtonEvent.get(size).AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer());
                }
            } else {
                setShuffleModeEnabledInternal setshufflemodeenabledinternal = this.onPlayFromMediaId;
                if (setshufflemodeenabledinternal != null) {
                    this.RemoteActionCompatParcelizer.preConcat(setshufflemodeenabledinternal.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer());
                }
            }
        }
        this.RemoteActionCompatParcelizer.preConcat(this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer());
    }

    @Override // kotlin.onVideoDisabled
    public final void RemoteActionCompatParcelizer(Canvas canvas, Matrix matrix, int i, access3100 access3100Var) {
        Paint paint;
        Integer numAudioAttributesImplApi26Parcelizer;
        ExoPlayerImplExternalSyntheticLambda18.IconCompatParcelizer();
        if (!this.onPlayFromSearch || this.read.onPlay()) {
            ExoPlayerImplExternalSyntheticLambda18.write();
            return;
        }
        MediaBrowserCompatItemReceiver();
        ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
        this.handleMediaPlayPauseIfPendingOnHandler.reset();
        this.handleMediaPlayPauseIfPendingOnHandler.set(matrix);
        for (int size = this.onMediaButtonEvent.size() - 1; size >= 0; size--) {
            this.handleMediaPlayPauseIfPendingOnHandler.preConcat(this.onMediaButtonEvent.get(size).AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer());
        }
        ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, Integer> exoPlayerImplComponentListenerExternalSyntheticLambda5AudioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
        int iIntValue = (int) ((((i / 255.0f) * ((exoPlayerImplComponentListenerExternalSyntheticLambda5AudioAttributesCompatParcelizer == null || (numAudioAttributesImplApi26Parcelizer = exoPlayerImplComponentListenerExternalSyntheticLambda5AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer()) == null) ? 100 : numAudioAttributesImplApi26Parcelizer.intValue())) / 100.0f) * 255.0f);
        if (!MediaBrowserCompatMediaItem() && !MediaMetadataCompat() && MediaBrowserCompatSearchResultReceiver() == seekToInternal.NORMAL) {
            this.handleMediaPlayPauseIfPendingOnHandler.preConcat(this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer());
            ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
            IconCompatParcelizer(canvas, this.handleMediaPlayPauseIfPendingOnHandler, iIntValue, access3100Var);
            ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
            IconCompatParcelizer(ExoPlayerImplExternalSyntheticLambda18.write());
            return;
        }
        ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
        read(this.onPrepareFromSearch, this.handleMediaPlayPauseIfPendingOnHandler, false);
        IconCompatParcelizer(this.onPrepareFromSearch, matrix);
        this.handleMediaPlayPauseIfPendingOnHandler.preConcat(this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer());
        AudioAttributesCompatParcelizer(this.onPrepareFromSearch, this.handleMediaPlayPauseIfPendingOnHandler);
        this.MediaBrowserCompatItemReceiver.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, canvas.getWidth(), canvas.getHeight());
        canvas.getMatrix(this.AudioAttributesImplBaseParcelizer);
        if (!this.AudioAttributesImplBaseParcelizer.isIdentity()) {
            Matrix matrix2 = this.AudioAttributesImplBaseParcelizer;
            matrix2.invert(matrix2);
            this.AudioAttributesImplBaseParcelizer.mapRect(this.MediaBrowserCompatItemReceiver);
        }
        if (!this.onPrepareFromSearch.intersect(this.MediaBrowserCompatItemReceiver)) {
            this.onPrepareFromSearch.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        }
        ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
        if (this.onPrepareFromSearch.width() >= 1.0f && this.onPrepareFromSearch.height() >= 1.0f) {
            ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
            this.MediaBrowserCompatMediaItem.setAlpha(255);
            _verifyNullForPrimitive.write(this.MediaBrowserCompatMediaItem, MediaBrowserCompatSearchResultReceiver().AudioAttributesCompatParcelizer());
            setEncoderPadding.RemoteActionCompatParcelizer(canvas, this.onPrepareFromSearch, this.MediaBrowserCompatMediaItem);
            ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
            if (MediaBrowserCompatSearchResultReceiver() != seekToInternal.MULTIPLY) {
                read(canvas);
            } else {
                if (this.onPlayFromUri == null) {
                    onSurfaceTextureDestroyed onsurfacetexturedestroyed = new onSurfaceTextureDestroyed();
                    this.onPlayFromUri = onsurfacetexturedestroyed;
                    onsurfacetexturedestroyed.setColor(-1);
                }
                canvas.drawRect(this.onPrepareFromSearch.left - 1.0f, this.onPrepareFromSearch.top - 1.0f, this.onPrepareFromSearch.right + 1.0f, this.onPrepareFromSearch.bottom + 1.0f, this.onPlayFromUri);
            }
            ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
            IconCompatParcelizer(canvas, this.handleMediaPlayPauseIfPendingOnHandler, iIntValue, access3100Var);
            ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
            if (MediaMetadataCompat()) {
                IconCompatParcelizer(canvas, this.handleMediaPlayPauseIfPendingOnHandler);
            }
            if (MediaBrowserCompatMediaItem()) {
                ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
                setEncoderPadding.IconCompatParcelizer(canvas, this.onPrepareFromSearch, this.onPause);
                ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
                read(canvas);
                this.onCommand.RemoteActionCompatParcelizer(canvas, matrix, i, (access3100) null);
                ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
                canvas.restore();
                ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
            }
            ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
            canvas.restore();
            ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
        }
        if (this.onPlay && (paint = this.onFastForward) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.onFastForward.setColor(-251901);
            this.onFastForward.setStrokeWidth(4.0f);
            canvas.drawRect(this.onPrepareFromSearch, this.onFastForward);
            this.onFastForward.setStyle(Paint.Style.FILL);
            this.onFastForward.setColor(1357638635);
            canvas.drawRect(this.onPrepareFromSearch, this.onFastForward);
        }
        IconCompatParcelizer(ExoPlayerImplExternalSyntheticLambda18.write());
    }

    private void IconCompatParcelizer(float f) {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer().MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer(this.read.AudioAttributesImplApi21Parcelizer(), f);
    }

    private void read(Canvas canvas) {
        ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
        canvas.drawRect(this.onPrepareFromSearch.left - 1.0f, this.onPrepareFromSearch.top - 1.0f, this.onPrepareFromSearch.right + 1.0f, this.onPrepareFromSearch.bottom + 1.0f, this.AudioAttributesImplApi21Parcelizer);
        ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
    }

    private void AudioAttributesCompatParcelizer(RectF rectF, Matrix matrix) {
        this.onAddQueueItem.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        if (MediaMetadataCompat()) {
            int size = this.onCustomAction.RemoteActionCompatParcelizer().size();
            for (int i = 0; i < size; i++) {
                sendMessageToTarget sendmessagetotarget = this.onCustomAction.RemoteActionCompatParcelizer().get(i);
                Path pathAudioAttributesImplApi26Parcelizer = this.onCustomAction.write().get(i).AudioAttributesImplApi26Parcelizer();
                if (pathAudioAttributesImplApi26Parcelizer != null) {
                    this.onPrepareFromMediaId.set(pathAudioAttributesImplApi26Parcelizer);
                    this.onPrepareFromMediaId.transform(matrix);
                    int i2 = AnonymousClass4.read[sendmessagetotarget.AudioAttributesCompatParcelizer().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        return;
                    }
                    if ((i2 == 3 || i2 == 4) && sendmessagetotarget.IconCompatParcelizer()) {
                        return;
                    }
                    this.onPrepareFromMediaId.computeBounds(this.onPrepare, false);
                    if (i == 0) {
                        this.onAddQueueItem.set(this.onPrepare);
                    } else {
                        RectF rectF2 = this.onAddQueueItem;
                        rectF2.set(Math.min(rectF2.left, this.onPrepare.left), Math.min(this.onAddQueueItem.top, this.onPrepare.top), Math.max(this.onAddQueueItem.right, this.onPrepare.right), Math.max(this.onAddQueueItem.bottom, this.onPrepare.bottom));
                    }
                }
            }
            if (rectF.intersect(this.onAddQueueItem)) {
                return;
            }
            rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        }
    }

    /* JADX INFO: renamed from: o.setShuffleModeEnabledInternal$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] read;
        static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[sendMessageToTarget.AudioAttributesCompatParcelizer.values().length];
            read = iArr;
            try {
                iArr[sendMessageToTarget.AudioAttributesCompatParcelizer.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                read[sendMessageToTarget.AudioAttributesCompatParcelizer.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                read[sendMessageToTarget.AudioAttributesCompatParcelizer.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                read[sendMessageToTarget.AudioAttributesCompatParcelizer.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[stopRenderers.AudioAttributesCompatParcelizer.values().length];
            write = iArr2;
            try {
                iArr2[stopRenderers.AudioAttributesCompatParcelizer.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                write[stopRenderers.AudioAttributesCompatParcelizer.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                write[stopRenderers.AudioAttributesCompatParcelizer.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                write[stopRenderers.AudioAttributesCompatParcelizer.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                write[stopRenderers.AudioAttributesCompatParcelizer.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                write[stopRenderers.AudioAttributesCompatParcelizer.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                write[stopRenderers.AudioAttributesCompatParcelizer.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private void IconCompatParcelizer(RectF rectF, Matrix matrix) {
        if (!MediaBrowserCompatMediaItem() || this.read.MediaBrowserCompatItemReceiver() == stopRenderers.RemoteActionCompatParcelizer.INVERT) {
            return;
        }
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        this.onCommand.read(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, matrix, true);
        if (rectF.intersect(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver)) {
            return;
        }
        rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    private void IconCompatParcelizer(Canvas canvas, Matrix matrix) {
        ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
        setEncoderPadding.IconCompatParcelizer(canvas, this.onPrepareFromSearch, this.RatingCompat);
        ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
        for (int i = 0; i < this.onCustomAction.RemoteActionCompatParcelizer().size(); i++) {
            sendMessageToTarget sendmessagetotarget = this.onCustomAction.RemoteActionCompatParcelizer().get(i);
            ExoPlayerImplComponentListenerExternalSyntheticLambda5<setMediaItemsInternal, Path> exoPlayerImplComponentListenerExternalSyntheticLambda5 = this.onCustomAction.write().get(i);
            ExoPlayerImplComponentListenerExternalSyntheticLambda5<Integer, Integer> exoPlayerImplComponentListenerExternalSyntheticLambda52 = this.onCustomAction.IconCompatParcelizer().get(i);
            int i2 = AnonymousClass4.read[sendmessagetotarget.AudioAttributesCompatParcelizer().ordinal()];
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == 0) {
                        this.MediaBrowserCompatMediaItem.setColor(-16777216);
                        this.MediaBrowserCompatMediaItem.setAlpha(255);
                        canvas.drawRect(this.onPrepareFromSearch, this.MediaBrowserCompatMediaItem);
                    }
                    if (sendmessagetotarget.IconCompatParcelizer()) {
                        write(canvas, matrix, exoPlayerImplComponentListenerExternalSyntheticLambda5, exoPlayerImplComponentListenerExternalSyntheticLambda52);
                    } else {
                        read(canvas, matrix, exoPlayerImplComponentListenerExternalSyntheticLambda5);
                    }
                } else if (i2 != 3) {
                    if (i2 == 4) {
                        if (sendmessagetotarget.IconCompatParcelizer()) {
                            read(canvas, matrix, exoPlayerImplComponentListenerExternalSyntheticLambda5, exoPlayerImplComponentListenerExternalSyntheticLambda52);
                        } else {
                            IconCompatParcelizer(canvas, matrix, exoPlayerImplComponentListenerExternalSyntheticLambda5, exoPlayerImplComponentListenerExternalSyntheticLambda52);
                        }
                    }
                } else if (sendmessagetotarget.IconCompatParcelizer()) {
                    RemoteActionCompatParcelizer(canvas, matrix, exoPlayerImplComponentListenerExternalSyntheticLambda5, exoPlayerImplComponentListenerExternalSyntheticLambda52);
                } else {
                    AudioAttributesCompatParcelizer(canvas, matrix, exoPlayerImplComponentListenerExternalSyntheticLambda5, exoPlayerImplComponentListenerExternalSyntheticLambda52);
                }
            } else if (AudioAttributesImplBaseParcelizer()) {
                this.MediaBrowserCompatMediaItem.setAlpha(255);
                canvas.drawRect(this.onPrepareFromSearch, this.MediaBrowserCompatMediaItem);
            }
        }
        ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
        canvas.restore();
        ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
    }

    private boolean AudioAttributesImplBaseParcelizer() {
        if (this.onCustomAction.write().isEmpty()) {
            return false;
        }
        for (int i = 0; i < this.onCustomAction.RemoteActionCompatParcelizer().size(); i++) {
            if (this.onCustomAction.RemoteActionCompatParcelizer().get(i).AudioAttributesCompatParcelizer() != sendMessageToTarget.AudioAttributesCompatParcelizer.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void IconCompatParcelizer(Canvas canvas, Matrix matrix, ExoPlayerImplComponentListenerExternalSyntheticLambda5<setMediaItemsInternal, Path> exoPlayerImplComponentListenerExternalSyntheticLambda5, ExoPlayerImplComponentListenerExternalSyntheticLambda5<Integer, Integer> exoPlayerImplComponentListenerExternalSyntheticLambda52) {
        this.onPrepareFromMediaId.set(exoPlayerImplComponentListenerExternalSyntheticLambda5.AudioAttributesImplApi26Parcelizer());
        this.onPrepareFromMediaId.transform(matrix);
        this.MediaBrowserCompatMediaItem.setAlpha((int) (exoPlayerImplComponentListenerExternalSyntheticLambda52.AudioAttributesImplApi26Parcelizer().intValue() * 2.55f));
        canvas.drawPath(this.onPrepareFromMediaId, this.MediaBrowserCompatMediaItem);
    }

    private void read(Canvas canvas, Matrix matrix, ExoPlayerImplComponentListenerExternalSyntheticLambda5<setMediaItemsInternal, Path> exoPlayerImplComponentListenerExternalSyntheticLambda5, ExoPlayerImplComponentListenerExternalSyntheticLambda5<Integer, Integer> exoPlayerImplComponentListenerExternalSyntheticLambda52) {
        setEncoderPadding.RemoteActionCompatParcelizer(canvas, this.onPrepareFromSearch, this.MediaBrowserCompatMediaItem);
        canvas.drawRect(this.onPrepareFromSearch, this.MediaBrowserCompatMediaItem);
        this.onPrepareFromMediaId.set(exoPlayerImplComponentListenerExternalSyntheticLambda5.AudioAttributesImplApi26Parcelizer());
        this.onPrepareFromMediaId.transform(matrix);
        this.MediaBrowserCompatMediaItem.setAlpha((int) (exoPlayerImplComponentListenerExternalSyntheticLambda52.AudioAttributesImplApi26Parcelizer().intValue() * 2.55f));
        canvas.drawPath(this.onPrepareFromMediaId, this.MediaMetadataCompat);
        canvas.restore();
    }

    private void read(Canvas canvas, Matrix matrix, ExoPlayerImplComponentListenerExternalSyntheticLambda5<setMediaItemsInternal, Path> exoPlayerImplComponentListenerExternalSyntheticLambda5) {
        this.onPrepareFromMediaId.set(exoPlayerImplComponentListenerExternalSyntheticLambda5.AudioAttributesImplApi26Parcelizer());
        this.onPrepareFromMediaId.transform(matrix);
        canvas.drawPath(this.onPrepareFromMediaId, this.MediaMetadataCompat);
    }

    private void write(Canvas canvas, Matrix matrix, ExoPlayerImplComponentListenerExternalSyntheticLambda5<setMediaItemsInternal, Path> exoPlayerImplComponentListenerExternalSyntheticLambda5, ExoPlayerImplComponentListenerExternalSyntheticLambda5<Integer, Integer> exoPlayerImplComponentListenerExternalSyntheticLambda52) {
        setEncoderPadding.RemoteActionCompatParcelizer(canvas, this.onPrepareFromSearch, this.MediaMetadataCompat);
        canvas.drawRect(this.onPrepareFromSearch, this.MediaBrowserCompatMediaItem);
        this.MediaMetadataCompat.setAlpha((int) (exoPlayerImplComponentListenerExternalSyntheticLambda52.AudioAttributesImplApi26Parcelizer().intValue() * 2.55f));
        this.onPrepareFromMediaId.set(exoPlayerImplComponentListenerExternalSyntheticLambda5.AudioAttributesImplApi26Parcelizer());
        this.onPrepareFromMediaId.transform(matrix);
        canvas.drawPath(this.onPrepareFromMediaId, this.MediaMetadataCompat);
        canvas.restore();
    }

    private void AudioAttributesCompatParcelizer(Canvas canvas, Matrix matrix, ExoPlayerImplComponentListenerExternalSyntheticLambda5<setMediaItemsInternal, Path> exoPlayerImplComponentListenerExternalSyntheticLambda5, ExoPlayerImplComponentListenerExternalSyntheticLambda5<Integer, Integer> exoPlayerImplComponentListenerExternalSyntheticLambda52) {
        setEncoderPadding.RemoteActionCompatParcelizer(canvas, this.onPrepareFromSearch, this.RatingCompat);
        this.onPrepareFromMediaId.set(exoPlayerImplComponentListenerExternalSyntheticLambda5.AudioAttributesImplApi26Parcelizer());
        this.onPrepareFromMediaId.transform(matrix);
        this.MediaBrowserCompatMediaItem.setAlpha((int) (exoPlayerImplComponentListenerExternalSyntheticLambda52.AudioAttributesImplApi26Parcelizer().intValue() * 2.55f));
        canvas.drawPath(this.onPrepareFromMediaId, this.MediaBrowserCompatMediaItem);
        canvas.restore();
    }

    private void RemoteActionCompatParcelizer(Canvas canvas, Matrix matrix, ExoPlayerImplComponentListenerExternalSyntheticLambda5<setMediaItemsInternal, Path> exoPlayerImplComponentListenerExternalSyntheticLambda5, ExoPlayerImplComponentListenerExternalSyntheticLambda5<Integer, Integer> exoPlayerImplComponentListenerExternalSyntheticLambda52) {
        setEncoderPadding.RemoteActionCompatParcelizer(canvas, this.onPrepareFromSearch, this.RatingCompat);
        canvas.drawRect(this.onPrepareFromSearch, this.MediaBrowserCompatMediaItem);
        this.MediaMetadataCompat.setAlpha((int) (exoPlayerImplComponentListenerExternalSyntheticLambda52.AudioAttributesImplApi26Parcelizer().intValue() * 2.55f));
        this.onPrepareFromMediaId.set(exoPlayerImplComponentListenerExternalSyntheticLambda5.AudioAttributesImplApi26Parcelizer());
        this.onPrepareFromMediaId.transform(matrix);
        canvas.drawPath(this.onPrepareFromMediaId, this.MediaMetadataCompat);
        canvas.restore();
    }

    private boolean MediaMetadataCompat() {
        getUid getuid = this.onCustomAction;
        return (getuid == null || getuid.write().isEmpty()) ? false : true;
    }

    private void IconCompatParcelizer(boolean z) {
        if (z != this.onPlayFromSearch) {
            this.onPlayFromSearch = z;
            MediaBrowserCompatCustomActionResultReceiver();
        }
    }

    void RemoteActionCompatParcelizer(float f) {
        ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(f);
        ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
        if (this.onCustomAction != null) {
            ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
            for (int i = 0; i < this.onCustomAction.write().size(); i++) {
                this.onCustomAction.write().get(i).AudioAttributesCompatParcelizer(f);
            }
            ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
        }
        if (this.MediaBrowserCompatSearchResultReceiver != null) {
            ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
            this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer(f);
            ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
        }
        if (this.onCommand != null) {
            ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
            this.onCommand.RemoteActionCompatParcelizer(f);
            ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
        }
        ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
        for (int i2 = 0; i2 < this.write.size(); i2++) {
            this.write.get(i2).AudioAttributesCompatParcelizer(f);
        }
        ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
    }

    private void MediaBrowserCompatItemReceiver() {
        if (this.onMediaButtonEvent == null) {
            if (this.onPlayFromMediaId == null) {
                this.onMediaButtonEvent = Collections.emptyList();
                return;
            }
            this.onMediaButtonEvent = new ArrayList();
            for (setShuffleModeEnabledInternal setshufflemodeenabledinternal = this.onPlayFromMediaId; setshufflemodeenabledinternal != null; setshufflemodeenabledinternal = setshufflemodeenabledinternal.onPlayFromMediaId) {
                this.onMediaButtonEvent.add(setshufflemodeenabledinternal);
            }
        }
    }

    @Override // kotlin.onVideoFrameProcessingOffset
    public final String AudioAttributesCompatParcelizer() {
        return this.read.AudioAttributesImplApi21Parcelizer();
    }

    public resolveSeekPositionUs IconCompatParcelizer() {
        return this.read.RemoteActionCompatParcelizer();
    }

    private seekToInternal MediaBrowserCompatSearchResultReceiver() {
        return this.read.write();
    }

    public final BlurMaskFilter read(float f) {
        if (this.MediaBrowserCompatCustomActionResultReceiver == f) {
            return this.AudioAttributesImplApi26Parcelizer;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.AudioAttributesImplApi26Parcelizer = blurMaskFilter;
        this.MediaBrowserCompatCustomActionResultReceiver = f;
        return blurMaskFilter;
    }

    public final ExoPlayerImplInternalExternalSyntheticLambda2 read() {
        return this.read.IconCompatParcelizer();
    }

    @Override // kotlin.maybeUpdateReadingPeriod
    public final void RemoteActionCompatParcelizer(maybeTriggerPendingMessages maybetriggerpendingmessages, int i, List<maybeTriggerPendingMessages> list, maybeTriggerPendingMessages maybetriggerpendingmessages2) {
        setShuffleModeEnabledInternal setshufflemodeenabledinternal = this.onCommand;
        if (setshufflemodeenabledinternal != null) {
            maybeTriggerPendingMessages maybetriggerpendingmessagesWrite = maybetriggerpendingmessages2.write(setshufflemodeenabledinternal.AudioAttributesCompatParcelizer());
            if (maybetriggerpendingmessages.IconCompatParcelizer(this.onCommand.AudioAttributesCompatParcelizer(), i)) {
                list.add(maybetriggerpendingmessagesWrite.IconCompatParcelizer(this.onCommand));
            }
            if (maybetriggerpendingmessages.read(this.onCommand.AudioAttributesCompatParcelizer(), i) && maybetriggerpendingmessages.AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer(), i)) {
                this.onCommand.AudioAttributesCompatParcelizer(maybetriggerpendingmessages, maybetriggerpendingmessages.RemoteActionCompatParcelizer(this.onCommand.AudioAttributesCompatParcelizer(), i) + i, list, maybetriggerpendingmessagesWrite);
            }
        }
        if (maybetriggerpendingmessages.read(AudioAttributesCompatParcelizer(), i)) {
            if (!"__container".equals(AudioAttributesCompatParcelizer())) {
                maybetriggerpendingmessages2 = maybetriggerpendingmessages2.write(AudioAttributesCompatParcelizer());
                if (maybetriggerpendingmessages.IconCompatParcelizer(AudioAttributesCompatParcelizer(), i)) {
                    list.add(maybetriggerpendingmessages2.IconCompatParcelizer(this));
                }
            }
            if (maybetriggerpendingmessages.AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer(), i)) {
                AudioAttributesCompatParcelizer(maybetriggerpendingmessages, i + maybetriggerpendingmessages.RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer(), i), list, maybetriggerpendingmessages2);
            }
        }
    }

    @Override // kotlin.maybeUpdateReadingPeriod
    public <T> void read(T t, setDrmInitData<T> setdrminitdata) {
        this.AudioAttributesCompatParcelizer.write(t, setdrminitdata);
    }
}
