package kotlin;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class getDeeplink {
    private static final getIds write = LessonResponseBody.RemoteActionCompatParcelizer(new Callable<getIds>() { // from class: o.getDeeplink.4
        @Override // java.util.concurrent.Callable
        public final /* synthetic */ getIds call() throws Exception {
            return IconCompatParcelizer();
        }

        private static getIds IconCompatParcelizer() throws Exception {
            return write.RemoteActionCompatParcelizer;
        }
    });

    static final class write {
        static final getIds RemoteActionCompatParcelizer = new VideoBookmarkTimeline(new Handler(Looper.getMainLooper()));
    }

    public static getIds read() {
        return LessonResponseBody.RemoteActionCompatParcelizer(write);
    }
}
