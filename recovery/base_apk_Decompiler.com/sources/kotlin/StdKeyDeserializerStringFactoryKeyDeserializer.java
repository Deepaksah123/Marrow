package kotlin;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class StdKeyDeserializerStringFactoryKeyDeserializer {
    public static Handler write(Looper looper) {
        return read.write(looper);
    }

    static class read {
        public static Handler write(Looper looper) {
            return Handler.createAsync(looper);
        }
    }
}
