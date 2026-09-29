package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0010\u001a\u0004\b\u000f\u0010\u000b"}, d2 = {"Lo/deserializerModifiers;", "", "", "p0", "p1", "<init>", "(II)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "read", "I", "write", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class deserializerModifiers {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int IconCompatParcelizer;
    private final int write;

    public deserializerModifiers(int i, int i2) {
        this.IconCompatParcelizer = i;
        this.write = i2;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof deserializerModifiers)) {
            return false;
        }
        deserializerModifiers deserializermodifiers = (deserializerModifiers) p0;
        return this.IconCompatParcelizer == deserializermodifiers.IconCompatParcelizer && this.write == deserializermodifiers.write;
    }

    public final int hashCode() {
        return (Integer.hashCode(this.IconCompatParcelizer) * 31) + Integer.hashCode(this.write);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectionInfo(rowCount=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", columnCount=");
        sb.append(this.write);
        sb.append(')');
        return sb.toString();
    }
}
