package com.marrow.data.models.video;

import java.util.List;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ0\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\nR \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\n"}, d2 = {"Lcom/marrow/data/models/video/DownloadOptionsUIModel;", "", "", "Lcom/marrow/data/models/video/DownloadableResolution;", "p0", "", "p1", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", "copy", "(Ljava/util/List;Ljava/util/List;)Lcom/marrow/data/models/video/DownloadOptionsUIModel;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "availableResolutions", "Ljava/util/List;", "getAvailableResolutions", "availableThemes", "getAvailableThemes"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DownloadOptionsUIModel {
    private final List<DownloadableResolution> availableResolutions;
    private final List<String> availableThemes;

    public DownloadOptionsUIModel(List<DownloadableResolution> list, List<String> list2) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        this.availableResolutions = list;
        this.availableThemes = list2;
    }

    public final List<DownloadableResolution> getAvailableResolutions() {
        return this.availableResolutions;
    }

    public final List<String> getAvailableThemes() {
        return this.availableThemes;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DownloadOptionsUIModel copy$default(DownloadOptionsUIModel downloadOptionsUIModel, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = downloadOptionsUIModel.availableResolutions;
        }
        if ((i & 2) != 0) {
            list2 = downloadOptionsUIModel.availableThemes;
        }
        return downloadOptionsUIModel.copy(list, list2);
    }

    public final List<DownloadableResolution> component1() {
        return this.availableResolutions;
    }

    public final List<String> component2() {
        return this.availableThemes;
    }

    public final DownloadOptionsUIModel copy(List<DownloadableResolution> p0, List<String> p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return new DownloadOptionsUIModel(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof DownloadOptionsUIModel)) {
            return false;
        }
        DownloadOptionsUIModel downloadOptionsUIModel = (DownloadOptionsUIModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.availableResolutions, downloadOptionsUIModel.availableResolutions) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.availableThemes, downloadOptionsUIModel.availableThemes);
    }

    public final int hashCode() {
        return (this.availableResolutions.hashCode() * 31) + this.availableThemes.hashCode();
    }

    public final String toString() {
        List<DownloadableResolution> list = this.availableResolutions;
        List<String> list2 = this.availableThemes;
        StringBuilder sb = new StringBuilder("DownloadOptionsUIModel(availableResolutions=");
        sb.append(list);
        sb.append(", availableThemes=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }
}
