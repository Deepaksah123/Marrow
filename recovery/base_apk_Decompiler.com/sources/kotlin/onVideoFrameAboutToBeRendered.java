package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class onVideoFrameAboutToBeRendered extends ExoPlayerImplMediaSourceHolderSnapshot<scheduleNextWork> {
    private final scheduleNextWork read;

    public onVideoFrameAboutToBeRendered(List<setEncoderDelay<scheduleNextWork>> list) {
        super(list);
        int iMax = 0;
        for (int i = 0; i < list.size(); i++) {
            scheduleNextWork schedulenextwork = list.get(i).MediaBrowserCompatCustomActionResultReceiver;
            if (schedulenextwork != null) {
                iMax = Math.max(iMax, schedulenextwork.IconCompatParcelizer());
            }
        }
        this.read = new scheduleNextWork(new float[iMax], new int[iMax]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.ExoPlayerImplComponentListenerExternalSyntheticLambda5
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public scheduleNextWork read(setEncoderDelay<scheduleNextWork> setencoderdelay, float f) {
        this.read.IconCompatParcelizer(setencoderdelay.MediaBrowserCompatCustomActionResultReceiver, setencoderdelay.IconCompatParcelizer, f);
        return this.read;
    }
}
