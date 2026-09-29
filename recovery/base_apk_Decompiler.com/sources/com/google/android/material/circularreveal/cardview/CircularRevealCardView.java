package com.google.android.material.circularreveal.cardview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.material.card.MaterialCardView;
import kotlin.getFlacExtractorConstructor;
import kotlin.getMidiExtractorConstructor;

/* JADX INFO: loaded from: classes5.dex */
public class CircularRevealCardView extends MaterialCardView implements getMidiExtractorConstructor {
    private final getFlacExtractorConstructor RemoteActionCompatParcelizer;

    public CircularRevealCardView(Context context) {
        this(context, null);
    }

    public CircularRevealCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.RemoteActionCompatParcelizer = new getFlacExtractorConstructor(this);
    }

    @Override // kotlin.getMidiExtractorConstructor
    public final void read() {
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.getMidiExtractorConstructor
    public final void RemoteActionCompatParcelizer() {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.getMidiExtractorConstructor
    public void setRevealInfo(getMidiExtractorConstructor.read readVar) {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(readVar);
    }

    @Override // kotlin.getMidiExtractorConstructor
    public final getMidiExtractorConstructor.read write() {
        return this.RemoteActionCompatParcelizer.read();
    }

    @Override // kotlin.getMidiExtractorConstructor
    public void setCircularRevealScrimColor(int i) {
        this.RemoteActionCompatParcelizer.read(i);
    }

    @Override // kotlin.getMidiExtractorConstructor
    public final int IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer.IconCompatParcelizer();
    }

    @Override // kotlin.getMidiExtractorConstructor
    public void setCircularRevealOverlayDrawable(Drawable drawable) {
        this.RemoteActionCompatParcelizer.write(drawable);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        getFlacExtractorConstructor getflacextractorconstructor = this.RemoteActionCompatParcelizer;
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
        getFlacExtractorConstructor getflacextractorconstructor = this.RemoteActionCompatParcelizer;
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
