package com.marrow2.data.recentUpdates.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import java.util.List;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b$\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005\u0012\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\b\b\u0003\u0010\n\u001a\u00020\t\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0003\u0010\u000e\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0010\b\u0003\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0016J\u0012\u0010!\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b#\u0010\u0019J\u0092\u0001\u0010$\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00052\u0010\b\u0003\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\b\b\u0003\u0010\n\u001a\u00020\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0003\u0010\u000e\u001a\u00020\u00022\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0010\b\u0003\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010'\u001a\u00020&2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u0016R\u001a\u0010,\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0016R\u001a\u0010/\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010-\u001a\u0004\b0\u0010\u0016R*\u00101\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u0010\u0019\"\u0004\b4\u00105R*\u00106\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b6\u00102\u001a\u0004\b7\u0010\u0019\"\u0004\b8\u00105R\u001a\u00109\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010\u001cR\u001c\u0010<\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010-\u001a\u0004\b=\u0010\u0016R\u001c\u0010>\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010\u001fR\u001a\u0010A\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010-\u001a\u0004\bB\u0010\u0016R$\u0010C\u001a\u0004\u0018\u00010\u000f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010\"\"\u0004\bF\u0010GR*\u0010H\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bH\u00102\u001a\u0004\bI\u0010\u0019\"\u0004\bJ\u00105"}, d2 = {"Lcom/marrow2/data/recentUpdates/remote/model/RecentUpdatesResponse;", "", "", "p0", "p1", "", "p2", "", "p3", "", "p4", "p5", "Lcom/marrow2/data/recentUpdates/remote/model/RecentUpdateSubjectDetailsResponse;", "p6", "p7", "Lcom/marrow2/data/recentUpdates/remote/model/RecentUpdatesImageResponse;", "p8", "Lcom/marrow2/data/recentUpdates/remote/model/RecentUpdatesReferencesResponse;", "p9", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JLjava/lang/String;Lcom/marrow2/data/recentUpdates/remote/model/RecentUpdateSubjectDetailsResponse;Ljava/lang/String;Lcom/marrow2/data/recentUpdates/remote/model/RecentUpdatesImageResponse;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "component4", "component5", "()J", "component6", "component7", "()Lcom/marrow2/data/recentUpdates/remote/model/RecentUpdateSubjectDetailsResponse;", "component8", "component9", "()Lcom/marrow2/data/recentUpdates/remote/model/RecentUpdatesImageResponse;", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JLjava/lang/String;Lcom/marrow2/data/recentUpdates/remote/model/RecentUpdateSubjectDetailsResponse;Ljava/lang/String;Lcom/marrow2/data/recentUpdates/remote/model/RecentUpdatesImageResponse;Ljava/util/List;)Lcom/marrow2/data/recentUpdates/remote/model/RecentUpdatesResponse;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "id", "Ljava/lang/String;", "getId", "description", "getDescription", "mcqList", "Ljava/util/List;", "getMcqList", "setMcqList", "(Ljava/util/List;)V", "pearlList", "getPearlList", "setPearlList", "publishedOnMs", "J", "getPublishedOnMs", "referenceLink", "getReferenceLink", "subjectDetails", "Lcom/marrow2/data/recentUpdates/remote/model/RecentUpdateSubjectDetailsResponse;", "getSubjectDetails", "title", "getTitle", "image", "Lcom/marrow2/data/recentUpdates/remote/model/RecentUpdatesImageResponse;", "getImage", "setImage", "(Lcom/marrow2/data/recentUpdates/remote/model/RecentUpdatesImageResponse;)V", "tagsList", "getTagsList", "setTagsList"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RecentUpdatesResponse {
    public static final int $stable = 8;
    private final String description;
    private final String id;
    private RecentUpdatesImageResponse image;
    private List<String> mcqList;
    private List<Integer> pearlList;
    private final long publishedOnMs;
    private final String referenceLink;
    private final RecentUpdateSubjectDetailsResponse subjectDetails;
    private List<RecentUpdatesReferencesResponse> tagsList;
    private final String title;

    public RecentUpdatesResponse(@JsonProperty("_id") String str, @JsonProperty("desc_html") String str2, @JsonProperty("mcq_display_ids") List<String> list, @JsonProperty("pearl_nos") List<Integer> list2, @JsonProperty("publish_date") long j, @JsonProperty("reference_link") String str3, @JsonProperty("subject_details") RecentUpdateSubjectDetailsResponse recentUpdateSubjectDetailsResponse, @JsonProperty("title") String str4, @JsonProperty("image") RecentUpdatesImageResponse recentUpdatesImageResponse, @JsonProperty("references") List<RecentUpdatesReferencesResponse> list3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        this.id = str;
        this.description = str2;
        this.mcqList = list;
        this.pearlList = list2;
        this.publishedOnMs = j;
        this.referenceLink = str3;
        this.subjectDetails = recentUpdateSubjectDetailsResponse;
        this.title = str4;
        this.image = recentUpdatesImageResponse;
        this.tagsList = list3;
    }

    public /* synthetic */ RecentUpdatesResponse(String str, String str2, List list, List list2, long j, String str3, RecentUpdateSubjectDetailsResponse recentUpdateSubjectDetailsResponse, String str4, RecentUpdatesImageResponse recentUpdatesImageResponse, List list3, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? 0L : j, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : recentUpdateSubjectDetailsResponse, (i & 128) != 0 ? "" : str4, (i & 256) != 0 ? null : recentUpdatesImageResponse, (i & 512) != 0 ? null : list3);
    }

    public final String getId() {
        return this.id;
    }

    public final String getDescription() {
        return this.description;
    }

    public final List<String> getMcqList() {
        return this.mcqList;
    }

    public final void setMcqList(List<String> list) {
        this.mcqList = list;
    }

    public final List<Integer> getPearlList() {
        return this.pearlList;
    }

    public final void setPearlList(List<Integer> list) {
        this.pearlList = list;
    }

    public final long getPublishedOnMs() {
        return this.publishedOnMs;
    }

    public final String getReferenceLink() {
        return this.referenceLink;
    }

    public final RecentUpdateSubjectDetailsResponse getSubjectDetails() {
        return this.subjectDetails;
    }

    public final String getTitle() {
        return this.title;
    }

    public final RecentUpdatesImageResponse getImage() {
        return this.image;
    }

    public final void setImage(RecentUpdatesImageResponse recentUpdatesImageResponse) {
        this.image = recentUpdatesImageResponse;
    }

    public final List<RecentUpdatesReferencesResponse> getTagsList() {
        return this.tagsList;
    }

    public final void setTagsList(List<RecentUpdatesReferencesResponse> list) {
        this.tagsList = list;
    }

    public RecentUpdatesResponse() {
        this(null, null, null, null, 0L, null, null, null, null, null, AnalyticsListener.EVENT_DRM_KEYS_LOADED, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<RecentUpdatesReferencesResponse> component10() {
        return this.tagsList;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final List<String> component3() {
        return this.mcqList;
    }

    public final List<Integer> component4() {
        return this.pearlList;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getPublishedOnMs() {
        return this.publishedOnMs;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getReferenceLink() {
        return this.referenceLink;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final RecentUpdateSubjectDetailsResponse getSubjectDetails() {
        return this.subjectDetails;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final RecentUpdatesImageResponse getImage() {
        return this.image;
    }

    public final RecentUpdatesResponse copy(@JsonProperty("_id") String p0, @JsonProperty("desc_html") String p1, @JsonProperty("mcq_display_ids") List<String> p2, @JsonProperty("pearl_nos") List<Integer> p3, @JsonProperty("publish_date") long p4, @JsonProperty("reference_link") String p5, @JsonProperty("subject_details") RecentUpdateSubjectDetailsResponse p6, @JsonProperty("title") String p7, @JsonProperty("image") RecentUpdatesImageResponse p8, @JsonProperty("references") List<RecentUpdatesReferencesResponse> p9) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p7, "");
        return new RecentUpdatesResponse(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof RecentUpdatesResponse)) {
            return false;
        }
        RecentUpdatesResponse recentUpdatesResponse = (RecentUpdatesResponse) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) recentUpdatesResponse.id) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.description, (Object) recentUpdatesResponse.description) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.mcqList, recentUpdatesResponse.mcqList) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.pearlList, recentUpdatesResponse.pearlList) && this.publishedOnMs == recentUpdatesResponse.publishedOnMs && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.referenceLink, (Object) recentUpdatesResponse.referenceLink) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.subjectDetails, recentUpdatesResponse.subjectDetails) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.title, (Object) recentUpdatesResponse.title) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.image, recentUpdatesResponse.image) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.tagsList, recentUpdatesResponse.tagsList);
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode();
        int iHashCode2 = this.description.hashCode();
        List<String> list = this.mcqList;
        int iHashCode3 = list == null ? 0 : list.hashCode();
        List<Integer> list2 = this.pearlList;
        int iHashCode4 = list2 == null ? 0 : list2.hashCode();
        int iHashCode5 = Long.hashCode(this.publishedOnMs);
        String str = this.referenceLink;
        int iHashCode6 = str == null ? 0 : str.hashCode();
        RecentUpdateSubjectDetailsResponse recentUpdateSubjectDetailsResponse = this.subjectDetails;
        int iHashCode7 = recentUpdateSubjectDetailsResponse == null ? 0 : recentUpdateSubjectDetailsResponse.hashCode();
        int iHashCode8 = this.title.hashCode();
        RecentUpdatesImageResponse recentUpdatesImageResponse = this.image;
        int iHashCode9 = recentUpdatesImageResponse == null ? 0 : recentUpdatesImageResponse.hashCode();
        List<RecentUpdatesReferencesResponse> list3 = this.tagsList;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (list3 != null ? list3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.description;
        List<String> list = this.mcqList;
        List<Integer> list2 = this.pearlList;
        long j = this.publishedOnMs;
        String str3 = this.referenceLink;
        RecentUpdateSubjectDetailsResponse recentUpdateSubjectDetailsResponse = this.subjectDetails;
        String str4 = this.title;
        RecentUpdatesImageResponse recentUpdatesImageResponse = this.image;
        List<RecentUpdatesReferencesResponse> list3 = this.tagsList;
        StringBuilder sb = new StringBuilder("RecentUpdatesResponse(id=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        sb.append(", mcqList=");
        sb.append(list);
        sb.append(", pearlList=");
        sb.append(list2);
        sb.append(", publishedOnMs=");
        sb.append(j);
        sb.append(", referenceLink=");
        sb.append(str3);
        sb.append(", subjectDetails=");
        sb.append(recentUpdateSubjectDetailsResponse);
        sb.append(", title=");
        sb.append(str4);
        sb.append(", image=");
        sb.append(recentUpdatesImageResponse);
        sb.append(", tagsList=");
        sb.append(list3);
        sb.append(")");
        return sb.toString();
    }
}
