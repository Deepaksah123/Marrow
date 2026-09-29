package com.google.android.material.navigation;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.BinarySearchSeekerSeekOperationParams;
import kotlin.BinarySearchSeekerTimestampSeeker;
import kotlin.InvalidTypeIdException;
import kotlin.SeekMap;
import kotlin._addSuperTypes;
import kotlin._isNaN;
import kotlin.calculateNextSearchBytePosition;
import kotlin.childObject;
import kotlin.findFormatOverrides;
import kotlin.getSampleRateLookupKey;
import kotlin.hasSuperClassStartingWith;
import kotlin.onRetainNonConfigurationInstance;
import kotlin.onSeekFinished;
import kotlin.outputPendingSampleMetadata;
import kotlin.registerForActivityResult;
import kotlin.setItemInvoker;

/* JADX INFO: loaded from: classes5.dex */
public abstract class NavigationBarItemView extends FrameLayout implements registerForActivityResult.AudioAttributesCompatParcelizer {
    private static final write IconCompatParcelizer;
    private static final int[] RemoteActionCompatParcelizer = {R.attr.state_checked};
    private static final write read;
    private int AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private boolean AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private float MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    private write MediaBrowserCompatMediaItem;
    private int MediaBrowserCompatSearchResultReceiver;
    private boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private boolean MediaDescriptionCompat;
    private final View MediaMetadataCompat;
    private BinarySearchSeekerTimestampSeeker RatingCompat;
    private final ImageView handleMediaPlayPauseIfPendingOnHandler;
    private final FrameLayout onAddQueueItem;
    private boolean onCommand;
    private ColorStateList onCustomAction;
    private onRetainNonConfigurationInstance onFastForward;
    private int onMediaButtonEvent;
    private int onPause;
    private Drawable onPlay;
    private int onPlayFromMediaId;
    private final ViewGroup onPlayFromSearch;
    private int onPlayFromUri;
    private final TextView onPrepare;
    private ColorStateList onPrepareFromMediaId;
    private Drawable onPrepareFromSearch;
    private Drawable onPrepareFromUri;
    private final TextView onRemoveQueueItem;
    private float onRemoveQueueItemAt;
    private float onRewind;
    private float onSeekTo;
    private ValueAnimator write;

    protected abstract int AudioAttributesCompatParcelizer();

    public void setShortcut(boolean z, char c) {
    }

    @Override // o.registerForActivityResult.AudioAttributesCompatParcelizer
    public final boolean write() {
        return false;
    }

    static {
        byte b = 0;
        read = new write(b);
        IconCompatParcelizer = new read(b);
    }

    public NavigationBarItemView(Context context) {
        super(context);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = false;
        this.onMediaButtonEvent = -1;
        this.MediaBrowserCompatSearchResultReceiver = 0;
        this.MediaBrowserCompatMediaItem = read;
        this.MediaBrowserCompatCustomActionResultReceiver = BitmapDescriptorFactory.HUE_RED;
        this.AudioAttributesImplApi26Parcelizer = false;
        this.MediaBrowserCompatItemReceiver = 0;
        this.AudioAttributesCompatParcelizer = 0;
        this.MediaDescriptionCompat = false;
        this.AudioAttributesImplBaseParcelizer = 0;
        LayoutInflater.from(context).inflate(AudioAttributesCompatParcelizer(), (ViewGroup) this, true);
        this.onAddQueueItem = (FrameLayout) findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.navigation_bar_item_icon_container);
        this.MediaMetadataCompat = findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.navigation_bar_item_active_indicator_view);
        ImageView imageView = (ImageView) findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.navigation_bar_item_icon_view);
        this.handleMediaPlayPauseIfPendingOnHandler = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.navigation_bar_item_labels_group);
        this.onPlayFromSearch = viewGroup;
        TextView textView = (TextView) findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.navigation_bar_item_small_label_view);
        this.onRemoveQueueItem = textView;
        TextView textView2 = (TextView) findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.navigation_bar_item_large_label_view);
        this.onPrepare = textView2;
        setBackgroundResource(onCommand());
        this.onPause = getResources().getDimensionPixelSize(read());
        this.onPlayFromMediaId = viewGroup.getPaddingBottom();
        this.AudioAttributesImplApi21Parcelizer = getResources().getDimensionPixelSize(calculateNextSearchBytePosition.write.m3_navigation_item_active_indicator_label_padding);
        InvalidTypeIdException.AudioAttributesImplBaseParcelizer(textView, 2);
        InvalidTypeIdException.AudioAttributesImplBaseParcelizer(textView2, 2);
        setFocusable(true);
        IconCompatParcelizer(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.google.android.material.navigation.NavigationBarItemView.4
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                    if (NavigationBarItemView.this.handleMediaPlayPauseIfPendingOnHandler.getVisibility() == 0) {
                        NavigationBarItemView navigationBarItemView = NavigationBarItemView.this;
                        navigationBarItemView.RemoteActionCompatParcelizer(navigationBarItemView.handleMediaPlayPauseIfPendingOnHandler);
                    }
                }
            });
        }
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.onPlayFromSearch.getLayoutParams();
        int i = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
        int measuredWidth = this.onPlayFromSearch.getMeasuredWidth();
        return Math.max(MediaBrowserCompatItemReceiver(), i + measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.onPlayFromSearch.getLayoutParams();
        return AudioAttributesImplApi21Parcelizer() + (this.onPlayFromSearch.getVisibility() == 0 ? this.AudioAttributesImplApi21Parcelizer : 0) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + this.onPlayFromSearch.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
    }

    @Override // o.registerForActivityResult.AudioAttributesCompatParcelizer
    public final void AudioAttributesCompatParcelizer(onRetainNonConfigurationInstance onretainnonconfigurationinstance) {
        CharSequence title;
        this.onFastForward = onretainnonconfigurationinstance;
        setCheckable(onretainnonconfigurationinstance.isCheckable());
        setChecked(onretainnonconfigurationinstance.isChecked());
        setEnabled(onretainnonconfigurationinstance.isEnabled());
        setIcon(onretainnonconfigurationinstance.getIcon());
        setTitle(onretainnonconfigurationinstance.getTitle());
        setId(onretainnonconfigurationinstance.getItemId());
        if (!TextUtils.isEmpty(onretainnonconfigurationinstance.getContentDescription())) {
            setContentDescription(onretainnonconfigurationinstance.getContentDescription());
        }
        if (!TextUtils.isEmpty(onretainnonconfigurationinstance.getTooltipText())) {
            title = onretainnonconfigurationinstance.getTooltipText();
        } else {
            title = onretainnonconfigurationinstance.getTitle();
        }
        setItemInvoker.AudioAttributesCompatParcelizer(this, title);
        setVisibility(onretainnonconfigurationinstance.isVisible() ? 0 : 8);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = true;
    }

    final void RemoteActionCompatParcelizer() {
        handleMediaPlayPauseIfPendingOnHandler();
        this.onFastForward = null;
        this.MediaBrowserCompatCustomActionResultReceiver = BitmapDescriptorFactory.HUE_RED;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = false;
    }

    private View AudioAttributesImplApi26Parcelizer() {
        FrameLayout frameLayout = this.onAddQueueItem;
        return frameLayout != null ? frameLayout : this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public void setItemPosition(int i) {
        this.onMediaButtonEvent = i;
    }

    public void setShifting(boolean z) {
        if (this.onCommand != z) {
            this.onCommand = z;
            MediaBrowserCompatSearchResultReceiver();
        }
    }

    public void setLabelVisibilityMode(int i) {
        if (this.onPlayFromUri != i) {
            this.onPlayFromUri = i;
            MediaMetadataCompat();
            RemoteActionCompatParcelizer(getWidth());
            MediaBrowserCompatSearchResultReceiver();
        }
    }

    @Override // o.registerForActivityResult.AudioAttributesCompatParcelizer
    public final onRetainNonConfigurationInstance IconCompatParcelizer() {
        return this.onFastForward;
    }

    public void setTitle(CharSequence charSequence) {
        this.onRemoveQueueItem.setText(charSequence);
        this.onPrepare.setText(charSequence);
        onRetainNonConfigurationInstance onretainnonconfigurationinstance = this.onFastForward;
        if (onretainnonconfigurationinstance == null || TextUtils.isEmpty(onretainnonconfigurationinstance.getContentDescription())) {
            setContentDescription(charSequence);
        }
        onRetainNonConfigurationInstance onretainnonconfigurationinstance2 = this.onFastForward;
        if (onretainnonconfigurationinstance2 != null && !TextUtils.isEmpty(onretainnonconfigurationinstance2.getTooltipText())) {
            charSequence = this.onFastForward.getTooltipText();
        }
        setItemInvoker.AudioAttributesCompatParcelizer(this, charSequence);
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    @Override // android.view.View
    protected void onSizeChanged(final int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        post(new Runnable() { // from class: com.google.android.material.navigation.NavigationBarItemView.5
            @Override // java.lang.Runnable
            public final void run() {
                NavigationBarItemView.this.RemoteActionCompatParcelizer(i);
            }
        });
    }

    private void MediaMetadataCompat() {
        if (RatingCompat()) {
            this.MediaBrowserCompatMediaItem = IconCompatParcelizer;
        } else {
            this.MediaBrowserCompatMediaItem = read;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void write(float f, float f2) {
        View view = this.MediaMetadataCompat;
        if (view != null) {
            this.MediaBrowserCompatMediaItem.write(f, f2, view);
        }
        this.MediaBrowserCompatCustomActionResultReceiver = f;
    }

    private void IconCompatParcelizer(final float f) {
        if (!this.AudioAttributesImplApi26Parcelizer || !this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver || !InvalidTypeIdException.onPlayFromSearch(this)) {
            write(f, f);
            return;
        }
        ValueAnimator valueAnimator = this.write;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.write = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.MediaBrowserCompatCustomActionResultReceiver, f);
        this.write = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.navigation.NavigationBarItemView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                NavigationBarItemView.this.write(((Float) valueAnimator2.getAnimatedValue()).floatValue(), f);
            }
        });
        this.write.setInterpolator(getSampleRateLookupKey.read(getContext(), calculateNextSearchBytePosition.IconCompatParcelizer.motionEasingEmphasizedInterpolator, BinarySearchSeekerSeekOperationParams.AudioAttributesCompatParcelizer));
        this.write.setDuration(getSampleRateLookupKey.write(getContext(), calculateNextSearchBytePosition.IconCompatParcelizer.motionDurationLong2, getResources().getInteger(calculateNextSearchBytePosition.AudioAttributesImplApi21Parcelizer.material_motion_duration_long_1)));
        this.write.start();
    }

    private void MediaBrowserCompatSearchResultReceiver() {
        onRetainNonConfigurationInstance onretainnonconfigurationinstance = this.onFastForward;
        if (onretainnonconfigurationinstance != null) {
            setChecked(onretainnonconfigurationinstance.isChecked());
        }
    }

    public void setChecked(boolean z) {
        this.onPrepare.setPivotX(r0.getWidth() / 2);
        this.onPrepare.setPivotY(r0.getBaseline());
        this.onRemoveQueueItem.setPivotX(r0.getWidth() / 2);
        this.onRemoveQueueItem.setPivotY(r0.getBaseline());
        IconCompatParcelizer(z ? 1.0f : BitmapDescriptorFactory.HUE_RED);
        int i = this.onPlayFromUri;
        if (i != -1) {
            if (i == 0) {
                if (z) {
                    RemoteActionCompatParcelizer(AudioAttributesImplApi26Parcelizer(), this.onPause, 49);
                    RemoteActionCompatParcelizer(this.onPlayFromSearch, this.onPlayFromMediaId);
                    this.onPrepare.setVisibility(0);
                } else {
                    RemoteActionCompatParcelizer(AudioAttributesImplApi26Parcelizer(), this.onPause, 17);
                    RemoteActionCompatParcelizer(this.onPlayFromSearch, 0);
                    this.onPrepare.setVisibility(4);
                }
                this.onRemoveQueueItem.setVisibility(4);
            } else if (i == 1) {
                RemoteActionCompatParcelizer(this.onPlayFromSearch, this.onPlayFromMediaId);
                if (z) {
                    RemoteActionCompatParcelizer(AudioAttributesImplApi26Parcelizer(), (int) (this.onPause + this.onRemoveQueueItemAt), 49);
                    write(this.onPrepare, 1.0f, 1.0f, 0);
                    TextView textView = this.onRemoveQueueItem;
                    float f = this.onRewind;
                    write(textView, f, f, 4);
                } else {
                    RemoteActionCompatParcelizer(AudioAttributesImplApi26Parcelizer(), this.onPause, 49);
                    TextView textView2 = this.onPrepare;
                    float f2 = this.onSeekTo;
                    write(textView2, f2, f2, 4);
                    write(this.onRemoveQueueItem, 1.0f, 1.0f, 0);
                }
            } else if (i == 2) {
                RemoteActionCompatParcelizer(AudioAttributesImplApi26Parcelizer(), this.onPause, 17);
                this.onPrepare.setVisibility(8);
                this.onRemoveQueueItem.setVisibility(8);
            }
        } else if (this.onCommand) {
            if (z) {
                RemoteActionCompatParcelizer(AudioAttributesImplApi26Parcelizer(), this.onPause, 49);
                RemoteActionCompatParcelizer(this.onPlayFromSearch, this.onPlayFromMediaId);
                this.onPrepare.setVisibility(0);
            } else {
                RemoteActionCompatParcelizer(AudioAttributesImplApi26Parcelizer(), this.onPause, 17);
                RemoteActionCompatParcelizer(this.onPlayFromSearch, 0);
                this.onPrepare.setVisibility(4);
            }
            this.onRemoveQueueItem.setVisibility(4);
        } else {
            RemoteActionCompatParcelizer(this.onPlayFromSearch, this.onPlayFromMediaId);
            if (z) {
                RemoteActionCompatParcelizer(AudioAttributesImplApi26Parcelizer(), (int) (this.onPause + this.onRemoveQueueItemAt), 49);
                write(this.onPrepare, 1.0f, 1.0f, 0);
                TextView textView3 = this.onRemoveQueueItem;
                float f3 = this.onRewind;
                write(textView3, f3, f3, 4);
            } else {
                RemoteActionCompatParcelizer(AudioAttributesImplApi26Parcelizer(), this.onPause, 49);
                TextView textView4 = this.onPrepare;
                float f4 = this.onSeekTo;
                write(textView4, f4, f4, 4);
                write(this.onRemoveQueueItem, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        BinarySearchSeekerTimestampSeeker binarySearchSeekerTimestampSeeker = this.RatingCompat;
        if (binarySearchSeekerTimestampSeeker != null && binarySearchSeekerTimestampSeeker.isVisible()) {
            CharSequence title = this.onFastForward.getTitle();
            if (!TextUtils.isEmpty(this.onFastForward.getContentDescription())) {
                title = this.onFastForward.getContentDescription();
            }
            StringBuilder sb = new StringBuilder();
            sb.append((Object) title);
            sb.append(", ");
            sb.append((Object) this.RatingCompat.read());
            accessibilityNodeInfo.setContentDescription(sb.toString());
        }
        hasSuperClassStartingWith hassuperclassstartingwithWrite = hasSuperClassStartingWith.write(accessibilityNodeInfo);
        hassuperclassstartingwithWrite.AudioAttributesCompatParcelizer(hasSuperClassStartingWith.AudioAttributesImplBaseParcelizer.read(0, 1, MediaBrowserCompatCustomActionResultReceiver(), 1, false, isSelected()));
        if (isSelected()) {
            hassuperclassstartingwithWrite.AudioAttributesImplApi26Parcelizer(false);
            hassuperclassstartingwithWrite.IconCompatParcelizer(hasSuperClassStartingWith.read.write);
        }
        hassuperclassstartingwithWrite.AudioAttributesImplBaseParcelizer(getResources().getString(calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.item_view_role_description));
    }

    private int MediaBrowserCompatCustomActionResultReceiver() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i = 0;
        for (int i2 = 0; i2 < iIndexOfChild; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if ((childAt instanceof NavigationBarItemView) && childAt.getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    private static void RemoteActionCompatParcelizer(View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i;
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    private static void write(View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    private static void RemoteActionCompatParcelizer(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.onRemoveQueueItem.setEnabled(z);
        this.onPrepare.setEnabled(z);
        this.handleMediaPlayPauseIfPendingOnHandler.setEnabled(z);
        if (z) {
            InvalidTypeIdException.read(this, childObject.write(getContext(), 1002));
        } else {
            InvalidTypeIdException.read(this, (childObject) null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i + 1);
        onRetainNonConfigurationInstance onretainnonconfigurationinstance = this.onFastForward;
        if (onretainnonconfigurationinstance != null && onretainnonconfigurationinstance.isCheckable() && this.onFastForward.isChecked()) {
            mergeDrawableStates(iArrOnCreateDrawableState, RemoteActionCompatParcelizer);
        }
        return iArrOnCreateDrawableState;
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.onPrepareFromSearch) {
            return;
        }
        this.onPrepareFromSearch = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = findFormatOverrides.AudioAttributesImplApi26Parcelizer(drawable).mutate();
            this.onPrepareFromUri = drawable;
            ColorStateList colorStateList = this.onCustomAction;
            if (colorStateList != null) {
                findFormatOverrides.AudioAttributesCompatParcelizer(drawable, colorStateList);
            }
        }
        this.handleMediaPlayPauseIfPendingOnHandler.setImageDrawable(drawable);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.onCustomAction = colorStateList;
        if (this.onFastForward == null || (drawable = this.onPrepareFromUri) == null) {
            return;
        }
        findFormatOverrides.AudioAttributesCompatParcelizer(drawable, colorStateList);
        this.onPrepareFromUri.invalidateSelf();
    }

    public void setIconSize(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.handleMediaPlayPauseIfPendingOnHandler.getLayoutParams();
        ((ViewGroup.LayoutParams) layoutParams).width = i;
        ((ViewGroup.LayoutParams) layoutParams).height = i;
        this.handleMediaPlayPauseIfPendingOnHandler.setLayoutParams(layoutParams);
    }

    public void setTextAppearanceInactive(int i) {
        AudioAttributesCompatParcelizer(this.onRemoveQueueItem, i);
        IconCompatParcelizer(this.onRemoveQueueItem.getTextSize(), this.onPrepare.getTextSize());
    }

    public void setTextAppearanceActive(int i) {
        this.MediaBrowserCompatSearchResultReceiver = i;
        AudioAttributesCompatParcelizer(this.onPrepare, i);
        IconCompatParcelizer(this.onRemoveQueueItem.getTextSize(), this.onPrepare.getTextSize());
    }

    public void setTextAppearanceActiveBoldEnabled(boolean z) {
        setTextAppearanceActive(this.MediaBrowserCompatSearchResultReceiver);
        TextView textView = this.onPrepare;
        textView.setTypeface(textView.getTypeface(), z ? 1 : 0);
    }

    private static void AudioAttributesCompatParcelizer(TextView textView, int i) {
        _addSuperTypes.RemoteActionCompatParcelizer(textView, i);
        int iIconCompatParcelizer = SeekMap.IconCompatParcelizer(textView.getContext(), i);
        if (iIconCompatParcelizer != 0) {
            textView.setTextSize(0, iIconCompatParcelizer);
        }
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.onRemoveQueueItem.setTextColor(colorStateList);
            this.onPrepare.setTextColor(colorStateList);
        }
    }

    private void IconCompatParcelizer(float f, float f2) {
        this.onRemoveQueueItemAt = f - f2;
        this.onRewind = f2 / f;
        this.onSeekTo = f / f2;
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : _isNaN.getDrawable(getContext(), i));
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        this.onPlay = drawable;
        MediaDescriptionCompat();
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.onPrepareFromMediaId = colorStateList;
        MediaDescriptionCompat();
    }

    private void MediaDescriptionCompat() {
        Drawable drawableAudioAttributesCompatParcelizer = this.onPlay;
        RippleDrawable rippleDrawable = null;
        boolean z = true;
        if (this.onPrepareFromMediaId != null) {
            Drawable drawableMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
            if (this.AudioAttributesImplApi26Parcelizer && MediaBrowserCompatMediaItem() != null && this.onAddQueueItem != null && drawableMediaBrowserCompatMediaItem != null) {
                z = false;
                rippleDrawable = new RippleDrawable(outputPendingSampleMetadata.RemoteActionCompatParcelizer(this.onPrepareFromMediaId), null, drawableMediaBrowserCompatMediaItem);
            } else if (drawableAudioAttributesCompatParcelizer == null) {
                drawableAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(this.onPrepareFromMediaId);
            }
        }
        FrameLayout frameLayout = this.onAddQueueItem;
        if (frameLayout != null) {
            frameLayout.setPadding(0, 0, 0, 0);
            this.onAddQueueItem.setForeground(rippleDrawable);
        }
        InvalidTypeIdException.read(this, drawableAudioAttributesCompatParcelizer);
        setDefaultFocusHighlightEnabled(z);
    }

    private static Drawable AudioAttributesCompatParcelizer(ColorStateList colorStateList) {
        return new RippleDrawable(outputPendingSampleMetadata.read(colorStateList), null, null);
    }

    public void setItemPaddingTop(int i) {
        if (this.onPause != i) {
            this.onPause = i;
            MediaBrowserCompatSearchResultReceiver();
        }
    }

    public void setItemPaddingBottom(int i) {
        if (this.onPlayFromMediaId != i) {
            this.onPlayFromMediaId = i;
            MediaBrowserCompatSearchResultReceiver();
        }
    }

    public void setActiveIndicatorLabelPadding(int i) {
        if (this.AudioAttributesImplApi21Parcelizer != i) {
            this.AudioAttributesImplApi21Parcelizer = i;
            MediaBrowserCompatSearchResultReceiver();
        }
    }

    public void setActiveIndicatorEnabled(boolean z) {
        this.AudioAttributesImplApi26Parcelizer = z;
        MediaDescriptionCompat();
        View view = this.MediaMetadataCompat;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorWidth(int i) {
        this.MediaBrowserCompatItemReceiver = i;
        RemoteActionCompatParcelizer(getWidth());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void RemoteActionCompatParcelizer(int i) {
        if (this.MediaMetadataCompat == null || i <= 0) {
            return;
        }
        int iMin = Math.min(this.MediaBrowserCompatItemReceiver, i - (this.AudioAttributesImplBaseParcelizer << 1));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.MediaMetadataCompat.getLayoutParams();
        ((ViewGroup.LayoutParams) layoutParams).height = RatingCompat() ? iMin : this.AudioAttributesCompatParcelizer;
        ((ViewGroup.LayoutParams) layoutParams).width = iMin;
        this.MediaMetadataCompat.setLayoutParams(layoutParams);
    }

    private boolean RatingCompat() {
        return this.MediaDescriptionCompat && this.onPlayFromUri == 2;
    }

    public void setActiveIndicatorHeight(int i) {
        this.AudioAttributesCompatParcelizer = i;
        RemoteActionCompatParcelizer(getWidth());
    }

    public void setActiveIndicatorMarginHorizontal(int i) {
        this.AudioAttributesImplBaseParcelizer = i;
        RemoteActionCompatParcelizer(getWidth());
    }

    private Drawable MediaBrowserCompatMediaItem() {
        View view = this.MediaMetadataCompat;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    public void setActiveIndicatorDrawable(Drawable drawable) {
        View view = this.MediaMetadataCompat;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
        MediaDescriptionCompat();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        FrameLayout frameLayout = this.onAddQueueItem;
        if (frameLayout != null && this.AudioAttributesImplApi26Parcelizer) {
            frameLayout.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void setActiveIndicatorResizeable(boolean z) {
        this.MediaDescriptionCompat = z;
    }

    final void IconCompatParcelizer(BinarySearchSeekerTimestampSeeker binarySearchSeekerTimestampSeeker) {
        ImageView imageView;
        if (this.RatingCompat != binarySearchSeekerTimestampSeeker) {
            if (AudioAttributesImplBaseParcelizer() && (imageView = this.handleMediaPlayPauseIfPendingOnHandler) != null) {
                AudioAttributesCompatParcelizer(imageView);
            }
            this.RatingCompat = binarySearchSeekerTimestampSeeker;
            ImageView imageView2 = this.handleMediaPlayPauseIfPendingOnHandler;
            if (imageView2 != null) {
                write(imageView2);
            }
        }
    }

    private void handleMediaPlayPauseIfPendingOnHandler() {
        AudioAttributesCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler);
    }

    private boolean AudioAttributesImplBaseParcelizer() {
        return this.RatingCompat != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void RemoteActionCompatParcelizer(View view) {
        if (AudioAttributesImplBaseParcelizer()) {
            onSeekFinished.write(this.RatingCompat, view, null);
        }
    }

    private void write(View view) {
        if (!AudioAttributesImplBaseParcelizer() || view == null) {
            return;
        }
        setClipChildren(false);
        setClipToPadding(false);
        onSeekFinished.IconCompatParcelizer(this.RatingCompat, view, null);
    }

    private void AudioAttributesCompatParcelizer(View view) {
        if (AudioAttributesImplBaseParcelizer()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                onSeekFinished.RemoteActionCompatParcelizer(this.RatingCompat, view);
            }
            this.RatingCompat = null;
        }
    }

    private int MediaBrowserCompatItemReceiver() {
        BinarySearchSeekerTimestampSeeker binarySearchSeekerTimestampSeeker = this.RatingCompat;
        int minimumWidth = binarySearchSeekerTimestampSeeker == null ? 0 : binarySearchSeekerTimestampSeeker.getMinimumWidth() - this.RatingCompat.RemoteActionCompatParcelizer();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) AudioAttributesImplApi26Parcelizer().getLayoutParams();
        return Math.max(minimumWidth, ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) + this.handleMediaPlayPauseIfPendingOnHandler.getMeasuredWidth() + Math.max(minimumWidth, ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
    }

    private int AudioAttributesImplApi21Parcelizer() {
        return ((ViewGroup.MarginLayoutParams) ((FrameLayout.LayoutParams) AudioAttributesImplApi26Parcelizer().getLayoutParams())).topMargin + AudioAttributesImplApi26Parcelizer().getMeasuredHeight();
    }

    private static int onCommand() {
        return calculateNextSearchBytePosition.MediaBrowserCompatItemReceiver.mtrl_navigation_bar_item_background;
    }

    protected int read() {
        return calculateNextSearchBytePosition.write.mtrl_navigation_bar_item_default_margin;
    }

    static class write {
        protected float IconCompatParcelizer(float f) {
            return 1.0f;
        }

        private write() {
        }

        /* synthetic */ write(byte b) {
            this();
        }

        private static float RemoteActionCompatParcelizer(float f, float f2) {
            return BinarySearchSeekerSeekOperationParams.RemoteActionCompatParcelizer(BitmapDescriptorFactory.HUE_RED, 1.0f, f2 == BitmapDescriptorFactory.HUE_RED ? 0.8f : 0.0f, f2 == BitmapDescriptorFactory.HUE_RED ? 1.0f : 0.2f, f);
        }

        protected static float write(float f) {
            return BinarySearchSeekerSeekOperationParams.read(0.4f, 1.0f, f);
        }

        public final void write(float f, float f2, View view) {
            view.setScaleX(write(f));
            view.setScaleY(IconCompatParcelizer(f));
            view.setAlpha(RemoteActionCompatParcelizer(f, f2));
        }
    }

    static class read extends write {
        private read() {
            super((byte) 0);
        }

        /* synthetic */ read(byte b) {
            this();
        }

        @Override // com.google.android.material.navigation.NavigationBarItemView.write
        protected final float IconCompatParcelizer(float f) {
            return write(f);
        }
    }
}
