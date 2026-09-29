package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0011\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015"}, d2 = {"Lo/zzdy;", "", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;Z)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "write", "Ljava/lang/String;", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "Z", "RemoteActionCompatParcelizer", "()Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class zzdy {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final String IconCompatParcelizer;

    public zzdy(String str, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = z;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof zzdy)) {
            return false;
        }
        zzdy zzdyVar = (zzdy) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) zzdyVar.IconCompatParcelizer) && this.RemoteActionCompatParcelizer == zzdyVar.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return (this.IconCompatParcelizer.hashCode() * 31) + Boolean.hashCode(this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        String str = this.IconCompatParcelizer;
        boolean z = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("zzdy(IconCompatParcelizer=");
        sb.append(str);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
