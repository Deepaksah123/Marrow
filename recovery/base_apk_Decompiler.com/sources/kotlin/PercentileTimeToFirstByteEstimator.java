package kotlin;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.custommodule.FilterParams;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\b\u001a\u00020\u00072\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013"}, d2 = {"Lo/PercentileTimeToFirstByteEstimator;", "", "", "Lo/SlidingPercentileBandwidthStatistic;", "p0", "<init>", "(Ljava/util/List;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "RemoteActionCompatParcelizer", "Ljava/util/List;", "AudioAttributesCompatParcelizer", "()Ljava/util/List;", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PercentileTimeToFirstByteEstimator {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final List<SlidingPercentileBandwidthStatistic> write;

    private PercentileTimeToFirstByteEstimator(@JsonProperty(FilterParams.KEY_SUBJECTS) List<SlidingPercentileBandwidthStatistic> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.write = list;
    }

    public /* synthetic */ PercentileTimeToFirstByteEstimator(List list, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list);
    }

    public final List<SlidingPercentileBandwidthStatistic> AudioAttributesCompatParcelizer() {
        return this.write;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PercentileTimeToFirstByteEstimator() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof PercentileTimeToFirstByteEstimator) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, ((PercentileTimeToFirstByteEstimator) p0).write);
    }

    public final int hashCode() {
        return this.write.hashCode();
    }

    public final String toString() {
        List<SlidingPercentileBandwidthStatistic> list = this.write;
        StringBuilder sb = new StringBuilder("PercentileTimeToFirstByteEstimator(write=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
