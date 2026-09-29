package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\f\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0014\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\f\u0010\u0016"}, d2 = {"Lo/getArguments;", "Lo/writerFor;", "Lo/getExitTransition;", "", "p0", "", "p1", "<init>", "(FZ)V", "RemoteActionCompatParcelizer", "()Lo/getExitTransition;", "", "read", "(Lo/getExitTransition;)V", "", "hashCode", "()I", "", "equals", "(Ljava/lang/Object;)Z", "write", "F", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getArguments extends writerFor<getExitTransition> {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final boolean write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final float read;

    public getArguments(float f, boolean z) {
        this.read = f;
        this.write = z;
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final getExitTransition IconCompatParcelizer() {
        return new getExitTransition(this.read, this.write);
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final void IconCompatParcelizer(getExitTransition p0) {
        p0.write(this.read);
        p0.write(this.write);
    }

    public final int hashCode() {
        return (Float.hashCode(this.read) * 31) + Boolean.hashCode(this.write);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        getArguments getarguments = p0 instanceof getArguments ? (getArguments) p0 : null;
        return getarguments != null && this.read == getarguments.read && this.write == getarguments.write;
    }
}
