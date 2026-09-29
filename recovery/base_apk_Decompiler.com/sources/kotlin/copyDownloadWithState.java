package kotlin;

/* JADX INFO: loaded from: classes3.dex */
final class copyDownloadWithState implements DownloadManagerInternalHandler {
    copyDownloadWithState() {
    }

    @Override // kotlin.DownloadManagerInternalHandler
    public final Object write(Object obj) {
        return ((updateWaitingForRequirements) obj).onSetShuffleMode();
    }
}
