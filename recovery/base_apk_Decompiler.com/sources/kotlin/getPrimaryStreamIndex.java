package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class getPrimaryStreamIndex {
    private final List<getGroupedAdaptationSetIndices> IconCompatParcelizer;

    public getPrimaryStreamIndex(List<getGroupedAdaptationSetIndices> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.IconCompatParcelizer = list;
    }

    public final List<getGroupedAdaptationSetIndices> AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof getPrimaryStreamIndex) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, ((getPrimaryStreamIndex) obj).IconCompatParcelizer);
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }

    public final String toString() {
        List<getGroupedAdaptationSetIndices> list = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("PlaybackConfigRootRepoModel(playbackConfigList=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
