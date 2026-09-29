package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class resolveReportedUri {
    private final Integer IconCompatParcelizer;
    private final Integer write;

    public resolveReportedUri(Integer num, Integer num2) {
        this.IconCompatParcelizer = num;
        this.write = num2;
    }

    public final Integer RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final Integer read() {
        return this.write;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof resolveReportedUri)) {
            return false;
        }
        resolveReportedUri resolvereporteduri = (resolveReportedUri) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, resolvereporteduri.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, resolvereporteduri.write);
    }

    public final int hashCode() {
        Integer num = this.IconCompatParcelizer;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.write;
        return (iHashCode * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.IconCompatParcelizer;
        Integer num2 = this.write;
        StringBuilder sb = new StringBuilder("InAppRatingThresholdRepoModel(qbankThreshold=");
        sb.append(num);
        sb.append(", videoThreshold=");
        sb.append(num2);
        sb.append(")");
        return sb.toString();
    }
}
