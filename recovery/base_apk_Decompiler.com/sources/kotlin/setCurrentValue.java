package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0012\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015R\u001a\u0010\u0014\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015"}, d2 = {"Lo/setCurrentValue;", "", "", "p0", "p1", "p2", "p3", "<init>", "(FFFF)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "write", "F", "read", "()F", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setCurrentValue {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final float read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final float write;
    private final float RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final float IconCompatParcelizer;

    public setCurrentValue(float f, float f2, float f3, float f4) {
        this.IconCompatParcelizer = f;
        this.write = f2;
        this.read = f3;
        this.RemoteActionCompatParcelizer = f4;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final float getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final float getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final float getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final float getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof setCurrentValue)) {
            return false;
        }
        setCurrentValue setcurrentvalue = (setCurrentValue) p0;
        return this.IconCompatParcelizer == setcurrentvalue.IconCompatParcelizer && this.write == setcurrentvalue.write && this.read == setcurrentvalue.read && this.RemoteActionCompatParcelizer == setcurrentvalue.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.IconCompatParcelizer);
        return (((((iHashCode * 31) + Float.hashCode(this.write)) * 31) + Float.hashCode(this.read)) * 31) + Float.hashCode(this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", focusedAlpha=");
        sb.append(this.write);
        sb.append(", hoveredAlpha=");
        sb.append(this.read);
        sb.append(", pressedAlpha=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
