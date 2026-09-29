package kotlin;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class checkChannelAssignment {
    private final ArrayList<read> RemoteActionCompatParcelizer = new ArrayList<>();
    private read read = null;
    ValueAnimator IconCompatParcelizer = null;
    private final Animator.AnimatorListener write = new AnimatorListenerAdapter() { // from class: o.checkChannelAssignment.2
        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (checkChannelAssignment.this.IconCompatParcelizer == animator) {
                checkChannelAssignment.this.IconCompatParcelizer = null;
            }
        }
    };

    public final void write(int[] iArr, ValueAnimator valueAnimator) {
        read readVar = new read(iArr, valueAnimator);
        valueAnimator.addListener(this.write);
        this.RemoteActionCompatParcelizer.add(readVar);
    }

    public final void read(int[] iArr) {
        read readVar;
        int size = this.RemoteActionCompatParcelizer.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                readVar = null;
                break;
            }
            readVar = this.RemoteActionCompatParcelizer.get(i);
            if (StateSet.stateSetMatches(readVar.write, iArr)) {
                break;
            } else {
                i++;
            }
        }
        read readVar2 = this.read;
        if (readVar != readVar2) {
            if (readVar2 != null) {
                read();
            }
            this.read = readVar;
            if (readVar != null) {
                write(readVar);
            }
        }
    }

    private void write(read readVar) {
        ValueAnimator valueAnimator = readVar.AudioAttributesCompatParcelizer;
        this.IconCompatParcelizer = valueAnimator;
        valueAnimator.start();
    }

    private void read() {
        ValueAnimator valueAnimator = this.IconCompatParcelizer;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.IconCompatParcelizer = null;
        }
    }

    public final void AudioAttributesCompatParcelizer() {
        ValueAnimator valueAnimator = this.IconCompatParcelizer;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.IconCompatParcelizer = null;
        }
    }

    static class read {
        final ValueAnimator AudioAttributesCompatParcelizer;
        final int[] write;

        read(int[] iArr, ValueAnimator valueAnimator) {
            this.write = iArr;
            this.AudioAttributesCompatParcelizer = valueAnimator;
        }
    }
}
