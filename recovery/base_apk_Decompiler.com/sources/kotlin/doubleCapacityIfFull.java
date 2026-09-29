package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000bR\u001a\u0010\u0016\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015"}, d2 = {"Lo/doubleCapacityIfFull;", "", "", "p0", "", "p1", "<init>", "(IZ)V", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "write", "I", "AudioAttributesCompatParcelizer", "read", "RemoteActionCompatParcelizer", "Z", "()Z", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class doubleCapacityIfFull {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int read;

    public doubleCapacityIfFull(int i, boolean z) {
        this.read = i;
        this.IconCompatParcelizer = z;
    }

    public /* synthetic */ doubleCapacityIfFull(int i, boolean z, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? false : z);
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final boolean getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public doubleCapacityIfFull() {
        this(0, 0 == true ? 1 : 0, 3, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof doubleCapacityIfFull)) {
            return false;
        }
        doubleCapacityIfFull doublecapacityiffull = (doubleCapacityIfFull) p0;
        return this.read == doublecapacityiffull.read && this.IconCompatParcelizer == doublecapacityiffull.IconCompatParcelizer;
    }

    public final int hashCode() {
        return (Integer.hashCode(this.read) * 31) + Boolean.hashCode(this.IconCompatParcelizer);
    }

    public final String toString() {
        int i = this.read;
        boolean z = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("doubleCapacityIfFull(read=");
        sb.append(i);
        sb.append(", IconCompatParcelizer=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
