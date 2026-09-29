package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class addTimelineForMediaPeriodId {
    private final String AudioAttributesCompatParcelizer;
    private final boolean IconCompatParcelizer;

    public addTimelineForMediaPeriodId(String str, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.AudioAttributesCompatParcelizer = str;
        this.IconCompatParcelizer = z;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean write() {
        return this.IconCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof addTimelineForMediaPeriodId)) {
            return false;
        }
        addTimelineForMediaPeriodId addtimelineformediaperiodid = (addTimelineForMediaPeriodId) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) addtimelineformediaperiodid.AudioAttributesCompatParcelizer) && this.IconCompatParcelizer == addtimelineformediaperiodid.IconCompatParcelizer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public final int hashCode() {
        String str = this.AudioAttributesCompatParcelizer;
        int iHashCode = str != null ? str.hashCode() : 0;
        boolean z = this.IconCompatParcelizer;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return (iHashCode * 31) + r1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GateKeeper(name=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", value=");
        sb.append(this.IconCompatParcelizer);
        sb.append(")");
        return sb.toString();
    }
}
