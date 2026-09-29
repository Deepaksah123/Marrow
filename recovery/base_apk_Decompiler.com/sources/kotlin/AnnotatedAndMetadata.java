package kotlin;

import android.view.View;
import android.view.ViewParent;
import kotlin.AnnotatedClass;

/* JADX INFO: loaded from: classes2.dex */
public final class AnnotatedAndMetadata {
    public static final void AudioAttributesCompatParcelizer(View view, ViewParent viewParent) {
        toMagicModuleMetaRepoModel.write(view, "");
        view.setTag(AnnotatedClass.IconCompatParcelizer.view_tree_disjoint_parent, viewParent);
    }

    public static final ViewParent IconCompatParcelizer(View view) {
        toMagicModuleMetaRepoModel.write(view, "");
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(AnnotatedClass.IconCompatParcelizer.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }
}
