package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0012\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\f"}, d2 = {"Lo/putInt;", "", "Lo/onDisplayInfoChanged;", "p0", "", "p1", "<init>", "(Lo/onDisplayInfoChanged;I)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "Lo/onDisplayInfoChanged;", "RemoteActionCompatParcelizer", "()Lo/onDisplayInfoChanged;", "read", "IconCompatParcelizer", "I"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class putInt {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final onDisplayInfoChanged read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;

    public putInt(onDisplayInfoChanged ondisplayinfochanged, int i) {
        toMagicModuleMetaRepoModel.write(ondisplayinfochanged, "");
        this.read = ondisplayinfochanged;
        this.RemoteActionCompatParcelizer = i;
    }

    public /* synthetic */ putInt(onDisplayInfoChanged ondisplayinfochanged, int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? onDisplayInfoChanged.read : ondisplayinfochanged, (i2 & 2) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final onDisplayInfoChanged getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public putInt() {
        this(null, 0, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof putInt)) {
            return false;
        }
        putInt putint = (putInt) p0;
        return this.read == putint.read && this.RemoteActionCompatParcelizer == putint.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return (this.read.hashCode() * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        onDisplayInfoChanged ondisplayinfochanged = this.read;
        int i = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("putInt(read=");
        sb.append(ondisplayinfochanged);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
