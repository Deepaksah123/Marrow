package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.underestimatedResult;

/* JADX INFO: loaded from: classes3.dex */
class ViewOffsetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    private int IconCompatParcelizer;
    private underestimatedResult read;
    private int write;

    public ViewOffsetBehavior() {
        this.IconCompatParcelizer = 0;
        this.write = 0;
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.IconCompatParcelizer = 0;
        this.write = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean write(CoordinatorLayout coordinatorLayout, V v, int i) {
        a_(coordinatorLayout, v, i);
        if (this.read == null) {
            this.read = new underestimatedResult(v);
        }
        this.read.write();
        this.read.AudioAttributesCompatParcelizer();
        int i2 = this.IconCompatParcelizer;
        if (i2 == 0) {
            return true;
        }
        this.read.IconCompatParcelizer(i2);
        this.IconCompatParcelizer = 0;
        return true;
    }

    protected void a_(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.write(v, i);
    }

    public boolean RemoteActionCompatParcelizer(int i) {
        underestimatedResult underestimatedresult = this.read;
        if (underestimatedresult != null) {
            return underestimatedresult.IconCompatParcelizer(i);
        }
        this.IconCompatParcelizer = i;
        return false;
    }

    public int read() {
        underestimatedResult underestimatedresult = this.read;
        if (underestimatedresult != null) {
            return underestimatedresult.IconCompatParcelizer();
        }
        return 0;
    }
}
