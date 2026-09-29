package com.marrow.data.api.models.response.firebase;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u000eJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u000eJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011Jd\u0010\u0016\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u000eR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001c\u0010!\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u000eR\u001c\u0010#\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0011R\u001c\u0010&\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010\u000eR\u001c\u0010(\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u001f\u001a\u0004\b)\u0010\u000eR\u001c\u0010*\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u001f\u001a\u0004\b+\u0010\u000eR\u001c\u0010,\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010$\u001a\u0004\b-\u0010\u0011"}, d2 = {"Lcom/marrow/data/api/models/response/firebase/WoqMarrowthonResponse;", "", "", "p0", "p1", "", "p2", "p3", "p4", "p5", "p6", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Boolean;", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lcom/marrow/data/api/models/response/firebase/WoqMarrowthonResponse;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "date", "Ljava/lang/String;", "getDate", "info", "getInfo", "live", "Ljava/lang/Boolean;", "getLive", "liveTitle", "getLiveTitle", "title", "getTitle", "url", "getUrl", "showBanner", "getShowBanner"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WoqMarrowthonResponse {
    private final String date;
    private final String info;
    private final Boolean live;
    private final String liveTitle;
    private final Boolean showBanner;
    private final String title;
    private final String url;

    public WoqMarrowthonResponse(@JsonProperty("date") String str, @JsonProperty("info") String str2, @JsonProperty("is_live") Boolean bool, @JsonProperty("live_title") String str3, @JsonProperty("title") String str4, @JsonProperty("url") String str5, @JsonProperty("show_banner") Boolean bool2) {
        this.date = str;
        this.info = str2;
        this.live = bool;
        this.liveTitle = str3;
        this.title = str4;
        this.url = str5;
        this.showBanner = bool2;
    }

    public final String getDate() {
        return this.date;
    }

    public final String getInfo() {
        return this.info;
    }

    public final Boolean getLive() {
        return this.live;
    }

    public final String getLiveTitle() {
        return this.liveTitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUrl() {
        return this.url;
    }

    public final Boolean getShowBanner() {
        return this.showBanner;
    }

    public static /* synthetic */ WoqMarrowthonResponse copy$default(WoqMarrowthonResponse woqMarrowthonResponse, String str, String str2, Boolean bool, String str3, String str4, String str5, Boolean bool2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = woqMarrowthonResponse.date;
        }
        if ((i & 2) != 0) {
            str2 = woqMarrowthonResponse.info;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            bool = woqMarrowthonResponse.live;
        }
        Boolean bool3 = bool;
        if ((i & 8) != 0) {
            str3 = woqMarrowthonResponse.liveTitle;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = woqMarrowthonResponse.title;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = woqMarrowthonResponse.url;
        }
        String str9 = str5;
        if ((i & 64) != 0) {
            bool2 = woqMarrowthonResponse.showBanner;
        }
        return woqMarrowthonResponse.copy(str, str6, bool3, str7, str8, str9, bool2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getInfo() {
        return this.info;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getLive() {
        return this.live;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLiveTitle() {
        return this.liveTitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getShowBanner() {
        return this.showBanner;
    }

    public final WoqMarrowthonResponse copy(@JsonProperty("date") String p0, @JsonProperty("info") String p1, @JsonProperty("is_live") Boolean p2, @JsonProperty("live_title") String p3, @JsonProperty("title") String p4, @JsonProperty("url") String p5, @JsonProperty("show_banner") Boolean p6) {
        return new WoqMarrowthonResponse(p0, p1, p2, p3, p4, p5, p6);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof WoqMarrowthonResponse)) {
            return false;
        }
        WoqMarrowthonResponse woqMarrowthonResponse = (WoqMarrowthonResponse) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.date, (Object) woqMarrowthonResponse.date) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.info, (Object) woqMarrowthonResponse.info) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.live, woqMarrowthonResponse.live) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.liveTitle, (Object) woqMarrowthonResponse.liveTitle) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.title, (Object) woqMarrowthonResponse.title) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.url, (Object) woqMarrowthonResponse.url) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.showBanner, woqMarrowthonResponse.showBanner);
    }

    public final int hashCode() {
        String str = this.date;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.info;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        Boolean bool = this.live;
        int iHashCode3 = bool == null ? 0 : bool.hashCode();
        String str3 = this.liveTitle;
        int iHashCode4 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.title;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.url;
        int iHashCode6 = str5 == null ? 0 : str5.hashCode();
        Boolean bool2 = this.showBanner;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.date;
        String str2 = this.info;
        Boolean bool = this.live;
        String str3 = this.liveTitle;
        String str4 = this.title;
        String str5 = this.url;
        Boolean bool2 = this.showBanner;
        StringBuilder sb = new StringBuilder("WoqMarrowthonResponse(date=");
        sb.append(str);
        sb.append(", info=");
        sb.append(str2);
        sb.append(", live=");
        sb.append(bool);
        sb.append(", liveTitle=");
        sb.append(str3);
        sb.append(", title=");
        sb.append(str4);
        sb.append(", url=");
        sb.append(str5);
        sb.append(", showBanner=");
        sb.append(bool2);
        sb.append(")");
        return sb.toString();
    }
}
