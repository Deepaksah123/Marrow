package androidx.constraintlayout.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes2.dex */
public class Group extends ConstraintHelper {
    public Group(Context context) {
        super(context);
    }

    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Group(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void AudioAttributesCompatParcelizer(AttributeSet attributeSet) {
        super.AudioAttributesCompatParcelizer(attributeSet);
        this.AudioAttributesCompatParcelizer = false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AudioAttributesImplBaseParcelizer();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        AudioAttributesImplBaseParcelizer();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        AudioAttributesImplBaseParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void IconCompatParcelizer(ConstraintLayout constraintLayout) {
        read(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void write() {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.getOnBackPressedDispatcherannotations.onFastForward(0);
        layoutParams.getOnBackPressedDispatcherannotations.MediaMetadataCompat(0);
    }
}
