package kotlin;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

/* JADX INFO: loaded from: classes5.dex */
public final class maybeLoadExtractorConstructor implements View.OnTouchListener {
    private final int AudioAttributesCompatParcelizer;
    private final Dialog IconCompatParcelizer;
    private final int RemoteActionCompatParcelizer;
    private final int read;

    public maybeLoadExtractorConstructor(Dialog dialog, Rect rect) {
        this.IconCompatParcelizer = dialog;
        this.read = rect.left;
        this.RemoteActionCompatParcelizer = rect.top;
        this.AudioAttributesCompatParcelizer = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = this.read + viewFindViewById.getLeft();
        int width = viewFindViewById.getWidth();
        if (new RectF(left, this.RemoteActionCompatParcelizer + viewFindViewById.getTop(), width + left, viewFindViewById.getHeight() + r3).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        view.performClick();
        return this.IconCompatParcelizer.onTouchEvent(motionEventObtain);
    }
}
