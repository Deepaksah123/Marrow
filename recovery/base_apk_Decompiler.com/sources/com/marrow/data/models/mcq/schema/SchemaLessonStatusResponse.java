package com.marrow.data.models.mcq.schema;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J>\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0012J\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000eR\u0017\u0010\u001c\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0010R\u001a\u0010\"\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0012R\u001a\u0010%\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0014"}, d2 = {"Lcom/marrow/data/models/mcq/schema/SchemaLessonStatusResponse;", "", "", "p0", "", "Lcom/marrow/data/models/mcq/schema/SchemaLessonCompletionMcqMap;", "p1", "", "p2", "", "p3", "<init>", "(Ljava/lang/String;Ljava/util/List;IJ)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()I", "component4", "()J", "copy", "(Ljava/lang/String;Ljava/util/List;IJ)Lcom/marrow/data/models/mcq/schema/SchemaLessonStatusResponse;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "schemaId", "Ljava/lang/String;", "getSchemaId", "listOfLessonCompletions", "Ljava/util/List;", "getListOfLessonCompletions", "schemaCompletion", "I", "getSchemaCompletion", "lastLessonSubmittedOn", "J", "getLastLessonSubmittedOn"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SchemaLessonStatusResponse {
    private final long lastLessonSubmittedOn;
    private final List<SchemaLessonCompletionMcqMap> listOfLessonCompletions;
    private final int schemaCompletion;
    private final String schemaId;

    public SchemaLessonStatusResponse(@JsonProperty("_id") String str, @JsonProperty("lessons") List<SchemaLessonCompletionMcqMap> list, @JsonProperty("status") int i, @JsonProperty("last_lesson_submitted_on") long j) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.schemaId = str;
        this.listOfLessonCompletions = list;
        this.schemaCompletion = i;
        this.lastLessonSubmittedOn = j;
    }

    public final String getSchemaId() {
        return this.schemaId;
    }

    public final List<SchemaLessonCompletionMcqMap> getListOfLessonCompletions() {
        return this.listOfLessonCompletions;
    }

    public final int getSchemaCompletion() {
        return this.schemaCompletion;
    }

    public final long getLastLessonSubmittedOn() {
        return this.lastLessonSubmittedOn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SchemaLessonStatusResponse copy$default(SchemaLessonStatusResponse schemaLessonStatusResponse, String str, List list, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = schemaLessonStatusResponse.schemaId;
        }
        if ((i2 & 2) != 0) {
            list = schemaLessonStatusResponse.listOfLessonCompletions;
        }
        List list2 = list;
        if ((i2 & 4) != 0) {
            i = schemaLessonStatusResponse.schemaCompletion;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            j = schemaLessonStatusResponse.lastLessonSubmittedOn;
        }
        return schemaLessonStatusResponse.copy(str, list2, i3, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSchemaId() {
        return this.schemaId;
    }

    public final List<SchemaLessonCompletionMcqMap> component2() {
        return this.listOfLessonCompletions;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSchemaCompletion() {
        return this.schemaCompletion;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getLastLessonSubmittedOn() {
        return this.lastLessonSubmittedOn;
    }

    public final SchemaLessonStatusResponse copy(@JsonProperty("_id") String p0, @JsonProperty("lessons") List<SchemaLessonCompletionMcqMap> p1, @JsonProperty("status") int p2, @JsonProperty("last_lesson_submitted_on") long p3) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return new SchemaLessonStatusResponse(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SchemaLessonStatusResponse)) {
            return false;
        }
        SchemaLessonStatusResponse schemaLessonStatusResponse = (SchemaLessonStatusResponse) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.schemaId, (Object) schemaLessonStatusResponse.schemaId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.listOfLessonCompletions, schemaLessonStatusResponse.listOfLessonCompletions) && this.schemaCompletion == schemaLessonStatusResponse.schemaCompletion && this.lastLessonSubmittedOn == schemaLessonStatusResponse.lastLessonSubmittedOn;
    }

    public final int hashCode() {
        return (((((this.schemaId.hashCode() * 31) + this.listOfLessonCompletions.hashCode()) * 31) + Integer.hashCode(this.schemaCompletion)) * 31) + Long.hashCode(this.lastLessonSubmittedOn);
    }

    public final String toString() {
        String str = this.schemaId;
        List<SchemaLessonCompletionMcqMap> list = this.listOfLessonCompletions;
        int i = this.schemaCompletion;
        long j = this.lastLessonSubmittedOn;
        StringBuilder sb = new StringBuilder("SchemaLessonStatusResponse(schemaId=");
        sb.append(str);
        sb.append(", listOfLessonCompletions=");
        sb.append(list);
        sb.append(", schemaCompletion=");
        sb.append(i);
        sb.append(", lastLessonSubmittedOn=");
        sb.append(j);
        sb.append(")");
        return sb.toString();
    }
}
