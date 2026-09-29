package kotlin;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
class addPreferredActivity extends addPermissionAsync {
    addPreferredActivity() {
    }

    @Override // kotlin.addPermission
    public void AudioAttributesCompatParcelizer(View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // kotlin.addPermission
    public float IconCompatParcelizer(View view) {
        return view.getTransitionAlpha();
    }

    @Override // kotlin.addPermissionAsync, kotlin.addPermission
    public void write(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // kotlin.canonicalToCurrentPackageNames, kotlin.addPermission
    public void write(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // kotlin.checkPermission, kotlin.addPermission
    public void IconCompatParcelizer(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // kotlin.checkPermission, kotlin.addPermission
    public void AudioAttributesCompatParcelizer(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // kotlin.checkPermission, kotlin.addPermission
    public void RemoteActionCompatParcelizer(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }
}
