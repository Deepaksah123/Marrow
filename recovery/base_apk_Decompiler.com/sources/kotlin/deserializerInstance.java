package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0017\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lo/deserializerInstance;", "Lo/writerFor;", "Lo/bufferForInputBuffering;", "Lo/extractScalarFromObject;", "p0", "", "p1", "<init>", "(Lo/extractScalarFromObject;Z)V", "write", "()Lo/bufferForInputBuffering;", "", "read", "(Lo/bufferForInputBuffering;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "Lo/extractScalarFromObject;", "RemoteActionCompatParcelizer", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class deserializerInstance extends writerFor<bufferForInputBuffering> {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final extractScalarFromObject RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final boolean IconCompatParcelizer;

    public deserializerInstance(extractScalarFromObject extractscalarfromobject, boolean z) {
        this.RemoteActionCompatParcelizer = extractscalarfromobject;
        this.IconCompatParcelizer = z;
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final bufferForInputBuffering IconCompatParcelizer() {
        return new bufferForInputBuffering(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer);
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final void IconCompatParcelizer(bufferForInputBuffering p0) {
        p0.write(this.RemoteActionCompatParcelizer);
        p0.read(this.IconCompatParcelizer);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof deserializerInstance)) {
            return false;
        }
        deserializerInstance deserializerinstance = (deserializerInstance) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, deserializerinstance.RemoteActionCompatParcelizer) && this.IconCompatParcelizer == deserializerinstance.IconCompatParcelizer;
    }

    public final int hashCode() {
        return (this.RemoteActionCompatParcelizer.hashCode() * 31) + Boolean.hashCode(this.IconCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("deserializerInstance(RemoteActionCompatParcelizer=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", IconCompatParcelizer=");
        sb.append(this.IconCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
