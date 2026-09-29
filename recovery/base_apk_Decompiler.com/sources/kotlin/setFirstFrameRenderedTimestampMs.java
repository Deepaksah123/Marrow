package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class setFirstFrameRenderedTimestampMs extends RuntimeException {
    private final transient CurrentQuery RemoteActionCompatParcelizer;

    public setFirstFrameRenderedTimestampMs(CurrentQuery currentQuery) {
        this.RemoteActionCompatParcelizer = currentQuery;
    }

    @Override // java.lang.Throwable
    public final String getLocalizedMessage() {
        return this.RemoteActionCompatParcelizer.toString();
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
