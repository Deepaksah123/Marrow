package com.marrow.data.models.lesson;

import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ$\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\fR\u0017\u0010\u0017\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\fR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\fR$\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00138\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015R$\u0010\u001f\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00138\u0007@BX\u0087\u000e¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0015"}, d2 = {"Lcom/marrow/data/models/lesson/McqSchemaGroupInfo;", "", "", "p0", "p1", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "incrementCorrect", "()V", "incrementTotalCount", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/marrow/data/models/lesson/McqSchemaGroupInfo;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "schemaId", "Ljava/lang/String;", "getSchemaId", "schemaTitle", "getSchemaTitle", "correctCount", "I", "getCorrectCount", "totalCount", "getTotalCount"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class McqSchemaGroupInfo {
    private int correctCount;
    private final String schemaId;
    private final String schemaTitle;
    private int totalCount;

    public McqSchemaGroupInfo(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.schemaId = str;
        this.schemaTitle = str2;
    }

    public final String getSchemaId() {
        return this.schemaId;
    }

    public final String getSchemaTitle() {
        return this.schemaTitle;
    }

    public final int getCorrectCount() {
        return this.correctCount;
    }

    public final int getTotalCount() {
        return this.totalCount;
    }

    public final void incrementCorrect() {
        this.correctCount++;
    }

    public final void incrementTotalCount() {
        this.totalCount++;
    }

    public static /* synthetic */ McqSchemaGroupInfo copy$default(McqSchemaGroupInfo mcqSchemaGroupInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mcqSchemaGroupInfo.schemaId;
        }
        if ((i & 2) != 0) {
            str2 = mcqSchemaGroupInfo.schemaTitle;
        }
        return mcqSchemaGroupInfo.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSchemaId() {
        return this.schemaId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSchemaTitle() {
        return this.schemaTitle;
    }

    public final McqSchemaGroupInfo copy(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return new McqSchemaGroupInfo(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof McqSchemaGroupInfo)) {
            return false;
        }
        McqSchemaGroupInfo mcqSchemaGroupInfo = (McqSchemaGroupInfo) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.schemaId, (Object) mcqSchemaGroupInfo.schemaId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.schemaTitle, (Object) mcqSchemaGroupInfo.schemaTitle);
    }

    public final int hashCode() {
        return (this.schemaId.hashCode() * 31) + this.schemaTitle.hashCode();
    }

    public final String toString() {
        String str = this.schemaId;
        String str2 = this.schemaTitle;
        StringBuilder sb = new StringBuilder("McqSchemaGroupInfo(schemaId=");
        sb.append(str);
        sb.append(", schemaTitle=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
