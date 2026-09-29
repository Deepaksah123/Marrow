package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class finish implements LoaderReleaseTask {
    private final LoaderLoadErrorAction read;

    @setSdkPayload
    public finish(LoaderLoadErrorAction loaderLoadErrorAction) {
        toMagicModuleMetaRepoModel.write(loaderLoadErrorAction, "");
        this.read = loaderLoadErrorAction;
    }

    @Override // kotlin.LoaderReleaseTask
    public final List<hasFatalError> read(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        toMagicModuleMetaRepoModel.write(str, "");
        return this.read.RemoteActionCompatParcelizer(str, z, z2, z3, z4, z5, z6, z7, System.currentTimeMillis());
    }

    @Override // kotlin.LoaderReleaseTask
    public final List<String> IconCompatParcelizer(int i, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        return this.read.write(i, str, str2, z, z2, z3, z4, z5, z6, z7, System.currentTimeMillis());
    }

    @Override // kotlin.LoaderReleaseTask
    public final int RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return this.read.RemoteActionCompatParcelizer(str);
    }

    @Override // kotlin.LoaderReleaseTask
    public final List<String> RemoteActionCompatParcelizer(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        return this.read.RemoteActionCompatParcelizer(str, str2);
    }

    @Override // kotlin.LoaderReleaseTask
    public final List<hasFatalError> write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return this.read.write(str);
    }
}
