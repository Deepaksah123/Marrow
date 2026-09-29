package kotlin;

import android.os.Build;
import android.view.accessibility.AccessibilityManager;

/* JADX INFO: loaded from: classes2.dex */
public final class AccessorNamingStrategy {

    public interface IconCompatParcelizer {
        void read(boolean z);
    }

    @Deprecated
    public static boolean AudioAttributesCompatParcelizer(AccessibilityManager accessibilityManager, IconCompatParcelizer iconCompatParcelizer) {
        return accessibilityManager.addTouchExplorationStateChangeListener(new RemoteActionCompatParcelizer(iconCompatParcelizer));
    }

    @Deprecated
    public static boolean RemoteActionCompatParcelizer(AccessibilityManager accessibilityManager, IconCompatParcelizer iconCompatParcelizer) {
        return accessibilityManager.removeTouchExplorationStateChangeListener(new RemoteActionCompatParcelizer(iconCompatParcelizer));
    }

    public static boolean AudioAttributesCompatParcelizer(AccessibilityManager accessibilityManager) {
        if (Build.VERSION.SDK_INT >= 34) {
            return read.RemoteActionCompatParcelizer(accessibilityManager);
        }
        return true;
    }

    /* JADX INFO: loaded from: classes4.dex */
    static final class RemoteActionCompatParcelizer implements AccessibilityManager.TouchExplorationStateChangeListener {
        final IconCompatParcelizer read;

        RemoteActionCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
            this.read = iconCompatParcelizer;
        }

        public final int hashCode() {
            return this.read.hashCode();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof RemoteActionCompatParcelizer) {
                return this.read.equals(((RemoteActionCompatParcelizer) obj).read);
            }
            return false;
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public final void onTouchExplorationStateChanged(boolean z) {
            this.read.read(z);
        }
    }

    static class read {
        static boolean RemoteActionCompatParcelizer(AccessibilityManager accessibilityManager) {
            return accessibilityManager.isRequestFromAccessibilityTool();
        }
    }
}
