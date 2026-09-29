package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014"}, d2 = {"Lo/getCacheSpace;", "", "", "p0", "", "p1", "p2", "<init>", "(Ljava/lang/String;ZZ)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "RemoteActionCompatParcelizer", "Ljava/lang/String;", "IconCompatParcelizer", "write", "Z", "AudioAttributesCompatParcelizer", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class getCacheSpace {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final boolean read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final String IconCompatParcelizer;
    private final boolean write;

    public getCacheSpace(String str, boolean z, boolean z2) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.IconCompatParcelizer = str;
        this.write = z;
        this.read = z2;
    }

    public /* synthetic */ getCacheSpace(String str, boolean z, boolean z2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2);
    }

    public getCacheSpace() {
        this(null, false, false, 7, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof getCacheSpace)) {
            return false;
        }
        getCacheSpace getcachespace = (getCacheSpace) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) getcachespace.IconCompatParcelizer) && this.write == getcachespace.write && this.read == getcachespace.read;
    }

    public final int hashCode() {
        return (((this.IconCompatParcelizer.hashCode() * 31) + Boolean.hashCode(this.write)) * 31) + Boolean.hashCode(this.read);
    }

    public final String toString() {
        String str = this.IconCompatParcelizer;
        boolean z = this.write;
        boolean z2 = this.read;
        StringBuilder sb = new StringBuilder("getCacheSpace(IconCompatParcelizer=");
        sb.append(str);
        sb.append(", write=");
        sb.append(z);
        sb.append(", read=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }
}
