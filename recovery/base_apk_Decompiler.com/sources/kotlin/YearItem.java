package kotlin;

import kotlinx.coroutines.CoroutineExceptionHandler;

/* JADX INFO: loaded from: classes4.dex */
public final class YearItem {
    public static final void read(CurrentQuery currentQuery, Throwable th) {
        try {
            CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler) currentQuery.get(CoroutineExceptionHandler.INSTANCE);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.handleException(currentQuery, th);
            } else {
                getSelectedUrlIndex.AudioAttributesCompatParcelizer(currentQuery, th);
            }
        } catch (Throwable th2) {
            getSelectedUrlIndex.AudioAttributesCompatParcelizer(currentQuery, write(th, th2));
        }
    }

    public static final Throwable write(Throwable th, Throwable th2) {
        if (th == th2) {
            return th;
        }
        RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
        getPlanName.IconCompatParcelizer(runtimeException, th);
        return runtimeException;
    }

    public static final class RemoteActionCompatParcelizer extends getUnderrunThreshold implements CoroutineExceptionHandler {
        private /* synthetic */ MagicModuleSubmissionRequestBody<CurrentQuery, Throwable, getShowPopup> RemoteActionCompatParcelizer;

        @Override // kotlinx.coroutines.CoroutineExceptionHandler
        public final void handleException(CurrentQuery currentQuery, Throwable th) {
            throw null;
        }
    }
}
