package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* JADX INFO: loaded from: classes5.dex */
public class VisibilityAwareImageButton extends ImageButton {
    private int IconCompatParcelizer;

    public VisibilityAwareImageButton(Context context) {
        this(context, null);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.IconCompatParcelizer = getVisibility();
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        RemoteActionCompatParcelizer(i, true);
    }

    public final void RemoteActionCompatParcelizer(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.IconCompatParcelizer = i;
        }
    }

    public final int AudioAttributesImplApi21Parcelizer() {
        return this.IconCompatParcelizer;
    }
}
