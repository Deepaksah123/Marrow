package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import kotlin.InvalidTypeIdException;
import kotlin.SeekMap;
import kotlin._isNaN;
import kotlin.calculateNextSearchBytePosition;
import kotlin.frameSizeBytesByTypeNb;
import kotlin.readFrames;
import kotlin.readId3Metadata;

/* JADX INFO: loaded from: classes5.dex */
public class MaterialDivider extends View {
    private static final int write = calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.Widget_MaterialComponents_MaterialDivider;
    private final frameSizeBytesByTypeNb AudioAttributesCompatParcelizer;
    private int IconCompatParcelizer;
    private int MediaBrowserCompatItemReceiver;
    private int RemoteActionCompatParcelizer;
    private int read;

    public MaterialDivider(Context context) {
        this(context, null);
    }

    public MaterialDivider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, calculateNextSearchBytePosition.IconCompatParcelizer.materialDividerStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialDivider(Context context, AttributeSet attributeSet, int i) {
        int i2 = write;
        super(readFrames.IconCompatParcelizer(context, attributeSet, i, i2), attributeSet, i);
        Context context2 = getContext();
        this.AudioAttributesCompatParcelizer = new frameSizeBytesByTypeNb();
        TypedArray typedArrayWrite = readId3Metadata.write(context2, attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.MaterialDivider, i, i2, new int[0]);
        this.MediaBrowserCompatItemReceiver = typedArrayWrite.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialDivider_dividerThickness, getResources().getDimensionPixelSize(calculateNextSearchBytePosition.write.material_divider_thickness));
        this.IconCompatParcelizer = typedArrayWrite.getDimensionPixelOffset(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialDivider_dividerInsetStart, 0);
        this.RemoteActionCompatParcelizer = typedArrayWrite.getDimensionPixelOffset(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialDivider_dividerInsetEnd, 0);
        setDividerColor(SeekMap.IconCompatParcelizer(context2, typedArrayWrite, calculateNextSearchBytePosition.MediaMetadataCompat.MaterialDivider_dividerColor).getDefaultColor());
        typedArrayWrite.recycle();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        int measuredHeight = getMeasuredHeight();
        if (mode == Integer.MIN_VALUE || mode == 0) {
            int i3 = this.MediaBrowserCompatItemReceiver;
            if (i3 > 0 && measuredHeight != i3) {
                measuredHeight = i3;
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int width;
        int i;
        super.onDraw(canvas);
        boolean z = InvalidTypeIdException.MediaBrowserCompatMediaItem(this) == 1;
        int i2 = z ? this.RemoteActionCompatParcelizer : this.IconCompatParcelizer;
        if (z) {
            width = getWidth();
            i = this.IconCompatParcelizer;
        } else {
            width = getWidth();
            i = this.RemoteActionCompatParcelizer;
        }
        this.AudioAttributesCompatParcelizer.setBounds(i2, 0, width - i, getBottom() - getTop());
        this.AudioAttributesCompatParcelizer.draw(canvas);
    }

    public void setDividerThickness(int i) {
        if (this.MediaBrowserCompatItemReceiver != i) {
            this.MediaBrowserCompatItemReceiver = i;
            requestLayout();
        }
    }

    public void setDividerThicknessResource(int i) {
        setDividerThickness(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setDividerInsetStart(int i) {
        this.IconCompatParcelizer = i;
    }

    public void setDividerInsetStartResource(int i) {
        setDividerInsetStart(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerInsetEnd(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    public void setDividerInsetEndResource(int i) {
        setDividerInsetEnd(getContext().getResources().getDimensionPixelOffset(i));
    }

    public void setDividerColor(int i) {
        if (this.read != i) {
            this.read = i;
            this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer(ColorStateList.valueOf(i));
            invalidate();
        }
    }

    public void setDividerColorResource(int i) {
        setDividerColor(_isNaN.getColor(getContext(), i));
    }
}
