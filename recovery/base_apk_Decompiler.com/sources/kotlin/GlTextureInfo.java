package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0014\u001a\u00020\u00028\u0007@\u0006X\u0086\f¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0011\u001a\u00020\u00048\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u001c\u0010\u0013\u001a\u00020\u00068\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lo/GlTextureInfo;", "", "", "p0", "", "p1", "", "p2", "<init>", "(Ljava/lang/String;IJ)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "RemoteActionCompatParcelizer", "Ljava/lang/String;", "write", "read", "I", "IconCompatParcelizer", "J", "AudioAttributesCompatParcelizer", "()J"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GlTextureInfo {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private String read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private long write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private int RemoteActionCompatParcelizer;

    public GlTextureInfo(String str, int i, long j) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.read = str;
        this.RemoteActionCompatParcelizer = i;
        this.write = j;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final long getWrite() {
        return this.write;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof GlTextureInfo)) {
            return false;
        }
        GlTextureInfo glTextureInfo = (GlTextureInfo) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) glTextureInfo.read) && this.RemoteActionCompatParcelizer == glTextureInfo.RemoteActionCompatParcelizer && this.write == glTextureInfo.write;
    }

    public final int hashCode() {
        return (((this.read.hashCode() * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Long.hashCode(this.write);
    }

    public final String toString() {
        String str = this.read;
        int i = this.RemoteActionCompatParcelizer;
        long j = this.write;
        StringBuilder sb = new StringBuilder("GlTextureInfo(read=");
        sb.append(str);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(i);
        sb.append(", write=");
        sb.append(j);
        sb.append(")");
        return sb.toString();
    }
}
