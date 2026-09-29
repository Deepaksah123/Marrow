package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public final class setDurationText {
    private final VideoSubModel RemoteActionCompatParcelizer;
    private final boolean read;

    public /* synthetic */ setDurationText(VideoSubModel videoSubModel) {
        this(videoSubModel, false);
    }

    public setDurationText(VideoSubModel videoSubModel, boolean z) {
        toMagicModuleMetaRepoModel.write(videoSubModel, "");
        this.RemoteActionCompatParcelizer = videoSubModel;
        this.read = z;
    }

    public final VideoSubModel AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean write() {
        return this.read;
    }

    public static /* synthetic */ setDurationText AudioAttributesCompatParcelizer(setDurationText setdurationtext, VideoSubModel videoSubModel, boolean z, int i) {
        if ((i & 1) != 0) {
            videoSubModel = setdurationtext.RemoteActionCompatParcelizer;
        }
        if ((i & 2) != 0) {
            z = setdurationtext.read;
        }
        return read(videoSubModel, z);
    }

    private static setDurationText read(VideoSubModel videoSubModel, boolean z) {
        toMagicModuleMetaRepoModel.write(videoSubModel, "");
        return new setDurationText(videoSubModel, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setDurationText)) {
            return false;
        }
        setDurationText setdurationtext = (setDurationText) obj;
        return this.RemoteActionCompatParcelizer == setdurationtext.RemoteActionCompatParcelizer && this.read == setdurationtext.read;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        boolean z = this.read;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        return (iHashCode * 31) + r1;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NullabilityQualifierWithMigrationStatus(qualifier=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", isForWarningOnly=");
        sb.append(this.read);
        sb.append(')');
        return sb.toString();
    }
}
