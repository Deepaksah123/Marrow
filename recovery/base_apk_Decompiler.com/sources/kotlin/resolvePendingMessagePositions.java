package kotlin;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
abstract class resolvePendingMessagePositions<V, O> implements resolvePendingMessagePosition<V, O> {
    final List<setEncoderDelay<V>> AudioAttributesCompatParcelizer;

    resolvePendingMessagePositions(List<setEncoderDelay<V>> list) {
        this.AudioAttributesCompatParcelizer = list;
    }

    @Override // kotlin.resolvePendingMessagePosition
    public List<setEncoderDelay<V>> RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.resolvePendingMessagePosition
    public boolean AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.isEmpty() || (this.AudioAttributesCompatParcelizer.size() == 1 && this.AudioAttributesCompatParcelizer.get(0).MediaBrowserCompatItemReceiver());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (!this.AudioAttributesCompatParcelizer.isEmpty()) {
            sb.append("values=");
            sb.append(Arrays.toString(this.AudioAttributesCompatParcelizer.toArray()));
        }
        return sb.toString();
    }
}
