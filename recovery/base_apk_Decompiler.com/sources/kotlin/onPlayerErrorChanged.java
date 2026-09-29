package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class onPlayerErrorChanged<ResourceT> extends onPlaybackSuppressionReasonChanged<ResourceT> {
    private final ResourceT AudioAttributesCompatParcelizer;
    private final onPositionDiscontinuity RemoteActionCompatParcelizer;

    public final /* synthetic */ class read {
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[onPositionDiscontinuity.values().length];
            iArr[onPositionDiscontinuity.SUCCEEDED.ordinal()] = 1;
            iArr[onPositionDiscontinuity.RUNNING.ordinal()] = 2;
            iArr[onPositionDiscontinuity.FAILED.ordinal()] = 3;
            iArr[onPositionDiscontinuity.CLEARED.ordinal()] = 4;
            write = iArr;
        }
    }

    @Override // kotlin.onPlaybackSuppressionReasonChanged
    public final onPositionDiscontinuity read() {
        return this.RemoteActionCompatParcelizer;
    }

    public final ResourceT IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onPlayerErrorChanged(onPositionDiscontinuity onpositiondiscontinuity, ResourceT resourcet) {
        super(null);
        toMagicModuleMetaRepoModel.write(onpositiondiscontinuity, "");
        this.RemoteActionCompatParcelizer = onpositiondiscontinuity;
        this.AudioAttributesCompatParcelizer = resourcet;
        int i = read.write[read().ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return;
        }
        if (i == 4) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new RenewEligibleCreator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onPlayerErrorChanged)) {
            return false;
        }
        onPlayerErrorChanged onplayererrorchanged = (onPlayerErrorChanged) obj;
        return read() == onplayererrorchanged.read() && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, onplayererrorchanged.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        int iHashCode = read().hashCode();
        ResourceT resourcet = this.AudioAttributesCompatParcelizer;
        return (iHashCode * 31) + (resourcet == null ? 0 : resourcet.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Resource(status=");
        sb.append(read());
        sb.append(", resource=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
