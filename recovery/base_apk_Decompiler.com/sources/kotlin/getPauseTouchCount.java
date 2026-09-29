package kotlin;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class getPauseTouchCount extends CancellationException {
    public getPauseTouchCount() {
        super("Child of the scoped flow was cancelled");
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        if (getCollegeId.IconCompatParcelizer()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
