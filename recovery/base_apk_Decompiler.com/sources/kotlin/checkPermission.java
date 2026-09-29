package kotlin;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
class checkPermission extends addPermission {
    private static boolean AudioAttributesCompatParcelizer = true;
    private static boolean RemoteActionCompatParcelizer = true;
    private static boolean read = true;

    checkPermission() {
    }

    @Override // kotlin.addPermission
    public void IconCompatParcelizer(View view, Matrix matrix) {
        if (read) {
            try {
                IconCompatParcelizer.IconCompatParcelizer(view, matrix);
            } catch (NoSuchMethodError unused) {
                read = false;
            }
        }
    }

    @Override // kotlin.addPermission
    public void AudioAttributesCompatParcelizer(View view, Matrix matrix) {
        if (AudioAttributesCompatParcelizer) {
            try {
                IconCompatParcelizer.AudioAttributesCompatParcelizer(view, matrix);
            } catch (NoSuchMethodError unused) {
                AudioAttributesCompatParcelizer = false;
            }
        }
    }

    @Override // kotlin.addPermission
    public void RemoteActionCompatParcelizer(View view, Matrix matrix) {
        if (RemoteActionCompatParcelizer) {
            try {
                IconCompatParcelizer.read(view, matrix);
            } catch (NoSuchMethodError unused) {
                RemoteActionCompatParcelizer = false;
            }
        }
    }

    static class IconCompatParcelizer {
        static void IconCompatParcelizer(View view, Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }

        static void AudioAttributesCompatParcelizer(View view, Matrix matrix) {
            view.transformMatrixToLocal(matrix);
        }

        static void read(View view, Matrix matrix) {
            view.setAnimationMatrix(matrix);
        }
    }
}
