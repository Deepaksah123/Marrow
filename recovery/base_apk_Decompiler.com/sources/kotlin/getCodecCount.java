package kotlin;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class getCodecCount implements ViewTreeObserver.OnPreDrawListener {
    private final Runnable AudioAttributesCompatParcelizer;
    private final AtomicReference<View> IconCompatParcelizer;
    private final Handler RemoteActionCompatParcelizer = new Handler(Looper.getMainLooper());
    private final Runnable write;

    public static void write(View view, Runnable runnable, Runnable runnable2) {
        view.getViewTreeObserver().addOnPreDrawListener(new getCodecCount(view, runnable, runnable2));
    }

    private getCodecCount(View view, Runnable runnable, Runnable runnable2) {
        this.IconCompatParcelizer = new AtomicReference<>(view);
        this.AudioAttributesCompatParcelizer = runnable;
        this.write = runnable2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View andSet = this.IconCompatParcelizer.getAndSet(null);
        if (andSet == null) {
            return true;
        }
        andSet.getViewTreeObserver().removeOnPreDrawListener(this);
        this.RemoteActionCompatParcelizer.post(this.AudioAttributesCompatParcelizer);
        this.RemoteActionCompatParcelizer.postAtFrontOfQueue(this.write);
        return true;
    }
}
