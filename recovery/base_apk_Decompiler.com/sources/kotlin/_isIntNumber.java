package kotlin;

import android.content.res.Configuration;

/* JADX INFO: loaded from: classes.dex */
public final class _isIntNumber {
    private Configuration IconCompatParcelizer;
    private final boolean read;

    public _isIntNumber(boolean z) {
        this.read = z;
    }

    public final boolean IconCompatParcelizer() {
        return this.read;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public _isIntNumber(boolean z, Configuration configuration) {
        this(z);
        toMagicModuleMetaRepoModel.write(configuration, "");
        this.IconCompatParcelizer = configuration;
    }
}
