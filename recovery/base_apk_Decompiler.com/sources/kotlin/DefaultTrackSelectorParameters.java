package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\n\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0018\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0011\u0010\r"}, d2 = {"Lo/DefaultTrackSelectorParameters;", "", "Lo/getSelectionEligibility;", "p0", "", "p1", "", "p2", "<init>", "(Lo/getSelectionEligibility;ZI)V", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "write", "Lo/getSelectionEligibility;", "IconCompatParcelizer", "()Lo/getSelectionEligibility;", "read", "AudioAttributesCompatParcelizer", "Z", "RemoteActionCompatParcelizer", "()Z", "I"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DefaultTrackSelectorParameters {
    private final boolean AudioAttributesCompatParcelizer;
    private final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getSelectionEligibility read;

    public DefaultTrackSelectorParameters(getSelectionEligibility getselectioneligibility, boolean z, int i) {
        toMagicModuleMetaRepoModel.write(getselectioneligibility, "");
        this.read = getselectioneligibility;
        this.AudioAttributesCompatParcelizer = z;
        this.RemoteActionCompatParcelizer = i;
    }

    public /* synthetic */ DefaultTrackSelectorParameters(getSelectionEligibility getselectioneligibility, boolean z, int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(getselectioneligibility, (i2 & 2) != 0 ? false : z, i);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final getSelectionEligibility getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final boolean getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof DefaultTrackSelectorParameters)) {
            return false;
        }
        DefaultTrackSelectorParameters defaultTrackSelectorParameters = (DefaultTrackSelectorParameters) p0;
        return this.read == defaultTrackSelectorParameters.read && this.AudioAttributesCompatParcelizer == defaultTrackSelectorParameters.AudioAttributesCompatParcelizer && this.RemoteActionCompatParcelizer == defaultTrackSelectorParameters.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return (((this.read.hashCode() * 31) + Boolean.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        getSelectionEligibility getselectioneligibility = this.read;
        boolean z = this.AudioAttributesCompatParcelizer;
        int i = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("DefaultTrackSelectorParameters(read=");
        sb.append(getselectioneligibility);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(z);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
