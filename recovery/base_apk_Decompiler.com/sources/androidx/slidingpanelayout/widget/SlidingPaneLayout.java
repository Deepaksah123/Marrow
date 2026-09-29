package androidx.slidingpanelayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.customview.view.AbsSavedState;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import kotlin.InvalidTypeIdException;
import kotlin._isNaN;
import kotlin.call;
import kotlin.deserializeUsingCustom;
import kotlin.hasSuperClassStartingWith;

/* JADX INFO: loaded from: classes4.dex */
public class SlidingPaneLayout extends ViewGroup {
    boolean AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    int AudioAttributesImplApi26Parcelizer;
    View AudioAttributesImplBaseParcelizer;
    boolean IconCompatParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private boolean MediaBrowserCompatItemReceiver;
    private int MediaBrowserCompatMediaItem;
    private float MediaBrowserCompatSearchResultReceiver;
    private Drawable MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final int MediaDescriptionCompat;
    private AudioAttributesCompatParcelizer MediaMetadataCompat;
    private float RatingCompat;
    final call RemoteActionCompatParcelizer;
    private final Rect handleMediaPlayPauseIfPendingOnHandler;
    private float onAddQueueItem;
    private int onCommand;
    private Drawable onCustomAction;
    float read;
    final ArrayList<write> write;

    public interface AudioAttributesCompatParcelizer {
    }

    public SlidingPaneLayout(Context context) {
        this(context, null);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingPaneLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.onCommand = -858993460;
        this.MediaBrowserCompatItemReceiver = true;
        this.handleMediaPlayPauseIfPendingOnHandler = new Rect();
        this.write = new ArrayList<>();
        float f = context.getResources().getDisplayMetrics().density;
        this.MediaDescriptionCompat = (int) ((32.0f * f) + 0.5f);
        setWillNotDraw(false);
        InvalidTypeIdException.AudioAttributesCompatParcelizer(this, new IconCompatParcelizer());
        InvalidTypeIdException.AudioAttributesImplBaseParcelizer(this, 1);
        call callVarAudioAttributesCompatParcelizer = call.AudioAttributesCompatParcelizer(this, 0.5f, new RemoteActionCompatParcelizer());
        this.RemoteActionCompatParcelizer = callVarAudioAttributesCompatParcelizer;
        callVarAudioAttributesCompatParcelizer.write(f * 400.0f);
    }

    public void setParallaxDistance(int i) {
        this.MediaBrowserCompatMediaItem = i;
        requestLayout();
    }

    public void setSliderFadeColor(int i) {
        this.onCommand = i;
    }

    public void setCoveredFadeColor(int i) {
        this.AudioAttributesImplApi21Parcelizer = i;
    }

    public void setPanelSlideListener(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.MediaMetadataCompat = audioAttributesCompatParcelizer;
    }

    final void IconCompatParcelizer() {
        sendAccessibilityEvent(32);
    }

    final void write() {
        sendAccessibilityEvent(32);
    }

    final void read(View view) {
        int left;
        int right;
        int top;
        int bottom;
        boolean z;
        int i;
        int i2;
        int i3;
        View view2 = view;
        boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        int width = zRemoteActionCompatParcelizer ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = zRemoteActionCompatParcelizer ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight();
        int paddingBottom = getPaddingBottom();
        if (view2 == null || !AudioAttributesCompatParcelizer(view)) {
            left = 0;
            right = 0;
            top = 0;
            bottom = 0;
        } else {
            left = view.getLeft();
            right = view.getRight();
            top = view.getTop();
            bottom = view.getBottom();
        }
        int childCount = getChildCount();
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = getChildAt(i4);
            if (childAt == view2) {
                return;
            }
            if (childAt.getVisibility() != 8) {
                int iMax = Math.max(zRemoteActionCompatParcelizer ? paddingLeft : width, childAt.getLeft());
                int iMax2 = Math.max(paddingTop, childAt.getTop());
                z = zRemoteActionCompatParcelizer;
                if (zRemoteActionCompatParcelizer) {
                    i3 = width;
                    i = i3;
                } else {
                    i = width;
                    i3 = paddingLeft;
                }
                i2 = paddingLeft;
                childAt.setVisibility((iMax < left || iMax2 < top || Math.min(i3, childAt.getRight()) > right || Math.min(height - paddingBottom, childAt.getBottom()) > bottom) ? 0 : 4);
            } else {
                z = zRemoteActionCompatParcelizer;
                i = width;
                i2 = paddingLeft;
            }
            i4++;
            view2 = view;
            zRemoteActionCompatParcelizer = z;
            width = i;
            paddingLeft = i2;
        }
    }

    final void read() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    private static boolean AudioAttributesCompatParcelizer(View view) {
        return view.isOpaque();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.MediaBrowserCompatItemReceiver = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.MediaBrowserCompatItemReceiver = true;
        int size = this.write.size();
        for (int i = 0; i < size; i++) {
            this.write.get(i).run();
        }
        this.write.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a3 A[PHI: r13
      0x00a3: PHI (r13v2 float) = (r13v1 float), (r13v3 float) binds: [B:33:0x009a, B:35:0x00a1] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01a2  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 569
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.onMeasure(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bd  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i != i3) {
            this.MediaBrowserCompatItemReceiver = true;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.MediaBrowserCompatCustomActionResultReceiver) {
            return;
        }
        this.AudioAttributesCompatParcelizer = view == this.AudioAttributesImplBaseParcelizer;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        if (!this.MediaBrowserCompatCustomActionResultReceiver && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.AudioAttributesCompatParcelizer = !call.RemoteActionCompatParcelizer(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (!this.MediaBrowserCompatCustomActionResultReceiver || (this.IconCompatParcelizer && actionMasked != 0)) {
            this.RemoteActionCompatParcelizer.write();
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked == 3 || actionMasked == 1) {
            this.RemoteActionCompatParcelizer.write();
            return false;
        }
        if (actionMasked == 0) {
            this.IconCompatParcelizer = false;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.RatingCompat = x;
            this.MediaBrowserCompatSearchResultReceiver = y;
            if (call.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, (int) x, (int) y) && write(this.AudioAttributesImplBaseParcelizer)) {
                z = true;
            }
            return !this.RemoteActionCompatParcelizer.read(motionEvent) || z;
        }
        if (actionMasked == 2) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float fAbs = Math.abs(x2 - this.RatingCompat);
            float fAbs2 = Math.abs(y2 - this.MediaBrowserCompatSearchResultReceiver);
            if (fAbs > this.RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer() && fAbs2 > fAbs) {
                this.RemoteActionCompatParcelizer.write();
                this.IconCompatParcelizer = true;
                return false;
            }
        }
        z = false;
        if (this.RemoteActionCompatParcelizer.read(motionEvent)) {
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.MediaBrowserCompatCustomActionResultReceiver) {
            return super.onTouchEvent(motionEvent);
        }
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            this.RatingCompat = x;
            this.MediaBrowserCompatSearchResultReceiver = y;
            return true;
        }
        if (actionMasked == 1 && write(this.AudioAttributesImplBaseParcelizer)) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            float f = x2 - this.RatingCompat;
            float f2 = y2 - this.MediaBrowserCompatSearchResultReceiver;
            int iAudioAttributesImplBaseParcelizer = this.RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer();
            if ((f * f) + (f2 * f2) < iAudioAttributesImplBaseParcelizer * iAudioAttributesImplBaseParcelizer && call.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, (int) x2, (int) y2)) {
                AudioAttributesCompatParcelizer();
            }
        }
        return true;
    }

    private boolean AudioAttributesCompatParcelizer() {
        if (!this.MediaBrowserCompatItemReceiver && !read(BitmapDescriptorFactory.HUE_RED)) {
            return false;
        }
        this.AudioAttributesCompatParcelizer = false;
        return true;
    }

    private boolean AudioAttributesImplBaseParcelizer() {
        if (!this.MediaBrowserCompatItemReceiver && !read(1.0f)) {
            return false;
        }
        this.AudioAttributesCompatParcelizer = true;
        return true;
    }

    private boolean AudioAttributesImplApi21Parcelizer() {
        return AudioAttributesImplBaseParcelizer();
    }

    private boolean MediaBrowserCompatCustomActionResultReceiver() {
        return AudioAttributesCompatParcelizer();
    }

    private boolean MediaBrowserCompatItemReceiver() {
        return !this.MediaBrowserCompatCustomActionResultReceiver || this.read == 1.0f;
    }

    private boolean AudioAttributesImplApi26Parcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    final void IconCompatParcelizer(int i) {
        if (this.AudioAttributesImplBaseParcelizer == null) {
            this.read = BitmapDescriptorFactory.HUE_RED;
            return;
        }
        boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        LayoutParams layoutParams = (LayoutParams) this.AudioAttributesImplBaseParcelizer.getLayoutParams();
        int width = this.AudioAttributesImplBaseParcelizer.getWidth();
        if (zRemoteActionCompatParcelizer) {
            i = (getWidth() - i) - width;
        }
        float paddingRight = (i - ((zRemoteActionCompatParcelizer ? getPaddingRight() : getPaddingLeft()) + (zRemoteActionCompatParcelizer ? ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin))) / this.AudioAttributesImplApi26Parcelizer;
        this.read = paddingRight;
        if (this.MediaBrowserCompatMediaItem != 0) {
            write(paddingRight);
        }
        if (layoutParams.write) {
            RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, this.read, this.onCommand);
        }
    }

    private void RemoteActionCompatParcelizer(View view, float f, int i) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f > BitmapDescriptorFactory.HUE_RED && i != 0) {
            int i2 = (int) ((((-16777216) & i) >>> 24) * f);
            if (layoutParams.IconCompatParcelizer == null) {
                layoutParams.IconCompatParcelizer = new Paint();
            }
            layoutParams.IconCompatParcelizer.setColorFilter(new PorterDuffColorFilter((i2 << 24) | (i & 16777215), PorterDuff.Mode.SRC_OVER));
            if (view.getLayerType() != 2) {
                view.setLayerType(2, layoutParams.IconCompatParcelizer);
            }
            IconCompatParcelizer(view);
            return;
        }
        if (view.getLayerType() != 0) {
            if (layoutParams.IconCompatParcelizer != null) {
                layoutParams.IconCompatParcelizer.setColorFilter(null);
            }
            write writeVar = new write(view);
            this.write.add(writeVar);
            InvalidTypeIdException.AudioAttributesCompatParcelizer(this, writeVar);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int iSave = canvas.save();
        if (this.MediaBrowserCompatCustomActionResultReceiver && !layoutParams.read && this.AudioAttributesImplBaseParcelizer != null) {
            canvas.getClipBounds(this.handleMediaPlayPauseIfPendingOnHandler);
            if (RemoteActionCompatParcelizer()) {
                Rect rect = this.handleMediaPlayPauseIfPendingOnHandler;
                rect.left = Math.max(rect.left, this.AudioAttributesImplBaseParcelizer.getRight());
            } else {
                Rect rect2 = this.handleMediaPlayPauseIfPendingOnHandler;
                rect2.right = Math.min(rect2.right, this.AudioAttributesImplBaseParcelizer.getLeft());
            }
            canvas.clipRect(this.handleMediaPlayPauseIfPendingOnHandler);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restoreToCount(iSave);
        return zDrawChild;
    }

    static void IconCompatParcelizer(View view) {
        InvalidTypeIdException.IconCompatParcelizer(view, ((LayoutParams) view.getLayoutParams()).IconCompatParcelizer);
    }

    private boolean read(float f) {
        int paddingLeft;
        if (!this.MediaBrowserCompatCustomActionResultReceiver) {
            return false;
        }
        boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        LayoutParams layoutParams = (LayoutParams) this.AudioAttributesImplBaseParcelizer.getLayoutParams();
        if (zRemoteActionCompatParcelizer) {
            paddingLeft = (int) (getWidth() - (((getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin) + (f * this.AudioAttributesImplApi26Parcelizer)) + this.AudioAttributesImplBaseParcelizer.getWidth()));
        } else {
            paddingLeft = (int) (getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + (f * this.AudioAttributesImplApi26Parcelizer));
        }
        call callVar = this.RemoteActionCompatParcelizer;
        View view = this.AudioAttributesImplBaseParcelizer;
        if (!callVar.AudioAttributesCompatParcelizer(view, paddingLeft, view.getTop())) {
            return false;
        }
        read();
        InvalidTypeIdException.onRemoveQueueItem(this);
        return true;
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.RemoteActionCompatParcelizer.IconCompatParcelizer()) {
            if (!this.MediaBrowserCompatCustomActionResultReceiver) {
                this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
            } else {
                InvalidTypeIdException.onRemoveQueueItem(this);
            }
        }
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(Drawable drawable) {
        this.onCustomAction = drawable;
    }

    public void setShadowDrawableRight(Drawable drawable) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = drawable;
    }

    @Deprecated
    public void setShadowResource(int i) {
        setShadowDrawable(getResources().getDrawable(i));
    }

    public void setShadowResourceLeft(int i) {
        setShadowDrawableLeft(_isNaN.getDrawable(getContext(), i));
    }

    public void setShadowResourceRight(int i) {
        setShadowDrawableRight(_isNaN.getDrawable(getContext(), i));
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        Drawable drawable;
        int i;
        int right;
        super.draw(canvas);
        if (RemoteActionCompatParcelizer()) {
            drawable = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        } else {
            drawable = this.onCustomAction;
        }
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt == null || drawable == null) {
            return;
        }
        int top = childAt.getTop();
        int bottom = childAt.getBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (RemoteActionCompatParcelizer()) {
            right = childAt.getRight();
            i = intrinsicWidth + right;
        } else {
            int left = childAt.getLeft();
            int i2 = left - intrinsicWidth;
            i = left;
            right = i2;
        }
        drawable.setBounds(right, top, i, bottom);
        drawable.draw(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void write(float r10) {
        /*
            r9 = this;
            boolean r0 = r9.RemoteActionCompatParcelizer()
            android.view.View r1 = r9.AudioAttributesImplBaseParcelizer
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            androidx.slidingpanelayout.widget.SlidingPaneLayout$LayoutParams r1 = (androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams) r1
            boolean r2 = r1.write
            r3 = 0
            if (r2 == 0) goto L1c
            if (r0 == 0) goto L16
            int r1 = r1.rightMargin
            goto L18
        L16:
            int r1 = r1.leftMargin
        L18:
            if (r1 > 0) goto L1c
            r1 = 1
            goto L1d
        L1c:
            r1 = r3
        L1d:
            int r2 = r9.getChildCount()
        L21:
            if (r3 >= r2) goto L55
            android.view.View r4 = r9.getChildAt(r3)
            android.view.View r5 = r9.AudioAttributesImplBaseParcelizer
            if (r4 == r5) goto L52
            float r5 = r9.onAddQueueItem
            int r6 = r9.MediaBrowserCompatMediaItem
            r7 = 1065353216(0x3f800000, float:1.0)
            float r5 = r7 - r5
            float r6 = (float) r6
            float r5 = r5 * r6
            int r5 = (int) r5
            r9.onAddQueueItem = r10
            float r8 = r7 - r10
            float r8 = r8 * r6
            int r6 = (int) r8
            int r5 = r5 - r6
            if (r0 == 0) goto L40
            int r5 = -r5
        L40:
            r4.offsetLeftAndRight(r5)
            if (r1 == 0) goto L52
            float r5 = r9.onAddQueueItem
            if (r0 == 0) goto L4b
            float r5 = r5 - r7
            goto L4d
        L4b:
            float r5 = r7 - r5
        L4d:
            int r6 = r9.AudioAttributesImplApi21Parcelizer
            r9.RemoteActionCompatParcelizer(r4, r5, r6)
        L52:
            int r3 = r3 + 1
            goto L21
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.SlidingPaneLayout.write(float):void");
    }

    final boolean write(View view) {
        if (view == null) {
            return false;
        }
        return this.MediaBrowserCompatCustomActionResultReceiver && ((LayoutParams) view.getLayoutParams()).write && this.read > BitmapDescriptorFactory.HUE_RED;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.IconCompatParcelizer = AudioAttributesImplApi26Parcelizer() ? MediaBrowserCompatItemReceiver() : this.AudioAttributesCompatParcelizer;
        return savedState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.read());
        if (savedState.IconCompatParcelizer) {
            AudioAttributesImplApi21Parcelizer();
        } else {
            MediaBrowserCompatCustomActionResultReceiver();
        }
        this.AudioAttributesCompatParcelizer = savedState.IconCompatParcelizer;
    }

    class RemoteActionCompatParcelizer extends call.IconCompatParcelizer {
        RemoteActionCompatParcelizer() {
        }

        @Override // o.call.IconCompatParcelizer
        public final boolean read(View view, int i) {
            if (SlidingPaneLayout.this.IconCompatParcelizer) {
                return false;
            }
            return ((LayoutParams) view.getLayoutParams()).read;
        }

        @Override // o.call.IconCompatParcelizer
        public final void IconCompatParcelizer(int i) {
            if (SlidingPaneLayout.this.RemoteActionCompatParcelizer.MediaBrowserCompatItemReceiver() == 0) {
                if (SlidingPaneLayout.this.read == BitmapDescriptorFactory.HUE_RED) {
                    SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                    slidingPaneLayout.read(slidingPaneLayout.AudioAttributesImplBaseParcelizer);
                    SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
                    View view = slidingPaneLayout2.AudioAttributesImplBaseParcelizer;
                    slidingPaneLayout2.write();
                    SlidingPaneLayout.this.AudioAttributesCompatParcelizer = false;
                    return;
                }
                SlidingPaneLayout slidingPaneLayout3 = SlidingPaneLayout.this;
                View view2 = slidingPaneLayout3.AudioAttributesImplBaseParcelizer;
                slidingPaneLayout3.IconCompatParcelizer();
                SlidingPaneLayout.this.AudioAttributesCompatParcelizer = true;
            }
        }

        @Override // o.call.IconCompatParcelizer
        public final void RemoteActionCompatParcelizer(View view, int i) {
            SlidingPaneLayout.this.read();
        }

        @Override // o.call.IconCompatParcelizer
        public final void AudioAttributesCompatParcelizer(View view, int i, int i2) {
            SlidingPaneLayout.this.IconCompatParcelizer(i);
            SlidingPaneLayout.this.invalidate();
        }

        @Override // o.call.IconCompatParcelizer
        public final void read(View view, float f, float f2) {
            int paddingLeft;
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (SlidingPaneLayout.this.RemoteActionCompatParcelizer()) {
                int paddingRight = SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                if (f < BitmapDescriptorFactory.HUE_RED || (f == BitmapDescriptorFactory.HUE_RED && SlidingPaneLayout.this.read > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.AudioAttributesImplApi26Parcelizer;
                }
                paddingLeft = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.AudioAttributesImplBaseParcelizer.getWidth();
            } else {
                paddingLeft = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + SlidingPaneLayout.this.getPaddingLeft();
                if (f > BitmapDescriptorFactory.HUE_RED || (f == BitmapDescriptorFactory.HUE_RED && SlidingPaneLayout.this.read > 0.5f)) {
                    paddingLeft += SlidingPaneLayout.this.AudioAttributesImplApi26Parcelizer;
                }
            }
            SlidingPaneLayout.this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(paddingLeft, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        @Override // o.call.IconCompatParcelizer
        public final int AudioAttributesCompatParcelizer(View view) {
            return SlidingPaneLayout.this.AudioAttributesImplApi26Parcelizer;
        }

        @Override // o.call.IconCompatParcelizer
        public final int IconCompatParcelizer(View view, int i) {
            LayoutParams layoutParams = (LayoutParams) SlidingPaneLayout.this.AudioAttributesImplBaseParcelizer.getLayoutParams();
            if (SlidingPaneLayout.this.RemoteActionCompatParcelizer()) {
                int width = SlidingPaneLayout.this.getWidth() - ((SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin) + SlidingPaneLayout.this.AudioAttributesImplBaseParcelizer.getWidth());
                return Math.max(Math.min(i, width), width - SlidingPaneLayout.this.AudioAttributesImplApi26Parcelizer);
            }
            int paddingLeft = SlidingPaneLayout.this.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            return Math.min(Math.max(i, paddingLeft), SlidingPaneLayout.this.AudioAttributesImplApi26Parcelizer + paddingLeft);
        }

        @Override // o.call.IconCompatParcelizer
        public final int AudioAttributesCompatParcelizer(View view, int i) {
            return view.getTop();
        }

        @Override // o.call.IconCompatParcelizer
        public final void IconCompatParcelizer(int i, int i2) {
            SlidingPaneLayout.this.RemoteActionCompatParcelizer.read(SlidingPaneLayout.this.AudioAttributesImplBaseParcelizer, i2);
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        private static final int[] AudioAttributesCompatParcelizer = {R.attr.layout_weight};
        Paint IconCompatParcelizer;
        public float RemoteActionCompatParcelizer;
        boolean read;
        boolean write;

        public LayoutParams() {
            super(-1, -1);
            this.RemoteActionCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.RemoteActionCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.RemoteActionCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.RemoteActionCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AudioAttributesCompatParcelizer);
            this.RemoteActionCompatParcelizer = typedArrayObtainStyledAttributes.getFloat(0, BitmapDescriptorFactory.HUE_RED);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.slidingpanelayout.widget.SlidingPaneLayout.SavedState.3
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                return write(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return RemoteActionCompatParcelizer(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ Object[] newArray(int i) {
                return RemoteActionCompatParcelizer(i);
            }

            private static SavedState RemoteActionCompatParcelizer(Parcel parcel) {
                return new SavedState(parcel);
            }

            private static SavedState write(Parcel parcel) {
                return new SavedState(parcel);
            }

            private static SavedState[] RemoteActionCompatParcelizer(int i) {
                return new SavedState[i];
            }
        };
        boolean IconCompatParcelizer;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel) {
            super(parcel, null);
            this.IconCompatParcelizer = parcel.readInt() != 0;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.IconCompatParcelizer ? 1 : 0);
        }
    }

    class IconCompatParcelizer extends deserializeUsingCustom {
        private final Rect AudioAttributesCompatParcelizer = new Rect();

        IconCompatParcelizer() {
        }

        @Override // kotlin.deserializeUsingCustom
        public final void onInitializeAccessibilityNodeInfo(View view, hasSuperClassStartingWith hassuperclassstartingwith) {
            hasSuperClassStartingWith hassuperclassstartingwithAudioAttributesCompatParcelizer = hasSuperClassStartingWith.AudioAttributesCompatParcelizer(hassuperclassstartingwith);
            super.onInitializeAccessibilityNodeInfo(view, hassuperclassstartingwithAudioAttributesCompatParcelizer);
            read(hassuperclassstartingwith, hassuperclassstartingwithAudioAttributesCompatParcelizer);
            hassuperclassstartingwithAudioAttributesCompatParcelizer.onSetCaptioningEnabled();
            hassuperclassstartingwith.AudioAttributesCompatParcelizer((CharSequence) SlidingPaneLayout.class.getName());
            hassuperclassstartingwith.write(view);
            Object objOnCustomAction = InvalidTypeIdException.onCustomAction(view);
            if (objOnCustomAction instanceof View) {
                hassuperclassstartingwith.IconCompatParcelizer((View) objOnCustomAction);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i);
                if (!AudioAttributesCompatParcelizer(childAt) && childAt.getVisibility() == 0) {
                    InvalidTypeIdException.AudioAttributesImplBaseParcelizer(childAt, 1);
                    hassuperclassstartingwith.RemoteActionCompatParcelizer(childAt);
                }
            }
        }

        @Override // kotlin.deserializeUsingCustom
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
        }

        @Override // kotlin.deserializeUsingCustom
        public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (AudioAttributesCompatParcelizer(view)) {
                return false;
            }
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        private boolean AudioAttributesCompatParcelizer(View view) {
            return SlidingPaneLayout.this.write(view);
        }

        private void read(hasSuperClassStartingWith hassuperclassstartingwith, hasSuperClassStartingWith hassuperclassstartingwith2) {
            Rect rect = this.AudioAttributesCompatParcelizer;
            hassuperclassstartingwith2.AudioAttributesCompatParcelizer(rect);
            hassuperclassstartingwith.RemoteActionCompatParcelizer(rect);
            hassuperclassstartingwith2.read(rect);
            hassuperclassstartingwith.IconCompatParcelizer(rect);
            hassuperclassstartingwith.onPlayFromMediaId(hassuperclassstartingwith2.onSetShuffleMode());
            hassuperclassstartingwith.MediaBrowserCompatCustomActionResultReceiver(hassuperclassstartingwith2.MediaDescriptionCompat());
            hassuperclassstartingwith.AudioAttributesCompatParcelizer(hassuperclassstartingwith2.AudioAttributesCompatParcelizer());
            hassuperclassstartingwith.IconCompatParcelizer(hassuperclassstartingwith2.MediaBrowserCompatItemReceiver());
            hassuperclassstartingwith.MediaBrowserCompatCustomActionResultReceiver(hassuperclassstartingwith2.onPlayFromMediaId());
            hassuperclassstartingwith.AudioAttributesImplApi26Parcelizer(hassuperclassstartingwith2.onFastForward());
            hassuperclassstartingwith.MediaDescriptionCompat(hassuperclassstartingwith2.onPrepareFromSearch());
            hassuperclassstartingwith.MediaBrowserCompatMediaItem(hassuperclassstartingwith2.onPlayFromUri());
            hassuperclassstartingwith.RemoteActionCompatParcelizer(hassuperclassstartingwith2.onAddQueueItem());
            hassuperclassstartingwith.onCommand(hassuperclassstartingwith2.onPrepareFromUri());
            hassuperclassstartingwith.MediaMetadataCompat(hassuperclassstartingwith2.onPlayFromSearch());
            hassuperclassstartingwith.AudioAttributesCompatParcelizer(hassuperclassstartingwith2.RemoteActionCompatParcelizer());
            hassuperclassstartingwith.AudioAttributesImplApi26Parcelizer(hassuperclassstartingwith2.RatingCompat());
        }
    }

    class write implements Runnable {
        final View write;

        write(View view) {
            this.write = view;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.write.getParent() == SlidingPaneLayout.this) {
                this.write.setLayerType(0, null);
                SlidingPaneLayout.IconCompatParcelizer(this.write);
            }
            SlidingPaneLayout.this.write.remove(this);
        }
    }

    final boolean RemoteActionCompatParcelizer() {
        return InvalidTypeIdException.MediaBrowserCompatMediaItem(this) == 1;
    }
}
