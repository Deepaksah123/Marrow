package kotlin;

import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes2.dex */
public final class _explode extends _anyVisible {
    private final boolean IconCompatParcelizer;

    public _explode(Fragment fragment, boolean z) {
        toMagicModuleMetaRepoModel.write(fragment, "");
        StringBuilder sb = new StringBuilder("Attempting to set user visible hint to ");
        sb.append(z);
        sb.append(" for fragment ");
        sb.append(fragment);
        super(fragment, sb.toString());
        this.IconCompatParcelizer = z;
    }
}
