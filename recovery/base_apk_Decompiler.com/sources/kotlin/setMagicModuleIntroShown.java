package kotlin;

import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class setMagicModuleIntroShown implements downloadMagicModuleDetaillambda1 {
    private final String RemoteActionCompatParcelizer;
    private final Class<?> read;

    public setMagicModuleIntroShown(Class<?> cls, String str) {
        toMagicModuleMetaRepoModel.write(cls, "");
        toMagicModuleMetaRepoModel.write(str, "");
        this.read = cls;
        this.RemoteActionCompatParcelizer = str;
    }

    @Override // kotlin.downloadMagicModuleDetaillambda1
    public final Class<?> RemoteActionCompatParcelizer() {
        return this.read;
    }

    @Override // kotlin.isAuthError, kotlin.isHdPlaybackError
    public final Collection<isKycAuditIncomplete<?>> IconCompatParcelizer() {
        throw new getFeedbacks();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof setMagicModuleIntroShown) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(RemoteActionCompatParcelizer(), ((setMagicModuleIntroShown) obj).RemoteActionCompatParcelizer());
    }

    public final int hashCode() {
        return RemoteActionCompatParcelizer().hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(RemoteActionCompatParcelizer().toString());
        sb.append(" (Kotlin reflection is not available)");
        return sb.toString();
    }
}
