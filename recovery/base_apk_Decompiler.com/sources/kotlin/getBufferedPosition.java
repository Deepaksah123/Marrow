package kotlin;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class getBufferedPosition {
    private static Handler read;
    public static final Handler RemoteActionCompatParcelizer = RemoteActionCompatParcelizer(Looper.getMainLooper(), false);
    public static final Handler AudioAttributesCompatParcelizer = RemoteActionCompatParcelizer(Looper.getMainLooper(), true);

    public static Handler RemoteActionCompatParcelizer() {
        if (read == null) {
            read = RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer("epoxy"), true);
        }
        return read;
    }

    private static Handler RemoteActionCompatParcelizer(Looper looper, boolean z) {
        if (!z) {
            return new Handler(looper);
        }
        return Handler.createAsync(looper);
    }

    private static Looper AudioAttributesCompatParcelizer(String str) {
        HandlerThread handlerThread = new HandlerThread(str);
        handlerThread.start();
        return handlerThread.getLooper();
    }
}
