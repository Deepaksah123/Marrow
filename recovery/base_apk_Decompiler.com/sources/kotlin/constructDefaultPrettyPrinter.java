package kotlin;

import android.view.View;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\b"}, d2 = {"Lo/constructDefaultPrettyPrinter;", "", "<init>", "()V", "Landroid/view/View;", "p0", "", "RemoteActionCompatParcelizer", "(Landroid/view/View;)V", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class constructDefaultPrettyPrinter {
    public static final constructDefaultPrettyPrinter INSTANCE = new constructDefaultPrettyPrinter();

    private constructDefaultPrettyPrinter() {
    }

    public final void RemoteActionCompatParcelizer(View p0) {
        p0.setViewTranslationCallback(PropertyNamingStrategyUpperCamelCaseStrategy.INSTANCE);
    }

    public final void read(View p0) {
        p0.clearViewTranslationCallback();
    }
}
