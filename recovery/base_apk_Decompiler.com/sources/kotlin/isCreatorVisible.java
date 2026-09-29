package kotlin;

import android.view.View;
import kotlin.withGetterVisibility;

/* JADX INFO: loaded from: classes.dex */
public final class isCreatorVisible {
    public static final void IconCompatParcelizer(View view, hasGetter hasgetter) {
        toMagicModuleMetaRepoModel.write(view, "");
        view.setTag(withGetterVisibility.read.view_tree_lifecycle_owner, hasgetter);
    }

    public static final hasGetter write(View view) {
        toMagicModuleMetaRepoModel.write(view, "");
        while (view != null) {
            Object tag = view.getTag(withGetterVisibility.read.view_tree_lifecycle_owner);
            hasGetter hasgetter = tag instanceof hasGetter ? (hasGetter) tag : null;
            if (hasgetter != null) {
                return hasgetter;
            }
            Object objIconCompatParcelizer = AnnotatedAndMetadata.IconCompatParcelizer(view);
            view = objIconCompatParcelizer instanceof View ? (View) objIconCompatParcelizer : null;
        }
        return null;
    }
}
