package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.InvalidTypeIdException;
import kotlin._init_lambda5;
import kotlin.removeOnUserLeaveHintListener;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {
    public Drawable AudioAttributesCompatParcelizer;
    private View AudioAttributesImplApi21Parcelizer;
    private boolean AudioAttributesImplApi26Parcelizer;
    private View AudioAttributesImplBaseParcelizer;
    public Drawable IconCompatParcelizer;
    private View MediaBrowserCompatCustomActionResultReceiver;
    private int MediaBrowserCompatItemReceiver;
    public boolean RemoteActionCompatParcelizer;
    public Drawable read;
    public boolean write;

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        InvalidTypeIdException.read(this, new removeOnUserLeaveHintListener(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, _init_lambda5.AudioAttributesImplApi26Parcelizer.ActionBar);
        this.AudioAttributesCompatParcelizer = typedArrayObtainStyledAttributes.getDrawable(_init_lambda5.AudioAttributesImplApi26Parcelizer.ActionBar_background);
        this.read = typedArrayObtainStyledAttributes.getDrawable(_init_lambda5.AudioAttributesImplApi26Parcelizer.ActionBar_backgroundStacked);
        this.MediaBrowserCompatItemReceiver = typedArrayObtainStyledAttributes.getDimensionPixelSize(_init_lambda5.AudioAttributesImplApi26Parcelizer.ActionBar_height, -1);
        boolean z = true;
        if (getId() == _init_lambda5.AudioAttributesImplBaseParcelizer.split_action_bar) {
            this.write = true;
            this.IconCompatParcelizer = typedArrayObtainStyledAttributes.getDrawable(_init_lambda5.AudioAttributesImplApi26Parcelizer.ActionBar_backgroundSplit);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.write ? this.AudioAttributesCompatParcelizer != null || this.read != null : this.IconCompatParcelizer != null) {
            z = false;
        }
        setWillNotDraw(z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.AudioAttributesImplBaseParcelizer = findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.action_bar);
        this.MediaBrowserCompatCustomActionResultReceiver = findViewById(_init_lambda5.AudioAttributesImplBaseParcelizer.action_context_bar);
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.AudioAttributesCompatParcelizer;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.AudioAttributesCompatParcelizer);
        }
        this.AudioAttributesCompatParcelizer = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.AudioAttributesImplBaseParcelizer;
            if (view != null) {
                this.AudioAttributesCompatParcelizer.setBounds(view.getLeft(), this.AudioAttributesImplBaseParcelizer.getTop(), this.AudioAttributesImplBaseParcelizer.getRight(), this.AudioAttributesImplBaseParcelizer.getBottom());
            }
        }
        setWillNotDraw(!this.write ? !(this.AudioAttributesCompatParcelizer == null && this.read == null) : this.IconCompatParcelizer != null);
        invalidate();
        IconCompatParcelizer.IconCompatParcelizer(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.read;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.read);
        }
        this.read = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.RemoteActionCompatParcelizer && (drawable2 = this.read) != null) {
                drawable2.setBounds(this.AudioAttributesImplApi21Parcelizer.getLeft(), this.AudioAttributesImplApi21Parcelizer.getTop(), this.AudioAttributesImplApi21Parcelizer.getRight(), this.AudioAttributesImplApi21Parcelizer.getBottom());
            }
        }
        setWillNotDraw(!this.write ? !(this.AudioAttributesCompatParcelizer == null && this.read == null) : this.IconCompatParcelizer != null);
        invalidate();
        IconCompatParcelizer.IconCompatParcelizer(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.IconCompatParcelizer;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.IconCompatParcelizer);
        }
        this.IconCompatParcelizer = drawable;
        boolean z = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.write && (drawable2 = this.IconCompatParcelizer) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.write ? !(this.AudioAttributesCompatParcelizer != null || this.read != null) : this.IconCompatParcelizer == null) {
            z = true;
        }
        setWillNotDraw(z);
        invalidate();
        IconCompatParcelizer.IconCompatParcelizer(this);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z = i == 0;
        Drawable drawable = this.AudioAttributesCompatParcelizer;
        if (drawable != null) {
            drawable.setVisible(z, false);
        }
        Drawable drawable2 = this.read;
        if (drawable2 != null) {
            drawable2.setVisible(z, false);
        }
        Drawable drawable3 = this.IconCompatParcelizer;
        if (drawable3 != null) {
            drawable3.setVisible(z, false);
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (drawable == this.AudioAttributesCompatParcelizer && !this.write) {
            return true;
        }
        if (drawable == this.read && this.RemoteActionCompatParcelizer) {
            return true;
        }
        return (drawable == this.IconCompatParcelizer && this.write) || super.verifyDrawable(drawable);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.AudioAttributesCompatParcelizer;
        if (drawable != null && drawable.isStateful()) {
            this.AudioAttributesCompatParcelizer.setState(getDrawableState());
        }
        Drawable drawable2 = this.read;
        if (drawable2 != null && drawable2.isStateful()) {
            this.read.setState(getDrawableState());
        }
        Drawable drawable3 = this.IconCompatParcelizer;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.IconCompatParcelizer.setState(getDrawableState());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.AudioAttributesCompatParcelizer;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.read;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.IconCompatParcelizer;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    public void setTransitioning(boolean z) {
        this.AudioAttributesImplApi26Parcelizer = z;
        setDescendantFocusability(z ? 393216 : 262144);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.AudioAttributesImplApi26Parcelizer || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    public void setTabContainer(ScrollingTabContainerView scrollingTabContainerView) {
        View view = this.AudioAttributesImplApi21Parcelizer;
        if (view != null) {
            removeView(view);
        }
        this.AudioAttributesImplApi21Parcelizer = scrollingTabContainerView;
        if (scrollingTabContainerView != null) {
            addView(scrollingTabContainerView);
            ViewGroup.LayoutParams layoutParams = scrollingTabContainerView.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            scrollingTabContainerView.setAllowCollapse(false);
        }
    }

    public final View RemoteActionCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }

    private static boolean read(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    private static int write(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int iWrite;
        int i3;
        if (this.AudioAttributesImplBaseParcelizer == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.MediaBrowserCompatItemReceiver) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
        if (this.AudioAttributesImplBaseParcelizer != null) {
            int mode = View.MeasureSpec.getMode(i2);
            View view = this.AudioAttributesImplApi21Parcelizer;
            if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
                return;
            }
            if (!read(this.AudioAttributesImplBaseParcelizer)) {
                iWrite = write(this.AudioAttributesImplBaseParcelizer);
            } else {
                iWrite = !read(this.MediaBrowserCompatCustomActionResultReceiver) ? write(this.MediaBrowserCompatCustomActionResultReceiver) : 0;
            }
            setMeasuredDimension(getMeasuredWidth(), Math.min(iWrite + write(this.AudioAttributesImplApi21Parcelizer), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i2) : Integer.MAX_VALUE));
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        View view = this.AudioAttributesImplApi21Parcelizer;
        boolean z2 = true;
        boolean z3 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            view.layout(i, (measuredHeight - view.getMeasuredHeight()) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, i3, measuredHeight - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        }
        if (this.write) {
            Drawable drawable2 = this.IconCompatParcelizer;
            if (drawable2 == null) {
                return;
            } else {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        } else {
            if (this.AudioAttributesCompatParcelizer == null) {
                z2 = false;
            } else if (this.AudioAttributesImplBaseParcelizer.getVisibility() == 0) {
                this.AudioAttributesCompatParcelizer.setBounds(this.AudioAttributesImplBaseParcelizer.getLeft(), this.AudioAttributesImplBaseParcelizer.getTop(), this.AudioAttributesImplBaseParcelizer.getRight(), this.AudioAttributesImplBaseParcelizer.getBottom());
            } else {
                View view2 = this.MediaBrowserCompatCustomActionResultReceiver;
                if (view2 != null && view2.getVisibility() == 0) {
                    this.AudioAttributesCompatParcelizer.setBounds(this.MediaBrowserCompatCustomActionResultReceiver.getLeft(), this.MediaBrowserCompatCustomActionResultReceiver.getTop(), this.MediaBrowserCompatCustomActionResultReceiver.getRight(), this.MediaBrowserCompatCustomActionResultReceiver.getBottom());
                } else {
                    this.AudioAttributesCompatParcelizer.setBounds(0, 0, 0, 0);
                }
            }
            this.RemoteActionCompatParcelizer = z3;
            if (z3 && (drawable = this.read) != null) {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            } else if (!z2) {
                return;
            }
        }
        invalidate();
    }

    /* JADX INFO: loaded from: classes4.dex */
    static class IconCompatParcelizer {
        public static void IconCompatParcelizer(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }
}
