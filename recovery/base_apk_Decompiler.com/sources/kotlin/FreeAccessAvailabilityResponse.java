package kotlin;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class FreeAccessAvailabilityResponse<T> extends AtomicInteger implements setShown<T> {
    @Override // kotlin.toLSModel
    public final boolean RemoteActionCompatParcelizer(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
