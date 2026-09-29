package com.marrow2.data.lesson.remote.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.custommodule.FilterParams;
import java.util.HashMap;
import java.util.List;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.dropTable;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012$\b\u0002\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0006H\u0002J\u0014\u0010 \u001a\u00020\u001d2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J%\u0010%\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006`\u0007HÆ\u0003J\t\u0010&\u001a\u00020\u0006HÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003JO\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032$\b\u0002\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006`\u00072\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010)\u001a\u00020\n2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0006HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R8\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006`\u00078\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\b\u001a\u00020\u00068\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\t\u001a\u00020\n8\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006-"}, d2 = {"Lcom/marrow2/data/lesson/remote/model/MarkCMQBCompleteRequestBody;", "", "courseId", "", "result", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "status", "isAutoSubmitted", "", "<init>", "(Ljava/lang/String;Ljava/util/HashMap;IZ)V", "getCourseId", "()Ljava/lang/String;", "setCourseId", "(Ljava/lang/String;)V", "getResult", "()Ljava/util/HashMap;", "setResult", "(Ljava/util/HashMap;)V", "getStatus", "()I", "setStatus", "(I)V", "()Z", "setAutoSubmitted", "(Z)V", "addAnswer", "", "mcqId", "answerIndex", "addAll", "allAnswers", "", "Lcom/marrow2/data/mcq/local/model/McqAnswerRepoModel;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MarkCMQBCompleteRequestBody {
    public static final int $stable = 8;
    private String courseId;
    private boolean isAutoSubmitted;
    private HashMap<String, Integer> result;
    private int status;

    public MarkCMQBCompleteRequestBody(String str, HashMap<String, Integer> map, int i, boolean z) {
        toMagicModuleMetaRepoModel.write(map, "");
        this.courseId = str;
        this.result = map;
        this.status = i;
        this.isAutoSubmitted = z;
    }

    @JsonProperty(FilterParams.KEY_COURSE_ID)
    public final String getCourseId() {
        return this.courseId;
    }

    public final void setCourseId(String str) {
        this.courseId = str;
    }

    public /* synthetic */ MarkCMQBCompleteRequestBody(String str, HashMap map, int i, boolean z, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? new HashMap() : map, (i2 & 4) != 0 ? 2 : i, (i2 & 8) != 0 ? false : z);
    }

    @JsonProperty("result")
    public final HashMap<String, Integer> getResult() {
        return this.result;
    }

    public final void setResult(HashMap<String, Integer> map) {
        toMagicModuleMetaRepoModel.write(map, "");
        this.result = map;
    }

    @JsonProperty("status")
    public final int getStatus() {
        return this.status;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    @JsonProperty("is_auto_submitted")
    public final boolean isAutoSubmitted() {
        return this.isAutoSubmitted;
    }

    public final void setAutoSubmitted(boolean z) {
        this.isAutoSubmitted = z;
    }

    private final void addAnswer(String mcqId, int answerIndex) {
        this.result.put(mcqId, Integer.valueOf(answerIndex));
    }

    public final void addAll(List<dropTable> allAnswers) {
        toMagicModuleMetaRepoModel.write(allAnswers, "");
        for (dropTable droptable : allAnswers) {
            addAnswer(droptable.getMediaBrowserCompatItemReceiver(), droptable.getMediaBrowserCompatCustomActionResultReceiver());
        }
    }

    public MarkCMQBCompleteRequestBody() {
        this(null, null, 0, false, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarkCMQBCompleteRequestBody copy$default(MarkCMQBCompleteRequestBody markCMQBCompleteRequestBody, String str, HashMap map, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = markCMQBCompleteRequestBody.courseId;
        }
        if ((i2 & 2) != 0) {
            map = markCMQBCompleteRequestBody.result;
        }
        if ((i2 & 4) != 0) {
            i = markCMQBCompleteRequestBody.status;
        }
        if ((i2 & 8) != 0) {
            z = markCMQBCompleteRequestBody.isAutoSubmitted;
        }
        return markCMQBCompleteRequestBody.copy(str, map, i, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCourseId() {
        return this.courseId;
    }

    public final HashMap<String, Integer> component2() {
        return this.result;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsAutoSubmitted() {
        return this.isAutoSubmitted;
    }

    public final MarkCMQBCompleteRequestBody copy(String courseId, HashMap<String, Integer> result, int status, boolean isAutoSubmitted) {
        toMagicModuleMetaRepoModel.write(result, "");
        return new MarkCMQBCompleteRequestBody(courseId, result, status, isAutoSubmitted);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarkCMQBCompleteRequestBody)) {
            return false;
        }
        MarkCMQBCompleteRequestBody markCMQBCompleteRequestBody = (MarkCMQBCompleteRequestBody) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.courseId, (Object) markCMQBCompleteRequestBody.courseId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.result, markCMQBCompleteRequestBody.result) && this.status == markCMQBCompleteRequestBody.status && this.isAutoSubmitted == markCMQBCompleteRequestBody.isAutoSubmitted;
    }

    public final int hashCode() {
        String str = this.courseId;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + this.result.hashCode()) * 31) + Integer.hashCode(this.status)) * 31) + Boolean.hashCode(this.isAutoSubmitted);
    }

    public final String toString() {
        String str = this.courseId;
        HashMap<String, Integer> map = this.result;
        int i = this.status;
        boolean z = this.isAutoSubmitted;
        StringBuilder sb = new StringBuilder("MarkCMQBCompleteRequestBody(courseId=");
        sb.append(str);
        sb.append(", result=");
        sb.append(map);
        sb.append(", status=");
        sb.append(i);
        sb.append(", isAutoSubmitted=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
