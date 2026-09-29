package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\r"}, d2 = {"Lo/setDefaultBindExecutor;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "RemoteActionCompatParcelizer", "Ljava/lang/String;", "IconCompatParcelizer", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class setDefaultBindExecutor {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final String read;

    public setDefaultBindExecutor(String str) {
        this.read = str;
    }

    public /* synthetic */ setDefaultBindExecutor(String str, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : str);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public setDefaultBindExecutor() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof setDefaultBindExecutor) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) ((setDefaultBindExecutor) p0).read);
    }

    public final int hashCode() {
        String str = this.read;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        String str = this.read;
        StringBuilder sb = new StringBuilder("setDefaultBindExecutor(read=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
