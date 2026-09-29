package com.marrow.data.api.models.response.firebase;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ@\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\nR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\n"}, d2 = {"Lcom/marrow/data/api/models/response/firebase/BuynowBannerResponse;", "", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/marrow/data/api/models/response/firebase/BuynowBannerResponse;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "marquee_text", "Ljava/lang/String;", "getMarquee_text", "offer_text", "getOffer_text", "title", "getTitle", "planGroupId", "getPlanGroupId"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BuynowBannerResponse {
    private final String marquee_text;
    private final String offer_text;
    private final String planGroupId;
    private final String title;

    public BuynowBannerResponse(@JsonProperty("marquee_text") String str, @JsonProperty("offer_text") String str2, @JsonProperty("title") String str3, @JsonProperty("plan_group_id") String str4) {
        this.marquee_text = str;
        this.offer_text = str2;
        this.title = str3;
        this.planGroupId = str4;
    }

    public final String getMarquee_text() {
        return this.marquee_text;
    }

    public final String getOffer_text() {
        return this.offer_text;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getPlanGroupId() {
        return this.planGroupId;
    }

    public static /* synthetic */ BuynowBannerResponse copy$default(BuynowBannerResponse buynowBannerResponse, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = buynowBannerResponse.marquee_text;
        }
        if ((i & 2) != 0) {
            str2 = buynowBannerResponse.offer_text;
        }
        if ((i & 4) != 0) {
            str3 = buynowBannerResponse.title;
        }
        if ((i & 8) != 0) {
            str4 = buynowBannerResponse.planGroupId;
        }
        return buynowBannerResponse.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMarquee_text() {
        return this.marquee_text;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOffer_text() {
        return this.offer_text;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPlanGroupId() {
        return this.planGroupId;
    }

    public final BuynowBannerResponse copy(@JsonProperty("marquee_text") String p0, @JsonProperty("offer_text") String p1, @JsonProperty("title") String p2, @JsonProperty("plan_group_id") String p3) {
        return new BuynowBannerResponse(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof BuynowBannerResponse)) {
            return false;
        }
        BuynowBannerResponse buynowBannerResponse = (BuynowBannerResponse) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.marquee_text, (Object) buynowBannerResponse.marquee_text) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.offer_text, (Object) buynowBannerResponse.offer_text) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.title, (Object) buynowBannerResponse.title) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.planGroupId, (Object) buynowBannerResponse.planGroupId);
    }

    public final int hashCode() {
        String str = this.marquee_text;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.offer_text;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.title;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.planGroupId;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        String str = this.marquee_text;
        String str2 = this.offer_text;
        String str3 = this.title;
        String str4 = this.planGroupId;
        StringBuilder sb = new StringBuilder("BuynowBannerResponse(marquee_text=");
        sb.append(str);
        sb.append(", offer_text=");
        sb.append(str2);
        sb.append(", title=");
        sb.append(str3);
        sb.append(", planGroupId=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }
}
