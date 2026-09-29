package kotlin;

/* JADX INFO: loaded from: classes5.dex */
public final class LocalMediaDrmCallback {
    public static <TInput, TResult, TException extends Throwable> TResult write(TInput tinput, acquireFirstSessionOnHandlerThread<TInput, TResult, TException> acquirefirstsessiononhandlerthread, OfflineLicenseHelper<TInput, TResult> offlineLicenseHelper) throws Throwable {
        TResult tresultRemoteActionCompatParcelizer;
        int i = 5;
        do {
            tresultRemoteActionCompatParcelizer = acquirefirstsessiononhandlerthread.RemoteActionCompatParcelizer(tinput);
            tinput = offlineLicenseHelper.read(tinput, tresultRemoteActionCompatParcelizer);
            if (tinput == null) {
                break;
            }
            i--;
        } while (i > 0);
        return tresultRemoteActionCompatParcelizer;
    }
}
