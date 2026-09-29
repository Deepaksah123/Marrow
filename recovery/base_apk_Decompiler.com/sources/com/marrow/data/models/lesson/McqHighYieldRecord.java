package com.marrow.data.models.lesson;

import java.util.Random;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\nR\u0017\u0010\u0017\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\nR\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\n"}, d2 = {"Lcom/marrow/data/models/lesson/McqHighYieldRecord;", "", "", "p0", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/marrow/data/models/lesson/McqHighYieldRecord;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "mcqId", "Ljava/lang/String;", "getMcqId", "highYieldId", "getHighYieldId", "parentId", "getParentId", "lessonId", "getLessonId"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class McqHighYieldRecord {
    public static int read;
    public static int write;
    private final String highYieldId;
    private final String lessonId;
    private final String mcqId;
    private final String parentId;

    public McqHighYieldRecord(String str, String str2, String str3, String str4) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        this.mcqId = str;
        this.highYieldId = str2;
        this.parentId = str3;
        this.lessonId = str4;
    }

    public final String getMcqId() {
        return this.mcqId;
    }

    public final String getHighYieldId() {
        return this.highYieldId;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final String getLessonId() {
        return this.lessonId;
    }

    public static /* synthetic */ McqHighYieldRecord copy$default(McqHighYieldRecord mcqHighYieldRecord, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mcqHighYieldRecord.mcqId;
        }
        if ((i & 2) != 0) {
            str2 = mcqHighYieldRecord.highYieldId;
        }
        if ((i & 4) != 0) {
            str3 = mcqHighYieldRecord.parentId;
        }
        if ((i & 8) != 0) {
            str4 = mcqHighYieldRecord.lessonId;
        }
        return mcqHighYieldRecord.copy(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMcqId() {
        return this.mcqId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHighYieldId() {
        return this.highYieldId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLessonId() {
        return this.lessonId;
    }

    public final McqHighYieldRecord copy(String p0, String p1, String p2, String p3) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        return new McqHighYieldRecord(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof McqHighYieldRecord)) {
            return false;
        }
        McqHighYieldRecord mcqHighYieldRecord = (McqHighYieldRecord) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.mcqId, (Object) mcqHighYieldRecord.mcqId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.highYieldId, (Object) mcqHighYieldRecord.highYieldId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.parentId, (Object) mcqHighYieldRecord.parentId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.lessonId, (Object) mcqHighYieldRecord.lessonId);
    }

    public final int hashCode() {
        return (((((this.mcqId.hashCode() * 31) + this.highYieldId.hashCode()) * 31) + this.parentId.hashCode()) * 31) + this.lessonId.hashCode();
    }

    public final String toString() {
        String str = this.mcqId;
        String str2 = this.highYieldId;
        String str3 = this.parentId;
        String str4 = this.lessonId;
        StringBuilder sb = new StringBuilder("McqHighYieldRecord(mcqId=");
        sb.append(str);
        sb.append(", highYieldId=");
        sb.append(str2);
        sb.append(", parentId=");
        sb.append(str3);
        sb.append(", lessonId=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }

    public static int AudioAttributesCompatParcelizer() {
        int i = write;
        int i2 = i % 7873883;
        write = i + 1;
        if (i2 != 0) {
            return read;
        }
        int iNextInt = new Random().nextInt(146560881);
        read = iNextInt;
        return iNextInt;
    }
}
