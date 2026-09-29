package kotlin;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class _weirdKey {
    private boolean AudioAttributesCompatParcelizer;
    private boolean RemoteActionCompatParcelizer;
    private Object read;
    private AudioAttributesCompatParcelizer write;

    public interface AudioAttributesCompatParcelizer {
        void IconCompatParcelizer();
    }

    public final void read() {
        synchronized (this) {
            if (this.RemoteActionCompatParcelizer) {
                return;
            }
            this.RemoteActionCompatParcelizer = true;
            this.AudioAttributesCompatParcelizer = true;
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.write;
            if (audioAttributesCompatParcelizer != null) {
                try {
                    audioAttributesCompatParcelizer.IconCompatParcelizer();
                } catch (Throwable th) {
                    synchronized (this) {
                        this.AudioAttributesCompatParcelizer = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            synchronized (this) {
                this.AudioAttributesCompatParcelizer = false;
                notifyAll();
            }
        }
    }

    public final void write(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        synchronized (this) {
            IconCompatParcelizer();
            if (this.write == audioAttributesCompatParcelizer) {
                return;
            }
            this.write = audioAttributesCompatParcelizer;
            if (this.RemoteActionCompatParcelizer) {
                audioAttributesCompatParcelizer.IconCompatParcelizer();
            }
        }
    }

    private void IconCompatParcelizer() {
        while (this.AudioAttributesCompatParcelizer) {
            try {
                wait();
            } catch (InterruptedException unused) {
            }
        }
    }
}
