package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.IgnoredPropertyException;
import kotlin.InvalidTypeIdException;
import kotlin._badFormat;
import kotlin._byteOverflow;
import kotlin.addValue;
import kotlin.byteFromChars;
import kotlin.deserializeUsingCustom;
import kotlin.emptyList;
import kotlin.forPOJO;
import kotlin.hasSuperClassStartingWith;
import kotlin.memberMethods;
import kotlin.resetAsObject;
import kotlin.rootArrayScope;
import kotlin.rootObjectScope;

/* JADX INFO: loaded from: classes2.dex */
public class NestedScrollView extends FrameLayout implements resetAsObject, addValue {
    private static final float IconCompatParcelizer = (float) (Math.log(0.78d) / Math.log(0.9d));
    private static final IconCompatParcelizer RemoteActionCompatParcelizer = new IconCompatParcelizer();
    private static final int[] read = {R.attr.fillViewport};
    final read AudioAttributesCompatParcelizer;
    private byteFromChars AudioAttributesImplApi21Parcelizer;
    private final rootObjectScope AudioAttributesImplApi26Parcelizer;
    private EdgeEffect AudioAttributesImplBaseParcelizer;
    private View MediaBrowserCompatCustomActionResultReceiver;
    private EdgeEffect MediaBrowserCompatItemReceiver;
    private boolean MediaBrowserCompatMediaItem;
    private boolean MediaBrowserCompatSearchResultReceiver;
    private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private boolean MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private boolean RatingCompat;
    private int handleMediaPlayPauseIfPendingOnHandler;
    private int onAddQueueItem;
    private int onCommand;
    private long onCustomAction;
    private final rootArrayScope onFastForward;
    private write onMediaButtonEvent;
    private SavedState onPause;
    private final int[] onPlay;
    private final float onPlayFromMediaId;
    private IgnoredPropertyException onPlayFromSearch;
    private boolean onPlayFromUri;
    private final Rect onPrepare;
    private final int[] onPrepareFromMediaId;
    private OverScroller onPrepareFromSearch;
    private VelocityTracker onPrepareFromUri;
    private int onRewind;
    private float onSeekTo;
    private int write;

    public interface write {
        void read(NestedScrollView nestedScrollView, int i, int i2, int i3, int i4);
    }

    private static int IconCompatParcelizer(int i, int i2, int i3) {
        if (i2 >= i3 || i < 0) {
            return 0;
        }
        return i2 + i > i3 ? i3 - i2 : i;
    }

    @Override // kotlin.resetAsArray
    public boolean IconCompatParcelizer(View view, View view2, int i, int i2) {
        return (i & 2) != 0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, _byteOverflow.RemoteActionCompatParcelizer.nestedScrollViewStyle);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.onPrepare = new Rect();
        this.MediaDescriptionCompat = true;
        this.MediaBrowserCompatSearchResultReceiver = false;
        this.MediaBrowserCompatCustomActionResultReceiver = null;
        this.RatingCompat = false;
        this.onPlayFromUri = true;
        this.write = -1;
        this.onPrepareFromMediaId = new int[2];
        this.onPlay = new int[2];
        read readVar = new read();
        this.AudioAttributesCompatParcelizer = readVar;
        this.AudioAttributesImplApi21Parcelizer = new byteFromChars(getContext(), readVar);
        this.MediaBrowserCompatItemReceiver = memberMethods.AudioAttributesCompatParcelizer(context, attributeSet);
        this.AudioAttributesImplBaseParcelizer = memberMethods.AudioAttributesCompatParcelizer(context, attributeSet);
        this.onPlayFromMediaId = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        AudioAttributesImplApi26Parcelizer();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, read, i, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.onFastForward = new rootArrayScope();
        this.AudioAttributesImplApi26Parcelizer = new rootObjectScope(this);
        setNestedScrollingEnabled(true);
        InvalidTypeIdException.AudioAttributesCompatParcelizer(this, RemoteActionCompatParcelizer);
    }

    private void write(int i, int i2, int[] iArr, int i3, int[] iArr2) {
        this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(0, i, 0, i2, iArr, i3, iArr2);
    }

    private boolean write(int i, int i2) {
        return this.AudioAttributesImplApi26Parcelizer.read(i, i2);
    }

    private void RatingCompat(int i) {
        this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(i);
    }

    private boolean MediaDescriptionCompat(int i) {
        return this.AudioAttributesImplApi26Parcelizer.read(i);
    }

    private boolean RemoteActionCompatParcelizer(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        return this.AudioAttributesImplApi26Parcelizer.write(i, i2, iArr, iArr2, i3);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.AudioAttributesImplApi26Parcelizer.write(z);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.AudioAttributesImplApi26Parcelizer.read();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return write(i, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        RatingCompat(0);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return MediaDescriptionCompat(0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return RemoteActionCompatParcelizer(i, i2, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(f, f2);
    }

    @Override // kotlin.resetAsObject
    public void read(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        RemoteActionCompatParcelizer(i4, i5, iArr);
    }

    private void RemoteActionCompatParcelizer(int i, int i2, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer(0, scrollY2, 0, i - scrollY2, null, i2, iArr);
    }

    @Override // kotlin.resetAsArray
    public void read(View view, View view2, int i, int i2) {
        this.onFastForward.write(i, i2);
        write(2, i2);
    }

    @Override // kotlin.resetAsArray
    public void RemoteActionCompatParcelizer(View view, int i) {
        this.onFastForward.read(i);
        RatingCompat(i);
    }

    @Override // kotlin.resetAsArray
    public void AudioAttributesCompatParcelizer(View view, int i, int i2, int i3, int i4, int i5) {
        RemoteActionCompatParcelizer(i4, i5, null);
    }

    @Override // kotlin.resetAsArray
    public void RemoteActionCompatParcelizer(View view, int i, int i2, int[] iArr, int i3) {
        RemoteActionCompatParcelizer(i, i2, iArr, (int[]) null, i3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return IconCompatParcelizer(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        read(view, view2, i, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        RemoteActionCompatParcelizer(view, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        RemoteActionCompatParcelizer(i4, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        RemoteActionCompatParcelizer(view, i, i2, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        if (z) {
            return false;
        }
        dispatchNestedFling(BitmapDescriptorFactory.HUE_RED, f2, true);
        AudioAttributesCompatParcelizer((int) f2);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.onFastForward.IconCompatParcelizer();
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    private int MediaDescriptionCompat() {
        return (int) (getHeight() * 0.5f);
    }

    private void AudioAttributesImplApi26Parcelizer() {
        this.onPrepareFromSearch = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.onRewind = viewConfiguration.getScaledTouchSlop();
        this.onAddQueueItem = viewConfiguration.getScaledMinimumFlingVelocity();
        this.handleMediaPlayPauseIfPendingOnHandler = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, i, layoutParams);
    }

    public void setOnScrollChangeListener(write writeVar) {
        this.onMediaButtonEvent = writeVar;
    }

    private boolean read() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                return true;
            }
        }
        return false;
    }

    public void setFillViewport(boolean z) {
        if (z != this.MediaBrowserCompatMediaItem) {
            this.MediaBrowserCompatMediaItem = z;
            requestLayout();
        }
    }

    public void setSmoothScrollingEnabled(boolean z) {
        this.onPlayFromUri = z;
    }

    @Override // android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        write writeVar = this.onMediaButtonEvent;
        if (writeVar != null) {
            writeVar.read(this, i, i2, i3, i4);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.MediaBrowserCompatMediaItem || View.MeasureSpec.getMode(i2) == 0 || getChildCount() <= 0) {
            return;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int measuredHeight = childAt.getMeasuredHeight();
        int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
        if (measuredHeight < measuredHeight2) {
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            childAt.measure(getChildMeasureSpec(i, paddingLeft + paddingRight + i3 + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.LayoutParams) layoutParams).width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || write(keyEvent);
    }

    public final boolean write(KeyEvent keyEvent) {
        this.onPrepare.setEmpty();
        boolean z = read();
        int i = TsExtractor.TS_STREAM_TYPE_HDMV_DTS;
        if (!z) {
            if (isFocused() && keyEvent.getKeyCode() != 4) {
                View viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
                if (viewFindNextFocus != null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(TsExtractor.TS_STREAM_TYPE_HDMV_DTS)) {
                    return true;
                }
            }
            return false;
        }
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                if (keyEvent.isAltPressed()) {
                    return MediaBrowserCompatCustomActionResultReceiver(33);
                }
                return MediaBrowserCompatItemReceiver(33);
            }
            if (keyCode == 20) {
                if (keyEvent.isAltPressed()) {
                    return MediaBrowserCompatCustomActionResultReceiver(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
                }
                return MediaBrowserCompatItemReceiver(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
            }
            if (keyCode == 62) {
                if (keyEvent.isShiftPressed()) {
                    i = 33;
                }
                MediaBrowserCompatMediaItem(i);
                return false;
            }
            if (keyCode == 92) {
                return MediaBrowserCompatCustomActionResultReceiver(33);
            }
            if (keyCode == 93) {
                return MediaBrowserCompatCustomActionResultReceiver(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
            }
            if (keyCode == 122) {
                MediaBrowserCompatMediaItem(33);
                return false;
            }
            if (keyCode == 123) {
                MediaBrowserCompatMediaItem(TsExtractor.TS_STREAM_TYPE_HDMV_DTS);
                return false;
            }
        }
        return false;
    }

    private boolean IconCompatParcelizer(int i, int i2) {
        if (getChildCount() > 0) {
            int scrollY = getScrollY();
            View childAt = getChildAt(0);
            if (i2 >= childAt.getTop() - scrollY && i2 < childAt.getBottom() - scrollY && i >= childAt.getLeft() && i < childAt.getRight()) {
                return true;
            }
        }
        return false;
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        VelocityTracker velocityTracker = this.onPrepareFromUri;
        if (velocityTracker == null) {
            this.onPrepareFromUri = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void AudioAttributesImplApi21Parcelizer() {
        if (this.onPrepareFromUri == null) {
            this.onPrepareFromUri = VelocityTracker.obtain();
        }
    }

    private void MediaBrowserCompatMediaItem() {
        VelocityTracker velocityTracker = this.onPrepareFromUri;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.onPrepareFromUri = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        if (z) {
            MediaBrowserCompatMediaItem();
        }
        super.requestDisallowInterceptTouchEvent(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        AudioAttributesImplApi21Parcelizer();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(BitmapDescriptorFactory.HUE_RED, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.onPrepareFromUri;
                velocityTracker.computeCurrentVelocity(1000, this.handleMediaPlayPauseIfPendingOnHandler);
                int yVelocity = (int) velocityTracker.getYVelocity(this.write);
                if (Math.abs(yVelocity) >= this.onAddQueueItem) {
                    if (!write(yVelocity)) {
                        int i = -yVelocity;
                        float f = i;
                        if (!dispatchNestedPreFling(BitmapDescriptorFactory.HUE_RED, f)) {
                            dispatchNestedFling(BitmapDescriptorFactory.HUE_RED, f, true);
                            AudioAttributesCompatParcelizer(i);
                        }
                    }
                } else if (this.onPrepareFromSearch.springBack(getScrollX(), getScrollY(), 0, 0, 0, write())) {
                    postInvalidateOnAnimation();
                }
                MediaBrowserCompatItemReceiver();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.write);
                if (iFindPointerIndex != -1) {
                    int y = (int) motionEvent.getY(iFindPointerIndex);
                    int i2 = this.MediaMetadataCompat - y;
                    int iWrite = i2 - write(i2, motionEvent.getX(iFindPointerIndex));
                    if (!this.RatingCompat && Math.abs(iWrite) > this.onRewind) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.RatingCompat = true;
                        iWrite = iWrite > 0 ? iWrite - this.onRewind : iWrite + this.onRewind;
                    }
                    int i3 = iWrite;
                    if (this.RatingCompat) {
                        int i4 = read(i3, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.MediaMetadataCompat = y - i4;
                        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver += i4;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.RatingCompat && getChildCount() > 0 && this.onPrepareFromSearch.springBack(getScrollX(), getScrollY(), 0, 0, 0, write())) {
                    postInvalidateOnAnimation();
                }
                MediaBrowserCompatItemReceiver();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.MediaMetadataCompat = (int) motionEvent.getY(actionIndex);
                this.write = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                write(motionEvent);
                this.MediaMetadataCompat = (int) motionEvent.getY(motionEvent.findPointerIndex(this.write));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.RatingCompat && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.onPrepareFromSearch.isFinished()) {
                AudioAttributesCompatParcelizer();
            }
            AudioAttributesCompatParcelizer((int) motionEvent.getY(), motionEvent.getPointerId(0));
        }
        VelocityTracker velocityTracker2 = this.onPrepareFromUri;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    private void AudioAttributesCompatParcelizer(int i, int i2) {
        this.MediaMetadataCompat = i;
        this.write = i2;
        write(2, 0);
    }

    private void MediaBrowserCompatItemReceiver() {
        this.write = -1;
        this.RatingCompat = false;
        MediaBrowserCompatMediaItem();
        RatingCompat(0);
        this.MediaBrowserCompatItemReceiver.onRelease();
        this.AudioAttributesImplBaseParcelizer.onRelease();
    }

    private int AudioAttributesImplApi21Parcelizer(int i) {
        return read(i, -1, null, 0, 1, true);
    }

    private int read(int i, int i2, MotionEvent motionEvent, int i3, int i4, boolean z) {
        int i5;
        int i6;
        VelocityTracker velocityTracker;
        if (i4 == 1) {
            write(2, i4);
        }
        if (RemoteActionCompatParcelizer(0, i, this.onPlay, this.onPrepareFromMediaId, i4)) {
            i5 = i - this.onPlay[1];
            i6 = this.onPrepareFromMediaId[1];
        } else {
            i5 = i;
            i6 = 0;
        }
        int scrollY = getScrollY();
        int iWrite = write();
        boolean z2 = IconCompatParcelizer() && !z;
        boolean z3 = IconCompatParcelizer(i5, 0, scrollY, iWrite) && !MediaDescriptionCompat(i4);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            AudioAttributesImplBaseParcelizer().IconCompatParcelizer(motionEvent.getDeviceId(), motionEvent.getSource(), i2, scrollY2);
        }
        int[] iArr = this.onPlay;
        iArr[1] = 0;
        write(scrollY2, i5 - scrollY2, this.onPrepareFromMediaId, i4, iArr);
        int i7 = this.onPrepareFromMediaId[1];
        int i8 = i5 - this.onPlay[1];
        int i9 = scrollY + i8;
        if (i9 < 0) {
            if (z2) {
                memberMethods.read(this.MediaBrowserCompatItemReceiver, (-i8) / getHeight(), i3 / getWidth());
                if (motionEvent != null) {
                    AudioAttributesImplBaseParcelizer().RemoteActionCompatParcelizer(motionEvent.getDeviceId(), motionEvent.getSource(), i2, true);
                }
                if (!this.AudioAttributesImplBaseParcelizer.isFinished()) {
                    this.AudioAttributesImplBaseParcelizer.onRelease();
                }
            }
        } else if (i9 > iWrite && z2) {
            memberMethods.read(this.AudioAttributesImplBaseParcelizer, i8 / getHeight(), 1.0f - (i3 / getWidth()));
            if (motionEvent != null) {
                AudioAttributesImplBaseParcelizer().RemoteActionCompatParcelizer(motionEvent.getDeviceId(), motionEvent.getSource(), i2, false);
            }
            if (!this.MediaBrowserCompatItemReceiver.isFinished()) {
                this.MediaBrowserCompatItemReceiver.onRelease();
            }
        }
        if (!this.MediaBrowserCompatItemReceiver.isFinished() || !this.AudioAttributesImplBaseParcelizer.isFinished()) {
            postInvalidateOnAnimation();
        } else if (z3 && i4 == 0 && (velocityTracker = this.onPrepareFromUri) != null) {
            velocityTracker.clear();
        }
        if (i4 == 1) {
            RatingCompat(i4);
            this.MediaBrowserCompatItemReceiver.onRelease();
            this.AudioAttributesImplBaseParcelizer.onRelease();
        }
        return i6 + i7;
    }

    private boolean read(EdgeEffect edgeEffect, int i) {
        if (i > 0) {
            return true;
        }
        return AudioAttributesImplBaseParcelizer(-i) < memberMethods.write(edgeEffect) * ((float) getHeight());
    }

    private int AudioAttributesImplApi26Parcelizer(int i) {
        int height = getHeight();
        if (i > 0 && memberMethods.write(this.MediaBrowserCompatItemReceiver) != BitmapDescriptorFactory.HUE_RED) {
            int iRound = Math.round(((-height) / 4.0f) * memberMethods.read(this.MediaBrowserCompatItemReceiver, ((-i) * 4.0f) / height, 0.5f));
            if (iRound != i) {
                this.MediaBrowserCompatItemReceiver.finish();
            }
            return i - iRound;
        }
        if (i >= 0 || memberMethods.write(this.AudioAttributesImplBaseParcelizer) == BitmapDescriptorFactory.HUE_RED) {
            return i;
        }
        float f = height;
        int iRound2 = Math.round((f / 4.0f) * memberMethods.read(this.AudioAttributesImplBaseParcelizer, (i * 4.0f) / f, 0.5f));
        if (iRound2 != i) {
            this.AudioAttributesImplBaseParcelizer.finish();
        }
        return i - iRound2;
    }

    private float AudioAttributesImplBaseParcelizer(int i) {
        double dLog = Math.log((Math.abs(i) * 0.35f) / (this.onPlayFromMediaId * 0.015f));
        double d = IconCompatParcelizer;
        return (float) (((double) (this.onPlayFromMediaId * 0.015f)) * Math.exp((d / (d - 1.0d)) * dLog));
    }

    private boolean write(int i) {
        if (memberMethods.write(this.MediaBrowserCompatItemReceiver) != BitmapDescriptorFactory.HUE_RED) {
            if (read(this.MediaBrowserCompatItemReceiver, i)) {
                this.MediaBrowserCompatItemReceiver.onAbsorb(i);
                return true;
            }
            AudioAttributesCompatParcelizer(-i);
            return true;
        }
        if (memberMethods.write(this.AudioAttributesImplBaseParcelizer) == BitmapDescriptorFactory.HUE_RED) {
            return false;
        }
        int i2 = -i;
        if (read(this.AudioAttributesImplBaseParcelizer, i2)) {
            this.AudioAttributesImplBaseParcelizer.onAbsorb(i2);
            return true;
        }
        AudioAttributesCompatParcelizer(i2);
        return true;
    }

    private boolean AudioAttributesCompatParcelizer(MotionEvent motionEvent) {
        boolean z;
        if (memberMethods.write(this.MediaBrowserCompatItemReceiver) != BitmapDescriptorFactory.HUE_RED) {
            memberMethods.read(this.MediaBrowserCompatItemReceiver, BitmapDescriptorFactory.HUE_RED, motionEvent.getX() / getWidth());
            z = true;
        } else {
            z = false;
        }
        if (memberMethods.write(this.AudioAttributesImplBaseParcelizer) == BitmapDescriptorFactory.HUE_RED) {
            return z;
        }
        memberMethods.read(this.AudioAttributesImplBaseParcelizer, BitmapDescriptorFactory.HUE_RED, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void write(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.write) {
            int i = actionIndex == 0 ? 1 : 0;
            this.MediaMetadataCompat = (int) motionEvent.getY(i);
            this.write = motionEvent.getPointerId(i);
            VelocityTracker velocityTracker = this.onPrepareFromUri;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i;
        int width;
        float axisValue;
        if (motionEvent.getAction() == 8 && !this.RatingCompat) {
            if (emptyList.IconCompatParcelizer(motionEvent, 2)) {
                i = 9;
                axisValue = motionEvent.getAxisValue(9);
                width = (int) motionEvent.getX();
            } else if (emptyList.IconCompatParcelizer(motionEvent, 4194304)) {
                float axisValue2 = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
                i = 26;
                axisValue = axisValue2;
            } else {
                i = 0;
                width = 0;
                axisValue = 0.0f;
            }
            if (axisValue != BitmapDescriptorFactory.HUE_RED) {
                read(-((int) (axisValue * RemoteActionCompatParcelizer())), i, motionEvent, width, 1, emptyList.IconCompatParcelizer(motionEvent, 8194));
                this.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(motionEvent, i);
                return true;
            }
        }
        return false;
    }

    private boolean IconCompatParcelizer() {
        int overScrollMode = getOverScrollMode();
        return overScrollMode == 0 || (overScrollMode == 1 && write() > 0);
    }

    final float RemoteActionCompatParcelizer() {
        if (this.onSeekTo == BitmapDescriptorFactory.HUE_RED) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.onSeekTo = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.onSeekTo;
    }

    @Override // android.view.View
    protected void onOverScrolled(int i, int i2, boolean z, boolean z2) {
        super.scrollTo(i, i2);
    }

    private boolean IconCompatParcelizer(int i, int i2, int i3, int i4) {
        boolean z;
        boolean z2;
        getOverScrollMode();
        computeHorizontalScrollRange();
        computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        computeVerticalScrollExtent();
        int i5 = i3 + i;
        if (i2 <= 0 && i2 >= 0) {
            z = false;
        } else {
            z = true;
            i2 = 0;
        }
        if (i5 > i4) {
            z2 = true;
        } else if (i5 < 0) {
            z2 = true;
            i4 = 0;
        } else {
            i4 = i5;
            z2 = false;
        }
        if (z2 && !MediaDescriptionCompat(1)) {
            this.onPrepareFromSearch.springBack(i2, i4, 0, 0, 0, write());
        }
        onOverScrolled(i2, i4, z, z2);
        return z || z2;
    }

    final int write() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int height = childAt.getHeight();
        int i = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
        return Math.max(0, ((height + i) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private android.view.View write(boolean r12, int r13, int r14) {
        /*
            r11 = this;
            r0 = 2
            java.util.ArrayList r11 = r11.getFocusables(r0)
            int r0 = r11.size()
            r1 = 0
            r2 = 0
            r3 = r2
            r4 = r3
        Ld:
            if (r3 >= r0) goto L53
            java.lang.Object r5 = r11.get(r3)
            android.view.View r5 = (android.view.View) r5
            int r6 = r5.getTop()
            int r7 = r5.getBottom()
            if (r13 >= r7) goto L50
            if (r6 >= r14) goto L50
            r8 = 1
            if (r13 >= r6) goto L28
            if (r7 >= r14) goto L28
            r9 = r8
            goto L29
        L28:
            r9 = r2
        L29:
            if (r1 != 0) goto L2e
            r1 = r5
            r4 = r9
            goto L50
        L2e:
            if (r12 == 0) goto L36
            int r10 = r1.getTop()
            if (r6 < r10) goto L3e
        L36:
            if (r12 != 0) goto L40
            int r6 = r1.getBottom()
            if (r7 <= r6) goto L40
        L3e:
            r6 = r8
            goto L41
        L40:
            r6 = r2
        L41:
            if (r4 == 0) goto L48
            if (r9 == 0) goto L50
            if (r6 == 0) goto L50
            goto L4f
        L48:
            if (r9 == 0) goto L4d
            r1 = r5
            r4 = r8
            goto L50
        L4d:
            if (r6 == 0) goto L50
        L4f:
            r1 = r5
        L50:
            int r3 = r3 + 1
            goto Ld
        L53:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.write(boolean, int, int):android.view.View");
    }

    private boolean MediaBrowserCompatMediaItem(int i) {
        boolean z = i == 130;
        int height = getHeight();
        if (z) {
            this.onPrepare.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((FrameLayout.LayoutParams) childAt.getLayoutParams())).bottomMargin + getPaddingBottom();
                if (this.onPrepare.top + height > bottom) {
                    this.onPrepare.top = bottom - height;
                }
            }
        } else {
            this.onPrepare.top = getScrollY() - height;
            if (this.onPrepare.top < 0) {
                this.onPrepare.top = 0;
            }
        }
        Rect rect = this.onPrepare;
        rect.bottom = rect.top + height;
        return write(i, this.onPrepare.top, this.onPrepare.bottom);
    }

    private boolean MediaBrowserCompatCustomActionResultReceiver(int i) {
        int childCount;
        boolean z = i == 130;
        int height = getHeight();
        this.onPrepare.top = 0;
        this.onPrepare.bottom = height;
        if (z && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.onPrepare.bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((FrameLayout.LayoutParams) childAt.getLayoutParams())).bottomMargin + getPaddingBottom();
            Rect rect = this.onPrepare;
            rect.top = rect.bottom - height;
        }
        return write(i, this.onPrepare.top, this.onPrepare.bottom);
    }

    private boolean write(int i, int i2, int i3) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i4 = height + scrollY;
        boolean z = true;
        boolean z2 = i == 33;
        View viewWrite = write(z2, i2, i3);
        if (viewWrite == null) {
            viewWrite = this;
        }
        if (i2 < scrollY || i3 > i4) {
            AudioAttributesImplApi21Parcelizer(z2 ? i2 - scrollY : i3 - i4);
        } else {
            z = false;
        }
        if (viewWrite != findFocus()) {
            viewWrite.requestFocus(i);
        }
        return z;
    }

    private boolean MediaBrowserCompatItemReceiver(int i) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i);
        int iMediaDescriptionCompat = MediaDescriptionCompat();
        if (viewFindNextFocus != null && read(viewFindNextFocus, iMediaDescriptionCompat, getHeight())) {
            viewFindNextFocus.getDrawingRect(this.onPrepare);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.onPrepare);
            AudioAttributesImplApi21Parcelizer(AudioAttributesCompatParcelizer(this.onPrepare));
            viewFindNextFocus.requestFocus(i);
        } else {
            if (i == 33 && getScrollY() < iMediaDescriptionCompat) {
                iMediaDescriptionCompat = getScrollY();
            } else if (i == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                iMediaDescriptionCompat = Math.min((childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), iMediaDescriptionCompat);
            }
            if (iMediaDescriptionCompat == 0) {
                return false;
            }
            if (i != 130) {
                iMediaDescriptionCompat = -iMediaDescriptionCompat;
            }
            AudioAttributesImplApi21Parcelizer(iMediaDescriptionCompat);
        }
        if (viewFindFocus == null || !viewFindFocus.isFocused() || !AudioAttributesCompatParcelizer(viewFindFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    private boolean AudioAttributesCompatParcelizer(View view) {
        return !read(view, 0, getHeight());
    }

    private boolean read(View view, int i, int i2) {
        view.getDrawingRect(this.onPrepare);
        offsetDescendantRectToMyCoords(view, this.onPrepare);
        return this.onPrepare.bottom + i >= getScrollY() && this.onPrepare.top - i <= getScrollY() + i2;
    }

    private void IconCompatParcelizer(int i) {
        if (i != 0) {
            if (this.onPlayFromUri) {
                MediaMetadataCompat(i);
            } else {
                scrollBy(0, i);
            }
        }
    }

    private void MediaMetadataCompat(int i) {
        write(0, i, 250, false);
    }

    private void write(int i, int i2, int i3, boolean z) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.onCustomAction > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight();
            int i4 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            int i5 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            int height2 = getHeight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int scrollY = getScrollY();
            this.onPrepareFromSearch.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i2 + scrollY, Math.max(0, ((height + i4) + i5) - ((height2 - paddingTop) - paddingBottom)))) - scrollY, 250);
            AudioAttributesCompatParcelizer(z);
        } else {
            if (!this.onPrepareFromSearch.isFinished()) {
                AudioAttributesCompatParcelizer();
            }
            scrollBy(i, i2);
        }
        this.onCustomAction = AnimationUtils.currentAnimationTimeMillis();
    }

    public final void read(int i) {
        write(0, i, false);
    }

    final void RemoteActionCompatParcelizer(int i) {
        write(0, i, true);
    }

    private void write(int i, int i2, boolean z) {
        write(0 - getScrollX(), i2 - getScrollY(), 250, z);
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) ((FrameLayout.LayoutParams) childAt.getLayoutParams())).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i5 = marginLayoutParams.leftMargin;
        view.measure(getChildMeasureSpec(i, paddingLeft + paddingRight + i5 + marginLayoutParams.rightMargin + i2, ((ViewGroup.LayoutParams) marginLayoutParams).width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.onPrepareFromSearch.isFinished()) {
            return;
        }
        this.onPrepareFromSearch.computeScrollOffset();
        int currY = this.onPrepareFromSearch.getCurrY();
        int iAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer(currY - this.onCommand);
        this.onCommand = currY;
        int[] iArr = this.onPlay;
        iArr[1] = 0;
        RemoteActionCompatParcelizer(0, iAudioAttributesImplApi26Parcelizer, iArr, (int[]) null, 1);
        int i = iAudioAttributesImplApi26Parcelizer - this.onPlay[1];
        int iWrite = write();
        if (Build.VERSION.SDK_INT >= 35) {
            RemoteActionCompatParcelizer.write(this, Math.abs(this.onPrepareFromSearch.getCurrVelocity()));
        }
        if (i != 0) {
            int scrollY = getScrollY();
            IconCompatParcelizer(i, getScrollX(), scrollY, iWrite);
            int scrollY2 = getScrollY() - scrollY;
            int i2 = i - scrollY2;
            int[] iArr2 = this.onPlay;
            iArr2[1] = 0;
            write(scrollY2, i2, this.onPrepareFromMediaId, 1, iArr2);
            i = i2 - this.onPlay[1];
        }
        if (i != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && iWrite > 0)) {
                if (i < 0) {
                    if (this.MediaBrowserCompatItemReceiver.isFinished()) {
                        this.MediaBrowserCompatItemReceiver.onAbsorb((int) this.onPrepareFromSearch.getCurrVelocity());
                    }
                } else if (this.AudioAttributesImplBaseParcelizer.isFinished()) {
                    this.AudioAttributesImplBaseParcelizer.onAbsorb((int) this.onPrepareFromSearch.getCurrVelocity());
                }
            }
            AudioAttributesCompatParcelizer();
        }
        if (!this.onPrepareFromSearch.isFinished()) {
            postInvalidateOnAnimation();
        } else {
            RatingCompat(1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int write(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.MediaBrowserCompatItemReceiver
            float r0 = kotlin.memberMethods.write(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L30
            android.widget.EdgeEffect r0 = r3.MediaBrowserCompatItemReceiver
            float r4 = -r4
            float r4 = kotlin.memberMethods.read(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.MediaBrowserCompatItemReceiver
            float r5 = kotlin.memberMethods.write(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L52
            android.widget.EdgeEffect r5 = r3.MediaBrowserCompatItemReceiver
            r5.onRelease()
            goto L52
        L30:
            android.widget.EdgeEffect r0 = r3.AudioAttributesImplBaseParcelizer
            float r0 = kotlin.memberMethods.write(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L53
            android.widget.EdgeEffect r0 = r3.AudioAttributesImplBaseParcelizer
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = kotlin.memberMethods.read(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.AudioAttributesImplBaseParcelizer
            float r5 = kotlin.memberMethods.write(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L52
            android.widget.EdgeEffect r5 = r3.AudioAttributesImplBaseParcelizer
            r5.onRelease()
        L52:
            r1 = r4
        L53:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L62
            r3.invalidate()
        L62:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.write(int, float):int");
    }

    private void AudioAttributesCompatParcelizer(boolean z) {
        if (z) {
            write(2, 1);
        } else {
            RatingCompat(1);
        }
        this.onCommand = getScrollY();
        postInvalidateOnAnimation();
    }

    private void AudioAttributesCompatParcelizer() {
        this.onPrepareFromSearch.abortAnimation();
        RatingCompat(1);
    }

    private void RemoteActionCompatParcelizer(View view) {
        view.getDrawingRect(this.onPrepare);
        offsetDescendantRectToMyCoords(view, this.onPrepare);
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(this.onPrepare);
        if (iAudioAttributesCompatParcelizer != 0) {
            scrollBy(0, iAudioAttributesCompatParcelizer);
        }
    }

    private boolean IconCompatParcelizer(Rect rect, boolean z) {
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(rect);
        boolean z2 = iAudioAttributesCompatParcelizer != 0;
        if (z2) {
            if (z) {
                scrollBy(0, iAudioAttributesCompatParcelizer);
                return true;
            }
            MediaMetadataCompat(iAudioAttributesCompatParcelizer);
        }
        return z2;
    }

    private int AudioAttributesCompatParcelizer(Rect rect) {
        int i;
        int i2;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i3 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i4 = rect.bottom < (childAt.getHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin ? i3 - verticalFadingEdgeLength : i3;
        if (rect.bottom > i4 && rect.top > scrollY) {
            if (rect.height() > height) {
                i2 = rect.top - scrollY;
            } else {
                i2 = rect.bottom - i4;
            }
            return Math.min(i2, (childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - i3);
        }
        if (rect.top >= scrollY || rect.bottom >= i4) {
            return 0;
        }
        if (rect.height() > height) {
            i = 0 - (i4 - rect.bottom);
        } else {
            i = 0 - (scrollY - rect.top);
        }
        return Math.max(i, -getScrollY());
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (!this.MediaDescriptionCompat) {
            RemoteActionCompatParcelizer(view2);
        } else {
            this.MediaBrowserCompatCustomActionResultReceiver = view2;
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i, Rect rect) {
        View viewFindNextFocusFromRect;
        if (i == 2) {
            i = TsExtractor.TS_STREAM_TYPE_HDMV_DTS;
        } else if (i == 1) {
            i = 33;
        }
        if (rect == null) {
            viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocus(this, null, i);
        } else {
            viewFindNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(this, rect, i);
        }
        if (viewFindNextFocusFromRect == null || AudioAttributesCompatParcelizer(viewFindNextFocusFromRect)) {
            return false;
        }
        return viewFindNextFocusFromRect.requestFocus(i, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return IconCompatParcelizer(rect, z);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.MediaDescriptionCompat = true;
        super.requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int measuredHeight = 0;
        this.MediaDescriptionCompat = false;
        View view = this.MediaBrowserCompatCustomActionResultReceiver;
        if (view != null && RemoteActionCompatParcelizer(view, this)) {
            RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
        }
        this.MediaBrowserCompatCustomActionResultReceiver = null;
        if (!this.MediaBrowserCompatSearchResultReceiver) {
            if (this.onPause != null) {
                scrollTo(getScrollX(), this.onPause.AudioAttributesCompatParcelizer);
                this.onPause = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int scrollY = getScrollY();
            int iIconCompatParcelizer = IconCompatParcelizer(scrollY, ((i4 - i2) - paddingTop) - paddingBottom, measuredHeight);
            if (iIconCompatParcelizer != scrollY) {
                scrollTo(getScrollX(), iIconCompatParcelizer);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.MediaBrowserCompatSearchResultReceiver = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.MediaBrowserCompatSearchResultReceiver = false;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !read(viewFindFocus, 0, i4)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.onPrepare);
        offsetDescendantRectToMyCoords(viewFindFocus, this.onPrepare);
        IconCompatParcelizer(AudioAttributesCompatParcelizer(this.onPrepare));
    }

    private static boolean RemoteActionCompatParcelizer(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && RemoteActionCompatParcelizer((View) parent, view2);
    }

    public void AudioAttributesCompatParcelizer(int i) {
        if (getChildCount() > 0) {
            this.onPrepareFromSearch.fling(getScrollX(), getScrollY(), 0, i, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            AudioAttributesCompatParcelizer(true);
            if (Build.VERSION.SDK_INT >= 35) {
                RemoteActionCompatParcelizer.write(this, Math.abs(this.onPrepareFromSearch.getCurrVelocity()));
            }
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = getWidth();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = childAt.getWidth();
            int i3 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            int i4 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            int height = getHeight();
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int height2 = childAt.getHeight();
            int i5 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            int i6 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            int iIconCompatParcelizer = IconCompatParcelizer(i, (width - paddingLeft) - paddingRight, width2 + i3 + i4);
            int iIconCompatParcelizer2 = IconCompatParcelizer(i2, (height - paddingTop) - paddingBottom, height2 + i5 + i6);
            if (iIconCompatParcelizer == getScrollX() && iIconCompatParcelizer2 == getScrollY()) {
                return;
            }
            super.scrollTo(iIconCompatParcelizer, iIconCompatParcelizer2);
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int paddingLeft2 = 0;
        if (!this.MediaBrowserCompatItemReceiver.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            this.MediaBrowserCompatItemReceiver.setSize(width, height);
            if (this.MediaBrowserCompatItemReceiver.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        if (this.AudioAttributesImplBaseParcelizer.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(write(), scrollY) + height2;
        if (AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            paddingLeft2 = getPaddingLeft();
        }
        if (AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, BitmapDescriptorFactory.HUE_RED);
        this.AudioAttributesImplBaseParcelizer.setSize(width2, height2);
        if (this.AudioAttributesImplBaseParcelizer.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.onPause = savedState;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.AudioAttributesCompatParcelizer = getScrollY();
        return savedState;
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.core.widget.NestedScrollView.SavedState.2
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                return write(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState[] newArray(int i) {
                return RemoteActionCompatParcelizer(i);
            }

            private static SavedState write(Parcel parcel) {
                return new SavedState(parcel);
            }

            private static SavedState[] RemoteActionCompatParcelizer(int i) {
                return new SavedState[i];
            }
        };
        public int AudioAttributesCompatParcelizer;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.AudioAttributesCompatParcelizer = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.AudioAttributesCompatParcelizer);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("HorizontalScrollView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" scrollPosition=");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append("}");
            return sb.toString();
        }
    }

    static class IconCompatParcelizer extends deserializeUsingCustom {
        IconCompatParcelizer() {
        }

        @Override // kotlin.deserializeUsingCustom
        public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            if (super.performAccessibilityAction(view, i, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i != 4096) {
                if (i == 8192 || i == 16908344) {
                    int paddingBottom = nestedScrollView.getPaddingBottom();
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((height - paddingBottom) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.RemoteActionCompatParcelizer(iMax);
                    return true;
                }
                if (i != 16908346) {
                    return false;
                }
            }
            int paddingBottom2 = nestedScrollView.getPaddingBottom();
            int paddingTop = nestedScrollView.getPaddingTop();
            int iMin = Math.min(nestedScrollView.getScrollY() + ((height - paddingBottom2) - paddingTop), nestedScrollView.write());
            if (iMin == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.RemoteActionCompatParcelizer(iMin);
            return true;
        }

        @Override // kotlin.deserializeUsingCustom
        public final void onInitializeAccessibilityNodeInfo(View view, hasSuperClassStartingWith hassuperclassstartingwith) {
            int iWrite;
            super.onInitializeAccessibilityNodeInfo(view, hassuperclassstartingwith);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            hassuperclassstartingwith.AudioAttributesCompatParcelizer((CharSequence) ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (iWrite = nestedScrollView.write()) <= 0) {
                return;
            }
            hassuperclassstartingwith.handleMediaPlayPauseIfPendingOnHandler(true);
            if (nestedScrollView.getScrollY() > 0) {
                hassuperclassstartingwith.AudioAttributesCompatParcelizer(hasSuperClassStartingWith.read.onPrepareFromSearch);
                hassuperclassstartingwith.AudioAttributesCompatParcelizer(hasSuperClassStartingWith.read.onSetRating);
            }
            if (nestedScrollView.getScrollY() < iWrite) {
                hassuperclassstartingwith.AudioAttributesCompatParcelizer(hasSuperClassStartingWith.read.onRemoveQueueItemAt);
                hassuperclassstartingwith.AudioAttributesCompatParcelizer(hasSuperClassStartingWith.read.onPrepareFromUri);
            }
        }

        @Override // kotlin.deserializeUsingCustom
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.write() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            forPOJO.read(accessibilityEvent, nestedScrollView.getScrollX());
            forPOJO.RemoteActionCompatParcelizer(accessibilityEvent, nestedScrollView.write());
        }
    }

    private IgnoredPropertyException AudioAttributesImplBaseParcelizer() {
        if (this.onPlayFromSearch == null) {
            this.onPlayFromSearch = IgnoredPropertyException.read(this);
        }
        return this.onPlayFromSearch;
    }

    /* JADX INFO: loaded from: classes4.dex */
    class read implements _badFormat {
        read() {
        }

        @Override // kotlin._badFormat
        public final boolean read(float f) {
            if (f == BitmapDescriptorFactory.HUE_RED) {
                return false;
            }
            AudioAttributesCompatParcelizer();
            NestedScrollView.this.AudioAttributesCompatParcelizer((int) f);
            return true;
        }

        @Override // kotlin._badFormat
        public final void AudioAttributesCompatParcelizer() {
            NestedScrollView.this.onPrepareFromSearch.abortAnimation();
        }

        @Override // kotlin._badFormat
        public final float write() {
            return -NestedScrollView.this.RemoteActionCompatParcelizer();
        }
    }

    static class AudioAttributesCompatParcelizer {
        static boolean AudioAttributesCompatParcelizer(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    static final class RemoteActionCompatParcelizer {
        public static void write(View view, float f) {
            try {
                view.setFrameContentVelocity(f);
            } catch (LinkageError unused) {
            }
        }
    }
}
