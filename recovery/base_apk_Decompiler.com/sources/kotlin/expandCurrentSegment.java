package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0015\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0013\u0010\u0017\u001a\u0004\u0018\u00018\u00008\u0006¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lo/expandCurrentSegment;", "T", "", "", "p0", "p1", "p2", "<init>", "(FFLjava/lang/Object;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "RemoteActionCompatParcelizer", "F", "AudioAttributesCompatParcelizer", "read", "Ljava/lang/Object;", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class expandCurrentSegment<T> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final float read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final float AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final T IconCompatParcelizer;

    public expandCurrentSegment(float f, float f2, T t) {
        this.AudioAttributesCompatParcelizer = f;
        this.read = f2;
        this.IconCompatParcelizer = t;
    }

    public boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 != null && getClass() == p0.getClass()) {
            expandCurrentSegment expandcurrentsegment = (expandCurrentSegment) p0;
            return this.AudioAttributesCompatParcelizer == expandcurrentsegment.AudioAttributesCompatParcelizer && this.read == expandcurrentsegment.read && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, expandcurrentsegment.IconCompatParcelizer);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = Float.hashCode(this.AudioAttributesCompatParcelizer);
        int iHashCode2 = Float.hashCode(this.read);
        T t = this.IconCompatParcelizer;
        return (((iHashCode * 31) + iHashCode2) * 31) + (t != null ? t.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Interval(start=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", end=");
        sb.append(this.read);
        sb.append(", data=");
        sb.append(this.IconCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
