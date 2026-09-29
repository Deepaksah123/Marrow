package kotlin;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.core.view.WindowInsetsCompat;
import kotlin._byteOverflow;

/* JADX INFO: loaded from: classes2.dex */
public final class Java7Handlers {
    private static final WindowInsets IconCompatParcelizer = WindowInsetsCompat.IconCompatParcelizer.MediaBrowserCompatMediaItem();
    static boolean AudioAttributesCompatParcelizer = false;

    public static boolean IconCompatParcelizer(ViewGroup viewGroup) {
        return IconCompatParcelizer.read(viewGroup);
    }

    static WindowInsets RemoteActionCompatParcelizer(View view, WindowInsets windowInsets) {
        final View.OnApplyWindowInsetsListener onApplyWindowInsetsListener;
        Object tag = view.getTag(_byteOverflow.IconCompatParcelizer.tag_on_apply_window_listener);
        Object tag2 = view.getTag(_byteOverflow.IconCompatParcelizer.tag_window_insets_animation_callback);
        if (tag instanceof View.OnApplyWindowInsetsListener) {
            onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) tag;
        } else {
            onApplyWindowInsetsListener = tag2 instanceof View.OnApplyWindowInsetsListener ? (View.OnApplyWindowInsetsListener) tag2 : null;
        }
        final WindowInsets[] windowInsetsArr = new WindowInsets[1];
        view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: o.ValueInstantiationException
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets2) {
                return Java7Handlers.IconCompatParcelizer(windowInsetsArr, onApplyWindowInsetsListener, view2, windowInsets2);
            }
        });
        view.dispatchApplyWindowInsets(windowInsets);
        Object tag3 = view.getTag(_byteOverflow.IconCompatParcelizer.tag_compat_insets_dispatch);
        if (tag3 instanceof View.OnApplyWindowInsetsListener) {
            onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) tag3;
        }
        view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListener);
        WindowInsets windowInsets2 = windowInsetsArr[0];
        if (windowInsets2 != null && !windowInsets2.isConsumed() && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                RemoteActionCompatParcelizer(viewGroup.getChildAt(i), windowInsetsArr[0]);
            }
        }
        return windowInsetsArr[0];
    }

    static /* synthetic */ WindowInsets IconCompatParcelizer(WindowInsets[] windowInsetsArr, View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View view, WindowInsets windowInsets) {
        WindowInsets windowInsetsOnApplyWindowInsets;
        if (onApplyWindowInsetsListener != null) {
            windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        } else {
            windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
        }
        windowInsetsArr[0] = windowInsetsOnApplyWindowInsets;
        return IconCompatParcelizer;
    }

    static class IconCompatParcelizer {
        static boolean read(ViewGroup viewGroup) {
            return viewGroup.isTransitionGroup();
        }
    }
}
