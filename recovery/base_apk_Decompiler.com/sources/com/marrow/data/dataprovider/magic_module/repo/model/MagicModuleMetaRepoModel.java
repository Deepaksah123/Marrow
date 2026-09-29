package com.marrow.data.dataprovider.magic_module.repo.model;

import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b2\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJl\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010!\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b#\u0010\u0019J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0012R\u0017\u0010%\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0012R\u001a\u0010(\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010\u0014R\u001a\u0010*\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0016R\u001a\u0010-\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010&\u001a\u0004\b.\u0010\u0012R\u001a\u0010/\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u0019R\u001a\u00102\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u00100\u001a\u0004\b3\u0010\u0019R\u001a\u00104\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010+\u001a\u0004\b5\u0010\u0016R\u001a\u00106\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u00100\u001a\u0004\b7\u0010\u0019R\u001c\u00108\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010\u001eR\u001a\u0010;\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010)\u001a\u0004\b;\u0010\u0014"}, d2 = {"Lcom/marrow/data/dataprovider/magic_module/repo/model/MagicModuleMetaRepoModel;", "", "", "p0", "", "p1", "", "p2", "p3", "", "p4", "p5", "p6", "p7", "p8", "<init>", "(Ljava/lang/String;ZJLjava/lang/String;IIJILjava/lang/Integer;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()J", "component4", "component5", "()I", "component6", "component7", "component8", "component9", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;ZJLjava/lang/String;IIJILjava/lang/Integer;)Lcom/marrow/data/dataprovider/magic_module/repo/model/MagicModuleMetaRepoModel;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "id", "Ljava/lang/String;", "getId", "isFirstModule", "Z", "createdOn", "J", "getCreatedOn", "moduleName", "getModuleName", "mcqCount", "I", "getMcqCount", "status", "getStatus", "submittedOn", "getSubmittedOn", "correctCount", "getCorrectCount", "errorCode", "Ljava/lang/Integer;", "getErrorCode", "isCompleted"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MagicModuleMetaRepoModel {
    private final int correctCount;
    private final long createdOn;
    private final Integer errorCode;
    private final String id;
    private final boolean isCompleted;
    private final boolean isFirstModule;
    private final int mcqCount;
    private final String moduleName;
    private final int status;
    private final long submittedOn;

    public MagicModuleMetaRepoModel(String str, boolean z, long j, String str2, int i, int i2, long j2, int i3, Integer num) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.id = str;
        this.isFirstModule = z;
        this.createdOn = j;
        this.moduleName = str2;
        this.mcqCount = i;
        this.status = i2;
        this.submittedOn = j2;
        this.correctCount = i3;
        this.errorCode = num;
        this.isCompleted = i2 == 2 && j2 > Long.MIN_VALUE;
    }

    public /* synthetic */ MagicModuleMetaRepoModel(String str, boolean z, long j, String str2, int i, int i2, long j2, int i3, Integer num, int i4, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, z, j, str2, i, i2, j2, i3, (i4 & 256) != 0 ? null : num);
    }

    public final String getId() {
        return this.id;
    }

    public final boolean isFirstModule() {
        return this.isFirstModule;
    }

    public final long getCreatedOn() {
        return this.createdOn;
    }

    public final String getModuleName() {
        return this.moduleName;
    }

    public final int getMcqCount() {
        return this.mcqCount;
    }

    public final int getStatus() {
        return this.status;
    }

    public final long getSubmittedOn() {
        return this.submittedOn;
    }

    public final int getCorrectCount() {
        return this.correctCount;
    }

    public final Integer getErrorCode() {
        return this.errorCode;
    }

    /* JADX INFO: renamed from: isCompleted, reason: from getter */
    public final boolean getIsCompleted() {
        return this.isCompleted;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsFirstModule() {
        return this.isFirstModule;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final long getCreatedOn() {
        return this.createdOn;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getModuleName() {
        return this.moduleName;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getMcqCount() {
        return this.mcqCount;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getSubmittedOn() {
        return this.submittedOn;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getCorrectCount() {
        return this.correctCount;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Integer getErrorCode() {
        return this.errorCode;
    }

    public final MagicModuleMetaRepoModel copy(String p0, boolean p1, long p2, String p3, int p4, int p5, long p6, int p7, Integer p8) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        return new MagicModuleMetaRepoModel(p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof MagicModuleMetaRepoModel)) {
            return false;
        }
        MagicModuleMetaRepoModel magicModuleMetaRepoModel = (MagicModuleMetaRepoModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) magicModuleMetaRepoModel.id) && this.isFirstModule == magicModuleMetaRepoModel.isFirstModule && this.createdOn == magicModuleMetaRepoModel.createdOn && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.moduleName, (Object) magicModuleMetaRepoModel.moduleName) && this.mcqCount == magicModuleMetaRepoModel.mcqCount && this.status == magicModuleMetaRepoModel.status && this.submittedOn == magicModuleMetaRepoModel.submittedOn && this.correctCount == magicModuleMetaRepoModel.correctCount && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.errorCode, magicModuleMetaRepoModel.errorCode);
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode();
        int iHashCode2 = Boolean.hashCode(this.isFirstModule);
        int iHashCode3 = Long.hashCode(this.createdOn);
        int iHashCode4 = this.moduleName.hashCode();
        int iHashCode5 = Integer.hashCode(this.mcqCount);
        int iHashCode6 = Integer.hashCode(this.status);
        int iHashCode7 = Long.hashCode(this.submittedOn);
        int iHashCode8 = Integer.hashCode(this.correctCount);
        Integer num = this.errorCode;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        String str = this.id;
        boolean z = this.isFirstModule;
        long j = this.createdOn;
        String str2 = this.moduleName;
        int i = this.mcqCount;
        int i2 = this.status;
        long j2 = this.submittedOn;
        int i3 = this.correctCount;
        Integer num = this.errorCode;
        StringBuilder sb = new StringBuilder("MagicModuleMetaRepoModel(id=");
        sb.append(str);
        sb.append(", isFirstModule=");
        sb.append(z);
        sb.append(", createdOn=");
        sb.append(j);
        sb.append(", moduleName=");
        sb.append(str2);
        sb.append(", mcqCount=");
        sb.append(i);
        sb.append(", status=");
        sb.append(i2);
        sb.append(", submittedOn=");
        sb.append(j2);
        sb.append(", correctCount=");
        sb.append(i3);
        sb.append(", errorCode=");
        sb.append(num);
        sb.append(")");
        return sb.toString();
    }
}
