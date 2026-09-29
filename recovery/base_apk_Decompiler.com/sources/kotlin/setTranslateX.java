package kotlin;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/setTranslateX;", "", "<init>", "()V", "Landroid/view/inputmethod/InputMethodManager;", "p0", "Landroid/view/View;", "p1", "", "RemoteActionCompatParcelizer", "(Landroid/view/inputmethod/InputMethodManager;Landroid/view/View;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setTranslateX {
    public static final setTranslateX INSTANCE = new setTranslateX();

    private setTranslateX() {
    }

    public final void RemoteActionCompatParcelizer(InputMethodManager p0, View p1) {
        p0.startStylusHandwriting(p1);
    }
}
