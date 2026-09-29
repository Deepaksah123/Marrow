package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\n\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0012\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\rR$\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0010\u0010\u000f\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0010\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019"}, d2 = {"Lo/PackageManagerWrapper;", "", "", "p0", "", "p1", "", "p2", "<init>", "(ILjava/lang/String;Z)V", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "write", "I", "read", "AudioAttributesCompatParcelizer", "Ljava/lang/String;", "RemoteActionCompatParcelizer", "(Ljava/lang/String;)V", "IconCompatParcelizer", "Z", "()Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PackageManagerWrapper {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final boolean write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int read;

    private PackageManagerWrapper(int i, String str, boolean z) {
        this.read = i;
        this.RemoteActionCompatParcelizer = str;
        this.write = z;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getRead() {
        return this.read;
    }

    public /* synthetic */ PackageManagerWrapper(int i, String str, boolean z, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? false : z);
    }

    public final void RemoteActionCompatParcelizer(String str) {
        this.RemoteActionCompatParcelizer = str;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final boolean getWrite() {
        return this.write;
    }

    public PackageManagerWrapper() {
        this(0, null, false, 7, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof PackageManagerWrapper)) {
            return false;
        }
        PackageManagerWrapper packageManagerWrapper = (PackageManagerWrapper) p0;
        return this.read == packageManagerWrapper.read && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) packageManagerWrapper.RemoteActionCompatParcelizer) && this.write == packageManagerWrapper.write;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.read);
        String str = this.RemoteActionCompatParcelizer;
        return (((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.write);
    }

    public final String toString() {
        int i = this.read;
        String str = this.RemoteActionCompatParcelizer;
        boolean z = this.write;
        StringBuilder sb = new StringBuilder("PackageManagerWrapper(read=");
        sb.append(i);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(str);
        sb.append(", write=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
