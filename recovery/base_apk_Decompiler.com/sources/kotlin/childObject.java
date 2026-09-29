package kotlin;

import android.content.Context;
import android.view.PointerIcon;

/* JADX INFO: loaded from: classes2.dex */
public final class childObject {
    private final PointerIcon RemoteActionCompatParcelizer;

    private childObject(PointerIcon pointerIcon) {
        this.RemoteActionCompatParcelizer = pointerIcon;
    }

    public final Object write() {
        return this.RemoteActionCompatParcelizer;
    }

    public static childObject write(Context context, int i) {
        return new childObject(IconCompatParcelizer.AudioAttributesCompatParcelizer(context, i));
    }

    static class IconCompatParcelizer {
        static PointerIcon AudioAttributesCompatParcelizer(Context context, int i) {
            return PointerIcon.getSystemIcon(context, i);
        }
    }
}
