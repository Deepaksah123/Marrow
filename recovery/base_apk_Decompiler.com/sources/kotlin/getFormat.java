package kotlin;

import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/getFormat;", "", "<init>", "()V", "Landroidx/compose/ui/platform/AndroidComposeView;", "p0", "", "RemoteActionCompatParcelizer", "(Landroidx/compose/ui/platform/AndroidComposeView;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getFormat {
    public static final getFormat INSTANCE = new getFormat();

    private getFormat() {
    }

    public final void RemoteActionCompatParcelizer(AndroidComposeView p0) {
        ViewParent parent = p0.getParent();
        if (parent != null) {
            AndroidComposeView androidComposeView = p0;
            parent.onDescendantInvalidated(androidComposeView, androidComposeView);
        }
    }
}
