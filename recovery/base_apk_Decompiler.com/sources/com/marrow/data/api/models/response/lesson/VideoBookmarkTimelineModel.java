package com.marrow.data.api.models.response.lesson;

import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b:\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0016J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0016J\u0010\u0010\u001f\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0016J\u0010\u0010\"\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\"\u0010 J~\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010%\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b'\u0010\u0018J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0016R\u0017\u0010)\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0016R\u001a\u0010,\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u0018R\u001a\u0010/\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u0010-\u001a\u0004\b0\u0010\u0018R\u001a\u00101\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010*\u001a\u0004\b2\u0010\u0016R\u001a\u00103\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010*\u001a\u0004\b4\u0010\u0016R\u001a\u00105\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010*\u001a\u0004\b6\u0010\u0016R\u001a\u00107\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010*\u001a\u0004\b8\u0010\u0016R\u001a\u00109\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010*\u001a\u0004\b:\u0010\u0016R\u001a\u0010;\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b;\u0010 R\u001a\u0010=\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010*\u001a\u0004\b>\u0010\u0016R\"\u0010?\u001a\u00020\f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b?\u0010<\u001a\u0004\b@\u0010 \"\u0004\bA\u0010BR$\u0010C\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bC\u0010*\u001a\u0004\bD\u0010\u0016\"\u0004\bE\u0010FR\"\u0010G\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bG\u0010-\u001a\u0004\bH\u0010\u0018\"\u0004\bI\u0010JR\"\u0010K\u001a\u00020\f8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bK\u0010<\u001a\u0004\bK\u0010 \"\u0004\bL\u0010B"}, d2 = {"Lcom/marrow/data/api/models/response/lesson/VideoBookmarkTimelineModel;", "", "", "p0", "", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "", "p8", "p9", "p10", "<init>", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Z)V", "Lcom/marrow/data/api/models/response/lesson/VideoBookmarkTimeline;", "toVideoBookmarkTimeline", "()Lcom/marrow/data/api/models/response/lesson/VideoBookmarkTimeline;", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "()Z", "component10", "component11", "copy", "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Z)Lcom/marrow/data/api/models/response/lesson/VideoBookmarkTimelineModel;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "timelineId", "Ljava/lang/String;", "getTimelineId", "startTime", "I", "getStartTime", "endTime", "getEndTime", "timelineTitle", "getTimelineTitle", "lessonId", "getLessonId", "lessonTitle", "getLessonTitle", "subjectId", "getSubjectId", "subjectTitle", "getSubjectTitle", "isLessonPaid", "Z", "videoId", "getVideoId", "hasPyt", "getHasPyt", "setHasPyt", "(Z)V", "filterType", "getFilterType", "setFilterType", "(Ljava/lang/String;)V", "bookmarkType", "getBookmarkType", "setBookmarkType", "(I)V", "isSelected", "setSelected"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VideoBookmarkTimelineModel {
    private int bookmarkType;
    private final int endTime;
    private String filterType;
    private boolean hasPyt;
    private final boolean isLessonPaid;
    private boolean isSelected;
    private final String lessonId;
    private final String lessonTitle;
    private final int startTime;
    private final String subjectId;
    private final String subjectTitle;
    private final String timelineId;
    private final String timelineTitle;
    private final String videoId;

    public VideoBookmarkTimelineModel(String str, int i, int i2, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, boolean z2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        toMagicModuleMetaRepoModel.write(str6, "");
        toMagicModuleMetaRepoModel.write(str7, "");
        this.timelineId = str;
        this.startTime = i;
        this.endTime = i2;
        this.timelineTitle = str2;
        this.lessonId = str3;
        this.lessonTitle = str4;
        this.subjectId = str5;
        this.subjectTitle = str6;
        this.isLessonPaid = z;
        this.videoId = str7;
        this.hasPyt = z2;
    }

    public /* synthetic */ VideoBookmarkTimelineModel(String str, int i, int i2, String str2, String str3, String str4, String str5, String str6, boolean z, String str7, boolean z2, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, i, i2, str2, str3, str4, str5, str6, z, str7, (i3 & 1024) != 0 ? false : z2);
    }

    public final String getTimelineId() {
        return this.timelineId;
    }

    public final int getStartTime() {
        return this.startTime;
    }

    public final int getEndTime() {
        return this.endTime;
    }

    public final String getTimelineTitle() {
        return this.timelineTitle;
    }

    public final String getLessonId() {
        return this.lessonId;
    }

    public final String getLessonTitle() {
        return this.lessonTitle;
    }

    public final String getSubjectId() {
        return this.subjectId;
    }

    public final String getSubjectTitle() {
        return this.subjectTitle;
    }

    public final boolean isLessonPaid() {
        return this.isLessonPaid;
    }

    public final String getVideoId() {
        return this.videoId;
    }

    public final boolean getHasPyt() {
        return this.hasPyt;
    }

    public final void setHasPyt(boolean z) {
        this.hasPyt = z;
    }

    public final String getFilterType() {
        return this.filterType;
    }

    public final void setFilterType(String str) {
        this.filterType = str;
    }

    public final int getBookmarkType() {
        return this.bookmarkType;
    }

    public final void setBookmarkType(int i) {
        this.bookmarkType = i;
    }

    public final VideoBookmarkTimeline toVideoBookmarkTimeline() {
        String str = this.timelineId;
        String str2 = this.timelineTitle;
        int i = this.startTime;
        int i2 = this.endTime;
        return new VideoBookmarkTimeline(str, str2, Integer.valueOf(i), Integer.valueOf(i2), 0L, this.videoId, this.bookmarkType, false, null, false, null, 0L, 3968, null);
    }

    /* JADX INFO: renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTimelineId() {
        return this.timelineId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getVideoId() {
        return this.videoId;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final boolean getHasPyt() {
        return this.hasPyt;
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
    public final String getLessonId() {
        return this.lessonId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLessonTitle() {
        return this.lessonTitle;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getSubjectId() {
        return this.subjectId;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSubjectTitle() {
        return this.subjectTitle;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsLessonPaid() {
        return this.isLessonPaid;
    }

    public final VideoBookmarkTimelineModel copy(String p0, int p1, int p2, String p3, String p4, String p5, String p6, String p7, boolean p8, String p9, boolean p10) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        toMagicModuleMetaRepoModel.write(p4, "");
        toMagicModuleMetaRepoModel.write(p5, "");
        toMagicModuleMetaRepoModel.write(p6, "");
        toMagicModuleMetaRepoModel.write(p7, "");
        toMagicModuleMetaRepoModel.write(p9, "");
        return new VideoBookmarkTimelineModel(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof VideoBookmarkTimelineModel)) {
            return false;
        }
        VideoBookmarkTimelineModel videoBookmarkTimelineModel = (VideoBookmarkTimelineModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.timelineId, (Object) videoBookmarkTimelineModel.timelineId) && this.startTime == videoBookmarkTimelineModel.startTime && this.endTime == videoBookmarkTimelineModel.endTime && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.timelineTitle, (Object) videoBookmarkTimelineModel.timelineTitle) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.lessonId, (Object) videoBookmarkTimelineModel.lessonId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.lessonTitle, (Object) videoBookmarkTimelineModel.lessonTitle) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.subjectId, (Object) videoBookmarkTimelineModel.subjectId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.subjectTitle, (Object) videoBookmarkTimelineModel.subjectTitle) && this.isLessonPaid == videoBookmarkTimelineModel.isLessonPaid && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.videoId, (Object) videoBookmarkTimelineModel.videoId) && this.hasPyt == videoBookmarkTimelineModel.hasPyt;
    }

    public final int hashCode() {
        return (((((((((((((((((((this.timelineId.hashCode() * 31) + Integer.hashCode(this.startTime)) * 31) + Integer.hashCode(this.endTime)) * 31) + this.timelineTitle.hashCode()) * 31) + this.lessonId.hashCode()) * 31) + this.lessonTitle.hashCode()) * 31) + this.subjectId.hashCode()) * 31) + this.subjectTitle.hashCode()) * 31) + Boolean.hashCode(this.isLessonPaid)) * 31) + this.videoId.hashCode()) * 31) + Boolean.hashCode(this.hasPyt);
    }

    public final String toString() {
        String str = this.timelineId;
        int i = this.startTime;
        int i2 = this.endTime;
        String str2 = this.timelineTitle;
        String str3 = this.lessonId;
        String str4 = this.lessonTitle;
        String str5 = this.subjectId;
        String str6 = this.subjectTitle;
        boolean z = this.isLessonPaid;
        String str7 = this.videoId;
        boolean z2 = this.hasPyt;
        StringBuilder sb = new StringBuilder("VideoBookmarkTimelineModel(timelineId=");
        sb.append(str);
        sb.append(", startTime=");
        sb.append(i);
        sb.append(", endTime=");
        sb.append(i2);
        sb.append(", timelineTitle=");
        sb.append(str2);
        sb.append(", lessonId=");
        sb.append(str3);
        sb.append(", lessonTitle=");
        sb.append(str4);
        sb.append(", subjectId=");
        sb.append(str5);
        sb.append(", subjectTitle=");
        sb.append(str6);
        sb.append(", isLessonPaid=");
        sb.append(z);
        sb.append(", videoId=");
        sb.append(str7);
        sb.append(", hasPyt=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }
}
