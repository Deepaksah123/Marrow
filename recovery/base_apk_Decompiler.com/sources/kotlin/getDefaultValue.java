package kotlin;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import kotlin.ArrayBuildersByteBuilder;

/* JADX INFO: loaded from: classes4.dex */
public final class getDefaultValue extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, ArrayBuildersByteBuilder.IconCompatParcelizer {
    private final IconCompatParcelizer RemoteActionCompatParcelizer;
    private final GestureDetector read;
    private final PointF AudioAttributesCompatParcelizer = new PointF();
    private final PointF write = new PointF();
    private final float IconCompatParcelizer = 25.0f;
    private volatile float AudioAttributesImplApi26Parcelizer = 3.1415927f;

    public interface IconCompatParcelizer {
        default boolean IconCompatParcelizer() {
            return false;
        }

        void write(PointF pointF);
    }

    public getDefaultValue(Context context, IconCompatParcelizer iconCompatParcelizer) {
        this.RemoteActionCompatParcelizer = iconCompatParcelizer;
        this.read = new GestureDetector(context, this);
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        return this.read.onTouchEvent(motionEvent);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        this.AudioAttributesCompatParcelizer.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.AudioAttributesCompatParcelizer.x) / this.IconCompatParcelizer;
        float y = (motionEvent2.getY() - this.AudioAttributesCompatParcelizer.y) / this.IconCompatParcelizer;
        this.AudioAttributesCompatParcelizer.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.AudioAttributesImplApi26Parcelizer;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        this.write.x -= (fCos * x) - (fSin * y);
        this.write.y += (fSin * x) + (fCos * y);
        PointF pointF = this.write;
        pointF.y = Math.max(-45.0f, Math.min(45.0f, pointF.y));
        this.RemoteActionCompatParcelizer.write(this.write);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.RemoteActionCompatParcelizer.IconCompatParcelizer();
    }

    @Override // o.ArrayBuildersByteBuilder.IconCompatParcelizer
    public final void write(float[] fArr, float f) {
        this.AudioAttributesImplApi26Parcelizer = -f;
    }
}
