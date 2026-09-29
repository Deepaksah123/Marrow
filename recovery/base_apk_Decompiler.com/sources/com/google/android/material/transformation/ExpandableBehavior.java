package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import kotlin.InvalidTypeIdException;
import kotlin.endTracks;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior<View> {
    private int RemoteActionCompatParcelizer;

    protected abstract boolean AudioAttributesCompatParcelizer(View view, View view2, boolean z, boolean z2);

    public ExpandableBehavior() {
        this.RemoteActionCompatParcelizer = 0;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.RemoteActionCompatParcelizer = 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean write(CoordinatorLayout coordinatorLayout, final View view, int i) {
        final endTracks endtracksWrite;
        if (InvalidTypeIdException.onSeekTo(view) || (endtracksWrite = write(coordinatorLayout, view)) == null || !RemoteActionCompatParcelizer(endtracksWrite.IconCompatParcelizer())) {
            return false;
        }
        final int i2 = endtracksWrite.IconCompatParcelizer() ? 1 : 2;
        this.RemoteActionCompatParcelizer = i2;
        view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.google.android.material.transformation.ExpandableBehavior.2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                view.getViewTreeObserver().removeOnPreDrawListener(this);
                if (ExpandableBehavior.this.RemoteActionCompatParcelizer == i2) {
                    ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                    endTracks endtracks = endtracksWrite;
                    expandableBehavior.AudioAttributesCompatParcelizer((View) endtracks, view, endtracks.IconCompatParcelizer(), false);
                }
                return false;
            }
        });
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean IconCompatParcelizer(CoordinatorLayout coordinatorLayout, View view, View view2) {
        endTracks endtracks = (endTracks) view2;
        if (!RemoteActionCompatParcelizer(endtracks.IconCompatParcelizer())) {
            return false;
        }
        this.RemoteActionCompatParcelizer = endtracks.IconCompatParcelizer() ? 1 : 2;
        return AudioAttributesCompatParcelizer((View) endtracks, view, endtracks.IconCompatParcelizer(), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private endTracks write(CoordinatorLayout coordinatorLayout, View view) {
        List<View> listRemoteActionCompatParcelizer = coordinatorLayout.RemoteActionCompatParcelizer(view);
        int size = listRemoteActionCompatParcelizer.size();
        for (int i = 0; i < size; i++) {
            View view2 = listRemoteActionCompatParcelizer.get(i);
            if (write(view, view2)) {
                return (endTracks) view2;
            }
        }
        return null;
    }

    private boolean RemoteActionCompatParcelizer(boolean z) {
        if (!z) {
            return this.RemoteActionCompatParcelizer == 1;
        }
        int i = this.RemoteActionCompatParcelizer;
        return i == 0 || i == 2;
    }
}
