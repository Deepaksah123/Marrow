package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0011\u0010\r\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0010\u001a\u00020\u00078\u0006¢\u0006\u0006\n\u0004\b\r\u0010\u001cR\u0011\u0010\u001a\u001a\u00020\t8\u0006¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Lo/isReset;", "Lo/writerFor;", "Lo/forceLoad;", "Lo/onAbandon;", "p0", "Lo/deliverCancellation;", "p1", "", "p2", "Lo/superDispatchKeyEvent;", "p3", "<init>", "(Lo/onAbandon;Lo/deliverCancellation;ZLo/superDispatchKeyEvent;)V", "write", "()Lo/forceLoad;", "", "AudioAttributesCompatParcelizer", "(Lo/forceLoad;)V", "", "hashCode", "()I", "", "equals", "(Ljava/lang/Object;)Z", "RemoteActionCompatParcelizer", "Lo/onAbandon;", "IconCompatParcelizer", "Lo/deliverCancellation;", "Z", "read", "Lo/superDispatchKeyEvent;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class isReset extends writerFor<forceLoad> {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final deliverCancellation write;
    private final onAbandon RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final superDispatchKeyEvent IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final boolean AudioAttributesCompatParcelizer;

    public isReset(onAbandon onabandon, deliverCancellation delivercancellation, boolean z, superDispatchKeyEvent superdispatchkeyevent) {
        this.RemoteActionCompatParcelizer = onabandon;
        this.write = delivercancellation;
        this.AudioAttributesCompatParcelizer = z;
        this.IconCompatParcelizer = superdispatchkeyevent;
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final forceLoad IconCompatParcelizer() {
        return new forceLoad(this.RemoteActionCompatParcelizer, this.write, this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer);
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final void IconCompatParcelizer(forceLoad p0) {
        p0.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, this.write, this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer);
    }

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        return (((((iHashCode * 31) + this.write.hashCode()) * 31) + Boolean.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + this.IconCompatParcelizer.hashCode();
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof isReset)) {
            return false;
        }
        isReset isreset = (isReset) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, isreset.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, isreset.write) && this.AudioAttributesCompatParcelizer == isreset.AudioAttributesCompatParcelizer && this.IconCompatParcelizer == isreset.IconCompatParcelizer;
    }
}
