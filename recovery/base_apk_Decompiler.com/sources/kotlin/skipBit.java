package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0016\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b"}, d2 = {"Lo/skipBit;", "", "", "p0", "", "p1", "p2", "Lo/readCharacterIfInList;", "p3", "<init>", "(ZLjava/lang/String;ZLo/readCharacterIfInList;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "write", "Z", "AudioAttributesCompatParcelizer", "()Z", "read", "Ljava/lang/String;", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "Lo/readCharacterIfInList;", "()Lo/readCharacterIfInList;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class skipBit {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final String IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final boolean write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final readCharacterIfInList RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final boolean read;

    public skipBit(boolean z, String str, boolean z2, readCharacterIfInList readcharacterifinlist) {
        this.read = z;
        this.IconCompatParcelizer = str;
        this.write = z2;
        this.RemoteActionCompatParcelizer = readcharacterifinlist;
    }

    public /* synthetic */ skipBit(boolean z, String str, boolean z2, readCharacterIfInList readcharacterifinlist, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : readcharacterifinlist);
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final boolean getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final readCharacterIfInList getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public skipBit() {
        this(false, null, false, null, 15, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof skipBit)) {
            return false;
        }
        skipBit skipbit = (skipBit) p0;
        return this.read == skipbit.read && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) skipbit.IconCompatParcelizer) && this.write == skipbit.write && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, skipbit.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.read);
        String str = this.IconCompatParcelizer;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = Boolean.hashCode(this.write);
        readCharacterIfInList readcharacterifinlist = this.RemoteActionCompatParcelizer;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (readcharacterifinlist != null ? readcharacterifinlist.hashCode() : 0);
    }

    public final String toString() {
        boolean z = this.read;
        String str = this.IconCompatParcelizer;
        boolean z2 = this.write;
        readCharacterIfInList readcharacterifinlist = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("skipBit(read=");
        sb.append(z);
        sb.append(", IconCompatParcelizer=");
        sb.append(str);
        sb.append(", write=");
        sb.append(z2);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(readcharacterifinlist);
        sb.append(")");
        return sb.toString();
    }
}
