package kotlin;

import android.view.ViewConfiguration;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0002\u001a\u001f\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u0014\u0010\u0006\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000b"}, d2 = {"Lo/bufferMapProperty;", "p0", "", "p1", "IconCompatParcelizer", "(Lo/bufferMapProperty;F)F", "RemoteActionCompatParcelizer", "F", "read", "", "write", "D"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getDensity {
    private static final float RemoteActionCompatParcelizer = ViewConfiguration.getScrollFriction();
    private static final double read;
    private static final double write;

    static {
        double dLog = Math.log(0.78d) / Math.log(0.9d);
        write = dLog;
        read = dLog - 1.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float IconCompatParcelizer(bufferMapProperty buffermapproperty, float f) {
        double write2 = buffermapproperty.getWrite() * 386.0878f * 160.0f * 0.84f;
        double dAbs = Math.abs(f) * 0.35f;
        double d = ((double) RemoteActionCompatParcelizer) * write2;
        return (float) (d * Math.exp((write / read) * Math.log(dAbs / d)));
    }
}
