package kotlin;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.setContainerMimeType;
import kotlin.stopRenderers;

/* JADX INFO: loaded from: classes2.dex */
public final class startRenderers extends setShuffleModeEnabledInternal {
    private onCameraMotionReset AudioAttributesImplApi21Parcelizer;
    private final List<setShuffleModeEnabledInternal> AudioAttributesImplApi26Parcelizer;
    private final RectF AudioAttributesImplBaseParcelizer;
    private final RectF MediaBrowserCompatCustomActionResultReceiver;
    private final setContainerMimeType MediaBrowserCompatItemReceiver;
    private float MediaBrowserCompatMediaItem;
    private ExoPlayerImplComponentListenerExternalSyntheticLambda5<Float, Float> MediaBrowserCompatSearchResultReceiver;
    private final RectF MediaMetadataCompat;
    private final setContainerMimeType.write RatingCompat;
    private boolean write;

    public startRenderers(ExoPlayerImplExternalSyntheticLambda6 exoPlayerImplExternalSyntheticLambda6, stopRenderers stoprenderers, List<stopRenderers> list, ExoPlayerImplExternalSyntheticLambda19 exoPlayerImplExternalSyntheticLambda19) {
        int i;
        setShuffleModeEnabledInternal setshufflemodeenabledinternal;
        super(exoPlayerImplExternalSyntheticLambda6, stoprenderers);
        this.AudioAttributesImplApi26Parcelizer = new ArrayList();
        this.MediaMetadataCompat = new RectF();
        this.AudioAttributesImplBaseParcelizer = new RectF();
        this.MediaBrowserCompatCustomActionResultReceiver = new RectF();
        this.MediaBrowserCompatItemReceiver = new setContainerMimeType();
        this.RatingCompat = new setContainerMimeType.write();
        this.write = true;
        mediaSourceListUpdateRequestedInternal mediasourcelistupdaterequestedinternalOnPause = stoprenderers.onPause();
        if (mediasourcelistupdaterequestedinternalOnPause != null) {
            onCameraMotion oncameramotion = mediasourcelistupdaterequestedinternalOnPause.read();
            this.MediaBrowserCompatSearchResultReceiver = oncameramotion;
            IconCompatParcelizer(oncameramotion);
            this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(this);
        } else {
            this.MediaBrowserCompatSearchResultReceiver = null;
        }
        setPresenter setpresenter = new setPresenter(exoPlayerImplExternalSyntheticLambda19.MediaBrowserCompatItemReceiver().size());
        int size = list.size() - 1;
        setShuffleModeEnabledInternal setshufflemodeenabledinternal2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            stopRenderers stoprenderers2 = list.get(size);
            setShuffleModeEnabledInternal setshufflemodeenabledinternalIconCompatParcelizer = setShuffleModeEnabledInternal.IconCompatParcelizer(this, stoprenderers2, exoPlayerImplExternalSyntheticLambda6, exoPlayerImplExternalSyntheticLambda19);
            if (setshufflemodeenabledinternalIconCompatParcelizer != null) {
                setpresenter.write(setshufflemodeenabledinternalIconCompatParcelizer.write().AudioAttributesCompatParcelizer(), setshufflemodeenabledinternalIconCompatParcelizer);
                if (setshufflemodeenabledinternal2 != null) {
                    setshufflemodeenabledinternal2.AudioAttributesCompatParcelizer(setshufflemodeenabledinternalIconCompatParcelizer);
                    setshufflemodeenabledinternal2 = null;
                } else {
                    this.AudioAttributesImplApi26Parcelizer.add(0, setshufflemodeenabledinternalIconCompatParcelizer);
                    int i2 = AnonymousClass2.AudioAttributesCompatParcelizer[stoprenderers2.MediaBrowserCompatItemReceiver().ordinal()];
                    if (i2 == 1 || i2 == 2) {
                        setshufflemodeenabledinternal2 = setshufflemodeenabledinternalIconCompatParcelizer;
                    }
                }
            }
            size--;
        }
        for (i = 0; i < setpresenter.write(); i++) {
            setShuffleModeEnabledInternal setshufflemodeenabledinternal3 = (setShuffleModeEnabledInternal) setpresenter.IconCompatParcelizer(setpresenter.AudioAttributesCompatParcelizer(i));
            if (setshufflemodeenabledinternal3 != null && (setshufflemodeenabledinternal = (setShuffleModeEnabledInternal) setpresenter.IconCompatParcelizer(setshufflemodeenabledinternal3.write().RatingCompat())) != null) {
                setshufflemodeenabledinternal3.read(setshufflemodeenabledinternal);
            }
        }
        if (read() != null) {
            this.AudioAttributesImplApi21Parcelizer = new onCameraMotionReset(this, this, read());
        }
    }

    /* JADX INFO: renamed from: o.startRenderers$2, reason: invalid class name */
    static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

        static {
            int[] iArr = new int[stopRenderers.RemoteActionCompatParcelizer.values().length];
            AudioAttributesCompatParcelizer = iArr;
            try {
                iArr[stopRenderers.RemoteActionCompatParcelizer.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AudioAttributesCompatParcelizer[stopRenderers.RemoteActionCompatParcelizer.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public final void write(boolean z) {
        this.write = z;
    }

    @Override // kotlin.setShuffleModeEnabledInternal
    public final void RemoteActionCompatParcelizer(boolean z) {
        super.RemoteActionCompatParcelizer(z);
        Iterator<setShuffleModeEnabledInternal> it = this.AudioAttributesImplApi26Parcelizer.iterator();
        while (it.hasNext()) {
            it.next().RemoteActionCompatParcelizer(z);
        }
    }

    @Override // kotlin.setShuffleModeEnabledInternal
    final void IconCompatParcelizer(Canvas canvas, Matrix matrix, int i, access3100 access3100Var) {
        Canvas canvasAudioAttributesCompatParcelizer;
        ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
        boolean z = false;
        boolean z2 = (access3100Var == null && this.AudioAttributesImplApi21Parcelizer == null) ? false : true;
        if ((this.IconCompatParcelizer.MediaMetadataCompat() && this.AudioAttributesImplApi26Parcelizer.size() > 1 && i != 255) || (z2 && this.IconCompatParcelizer.MediaBrowserCompatMediaItem())) {
            z = true;
        }
        int i2 = z ? 255 : i;
        onCameraMotionReset oncameramotionreset = this.AudioAttributesImplApi21Parcelizer;
        if (oncameramotionreset != null) {
            access3100Var = oncameramotionreset.write(matrix, i2);
        }
        if (this.write || !"__container".equals(this.read.AudioAttributesImplApi21Parcelizer())) {
            this.AudioAttributesImplBaseParcelizer.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.read.MediaBrowserCompatSearchResultReceiver(), this.read.MediaMetadataCompat());
            matrix.mapRect(this.AudioAttributesImplBaseParcelizer);
        } else {
            this.AudioAttributesImplBaseParcelizer.setEmpty();
            Iterator<setShuffleModeEnabledInternal> it = this.AudioAttributesImplApi26Parcelizer.iterator();
            while (it.hasNext()) {
                it.next().read(this.MediaBrowserCompatCustomActionResultReceiver, matrix, true);
                this.AudioAttributesImplBaseParcelizer.union(this.MediaBrowserCompatCustomActionResultReceiver);
            }
        }
        if (z) {
            this.RatingCompat.write();
            this.RatingCompat.AudioAttributesCompatParcelizer = i;
            if (access3100Var != null) {
                access3100Var.read(this.RatingCompat);
                access3100Var = null;
            }
            canvasAudioAttributesCompatParcelizer = this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(canvas, this.AudioAttributesImplBaseParcelizer, this.RatingCompat);
        } else {
            canvasAudioAttributesCompatParcelizer = canvas;
        }
        canvas.save();
        if (canvas.clipRect(this.AudioAttributesImplBaseParcelizer)) {
            for (int size = this.AudioAttributesImplApi26Parcelizer.size() - 1; size >= 0; size--) {
                this.AudioAttributesImplApi26Parcelizer.get(size).RemoteActionCompatParcelizer(canvasAudioAttributesCompatParcelizer, matrix, i2, access3100Var);
            }
        }
        if (z) {
            this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer();
        }
        canvas.restore();
        ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
    }

    @Override // kotlin.setShuffleModeEnabledInternal, kotlin.onVideoDisabled
    public final void read(RectF rectF, Matrix matrix, boolean z) {
        super.read(rectF, matrix, z);
        for (int size = this.AudioAttributesImplApi26Parcelizer.size() - 1; size >= 0; size--) {
            this.MediaMetadataCompat.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
            this.AudioAttributesImplApi26Parcelizer.get(size).read(this.MediaMetadataCompat, this.RemoteActionCompatParcelizer, true);
            rectF.union(this.MediaMetadataCompat);
        }
    }

    @Override // kotlin.setShuffleModeEnabledInternal
    public final void RemoteActionCompatParcelizer(float f) {
        ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
        this.MediaBrowserCompatMediaItem = f;
        super.RemoteActionCompatParcelizer(f);
        if (this.MediaBrowserCompatSearchResultReceiver != null) {
            f = ((this.MediaBrowserCompatSearchResultReceiver.AudioAttributesImplApi26Parcelizer().floatValue() * this.read.read().MediaBrowserCompatCustomActionResultReceiver()) - this.read.read().MediaMetadataCompat()) / (this.IconCompatParcelizer.RemoteActionCompatParcelizer().read() + 0.01f);
        }
        if (this.MediaBrowserCompatSearchResultReceiver == null) {
            f -= this.read.onCommand();
        }
        if (this.read.onPlayFromMediaId() != BitmapDescriptorFactory.HUE_RED && !"__container".equals(this.read.AudioAttributesImplApi21Parcelizer())) {
            f /= this.read.onPlayFromMediaId();
        }
        for (int size = this.AudioAttributesImplApi26Parcelizer.size() - 1; size >= 0; size--) {
            this.AudioAttributesImplApi26Parcelizer.get(size).RemoteActionCompatParcelizer(f);
        }
        ExoPlayerImplExternalSyntheticLambda18.AudioAttributesImplBaseParcelizer();
    }

    public final float MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatMediaItem;
    }

    @Override // kotlin.setShuffleModeEnabledInternal
    protected final void AudioAttributesCompatParcelizer(maybeTriggerPendingMessages maybetriggerpendingmessages, int i, List<maybeTriggerPendingMessages> list, maybeTriggerPendingMessages maybetriggerpendingmessages2) {
        for (int i2 = 0; i2 < this.AudioAttributesImplApi26Parcelizer.size(); i2++) {
            this.AudioAttributesImplApi26Parcelizer.get(i2).RemoteActionCompatParcelizer(maybetriggerpendingmessages, i, list, maybetriggerpendingmessages2);
        }
    }

    @Override // kotlin.setShuffleModeEnabledInternal, kotlin.maybeUpdateReadingPeriod
    public final <T> void read(T t, setDrmInitData<T> setdrminitdata) {
        onCameraMotionReset oncameramotionreset;
        onCameraMotionReset oncameramotionreset2;
        onCameraMotionReset oncameramotionreset3;
        onCameraMotionReset oncameramotionreset4;
        onCameraMotionReset oncameramotionreset5;
        super.read(t, setdrminitdata);
        if (t == onAudioPositionAdvancing.onPrepareFromSearch) {
            if (setdrminitdata == null) {
                ExoPlayerImplComponentListenerExternalSyntheticLambda5<Float, Float> exoPlayerImplComponentListenerExternalSyntheticLambda5 = this.MediaBrowserCompatSearchResultReceiver;
                if (exoPlayerImplComponentListenerExternalSyntheticLambda5 != null) {
                    exoPlayerImplComponentListenerExternalSyntheticLambda5.AudioAttributesCompatParcelizer((setDrmInitData<Float>) null);
                    return;
                }
                return;
            }
            getCurrentLiveOffsetUs getcurrentliveoffsetus = new getCurrentLiveOffsetUs(setdrminitdata);
            this.MediaBrowserCompatSearchResultReceiver = getcurrentliveoffsetus;
            getcurrentliveoffsetus.RemoteActionCompatParcelizer(this);
            IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver);
            return;
        }
        if (t == onAudioPositionAdvancing.IconCompatParcelizer && (oncameramotionreset5 = this.AudioAttributesImplApi21Parcelizer) != null) {
            oncameramotionreset5.IconCompatParcelizer(setdrminitdata);
            return;
        }
        if (t == onAudioPositionAdvancing.AudioAttributesImplApi21Parcelizer && (oncameramotionreset4 = this.AudioAttributesImplApi21Parcelizer) != null) {
            oncameramotionreset4.read(setdrminitdata);
            return;
        }
        if (t == onAudioPositionAdvancing.AudioAttributesImplBaseParcelizer && (oncameramotionreset3 = this.AudioAttributesImplApi21Parcelizer) != null) {
            oncameramotionreset3.RemoteActionCompatParcelizer(setdrminitdata);
            return;
        }
        if (t == onAudioPositionAdvancing.MediaBrowserCompatItemReceiver && (oncameramotionreset2 = this.AudioAttributesImplApi21Parcelizer) != null) {
            oncameramotionreset2.AudioAttributesCompatParcelizer(setdrminitdata);
        } else {
            if (t != onAudioPositionAdvancing.AudioAttributesImplApi26Parcelizer || (oncameramotionreset = this.AudioAttributesImplApi21Parcelizer) == null) {
                return;
            }
            oncameramotionreset.write(setdrminitdata);
        }
    }
}
