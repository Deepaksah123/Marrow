package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0017\u0010\u000f\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0010\u001a\u0004\b\u0013\u0010\u000b"}, d2 = {"Lo/createStandard;", "", "", "p0", "p1", "<init>", "(II)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "read", "I", "IconCompatParcelizer", "write", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class createStandard {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int read;

    public createStandard(int i, int i2) {
        this.IconCompatParcelizer = i;
        this.read = i2;
    }

    public /* synthetic */ createStandard(int i, int i2, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getRead() {
        return this.read;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public createStandard() {
        int i = 0;
        this(i, i, 3, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof createStandard)) {
            return false;
        }
        createStandard createstandard = (createStandard) p0;
        return this.IconCompatParcelizer == createstandard.IconCompatParcelizer && this.read == createstandard.read;
    }

    public final int hashCode() {
        return (Integer.hashCode(this.IconCompatParcelizer) * 31) + Integer.hashCode(this.read);
    }

    public final String toString() {
        int i = this.IconCompatParcelizer;
        int i2 = this.read;
        StringBuilder sb = new StringBuilder("createStandard(IconCompatParcelizer=");
        sb.append(i);
        sb.append(", read=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }
}
