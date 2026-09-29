package com.google.android.material.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.LinkedHashSet;
import kotlin.BinarySearchSeekerSeekOperationParams;
import kotlin.calculateNextSearchBytePosition;
import kotlin.getSampleRateLookupKey;

/* JADX INFO: loaded from: classes5.dex */
public class HideBottomViewOnScrollBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    private static final int AudioAttributesCompatParcelizer = calculateNextSearchBytePosition.IconCompatParcelizer.motionDurationLong2;
    private static final int read = calculateNextSearchBytePosition.IconCompatParcelizer.motionDurationMedium4;
    private static final int write = calculateNextSearchBytePosition.IconCompatParcelizer.motionEasingEmphasizedInterpolator;
    private TimeInterpolator AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private int IconCompatParcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private TimeInterpolator MediaBrowserCompatItemReceiver;
    private int MediaBrowserCompatSearchResultReceiver;
    private final LinkedHashSet<RemoteActionCompatParcelizer> MediaDescriptionCompat;
    private ViewPropertyAnimator RemoteActionCompatParcelizer;

    public interface RemoteActionCompatParcelizer {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean write(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i, int i2) {
        return i == 2;
    }

    static /* synthetic */ ViewPropertyAnimator read(HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior) {
        hideBottomViewOnScrollBehavior.RemoteActionCompatParcelizer = null;
        return null;
    }

    public HideBottomViewOnScrollBehavior() {
        this.MediaDescriptionCompat = new LinkedHashSet<>();
        this.MediaBrowserCompatSearchResultReceiver = 0;
        this.AudioAttributesImplApi26Parcelizer = 2;
        this.IconCompatParcelizer = 0;
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.MediaDescriptionCompat = new LinkedHashSet<>();
        this.MediaBrowserCompatSearchResultReceiver = 0;
        this.AudioAttributesImplApi26Parcelizer = 2;
        this.IconCompatParcelizer = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean write(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.MediaBrowserCompatSearchResultReceiver = v.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) v.getLayoutParams()).bottomMargin;
        this.MediaBrowserCompatCustomActionResultReceiver = getSampleRateLookupKey.write(v.getContext(), AudioAttributesCompatParcelizer, 225);
        this.AudioAttributesImplBaseParcelizer = getSampleRateLookupKey.write(v.getContext(), read, 175);
        Context context = v.getContext();
        int i2 = write;
        this.AudioAttributesImplApi21Parcelizer = getSampleRateLookupKey.read(context, i2, BinarySearchSeekerSeekOperationParams.RemoteActionCompatParcelizer);
        this.MediaBrowserCompatItemReceiver = getSampleRateLookupKey.read(v.getContext(), i2, BinarySearchSeekerSeekOperationParams.IconCompatParcelizer);
        return super.write(coordinatorLayout, v, i);
    }

    public final void read(V v, int i) {
        this.IconCompatParcelizer = i;
        if (this.AudioAttributesImplApi26Parcelizer == 1) {
            v.setTranslationY(this.MediaBrowserCompatSearchResultReceiver + i);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void read(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i2 > 0) {
            read(v);
        } else if (i2 < 0) {
            IconCompatParcelizer(v);
        }
    }

    private boolean RemoteActionCompatParcelizer() {
        return this.AudioAttributesImplApi26Parcelizer == 2;
    }

    private void IconCompatParcelizer(V v) {
        RemoteActionCompatParcelizer(v);
    }

    private void RemoteActionCompatParcelizer(V v) {
        if (RemoteActionCompatParcelizer()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.RemoteActionCompatParcelizer;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        write(2);
        AudioAttributesCompatParcelizer(v, 0, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplApi21Parcelizer);
    }

    private boolean read() {
        return this.AudioAttributesImplApi26Parcelizer == 1;
    }

    private void read(V v) {
        AudioAttributesCompatParcelizer(v);
    }

    private void AudioAttributesCompatParcelizer(V v) {
        if (read()) {
            return;
        }
        ViewPropertyAnimator viewPropertyAnimator = this.RemoteActionCompatParcelizer;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            v.clearAnimation();
        }
        write(1);
        AudioAttributesCompatParcelizer(v, this.MediaBrowserCompatSearchResultReceiver + this.IconCompatParcelizer, this.AudioAttributesImplBaseParcelizer, this.MediaBrowserCompatItemReceiver);
    }

    private void write(int i) {
        this.AudioAttributesImplApi26Parcelizer = i;
        for (RemoteActionCompatParcelizer remoteActionCompatParcelizer : this.MediaDescriptionCompat) {
        }
    }

    private void AudioAttributesCompatParcelizer(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.RemoteActionCompatParcelizer = v.animate().translationY(i).setInterpolator(timeInterpolator).setDuration(j).setListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.behavior.HideBottomViewOnScrollBehavior.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                HideBottomViewOnScrollBehavior.read(HideBottomViewOnScrollBehavior.this);
            }
        });
    }
}
