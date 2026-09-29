package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.ActionBarLayoutParams;
import kotlin.InvalidTypeIdException;
import kotlin._init_lambda5;
import kotlin._verifyEndArrayForSingle;
import kotlin.peekAvailableContext;
import kotlin.removeCancellable;
import kotlin.resetAsArray;
import kotlin.resetAsObject;
import kotlin.rootArrayScope;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements removeCancellable, resetAsArray, resetAsObject {
    private static int[] write = {_init_lambda5.read.actionBarSize, R.attr.windowContentOverlay};
    ViewPropertyAnimator AudioAttributesCompatParcelizer;
    private WindowInsetsCompat AudioAttributesImplApi21Parcelizer;
    private IconCompatParcelizer AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    ActionBarContainer IconCompatParcelizer;
    private final Runnable MediaBrowserCompatCustomActionResultReceiver;
    private final Rect MediaBrowserCompatItemReceiver;
    private final Rect MediaBrowserCompatMediaItem;
    private ActionBarLayoutParams MediaBrowserCompatSearchResultReceiver;
    private boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private OverScroller MediaDescriptionCompat;
    private ContentFrameLayout MediaMetadataCompat;
    private final Rect RatingCompat;
    final AnimatorListenerAdapter RemoteActionCompatParcelizer;
    private int handleMediaPlayPauseIfPendingOnHandler;
    private boolean onAddQueueItem;
    private WindowInsetsCompat onCommand;
    private boolean onCustomAction;
    private final Rect onFastForward;
    private WindowInsetsCompat onMediaButtonEvent;
    private final Rect onPause;
    private WindowInsetsCompat onPlay;
    private final Rect onPlayFromMediaId;
    private final Runnable onPlayFromSearch;
    private final Rect onPlayFromUri;
    private final rootArrayScope onPrepare;
    private int onPrepareFromMediaId;
    private boolean onPrepareFromSearch;
    private int onPrepareFromUri;
    private Drawable onRemoveQueueItemAt;
    boolean read;

    public interface IconCompatParcelizer {
        void AudioAttributesImplApi21Parcelizer(boolean z);

        void MediaBrowserCompatSearchResultReceiver();

        void MediaDescriptionCompat();

        void MediaMetadataCompat();

        void RemoteActionCompatParcelizer(int i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
    }

    public void setShowingForActionMode(boolean z) {
    }

    public void setUiOptions(int i) {
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    protected /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return MediaBrowserCompatSearchResultReceiver();
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.onPrepareFromUri = 0;
        this.MediaBrowserCompatItemReceiver = new Rect();
        this.onPause = new Rect();
        this.MediaBrowserCompatMediaItem = new Rect();
        this.RatingCompat = new Rect();
        this.onFastForward = new Rect();
        this.onPlayFromMediaId = new Rect();
        this.onPlayFromUri = new Rect();
        this.AudioAttributesImplApi21Parcelizer = WindowInsetsCompat.IconCompatParcelizer;
        this.onMediaButtonEvent = WindowInsetsCompat.IconCompatParcelizer;
        this.onCommand = WindowInsetsCompat.IconCompatParcelizer;
        this.onPlay = WindowInsetsCompat.IconCompatParcelizer;
        this.RemoteActionCompatParcelizer = new AnimatorListenerAdapter() { // from class: androidx.appcompat.widget.ActionBarOverlayLayout.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                ActionBarOverlayLayout.this.AudioAttributesCompatParcelizer = null;
                ActionBarOverlayLayout.this.read = false;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                ActionBarOverlayLayout.this.AudioAttributesCompatParcelizer = null;
                ActionBarOverlayLayout.this.read = false;
            }
        };
        this.onPlayFromSearch = new Runnable() { // from class: androidx.appcompat.widget.ActionBarOverlayLayout.2
            @Override // java.lang.Runnable
            public final void run() {
                ActionBarOverlayLayout.this.AudioAttributesCompatParcelizer();
                ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
                actionBarOverlayLayout.AudioAttributesCompatParcelizer = actionBarOverlayLayout.IconCompatParcelizer.animate().translationY(BitmapDescriptorFactory.HUE_RED).setListener(ActionBarOverlayLayout.this.RemoteActionCompatParcelizer);
            }
        };
        this.MediaBrowserCompatCustomActionResultReceiver = new Runnable() { // from class: androidx.appcompat.widget.ActionBarOverlayLayout.4
            @Override // java.lang.Runnable
            public final void run() {
                ActionBarOverlayLayout.this.AudioAttributesCompatParcelizer();
                ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
                actionBarOverlayLayout.AudioAttributesCompatParcelizer = actionBarOverlayLayout.IconCompatParcelizer.animate().translationY(-ActionBarOverlayLayout.this.IconCompatParcelizer.getHeight()).setListener(ActionBarOverlayLayout.this.RemoteActionCompatParcelizer);
            }
        };
        IconCompatParcelizer(context);
        this.onPrepare = new rootArrayScope();
    }

    private void IconCompatParcelizer(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(write);
        this.AudioAttributesImplBaseParcelizer = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.onRemoveQueueItemAt = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.onCustomAction = context.getApplicationInfo().targetSdkVersion < 19;
        this.MediaDescriptionCompat = new OverScroller(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AudioAttributesCompatParcelizer();
    }

    public void setActionBarVisibilityCallback(IconCompatParcelizer iconCompatParcelizer) {
        this.AudioAttributesImplApi26Parcelizer = iconCompatParcelizer;
        if (getWindowToken() != null) {
            this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(this.onPrepareFromUri);
            int i = this.onPrepareFromMediaId;
            if (i != 0) {
                onWindowSystemUiVisibilityChanged(i);
                InvalidTypeIdException.onSetRepeatMode(this);
            }
        }
    }

    public void setOverlayMode(boolean z) {
        this.onPrepareFromSearch = z;
        this.onCustomAction = z && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public final boolean read() {
        return this.onPrepareFromSearch;
    }

    public void setHasNonEmbeddedTabs(boolean z) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = z;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        IconCompatParcelizer(getContext());
        InvalidTypeIdException.onSetRepeatMode(this);
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i) {
        super.onWindowSystemUiVisibilityChanged(i);
        MediaMetadataCompat();
        int i2 = this.onPrepareFromMediaId;
        this.onPrepareFromMediaId = i;
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 256) != 0;
        IconCompatParcelizer iconCompatParcelizer = this.AudioAttributesImplApi26Parcelizer;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.AudioAttributesImplApi21Parcelizer(!z2);
            if (z || !z2) {
                this.AudioAttributesImplApi26Parcelizer.MediaBrowserCompatSearchResultReceiver();
            } else {
                this.AudioAttributesImplApi26Parcelizer.MediaDescriptionCompat();
            }
        }
        if (((i ^ i2) & 256) == 0 || this.AudioAttributesImplApi26Parcelizer == null) {
            return;
        }
        InvalidTypeIdException.onSetRepeatMode(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        this.onPrepareFromUri = i;
        IconCompatParcelizer iconCompatParcelizer = this.AudioAttributesImplApi26Parcelizer;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.RemoteActionCompatParcelizer(i);
        }
    }

    private static boolean RemoteActionCompatParcelizer(View view, Rect rect, boolean z) {
        boolean z2;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (((ViewGroup.MarginLayoutParams) layoutParams).leftMargin != rect.left) {
            ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = rect.left;
            z2 = true;
        } else {
            z2 = false;
        }
        if (((ViewGroup.MarginLayoutParams) layoutParams).topMargin != rect.top) {
            ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = rect.top;
            z2 = true;
        }
        if (((ViewGroup.MarginLayoutParams) layoutParams).rightMargin != rect.right) {
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = rect.right;
            z2 = true;
        }
        if (!z || ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin == rect.bottom) {
            return z2;
        }
        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = rect.bottom;
        return true;
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        MediaMetadataCompat();
        WindowInsetsCompat windowInsetsCompatWrite = WindowInsetsCompat.write(windowInsets, this);
        boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this.IconCompatParcelizer, new Rect(windowInsetsCompatWrite.AudioAttributesImplApi21Parcelizer(), windowInsetsCompatWrite.MediaBrowserCompatCustomActionResultReceiver(), windowInsetsCompatWrite.MediaBrowserCompatItemReceiver(), windowInsetsCompatWrite.AudioAttributesImplBaseParcelizer()), false);
        InvalidTypeIdException.AudioAttributesCompatParcelizer(this, windowInsetsCompatWrite, this.MediaBrowserCompatItemReceiver);
        WindowInsetsCompat windowInsetsCompatIconCompatParcelizer = windowInsetsCompatWrite.IconCompatParcelizer(this.MediaBrowserCompatItemReceiver.left, this.MediaBrowserCompatItemReceiver.top, this.MediaBrowserCompatItemReceiver.right, this.MediaBrowserCompatItemReceiver.bottom);
        this.AudioAttributesImplApi21Parcelizer = windowInsetsCompatIconCompatParcelizer;
        if (!this.onMediaButtonEvent.equals(windowInsetsCompatIconCompatParcelizer)) {
            this.onMediaButtonEvent = this.AudioAttributesImplApi21Parcelizer;
            zRemoteActionCompatParcelizer = true;
        }
        if (!this.onPause.equals(this.MediaBrowserCompatItemReceiver)) {
            this.onPause.set(this.MediaBrowserCompatItemReceiver);
        } else {
            if (zRemoteActionCompatParcelizer) {
            }
            return windowInsetsCompatWrite.read().IconCompatParcelizer().write().MediaBrowserCompatMediaItem();
        }
        requestLayout();
        return windowInsetsCompatWrite.read().IconCompatParcelizer().write().MediaBrowserCompatMediaItem();
    }

    private static LayoutParams MediaBrowserCompatSearchResultReceiver() {
        return new LayoutParams();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int measuredHeight;
        MediaMetadataCompat();
        measureChildWithMargins(this.IconCompatParcelizer, i, 0, i2, 0);
        LayoutParams layoutParams = (LayoutParams) this.IconCompatParcelizer.getLayoutParams();
        int iMax = Math.max(0, this.IconCompatParcelizer.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
        int iMax2 = Math.max(0, this.IconCompatParcelizer.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.IconCompatParcelizer.getMeasuredState());
        boolean z = (InvalidTypeIdException.onPause(this) & 256) != 0;
        if (z) {
            measuredHeight = this.AudioAttributesImplBaseParcelizer;
            if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver && this.IconCompatParcelizer.RemoteActionCompatParcelizer() != null) {
                measuredHeight += this.AudioAttributesImplBaseParcelizer;
            }
        } else {
            measuredHeight = this.IconCompatParcelizer.getVisibility() != 8 ? this.IconCompatParcelizer.getMeasuredHeight() : 0;
        }
        this.MediaBrowserCompatMediaItem.set(this.MediaBrowserCompatItemReceiver);
        WindowInsetsCompat windowInsetsCompat = this.AudioAttributesImplApi21Parcelizer;
        this.onCommand = windowInsetsCompat;
        if (!this.onPrepareFromSearch && !z) {
            this.MediaBrowserCompatMediaItem.top += measuredHeight;
            Rect rect = this.MediaBrowserCompatMediaItem;
            rect.bottom = rect.bottom;
            this.onCommand = this.onCommand.IconCompatParcelizer(0, measuredHeight, 0, 0);
        } else {
            this.onCommand = new WindowInsetsCompat.RemoteActionCompatParcelizer(this.onCommand).write(_verifyEndArrayForSingle.read(windowInsetsCompat.AudioAttributesImplApi21Parcelizer(), this.onCommand.MediaBrowserCompatCustomActionResultReceiver() + measuredHeight, this.onCommand.MediaBrowserCompatItemReceiver(), this.onCommand.AudioAttributesImplBaseParcelizer())).write();
        }
        RemoteActionCompatParcelizer(this.MediaMetadataCompat, this.MediaBrowserCompatMediaItem, true);
        if (!this.onPlay.equals(this.onCommand)) {
            WindowInsetsCompat windowInsetsCompat2 = this.onCommand;
            this.onPlay = windowInsetsCompat2;
            InvalidTypeIdException.write(this.MediaMetadataCompat, windowInsetsCompat2);
        }
        measureChildWithMargins(this.MediaMetadataCompat, i, 0, i2, 0);
        LayoutParams layoutParams2 = (LayoutParams) this.MediaMetadataCompat.getLayoutParams();
        int iMax3 = Math.max(iMax, this.MediaMetadataCompat.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
        int iMax4 = Math.max(iMax2, this.MediaMetadataCompat.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.MediaMetadataCompat.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i2, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i6 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + paddingLeft;
                int i7 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + paddingTop;
                childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
            }
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.onRemoveQueueItemAt == null || this.onCustomAction) {
            return;
        }
        int bottom = this.IconCompatParcelizer.getVisibility() == 0 ? (int) (this.IconCompatParcelizer.getBottom() + this.IconCompatParcelizer.getTranslationY() + 0.5f) : 0;
        this.onRemoveQueueItemAt.setBounds(0, bottom, getWidth(), this.onRemoveQueueItemAt.getIntrinsicHeight() + bottom);
        this.onRemoveQueueItemAt.draw(canvas);
    }

    @Override // kotlin.resetAsObject
    public void read(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        AudioAttributesCompatParcelizer(view, i, i2, i3, i4, i5);
    }

    @Override // kotlin.resetAsArray
    public boolean IconCompatParcelizer(View view, View view2, int i, int i2) {
        return i2 == 0 && onStartNestedScroll(view, view2, i);
    }

    @Override // kotlin.resetAsArray
    public void read(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    @Override // kotlin.resetAsArray
    public void RemoteActionCompatParcelizer(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // kotlin.resetAsArray
    public void AudioAttributesCompatParcelizer(View view, int i, int i2, int i3, int i4, int i5) {
        if (i5 == 0) {
            onNestedScroll(view, i, i2, i3, i4);
        }
    }

    @Override // kotlin.resetAsArray
    public void RemoteActionCompatParcelizer(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        if ((i & 2) == 0 || this.IconCompatParcelizer.getVisibility() != 0) {
            return false;
        }
        return this.onAddQueueItem;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.onPrepare.IconCompatParcelizer(i);
        this.handleMediaPlayPauseIfPendingOnHandler = MediaBrowserCompatMediaItem();
        AudioAttributesCompatParcelizer();
        IconCompatParcelizer iconCompatParcelizer = this.AudioAttributesImplApi26Parcelizer;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.MediaMetadataCompat();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        int i5 = this.handleMediaPlayPauseIfPendingOnHandler + i2;
        this.handleMediaPlayPauseIfPendingOnHandler = i5;
        setActionBarHideOffset(i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (!this.onAddQueueItem || this.read) {
            return;
        }
        if (this.handleMediaPlayPauseIfPendingOnHandler <= this.IconCompatParcelizer.getHeight()) {
            RatingCompat();
        } else {
            MediaBrowserCompatCustomActionResultReceiver();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (!this.onAddQueueItem || !z) {
            return false;
        }
        if (RemoteActionCompatParcelizer(f2)) {
            AudioAttributesImplApi26Parcelizer();
        } else {
            MediaDescriptionCompat();
        }
        this.read = true;
        return true;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.onPrepare.IconCompatParcelizer();
    }

    private void MediaMetadataCompat() {
        if (this.MediaMetadataCompat == null) {
            this.MediaMetadataCompat = (ContentFrameLayout) findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.action_bar_activity_content);
            this.IconCompatParcelizer = (ActionBarContainer) findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.action_bar_container);
            this.MediaBrowserCompatSearchResultReceiver = read(findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.action_bar));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static ActionBarLayoutParams read(View view) {
        if (view instanceof ActionBarLayoutParams) {
            return (ActionBarLayoutParams) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).handleMediaPlayPauseIfPendingOnHandler();
        }
        StringBuilder sb = new StringBuilder("Can't make a decor toolbar out of ");
        sb.append(view.getClass().getSimpleName());
        throw new IllegalStateException(sb.toString());
    }

    public void setHideOnContentScrollEnabled(boolean z) {
        if (z != this.onAddQueueItem) {
            this.onAddQueueItem = z;
            if (z) {
                return;
            }
            AudioAttributesCompatParcelizer();
            setActionBarHideOffset(0);
        }
    }

    private int MediaBrowserCompatMediaItem() {
        ActionBarContainer actionBarContainer = this.IconCompatParcelizer;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    public void setActionBarHideOffset(int i) {
        AudioAttributesCompatParcelizer();
        this.IconCompatParcelizer.setTranslationY(-Math.max(0, Math.min(i, this.IconCompatParcelizer.getHeight())));
    }

    final void AudioAttributesCompatParcelizer() {
        removeCallbacks(this.onPlayFromSearch);
        removeCallbacks(this.MediaBrowserCompatCustomActionResultReceiver);
        ViewPropertyAnimator viewPropertyAnimator = this.AudioAttributesCompatParcelizer;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    private void RatingCompat() {
        AudioAttributesCompatParcelizer();
        postDelayed(this.onPlayFromSearch, 600L);
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        AudioAttributesCompatParcelizer();
        postDelayed(this.MediaBrowserCompatCustomActionResultReceiver, 600L);
    }

    private void MediaDescriptionCompat() {
        AudioAttributesCompatParcelizer();
        this.onPlayFromSearch.run();
    }

    private void AudioAttributesImplApi26Parcelizer() {
        AudioAttributesCompatParcelizer();
        this.MediaBrowserCompatCustomActionResultReceiver.run();
    }

    private boolean RemoteActionCompatParcelizer(float f) {
        this.MediaDescriptionCompat.fling(0, 0, 0, (int) f, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.MediaDescriptionCompat.getFinalY() > this.IconCompatParcelizer.getHeight();
    }

    @Override // kotlin.removeCancellable
    public void setWindowCallback(Window.Callback callback) {
        MediaMetadataCompat();
        this.MediaBrowserCompatSearchResultReceiver.read(callback);
    }

    @Override // kotlin.removeCancellable
    public void setWindowTitle(CharSequence charSequence) {
        MediaMetadataCompat();
        this.MediaBrowserCompatSearchResultReceiver.write(charSequence);
    }

    @Override // kotlin.removeCancellable
    public final void IconCompatParcelizer(int i) {
        MediaMetadataCompat();
        if (i == 2 || i == 5 || i != 109) {
            return;
        }
        setOverlayMode(true);
    }

    public void setIcon(int i) {
        MediaMetadataCompat();
        this.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer(i);
    }

    public void setIcon(Drawable drawable) {
        MediaMetadataCompat();
        this.MediaBrowserCompatSearchResultReceiver.read(drawable);
    }

    public void setLogo(int i) {
        MediaMetadataCompat();
        this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(i);
    }

    @Override // kotlin.removeCancellable
    public final boolean write() {
        MediaMetadataCompat();
        return this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer();
    }

    @Override // kotlin.removeCancellable
    public final boolean AudioAttributesImplApi21Parcelizer() {
        MediaMetadataCompat();
        return this.MediaBrowserCompatSearchResultReceiver.MediaMetadataCompat();
    }

    @Override // kotlin.removeCancellable
    public final boolean MediaBrowserCompatItemReceiver() {
        MediaMetadataCompat();
        return this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatSearchResultReceiver();
    }

    @Override // kotlin.removeCancellable
    public final boolean AudioAttributesImplBaseParcelizer() {
        MediaMetadataCompat();
        return this.MediaBrowserCompatSearchResultReceiver.RatingCompat();
    }

    @Override // kotlin.removeCancellable
    public final boolean RemoteActionCompatParcelizer() {
        MediaMetadataCompat();
        return this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatCustomActionResultReceiver();
    }

    @Override // kotlin.removeCancellable
    public void setMenuPrepared() {
        MediaMetadataCompat();
        this.MediaBrowserCompatSearchResultReceiver.MediaBrowserCompatMediaItem();
    }

    @Override // kotlin.removeCancellable
    public void setMenu(Menu menu, peekAvailableContext.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        MediaMetadataCompat();
        this.MediaBrowserCompatSearchResultReceiver.RemoteActionCompatParcelizer(menu, audioAttributesCompatParcelizer);
    }

    @Override // kotlin.removeCancellable
    public final void IconCompatParcelizer() {
        MediaMetadataCompat();
        this.MediaBrowserCompatSearchResultReceiver.write();
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }
}
