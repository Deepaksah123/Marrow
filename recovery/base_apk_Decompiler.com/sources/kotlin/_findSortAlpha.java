package kotlin;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
final class _findSortAlpha implements TransformationMethod {
    private final TransformationMethod write;

    _findSortAlpha(TransformationMethod transformationMethod) {
        this.write = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.write;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        return (charSequence == null || _booleanType.AudioAttributesCompatParcelizer().IconCompatParcelizer() != 1) ? charSequence : _booleanType.AudioAttributesCompatParcelizer().write(charSequence);
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
        TransformationMethod transformationMethod = this.write;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z, i, rect);
        }
    }

    public final TransformationMethod read() {
        return this.write;
    }
}
