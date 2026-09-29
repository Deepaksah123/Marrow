package kotlin;

import android.view.View;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/defaultSerializeDateKey;", "", "<init>", "()V", "Landroid/view/View;", "p0", "", "RemoteActionCompatParcelizer", "(Landroid/view/View;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class defaultSerializeDateKey {
    public static final defaultSerializeDateKey INSTANCE = new defaultSerializeDateKey();

    private defaultSerializeDateKey() {
    }

    public final boolean RemoteActionCompatParcelizer(View p0) {
        return p0.isShowingLayoutBounds();
    }
}
