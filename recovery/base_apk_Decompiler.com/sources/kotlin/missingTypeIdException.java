package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\"\u0010\u0013\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0015\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u0011\u0010\u001a"}, d2 = {"Lo/missingTypeIdException;", "", "", "p0", "", "p1", "<init>", "(JF)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "J", "RemoteActionCompatParcelizer", "()J", "write", "(J)V", "F", "IconCompatParcelizer", "()F", "(F)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class missingTypeIdException {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private long RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private float write;

    public missingTypeIdException(long j, float f) {
        this.RemoteActionCompatParcelizer = j;
        this.write = f;
    }

    public final void AudioAttributesCompatParcelizer(float f) {
        this.write = f;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final float getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final long getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void write(long j) {
        this.RemoteActionCompatParcelizer = j;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof missingTypeIdException)) {
            return false;
        }
        missingTypeIdException missingtypeidexception = (missingTypeIdException) p0;
        return this.RemoteActionCompatParcelizer == missingtypeidexception.RemoteActionCompatParcelizer && Float.compare(this.write, missingtypeidexception.write) == 0;
    }

    public final int hashCode() {
        return (Long.hashCode(this.RemoteActionCompatParcelizer) * 31) + Float.hashCode(this.write);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("missingTypeIdException(RemoteActionCompatParcelizer=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", write=");
        sb.append(this.write);
        sb.append(')');
        return sb.toString();
    }
}
