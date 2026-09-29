package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\b\u0010\u0014R\u001a\u0010\b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019"}, d2 = {"Lo/isConnectionCallbacksRegistered;", "Lo/getApiKey;", "", "p0", "", "p1", "<init>", "(JZ)V", "write", "(J)Lo/isConnectionCallbacksRegistered;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "()J", "IconCompatParcelizer", "read", "Z", "AudioAttributesCompatParcelizer", "()Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class isConnectionCallbacksRegistered extends getApiKey {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final boolean write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final long IconCompatParcelizer;

    private isConnectionCallbacksRegistered(long j, boolean z) {
        super(12);
        this.IconCompatParcelizer = j;
        this.write = z;
    }

    public /* synthetic */ isConnectionCallbacksRegistered(long j, boolean z, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? false : z);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final long getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final boolean getWrite() {
        return this.write;
    }

    public isConnectionCallbacksRegistered() {
        this(0L, false, 3, null);
    }

    public static isConnectionCallbacksRegistered write(long j) {
        return new isConnectionCallbacksRegistered(j, true);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof isConnectionCallbacksRegistered)) {
            return false;
        }
        isConnectionCallbacksRegistered isconnectioncallbacksregistered = (isConnectionCallbacksRegistered) p0;
        return this.IconCompatParcelizer == isconnectioncallbacksregistered.IconCompatParcelizer && this.write == isconnectioncallbacksregistered.write;
    }

    public final int hashCode() {
        return (Long.hashCode(this.IconCompatParcelizer) * 31) + Boolean.hashCode(this.write);
    }

    public final String toString() {
        long j = this.IconCompatParcelizer;
        boolean z = this.write;
        StringBuilder sb = new StringBuilder("isConnectionCallbacksRegistered(IconCompatParcelizer=");
        sb.append(j);
        sb.append(", write=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
