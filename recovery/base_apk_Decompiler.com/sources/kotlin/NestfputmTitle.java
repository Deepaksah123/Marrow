package kotlin;

import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public final class NestfputmTitle {
    private final Collection<setSectionName> IconCompatParcelizer;
    private final setDurationText RemoteActionCompatParcelizer;
    private final boolean write;

    /* JADX WARN: Multi-variable type inference failed */
    public NestfputmTitle(setDurationText setdurationtext, Collection<? extends setSectionName> collection, boolean z) {
        toMagicModuleMetaRepoModel.write(setdurationtext, "");
        toMagicModuleMetaRepoModel.write(collection, "");
        this.RemoteActionCompatParcelizer = setdurationtext;
        this.IconCompatParcelizer = collection;
        this.write = z;
    }

    public final setDurationText RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final Collection<setSectionName> read() {
        return this.IconCompatParcelizer;
    }

    public /* synthetic */ NestfputmTitle(setDurationText setdurationtext, Collection collection) {
        this(setdurationtext, collection, setdurationtext.AudioAttributesCompatParcelizer() == VideoSubModel.NOT_NULL);
    }

    public final boolean IconCompatParcelizer() {
        return this.write;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static NestfputmTitle read(setDurationText setdurationtext, Collection<? extends setSectionName> collection, boolean z) {
        toMagicModuleMetaRepoModel.write(setdurationtext, "");
        toMagicModuleMetaRepoModel.write(collection, "");
        return new NestfputmTitle(setdurationtext, collection, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NestfputmTitle)) {
            return false;
        }
        NestfputmTitle nestfputmTitle = (NestfputmTitle) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, nestfputmTitle.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, nestfputmTitle.IconCompatParcelizer) && this.write == nestfputmTitle.write;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode2 = this.IconCompatParcelizer.hashCode();
        boolean z = this.write;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return (((iHashCode * 31) + iHashCode2) * 31) + r2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JavaDefaultQualifiers(nullabilityQualifier=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", qualifierApplicabilityTypes=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", definitelyNotNull=");
        sb.append(this.write);
        sb.append(')');
        return sb.toString();
    }
}
