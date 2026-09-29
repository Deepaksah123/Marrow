package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0016\u0010\u0019"}, d2 = {"Lo/checkGlError;", "", "Lo/checkEglException;", "p0", "", "Lo/createEglDisplay;", "p1", "<init>", "(Lo/checkEglException;Ljava/util/List;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "Lo/checkEglException;", "write", "()Lo/checkEglException;", "RemoteActionCompatParcelizer", "(Lo/checkEglException;)V", "Ljava/util/List;", "()Ljava/util/List;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class checkGlError {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private checkEglException RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final List<createEglDisplay> write;

    public checkGlError(checkEglException checkeglexception, List<createEglDisplay> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.RemoteActionCompatParcelizer = checkeglexception;
        this.write = list;
    }

    public final void RemoteActionCompatParcelizer(checkEglException checkeglexception) {
        this.RemoteActionCompatParcelizer = checkeglexception;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final checkEglException getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public /* synthetic */ checkGlError(checkEglException checkeglexception, List list, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : checkeglexception, (i & 2) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list);
    }

    public final List<createEglDisplay> RemoteActionCompatParcelizer() {
        return this.write;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public checkGlError() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof checkGlError)) {
            return false;
        }
        checkGlError checkglerror = (checkGlError) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, checkglerror.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, checkglerror.write);
    }

    public final int hashCode() {
        checkEglException checkeglexception = this.RemoteActionCompatParcelizer;
        return ((checkeglexception == null ? 0 : checkeglexception.hashCode()) * 31) + this.write.hashCode();
    }

    public final String toString() {
        checkEglException checkeglexception = this.RemoteActionCompatParcelizer;
        List<createEglDisplay> list = this.write;
        StringBuilder sb = new StringBuilder("checkGlError(RemoteActionCompatParcelizer=");
        sb.append(checkeglexception);
        sb.append(", write=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
