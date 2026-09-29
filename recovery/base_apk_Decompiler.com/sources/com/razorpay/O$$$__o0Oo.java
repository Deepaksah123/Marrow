package com.razorpay;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes5.dex */
class O$$$__o0Oo {
    private int $0o__;
    private FrameLayout.LayoutParams $O0Oo$oo0o;
    private View O$$$__o0Oo;
    private int _$O0_o;

    static void assistActivity(Activity activity) {
        new O$$$__o0Oo(activity);
    }

    private O$$$__o0Oo(Activity activity) {
        View childAt = ((FrameLayout) activity.findViewById(android.R.id.content)).getChildAt(0);
        this.O$$$__o0Oo = childAt;
        childAt.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.razorpay.O$$$__o0Oo.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public void onGlobalLayout() {
                O$$$__o0Oo.this.O$$$__o0Oo();
            }
        });
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.O$$$__o0Oo.getLayoutParams();
        this.$O0Oo$oo0o = layoutParams;
        this.$0o__ = ((ViewGroup.LayoutParams) layoutParams).height;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O$$$__o0Oo() {
        int i_$O0_o = _$O0_o();
        if (i_$O0_o != this._$O0_o) {
            int height = this.O$$$__o0Oo.getRootView().getHeight();
            if (height - i_$O0_o > height / 4) {
                ((ViewGroup.LayoutParams) this.$O0Oo$oo0o).height = i_$O0_o;
            } else {
                ((ViewGroup.LayoutParams) this.$O0Oo$oo0o).height = this.$0o__;
            }
            this.O$$$__o0Oo.requestLayout();
            this._$O0_o = i_$O0_o;
        }
    }

    private int _$O0_o() {
        Rect rect = new Rect();
        this.O$$$__o0Oo.getWindowVisibleDisplayFrame(rect);
        return rect.bottom - rect.top;
    }
}
