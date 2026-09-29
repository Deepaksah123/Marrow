package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: renamed from: o.getStartTimestamp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0015\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000fR\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016"}, d2 = {"Lo/getStartTimestamp;", "", "", "p0", "", "Lo/getBody;", "p1", "", "p2", "p3", "<init>", "(ZLjava/util/List;IZ)V", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "RemoteActionCompatParcelizer", "Z", "read", "()Z", "Ljava/util/List;", "AudioAttributesCompatParcelizer", "()Ljava/util/List;", "write", "I", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class C0178getStartTimestamp {
    private final boolean AudioAttributesCompatParcelizer;
    private final boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final List<getBody> write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int read;

    /* JADX WARN: Multi-variable type inference failed */
    public C0178getStartTimestamp(boolean z, List<? extends getBody> list, int i, boolean z2) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.RemoteActionCompatParcelizer = z;
        this.write = list;
        this.read = i;
        this.AudioAttributesCompatParcelizer = z2;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public /* synthetic */ C0178getStartTimestamp(boolean z, List list, int i, boolean z2, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i2 & 4) != 0 ? -1 : i, (i2 & 8) != 0 ? false : z2);
    }

    public final List<getBody> AudioAttributesCompatParcelizer() {
        return this.write;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final boolean getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public C0178getStartTimestamp() {
        this(false, null, 0, false, 15, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof C0178getStartTimestamp)) {
            return false;
        }
        C0178getStartTimestamp c0178getStartTimestamp = (C0178getStartTimestamp) p0;
        return this.RemoteActionCompatParcelizer == c0178getStartTimestamp.RemoteActionCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, c0178getStartTimestamp.write) && this.read == c0178getStartTimestamp.read && this.AudioAttributesCompatParcelizer == c0178getStartTimestamp.AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        return (((((Boolean.hashCode(this.RemoteActionCompatParcelizer) * 31) + this.write.hashCode()) * 31) + Integer.hashCode(this.read)) * 31) + Boolean.hashCode(this.AudioAttributesCompatParcelizer);
    }

    public final String toString() {
        boolean z = this.RemoteActionCompatParcelizer;
        List<getBody> list = this.write;
        int i = this.read;
        boolean z2 = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("getStartTimestamp(RemoteActionCompatParcelizer=");
        sb.append(z);
        sb.append(", write=");
        sb.append(list);
        sb.append(", read=");
        sb.append(i);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }
}
