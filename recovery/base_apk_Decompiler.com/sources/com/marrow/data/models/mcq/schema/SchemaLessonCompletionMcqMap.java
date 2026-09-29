package com.marrow.data.models.mcq.schema;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ.\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\fJ\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\nR\u0017\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\nR\u001a\u0010\u0018\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\fR\u001a\u0010\u001b\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001c\u0010\f"}, d2 = {"Lcom/marrow/data/models/mcq/schema/SchemaLessonCompletionMcqMap;", "", "", "p0", "", "p1", "p2", "<init>", "(Ljava/lang/String;II)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "copy", "(Ljava/lang/String;II)Lcom/marrow/data/models/mcq/schema/SchemaLessonCompletionMcqMap;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "lessonId", "Ljava/lang/String;", "getLessonId", "schemaMcqCount", "I", "getSchemaMcqCount", "status", "getStatus"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SchemaLessonCompletionMcqMap {
    private final String lessonId;
    private final int schemaMcqCount;
    private final int status;

    public SchemaLessonCompletionMcqMap(@JsonProperty("lesson_id") String str, @JsonProperty("schema_mcq_count") int i, @JsonProperty("status") int i2) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.lessonId = str;
        this.schemaMcqCount = i;
        this.status = i2;
    }

    public final String getLessonId() {
        return this.lessonId;
    }

    public final int getSchemaMcqCount() {
        return this.schemaMcqCount;
    }

    public final int getStatus() {
        return this.status;
    }

    public static /* synthetic */ SchemaLessonCompletionMcqMap copy$default(SchemaLessonCompletionMcqMap schemaLessonCompletionMcqMap, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = schemaLessonCompletionMcqMap.lessonId;
        }
        if ((i3 & 2) != 0) {
            i = schemaLessonCompletionMcqMap.schemaMcqCount;
        }
        if ((i3 & 4) != 0) {
            i2 = schemaLessonCompletionMcqMap.status;
        }
        return schemaLessonCompletionMcqMap.copy(str, i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLessonId() {
        return this.lessonId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSchemaMcqCount() {
        return this.schemaMcqCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    public final SchemaLessonCompletionMcqMap copy(@JsonProperty("lesson_id") String p0, @JsonProperty("schema_mcq_count") int p1, @JsonProperty("status") int p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new SchemaLessonCompletionMcqMap(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SchemaLessonCompletionMcqMap)) {
            return false;
        }
        SchemaLessonCompletionMcqMap schemaLessonCompletionMcqMap = (SchemaLessonCompletionMcqMap) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.lessonId, (Object) schemaLessonCompletionMcqMap.lessonId) && this.schemaMcqCount == schemaLessonCompletionMcqMap.schemaMcqCount && this.status == schemaLessonCompletionMcqMap.status;
    }

    public final int hashCode() {
        return (((this.lessonId.hashCode() * 31) + Integer.hashCode(this.schemaMcqCount)) * 31) + Integer.hashCode(this.status);
    }

    public final String toString() {
        String str = this.lessonId;
        int i = this.schemaMcqCount;
        int i2 = this.status;
        StringBuilder sb = new StringBuilder("SchemaLessonCompletionMcqMap(lessonId=");
        sb.append(str);
        sb.append(", schemaMcqCount=");
        sb.append(i);
        sb.append(", status=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }
}
