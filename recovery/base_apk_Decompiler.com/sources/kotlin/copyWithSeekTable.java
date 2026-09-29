package kotlin;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.view.View;
import androidx.drawerlayout.widget.DrawerLayout;

/* JADX INFO: loaded from: classes5.dex */
public final class copyWithSeekTable {
    private static final int read = Color.alpha(-1728053248);

    public static ValueAnimator.AnimatorUpdateListener write(final DrawerLayout drawerLayout) {
        return new ValueAnimator.AnimatorUpdateListener() { // from class: o.copyWithPictureFrames
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                drawerLayout.setScrimColor(_verifyNumberForScalarCoercion.AudioAttributesCompatParcelizer(-1728053248, BinarySearchSeekerSeekOperationParams.RemoteActionCompatParcelizer(copyWithSeekTable.read, 0, valueAnimator.getAnimatedFraction())));
            }
        };
    }

    public static Animator.AnimatorListener IconCompatParcelizer(final DrawerLayout drawerLayout, final View view) {
        return new AnimatorListenerAdapter() { // from class: o.copyWithSeekTable.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                drawerLayout.write(view, false);
                drawerLayout.setScrimColor(-1728053248);
            }
        };
    }
}
