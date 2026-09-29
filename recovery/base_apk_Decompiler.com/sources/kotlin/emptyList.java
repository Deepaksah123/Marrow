package kotlin;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class emptyList {
    @Deprecated
    public static int read(MotionEvent motionEvent) {
        return motionEvent.getPointerCount();
    }

    public static boolean IconCompatParcelizer(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}
