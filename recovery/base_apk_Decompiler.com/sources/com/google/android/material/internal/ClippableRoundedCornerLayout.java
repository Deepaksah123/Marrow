package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes5.dex */
public class ClippableRoundedCornerLayout extends FrameLayout {
    private Path IconCompatParcelizer;
    private float read;

    public ClippableRoundedCornerLayout(Context context) {
        super(context);
    }

    public ClippableRoundedCornerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ClippableRoundedCornerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (this.IconCompatParcelizer == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipPath(this.IconCompatParcelizer);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    public final void read() {
        this.IconCompatParcelizer = null;
        this.read = BitmapDescriptorFactory.HUE_RED;
        invalidate();
    }

    public final float write() {
        return this.read;
    }

    public final void read(float f) {
        AudioAttributesCompatParcelizer(getLeft(), getTop(), getRight(), getBottom(), f);
    }

    public final void AudioAttributesCompatParcelizer(Rect rect, float f) {
        AudioAttributesCompatParcelizer(rect.left, rect.top, rect.right, rect.bottom, f);
    }

    private void AudioAttributesCompatParcelizer(float f, float f2, float f3, float f4, float f5) {
        RemoteActionCompatParcelizer(new RectF(f, f2, f3, f4), f5);
    }

    private void RemoteActionCompatParcelizer(RectF rectF, float f) {
        if (this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = new Path();
        }
        this.read = f;
        this.IconCompatParcelizer.reset();
        this.IconCompatParcelizer.addRoundRect(rectF, f, f, Path.Direction.CW);
        this.IconCompatParcelizer.close();
        invalidate();
    }
}
