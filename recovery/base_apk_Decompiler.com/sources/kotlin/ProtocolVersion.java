package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0015\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0016\u001a\u0004\b\u0013\u0010\u000b"}, d2 = {"Lo/ProtocolVersion;", "", "", "p0", "", "p1", "<init>", "(ZI)V", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "write", "Z", "read", "()Z", "AudioAttributesCompatParcelizer", "(Z)V", "IconCompatParcelizer", "I", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ProtocolVersion {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private boolean IconCompatParcelizer;

    public ProtocolVersion(boolean z, int i) {
        this.IconCompatParcelizer = z;
        this.RemoteActionCompatParcelizer = i;
    }

    public /* synthetic */ ProtocolVersion(boolean z, int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? 0 : i);
    }

    public final void AudioAttributesCompatParcelizer(boolean z) {
        this.IconCompatParcelizer = z;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProtocolVersion() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ProtocolVersion)) {
            return false;
        }
        ProtocolVersion protocolVersion = (ProtocolVersion) p0;
        return this.IconCompatParcelizer == protocolVersion.IconCompatParcelizer && this.RemoteActionCompatParcelizer == protocolVersion.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return (Boolean.hashCode(this.IconCompatParcelizer) * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        boolean z = this.IconCompatParcelizer;
        int i = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("ProtocolVersion(IconCompatParcelizer=");
        sb.append(z);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
