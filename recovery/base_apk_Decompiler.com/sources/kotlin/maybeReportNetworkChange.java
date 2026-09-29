package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class maybeReportNetworkChange {
    private final String IconCompatParcelizer;
    private final String write;

    public maybeReportNetworkChange(String str, String str2) {
        this.IconCompatParcelizer = str;
        this.write = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof maybeReportNetworkChange)) {
            return false;
        }
        maybeReportNetworkChange maybereportnetworkchange = (maybeReportNetworkChange) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) maybereportnetworkchange.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) maybereportnetworkchange.write);
    }

    public final int hashCode() {
        return this.write.hashCode() + (this.IconCompatParcelizer.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Timestamp(global=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", subscription=");
        sb.append(this.write);
        sb.append(')');
        return sb.toString();
    }
}
