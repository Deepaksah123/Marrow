package com.marrow2.data.custom_module.remote.model;

import com.google.android.exoplayer2.C;
import com.marrow.data.models.custommodule.CustomModule;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.readExactly;
import kotlin.toMagicModuleMetaRepoModel;
import org.apache.commons.compress.archivers.zip.UnixStat;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\bN\b\u0086\b\u0018\u00002\u00020\u0001BÅ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\b\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\f\u0012\b\b\u0002\u0010\u0016\u001a\u00020\f\u0012\b\b\u0002\u0010\u0017\u001a\u00020\b\u0012\u0006\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0010\u0010!\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0010\u0010%\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b'\u0010&J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001cJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b)\u0010\u001cJ\u0010\u0010*\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\u001cJ\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\u001cJ\u0010\u0010.\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b.\u0010&J\u0010\u0010/\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b/\u0010&J\u0010\u00100\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b0\u0010\"J\u0010\u00101\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b1\u0010&JÐ\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0015\u001a\u00020\f2\b\b\u0002\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\fHÆ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00104\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b6\u0010\"J\u0010\u00107\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b7\u0010\u001cR\u0017\u00108\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010\u001cR\u001a\u0010;\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010\u001eR\u001c\u0010>\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010<\u001a\u0004\b?\u0010\u001eR\u001c\u0010@\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u00109\u001a\u0004\bA\u0010\u001cR\u001a\u0010B\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\bD\u0010\"R\u001a\u0010E\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010C\u001a\u0004\bF\u0010\"R\u001a\u0010G\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010C\u001a\u0004\bH\u0010\"R\u001a\u0010I\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010&R\u001a\u0010L\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010J\u001a\u0004\bM\u0010&R\u001c\u0010N\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bN\u00109\u001a\u0004\bO\u0010\u001cR\u001c\u0010P\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bP\u00109\u001a\u0004\bQ\u0010\u001cR\u001a\u0010R\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bR\u0010+R\u001c\u0010T\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bT\u00109\u001a\u0004\bU\u0010\u001cR\u001c\u0010V\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bV\u00109\u001a\u0004\bW\u0010\u001cR\u001a\u0010X\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bX\u0010J\u001a\u0004\bY\u0010&R\u001a\u0010Z\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010J\u001a\u0004\b[\u0010&R\u001a\u0010\\\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\\\u0010C\u001a\u0004\b]\u0010\"R\u001a\u0010^\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b^\u0010J\u001a\u0004\b_\u0010&"}, d2 = {"Lcom/marrow2/data/custom_module/remote/model/CustomModuleLSModel;", "", "", "p0", "Lcom/marrow2/data/custom_module/remote/model/FilterParams;", "p1", "p2", "p3", "", "p4", "p5", "p6", "", "p7", "p8", "p9", "p10", "", "p11", "p12", "p13", "p14", "p15", "p16", "p17", "<init>", "(Ljava/lang/String;Lcom/marrow2/data/custom_module/remote/model/FilterParams;Lcom/marrow2/data/custom_module/remote/model/FilterParams;Ljava/lang/String;IIIJJLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;JJIJ)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/marrow2/data/custom_module/remote/model/FilterParams;", "component3", "component4", "component5", "()I", "component6", "component7", "component8", "()J", "component9", "component10", "component11", "component12", "()Z", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "(Ljava/lang/String;Lcom/marrow2/data/custom_module/remote/model/FilterParams;Lcom/marrow2/data/custom_module/remote/model/FilterParams;Ljava/lang/String;IIIJJLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;JJIJ)Lcom/marrow2/data/custom_module/remote/model/CustomModuleLSModel;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "id", "Ljava/lang/String;", "getId", "params", "Lcom/marrow2/data/custom_module/remote/model/FilterParams;", "getParams", "responseParams", "getResponseParams", "warningMsg", "getWarningMsg", "mcqCount", "I", "getMcqCount", "status", "getStatus", "taskStatus", "getTaskStatus", "createdOn", "J", "getCreatedOn", "submittedOn", "getSubmittedOn", "inviteCode", "getInviteCode", "moduleOwner", "getModuleOwner", "isExpired", "Z", "testName", "getTestName", "moduleMessage", "getModuleMessage", "expiredOn", "getExpiredOn", "startDateTime", "getStartDateTime", "examDurationSeconds", "getExamDurationSeconds", "userInitiatedExamStartedOn", "getUserInitiatedExamStartedOn"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CustomModuleLSModel {
    public static final int $stable = 8;
    private final long createdOn;
    private final int examDurationSeconds;
    private final long expiredOn;
    private final String id;
    private final String inviteCode;
    private final boolean isExpired;
    private final int mcqCount;
    private final String moduleMessage;
    private final String moduleOwner;
    private final FilterParams params;
    private final FilterParams responseParams;
    private final long startDateTime;
    private final int status;
    private final long submittedOn;
    private final int taskStatus;
    private final String testName;
    private final long userInitiatedExamStartedOn;
    private final String warningMsg;

    public CustomModuleLSModel(String str, FilterParams filterParams, FilterParams filterParams2, String str2, int i, int i2, int i3, long j, long j2, String str3, String str4, boolean z, String str5, String str6, long j3, long j4, int i4, long j5) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(filterParams, "");
        this.id = str;
        this.params = filterParams;
        this.responseParams = filterParams2;
        this.warningMsg = str2;
        this.mcqCount = i;
        this.status = i2;
        this.taskStatus = i3;
        this.createdOn = j;
        this.submittedOn = j2;
        this.inviteCode = str3;
        this.moduleOwner = str4;
        this.isExpired = z;
        this.testName = str5;
        this.moduleMessage = str6;
        this.expiredOn = j3;
        this.startDateTime = j4;
        this.examDurationSeconds = i4;
        this.userInitiatedExamStartedOn = j5;
    }

    public /* synthetic */ CustomModuleLSModel(String str, FilterParams filterParams, FilterParams filterParams2, String str2, int i, int i2, int i3, long j, long j2, String str3, String str4, boolean z, String str5, String str6, long j3, long j4, int i4, long j5, int i5, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i5 & 1) != 0 ? "" : str, (i5 & 2) != 0 ? new FilterParams(false, 0, 0, false, null, null, null, null, null, null, null, false, UnixStat.PERM_MASK, null) : filterParams, (i5 & 4) != 0 ? null : filterParams2, (i5 & 8) != 0 ? null : str2, (i5 & 16) != 0 ? 0 : i, (i5 & 32) != 0 ? readExactly.write.getRemoteActionCompatParcelizer() : i2, (i5 & 64) != 0 ? 0 : i3, (i5 & 128) != 0 ? 0L : j, (i5 & 256) != 0 ? 0L : j2, (i5 & 512) != 0 ? null : str3, (i5 & 1024) != 0 ? CustomModule.DEFAULT_MODULE_OWNER : str4, (i5 & 2048) != 0 ? false : z, (i5 & 4096) != 0 ? null : str5, (i5 & 8192) != 0 ? null : str6, (i5 & 16384) != 0 ? 0L : j3, (32768 & i5) != 0 ? 0L : j4, (i5 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? 0 : i4, j5);
    }

    public final String getId() {
        return this.id;
    }

    public final FilterParams getParams() {
        return this.params;
    }

    public final FilterParams getResponseParams() {
        return this.responseParams;
    }

    public final String getWarningMsg() {
        return this.warningMsg;
    }

    public final int getMcqCount() {
        return this.mcqCount;
    }

    public final int getStatus() {
        return this.status;
    }

    public final int getTaskStatus() {
        return this.taskStatus;
    }

    public final long getCreatedOn() {
        return this.createdOn;
    }

    public final long getSubmittedOn() {
        return this.submittedOn;
    }

    public final String getInviteCode() {
        return this.inviteCode;
    }

    public final String getModuleOwner() {
        return this.moduleOwner;
    }

    public final boolean isExpired() {
        return this.isExpired;
    }

    public final String getTestName() {
        return this.testName;
    }

    public final String getModuleMessage() {
        return this.moduleMessage;
    }

    public final long getExpiredOn() {
        return this.expiredOn;
    }

    public final long getStartDateTime() {
        return this.startDateTime;
    }

    public final int getExamDurationSeconds() {
        return this.examDurationSeconds;
    }

    public final long getUserInitiatedExamStartedOn() {
        return this.userInitiatedExamStartedOn;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getInviteCode() {
        return this.inviteCode;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getModuleOwner() {
        return this.moduleOwner;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getIsExpired() {
        return this.isExpired;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getTestName() {
        return this.testName;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getModuleMessage() {
        return this.moduleMessage;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final long getExpiredOn() {
        return this.expiredOn;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final long getStartDateTime() {
        return this.startDateTime;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final int getExamDurationSeconds() {
        return this.examDurationSeconds;
    }

    /* JADX INFO: renamed from: component18, reason: from getter */
    public final long getUserInitiatedExamStartedOn() {
        return this.userInitiatedExamStartedOn;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final FilterParams getParams() {
        return this.params;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final FilterParams getResponseParams() {
        return this.responseParams;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getWarningMsg() {
        return this.warningMsg;
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
    public final int getTaskStatus() {
        return this.taskStatus;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getCreatedOn() {
        return this.createdOn;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getSubmittedOn() {
        return this.submittedOn;
    }

    public final CustomModuleLSModel copy(String p0, FilterParams p1, FilterParams p2, String p3, int p4, int p5, int p6, long p7, long p8, String p9, String p10, boolean p11, String p12, String p13, long p14, long p15, int p16, long p17) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return new CustomModuleLSModel(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof CustomModuleLSModel)) {
            return false;
        }
        CustomModuleLSModel customModuleLSModel = (CustomModuleLSModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) customModuleLSModel.id) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.params, customModuleLSModel.params) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.responseParams, customModuleLSModel.responseParams) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.warningMsg, (Object) customModuleLSModel.warningMsg) && this.mcqCount == customModuleLSModel.mcqCount && this.status == customModuleLSModel.status && this.taskStatus == customModuleLSModel.taskStatus && this.createdOn == customModuleLSModel.createdOn && this.submittedOn == customModuleLSModel.submittedOn && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.inviteCode, (Object) customModuleLSModel.inviteCode) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.moduleOwner, (Object) customModuleLSModel.moduleOwner) && this.isExpired == customModuleLSModel.isExpired && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.testName, (Object) customModuleLSModel.testName) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.moduleMessage, (Object) customModuleLSModel.moduleMessage) && this.expiredOn == customModuleLSModel.expiredOn && this.startDateTime == customModuleLSModel.startDateTime && this.examDurationSeconds == customModuleLSModel.examDurationSeconds && this.userInitiatedExamStartedOn == customModuleLSModel.userInitiatedExamStartedOn;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode();
        int iHashCode2 = this.params.hashCode();
        FilterParams filterParams = this.responseParams;
        int iHashCode3 = filterParams == null ? 0 : filterParams.hashCode();
        String str = this.warningMsg;
        int iHashCode4 = str == null ? 0 : str.hashCode();
        int iHashCode5 = Integer.hashCode(this.mcqCount);
        int iHashCode6 = Integer.hashCode(this.status);
        int iHashCode7 = Integer.hashCode(this.taskStatus);
        int iHashCode8 = Long.hashCode(this.createdOn);
        int iHashCode9 = Long.hashCode(this.submittedOn);
        String str2 = this.inviteCode;
        int iHashCode10 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.moduleOwner;
        int iHashCode11 = str3 == null ? 0 : str3.hashCode();
        int iHashCode12 = Boolean.hashCode(this.isExpired);
        String str4 = this.testName;
        int iHashCode13 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.moduleMessage;
        return (((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + (str5 != null ? str5.hashCode() : 0)) * 31) + Long.hashCode(this.expiredOn)) * 31) + Long.hashCode(this.startDateTime)) * 31) + Integer.hashCode(this.examDurationSeconds)) * 31) + Long.hashCode(this.userInitiatedExamStartedOn);
    }

    public final String toString() {
        String str = this.id;
        FilterParams filterParams = this.params;
        FilterParams filterParams2 = this.responseParams;
        String str2 = this.warningMsg;
        int i = this.mcqCount;
        int i2 = this.status;
        int i3 = this.taskStatus;
        long j = this.createdOn;
        long j2 = this.submittedOn;
        String str3 = this.inviteCode;
        String str4 = this.moduleOwner;
        boolean z = this.isExpired;
        String str5 = this.testName;
        String str6 = this.moduleMessage;
        long j3 = this.expiredOn;
        long j4 = this.startDateTime;
        int i4 = this.examDurationSeconds;
        long j5 = this.userInitiatedExamStartedOn;
        StringBuilder sb = new StringBuilder("CustomModuleLSModel(id=");
        sb.append(str);
        sb.append(", params=");
        sb.append(filterParams);
        sb.append(", responseParams=");
        sb.append(filterParams2);
        sb.append(", warningMsg=");
        sb.append(str2);
        sb.append(", mcqCount=");
        sb.append(i);
        sb.append(", status=");
        sb.append(i2);
        sb.append(", taskStatus=");
        sb.append(i3);
        sb.append(", createdOn=");
        sb.append(j);
        sb.append(", submittedOn=");
        sb.append(j2);
        sb.append(", inviteCode=");
        sb.append(str3);
        sb.append(", moduleOwner=");
        sb.append(str4);
        sb.append(", isExpired=");
        sb.append(z);
        sb.append(", testName=");
        sb.append(str5);
        sb.append(", moduleMessage=");
        sb.append(str6);
        sb.append(", expiredOn=");
        sb.append(j3);
        sb.append(", startDateTime=");
        sb.append(j4);
        sb.append(", examDurationSeconds=");
        sb.append(i4);
        sb.append(", userInitiatedExamStartedOn=");
        sb.append(j5);
        sb.append(")");
        return sb.toString();
    }
}
