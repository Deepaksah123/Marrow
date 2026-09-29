package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001aB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ'\u0010\t\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0018R\u0011\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u0011\u0010\t\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018"}, d2 = {"Lo/getShowFullPage;", "", "", "p0", "p1", "p2", "<init>", "(III)V", "(I)V", "IconCompatParcelizer", "(III)I", "", "toString", "()Ljava/lang/String;", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "write", "(Lo/getShowFullPage;)I", "RemoteActionCompatParcelizer", "()Z", "I", "AudioAttributesImplApi21Parcelizer", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getShowFullPage implements Comparable<getShowFullPage> {

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final int read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final int write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int IconCompatParcelizer;
    public static final getShowFullPage AudioAttributesCompatParcelizer = getShowHomePage.IconCompatParcelizer();

    public getShowFullPage(int i, int i2, int i3) {
        this.write = i;
        this.RemoteActionCompatParcelizer = i2;
        this.IconCompatParcelizer = i3;
        this.read = IconCompatParcelizer(i, i2, i3);
    }

    public getShowFullPage(int i) {
        this(1, i, 0);
    }

    private static int IconCompatParcelizer(int p0, int p1, int p2) {
        if (p0 >= 0 && p0 < 256 && p1 >= 0 && p1 < 256 && p2 >= 0 && p2 < 256) {
            return (p0 << 16) + (p1 << 8) + p2;
        }
        StringBuilder sb = new StringBuilder("Version components are out of range: ");
        sb.append(p0);
        sb.append('.');
        sb.append(p1);
        sb.append('.');
        sb.append(p2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.write);
        sb.append('.');
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append('.');
        sb.append(this.IconCompatParcelizer);
        return sb.toString();
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        getShowFullPage getshowfullpage = p0 instanceof getShowFullPage ? (getShowFullPage) p0 : null;
        return getshowfullpage != null && this.read == getshowfullpage.read;
    }

    /* JADX INFO: renamed from: hashCode, reason: from getter */
    public final int getRead() {
        return this.read;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final int compareTo(getShowFullPage p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return this.read - p0.read;
    }

    public final boolean RemoteActionCompatParcelizer() {
        int i = this.write;
        return i > 1 || (i == 1 && this.RemoteActionCompatParcelizer >= 5);
    }
}
