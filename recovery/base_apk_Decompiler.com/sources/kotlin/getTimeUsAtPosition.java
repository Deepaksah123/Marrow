package kotlin;

import android.graphics.Canvas;

/* JADX INFO: loaded from: classes3.dex */
public final class getTimeUsAtPosition {

    /* JADX INFO: loaded from: classes5.dex */
    public interface IconCompatParcelizer {
        void RemoteActionCompatParcelizer(Canvas canvas);
    }

    public static int RemoteActionCompatParcelizer(Canvas canvas, float f, float f2, float f3, float f4, int i) {
        return canvas.saveLayerAlpha(f, f2, f3, f4, i);
    }
}
