package kotlin;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes2.dex */
public final class childArray implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    private final View IconCompatParcelizer;
    private ViewTreeObserver read;
    private final Runnable write;

    private childArray(View view, Runnable runnable) {
        this.IconCompatParcelizer = view;
        this.read = view.getViewTreeObserver();
        this.write = runnable;
    }

    public static childArray RemoteActionCompatParcelizer(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        childArray childarray = new childArray(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(childarray);
        view.addOnAttachStateChangeListener(childarray);
        return childarray;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        RemoteActionCompatParcelizer();
        this.write.run();
        return true;
    }

    private void RemoteActionCompatParcelizer() {
        if (this.read.isAlive()) {
            this.read.removeOnPreDrawListener(this);
        } else {
            this.IconCompatParcelizer.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.IconCompatParcelizer.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.read = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        RemoteActionCompatParcelizer();
    }
}
