package kotlin;

import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class AccessorNamingStrategyProvider {
    private final Object read;

    public boolean AudioAttributesCompatParcelizer(int i, int i2, Bundle bundle) {
        return false;
    }

    public hasSuperClassStartingWith RemoteActionCompatParcelizer(int i) {
        return null;
    }

    public void RemoteActionCompatParcelizer(int i, hasSuperClassStartingWith hassuperclassstartingwith, String str, Bundle bundle) {
    }

    public hasSuperClassStartingWith read(int i) {
        return null;
    }

    public List<hasSuperClassStartingWith> write(String str, int i) {
        return null;
    }

    static class RemoteActionCompatParcelizer extends AccessibilityNodeProvider {
        final AccessorNamingStrategyProvider write;

        RemoteActionCompatParcelizer(AccessorNamingStrategyProvider accessorNamingStrategyProvider) {
            this.write = accessorNamingStrategyProvider;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            hasSuperClassStartingWith hassuperclassstartingwith = this.write.read(i);
            if (hassuperclassstartingwith == null) {
                return null;
            }
            return hassuperclassstartingwith.onSetRating();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<hasSuperClassStartingWith> listWrite = this.write.write(str, i);
            if (listWrite == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listWrite.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(listWrite.get(i2).onSetRating());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.write.AudioAttributesCompatParcelizer(i, i2, bundle);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i) {
            hasSuperClassStartingWith hassuperclassstartingwithRemoteActionCompatParcelizer = this.write.RemoteActionCompatParcelizer(i);
            if (hassuperclassstartingwithRemoteActionCompatParcelizer == null) {
                return null;
            }
            return hassuperclassstartingwithRemoteActionCompatParcelizer.onSetRating();
        }
    }

    static class write extends RemoteActionCompatParcelizer {
        write(AccessorNamingStrategyProvider accessorNamingStrategyProvider) {
            super(accessorNamingStrategyProvider);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.write.RemoteActionCompatParcelizer(i, hasSuperClassStartingWith.write(accessibilityNodeInfo), str, bundle);
        }
    }

    public AccessorNamingStrategyProvider() {
        this.read = new write(this);
    }

    public AccessorNamingStrategyProvider(Object obj) {
        this.read = obj;
    }

    public Object read() {
        return this.read;
    }
}
