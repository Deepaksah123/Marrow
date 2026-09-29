package kotlin;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class shortFromChars {
    private final GestureDetector IconCompatParcelizer;

    public shortFromChars(Context context, GestureDetector.OnGestureListener onGestureListener) {
        this(context, onGestureListener, null);
    }

    public shortFromChars(Context context, GestureDetector.OnGestureListener onGestureListener, Handler handler) {
        this.IconCompatParcelizer = new GestureDetector(context, onGestureListener, handler);
    }

    public final boolean write(MotionEvent motionEvent) {
        return this.IconCompatParcelizer.onTouchEvent(motionEvent);
    }
}
