package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
import kotlin._init_lambda5;

/* JADX INFO: loaded from: classes.dex */
public final class ViewStubCompat extends View {
    private int AudioAttributesCompatParcelizer;
    private IconCompatParcelizer IconCompatParcelizer;
    private WeakReference<View> RemoteActionCompatParcelizer;
    private LayoutInflater read;
    private int write;

    public interface IconCompatParcelizer {
        void AudioAttributesCompatParcelizer(ViewStubCompat viewStubCompat, View view);
    }

    @Override // android.view.View
    protected final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.write = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, _init_lambda5.AudioAttributesImplApi26Parcelizer.ViewStubCompat, i, 0);
        this.AudioAttributesCompatParcelizer = typedArrayObtainStyledAttributes.getResourceId(_init_lambda5.AudioAttributesImplApi26Parcelizer.ViewStubCompat_android_inflatedId, -1);
        this.write = typedArrayObtainStyledAttributes.getResourceId(_init_lambda5.AudioAttributesImplApi26Parcelizer.ViewStubCompat_android_layout, 0);
        setId(typedArrayObtainStyledAttributes.getResourceId(_init_lambda5.AudioAttributesImplApi26Parcelizer.ViewStubCompat_android_id, -1));
        typedArrayObtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final void setInflatedId(int i) {
        this.AudioAttributesCompatParcelizer = i;
    }

    public final void setLayoutResource(int i) {
        this.write = i;
    }

    public final void setLayoutInflater(LayoutInflater layoutInflater) {
        this.read = layoutInflater;
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        WeakReference<View> weakReference = this.RemoteActionCompatParcelizer;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view != null) {
                view.setVisibility(i);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i);
        if (i == 0 || i == 4) {
            write();
        }
    }

    public final View write() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            if (this.write != 0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                LayoutInflater layoutInflaterFrom = this.read;
                if (layoutInflaterFrom == null) {
                    layoutInflaterFrom = LayoutInflater.from(getContext());
                }
                View viewInflate = layoutInflaterFrom.inflate(this.write, viewGroup, false);
                int i = this.AudioAttributesCompatParcelizer;
                if (i != -1) {
                    viewInflate.setId(i);
                }
                int iIndexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(viewInflate, iIndexOfChild, layoutParams);
                } else {
                    viewGroup.addView(viewInflate, iIndexOfChild);
                }
                this.RemoteActionCompatParcelizer = new WeakReference<>(viewInflate);
                IconCompatParcelizer iconCompatParcelizer = this.IconCompatParcelizer;
                if (iconCompatParcelizer != null) {
                    iconCompatParcelizer.AudioAttributesCompatParcelizer(this, viewInflate);
                }
                return viewInflate;
            }
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    public final void setOnInflateListener(IconCompatParcelizer iconCompatParcelizer) {
        this.IconCompatParcelizer = iconCompatParcelizer;
    }
}
