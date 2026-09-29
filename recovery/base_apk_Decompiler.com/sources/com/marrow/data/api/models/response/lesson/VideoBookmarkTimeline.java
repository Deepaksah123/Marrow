package com.marrow.data.api.models.response.lesson;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b=\b\u0087\b\u0018\u0000 K2\u00020\u0001:\u0001KB\u0091\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0003\u0010\r\u001a\u00020\f\u0012\u0010\b\u0003\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e\u0012\b\b\u0003\u0010\u0010\u001a\u00020\f\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u0012\u001a\u00020\b¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\b¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\b¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0016J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0019J\u0010\u0010 \u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b&\u0010#J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u0019J\u0010\u0010(\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b(\u0010\u0016J\u009a\u0001\u0010)\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\t\u001a\u00020\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u000b\u001a\u00020\u00052\b\b\u0003\u0010\r\u001a\u00020\f2\u0010\b\u0003\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e2\b\b\u0003\u0010\u0010\u001a\u00020\f2\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u0012\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010+\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b-\u0010!J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010\u0019R\u001a\u0010/\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u0019R\u001c\u00102\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u00100\u001a\u0004\b3\u0010\u0019R\u001c\u00104\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010\u001cR\u001c\u00107\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u00105\u001a\u0004\b8\u0010\u001cR\u001a\u00109\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010\u0016R\u001c\u0010<\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u00100\u001a\u0004\b=\u0010\u0019R\u001a\u0010>\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010!R\u001a\u0010A\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bA\u0010#R\"\u0010C\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010%R\u001a\u0010F\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010B\u001a\u0004\bF\u0010#R\u001c\u0010G\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bG\u00100\u001a\u0004\bH\u0010\u0019R\u001a\u0010I\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010:\u001a\u0004\bJ\u0010\u0016"}, d2 = {"Lcom/marrow/data/api/models/response/lesson/VideoBookmarkTimeline;", "", "", "p0", "p1", "", "p2", "p3", "", "p4", "p5", "p6", "", "p7", "", "p8", "p9", "p10", "p11", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;JLjava/lang/String;IZLjava/util/List;ZLjava/lang/String;J)V", "getStartTimeMs", "()J", "getEndTimeMs", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/lang/Integer;", "component4", "component5", "component6", "component7", "()I", "component8", "()Z", "component9", "()Ljava/util/List;", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;JLjava/lang/String;IZLjava/util/List;ZLjava/lang/String;J)Lcom/marrow/data/api/models/response/lesson/VideoBookmarkTimeline;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "id", "Ljava/lang/String;", "getId", "title", "getTitle", "startTime", "Ljava/lang/Integer;", "getStartTime", "endTime", "getEndTime", "lastUpdated", "J", "getLastUpdated", "videoId", "getVideoId", "bookmarkType", "I", "getBookmarkType", "isActive", "Z", "pytIds", "Ljava/util/List;", "getPytIds", "isTagActive", "tagLabel", "getTagLabel", "tagExpiryMs", "getTagExpiryMs", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VideoBookmarkTimeline {
    private static final String KEY_ACTIVE_STATUS = "is_active";
    private static final String KEY_BOOKMARK_TYPE = "bookmark_type";
    private static final String KEY_END_ID = "end_time";
    private static final String KEY_HYVT_MCQ_IDS = "hyvt_mcq_ids";
    private static final String KEY_LAST_UPDATED = "bookmark_last_updated";
    private static final String KEY_START_TIME = "start_time";
    private static final String KEY_TAG_ACTIVE = "tag_active";
    private static final String KEY_TAG_EXPIRY = "tag_expiry";
    private static final String KEY_TAG_LABEL = "tag_label";
    private static final String KEY_TITLE = "title";
    private static final String KEY_VIDEO_ID = "video_id";
    private static final String KEY_VIDEO_TIMELINE_ID = "_id";
    private final int bookmarkType;
    private final Integer endTime;
    private final String id;
    private final boolean isActive;
    private final boolean isTagActive;
    private final long lastUpdated;
    private final List<String> pytIds;
    private final Integer startTime;
    private final long tagExpiryMs;
    private final String tagLabel;
    private final String title;
    private final String videoId;

    public VideoBookmarkTimeline(@JsonProperty("_id") String str, @JsonProperty("title") String str2, @JsonProperty(KEY_START_TIME) Integer num, @JsonProperty(KEY_END_ID) Integer num2, @JsonProperty(KEY_LAST_UPDATED) long j, @JsonProperty(KEY_VIDEO_ID) String str3, @JsonProperty(KEY_BOOKMARK_TYPE) int i, @JsonProperty("is_active") boolean z, @JsonProperty(KEY_HYVT_MCQ_IDS) List<String> list, @JsonProperty(KEY_TAG_ACTIVE) boolean z2, @JsonProperty(KEY_TAG_LABEL) String str4, @JsonProperty(KEY_TAG_EXPIRY) long j2) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.id = str;
        this.title = str2;
        this.startTime = num;
        this.endTime = num2;
        this.lastUpdated = j;
        this.videoId = str3;
        this.bookmarkType = i;
        this.isActive = z;
        this.pytIds = list;
        this.isTagActive = z2;
        this.tagLabel = str4;
        this.tagExpiryMs = j2;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Integer getStartTime() {
        return this.startTime;
    }

    public final Integer getEndTime() {
        return this.endTime;
    }

    public final long getLastUpdated() {
        return this.lastUpdated;
    }

    public final String getVideoId() {
        return this.videoId;
    }

    public final int getBookmarkType() {
        return this.bookmarkType;
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public /* synthetic */ VideoBookmarkTimeline(String str, String str2, Integer num, Integer num2, long j, String str3, int i, boolean z, List list, boolean z2, String str4, long j2, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, str2, num, num2, j, str3, (i2 & 64) != 0 ? 0 : i, (i2 & 128) != 0 ? true : z, (i2 & 256) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i2 & 512) != 0 ? false : z2, (i2 & 1024) != 0 ? null : str4, (i2 & 2048) != 0 ? 0L : j2);
    }

    public final List<String> getPytIds() {
        return this.pytIds;
    }

    public final boolean isTagActive() {
        return this.isTagActive;
    }

    public final String getTagLabel() {
        return this.tagLabel;
    }

    public final long getTagExpiryMs() {
        return this.tagExpiryMs;
    }

    public final long getStartTimeMs() {
        Integer num = this.startTime;
        if (num == null) {
            return 0L;
        }
        if (num == null || num.intValue() != -1) {
            return ((long) this.startTime.intValue()) * 1000;
        }
        return 0L;
    }

    public final long getEndTimeMs() {
        Integer num = this.endTime;
        if (num == null) {
            return Long.MIN_VALUE;
        }
        if (num == null || num.intValue() != -1) {
            return ((long) this.endTime.intValue()) * 1000;
        }
        return Long.MIN_VALUE;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIsTagActive() {
        return this.isTagActive;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getTagLabel() {
        return this.tagLabel;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final long getTagExpiryMs() {
        return this.tagExpiryMs;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getLastUpdated() {
        return this.lastUpdated;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getVideoId() {
        return this.videoId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getBookmarkType() {
        return this.bookmarkType;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    public final List<String> component9() {
        return this.pytIds;
    }

    public final VideoBookmarkTimeline copy(@JsonProperty("_id") String p0, @JsonProperty("title") String p1, @JsonProperty(KEY_START_TIME) Integer p2, @JsonProperty(KEY_END_ID) Integer p3, @JsonProperty(KEY_LAST_UPDATED) long p4, @JsonProperty(KEY_VIDEO_ID) String p5, @JsonProperty(KEY_BOOKMARK_TYPE) int p6, @JsonProperty("is_active") boolean p7, @JsonProperty(KEY_HYVT_MCQ_IDS) List<String> p8, @JsonProperty(KEY_TAG_ACTIVE) boolean p9, @JsonProperty(KEY_TAG_LABEL) String p10, @JsonProperty(KEY_TAG_EXPIRY) long p11) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new VideoBookmarkTimeline(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof VideoBookmarkTimeline)) {
            return false;
        }
        VideoBookmarkTimeline videoBookmarkTimeline = (VideoBookmarkTimeline) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) videoBookmarkTimeline.id) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.title, (Object) videoBookmarkTimeline.title) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.startTime, videoBookmarkTimeline.startTime) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.endTime, videoBookmarkTimeline.endTime) && this.lastUpdated == videoBookmarkTimeline.lastUpdated && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.videoId, (Object) videoBookmarkTimeline.videoId) && this.bookmarkType == videoBookmarkTimeline.bookmarkType && this.isActive == videoBookmarkTimeline.isActive && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.pytIds, videoBookmarkTimeline.pytIds) && this.isTagActive == videoBookmarkTimeline.isTagActive && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.tagLabel, (Object) videoBookmarkTimeline.tagLabel) && this.tagExpiryMs == videoBookmarkTimeline.tagExpiryMs;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode();
        String str = this.title;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        Integer num = this.startTime;
        int iHashCode3 = num == null ? 0 : num.hashCode();
        Integer num2 = this.endTime;
        int iHashCode4 = num2 == null ? 0 : num2.hashCode();
        int iHashCode5 = Long.hashCode(this.lastUpdated);
        String str2 = this.videoId;
        int iHashCode6 = str2 == null ? 0 : str2.hashCode();
        int iHashCode7 = Integer.hashCode(this.bookmarkType);
        int iHashCode8 = Boolean.hashCode(this.isActive);
        List<String> list = this.pytIds;
        int iHashCode9 = list == null ? 0 : list.hashCode();
        int iHashCode10 = Boolean.hashCode(this.isTagActive);
        String str3 = this.tagLabel;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + Long.hashCode(this.tagExpiryMs);
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.title;
        Integer num = this.startTime;
        Integer num2 = this.endTime;
        long j = this.lastUpdated;
        String str3 = this.videoId;
        int i = this.bookmarkType;
        boolean z = this.isActive;
        List<String> list = this.pytIds;
        boolean z2 = this.isTagActive;
        String str4 = this.tagLabel;
        long j2 = this.tagExpiryMs;
        StringBuilder sb = new StringBuilder("VideoBookmarkTimeline(id=");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", startTime=");
        sb.append(num);
        sb.append(", endTime=");
        sb.append(num2);
        sb.append(", lastUpdated=");
        sb.append(j);
        sb.append(", videoId=");
        sb.append(str3);
        sb.append(", bookmarkType=");
        sb.append(i);
        sb.append(", isActive=");
        sb.append(z);
        sb.append(", pytIds=");
        sb.append(list);
        sb.append(", isTagActive=");
        sb.append(z2);
        sb.append(", tagLabel=");
        sb.append(str4);
        sb.append(", tagExpiryMs=");
        sb.append(j2);
        sb.append(")");
        return sb.toString();
    }
}
