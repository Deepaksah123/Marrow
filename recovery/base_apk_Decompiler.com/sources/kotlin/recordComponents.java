package kotlin;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public final class recordComponents implements AutoCloseable, TopUserCompanion {
    private final CurrentQuery RemoteActionCompatParcelizer;

    public recordComponents(CurrentQuery currentQuery) {
        toMagicModuleMetaRepoModel.write(currentQuery, "");
        this.RemoteActionCompatParcelizer = currentQuery;
    }

    @Override // kotlin.TopUserCompanion
    /* JADX INFO: renamed from: bj_ */
    public final CurrentQuery getIconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        getUserConfig.AudioAttributesCompatParcelizer(getIconCompatParcelizer(), (CancellationException) null);
    }
}
