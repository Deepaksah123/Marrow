package kotlin;

import android.graphics.Rect;
import android.view.Gravity;

/* JADX INFO: loaded from: classes2.dex */
public final class _clearIfStdImpl {
    public static void AudioAttributesCompatParcelizer(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        Gravity.apply(i, i2, i3, rect, rect2, i4);
    }

    public static int write(int i, int i2) {
        return Gravity.getAbsoluteGravity(i, i2);
    }
}
