package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\u0004\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\b\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0014R\u0011\u0010\u0015\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016"}, d2 = {"Lo/getMaxRendererReadPositionUs;", "Lo/writerFor;", "Lo/getLiveOffsetUs;", "", "p0", "p1", "<init>", "(II)V", "RemoteActionCompatParcelizer", "()Lo/getLiveOffsetUs;", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "", "(Lo/getLiveOffsetUs;)V", "read", "I", "write"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class getMaxRendererReadPositionUs extends writerFor<getLiveOffsetUs> {
    private final int read;
    private final int write;

    public getMaxRendererReadPositionUs(int i, int i2) {
        this.write = i;
        this.read = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public getLiveOffsetUs IconCompatParcelizer() {
        return new getLiveOffsetUs(this.write, this.read);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public void IconCompatParcelizer(getLiveOffsetUs p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.AudioAttributesCompatParcelizer(this.write);
        p0.IconCompatParcelizer(this.read);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof getMaxRendererReadPositionUs)) {
            return false;
        }
        getMaxRendererReadPositionUs getmaxrendererreadpositionus = (getMaxRendererReadPositionUs) p0;
        return this.write == getmaxrendererreadpositionus.write && this.read == getmaxrendererreadpositionus.read;
    }

    public final int hashCode() {
        return (Integer.hashCode(this.write) * 31) + Integer.hashCode(this.read);
    }

    public final String toString() {
        int i = this.write;
        int i2 = this.read;
        StringBuilder sb = new StringBuilder("getMaxRendererReadPositionUs(write=");
        sb.append(i);
        sb.append(", read=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }
}
