package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.InvalidTypeIdException;
import kotlin.StdKeyDeserializer;
import kotlin._clearIfStdImpl;

/* JADX INFO: loaded from: classes3.dex */
abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {
    private Rect IconCompatParcelizer;
    private int RemoteActionCompatParcelizer;
    final Rect read;
    private int write;

    private static int read(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    abstract View IconCompatParcelizer(List<View> list);

    float RemoteActionCompatParcelizer(View view) {
        return 1.0f;
    }

    protected boolean write() {
        return false;
    }

    public HeaderScrollingViewBehavior() {
        this.read = new Rect();
        this.IconCompatParcelizer = new Rect();
        this.RemoteActionCompatParcelizer = 0;
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.read = new Rect();
        this.IconCompatParcelizer = new Rect();
        this.RemoteActionCompatParcelizer = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean write(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View viewIconCompatParcelizer;
        WindowInsetsCompat windowInsetsCompatY_;
        int i5 = view.getLayoutParams().height;
        if ((i5 != -1 && i5 != -2) || (viewIconCompatParcelizer = IconCompatParcelizer(coordinatorLayout.RemoteActionCompatParcelizer(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size > 0) {
            if (InvalidTypeIdException.MediaBrowserCompatCustomActionResultReceiver(viewIconCompatParcelizer) && (windowInsetsCompatY_ = coordinatorLayout.Y_()) != null) {
                size += windowInsetsCompatY_.MediaBrowserCompatCustomActionResultReceiver() + windowInsetsCompatY_.AudioAttributesImplBaseParcelizer();
            }
        } else {
            size = coordinatorLayout.getHeight();
        }
        int iIconCompatParcelizer = size + IconCompatParcelizer(viewIconCompatParcelizer);
        int measuredHeight = viewIconCompatParcelizer.getMeasuredHeight();
        if (write()) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
            iIconCompatParcelizer -= measuredHeight;
        }
        coordinatorLayout.write(view, i, i2, View.MeasureSpec.makeMeasureSpec(iIconCompatParcelizer, i5 == -1 ? 1073741824 : Integer.MIN_VALUE), i4);
        return true;
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    protected final void a_(CoordinatorLayout coordinatorLayout, View view, int i) {
        View viewIconCompatParcelizer = IconCompatParcelizer(coordinatorLayout.RemoteActionCompatParcelizer(view));
        if (viewIconCompatParcelizer != null) {
            CoordinatorLayout.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (CoordinatorLayout.RemoteActionCompatParcelizer) view.getLayoutParams();
            Rect rect = this.read;
            int paddingLeft = coordinatorLayout.getPaddingLeft();
            int i2 = ((ViewGroup.MarginLayoutParams) remoteActionCompatParcelizer).leftMargin;
            int bottom = viewIconCompatParcelizer.getBottom();
            int i3 = ((ViewGroup.MarginLayoutParams) remoteActionCompatParcelizer).topMargin;
            int width = coordinatorLayout.getWidth();
            int paddingRight = coordinatorLayout.getPaddingRight();
            rect.set(paddingLeft + i2, bottom + i3, (width - paddingRight) - ((ViewGroup.MarginLayoutParams) remoteActionCompatParcelizer).rightMargin, ((coordinatorLayout.getHeight() + viewIconCompatParcelizer.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) remoteActionCompatParcelizer).bottomMargin);
            WindowInsetsCompat windowInsetsCompatY_ = coordinatorLayout.Y_();
            if (windowInsetsCompatY_ != null && InvalidTypeIdException.MediaBrowserCompatCustomActionResultReceiver(coordinatorLayout) && !InvalidTypeIdException.MediaBrowserCompatCustomActionResultReceiver(view)) {
                rect.left += windowInsetsCompatY_.AudioAttributesImplApi21Parcelizer();
                rect.right -= windowInsetsCompatY_.MediaBrowserCompatItemReceiver();
            }
            Rect rect2 = this.IconCompatParcelizer;
            _clearIfStdImpl.AudioAttributesCompatParcelizer(read(remoteActionCompatParcelizer.write), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(viewIconCompatParcelizer);
            view.layout(rect2.left, rect2.top - iAudioAttributesCompatParcelizer, rect2.right, rect2.bottom - iAudioAttributesCompatParcelizer);
            this.RemoteActionCompatParcelizer = rect2.top - viewIconCompatParcelizer.getBottom();
            return;
        }
        super.a_(coordinatorLayout, view, i);
        this.RemoteActionCompatParcelizer = 0;
    }

    final int AudioAttributesCompatParcelizer(View view) {
        if (this.write == 0) {
            return 0;
        }
        float fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(view);
        int i = this.write;
        return StdKeyDeserializer.read((int) (fRemoteActionCompatParcelizer * i), 0, i);
    }

    int IconCompatParcelizer(View view) {
        return view.getMeasuredHeight();
    }

    final int AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void IconCompatParcelizer(int i) {
        this.write = i;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.write;
    }
}
