package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.BinarySearchSeekerSeekOperationParams;
import kotlin.DefaultExtractorsFactoryExtensionLoaderConstructorSupplier;
import kotlin.ExtractorOutput;
import kotlin.ExtractorUtil;
import kotlin.InvalidTypeIdException;
import kotlin.SeekMap;
import kotlin.StdKeyDeserializer;
import kotlin._init_lambda5;
import kotlin._isNaN;
import kotlin.calculateNextSearchBytePosition;
import kotlin.configureFromStringCreator;
import kotlin.createExtractors;
import kotlin.findFormatOverrides;
import kotlin.finishBranchObject;
import kotlin.getSampleRateLookupKey;
import kotlin.readFrameBlockSizeSamplesFromKey;
import kotlin.readFrames;
import kotlin.readId3Metadata;
import kotlin.underestimatedResult;

/* JADX INFO: loaded from: classes3.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    private static final int write = calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.Widget_Design_CollapsingToolbar;
    Drawable AudioAttributesCompatParcelizer;
    private boolean AudioAttributesImplApi21Parcelizer;
    private Drawable AudioAttributesImplApi26Parcelizer;
    private DefaultExtractorsFactoryExtensionLoaderConstructorSupplier AudioAttributesImplBaseParcelizer;
    int IconCompatParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private View MediaBrowserCompatItemReceiver;
    private int MediaBrowserCompatMediaItem;
    private int MediaBrowserCompatSearchResultReceiver;
    private boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private int MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private int RatingCompat;
    final ExtractorUtil RemoteActionCompatParcelizer;
    private boolean handleMediaPlayPauseIfPendingOnHandler;
    private int onAddQueueItem;
    private boolean onCommand;
    private AppBarLayout.write onCustomAction;
    private int onFastForward;
    private long onMediaButtonEvent;
    private final TimeInterpolator onPause;
    private ValueAnimator onPlay;
    private final TimeInterpolator onPlayFromMediaId;
    private boolean onPlayFromSearch;
    private View onPlayFromUri;
    private int onPrepare;
    private ViewGroup onPrepareFromMediaId;
    private final Rect onPrepareFromSearch;
    private int onRemoveQueueItemAt;
    private int onSeekTo;
    WindowInsetsCompat read;

    /* JADX INFO: loaded from: classes5.dex */
    public interface AudioAttributesCompatParcelizer extends readFrameBlockSizeSamplesFromKey {
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return MediaBrowserCompatItemReceiver();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected /* synthetic */ FrameLayout.LayoutParams generateDefaultLayoutParams() {
        return MediaBrowserCompatItemReceiver();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateLayoutParams(attributeSet);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return AudioAttributesCompatParcelizer(layoutParams);
    }

    public CollapsingToolbarLayout(Context context) {
        this(context, null);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, calculateNextSearchBytePosition.IconCompatParcelizer.collapsingToolbarLayoutStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        int i2 = write;
        super(readFrames.IconCompatParcelizer(context, attributeSet, i, i2), attributeSet, i);
        this.onCommand = true;
        this.onPrepareFromSearch = new Rect();
        this.onFastForward = -1;
        this.onSeekTo = 0;
        this.RatingCompat = 0;
        Context context2 = getContext();
        ExtractorUtil extractorUtil = new ExtractorUtil(this);
        this.RemoteActionCompatParcelizer = extractorUtil;
        extractorUtil.AudioAttributesCompatParcelizer(BinarySearchSeekerSeekOperationParams.read);
        extractorUtil.read(false);
        this.AudioAttributesImplBaseParcelizer = new DefaultExtractorsFactoryExtensionLoaderConstructorSupplier(context2);
        TypedArray typedArrayWrite = readId3Metadata.write(context2, attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.CollapsingToolbarLayout, i, i2, new int[0]);
        extractorUtil.IconCompatParcelizer(typedArrayWrite.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.CollapsingToolbarLayout_expandedTitleGravity, 8388691));
        extractorUtil.read(typedArrayWrite.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.CollapsingToolbarLayout_collapsedTitleGravity, 8388627));
        int dimensionPixelSize = typedArrayWrite.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.CollapsingToolbarLayout_expandedTitleMargin, 0);
        this.MediaMetadataCompat = dimensionPixelSize;
        this.MediaBrowserCompatSearchResultReceiver = dimensionPixelSize;
        this.MediaDescriptionCompat = dimensionPixelSize;
        this.MediaBrowserCompatMediaItem = dimensionPixelSize;
        if (typedArrayWrite.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.CollapsingToolbarLayout_expandedTitleMarginStart)) {
            this.MediaBrowserCompatMediaItem = typedArrayWrite.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.CollapsingToolbarLayout_expandedTitleMarginStart, 0);
        }
        if (typedArrayWrite.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.CollapsingToolbarLayout_expandedTitleMarginEnd)) {
            this.MediaBrowserCompatSearchResultReceiver = typedArrayWrite.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.CollapsingToolbarLayout_expandedTitleMarginEnd, 0);
        }
        if (typedArrayWrite.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.CollapsingToolbarLayout_expandedTitleMarginTop)) {
            this.MediaDescriptionCompat = typedArrayWrite.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.CollapsingToolbarLayout_expandedTitleMarginTop, 0);
        }
        if (typedArrayWrite.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.CollapsingToolbarLayout_expandedTitleMarginBottom)) {
            this.MediaMetadataCompat = typedArrayWrite.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.CollapsingToolbarLayout_expandedTitleMarginBottom, 0);
        }
        this.MediaBrowserCompatCustomActionResultReceiver = typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.CollapsingToolbarLayout_titleEnabled, true);
        setTitle(typedArrayWrite.getText(calculateNextSearchBytePosition.MediaMetadataCompat.CollapsingToolbarLayout_title));
        extractorUtil.RemoteActionCompatParcelizer(calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.TextAppearance_Design_CollapsingToolbar_Expanded);
        extractorUtil.write(_init_lambda5.MediaBrowserCompatItemReceiver.TextAppearance_AppCompat_Widget_ActionBar_Title);
        if (typedArrayWrite.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.CollapsingToolbarLayout_expandedTitleTextAppearance)) {
            extractorUtil.RemoteActionCompatParcelizer(typedArrayWrite.getResourceId(calculateNextSearchBytePosition.MediaMetadataCompat.CollapsingToolbarLayout_expandedTitleTextAppearance, 0));
        }
        if (typedArrayWrite.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.CollapsingToolbarLayout_collapsedTitleTextAppearance)) {
            extractorUtil.write(typedArrayWrite.getResourceId(calculateNextSearchBytePosition.MediaMetadataCompat.CollapsingToolbarLayout_collapsedTitleTextAppearance, 0));
        }
        if (typedArrayWrite.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.CollapsingToolbarLayout_titleTextEllipsize)) {
            setTitleEllipsize(read(typedArrayWrite.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.CollapsingToolbarLayout_titleTextEllipsize, -1)));
        }
        if (typedArrayWrite.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.CollapsingToolbarLayout_expandedTitleTextColor)) {
            extractorUtil.RemoteActionCompatParcelizer(SeekMap.IconCompatParcelizer(context2, typedArrayWrite, calculateNextSearchBytePosition.MediaMetadataCompat.CollapsingToolbarLayout_expandedTitleTextColor));
        }
        if (typedArrayWrite.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.CollapsingToolbarLayout_collapsedTitleTextColor)) {
            extractorUtil.AudioAttributesCompatParcelizer(SeekMap.IconCompatParcelizer(context2, typedArrayWrite, calculateNextSearchBytePosition.MediaMetadataCompat.CollapsingToolbarLayout_collapsedTitleTextColor));
        }
        this.onFastForward = typedArrayWrite.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.CollapsingToolbarLayout_scrimVisibleHeightTrigger, -1);
        if (typedArrayWrite.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.CollapsingToolbarLayout_maxLines)) {
            extractorUtil.MediaBrowserCompatItemReceiver(typedArrayWrite.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.CollapsingToolbarLayout_maxLines, 1));
        }
        if (typedArrayWrite.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.CollapsingToolbarLayout_titlePositionInterpolator)) {
            extractorUtil.RemoteActionCompatParcelizer(AnimationUtils.loadInterpolator(context2, typedArrayWrite.getResourceId(calculateNextSearchBytePosition.MediaMetadataCompat.CollapsingToolbarLayout_titlePositionInterpolator, 0)));
        }
        this.onMediaButtonEvent = typedArrayWrite.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.CollapsingToolbarLayout_scrimAnimationDuration, 600);
        this.onPlayFromMediaId = getSampleRateLookupKey.read(context2, calculateNextSearchBytePosition.IconCompatParcelizer.motionEasingStandardInterpolator, BinarySearchSeekerSeekOperationParams.IconCompatParcelizer);
        this.onPause = getSampleRateLookupKey.read(context2, calculateNextSearchBytePosition.IconCompatParcelizer.motionEasingStandardInterpolator, BinarySearchSeekerSeekOperationParams.RemoteActionCompatParcelizer);
        setContentScrim(typedArrayWrite.getDrawable(calculateNextSearchBytePosition.MediaMetadataCompat.CollapsingToolbarLayout_contentScrim));
        setStatusBarScrim(typedArrayWrite.getDrawable(calculateNextSearchBytePosition.MediaMetadataCompat.CollapsingToolbarLayout_statusBarScrim));
        setTitleCollapseMode(typedArrayWrite.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.CollapsingToolbarLayout_titleCollapseMode, 0));
        this.onRemoveQueueItemAt = typedArrayWrite.getResourceId(calculateNextSearchBytePosition.MediaMetadataCompat.CollapsingToolbarLayout_toolbarId, -1);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.CollapsingToolbarLayout_forceApplySystemWindowInsetTop, false);
        this.handleMediaPlayPauseIfPendingOnHandler = typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.CollapsingToolbarLayout_extraMultilineHeightEnabled, false);
        typedArrayWrite.recycle();
        setWillNotDraw(false);
        InvalidTypeIdException.read(this, new finishBranchObject() { // from class: com.google.android.material.appbar.CollapsingToolbarLayout.1
            @Override // kotlin.finishBranchObject
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return CollapsingToolbarLayout.this.IconCompatParcelizer(windowInsetsCompat);
            }
        });
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            IconCompatParcelizer(appBarLayout);
            InvalidTypeIdException.AudioAttributesCompatParcelizer(this, InvalidTypeIdException.MediaBrowserCompatCustomActionResultReceiver(appBarLayout));
            if (this.onCustomAction == null) {
                this.onCustomAction = new RemoteActionCompatParcelizer();
            }
            appBarLayout.RemoteActionCompatParcelizer(this.onCustomAction);
            InvalidTypeIdException.onSetRepeatMode(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.write writeVar = this.onCustomAction;
        if (writeVar != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).write(writeVar);
        }
        super.onDetachedFromWindow();
    }

    final WindowInsetsCompat IconCompatParcelizer(WindowInsetsCompat windowInsetsCompat) {
        WindowInsetsCompat windowInsetsCompat2 = InvalidTypeIdException.MediaBrowserCompatCustomActionResultReceiver(this) ? windowInsetsCompat : null;
        if (!configureFromStringCreator.RemoteActionCompatParcelizer(this.read, windowInsetsCompat2)) {
            this.read = windowInsetsCompat2;
            requestLayout();
        }
        return windowInsetsCompat.IconCompatParcelizer();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        IconCompatParcelizer();
        if (this.onPrepareFromMediaId == null && (drawable = this.AudioAttributesImplApi26Parcelizer) != null && this.onAddQueueItem > 0) {
            drawable.mutate().setAlpha(this.onAddQueueItem);
            this.AudioAttributesImplApi26Parcelizer.draw(canvas);
        }
        if (this.MediaBrowserCompatCustomActionResultReceiver && this.AudioAttributesImplApi21Parcelizer) {
            if (this.onPrepareFromMediaId != null && this.AudioAttributesImplApi26Parcelizer != null && this.onAddQueueItem > 0 && read() && this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver() < this.RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer()) {
                int iSave = canvas.save();
                canvas.clipRect(this.AudioAttributesImplApi26Parcelizer.getBounds(), Region.Op.DIFFERENCE);
                this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(canvas);
                canvas.restoreToCount(iSave);
            } else {
                this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(canvas);
            }
        }
        if (this.AudioAttributesCompatParcelizer == null || this.onAddQueueItem <= 0) {
            return;
        }
        WindowInsetsCompat windowInsetsCompat = this.read;
        int iMediaBrowserCompatCustomActionResultReceiver = windowInsetsCompat != null ? windowInsetsCompat.MediaBrowserCompatCustomActionResultReceiver() : 0;
        if (iMediaBrowserCompatCustomActionResultReceiver > 0) {
            this.AudioAttributesCompatParcelizer.setBounds(0, -this.IconCompatParcelizer, getWidth(), iMediaBrowserCompatCustomActionResultReceiver - this.IconCompatParcelizer);
            this.AudioAttributesCompatParcelizer.mutate().setAlpha(this.onAddQueueItem);
            this.AudioAttributesCompatParcelizer.draw(canvas);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(configuration);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        if (this.AudioAttributesImplApi26Parcelizer == null || this.onAddQueueItem <= 0 || !AudioAttributesImplApi21Parcelizer(view)) {
            z = false;
        } else {
            RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, view, getWidth(), getHeight());
            this.AudioAttributesImplApi26Parcelizer.mutate().setAlpha(this.onAddQueueItem);
            this.AudioAttributesImplApi26Parcelizer.draw(canvas);
            z = true;
        }
        return super.drawChild(canvas, view, j) || z;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Drawable drawable = this.AudioAttributesImplApi26Parcelizer;
        if (drawable != null) {
            read(drawable, i, i2);
        }
    }

    private boolean read() {
        return this.onPrepare == 1;
    }

    private void IconCompatParcelizer(AppBarLayout appBarLayout) {
        if (read()) {
            appBarLayout.setLiftOnScroll(false);
        }
    }

    private void read(Drawable drawable, int i, int i2) {
        RemoteActionCompatParcelizer(drawable, this.onPrepareFromMediaId, i, i2);
    }

    private void RemoteActionCompatParcelizer(Drawable drawable, View view, int i, int i2) {
        if (read() && view != null && this.MediaBrowserCompatCustomActionResultReceiver) {
            i2 = view.getBottom();
        }
        drawable.setBounds(0, 0, i, i2);
    }

    private void IconCompatParcelizer() {
        if (this.onCommand) {
            ViewGroup viewGroup = null;
            this.onPrepareFromMediaId = null;
            this.onPlayFromUri = null;
            int i = this.onRemoveQueueItemAt;
            if (i != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i);
                this.onPrepareFromMediaId = viewGroup2;
                if (viewGroup2 != null) {
                    this.onPlayFromUri = AudioAttributesCompatParcelizer(viewGroup2);
                }
            }
            if (this.onPrepareFromMediaId == null) {
                int childCount = getChildCount();
                int i2 = 0;
                while (true) {
                    if (i2 >= childCount) {
                        break;
                    }
                    View childAt = getChildAt(i2);
                    if (AudioAttributesImplBaseParcelizer(childAt)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                    i2++;
                }
                this.onPrepareFromMediaId = viewGroup;
            }
            AudioAttributesImplApi21Parcelizer();
            this.onCommand = false;
        }
    }

    private static boolean AudioAttributesImplBaseParcelizer(View view) {
        return (view instanceof Toolbar) || (view instanceof android.widget.Toolbar);
    }

    private boolean AudioAttributesImplApi21Parcelizer(View view) {
        View view2 = this.onPlayFromUri;
        return (view2 == null || view2 == this) ? view == this.onPrepareFromMediaId : view == view2;
    }

    private View AudioAttributesCompatParcelizer(View view) {
        for (ViewParent parent = view.getParent(); parent != this && parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                view = parent;
            }
        }
        return view;
    }

    private void AudioAttributesImplApi21Parcelizer() {
        View view;
        if (!this.MediaBrowserCompatCustomActionResultReceiver && (view = this.MediaBrowserCompatItemReceiver) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.MediaBrowserCompatItemReceiver);
            }
        }
        if (!this.MediaBrowserCompatCustomActionResultReceiver || this.onPrepareFromMediaId == null) {
            return;
        }
        if (this.MediaBrowserCompatItemReceiver == null) {
            this.MediaBrowserCompatItemReceiver = new View(getContext());
        }
        if (this.MediaBrowserCompatItemReceiver.getParent() == null) {
            this.onPrepareFromMediaId.addView(this.MediaBrowserCompatItemReceiver, -1, -1);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        IconCompatParcelizer();
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i2);
        WindowInsetsCompat windowInsetsCompat = this.read;
        int iMediaBrowserCompatCustomActionResultReceiver = windowInsetsCompat != null ? windowInsetsCompat.MediaBrowserCompatCustomActionResultReceiver() : 0;
        if ((mode == 0 || this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) && iMediaBrowserCompatCustomActionResultReceiver > 0) {
            this.onSeekTo = iMediaBrowserCompatCustomActionResultReceiver;
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + iMediaBrowserCompatCustomActionResultReceiver, 1073741824));
        }
        if (this.handleMediaPlayPauseIfPendingOnHandler && this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver() > 1) {
            MediaBrowserCompatCustomActionResultReceiver();
            read(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            int iRemoteActionCompatParcelizer = this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
            if (iRemoteActionCompatParcelizer > 1) {
                this.RatingCompat = Math.round(this.RemoteActionCompatParcelizer.IconCompatParcelizer()) * (iRemoteActionCompatParcelizer - 1);
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.RatingCompat, 1073741824));
            }
        }
        ViewGroup viewGroup = this.onPrepareFromMediaId;
        if (viewGroup != null) {
            View view = this.onPlayFromUri;
            if (view == null || view == this) {
                setMinimumHeight(read(viewGroup));
            } else {
                setMinimumHeight(read(view));
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        WindowInsetsCompat windowInsetsCompat = this.read;
        if (windowInsetsCompat != null) {
            int iMediaBrowserCompatCustomActionResultReceiver = windowInsetsCompat.MediaBrowserCompatCustomActionResultReceiver();
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (!InvalidTypeIdException.MediaBrowserCompatCustomActionResultReceiver(childAt) && childAt.getTop() < iMediaBrowserCompatCustomActionResultReceiver) {
                    InvalidTypeIdException.IconCompatParcelizer(childAt, iMediaBrowserCompatCustomActionResultReceiver);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i6 = 0; i6 < childCount2; i6++) {
            IconCompatParcelizer(getChildAt(i6)).write();
        }
        read(i, i2, i3, i4, false);
        MediaBrowserCompatCustomActionResultReceiver();
        RemoteActionCompatParcelizer();
        int childCount3 = getChildCount();
        for (int i7 = 0; i7 < childCount3; i7++) {
            IconCompatParcelizer(getChildAt(i7)).AudioAttributesCompatParcelizer();
        }
    }

    private void read(int i, int i2, int i3, int i4, boolean z) {
        View view;
        if (!this.MediaBrowserCompatCustomActionResultReceiver || (view = this.MediaBrowserCompatItemReceiver) == null) {
            return;
        }
        boolean z2 = InvalidTypeIdException.onPlayFromSearch(view) && this.MediaBrowserCompatItemReceiver.getVisibility() == 0;
        this.AudioAttributesImplApi21Parcelizer = z2;
        if (z2 || z) {
            boolean z3 = InvalidTypeIdException.MediaBrowserCompatMediaItem(this) == 1;
            IconCompatParcelizer(z3);
            this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(z3 ? this.MediaBrowserCompatSearchResultReceiver : this.MediaBrowserCompatMediaItem, this.onPrepareFromSearch.top + this.MediaDescriptionCompat, (i3 - i) - (z3 ? this.MediaBrowserCompatMediaItem : this.MediaBrowserCompatSearchResultReceiver), (i4 - i2) - this.MediaMetadataCompat);
            this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(z);
        }
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        if (this.onPrepareFromMediaId != null && this.MediaBrowserCompatCustomActionResultReceiver && TextUtils.isEmpty(this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer())) {
            setTitle(RemoteActionCompatParcelizer(this.onPrepareFromMediaId));
        }
    }

    private void IconCompatParcelizer(boolean z) {
        int titleMarginStart;
        int titleMarginBottom;
        int titleMarginEnd;
        int titleMarginTop;
        View view = this.onPlayFromUri;
        if (view == null) {
            view = this.onPrepareFromMediaId;
        }
        int iWrite = write(view);
        ExtractorOutput.AudioAttributesCompatParcelizer(this, this.MediaBrowserCompatItemReceiver, this.onPrepareFromSearch);
        ViewGroup viewGroup = this.onPrepareFromMediaId;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            titleMarginStart = toolbar.MediaMetadataCompat();
            titleMarginEnd = toolbar.MediaBrowserCompatMediaItem();
            titleMarginTop = toolbar.onCustomAction();
            titleMarginBottom = toolbar.RatingCompat();
        } else if (viewGroup instanceof android.widget.Toolbar) {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            titleMarginStart = toolbar2.getTitleMarginStart();
            titleMarginEnd = toolbar2.getTitleMarginEnd();
            titleMarginTop = toolbar2.getTitleMarginTop();
            titleMarginBottom = toolbar2.getTitleMarginBottom();
        } else {
            titleMarginStart = 0;
            titleMarginBottom = 0;
            titleMarginEnd = 0;
            titleMarginTop = 0;
        }
        ExtractorUtil extractorUtil = this.RemoteActionCompatParcelizer;
        int i = this.onPrepareFromSearch.left;
        int i2 = z ? titleMarginEnd : titleMarginStart;
        int i3 = this.onPrepareFromSearch.top;
        int i4 = this.onPrepareFromSearch.right;
        if (!z) {
            titleMarginStart = titleMarginEnd;
        }
        extractorUtil.IconCompatParcelizer(i + i2, i3 + iWrite + titleMarginTop, i4 - titleMarginStart, (this.onPrepareFromSearch.bottom + iWrite) - titleMarginBottom);
    }

    private static CharSequence RemoteActionCompatParcelizer(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).MediaBrowserCompatSearchResultReceiver();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getTitle();
        }
        return null;
    }

    private static int read(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
        }
        return view.getMeasuredHeight();
    }

    static underestimatedResult IconCompatParcelizer(View view) {
        underestimatedResult underestimatedresult = (underestimatedResult) view.getTag(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.view_offset_helper);
        if (underestimatedresult != null) {
            return underestimatedresult;
        }
        underestimatedResult underestimatedresult2 = new underestimatedResult(view);
        view.setTag(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.view_offset_helper, underestimatedresult2);
        return underestimatedresult2;
    }

    public void setTitle(CharSequence charSequence) {
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(charSequence);
        AudioAttributesImplBaseParcelizer();
    }

    private CharSequence AudioAttributesImplApi26Parcelizer() {
        if (this.MediaBrowserCompatCustomActionResultReceiver) {
            return this.RemoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer();
        }
        return null;
    }

    public void setTitleCollapseMode(int i) {
        this.onPrepare = i;
        boolean z = read();
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(z);
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            IconCompatParcelizer((AppBarLayout) parent);
        }
        if (z && this.AudioAttributesImplApi26Parcelizer == null) {
            setContentScrimColor(AudioAttributesCompatParcelizer());
        }
    }

    private int AudioAttributesCompatParcelizer() {
        ColorStateList colorStateListRemoteActionCompatParcelizer = createExtractors.RemoteActionCompatParcelizer(getContext(), calculateNextSearchBytePosition.IconCompatParcelizer.colorSurfaceContainer);
        if (colorStateListRemoteActionCompatParcelizer != null) {
            return colorStateListRemoteActionCompatParcelizer.getDefaultColor();
        }
        return this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(getResources().getDimension(calculateNextSearchBytePosition.write.design_appbar_elevation));
    }

    public void setTitleEnabled(boolean z) {
        if (z != this.MediaBrowserCompatCustomActionResultReceiver) {
            this.MediaBrowserCompatCustomActionResultReceiver = z;
            AudioAttributesImplBaseParcelizer();
            AudioAttributesImplApi21Parcelizer();
            requestLayout();
        }
    }

    public void setTitleEllipsize(TextUtils.TruncateAt truncateAt) {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(truncateAt);
    }

    private static TextUtils.TruncateAt read(int i) {
        if (i == 0) {
            return TextUtils.TruncateAt.START;
        }
        if (i == 1) {
            return TextUtils.TruncateAt.MIDDLE;
        }
        if (i == 3) {
            return TextUtils.TruncateAt.MARQUEE;
        }
        return TextUtils.TruncateAt.END;
    }

    public void setScrimsShown(boolean z) {
        setScrimsShown(z, InvalidTypeIdException.onSeekTo(this) && !isInEditMode());
    }

    public void setScrimsShown(boolean z, boolean z2) {
        if (this.onPlayFromSearch != z) {
            if (z2) {
                write(z ? 255 : 0);
            } else {
                RemoteActionCompatParcelizer(z ? 255 : 0);
            }
            this.onPlayFromSearch = z;
        }
    }

    private void write(int i) {
        TimeInterpolator timeInterpolator;
        IconCompatParcelizer();
        ValueAnimator valueAnimator = this.onPlay;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.onPlay = valueAnimator2;
            if (i > this.onAddQueueItem) {
                timeInterpolator = this.onPlayFromMediaId;
            } else {
                timeInterpolator = this.onPause;
            }
            valueAnimator2.setInterpolator(timeInterpolator);
            this.onPlay.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.appbar.CollapsingToolbarLayout.4
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    CollapsingToolbarLayout.this.RemoteActionCompatParcelizer(((Integer) valueAnimator3.getAnimatedValue()).intValue());
                }
            });
        } else if (valueAnimator.isRunning()) {
            this.onPlay.cancel();
        }
        this.onPlay.setDuration(this.onMediaButtonEvent);
        this.onPlay.setIntValues(this.onAddQueueItem, i);
        this.onPlay.start();
    }

    final void RemoteActionCompatParcelizer(int i) {
        ViewGroup viewGroup;
        if (i != this.onAddQueueItem) {
            if (this.AudioAttributesImplApi26Parcelizer != null && (viewGroup = this.onPrepareFromMediaId) != null) {
                InvalidTypeIdException.onRemoveQueueItem(viewGroup);
            }
            this.onAddQueueItem = i;
            InvalidTypeIdException.onRemoveQueueItem(this);
        }
    }

    public void setContentScrim(Drawable drawable) {
        Drawable drawable2 = this.AudioAttributesImplApi26Parcelizer;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.AudioAttributesImplApi26Parcelizer = drawableMutate;
            if (drawableMutate != null) {
                read(drawableMutate, getWidth(), getHeight());
                this.AudioAttributesImplApi26Parcelizer.setCallback(this);
                this.AudioAttributesImplApi26Parcelizer.setAlpha(this.onAddQueueItem);
            }
            InvalidTypeIdException.onRemoveQueueItem(this);
        }
    }

    public void setContentScrimColor(int i) {
        setContentScrim(new ColorDrawable(i));
    }

    public void setContentScrimResource(int i) {
        setContentScrim(_isNaN.getDrawable(getContext(), i));
    }

    public void setStatusBarScrim(Drawable drawable) {
        Drawable drawable2 = this.AudioAttributesCompatParcelizer;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.AudioAttributesCompatParcelizer = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.AudioAttributesCompatParcelizer.setState(getDrawableState());
                }
                findFormatOverrides.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, InvalidTypeIdException.MediaBrowserCompatMediaItem(this));
                this.AudioAttributesCompatParcelizer.setVisible(getVisibility() == 0, false);
                this.AudioAttributesCompatParcelizer.setCallback(this);
                this.AudioAttributesCompatParcelizer.setAlpha(this.onAddQueueItem);
            }
            InvalidTypeIdException.onRemoveQueueItem(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.AudioAttributesCompatParcelizer;
        boolean state = (drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState);
        Drawable drawable2 = this.AudioAttributesImplApi26Parcelizer;
        if (drawable2 != null && drawable2.isStateful()) {
            state |= drawable2.setState(drawableState);
        }
        ExtractorUtil extractorUtil = this.RemoteActionCompatParcelizer;
        if (extractorUtil != null) {
            state |= extractorUtil.RemoteActionCompatParcelizer(drawableState);
        }
        if (state) {
            invalidate();
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.AudioAttributesImplApi26Parcelizer || drawable == this.AudioAttributesCompatParcelizer;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.AudioAttributesCompatParcelizer;
        if (drawable != null && drawable.isVisible() != z) {
            this.AudioAttributesCompatParcelizer.setVisible(z, false);
        }
        Drawable drawable2 = this.AudioAttributesImplApi26Parcelizer;
        if (drawable2 == null || drawable2.isVisible() == z) {
            return;
        }
        this.AudioAttributesImplApi26Parcelizer.setVisible(z, false);
    }

    public void setStatusBarScrimColor(int i) {
        setStatusBarScrim(new ColorDrawable(i));
    }

    public void setStatusBarScrimResource(int i) {
        setStatusBarScrim(_isNaN.getDrawable(getContext(), i));
    }

    public void setCollapsedTitleTextAppearance(int i) {
        this.RemoteActionCompatParcelizer.write(i);
    }

    public void setCollapsedTitleTextColor(int i) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setCollapsedTitleTextColor(ColorStateList colorStateList) {
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(colorStateList);
    }

    public void setCollapsedTitleGravity(int i) {
        this.RemoteActionCompatParcelizer.read(i);
    }

    public void setExpandedTitleTextAppearance(int i) {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(i);
    }

    public void setExpandedTitleColor(int i) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i));
    }

    public void setExpandedTitleTextColor(ColorStateList colorStateList) {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(colorStateList);
    }

    public void setExpandedTitleGravity(int i) {
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(i);
    }

    public void setExpandedTitleTextSize(float f) {
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(f);
    }

    public void setCollapsedTitleTextSize(float f) {
        this.RemoteActionCompatParcelizer.write(f);
    }

    public void setCollapsedTitleTypeface(Typeface typeface) {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(typeface);
    }

    public void setExpandedTitleTypeface(Typeface typeface) {
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(typeface);
    }

    public void setExpandedTitleMargin(int i, int i2, int i3, int i4) {
        this.MediaBrowserCompatMediaItem = i;
        this.MediaDescriptionCompat = i2;
        this.MediaBrowserCompatSearchResultReceiver = i3;
        this.MediaMetadataCompat = i4;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i) {
        this.MediaBrowserCompatMediaItem = i;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i) {
        this.MediaDescriptionCompat = i;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i) {
        this.MediaBrowserCompatSearchResultReceiver = i;
        requestLayout();
    }

    public void setExpandedTitleMarginBottom(int i) {
        this.MediaMetadataCompat = i;
        requestLayout();
    }

    public void setMaxLines(int i) {
        this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver(i);
    }

    public void setLineSpacingAdd(float f) {
        this.RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer(f);
    }

    public void setLineSpacingMultiplier(float f) {
        this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver(f);
    }

    public void setHyphenationFrequency(int i) {
        this.RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer(i);
    }

    public void setStaticLayoutBuilderConfigurer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(audioAttributesCompatParcelizer);
    }

    public void setRtlTextDirectionHeuristicsEnabled(boolean z) {
        this.RemoteActionCompatParcelizer.read(z);
    }

    public void setForceApplySystemWindowInsetTop(boolean z) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = z;
    }

    public void setExtraMultilineHeightEnabled(boolean z) {
        this.handleMediaPlayPauseIfPendingOnHandler = z;
    }

    public void setScrimVisibleHeightTrigger(int i) {
        if (this.onFastForward != i) {
            this.onFastForward = i;
            RemoteActionCompatParcelizer();
        }
    }

    public final int write() {
        int i = this.onFastForward;
        if (i >= 0) {
            return i + this.onSeekTo + this.RatingCompat;
        }
        WindowInsetsCompat windowInsetsCompat = this.read;
        int iMediaBrowserCompatCustomActionResultReceiver = windowInsetsCompat != null ? windowInsetsCompat.MediaBrowserCompatCustomActionResultReceiver() : 0;
        int iRatingCompat = InvalidTypeIdException.RatingCompat(this);
        if (iRatingCompat > 0) {
            return Math.min((iRatingCompat << 1) + iMediaBrowserCompatCustomActionResultReceiver, getHeight());
        }
        return getHeight() / 3;
    }

    public void setTitlePositionInterpolator(TimeInterpolator timeInterpolator) {
        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(timeInterpolator);
    }

    public void setScrimAnimationDuration(long j) {
        this.onMediaButtonEvent = j;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    private static LayoutParams MediaBrowserCompatItemReceiver() {
        return new LayoutParams();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    private static FrameLayout.LayoutParams AudioAttributesCompatParcelizer(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public static class LayoutParams extends FrameLayout.LayoutParams {
        int AudioAttributesCompatParcelizer;
        float read;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.AudioAttributesCompatParcelizer = 0;
            this.read = 0.5f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.CollapsingToolbarLayout_Layout);
            this.AudioAttributesCompatParcelizer = typedArrayObtainStyledAttributes.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.CollapsingToolbarLayout_Layout_layout_collapseMode, 0);
            RemoteActionCompatParcelizer(typedArrayObtainStyledAttributes.getFloat(calculateNextSearchBytePosition.MediaMetadataCompat.CollapsingToolbarLayout_Layout_layout_collapseParallaxMultiplier, 0.5f));
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams() {
            super(-1, -1);
            this.AudioAttributesCompatParcelizer = 0;
            this.read = 0.5f;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.AudioAttributesCompatParcelizer = 0;
            this.read = 0.5f;
        }

        private void RemoteActionCompatParcelizer(float f) {
            this.read = f;
        }
    }

    final void RemoteActionCompatParcelizer() {
        if (this.AudioAttributesImplApi26Parcelizer == null && this.AudioAttributesCompatParcelizer == null) {
            return;
        }
        setScrimsShown(getHeight() + this.IconCompatParcelizer < write());
    }

    final int write(View view) {
        return ((getHeight() - IconCompatParcelizer(view).read()) - view.getHeight()) - ((ViewGroup.MarginLayoutParams) ((LayoutParams) view.getLayoutParams())).bottomMargin;
    }

    private void AudioAttributesImplBaseParcelizer() {
        setContentDescription(AudioAttributesImplApi26Parcelizer());
    }

    class RemoteActionCompatParcelizer implements AppBarLayout.write {
        RemoteActionCompatParcelizer() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.AudioAttributesCompatParcelizer
        public final void IconCompatParcelizer(AppBarLayout appBarLayout, int i) {
            CollapsingToolbarLayout.this.IconCompatParcelizer = i;
            int iMediaBrowserCompatCustomActionResultReceiver = CollapsingToolbarLayout.this.read != null ? CollapsingToolbarLayout.this.read.MediaBrowserCompatCustomActionResultReceiver() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i2);
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                underestimatedResult underestimatedresultIconCompatParcelizer = CollapsingToolbarLayout.IconCompatParcelizer(childAt);
                int i3 = layoutParams.AudioAttributesCompatParcelizer;
                if (i3 == 1) {
                    underestimatedresultIconCompatParcelizer.IconCompatParcelizer(StdKeyDeserializer.read(-i, 0, CollapsingToolbarLayout.this.write(childAt)));
                } else if (i3 == 2) {
                    underestimatedresultIconCompatParcelizer.IconCompatParcelizer(Math.round((-i) * layoutParams.read));
                }
            }
            CollapsingToolbarLayout.this.RemoteActionCompatParcelizer();
            if (CollapsingToolbarLayout.this.AudioAttributesCompatParcelizer != null && iMediaBrowserCompatCustomActionResultReceiver > 0) {
                InvalidTypeIdException.onRemoveQueueItem(CollapsingToolbarLayout.this);
            }
            int height = CollapsingToolbarLayout.this.getHeight();
            int iRatingCompat = (height - InvalidTypeIdException.RatingCompat(CollapsingToolbarLayout.this)) - iMediaBrowserCompatCustomActionResultReceiver;
            float fWrite = height - CollapsingToolbarLayout.this.write();
            float f = iRatingCompat;
            CollapsingToolbarLayout.this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(Math.min(1.0f, fWrite / f));
            CollapsingToolbarLayout.this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(CollapsingToolbarLayout.this.IconCompatParcelizer + iRatingCompat);
            CollapsingToolbarLayout.this.RemoteActionCompatParcelizer.read(Math.abs(i) / f);
        }
    }
}
