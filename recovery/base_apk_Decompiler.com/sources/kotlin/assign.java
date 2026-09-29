package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0014\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0011\u0010\u001c\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u001b\u0010\u001aR\u0011\u0010\u001d\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u001aR\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u001c\u0010\u0015R\u0011\u0010\u0017\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u001d\u0010\u001a"}, d2 = {"Lo/assign;", "", "", "p0", "p1", "", "p2", "p3", "p4", "p5", "p6", "<init>", "(Ljava/lang/String;Ljava/lang/Object;ZZZLjava/lang/String;Z)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "RemoteActionCompatParcelizer", "Ljava/lang/String;", "IconCompatParcelizer", "AudioAttributesImplBaseParcelizer", "Ljava/lang/Object;", "AudioAttributesCompatParcelizer", "Z", "AudioAttributesImplApi26Parcelizer", "read", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class assign {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final boolean read;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final Object AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final boolean write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final String IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final String AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final boolean AudioAttributesImplBaseParcelizer;

    public assign(String str, Object obj, boolean z, boolean z2, boolean z3, String str2, boolean z4) {
        this.IconCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = obj;
        this.RemoteActionCompatParcelizer = z;
        this.read = z2;
        this.write = z3;
        this.AudioAttributesImplApi26Parcelizer = str2;
        this.AudioAttributesImplBaseParcelizer = z4;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof assign)) {
            return false;
        }
        assign assignVar = (assign) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) assignVar.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, assignVar.AudioAttributesCompatParcelizer) && this.RemoteActionCompatParcelizer == assignVar.RemoteActionCompatParcelizer && this.read == assignVar.read && this.write == assignVar.write && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi26Parcelizer, (Object) assignVar.AudioAttributesImplApi26Parcelizer) && this.AudioAttributesImplBaseParcelizer == assignVar.AudioAttributesImplBaseParcelizer;
    }

    public final int hashCode() {
        int iHashCode = this.IconCompatParcelizer.hashCode();
        Object obj = this.AudioAttributesCompatParcelizer;
        int iHashCode2 = obj == null ? 0 : obj.hashCode();
        int iHashCode3 = Boolean.hashCode(this.RemoteActionCompatParcelizer);
        int iHashCode4 = Boolean.hashCode(this.read);
        int iHashCode5 = Boolean.hashCode(this.write);
        String str = this.AudioAttributesImplApi26Parcelizer;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.AudioAttributesImplBaseParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("assign(IconCompatParcelizer=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", read=");
        sb.append(this.read);
        sb.append(", write=");
        sb.append(this.write);
        sb.append(", AudioAttributesImplApi26Parcelizer=");
        sb.append(this.AudioAttributesImplApi26Parcelizer);
        sb.append(", AudioAttributesImplBaseParcelizer=");
        sb.append(this.AudioAttributesImplBaseParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
