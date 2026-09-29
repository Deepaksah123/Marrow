package com.marrow.data.models.search;

import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0011Jn\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\r\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0011J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010\u0015R\"\u0010#\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0011\"\u0004\b&\u0010'R\"\u0010(\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0013\"\u0004\b+\u0010,R\u001a\u0010-\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0015R\u001a\u00100\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010.\u001a\u0004\b1\u0010\u0015R\u001a\u00102\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010.\u001a\u0004\b3\u0010\u0015R\u001a\u00104\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010.\u001a\u0004\b5\u0010\u0015R\u001c\u00106\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010.\u001a\u0004\b7\u0010\u0015R\u001c\u00108\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010.\u001a\u0004\b9\u0010\u0015R\u001a\u0010:\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010$\u001a\u0004\b;\u0010\u0011"}, d2 = {"Lcom/marrow/data/models/search/RecentSearch;", "", "", "p0", "", "p1", "", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "<init>", "(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "component1", "()I", "component2", "()J", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(IJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lcom/marrow/data/models/search/RecentSearch;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "searchTimes", "I", "getSearchTimes", "setSearchTimes", "(I)V", "lastUpdated", "J", "getLastUpdated", "setLastUpdated", "(J)V", "id", "Ljava/lang/String;", "getId", "videoLessonId", "getVideoLessonId", "itemType", "getItemType", "itemTitle", "getItemTitle", "itemSubTitle", "getItemSubTitle", "bulletDescText", "getBulletDescText", "videoStartTime", "getVideoStartTime"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RecentSearch {
    private final String bulletDescText;
    private final String id;
    private final String itemSubTitle;
    private final String itemTitle;
    private final String itemType;
    private long lastUpdated;
    private int searchTimes;
    private final String videoLessonId;
    private final int videoStartTime;

    public RecentSearch(int i, long j, String str, String str2, String str3, String str4, String str5, String str6, int i2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        this.searchTimes = i;
        this.lastUpdated = j;
        this.id = str;
        this.videoLessonId = str2;
        this.itemType = str3;
        this.itemTitle = str4;
        this.itemSubTitle = str5;
        this.bulletDescText = str6;
        this.videoStartTime = i2;
    }

    public /* synthetic */ RecentSearch(int i, long j, String str, String str2, String str3, String str4, String str5, String str6, int i2, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0L : j, str, str2, str3, str4, str5, str6, i2);
    }

    public final int getSearchTimes() {
        return this.searchTimes;
    }

    public final void setSearchTimes(int i) {
        this.searchTimes = i;
    }

    public final long getLastUpdated() {
        return this.lastUpdated;
    }

    public final void setLastUpdated(long j) {
        this.lastUpdated = j;
    }

    public final String getId() {
        return this.id;
    }

    public final String getVideoLessonId() {
        return this.videoLessonId;
    }

    public final String getItemType() {
        return this.itemType;
    }

    public final String getItemTitle() {
        return this.itemTitle;
    }

    public final String getItemSubTitle() {
        return this.itemSubTitle;
    }

    public final String getBulletDescText() {
        return this.bulletDescText;
    }

    public final int getVideoStartTime() {
        return this.videoStartTime;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSearchTimes() {
        return this.searchTimes;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getLastUpdated() {
        return this.lastUpdated;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getVideoLessonId() {
        return this.videoLessonId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getItemType() {
        return this.itemType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getItemTitle() {
        return this.itemTitle;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getItemSubTitle() {
        return this.itemSubTitle;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getBulletDescText() {
        return this.bulletDescText;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getVideoStartTime() {
        return this.videoStartTime;
    }

    public final RecentSearch copy(int p0, long p1, String p2, String p3, String p4, String p5, String p6, String p7, int p8) {
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        toMagicModuleMetaRepoModel.write(p4, "");
        toMagicModuleMetaRepoModel.write(p5, "");
        return new RecentSearch(p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof RecentSearch)) {
            return false;
        }
        RecentSearch recentSearch = (RecentSearch) p0;
        return this.searchTimes == recentSearch.searchTimes && this.lastUpdated == recentSearch.lastUpdated && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) recentSearch.id) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.videoLessonId, (Object) recentSearch.videoLessonId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.itemType, (Object) recentSearch.itemType) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.itemTitle, (Object) recentSearch.itemTitle) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.itemSubTitle, (Object) recentSearch.itemSubTitle) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.bulletDescText, (Object) recentSearch.bulletDescText) && this.videoStartTime == recentSearch.videoStartTime;
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.searchTimes);
        int iHashCode2 = Long.hashCode(this.lastUpdated);
        int iHashCode3 = this.id.hashCode();
        int iHashCode4 = this.videoLessonId.hashCode();
        int iHashCode5 = this.itemType.hashCode();
        int iHashCode6 = this.itemTitle.hashCode();
        String str = this.itemSubTitle;
        int iHashCode7 = str == null ? 0 : str.hashCode();
        String str2 = this.bulletDescText;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.videoStartTime);
    }

    public final String toString() {
        int i = this.searchTimes;
        long j = this.lastUpdated;
        String str = this.id;
        String str2 = this.videoLessonId;
        String str3 = this.itemType;
        String str4 = this.itemTitle;
        String str5 = this.itemSubTitle;
        String str6 = this.bulletDescText;
        int i2 = this.videoStartTime;
        StringBuilder sb = new StringBuilder("RecentSearch(searchTimes=");
        sb.append(i);
        sb.append(", lastUpdated=");
        sb.append(j);
        sb.append(", id=");
        sb.append(str);
        sb.append(", videoLessonId=");
        sb.append(str2);
        sb.append(", itemType=");
        sb.append(str3);
        sb.append(", itemTitle=");
        sb.append(str4);
        sb.append(", itemSubTitle=");
        sb.append(str5);
        sb.append(", bulletDescText=");
        sb.append(str6);
        sb.append(", videoStartTime=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }
}
