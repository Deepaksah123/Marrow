package kotlin;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class SubjectStatV2RSModel {
    private static int read(int i) {
        return (i >> 8) & 255;
    }

    public static void write(View view, Runnable runnable) {
        IconCompatParcelizer(view, runnable);
    }

    private static void IconCompatParcelizer(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static int AudioAttributesCompatParcelizer(int i) {
        return read(i);
    }
}
