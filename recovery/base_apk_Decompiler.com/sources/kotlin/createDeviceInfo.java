package kotlin;

import java.util.concurrent.CancellationException;
import kotlin.lambdasetRepeatMode3;

/* JADX INFO: loaded from: classes2.dex */
public final class createDeviceInfo extends access902 {
    private final setAnalyticsCollector AudioAttributesCompatParcelizer;
    private final setPassingYear RemoteActionCompatParcelizer;
    private final addMediaSourceHolders read;
    private final lambdamaybeNotifySurfaceSizeChanged27 write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public createDeviceInfo(setAnalyticsCollector setanalyticscollector, lambdamaybeNotifySurfaceSizeChanged27 lambdamaybenotifysurfacesizechanged27, addMediaSourceHolders addmediasourceholders, setPassingYear setpassingyear) {
        super(null);
        toMagicModuleMetaRepoModel.write(setanalyticscollector, "");
        toMagicModuleMetaRepoModel.write(lambdamaybenotifysurfacesizechanged27, "");
        toMagicModuleMetaRepoModel.write(addmediasourceholders, "");
        toMagicModuleMetaRepoModel.write(setpassingyear, "");
        this.AudioAttributesCompatParcelizer = setanalyticscollector;
        this.write = lambdamaybenotifysurfacesizechanged27;
        this.read = addmediasourceholders;
        this.RemoteActionCompatParcelizer = setpassingyear;
    }

    public final void IconCompatParcelizer() {
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer(this.write);
    }

    @Override // kotlin.access902
    public final void write() {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer((CancellationException) null);
        this.read.IconCompatParcelizer();
        sendRendererMessage.AudioAttributesCompatParcelizer(this.read, (lambdasetRepeatMode3.AudioAttributesCompatParcelizer) null);
        if (this.write.getOnRemoveQueueItemAt() instanceof findExplicitNames) {
            this.write.getHandleMediaPlayPauseIfPendingOnHandler().AudioAttributesCompatParcelizer((findExplicitNames) this.write.getOnRemoveQueueItemAt());
        }
        this.write.getHandleMediaPlayPauseIfPendingOnHandler().AudioAttributesCompatParcelizer(this);
    }
}
