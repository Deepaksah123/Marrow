package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class buildPrimaryAndEmbeddedTrackGroupInfos {
    private final List<getClosedCaptionTrackFormats> RemoteActionCompatParcelizer;
    private final Enum read;

    public buildPrimaryAndEmbeddedTrackGroupInfos(Enum r2, List<getClosedCaptionTrackFormats> list) {
        toMagicModuleMetaRepoModel.write(r2, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.read = r2;
        this.RemoteActionCompatParcelizer = list;
    }

    public final List<getClosedCaptionTrackFormats> IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final Enum read$5e726e45() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof buildPrimaryAndEmbeddedTrackGroupInfos)) {
            return false;
        }
        buildPrimaryAndEmbeddedTrackGroupInfos buildprimaryandembeddedtrackgroupinfos = (buildPrimaryAndEmbeddedTrackGroupInfos) obj;
        return this.read == buildprimaryandembeddedtrackgroupinfos.read && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, buildprimaryandembeddedtrackgroupinfos.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return (this.read.hashCode() * 31) + this.RemoteActionCompatParcelizer.hashCode();
    }

    public final String toString() {
        Enum r0 = this.read;
        List<getClosedCaptionTrackFormats> list = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("LicenseLevelConfigRepoModel(level=");
        sb.append(r0);
        sb.append(", resolutionList=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
