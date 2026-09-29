package kotlin;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes5.dex */
public final class ExtractorInput extends Drawable {
    private float AudioAttributesCompatParcelizer;
    private final Drawable IconCompatParcelizer;
    private final Drawable read;
    private final float[] write;

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    public ExtractorInput(Drawable drawable, Drawable drawable2) {
        this.IconCompatParcelizer = drawable.getConstantState().newDrawable().mutate();
        Drawable drawableMutate = drawable2.getConstantState().newDrawable().mutate();
        this.read = drawableMutate;
        drawableMutate.setAlpha(0);
        this.write = new float[2];
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.IconCompatParcelizer.draw(canvas);
        this.read.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.IconCompatParcelizer.setBounds(i, i2, i3, i4);
        this.read.setBounds(i, i2, i3, i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.max(this.IconCompatParcelizer.getIntrinsicWidth(), this.read.getIntrinsicWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return Math.max(this.IconCompatParcelizer.getIntrinsicHeight(), this.read.getIntrinsicHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return Math.max(this.IconCompatParcelizer.getMinimumWidth(), this.read.getMinimumWidth());
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return Math.max(this.IconCompatParcelizer.getMinimumHeight(), this.read.getMinimumHeight());
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.AudioAttributesCompatParcelizer <= 0.5f) {
            this.IconCompatParcelizer.setAlpha(i);
            this.read.setAlpha(0);
        } else {
            this.IconCompatParcelizer.setAlpha(0);
            this.read.setAlpha(i);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.IconCompatParcelizer.setColorFilter(colorFilter);
        this.read.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return this.IconCompatParcelizer.isStateful() || this.read.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setState(int[] iArr) {
        return this.IconCompatParcelizer.setState(iArr) || this.read.setState(iArr);
    }

    public final void IconCompatParcelizer(float f) {
        if (this.AudioAttributesCompatParcelizer != f) {
            this.AudioAttributesCompatParcelizer = f;
            peekToLength.RemoteActionCompatParcelizer(f, this.write);
            this.IconCompatParcelizer.setAlpha((int) (this.write[0] * 255.0f));
            this.read.setAlpha((int) (this.write[1] * 255.0f));
            invalidateSelf();
        }
    }
}
