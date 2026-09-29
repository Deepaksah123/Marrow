package kotlin;

import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\"\u001a\u0010\n\u001a\u00020\u00078\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lo/Module;", "", "read", "(Lo/Module;)Z", "Landroid/view/View;", "RemoteActionCompatParcelizer", "(Landroid/view/View;)Z", "", "IconCompatParcelizer", "J", "AudioAttributesCompatParcelizer", "()J"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setFrameRateFromParent {
    private static final long IconCompatParcelizer = ViewConfiguration.getTapTimeout();

    public static final boolean read(Module module) {
        return RemoteActionCompatParcelizer(C0217version.RemoteActionCompatParcelizer(module));
    }

    private static final boolean RemoteActionCompatParcelizer(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    public static final long AudioAttributesCompatParcelizer() {
        return IconCompatParcelizer;
    }
}
