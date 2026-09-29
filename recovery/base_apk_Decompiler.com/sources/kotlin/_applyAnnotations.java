package kotlin;

import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes2.dex */
public final class _applyAnnotations extends _anyVisible {
    private final int RemoteActionCompatParcelizer;
    private final Fragment write;

    public _applyAnnotations(Fragment fragment, Fragment fragment2, int i) {
        toMagicModuleMetaRepoModel.write(fragment, "");
        toMagicModuleMetaRepoModel.write(fragment2, "");
        StringBuilder sb = new StringBuilder("Attempting to nest fragment ");
        sb.append(fragment);
        sb.append(" within the view of parent fragment ");
        sb.append(fragment2);
        sb.append(" via container with ID ");
        sb.append(i);
        sb.append(" without using parent's childFragmentManager");
        super(fragment, sb.toString());
        this.write = fragment2;
        this.RemoteActionCompatParcelizer = i;
    }
}
