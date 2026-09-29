package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.AnnotatedClassResolver;
import kotlin.InvalidTypeIdException;
import kotlin._deserializeNR;
import kotlin._isNaN;
import kotlin.rootArrayScope;
import kotlin.rootObjectScope;
import kotlin.setOffset;
import kotlin.setWebLineWidth;

/* JADX INFO: loaded from: classes4.dex */
public class SwipeRefreshLayout extends ViewGroup implements _deserializeNR {
    private static final int[] MediaMetadataCompat = {R.attr.enabled};
    setWebLineWidth AudioAttributesCompatParcelizer;
    int AudioAttributesImplApi21Parcelizer;
    setOffset AudioAttributesImplApi26Parcelizer;
    boolean AudioAttributesImplBaseParcelizer;
    protected int IconCompatParcelizer;
    protected int MediaBrowserCompatCustomActionResultReceiver;
    boolean MediaBrowserCompatItemReceiver;
    private int MediaBrowserCompatMediaItem;
    boolean MediaBrowserCompatSearchResultReceiver;
    private write MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private Animation MediaDescriptionCompat;
    float RatingCompat;
    AudioAttributesCompatParcelizer RemoteActionCompatParcelizer;
    private final Animation handleMediaPlayPauseIfPendingOnHandler;
    private final Animation onAddQueueItem;
    private int onCommand;
    private Animation onCustomAction;
    private float onFastForward;
    private float onMediaButtonEvent;
    private final DecelerateInterpolator onPause;
    private int onPlay;
    private int onPlayFromMediaId;
    private boolean onPlayFromSearch;
    private boolean onPlayFromUri;
    private final rootObjectScope onPrepare;
    private final rootArrayScope onPrepareFromMediaId;
    private int onPrepareFromSearch;
    private boolean onPrepareFromUri;
    private Animation onRemoveQueueItem;
    private Animation.AnimationListener onRemoveQueueItemAt;
    private final int[] onRewind;
    private final int[] onSeekTo;
    private Animation onSetCaptioningEnabled;
    private float onSetPlaybackSpeed;
    private float onSetRating;
    private Animation onSetRepeatMode;
    private View onSetShuffleMode;
    private int onStop;
    int read;
    boolean write;

    public interface AudioAttributesCompatParcelizer {
        void onRefresh();
    }

    public interface write {
        boolean write();
    }

    final void read() {
        this.AudioAttributesCompatParcelizer.clearAnimation();
        this.AudioAttributesImplApi26Parcelizer.stop();
        this.AudioAttributesCompatParcelizer.setVisibility(8);
        RemoteActionCompatParcelizer();
        if (this.AudioAttributesImplBaseParcelizer) {
            RemoteActionCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
        } else {
            AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver - this.read);
        }
        this.read = this.AudioAttributesCompatParcelizer.getTop();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (z) {
            return;
        }
        read();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        read();
    }

    private void RemoteActionCompatParcelizer() {
        this.AudioAttributesCompatParcelizer.getBackground().setAlpha(255);
        this.AudioAttributesImplApi26Parcelizer.setAlpha(255);
    }

    public void setProgressViewOffset(boolean z, int i, int i2) {
        this.AudioAttributesImplBaseParcelizer = z;
        this.MediaBrowserCompatCustomActionResultReceiver = i;
        this.AudioAttributesImplApi21Parcelizer = i2;
        this.MediaBrowserCompatSearchResultReceiver = true;
        read();
        this.MediaBrowserCompatItemReceiver = false;
    }

    public void setProgressViewEndTarget(boolean z, int i) {
        this.AudioAttributesImplApi21Parcelizer = i;
        this.AudioAttributesImplBaseParcelizer = z;
        this.AudioAttributesCompatParcelizer.invalidate();
    }

    public void setSlingshotDistance(int i) {
        this.onPlayFromMediaId = i;
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.onCommand = (int) (displayMetrics.density * 56.0f);
            } else {
                this.onCommand = (int) (displayMetrics.density * 40.0f);
            }
            this.AudioAttributesCompatParcelizer.setImageDrawable(null);
            this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(i);
            this.AudioAttributesCompatParcelizer.setImageDrawable(this.AudioAttributesImplApi26Parcelizer);
        }
    }

    public SwipeRefreshLayout(Context context) {
        this(context, null);
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.MediaBrowserCompatItemReceiver = false;
        this.onSetPlaybackSpeed = -1.0f;
        this.onSeekTo = new int[2];
        this.onRewind = new int[2];
        this.MediaBrowserCompatMediaItem = -1;
        this.onPlay = -1;
        this.onRemoveQueueItemAt = new Animation.AnimationListener() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.1
            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                if (SwipeRefreshLayout.this.MediaBrowserCompatItemReceiver) {
                    SwipeRefreshLayout.this.AudioAttributesImplApi26Parcelizer.setAlpha(255);
                    SwipeRefreshLayout.this.AudioAttributesImplApi26Parcelizer.start();
                    if (SwipeRefreshLayout.this.write && SwipeRefreshLayout.this.RemoteActionCompatParcelizer != null) {
                        SwipeRefreshLayout.this.RemoteActionCompatParcelizer.onRefresh();
                    }
                    SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
                    swipeRefreshLayout.read = swipeRefreshLayout.AudioAttributesCompatParcelizer.getTop();
                    return;
                }
                SwipeRefreshLayout.this.read();
            }
        };
        this.handleMediaPlayPauseIfPendingOnHandler = new Animation() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.7
            @Override // android.view.animation.Animation
            public final void applyTransformation(float f, Transformation transformation) {
                int iAbs;
                if (!SwipeRefreshLayout.this.MediaBrowserCompatSearchResultReceiver) {
                    iAbs = SwipeRefreshLayout.this.AudioAttributesImplApi21Parcelizer - Math.abs(SwipeRefreshLayout.this.MediaBrowserCompatCustomActionResultReceiver);
                } else {
                    iAbs = SwipeRefreshLayout.this.AudioAttributesImplApi21Parcelizer;
                }
                SwipeRefreshLayout.this.AudioAttributesCompatParcelizer((SwipeRefreshLayout.this.IconCompatParcelizer + ((int) ((iAbs - SwipeRefreshLayout.this.IconCompatParcelizer) * f))) - SwipeRefreshLayout.this.AudioAttributesCompatParcelizer.getTop());
                SwipeRefreshLayout.this.AudioAttributesImplApi26Parcelizer.read(1.0f - f);
            }
        };
        this.onAddQueueItem = new Animation() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.9
            @Override // android.view.animation.Animation
            public final void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.AudioAttributesCompatParcelizer(f);
            }
        };
        this.onStop = ViewConfiguration.get(context).getScaledTouchSlop();
        this.onPrepareFromSearch = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.onPause = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.onCommand = (int) (displayMetrics.density * 40.0f);
        AudioAttributesCompatParcelizer();
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.AudioAttributesImplApi21Parcelizer = i;
        this.onSetPlaybackSpeed = i;
        this.onPrepareFromMediaId = new rootArrayScope();
        this.onPrepare = new rootObjectScope(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.onCommand;
        this.read = i2;
        this.MediaBrowserCompatCustomActionResultReceiver = i2;
        AudioAttributesCompatParcelizer(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, MediaMetadataCompat);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i, int i2) {
        int i3 = this.onPlay;
        return i3 < 0 ? i2 : i2 == i + (-1) ? i3 : i2 >= i3 ? i2 + 1 : i2;
    }

    private void AudioAttributesCompatParcelizer() {
        this.AudioAttributesCompatParcelizer = new setWebLineWidth(getContext());
        setOffset setoffset = new setOffset(getContext());
        this.AudioAttributesImplApi26Parcelizer = setoffset;
        setoffset.RemoteActionCompatParcelizer(1);
        this.AudioAttributesCompatParcelizer.setImageDrawable(this.AudioAttributesImplApi26Parcelizer);
        this.AudioAttributesCompatParcelizer.setVisibility(8);
        addView(this.AudioAttributesCompatParcelizer);
    }

    public void setOnRefreshListener(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.RemoteActionCompatParcelizer = audioAttributesCompatParcelizer;
    }

    public void setRefreshing(boolean z) {
        int i;
        if (z && this.MediaBrowserCompatItemReceiver != z) {
            this.MediaBrowserCompatItemReceiver = z;
            if (!this.MediaBrowserCompatSearchResultReceiver) {
                i = this.AudioAttributesImplApi21Parcelizer + this.MediaBrowserCompatCustomActionResultReceiver;
            } else {
                i = this.AudioAttributesImplApi21Parcelizer;
            }
            AudioAttributesCompatParcelizer(i - this.read);
            this.write = false;
            IconCompatParcelizer(this.onRemoveQueueItemAt);
            return;
        }
        IconCompatParcelizer(z, false);
    }

    private void IconCompatParcelizer(Animation.AnimationListener animationListener) {
        this.AudioAttributesCompatParcelizer.setVisibility(0);
        this.AudioAttributesImplApi26Parcelizer.setAlpha(255);
        Animation animation = new Animation() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.3
            @Override // android.view.animation.Animation
            public final void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.RemoteActionCompatParcelizer(f);
            }
        };
        this.onRemoveQueueItem = animation;
        animation.setDuration(this.onPrepareFromSearch);
        if (animationListener != null) {
            this.AudioAttributesCompatParcelizer.setAnimationListener(animationListener);
        }
        this.AudioAttributesCompatParcelizer.clearAnimation();
        this.AudioAttributesCompatParcelizer.startAnimation(this.onRemoveQueueItem);
    }

    final void RemoteActionCompatParcelizer(float f) {
        this.AudioAttributesCompatParcelizer.setScaleX(f);
        this.AudioAttributesCompatParcelizer.setScaleY(f);
    }

    private void IconCompatParcelizer(boolean z, boolean z2) {
        if (this.MediaBrowserCompatItemReceiver != z) {
            this.write = z2;
            write();
            this.MediaBrowserCompatItemReceiver = z;
            if (z) {
                write(this.read, this.onRemoveQueueItemAt);
            } else {
                read(this.onRemoveQueueItemAt);
            }
        }
    }

    final void read(Animation.AnimationListener animationListener) {
        Animation animation = new Animation() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.2
            @Override // android.view.animation.Animation
            public final void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.RemoteActionCompatParcelizer(1.0f - f);
            }
        };
        this.onSetRepeatMode = animation;
        animation.setDuration(150L);
        this.AudioAttributesCompatParcelizer.setAnimationListener(animationListener);
        this.AudioAttributesCompatParcelizer.clearAnimation();
        this.AudioAttributesCompatParcelizer.startAnimation(this.onSetRepeatMode);
    }

    private void MediaBrowserCompatItemReceiver() {
        this.onCustomAction = write(this.AudioAttributesImplApi26Parcelizer.getAlpha(), 76);
    }

    private void IconCompatParcelizer() {
        this.MediaDescriptionCompat = write(this.AudioAttributesImplApi26Parcelizer.getAlpha(), 255);
    }

    private Animation write(final int i, final int i2) {
        Animation animation = new Animation() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.4
            @Override // android.view.animation.Animation
            public final void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.AudioAttributesImplApi26Parcelizer.setAlpha((int) (i + ((i2 - r0) * f)));
            }
        };
        animation.setDuration(300L);
        this.AudioAttributesCompatParcelizer.setAnimationListener(null);
        this.AudioAttributesCompatParcelizer.clearAnimation();
        this.AudioAttributesCompatParcelizer.startAnimation(animation);
        return animation;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(_isNaN.getColor(getContext(), i));
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.AudioAttributesCompatParcelizer.setBackgroundColor(i);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = _isNaN.getColor(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setColorSchemeColors(int... iArr) {
        write();
        this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(iArr);
    }

    private void write() {
        if (this.onSetShuffleMode == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.AudioAttributesCompatParcelizer)) {
                    this.onSetShuffleMode = childAt;
                    return;
                }
            }
        }
    }

    public void setDistanceToTriggerSync(int i) {
        this.onSetPlaybackSpeed = i;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.onSetShuffleMode == null) {
                write();
            }
            View view = this.onSetShuffleMode;
            if (view == null) {
                return;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int paddingLeft2 = getPaddingLeft();
            view.layout(paddingLeft, paddingTop, ((measuredWidth - paddingLeft2) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
            int measuredWidth2 = this.AudioAttributesCompatParcelizer.getMeasuredWidth();
            int measuredHeight2 = this.AudioAttributesCompatParcelizer.getMeasuredHeight();
            setWebLineWidth setweblinewidth = this.AudioAttributesCompatParcelizer;
            int i5 = measuredWidth / 2;
            int i6 = measuredWidth2 / 2;
            int i7 = this.read;
            setweblinewidth.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.onSetShuffleMode == null) {
            write();
        }
        View view = this.onSetShuffleMode;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.AudioAttributesCompatParcelizer.measure(View.MeasureSpec.makeMeasureSpec(this.onCommand, 1073741824), View.MeasureSpec.makeMeasureSpec(this.onCommand, 1073741824));
            this.onPlay = -1;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                if (getChildAt(i3) == this.AudioAttributesCompatParcelizer) {
                    this.onPlay = i3;
                    return;
                }
            }
        }
    }

    private boolean MediaBrowserCompatCustomActionResultReceiver() {
        write writeVar = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (writeVar != null) {
            return writeVar.write();
        }
        View view = this.onSetShuffleMode;
        if (view instanceof ListView) {
            return AnnotatedClassResolver.write((ListView) view, -1);
        }
        return view.canScrollVertically(-1);
    }

    public void setOnChildScrollUpCallback(write writeVar) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = writeVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            r4.write()
            int r0 = r5.getActionMasked()
            boolean r1 = r4.isEnabled()
            r2 = 0
            if (r1 == 0) goto L6c
            boolean r1 = r4.MediaBrowserCompatCustomActionResultReceiver()
            if (r1 != 0) goto L6c
            boolean r1 = r4.MediaBrowserCompatItemReceiver
            if (r1 != 0) goto L6c
            boolean r1 = r4.onPlayFromUri
            if (r1 != 0) goto L6c
            if (r0 == 0) goto L48
            r1 = 1
            r3 = -1
            if (r0 == r1) goto L43
            r1 = 2
            if (r0 == r1) goto L2f
            r1 = 3
            if (r0 == r1) goto L43
            r1 = 6
            if (r0 != r1) goto L69
            r4.AudioAttributesCompatParcelizer(r5)
            goto L69
        L2f:
            int r0 = r4.MediaBrowserCompatMediaItem
            if (r0 != r3) goto L34
            return r2
        L34:
            int r0 = r5.findPointerIndex(r0)
            if (r0 >= 0) goto L3b
            return r2
        L3b:
            float r5 = r5.getY(r0)
            r4.write(r5)
            goto L69
        L43:
            r4.onPlayFromSearch = r2
            r4.MediaBrowserCompatMediaItem = r3
            goto L69
        L48:
            int r0 = r4.MediaBrowserCompatCustomActionResultReceiver
            o.setWebLineWidth r1 = r4.AudioAttributesCompatParcelizer
            int r1 = r1.getTop()
            int r0 = r0 - r1
            r4.AudioAttributesCompatParcelizer(r0)
            int r0 = r5.getPointerId(r2)
            r4.MediaBrowserCompatMediaItem = r0
            r4.onPlayFromSearch = r2
            int r0 = r5.findPointerIndex(r0)
            if (r0 >= 0) goto L63
            return r2
        L63:
            float r5 = r5.getY(r0)
            r4.onFastForward = r5
        L69:
            boolean r4 = r4.onPlayFromSearch
            return r4
        L6c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z) {
        View view = this.onSetShuffleMode;
        if (view == null || InvalidTypeIdException.onRemoveQueueItemAt(view)) {
            super.requestDisallowInterceptTouchEvent(z);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i) {
        return (!isEnabled() || this.MediaBrowserCompatItemReceiver || (i & 2) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.onPrepareFromMediaId.IconCompatParcelizer(i);
        startNestedScroll(i & 2);
        this.onSetRating = BitmapDescriptorFactory.HUE_RED;
        this.onPlayFromUri = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.onSetRating;
            if (f > BitmapDescriptorFactory.HUE_RED) {
                float f2 = i2;
                if (f2 > f) {
                    iArr[1] = i2 - ((int) f);
                    this.onSetRating = BitmapDescriptorFactory.HUE_RED;
                } else {
                    this.onSetRating = f - f2;
                    iArr[1] = i2;
                }
                IconCompatParcelizer(this.onSetRating);
            }
        }
        if (this.MediaBrowserCompatSearchResultReceiver && i2 > 0 && this.onSetRating == BitmapDescriptorFactory.HUE_RED && Math.abs(i2 - iArr[1]) > 0) {
            this.AudioAttributesCompatParcelizer.setVisibility(8);
        }
        int[] iArr2 = this.onSeekTo;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.onPrepareFromMediaId.IconCompatParcelizer();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.onPrepareFromMediaId.AudioAttributesCompatParcelizer();
        this.onPlayFromUri = false;
        float f = this.onSetRating;
        if (f > BitmapDescriptorFactory.HUE_RED) {
            read(f);
            this.onSetRating = BitmapDescriptorFactory.HUE_RED;
        }
        stopNestedScroll();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        dispatchNestedScroll(i, i2, i3, i4, this.onRewind);
        if (i4 + this.onRewind[1] >= 0 || MediaBrowserCompatCustomActionResultReceiver()) {
            return;
        }
        float fAbs = this.onSetRating + Math.abs(r11);
        this.onSetRating = fAbs;
        IconCompatParcelizer(fAbs);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z) {
        this.onPrepare.write(z);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.onPrepare.read();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i) {
        return this.onPrepare.write(i);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.onPrepare.IconCompatParcelizer();
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.onPrepare.write();
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.onPrepare.RemoteActionCompatParcelizer(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.onPrepare.write(i, i2, iArr, iArr2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.onPrepare.AudioAttributesCompatParcelizer(f, f2, z);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.onPrepare.RemoteActionCompatParcelizer(f, f2);
    }

    private static boolean read(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    private void IconCompatParcelizer(float f) {
        this.AudioAttributesImplApi26Parcelizer.write(true);
        float fMin = Math.min(1.0f, Math.abs(f / this.onSetPlaybackSpeed));
        float fMax = (Math.max((float) (((double) fMin) - 0.4d), BitmapDescriptorFactory.HUE_RED) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f);
        float f2 = this.onSetPlaybackSpeed;
        int i = this.onPlayFromMediaId;
        if (i <= 0) {
            i = this.MediaBrowserCompatSearchResultReceiver ? this.AudioAttributesImplApi21Parcelizer - this.MediaBrowserCompatCustomActionResultReceiver : this.AudioAttributesImplApi21Parcelizer;
        }
        float f3 = i;
        double dMax = Math.max(BitmapDescriptorFactory.HUE_RED, Math.min(fAbs - f2, f3 * 2.0f) / f3) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i2 = this.MediaBrowserCompatCustomActionResultReceiver;
        int i3 = (int) ((fMin * f3) + (f3 * fPow * 2.0f));
        if (this.AudioAttributesCompatParcelizer.getVisibility() != 0) {
            this.AudioAttributesCompatParcelizer.setVisibility(0);
        }
        if (!this.AudioAttributesImplBaseParcelizer) {
            this.AudioAttributesCompatParcelizer.setScaleX(1.0f);
            this.AudioAttributesCompatParcelizer.setScaleY(1.0f);
        }
        if (this.AudioAttributesImplBaseParcelizer) {
            RemoteActionCompatParcelizer(Math.min(1.0f, f / this.onSetPlaybackSpeed));
        }
        if (f < this.onSetPlaybackSpeed) {
            if (this.AudioAttributesImplApi26Parcelizer.getAlpha() > 76 && !read(this.onCustomAction)) {
                MediaBrowserCompatItemReceiver();
            }
        } else if (this.AudioAttributesImplApi26Parcelizer.getAlpha() < 255 && !read(this.MediaDescriptionCompat)) {
            IconCompatParcelizer();
        }
        this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(Math.min(0.8f, fMax * 0.8f));
        this.AudioAttributesImplApi26Parcelizer.read(Math.min(1.0f, fMax));
        this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer((((fMax * 0.4f) - 0.25f) + (fPow * 2.0f)) * 0.5f);
        AudioAttributesCompatParcelizer((i2 + i3) - this.read);
    }

    private void read(float f) {
        if (f > this.onSetPlaybackSpeed) {
            IconCompatParcelizer(true, true);
            return;
        }
        this.MediaBrowserCompatItemReceiver = false;
        this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(BitmapDescriptorFactory.HUE_RED);
        IconCompatParcelizer(this.read, !this.AudioAttributesImplBaseParcelizer ? new Animation.AnimationListener() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.5
            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public final void onAnimationEnd(Animation animation) {
                if (SwipeRefreshLayout.this.AudioAttributesImplBaseParcelizer) {
                    return;
                }
                SwipeRefreshLayout.this.read((Animation.AnimationListener) null);
            }
        } : null);
        this.AudioAttributesImplApi26Parcelizer.write(false);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (!isEnabled() || MediaBrowserCompatCustomActionResultReceiver() || this.MediaBrowserCompatItemReceiver || this.onPlayFromUri) {
            return false;
        }
        if (actionMasked == 0) {
            this.MediaBrowserCompatMediaItem = motionEvent.getPointerId(0);
            this.onPlayFromSearch = false;
        } else {
            if (actionMasked == 1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.MediaBrowserCompatMediaItem);
                if (iFindPointerIndex < 0) {
                    return false;
                }
                if (this.onPlayFromSearch) {
                    float y = motionEvent.getY(iFindPointerIndex);
                    float f = this.onMediaButtonEvent;
                    this.onPlayFromSearch = false;
                    read((y - f) * 0.5f);
                }
                this.MediaBrowserCompatMediaItem = -1;
                return false;
            }
            if (actionMasked == 2) {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.MediaBrowserCompatMediaItem);
                if (iFindPointerIndex2 < 0) {
                    return false;
                }
                float y2 = motionEvent.getY(iFindPointerIndex2);
                write(y2);
                if (this.onPlayFromSearch) {
                    float f2 = (y2 - this.onMediaButtonEvent) * 0.5f;
                    if (f2 <= BitmapDescriptorFactory.HUE_RED) {
                        return false;
                    }
                    IconCompatParcelizer(f2);
                }
            } else {
                if (actionMasked == 3) {
                    return false;
                }
                if (actionMasked == 5) {
                    int actionIndex = motionEvent.getActionIndex();
                    if (actionIndex < 0) {
                        return false;
                    }
                    this.MediaBrowserCompatMediaItem = motionEvent.getPointerId(actionIndex);
                } else if (actionMasked == 6) {
                    AudioAttributesCompatParcelizer(motionEvent);
                }
            }
        }
        return true;
    }

    private void write(float f) {
        float f2 = this.onFastForward;
        float f3 = f - f2;
        float f4 = this.onStop;
        if (f3 <= f4 || this.onPlayFromSearch) {
            return;
        }
        this.onMediaButtonEvent = f2 + f4;
        this.onPlayFromSearch = true;
        this.AudioAttributesImplApi26Parcelizer.setAlpha(76);
    }

    private void write(int i, Animation.AnimationListener animationListener) {
        this.IconCompatParcelizer = i;
        this.handleMediaPlayPauseIfPendingOnHandler.reset();
        this.handleMediaPlayPauseIfPendingOnHandler.setDuration(200L);
        this.handleMediaPlayPauseIfPendingOnHandler.setInterpolator(this.onPause);
        if (animationListener != null) {
            this.AudioAttributesCompatParcelizer.setAnimationListener(animationListener);
        }
        this.AudioAttributesCompatParcelizer.clearAnimation();
        this.AudioAttributesCompatParcelizer.startAnimation(this.handleMediaPlayPauseIfPendingOnHandler);
    }

    private void IconCompatParcelizer(int i, Animation.AnimationListener animationListener) {
        if (this.AudioAttributesImplBaseParcelizer) {
            read(i, animationListener);
            return;
        }
        this.IconCompatParcelizer = i;
        this.onAddQueueItem.reset();
        this.onAddQueueItem.setDuration(200L);
        this.onAddQueueItem.setInterpolator(this.onPause);
        if (animationListener != null) {
            this.AudioAttributesCompatParcelizer.setAnimationListener(animationListener);
        }
        this.AudioAttributesCompatParcelizer.clearAnimation();
        this.AudioAttributesCompatParcelizer.startAnimation(this.onAddQueueItem);
    }

    final void AudioAttributesCompatParcelizer(float f) {
        AudioAttributesCompatParcelizer((this.IconCompatParcelizer + ((int) ((this.MediaBrowserCompatCustomActionResultReceiver - r0) * f))) - this.AudioAttributesCompatParcelizer.getTop());
    }

    private void read(int i, Animation.AnimationListener animationListener) {
        this.IconCompatParcelizer = i;
        this.RatingCompat = this.AudioAttributesCompatParcelizer.getScaleX();
        Animation animation = new Animation() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.10
            @Override // android.view.animation.Animation
            public final void applyTransformation(float f, Transformation transformation) {
                SwipeRefreshLayout.this.RemoteActionCompatParcelizer(SwipeRefreshLayout.this.RatingCompat + ((-SwipeRefreshLayout.this.RatingCompat) * f));
                SwipeRefreshLayout.this.AudioAttributesCompatParcelizer(f);
            }
        };
        this.onSetCaptioningEnabled = animation;
        animation.setDuration(150L);
        if (animationListener != null) {
            this.AudioAttributesCompatParcelizer.setAnimationListener(animationListener);
        }
        this.AudioAttributesCompatParcelizer.clearAnimation();
        this.AudioAttributesCompatParcelizer.startAnimation(this.onSetCaptioningEnabled);
    }

    final void AudioAttributesCompatParcelizer(int i) {
        this.AudioAttributesCompatParcelizer.bringToFront();
        InvalidTypeIdException.IconCompatParcelizer((View) this.AudioAttributesCompatParcelizer, i);
        this.read = this.AudioAttributesCompatParcelizer.getTop();
    }

    private void AudioAttributesCompatParcelizer(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.MediaBrowserCompatMediaItem) {
            this.MediaBrowserCompatMediaItem = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }
}
