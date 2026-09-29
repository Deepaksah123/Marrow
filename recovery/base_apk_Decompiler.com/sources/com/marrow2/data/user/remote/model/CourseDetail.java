package com.marrow2.data.user.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.custommodule.FilterParams;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\bJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/marrow2/data/user/remote/model/CourseDetail;", "", "", "p0", "p1", "<init>", "(II)V", "component1", "()I", "component2", "copy", "(II)Lcom/marrow2/data/user/remote/model/CourseDetail;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "defaultEdition", "I", "getDefaultEdition", "defaultCourse", "getDefaultCourse"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CourseDetail {
    public static final int $stable = 0;

    @JsonProperty(FilterParams.KEY_COURSE_ID)
    private final int defaultCourse;

    @JsonProperty("course_default_edition")
    private final int defaultEdition;

    public CourseDetail(int i, int i2) {
        this.defaultEdition = i;
        this.defaultCourse = i2;
    }

    public /* synthetic */ CourseDetail(int i, int i2, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? -1 : i2);
    }

    public final int getDefaultEdition() {
        return this.defaultEdition;
    }

    public final int getDefaultCourse() {
        return this.defaultCourse;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CourseDetail() {
        int i = 0;
        this(i, i, 3, null);
    }

    public static /* synthetic */ CourseDetail copy$default(CourseDetail courseDetail, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = courseDetail.defaultEdition;
        }
        if ((i3 & 2) != 0) {
            i2 = courseDetail.defaultCourse;
        }
        return courseDetail.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDefaultEdition() {
        return this.defaultEdition;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDefaultCourse() {
        return this.defaultCourse;
    }

    public final CourseDetail copy(int p0, int p1) {
        return new CourseDetail(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof CourseDetail)) {
            return false;
        }
        CourseDetail courseDetail = (CourseDetail) p0;
        return this.defaultEdition == courseDetail.defaultEdition && this.defaultCourse == courseDetail.defaultCourse;
    }

    public final int hashCode() {
        return (Integer.hashCode(this.defaultEdition) * 31) + Integer.hashCode(this.defaultCourse);
    }

    public final String toString() {
        int i = this.defaultEdition;
        int i2 = this.defaultCourse;
        StringBuilder sb = new StringBuilder("CourseDetail(defaultEdition=");
        sb.append(i);
        sb.append(", defaultCourse=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }
}
