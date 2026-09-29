package com.marrow.data.models.custommodule;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.api.models.response.user.LoggedUserResponse;
import java.io.Serializable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0017\u0018\u0000 B2\u00020\u0001:\u0001BB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR$\u0010\n\u001a\u0004\u0018\u00010\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\n\u0010\t\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u0012\u0004\b\u0018\u0010\u0003R\u0016\u0010\u0019\u001a\u00020\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0016\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\u00020\u001a8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010\"\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0006\u001a\u0004\b#\u0010\u0011\"\u0004\b$\u0010\u0013R$\u0010%\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0006\u001a\u0004\b&\u0010\u0011\"\u0004\b'\u0010\u0013R\"\u0010)\u001a\u00020(8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+\"\u0004\b,\u0010-R$\u0010.\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010\u0006\u001a\u0004\b/\u0010\u0011\"\u0004\b0\u0010\u0013R$\u00101\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\u0011\"\u0004\b3\u0010\u0013R\"\u00104\u001a\u00020\u001a8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b4\u0010\u001c\u001a\u0004\b5\u0010\u001f\"\u0004\b6\u0010!R\"\u00107\u001a\u00020\u001a8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b7\u0010\u001c\u001a\u0004\b8\u0010\u001f\"\u0004\b9\u0010!R\"\u0010:\u001a\u00020\u00148\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b:\u0010\u0016\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010?\u001a\u00020\u001a8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b?\u0010\u001c\u001a\u0004\b@\u0010\u001f\"\u0004\bA\u0010!"}, d2 = {"Lcom/marrow/data/models/custommodule/CustomModule;", "Ljava/io/Serializable;", "<init>", "()V", "", "id", "Ljava/lang/String;", "Lcom/marrow/data/models/custommodule/FilterParams;", "params", "Lcom/marrow/data/models/custommodule/FilterParams;", "responseParams", "getResponseParams", "()Lcom/marrow/data/models/custommodule/FilterParams;", "setResponseParams", "(Lcom/marrow/data/models/custommodule/FilterParams;)V", "warningMsg", "getWarningMsg", "()Ljava/lang/String;", "setWarningMsg", "(Ljava/lang/String;)V", "", "mcqCount", "I", "status", "getStatus$annotations", "taskStatus", "", "createdOn", "J", "submittedOn", "getSubmittedOn", "()J", "setSubmittedOn", "(J)V", "inviteCode", "getInviteCode", "setInviteCode", "moduleOwner", "getModuleOwner", "setModuleOwner", "", "isExpired", "Z", "()Z", "setExpired", "(Z)V", "testName", "getTestName", "setTestName", "moduleMessage", "getModuleMessage", "setModuleMessage", "expiredOn", "getExpiredOn", "setExpiredOn", "startDateTime", "getStartDateTime", "setStartDateTime", "examDurationSeconds", "getExamDurationSeconds", "()I", "setExamDurationSeconds", "(I)V", "userInitiatedExamStartedOn", "getUserInitiatedExamStartedOn", "setUserInitiatedExamStartedOn", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class CustomModule implements Serializable {
    public static final String DEFAULT_MODULE_OWNER = "normal";
    public static final String KEY_ID = "_id";
    public static final String MODULE_OWNER_FACULTY = "faculty";

    @JsonProperty(LoggedUserResponse.KEY_CREATED_ON)
    public long createdOn;

    @JsonProperty("exam_duration_seconds")
    private int examDurationSeconds;

    @JsonProperty("expired_on")
    private long expiredOn;

    @JsonProperty("invite_code")
    private String inviteCode;

    @JsonProperty("is_expired")
    private boolean isExpired;

    @JsonProperty("mcq_count")
    public int mcqCount;

    @JsonProperty("module_msg")
    private String moduleMessage;

    @JsonProperty("response_filter_params")
    private FilterParams responseParams;

    @JsonProperty("start_datetime")
    private long startDateTime;

    @JsonProperty("status")
    public int status;

    @JsonProperty("submitted_on")
    private long submittedOn;

    @JsonProperty("task_status")
    public int taskStatus;

    @JsonProperty("test_name")
    private String testName;
    private long userInitiatedExamStartedOn;

    @JsonProperty("warning_msg")
    private String warningMsg;

    @JsonProperty("_id")
    public String id = "";

    @JsonProperty("filter_params")
    public FilterParams params = new FilterParams();

    @JsonProperty("owner_category")
    private String moduleOwner = DEFAULT_MODULE_OWNER;

    public static /* synthetic */ void getStatus$annotations() {
    }

    public final FilterParams getResponseParams() {
        return this.responseParams;
    }

    public final void setResponseParams(FilterParams filterParams) {
        this.responseParams = filterParams;
    }

    public final String getWarningMsg() {
        return this.warningMsg;
    }

    public final void setWarningMsg(String str) {
        this.warningMsg = str;
    }

    public final long getSubmittedOn() {
        return this.submittedOn;
    }

    public final void setSubmittedOn(long j) {
        this.submittedOn = j;
    }

    public final String getInviteCode() {
        return this.inviteCode;
    }

    public final void setInviteCode(String str) {
        this.inviteCode = str;
    }

    public final String getModuleOwner() {
        return this.moduleOwner;
    }

    public final void setModuleOwner(String str) {
        this.moduleOwner = str;
    }

    /* JADX INFO: renamed from: isExpired, reason: from getter */
    public final boolean getIsExpired() {
        return this.isExpired;
    }

    public final void setExpired(boolean z) {
        this.isExpired = z;
    }

    public final String getTestName() {
        return this.testName;
    }

    public final void setTestName(String str) {
        this.testName = str;
    }

    public final String getModuleMessage() {
        return this.moduleMessage;
    }

    public final void setModuleMessage(String str) {
        this.moduleMessage = str;
    }

    public final long getExpiredOn() {
        return this.expiredOn;
    }

    public final void setExpiredOn(long j) {
        this.expiredOn = j;
    }

    public final long getStartDateTime() {
        return this.startDateTime;
    }

    public final void setStartDateTime(long j) {
        this.startDateTime = j;
    }

    public final int getExamDurationSeconds() {
        return this.examDurationSeconds;
    }

    public final void setExamDurationSeconds(int i) {
        this.examDurationSeconds = i;
    }

    public final long getUserInitiatedExamStartedOn() {
        return this.userInitiatedExamStartedOn;
    }

    public final void setUserInitiatedExamStartedOn(long j) {
        this.userInitiatedExamStartedOn = j;
    }
}
