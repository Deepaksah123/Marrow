package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import kotlin.BinarySearchSeekerSeekOperationParams;
import kotlin.DefaultExtractorsFactoryExtensionLoader;
import kotlin.InvalidTypeIdException;
import kotlin.SeekMap;
import kotlin.StdKeyDeserializer;
import kotlin._deserializeNR;
import kotlin.calculateNextSearchBytePosition;
import kotlin.configureFromStringCreator;
import kotlin.createExtractors;
import kotlin.deserializeUsingCustom;
import kotlin.findFormatOverrides;
import kotlin.finishBranchObject;
import kotlin.frameSizeBytesByTypeNb;
import kotlin.getConstantBitrateSeekMap;
import kotlin.getDefaultViewModelCreationExtras;
import kotlin.getSampleRateLookupKey;
import kotlin.hasSuperClassStartingWith;
import kotlin.modifyFieldName;
import kotlin.readFrames;
import kotlin.readId3Metadata;
import kotlin.searchForTimestamp;

/* JADX INFO: loaded from: classes3.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.read {
    private static final int write = calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.Widget_Design_AppBarLayout;
    private Behavior AudioAttributesCompatParcelizer;
    private WindowInsetsCompat AudioAttributesImplApi21Parcelizer;
    private final boolean AudioAttributesImplApi26Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private final float IconCompatParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    private final long MediaBrowserCompatMediaItem;
    private ValueAnimator.AnimatorUpdateListener MediaBrowserCompatSearchResultReceiver;
    private WeakReference<View> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final List<read> MediaDescriptionCompat;
    private final TimeInterpolator MediaMetadataCompat;
    private ValueAnimator RatingCompat;
    private int RemoteActionCompatParcelizer;
    private boolean handleMediaPlayPauseIfPendingOnHandler;
    private int onAddQueueItem;
    private boolean onCommand;
    private boolean onCustomAction;
    private int onFastForward;
    private int[] onMediaButtonEvent;
    private Drawable onPause;
    private Integer onPlay;
    private List<AudioAttributesCompatParcelizer> onPlayFromMediaId;
    private int onPrepareFromMediaId;
    private int read;

    public interface AudioAttributesCompatParcelizer<T extends AppBarLayout> {
        void IconCompatParcelizer(T t, int i);
    }

    public static abstract class IconCompatParcelizer {
        public abstract void RemoteActionCompatParcelizer(AppBarLayout appBarLayout, View view, float f);
    }

    /* JADX INFO: loaded from: classes5.dex */
    public interface read {
    }

    public interface write extends AudioAttributesCompatParcelizer<AppBarLayout> {
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return onPlay();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* synthetic */ LinearLayout.LayoutParams generateDefaultLayoutParams() {
        return onPlay();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return write(layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected /* synthetic */ LinearLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return write(layoutParams);
    }

    public AppBarLayout(Context context) {
        this(context, null);
    }

    public AppBarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, calculateNextSearchBytePosition.IconCompatParcelizer.appBarLayoutStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppBarLayout(Context context, AttributeSet attributeSet, int i) {
        int i2 = write;
        super(readFrames.IconCompatParcelizer(context, attributeSet, i, i2), attributeSet, i);
        this.onPrepareFromMediaId = -1;
        this.read = -1;
        this.MediaBrowserCompatItemReceiver = -1;
        this.onFastForward = 0;
        this.MediaDescriptionCompat = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            searchForTimestamp.RemoteActionCompatParcelizer(this);
        }
        searchForTimestamp.read(this, attributeSet, i, i2);
        TypedArray typedArrayWrite = readId3Metadata.write(context2, attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.AppBarLayout, i, i2, new int[0]);
        InvalidTypeIdException.read(this, typedArrayWrite.getDrawable(calculateNextSearchBytePosition.MediaMetadataCompat.AppBarLayout_android_background));
        ColorStateList colorStateListIconCompatParcelizer = SeekMap.IconCompatParcelizer(context2, typedArrayWrite, calculateNextSearchBytePosition.MediaMetadataCompat.AppBarLayout_liftOnScrollColor);
        this.AudioAttributesImplApi26Parcelizer = colorStateListIconCompatParcelizer != null;
        ColorStateList colorStateListIconCompatParcelizer2 = DefaultExtractorsFactoryExtensionLoader.IconCompatParcelizer(getBackground());
        if (colorStateListIconCompatParcelizer2 != null) {
            frameSizeBytesByTypeNb framesizebytesbytypenb = new frameSizeBytesByTypeNb();
            framesizebytesbytypenb.AudioAttributesImplApi21Parcelizer(colorStateListIconCompatParcelizer2);
            if (colorStateListIconCompatParcelizer != null) {
                write(framesizebytesbytypenb, colorStateListIconCompatParcelizer2, colorStateListIconCompatParcelizer);
            } else {
                IconCompatParcelizer(context2, framesizebytesbytypenb);
            }
        }
        this.MediaBrowserCompatMediaItem = getSampleRateLookupKey.write(context2, calculateNextSearchBytePosition.IconCompatParcelizer.motionDurationMedium2, getResources().getInteger(calculateNextSearchBytePosition.AudioAttributesImplApi21Parcelizer.app_bar_elevation_anim_duration));
        this.MediaMetadataCompat = getSampleRateLookupKey.read(context2, calculateNextSearchBytePosition.IconCompatParcelizer.motionEasingStandardInterpolator, BinarySearchSeekerSeekOperationParams.write);
        if (typedArrayWrite.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.AppBarLayout_expanded)) {
            IconCompatParcelizer(typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.AppBarLayout_expanded, false), false, false);
        }
        if (typedArrayWrite.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.AppBarLayout_elevation)) {
            searchForTimestamp.AudioAttributesCompatParcelizer(this, typedArrayWrite.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.AppBarLayout_elevation, 0));
        }
        if (typedArrayWrite.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.AppBarLayout_android_keyboardNavigationCluster)) {
            setKeyboardNavigationCluster(typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.AppBarLayout_android_keyboardNavigationCluster, false));
        }
        if (typedArrayWrite.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.AppBarLayout_android_touchscreenBlocksFocus)) {
            setTouchscreenBlocksFocus(typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.AppBarLayout_android_touchscreenBlocksFocus, false));
        }
        this.IconCompatParcelizer = getResources().getDimension(calculateNextSearchBytePosition.write.design_appbar_elevation);
        this.MediaBrowserCompatCustomActionResultReceiver = typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.AppBarLayout_liftOnScroll, false);
        this.onAddQueueItem = typedArrayWrite.getResourceId(calculateNextSearchBytePosition.MediaMetadataCompat.AppBarLayout_liftOnScrollTargetViewId, -1);
        setStatusBarForeground(typedArrayWrite.getDrawable(calculateNextSearchBytePosition.MediaMetadataCompat.AppBarLayout_statusBarForeground));
        typedArrayWrite.recycle();
        InvalidTypeIdException.read(this, new finishBranchObject() { // from class: com.google.android.material.appbar.AppBarLayout.3
            @Override // kotlin.finishBranchObject
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return AppBarLayout.this.IconCompatParcelizer(windowInsetsCompat);
            }
        });
    }

    private void write(final frameSizeBytesByTypeNb framesizebytesbytypenb, final ColorStateList colorStateList, final ColorStateList colorStateList2) {
        final Integer numAudioAttributesCompatParcelizer = createExtractors.AudioAttributesCompatParcelizer(getContext(), calculateNextSearchBytePosition.IconCompatParcelizer.colorSurface);
        this.MediaBrowserCompatSearchResultReceiver = new ValueAnimator.AnimatorUpdateListener() { // from class: o.updateSeekFloor
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.write.AudioAttributesCompatParcelizer(colorStateList, colorStateList2, framesizebytesbytypenb, numAudioAttributesCompatParcelizer, valueAnimator);
            }
        };
        InvalidTypeIdException.read(this, framesizebytesbytypenb);
    }

    public final /* synthetic */ void AudioAttributesCompatParcelizer(ColorStateList colorStateList, ColorStateList colorStateList2, frameSizeBytesByTypeNb framesizebytesbytypenb, Integer num, ValueAnimator valueAnimator) {
        Integer num2;
        int iWrite = createExtractors.write(colorStateList.getDefaultColor(), colorStateList2.getDefaultColor(), ((Float) valueAnimator.getAnimatedValue()).floatValue());
        framesizebytesbytypenb.AudioAttributesImplApi21Parcelizer(ColorStateList.valueOf(iWrite));
        if (this.onPause != null && (num2 = this.onPlay) != null && num2.equals(num)) {
            findFormatOverrides.AudioAttributesCompatParcelizer(this.onPause, iWrite);
        }
        if (this.MediaDescriptionCompat.isEmpty()) {
            return;
        }
        for (read readVar : this.MediaDescriptionCompat) {
            framesizebytesbytypenb.onPlay();
        }
    }

    private void IconCompatParcelizer(Context context, final frameSizeBytesByTypeNb framesizebytesbytypenb) {
        framesizebytesbytypenb.RemoteActionCompatParcelizer(context);
        this.MediaBrowserCompatSearchResultReceiver = new ValueAnimator.AnimatorUpdateListener() { // from class: o.targetFoundResult
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.write.IconCompatParcelizer(framesizebytesbytypenb, valueAnimator);
            }
        };
        InvalidTypeIdException.read(this, framesizebytesbytypenb);
    }

    public final /* synthetic */ void IconCompatParcelizer(frameSizeBytesByTypeNb framesizebytesbytypenb, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        framesizebytesbytypenb.handleMediaPlayPauseIfPendingOnHandler(fFloatValue);
        Drawable drawable = this.onPause;
        if (drawable instanceof frameSizeBytesByTypeNb) {
            ((frameSizeBytesByTypeNb) drawable).handleMediaPlayPauseIfPendingOnHandler(fFloatValue);
        }
        for (read readVar : this.MediaDescriptionCompat) {
            framesizebytesbytypenb.onPrepare();
        }
    }

    private void read(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        if (this.onPlayFromMediaId == null) {
            this.onPlayFromMediaId = new ArrayList();
        }
        if (audioAttributesCompatParcelizer == null || this.onPlayFromMediaId.contains(audioAttributesCompatParcelizer)) {
            return;
        }
        this.onPlayFromMediaId.add(audioAttributesCompatParcelizer);
    }

    public final void RemoteActionCompatParcelizer(write writeVar) {
        read(writeVar);
    }

    private void write(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        List<AudioAttributesCompatParcelizer> list = this.onPlayFromMediaId;
        if (list == null || audioAttributesCompatParcelizer == null) {
            return;
        }
        list.remove(audioAttributesCompatParcelizer);
    }

    public final void write(write writeVar) {
        write((AudioAttributesCompatParcelizer) writeVar);
    }

    public void setStatusBarForeground(Drawable drawable) {
        Drawable drawable2 = this.onPause;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            this.onPause = drawable != null ? drawable.mutate() : null;
            this.onPlay = RatingCompat();
            Drawable drawable3 = this.onPause;
            if (drawable3 != null) {
                if (drawable3.isStateful()) {
                    this.onPause.setState(getDrawableState());
                }
                findFormatOverrides.RemoteActionCompatParcelizer(this.onPause, InvalidTypeIdException.MediaBrowserCompatMediaItem(this));
                this.onPause.setVisible(getVisibility() == 0, false);
                this.onPause.setCallback(this);
            }
            onCustomAction();
            InvalidTypeIdException.onRemoveQueueItem(this);
        }
    }

    public void setStatusBarForegroundColor(int i) {
        setStatusBarForeground(new ColorDrawable(i));
    }

    public void setStatusBarForegroundResource(int i) {
        setStatusBarForeground(getDefaultViewModelCreationExtras.write(getContext(), i));
    }

    private Integer RatingCompat() {
        Drawable drawable = this.onPause;
        if (drawable instanceof frameSizeBytesByTypeNb) {
            return Integer.valueOf(((frameSizeBytesByTypeNb) drawable).onPrepare());
        }
        ColorStateList colorStateListIconCompatParcelizer = DefaultExtractorsFactoryExtensionLoader.IconCompatParcelizer(drawable);
        if (colorStateListIconCompatParcelizer != null) {
            return Integer.valueOf(colorStateListIconCompatParcelizer.getDefaultColor());
        }
        return null;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
            int iSave = canvas.save();
            canvas.translate(BitmapDescriptorFactory.HUE_RED, -this.RemoteActionCompatParcelizer);
            this.onPause.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.onPause;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.onPause;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.onPause;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != 1073741824 && InvalidTypeIdException.MediaBrowserCompatCustomActionResultReceiver(this) && onCommand()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = StdKeyDeserializer.read(getMeasuredHeight() + MediaBrowserCompatCustomActionResultReceiver(), 0, View.MeasureSpec.getSize(i2));
            } else if (mode == 0) {
                measuredHeight += MediaBrowserCompatCustomActionResultReceiver();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        handleMediaPlayPauseIfPendingOnHandler();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        boolean z2 = true;
        if (InvalidTypeIdException.MediaBrowserCompatCustomActionResultReceiver(this) && onCommand()) {
            int iMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                InvalidTypeIdException.IconCompatParcelizer(getChildAt(childCount), iMediaBrowserCompatCustomActionResultReceiver);
            }
        }
        handleMediaPlayPauseIfPendingOnHandler();
        this.AudioAttributesImplBaseParcelizer = false;
        int childCount2 = getChildCount();
        int i5 = 0;
        while (true) {
            if (i5 >= childCount2) {
                break;
            }
            if (((LayoutParams) getChildAt(i5).getLayoutParams()).write() != null) {
                this.AudioAttributesImplBaseParcelizer = true;
                break;
            }
            i5++;
        }
        Drawable drawable = this.onPause;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), MediaBrowserCompatCustomActionResultReceiver());
        }
        if (this.onCustomAction) {
            return;
        }
        if (!this.MediaBrowserCompatCustomActionResultReceiver && !MediaBrowserCompatSearchResultReceiver()) {
            z2 = false;
        }
        RemoteActionCompatParcelizer(z2);
    }

    private void onCustomAction() {
        setWillNotDraw(!MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
    }

    private boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.onPause != null && MediaBrowserCompatCustomActionResultReceiver() > 0;
    }

    private boolean MediaBrowserCompatSearchResultReceiver() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((LayoutParams) getChildAt(i).getLayoutParams()).read()) {
                return true;
            }
        }
        return false;
    }

    private void handleMediaPlayPauseIfPendingOnHandler() {
        Behavior behavior = this.AudioAttributesCompatParcelizer;
        BaseBehavior.SavedState savedStateWrite = (behavior == null || this.onPrepareFromMediaId == -1 || this.onFastForward != 0) ? null : behavior.write(AbsSavedState.write, this);
        this.onPrepareFromMediaId = -1;
        this.read = -1;
        this.MediaBrowserCompatItemReceiver = -1;
        if (savedStateWrite != null) {
            this.AudioAttributesCompatParcelizer.read(savedStateWrite, false);
        }
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i) {
        if (i != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getConstantBitrateSeekMap.IconCompatParcelizer(this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.read
    public final CoordinatorLayout.Behavior<AppBarLayout> write() {
        Behavior behavior = new Behavior();
        this.AudioAttributesCompatParcelizer = behavior;
        return behavior;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        getConstantBitrateSeekMap.read(this, f);
    }

    public void setExpanded(boolean z) {
        setExpanded(z, InvalidTypeIdException.onSeekTo(this));
    }

    public void setExpanded(boolean z, boolean z2) {
        IconCompatParcelizer(z, z2, true);
    }

    private void IconCompatParcelizer(boolean z, boolean z2, boolean z3) {
        this.onFastForward = (z ? 1 : 2) | (z2 ? 4 : 0) | (z3 ? 8 : 0);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    private static LayoutParams onPlay() {
        return new LayoutParams();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    private static LayoutParams write(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LinearLayout.LayoutParams) {
            return new LayoutParams((LinearLayout.LayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MediaMetadataCompat();
    }

    final boolean AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final int AudioAttributesImplApi21Parcelizer() {
        int i = this.onPrepareFromMediaId;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int iRatingCompat = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = layoutParams.read;
                if ((i3 & 1) == 0) {
                    break;
                }
                iRatingCompat += measuredHeight + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                if (i2 == 0 && InvalidTypeIdException.MediaBrowserCompatCustomActionResultReceiver(childAt)) {
                    iRatingCompat -= MediaBrowserCompatCustomActionResultReceiver();
                }
                if ((i3 & 2) != 0) {
                    iRatingCompat -= InvalidTypeIdException.RatingCompat(childAt);
                    break;
                }
            }
            i2++;
        }
        int iMax = Math.max(0, iRatingCompat);
        this.onPrepareFromMediaId = iMax;
        return iMax;
    }

    final boolean AudioAttributesImplBaseParcelizer() {
        return AudioAttributesImplApi21Parcelizer() != 0;
    }

    final int MediaBrowserCompatItemReceiver() {
        return AudioAttributesImplApi21Parcelizer();
    }

    final int IconCompatParcelizer() {
        int iMin;
        int iRatingCompat;
        int i = this.read;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = layoutParams.read;
                if ((i3 & 5) != 5) {
                    if (i2 > 0) {
                        break;
                    }
                } else {
                    int i4 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    if ((i3 & 8) != 0) {
                        iRatingCompat = InvalidTypeIdException.RatingCompat(childAt);
                    } else if ((i3 & 2) != 0) {
                        iRatingCompat = measuredHeight - InvalidTypeIdException.RatingCompat(childAt);
                    } else {
                        iMin = i4 + measuredHeight;
                        if (childCount == 0 && InvalidTypeIdException.MediaBrowserCompatCustomActionResultReceiver(childAt)) {
                            iMin = Math.min(iMin, measuredHeight - MediaBrowserCompatCustomActionResultReceiver());
                        }
                        i2 += iMin;
                    }
                    iMin = i4 + iRatingCompat;
                    if (childCount == 0) {
                        iMin = Math.min(iMin, measuredHeight - MediaBrowserCompatCustomActionResultReceiver());
                    }
                    i2 += iMin;
                }
            }
        }
        int iMax = Math.max(0, i2);
        this.read = iMax;
        return iMax;
    }

    final int AudioAttributesCompatParcelizer() {
        int i = this.MediaBrowserCompatItemReceiver;
        if (i != -1) {
            return i;
        }
        int childCount = getChildCount();
        int iRatingCompat = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredHeight = childAt.getMeasuredHeight();
                int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                int i4 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                int i5 = layoutParams.read;
                if ((i5 & 1) == 0) {
                    break;
                }
                iRatingCompat += measuredHeight + i3 + i4;
                if ((i5 & 2) != 0) {
                    iRatingCompat -= InvalidTypeIdException.RatingCompat(childAt);
                    break;
                }
            }
            i2++;
        }
        int iMax = Math.max(0, iRatingCompat);
        this.MediaBrowserCompatItemReceiver = iMax;
        return iMax;
    }

    final void IconCompatParcelizer(int i) {
        this.RemoteActionCompatParcelizer = i;
        if (!willNotDraw()) {
            InvalidTypeIdException.onRemoveQueueItem(this);
        }
        List<AudioAttributesCompatParcelizer> list = this.onPlayFromMediaId;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.onPlayFromMediaId.get(i2);
                if (audioAttributesCompatParcelizer != null) {
                    audioAttributesCompatParcelizer.IconCompatParcelizer(this, i);
                }
            }
        }
    }

    public final int read() {
        int iMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        int iRatingCompat = InvalidTypeIdException.RatingCompat(this);
        if (iRatingCompat == 0) {
            int childCount = getChildCount();
            iRatingCompat = childCount > 0 ? InvalidTypeIdException.RatingCompat(getChildAt(childCount - 1)) : 0;
            if (iRatingCompat == 0) {
                return getHeight() / 3;
            }
        }
        return (iRatingCompat << 1) + iMediaBrowserCompatCustomActionResultReceiver;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i) {
        if (this.onMediaButtonEvent == null) {
            this.onMediaButtonEvent = new int[4];
        }
        int[] iArr = this.onMediaButtonEvent;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + iArr.length);
        iArr[0] = this.onCommand ? calculateNextSearchBytePosition.IconCompatParcelizer.state_liftable : -calculateNextSearchBytePosition.IconCompatParcelizer.state_liftable;
        iArr[1] = (this.onCommand && this.handleMediaPlayPauseIfPendingOnHandler) ? calculateNextSearchBytePosition.IconCompatParcelizer.state_lifted : -calculateNextSearchBytePosition.IconCompatParcelizer.state_lifted;
        iArr[2] = this.onCommand ? calculateNextSearchBytePosition.IconCompatParcelizer.state_collapsible : -calculateNextSearchBytePosition.IconCompatParcelizer.state_collapsible;
        iArr[3] = (this.onCommand && this.handleMediaPlayPauseIfPendingOnHandler) ? calculateNextSearchBytePosition.IconCompatParcelizer.state_collapsed : -calculateNextSearchBytePosition.IconCompatParcelizer.state_collapsed;
        return mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    public void setLiftableOverrideEnabled(boolean z) {
        this.onCustomAction = z;
    }

    private boolean RemoteActionCompatParcelizer(boolean z) {
        if (this.onCommand == z) {
            return false;
        }
        this.onCommand = z;
        refreshDrawableState();
        return true;
    }

    final boolean IconCompatParcelizer(boolean z) {
        return RemoteActionCompatParcelizer(z, !this.onCustomAction);
    }

    private boolean RemoteActionCompatParcelizer(boolean z, boolean z2) {
        if (!z2 || this.handleMediaPlayPauseIfPendingOnHandler == z) {
            return false;
        }
        this.handleMediaPlayPauseIfPendingOnHandler = z;
        refreshDrawableState();
        if (!onAddQueueItem()) {
            return true;
        }
        boolean z3 = this.AudioAttributesImplApi26Parcelizer;
        float f = BitmapDescriptorFactory.HUE_RED;
        if (z3) {
            float f2 = z ? 0.0f : 1.0f;
            if (z) {
                f = 1.0f;
            }
            RemoteActionCompatParcelizer(f2, f);
            return true;
        }
        if (!this.MediaBrowserCompatCustomActionResultReceiver) {
            return true;
        }
        float f3 = z ? 0.0f : this.IconCompatParcelizer;
        if (z) {
            f = this.IconCompatParcelizer;
        }
        RemoteActionCompatParcelizer(f3, f);
        return true;
    }

    private boolean onAddQueueItem() {
        return getBackground() instanceof frameSizeBytesByTypeNb;
    }

    private void RemoteActionCompatParcelizer(float f, float f2) {
        ValueAnimator valueAnimator = this.RatingCompat;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        this.RatingCompat = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.MediaBrowserCompatMediaItem);
        this.RatingCompat.setInterpolator(this.MediaMetadataCompat);
        ValueAnimator.AnimatorUpdateListener animatorUpdateListener = this.MediaBrowserCompatSearchResultReceiver;
        if (animatorUpdateListener != null) {
            this.RatingCompat.addUpdateListener(animatorUpdateListener);
        }
        this.RatingCompat.start();
    }

    public void setLiftOnScroll(boolean z) {
        this.MediaBrowserCompatCustomActionResultReceiver = z;
    }

    public final boolean MediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public void setLiftOnScrollTargetView(View view) {
        this.onAddQueueItem = -1;
        if (view == null) {
            MediaMetadataCompat();
        } else {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new WeakReference<>(view);
        }
    }

    public void setLiftOnScrollTargetViewId(int i) {
        this.onAddQueueItem = i;
        MediaMetadataCompat();
    }

    final boolean IconCompatParcelizer(View view) {
        View viewRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(view);
        if (viewRemoteActionCompatParcelizer != null) {
            view = viewRemoteActionCompatParcelizer;
        }
        if (view != null) {
            return view.canScrollVertically(-1) || view.getScrollY() > 0;
        }
        return false;
    }

    private View RemoteActionCompatParcelizer(View view) {
        int i;
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == null && (i = this.onAddQueueItem) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.onAddQueueItem);
            }
            if (viewFindViewById != null) {
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new WeakReference<>(viewFindViewById);
            }
        }
        WeakReference<View> weakReference = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private void MediaMetadataCompat() {
        WeakReference<View> weakReference = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = null;
    }

    @Deprecated
    public void setTargetElevation(float f) {
        searchForTimestamp.AudioAttributesCompatParcelizer(this, f);
    }

    final int RemoteActionCompatParcelizer() {
        return this.onFastForward;
    }

    final void MediaDescriptionCompat() {
        this.onFastForward = 0;
    }

    final int MediaBrowserCompatCustomActionResultReceiver() {
        WindowInsetsCompat windowInsetsCompat = this.AudioAttributesImplApi21Parcelizer;
        if (windowInsetsCompat != null) {
            return windowInsetsCompat.MediaBrowserCompatCustomActionResultReceiver();
        }
        return 0;
    }

    private boolean onCommand() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            if (childAt.getVisibility() != 8 && !InvalidTypeIdException.MediaBrowserCompatCustomActionResultReceiver(childAt)) {
                return true;
            }
        }
        return false;
    }

    final WindowInsetsCompat IconCompatParcelizer(WindowInsetsCompat windowInsetsCompat) {
        WindowInsetsCompat windowInsetsCompat2 = InvalidTypeIdException.MediaBrowserCompatCustomActionResultReceiver(this) ? windowInsetsCompat : null;
        if (!configureFromStringCreator.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, windowInsetsCompat2)) {
            this.AudioAttributesImplApi21Parcelizer = windowInsetsCompat2;
            onCustomAction();
            requestLayout();
        }
        return windowInsetsCompat;
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {
        private IconCompatParcelizer AudioAttributesCompatParcelizer;
        private Interpolator RemoteActionCompatParcelizer;
        int read;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.read = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.AppBarLayout_Layout);
            this.read = typedArrayObtainStyledAttributes.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.AppBarLayout_Layout_layout_scrollFlags, 0);
            read(typedArrayObtainStyledAttributes.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.AppBarLayout_Layout_layout_scrollEffect, 0));
            if (typedArrayObtainStyledAttributes.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.AppBarLayout_Layout_layout_scrollInterpolator)) {
                this.RemoteActionCompatParcelizer = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(calculateNextSearchBytePosition.MediaMetadataCompat.AppBarLayout_Layout_layout_scrollInterpolator, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams() {
            super(-1, -2);
            this.read = 1;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.read = 1;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.read = 1;
        }

        public LayoutParams(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.read = 1;
        }

        public final void write(int i) {
            this.read = i;
        }

        public final int IconCompatParcelizer() {
            return this.read;
        }

        private static IconCompatParcelizer AudioAttributesCompatParcelizer(int i) {
            if (i != 1) {
                return null;
            }
            return new RemoteActionCompatParcelizer();
        }

        public final IconCompatParcelizer RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        private void read(int i) {
            this.AudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(i);
        }

        public final Interpolator write() {
            return this.RemoteActionCompatParcelizer;
        }

        final boolean read() {
            int i = this.read;
            return (i & 1) == 1 && (i & 10) != 0;
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {
        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer */
        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i) {
            super.IconCompatParcelizer(coordinatorLayout, appBarLayout, view, i);
        }

        @Override // com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final /* bridge */ /* synthetic */ boolean AudioAttributesCompatParcelizer(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.AudioAttributesCompatParcelizer(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer */
        public final /* bridge */ /* synthetic */ Parcelable read(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
            return super.read(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public final /* bridge */ /* synthetic */ boolean RemoteActionCompatParcelizer(int i) {
            return super.RemoteActionCompatParcelizer(i);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer */
        public final /* bridge */ /* synthetic */ boolean write(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i, int i2, int i3, int i4) {
            return super.write(coordinatorLayout, appBarLayout, i, i2, i3, i4);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public final /* bridge */ /* synthetic */ int read() {
            return super.read();
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: read */
        public final /* bridge */ /* synthetic */ void AudioAttributesCompatParcelizer(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
            super.AudioAttributesCompatParcelizer(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public final /* bridge */ /* synthetic */ void read(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            super.read(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5, iArr);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public final /* bridge */ /* synthetic */ void read(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int[] iArr, int i3) {
            super.read(coordinatorLayout, appBarLayout, view, i, i2, iArr, i3);
        }

        @Override // com.google.android.material.appbar.HeaderBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final /* bridge */ /* synthetic */ boolean read(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return super.read(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: read */
        public final /* bridge */ /* synthetic */ boolean write(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, int i) {
            return super.write(coordinatorLayout, appBarLayout, i);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: read */
        public final /* bridge */ /* synthetic */ boolean write(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
            return super.write(coordinatorLayout, appBarLayout, view, view2, i, i2);
        }

        public Behavior() {
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    protected static class BaseBehavior<T extends AppBarLayout> extends HeaderBehavior<T> {
        private ValueAnimator AudioAttributesCompatParcelizer;
        private IconCompatParcelizer AudioAttributesImplBaseParcelizer;
        private int MediaBrowserCompatCustomActionResultReceiver;
        private SavedState MediaBrowserCompatItemReceiver;
        private int RemoteActionCompatParcelizer;
        private boolean read;
        private WeakReference<View> write;

        public static abstract class IconCompatParcelizer<T extends AppBarLayout> {
        }

        private static boolean write(int i, int i2) {
            return (i & i2) == i2;
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        final /* synthetic */ boolean IconCompatParcelizer(View view) {
            return write();
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        final /* synthetic */ int RemoteActionCompatParcelizer(View view) {
            return IconCompatParcelizer((AppBarLayout) view);
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        final /* bridge */ /* synthetic */ int write(View view) {
            return write((AppBarLayout) view);
        }

        public BaseBehavior() {
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public boolean write(CoordinatorLayout coordinatorLayout, T t, View view, View view2, int i, int i2) {
            ValueAnimator valueAnimator;
            boolean z = (i & 2) != 0 && (t.MediaBrowserCompatMediaItem() || write(coordinatorLayout, t, view));
            if (z && (valueAnimator = this.AudioAttributesCompatParcelizer) != null) {
                valueAnimator.cancel();
            }
            this.write = null;
            this.RemoteActionCompatParcelizer = i2;
            return z;
        }

        private static boolean write(CoordinatorLayout coordinatorLayout, T t, View view) {
            return t.AudioAttributesImplBaseParcelizer() && coordinatorLayout.getHeight() - view.getHeight() <= t.getHeight();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void read(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            int iIconCompatParcelizer;
            if (i2 != 0) {
                if (i2 < 0) {
                    i4 = -t.AudioAttributesImplApi21Parcelizer();
                    iIconCompatParcelizer = t.IconCompatParcelizer() + i4;
                } else {
                    i4 = -t.MediaBrowserCompatItemReceiver();
                    iIconCompatParcelizer = 0;
                }
                int i5 = i4;
                int i6 = iIconCompatParcelizer;
                if (i5 != i6) {
                    iArr[1] = RemoteActionCompatParcelizer(coordinatorLayout, t, i2, i5, i6);
                }
            }
            if (t.MediaBrowserCompatMediaItem()) {
                t.IconCompatParcelizer(t.IconCompatParcelizer(view));
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void read(CoordinatorLayout coordinatorLayout, T t, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            if (i4 < 0) {
                iArr[1] = RemoteActionCompatParcelizer(coordinatorLayout, t, i4, -t.AudioAttributesCompatParcelizer(), 0);
            }
            if (i4 == 0) {
                write(coordinatorLayout, (AppBarLayout) t);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public void IconCompatParcelizer(CoordinatorLayout coordinatorLayout, T t, View view, int i) {
            if (this.RemoteActionCompatParcelizer == 0 || i == 1) {
                AudioAttributesCompatParcelizer(coordinatorLayout, (AppBarLayout) t);
                if (t.MediaBrowserCompatMediaItem()) {
                    t.IconCompatParcelizer(t.IconCompatParcelizer(view));
                }
            }
            this.write = new WeakReference<>(view);
        }

        private void AudioAttributesCompatParcelizer(CoordinatorLayout coordinatorLayout, T t, int i) {
            int height;
            int iAbs = Math.abs(RemoteActionCompatParcelizer() - i);
            float fAbs = Math.abs(BitmapDescriptorFactory.HUE_RED);
            if (fAbs > BitmapDescriptorFactory.HUE_RED) {
                height = Math.round((iAbs / fAbs) * 1000.0f) * 3;
            } else {
                height = (int) (((iAbs / t.getHeight()) + 1.0f) * 150.0f);
            }
            read(coordinatorLayout, t, i, height);
        }

        private void read(final CoordinatorLayout coordinatorLayout, final T t, int i, int i2) {
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            if (iRemoteActionCompatParcelizer == i) {
                ValueAnimator valueAnimator = this.AudioAttributesCompatParcelizer;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.AudioAttributesCompatParcelizer.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.AudioAttributesCompatParcelizer;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.AudioAttributesCompatParcelizer = valueAnimator3;
                valueAnimator3.setInterpolator(BinarySearchSeekerSeekOperationParams.read);
                this.AudioAttributesCompatParcelizer.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator4) {
                        BaseBehavior.this.IconCompatParcelizer(coordinatorLayout, t, ((Integer) valueAnimator4.getAnimatedValue()).intValue());
                    }
                });
            } else {
                valueAnimator2.cancel();
            }
            this.AudioAttributesCompatParcelizer.setDuration(Math.min(i2, 600));
            this.AudioAttributesCompatParcelizer.setIntValues(iRemoteActionCompatParcelizer, i);
            this.AudioAttributesCompatParcelizer.start();
        }

        private static int IconCompatParcelizer(T t, int i) {
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (write(layoutParams.IconCompatParcelizer(), 32)) {
                    top -= ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                    bottom += ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                }
                int i3 = -i;
                if (top <= i3 && bottom >= i3) {
                    return i2;
                }
            }
            return -1;
        }

        private void AudioAttributesCompatParcelizer(CoordinatorLayout coordinatorLayout, T t) {
            int iMediaBrowserCompatCustomActionResultReceiver = t.MediaBrowserCompatCustomActionResultReceiver() + t.getPaddingTop();
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer() - iMediaBrowserCompatCustomActionResultReceiver;
            int iIconCompatParcelizer = IconCompatParcelizer(t, iRemoteActionCompatParcelizer);
            if (iIconCompatParcelizer >= 0) {
                View childAt = t.getChildAt(iIconCompatParcelizer);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int iIconCompatParcelizer2 = layoutParams.IconCompatParcelizer();
                if ((iIconCompatParcelizer2 & 17) == 17) {
                    int iMediaBrowserCompatCustomActionResultReceiver2 = -childAt.getTop();
                    int iRatingCompat = -childAt.getBottom();
                    if (iIconCompatParcelizer == 0 && InvalidTypeIdException.MediaBrowserCompatCustomActionResultReceiver(t) && InvalidTypeIdException.MediaBrowserCompatCustomActionResultReceiver(childAt)) {
                        iMediaBrowserCompatCustomActionResultReceiver2 -= t.MediaBrowserCompatCustomActionResultReceiver();
                    }
                    if (write(iIconCompatParcelizer2, 2)) {
                        iRatingCompat += InvalidTypeIdException.RatingCompat(childAt);
                    } else if (write(iIconCompatParcelizer2, 5)) {
                        int iRatingCompat2 = InvalidTypeIdException.RatingCompat(childAt) + iRatingCompat;
                        if (iRemoteActionCompatParcelizer < iRatingCompat2) {
                            iMediaBrowserCompatCustomActionResultReceiver2 = iRatingCompat2;
                        } else {
                            iRatingCompat = iRatingCompat2;
                        }
                    }
                    if (write(iIconCompatParcelizer2, 32)) {
                        iMediaBrowserCompatCustomActionResultReceiver2 += ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        iRatingCompat -= ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    }
                    AudioAttributesCompatParcelizer(coordinatorLayout, t, StdKeyDeserializer.read(write(iRemoteActionCompatParcelizer, iRatingCompat, iMediaBrowserCompatCustomActionResultReceiver2) + iMediaBrowserCompatCustomActionResultReceiver, -t.AudioAttributesImplApi21Parcelizer(), 0));
                }
            }
        }

        private static int write(int i, int i2, int i3) {
            return i < (i2 + i3) / 2 ? i2 : i3;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public boolean write(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3, int i4) {
            if (((ViewGroup.LayoutParams) ((CoordinatorLayout.RemoteActionCompatParcelizer) t.getLayoutParams())).height == -2) {
                coordinatorLayout.write(t, i, i2, View.MeasureSpec.makeMeasureSpec(0, 0), i4);
                return true;
            }
            return super.write(coordinatorLayout, t, i, i2, i3, i4);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public boolean write(CoordinatorLayout coordinatorLayout, T t, int i) {
            int iRound;
            boolean zWrite = super.write(coordinatorLayout, t, i);
            int iRemoteActionCompatParcelizer = t.RemoteActionCompatParcelizer();
            SavedState savedState = this.MediaBrowserCompatItemReceiver;
            if (savedState == null || (iRemoteActionCompatParcelizer & 8) != 0) {
                if (iRemoteActionCompatParcelizer != 0) {
                    boolean z = (iRemoteActionCompatParcelizer & 4) != 0;
                    if ((iRemoteActionCompatParcelizer & 2) != 0) {
                        int i2 = -t.MediaBrowserCompatItemReceiver();
                        if (z) {
                            AudioAttributesCompatParcelizer(coordinatorLayout, t, i2);
                        } else {
                            IconCompatParcelizer(coordinatorLayout, t, i2);
                        }
                    } else if ((iRemoteActionCompatParcelizer & 1) != 0) {
                        if (z) {
                            AudioAttributesCompatParcelizer(coordinatorLayout, t, 0);
                        } else {
                            IconCompatParcelizer(coordinatorLayout, t, 0);
                        }
                    }
                }
            } else if (savedState.MediaBrowserCompatItemReceiver) {
                IconCompatParcelizer(coordinatorLayout, t, -t.AudioAttributesImplApi21Parcelizer());
            } else if (this.MediaBrowserCompatItemReceiver.IconCompatParcelizer) {
                IconCompatParcelizer(coordinatorLayout, t, 0);
            } else {
                View childAt = t.getChildAt(this.MediaBrowserCompatItemReceiver.read);
                int i3 = -childAt.getBottom();
                if (this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer) {
                    iRound = InvalidTypeIdException.RatingCompat(childAt) + t.MediaBrowserCompatCustomActionResultReceiver();
                } else {
                    iRound = Math.round(childAt.getHeight() * this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer);
                }
                IconCompatParcelizer(coordinatorLayout, t, i3 + iRound);
            }
            t.MediaDescriptionCompat();
            this.MediaBrowserCompatItemReceiver = null;
            RemoteActionCompatParcelizer(StdKeyDeserializer.read(read(), -t.AudioAttributesImplApi21Parcelizer(), 0));
            write(coordinatorLayout, (AppBarLayout) t, read(), 0, true);
            t.IconCompatParcelizer(read());
            write(coordinatorLayout, (AppBarLayout) t);
            return zWrite;
        }

        private void write(CoordinatorLayout coordinatorLayout, T t) {
            View viewRemoteActionCompatParcelizer;
            InvalidTypeIdException.RemoteActionCompatParcelizer((View) coordinatorLayout, hasSuperClassStartingWith.read.onRemoveQueueItemAt.RemoteActionCompatParcelizer());
            InvalidTypeIdException.RemoteActionCompatParcelizer((View) coordinatorLayout, hasSuperClassStartingWith.read.onPrepareFromSearch.RemoteActionCompatParcelizer());
            if (t.AudioAttributesImplApi21Parcelizer() == 0 || (viewRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(coordinatorLayout)) == null || !RemoteActionCompatParcelizer((AppBarLayout) t)) {
                return;
            }
            if (!InvalidTypeIdException.onPrepareFromSearch(coordinatorLayout)) {
                InvalidTypeIdException.AudioAttributesCompatParcelizer(coordinatorLayout, new deserializeUsingCustom() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.2
                    @Override // kotlin.deserializeUsingCustom
                    public final void onInitializeAccessibilityNodeInfo(View view, hasSuperClassStartingWith hassuperclassstartingwith) {
                        super.onInitializeAccessibilityNodeInfo(view, hassuperclassstartingwith);
                        hassuperclassstartingwith.handleMediaPlayPauseIfPendingOnHandler(BaseBehavior.this.read);
                        hassuperclassstartingwith.AudioAttributesCompatParcelizer((CharSequence) ScrollView.class.getName());
                    }
                });
            }
            this.read = RemoteActionCompatParcelizer(coordinatorLayout, t, viewRemoteActionCompatParcelizer);
        }

        private static View RemoteActionCompatParcelizer(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (((CoordinatorLayout.RemoteActionCompatParcelizer) childAt.getLayoutParams()).write() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        private static boolean RemoteActionCompatParcelizer(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (((LayoutParams) appBarLayout.getChildAt(i).getLayoutParams()).read != 0) {
                    return true;
                }
            }
            return false;
        }

        private boolean RemoteActionCompatParcelizer(final CoordinatorLayout coordinatorLayout, final T t, final View view) {
            boolean z = false;
            if (RemoteActionCompatParcelizer() != (-t.AudioAttributesImplApi21Parcelizer())) {
                RemoteActionCompatParcelizer(coordinatorLayout, t, hasSuperClassStartingWith.read.onRemoveQueueItemAt, false);
                z = true;
            }
            if (RemoteActionCompatParcelizer() != 0) {
                if (view.canScrollVertically(-1)) {
                    final int i = -t.IconCompatParcelizer();
                    if (i != 0) {
                        InvalidTypeIdException.IconCompatParcelizer(coordinatorLayout, hasSuperClassStartingWith.read.onPrepareFromSearch, null, new modifyFieldName() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.3
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference fix 'apply assigned field type' failed
                            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
                            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
                            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                             */
                            @Override // kotlin.modifyFieldName
                            public final boolean read(View view2) {
                                BaseBehavior.this.read(coordinatorLayout, t, view, 0, i, new int[]{0, 0}, 1);
                                return true;
                            }
                        });
                        return true;
                    }
                } else {
                    RemoteActionCompatParcelizer(coordinatorLayout, t, hasSuperClassStartingWith.read.onPrepareFromSearch, true);
                    return true;
                }
            }
            return z;
        }

        private void RemoteActionCompatParcelizer(CoordinatorLayout coordinatorLayout, final T t, hasSuperClassStartingWith.read readVar, final boolean z) {
            InvalidTypeIdException.IconCompatParcelizer(coordinatorLayout, readVar, null, new modifyFieldName() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.5
                @Override // kotlin.modifyFieldName
                public final boolean read(View view) {
                    t.setExpanded(z);
                    return true;
                }
            });
        }

        private boolean write() {
            WeakReference<View> weakReference = this.write;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public void AudioAttributesCompatParcelizer(CoordinatorLayout coordinatorLayout, T t) {
            AudioAttributesCompatParcelizer(coordinatorLayout, (AppBarLayout) t);
            if (t.MediaBrowserCompatMediaItem()) {
                t.IconCompatParcelizer(t.IconCompatParcelizer(IconCompatParcelizer(coordinatorLayout)));
            }
        }

        private static int IconCompatParcelizer(T t) {
            return (-t.AudioAttributesCompatParcelizer()) + t.MediaBrowserCompatCustomActionResultReceiver();
        }

        private static int write(T t) {
            return t.AudioAttributesImplApi21Parcelizer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.android.material.appbar.HeaderBehavior
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public int read(CoordinatorLayout coordinatorLayout, T t, int i, int i2, int i3) {
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            int i4 = 0;
            if (i2 != 0 && iRemoteActionCompatParcelizer >= i2 && iRemoteActionCompatParcelizer <= i3) {
                int i5 = StdKeyDeserializer.read(i, i2, i3);
                if (iRemoteActionCompatParcelizer != i5) {
                    int iWrite = t.AudioAttributesImplApi26Parcelizer() ? write(t, i5) : i5;
                    boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(iWrite);
                    this.MediaBrowserCompatCustomActionResultReceiver = i5 - iWrite;
                    if (zRemoteActionCompatParcelizer) {
                        for (int i6 = 0; i6 < t.getChildCount(); i6++) {
                            LayoutParams layoutParams = (LayoutParams) t.getChildAt(i6).getLayoutParams();
                            IconCompatParcelizer iconCompatParcelizerRemoteActionCompatParcelizer = layoutParams.RemoteActionCompatParcelizer();
                            if (iconCompatParcelizerRemoteActionCompatParcelizer != null && (layoutParams.IconCompatParcelizer() & 1) != 0) {
                                iconCompatParcelizerRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(t, t.getChildAt(i6), read());
                            }
                        }
                    }
                    if (!zRemoteActionCompatParcelizer && t.AudioAttributesImplApi26Parcelizer()) {
                        coordinatorLayout.read(t);
                    }
                    t.IconCompatParcelizer(read());
                    write(coordinatorLayout, (AppBarLayout) t, i5, i5 < iRemoteActionCompatParcelizer ? -1 : 1, false);
                    i4 = iRemoteActionCompatParcelizer - i5;
                }
            } else {
                this.MediaBrowserCompatCustomActionResultReceiver = 0;
            }
            write(coordinatorLayout, (AppBarLayout) t);
            return i4;
        }

        private static int write(T t, int i) {
            int iAbs = Math.abs(i);
            int childCount = t.getChildCount();
            int iMediaBrowserCompatCustomActionResultReceiver = 0;
            int i2 = 0;
            while (true) {
                if (i2 >= childCount) {
                    break;
                }
                View childAt = t.getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Interpolator interpolatorWrite = layoutParams.write();
                if (iAbs < childAt.getTop() || iAbs > childAt.getBottom()) {
                    i2++;
                } else if (interpolatorWrite != null) {
                    int iIconCompatParcelizer = layoutParams.IconCompatParcelizer();
                    if ((iIconCompatParcelizer & 1) != 0) {
                        iMediaBrowserCompatCustomActionResultReceiver = childAt.getHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                        if ((iIconCompatParcelizer & 2) != 0) {
                            iMediaBrowserCompatCustomActionResultReceiver -= InvalidTypeIdException.RatingCompat(childAt);
                        }
                    }
                    if (InvalidTypeIdException.MediaBrowserCompatCustomActionResultReceiver(childAt)) {
                        iMediaBrowserCompatCustomActionResultReceiver -= t.MediaBrowserCompatCustomActionResultReceiver();
                    }
                    if (iMediaBrowserCompatCustomActionResultReceiver > 0) {
                        float f = iMediaBrowserCompatCustomActionResultReceiver;
                        return Integer.signum(i) * (childAt.getTop() + Math.round(f * interpolatorWrite.getInterpolation((iAbs - childAt.getTop()) / f)));
                    }
                }
            }
            return i;
        }

        private static void write(CoordinatorLayout coordinatorLayout, T t, int i, int i2, boolean z) {
            View view = read(t, i);
            boolean zIconCompatParcelizer = false;
            if (view != null) {
                int iIconCompatParcelizer = ((LayoutParams) view.getLayoutParams()).IconCompatParcelizer();
                if ((iIconCompatParcelizer & 1) != 0) {
                    int iRatingCompat = InvalidTypeIdException.RatingCompat(view);
                    if (i2 <= 0 || (iIconCompatParcelizer & 12) == 0 ? !((iIconCompatParcelizer & 2) == 0 || (-i) < (view.getBottom() - iRatingCompat) - t.MediaBrowserCompatCustomActionResultReceiver()) : (-i) >= (view.getBottom() - iRatingCompat) - t.MediaBrowserCompatCustomActionResultReceiver()) {
                        zIconCompatParcelizer = true;
                    }
                }
            }
            if (t.MediaBrowserCompatMediaItem()) {
                zIconCompatParcelizer = t.IconCompatParcelizer(IconCompatParcelizer(coordinatorLayout));
            }
            boolean zIconCompatParcelizer2 = t.IconCompatParcelizer(zIconCompatParcelizer);
            if (z || (zIconCompatParcelizer2 && IconCompatParcelizer(coordinatorLayout, (AppBarLayout) t))) {
                if (t.getBackground() != null) {
                    t.getBackground().jumpToCurrentState();
                }
                if (t.getForeground() != null) {
                    t.getForeground().jumpToCurrentState();
                }
                if (t.getStateListAnimator() != null) {
                    t.getStateListAnimator().jumpToCurrentState();
                }
            }
        }

        private static boolean IconCompatParcelizer(CoordinatorLayout coordinatorLayout, T t) {
            List<View> listIconCompatParcelizer = coordinatorLayout.IconCompatParcelizer(t);
            int size = listIconCompatParcelizer.size();
            for (int i = 0; i < size; i++) {
                CoordinatorLayout.Behavior behaviorWrite = ((CoordinatorLayout.RemoteActionCompatParcelizer) listIconCompatParcelizer.get(i).getLayoutParams()).write();
                if (behaviorWrite instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) behaviorWrite).RemoteActionCompatParcelizer() != 0;
                }
            }
            return false;
        }

        private static View read(AppBarLayout appBarLayout, int i) {
            int iAbs = Math.abs(i);
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = appBarLayout.getChildAt(i2);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        private static View IconCompatParcelizer(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if ((childAt instanceof _deserializeNR) || (childAt instanceof AbsListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        @Override // com.google.android.material.appbar.HeaderBehavior
        final int RemoteActionCompatParcelizer() {
            return read() + this.MediaBrowserCompatCustomActionResultReceiver;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Parcelable read(CoordinatorLayout coordinatorLayout, T t) {
            Parcelable parcelable = super.read(coordinatorLayout, t);
            SavedState savedStateWrite = write(parcelable, t);
            return savedStateWrite == null ? parcelable : savedStateWrite;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public void AudioAttributesCompatParcelizer(CoordinatorLayout coordinatorLayout, T t, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                read((SavedState) parcelable, true);
                super.AudioAttributesCompatParcelizer(coordinatorLayout, t, this.MediaBrowserCompatItemReceiver.read());
            } else {
                super.AudioAttributesCompatParcelizer(coordinatorLayout, t, parcelable);
                this.MediaBrowserCompatItemReceiver = null;
            }
        }

        final SavedState write(Parcelable parcelable, T t) {
            int i = read();
            int childCount = t.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t.getChildAt(i2);
                int bottom = childAt.getBottom() + i;
                if (childAt.getTop() + i <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.write;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    savedState.IconCompatParcelizer = i == 0;
                    savedState.MediaBrowserCompatItemReceiver = !savedState.IconCompatParcelizer && (-i) >= t.AudioAttributesImplApi21Parcelizer();
                    savedState.read = i2;
                    savedState.AudioAttributesCompatParcelizer = bottom == InvalidTypeIdException.RatingCompat(childAt) + t.MediaBrowserCompatCustomActionResultReceiver();
                    savedState.RemoteActionCompatParcelizer = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        final void read(SavedState savedState, boolean z) {
            if (this.MediaBrowserCompatItemReceiver == null || z) {
                this.MediaBrowserCompatItemReceiver = savedState;
            }
        }

        protected static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState.5
                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                    return RemoteActionCompatParcelizer(parcel);
                }

                @Override // android.os.Parcelable.ClassLoaderCreator
                public final /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                    return AudioAttributesCompatParcelizer(parcel, classLoader);
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ Object[] newArray(int i) {
                    return write(i);
                }

                private static SavedState AudioAttributesCompatParcelizer(Parcel parcel, ClassLoader classLoader) {
                    return new SavedState(parcel, classLoader);
                }

                private static SavedState RemoteActionCompatParcelizer(Parcel parcel) {
                    return new SavedState(parcel, null);
                }

                private static SavedState[] write(int i) {
                    return new SavedState[i];
                }
            };
            boolean AudioAttributesCompatParcelizer;
            boolean IconCompatParcelizer;
            boolean MediaBrowserCompatItemReceiver;
            float RemoteActionCompatParcelizer;
            int read;

            public SavedState(Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.MediaBrowserCompatItemReceiver = parcel.readByte() != 0;
                this.IconCompatParcelizer = parcel.readByte() != 0;
                this.read = parcel.readInt();
                this.RemoteActionCompatParcelizer = parcel.readFloat();
                this.AudioAttributesCompatParcelizer = parcel.readByte() != 0;
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                super.writeToParcel(parcel, i);
                parcel.writeByte(this.MediaBrowserCompatItemReceiver ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.IconCompatParcelizer ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.read);
                parcel.writeFloat(this.RemoteActionCompatParcelizer);
                parcel.writeByte(this.AudioAttributesCompatParcelizer ? (byte) 1 : (byte) 0);
            }
        }
    }

    public static class ScrollingViewBehavior extends HeaderScrollingViewBehavior {
        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        final /* synthetic */ View IconCompatParcelizer(List list) {
            return read((List<View>) list);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public final /* bridge */ /* synthetic */ boolean RemoteActionCompatParcelizer(int i) {
            return super.RemoteActionCompatParcelizer(i);
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior
        public final /* bridge */ /* synthetic */ int read() {
            return super.read();
        }

        @Override // com.google.android.material.appbar.ViewOffsetBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final /* bridge */ /* synthetic */ boolean write(CoordinatorLayout coordinatorLayout, View view, int i) {
            return super.write(coordinatorLayout, view, i);
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final /* bridge */ /* synthetic */ boolean write(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
            return super.write(coordinatorLayout, view, i, i2, i3, i4);
        }

        public ScrollingViewBehavior() {
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.ScrollingViewBehavior_Layout);
            IconCompatParcelizer(typedArrayObtainStyledAttributes.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.ScrollingViewBehavior_Layout_behavior_overlapTop, 0));
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean write(View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean IconCompatParcelizer(CoordinatorLayout coordinatorLayout, View view, View view2) {
            read(view, view2);
            IconCompatParcelizer(view, view2);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final void IconCompatParcelizer(CoordinatorLayout coordinatorLayout, View view) {
            if (view instanceof AppBarLayout) {
                InvalidTypeIdException.RemoteActionCompatParcelizer((View) coordinatorLayout, hasSuperClassStartingWith.read.onRemoveQueueItemAt.RemoteActionCompatParcelizer());
                InvalidTypeIdException.RemoteActionCompatParcelizer((View) coordinatorLayout, hasSuperClassStartingWith.read.onPrepareFromSearch.RemoteActionCompatParcelizer());
                InvalidTypeIdException.AudioAttributesCompatParcelizer(coordinatorLayout, (deserializeUsingCustom) null);
            }
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean IconCompatParcelizer(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z) {
            AppBarLayout appBarLayout = read(coordinatorLayout.RemoteActionCompatParcelizer(view));
            if (appBarLayout != null) {
                Rect rect2 = new Rect(rect);
                rect2.offset(view.getLeft(), view.getTop());
                Rect rect3 = ((HeaderScrollingViewBehavior) this).read;
                rect3.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect3.contains(rect2)) {
                    appBarLayout.setExpanded(false, !z);
                    return true;
                }
            }
            return false;
        }

        private void read(View view, View view2) {
            CoordinatorLayout.Behavior behaviorWrite = ((CoordinatorLayout.RemoteActionCompatParcelizer) view2.getLayoutParams()).write();
            if (behaviorWrite instanceof BaseBehavior) {
                int bottom = view2.getBottom();
                int top = view.getTop();
                int i = ((BaseBehavior) behaviorWrite).MediaBrowserCompatCustomActionResultReceiver;
                InvalidTypeIdException.IconCompatParcelizer(view, (((bottom - top) + i) + AudioAttributesCompatParcelizer()) - AudioAttributesCompatParcelizer(view2));
            }
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        final float RemoteActionCompatParcelizer(View view) {
            int i;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int iAudioAttributesImplApi21Parcelizer = appBarLayout.AudioAttributesImplApi21Parcelizer();
                int iIconCompatParcelizer = appBarLayout.IconCompatParcelizer();
                int i2 = read(appBarLayout);
                if ((iIconCompatParcelizer == 0 || iAudioAttributesImplApi21Parcelizer + i2 > iIconCompatParcelizer) && (i = iAudioAttributesImplApi21Parcelizer - iIconCompatParcelizer) != 0) {
                    return (i2 / i) + 1.0f;
                }
            }
            return BitmapDescriptorFactory.HUE_RED;
        }

        private static int read(AppBarLayout appBarLayout) {
            CoordinatorLayout.Behavior behaviorWrite = ((CoordinatorLayout.RemoteActionCompatParcelizer) appBarLayout.getLayoutParams()).write();
            if (behaviorWrite instanceof BaseBehavior) {
                return ((BaseBehavior) behaviorWrite).RemoteActionCompatParcelizer();
            }
            return 0;
        }

        private static AppBarLayout read(List<View> list) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                View view = list.get(i);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        final int IconCompatParcelizer(View view) {
            if (view instanceof AppBarLayout) {
                return ((AppBarLayout) view).AudioAttributesImplApi21Parcelizer();
            }
            return super.IconCompatParcelizer(view);
        }

        private static void IconCompatParcelizer(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.MediaBrowserCompatMediaItem()) {
                    appBarLayout.IconCompatParcelizer(appBarLayout.IconCompatParcelizer(view));
                }
            }
        }
    }

    public static class RemoteActionCompatParcelizer extends IconCompatParcelizer {
        private final Rect write = new Rect();
        private final Rect IconCompatParcelizer = new Rect();

        private static void RemoteActionCompatParcelizer(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.MediaBrowserCompatCustomActionResultReceiver());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.IconCompatParcelizer
        public final void RemoteActionCompatParcelizer(AppBarLayout appBarLayout, View view, float f) {
            RemoteActionCompatParcelizer(this.write, appBarLayout, view);
            float fAbs = this.write.top - Math.abs(f);
            if (fAbs <= BitmapDescriptorFactory.HUE_RED) {
                float fWrite = 1.0f - StdKeyDeserializer.write(Math.abs(fAbs / this.write.height()), BitmapDescriptorFactory.HUE_RED, 1.0f);
                float fHeight = (-fAbs) - ((this.write.height() * 0.3f) * (1.0f - (fWrite * fWrite)));
                view.setTranslationY(fHeight);
                view.getDrawingRect(this.IconCompatParcelizer);
                this.IconCompatParcelizer.offset(0, (int) (-fHeight));
                InvalidTypeIdException.IconCompatParcelizer(view, this.IconCompatParcelizer);
                return;
            }
            InvalidTypeIdException.IconCompatParcelizer(view, (Rect) null);
            view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        }
    }
}
