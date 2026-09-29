package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\f\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018"}, d2 = {"Lo/getParentLayoutDirection;", "Lo/writerFor;", "Lo/getTestTag;", "Lo/inset;", "p0", "Lo/setParentLayoutDirection;", "p1", "<init>", "(Lo/inset;Lo/setParentLayoutDirection;)V", "read", "()Lo/getTestTag;", "", "AudioAttributesCompatParcelizer", "(Lo/getTestTag;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "IconCompatParcelizer", "Lo/inset;", "RemoteActionCompatParcelizer", "Lo/setParentLayoutDirection;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class getParentLayoutDirection extends writerFor<getTestTag> {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final inset AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final setParentLayoutDirection write;

    public getParentLayoutDirection(inset insetVar, setParentLayoutDirection setparentlayoutdirection) {
        this.AudioAttributesCompatParcelizer = insetVar;
        this.write = setparentlayoutdirection;
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final getTestTag IconCompatParcelizer() {
        return new getTestTag(this.write.read(this.AudioAttributesCompatParcelizer));
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final void IconCompatParcelizer(getTestTag p0) {
        p0.RemoteActionCompatParcelizer(this.write.read(this.AudioAttributesCompatParcelizer));
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof getParentLayoutDirection)) {
            return false;
        }
        getParentLayoutDirection getparentlayoutdirection = (getParentLayoutDirection) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, getparentlayoutdirection.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, getparentlayoutdirection.write);
    }

    public final int hashCode() {
        return (this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.write.hashCode();
    }
}
