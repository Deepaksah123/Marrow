package com.marrow.data.models.mcq.schema;

import java.util.List;
import kotlin.IntermediateLoginResponseBody;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\r2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0011JB\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0011R\u001a\u0010 \u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0011R\u001a\u0010#\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u0011R\u001a\u0010%\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0014R\u001a\u0010(\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010\u0011R\u001a\u0010*\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b+\u0010\u0011R0\u0010,\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/"}, d2 = {"Lcom/marrow/data/models/mcq/schema/SchemaLessonItem;", "", "", "p0", "p1", "", "p2", "p3", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)V", "", "Lcom/marrow/data/models/mcq/schema/McqAnswerIndex;", "", "setMcqs", "(Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()J", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;)Lcom/marrow/data/models/mcq/schema/SchemaLessonItem;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "lessonId", "Ljava/lang/String;", "getLessonId", "lessonName", "getLessonName", "solvedOn", "J", "getSolvedOn", "rootSubjectName", "getRootSubjectName", "stepId", "getStepId", "mcqAnswerIndexes", "Ljava/util/List;", "getMcqAnswerIndexes", "()Ljava/util/List;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SchemaLessonItem {
    private final String lessonId;
    private final String lessonName;
    private List<McqAnswerIndex> mcqAnswerIndexes;
    private final String rootSubjectName;
    private final long solvedOn;
    private final String stepId;

    public SchemaLessonItem(String str, String str2, long j, String str3, String str4) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        this.lessonId = str;
        this.lessonName = str2;
        this.solvedOn = j;
        this.rootSubjectName = str3;
        this.stepId = str4;
        this.mcqAnswerIndexes = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    public final String getLessonId() {
        return this.lessonId;
    }

    public final String getLessonName() {
        return this.lessonName;
    }

    public final long getSolvedOn() {
        return this.solvedOn;
    }

    public final String getRootSubjectName() {
        return this.rootSubjectName;
    }

    public final String getStepId() {
        return this.stepId;
    }

    public final List<McqAnswerIndex> getMcqAnswerIndexes() {
        return this.mcqAnswerIndexes;
    }

    public final void setMcqs(List<McqAnswerIndex> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.mcqAnswerIndexes = p0;
    }

    public static /* synthetic */ SchemaLessonItem copy$default(SchemaLessonItem schemaLessonItem, String str, String str2, long j, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = schemaLessonItem.lessonId;
        }
        if ((i & 2) != 0) {
            str2 = schemaLessonItem.lessonName;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            j = schemaLessonItem.solvedOn;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            str3 = schemaLessonItem.rootSubjectName;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = schemaLessonItem.stepId;
        }
        return schemaLessonItem.copy(str, str5, j2, str6, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLessonId() {
        return this.lessonId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLessonName() {
        return this.lessonName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getSolvedOn() {
        return this.solvedOn;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getRootSubjectName() {
        return this.rootSubjectName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStepId() {
        return this.stepId;
    }

    public final SchemaLessonItem copy(String p0, String p1, long p2, String p3, String p4) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        toMagicModuleMetaRepoModel.write(p4, "");
        return new SchemaLessonItem(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SchemaLessonItem)) {
            return false;
        }
        SchemaLessonItem schemaLessonItem = (SchemaLessonItem) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.lessonId, (Object) schemaLessonItem.lessonId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.lessonName, (Object) schemaLessonItem.lessonName) && this.solvedOn == schemaLessonItem.solvedOn && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.rootSubjectName, (Object) schemaLessonItem.rootSubjectName) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.stepId, (Object) schemaLessonItem.stepId);
    }

    public final int hashCode() {
        return (((((((this.lessonId.hashCode() * 31) + this.lessonName.hashCode()) * 31) + Long.hashCode(this.solvedOn)) * 31) + this.rootSubjectName.hashCode()) * 31) + this.stepId.hashCode();
    }

    public final String toString() {
        String str = this.lessonId;
        String str2 = this.lessonName;
        long j = this.solvedOn;
        String str3 = this.rootSubjectName;
        String str4 = this.stepId;
        StringBuilder sb = new StringBuilder("SchemaLessonItem(lessonId=");
        sb.append(str);
        sb.append(", lessonName=");
        sb.append(str2);
        sb.append(", solvedOn=");
        sb.append(j);
        sb.append(", rootSubjectName=");
        sb.append(str3);
        sb.append(", stepId=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }
}
