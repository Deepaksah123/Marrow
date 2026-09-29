package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import androidx.customview.view.AbsSavedState;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.LinkedHashSet;
import kotlin.InvalidTypeIdException;
import kotlin.SeekMap;
import kotlin._addSuperTypes;
import kotlin.calculateNextSearchBytePosition;
import kotlin.checkAndPeekStreamMarker;
import kotlin.findFormatOverrides;
import kotlin.getChunkIndex;
import kotlin.getConstantBitrateSeekMap;
import kotlin.getDefaultViewModelCreationExtras;
import kotlin.isValidFrameType;
import kotlin.readFrames;
import kotlin.readId3Metadata;
import kotlin.readSample;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialButton extends AppCompatButton implements Checkable, readSample {
    private boolean AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private Drawable AudioAttributesImplBaseParcelizer;
    private boolean IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    private ColorStateList MediaBrowserCompatMediaItem;
    private int MediaBrowserCompatSearchResultReceiver;
    private RemoteActionCompatParcelizer MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private PorterDuff.Mode MediaDescriptionCompat;
    private final getChunkIndex MediaMetadataCompat;
    private int RatingCompat;
    private String RemoteActionCompatParcelizer;
    private final LinkedHashSet<read> onCustomAction;
    private static final int[] write = {R.attr.state_checkable};
    private static final int[] read = {R.attr.state_checked};
    private static final int AudioAttributesCompatParcelizer = calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.Widget_MaterialComponents_Button;

    interface RemoteActionCompatParcelizer {
        void write();
    }

    public interface read {
    }

    public MaterialButton(Context context) {
        this(context, null);
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, calculateNextSearchBytePosition.IconCompatParcelizer.materialButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        int i2 = AudioAttributesCompatParcelizer;
        super(readFrames.IconCompatParcelizer(context, attributeSet, i, i2), attributeSet, i);
        this.onCustomAction = new LinkedHashSet<>();
        this.AudioAttributesImplApi21Parcelizer = false;
        this.IconCompatParcelizer = false;
        Context context2 = getContext();
        TypedArray typedArrayWrite = readId3Metadata.write(context2, attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.MaterialButton, i, i2, new int[0]);
        this.MediaBrowserCompatItemReceiver = typedArrayWrite.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialButton_iconPadding, 0);
        this.MediaDescriptionCompat = checkAndPeekStreamMarker.RemoteActionCompatParcelizer(typedArrayWrite.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialButton_iconTintMode, -1), PorterDuff.Mode.SRC_IN);
        this.MediaBrowserCompatMediaItem = SeekMap.IconCompatParcelizer(getContext(), typedArrayWrite, calculateNextSearchBytePosition.MediaMetadataCompat.MaterialButton_iconTint);
        this.AudioAttributesImplBaseParcelizer = SeekMap.RemoteActionCompatParcelizer(getContext(), typedArrayWrite, calculateNextSearchBytePosition.MediaMetadataCompat.MaterialButton_icon);
        this.AudioAttributesImplApi26Parcelizer = typedArrayWrite.getInteger(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialButton_iconGravity, 1);
        this.RatingCompat = typedArrayWrite.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.MaterialButton_iconSize, 0);
        getChunkIndex getchunkindex = new getChunkIndex(this, isValidFrameType.read(context2, attributeSet, i, i2).RemoteActionCompatParcelizer());
        this.MediaMetadataCompat = getchunkindex;
        getchunkindex.AudioAttributesCompatParcelizer(typedArrayWrite);
        typedArrayWrite.recycle();
        setCompoundDrawablePadding(this.MediaBrowserCompatItemReceiver);
        RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer != null);
    }

    private String onCommand() {
        if (TextUtils.isEmpty(this.RemoteActionCompatParcelizer)) {
            return (handleMediaPlayPauseIfPendingOnHandler() ? CompoundButton.class : Button.class).getName();
        }
        return this.RemoteActionCompatParcelizer;
    }

    final void IconCompatParcelizer(String str) {
        this.RemoteActionCompatParcelizer = str;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(onCommand());
        accessibilityNodeInfo.setCheckable(handleMediaPlayPauseIfPendingOnHandler());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(onCommand());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.read = this.AudioAttributesImplApi21Parcelizer;
        return savedState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.read());
        setChecked(savedState.read);
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
            this.MediaMetadataCompat.RemoteActionCompatParcelizer(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList Z_() {
        if (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
            return this.MediaMetadataCompat.IconCompatParcelizer();
        }
        return super.Z_();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
            this.MediaMetadataCompat.AudioAttributesCompatParcelizer(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode AudioAttributesCompatParcelizer() {
        if (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
            return this.MediaMetadataCompat.AudioAttributesCompatParcelizer();
        }
        return super.AudioAttributesCompatParcelizer();
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return Z_();
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return AudioAttributesCompatParcelizer();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
            this.MediaMetadataCompat.RemoteActionCompatParcelizer(i);
        } else {
            super.setBackgroundColor(i);
        }
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? getDefaultViewModelCreationExtras.write(getContext(), i) : null);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
            if (drawable != getBackground()) {
                this.MediaMetadataCompat.AudioAttributesImplApi21Parcelizer();
                super.setBackgroundDrawable(drawable);
                return;
            } else {
                getBackground().setState(drawable.getState());
                return;
            }
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        AudioAttributesCompatParcelizer(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        AudioAttributesCompatParcelizer(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
            getConstantBitrateSeekMap.RemoteActionCompatParcelizer(this, this.MediaMetadataCompat.read());
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
            this.MediaMetadataCompat.read().handleMediaPlayPauseIfPendingOnHandler(f);
        }
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.AudioAttributesImplBaseParcelizer != null) {
            if (this.AudioAttributesImplBaseParcelizer.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        AudioAttributesCompatParcelizer(getMeasuredWidth(), getMeasuredHeight());
    }

    private Layout.Alignment AudioAttributesImplApi26Parcelizer() {
        int gravity = getGravity() & 8388615;
        if (gravity == 1) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (gravity == 5 || gravity == 8388613) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }

    private Layout.Alignment AudioAttributesImplBaseParcelizer() {
        int textAlignment = getTextAlignment();
        if (textAlignment == 1) {
            return AudioAttributesImplApi26Parcelizer();
        }
        if (textAlignment == 6 || textAlignment == 3) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        if (textAlignment == 4) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }

    private void AudioAttributesCompatParcelizer(int i, int i2) {
        if (this.AudioAttributesImplBaseParcelizer == null || getLayout() == null) {
            return;
        }
        if (MediaBrowserCompatMediaItem() || RatingCompat()) {
            this.MediaBrowserCompatSearchResultReceiver = 0;
            Layout.Alignment alignmentAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
            int i3 = this.AudioAttributesImplApi26Parcelizer;
            if (i3 == 1 || i3 == 3 || ((i3 == 2 && alignmentAudioAttributesImplBaseParcelizer == Layout.Alignment.ALIGN_NORMAL) || (this.AudioAttributesImplApi26Parcelizer == 4 && alignmentAudioAttributesImplBaseParcelizer == Layout.Alignment.ALIGN_OPPOSITE))) {
                this.MediaBrowserCompatCustomActionResultReceiver = 0;
                RemoteActionCompatParcelizer(false);
                return;
            }
            int intrinsicWidth = this.RatingCompat;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.AudioAttributesImplBaseParcelizer.getIntrinsicWidth();
            }
            int iMediaMetadataCompat = ((((i - MediaMetadataCompat()) - InvalidTypeIdException.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(this)) - intrinsicWidth) - this.MediaBrowserCompatItemReceiver) - InvalidTypeIdException.onCommand(this);
            if (alignmentAudioAttributesImplBaseParcelizer == Layout.Alignment.ALIGN_CENTER) {
                iMediaMetadataCompat /= 2;
            }
            if (MediaBrowserCompatSearchResultReceiver() != (this.AudioAttributesImplApi26Parcelizer == 4)) {
                iMediaMetadataCompat = -iMediaMetadataCompat;
            }
            if (this.MediaBrowserCompatCustomActionResultReceiver != iMediaMetadataCompat) {
                this.MediaBrowserCompatCustomActionResultReceiver = iMediaMetadataCompat;
                RemoteActionCompatParcelizer(false);
                return;
            }
            return;
        }
        if (MediaDescriptionCompat()) {
            this.MediaBrowserCompatCustomActionResultReceiver = 0;
            if (this.AudioAttributesImplApi26Parcelizer == 16) {
                this.MediaBrowserCompatSearchResultReceiver = 0;
                RemoteActionCompatParcelizer(false);
                return;
            }
            int intrinsicHeight = this.RatingCompat;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.AudioAttributesImplBaseParcelizer.getIntrinsicHeight();
            }
            int iMax = Math.max(0, (((((i2 - AudioAttributesImplApi21Parcelizer()) - getPaddingTop()) - intrinsicHeight) - this.MediaBrowserCompatItemReceiver) - getPaddingBottom()) / 2);
            if (this.MediaBrowserCompatSearchResultReceiver != iMax) {
                this.MediaBrowserCompatSearchResultReceiver = iMax;
                RemoteActionCompatParcelizer(false);
            }
        }
    }

    private int MediaMetadataCompat() {
        int lineCount = getLineCount();
        float fMax = BitmapDescriptorFactory.HUE_RED;
        for (int i = 0; i < lineCount; i++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(fMax);
    }

    private int AudioAttributesImplApi21Parcelizer() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private boolean MediaBrowserCompatSearchResultReceiver() {
        return InvalidTypeIdException.MediaBrowserCompatMediaItem(this) == 1;
    }

    public final void AudioAttributesCompatParcelizer(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setIconPadding(int i) {
        if (this.MediaBrowserCompatItemReceiver != i) {
            this.MediaBrowserCompatItemReceiver = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.RatingCompat != i) {
            this.RatingCompat = i;
            RemoteActionCompatParcelizer(true);
        }
    }

    public final int IconCompatParcelizer() {
        return this.RatingCompat;
    }

    public void setIcon(Drawable drawable) {
        if (this.AudioAttributesImplBaseParcelizer != drawable) {
            this.AudioAttributesImplBaseParcelizer = drawable;
            RemoteActionCompatParcelizer(true);
            AudioAttributesCompatParcelizer(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? getDefaultViewModelCreationExtras.write(getContext(), i) : null);
    }

    public final Drawable RemoteActionCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.MediaBrowserCompatMediaItem != colorStateList) {
            this.MediaBrowserCompatMediaItem = colorStateList;
            RemoteActionCompatParcelizer(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(getDefaultViewModelCreationExtras.IconCompatParcelizer(getContext(), i));
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.MediaDescriptionCompat != mode) {
            this.MediaDescriptionCompat = mode;
            RemoteActionCompatParcelizer(false);
        }
    }

    private void RemoteActionCompatParcelizer(boolean z) {
        Drawable drawable = this.AudioAttributesImplBaseParcelizer;
        if (drawable != null) {
            Drawable drawableMutate = findFormatOverrides.AudioAttributesImplApi26Parcelizer(drawable).mutate();
            this.AudioAttributesImplBaseParcelizer = drawableMutate;
            findFormatOverrides.AudioAttributesCompatParcelizer(drawableMutate, this.MediaBrowserCompatMediaItem);
            PorterDuff.Mode mode = this.MediaDescriptionCompat;
            if (mode != null) {
                findFormatOverrides.read(this.AudioAttributesImplBaseParcelizer, mode);
            }
            int intrinsicWidth = this.RatingCompat;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.AudioAttributesImplBaseParcelizer.getIntrinsicWidth();
            }
            int intrinsicHeight = this.RatingCompat;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.AudioAttributesImplBaseParcelizer.getIntrinsicHeight();
            }
            Drawable drawable2 = this.AudioAttributesImplBaseParcelizer;
            int i = this.MediaBrowserCompatCustomActionResultReceiver;
            int i2 = this.MediaBrowserCompatSearchResultReceiver;
            drawable2.setBounds(i, i2, intrinsicWidth + i, intrinsicHeight + i2);
            this.AudioAttributesImplBaseParcelizer.setVisible(true, z);
        }
        if (z) {
            onCustomAction();
            return;
        }
        Drawable[] drawableArr = _addSuperTypes.read(this);
        Drawable drawable3 = drawableArr[0];
        Drawable drawable4 = drawableArr[1];
        Drawable drawable5 = drawableArr[2];
        if ((!MediaBrowserCompatMediaItem() || drawable3 == this.AudioAttributesImplBaseParcelizer) && ((!RatingCompat() || drawable5 == this.AudioAttributesImplBaseParcelizer) && (!MediaDescriptionCompat() || drawable4 == this.AudioAttributesImplBaseParcelizer))) {
            return;
        }
        onCustomAction();
    }

    private void onCustomAction() {
        if (MediaBrowserCompatMediaItem()) {
            _addSuperTypes.read(this, this.AudioAttributesImplBaseParcelizer, null, null, null);
        } else if (RatingCompat()) {
            _addSuperTypes.read(this, null, null, this.AudioAttributesImplBaseParcelizer, null);
        } else if (MediaDescriptionCompat()) {
            _addSuperTypes.read(this, null, this.AudioAttributesImplBaseParcelizer, null, null);
        }
    }

    private boolean MediaBrowserCompatMediaItem() {
        int i = this.AudioAttributesImplApi26Parcelizer;
        return i == 1 || i == 2;
    }

    private boolean RatingCompat() {
        int i = this.AudioAttributesImplApi26Parcelizer;
        return i == 3 || i == 4;
    }

    private boolean MediaDescriptionCompat() {
        int i = this.AudioAttributesImplApi26Parcelizer;
        return i == 16 || i == 32;
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
            this.MediaMetadataCompat.AudioAttributesCompatParcelizer(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        if (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
            setRippleColor(getDefaultViewModelCreationExtras.IconCompatParcelizer(getContext(), i));
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
            this.MediaMetadataCompat.IconCompatParcelizer(colorStateList);
        }
    }

    public void setStrokeColorResource(int i) {
        if (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
            setStrokeColor(getDefaultViewModelCreationExtras.IconCompatParcelizer(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
            this.MediaMetadataCompat.read(i);
        }
    }

    public void setStrokeWidthResource(int i) {
        if (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    public final int MediaBrowserCompatItemReceiver() {
        if (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
            return this.MediaMetadataCompat.write();
        }
        return 0;
    }

    public void setCornerRadius(int i) {
        if (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
            this.MediaMetadataCompat.write(i);
        }
    }

    public void setCornerRadiusResource(int i) {
        if (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setIconGravity(int i) {
        if (this.AudioAttributesImplApi26Parcelizer != i) {
            this.AudioAttributesImplApi26Parcelizer = i;
            AudioAttributesCompatParcelizer(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setInsetBottom(int i) {
        this.MediaMetadataCompat.AudioAttributesCompatParcelizer(i);
    }

    public void setInsetTop(int i) {
        this.MediaMetadataCompat.IconCompatParcelizer(i);
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (handleMediaPlayPauseIfPendingOnHandler()) {
            mergeDrawableStates(iArrOnCreateDrawableState, write);
        }
        if (isChecked()) {
            mergeDrawableStates(iArrOnCreateDrawableState, read);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (handleMediaPlayPauseIfPendingOnHandler() && isEnabled() && this.AudioAttributesImplApi21Parcelizer != z) {
            this.AudioAttributesImplApi21Parcelizer = z;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).read(this, this.AudioAttributesImplApi21Parcelizer);
            }
            if (this.IconCompatParcelizer) {
                return;
            }
            this.IconCompatParcelizer = true;
            for (read readVar : this.onCustomAction) {
            }
            this.IconCompatParcelizer = false;
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.AudioAttributesImplApi21Parcelizer);
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.MediaMetadataCompat.MediaBrowserCompatCustomActionResultReceiver()) {
            toggle();
        }
        return super.performClick();
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.MediaMetadataCompat.write(z);
    }

    private boolean handleMediaPlayPauseIfPendingOnHandler() {
        getChunkIndex getchunkindex = this.MediaMetadataCompat;
        return getchunkindex != null && getchunkindex.AudioAttributesImplBaseParcelizer();
    }

    public void setCheckable(boolean z) {
        if (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
            this.MediaMetadataCompat.IconCompatParcelizer(z);
        }
    }

    @Override // kotlin.readSample
    public void setShapeAppearanceModel(isValidFrameType isvalidframetype) {
        if (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
            this.MediaMetadataCompat.AudioAttributesCompatParcelizer(isvalidframetype);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    public final isValidFrameType read() {
        if (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
            return this.MediaMetadataCompat.RemoteActionCompatParcelizer();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    final void read(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = remoteActionCompatParcelizer;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (remoteActionCompatParcelizer != null) {
            remoteActionCompatParcelizer.write();
        }
        super.setPressed(z);
    }

    private boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        getChunkIndex getchunkindex = this.MediaMetadataCompat;
        return (getchunkindex == null || getchunkindex.AudioAttributesImplApi26Parcelizer()) ? false : true;
    }

    final void MediaBrowserCompatCustomActionResultReceiver() {
        if (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
            this.MediaMetadataCompat.AudioAttributesCompatParcelizer(true);
        }
    }

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.button.MaterialButton.SavedState.3
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return read(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return read(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object[] newArray(int i) {
                return AudioAttributesCompatParcelizer(i);
            }

            private static SavedState read(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            private static SavedState read(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            private static SavedState[] AudioAttributesCompatParcelizer(int i) {
                return new SavedState[i];
            }
        };
        boolean read;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            read(parcel);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.read ? 1 : 0);
        }

        private void read(Parcel parcel) {
            this.read = parcel.readInt() == 1;
        }
    }
}
