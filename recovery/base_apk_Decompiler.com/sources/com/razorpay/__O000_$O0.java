package com.razorpay;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.widget.RelativeLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes5.dex */
final class __O000_$O0 {
    private float $0o__;
    private View $O0Oo$oo0o;
    private Context O$$$__o0Oo;
    private int OoOo_;
    private ViewGroup _$O0_o;
    private String _Oo_O_$;

    public __O000_$O0(Context context, ViewGroup viewGroup) {
        this(context, viewGroup, null);
    }

    public __O000_$O0(Context context, ViewGroup viewGroup, String str) {
        this._Oo_O_$ = str;
        this.O$$$__o0Oo = context;
        this._$O0_o = viewGroup;
        O$$$__o0Oo();
        this.OoOo_ = O$$$__o0Oo(4);
        $O0Oo$oo0o();
    }

    private void O$$$__o0Oo() {
        this.$0o__ = r0.widthPixels / this.O$$$__o0Oo.getResources().getDisplayMetrics().density;
    }

    private int _$O0_o() {
        TypedValue typedValue = new TypedValue();
        if (this.O$$$__o0Oo.getTheme().resolveAttribute(android.R.attr.colorAccent, typedValue, true)) {
            return typedValue.data;
        }
        return Color.parseColor("#4aa3df");
    }

    private void $O0Oo$oo0o() {
        int i_$O0_o;
        this.$O0Oo$oo0o = new View(this.O$$$__o0Oo);
        this.$O0Oo$oo0o.setLayoutParams(new RelativeLayout.LayoutParams(0, this.OoOo_));
        if (TextUtils.isEmpty(this._Oo_O_$)) {
            i_$O0_o = _$O0_o();
        } else {
            try {
                i_$O0_o = Color.parseColor(this._Oo_O_$);
            } catch (IllegalArgumentException unused) {
                i_$O0_o = _$O0_o();
            }
        }
        float[] fArr = new float[3];
        Color.colorToHSV(i_$O0_o, fArr);
        fArr[2] = fArr[2] * 0.8f;
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i_$O0_o, Color.HSVToColor(fArr)});
        gradientDrawable.setCornerRadius(BitmapDescriptorFactory.HUE_RED);
        this.$O0Oo$oo0o.setBackgroundDrawable(gradientDrawable);
        this._$O0_o.addView(this.$O0Oo$oo0o);
    }

    private int O$$$__o0Oo(int i) {
        return (int) TypedValue.applyDimension(1, i, this.O$$$__o0Oo.getResources().getDisplayMetrics());
    }

    final void show(int i) {
        if (i == 100) {
            hide();
        } else {
            O$$$__o0Oo(i, 500);
        }
    }

    final void hide() {
        _$O0_o(200);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O$$$__o0Oo(int i, int i2) {
        O__0_0oO o__0_0oO = new O__0_0oO(this.$O0Oo$oo0o, O$$$__o0Oo((int) ((this.$0o__ * i) / 100.0f)));
        o__0_0oO.setDuration(i2);
        this.$O0Oo$oo0o.startAnimation(o__0_0oO);
        o__0_0oO.setAnimationListener(new Animation.AnimationListener() { // from class: com.razorpay.__O000_$O0.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }
        });
    }

    private void _$O0_o(int i) {
        O__0_0oO o__0_0oO = new O__0_0oO(this.$O0Oo$oo0o, O$$$__o0Oo((int) this.$0o__));
        o__0_0oO.setDuration(i);
        this.$O0Oo$oo0o.startAnimation(o__0_0oO);
        o__0_0oO.setAnimationListener(new Animation.AnimationListener() { // from class: com.razorpay.__O000_$O0.2
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                __O000_$O0.this.O$$$__o0Oo(0, 10);
            }
        });
    }
}
