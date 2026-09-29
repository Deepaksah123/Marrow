package kotlin;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
class addPermissionAsync extends canonicalToCurrentPackageNames {
    private static boolean IconCompatParcelizer = true;

    addPermissionAsync() {
    }

    @Override // kotlin.addPermission
    public void write(View view, int i) {
        if (IconCompatParcelizer) {
            try {
                write.read(view, i);
            } catch (NoSuchMethodError unused) {
                IconCompatParcelizer = false;
            }
        }
    }

    static class write {
        static void read(View view, int i) {
            view.setTransitionVisibility(i);
        }
    }
}
