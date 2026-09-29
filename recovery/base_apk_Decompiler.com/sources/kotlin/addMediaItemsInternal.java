package kotlin;

import android.graphics.Matrix;
import android.graphics.PointF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Collections;
import kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda5;

/* JADX INFO: loaded from: classes2.dex */
public final class addMediaItemsInternal {
    private final Matrix AudioAttributesCompatParcelizer = new Matrix();
    private ExoPlayerImplComponentListenerExternalSyntheticLambda5<setHeight, setHeight> AudioAttributesImplApi21Parcelizer;
    private ExoPlayerImplComponentListenerExternalSyntheticLambda5<Float, Float> AudioAttributesImplApi26Parcelizer;
    private onCameraMotion AudioAttributesImplBaseParcelizer;
    private ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, Float> IconCompatParcelizer;
    private ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, PointF> MediaBrowserCompatCustomActionResultReceiver;
    private onCameraMotion MediaBrowserCompatItemReceiver;
    private final Matrix MediaBrowserCompatMediaItem;
    private final Matrix MediaBrowserCompatSearchResultReceiver;
    private final float[] MediaDescriptionCompat;
    private final Matrix MediaMetadataCompat;
    private ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, Float> RatingCompat;
    private final boolean RemoteActionCompatParcelizer;
    private ExoPlayerImplComponentListenerExternalSyntheticLambda5<Integer, Integer> read;
    private ExoPlayerImplComponentListenerExternalSyntheticLambda5<PointF, PointF> write;

    public addMediaItemsInternal(resetPendingPauseAtEndOfPeriod resetpendingpauseatendofperiod) {
        this.write = resetpendingpauseatendofperiod.read() == null ? null : resetpendingpauseatendofperiod.read().read();
        this.MediaBrowserCompatCustomActionResultReceiver = resetpendingpauseatendofperiod.IconCompatParcelizer() == null ? null : resetpendingpauseatendofperiod.IconCompatParcelizer().read();
        this.AudioAttributesImplApi21Parcelizer = resetpendingpauseatendofperiod.MediaBrowserCompatCustomActionResultReceiver() == null ? null : resetpendingpauseatendofperiod.MediaBrowserCompatCustomActionResultReceiver().read();
        this.AudioAttributesImplApi26Parcelizer = resetpendingpauseatendofperiod.AudioAttributesImplApi21Parcelizer() == null ? null : resetpendingpauseatendofperiod.AudioAttributesImplApi21Parcelizer().read();
        this.AudioAttributesImplBaseParcelizer = resetpendingpauseatendofperiod.MediaBrowserCompatItemReceiver() == null ? null : resetpendingpauseatendofperiod.MediaBrowserCompatItemReceiver().read();
        this.RemoteActionCompatParcelizer = resetpendingpauseatendofperiod.MediaDescriptionCompat();
        if (this.AudioAttributesImplBaseParcelizer != null) {
            this.MediaMetadataCompat = new Matrix();
            this.MediaBrowserCompatMediaItem = new Matrix();
            this.MediaBrowserCompatSearchResultReceiver = new Matrix();
            this.MediaDescriptionCompat = new float[9];
        } else {
            this.MediaMetadataCompat = null;
            this.MediaBrowserCompatMediaItem = null;
            this.MediaBrowserCompatSearchResultReceiver = null;
            this.MediaDescriptionCompat = null;
        }
        this.MediaBrowserCompatItemReceiver = resetpendingpauseatendofperiod.AudioAttributesImplBaseParcelizer() == null ? null : resetpendingpauseatendofperiod.AudioAttributesImplBaseParcelizer().read();
        if (resetpendingpauseatendofperiod.AudioAttributesCompatParcelizer() != null) {
            this.read = resetpendingpauseatendofperiod.AudioAttributesCompatParcelizer().read();
        }
        if (resetpendingpauseatendofperiod.AudioAttributesImplApi26Parcelizer() != null) {
            this.RatingCompat = resetpendingpauseatendofperiod.AudioAttributesImplApi26Parcelizer().read();
        } else {
            this.RatingCompat = null;
        }
        if (resetpendingpauseatendofperiod.write() != null) {
            this.IconCompatParcelizer = resetpendingpauseatendofperiod.write().read();
        } else {
            this.IconCompatParcelizer = null;
        }
    }

    public final void RemoteActionCompatParcelizer(setShuffleModeEnabledInternal setshufflemodeenabledinternal) {
        setshufflemodeenabledinternal.IconCompatParcelizer(this.read);
        setshufflemodeenabledinternal.IconCompatParcelizer(this.RatingCompat);
        setshufflemodeenabledinternal.IconCompatParcelizer(this.IconCompatParcelizer);
        setshufflemodeenabledinternal.IconCompatParcelizer(this.write);
        setshufflemodeenabledinternal.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
        setshufflemodeenabledinternal.IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer);
        setshufflemodeenabledinternal.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
        setshufflemodeenabledinternal.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer);
        setshufflemodeenabledinternal.IconCompatParcelizer(this.MediaBrowserCompatItemReceiver);
    }

    public final void IconCompatParcelizer(ExoPlayerImplComponentListenerExternalSyntheticLambda5.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<Integer, Integer> exoPlayerImplComponentListenerExternalSyntheticLambda5 = this.read;
        if (exoPlayerImplComponentListenerExternalSyntheticLambda5 != null) {
            exoPlayerImplComponentListenerExternalSyntheticLambda5.RemoteActionCompatParcelizer(remoteActionCompatParcelizer);
        }
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, Float> exoPlayerImplComponentListenerExternalSyntheticLambda52 = this.RatingCompat;
        if (exoPlayerImplComponentListenerExternalSyntheticLambda52 != null) {
            exoPlayerImplComponentListenerExternalSyntheticLambda52.RemoteActionCompatParcelizer(remoteActionCompatParcelizer);
        }
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, Float> exoPlayerImplComponentListenerExternalSyntheticLambda53 = this.IconCompatParcelizer;
        if (exoPlayerImplComponentListenerExternalSyntheticLambda53 != null) {
            exoPlayerImplComponentListenerExternalSyntheticLambda53.RemoteActionCompatParcelizer(remoteActionCompatParcelizer);
        }
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<PointF, PointF> exoPlayerImplComponentListenerExternalSyntheticLambda54 = this.write;
        if (exoPlayerImplComponentListenerExternalSyntheticLambda54 != null) {
            exoPlayerImplComponentListenerExternalSyntheticLambda54.RemoteActionCompatParcelizer(remoteActionCompatParcelizer);
        }
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, PointF> exoPlayerImplComponentListenerExternalSyntheticLambda55 = this.MediaBrowserCompatCustomActionResultReceiver;
        if (exoPlayerImplComponentListenerExternalSyntheticLambda55 != null) {
            exoPlayerImplComponentListenerExternalSyntheticLambda55.RemoteActionCompatParcelizer(remoteActionCompatParcelizer);
        }
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<setHeight, setHeight> exoPlayerImplComponentListenerExternalSyntheticLambda56 = this.AudioAttributesImplApi21Parcelizer;
        if (exoPlayerImplComponentListenerExternalSyntheticLambda56 != null) {
            exoPlayerImplComponentListenerExternalSyntheticLambda56.RemoteActionCompatParcelizer(remoteActionCompatParcelizer);
        }
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<Float, Float> exoPlayerImplComponentListenerExternalSyntheticLambda57 = this.AudioAttributesImplApi26Parcelizer;
        if (exoPlayerImplComponentListenerExternalSyntheticLambda57 != null) {
            exoPlayerImplComponentListenerExternalSyntheticLambda57.RemoteActionCompatParcelizer(remoteActionCompatParcelizer);
        }
        onCameraMotion oncameramotion = this.AudioAttributesImplBaseParcelizer;
        if (oncameramotion != null) {
            oncameramotion.RemoteActionCompatParcelizer(remoteActionCompatParcelizer);
        }
        onCameraMotion oncameramotion2 = this.MediaBrowserCompatItemReceiver;
        if (oncameramotion2 != null) {
            oncameramotion2.RemoteActionCompatParcelizer(remoteActionCompatParcelizer);
        }
    }

    public final void AudioAttributesCompatParcelizer(float f) {
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<Integer, Integer> exoPlayerImplComponentListenerExternalSyntheticLambda5 = this.read;
        if (exoPlayerImplComponentListenerExternalSyntheticLambda5 != null) {
            exoPlayerImplComponentListenerExternalSyntheticLambda5.AudioAttributesCompatParcelizer(f);
        }
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, Float> exoPlayerImplComponentListenerExternalSyntheticLambda52 = this.RatingCompat;
        if (exoPlayerImplComponentListenerExternalSyntheticLambda52 != null) {
            exoPlayerImplComponentListenerExternalSyntheticLambda52.AudioAttributesCompatParcelizer(f);
        }
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, Float> exoPlayerImplComponentListenerExternalSyntheticLambda53 = this.IconCompatParcelizer;
        if (exoPlayerImplComponentListenerExternalSyntheticLambda53 != null) {
            exoPlayerImplComponentListenerExternalSyntheticLambda53.AudioAttributesCompatParcelizer(f);
        }
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<PointF, PointF> exoPlayerImplComponentListenerExternalSyntheticLambda54 = this.write;
        if (exoPlayerImplComponentListenerExternalSyntheticLambda54 != null) {
            exoPlayerImplComponentListenerExternalSyntheticLambda54.AudioAttributesCompatParcelizer(f);
        }
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, PointF> exoPlayerImplComponentListenerExternalSyntheticLambda55 = this.MediaBrowserCompatCustomActionResultReceiver;
        if (exoPlayerImplComponentListenerExternalSyntheticLambda55 != null) {
            exoPlayerImplComponentListenerExternalSyntheticLambda55.AudioAttributesCompatParcelizer(f);
        }
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<setHeight, setHeight> exoPlayerImplComponentListenerExternalSyntheticLambda56 = this.AudioAttributesImplApi21Parcelizer;
        if (exoPlayerImplComponentListenerExternalSyntheticLambda56 != null) {
            exoPlayerImplComponentListenerExternalSyntheticLambda56.AudioAttributesCompatParcelizer(f);
        }
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<Float, Float> exoPlayerImplComponentListenerExternalSyntheticLambda57 = this.AudioAttributesImplApi26Parcelizer;
        if (exoPlayerImplComponentListenerExternalSyntheticLambda57 != null) {
            exoPlayerImplComponentListenerExternalSyntheticLambda57.AudioAttributesCompatParcelizer(f);
        }
        onCameraMotion oncameramotion = this.AudioAttributesImplBaseParcelizer;
        if (oncameramotion != null) {
            oncameramotion.AudioAttributesCompatParcelizer(f);
        }
        onCameraMotion oncameramotion2 = this.MediaBrowserCompatItemReceiver;
        if (oncameramotion2 != null) {
            oncameramotion2.AudioAttributesCompatParcelizer(f);
        }
    }

    public final ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, Integer> AudioAttributesCompatParcelizer() {
        return this.read;
    }

    public final ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, Float> IconCompatParcelizer() {
        return this.RatingCompat;
    }

    public final ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, Float> read() {
        return this.IconCompatParcelizer;
    }

    public final Matrix RemoteActionCompatParcelizer() {
        float fMediaBrowserCompatMediaItem;
        PointF pointFAudioAttributesImplApi26Parcelizer;
        setHeight setheightAudioAttributesImplApi26Parcelizer;
        PointF pointFAudioAttributesImplApi26Parcelizer2;
        this.AudioAttributesCompatParcelizer.reset();
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, PointF> exoPlayerImplComponentListenerExternalSyntheticLambda5 = this.MediaBrowserCompatCustomActionResultReceiver;
        if (exoPlayerImplComponentListenerExternalSyntheticLambda5 != null && (pointFAudioAttributesImplApi26Parcelizer2 = exoPlayerImplComponentListenerExternalSyntheticLambda5.AudioAttributesImplApi26Parcelizer()) != null && (pointFAudioAttributesImplApi26Parcelizer2.x != BitmapDescriptorFactory.HUE_RED || pointFAudioAttributesImplApi26Parcelizer2.y != BitmapDescriptorFactory.HUE_RED)) {
            this.AudioAttributesCompatParcelizer.preTranslate(pointFAudioAttributesImplApi26Parcelizer2.x, pointFAudioAttributesImplApi26Parcelizer2.y);
        }
        if (!this.RemoteActionCompatParcelizer) {
            ExoPlayerImplComponentListenerExternalSyntheticLambda5<Float, Float> exoPlayerImplComponentListenerExternalSyntheticLambda52 = this.AudioAttributesImplApi26Parcelizer;
            if (exoPlayerImplComponentListenerExternalSyntheticLambda52 != null) {
                if (exoPlayerImplComponentListenerExternalSyntheticLambda52 instanceof getCurrentLiveOffsetUs) {
                    fMediaBrowserCompatMediaItem = exoPlayerImplComponentListenerExternalSyntheticLambda52.AudioAttributesImplApi26Parcelizer().floatValue();
                } else {
                    fMediaBrowserCompatMediaItem = ((onCameraMotion) exoPlayerImplComponentListenerExternalSyntheticLambda52).MediaBrowserCompatMediaItem();
                }
                if (fMediaBrowserCompatMediaItem != BitmapDescriptorFactory.HUE_RED) {
                    this.AudioAttributesCompatParcelizer.preRotate(fMediaBrowserCompatMediaItem);
                }
            }
        } else if (exoPlayerImplComponentListenerExternalSyntheticLambda5 != null) {
            float fRemoteActionCompatParcelizer = exoPlayerImplComponentListenerExternalSyntheticLambda5.RemoteActionCompatParcelizer();
            PointF pointFAudioAttributesImplApi26Parcelizer3 = exoPlayerImplComponentListenerExternalSyntheticLambda5.AudioAttributesImplApi26Parcelizer();
            float f = pointFAudioAttributesImplApi26Parcelizer3.x;
            float f2 = pointFAudioAttributesImplApi26Parcelizer3.y;
            exoPlayerImplComponentListenerExternalSyntheticLambda5.AudioAttributesCompatParcelizer(1.0E-4f + fRemoteActionCompatParcelizer);
            PointF pointFAudioAttributesImplApi26Parcelizer4 = exoPlayerImplComponentListenerExternalSyntheticLambda5.AudioAttributesImplApi26Parcelizer();
            exoPlayerImplComponentListenerExternalSyntheticLambda5.AudioAttributesCompatParcelizer(fRemoteActionCompatParcelizer);
            this.AudioAttributesCompatParcelizer.preRotate((float) Math.toDegrees(Math.atan2(pointFAudioAttributesImplApi26Parcelizer4.y - f2, pointFAudioAttributesImplApi26Parcelizer4.x - f)));
        }
        if (this.AudioAttributesImplBaseParcelizer != null) {
            float fCos = this.MediaBrowserCompatItemReceiver == null ? 0.0f : (float) Math.cos(Math.toRadians((-r3.MediaBrowserCompatMediaItem()) + 90.0f));
            float fSin = this.MediaBrowserCompatItemReceiver == null ? 1.0f : (float) Math.sin(Math.toRadians((-r5.MediaBrowserCompatMediaItem()) + 90.0f));
            float fTan = (float) Math.tan(Math.toRadians(r0.MediaBrowserCompatMediaItem()));
            write();
            float[] fArr = this.MediaDescriptionCompat;
            fArr[0] = fCos;
            fArr[1] = fSin;
            float f3 = -fSin;
            fArr[3] = f3;
            fArr[4] = fCos;
            fArr[8] = 1.0f;
            this.MediaMetadataCompat.setValues(fArr);
            write();
            float[] fArr2 = this.MediaDescriptionCompat;
            fArr2[0] = 1.0f;
            fArr2[3] = fTan;
            fArr2[4] = 1.0f;
            fArr2[8] = 1.0f;
            this.MediaBrowserCompatMediaItem.setValues(fArr2);
            write();
            float[] fArr3 = this.MediaDescriptionCompat;
            fArr3[0] = fCos;
            fArr3[1] = f3;
            fArr3[3] = fSin;
            fArr3[4] = fCos;
            fArr3[8] = 1.0f;
            this.MediaBrowserCompatSearchResultReceiver.setValues(fArr3);
            this.MediaBrowserCompatMediaItem.preConcat(this.MediaMetadataCompat);
            this.MediaBrowserCompatSearchResultReceiver.preConcat(this.MediaBrowserCompatMediaItem);
            this.AudioAttributesCompatParcelizer.preConcat(this.MediaBrowserCompatSearchResultReceiver);
        }
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<setHeight, setHeight> exoPlayerImplComponentListenerExternalSyntheticLambda53 = this.AudioAttributesImplApi21Parcelizer;
        if (exoPlayerImplComponentListenerExternalSyntheticLambda53 != null && (setheightAudioAttributesImplApi26Parcelizer = exoPlayerImplComponentListenerExternalSyntheticLambda53.AudioAttributesImplApi26Parcelizer()) != null && (setheightAudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer() != 1.0f || setheightAudioAttributesImplApi26Parcelizer.read() != 1.0f)) {
            this.AudioAttributesCompatParcelizer.preScale(setheightAudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(), setheightAudioAttributesImplApi26Parcelizer.read());
        }
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<PointF, PointF> exoPlayerImplComponentListenerExternalSyntheticLambda54 = this.write;
        if (exoPlayerImplComponentListenerExternalSyntheticLambda54 != null && (pointFAudioAttributesImplApi26Parcelizer = exoPlayerImplComponentListenerExternalSyntheticLambda54.AudioAttributesImplApi26Parcelizer()) != null && (pointFAudioAttributesImplApi26Parcelizer.x != BitmapDescriptorFactory.HUE_RED || pointFAudioAttributesImplApi26Parcelizer.y != BitmapDescriptorFactory.HUE_RED)) {
            this.AudioAttributesCompatParcelizer.preTranslate(-pointFAudioAttributesImplApi26Parcelizer.x, -pointFAudioAttributesImplApi26Parcelizer.y);
        }
        return this.AudioAttributesCompatParcelizer;
    }

    private void write() {
        for (int i = 0; i < 9; i++) {
            this.MediaDescriptionCompat[i] = 0.0f;
        }
    }

    public final Matrix write(float f) {
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, PointF> exoPlayerImplComponentListenerExternalSyntheticLambda5 = this.MediaBrowserCompatCustomActionResultReceiver;
        PointF pointFAudioAttributesImplApi26Parcelizer = exoPlayerImplComponentListenerExternalSyntheticLambda5 == null ? null : exoPlayerImplComponentListenerExternalSyntheticLambda5.AudioAttributesImplApi26Parcelizer();
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<setHeight, setHeight> exoPlayerImplComponentListenerExternalSyntheticLambda52 = this.AudioAttributesImplApi21Parcelizer;
        setHeight setheightAudioAttributesImplApi26Parcelizer = exoPlayerImplComponentListenerExternalSyntheticLambda52 == null ? null : exoPlayerImplComponentListenerExternalSyntheticLambda52.AudioAttributesImplApi26Parcelizer();
        this.AudioAttributesCompatParcelizer.reset();
        if (pointFAudioAttributesImplApi26Parcelizer != null) {
            this.AudioAttributesCompatParcelizer.preTranslate(pointFAudioAttributesImplApi26Parcelizer.x * f, pointFAudioAttributesImplApi26Parcelizer.y * f);
        }
        if (setheightAudioAttributesImplApi26Parcelizer != null) {
            double d = f;
            this.AudioAttributesCompatParcelizer.preScale((float) Math.pow(setheightAudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(), d), (float) Math.pow(setheightAudioAttributesImplApi26Parcelizer.read(), d));
        }
        ExoPlayerImplComponentListenerExternalSyntheticLambda5<Float, Float> exoPlayerImplComponentListenerExternalSyntheticLambda53 = this.AudioAttributesImplApi26Parcelizer;
        if (exoPlayerImplComponentListenerExternalSyntheticLambda53 != null) {
            float fFloatValue = exoPlayerImplComponentListenerExternalSyntheticLambda53.AudioAttributesImplApi26Parcelizer().floatValue();
            ExoPlayerImplComponentListenerExternalSyntheticLambda5<PointF, PointF> exoPlayerImplComponentListenerExternalSyntheticLambda54 = this.write;
            PointF pointFAudioAttributesImplApi26Parcelizer2 = exoPlayerImplComponentListenerExternalSyntheticLambda54 != null ? exoPlayerImplComponentListenerExternalSyntheticLambda54.AudioAttributesImplApi26Parcelizer() : null;
            Matrix matrix = this.AudioAttributesCompatParcelizer;
            float f2 = BitmapDescriptorFactory.HUE_RED;
            float f3 = pointFAudioAttributesImplApi26Parcelizer2 == null ? 0.0f : pointFAudioAttributesImplApi26Parcelizer2.x;
            if (pointFAudioAttributesImplApi26Parcelizer2 != null) {
                f2 = pointFAudioAttributesImplApi26Parcelizer2.y;
            }
            matrix.preRotate(fFloatValue * f, f3, f2);
        }
        return this.AudioAttributesCompatParcelizer;
    }

    public final <T> boolean write(T t, setDrmInitData<T> setdrminitdata) {
        if (t == onAudioPositionAdvancing.onPrepareFromUri) {
            ExoPlayerImplComponentListenerExternalSyntheticLambda5<PointF, PointF> exoPlayerImplComponentListenerExternalSyntheticLambda5 = this.write;
            if (exoPlayerImplComponentListenerExternalSyntheticLambda5 == null) {
                this.write = new getCurrentLiveOffsetUs(setdrminitdata, new PointF());
                return true;
            }
            exoPlayerImplComponentListenerExternalSyntheticLambda5.AudioAttributesCompatParcelizer((setDrmInitData<PointF>) setdrminitdata);
            return true;
        }
        if (t == onAudioPositionAdvancing.onRemoveQueueItemAt) {
            ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, PointF> exoPlayerImplComponentListenerExternalSyntheticLambda52 = this.MediaBrowserCompatCustomActionResultReceiver;
            if (exoPlayerImplComponentListenerExternalSyntheticLambda52 == null) {
                this.MediaBrowserCompatCustomActionResultReceiver = new getCurrentLiveOffsetUs(setdrminitdata, new PointF());
                return true;
            }
            exoPlayerImplComponentListenerExternalSyntheticLambda52.AudioAttributesCompatParcelizer((setDrmInitData<PointF>) setdrminitdata);
            return true;
        }
        if (t == onAudioPositionAdvancing.onSeekTo) {
            ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, PointF> exoPlayerImplComponentListenerExternalSyntheticLambda53 = this.MediaBrowserCompatCustomActionResultReceiver;
            if (exoPlayerImplComponentListenerExternalSyntheticLambda53 instanceof doSomeWork) {
                ((doSomeWork) exoPlayerImplComponentListenerExternalSyntheticLambda53).read(setdrminitdata);
                return true;
            }
        }
        if (t == onAudioPositionAdvancing.onSetRating) {
            ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, PointF> exoPlayerImplComponentListenerExternalSyntheticLambda54 = this.MediaBrowserCompatCustomActionResultReceiver;
            if (exoPlayerImplComponentListenerExternalSyntheticLambda54 instanceof doSomeWork) {
                ((doSomeWork) exoPlayerImplComponentListenerExternalSyntheticLambda54).RemoteActionCompatParcelizer((setDrmInitData<Float>) setdrminitdata);
                return true;
            }
        }
        if (t == onAudioPositionAdvancing.onSetPlaybackSpeed) {
            ExoPlayerImplComponentListenerExternalSyntheticLambda5<setHeight, setHeight> exoPlayerImplComponentListenerExternalSyntheticLambda55 = this.AudioAttributesImplApi21Parcelizer;
            if (exoPlayerImplComponentListenerExternalSyntheticLambda55 == null) {
                this.AudioAttributesImplApi21Parcelizer = new getCurrentLiveOffsetUs(setdrminitdata, new setHeight());
                return true;
            }
            exoPlayerImplComponentListenerExternalSyntheticLambda55.AudioAttributesCompatParcelizer((setDrmInitData<setHeight>) setdrminitdata);
            return true;
        }
        if (t == onAudioPositionAdvancing.onSetRepeatMode) {
            ExoPlayerImplComponentListenerExternalSyntheticLambda5<Float, Float> exoPlayerImplComponentListenerExternalSyntheticLambda56 = this.AudioAttributesImplApi26Parcelizer;
            if (exoPlayerImplComponentListenerExternalSyntheticLambda56 == null) {
                this.AudioAttributesImplApi26Parcelizer = new getCurrentLiveOffsetUs(setdrminitdata, Float.valueOf(BitmapDescriptorFactory.HUE_RED));
                return true;
            }
            exoPlayerImplComponentListenerExternalSyntheticLambda56.AudioAttributesCompatParcelizer((setDrmInitData<Float>) setdrminitdata);
            return true;
        }
        if (t == onAudioPositionAdvancing.onRemoveQueueItem) {
            ExoPlayerImplComponentListenerExternalSyntheticLambda5<Integer, Integer> exoPlayerImplComponentListenerExternalSyntheticLambda57 = this.read;
            if (exoPlayerImplComponentListenerExternalSyntheticLambda57 == null) {
                this.read = new getCurrentLiveOffsetUs(setdrminitdata, 100);
                return true;
            }
            exoPlayerImplComponentListenerExternalSyntheticLambda57.AudioAttributesCompatParcelizer((setDrmInitData<Integer>) setdrminitdata);
            return true;
        }
        if (t == onAudioPositionAdvancing.setSessionImpl) {
            ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, Float> exoPlayerImplComponentListenerExternalSyntheticLambda58 = this.RatingCompat;
            if (exoPlayerImplComponentListenerExternalSyntheticLambda58 == null) {
                this.RatingCompat = new getCurrentLiveOffsetUs(setdrminitdata, Float.valueOf(100.0f));
                return true;
            }
            exoPlayerImplComponentListenerExternalSyntheticLambda58.AudioAttributesCompatParcelizer((setDrmInitData<Float>) setdrminitdata);
            return true;
        }
        if (t == onAudioPositionAdvancing.onRewind) {
            ExoPlayerImplComponentListenerExternalSyntheticLambda5<?, Float> exoPlayerImplComponentListenerExternalSyntheticLambda59 = this.IconCompatParcelizer;
            if (exoPlayerImplComponentListenerExternalSyntheticLambda59 == null) {
                this.IconCompatParcelizer = new getCurrentLiveOffsetUs(setdrminitdata, Float.valueOf(100.0f));
                return true;
            }
            exoPlayerImplComponentListenerExternalSyntheticLambda59.AudioAttributesCompatParcelizer((setDrmInitData<Float>) setdrminitdata);
            return true;
        }
        if (t == onAudioPositionAdvancing.onSetCaptioningEnabled) {
            if (this.AudioAttributesImplBaseParcelizer == null) {
                this.AudioAttributesImplBaseParcelizer = new onCameraMotion(Collections.singletonList(new setEncoderDelay(Float.valueOf(BitmapDescriptorFactory.HUE_RED))));
            }
            this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(setdrminitdata);
            return true;
        }
        if (t != onAudioPositionAdvancing.onSetShuffleMode) {
            return false;
        }
        if (this.MediaBrowserCompatItemReceiver == null) {
            this.MediaBrowserCompatItemReceiver = new onCameraMotion(Collections.singletonList(new setEncoderDelay(Float.valueOf(BitmapDescriptorFactory.HUE_RED))));
        }
        this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(setdrminitdata);
        return true;
    }
}
