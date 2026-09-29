package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import androidx.cardview.widget.CardView;
import kotlin.ConstantBitrateSeekMap;
import kotlin.calculateNextSearchBytePosition;
import kotlin.getConstantBitrateSeekMap;
import kotlin.getDefaultViewModelCreationExtras;
import kotlin.isValidFrameType;
import kotlin.readFrames;
import kotlin.readId3Metadata;
import kotlin.readSample;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialCardView extends CardView implements Checkable, readSample {
    private boolean AudioAttributesImplApi21Parcelizer;
    private final ConstantBitrateSeekMap MediaBrowserCompatItemReceiver;
    private boolean MediaBrowserCompatMediaItem;
    private write MediaBrowserCompatSearchResultReceiver;
    private boolean MediaMetadataCompat;
    private static final int[] RemoteActionCompatParcelizer = {R.attr.state_checkable};
    private static final int[] AudioAttributesImplBaseParcelizer = {R.attr.state_checked};
    private static final int[] AudioAttributesImplApi26Parcelizer = {calculateNextSearchBytePosition.IconCompatParcelizer.state_dragged};
    private static final int MediaBrowserCompatCustomActionResultReceiver = calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.Widget_MaterialComponents_CardView;

    public interface write {
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, calculateNextSearchBytePosition.IconCompatParcelizer.materialCardViewStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCardView(Context context, AttributeSet attributeSet, int i) {
        int i2 = MediaBrowserCompatCustomActionResultReceiver;
        super(readFrames.IconCompatParcelizer(context, attributeSet, i, i2), attributeSet, i);
        this.AudioAttributesImplApi21Parcelizer = false;
        this.MediaMetadataCompat = false;
        this.MediaBrowserCompatMediaItem = true;
        TypedArray typedArrayWrite = readId3Metadata.write(getContext(), attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.MaterialCardView, i, i2, new int[0]);
        ConstantBitrateSeekMap constantBitrateSeekMap = new ConstantBitrateSeekMap(this, attributeSet, i, i2);
        this.MediaBrowserCompatItemReceiver = constantBitrateSeekMap;
        constantBitrateSeekMap.AudioAttributesCompatParcelizer(super.T_());
        constantBitrateSeekMap.AudioAttributesCompatParcelizer(super.V_(), super.AudioAttributesImplApi26Parcelizer(), super.W_(), super.U_());
        constantBitrateSeekMap.AudioAttributesCompatParcelizer(typedArrayWrite);
        typedArrayWrite.recycle();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        accessibilityNodeInfo.setCheckable(MediaMetadataCompat());
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(isChecked());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.MediaBrowserCompatItemReceiver.read(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.MediaBrowserCompatItemReceiver.write(colorStateList);
        invalidate();
    }

    public void setStrokeWidth(int i) {
        this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(i);
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(f);
    }

    @Override // androidx.cardview.widget.CardView
    public final float MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatItemReceiver.IconCompatParcelizer();
    }

    public final float RatingCompat() {
        return super.MediaBrowserCompatCustomActionResultReceiver();
    }

    public void setProgress(float f) {
        this.MediaBrowserCompatItemReceiver.read(f);
    }

    @Override // androidx.cardview.widget.CardView
    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(i, i2, i3, i4);
    }

    public final void RemoteActionCompatParcelizer(int i, int i2, int i3, int i4) {
        super.setContentPadding(i, i2, i3, i4);
    }

    @Override // androidx.cardview.widget.CardView
    public final int V_() {
        return this.MediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver().left;
    }

    @Override // androidx.cardview.widget.CardView
    public final int AudioAttributesImplApi26Parcelizer() {
        return this.MediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver().top;
    }

    @Override // androidx.cardview.widget.CardView
    public final int W_() {
        return this.MediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver().right;
    }

    @Override // androidx.cardview.widget.CardView
    public final int U_() {
        return this.MediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver().bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i) {
        this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(colorStateList);
    }

    @Override // androidx.cardview.widget.CardView
    public final ColorStateList T_() {
        return this.MediaBrowserCompatItemReceiver.read();
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        this.MediaBrowserCompatItemReceiver.read(colorStateList);
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        ConstantBitrateSeekMap constantBitrateSeekMap = this.MediaBrowserCompatItemReceiver;
        if (constantBitrateSeekMap != null) {
            constantBitrateSeekMap.AudioAttributesImplApi26Parcelizer();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.MediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer();
        getConstantBitrateSeekMap.RemoteActionCompatParcelizer(this, this.MediaBrowserCompatItemReceiver.write());
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        this.MediaBrowserCompatItemReceiver.MediaMetadataCompat();
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.MediaBrowserCompatItemReceiver.MediaDescriptionCompat();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        this.MediaBrowserCompatItemReceiver.MediaDescriptionCompat();
        this.MediaBrowserCompatItemReceiver.RatingCompat();
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        this.MediaBrowserCompatItemReceiver.MediaDescriptionCompat();
        this.MediaBrowserCompatItemReceiver.RatingCompat();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.MediaBrowserCompatMediaItem) {
            if (!this.MediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver()) {
                this.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer();
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public final void read(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.AudioAttributesImplApi21Parcelizer != z) {
            toggle();
        }
    }

    public void setDragged(boolean z) {
        if (this.MediaMetadataCompat != z) {
            this.MediaMetadataCompat = z;
            refreshDrawableState();
            MediaBrowserCompatSearchResultReceiver();
            invalidate();
        }
    }

    private boolean MediaBrowserCompatMediaItem() {
        return this.MediaMetadataCompat;
    }

    private boolean MediaMetadataCompat() {
        ConstantBitrateSeekMap constantBitrateSeekMap = this.MediaBrowserCompatItemReceiver;
        return constantBitrateSeekMap != null && constantBitrateSeekMap.AudioAttributesImplApi21Parcelizer();
    }

    public void setCheckable(boolean z) {
        this.MediaBrowserCompatItemReceiver.read(z);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        if (MediaMetadataCompat() && isEnabled()) {
            this.AudioAttributesImplApi21Parcelizer = !this.AudioAttributesImplApi21Parcelizer;
            refreshDrawableState();
            MediaBrowserCompatSearchResultReceiver();
            this.MediaBrowserCompatItemReceiver.read(this.AudioAttributesImplApi21Parcelizer, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 3);
        if (MediaMetadataCompat()) {
            mergeDrawableStates(iArrOnCreateDrawableState, RemoteActionCompatParcelizer);
        }
        if (isChecked()) {
            mergeDrawableStates(iArrOnCreateDrawableState, AudioAttributesImplBaseParcelizer);
        }
        if (MediaBrowserCompatMediaItem()) {
            mergeDrawableStates(iArrOnCreateDrawableState, AudioAttributesImplApi26Parcelizer);
        }
        return iArrOnCreateDrawableState;
    }

    public void setOnCheckedChangeListener(write writeVar) {
        this.MediaBrowserCompatSearchResultReceiver = writeVar;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(colorStateList);
    }

    public void setRippleColorResource(int i) {
        this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(getDefaultViewModelCreationExtras.IconCompatParcelizer(getContext(), i));
    }

    public void setCheckedIconResource(int i) {
        this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(getDefaultViewModelCreationExtras.write(getContext(), i));
    }

    public void setCheckedIcon(Drawable drawable) {
        this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(drawable);
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(colorStateList);
    }

    public void setCheckedIconSize(int i) {
        this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(i);
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCheckedIconMargin(int i) {
        this.MediaBrowserCompatItemReceiver.read(i);
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.MediaBrowserCompatItemReceiver.read(getResources().getDimensionPixelSize(i));
        }
    }

    private RectF MediaDescriptionCompat() {
        RectF rectF = new RectF();
        rectF.set(this.MediaBrowserCompatItemReceiver.write().getBounds());
        return rectF;
    }

    @Override // kotlin.readSample
    public void setShapeAppearanceModel(isValidFrameType isvalidframetype) {
        setClipToOutline(isvalidframetype.read(MediaDescriptionCompat()));
        this.MediaBrowserCompatItemReceiver.read(isvalidframetype);
    }

    private void MediaBrowserCompatSearchResultReceiver() {
        this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer();
    }

    public void setCheckedIconGravity(int i) {
        if (this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer() != i) {
            this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(i);
        }
    }
}
