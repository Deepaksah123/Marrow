package com.marrow.data.models.mcq.schema;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.common.SchemaUserStatus;
import java.util.List;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0001\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0003\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\fR\u0017\u0010\u001a\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\fR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010 \u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0010"}, d2 = {"Lcom/marrow/data/models/mcq/schema/SchemaDetail;", "", "", "p0", "", "Lcom/marrow/data/models/mcq/schema/SchemaDetailLesson;", "p1", "Lcom/marrow/data/models/common/SchemaUserStatus;", "p2", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/marrow/data/models/common/SchemaUserStatus;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/marrow/data/models/common/SchemaUserStatus;", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/marrow/data/models/common/SchemaUserStatus;)Lcom/marrow/data/models/mcq/schema/SchemaDetail;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "schemaId", "Ljava/lang/String;", "getSchemaId", "lessons", "Ljava/util/List;", "getLessons", "userContext", "Lcom/marrow/data/models/common/SchemaUserStatus;", "getUserContext"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SchemaDetail {
    private final List<SchemaDetailLesson> lessons;
    private final String schemaId;
    private final SchemaUserStatus userContext;

    public SchemaDetail(@JsonProperty("_id") String str, @JsonProperty("lessons") List<SchemaDetailLesson> list, @JsonProperty("user_context") SchemaUserStatus schemaUserStatus) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(schemaUserStatus, "");
        this.schemaId = str;
        this.lessons = list;
        this.userContext = schemaUserStatus;
    }

    public final String getSchemaId() {
        return this.schemaId;
    }

    public final List<SchemaDetailLesson> getLessons() {
        return this.lessons;
    }

    public final SchemaUserStatus getUserContext() {
        return this.userContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SchemaDetail copy$default(SchemaDetail schemaDetail, String str, List list, SchemaUserStatus schemaUserStatus, int i, Object obj) {
        if ((i & 1) != 0) {
            str = schemaDetail.schemaId;
        }
        if ((i & 2) != 0) {
            list = schemaDetail.lessons;
        }
        if ((i & 4) != 0) {
            schemaUserStatus = schemaDetail.userContext;
        }
        return schemaDetail.copy(str, list, schemaUserStatus);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSchemaId() {
        return this.schemaId;
    }

    public final List<SchemaDetailLesson> component2() {
        return this.lessons;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SchemaUserStatus getUserContext() {
        return this.userContext;
    }

    public final SchemaDetail copy(@JsonProperty("_id") String p0, @JsonProperty("lessons") List<SchemaDetailLesson> p1, @JsonProperty("user_context") SchemaUserStatus p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        return new SchemaDetail(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SchemaDetail)) {
            return false;
        }
        SchemaDetail schemaDetail = (SchemaDetail) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.schemaId, (Object) schemaDetail.schemaId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.lessons, schemaDetail.lessons) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.userContext, schemaDetail.userContext);
    }

    public final int hashCode() {
        return (((this.schemaId.hashCode() * 31) + this.lessons.hashCode()) * 31) + this.userContext.hashCode();
    }

    public final String toString() {
        String str = this.schemaId;
        List<SchemaDetailLesson> list = this.lessons;
        SchemaUserStatus schemaUserStatus = this.userContext;
        StringBuilder sb = new StringBuilder("SchemaDetail(schemaId=");
        sb.append(str);
        sb.append(", lessons=");
        sb.append(list);
        sb.append(", userContext=");
        sb.append(schemaUserStatus);
        sb.append(")");
        return sb.toString();
    }
}
