package kotlin;

import android.graphics.Rect;
import android.util.DisplayMetrics;
import android.view.Window;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lo/BaseNodeDeserializerContainerStack;", "", "<init>", "()V", "Landroid/view/Window;", "p0", "", "RemoteActionCompatParcelizer", "(Landroid/view/Window;)I", "p1", "read", "(Landroid/view/Window;I)I"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class BaseNodeDeserializerContainerStack {
    public static final BaseNodeDeserializerContainerStack INSTANCE = new BaseNodeDeserializerContainerStack();

    private BaseNodeDeserializerContainerStack() {
    }

    public final int RemoteActionCompatParcelizer(Window p0) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        p0.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels - read(p0, displayMetrics.heightPixels);
    }

    private final int read(Window p0, int p1) {
        Rect rect = new Rect();
        p0.getDecorView().getWindowVisibleDisplayFrame(rect);
        return rect.top + (rect.bottom > p1 ? rect.bottom - p1 : 0);
    }
}
