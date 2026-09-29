package androidx.test.internal.util;

import androidx.test.internal.platform.ServiceLoaderWrapper;
import androidx.test.internal.platform.ThreadChecker;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class Checks {
    public static <T> T RemoteActionCompatParcelizer(T t) {
        return t;
    }

    static {
        List listWrite = ServiceLoaderWrapper.write(ThreadChecker.class);
        if (listWrite.isEmpty()) {
            new ThreadChecker() { // from class: androidx.test.internal.util.Checks.1
            };
        } else {
            if (listWrite.size() == 1) {
                return;
            }
            throw new IllegalStateException(String.format("Found more than one %s implementations.", ThreadChecker.class.getName()));
        }
    }
}
