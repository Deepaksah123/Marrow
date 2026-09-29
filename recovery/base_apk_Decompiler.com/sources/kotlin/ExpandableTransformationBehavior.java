package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J'\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/marrow2/ui/video/landing/model/InternModelLoadedUIData;", "", "showLoader", "", "isEd6", "isInternModeChecked", "<init>", "(ZZZ)V", "getShowLoader", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ExpandableTransformationBehavior {
    private final boolean IconCompatParcelizer;
    private final boolean read;
    private final boolean write;

    private ExpandableTransformationBehavior(boolean z, boolean z2, boolean z3) {
        this.read = z;
        this.IconCompatParcelizer = z2;
        this.write = z3;
    }

    public /* synthetic */ ExpandableTransformationBehavior(boolean z, boolean z2, boolean z3, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3);
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final boolean getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final boolean getWrite() {
        return this.write;
    }

    public ExpandableTransformationBehavior() {
        this(false, false, false, 7, null);
    }

    public static ExpandableTransformationBehavior AudioAttributesCompatParcelizer(boolean z, boolean z2, boolean z3) {
        return new ExpandableTransformationBehavior(z, z2, z3);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpandableTransformationBehavior)) {
            return false;
        }
        ExpandableTransformationBehavior expandableTransformationBehavior = (ExpandableTransformationBehavior) other;
        return this.read == expandableTransformationBehavior.read && this.IconCompatParcelizer == expandableTransformationBehavior.IconCompatParcelizer && this.write == expandableTransformationBehavior.write;
    }

    public final int hashCode() {
        return (((Boolean.hashCode(this.read) * 31) + Boolean.hashCode(this.IconCompatParcelizer)) * 31) + Boolean.hashCode(this.write);
    }

    public final String toString() {
        boolean z = this.read;
        boolean z2 = this.IconCompatParcelizer;
        boolean z3 = this.write;
        StringBuilder sb = new StringBuilder("InternModelLoadedUIData(showLoader=");
        sb.append(z);
        sb.append(", isEd6=");
        sb.append(z2);
        sb.append(", isInternModeChecked=");
        sb.append(z3);
        sb.append(")");
        return sb.toString();
    }
}
