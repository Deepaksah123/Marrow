package kotlin;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;

/* JADX INFO: loaded from: classes4.dex */
public final class setTopUserStat extends getChangeTotal {
    private ScaleGestureDetector write;

    public setTopUserStat(Context context) {
        super(context);
        this.write = new ScaleGestureDetector(context, new ScaleGestureDetector.OnScaleGestureListener() { // from class: o.setTopUserStat.1
            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
                return true;
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            }

            @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
            public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
                float scaleFactor = scaleGestureDetector.getScaleFactor();
                if (Float.isNaN(scaleFactor) || Float.isInfinite(scaleFactor)) {
                    return false;
                }
                setTopUserStat.this.IconCompatParcelizer.IconCompatParcelizer(scaleFactor, scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
                return true;
            }
        });
    }

    @Override // kotlin.getChangeCorrect, kotlin.getTopUserStat
    public final boolean write() {
        return this.write.isInProgress();
    }

    @Override // kotlin.getChangeTotal, kotlin.getChangeCorrect, kotlin.getTopUserStat
    public final boolean RemoteActionCompatParcelizer(MotionEvent motionEvent) {
        try {
            this.write.onTouchEvent(motionEvent);
            return super.RemoteActionCompatParcelizer(motionEvent);
        } catch (IllegalArgumentException unused) {
            return true;
        }
    }
}
