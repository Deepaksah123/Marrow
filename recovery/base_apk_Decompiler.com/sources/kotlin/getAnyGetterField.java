package kotlin;

import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes2.dex */
public final class getAnyGetterField extends _anyVisible {
    private final String RemoteActionCompatParcelizer;

    public getAnyGetterField(Fragment fragment, String str) {
        toMagicModuleMetaRepoModel.write(fragment, "");
        toMagicModuleMetaRepoModel.write(str, "");
        StringBuilder sb = new StringBuilder("Attempting to reuse fragment ");
        sb.append(fragment);
        sb.append(" with previous ID ");
        sb.append(str);
        super(fragment, sb.toString());
        this.RemoteActionCompatParcelizer = str;
    }
}
