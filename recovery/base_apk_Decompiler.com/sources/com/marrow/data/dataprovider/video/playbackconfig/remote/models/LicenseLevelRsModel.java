package com.marrow.data.dataprovider.video.playbackconfig.remote.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.video.VideoPlaybackConfiguration;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\b"}, d2 = {"Lcom/marrow/data/dataprovider/video/playbackconfig/remote/models/LicenseLevelRsModel;", "", "Lcom/marrow/data/dataprovider/video/playbackconfig/remote/models/ResolutionConfigRsModel;", "p0", "p1", "<init>", "(Lcom/marrow/data/dataprovider/video/playbackconfig/remote/models/ResolutionConfigRsModel;Lcom/marrow/data/dataprovider/video/playbackconfig/remote/models/ResolutionConfigRsModel;)V", "component1", "()Lcom/marrow/data/dataprovider/video/playbackconfig/remote/models/ResolutionConfigRsModel;", "component2", "copy", "(Lcom/marrow/data/dataprovider/video/playbackconfig/remote/models/ResolutionConfigRsModel;Lcom/marrow/data/dataprovider/video/playbackconfig/remote/models/ResolutionConfigRsModel;)Lcom/marrow/data/dataprovider/video/playbackconfig/remote/models/LicenseLevelRsModel;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "l1", "Lcom/marrow/data/dataprovider/video/playbackconfig/remote/models/ResolutionConfigRsModel;", "getL1", "l3", "getL3"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LicenseLevelRsModel {
    private final ResolutionConfigRsModel l1;
    private final ResolutionConfigRsModel l3;

    public LicenseLevelRsModel(@JsonProperty("L1") ResolutionConfigRsModel resolutionConfigRsModel, @JsonProperty(VideoPlaybackConfiguration.WIDEVINE_LVL_L3) ResolutionConfigRsModel resolutionConfigRsModel2) {
        toMagicModuleMetaRepoModel.write(resolutionConfigRsModel, "");
        toMagicModuleMetaRepoModel.write(resolutionConfigRsModel2, "");
        this.l1 = resolutionConfigRsModel;
        this.l3 = resolutionConfigRsModel2;
    }

    public final ResolutionConfigRsModel getL1() {
        return this.l1;
    }

    public final ResolutionConfigRsModel getL3() {
        return this.l3;
    }

    public static /* synthetic */ LicenseLevelRsModel copy$default(LicenseLevelRsModel licenseLevelRsModel, ResolutionConfigRsModel resolutionConfigRsModel, ResolutionConfigRsModel resolutionConfigRsModel2, int i, Object obj) {
        if ((i & 1) != 0) {
            resolutionConfigRsModel = licenseLevelRsModel.l1;
        }
        if ((i & 2) != 0) {
            resolutionConfigRsModel2 = licenseLevelRsModel.l3;
        }
        return licenseLevelRsModel.copy(resolutionConfigRsModel, resolutionConfigRsModel2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ResolutionConfigRsModel getL1() {
        return this.l1;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ResolutionConfigRsModel getL3() {
        return this.l3;
    }

    public final LicenseLevelRsModel copy(@JsonProperty("L1") ResolutionConfigRsModel p0, @JsonProperty(VideoPlaybackConfiguration.WIDEVINE_LVL_L3) ResolutionConfigRsModel p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return new LicenseLevelRsModel(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof LicenseLevelRsModel)) {
            return false;
        }
        LicenseLevelRsModel licenseLevelRsModel = (LicenseLevelRsModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.l1, licenseLevelRsModel.l1) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.l3, licenseLevelRsModel.l3);
    }

    public final int hashCode() {
        return (this.l1.hashCode() * 31) + this.l3.hashCode();
    }

    public final String toString() {
        ResolutionConfigRsModel resolutionConfigRsModel = this.l1;
        ResolutionConfigRsModel resolutionConfigRsModel2 = this.l3;
        StringBuilder sb = new StringBuilder("LicenseLevelRsModel(l1=");
        sb.append(resolutionConfigRsModel);
        sb.append(", l3=");
        sb.append(resolutionConfigRsModel2);
        sb.append(")");
        return sb.toString();
    }
}
