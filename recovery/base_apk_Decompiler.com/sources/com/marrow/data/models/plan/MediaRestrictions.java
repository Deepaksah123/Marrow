package com.marrow.data.models.plan;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ@\u0010\u0010\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u000bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001f\u0010\u000bR\u001c\u0010 \u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\r"}, d2 = {"Lcom/marrow/data/models/plan/MediaRestrictions;", "", "", "p0", "Lcom/marrow/data/models/plan/Copy;", "p1", "p2", "p3", "<init>", "(Ljava/lang/Boolean;Lcom/marrow/data/models/plan/Copy;Ljava/lang/Boolean;Lcom/marrow/data/models/plan/Copy;)V", "component1", "()Ljava/lang/Boolean;", "component2", "()Lcom/marrow/data/models/plan/Copy;", "component3", "component4", "copy", "(Ljava/lang/Boolean;Lcom/marrow/data/models/plan/Copy;Ljava/lang/Boolean;Lcom/marrow/data/models/plan/Copy;)Lcom/marrow/data/models/plan/MediaRestrictions;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "isCountryRestrictedForVideo", "Ljava/lang/Boolean;", "countryRestrictionCopy", "Lcom/marrow/data/models/plan/Copy;", "getCountryRestrictionCopy", "isVpnUsageDetected", "vpnUsageCopy", "getVpnUsageCopy"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MediaRestrictions {
    private final Copy countryRestrictionCopy;
    private final Boolean isCountryRestrictedForVideo;
    private final Boolean isVpnUsageDetected;
    private final Copy vpnUsageCopy;

    public MediaRestrictions(@JsonProperty("is_country_restricted_for_video") Boolean bool, @JsonProperty("country_restriction_copy") Copy copy, @JsonProperty("is_vpn_restricted_for_video") Boolean bool2, @JsonProperty("vpn_restriction_copy") Copy copy2) {
        this.isCountryRestrictedForVideo = bool;
        this.countryRestrictionCopy = copy;
        this.isVpnUsageDetected = bool2;
        this.vpnUsageCopy = copy2;
    }

    public /* synthetic */ MediaRestrictions(Boolean bool, Copy copy, Boolean bool2, Copy copy2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : bool, (i & 2) != 0 ? null : copy, (i & 4) != 0 ? null : bool2, (i & 8) != 0 ? null : copy2);
    }

    public final Boolean isCountryRestrictedForVideo() {
        return this.isCountryRestrictedForVideo;
    }

    public final Copy getCountryRestrictionCopy() {
        return this.countryRestrictionCopy;
    }

    public final Boolean isVpnUsageDetected() {
        return this.isVpnUsageDetected;
    }

    public final Copy getVpnUsageCopy() {
        return this.vpnUsageCopy;
    }

    public MediaRestrictions() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ MediaRestrictions copy$default(MediaRestrictions mediaRestrictions, Boolean bool, Copy copy, Boolean bool2, Copy copy2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = mediaRestrictions.isCountryRestrictedForVideo;
        }
        if ((i & 2) != 0) {
            copy = mediaRestrictions.countryRestrictionCopy;
        }
        if ((i & 4) != 0) {
            bool2 = mediaRestrictions.isVpnUsageDetected;
        }
        if ((i & 8) != 0) {
            copy2 = mediaRestrictions.vpnUsageCopy;
        }
        return mediaRestrictions.copy(bool, copy, bool2, copy2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getIsCountryRestrictedForVideo() {
        return this.isCountryRestrictedForVideo;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Copy getCountryRestrictionCopy() {
        return this.countryRestrictionCopy;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getIsVpnUsageDetected() {
        return this.isVpnUsageDetected;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Copy getVpnUsageCopy() {
        return this.vpnUsageCopy;
    }

    public final MediaRestrictions copy(@JsonProperty("is_country_restricted_for_video") Boolean p0, @JsonProperty("country_restriction_copy") Copy p1, @JsonProperty("is_vpn_restricted_for_video") Boolean p2, @JsonProperty("vpn_restriction_copy") Copy p3) {
        return new MediaRestrictions(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof MediaRestrictions)) {
            return false;
        }
        MediaRestrictions mediaRestrictions = (MediaRestrictions) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.isCountryRestrictedForVideo, mediaRestrictions.isCountryRestrictedForVideo) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.countryRestrictionCopy, mediaRestrictions.countryRestrictionCopy) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.isVpnUsageDetected, mediaRestrictions.isVpnUsageDetected) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.vpnUsageCopy, mediaRestrictions.vpnUsageCopy);
    }

    public final int hashCode() {
        Boolean bool = this.isCountryRestrictedForVideo;
        int iHashCode = bool == null ? 0 : bool.hashCode();
        Copy copy = this.countryRestrictionCopy;
        int iHashCode2 = copy == null ? 0 : copy.hashCode();
        Boolean bool2 = this.isVpnUsageDetected;
        int iHashCode3 = bool2 == null ? 0 : bool2.hashCode();
        Copy copy2 = this.vpnUsageCopy;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (copy2 != null ? copy2.hashCode() : 0);
    }

    public final String toString() {
        Boolean bool = this.isCountryRestrictedForVideo;
        Copy copy = this.countryRestrictionCopy;
        Boolean bool2 = this.isVpnUsageDetected;
        Copy copy2 = this.vpnUsageCopy;
        StringBuilder sb = new StringBuilder("MediaRestrictions(isCountryRestrictedForVideo=");
        sb.append(bool);
        sb.append(", countryRestrictionCopy=");
        sb.append(copy);
        sb.append(", isVpnUsageDetected=");
        sb.append(bool2);
        sb.append(", vpnUsageCopy=");
        sb.append(copy2);
        sb.append(")");
        return sb.toString();
    }
}
