package kotlin;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda5;

/* JADX INFO: loaded from: classes2.dex */
public final class ExoPlayerImplComponentListenerExternalSyntheticLambda1 implements onVideoDisabled, ExoPlayerImplComponentListenerExternalSyntheticLambda0, onVideoSurfaceCreated, ExoPlayerImplComponentListenerExternalSyntheticLambda5.RemoteActionCompatParcelizer, surfaceChanged {
    private final ExoPlayerImplComponentListenerExternalSyntheticLambda5<Float, Float> AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi26Parcelizer;
    private final ExoPlayerImplComponentListenerExternalSyntheticLambda5<Float, Float> AudioAttributesImplBaseParcelizer;
    private onVideoDecoderInitialized IconCompatParcelizer;
    private final addMediaItemsInternal MediaBrowserCompatItemReceiver;
    private final ExoPlayerImplExternalSyntheticLambda6 RemoteActionCompatParcelizer;
    private final boolean read;
    private final setShuffleModeEnabledInternal write;
    private final Matrix MediaBrowserCompatCustomActionResultReceiver = new Matrix();
    private final Path AudioAttributesImplApi21Parcelizer = new Path();

    public ExoPlayerImplComponentListenerExternalSyntheticLambda1(ExoPlayerImplExternalSyntheticLambda6 exoPlayerImplExternalSyntheticLambda6, setShuffleModeEnabledInternal setshufflemodeenabledinternal, sendMessageToTargetThread sendmessagetotargetthread) {
        this.RemoteActionCompatParcelizer = exoPlayerImplExternalSyntheticLambda6;
        this.write = setshufflemodeenabledinternal;
        this.AudioAttributesImplApi26Parcelizer = sendmessagetotargetthread.RemoteActionCompatParcelizer();
        this.read = sendmessagetotargetthread.AudioAttributesCompatParcelizer();
        onCameraMotion oncameramotion = sendmessagetotargetthread.read().read();
        this.AudioAttributesCompatParcelizer = oncameramotion;
        setshufflemodeenabledinternal.IconCompatParcelizer(oncameramotion);
        oncameramotion.RemoteActionCompatParcelizer(this);
        onCameraMotion oncameramotion2 = sendmessagetotargetthread.IconCompatParcelizer().read();
        this.AudioAttributesImplBaseParcelizer = oncameramotion2;
        setshufflemodeenabledinternal.IconCompatParcelizer(oncameramotion2);
        oncameramotion2.RemoteActionCompatParcelizer(this);
        addMediaItemsInternal addmediaitemsinternalRemoteActionCompatParcelizer = sendmessagetotargetthread.write().RemoteActionCompatParcelizer();
        this.MediaBrowserCompatItemReceiver = addmediaitemsinternalRemoteActionCompatParcelizer;
        addmediaitemsinternalRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(setshufflemodeenabledinternal);
        addmediaitemsinternalRemoteActionCompatParcelizer.IconCompatParcelizer(this);
    }

    @Override // kotlin.onVideoSurfaceCreated
    public final void AudioAttributesCompatParcelizer(ListIterator<onVideoFrameProcessingOffset> listIterator) {
        if (this.IconCompatParcelizer != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add(listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.IconCompatParcelizer = new onVideoDecoderInitialized(this.RemoteActionCompatParcelizer, this.write, "Repeater", this.read, arrayList, null);
    }

    @Override // kotlin.onVideoFrameProcessingOffset
    public final String AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    @Override // kotlin.onVideoFrameProcessingOffset
    public final void write(List<onVideoFrameProcessingOffset> list, List<onVideoFrameProcessingOffset> list2) {
        this.IconCompatParcelizer.write(list, list2);
    }

    @Override // kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda0
    public final Path write() {
        Path pathWrite = this.IconCompatParcelizer.write();
        this.AudioAttributesImplApi21Parcelizer.reset();
        float fFloatValue = this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer().floatValue();
        float fFloatValue2 = this.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi26Parcelizer().floatValue();
        for (int i = ((int) fFloatValue) - 1; i >= 0; i--) {
            this.MediaBrowserCompatCustomActionResultReceiver.set(this.MediaBrowserCompatItemReceiver.write(i + fFloatValue2));
            this.AudioAttributesImplApi21Parcelizer.addPath(pathWrite, this.MediaBrowserCompatCustomActionResultReceiver);
        }
        return this.AudioAttributesImplApi21Parcelizer;
    }

    @Override // kotlin.onVideoDisabled
    public final void RemoteActionCompatParcelizer(Canvas canvas, Matrix matrix, int i, access3100 access3100Var) {
        float fFloatValue = this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer().floatValue();
        float fFloatValue2 = this.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi26Parcelizer().floatValue();
        float fFloatValue3 = this.MediaBrowserCompatItemReceiver.IconCompatParcelizer().AudioAttributesImplApi26Parcelizer().floatValue() / 100.0f;
        float fFloatValue4 = this.MediaBrowserCompatItemReceiver.read().AudioAttributesImplApi26Parcelizer().floatValue() / 100.0f;
        for (int i2 = ((int) fFloatValue) - 1; i2 >= 0; i2--) {
            this.MediaBrowserCompatCustomActionResultReceiver.set(matrix);
            float f = i2;
            this.MediaBrowserCompatCustomActionResultReceiver.preConcat(this.MediaBrowserCompatItemReceiver.write(f + fFloatValue2));
            this.IconCompatParcelizer.RemoteActionCompatParcelizer(canvas, this.MediaBrowserCompatCustomActionResultReceiver, (int) (i * setColorInfo.RemoteActionCompatParcelizer(fFloatValue3, fFloatValue4, f / fFloatValue)), access3100Var);
        }
    }

    @Override // kotlin.onVideoDisabled
    public final void read(RectF rectF, Matrix matrix, boolean z) {
        this.IconCompatParcelizer.read(rectF, matrix, z);
    }

    @Override // o.ExoPlayerImplComponentListenerExternalSyntheticLambda5.RemoteActionCompatParcelizer
    public final void RemoteActionCompatParcelizer() {
        this.RemoteActionCompatParcelizer.invalidateSelf();
    }

    @Override // kotlin.maybeUpdateReadingPeriod
    public final void RemoteActionCompatParcelizer(maybeTriggerPendingMessages maybetriggerpendingmessages, int i, List<maybeTriggerPendingMessages> list, maybeTriggerPendingMessages maybetriggerpendingmessages2) {
        setColorInfo.IconCompatParcelizer(maybetriggerpendingmessages, i, list, maybetriggerpendingmessages2, this);
        for (int i2 = 0; i2 < this.IconCompatParcelizer.IconCompatParcelizer().size(); i2++) {
            onVideoFrameProcessingOffset onvideoframeprocessingoffset = this.IconCompatParcelizer.IconCompatParcelizer().get(i2);
            if (onvideoframeprocessingoffset instanceof surfaceChanged) {
                setColorInfo.IconCompatParcelizer(maybetriggerpendingmessages, i, list, maybetriggerpendingmessages2, (surfaceChanged) onvideoframeprocessingoffset);
            }
        }
    }

    @Override // kotlin.maybeUpdateReadingPeriod
    public final <T> void read(T t, setDrmInitData<T> setdrminitdata) {
        if (this.MediaBrowserCompatItemReceiver.write(t, setdrminitdata)) {
            return;
        }
        if (t == onAudioPositionAdvancing.onPlayFromMediaId) {
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer((setDrmInitData<Float>) setdrminitdata);
        } else if (t == onAudioPositionAdvancing.onPlay) {
            this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer((setDrmInitData<Float>) setdrminitdata);
        }
    }
}
