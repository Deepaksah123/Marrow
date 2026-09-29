package kotlin;

import android.view.MotionEvent;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/introspect;", "", "<init>", "()V", "Landroid/view/MotionEvent;", "p0", "", "p1", "Lo/getReferencedType;", "read", "(Landroid/view/MotionEvent;I)J"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class introspect {
    public static final introspect INSTANCE = new introspect();

    private introspect() {
    }

    public final long read(MotionEvent p0, int p1) {
        long j = -1;
        return getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(p0.getRawY(p1))) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) Float.floatToRawIntBits(p0.getRawX(p1))) << 32));
    }
}
