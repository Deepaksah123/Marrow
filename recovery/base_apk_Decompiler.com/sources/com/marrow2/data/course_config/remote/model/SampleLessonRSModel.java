package com.marrow2.data.course_config.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ@\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001c\u0010 \u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\rR\u001c\u0010\"\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010\r"}, d2 = {"Lcom/marrow2/data/course_config/remote/model/SampleLessonRSModel;", "Ljava/io/Serializable;", "Lcom/marrow2/data/course_config/remote/model/AuthorRSModel;", "p0", "", "p1", "p2", "p3", "<init>", "(Lcom/marrow2/data/course_config/remote/model/AuthorRSModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/marrow2/data/course_config/remote/model/AuthorRSModel;", "component2", "()Ljava/lang/String;", "component3", "component4", "copy", "(Lcom/marrow2/data/course_config/remote/model/AuthorRSModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/marrow2/data/course_config/remote/model/SampleLessonRSModel;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "lessonAuthor", "Lcom/marrow2/data/course_config/remote/model/AuthorRSModel;", "getLessonAuthor", "lessonId", "Ljava/lang/String;", "getLessonId", "subjectName", "getSubjectName", "lessonTitle", "getLessonTitle"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SampleLessonRSModel implements Serializable {
    public static final int $stable = 0;
    private final AuthorRSModel lessonAuthor;
    private final String lessonId;
    private final String lessonTitle;
    private final String subjectName;

    public SampleLessonRSModel(AuthorRSModel authorRSModel, String str, String str2, String str3) {
        this.lessonAuthor = authorRSModel;
        this.lessonId = str;
        this.subjectName = str2;
        this.lessonTitle = str3;
    }

    public /* synthetic */ SampleLessonRSModel(AuthorRSModel authorRSModel, String str, String str2, String str3, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : authorRSModel, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
    }

    @JsonProperty("author")
    public final AuthorRSModel getLessonAuthor() {
        return this.lessonAuthor;
    }

    @JsonProperty("id")
    public final String getLessonId() {
        return this.lessonId;
    }

    @JsonProperty("subject")
    public final String getSubjectName() {
        return this.subjectName;
    }

    @JsonProperty("title")
    public final String getLessonTitle() {
        return this.lessonTitle;
    }

    public SampleLessonRSModel() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ SampleLessonRSModel copy$default(SampleLessonRSModel sampleLessonRSModel, AuthorRSModel authorRSModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            authorRSModel = sampleLessonRSModel.lessonAuthor;
        }
        if ((i & 2) != 0) {
            str = sampleLessonRSModel.lessonId;
        }
        if ((i & 4) != 0) {
            str2 = sampleLessonRSModel.subjectName;
        }
        if ((i & 8) != 0) {
            str3 = sampleLessonRSModel.lessonTitle;
        }
        return sampleLessonRSModel.copy(authorRSModel, str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AuthorRSModel getLessonAuthor() {
        return this.lessonAuthor;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLessonId() {
        return this.lessonId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubjectName() {
        return this.subjectName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLessonTitle() {
        return this.lessonTitle;
    }

    public final SampleLessonRSModel copy(AuthorRSModel p0, String p1, String p2, String p3) {
        return new SampleLessonRSModel(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SampleLessonRSModel)) {
            return false;
        }
        SampleLessonRSModel sampleLessonRSModel = (SampleLessonRSModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.lessonAuthor, sampleLessonRSModel.lessonAuthor) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.lessonId, (Object) sampleLessonRSModel.lessonId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.subjectName, (Object) sampleLessonRSModel.subjectName) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.lessonTitle, (Object) sampleLessonRSModel.lessonTitle);
    }

    public final int hashCode() {
        AuthorRSModel authorRSModel = this.lessonAuthor;
        int iHashCode = authorRSModel == null ? 0 : authorRSModel.hashCode();
        String str = this.lessonId;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        String str2 = this.subjectName;
        int iHashCode3 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.lessonTitle;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        AuthorRSModel authorRSModel = this.lessonAuthor;
        String str = this.lessonId;
        String str2 = this.subjectName;
        String str3 = this.lessonTitle;
        StringBuilder sb = new StringBuilder("SampleLessonRSModel(lessonAuthor=");
        sb.append(authorRSModel);
        sb.append(", lessonId=");
        sb.append(str);
        sb.append(", subjectName=");
        sb.append(str2);
        sb.append(", lessonTitle=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
