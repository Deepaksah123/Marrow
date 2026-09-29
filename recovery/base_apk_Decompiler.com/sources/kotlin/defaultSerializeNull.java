package kotlin;

import android.view.accessibility.AccessibilityManager;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/defaultSerializeNull;", "", "<init>", "()V", "Landroid/view/accessibility/AccessibilityManager;", "p0", "", "p1", "p2", "read", "(Landroid/view/accessibility/AccessibilityManager;II)I"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class defaultSerializeNull {
    public static final defaultSerializeNull INSTANCE = new defaultSerializeNull();

    private defaultSerializeNull() {
    }

    public final int read(AccessibilityManager p0, int p1, int p2) {
        return p0.getRecommendedTimeoutMillis(p1, p2);
    }
}
