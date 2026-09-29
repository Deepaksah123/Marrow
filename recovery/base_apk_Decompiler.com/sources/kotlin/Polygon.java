package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0010\u001a\u0004\b\u0011\u0010\u000f"}, d2 = {"Lo/Polygon;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "write", "(Ljava/lang/String;)Lo/Polygon;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "RemoteActionCompatParcelizer", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Polygon {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final String read;

    private Polygon(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.read = str;
    }

    public /* synthetic */ Polygon(String str, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? "" : str);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Polygon() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static Polygon write(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new Polygon(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof Polygon) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) ((Polygon) p0).read);
    }

    public final int hashCode() {
        return this.read.hashCode();
    }

    public final String toString() {
        String str = this.read;
        StringBuilder sb = new StringBuilder("Polygon(read=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
