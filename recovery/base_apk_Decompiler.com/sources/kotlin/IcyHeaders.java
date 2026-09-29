package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014"}, d2 = {"Lo/IcyHeaders;", "Lo/PictureFrame;", "", "p0", "<init>", "(I)V", "p1", "", "p2", "p3", "p4", "IconCompatParcelizer", "(IIFII)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "RemoteActionCompatParcelizer", "I"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class IcyHeaders implements PictureFrame {
    private final int RemoteActionCompatParcelizer;

    public IcyHeaders(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    @Override // kotlin.PictureFrame
    public final int IconCompatParcelizer(int p0, int p1, float p2, int p3, int p4) {
        long j = p0;
        return getQues.write(p1, (int) getQues.write(j - ((long) this.RemoteActionCompatParcelizer), 0L), (int) getQues.AudioAttributesCompatParcelizer(j + ((long) this.RemoteActionCompatParcelizer), 2147483647L));
    }

    public final boolean equals(Object p0) {
        return (p0 instanceof IcyHeaders) && this.RemoteActionCompatParcelizer == ((IcyHeaders) p0).RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return Integer.hashCode(this.RemoteActionCompatParcelizer);
    }
}
