package kotlin;

import android.content.res.Configuration;

/* JADX INFO: loaded from: classes.dex */
public final class _checkTextualNull {
    private final boolean RemoteActionCompatParcelizer;
    private Configuration write;

    public _checkTextualNull(boolean z) {
        this.RemoteActionCompatParcelizer = z;
    }

    public final boolean write() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public _checkTextualNull(boolean z, Configuration configuration) {
        this(z);
        toMagicModuleMetaRepoModel.write(configuration, "");
        this.write = configuration;
    }
}
