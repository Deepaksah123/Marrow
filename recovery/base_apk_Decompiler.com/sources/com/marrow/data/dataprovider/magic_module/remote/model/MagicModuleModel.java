package com.marrow.data.dataprovider.magic_module.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.api.models.response.lesson.step.StepResponseBody;
import com.marrow.data.api.models.response.mcq.McqResponseBody;
import com.marrow.data.api.models.response.user.LoggedUserResponse;
import com.marrow.data.models.custommodule.FilterParams;
import java.util.List;
import java.util.Map;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bD\b\u0087\b\u0018\u00002\u00020\u0001B¹\u0001\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0001\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\n\u001a\u00020\b\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\u0010\b\u0003\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u0016\b\u0003\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0013\u0012\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0010\b\u0003\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b*\u0010%J\u0018\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b+\u0010,J\u001e\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b/\u00100J\u0018\u00101\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b1\u0010,JÂ\u0001\u00102\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u00062\b\b\u0003\u0010\t\u001a\u00020\b2\b\b\u0003\u0010\n\u001a\u00020\b2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\b\u0003\u0010\r\u001a\u00020\f2\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\f2\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0010\b\u0003\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0016\b\u0003\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u00132\n\b\u0003\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0010\b\u0003\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00104\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b6\u0010\"J\u0010\u00107\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b7\u0010\u001cR\u001a\u00108\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010\u001cR\u001a\u0010;\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u00109\u001a\u0004\b<\u0010\u001cR\u001a\u0010=\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u00109\u001a\u0004\b>\u0010\u001cR\u001a\u0010?\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\b?\u0010 R\u001a\u0010A\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010\"R\u001a\u0010D\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010B\u001a\u0004\bE\u0010\"R\u001c\u0010F\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010%R\u001a\u0010I\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010'R\u001c\u0010L\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010)R\u001c\u0010O\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010G\u001a\u0004\bP\u0010%R\"\u0010Q\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010,R(\u0010T\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0018\u00010\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010.R\u001c\u0010W\u001a\u0004\u0018\u00010\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u00100R\"\u0010Z\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00108\u0007X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010R\u001a\u0004\b[\u0010,"}, d2 = {"Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleModel;", "", "", "p0", "p1", "p2", "", "p3", "", "p4", "p5", "p6", "", "p7", "p8", "p9", "", "Lcom/marrow/data/api/models/response/mcq/McqResponseBody;", "p10", "", "p11", "Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleStatsRSModel;", "p12", "Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleTimelineRSModel;", "p13", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIILjava/lang/Integer;JLjava/lang/Long;Ljava/lang/Integer;Ljava/util/List;Ljava/util/Map;Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleStatsRSModel;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Z", "component5", "()I", "component6", "component7", "()Ljava/lang/Integer;", "component8", "()J", "component9", "()Ljava/lang/Long;", "component10", "component11", "()Ljava/util/List;", "component12", "()Ljava/util/Map;", "component13", "()Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleStatsRSModel;", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIILjava/lang/Integer;JLjava/lang/Long;Ljava/lang/Integer;Ljava/util/List;Ljava/util/Map;Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleStatsRSModel;Ljava/util/List;)Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleModel;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "id", "Ljava/lang/String;", "getId", "title", "getTitle", "courseId", "getCourseId", "isFirstModule", "Z", "mcqCount", "I", "getMcqCount", "status", "getStatus", "error_code", "Ljava/lang/Integer;", "getError_code", "createdOnDateMs", "J", "getCreatedOnDateMs", "submittedOn", "Ljava/lang/Long;", "getSubmittedOn", "correctCount", "getCorrectCount", "mcqResponseList", "Ljava/util/List;", "getMcqResponseList", "answerMap", "Ljava/util/Map;", "getAnswerMap", "magicModuleRsStat", "Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleStatsRSModel;", "getMagicModuleRsStat", "timeline", "getTimeline"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MagicModuleModel {
    private final Map<String, Integer> answerMap;
    private final Integer correctCount;
    private final String courseId;
    private final long createdOnDateMs;
    private final Integer error_code;
    private final String id;
    private final boolean isFirstModule;
    private final MagicModuleStatsRSModel magicModuleRsStat;
    private final int mcqCount;
    private final List<McqResponseBody> mcqResponseList;
    private final int status;
    private final Long submittedOn;
    private final List<MagicModuleTimelineRSModel> timeline;
    private final String title;

    /* JADX WARN: Multi-variable type inference failed */
    public MagicModuleModel(@JsonProperty("_id") String str, @JsonProperty("title") String str2, @JsonProperty(FilterParams.KEY_COURSE_ID) String str3, @JsonProperty("is_first_module") boolean z, @JsonProperty("mcq_count") int i, @JsonProperty("status") int i2, @JsonProperty("error_code") Integer num, @JsonProperty(LoggedUserResponse.KEY_CREATED_ON) long j, @JsonProperty("submitted_on") Long l, @JsonProperty("correct_count") Integer num2, @JsonProperty(StepResponseBody.KEY_QUESTIONS) List<? extends McqResponseBody> list, @JsonProperty("answer") Map<String, Integer> map, @JsonProperty("smart_recall_stats") MagicModuleStatsRSModel magicModuleStatsRSModel, @JsonProperty("timeline") List<MagicModuleTimelineRSModel> list2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        this.id = str;
        this.title = str2;
        this.courseId = str3;
        this.isFirstModule = z;
        this.mcqCount = i;
        this.status = i2;
        this.error_code = num;
        this.createdOnDateMs = j;
        this.submittedOn = l;
        this.correctCount = num2;
        this.mcqResponseList = list;
        this.answerMap = map;
        this.magicModuleRsStat = magicModuleStatsRSModel;
        this.timeline = list2;
    }

    public /* synthetic */ MagicModuleModel(String str, String str2, String str3, boolean z, int i, int i2, Integer num, long j, Long l, Integer num2, List list, Map map, MagicModuleStatsRSModel magicModuleStatsRSModel, List list2, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, str2, str3, z, i, i2, (i3 & 64) != 0 ? null : num, j, (i3 & 256) != 0 ? null : l, (i3 & 512) != 0 ? null : num2, (i3 & 1024) != 0 ? null : list, (i3 & 2048) != 0 ? null : map, (i3 & 4096) != 0 ? null : magicModuleStatsRSModel, (i3 & 8192) != 0 ? null : list2);
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getCourseId() {
        return this.courseId;
    }

    public final boolean isFirstModule() {
        return this.isFirstModule;
    }

    public final int getMcqCount() {
        return this.mcqCount;
    }

    public final int getStatus() {
        return this.status;
    }

    public final Integer getError_code() {
        return this.error_code;
    }

    public final long getCreatedOnDateMs() {
        return this.createdOnDateMs;
    }

    public final Long getSubmittedOn() {
        return this.submittedOn;
    }

    public final Integer getCorrectCount() {
        return this.correctCount;
    }

    public final List<McqResponseBody> getMcqResponseList() {
        return this.mcqResponseList;
    }

    public final Map<String, Integer> getAnswerMap() {
        return this.answerMap;
    }

    public final MagicModuleStatsRSModel getMagicModuleRsStat() {
        return this.magicModuleRsStat;
    }

    public final List<MagicModuleTimelineRSModel> getTimeline() {
        return this.timeline;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getCorrectCount() {
        return this.correctCount;
    }

    public final List<McqResponseBody> component11() {
        return this.mcqResponseList;
    }

    public final Map<String, Integer> component12() {
        return this.answerMap;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final MagicModuleStatsRSModel getMagicModuleRsStat() {
        return this.magicModuleRsStat;
    }

    public final List<MagicModuleTimelineRSModel> component14() {
        return this.timeline;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCourseId() {
        return this.courseId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsFirstModule() {
        return this.isFirstModule;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMcqCount() {
        return this.mcqCount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getError_code() {
        return this.error_code;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getCreatedOnDateMs() {
        return this.createdOnDateMs;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Long getSubmittedOn() {
        return this.submittedOn;
    }

    public final MagicModuleModel copy(@JsonProperty("_id") String p0, @JsonProperty("title") String p1, @JsonProperty(FilterParams.KEY_COURSE_ID) String p2, @JsonProperty("is_first_module") boolean p3, @JsonProperty("mcq_count") int p4, @JsonProperty("status") int p5, @JsonProperty("error_code") Integer p6, @JsonProperty(LoggedUserResponse.KEY_CREATED_ON) long p7, @JsonProperty("submitted_on") Long p8, @JsonProperty("correct_count") Integer p9, @JsonProperty(StepResponseBody.KEY_QUESTIONS) List<? extends McqResponseBody> p10, @JsonProperty("answer") Map<String, Integer> p11, @JsonProperty("smart_recall_stats") MagicModuleStatsRSModel p12, @JsonProperty("timeline") List<MagicModuleTimelineRSModel> p13) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        return new MagicModuleModel(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof MagicModuleModel)) {
            return false;
        }
        MagicModuleModel magicModuleModel = (MagicModuleModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) magicModuleModel.id) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.title, (Object) magicModuleModel.title) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.courseId, (Object) magicModuleModel.courseId) && this.isFirstModule == magicModuleModel.isFirstModule && this.mcqCount == magicModuleModel.mcqCount && this.status == magicModuleModel.status && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.error_code, magicModuleModel.error_code) && this.createdOnDateMs == magicModuleModel.createdOnDateMs && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.submittedOn, magicModuleModel.submittedOn) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.correctCount, magicModuleModel.correctCount) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.mcqResponseList, magicModuleModel.mcqResponseList) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.answerMap, magicModuleModel.answerMap) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.magicModuleRsStat, magicModuleModel.magicModuleRsStat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.timeline, magicModuleModel.timeline);
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode();
        int iHashCode2 = this.title.hashCode();
        int iHashCode3 = this.courseId.hashCode();
        int iHashCode4 = Boolean.hashCode(this.isFirstModule);
        int iHashCode5 = Integer.hashCode(this.mcqCount);
        int iHashCode6 = Integer.hashCode(this.status);
        Integer num = this.error_code;
        int iHashCode7 = num == null ? 0 : num.hashCode();
        int iHashCode8 = Long.hashCode(this.createdOnDateMs);
        Long l = this.submittedOn;
        int iHashCode9 = l == null ? 0 : l.hashCode();
        Integer num2 = this.correctCount;
        int iHashCode10 = num2 == null ? 0 : num2.hashCode();
        List<McqResponseBody> list = this.mcqResponseList;
        int iHashCode11 = list == null ? 0 : list.hashCode();
        Map<String, Integer> map = this.answerMap;
        int iHashCode12 = map == null ? 0 : map.hashCode();
        MagicModuleStatsRSModel magicModuleStatsRSModel = this.magicModuleRsStat;
        int iHashCode13 = magicModuleStatsRSModel == null ? 0 : magicModuleStatsRSModel.hashCode();
        List<MagicModuleTimelineRSModel> list2 = this.timeline;
        return (((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.title;
        String str3 = this.courseId;
        boolean z = this.isFirstModule;
        int i = this.mcqCount;
        int i2 = this.status;
        Integer num = this.error_code;
        long j = this.createdOnDateMs;
        Long l = this.submittedOn;
        Integer num2 = this.correctCount;
        List<McqResponseBody> list = this.mcqResponseList;
        Map<String, Integer> map = this.answerMap;
        MagicModuleStatsRSModel magicModuleStatsRSModel = this.magicModuleRsStat;
        List<MagicModuleTimelineRSModel> list2 = this.timeline;
        StringBuilder sb = new StringBuilder("MagicModuleModel(id=");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", courseId=");
        sb.append(str3);
        sb.append(", isFirstModule=");
        sb.append(z);
        sb.append(", mcqCount=");
        sb.append(i);
        sb.append(", status=");
        sb.append(i2);
        sb.append(", error_code=");
        sb.append(num);
        sb.append(", createdOnDateMs=");
        sb.append(j);
        sb.append(", submittedOn=");
        sb.append(l);
        sb.append(", correctCount=");
        sb.append(num2);
        sb.append(", mcqResponseList=");
        sb.append(list);
        sb.append(", answerMap=");
        sb.append(map);
        sb.append(", magicModuleRsStat=");
        sb.append(magicModuleStatsRSModel);
        sb.append(", timeline=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }
}
