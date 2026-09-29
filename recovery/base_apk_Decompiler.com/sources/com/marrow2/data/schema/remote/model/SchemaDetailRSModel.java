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
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J4\u0010\u0011\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\u000e\b\u0003\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0003\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\fR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\fR \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001a\u0010 \u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0010"}, d2 = {"Lcom/marrow2/data/schema/remote/model/SchemaDetailRSModel;", "", "", "p0", "", "Lcom/marrow2/data/schema/remote/model/SchemaDetailLessonV2;", "p1", "Lcom/marrow2/data/schema/remote/model/SchemaUserStatusRSModel;", "p2", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/marrow2/data/schema/remote/model/SchemaUserStatusRSModel;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Lcom/marrow2/data/schema/remote/model/SchemaUserStatusRSModel;", "copy", "(Ljava/lang/String;Ljava/util/List;Lcom/marrow2/data/schema/remote/model/SchemaUserStatusRSModel;)Lcom/marrow2/data/schema/remote/model/SchemaDetailRSModel;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "schemaId", "Ljava/lang/String;", "getSchemaId", "lessons", "Ljava/util/List;", "getLessons", "userContext", "Lcom/marrow2/data/schema/remote/model/SchemaUserStatusRSModel;", "getUserContext"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SchemaDetailRSModel {
    public static final int $stable = 8;
    private final List<SchemaDetailLessonV2> lessons;
    private final String schemaId;
    private final SchemaUserStatusRSModel userContext;

    public SchemaDetailRSModel(@JsonProperty("_id") String str, @JsonProperty("lessons") List<SchemaDetailLessonV2> list, @JsonProperty("user_context") SchemaUserStatusRSModel schemaUserStatusRSModel) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(schemaUserStatusRSModel, "");
        this.schemaId = str;
        this.lessons = list;
        this.userContext = schemaUserStatusRSModel;
    }

    public /* synthetic */ SchemaDetailRSModel(String str, List list, SchemaUserStatusRSModel schemaUserStatusRSModel, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, schemaUserStatusRSModel);
    }

    public final String getSchemaId() {
        return this.schemaId;
    }

    public final List<SchemaDetailLessonV2> getLessons() {
        return this.lessons;
    }

    public final SchemaUserStatusRSModel getUserContext() {
        return this.userContext;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SchemaDetailRSModel copy$default(SchemaDetailRSModel schemaDetailRSModel, String str, List list, SchemaUserStatusRSModel schemaUserStatusRSModel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = schemaDetailRSModel.schemaId;
        }
        if ((i & 2) != 0) {
            list = schemaDetailRSModel.lessons;
        }
        if ((i & 4) != 0) {
            schemaUserStatusRSModel = schemaDetailRSModel.userContext;
        }
        return schemaDetailRSModel.copy(str, list, schemaUserStatusRSModel);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSchemaId() {
        return this.schemaId;
    }

    public final List<SchemaDetailLessonV2> component2() {
        return this.lessons;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final SchemaUserStatusRSModel getUserContext() {
        return this.userContext;
    }

    public final SchemaDetailRSModel copy(@JsonProperty("_id") String p0, @JsonProperty("lessons") List<SchemaDetailLessonV2> p1, @JsonProperty("user_context") SchemaUserStatusRSModel p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        return new SchemaDetailRSModel(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SchemaDetailRSModel)) {
            return false;
        }
        SchemaDetailRSModel schemaDetailRSModel = (SchemaDetailRSModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.schemaId, (Object) schemaDetailRSModel.schemaId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.lessons, schemaDetailRSModel.lessons) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.userContext, schemaDetailRSModel.userContext);
    }

    public final int hashCode() {
        return (((this.schemaId.hashCode() * 31) + this.lessons.hashCode()) * 31) + this.userContext.hashCode();
    }

    public final String toString() {
        String str = this.schemaId;
        List<SchemaDetailLessonV2> list = this.lessons;
        SchemaUserStatusRSModel schemaUserStatusRSModel = this.userContext;
        StringBuilder sb = new StringBuilder("SchemaDetailRSModel(schemaId=");
        sb.append(str);
        sb.append(", lessons=");
        sb.append(list);
        sb.append(", userContext=");
        sb.append(schemaUserStatusRSModel);
        sb.append(")");
        return sb.toString();
    }
}
