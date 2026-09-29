package kotlin;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class addCtor<V> {
    private final AtomicReference<V> RemoteActionCompatParcelizer = new AtomicReference<>(null);

    public final V read() {
        return this.RemoteActionCompatParcelizer.get();
    }

    public final boolean AudioAttributesCompatParcelizer(V v) {
        return setBackInvokedCallbackEnabled.read(this.RemoteActionCompatParcelizer, null, v);
    }
}
