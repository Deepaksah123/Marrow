package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0016\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0019\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018"}, d2 = {"Lo/EncryptedContentObject;", "", "", "p0", "p1", "p2", "<init>", "(JJ)V", "Lo/getMcqGuessedMap;", "IconCompatParcelizer", "()Lo/getMcqGuessedMap;", "", "RemoteActionCompatParcelizer", "()Z", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "write", "J", "read", "()J", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class EncryptedContentObject implements Iterable<Long>, getCurrentAnsweredMcqProgress {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final long read = 1;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final long write = saveMagicModuleTimeline.read(1L, 0L, 1L);

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final long IconCompatParcelizer = 1;

    public EncryptedContentObject(long j, long j2) {
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final long getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final long getWrite() {
        return this.write;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public getMcqGuessedMap iterator() {
        return new newEncryptedArray(this.read, this.write, this.IconCompatParcelizer);
    }

    public boolean RemoteActionCompatParcelizer() {
        long j = this.IconCompatParcelizer;
        long j2 = this.read;
        long j3 = this.write;
        return j > 0 ? j2 > j3 : j2 < j3;
    }

    public boolean equals(Object p0) {
        if (!(p0 instanceof EncryptedContentObject)) {
            return false;
        }
        if (RemoteActionCompatParcelizer() && ((EncryptedContentObject) p0).RemoteActionCompatParcelizer()) {
            return true;
        }
        EncryptedContentObject encryptedContentObject = (EncryptedContentObject) p0;
        return this.read == encryptedContentObject.read && this.write == encryptedContentObject.write && this.IconCompatParcelizer == encryptedContentObject.IconCompatParcelizer;
    }

    public int hashCode() {
        if (RemoteActionCompatParcelizer()) {
            return -1;
        }
        long j = this.read;
        long j2 = this.write;
        long j3 = this.IconCompatParcelizer;
        return (int) (((((j ^ (j >>> 32)) * 31) + (j2 ^ (j2 >>> 32))) * 31) + ((j3 >>> 32) ^ j3));
    }

    public String toString() {
        StringBuilder sb;
        long j;
        if (this.IconCompatParcelizer > 0) {
            sb = new StringBuilder();
            sb.append(this.read);
            sb.append("..");
            sb.append(this.write);
            sb.append(" step ");
            j = this.IconCompatParcelizer;
        } else {
            sb = new StringBuilder();
            sb.append(this.read);
            sb.append(" downTo ");
            sb.append(this.write);
            sb.append(" step ");
            j = -this.IconCompatParcelizer;
        }
        sb.append(j);
        return sb.toString();
    }
}
