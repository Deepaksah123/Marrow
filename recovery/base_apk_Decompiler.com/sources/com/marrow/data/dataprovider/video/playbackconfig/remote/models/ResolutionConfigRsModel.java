package com.marrow.data.dataprovider.video.playbackconfig.remote.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\tR\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\t"}, d2 = {"Lcom/marrow/data/dataprovider/video/playbackconfig/remote/models/ResolutionConfigRsModel;", "", "Lcom/marrow/data/dataprovider/video/playbackconfig/remote/models/PlaybackConfigRsModel;", "p0", "p1", "p2", "<init>", "(Lcom/marrow/data/dataprovider/video/playbackconfig/remote/models/PlaybackConfigRsModel;Lcom/marrow/data/dataprovider/video/playbackconfig/remote/models/PlaybackConfigRsModel;Lcom/marrow/data/dataprovider/video/playbackconfig/remote/models/PlaybackConfigRsModel;)V", "component1", "()Lcom/marrow/data/dataprovider/video/playbackconfig/remote/models/PlaybackConfigRsModel;", "component2", "component3", "copy", "(Lcom/marrow/data/dataprovider/video/playbackconfig/remote/models/PlaybackConfigRsModel;Lcom/marrow/data/dataprovider/video/playbackconfig/remote/models/PlaybackConfigRsModel;Lcom/marrow/data/dataprovider/video/playbackconfig/remote/models/PlaybackConfigRsModel;)Lcom/marrow/data/dataprovider/video/playbackconfig/remote/models/ResolutionConfigRsModel;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "hd", "Lcom/marrow/data/dataprovider/video/playbackconfig/remote/models/PlaybackConfigRsModel;", "getHd", "medium", "getMedium", "low", "getLow"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ResolutionConfigRsModel {
    private final PlaybackConfigRsModel hd;
    private final PlaybackConfigRsModel low;
    private final PlaybackConfigRsModel medium;

    public ResolutionConfigRsModel(@JsonProperty("hd") PlaybackConfigRsModel playbackConfigRsModel, @JsonProperty("medium") PlaybackConfigRsModel playbackConfigRsModel2, @JsonProperty("low") PlaybackConfigRsModel playbackConfigRsModel3) {
        toMagicModuleMetaRepoModel.write(playbackConfigRsModel, "");
        toMagicModuleMetaRepoModel.write(playbackConfigRsModel2, "");
        toMagicModuleMetaRepoModel.write(playbackConfigRsModel3, "");
        this.hd = playbackConfigRsModel;
        this.medium = playbackConfigRsModel2;
        this.low = playbackConfigRsModel3;
    }

    public final PlaybackConfigRsModel getHd() {
        return this.hd;
    }

    public final PlaybackConfigRsModel getMedium() {
        return this.medium;
    }

    public final PlaybackConfigRsModel getLow() {
        return this.low;
    }

    public static /* synthetic */ ResolutionConfigRsModel copy$default(ResolutionConfigRsModel resolutionConfigRsModel, PlaybackConfigRsModel playbackConfigRsModel, PlaybackConfigRsModel playbackConfigRsModel2, PlaybackConfigRsModel playbackConfigRsModel3, int i, Object obj) {
        if ((i & 1) != 0) {
            playbackConfigRsModel = resolutionConfigRsModel.hd;
        }
        if ((i & 2) != 0) {
            playbackConfigRsModel2 = resolutionConfigRsModel.medium;
        }
        if ((i & 4) != 0) {
            playbackConfigRsModel3 = resolutionConfigRsModel.low;
        }
        return resolutionConfigRsModel.copy(playbackConfigRsModel, playbackConfigRsModel2, playbackConfigRsModel3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PlaybackConfigRsModel getHd() {
        return this.hd;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PlaybackConfigRsModel getMedium() {
        return this.medium;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PlaybackConfigRsModel getLow() {
        return this.low;
    }

    public final ResolutionConfigRsModel copy(@JsonProperty("hd") PlaybackConfigRsModel p0, @JsonProperty("medium") PlaybackConfigRsModel p1, @JsonProperty("low") PlaybackConfigRsModel p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        return new ResolutionConfigRsModel(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ResolutionConfigRsModel)) {
            return false;
        }
        ResolutionConfigRsModel resolutionConfigRsModel = (ResolutionConfigRsModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.hd, resolutionConfigRsModel.hd) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.medium, resolutionConfigRsModel.medium) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.low, resolutionConfigRsModel.low);
    }

    public final int hashCode() {
        return (((this.hd.hashCode() * 31) + this.medium.hashCode()) * 31) + this.low.hashCode();
    }

    public final String toString() {
        PlaybackConfigRsModel playbackConfigRsModel = this.hd;
        PlaybackConfigRsModel playbackConfigRsModel2 = this.medium;
        PlaybackConfigRsModel playbackConfigRsModel3 = this.low;
        StringBuilder sb = new StringBuilder("ResolutionConfigRsModel(hd=");
        sb.append(playbackConfigRsModel);
        sb.append(", medium=");
        sb.append(playbackConfigRsModel2);
        sb.append(", low=");
        sb.append(playbackConfigRsModel3);
        sb.append(")");
        return sb.toString();
    }
}
