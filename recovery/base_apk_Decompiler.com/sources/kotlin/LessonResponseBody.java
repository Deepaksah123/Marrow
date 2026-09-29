package kotlin;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class LessonResponseBody {
    public static getIds RemoteActionCompatParcelizer(Callable<getIds> callable) {
        return AudioAttributesCompatParcelizer(callable);
    }

    public static getIds RemoteActionCompatParcelizer(getIds getids) {
        if (getids != null) {
            return getids;
        }
        throw new NullPointerException("scheduler == null");
    }

    private static getIds AudioAttributesCompatParcelizer(Callable<getIds> callable) {
        try {
            getIds getidsCall = callable.call();
            if (getidsCall != null) {
                return getidsCall;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th) {
            throw getEndTimeMs.read(th);
        }
    }
}
