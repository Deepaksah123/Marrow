package kotlin;

import android.graphics.Outline;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/buildMethodName;", "", "<init>", "()V", "Landroid/graphics/Outline;", "p0", "Lo/removeSoftRefsClearedByGc;", "p1", "", "write", "(Landroid/graphics/Outline;Lo/removeSoftRefsClearedByGc;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class buildMethodName {
    public static final buildMethodName INSTANCE = new buildMethodName();

    private buildMethodName() {
    }

    public final void write(Outline p0, removeSoftRefsClearedByGc p1) {
        if (p1 instanceof getCurrentSegment) {
            p0.setPath(((getCurrentSegment) p1).getRemoteActionCompatParcelizer());
            return;
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }
}
