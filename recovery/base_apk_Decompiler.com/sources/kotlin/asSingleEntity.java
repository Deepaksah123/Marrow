package kotlin;

import in.juspay.hyper.constants.LogCategory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J!\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\f2\n\u0010\u000f\u001a\u00060\u0011j\u0002`\u0010H\u0016¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\bH\u0016¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/Unconfined;", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "()V", "limitedParallelism", "parallelism", "", "name", "", "isDispatchNeeded", "", LogCategory.CONTEXT, "Lkotlin/coroutines/CoroutineContext;", "dispatch", "", "block", "Lkotlinx/coroutines/Runnable;", "Ljava/lang/Runnable;", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "toString", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class asSingleEntity extends getPlatform {
    public static final asSingleEntity AudioAttributesCompatParcelizer = new asSingleEntity();

    @Override // kotlin.getPlatform
    public final boolean IconCompatParcelizer(CurrentQuery currentQuery) {
        return false;
    }

    private asSingleEntity() {
    }

    @Override // kotlin.getPlatform
    public final getPlatform read(int i, String str) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // kotlin.getPlatform
    public final void RemoteActionCompatParcelizer(CurrentQuery currentQuery, Runnable runnable) {
        setCountryCode setcountrycode = (setCountryCode) currentQuery.get(setCountryCode.INSTANCE);
        if (setcountrycode != null) {
            setcountrycode.write = true;
            return;
        }
        throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
    }

    @Override // kotlin.getPlatform
    public final String toString() {
        return "Dispatchers.Unconfined";
    }
}
