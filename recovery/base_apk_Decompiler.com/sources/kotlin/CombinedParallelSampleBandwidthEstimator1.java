package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0011\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\fR\u001a\u0010\u0014\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u000e"}, d2 = {"Lo/CombinedParallelSampleBandwidthEstimator1;", "", "", "p0", "", "p1", "<init>", "(ILjava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "write", "I", "IconCompatParcelizer", "read", "Ljava/lang/String;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CombinedParallelSampleBandwidthEstimator1 {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    public CombinedParallelSampleBandwidthEstimator1(int i, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = str;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof CombinedParallelSampleBandwidthEstimator1)) {
            return false;
        }
        CombinedParallelSampleBandwidthEstimator1 combinedParallelSampleBandwidthEstimator1 = (CombinedParallelSampleBandwidthEstimator1) p0;
        return this.IconCompatParcelizer == combinedParallelSampleBandwidthEstimator1.IconCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) combinedParallelSampleBandwidthEstimator1.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return (Integer.hashCode(this.IconCompatParcelizer) * 31) + this.RemoteActionCompatParcelizer.hashCode();
    }

    public final String toString() {
        int i = this.IconCompatParcelizer;
        String str = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("CombinedParallelSampleBandwidthEstimator1(IconCompatParcelizer=");
        sb.append(i);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
