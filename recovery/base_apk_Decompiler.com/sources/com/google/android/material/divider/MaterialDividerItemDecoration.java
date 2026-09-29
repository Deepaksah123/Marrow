package com.google.android.material.divider;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.SeekMap;
import kotlin.calculateNextSearchBytePosition;
import kotlin.checkAndPeekStreamMarker;
import kotlin.findFormatOverrides;
import kotlin.readId3Metadata;

/* JADX INFO: loaded from: classes5.dex */
public class MaterialDividerItemDecoration extends RecyclerView.AudioAttributesImplBaseParcelizer {
    private static final int RemoteActionCompatParcelizer = calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.Widget_MaterialComponents_MaterialDivider;
    private int AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private final Rect AudioAttributesImplBaseParcelizer;
    private Drawable IconCompatParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    private int read;
    private int write;

    public MaterialDividerItemDecoration(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, calculateNextSearchBytePosition.IconCompatParcelizer.materialDividerStyle, i);
    }

    private MaterialDividerItemDecoration(Context context, AttributeSet attributeSet, int i, int i2) {
        this.AudioAttributesImplBaseParcelizer = new Rect();
        TypedArray typedArrayWrite = readId3Metadata.write(context, attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.MaterialDivider, i, RemoteActionCompatParcelizer, new int[0]);
        this.AudioAttributesCompatParcelizer = SeekMap.IconCompatParcelizer(context, typedArrayWrite, calculateNextSearchBytePosition.MediaMetadataCompat.MaterialDivider_dividerColor).getDefaultColor();
        this.AudioAttributesImplApi21Parcelizer = typedArrayWrite.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialDivider_dividerThickness, context.getResources().getDimensionPixelSize(calculateNextSearchBytePosition.write.material_divider_thickness));
        this.read = typedArrayWrite.getDimensionPixelOffset(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialDivider_dividerInsetStart, 0);
        this.write = typedArrayWrite.getDimensionPixelOffset(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialDivider_dividerInsetEnd, 0);
        this.MediaBrowserCompatCustomActionResultReceiver = typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialDivider_lastItemDecorated, true);
        typedArrayWrite.recycle();
        this.IconCompatParcelizer = new ShapeDrawable();
        read(this.AudioAttributesCompatParcelizer);
        write(i2);
    }

    private void write(int i) {
        if (i != 0 && i != 1) {
            StringBuilder sb = new StringBuilder("Invalid orientation: ");
            sb.append(i);
            sb.append(". It should be either HORIZONTAL or VERTICAL");
            throw new IllegalArgumentException(sb.toString());
        }
        this.MediaBrowserCompatItemReceiver = i;
    }

    private void read(int i) {
        this.AudioAttributesCompatParcelizer = i;
        Drawable drawableAudioAttributesImplApi26Parcelizer = findFormatOverrides.AudioAttributesImplApi26Parcelizer(this.IconCompatParcelizer);
        this.IconCompatParcelizer = drawableAudioAttributesImplApi26Parcelizer;
        findFormatOverrides.AudioAttributesCompatParcelizer(drawableAudioAttributesImplApi26Parcelizer, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AudioAttributesImplBaseParcelizer
    public final void IconCompatParcelizer(Canvas canvas, RecyclerView recyclerView, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        if (recyclerView.AudioAttributesImplApi21Parcelizer() == null) {
            return;
        }
        if (this.MediaBrowserCompatItemReceiver == 1) {
            RemoteActionCompatParcelizer(canvas, recyclerView);
        } else {
            AudioAttributesCompatParcelizer(canvas, recyclerView);
        }
    }

    private void RemoteActionCompatParcelizer(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int paddingLeft;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingLeft = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            paddingLeft = 0;
        }
        boolean zAudioAttributesImplBaseParcelizer = checkAndPeekStreamMarker.AudioAttributesImplBaseParcelizer(recyclerView);
        int i = zAudioAttributesImplBaseParcelizer ? this.write : this.read;
        int i2 = zAudioAttributesImplBaseParcelizer ? this.read : this.write;
        int childCount = recyclerView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = recyclerView.getChildAt(i3);
            if (write(recyclerView, childAt)) {
                recyclerView.AudioAttributesImplApi21Parcelizer().read(childAt, this.AudioAttributesImplBaseParcelizer);
                int iRound = this.AudioAttributesImplBaseParcelizer.bottom + Math.round(childAt.getTranslationY());
                this.IconCompatParcelizer.setBounds(paddingLeft + i, iRound - this.AudioAttributesImplApi21Parcelizer, width - i2, iRound);
                this.IconCompatParcelizer.draw(canvas);
            }
        }
        canvas.restore();
    }

    private void AudioAttributesCompatParcelizer(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int paddingTop;
        int i;
        int i2;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int i3 = this.read;
        int i4 = this.write;
        boolean zAudioAttributesImplBaseParcelizer = checkAndPeekStreamMarker.AudioAttributesImplBaseParcelizer(recyclerView);
        int childCount = recyclerView.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = recyclerView.getChildAt(i5);
            if (write(recyclerView, childAt)) {
                recyclerView.AudioAttributesImplApi21Parcelizer().read(childAt, this.AudioAttributesImplBaseParcelizer);
                int iRound = Math.round(childAt.getTranslationX());
                if (zAudioAttributesImplBaseParcelizer) {
                    i2 = this.AudioAttributesImplBaseParcelizer.left + iRound;
                    i = this.AudioAttributesImplApi21Parcelizer + i2;
                } else {
                    i = iRound + this.AudioAttributesImplBaseParcelizer.right;
                    i2 = i - this.AudioAttributesImplApi21Parcelizer;
                }
                this.IconCompatParcelizer.setBounds(i2, paddingTop + i3, i, height - i4);
                this.IconCompatParcelizer.draw(canvas);
            }
        }
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AudioAttributesImplBaseParcelizer
    public final void IconCompatParcelizer(Rect rect, View view, RecyclerView recyclerView, RecyclerView.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver mediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
        rect.set(0, 0, 0, 0);
        if (write(recyclerView, view)) {
            if (this.MediaBrowserCompatItemReceiver == 1) {
                rect.bottom = this.AudioAttributesImplApi21Parcelizer;
            } else if (checkAndPeekStreamMarker.AudioAttributesImplBaseParcelizer(recyclerView)) {
                rect.left = this.AudioAttributesImplApi21Parcelizer;
            } else {
                rect.right = this.AudioAttributesImplApi21Parcelizer;
            }
        }
    }

    private boolean write(RecyclerView recyclerView, View view) {
        int iMediaBrowserCompatItemReceiver = RecyclerView.MediaBrowserCompatItemReceiver(view);
        RecyclerView.IconCompatParcelizer IconCompatParcelizer = recyclerView.IconCompatParcelizer();
        return iMediaBrowserCompatItemReceiver != -1 && (!(IconCompatParcelizer != null && iMediaBrowserCompatItemReceiver == IconCompatParcelizer.getItemCount() - 1) || this.MediaBrowserCompatCustomActionResultReceiver);
    }
}
