package kotlin;

import androidx.recyclerview.widget.GridLayoutManager;

/* JADX INFO: loaded from: classes3.dex */
public final class toCueBuilder extends GridLayoutManager.IconCompatParcelizer {
    private final IconCompatParcelizer read;

    /* JADX INFO: loaded from: classes.dex */
    public interface IconCompatParcelizer {
        int IconCompatParcelizer(int i);
    }

    public toCueBuilder(IconCompatParcelizer iconCompatParcelizer) {
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        this.read = iconCompatParcelizer;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.IconCompatParcelizer
    public final int IconCompatParcelizer(int i) {
        return this.read.IconCompatParcelizer(i);
    }
}
