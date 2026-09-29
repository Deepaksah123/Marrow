package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lo/serializeIterableToBundleSafe;", "", "", "p0", "<init>", "(Z)V", "RemoteActionCompatParcelizer", "(Z)Lo/serializeIterableToBundleSafe;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "Z", "write", "()Z", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class serializeIterableToBundleSafe {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final boolean AudioAttributesCompatParcelizer;

    private serializeIterableToBundleSafe(boolean z) {
        this.AudioAttributesCompatParcelizer = z;
    }

    public /* synthetic */ serializeIterableToBundleSafe(boolean z, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? false : z);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final boolean getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public serializeIterableToBundleSafe() {
        this(false, 1, null);
    }

    public static serializeIterableToBundleSafe RemoteActionCompatParcelizer(boolean p0) {
        return new serializeIterableToBundleSafe(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof serializeIterableToBundleSafe) && this.AudioAttributesCompatParcelizer == ((serializeIterableToBundleSafe) p0).AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.AudioAttributesCompatParcelizer);
    }

    public final String toString() {
        boolean z = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("serializeIterableToBundleSafe(AudioAttributesCompatParcelizer=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
