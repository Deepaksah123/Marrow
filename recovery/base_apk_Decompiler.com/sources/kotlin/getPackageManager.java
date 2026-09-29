package kotlin;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes2.dex */
public final class getPackageManager {
    public static void write(ViewGroup viewGroup, boolean z) {
        RemoteActionCompatParcelizer.write(viewGroup, z);
    }

    static int AudioAttributesCompatParcelizer(ViewGroup viewGroup, int i) {
        return RemoteActionCompatParcelizer.write(viewGroup, i);
    }

    static class RemoteActionCompatParcelizer {
        static void write(ViewGroup viewGroup, boolean z) {
            viewGroup.suppressLayout(z);
        }

        static int write(ViewGroup viewGroup, int i) {
            return viewGroup.getChildDrawingOrder(i);
        }
    }
}
