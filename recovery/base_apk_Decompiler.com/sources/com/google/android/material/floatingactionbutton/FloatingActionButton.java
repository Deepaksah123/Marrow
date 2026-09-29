package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.VisibilityAwareImageButton;
import com.google.android.material.stateful.ExtendableSavedState;
import java.util.List;
import kotlin.BinarySearchSeekerSeekTimestampConverter;
import kotlin.BinarySearchSeekerTimestampSearchResult;
import kotlin.C0197seekMap;
import kotlin.DummyExtractorOutput;
import kotlin.ExtractorOutput;
import kotlin.InvalidTypeIdException;
import kotlin.SeekMap;
import kotlin.StringCollectionDeserializer;
import kotlin.calculateNextSearchBytePosition;
import kotlin.checkAndPeekStreamMarker;
import kotlin.findFormatOverrides;
import kotlin.handleOnBackCancelled;
import kotlin.isValidFrameType;
import kotlin.readFrames;
import kotlin.readId3Metadata;
import kotlin.readSample;
import kotlin.readVorbisModes;
import kotlin.sampleData;
import kotlin.sampleMetadata;
import kotlin.startIntentSenderForResult;

/* JADX INFO: loaded from: classes5.dex */
public class FloatingActionButton extends VisibilityAwareImageButton implements DummyExtractorOutput, readSample, CoordinatorLayout.read {
    private static final int IconCompatParcelizer = calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.Widget_Design_FloatingActionButton;
    final Rect AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private PorterDuff.Mode AudioAttributesImplApi26Parcelizer;
    private final C0197seekMap AudioAttributesImplBaseParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private final handleOnBackCancelled MediaBrowserCompatItemReceiver;
    private sampleData MediaBrowserCompatMediaItem;
    private int MediaBrowserCompatSearchResultReceiver;
    private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private ColorStateList MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private ColorStateList RatingCompat;
    boolean RemoteActionCompatParcelizer;
    private final Rect onCustomAction;
    private PorterDuff.Mode read;
    private ColorStateList write;

    public static abstract class IconCompatParcelizer {
        public void AudioAttributesCompatParcelizer(FloatingActionButton floatingActionButton) {
        }

        public void write() {
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, calculateNextSearchBytePosition.IconCompatParcelizer.floatingActionButtonStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FloatingActionButton(Context context, AttributeSet attributeSet, int i) {
        int i2 = IconCompatParcelizer;
        super(readFrames.IconCompatParcelizer(context, attributeSet, i, i2), attributeSet, i);
        this.AudioAttributesCompatParcelizer = new Rect();
        this.onCustomAction = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayWrite = readId3Metadata.write(context2, attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.FloatingActionButton, i, i2, new int[0]);
        this.write = SeekMap.IconCompatParcelizer(context2, typedArrayWrite, calculateNextSearchBytePosition.MediaMetadataCompat.FloatingActionButton_backgroundTint);
        this.read = checkAndPeekStreamMarker.RemoteActionCompatParcelizer(typedArrayWrite.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.FloatingActionButton_backgroundTintMode, -1), (PorterDuff.Mode) null);
        this.RatingCompat = SeekMap.IconCompatParcelizer(context2, typedArrayWrite, calculateNextSearchBytePosition.MediaMetadataCompat.FloatingActionButton_rippleColor);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = typedArrayWrite.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.FloatingActionButton_fabSize, -1);
        this.MediaBrowserCompatCustomActionResultReceiver = typedArrayWrite.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.FloatingActionButton_fabCustomSize, 0);
        this.AudioAttributesImplApi21Parcelizer = typedArrayWrite.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.FloatingActionButton_borderWidth, 0);
        float dimension = typedArrayWrite.getDimension(calculateNextSearchBytePosition.MediaMetadataCompat.FloatingActionButton_elevation, BitmapDescriptorFactory.HUE_RED);
        float dimension2 = typedArrayWrite.getDimension(calculateNextSearchBytePosition.MediaMetadataCompat.FloatingActionButton_hoveredFocusedTranslationZ, BitmapDescriptorFactory.HUE_RED);
        float dimension3 = typedArrayWrite.getDimension(calculateNextSearchBytePosition.MediaMetadataCompat.FloatingActionButton_pressedTranslationZ, BitmapDescriptorFactory.HUE_RED);
        this.RemoteActionCompatParcelizer = typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.FloatingActionButton_useCompatPadding, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(calculateNextSearchBytePosition.write.mtrl_fab_min_touch_target);
        setMaxImageSize(typedArrayWrite.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.FloatingActionButton_maxImageSize, 0));
        BinarySearchSeekerSeekTimestampConverter binarySearchSeekerSeekTimestampConverterAudioAttributesCompatParcelizer = BinarySearchSeekerSeekTimestampConverter.AudioAttributesCompatParcelizer(context2, typedArrayWrite, calculateNextSearchBytePosition.MediaMetadataCompat.FloatingActionButton_showMotionSpec);
        BinarySearchSeekerSeekTimestampConverter binarySearchSeekerSeekTimestampConverterAudioAttributesCompatParcelizer2 = BinarySearchSeekerSeekTimestampConverter.AudioAttributesCompatParcelizer(context2, typedArrayWrite, calculateNextSearchBytePosition.MediaMetadataCompat.FloatingActionButton_hideMotionSpec);
        isValidFrameType isvalidframetypeRemoteActionCompatParcelizer = isValidFrameType.read(context2, attributeSet, i, i2, isValidFrameType.AudioAttributesCompatParcelizer).RemoteActionCompatParcelizer();
        boolean z = typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.FloatingActionButton_ensureMinTouchTargetSize, false);
        setEnabled(typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.FloatingActionButton_android_enabled, true));
        typedArrayWrite.recycle();
        handleOnBackCancelled handleonbackcancelled = new handleOnBackCancelled(this);
        this.MediaBrowserCompatItemReceiver = handleonbackcancelled;
        handleonbackcancelled.RemoteActionCompatParcelizer(attributeSet, i);
        this.AudioAttributesImplBaseParcelizer = new C0197seekMap(this);
        MediaMetadataCompat().write(isvalidframetypeRemoteActionCompatParcelizer);
        MediaMetadataCompat().read(this.write, this.read, this.RatingCompat, this.AudioAttributesImplApi21Parcelizer);
        MediaMetadataCompat().RemoteActionCompatParcelizer(dimensionPixelSize);
        MediaMetadataCompat().IconCompatParcelizer(dimension);
        MediaMetadataCompat().write(dimension2);
        MediaMetadataCompat().AudioAttributesCompatParcelizer(dimension3);
        MediaMetadataCompat().RemoteActionCompatParcelizer(binarySearchSeekerSeekTimestampConverterAudioAttributesCompatParcelizer);
        MediaMetadataCompat().write(binarySearchSeekerSeekTimestampConverterAudioAttributesCompatParcelizer2);
        MediaMetadataCompat().RemoteActionCompatParcelizer(z);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i, int i2) {
        int iMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        this.MediaBrowserCompatSearchResultReceiver = (iMediaBrowserCompatCustomActionResultReceiver - this.MediaMetadataCompat) / 2;
        MediaMetadataCompat().onMediaButtonEvent();
        int iMin = Math.min(View.resolveSize(iMediaBrowserCompatCustomActionResultReceiver, i), View.resolveSize(iMediaBrowserCompatCustomActionResultReceiver, i2));
        setMeasuredDimension(this.AudioAttributesCompatParcelizer.left + iMin + this.AudioAttributesCompatParcelizer.right, iMin + this.AudioAttributesCompatParcelizer.top + this.AudioAttributesCompatParcelizer.bottom);
    }

    public void setRippleColor(int i) {
        setRippleColor(ColorStateList.valueOf(i));
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.RatingCompat != colorStateList) {
            this.RatingCompat = colorStateList;
            MediaMetadataCompat().AudioAttributesCompatParcelizer(this.RatingCompat);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.read
    public final CoordinatorLayout.Behavior<FloatingActionButton> write() {
        return new Behavior();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.write;
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.write != colorStateList) {
            this.write = colorStateList;
            MediaMetadataCompat().read(colorStateList);
        }
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.read;
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.read != mode) {
            this.read = mode;
            MediaMetadataCompat().RemoteActionCompatParcelizer(mode);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.MediaDescriptionCompat != colorStateList) {
            this.MediaDescriptionCompat = colorStateList;
            MediaBrowserCompatMediaItem();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.AudioAttributesImplApi26Parcelizer != mode) {
            this.AudioAttributesImplApi26Parcelizer = mode;
            MediaBrowserCompatMediaItem();
        }
    }

    private void MediaBrowserCompatMediaItem() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.MediaDescriptionCompat;
        if (colorStateList == null) {
            findFormatOverrides.IconCompatParcelizer(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.AudioAttributesImplApi26Parcelizer;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(startIntentSenderForResult.IconCompatParcelizer(colorForState, mode));
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(i);
        MediaBrowserCompatMediaItem();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            MediaMetadataCompat().onPlay();
            if (this.MediaDescriptionCompat != null) {
                MediaBrowserCompatMediaItem();
            }
        }
    }

    @Override // kotlin.readSample
    public void setShapeAppearanceModel(isValidFrameType isvalidframetype) {
        MediaMetadataCompat().write(isvalidframetype);
    }

    public final isValidFrameType read() {
        return (isValidFrameType) StringCollectionDeserializer.RemoteActionCompatParcelizer(MediaMetadataCompat().RemoteActionCompatParcelizer());
    }

    public void setEnsureMinTouchTargetSize(boolean z) {
        if (z != MediaMetadataCompat().write()) {
            MediaMetadataCompat().RemoteActionCompatParcelizer(z);
            requestLayout();
        }
    }

    @Override // com.google.android.material.internal.VisibilityAwareImageButton, android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    public void setMaxImageSize(int i) {
        this.MediaMetadataCompat = i;
        MediaMetadataCompat().read(i);
    }

    public final void read(IconCompatParcelizer iconCompatParcelizer) {
        IconCompatParcelizer(iconCompatParcelizer, true);
    }

    final void IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer, boolean z) {
        MediaMetadataCompat().IconCompatParcelizer(AudioAttributesCompatParcelizer(iconCompatParcelizer), z);
    }

    public final void read(Animator.AnimatorListener animatorListener) {
        MediaMetadataCompat().RemoteActionCompatParcelizer(animatorListener);
    }

    public final void RemoteActionCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
        write(iconCompatParcelizer, true);
    }

    final void write(IconCompatParcelizer iconCompatParcelizer, boolean z) {
        MediaMetadataCompat().write(AudioAttributesCompatParcelizer(iconCompatParcelizer), z);
    }

    public final void RemoteActionCompatParcelizer(Animator.AnimatorListener animatorListener) {
        MediaMetadataCompat().AudioAttributesCompatParcelizer(animatorListener);
    }

    @Override // kotlin.endTracks
    public final boolean IconCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer.write();
    }

    public void setExpandedComponentIdHint(int i) {
        this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(i);
    }

    public final int RemoteActionCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer.read();
    }

    public void setUseCompatPadding(boolean z) {
        if (this.RemoteActionCompatParcelizer != z) {
            this.RemoteActionCompatParcelizer = z;
            MediaMetadataCompat().MediaDescriptionCompat();
        }
    }

    public void setSize(int i) {
        this.MediaBrowserCompatCustomActionResultReceiver = 0;
        if (i != this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i;
            requestLayout();
        }
    }

    private sampleData.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer(final IconCompatParcelizer iconCompatParcelizer) {
        if (iconCompatParcelizer == null) {
            return null;
        }
        return new sampleData.AudioAttributesCompatParcelizer() { // from class: com.google.android.material.floatingactionbutton.FloatingActionButton.1
            @Override // o.sampleData.AudioAttributesCompatParcelizer
            public final void IconCompatParcelizer() {
                iconCompatParcelizer.write();
            }

            @Override // o.sampleData.AudioAttributesCompatParcelizer
            public final void RemoteActionCompatParcelizer() {
                iconCompatParcelizer.AudioAttributesCompatParcelizer(FloatingActionButton.this);
            }
        };
    }

    public final boolean AudioAttributesImplBaseParcelizer() {
        return MediaMetadataCompat().MediaBrowserCompatCustomActionResultReceiver();
    }

    public final boolean MediaBrowserCompatItemReceiver() {
        return MediaMetadataCompat().MediaBrowserCompatItemReceiver();
    }

    public void setCustomSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i != this.MediaBrowserCompatCustomActionResultReceiver) {
            this.MediaBrowserCompatCustomActionResultReceiver = i;
            requestLayout();
        }
    }

    public final int MediaBrowserCompatCustomActionResultReceiver() {
        return read(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    private int read(int i) {
        int i2 = this.MediaBrowserCompatCustomActionResultReceiver;
        if (i2 != 0) {
            return i2;
        }
        Resources resources = getResources();
        if (i != -1) {
            if (i == 1) {
                return resources.getDimensionPixelSize(calculateNextSearchBytePosition.write.design_fab_size_mini);
            }
            return resources.getDimensionPixelSize(calculateNextSearchBytePosition.write.design_fab_size_normal);
        }
        if (Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470) {
            return read(1);
        }
        return read(0);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        MediaMetadataCompat().MediaMetadataCompat();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MediaMetadataCompat().RatingCompat();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        MediaMetadataCompat().RemoteActionCompatParcelizer(getDrawableState());
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        MediaMetadataCompat().AudioAttributesImplBaseParcelizer();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(parcelableOnSaveInstanceState);
        extendableSavedState.IconCompatParcelizer.put("expandableWidgetHelper", this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer());
        return extendableSavedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.read());
        this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer((Bundle) StringCollectionDeserializer.RemoteActionCompatParcelizer(extendableSavedState.IconCompatParcelizer.get("expandableWidgetHelper")));
    }

    @Deprecated
    public final boolean read(Rect rect) {
        if (!InvalidTypeIdException.onSeekTo(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        write(rect);
        return true;
    }

    public final void IconCompatParcelizer(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        write(rect);
    }

    private void RemoteActionCompatParcelizer(Rect rect) {
        IconCompatParcelizer(rect);
        int i = -this.MediaBrowserCompatMediaItem.AudioAttributesImplApi21Parcelizer();
        rect.inset(i, i);
    }

    private void write(Rect rect) {
        rect.left += this.AudioAttributesCompatParcelizer.left;
        rect.top += this.AudioAttributesCompatParcelizer.top;
        rect.right -= this.AudioAttributesCompatParcelizer.right;
        rect.bottom -= this.AudioAttributesCompatParcelizer.bottom;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            RemoteActionCompatParcelizer(this.onCustomAction);
            if (!this.onCustomAction.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(CoordinatorLayout.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            super.IconCompatParcelizer(remoteActionCompatParcelizer);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer */
        public final /* bridge */ /* synthetic */ boolean IconCompatParcelizer(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.IconCompatParcelizer(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: read */
        public final /* bridge */ /* synthetic */ boolean write(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            return super.write(coordinatorLayout, floatingActionButton, i);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: write */
        public final /* bridge */ /* synthetic */ boolean RemoteActionCompatParcelizer(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.RemoteActionCompatParcelizer(coordinatorLayout, floatingActionButton, rect);
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.Behavior<T> {
        private Rect IconCompatParcelizer;
        private IconCompatParcelizer RemoteActionCompatParcelizer;
        private boolean write;

        public BaseBehavior() {
            this.write = true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.FloatingActionButton_Behavior_Layout);
            this.write = typedArrayObtainStyledAttributes.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.FloatingActionButton_Behavior_Layout_behavior_autoHide, true);
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void IconCompatParcelizer(CoordinatorLayout.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
            if (remoteActionCompatParcelizer.RemoteActionCompatParcelizer == 0) {
                remoteActionCompatParcelizer.RemoteActionCompatParcelizer = 80;
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public boolean IconCompatParcelizer(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                AudioAttributesCompatParcelizer(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            }
            if (!write(view)) {
                return false;
            }
            IconCompatParcelizer(view, floatingActionButton);
            return false;
        }

        private static boolean write(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.RemoteActionCompatParcelizer) {
                return ((CoordinatorLayout.RemoteActionCompatParcelizer) layoutParams).write() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private boolean RemoteActionCompatParcelizer(View view, FloatingActionButton floatingActionButton) {
            return this.write && ((CoordinatorLayout.RemoteActionCompatParcelizer) floatingActionButton.getLayoutParams()).RemoteActionCompatParcelizer() == view.getId() && floatingActionButton.AudioAttributesImplApi21Parcelizer() == 0;
        }

        private boolean AudioAttributesCompatParcelizer(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (!RemoteActionCompatParcelizer(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.IconCompatParcelizer == null) {
                this.IconCompatParcelizer = new Rect();
            }
            Rect rect = this.IconCompatParcelizer;
            ExtractorOutput.AudioAttributesCompatParcelizer(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.read()) {
                floatingActionButton.write(this.RemoteActionCompatParcelizer, false);
                return true;
            }
            floatingActionButton.IconCompatParcelizer(this.RemoteActionCompatParcelizer, false);
            return true;
        }

        private boolean IconCompatParcelizer(View view, FloatingActionButton floatingActionButton) {
            if (!RemoteActionCompatParcelizer(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.RemoteActionCompatParcelizer) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.write(this.RemoteActionCompatParcelizer, false);
                return true;
            }
            floatingActionButton.IconCompatParcelizer(this.RemoteActionCompatParcelizer, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public boolean write(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i) {
            List<View> listRemoteActionCompatParcelizer = coordinatorLayout.RemoteActionCompatParcelizer(floatingActionButton);
            int size = listRemoteActionCompatParcelizer.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = listRemoteActionCompatParcelizer.get(i2);
                if (view instanceof AppBarLayout) {
                    if (AudioAttributesCompatParcelizer(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (write(view) && IconCompatParcelizer(view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.write(floatingActionButton, i);
            AudioAttributesCompatParcelizer(coordinatorLayout, floatingActionButton);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public boolean RemoteActionCompatParcelizer(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.AudioAttributesCompatParcelizer;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        private static void AudioAttributesCompatParcelizer(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            int i;
            Rect rect = floatingActionButton.AudioAttributesCompatParcelizer;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (CoordinatorLayout.RemoteActionCompatParcelizer) floatingActionButton.getLayoutParams();
            int i2 = 0;
            if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) remoteActionCompatParcelizer).rightMargin) {
                i = rect.right;
            } else {
                i = floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) remoteActionCompatParcelizer).leftMargin ? -rect.left : 0;
            }
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) remoteActionCompatParcelizer).bottomMargin) {
                i2 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) remoteActionCompatParcelizer).topMargin) {
                i2 = -rect.top;
            }
            if (i2 != 0) {
                InvalidTypeIdException.IconCompatParcelizer((View) floatingActionButton, i2);
            }
            if (i != 0) {
                InvalidTypeIdException.AudioAttributesCompatParcelizer(floatingActionButton, i);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        MediaMetadataCompat().read(f);
    }

    public void setCompatElevation(float f) {
        MediaMetadataCompat().IconCompatParcelizer(f);
    }

    public void setCompatElevationResource(int i) {
        setCompatElevation(getResources().getDimension(i));
    }

    public void setCompatHoveredFocusedTranslationZ(float f) {
        MediaMetadataCompat().write(f);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i));
    }

    public void setCompatPressedTranslationZ(float f) {
        MediaMetadataCompat().AudioAttributesCompatParcelizer(f);
    }

    public void setCompatPressedTranslationZResource(int i) {
        setCompatPressedTranslationZ(getResources().getDimension(i));
    }

    public final BinarySearchSeekerSeekTimestampConverter AudioAttributesImplApi26Parcelizer() {
        return MediaMetadataCompat().AudioAttributesImplApi26Parcelizer();
    }

    public void setShowMotionSpec(BinarySearchSeekerSeekTimestampConverter binarySearchSeekerSeekTimestampConverter) {
        MediaMetadataCompat().RemoteActionCompatParcelizer(binarySearchSeekerSeekTimestampConverter);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(BinarySearchSeekerSeekTimestampConverter.write(getContext(), i));
    }

    public final BinarySearchSeekerSeekTimestampConverter AudioAttributesCompatParcelizer() {
        return MediaMetadataCompat().IconCompatParcelizer();
    }

    public void setHideMotionSpec(BinarySearchSeekerSeekTimestampConverter binarySearchSeekerSeekTimestampConverter) {
        MediaMetadataCompat().write(binarySearchSeekerSeekTimestampConverter);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(BinarySearchSeekerSeekTimestampConverter.write(getContext(), i));
    }

    public final void RemoteActionCompatParcelizer(BinarySearchSeekerTimestampSearchResult<? extends FloatingActionButton> binarySearchSeekerTimestampSearchResult) {
        MediaMetadataCompat().IconCompatParcelizer(new AudioAttributesCompatParcelizer(binarySearchSeekerTimestampSearchResult));
    }

    class AudioAttributesCompatParcelizer<T extends FloatingActionButton> implements sampleData.write {
        private final BinarySearchSeekerTimestampSearchResult<T> IconCompatParcelizer;

        AudioAttributesCompatParcelizer(BinarySearchSeekerTimestampSearchResult<T> binarySearchSeekerTimestampSearchResult) {
            this.IconCompatParcelizer = binarySearchSeekerTimestampSearchResult;
        }

        @Override // o.sampleData.write
        public final void AudioAttributesCompatParcelizer() {
            this.IconCompatParcelizer.IconCompatParcelizer(FloatingActionButton.this);
        }

        @Override // o.sampleData.write
        public final void write() {
            this.IconCompatParcelizer.AudioAttributesCompatParcelizer(FloatingActionButton.this);
        }

        public final boolean equals(Object obj) {
            return (obj instanceof AudioAttributesCompatParcelizer) && ((AudioAttributesCompatParcelizer) obj).IconCompatParcelizer.equals(this.IconCompatParcelizer);
        }

        public final int hashCode() {
            return this.IconCompatParcelizer.hashCode();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        super.setTranslationX(f);
        MediaMetadataCompat().onCustomAction();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        MediaMetadataCompat().onCustomAction();
    }

    @Override // android.view.View
    public void setTranslationZ(float f) {
        super.setTranslationZ(f);
        MediaMetadataCompat().onCustomAction();
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        super.setScaleX(f);
        MediaMetadataCompat().MediaBrowserCompatSearchResultReceiver();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        super.setScaleY(f);
        MediaMetadataCompat().MediaBrowserCompatSearchResultReceiver();
    }

    public void setShadowPaddingEnabled(boolean z) {
        MediaMetadataCompat().write(z);
    }

    private sampleData MediaMetadataCompat() {
        if (this.MediaBrowserCompatMediaItem == null) {
            this.MediaBrowserCompatMediaItem = RatingCompat();
        }
        return this.MediaBrowserCompatMediaItem;
    }

    private sampleData RatingCompat() {
        return new sampleMetadata(this, new RemoteActionCompatParcelizer());
    }

    class RemoteActionCompatParcelizer implements readVorbisModes {
        RemoteActionCompatParcelizer() {
        }

        @Override // kotlin.readVorbisModes
        public final void write(int i, int i2, int i3, int i4) {
            FloatingActionButton.this.AudioAttributesCompatParcelizer.set(i, i2, i3, i4);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i + floatingActionButton.MediaBrowserCompatSearchResultReceiver, i2 + FloatingActionButton.this.MediaBrowserCompatSearchResultReceiver, i3 + FloatingActionButton.this.MediaBrowserCompatSearchResultReceiver, i4 + FloatingActionButton.this.MediaBrowserCompatSearchResultReceiver);
        }

        @Override // kotlin.readVorbisModes
        public final void RemoteActionCompatParcelizer(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // kotlin.readVorbisModes
        public final boolean RemoteActionCompatParcelizer() {
            return FloatingActionButton.this.RemoteActionCompatParcelizer;
        }
    }
}
