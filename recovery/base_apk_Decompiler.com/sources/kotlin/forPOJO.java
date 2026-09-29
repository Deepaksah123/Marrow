package kotlin;

import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* JADX INFO: loaded from: classes2.dex */
public class forPOJO {
    private final AccessibilityRecord read;

    @Deprecated
    public static void IconCompatParcelizer(AccessibilityRecord accessibilityRecord, View view, int i) {
        accessibilityRecord.setSource(view, i);
    }

    @Deprecated
    public static void read(AccessibilityRecord accessibilityRecord, int i) {
        accessibilityRecord.setMaxScrollX(i);
    }

    @Deprecated
    public static void RemoteActionCompatParcelizer(AccessibilityRecord accessibilityRecord, int i) {
        accessibilityRecord.setMaxScrollY(i);
    }

    @Deprecated
    public int hashCode() {
        AccessibilityRecord accessibilityRecord = this.read;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }

    @Deprecated
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof forPOJO)) {
            return false;
        }
        forPOJO forpojo = (forPOJO) obj;
        AccessibilityRecord accessibilityRecord = this.read;
        if (accessibilityRecord == null) {
            return forpojo.read == null;
        }
        return accessibilityRecord.equals(forpojo.read);
    }
}
