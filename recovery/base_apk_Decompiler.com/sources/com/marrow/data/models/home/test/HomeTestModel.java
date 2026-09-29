package com.marrow.data.models.home.test;

import com.marrow.data.models.home.HomeCardModel;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.getMagicModuleMeta;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\bP\b\u0086\b\u0018\u0000 [2\u00020\u0001:\u0001[B\u008d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0010\u0010$\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b$\u0010\"J\u0010\u0010%\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b%\u0010\u001eJ\u0010\u0010&\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b&\u0010\u001eJ\u0010\u0010'\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b'\u0010\u001eJ\u0010\u0010(\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b(\u0010\"J\u0010\u0010)\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b)\u0010\u001cJ\u009c\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00072\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b,\u0010\u001eJ\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010\u0019R\"\u0010.\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0019\"\u0004\b1\u00102R\"\u00103\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u0010/\u001a\u0004\b4\u0010\u0019\"\u0004\b5\u00102R\u0016\u00106\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b6\u00107R\"\u00108\u001a\u00020\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010\u001e\"\u0004\b;\u0010<R\"\u0010=\u001a\u00020\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b=\u00107\u001a\u0004\b=\u0010\u001c\"\u0004\b>\u0010?R\"\u0010@\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b@\u0010/\u001a\u0004\bA\u0010\u0019\"\u0004\bB\u00102R\"\u0010C\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010\"\"\u0004\bF\u0010GR\"\u0010H\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bH\u0010D\u001a\u0004\bI\u0010\"\"\u0004\bJ\u0010GR\"\u0010K\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bK\u0010D\u001a\u0004\bL\u0010\"\"\u0004\bM\u0010GR\"\u0010N\u001a\u00020\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bN\u00109\u001a\u0004\bO\u0010\u001e\"\u0004\bP\u0010<R\"\u0010Q\u001a\u00020\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bQ\u00109\u001a\u0004\bR\u0010\u001e\"\u0004\bS\u0010<R\"\u0010T\u001a\u00020\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bT\u00109\u001a\u0004\bU\u0010\u001e\"\u0004\bV\u0010<R\"\u0010W\u001a\u00020\u000b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bW\u0010D\u001a\u0004\bX\u0010\"\"\u0004\bY\u0010GR\u0016\u0010Z\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bZ\u00107"}, d2 = {"Lcom/marrow/data/models/home/test/HomeTestModel;", "", "", "p0", "p1", "", "p2", "", "p3", "p4", "p5", "", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZIZLjava/lang/String;JJJIIIJZ)V", "equals", "(Ljava/lang/Object;)Z", "component1", "()Ljava/lang/String;", "component2", "component3", "()Z", "component4", "()I", "component5", "component6", "component7", "()J", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/String;ZIZLjava/lang/String;JJJIIIJZ)Lcom/marrow/data/models/home/test/HomeTestModel;", "hashCode", "toString", "id", "Ljava/lang/String;", "getId", "setId", "(Ljava/lang/String;)V", "title", "getTitle", "setTitle", "isPaid", "Z", "status", "I", "getStatus", "setStatus", "(I)V", "isResultAvailable", "setResultAvailable", "(Z)V", "testType", "getTestType", "setTestType", "resultTimeStamp", "J", "getResultTimeStamp", "setResultTimeStamp", "(J)V", "expiryTimeStamp", "getExpiryTimeStamp", "setExpiryTimeStamp", "startTimeStamp", "getStartTimeStamp", "setStartTimeStamp", "duration", "getDuration", "setDuration", "availabilityType", "getAvailabilityType", "setAvailabilityType", "questionCount", "getQuestionCount", "setQuestionCount", "userStartedTimestamp", "getUserStartedTimestamp", "setUserStartedTimestamp", "hasAccess", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HomeTestModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private int availabilityType;
    private int duration;
    private long expiryTimeStamp;
    public boolean hasAccess;
    private String id;
    public boolean isPaid;
    private boolean isResultAvailable;
    private int questionCount;
    private long resultTimeStamp;
    private long startTimeStamp;
    private int status;
    private String testType;
    private String title;
    private long userStartedTimestamp;

    public HomeTestModel(String str, String str2, boolean z, int i, boolean z2, String str3, long j, long j2, long j3, int i2, int i3, int i4, long j4, boolean z3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        this.id = str;
        this.title = str2;
        this.isPaid = z;
        this.status = i;
        this.isResultAvailable = z2;
        this.testType = str3;
        this.resultTimeStamp = j;
        this.expiryTimeStamp = j2;
        this.startTimeStamp = j3;
        this.duration = i2;
        this.availabilityType = i3;
        this.questionCount = i4;
        this.userStartedTimestamp = j4;
        this.hasAccess = z3;
    }

    public /* synthetic */ HomeTestModel(String str, String str2, boolean z, int i, boolean z2, String str3, long j, long j2, long j3, int i2, int i3, int i4, long j4, boolean z3, int i5, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, str2, (i5 & 4) != 0 ? false : z, (i5 & 8) != 0 ? 0 : i, (i5 & 16) != 0 ? false : z2, str3, (i5 & 64) != 0 ? 0L : j, (i5 & 128) != 0 ? 0L : j2, (i5 & 256) != 0 ? 0L : j3, (i5 & 512) != 0 ? 0 : i2, (i5 & 1024) != 0 ? 0 : i3, (i5 & 2048) != 0 ? 0 : i4, (i5 & 4096) != 0 ? 0L : j4, (i5 & 8192) != 0 ? false : z3);
    }

    public final String getId() {
        return this.id;
    }

    public final void setId(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.id = str;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.title = str;
    }

    public final int getStatus() {
        return this.status;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final boolean isResultAvailable() {
        return this.isResultAvailable;
    }

    public final void setResultAvailable(boolean z) {
        this.isResultAvailable = z;
    }

    public final String getTestType() {
        return this.testType;
    }

    public final void setTestType(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.testType = str;
    }

    public final long getResultTimeStamp() {
        return this.resultTimeStamp;
    }

    public final void setResultTimeStamp(long j) {
        this.resultTimeStamp = j;
    }

    public final long getExpiryTimeStamp() {
        return this.expiryTimeStamp;
    }

    public final void setExpiryTimeStamp(long j) {
        this.expiryTimeStamp = j;
    }

    public final long getStartTimeStamp() {
        return this.startTimeStamp;
    }

    public final void setStartTimeStamp(long j) {
        this.startTimeStamp = j;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final void setDuration(int i) {
        this.duration = i;
    }

    public final int getAvailabilityType() {
        return this.availabilityType;
    }

    public final void setAvailabilityType(int i) {
        this.availabilityType = i;
    }

    public final int getQuestionCount() {
        return this.questionCount;
    }

    public final void setQuestionCount(int i) {
        this.questionCount = i;
    }

    public final long getUserStartedTimestamp() {
        return this.userStartedTimestamp;
    }

    public final void setUserStartedTimestamp(long j) {
        this.userStartedTimestamp = j;
    }

    public final boolean equals(Object p0) {
        if (!(p0 instanceof HomeTestModel)) {
            return super.equals(p0);
        }
        HomeTestModel homeTestModel = (HomeTestModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) homeTestModel.id) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.title, (Object) homeTestModel.title) && this.isPaid == homeTestModel.isPaid && this.isResultAvailable == homeTestModel.isResultAvailable && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.testType, (Object) homeTestModel.testType) && this.resultTimeStamp == homeTestModel.resultTimeStamp && this.expiryTimeStamp == homeTestModel.expiryTimeStamp && this.startTimeStamp == homeTestModel.startTimeStamp && this.duration == homeTestModel.duration && this.availabilityType == homeTestModel.availabilityType && this.questionCount == homeTestModel.questionCount && this.userStartedTimestamp == homeTestModel.userStartedTimestamp && this.status == homeTestModel.status && this.hasAccess == homeTestModel.hasAccess;
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/marrow/data/models/home/test/HomeTestModel$Companion;", "", "<init>", "()V", "Lcom/marrow/data/models/home/HomeCardModel;", "p0", "Lcom/marrow/data/models/home/test/HomeTestModel;", "from", "(Lcom/marrow/data/models/home/HomeCardModel;)Lcom/marrow/data/models/home/test/HomeTestModel;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public final HomeTestModel from(HomeCardModel p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            TestSubModel testSubModelExtract = TestSubModel.INSTANCE.extract(p0.rest);
            String str = p0.contentTitle;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
            String str2 = p0.contentId;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
            return new HomeTestModel(str2, str, testSubModelExtract.isPaid, testSubModelExtract.status, testSubModelExtract.isResultAvailable, testSubModelExtract.testType, testSubModelExtract.resultTimeStamp, testSubModelExtract.expiryTimeStamp, testSubModelExtract.startTimeStamp, testSubModelExtract.duration, testSubModelExtract.availabilityType, testSubModelExtract.questionCount, testSubModelExtract.userStartedTime, testSubModelExtract.hasAccess);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @getMagicModuleMeta
    public static final HomeTestModel from(HomeCardModel homeCardModel) {
        return INSTANCE.from(homeCardModel);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getDuration() {
        return this.duration;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final int getAvailabilityType() {
        return this.availabilityType;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final int getQuestionCount() {
        return this.questionCount;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final long getUserStartedTimestamp() {
        return this.userStartedTimestamp;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final boolean getHasAccess() {
        return this.hasAccess;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsPaid() {
        return this.isPaid;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsResultAvailable() {
        return this.isResultAvailable;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTestType() {
        return this.testType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final long getResultTimeStamp() {
        return this.resultTimeStamp;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final long getExpiryTimeStamp() {
        return this.expiryTimeStamp;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final long getStartTimeStamp() {
        return this.startTimeStamp;
    }

    public final HomeTestModel copy(String p0, String p1, boolean p2, int p3, boolean p4, String p5, long p6, long p7, long p8, int p9, int p10, int p11, long p12, boolean p13) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p5, "");
        return new HomeTestModel(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13);
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + Boolean.hashCode(this.isPaid)) * 31) + Integer.hashCode(this.status)) * 31) + Boolean.hashCode(this.isResultAvailable)) * 31) + this.testType.hashCode()) * 31) + Long.hashCode(this.resultTimeStamp)) * 31) + Long.hashCode(this.expiryTimeStamp)) * 31) + Long.hashCode(this.startTimeStamp)) * 31) + Integer.hashCode(this.duration)) * 31) + Integer.hashCode(this.availabilityType)) * 31) + Integer.hashCode(this.questionCount)) * 31) + Long.hashCode(this.userStartedTimestamp)) * 31) + Boolean.hashCode(this.hasAccess);
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.title;
        boolean z = this.isPaid;
        int i = this.status;
        boolean z2 = this.isResultAvailable;
        String str3 = this.testType;
        long j = this.resultTimeStamp;
        long j2 = this.expiryTimeStamp;
        long j3 = this.startTimeStamp;
        int i2 = this.duration;
        int i3 = this.availabilityType;
        int i4 = this.questionCount;
        long j4 = this.userStartedTimestamp;
        boolean z3 = this.hasAccess;
        StringBuilder sb = new StringBuilder("HomeTestModel(id=");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", isPaid=");
        sb.append(z);
        sb.append(", status=");
        sb.append(i);
        sb.append(", isResultAvailable=");
        sb.append(z2);
        sb.append(", testType=");
        sb.append(str3);
        sb.append(", resultTimeStamp=");
        sb.append(j);
        sb.append(", expiryTimeStamp=");
        sb.append(j2);
        sb.append(", startTimeStamp=");
        sb.append(j3);
        sb.append(", duration=");
        sb.append(i2);
        sb.append(", availabilityType=");
        sb.append(i3);
        sb.append(", questionCount=");
        sb.append(i4);
        sb.append(", userStartedTimestamp=");
        sb.append(j4);
        sb.append(", hasAccess=");
        sb.append(z3);
        sb.append(")");
        return sb.toString();
    }
}
