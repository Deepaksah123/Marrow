package kotlin;

import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
class canonicalToCurrentPackageNames extends checkPermission {
    private static boolean RemoteActionCompatParcelizer = true;

    canonicalToCurrentPackageNames() {
    }

    @Override // kotlin.addPermission
    public void write(View view, int i, int i2, int i3, int i4) {
        if (RemoteActionCompatParcelizer) {
            try {
                IconCompatParcelizer.write(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                RemoteActionCompatParcelizer = false;
            }
        }
    }

    static class IconCompatParcelizer {
        static void write(View view, int i, int i2, int i3, int i4) {
            view.setLeftTopRightBottom(i, i2, i3, i4);
        }
    }
}
