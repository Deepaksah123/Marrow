package com.google.android.material.search;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.view.AbsSavedState;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.appbar.AppBarLayout;
import com.marrow.data.models.common.CourseResponseKeyConstantsKt;
import kotlin.AccessorNamingStrategy;
import kotlin.InvalidTypeIdException;
import kotlin.TrackOutputCryptoData;
import kotlin._addSuperTypes;
import kotlin.calculateNextSearchBytePosition;
import kotlin.createExtractors;
import kotlin.findFormatOverrides;
import kotlin.frameSizeBytesByTypeNb;
import kotlin.getConstantBitrateSeekMap;
import kotlin.getDefaultViewModelCreationExtras;
import kotlin.isValidFrameType;
import kotlin.mapArray;
import kotlin.onRequestPermissionsResult;
import kotlin.readFrames;
import kotlin.readId3Metadata;
import kotlin.readMetadataBlock;

/* JADX INFO: loaded from: classes5.dex */
public class SearchBar extends Toolbar {
    private static final int AudioAttributesImplApi26Parcelizer = calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.Widget_Material3_SearchBar;
    private final AccessibilityManager AudioAttributesImplApi21Parcelizer;
    private frameSizeBytesByTypeNb AudioAttributesImplBaseParcelizer;
    private final boolean MediaBrowserCompatMediaItem;
    private boolean MediaBrowserCompatSearchResultReceiver;
    private final boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final Drawable MediaDescriptionCompat;
    private final boolean MediaMetadataCompat;
    private View RatingCompat;
    private Drawable handleMediaPlayPauseIfPendingOnHandler;
    private Integer onAddQueueItem;
    private int onCommand;
    private final TrackOutputCryptoData onCustomAction;
    private final AccessorNamingStrategy.IconCompatParcelizer onPause;
    private final TextView onPlay;
    private final boolean onPlayFromMediaId;

    private static int AudioAttributesCompatParcelizer(int i, int i2) {
        return i == 0 ? i2 : i;
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public final /* synthetic */ void write(boolean z) {
        setFocusableInTouchMode(z);
    }

    public SearchBar(Context context) {
        this(context, null);
    }

    public SearchBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, calculateNextSearchBytePosition.IconCompatParcelizer.materialSearchBarStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SearchBar(Context context, AttributeSet attributeSet, int i) {
        int i2 = AudioAttributesImplApi26Parcelizer;
        super(readFrames.IconCompatParcelizer(context, attributeSet, i, i2), attributeSet, i);
        this.onCommand = -1;
        this.onPause = new AccessorNamingStrategy.IconCompatParcelizer() { // from class: o.startSample
            @Override // o.AccessorNamingStrategy.IconCompatParcelizer
            public final void read(boolean z) {
                this.IconCompatParcelizer.write(z);
            }
        };
        Context context2 = getContext();
        IconCompatParcelizer(attributeSet);
        this.MediaDescriptionCompat = getDefaultViewModelCreationExtras.write(context2, onSetShuffleMode());
        this.onCustomAction = new TrackOutputCryptoData();
        TypedArray typedArrayWrite = readId3Metadata.write(context2, attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.SearchBar, i, i2, new int[0]);
        isValidFrameType isvalidframetypeRemoteActionCompatParcelizer = isValidFrameType.read(context2, attributeSet, i, i2).RemoteActionCompatParcelizer();
        int color = typedArrayWrite.getColor(calculateNextSearchBytePosition.MediaMetadataCompat.SearchBar_backgroundTint, 0);
        float dimension = typedArrayWrite.getDimension(calculateNextSearchBytePosition.MediaMetadataCompat.SearchBar_elevation, BitmapDescriptorFactory.HUE_RED);
        this.MediaMetadataCompat = typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.SearchBar_defaultMarginsEnabled, true);
        this.MediaBrowserCompatSearchResultReceiver = typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.SearchBar_defaultScrollFlagsEnabled, true);
        boolean z = typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.SearchBar_hideNavigationIcon, false);
        this.MediaBrowserCompatMediaItem = typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.SearchBar_forceDefaultNavigationOnClickListener, false);
        this.onPlayFromMediaId = typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.SearchBar_tintNavigationIcon, true);
        if (typedArrayWrite.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.SearchBar_navigationIconTint)) {
            this.onAddQueueItem = Integer.valueOf(typedArrayWrite.getColor(calculateNextSearchBytePosition.MediaMetadataCompat.SearchBar_navigationIconTint, -1));
        }
        int resourceId = typedArrayWrite.getResourceId(calculateNextSearchBytePosition.MediaMetadataCompat.SearchBar_android_textAppearance, -1);
        String string = typedArrayWrite.getString(calculateNextSearchBytePosition.MediaMetadataCompat.SearchBar_android_text);
        String string2 = typedArrayWrite.getString(calculateNextSearchBytePosition.MediaMetadataCompat.SearchBar_android_hint);
        float dimension2 = typedArrayWrite.getDimension(calculateNextSearchBytePosition.MediaMetadataCompat.SearchBar_strokeWidth, -1.0f);
        int color2 = typedArrayWrite.getColor(calculateNextSearchBytePosition.MediaMetadataCompat.SearchBar_strokeColor, 0);
        typedArrayWrite.recycle();
        if (!z) {
            onSeekTo();
        }
        setClickable(true);
        setFocusable(true);
        LayoutInflater.from(context2).inflate(calculateNextSearchBytePosition.MediaBrowserCompatCustomActionResultReceiver.mtrl_search_bar, this);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = true;
        this.onPlay = (TextView) findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.open_search_bar_text_view);
        InvalidTypeIdException.write(this, dimension);
        RemoteActionCompatParcelizer(resourceId, string, string2);
        RemoteActionCompatParcelizer(isvalidframetypeRemoteActionCompatParcelizer, color, dimension, dimension2, color2);
        this.AudioAttributesImplApi21Parcelizer = (AccessibilityManager) getContext().getSystemService("accessibility");
        onSetRepeatMode();
    }

    private void onSetRepeatMode() {
        AccessibilityManager accessibilityManager = this.AudioAttributesImplApi21Parcelizer;
        if (accessibilityManager != null) {
            if (accessibilityManager.isEnabled() && this.AudioAttributesImplApi21Parcelizer.isTouchExplorationEnabled()) {
                setFocusableInTouchMode(true);
            }
            addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.google.android.material.search.SearchBar.4
                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewAttachedToWindow(View view) {
                    AccessorNamingStrategy.AudioAttributesCompatParcelizer(SearchBar.this.AudioAttributesImplApi21Parcelizer, SearchBar.this.onPause);
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public final void onViewDetachedFromWindow(View view) {
                    AccessorNamingStrategy.RemoteActionCompatParcelizer(SearchBar.this.AudioAttributesImplApi21Parcelizer, SearchBar.this.onPause);
                }
            });
        }
    }

    private static void IconCompatParcelizer(AttributeSet attributeSet) {
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "title") != null) {
                throw new UnsupportedOperationException("SearchBar does not support title. Use hint or text instead.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", CourseResponseKeyConstantsKt.KEY_SUBTITLE) != null) {
                throw new UnsupportedOperationException("SearchBar does not support subtitle. Use hint or text instead.");
            }
        }
    }

    private void onSeekTo() {
        setNavigationIcon(AudioAttributesImplApi21Parcelizer() == null ? this.MediaDescriptionCompat : AudioAttributesImplApi21Parcelizer());
        read(true);
    }

    private void RemoteActionCompatParcelizer(int i, String str, String str2) {
        if (i != -1) {
            _addSuperTypes.RemoteActionCompatParcelizer(this.onPlay, i);
        }
        setText(str);
        setHint(str2);
        if (AudioAttributesImplApi21Parcelizer() == null) {
            mapArray.AudioAttributesCompatParcelizer((ViewGroup.MarginLayoutParams) this.onPlay.getLayoutParams(), getResources().getDimensionPixelSize(calculateNextSearchBytePosition.write.m3_searchbar_text_margin_start_no_navigation_icon));
        }
    }

    private void RemoteActionCompatParcelizer(isValidFrameType isvalidframetype, int i, float f, float f2, int i2) {
        frameSizeBytesByTypeNb framesizebytesbytypenb = new frameSizeBytesByTypeNb(isvalidframetype);
        this.AudioAttributesImplBaseParcelizer = framesizebytesbytypenb;
        framesizebytesbytypenb.RemoteActionCompatParcelizer(getContext());
        this.AudioAttributesImplBaseParcelizer.handleMediaPlayPauseIfPendingOnHandler(f);
        if (f2 >= BitmapDescriptorFactory.HUE_RED) {
            this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(f2, i2);
        }
        int iRemoteActionCompatParcelizer = createExtractors.RemoteActionCompatParcelizer(this, calculateNextSearchBytePosition.IconCompatParcelizer.colorControlHighlight);
        this.AudioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer(ColorStateList.valueOf(i));
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iRemoteActionCompatParcelizer);
        frameSizeBytesByTypeNb framesizebytesbytypenb2 = this.AudioAttributesImplBaseParcelizer;
        InvalidTypeIdException.read(this, new RippleDrawable(colorStateListValueOf, framesizebytesbytypenb2, framesizebytesbytypenb2));
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver && this.RatingCompat == null && !(view instanceof ActionMenuView)) {
            this.RatingCompat = view;
            view.setAlpha(BitmapDescriptorFactory.HUE_RED);
        }
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        frameSizeBytesByTypeNb framesizebytesbytypenb = this.AudioAttributesImplBaseParcelizer;
        if (framesizebytesbytypenb != null) {
            framesizebytesbytypenb.handleMediaPlayPauseIfPendingOnHandler(f);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        accessibilityNodeInfo.setEditable(isEnabled());
        CharSequence charSequenceOnPlayFromSearch = onPlayFromSearch();
        boolean zIsEmpty = TextUtils.isEmpty(charSequenceOnPlayFromSearch);
        accessibilityNodeInfo.setHintText(onSetRating());
        accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        if (zIsEmpty) {
            charSequenceOnPlayFromSearch = onSetRating();
        }
        accessibilityNodeInfo.setText(charSequenceOnPlayFromSearch);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        if (this.MediaBrowserCompatMediaItem) {
            return;
        }
        super.setNavigationOnClickListener(onClickListener);
        read(onClickListener == null);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(read(drawable));
    }

    private Drawable read(Drawable drawable) {
        int i;
        int iRemoteActionCompatParcelizer;
        if (!this.onPlayFromMediaId || drawable == null) {
            return drawable;
        }
        Integer num = this.onAddQueueItem;
        if (num != null) {
            iRemoteActionCompatParcelizer = num.intValue();
        } else {
            if (drawable == this.MediaDescriptionCompat) {
                i = calculateNextSearchBytePosition.IconCompatParcelizer.colorOnSurfaceVariant;
            } else {
                i = calculateNextSearchBytePosition.IconCompatParcelizer.colorOnSurface;
            }
            iRemoteActionCompatParcelizer = createExtractors.RemoteActionCompatParcelizer(this, i);
        }
        Drawable drawableAudioAttributesImplApi26Parcelizer = findFormatOverrides.AudioAttributesImplApi26Parcelizer(drawable.mutate());
        findFormatOverrides.AudioAttributesCompatParcelizer(drawableAudioAttributesImplApi26Parcelizer, iRemoteActionCompatParcelizer);
        return drawableAudioAttributesImplApi26Parcelizer;
    }

    private void read(boolean z) {
        ImageButton imageButtonIconCompatParcelizer = readMetadataBlock.IconCompatParcelizer(this);
        if (imageButtonIconCompatParcelizer == null) {
            return;
        }
        boolean z2 = !z;
        imageButtonIconCompatParcelizer.setClickable(z2);
        imageButtonIconCompatParcelizer.setFocusable(z2);
        Drawable background = imageButtonIconCompatParcelizer.getBackground();
        if (background != null) {
            this.handleMediaPlayPauseIfPendingOnHandler = background;
        }
        imageButtonIconCompatParcelizer.setBackgroundDrawable(z ? null : this.handleMediaPlayPauseIfPendingOnHandler);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void write(int i) {
        Menu menuMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        boolean z = menuMediaBrowserCompatCustomActionResultReceiver instanceof onRequestPermissionsResult;
        if (z) {
            ((onRequestPermissionsResult) menuMediaBrowserCompatCustomActionResultReceiver).onFastForward();
        }
        super.write(i);
        this.onCommand = i;
        if (z) {
            ((onRequestPermissionsResult) menuMediaBrowserCompatCustomActionResultReceiver).onCustomAction();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        read(i, i2);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        onPrepareFromUri();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getConstantBitrateSeekMap.RemoteActionCompatParcelizer(this, this.AudioAttributesImplBaseParcelizer);
        onRemoveQueueItemAt();
        onRemoveQueueItem();
    }

    private void onRemoveQueueItemAt() {
        if (this.MediaMetadataCompat && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(calculateNextSearchBytePosition.write.m3_searchbar_margin_horizontal);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(onSetCaptioningEnabled());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.leftMargin = AudioAttributesCompatParcelizer(marginLayoutParams.leftMargin, dimensionPixelSize);
            marginLayoutParams.topMargin = AudioAttributesCompatParcelizer(marginLayoutParams.topMargin, dimensionPixelSize2);
            marginLayoutParams.rightMargin = AudioAttributesCompatParcelizer(marginLayoutParams.rightMargin, dimensionPixelSize);
            marginLayoutParams.bottomMargin = AudioAttributesCompatParcelizer(marginLayoutParams.bottomMargin, dimensionPixelSize2);
        }
    }

    private static int onSetCaptioningEnabled() {
        return calculateNextSearchBytePosition.write.m3_searchbar_margin_vertical;
    }

    private static int onSetShuffleMode() {
        return calculateNextSearchBytePosition.MediaBrowserCompatItemReceiver.ic_search_black_24;
    }

    private void onRemoveQueueItem() {
        if (getLayoutParams() instanceof AppBarLayout.LayoutParams) {
            AppBarLayout.LayoutParams layoutParams = (AppBarLayout.LayoutParams) getLayoutParams();
            if (this.MediaBrowserCompatSearchResultReceiver) {
                if (layoutParams.IconCompatParcelizer() == 0) {
                    layoutParams.write(53);
                }
            } else if (layoutParams.IconCompatParcelizer() == 53) {
                layoutParams.write(0);
            }
        }
    }

    private void read(int i, int i2) {
        View view = this.RatingCompat;
        if (view != null) {
            view.measure(i, i2);
        }
    }

    private void onPrepareFromUri() {
        View view = this.RatingCompat;
        if (view == null) {
            return;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
        int measuredHeight = this.RatingCompat.getMeasuredHeight();
        int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
        read(this.RatingCompat, measuredWidth2, measuredHeight2, measuredWidth2 + measuredWidth, measuredHeight2 + measuredHeight);
    }

    private void read(View view, int i, int i2, int i3, int i4) {
        if (InvalidTypeIdException.MediaBrowserCompatMediaItem(this) == 1) {
            view.layout(getMeasuredWidth() - i3, i2, getMeasuredWidth() - i, i4);
        } else {
            view.layout(i, i2, i3, i4);
        }
    }

    public final View onPrepareFromSearch() {
        return this.RatingCompat;
    }

    public void setCenterView(View view) {
        View view2 = this.RatingCompat;
        if (view2 != null) {
            removeView(view2);
            this.RatingCompat = null;
        }
        if (view != null) {
            addView(view);
        }
    }

    public final CharSequence onPlayFromSearch() {
        return this.onPlay.getText();
    }

    public void setText(CharSequence charSequence) {
        this.onPlay.setText(charSequence);
    }

    public void setText(int i) {
        this.onPlay.setText(i);
    }

    private CharSequence onSetRating() {
        return this.onPlay.getHint();
    }

    public void setHint(CharSequence charSequence) {
        this.onPlay.setHint(charSequence);
    }

    public void setHint(int i) {
        this.onPlay.setHint(i);
    }

    private int onSetPlaybackSpeed() {
        return this.AudioAttributesImplBaseParcelizer.onPrepareFromUri().getDefaultColor();
    }

    public void setStrokeColor(int i) {
        if (onSetPlaybackSpeed() != i) {
            this.AudioAttributesImplBaseParcelizer.MediaBrowserCompatCustomActionResultReceiver(ColorStateList.valueOf(i));
        }
    }

    private float onStop() {
        return this.AudioAttributesImplBaseParcelizer.onSeekTo();
    }

    public void setStrokeWidth(float f) {
        if (onStop() != f) {
            this.AudioAttributesImplBaseParcelizer.onAddQueueItem(f);
        }
    }

    public final float onPrepare() {
        return this.AudioAttributesImplBaseParcelizer.onRemoveQueueItemAt();
    }

    public void setDefaultScrollFlagsEnabled(boolean z) {
        this.MediaBrowserCompatSearchResultReceiver = z;
        onRemoveQueueItem();
    }

    public final void onRewind() {
        this.onCustomAction.AudioAttributesCompatParcelizer(this);
    }

    public final int onPrepareFromMediaId() {
        return this.onCommand;
    }

    final float onPlayFromUri() {
        frameSizeBytesByTypeNb framesizebytesbytypenb = this.AudioAttributesImplBaseParcelizer;
        return framesizebytesbytypenb != null ? framesizebytesbytypenb.onPlayFromMediaId() : InvalidTypeIdException.AudioAttributesImplBaseParcelizer(this);
    }

    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {
        private boolean RemoteActionCompatParcelizer;

        @Override // com.google.android.material.appbar.HeaderScrollingViewBehavior
        public final boolean write() {
            return true;
        }

        public ScrollingViewBehavior() {
            this.RemoteActionCompatParcelizer = false;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.RemoteActionCompatParcelizer = false;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public final boolean IconCompatParcelizer(CoordinatorLayout coordinatorLayout, View view, View view2) {
            boolean zIconCompatParcelizer = super.IconCompatParcelizer(coordinatorLayout, view, view2);
            if (!this.RemoteActionCompatParcelizer && (view2 instanceof AppBarLayout)) {
                this.RemoteActionCompatParcelizer = true;
                write((AppBarLayout) view2);
            }
            return zIconCompatParcelizer;
        }

        private static void write(AppBarLayout appBarLayout) {
            appBarLayout.setBackgroundColor(0);
            appBarLayout.setTargetElevation(BitmapDescriptorFactory.HUE_RED);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        CharSequence charSequenceOnPlayFromSearch = onPlayFromSearch();
        savedState.read = charSequenceOnPlayFromSearch == null ? null : charSequenceOnPlayFromSearch.toString();
        return savedState;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.read());
        setText(savedState.read);
    }

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.search.SearchBar.SavedState.3
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return read(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return IconCompatParcelizer(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object[] newArray(int i) {
                return RemoteActionCompatParcelizer(i);
            }

            private static SavedState IconCompatParcelizer(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            private static SavedState read(Parcel parcel) {
                return new SavedState(parcel);
            }

            private static SavedState[] RemoteActionCompatParcelizer(int i) {
                return new SavedState[i];
            }
        };
        String read;

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.read = parcel.readString();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.read);
        }
    }
}
