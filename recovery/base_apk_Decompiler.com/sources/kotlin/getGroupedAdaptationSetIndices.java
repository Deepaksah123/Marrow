package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class getGroupedAdaptationSetIndices {
    private final List<buildPrimaryAndEmbeddedTrackGroupInfos> IconCompatParcelizer;
    private final cloneAndClear read;

    public getGroupedAdaptationSetIndices(cloneAndClear cloneandclear, List<buildPrimaryAndEmbeddedTrackGroupInfos> list) {
        toMagicModuleMetaRepoModel.write(cloneandclear, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.read = cloneandclear;
        this.IconCompatParcelizer = list;
    }

    public final List<buildPrimaryAndEmbeddedTrackGroupInfos> IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final cloneAndClear read() {
        return this.read;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getGroupedAdaptationSetIndices)) {
            return false;
        }
        getGroupedAdaptationSetIndices getgroupedadaptationsetindices = (getGroupedAdaptationSetIndices) obj;
        return this.read == getgroupedadaptationsetindices.read && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, getgroupedadaptationsetindices.IconCompatParcelizer);
    }

    public final int hashCode() {
        return (this.read.hashCode() * 31) + this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        cloneAndClear cloneandclear = this.read;
        List<buildPrimaryAndEmbeddedTrackGroupInfos> list = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("PlaybackModeRepoModel(playbackType=");
        sb.append(cloneandclear);
        sb.append(", levelList=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
