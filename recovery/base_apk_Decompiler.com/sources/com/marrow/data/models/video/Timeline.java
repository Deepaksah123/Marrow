package com.marrow.data.models.video;

import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.android.exoplayer2.RendererCapabilities;
import com.marrow.data.api.models.response.lesson.VideoBookmarkTimeline;
import java.util.List;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.TestGroupLSModel;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b'\b\u0087\b\u0018\u0000 W2\u00020\u0001:\u0001WBk\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0004\u0012\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\b\b\u0003\u0010\f\u001a\u00020\u000b\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0010\u0010!\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0018\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b$\u0010\u0017J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b&\u0010'Jt\u0010(\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00042\b\b\u0003\u0010\u0007\u001a\u00020\u00022\b\b\u0003\u0010\b\u001a\u00020\u00042\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t2\b\b\u0003\u0010\f\u001a\u00020\u000b2\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b(\u0010)J\r\u0010*\u001a\u00020\u0004¢\u0006\u0004\b*\u0010\u001eJ\u001a\u0010,\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010+HÖ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b.\u0010\u001eJ\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010\u001cJ\u001d\u00101\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u0002002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b1\u00102R\"\u00103\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u0010\u001c\"\u0004\b6\u00107R\"\u00108\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010\u001e\"\u0004\b;\u0010<R\"\u0010=\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b=\u00109\u001a\u0004\b>\u0010\u001e\"\u0004\b?\u0010<R\"\u0010@\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b@\u00104\u001a\u0004\bA\u0010\u001c\"\u0004\bB\u00107R\"\u0010C\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bC\u00109\u001a\u0004\bD\u0010\u001e\"\u0004\bE\u0010<R*\u0010F\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010#\"\u0004\bI\u0010JR\"\u0010K\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bK\u0010\u0017\"\u0004\bM\u0010NR$\u0010O\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bO\u00104\u001a\u0004\bP\u0010\u001c\"\u0004\bQ\u00107R\"\u0010R\u001a\u00020\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010'\"\u0004\bU\u0010V"}, d2 = {"Lcom/marrow/data/models/video/Timeline;", "Landroid/os/Parcelable;", "", "p0", "", "p1", "p2", "p3", "p4", "", "p5", "", "p6", "p7", "", "p8", "<init>", "(Ljava/lang/String;IILjava/lang/String;ILjava/util/List;ZLjava/lang/String;J)V", "Lcom/fasterxml/jackson/databind/JsonNode;", "", "setUpdatedStatus", "(Lcom/fasterxml/jackson/databind/JsonNode;)V", "isUpdateTagVisible", "()Z", "Lcom/marrow/data/api/models/response/lesson/VideoBookmarkTimeline;", "toVideoBookmarkTimeline", "(Ljava/lang/String;)Lcom/marrow/data/api/models/response/lesson/VideoBookmarkTimeline;", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "component6", "()Ljava/util/List;", "component7", "component8", "component9", "()J", "copy", "(Ljava/lang/String;IILjava/lang/String;ILjava/util/List;ZLjava/lang/String;J)Lcom/marrow/data/models/video/Timeline;", "describeContents", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "writeToParcel", "(Landroid/os/Parcel;I)V", "timelineId", "Ljava/lang/String;", "getTimelineId", "setTimelineId", "(Ljava/lang/String;)V", "startTime", "I", "getStartTime", "setStartTime", "(I)V", "endTime", "getEndTime", "setEndTime", "timelineTitle", "getTimelineTitle", "setTimelineTitle", "bookmarkType", "getBookmarkType", "setBookmarkType", "pytMcqIds", "Ljava/util/List;", "getPytMcqIds", "setPytMcqIds", "(Ljava/util/List;)V", "isTagActive", "Z", "setTagActive", "(Z)V", "tagLabel", "getTagLabel", "setTagLabel", "tagExpiryMs", "J", "getTagExpiryMs", "setTagExpiryMs", "(J)V", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Timeline implements Parcelable {
    private static final String KEY_BOOKMARK_TYPE = "bookmark_type";
    private static final String KEY_END_TIME = "end_time";
    private static final String KEY_EXPIRES_ON = "expires_on";
    private static final String KEY_HYVT_MCQ_IDS = "hyvt_mcq_ids";
    private static final String KEY_ID = "_id";
    private static final String KEY_IS_ACTIVE = "is_active";
    private static final String KEY_LABEL = "label";
    private static final String KEY_START_TIME = "start_time";
    private static final String KEY_TAG_ACTIVE = "tag_active";
    private static final String KEY_TAG_EXPIRY = "tag_expiry";
    private static final String KEY_TAG_LABEL = "tag_label";
    private static final String KEY_TIMELINE_TITLE = "title";
    private static final String KEY_UPDATED_STATUS = "updated_status";
    private int bookmarkType;
    private int endTime;
    private boolean isTagActive;
    private List<String> pytMcqIds;
    private int startTime;
    private long tagExpiryMs;
    private String tagLabel;
    private String timelineId;
    private String timelineTitle;
    public static final Parcelable.Creator<Timeline> CREATOR = new Creator();

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Timeline> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Timeline createFromParcel(Parcel parcel) {
            toMagicModuleMetaRepoModel.write(parcel, "");
            return new Timeline(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.createStringArrayList(), parcel.readInt() != 0, parcel.readString(), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Timeline[] newArray(int i) {
            return new Timeline[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public Timeline(@JsonProperty("_id") String str, @JsonProperty(KEY_START_TIME) int i, @JsonProperty(KEY_END_TIME) int i2, @JsonProperty("title") String str2, @JsonProperty(KEY_BOOKMARK_TYPE) int i3, @JsonProperty(KEY_HYVT_MCQ_IDS) List<String> list, @JsonProperty(KEY_TAG_ACTIVE) boolean z, @JsonProperty(KEY_TAG_LABEL) String str3, @JsonProperty(KEY_TAG_EXPIRY) long j) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.timelineId = str;
        this.startTime = i;
        this.endTime = i2;
        this.timelineTitle = str2;
        this.bookmarkType = i3;
        this.pytMcqIds = list;
        this.isTagActive = z;
        this.tagLabel = str3;
        this.tagExpiryMs = j;
    }

    public final String getTimelineId() {
        return this.timelineId;
    }

    public final void setTimelineId(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.timelineId = str;
    }

    public final int getStartTime() {
        return this.startTime;
    }

    public final void setStartTime(int i) {
        this.startTime = i;
    }

    public final int getEndTime() {
        return this.endTime;
    }

    public final void setEndTime(int i) {
        this.endTime = i;
    }

    public final String getTimelineTitle() {
        return this.timelineTitle;
    }

    public final void setTimelineTitle(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.timelineTitle = str;
    }

    public final int getBookmarkType() {
        return this.bookmarkType;
    }

    public final void setBookmarkType(int i) {
        this.bookmarkType = i;
    }

    public /* synthetic */ Timeline(String str, int i, int i2, String str2, int i3, List list, boolean z, String str3, long j, int i4, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, i, i2, str2, (i4 & 16) != 0 ? 0 : i3, (i4 & 32) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i4 & 64) != 0 ? false : z, (i4 & 128) != 0 ? null : str3, (i4 & 256) != 0 ? 0L : j);
    }

    public final List<String> getPytMcqIds() {
        return this.pytMcqIds;
    }

    public final void setPytMcqIds(List<String> list) {
        this.pytMcqIds = list;
    }

    public final boolean isTagActive() {
        return this.isTagActive;
    }

    public final void setTagActive(boolean z) {
        this.isTagActive = z;
    }

    public final String getTagLabel() {
        return this.tagLabel;
    }

    public final void setTagLabel(String str) {
        this.tagLabel = str;
    }

    public final long getTagExpiryMs() {
        return this.tagExpiryMs;
    }

    public final void setTagExpiryMs(long j) {
        this.tagExpiryMs = j;
    }

    @JsonSetter(KEY_UPDATED_STATUS)
    public final void setUpdatedStatus(JsonNode p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0.has("is_active")) {
            this.isTagActive = p0.get("is_active").asBoolean();
        }
        if (p0.has("label")) {
            this.tagLabel = p0.get("label").asText();
        }
        if (p0.has(KEY_EXPIRES_ON)) {
            this.tagExpiryMs = p0.get(KEY_EXPIRES_ON).asLong();
        }
    }

    public final boolean isUpdateTagVisible() {
        String str;
        if (!this.isTagActive || (str = this.tagLabel) == null || TestGroupLSModel.IconCompatParcelizer((CharSequence) str)) {
            return false;
        }
        long j = this.tagExpiryMs;
        return j == 0 || j > System.currentTimeMillis();
    }

    public final VideoBookmarkTimeline toVideoBookmarkTimeline(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        String str = this.timelineId;
        String str2 = this.timelineTitle;
        int i = this.startTime;
        int i2 = this.endTime;
        return new VideoBookmarkTimeline(str, str2, Integer.valueOf(i), Integer.valueOf(i2), 0L, p0, this.bookmarkType, false, null, this.isTagActive, this.tagLabel, this.tagExpiryMs, RendererCapabilities.MODE_SUPPORT_MASK, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTimelineId() {
        return this.timelineId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTimelineTitle() {
        return this.timelineTitle;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getBookmarkType() {
        return this.bookmarkType;
    }

    public final List<String> component6() {
        return this.pytMcqIds;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getIsTagActive() {
        return this.isTagActive;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getTagLabel() {
        return this.tagLabel;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getTagExpiryMs() {
        return this.tagExpiryMs;
    }

    public final Timeline copy(@JsonProperty("_id") String p0, @JsonProperty(KEY_START_TIME) int p1, @JsonProperty(KEY_END_TIME) int p2, @JsonProperty("title") String p3, @JsonProperty(KEY_BOOKMARK_TYPE) int p4, @JsonProperty(KEY_HYVT_MCQ_IDS) List<String> p5, @JsonProperty(KEY_TAG_ACTIVE) boolean p6, @JsonProperty(KEY_TAG_LABEL) String p7, @JsonProperty(KEY_TAG_EXPIRY) long p8) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        return new Timeline(p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof Timeline)) {
            return false;
        }
        Timeline timeline = (Timeline) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.timelineId, (Object) timeline.timelineId) && this.startTime == timeline.startTime && this.endTime == timeline.endTime && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.timelineTitle, (Object) timeline.timelineTitle) && this.bookmarkType == timeline.bookmarkType && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.pytMcqIds, timeline.pytMcqIds) && this.isTagActive == timeline.isTagActive && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.tagLabel, (Object) timeline.tagLabel) && this.tagExpiryMs == timeline.tagExpiryMs;
    }

    public final int hashCode() {
        int iHashCode = this.timelineId.hashCode();
        int iHashCode2 = Integer.hashCode(this.startTime);
        int iHashCode3 = Integer.hashCode(this.endTime);
        int iHashCode4 = this.timelineTitle.hashCode();
        int iHashCode5 = Integer.hashCode(this.bookmarkType);
        List<String> list = this.pytMcqIds;
        int iHashCode6 = list == null ? 0 : list.hashCode();
        int iHashCode7 = Boolean.hashCode(this.isTagActive);
        String str = this.tagLabel;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str != null ? str.hashCode() : 0)) * 31) + Long.hashCode(this.tagExpiryMs);
    }

    public final String toString() {
        String str = this.timelineId;
        int i = this.startTime;
        int i2 = this.endTime;
        String str2 = this.timelineTitle;
        int i3 = this.bookmarkType;
        List<String> list = this.pytMcqIds;
        boolean z = this.isTagActive;
        String str3 = this.tagLabel;
        long j = this.tagExpiryMs;
        StringBuilder sb = new StringBuilder("Timeline(timelineId=");
        sb.append(str);
        sb.append(", startTime=");
        sb.append(i);
        sb.append(", endTime=");
        sb.append(i2);
        sb.append(", timelineTitle=");
        sb.append(str2);
        sb.append(", bookmarkType=");
        sb.append(i3);
        sb.append(", pytMcqIds=");
        sb.append(list);
        sb.append(", isTagActive=");
        sb.append(z);
        sb.append(", tagLabel=");
        sb.append(str3);
        sb.append(", tagExpiryMs=");
        sb.append(j);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.writeString(this.timelineId);
        p0.writeInt(this.startTime);
        p0.writeInt(this.endTime);
        p0.writeString(this.timelineTitle);
        p0.writeInt(this.bookmarkType);
        p0.writeStringList(this.pytMcqIds);
        p0.writeInt(this.isTagActive ? 1 : 0);
        p0.writeString(this.tagLabel);
        p0.writeLong(this.tagExpiryMs);
    }
}
