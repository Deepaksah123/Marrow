package kotlin;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
final class _constructCreatorKeyDeserializer {
    static Handler IconCompatParcelizer() {
        if (Looper.myLooper() == null) {
            return new Handler(Looper.getMainLooper());
        }
        return new Handler();
    }
}
