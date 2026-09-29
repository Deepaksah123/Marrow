package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015"}, d2 = {"Lo/getDeclaringClass;", "Lo/findBeanDeserializer;", "", "p0", "p1", "<init>", "(II)V", "Lo/findReferenceDeserializer;", "", "read", "(Lo/findReferenceDeserializer;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "I", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getDeclaringClass implements findBeanDeserializer {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int read;
    private final int write;

    public getDeclaringClass(int i, int i2) {
        this.read = i;
        this.write = i2;
    }

    @Override // kotlin.findBeanDeserializer
    public final void read(findReferenceDeserializer p0) {
        if (p0.AudioAttributesImplApi21Parcelizer()) {
            p0.write();
        }
        int iWrite = getQues.write(this.read, 0, p0.AudioAttributesImplApi26Parcelizer());
        int iWrite2 = getQues.write(this.write, 0, p0.AudioAttributesImplApi26Parcelizer());
        if (iWrite != iWrite2) {
            if (iWrite < iWrite2) {
                p0.IconCompatParcelizer(iWrite, iWrite2);
            } else {
                p0.IconCompatParcelizer(iWrite2, iWrite);
            }
        }
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof getDeclaringClass)) {
            return false;
        }
        getDeclaringClass getdeclaringclass = (getDeclaringClass) p0;
        return this.read == getdeclaringclass.read && this.write == getdeclaringclass.write;
    }

    public final int hashCode() {
        return (this.read * 31) + this.write;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetComposingRegionCommand(start=");
        sb.append(this.read);
        sb.append(", end=");
        sb.append(this.write);
        sb.append(')');
        return sb.toString();
    }
}
