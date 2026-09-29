package com.marrow2.data.course_config.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ,\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0004\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fR \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/marrow2/data/course_config/remote/model/FreeVideoListRSModel;", "Ljava/io/Serializable;", "", "Lcom/marrow2/data/course_config/remote/model/SampleLessonRSModel;", "p0", "", "p1", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/util/List;Ljava/lang/String;)Lcom/marrow2/data/course_config/remote/model/FreeVideoListRSModel;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "lessons", "Ljava/util/List;", "getLessons", "title", "Ljava/lang/String;", "getTitle"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreeVideoListRSModel implements Serializable {
    public static final int $stable = 8;
    private final List<SampleLessonRSModel> lessons;
    private final String title;

    public FreeVideoListRSModel(List<SampleLessonRSModel> list, String str) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.lessons = list;
        this.title = str;
    }

    public /* synthetic */ FreeVideoListRSModel(List list, String str, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i & 2) != 0 ? null : str);
    }

    @JsonProperty("lessons")
    public final List<SampleLessonRSModel> getLessons() {
        return this.lessons;
    }

    @JsonProperty("title")
    public final String getTitle() {
        return this.title;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FreeVideoListRSModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FreeVideoListRSModel copy$default(FreeVideoListRSModel freeVideoListRSModel, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = freeVideoListRSModel.lessons;
        }
        if ((i & 2) != 0) {
            str = freeVideoListRSModel.title;
        }
        return freeVideoListRSModel.copy(list, str);
    }

    public final List<SampleLessonRSModel> component1() {
        return this.lessons;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final FreeVideoListRSModel copy(List<SampleLessonRSModel> p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new FreeVideoListRSModel(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof FreeVideoListRSModel)) {
            return false;
        }
        FreeVideoListRSModel freeVideoListRSModel = (FreeVideoListRSModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.lessons, freeVideoListRSModel.lessons) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.title, (Object) freeVideoListRSModel.title);
    }

    public final int hashCode() {
        int iHashCode = this.lessons.hashCode();
        String str = this.title;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        List<SampleLessonRSModel> list = this.lessons;
        String str = this.title;
        StringBuilder sb = new StringBuilder("FreeVideoListRSModel(lessons=");
        sb.append(list);
        sb.append(", title=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
