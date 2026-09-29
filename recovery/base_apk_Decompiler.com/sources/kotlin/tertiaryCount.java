package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0017\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lo/tertiaryCount;", "Lo/writerFor;", "Lo/ByteQuadsCanonicalizerTableInfo;", "Lo/secondaryCount;", "p0", "<init>", "(Lo/secondaryCount;)V", "RemoteActionCompatParcelizer", "()Lo/ByteQuadsCanonicalizerTableInfo;", "", "(Lo/ByteQuadsCanonicalizerTableInfo;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "read", "Lo/secondaryCount;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class tertiaryCount extends writerFor<ByteQuadsCanonicalizerTableInfo> {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final secondaryCount AudioAttributesCompatParcelizer;

    public tertiaryCount(secondaryCount secondarycount) {
        this.AudioAttributesCompatParcelizer = secondarycount;
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final ByteQuadsCanonicalizerTableInfo IconCompatParcelizer() {
        return new ByteQuadsCanonicalizerTableInfo(this.AudioAttributesCompatParcelizer);
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final void IconCompatParcelizer(ByteQuadsCanonicalizerTableInfo p0) {
        p0.getRead().IconCompatParcelizer().IconCompatParcelizer(p0);
        p0.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer);
        p0.getRead().IconCompatParcelizer().read(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof tertiaryCount) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, ((tertiaryCount) p0).AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        return this.AudioAttributesCompatParcelizer.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("tertiaryCount(AudioAttributesCompatParcelizer=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
