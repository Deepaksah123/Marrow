package kotlin;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class RankPair<T> implements getTopRankers<T> {
    private final AtomicReference<getTopRankers<T>> read;

    public RankPair(getTopRankers<? extends T> gettoprankers) {
        toMagicModuleMetaRepoModel.write(gettoprankers, "");
        this.read = new AtomicReference<>(gettoprankers);
    }

    @Override // kotlin.getTopRankers
    public final Iterator<T> write() {
        getTopRankers<T> andSet = this.read.getAndSet(null);
        if (andSet == null) {
            throw new IllegalStateException("This sequence can be consumed only once.");
        }
        return andSet.write();
    }
}
