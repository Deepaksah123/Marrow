package kotlin;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class TimelineCompanion extends CancellationException {
    public final transient Object write;

    public TimelineCompanion(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.write = obj;
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
