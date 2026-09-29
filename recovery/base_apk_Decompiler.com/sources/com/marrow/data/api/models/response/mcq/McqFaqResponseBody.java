package com.marrow.data.api.models.response.mcq;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.exoplayer2.offline.DownloadService;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000eJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014Jd\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u000eR$\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u000e\"\u0004\b!\u0010\"R$\u0010#\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010\u000e\"\u0004\b%\u0010\"R$\u0010&\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010\u000e\"\u0004\b(\u0010\"R$\u0010)\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010\u000e\"\u0004\b+\u0010\"R$\u0010,\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010\u001f\u001a\u0004\b-\u0010\u000e\"\u0004\b.\u0010\"R$\u0010/\u001a\u0004\u0018\u00010\b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u0014\"\u0004\b2\u00103R$\u00104\u001a\u0004\u0018\u00010\b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b4\u00100\u001a\u0004\b5\u0010\u0014\"\u0004\b6\u00103"}, d2 = {"Lcom/marrow/data/api/models/response/mcq/McqFaqResponseBody;", "", "", "p0", "p1", "p2", "p3", "p4", "", "p5", "p6", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Ljava/lang/Integer;", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/marrow/data/api/models/response/mcq/McqFaqResponseBody;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "id", "Ljava/lang/String;", "getId", "setId", "(Ljava/lang/String;)V", "answer", "getAnswer", "setAnswer", "question", "getQuestion", "setQuestion", "contentId", "getContentId", "setContentId", "contentType", "getContentType", "setContentType", "sequenceId", "Ljava/lang/Integer;", "getSequenceId", "setSequenceId", "(Ljava/lang/Integer;)V", "sortOrder", "getSortOrder", "setSortOrder"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class McqFaqResponseBody {

    @JsonProperty("answer")
    private String answer;

    @JsonProperty(DownloadService.KEY_CONTENT_ID)
    private String contentId;

    @JsonProperty("content_type")
    private String contentType;

    @JsonProperty("_id")
    private String id;

    @JsonProperty("question")
    private String question;

    @JsonProperty("sequence_id")
    private Integer sequenceId;

    @JsonProperty("sort_order")
    private Integer sortOrder;

    public McqFaqResponseBody(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2) {
        this.id = str;
        this.answer = str2;
        this.question = str3;
        this.contentId = str4;
        this.contentType = str5;
        this.sequenceId = num;
        this.sortOrder = num2;
    }

    public final String getId() {
        return this.id;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final String getAnswer() {
        return this.answer;
    }

    public final void setAnswer(String str) {
        this.answer = str;
    }

    public final String getQuestion() {
        return this.question;
    }

    public final void setQuestion(String str) {
        this.question = str;
    }

    public final String getContentId() {
        return this.contentId;
    }

    public final void setContentId(String str) {
        this.contentId = str;
    }

    public final String getContentType() {
        return this.contentType;
    }

    public final void setContentType(String str) {
        this.contentType = str;
    }

    public /* synthetic */ McqFaqResponseBody(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? 0 : num, (i & 64) != 0 ? 0 : num2);
    }

    public final Integer getSequenceId() {
        return this.sequenceId;
    }

    public final void setSequenceId(Integer num) {
        this.sequenceId = num;
    }

    public final Integer getSortOrder() {
        return this.sortOrder;
    }

    public final void setSortOrder(Integer num) {
        this.sortOrder = num;
    }

    public McqFaqResponseBody() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public McqFaqResponseBody(String str) {
        this(str, null, null, null, null, null, null, 126, null);
    }

    public McqFaqResponseBody(String str, String str2) {
        this(str, str2, null, null, null, null, null, 124, null);
    }

    public McqFaqResponseBody(String str, String str2, String str3) {
        this(str, str2, str3, null, null, null, null, 120, null);
    }

    public McqFaqResponseBody(String str, String str2, String str3, String str4) {
        this(str, str2, str3, str4, null, null, null, 112, null);
    }

    public McqFaqResponseBody(String str, String str2, String str3, String str4, String str5) {
        this(str, str2, str3, str4, str5, null, null, 96, null);
    }

    public McqFaqResponseBody(String str, String str2, String str3, String str4, String str5, Integer num) {
        this(str, str2, str3, str4, str5, num, null, 64, null);
    }

    public static /* synthetic */ McqFaqResponseBody copy$default(McqFaqResponseBody mcqFaqResponseBody, String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mcqFaqResponseBody.id;
        }
        if ((i & 2) != 0) {
            str2 = mcqFaqResponseBody.answer;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = mcqFaqResponseBody.question;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = mcqFaqResponseBody.contentId;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = mcqFaqResponseBody.contentType;
        }
        String str9 = str5;
        if ((i & 32) != 0) {
            num = mcqFaqResponseBody.sequenceId;
        }
        Integer num3 = num;
        if ((i & 64) != 0) {
            num2 = mcqFaqResponseBody.sortOrder;
        }
        return mcqFaqResponseBody.copy(str, str6, str7, str8, str9, num3, num2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAnswer() {
        return this.answer;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getQuestion() {
        return this.question;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getContentId() {
        return this.contentId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getContentType() {
        return this.contentType;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getSequenceId() {
        return this.sequenceId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Integer getSortOrder() {
        return this.sortOrder;
    }

    public final McqFaqResponseBody copy(String p0, String p1, String p2, String p3, String p4, Integer p5, Integer p6) {
        return new McqFaqResponseBody(p0, p1, p2, p3, p4, p5, p6);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof McqFaqResponseBody)) {
            return false;
        }
        McqFaqResponseBody mcqFaqResponseBody = (McqFaqResponseBody) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) mcqFaqResponseBody.id) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.answer, (Object) mcqFaqResponseBody.answer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.question, (Object) mcqFaqResponseBody.question) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.contentId, (Object) mcqFaqResponseBody.contentId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.contentType, (Object) mcqFaqResponseBody.contentType) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.sequenceId, mcqFaqResponseBody.sequenceId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.sortOrder, mcqFaqResponseBody.sortOrder);
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.answer;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.question;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.contentId;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.contentType;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        Integer num = this.sequenceId;
        int iHashCode6 = num == null ? 0 : num.hashCode();
        Integer num2 = this.sortOrder;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.answer;
        String str3 = this.question;
        String str4 = this.contentId;
        String str5 = this.contentType;
        Integer num = this.sequenceId;
        Integer num2 = this.sortOrder;
        StringBuilder sb = new StringBuilder("McqFaqResponseBody(id=");
        sb.append(str);
        sb.append(", answer=");
        sb.append(str2);
        sb.append(", question=");
        sb.append(str3);
        sb.append(", contentId=");
        sb.append(str4);
        sb.append(", contentType=");
        sb.append(str5);
        sb.append(", sequenceId=");
        sb.append(num);
        sb.append(", sortOrder=");
        sb.append(num2);
        sb.append(")");
        return sb.toString();
    }
}
