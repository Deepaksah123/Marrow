package kotlin;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes2.dex */
final class getSurfaceSize extends RecyclerView.read {
    private boolean write;

    getSurfaceSize() {
    }

    final void RemoteActionCompatParcelizer() {
        this.write = true;
    }

    final void AudioAttributesCompatParcelizer() {
        this.write = false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.read
    public final void read() {
        if (!this.write) {
            throw new IllegalStateException("You cannot notify item changes directly. Call `requestModelBuild` instead.");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.read
    public final void IconCompatParcelizer(int i, int i2) {
        read();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.read
    public final void AudioAttributesCompatParcelizer(int i, int i2, Object obj) {
        read();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.read
    public final void AudioAttributesCompatParcelizer(int i, int i2) {
        read();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.read
    public final void read(int i, int i2) {
        read();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.read
    public final void RemoteActionCompatParcelizer(int i, int i2) {
        read();
    }
}
