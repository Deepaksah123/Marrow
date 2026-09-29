package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0014\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0010\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013"}, d2 = {"Lo/setMediaSourcesInternal;", "", "", "p0", "p1", "p2", "<init>", "(ZZZ)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "RemoteActionCompatParcelizer", "Z", "read", "()Z", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "write"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class setMediaSourcesInternal {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final boolean AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final boolean RemoteActionCompatParcelizer;

    private setMediaSourcesInternal(boolean z, boolean z2, boolean z3) {
        this.AudioAttributesCompatParcelizer = z;
        this.IconCompatParcelizer = z2;
        this.RemoteActionCompatParcelizer = z3;
    }

    public /* synthetic */ setMediaSourcesInternal(boolean z, boolean z2, boolean z3, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0 ? true : z3);
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final boolean getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public setMediaSourcesInternal() {
        this(false, false, false, 7, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof setMediaSourcesInternal)) {
            return false;
        }
        setMediaSourcesInternal setmediasourcesinternal = (setMediaSourcesInternal) p0;
        return this.AudioAttributesCompatParcelizer == setmediasourcesinternal.AudioAttributesCompatParcelizer && this.IconCompatParcelizer == setmediasourcesinternal.IconCompatParcelizer && this.RemoteActionCompatParcelizer == setmediasourcesinternal.RemoteActionCompatParcelizer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    public final int hashCode() {
        boolean z = this.AudioAttributesCompatParcelizer;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        boolean z2 = this.IconCompatParcelizer;
        ?? r2 = z2;
        if (z2) {
            r2 = 1;
        }
        boolean z3 = this.RemoteActionCompatParcelizer;
        return (((r0 * 31) + r2) * 31) + (z3 ? 1 : z3);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("setMediaSourcesInternal(AudioAttributesCompatParcelizer=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", IconCompatParcelizer=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
