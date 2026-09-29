package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\u0011R\u0016\u0010\u0018\u001a\u00020\u00058\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b\u0014\u0010\u0017R\u001a\u0010\u0012\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0015\u0010\u001a"}, d2 = {"Lo/AuthProxyOptions;", "", "", "p0", "p1", "", "p2", "Lo/WorkAccountApiAddAccountResult;", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLo/WorkAccountApiAddAccountResult;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "read", "Ljava/lang/String;", "IconCompatParcelizer", "write", "AudioAttributesCompatParcelizer", "Z", "RemoteActionCompatParcelizer", "Lo/WorkAccountApiAddAccountResult;", "()Lo/WorkAccountApiAddAccountResult;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AuthProxyOptions {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final WorkAccountApiAddAccountResult read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final String write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final String AudioAttributesCompatParcelizer;

    private AuthProxyOptions(String str, String str2, boolean z, WorkAccountApiAddAccountResult workAccountApiAddAccountResult) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(workAccountApiAddAccountResult, "");
        this.write = str;
        this.AudioAttributesCompatParcelizer = str2;
        this.RemoteActionCompatParcelizer = z;
        this.read = workAccountApiAddAccountResult;
    }

    public /* synthetic */ AuthProxyOptions(String str, String str2, boolean z, WorkAccountApiAddAccountResult workAccountApiAddAccountResult, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, str2, (i & 4) != 0 ? false : z, workAccountApiAddAccountResult);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final WorkAccountApiAddAccountResult getRead() {
        return this.read;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AuthProxyOptions)) {
            return false;
        }
        AuthProxyOptions authProxyOptions = (AuthProxyOptions) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) authProxyOptions.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) authProxyOptions.AudioAttributesCompatParcelizer) && this.RemoteActionCompatParcelizer == authProxyOptions.RemoteActionCompatParcelizer && this.read == authProxyOptions.read;
    }

    public final int hashCode() {
        return (((((this.write.hashCode() * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + Boolean.hashCode(this.RemoteActionCompatParcelizer)) * 31) + this.read.hashCode();
    }

    public final String toString() {
        String str = this.write;
        String str2 = this.AudioAttributesCompatParcelizer;
        boolean z = this.RemoteActionCompatParcelizer;
        WorkAccountApiAddAccountResult workAccountApiAddAccountResult = this.read;
        StringBuilder sb = new StringBuilder("AuthProxyOptions(write=");
        sb.append(str);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(str2);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(z);
        sb.append(", read=");
        sb.append(workAccountApiAddAccountResult);
        sb.append(")");
        return sb.toString();
    }
}
