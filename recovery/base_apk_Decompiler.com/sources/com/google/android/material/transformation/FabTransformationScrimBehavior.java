package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import kotlin.getCeilingBytePosition;
import kotlin.updateSeekCeiling;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {
    private final updateSeekCeiling read;
    private final updateSeekCeiling write;

    public FabTransformationScrimBehavior() {
        this.read = new updateSeekCeiling(75L);
        this.write = new updateSeekCeiling(0L);
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.read = new updateSeekCeiling(75L);
        this.write = new updateSeekCeiling(0L);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean write(View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean AudioAttributesCompatParcelizer(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return super.AudioAttributesCompatParcelizer(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    protected final AnimatorSet IconCompatParcelizer(View view, final View view2, final boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        new ArrayList();
        RemoteActionCompatParcelizer(view2, z, z2, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        getCeilingBytePosition.IconCompatParcelizer(animatorSet, arrayList);
        animatorSet.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.transformation.FabTransformationScrimBehavior.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                if (z) {
                    view2.setVisibility(0);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                if (z) {
                    return;
                }
                view2.setVisibility(4);
            }
        });
        return animatorSet;
    }

    private void RemoteActionCompatParcelizer(View view, boolean z, boolean z2, List<Animator> list) {
        ObjectAnimator objectAnimatorOfFloat;
        updateSeekCeiling updateseekceiling = z ? this.read : this.write;
        if (z) {
            if (!z2) {
                view.setAlpha(BitmapDescriptorFactory.HUE_RED);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, BitmapDescriptorFactory.HUE_RED);
        }
        updateseekceiling.read(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }
}
