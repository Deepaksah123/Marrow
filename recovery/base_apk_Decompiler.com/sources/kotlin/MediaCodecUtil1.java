package kotlin;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class MediaCodecUtil1 implements ViewTreeObserver.OnDrawListener {
    private final Runnable RemoteActionCompatParcelizer;
    private final Handler read = new Handler(Looper.getMainLooper());
    private final AtomicReference<View> write;

    public static void IconCompatParcelizer(View view, Runnable runnable) {
        view.getViewTreeObserver().addOnDrawListener(new MediaCodecUtil1(view, runnable));
    }

    private MediaCodecUtil1(View view, Runnable runnable) {
        this.write = new AtomicReference<>(view);
        this.RemoteActionCompatParcelizer = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        final View andSet = this.write.getAndSet(null);
        if (andSet == null) {
            return;
        }
        andSet.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: o.MediaCodecUtilExternalSyntheticLambda2
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.read.RemoteActionCompatParcelizer(andSet);
            }
        });
        this.read.postAtFrontOfQueue(this.RemoteActionCompatParcelizer);
    }

    final /* synthetic */ void RemoteActionCompatParcelizer(View view) {
        view.getViewTreeObserver().removeOnDrawListener(this);
    }
}
