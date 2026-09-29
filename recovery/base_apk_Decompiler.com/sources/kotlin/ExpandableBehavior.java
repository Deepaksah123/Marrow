package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\b¨\u0006\u0012"}, d2 = {"Lcom/marrow2/ui/video/landing/model/InternModeTooltipState;", "", "showTooltip", "", "isCurrentEd6", "<init>", "(ZZ)V", "getShowTooltip", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExpandableBehavior {
    private final boolean read;
    private final boolean write;

    private ExpandableBehavior(boolean z, boolean z2) {
        this.read = z;
        this.write = z2;
    }

    public /* synthetic */ ExpandableBehavior(boolean z, boolean z2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final boolean getWrite() {
        return this.write;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExpandableBehavior() {
        boolean z = false;
        this(z, z, 3, null);
    }

    public static ExpandableBehavior RemoteActionCompatParcelizer(boolean z, boolean z2) {
        return new ExpandableBehavior(z, z2);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpandableBehavior)) {
            return false;
        }
        ExpandableBehavior expandableBehavior = (ExpandableBehavior) other;
        return this.read == expandableBehavior.read && this.write == expandableBehavior.write;
    }

    public final int hashCode() {
        return (Boolean.hashCode(this.read) * 31) + Boolean.hashCode(this.write);
    }

    public final String toString() {
        boolean z = this.read;
        boolean z2 = this.write;
        StringBuilder sb = new StringBuilder("InternModeTooltipState(showTooltip=");
        sb.append(z);
        sb.append(", isCurrentEd6=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }
}
