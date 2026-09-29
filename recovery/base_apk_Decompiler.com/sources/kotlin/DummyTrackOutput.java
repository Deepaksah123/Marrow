package kotlin;

import android.animation.Animator;

/* JADX INFO: loaded from: classes5.dex */
public final class DummyTrackOutput {
    private Animator RemoteActionCompatParcelizer;

    public final void read(Animator animator) {
        read();
        this.RemoteActionCompatParcelizer = animator;
    }

    private void read() {
        Animator animator = this.RemoteActionCompatParcelizer;
        if (animator != null) {
            animator.cancel();
        }
    }

    public final void AudioAttributesCompatParcelizer() {
        this.RemoteActionCompatParcelizer = null;
    }
}
