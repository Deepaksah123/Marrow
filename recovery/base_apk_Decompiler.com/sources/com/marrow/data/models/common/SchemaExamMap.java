package com.marrow.data.models.common;

import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\bR\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/marrow/data/models/common/SchemaExamMap;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/marrow/data/models/common/SchemaExamMap;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "schemaId", "Ljava/lang/String;", "getSchemaId", "examName", "getExamName"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SchemaExamMap {
    private final String examName;
    private final String schemaId;

    public SchemaExamMap(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.schemaId = str;
        this.examName = str2;
    }

    public final String getSchemaId() {
        return this.schemaId;
    }

    public final String getExamName() {
        return this.examName;
    }

    public static /* synthetic */ SchemaExamMap copy$default(SchemaExamMap schemaExamMap, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = schemaExamMap.schemaId;
        }
        if ((i & 2) != 0) {
            str2 = schemaExamMap.examName;
        }
        return schemaExamMap.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSchemaId() {
        return this.schemaId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getExamName() {
        return this.examName;
    }

    public final SchemaExamMap copy(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return new SchemaExamMap(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SchemaExamMap)) {
            return false;
        }
        SchemaExamMap schemaExamMap = (SchemaExamMap) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.schemaId, (Object) schemaExamMap.schemaId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.examName, (Object) schemaExamMap.examName);
    }

    public final int hashCode() {
        return (this.schemaId.hashCode() * 31) + this.examName.hashCode();
    }

    public final String toString() {
        String str = this.schemaId;
        String str2 = this.examName;
        StringBuilder sb = new StringBuilder("SchemaExamMap(schemaId=");
        sb.append(str);
        sb.append(", examName=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
