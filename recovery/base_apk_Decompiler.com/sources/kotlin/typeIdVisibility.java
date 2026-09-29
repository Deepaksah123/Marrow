package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class typeIdVisibility {
    private boolean AudioAttributesCompatParcelizer;
    private final buildTypeDeserializer read;

    public typeIdVisibility() {
        this(buildTypeDeserializer.write);
    }

    public typeIdVisibility(buildTypeDeserializer buildtypedeserializer) {
        this.read = buildtypedeserializer;
    }

    public final boolean read() {
        synchronized (this) {
            if (this.AudioAttributesCompatParcelizer) {
                return false;
            }
            this.AudioAttributesCompatParcelizer = true;
            notifyAll();
            return true;
        }
    }

    public final boolean IconCompatParcelizer() {
        boolean z;
        synchronized (this) {
            z = this.AudioAttributesCompatParcelizer;
            this.AudioAttributesCompatParcelizer = false;
        }
        return z;
    }

    public final void write() throws InterruptedException {
        synchronized (this) {
            while (!this.AudioAttributesCompatParcelizer) {
                wait();
            }
        }
    }

    public final void AudioAttributesCompatParcelizer() {
        synchronized (this) {
            boolean z = false;
            while (!this.AudioAttributesCompatParcelizer) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final boolean RemoteActionCompatParcelizer() {
        boolean z;
        synchronized (this) {
            z = this.AudioAttributesCompatParcelizer;
        }
        return z;
    }
}
