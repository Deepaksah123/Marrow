package kotlin;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes2.dex */
public final class _anyIgnorals extends _anyVisible {
    private final ViewGroup read;

    public _anyIgnorals(Fragment fragment, ViewGroup viewGroup) {
        toMagicModuleMetaRepoModel.write(fragment, "");
        toMagicModuleMetaRepoModel.write(viewGroup, "");
        StringBuilder sb = new StringBuilder("Attempting to add fragment ");
        sb.append(fragment);
        sb.append(" to container ");
        sb.append(viewGroup);
        sb.append(" which is not a FragmentContainerView");
        super(fragment, sb.toString());
        this.read = viewGroup;
    }
}
