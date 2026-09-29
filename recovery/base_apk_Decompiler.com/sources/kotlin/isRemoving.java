package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\b\u0010\u0015"}, d2 = {"Lo/isRemoving;", "Lo/writerFor;", "Lo/noteStateNotSaved;", "Lo/assignParameter;", "p0", "p1", "<init>", "(FFLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "write", "()Lo/noteStateNotSaved;", "", "read", "(Lo/noteStateNotSaved;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "RemoteActionCompatParcelizer", "F"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class isRemoving extends writerFor<noteStateNotSaved> {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final float read;
    private final float write;

    private isRemoving(float f, float f2) {
        this.read = f;
        this.write = f2;
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final noteStateNotSaved IconCompatParcelizer() {
        return new noteStateNotSaved(this.read, this.write, null);
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final void IconCompatParcelizer(noteStateNotSaved p0) {
        p0.AudioAttributesCompatParcelizer(this.read);
        p0.read(this.write);
    }

    public final boolean equals(Object p0) {
        if (!(p0 instanceof isRemoving)) {
            return false;
        }
        isRemoving isremoving = (isRemoving) p0;
        return assignParameter.IconCompatParcelizer(this.read, isremoving.read) && assignParameter.IconCompatParcelizer(this.write, isremoving.write);
    }

    public final int hashCode() {
        return (assignParameter.AudioAttributesCompatParcelizer(this.read) * 31) + assignParameter.AudioAttributesCompatParcelizer(this.write);
    }

    public /* synthetic */ isRemoving(float f, float f2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(f, f2);
    }
}
