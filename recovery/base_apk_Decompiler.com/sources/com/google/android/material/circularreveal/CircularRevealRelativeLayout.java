package com.google.android.material.circularreveal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import kotlin.getFlacExtractorConstructor;
import kotlin.getMidiExtractorConstructor;

/* JADX INFO: loaded from: classes5.dex */
public class CircularRevealRelativeLayout extends RelativeLayout implements getMidiExtractorConstructor {
    private final getFlacExtractorConstructor write;

    public CircularRevealRelativeLayout(Context context) {
        this(context, null);
    }

    public CircularRevealRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.write = new getFlacExtractorConstructor(this);
    }

    @Override // kotlin.getMidiExtractorConstructor
    public final void read() {
        this.write.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.getMidiExtractorConstructor
    public final void RemoteActionCompatParcelizer() {
        this.write.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.getMidiExtractorConstructor
    public final getMidiExtractorConstructor.read write() {
        return this.write.read();
    }

    @Override // kotlin.getMidiExtractorConstructor
    public void setRevealInfo(getMidiExtractorConstructor.read readVar) {
        this.write.RemoteActionCompatParcelizer(readVar);
    }

    @Override // kotlin.getMidiExtractorConstructor
    public final int IconCompatParcelizer() {
        return this.write.IconCompatParcelizer();
    }

    @Override // kotlin.getMidiExtractorConstructor
    public void setCircularRevealScrimColor(int i) {
        this.write.read(i);
    }

    @Override // kotlin.getMidiExtractorConstructor
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.write.write(drawable);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        getFlacExtractorConstructor getflacextractorconstructor = this.write;
        if (getflacextractorconstructor != null) {
            getflacextractorconstructor.AudioAttributesCompatParcelizer(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // o.getFlacExtractorConstructor.write
    public final void read(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // android.view.View
    public boolean isOpaque() {
        getFlacExtractorConstructor getflacextractorconstructor = this.write;
        if (getflacextractorconstructor != null) {
            return getflacextractorconstructor.write();
        }
        return super.isOpaque();
    }

    @Override // o.getFlacExtractorConstructor.write
    public final boolean AudioAttributesCompatParcelizer() {
        return super.isOpaque();
    }
}
