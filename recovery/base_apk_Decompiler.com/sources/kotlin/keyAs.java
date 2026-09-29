package kotlin;

import android.view.MotionEvent;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/keyAs;", "", "<init>", "()V", "Landroid/view/MotionEvent;", "p0", "", "p1", "", "write", "(Landroid/view/MotionEvent;I)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class keyAs {
    public static final keyAs INSTANCE = new keyAs();

    private keyAs() {
    }

    public final boolean write(MotionEvent p0, int p1) {
        return (Float.floatToRawIntBits(p0.getRawX(p1)) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(p0.getRawY(p1)) & Integer.MAX_VALUE) < 2139095040;
    }
}
