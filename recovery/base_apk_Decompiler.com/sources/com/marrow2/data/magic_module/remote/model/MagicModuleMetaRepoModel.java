package com.marrow2.data.magic_module.remote.model;

import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b7\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0013J\u0010\u0010\u001b\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0017J\u0010\u0010\u001f\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b \u0010!Jx\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\n2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010$\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0013R\u0017\u0010(\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0013R\u001a\u0010+\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b+\u0010\u0015R\u001a\u0010-\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0017R\u001c\u00100\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u0010\u0019R\u001a\u00103\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010)\u001a\u0004\b4\u0010\u0013R\u001a\u00105\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010\u001cR\u001a\u00108\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u00106\u001a\u0004\b9\u0010\u001cR\u001a\u0010:\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010.\u001a\u0004\b;\u0010\u0017R\u001a\u0010<\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u00106\u001a\u0004\b=\u0010\u001cR\u001c\u0010>\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010!R\u001a\u0010A\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010,\u001a\u0004\bA\u0010\u0015"}, d2 = {"Lcom/marrow2/data/magic_module/remote/model/MagicModuleMetaRepoModel;", "", "", "p0", "", "p1", "", "p2", "p3", "p4", "", "p5", "p6", "p7", "p8", "p9", "<init>", "(Ljava/lang/String;ZJLjava/lang/Long;Ljava/lang/String;IIJILjava/lang/Integer;)V", "component1", "()Ljava/lang/String;", "component2", "()Z", "component3", "()J", "component4", "()Ljava/lang/Long;", "component5", "component6", "()I", "component7", "component8", "component9", "component10", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;ZJLjava/lang/Long;Ljava/lang/String;IIJILjava/lang/Integer;)Lcom/marrow2/data/magic_module/remote/model/MagicModuleMetaRepoModel;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "id", "Ljava/lang/String;", "getId", "isFirstModule", "Z", "createdOn", "J", "getCreatedOn", "pausedOnTimeMs", "Ljava/lang/Long;", "getPausedOnTimeMs", "moduleName", "getModuleName", "mcqCount", "I", "getMcqCount", "status", "getStatus", "submittedOn", "getSubmittedOn", "correctCount", "getCorrectCount", "errorCode", "Ljava/lang/Integer;", "getErrorCode", "isCompleted"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MagicModuleMetaRepoModel {
    public static final int $stable = 0;
    private final int correctCount;
    private final long createdOn;
    private final Integer errorCode;
    private final String id;
    private final boolean isCompleted;
    private final boolean isFirstModule;
    private final int mcqCount;
    private final String moduleName;
    private final Long pausedOnTimeMs;
    private final int status;
    private final long submittedOn;

    public MagicModuleMetaRepoModel(String str, boolean z, long j, Long l, String str2, int i, int i2, long j2, int i3, Integer num) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.id = str;
        this.isFirstModule = z;
        this.createdOn = j;
        this.pausedOnTimeMs = l;
        this.moduleName = str2;
        this.mcqCount = i;
        this.status = i2;
        this.submittedOn = j2;
        this.correctCount = i3;
        this.errorCode = num;
        this.isCompleted = i2 == 2 && j2 > Long.MIN_VALUE;
    }

    public /* synthetic */ MagicModuleMetaRepoModel(String str, boolean z, long j, Long l, String str2, int i, int i2, long j2, int i3, Integer num, int i4, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, z, j, l, str2, i, i2, j2, i3, (i4 & 512) != 0 ? null : num);
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

    public final Long getPausedOnTimeMs() {
        return this.pausedOnTimeMs;
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

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Integer getErrorCode() {
        return this.errorCode;
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
    public final Long getPausedOnTimeMs() {
        return this.pausedOnTimeMs;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getModuleName() {
        return this.moduleName;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getMcqCount() {
        return this.mcqCount;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getSubmittedOn() {
        return this.submittedOn;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getCorrectCount() {
        return this.correctCount;
    }

    public final MagicModuleMetaRepoModel copy(String p0, boolean p1, long p2, Long p3, String p4, int p5, int p6, long p7, int p8, Integer p9) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p4, "");
        return new MagicModuleMetaRepoModel(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof MagicModuleMetaRepoModel)) {
            return false;
        }
        MagicModuleMetaRepoModel magicModuleMetaRepoModel = (MagicModuleMetaRepoModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) magicModuleMetaRepoModel.id) && this.isFirstModule == magicModuleMetaRepoModel.isFirstModule && this.createdOn == magicModuleMetaRepoModel.createdOn && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.pausedOnTimeMs, magicModuleMetaRepoModel.pausedOnTimeMs) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.moduleName, (Object) magicModuleMetaRepoModel.moduleName) && this.mcqCount == magicModuleMetaRepoModel.mcqCount && this.status == magicModuleMetaRepoModel.status && this.submittedOn == magicModuleMetaRepoModel.submittedOn && this.correctCount == magicModuleMetaRepoModel.correctCount && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.errorCode, magicModuleMetaRepoModel.errorCode);
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode();
        int iHashCode2 = Boolean.hashCode(this.isFirstModule);
        int iHashCode3 = Long.hashCode(this.createdOn);
        Long l = this.pausedOnTimeMs;
        int iHashCode4 = l == null ? 0 : l.hashCode();
        int iHashCode5 = this.moduleName.hashCode();
        int iHashCode6 = Integer.hashCode(this.mcqCount);
        int iHashCode7 = Integer.hashCode(this.status);
        int iHashCode8 = Long.hashCode(this.submittedOn);
        int iHashCode9 = Integer.hashCode(this.correctCount);
        Integer num = this.errorCode;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        String str = this.id;
        boolean z = this.isFirstModule;
        long j = this.createdOn;
        Long l = this.pausedOnTimeMs;
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
        sb.append(", pausedOnTimeMs=");
        sb.append(l);
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
