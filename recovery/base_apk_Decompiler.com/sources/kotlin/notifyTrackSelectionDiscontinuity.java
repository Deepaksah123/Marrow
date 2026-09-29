package kotlin;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class notifyTrackSelectionDiscontinuity extends resolvePendingMessagePositions<scheduleNextWork, scheduleNextWork> {
    @Override // kotlin.resolvePendingMessagePositions, kotlin.resolvePendingMessagePosition
    public final /* bridge */ /* synthetic */ boolean AudioAttributesCompatParcelizer() {
        return super.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.resolvePendingMessagePositions, kotlin.resolvePendingMessagePosition
    public final /* bridge */ /* synthetic */ List RemoteActionCompatParcelizer() {
        return super.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.resolvePendingMessagePositions
    public final /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public notifyTrackSelectionDiscontinuity(List<setEncoderDelay<scheduleNextWork>> list) {
        super(AudioAttributesCompatParcelizer(list));
    }

    private static List<setEncoderDelay<scheduleNextWork>> AudioAttributesCompatParcelizer(List<setEncoderDelay<scheduleNextWork>> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, read(list.get(i)));
        }
        return list;
    }

    private static setEncoderDelay<scheduleNextWork> read(setEncoderDelay<scheduleNextWork> setencoderdelay) {
        scheduleNextWork schedulenextwork = setencoderdelay.MediaBrowserCompatCustomActionResultReceiver;
        scheduleNextWork schedulenextwork2 = setencoderdelay.IconCompatParcelizer;
        if (schedulenextwork == null || schedulenextwork2 == null || schedulenextwork.write().length == schedulenextwork2.write().length) {
            return setencoderdelay;
        }
        float[] fArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(schedulenextwork.write(), schedulenextwork2.write());
        return setEncoderDelay.write(schedulenextwork.IconCompatParcelizer(fArrAudioAttributesCompatParcelizer), schedulenextwork2.IconCompatParcelizer(fArrAudioAttributesCompatParcelizer));
    }

    private static float[] AudioAttributesCompatParcelizer(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f = Float.NaN;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            float f2 = fArr3[i2];
            if (f2 != f) {
                fArr3[i] = f2;
                i++;
                f = fArr3[i2];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i);
    }

    @Override // kotlin.resolvePendingMessagePosition
    public final ExoPlayerImplComponentListenerExternalSyntheticLambda5<scheduleNextWork, scheduleNextWork> read() {
        return new onVideoFrameAboutToBeRendered(this.AudioAttributesCompatParcelizer);
    }
}
