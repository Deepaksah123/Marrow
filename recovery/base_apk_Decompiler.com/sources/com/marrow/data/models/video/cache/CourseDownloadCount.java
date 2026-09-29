package com.marrow.data.models.video.cache;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\bJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/marrow/data/models/video/cache/CourseDownloadCount;", "", "", "p0", "p1", "<init>", "(II)V", "component1", "()I", "component2", "copy", "(II)Lcom/marrow/data/models/video/cache/CourseDownloadCount;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "courseId", "I", "getCourseId", "downloadCount", "getDownloadCount"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CourseDownloadCount {
    private final int courseId;
    private final int downloadCount;

    public CourseDownloadCount(int i, int i2) {
        this.courseId = i;
        this.downloadCount = i2;
    }

    public final int getCourseId() {
        return this.courseId;
    }

    public final int getDownloadCount() {
        return this.downloadCount;
    }

    public static /* synthetic */ CourseDownloadCount copy$default(CourseDownloadCount courseDownloadCount, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = courseDownloadCount.courseId;
        }
        if ((i3 & 2) != 0) {
            i2 = courseDownloadCount.downloadCount;
        }
        return courseDownloadCount.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getCourseId() {
        return this.courseId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDownloadCount() {
        return this.downloadCount;
    }

    public final CourseDownloadCount copy(int p0, int p1) {
        return new CourseDownloadCount(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof CourseDownloadCount)) {
            return false;
        }
        CourseDownloadCount courseDownloadCount = (CourseDownloadCount) p0;
        return this.courseId == courseDownloadCount.courseId && this.downloadCount == courseDownloadCount.downloadCount;
    }

    public final int hashCode() {
        return (Integer.hashCode(this.courseId) * 31) + Integer.hashCode(this.downloadCount);
    }

    public final String toString() {
        int i = this.courseId;
        int i2 = this.downloadCount;
        StringBuilder sb = new StringBuilder("CourseDownloadCount(courseId=");
        sb.append(i);
        sb.append(", downloadCount=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }
}
