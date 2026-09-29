package com.marrow.data.models.plan;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\n"}, d2 = {"Lcom/marrow/data/models/plan/PlanMetaDataResponse;", "", "Lcom/marrow/data/models/plan/MediaRestrictions;", "p0", "<init>", "(Lcom/marrow/data/models/plan/MediaRestrictions;)V", "", "toString", "()Ljava/lang/String;", "component1", "()Lcom/marrow/data/models/plan/MediaRestrictions;", "copy", "(Lcom/marrow/data/models/plan/MediaRestrictions;)Lcom/marrow/data/models/plan/PlanMetaDataResponse;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "mediaRestrictions", "Lcom/marrow/data/models/plan/MediaRestrictions;", "getMediaRestrictions"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlanMetaDataResponse {
    private final MediaRestrictions mediaRestrictions;

    public PlanMetaDataResponse(@JsonProperty("media_restrictions") MediaRestrictions mediaRestrictions) {
        toMagicModuleMetaRepoModel.write(mediaRestrictions, "");
        this.mediaRestrictions = mediaRestrictions;
    }

    public final MediaRestrictions getMediaRestrictions() {
        return this.mediaRestrictions;
    }

    public final String toString() {
        String mainCopy;
        Copy countryRestrictionCopy = this.mediaRestrictions.getCountryRestrictionCopy();
        return (countryRestrictionCopy == null || (mainCopy = countryRestrictionCopy.getMainCopy()) == null) ? "NA" : mainCopy;
    }

    public static /* synthetic */ PlanMetaDataResponse copy$default(PlanMetaDataResponse planMetaDataResponse, MediaRestrictions mediaRestrictions, int i, Object obj) {
        if ((i & 1) != 0) {
            mediaRestrictions = planMetaDataResponse.mediaRestrictions;
        }
        return planMetaDataResponse.copy(mediaRestrictions);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MediaRestrictions getMediaRestrictions() {
        return this.mediaRestrictions;
    }

    public final PlanMetaDataResponse copy(@JsonProperty("media_restrictions") MediaRestrictions p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new PlanMetaDataResponse(p0);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof PlanMetaDataResponse) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.mediaRestrictions, ((PlanMetaDataResponse) p0).mediaRestrictions);
    }

    public final int hashCode() {
        return this.mediaRestrictions.hashCode();
    }
}
