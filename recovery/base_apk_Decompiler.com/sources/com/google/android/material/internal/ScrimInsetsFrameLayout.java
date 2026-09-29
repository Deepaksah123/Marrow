package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.WindowInsetsCompat;
import kotlin.InvalidTypeIdException;
import kotlin.calculateNextSearchBytePosition;
import kotlin.finishBranchObject;
import kotlin.readId3Metadata;

/* JADX INFO: loaded from: classes5.dex */
public class ScrimInsetsFrameLayout extends FrameLayout {
    Drawable AudioAttributesCompatParcelizer;
    private Rect AudioAttributesImplApi26Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    Rect IconCompatParcelizer;
    private boolean RemoteActionCompatParcelizer;
    private boolean read;
    private boolean write;

    protected void RemoteActionCompatParcelizer(WindowInsetsCompat windowInsetsCompat) {
    }

    public ScrimInsetsFrameLayout(Context context) {
        this(context, null);
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.AudioAttributesImplApi26Parcelizer = new Rect();
        this.AudioAttributesImplBaseParcelizer = true;
        this.read = true;
        this.RemoteActionCompatParcelizer = true;
        this.write = true;
        TypedArray typedArrayWrite = readId3Metadata.write(context, attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.ScrimInsetsFrameLayout, i, calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.AudioAttributesCompatParcelizer = typedArrayWrite.getDrawable(calculateNextSearchBytePosition.MediaMetadataCompat.ScrimInsetsFrameLayout_insetForeground);
        typedArrayWrite.recycle();
        setWillNotDraw(true);
        InvalidTypeIdException.read(this, new finishBranchObject() { // from class: com.google.android.material.internal.ScrimInsetsFrameLayout.5
            @Override // kotlin.finishBranchObject
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                if (ScrimInsetsFrameLayout.this.IconCompatParcelizer == null) {
                    ScrimInsetsFrameLayout.this.IconCompatParcelizer = new Rect();
                }
                ScrimInsetsFrameLayout.this.IconCompatParcelizer.set(windowInsetsCompat.AudioAttributesImplApi21Parcelizer(), windowInsetsCompat.MediaBrowserCompatCustomActionResultReceiver(), windowInsetsCompat.MediaBrowserCompatItemReceiver(), windowInsetsCompat.AudioAttributesImplBaseParcelizer());
                ScrimInsetsFrameLayout.this.RemoteActionCompatParcelizer(windowInsetsCompat);
                ScrimInsetsFrameLayout.this.setWillNotDraw(!windowInsetsCompat.RatingCompat() || ScrimInsetsFrameLayout.this.AudioAttributesCompatParcelizer == null);
                InvalidTypeIdException.onRemoveQueueItem(ScrimInsetsFrameLayout.this);
                return windowInsetsCompat.IconCompatParcelizer();
            }
        });
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.AudioAttributesCompatParcelizer = drawable;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.AudioAttributesImplBaseParcelizer = z;
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.read = z;
    }

    public void setDrawLeftInsetForeground(boolean z) {
        this.RemoteActionCompatParcelizer = z;
    }

    public void setDrawRightInsetForeground(boolean z) {
        this.write = z;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.IconCompatParcelizer == null || this.AudioAttributesCompatParcelizer == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        if (this.AudioAttributesImplBaseParcelizer) {
            this.AudioAttributesImplApi26Parcelizer.set(0, 0, width, this.IconCompatParcelizer.top);
            this.AudioAttributesCompatParcelizer.setBounds(this.AudioAttributesImplApi26Parcelizer);
            this.AudioAttributesCompatParcelizer.draw(canvas);
        }
        if (this.read) {
            this.AudioAttributesImplApi26Parcelizer.set(0, height - this.IconCompatParcelizer.bottom, width, height);
            this.AudioAttributesCompatParcelizer.setBounds(this.AudioAttributesImplApi26Parcelizer);
            this.AudioAttributesCompatParcelizer.draw(canvas);
        }
        if (this.RemoteActionCompatParcelizer) {
            this.AudioAttributesImplApi26Parcelizer.set(0, this.IconCompatParcelizer.top, this.IconCompatParcelizer.left, height - this.IconCompatParcelizer.bottom);
            this.AudioAttributesCompatParcelizer.setBounds(this.AudioAttributesImplApi26Parcelizer);
            this.AudioAttributesCompatParcelizer.draw(canvas);
        }
        if (this.write) {
            this.AudioAttributesImplApi26Parcelizer.set(width - this.IconCompatParcelizer.right, this.IconCompatParcelizer.top, width, height - this.IconCompatParcelizer.bottom);
            this.AudioAttributesCompatParcelizer.setBounds(this.AudioAttributesImplApi26Parcelizer);
            this.AudioAttributesCompatParcelizer.draw(canvas);
        }
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.AudioAttributesCompatParcelizer;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.AudioAttributesCompatParcelizer;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }
}
