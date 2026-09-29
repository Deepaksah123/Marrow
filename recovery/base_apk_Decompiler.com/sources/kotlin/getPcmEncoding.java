package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0014\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0016\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0019\u001a\u0004\b\u0012\u0010\u001a"}, d2 = {"Lo/getPcmEncoding;", "", "", "p0", "", "p1", "p2", "", "p3", "<init>", "(ZLjava/lang/String;ZLjava/lang/Long;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "Z", "RemoteActionCompatParcelizer", "()Z", "IconCompatParcelizer", "Ljava/lang/String;", "read", "Ljava/lang/Long;", "()Ljava/lang/Long;", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class getPcmEncoding {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final Long write;
    private final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final boolean AudioAttributesCompatParcelizer;

    public getPcmEncoding(boolean z, String str, boolean z2, Long l) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.IconCompatParcelizer = z;
        this.RemoteActionCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = z2;
        this.write = l;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final boolean getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public /* synthetic */ getPcmEncoding(boolean z, String str, boolean z2, Long l, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : l);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final Long getWrite() {
        return this.write;
    }

    public getPcmEncoding() {
        this(false, null, false, null, 15, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof getPcmEncoding)) {
            return false;
        }
        getPcmEncoding getpcmencoding = (getPcmEncoding) p0;
        return this.IconCompatParcelizer == getpcmencoding.IconCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) getpcmencoding.RemoteActionCompatParcelizer) && this.AudioAttributesCompatParcelizer == getpcmencoding.AudioAttributesCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, getpcmencoding.write);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.IconCompatParcelizer);
        int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode3 = Boolean.hashCode(this.AudioAttributesCompatParcelizer);
        Long l = this.write;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (l == null ? 0 : l.hashCode());
    }

    public final String toString() {
        boolean z = this.IconCompatParcelizer;
        String str = this.RemoteActionCompatParcelizer;
        boolean z2 = this.AudioAttributesCompatParcelizer;
        Long l = this.write;
        StringBuilder sb = new StringBuilder("getPcmEncoding(IconCompatParcelizer=");
        sb.append(z);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(str);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(z2);
        sb.append(", write=");
        sb.append(l);
        sb.append(")");
        return sb.toString();
    }
}
