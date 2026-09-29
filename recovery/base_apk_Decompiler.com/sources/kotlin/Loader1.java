package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Loader1 implements LoaderLoadErrorAction {
    private final isRetry IconCompatParcelizer;

    @setSdkPayload
    public Loader1(isRetry isretry) {
        toMagicModuleMetaRepoModel.write(isretry, "");
        this.IconCompatParcelizer = isretry;
    }

    @Override // kotlin.LoaderLoadErrorAction
    public final List<hasFatalError> RemoteActionCompatParcelizer(String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, long j) {
        toMagicModuleMetaRepoModel.write(str, "");
        return this.IconCompatParcelizer.IconCompatParcelizer(str, z, z2, z3, z4, z5, z6, z7, j);
    }

    @Override // kotlin.LoaderLoadErrorAction
    public final List<String> write(int i, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, long j) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        return this.IconCompatParcelizer.write(i, str, str2, z, z2, z3, z4, z5, z6, z7, j);
    }

    @Override // kotlin.LoaderLoadErrorAction
    public final int RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return this.IconCompatParcelizer.IconCompatParcelizer(str);
    }

    @Override // kotlin.LoaderLoadErrorAction
    public final List<String> RemoteActionCompatParcelizer(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        return this.IconCompatParcelizer.IconCompatParcelizer(str, str2);
    }

    @Override // kotlin.LoaderLoadErrorAction
    public final List<hasFatalError> write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return this.IconCompatParcelizer.write(str);
    }
}
