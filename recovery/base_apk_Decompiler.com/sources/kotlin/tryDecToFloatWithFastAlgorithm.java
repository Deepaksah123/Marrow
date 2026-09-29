package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0012\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u0005"}, d2 = {"Lo/tryDecToFloatWithFastAlgorithm;", "", "", "p0", "<init>", "(I)V", "", "IconCompatParcelizer", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "read", "I", "write", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class tryDecToFloatWithFastAlgorithm {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private int write;

    public tryDecToFloatWithFastAlgorithm(int i) {
        this.write = i;
    }

    public /* synthetic */ tryDecToFloatWithFastAlgorithm(int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        this.write = i;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    public final void IconCompatParcelizer(int p0) {
        this.write += p0;
    }

    public tryDecToFloatWithFastAlgorithm() {
        this(0, 1, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof tryDecToFloatWithFastAlgorithm) && this.write == ((tryDecToFloatWithFastAlgorithm) p0).write;
    }

    public final int hashCode() {
        return Integer.hashCode(this.write);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("tryDecToFloatWithFastAlgorithm(write=");
        sb.append(this.write);
        sb.append(')');
        return sb.toString();
    }
}
