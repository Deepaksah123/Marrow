package kotlin;

import android.animation.Animator;
import kotlin.getActivityBanner;

/* JADX INFO: loaded from: classes3.dex */
public abstract class setFromXingHeaderValue<T extends Animator> {
    protected peekId3Data IconCompatParcelizer;
    protected final int[] RemoteActionCompatParcelizer;
    protected final float[] read;

    protected static float RemoteActionCompatParcelizer(int i, int i2, int i3) {
        return (i - i2) / i3;
    }

    public abstract void AudioAttributesCompatParcelizer();

    public abstract void IconCompatParcelizer();

    public abstract void IconCompatParcelizer(getActivityBanner.RemoteActionCompatParcelizer remoteActionCompatParcelizer);

    abstract void RemoteActionCompatParcelizer();

    public abstract void read();

    public abstract void write();

    protected setFromXingHeaderValue(int i) {
        this.read = new float[i << 1];
        this.RemoteActionCompatParcelizer = new int[i];
    }

    protected final void write(peekId3Data peekid3data) {
        this.IconCompatParcelizer = peekid3data;
    }
}
