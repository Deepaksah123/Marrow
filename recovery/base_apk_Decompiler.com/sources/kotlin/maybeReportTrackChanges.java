package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class maybeReportTrackChanges {
    public final String IconCompatParcelizer;
    public final String read;

    public maybeReportTrackChanges(String str, String str2) {
        this.read = str;
        this.IconCompatParcelizer = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof maybeReportTrackChanges)) {
            return false;
        }
        maybeReportTrackChanges maybereporttrackchanges = (maybeReportTrackChanges) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) maybereporttrackchanges.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) maybereporttrackchanges.IconCompatParcelizer);
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode() + (this.read.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InputDeviceData(name=");
        sb.append(this.read);
        sb.append(", vendor=");
        sb.append(this.IconCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
