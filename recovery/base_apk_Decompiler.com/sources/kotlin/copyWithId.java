package kotlin;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
abstract class copyWithId<TResult> {
    protected final Executor write;

    abstract void read(TResult tresult);

    copyWithId(Executor executor) {
        this.write = executor;
    }
}
