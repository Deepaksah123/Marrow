package com.marrow.data.dataprovider.video.playbackconfig.remote.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\b"}, d2 = {"Lcom/marrow/data/dataprovider/video/playbackconfig/remote/models/FinalDataRsModel;", "", "Lcom/marrow/data/dataprovider/video/playbackconfig/remote/models/LicenseLevelRsModel;", "p0", "p1", "<init>", "(Lcom/marrow/data/dataprovider/video/playbackconfig/remote/models/LicenseLevelRsModel;Lcom/marrow/data/dataprovider/video/playbackconfig/remote/models/LicenseLevelRsModel;)V", "component1", "()Lcom/marrow/data/dataprovider/video/playbackconfig/remote/models/LicenseLevelRsModel;", "component2", "copy", "(Lcom/marrow/data/dataprovider/video/playbackconfig/remote/models/LicenseLevelRsModel;Lcom/marrow/data/dataprovider/video/playbackconfig/remote/models/LicenseLevelRsModel;)Lcom/marrow/data/dataprovider/video/playbackconfig/remote/models/FinalDataRsModel;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "offline", "Lcom/marrow/data/dataprovider/video/playbackconfig/remote/models/LicenseLevelRsModel;", "getOffline", "online", "getOnline"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FinalDataRsModel {
    private final LicenseLevelRsModel offline;
    private final LicenseLevelRsModel online;

    public FinalDataRsModel(@JsonProperty("2") LicenseLevelRsModel licenseLevelRsModel, @JsonProperty(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) LicenseLevelRsModel licenseLevelRsModel2) {
        toMagicModuleMetaRepoModel.write(licenseLevelRsModel, "");
        toMagicModuleMetaRepoModel.write(licenseLevelRsModel2, "");
        this.offline = licenseLevelRsModel;
        this.online = licenseLevelRsModel2;
    }

    public final LicenseLevelRsModel getOffline() {
        return this.offline;
    }

    public final LicenseLevelRsModel getOnline() {
        return this.online;
    }

    public static /* synthetic */ FinalDataRsModel copy$default(FinalDataRsModel finalDataRsModel, LicenseLevelRsModel licenseLevelRsModel, LicenseLevelRsModel licenseLevelRsModel2, int i, Object obj) {
        if ((i & 1) != 0) {
            licenseLevelRsModel = finalDataRsModel.offline;
        }
        if ((i & 2) != 0) {
            licenseLevelRsModel2 = finalDataRsModel.online;
        }
        return finalDataRsModel.copy(licenseLevelRsModel, licenseLevelRsModel2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final LicenseLevelRsModel getOffline() {
        return this.offline;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final LicenseLevelRsModel getOnline() {
        return this.online;
    }

    public final FinalDataRsModel copy(@JsonProperty("2") LicenseLevelRsModel p0, @JsonProperty(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE) LicenseLevelRsModel p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return new FinalDataRsModel(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof FinalDataRsModel)) {
            return false;
        }
        FinalDataRsModel finalDataRsModel = (FinalDataRsModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.offline, finalDataRsModel.offline) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.online, finalDataRsModel.online);
    }

    public final int hashCode() {
        return (this.offline.hashCode() * 31) + this.online.hashCode();
    }

    public final String toString() {
        LicenseLevelRsModel licenseLevelRsModel = this.offline;
        LicenseLevelRsModel licenseLevelRsModel2 = this.online;
        StringBuilder sb = new StringBuilder("FinalDataRsModel(offline=");
        sb.append(licenseLevelRsModel);
        sb.append(", online=");
        sb.append(licenseLevelRsModel2);
        sb.append(")");
        return sb.toString();
    }
}
