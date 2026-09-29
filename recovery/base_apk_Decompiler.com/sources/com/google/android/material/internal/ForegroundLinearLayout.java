package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import androidx.appcompat.widget.LinearLayoutCompat;
import kotlin.calculateNextSearchBytePosition;
import kotlin.readId3Metadata;

/* JADX INFO: loaded from: classes5.dex */
public class ForegroundLinearLayout extends LinearLayoutCompat {
    private boolean AudioAttributesCompatParcelizer;
    private final Rect AudioAttributesImplBaseParcelizer;
    private final Rect IconCompatParcelizer;
    private Drawable RemoteActionCompatParcelizer;
    private boolean read;
    private int write;

    public ForegroundLinearLayout(Context context) {
        this(context, null);
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ForegroundLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.AudioAttributesImplBaseParcelizer = new Rect();
        this.IconCompatParcelizer = new Rect();
        this.write = 119;
        this.AudioAttributesCompatParcelizer = true;
        this.read = false;
        TypedArray typedArrayWrite = readId3Metadata.write(context, attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.ForegroundLinearLayout, i, 0, new int[0]);
        this.write = typedArrayWrite.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.ForegroundLinearLayout_android_foregroundGravity, this.write);
        Drawable drawable = typedArrayWrite.getDrawable(calculateNextSearchBytePosition.MediaMetadataCompat.ForegroundLinearLayout_android_foreground);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.AudioAttributesCompatParcelizer = typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.ForegroundLinearLayout_foregroundInsidePadding, true);
        typedArrayWrite.recycle();
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.write;
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.write != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.write = i;
            if (i == 119 && this.RemoteActionCompatParcelizer != null) {
                this.RemoteActionCompatParcelizer.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.RemoteActionCompatParcelizer;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.RemoteActionCompatParcelizer;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.RemoteActionCompatParcelizer;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.RemoteActionCompatParcelizer.setState(getDrawableState());
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.RemoteActionCompatParcelizer;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.RemoteActionCompatParcelizer);
            }
            this.RemoteActionCompatParcelizer = drawable;
            this.read = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.write == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.read = z | this.read;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.read = true;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.RemoteActionCompatParcelizer;
        if (drawable != null) {
            if (this.read) {
                this.read = false;
                Rect rect = this.AudioAttributesImplBaseParcelizer;
                Rect rect2 = this.IconCompatParcelizer;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                if (this.AudioAttributesCompatParcelizer) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                Gravity.apply(this.write, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public void drawableHotspotChanged(float f, float f2) {
        super.drawableHotspotChanged(f, f2);
        Drawable drawable = this.RemoteActionCompatParcelizer;
        if (drawable != null) {
            drawable.setHotspot(f, f2);
        }
    }
}
