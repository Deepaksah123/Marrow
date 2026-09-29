package com.google.android.material.circularreveal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.GridLayout;
import kotlin.getFlacExtractorConstructor;
import kotlin.getMidiExtractorConstructor;

/* JADX INFO: loaded from: classes5.dex */
public class CircularRevealGridLayout extends GridLayout implements getMidiExtractorConstructor {
    private final getFlacExtractorConstructor IconCompatParcelizer;

    public CircularRevealGridLayout(Context context) {
        this(context, null);
    }

    public CircularRevealGridLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.IconCompatParcelizer = new getFlacExtractorConstructor(this);
    }

    @Override // kotlin.getMidiExtractorConstructor
    public final void read() {
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.getMidiExtractorConstructor
    public final void RemoteActionCompatParcelizer() {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.getMidiExtractorConstructor
    public final getMidiExtractorConstructor.read write() {
        return this.IconCompatParcelizer.read();
    }

    @Override // kotlin.getMidiExtractorConstructor
    public void setRevealInfo(getMidiExtractorConstructor.read readVar) {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(readVar);
    }

    @Override // kotlin.getMidiExtractorConstructor
    public final int IconCompatParcelizer() {
        return this.IconCompatParcelizer.IconCompatParcelizer();
    }

    @Override // kotlin.getMidiExtractorConstructor
    public void setCircularRevealScrimColor(int i) {
        this.IconCompatParcelizer.read(i);
    }

    @Override // kotlin.getMidiExtractorConstructor
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.IconCompatParcelizer.write(drawable);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        getFlacExtractorConstructor getflacextractorconstructor = this.IconCompatParcelizer;
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
        getFlacExtractorConstructor getflacextractorconstructor = this.IconCompatParcelizer;
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
