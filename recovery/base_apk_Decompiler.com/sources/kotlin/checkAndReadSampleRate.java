package kotlin;

import android.animation.TimeInterpolator;

/* JADX INFO: loaded from: classes5.dex */
public final class checkAndReadSampleRate implements TimeInterpolator {
    private final TimeInterpolator IconCompatParcelizer;

    private checkAndReadSampleRate(TimeInterpolator timeInterpolator) {
        this.IconCompatParcelizer = timeInterpolator;
    }

    public static TimeInterpolator write(boolean z, TimeInterpolator timeInterpolator) {
        return z ? timeInterpolator : new checkAndReadSampleRate(timeInterpolator);
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return 1.0f - this.IconCompatParcelizer.getInterpolation(f);
    }
}
