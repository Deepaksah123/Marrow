package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import kotlin.InvalidTypeIdException;
import kotlin.calculateNextSearchBytePosition;
import kotlin.mapArray;

/* JADX INFO: loaded from: classes3.dex */
public class FlowLayout extends ViewGroup {
    private int IconCompatParcelizer;
    private boolean RemoteActionCompatParcelizer;
    private int read;
    private int write;

    public FlowLayout(Context context) {
        this(context, null);
    }

    public FlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.RemoteActionCompatParcelizer = false;
        IconCompatParcelizer(context, attributeSet);
    }

    private void IconCompatParcelizer(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.FlowLayout, 0, 0);
        this.read = typedArrayObtainStyledAttributes.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.FlowLayout_lineSpacing, 0);
        this.write = typedArrayObtainStyledAttributes.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.FlowLayout_itemSpacing, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    protected final void read(int i) {
        this.read = i;
    }

    protected final void IconCompatParcelizer(int i) {
        this.write = i;
    }

    public boolean write() {
        return this.RemoteActionCompatParcelizer;
    }

    public void setSingleLine(boolean z) {
        this.RemoteActionCompatParcelizer = z;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int paddingLeft;
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i5 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft2 = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int i6 = paddingTop;
        int i7 = 0;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i, i2);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                int i9 = i6;
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i4 = marginLayoutParams.leftMargin;
                    i3 = marginLayoutParams.rightMargin;
                } else {
                    i3 = 0;
                    i4 = 0;
                }
                int i10 = paddingLeft2;
                if (paddingLeft2 + i4 + childAt.getMeasuredWidth() <= i5 - paddingRight || write()) {
                    paddingLeft = i10;
                } else {
                    paddingLeft = getPaddingLeft();
                    i9 = paddingTop + this.read;
                }
                int measuredWidth = paddingLeft + i4 + childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredWidth > i7) {
                    i7 = measuredWidth;
                }
                paddingLeft2 = paddingLeft + i4 + i3 + childAt.getMeasuredWidth() + this.write;
                if (i8 == getChildCount() - 1) {
                    i7 += i3;
                }
                paddingTop = i9 + measuredHeight;
                i6 = i9;
            }
        }
        setMeasuredDimension(RemoteActionCompatParcelizer(size, mode, i7 + getPaddingRight()), RemoteActionCompatParcelizer(size2, mode2, paddingTop + getPaddingBottom()));
    }

    private static int RemoteActionCompatParcelizer(int i, int i2, int i3) {
        if (i2 != Integer.MIN_VALUE) {
            return i2 != 1073741824 ? i3 : i;
        }
        return Math.min(i3, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iRemoteActionCompatParcelizer;
        int iWrite;
        if (getChildCount() == 0) {
            this.IconCompatParcelizer = 0;
            return;
        }
        this.IconCompatParcelizer = 1;
        boolean z2 = InvalidTypeIdException.MediaBrowserCompatMediaItem(this) == 1;
        int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i5 = (i3 - i) - paddingLeft;
        int measuredWidth = paddingRight;
        int i6 = paddingTop;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.row_index_key, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    iWrite = mapArray.write(marginLayoutParams);
                    iRemoteActionCompatParcelizer = mapArray.RemoteActionCompatParcelizer(marginLayoutParams);
                } else {
                    iRemoteActionCompatParcelizer = 0;
                    iWrite = 0;
                }
                int measuredWidth2 = childAt.getMeasuredWidth();
                if (!this.RemoteActionCompatParcelizer && measuredWidth + iWrite + measuredWidth2 > i5) {
                    paddingTop = this.read + i6;
                    this.IconCompatParcelizer++;
                    measuredWidth = paddingRight;
                }
                childAt.setTag(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.row_index_key, Integer.valueOf(this.IconCompatParcelizer - 1));
                int i8 = measuredWidth + iWrite;
                int measuredWidth3 = childAt.getMeasuredWidth() + i8;
                int measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                if (z2) {
                    childAt.layout(i5 - measuredWidth3, paddingTop, (i5 - measuredWidth) - iWrite, measuredHeight);
                } else {
                    childAt.layout(i8, paddingTop, measuredWidth3, measuredHeight);
                }
                measuredWidth += iWrite + iRemoteActionCompatParcelizer + childAt.getMeasuredWidth() + this.write;
                i6 = measuredHeight;
            }
        }
    }

    protected final int RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public static int RemoteActionCompatParcelizer(View view) {
        Object tag = view.getTag(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.row_index_key);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }
}
