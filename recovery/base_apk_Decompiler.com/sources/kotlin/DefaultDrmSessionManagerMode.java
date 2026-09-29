package kotlin;

import android.view.GestureDetector;
import android.view.View;
import com.github.mikephil.charting.charts.Chart;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DefaultDrmSessionManagerMode<T extends Chart<?>> extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener {
    protected GestureDetector IconCompatParcelizer;
    protected createAndAcquireSessionWithRetry read;
    protected T write;
    protected read AudioAttributesCompatParcelizer = read.NONE;
    protected int RemoteActionCompatParcelizer = 0;

    public enum read {
        NONE,
        DRAG,
        X_ZOOM,
        Y_ZOOM,
        PINCH_ZOOM,
        ROTATE,
        SINGLE_TAP,
        DOUBLE_TAP,
        LONG_PRESS,
        FLING
    }

    public DefaultDrmSessionManagerMode(T t) {
        this.write = t;
        this.IconCompatParcelizer = new GestureDetector(t.getContext(), this);
    }

    public final void AudioAttributesCompatParcelizer() {
        this.write.onStop();
    }

    public final void RemoteActionCompatParcelizer() {
        this.write.onStop();
    }

    public final void AudioAttributesCompatParcelizer(createAndAcquireSessionWithRetry createandacquiresessionwithretry) {
        this.read = createandacquiresessionwithretry;
    }

    protected final void RemoteActionCompatParcelizer(createAndAcquireSessionWithRetry createandacquiresessionwithretry) {
        if (createandacquiresessionwithretry == null || createandacquiresessionwithretry.AudioAttributesCompatParcelizer(this.read)) {
            this.write.RemoteActionCompatParcelizer(null);
            this.read = null;
        } else {
            this.write.RemoteActionCompatParcelizer(createandacquiresessionwithretry);
            this.read = createandacquiresessionwithretry;
        }
    }

    protected static float read(float f, float f2, float f3, float f4) {
        float f5 = f - f2;
        float f6 = f3 - f4;
        return (float) Math.sqrt((f5 * f5) + (f6 * f6));
    }
}
