package kotlin;

import android.view.View;
import kotlin.VisibilityCheckerStd;

/* JADX INFO: loaded from: classes.dex */
public final class isFieldVisible {
    public static final void AudioAttributesCompatParcelizer(View view, TypeResolutionContext typeResolutionContext) {
        toMagicModuleMetaRepoModel.write(view, "");
        view.setTag(VisibilityCheckerStd.read.view_tree_view_model_store_owner, typeResolutionContext);
    }

    public static final TypeResolutionContext write(View view) {
        toMagicModuleMetaRepoModel.write(view, "");
        while (view != null) {
            Object tag = view.getTag(VisibilityCheckerStd.read.view_tree_view_model_store_owner);
            TypeResolutionContext typeResolutionContext = tag instanceof TypeResolutionContext ? (TypeResolutionContext) tag : null;
            if (typeResolutionContext != null) {
                return typeResolutionContext;
            }
            Object objIconCompatParcelizer = AnnotatedAndMetadata.IconCompatParcelizer(view);
            view = objIconCompatParcelizer instanceof View ? (View) objIconCompatParcelizer : null;
        }
        return null;
    }
}
