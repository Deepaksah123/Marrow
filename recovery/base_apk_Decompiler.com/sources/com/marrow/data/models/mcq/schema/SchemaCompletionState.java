package com.marrow.data.models.mcq.schema;

import java.util.List;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0013\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001a\u0010\u001e\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001a\u0010!\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0010"}, d2 = {"Lcom/marrow/data/models/mcq/schema/SchemaCompletionState;", "", "", "Lcom/marrow/data/models/mcq/schema/LessonQbankItem;", "p0", "", "p1", "", "p2", "<init>", "(Ljava/util/List;ZJ)V", "component1", "()Ljava/util/List;", "component2", "()Z", "component3", "()J", "copy", "(Ljava/util/List;ZJ)Lcom/marrow/data/models/mcq/schema/SchemaCompletionState;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "listOfSchemaQbankItems", "Ljava/util/List;", "getListOfSchemaQbankItems", "schemaCompleteionStatus", "Z", "getSchemaCompleteionStatus", "lastLessonSubmittedOn", "J", "getLastLessonSubmittedOn"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SchemaCompletionState {
    private final long lastLessonSubmittedOn;
    private final List<LessonQbankItem> listOfSchemaQbankItems;
    private final boolean schemaCompleteionStatus;

    public SchemaCompletionState(List<LessonQbankItem> list, boolean z, long j) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.listOfSchemaQbankItems = list;
        this.schemaCompleteionStatus = z;
        this.lastLessonSubmittedOn = j;
    }

    public final List<LessonQbankItem> getListOfSchemaQbankItems() {
        return this.listOfSchemaQbankItems;
    }

    public final boolean getSchemaCompleteionStatus() {
        return this.schemaCompleteionStatus;
    }

    public final long getLastLessonSubmittedOn() {
        return this.lastLessonSubmittedOn;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SchemaCompletionState copy$default(SchemaCompletionState schemaCompletionState, List list, boolean z, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            list = schemaCompletionState.listOfSchemaQbankItems;
        }
        if ((i & 2) != 0) {
            z = schemaCompletionState.schemaCompleteionStatus;
        }
        if ((i & 4) != 0) {
            j = schemaCompletionState.lastLessonSubmittedOn;
        }
        return schemaCompletionState.copy(list, z, j);
    }

    public final List<LessonQbankItem> component1() {
        return this.listOfSchemaQbankItems;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getSchemaCompleteionStatus() {
        return this.schemaCompleteionStatus;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getLastLessonSubmittedOn() {
        return this.lastLessonSubmittedOn;
    }

    public final SchemaCompletionState copy(List<LessonQbankItem> p0, boolean p1, long p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return new SchemaCompletionState(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SchemaCompletionState)) {
            return false;
        }
        SchemaCompletionState schemaCompletionState = (SchemaCompletionState) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.listOfSchemaQbankItems, schemaCompletionState.listOfSchemaQbankItems) && this.schemaCompleteionStatus == schemaCompletionState.schemaCompleteionStatus && this.lastLessonSubmittedOn == schemaCompletionState.lastLessonSubmittedOn;
    }

    public final int hashCode() {
        return (((this.listOfSchemaQbankItems.hashCode() * 31) + Boolean.hashCode(this.schemaCompleteionStatus)) * 31) + Long.hashCode(this.lastLessonSubmittedOn);
    }

    public final String toString() {
        List<LessonQbankItem> list = this.listOfSchemaQbankItems;
        boolean z = this.schemaCompleteionStatus;
        long j = this.lastLessonSubmittedOn;
        StringBuilder sb = new StringBuilder("SchemaCompletionState(listOfSchemaQbankItems=");
        sb.append(list);
        sb.append(", schemaCompleteionStatus=");
        sb.append(z);
        sb.append(", lastLessonSubmittedOn=");
        sb.append(j);
        sb.append(")");
        return sb.toString();
    }
}
