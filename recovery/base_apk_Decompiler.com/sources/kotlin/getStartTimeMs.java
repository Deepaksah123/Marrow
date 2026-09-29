package kotlin;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
abstract class getStartTimeMs<T> extends AtomicReference<T> implements MarkIncompleteResponseBody {
    protected abstract void AudioAttributesCompatParcelizer(T t);

    getStartTimeMs(T t) {
        super(setHasPyt.AudioAttributesCompatParcelizer(t, "value is null"));
    }

    @Override // kotlin.MarkIncompleteResponseBody
    public final void aL_() {
        T andSet;
        if (get() == null || (andSet = getAndSet(null)) == null) {
            return;
        }
        AudioAttributesCompatParcelizer(andSet);
    }

    @Override // kotlin.MarkIncompleteResponseBody
    public final boolean write() {
        return get() == null;
    }
}
