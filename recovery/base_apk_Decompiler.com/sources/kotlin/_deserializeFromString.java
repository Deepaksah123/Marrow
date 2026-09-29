package kotlin;

import android.graphics.Insets;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\f¢\u0006\u0004\b\u000b\u0010\r"}, d2 = {"Lo/_deserializeFromString;", "", "<init>", "()V", "Landroid/view/WindowManager$LayoutParams;", "p0", "", "p1", "", "IconCompatParcelizer", "(Landroid/view/WindowManager$LayoutParams;I)V", "AudioAttributesCompatParcelizer", "Landroid/view/Window;", "(Landroid/view/Window;)I"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class _deserializeFromString {
    public static final _deserializeFromString INSTANCE = new _deserializeFromString();

    private _deserializeFromString() {
    }

    public final void IconCompatParcelizer(WindowManager.LayoutParams p0, int p1) {
        p0.setFitInsetsSides(p1);
    }

    public final void AudioAttributesCompatParcelizer(WindowManager.LayoutParams p0, int p1) {
        p0.setFitInsetsTypes(p1);
    }

    public final int AudioAttributesCompatParcelizer(Window p0) {
        WindowMetrics currentWindowMetrics = p0.getWindowManager().getCurrentWindowMetrics();
        Insets insets = currentWindowMetrics.getWindowInsets().getInsets(WindowInsets.Type.systemBars());
        return currentWindowMetrics.getBounds().height() - (insets.top + insets.bottom);
    }
}
