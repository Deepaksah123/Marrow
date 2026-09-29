package com.google.android.material.circularreveal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import kotlin.getFlacExtractorConstructor;
import kotlin.getMidiExtractorConstructor;

/* JADX INFO: loaded from: classes5.dex */
public class CircularRevealLinearLayout extends LinearLayout implements getMidiExtractorConstructor {
    private final getFlacExtractorConstructor AudioAttributesCompatParcelizer;

    public CircularRevealLinearLayout(Context context) {
        this(context, null);
    }

    public CircularRevealLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.AudioAttributesCompatParcelizer = new getFlacExtractorConstructor(this);
    }

    @Override // kotlin.getMidiExtractorConstructor
    public final void read() {
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.getMidiExtractorConstructor
    public final void RemoteActionCompatParcelizer() {
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.getMidiExtractorConstructor
    public final getMidiExtractorConstructor.read write() {
        return this.AudioAttributesCompatParcelizer.read();
    }

    @Override // kotlin.getMidiExtractorConstructor
    public void setRevealInfo(getMidiExtractorConstructor.read readVar) {
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(readVar);
    }

    @Override // kotlin.getMidiExtractorConstructor
    public final int IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
    }

    @Override // kotlin.getMidiExtractorConstructor
    public void setCircularRevealScrimColor(int i) {
        this.AudioAttributesCompatParcelizer.read(i);
    }

    @Override // kotlin.getMidiExtractorConstructor
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.AudioAttributesCompatParcelizer.write(drawable);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        getFlacExtractorConstructor getflacextractorconstructor = this.AudioAttributesCompatParcelizer;
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
        getFlacExtractorConstructor getflacextractorconstructor = this.AudioAttributesCompatParcelizer;
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
