package com.marrow.data.models.lesson;

import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001c\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013JB\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u0017\u0010\u001a\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\u001d\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u001f\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010\u0010R\u001a\u0010!\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010 \u001a\u0004\b!\u0010\u0010R\u001a\u0010\"\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0013"}, d2 = {"Lcom/marrow/data/models/lesson/ConcisedLessonParentInfo;", "", "", "p0", "p1", "", "p2", "p3", "", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZZI)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "component5", "()I", "copy", "(Ljava/lang/String;Ljava/lang/String;ZZI)Lcom/marrow/data/models/lesson/ConcisedLessonParentInfo;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "conciseId", "Ljava/lang/String;", "getConciseId", "parentId", "getParentId", "isInternModule", "Z", "isRelatedModule", "sortOrder", "I", "getSortOrder"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ConcisedLessonParentInfo {
    private final String conciseId;
    private final boolean isInternModule;
    private final boolean isRelatedModule;
    private final String parentId;
    private final int sortOrder;

    public ConcisedLessonParentInfo(String str, String str2, boolean z, boolean z2, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.conciseId = str;
        this.parentId = str2;
        this.isInternModule = z;
        this.isRelatedModule = z2;
        this.sortOrder = i;
    }

    public final String getConciseId() {
        return this.conciseId;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final boolean isInternModule() {
        return this.isInternModule;
    }

    public final boolean isRelatedModule() {
        return this.isRelatedModule;
    }

    public final int getSortOrder() {
        return this.sortOrder;
    }

    public static /* synthetic */ ConcisedLessonParentInfo copy$default(ConcisedLessonParentInfo concisedLessonParentInfo, String str, String str2, boolean z, boolean z2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = concisedLessonParentInfo.conciseId;
        }
        if ((i2 & 2) != 0) {
            str2 = concisedLessonParentInfo.parentId;
        }
        String str3 = str2;
        if ((i2 & 4) != 0) {
            z = concisedLessonParentInfo.isInternModule;
        }
        boolean z3 = z;
        if ((i2 & 8) != 0) {
            z2 = concisedLessonParentInfo.isRelatedModule;
        }
        boolean z4 = z2;
        if ((i2 & 16) != 0) {
            i = concisedLessonParentInfo.sortOrder;
        }
        return concisedLessonParentInfo.copy(str, str3, z3, z4, i);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getConciseId() {
        return this.conciseId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsInternModule() {
        return this.isInternModule;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsRelatedModule() {
        return this.isRelatedModule;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getSortOrder() {
        return this.sortOrder;
    }

    public final ConcisedLessonParentInfo copy(String p0, String p1, boolean p2, boolean p3, int p4) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return new ConcisedLessonParentInfo(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ConcisedLessonParentInfo)) {
            return false;
        }
        ConcisedLessonParentInfo concisedLessonParentInfo = (ConcisedLessonParentInfo) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.conciseId, (Object) concisedLessonParentInfo.conciseId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.parentId, (Object) concisedLessonParentInfo.parentId) && this.isInternModule == concisedLessonParentInfo.isInternModule && this.isRelatedModule == concisedLessonParentInfo.isRelatedModule && this.sortOrder == concisedLessonParentInfo.sortOrder;
    }

    public final int hashCode() {
        return (((((((this.conciseId.hashCode() * 31) + this.parentId.hashCode()) * 31) + Boolean.hashCode(this.isInternModule)) * 31) + Boolean.hashCode(this.isRelatedModule)) * 31) + Integer.hashCode(this.sortOrder);
    }

    public final String toString() {
        String str = this.conciseId;
        String str2 = this.parentId;
        boolean z = this.isInternModule;
        boolean z2 = this.isRelatedModule;
        int i = this.sortOrder;
        StringBuilder sb = new StringBuilder("ConcisedLessonParentInfo(conciseId=");
        sb.append(str);
        sb.append(", parentId=");
        sb.append(str2);
        sb.append(", isInternModule=");
        sb.append(z);
        sb.append(", isRelatedModule=");
        sb.append(z2);
        sb.append(", sortOrder=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
