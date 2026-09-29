package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\b\u0010\u000f"}, d2 = {"Lo/_parseSlowInt;", "Lo/inLongRange;", "", "p0", "<init>", "(I)V", "Lo/releaseTokenBuffer;", "", "IconCompatParcelizer", "(Lo/releaseTokenBuffer;)Ljava/lang/Object;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "I", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class _parseSlowInt extends inLongRange {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int write;

    public _parseSlowInt(int i) {
        super(null);
        this.write = i;
    }

    @Override // kotlin.inLongRange
    public final Object IconCompatParcelizer(releaseTokenBuffer p0) {
        return p0.AudioAttributesCompatParcelizer(this.write);
    }

    public final boolean equals(Object p0) {
        return (p0 instanceof _parseSlowInt) && ((_parseSlowInt) p0).write == this.write;
    }

    public final int hashCode() {
        return this.write * 31;
    }
}
