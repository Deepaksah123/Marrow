package kotlin;

import android.graphics.Canvas;

/* JADX INFO: loaded from: classes4.dex */
final class ScatterChart {
    static void RemoteActionCompatParcelizer(Canvas canvas, boolean z) {
        if (z) {
            IconCompatParcelizer.IconCompatParcelizer(canvas);
        } else {
            IconCompatParcelizer.write(canvas);
        }
    }

    static class IconCompatParcelizer {
        static void IconCompatParcelizer(Canvas canvas) {
            canvas.enableZ();
        }

        static void write(Canvas canvas) {
            canvas.disableZ();
        }
    }
}
