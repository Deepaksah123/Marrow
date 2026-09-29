package kotlin;

import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes4.dex */
public final class POJOPropertyBuilder extends _anyExplicitsWithoutIgnoral {
    private final int IconCompatParcelizer;
    private final Fragment read;

    public POJOPropertyBuilder(Fragment fragment, Fragment fragment2, int i) {
        toMagicModuleMetaRepoModel.write(fragment, "");
        toMagicModuleMetaRepoModel.write(fragment2, "");
        StringBuilder sb = new StringBuilder("Attempting to set target fragment ");
        sb.append(fragment2);
        sb.append(" with request code ");
        sb.append(i);
        sb.append(" for fragment ");
        sb.append(fragment);
        super(fragment, sb.toString());
        this.read = fragment2;
        this.IconCompatParcelizer = i;
    }
}
