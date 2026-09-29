package com.marrow.data.models.lesson;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u0017\u0010\u0017\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u001a\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\fR\u001a\u0010\u001c\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/marrow/data/models/lesson/AssociatedLessonIndex;", "Ljava/io/Serializable;", "", "p0", "", "p1", "p2", "<init>", "(Ljava/lang/String;ZZ)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "copy", "(Ljava/lang/String;ZZ)Lcom/marrow/data/models/lesson/AssociatedLessonIndex;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "lessonId", "Ljava/lang/String;", "getLessonId", "isInternMode", "Z", "isRelatedModule", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AssociatedLessonIndex implements Serializable {
    private static final String KEY_IS_INTERN_MODE = "is_concise_mode";
    private static final String KEY_IS_RELATED_MODULE = "is_related_module";
    private static final String KEY_LESSON_ID = "_id";
    private final boolean isInternMode;
    private final boolean isRelatedModule;
    private final String lessonId;

    public AssociatedLessonIndex(@JsonProperty("_id") String str, @JsonProperty(KEY_IS_INTERN_MODE) boolean z, @JsonProperty(KEY_IS_RELATED_MODULE) boolean z2) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.lessonId = str;
        this.isInternMode = z;
        this.isRelatedModule = z2;
    }

    public final String getLessonId() {
        return this.lessonId;
    }

    public final boolean isInternMode() {
        return this.isInternMode;
    }

    public final boolean isRelatedModule() {
        return this.isRelatedModule;
    }

    public static /* synthetic */ AssociatedLessonIndex copy$default(AssociatedLessonIndex associatedLessonIndex, String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = associatedLessonIndex.lessonId;
        }
        if ((i & 2) != 0) {
            z = associatedLessonIndex.isInternMode;
        }
        if ((i & 4) != 0) {
            z2 = associatedLessonIndex.isRelatedModule;
        }
        return associatedLessonIndex.copy(str, z, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLessonId() {
        return this.lessonId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsInternMode() {
        return this.isInternMode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsRelatedModule() {
        return this.isRelatedModule;
    }

    public final AssociatedLessonIndex copy(@JsonProperty("_id") String p0, @JsonProperty(KEY_IS_INTERN_MODE) boolean p1, @JsonProperty(KEY_IS_RELATED_MODULE) boolean p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new AssociatedLessonIndex(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof AssociatedLessonIndex)) {
            return false;
        }
        AssociatedLessonIndex associatedLessonIndex = (AssociatedLessonIndex) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.lessonId, (Object) associatedLessonIndex.lessonId) && this.isInternMode == associatedLessonIndex.isInternMode && this.isRelatedModule == associatedLessonIndex.isRelatedModule;
    }

    public final int hashCode() {
        return (((this.lessonId.hashCode() * 31) + Boolean.hashCode(this.isInternMode)) * 31) + Boolean.hashCode(this.isRelatedModule);
    }

    public final String toString() {
        String str = this.lessonId;
        boolean z = this.isInternMode;
        boolean z2 = this.isRelatedModule;
        StringBuilder sb = new StringBuilder("AssociatedLessonIndex(lessonId=");
        sb.append(str);
        sb.append(", isInternMode=");
        sb.append(z);
        sb.append(", isRelatedModule=");
        sb.append(z2);
        sb.append(")");
        return sb.toString();
    }
}
