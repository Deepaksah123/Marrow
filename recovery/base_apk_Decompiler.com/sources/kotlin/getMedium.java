package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\b\b\u0016\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000fH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\n\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001c"}, d2 = {"Lo/getMedium;", "", "", "p0", "p1", "", "p2", "<init>", "(CC)V", "Lo/setPlanBUpgradeDataList;", "IconCompatParcelizer", "()Lo/setPlanBUpgradeDataList;", "", "RemoteActionCompatParcelizer", "()Z", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "write", "C", "AudioAttributesCompatParcelizer", "()C", "read", "I"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class getMedium implements Iterable<Character>, getCurrentAnsweredMcqProgress {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final char write;
    private final int read = 1;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final char IconCompatParcelizer;

    public getMedium(char c, char c2) {
        this.IconCompatParcelizer = c;
        this.write = (char) saveMagicModuleTimeline.read((int) c, (int) c2, 1);
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final char getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final char getWrite() {
        return this.write;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public setPlanBUpgradeDataList iterator() {
        return new isPersistent(this.IconCompatParcelizer, this.write, this.read);
    }

    public boolean RemoteActionCompatParcelizer() {
        return this.read > 0 ? toMagicModuleMetaRepoModel.read((int) this.IconCompatParcelizer, (int) this.write) > 0 : toMagicModuleMetaRepoModel.read((int) this.IconCompatParcelizer, (int) this.write) < 0;
    }

    public boolean equals(Object p0) {
        if (!(p0 instanceof getMedium)) {
            return false;
        }
        if (RemoteActionCompatParcelizer() && ((getMedium) p0).RemoteActionCompatParcelizer()) {
            return true;
        }
        getMedium getmedium = (getMedium) p0;
        return this.IconCompatParcelizer == getmedium.IconCompatParcelizer && this.write == getmedium.write && this.read == getmedium.read;
    }

    public int hashCode() {
        if (RemoteActionCompatParcelizer()) {
            return -1;
        }
        return (((this.IconCompatParcelizer * 31) + this.write) * 31) + this.read;
    }

    public String toString() {
        StringBuilder sb;
        int i;
        if (this.read > 0) {
            sb = new StringBuilder();
            sb.append(this.IconCompatParcelizer);
            sb.append("..");
            sb.append(this.write);
            sb.append(" step ");
            i = this.read;
        } else {
            sb = new StringBuilder();
            sb.append(this.IconCompatParcelizer);
            sb.append(" downTo ");
            sb.append(this.write);
            sb.append(" step ");
            i = -this.read;
        }
        sb.append(i);
        return sb.toString();
    }
}
