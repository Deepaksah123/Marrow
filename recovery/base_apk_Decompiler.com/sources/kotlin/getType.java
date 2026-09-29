package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\r\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ-\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\bJ-\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\"\u0010\u0017\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\r\u0010\u0015\"\u0004\b\u000b\u0010\u0016R\"\u0010\u0013\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0017\u0010\u0015\"\u0004\b\r\u0010\u0016R\"\u0010\u000f\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b\u000b\u0010\u0015\"\u0004\b\u0013\u0010\u0016R\"\u0010\r\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u000f\u0010\u0015\"\u0004\b\u0017\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u00188G¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0019"}, d2 = {"Lo/getType;", "", "", "p0", "p1", "p2", "p3", "<init>", "(FFFF)V", "Lo/getReferencedType;", "", "IconCompatParcelizer", "(J)V", "write", "(FF)V", "AudioAttributesCompatParcelizer", "", "toString", "()Ljava/lang/String;", "read", "F", "()F", "(F)V", "RemoteActionCompatParcelizer", "", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getType {
    private float AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private float read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private float RemoteActionCompatParcelizer;
    private float write;

    public getType(float f, float f2, float f3, float f4) {
        this.RemoteActionCompatParcelizer = f;
        this.read = f2;
        this.AudioAttributesCompatParcelizer = f3;
        this.write = f4;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final float getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final float getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void IconCompatParcelizer(float f) {
        this.RemoteActionCompatParcelizer = f;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final float getRead() {
        return this.read;
    }

    public final void RemoteActionCompatParcelizer(float f) {
        this.write = f;
    }

    public final void read(float f) {
        this.AudioAttributesCompatParcelizer = f;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final float getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void write(float f) {
        this.read = f;
    }

    public final boolean read() {
        return (this.RemoteActionCompatParcelizer >= this.AudioAttributesCompatParcelizer) | (this.read >= this.write);
    }

    public final void write(float p0, float p1) {
        this.RemoteActionCompatParcelizer += p0;
        this.read += p1;
        this.AudioAttributesCompatParcelizer += p0;
        this.write += p1;
    }

    public final void IconCompatParcelizer(float p0, float p1, float p2, float p3) {
        this.RemoteActionCompatParcelizer = Math.max(p0, this.RemoteActionCompatParcelizer);
        this.read = Math.max(p1, this.read);
        this.AudioAttributesCompatParcelizer = Math.min(p2, this.AudioAttributesCompatParcelizer);
        this.write = Math.min(p3, this.write);
    }

    public final void AudioAttributesCompatParcelizer(float p0, float p1, float p2, float p3) {
        this.RemoteActionCompatParcelizer = p0;
        this.read = p1;
        this.AudioAttributesCompatParcelizer = p2;
        this.write = p3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MutableRect(");
        sb.append(isReferenceType.read(this.RemoteActionCompatParcelizer, 1));
        sb.append(", ");
        sb.append(isReferenceType.read(this.read, 1));
        sb.append(", ");
        sb.append(isReferenceType.read(this.AudioAttributesCompatParcelizer, 1));
        sb.append(", ");
        sb.append(isReferenceType.read(this.write, 1));
        sb.append(')');
        return sb.toString();
    }

    public final void IconCompatParcelizer(long p0) {
        write(Float.intBitsToFloat((int) (p0 >> 32)), Float.intBitsToFloat((int) p0));
    }
}
