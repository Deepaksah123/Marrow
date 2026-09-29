package com.marrow2.data.schema.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\b\b\u0003\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J>\u0010\u0015\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0012J\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000eR\u0017\u0010\u001c\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0010R\u001a\u0010\"\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0012R\u001a\u0010%\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0014"}, d2 = {"Lcom/marrow2/data/schema/remote/model/SchemaCompletionStatusRSModel;", "", "", "p0", "", "Lcom/marrow2/data/schema/remote/model/SchemaLessonStatus;", "p1", "", "p2", "", "p3", "<init>", "(Ljava/lang/String;Ljava/util/List;IJ)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()I", "component4", "()J", "copy", "(Ljava/lang/String;Ljava/util/List;IJ)Lcom/marrow2/data/schema/remote/model/SchemaCompletionStatusRSModel;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "schemaId", "Ljava/lang/String;", "getSchemaId", "listOfAssociatedLessons", "Ljava/util/List;", "getListOfAssociatedLessons", "schemaCompletion", "I", "getSchemaCompletion", "lastLessonSubmittedOn", "J", "getLastLessonSubmittedOn"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SchemaCompletionStatusRSModel {
    public static final int $stable = 8;
    private final long lastLessonSubmittedOn;
    private final List<SchemaLessonStatus> listOfAssociatedLessons;
    private final int schemaCompletion;
    private final String schemaId;

    public SchemaCompletionStatusRSModel(@JsonProperty("_id") String str, @JsonProperty("lessons") List<SchemaLessonStatus> list, @JsonProperty("status") int i, @JsonProperty("last_lesson_submitted_on") long j) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.schemaId = str;
        this.listOfAssociatedLessons = list;
        this.schemaCompletion = i;
        this.lastLessonSubmittedOn = j;
    }

    public final String getSchemaId() {
        return this.schemaId;
    }

    public /* synthetic */ SchemaCompletionStatusRSModel(String str, List list, int i, long j, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, (i2 & 2) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, i, (i2 & 8) != 0 ? 0L : j);
    }

    public final List<SchemaLessonStatus> getListOfAssociatedLessons() {
        return this.listOfAssociatedLessons;
    }

    public final int getSchemaCompletion() {
        return this.schemaCompletion;
    }

    public final long getLastLessonSubmittedOn() {
        return this.lastLessonSubmittedOn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SchemaCompletionStatusRSModel copy$default(SchemaCompletionStatusRSModel schemaCompletionStatusRSModel, String str, List list, int i, long j, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = schemaCompletionStatusRSModel.schemaId;
        }
        if ((i2 & 2) != 0) {
            list = schemaCompletionStatusRSModel.listOfAssociatedLessons;
        }
        List list2 = list;
        if ((i2 & 4) != 0) {
            i = schemaCompletionStatusRSModel.schemaCompletion;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            j = schemaCompletionStatusRSModel.lastLessonSubmittedOn;
        }
        return schemaCompletionStatusRSModel.copy(str, list2, i3, j);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSchemaId() {
        return this.schemaId;
    }

    public final List<SchemaLessonStatus> component2() {
        return this.listOfAssociatedLessons;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSchemaCompletion() {
        return this.schemaCompletion;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getLastLessonSubmittedOn() {
        return this.lastLessonSubmittedOn;
    }

    public final SchemaCompletionStatusRSModel copy(@JsonProperty("_id") String p0, @JsonProperty("lessons") List<SchemaLessonStatus> p1, @JsonProperty("status") int p2, @JsonProperty("last_lesson_submitted_on") long p3) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return new SchemaCompletionStatusRSModel(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SchemaCompletionStatusRSModel)) {
            return false;
        }
        SchemaCompletionStatusRSModel schemaCompletionStatusRSModel = (SchemaCompletionStatusRSModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.schemaId, (Object) schemaCompletionStatusRSModel.schemaId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.listOfAssociatedLessons, schemaCompletionStatusRSModel.listOfAssociatedLessons) && this.schemaCompletion == schemaCompletionStatusRSModel.schemaCompletion && this.lastLessonSubmittedOn == schemaCompletionStatusRSModel.lastLessonSubmittedOn;
    }

    public final int hashCode() {
        return (((((this.schemaId.hashCode() * 31) + this.listOfAssociatedLessons.hashCode()) * 31) + Integer.hashCode(this.schemaCompletion)) * 31) + Long.hashCode(this.lastLessonSubmittedOn);
    }

    public final String toString() {
        String str = this.schemaId;
        List<SchemaLessonStatus> list = this.listOfAssociatedLessons;
        int i = this.schemaCompletion;
        long j = this.lastLessonSubmittedOn;
        StringBuilder sb = new StringBuilder("SchemaCompletionStatusRSModel(schemaId=");
        sb.append(str);
        sb.append(", listOfAssociatedLessons=");
        sb.append(list);
        sb.append(", schemaCompletion=");
        sb.append(i);
        sb.append(", lastLessonSubmittedOn=");
        sb.append(j);
        sb.append(")");
        return sb.toString();
    }
}
