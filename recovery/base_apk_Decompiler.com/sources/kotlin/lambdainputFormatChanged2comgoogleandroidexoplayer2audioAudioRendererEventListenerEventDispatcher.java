package kotlin;

import android.location.Location;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdainputFormatChanged2comgoogleandroidexoplayer2audioAudioRendererEventListenerEventDispatcher extends MagicModuleUseCase implements getAnswerMap {
    private /* synthetic */ hasPendingData RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lambdainputFormatChanged2comgoogleandroidexoplayer2audioAudioRendererEventListenerEventDispatcher(hasPendingData haspendingdata) {
        super(1);
        this.RemoteActionCompatParcelizer = haspendingdata;
    }

    @Override // kotlin.getAnswerMap
    public final Object invoke(Object obj) throws InterruptedException {
        Location locationRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.read.RemoteActionCompatParcelizer();
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        return locationRemoteActionCompatParcelizer;
    }
}
