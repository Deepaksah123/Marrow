package kotlin;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class findNameForRegularGetter {
    @Deprecated
    public static void read(AccessibilityEvent accessibilityEvent, int i) {
        accessibilityEvent.setContentChangeTypes(i);
    }

    @Deprecated
    public static int IconCompatParcelizer(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    public static void IconCompatParcelizer(AccessibilityEvent accessibilityEvent, boolean z) {
        if (Build.VERSION.SDK_INT >= 34) {
            AudioAttributesCompatParcelizer.IconCompatParcelizer(accessibilityEvent, z);
        }
    }

    static class AudioAttributesCompatParcelizer {
        static void IconCompatParcelizer(AccessibilityEvent accessibilityEvent, boolean z) {
            accessibilityEvent.setAccessibilityDataSensitive(z);
        }
    }
}
