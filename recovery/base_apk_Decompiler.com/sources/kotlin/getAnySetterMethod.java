package kotlin;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes2.dex */
public final class getAnySetterMethod extends _anyVisible {
    private final ViewGroup write;

    public getAnySetterMethod(Fragment fragment, ViewGroup viewGroup) {
        toMagicModuleMetaRepoModel.write(fragment, "");
        StringBuilder sb = new StringBuilder("Attempting to use <fragment> tag to add fragment ");
        sb.append(fragment);
        sb.append(" to container ");
        sb.append(viewGroup);
        super(fragment, sb.toString());
        this.write = viewGroup;
    }
}
