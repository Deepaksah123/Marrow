package in.juspay.hypersdk.mystique;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;
import kotlin._findExplicitNames;

/* JADX INFO: loaded from: classes5.dex */
public class SwypeLayout extends FrameLayout {
    private static final String TAG = "SwypeLayout";
    public static WeakReference<SwypeLayout> activeLayoutWeakReference;
    public static WeakReference<SwypeLayout> partialSwypeWeakReference;
    private boolean didDisplace;
    private int leftEdge;
    private View mContent;
    private float mDisplaceX;
    private boolean mEnabled;
    private View mLeftOption;
    private View mRightOption;
    private float mX;
    private int rightEdge;

    public SwypeLayout(Context context) {
        super(context);
        this.mX = BitmapDescriptorFactory.HUE_RED;
        this.leftEdge = 0;
        this.rightEdge = 250;
        this.mDisplaceX = BitmapDescriptorFactory.HUE_RED;
        this.didDisplace = false;
        this.mContent = null;
        this.mLeftOption = null;
        this.mRightOption = null;
        this.mEnabled = false;
    }

    public static void clear() {
        SwypeLayout swypeLayout = activeLayoutWeakReference.get();
        if (swypeLayout != null) {
            swypeLayout.reset();
            activeLayoutWeakReference = new WeakReference<>(null);
        }
        SwypeLayout swypeLayout2 = partialSwypeWeakReference.get();
        if (swypeLayout2 != null) {
            swypeLayout2.reset();
            partialSwypeWeakReference = new WeakReference<>(null);
        }
    }

    private void handleSwype(float f, boolean z) {
        boolean z2;
        int i = this.leftEdge;
        if (i == 0 && this.rightEdge == 0) {
            return;
        }
        float f2 = i;
        float f3 = this.mDisplaceX + (f - this.mX);
        if (f3 < BitmapDescriptorFactory.HUE_RED) {
            f2 = this.rightEdge;
            f3 = -f3;
            z2 = true;
        } else {
            z2 = false;
        }
        if (f3 > f2) {
            f3 = f2;
        }
        if (!z) {
            f2 = f3;
        } else if (f3 / f2 <= 0.4d) {
            f2 = 0.0f;
        }
        SwypeLayout swypeLayout = partialSwypeWeakReference.get();
        if (swypeLayout != null && swypeLayout != this) {
            swypeLayout.reset();
        }
        partialSwypeWeakReference = new WeakReference<>(this);
        if (z2) {
            f2 = -f2;
        }
        float f4 = this.mDisplaceX - f2;
        if (f4 > 20.0f || f4 < -20.0f) {
            this.didDisplace = true;
            SwypeLayout swypeLayout2 = activeLayoutWeakReference.get();
            if (swypeLayout2 != null && swypeLayout2 != this) {
                swypeLayout2.reset();
                activeLayoutWeakReference = new WeakReference<>(null);
            }
        }
        if (!z) {
            this.mContent.setTranslationX(f2);
            return;
        }
        this.mDisplaceX = f2;
        this.mContent.animate().setDuration(150L).setInterpolator(new _findExplicitNames()).translationX(f2);
        if (f2 != BitmapDescriptorFactory.HUE_RED) {
            activeLayoutWeakReference = new WeakReference<>(this);
        }
        partialSwypeWeakReference = new WeakReference<>(null);
    }

    private void processClick(MotionEvent motionEvent) {
        float measuredHeight = getMeasuredHeight();
        float measuredWidth = getMeasuredWidth();
        float y = motionEvent.getY();
        float x = motionEvent.getX();
        if (measuredHeight < y || y < BitmapDescriptorFactory.HUE_RED || x < BitmapDescriptorFactory.HUE_RED || x > measuredWidth) {
            return;
        }
        float f = this.mDisplaceX;
        if (f == BitmapDescriptorFactory.HUE_RED) {
            this.mContent.callOnClick();
            return;
        }
        if (f < BitmapDescriptorFactory.HUE_RED && x >= measuredWidth - this.rightEdge) {
            this.mRightOption.callOnClick();
        } else if (f <= BitmapDescriptorFactory.HUE_RED || x > this.leftEdge) {
            reset();
        } else {
            this.mLeftOption.callOnClick();
        }
    }

    private boolean tagChildren() {
        if (getChildCount() != 3) {
            return false;
        }
        View childAt = getChildAt(0);
        View childAt2 = getChildAt(1);
        View childAt3 = getChildAt(2);
        if (childAt != this.mContent || childAt2 != this.mLeftOption || childAt3 != this.mRightOption) {
            this.mContent = childAt;
            this.mLeftOption = childAt2;
            this.mRightOption = childAt3;
            reset();
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.mEnabled;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.mContent != null || tagChildren()) {
            int i5 = i3 - i;
            View view = this.mContent;
            view.layout(0, 0, view.getMeasuredWidth(), this.mContent.getMeasuredHeight());
            View view2 = this.mLeftOption;
            view2.layout(0, 0, view2.getMeasuredWidth(), this.mContent.getMeasuredHeight());
            View view3 = this.mRightOption;
            view3.layout(i5 - view3.getMeasuredWidth(), 0, i5, this.mRightOption.getMeasuredWidth());
            this.mContent.bringToFront();
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mX = motionEvent.getX();
        } else if (actionMasked == 1) {
            handleSwype(motionEvent.getX(), true);
            this.mX = BitmapDescriptorFactory.HUE_RED;
            if (this.didDisplace) {
                this.didDisplace = false;
                return false;
            }
            processClick(motionEvent);
        } else if (actionMasked == 2) {
            handleSwype(motionEvent.getX(), false);
        }
        return true;
    }

    public void reset() {
        this.mDisplaceX = BitmapDescriptorFactory.HUE_RED;
        this.leftEdge = this.mLeftOption.getMeasuredWidth();
        this.rightEdge = this.mRightOption.getMeasuredWidth();
        this.mContent.setTranslationZ(2.0f);
        this.mContent.animate().setDuration(150L).translationX(BitmapDescriptorFactory.HUE_RED);
    }

    public void setSwypeEnabled(boolean z) {
        boolean z2 = this.mEnabled;
        if (z2 != z && z2) {
            reset();
        }
        this.mEnabled = z;
    }
}
