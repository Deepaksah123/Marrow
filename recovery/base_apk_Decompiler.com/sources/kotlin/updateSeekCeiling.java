package kotlin;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;

/* JADX INFO: loaded from: classes5.dex */
public final class updateSeekCeiling {
    private int AudioAttributesCompatParcelizer;
    private long IconCompatParcelizer;
    private int RemoteActionCompatParcelizer;
    private TimeInterpolator read;
    private long write;

    public updateSeekCeiling(long j) {
        this.read = null;
        this.RemoteActionCompatParcelizer = 0;
        this.AudioAttributesCompatParcelizer = 1;
        this.write = j;
        this.IconCompatParcelizer = 150L;
    }

    private updateSeekCeiling(long j, long j2, TimeInterpolator timeInterpolator) {
        this.RemoteActionCompatParcelizer = 0;
        this.AudioAttributesCompatParcelizer = 1;
        this.write = j;
        this.IconCompatParcelizer = j2;
        this.read = timeInterpolator;
    }

    public final void read(Animator animator) {
        animator.setStartDelay(AudioAttributesCompatParcelizer());
        animator.setDuration(write());
        animator.setInterpolator(read());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(IconCompatParcelizer());
            valueAnimator.setRepeatMode(RemoteActionCompatParcelizer());
        }
    }

    public final long AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final long write() {
        return this.IconCompatParcelizer;
    }

    public final TimeInterpolator read() {
        TimeInterpolator timeInterpolator = this.read;
        return timeInterpolator != null ? timeInterpolator : BinarySearchSeekerSeekOperationParams.AudioAttributesCompatParcelizer;
    }

    private int IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    private int RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    static updateSeekCeiling IconCompatParcelizer(ValueAnimator valueAnimator) {
        updateSeekCeiling updateseekceiling = new updateSeekCeiling(valueAnimator.getStartDelay(), valueAnimator.getDuration(), RemoteActionCompatParcelizer(valueAnimator));
        updateseekceiling.RemoteActionCompatParcelizer = valueAnimator.getRepeatCount();
        updateseekceiling.AudioAttributesCompatParcelizer = valueAnimator.getRepeatMode();
        return updateseekceiling;
    }

    private static TimeInterpolator RemoteActionCompatParcelizer(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        if ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) {
            return BinarySearchSeekerSeekOperationParams.AudioAttributesCompatParcelizer;
        }
        if (interpolator instanceof AccelerateInterpolator) {
            return BinarySearchSeekerSeekOperationParams.IconCompatParcelizer;
        }
        return interpolator instanceof DecelerateInterpolator ? BinarySearchSeekerSeekOperationParams.RemoteActionCompatParcelizer : interpolator;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof updateSeekCeiling)) {
            return false;
        }
        updateSeekCeiling updateseekceiling = (updateSeekCeiling) obj;
        if (AudioAttributesCompatParcelizer() == updateseekceiling.AudioAttributesCompatParcelizer() && write() == updateseekceiling.write() && IconCompatParcelizer() == updateseekceiling.IconCompatParcelizer() && RemoteActionCompatParcelizer() == updateseekceiling.RemoteActionCompatParcelizer()) {
            return read().getClass().equals(updateseekceiling.read().getClass());
        }
        return false;
    }

    public final int hashCode() {
        int iAudioAttributesCompatParcelizer = (int) (AudioAttributesCompatParcelizer() ^ (AudioAttributesCompatParcelizer() >>> 32));
        int iWrite = (int) (write() ^ (write() >>> 32));
        return (((((((iAudioAttributesCompatParcelizer * 31) + iWrite) * 31) + read().getClass().hashCode()) * 31) + IconCompatParcelizer()) * 31) + RemoteActionCompatParcelizer();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(getClass().getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" delay: ");
        sb.append(AudioAttributesCompatParcelizer());
        sb.append(" duration: ");
        sb.append(write());
        sb.append(" interpolator: ");
        sb.append(read().getClass());
        sb.append(" repeatCount: ");
        sb.append(IconCompatParcelizer());
        sb.append(" repeatMode: ");
        sb.append(RemoteActionCompatParcelizer());
        sb.append("}\n");
        return sb.toString();
    }
}
