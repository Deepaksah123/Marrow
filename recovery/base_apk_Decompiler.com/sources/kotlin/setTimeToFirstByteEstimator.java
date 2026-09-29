package kotlin;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012"}, d2 = {"Lo/setTimeToFirstByteEstimator;", "", "", "p0", "p1", "<init>", "(ZZ)V", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "Z", "RemoteActionCompatParcelizer", "()Z", "read", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class setTimeToFirstByteEstimator {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final boolean read;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final boolean AudioAttributesCompatParcelizer;

    private setTimeToFirstByteEstimator(@JsonProperty("play_tap") boolean z, @JsonProperty("playback_failed") boolean z2) {
        this.read = z;
        this.AudioAttributesCompatParcelizer = z2;
    }

    public /* synthetic */ setTimeToFirstByteEstimator(boolean z, boolean z2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public setTimeToFirstByteEstimator() {
        boolean z = false;
        this(z, z, 3, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof setTimeToFirstByteEstimator)) {
            return false;
        }
        setTimeToFirstByteEstimator settimetofirstbyteestimator = (setTimeToFirstByteEstimator) p0;
        return this.read == settimetofirstbyteestimator.read && this.AudioAttributesCompatParcelizer == settimetofirstbyteestimator.AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        return (Boolean.hashCode(this.read) * 31) + Boolean.hashCode(this.AudioAttributesCompatParcelizer);
    }

    public final String toString() {
        boolean z = this.read;
        boolean z2 = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("setTimeToFirstByteEstimator(read=");
        sb.append(z);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }
}
