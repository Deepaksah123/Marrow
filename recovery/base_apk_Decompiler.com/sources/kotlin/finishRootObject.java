package kotlin;

import android.R;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes2.dex */
public final class finishRootObject {
    private final RemoteActionCompatParcelizer write;

    public finishRootObject(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.write = new AudioAttributesCompatParcelizer(view);
        } else {
            this.write = new write(view);
        }
    }

    @Deprecated
    finishRootObject(WindowInsetsController windowInsetsController) {
        this.write = new AudioAttributesCompatParcelizer(windowInsetsController);
    }

    public final void read() {
        this.write.RemoteActionCompatParcelizer();
    }

    public final void RemoteActionCompatParcelizer() {
        this.write.IconCompatParcelizer();
    }

    static class RemoteActionCompatParcelizer {
        void IconCompatParcelizer() {
        }

        void RemoteActionCompatParcelizer() {
        }

        RemoteActionCompatParcelizer() {
        }
    }

    static class write extends RemoteActionCompatParcelizer {
        private final View write;

        write(View view) {
            this.write = view;
        }

        @Override // o.finishRootObject.RemoteActionCompatParcelizer
        void RemoteActionCompatParcelizer() {
            final View viewFindViewById = this.write;
            if (viewFindViewById != null) {
                if (viewFindViewById.isInEditMode() || viewFindViewById.onCheckIsTextEditor()) {
                    viewFindViewById.requestFocus();
                } else {
                    viewFindViewById = viewFindViewById.getRootView().findFocus();
                }
                if (viewFindViewById == null) {
                    viewFindViewById = this.write.getRootView().findViewById(R.id.content);
                }
                if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
                    return;
                }
                viewFindViewById.post(new Runnable() { // from class: o.InvalidDefinitionException
                    @Override // java.lang.Runnable
                    public final void run() {
                        View view = viewFindViewById;
                        ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                    }
                });
            }
        }

        @Override // o.finishRootObject.RemoteActionCompatParcelizer
        void IconCompatParcelizer() {
            View view = this.write;
            if (view != null) {
                ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.write.getWindowToken(), 0);
            }
        }
    }

    static class AudioAttributesCompatParcelizer extends write {
        private WindowInsetsController RemoteActionCompatParcelizer;
        private View read;

        AudioAttributesCompatParcelizer(View view) {
            super(view);
            this.read = view;
        }

        AudioAttributesCompatParcelizer(WindowInsetsController windowInsetsController) {
            super(null);
            this.RemoteActionCompatParcelizer = windowInsetsController;
        }

        @Override // o.finishRootObject.write, o.finishRootObject.RemoteActionCompatParcelizer
        void RemoteActionCompatParcelizer() {
            if (this.read != null && Build.VERSION.SDK_INT < 33) {
                ((InputMethodManager) this.read.getContext().getSystemService("input_method")).isActive();
            }
            WindowInsetsController windowInsetsController = this.RemoteActionCompatParcelizer;
            if (windowInsetsController == null) {
                View view = this.read;
                windowInsetsController = view != null ? view.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                windowInsetsController.show(WindowInsets.Type.ime());
            }
            super.RemoteActionCompatParcelizer();
        }

        @Override // o.finishRootObject.write, o.finishRootObject.RemoteActionCompatParcelizer
        void IconCompatParcelizer() {
            View view;
            WindowInsetsController windowInsetsController = this.RemoteActionCompatParcelizer;
            if (windowInsetsController == null) {
                View view2 = this.read;
                windowInsetsController = view2 != null ? view2.getWindowInsetsController() : null;
            }
            if (windowInsetsController != null) {
                final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: o.putDeferredValue
                    @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                    public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController2, int i) {
                        atomicBoolean.set((i & 8) != 0);
                    }
                };
                windowInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
                if (!atomicBoolean.get() && (view = this.read) != null) {
                    ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.read.getWindowToken(), 0);
                }
                windowInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
                windowInsetsController.hide(WindowInsets.Type.ime());
                return;
            }
            super.IconCompatParcelizer();
        }
    }
}
