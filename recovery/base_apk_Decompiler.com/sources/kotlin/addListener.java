package kotlin;

/* JADX INFO: loaded from: classes2.dex */
final class addListener implements removeListener {
    private final String AudioAttributesCompatParcelizer;
    private String IconCompatParcelizer;
    private long write;

    addListener(String str) {
        this.AudioAttributesCompatParcelizer = str;
        RemoteActionCompatParcelizer();
    }

    private void RemoteActionCompatParcelizer() {
        this.write = -1L;
        this.IconCompatParcelizer = null;
    }

    @Override // kotlin.removeListener
    public final void AudioAttributesCompatParcelizer(String str) {
        if (this.write != -1) {
            throw new IllegalStateException("Timer was already started");
        }
        this.write = System.nanoTime();
        this.IconCompatParcelizer = str;
    }

    @Override // kotlin.removeListener
    public final void write() {
        if (this.write == -1) {
            throw new IllegalStateException("Timer was not started");
        }
        new Object[]{Float.valueOf((System.nanoTime() - this.write) / 1000000.0f)};
        RemoteActionCompatParcelizer();
    }
}
