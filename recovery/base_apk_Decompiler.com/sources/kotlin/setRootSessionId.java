package kotlin;

import java.util.List;
import kotlinx.coroutines.internal.MainDispatcherFactory;

/* JADX INFO: loaded from: classes4.dex */
public final class setRootSessionId {
    public static final isFmgStudent AudioAttributesCompatParcelizer(MainDispatcherFactory mainDispatcherFactory, List<? extends MainDispatcherFactory> list) {
        try {
            return mainDispatcherFactory.createDispatcher(list);
        } catch (Throwable th) {
            return AudioAttributesCompatParcelizer(th, mainDispatcherFactory.hintOnError());
        }
    }

    public static final boolean IconCompatParcelizer(isFmgStudent isfmgstudent) {
        return isfmgstudent.RemoteActionCompatParcelizer() instanceof setResolution;
    }

    static /* synthetic */ setResolution write(Throwable th, int i) {
        if ((i & 1) != 0) {
            th = null;
        }
        return AudioAttributesCompatParcelizer(th, (String) null);
    }

    private static final setResolution AudioAttributesCompatParcelizer(Throwable th, String str) {
        return new setResolution(th, str);
    }

    public static final Void read() {
        throw new IllegalStateException("Module with the Main dispatcher is missing. Add dependency providing the Main dispatcher, e.g. 'kotlinx-coroutines-android' and ensure it has the same version as 'kotlinx-coroutines-core'");
    }
}
