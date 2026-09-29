package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final class setYearUpdateRequired implements Runnable {
    private final setStateRank<getShowPopup> AudioAttributesCompatParcelizer;
    private final getPlatform write;

    /* JADX WARN: Multi-variable type inference failed */
    public setYearUpdateRequired(getPlatform getplatform, setStateRank<? super getShowPopup> setstaterank) {
        this.write = getplatform;
        this.AudioAttributesCompatParcelizer = setstaterank;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.write, getShowPopup.INSTANCE);
    }
}
