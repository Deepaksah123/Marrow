package kotlin;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000e"}, d2 = {"Lo/SlidingPercentileBandwidthStatisticSample;", "", "", "p0", "", "p1", "<init>", "(ZLjava/lang/String;)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "RemoteActionCompatParcelizer", "Z", "IconCompatParcelizer", "()Z", "write", "AudioAttributesCompatParcelizer", "Ljava/lang/String;", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SlidingPercentileBandwidthStatisticSample {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final String IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final boolean write;

    private SlidingPercentileBandwidthStatisticSample(@JsonProperty("isEnabled") boolean z, @JsonProperty("oldRevisionSubjectId") String str) {
        this.write = z;
        this.IconCompatParcelizer = str;
    }

    public /* synthetic */ SlidingPercentileBandwidthStatisticSample(boolean z, String str, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final boolean getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SlidingPercentileBandwidthStatisticSample() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SlidingPercentileBandwidthStatisticSample)) {
            return false;
        }
        SlidingPercentileBandwidthStatisticSample slidingPercentileBandwidthStatisticSample = (SlidingPercentileBandwidthStatisticSample) p0;
        return this.write == slidingPercentileBandwidthStatisticSample.write && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) slidingPercentileBandwidthStatisticSample.IconCompatParcelizer);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.write);
        String str = this.IconCompatParcelizer;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        boolean z = this.write;
        String str = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("SlidingPercentileBandwidthStatisticSample(write=");
        sb.append(z);
        sb.append(", IconCompatParcelizer=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
