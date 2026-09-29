package kotlin;

import android.os.Build;
import android.view.View;
import android.view.Window;

/* JADX INFO: loaded from: classes2.dex */
public final class _IsXOfY {
    public static void write(Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 35) {
            read.RemoteActionCompatParcelizer(window, z);
        } else if (Build.VERSION.SDK_INT >= 30) {
            RemoteActionCompatParcelizer.IconCompatParcelizer(window, z);
        } else {
            IconCompatParcelizer.RemoteActionCompatParcelizer(window, z);
        }
    }

    public static findNameForMutator IconCompatParcelizer(Window window, View view) {
        return new findNameForMutator(window, view);
    }

    static class IconCompatParcelizer {
        static void RemoteActionCompatParcelizer(Window window, boolean z) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
        }
    }

    static class RemoteActionCompatParcelizer {
        static void IconCompatParcelizer(Window window, boolean z) {
            View decorView = window.getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility & (-257) : systemUiVisibility | 256);
            window.setDecorFitsSystemWindows(z);
        }
    }

    static class read {
        static void RemoteActionCompatParcelizer(Window window, boolean z) {
            window.setDecorFitsSystemWindows(z);
        }
    }
}
