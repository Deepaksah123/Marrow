package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0002\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0012\u001a\u00020\u00018\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lo/_verifyRelease;", "Lo/inLongRange;", "p0", "", "p1", "<init>", "(Lo/inLongRange;I)V", "Lo/releaseTokenBuffer;", "", "IconCompatParcelizer", "(Lo/releaseTokenBuffer;)Ljava/lang/Object;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "write", "Lo/inLongRange;", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "I"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class _verifyRelease extends inLongRange {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final inLongRange RemoteActionCompatParcelizer;

    public _verifyRelease(inLongRange inlongrange, int i) {
        super(null);
        this.RemoteActionCompatParcelizer = inlongrange;
        this.IconCompatParcelizer = i;
    }

    @Override // kotlin.inLongRange
    public final Object IconCompatParcelizer(releaseTokenBuffer p0) {
        return new parseAsInt(this.RemoteActionCompatParcelizer.IconCompatParcelizer(p0), this.IconCompatParcelizer);
    }

    public final boolean equals(Object p0) {
        if (!(p0 instanceof _verifyRelease)) {
            return false;
        }
        _verifyRelease _verifyrelease = (_verifyRelease) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(_verifyrelease.RemoteActionCompatParcelizer, this.RemoteActionCompatParcelizer) && _verifyrelease.IconCompatParcelizer == this.IconCompatParcelizer;
    }

    public final int hashCode() {
        return (this.IconCompatParcelizer * 31) + this.RemoteActionCompatParcelizer.hashCode();
    }
}
