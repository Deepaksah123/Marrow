package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lo/instantiate;", "Lo/getReturnTransition;", "Lo/onCreateView;", "p0", "Lo/bufferMapProperty;", "p1", "<init>", "(Lo/onCreateView;Lo/bufferMapProperty;)V", "Lo/tryToResolveUnresolved;", "Lo/assignParameter;", "read", "(Lo/tryToResolveUnresolved;)F", "IconCompatParcelizer", "()F", "RemoteActionCompatParcelizer", "", "toString", "()Ljava/lang/String;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "AudioAttributesCompatParcelizer", "Lo/onCreateView;", "write", "Lo/bufferMapProperty;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class instantiate implements getReturnTransition {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final onCreateView write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final bufferMapProperty read;

    public instantiate(onCreateView oncreateview, bufferMapProperty buffermapproperty) {
        this.write = oncreateview;
        this.read = buffermapproperty;
    }

    @Override // kotlin.getReturnTransition
    public final float read(tryToResolveUnresolved p0) {
        bufferMapProperty buffermapproperty = this.read;
        return buffermapproperty.b_(this.write.RemoteActionCompatParcelizer(buffermapproperty, p0));
    }

    @Override // kotlin.getReturnTransition
    /* JADX INFO: renamed from: IconCompatParcelizer */
    public final float getRead() {
        bufferMapProperty buffermapproperty = this.read;
        return buffermapproperty.b_(this.write.AudioAttributesCompatParcelizer(buffermapproperty));
    }

    @Override // kotlin.getReturnTransition
    public final float RemoteActionCompatParcelizer(tryToResolveUnresolved p0) {
        bufferMapProperty buffermapproperty = this.read;
        return buffermapproperty.b_(this.write.write(buffermapproperty, p0));
    }

    @Override // kotlin.getReturnTransition
    /* JADX INFO: renamed from: read */
    public final float getRemoteActionCompatParcelizer() {
        bufferMapProperty buffermapproperty = this.read;
        return buffermapproperty.b_(this.write.RemoteActionCompatParcelizer(buffermapproperty));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InsetsPaddingValues(insets=");
        sb.append(this.write);
        sb.append(", density=");
        sb.append(this.read);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof instantiate)) {
            return false;
        }
        instantiate instantiateVar = (instantiate) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, instantiateVar.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, instantiateVar.read);
    }

    public final int hashCode() {
        return (this.write.hashCode() * 31) + this.read.hashCode();
    }
}
