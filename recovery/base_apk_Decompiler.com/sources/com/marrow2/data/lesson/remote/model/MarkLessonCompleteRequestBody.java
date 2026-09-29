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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\\\b\u0002\u0010\u0002\u001aV\u0012\u0004\u0012\u00020\u0004\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u00060\u0003j*\u0012\u0004\u0012\u00020\u0004\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u0006`\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0005H\u0002J\u001c\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001fJ]\u0010!\u001aV\u0012\u0004\u0012\u00020\u0004\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u00060\u0003j*\u0012\u0004\u0012\u00020\u0004\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u0006`\u0006HÆ\u0003J\t\u0010\"\u001a\u00020\bHÆ\u0003J\t\u0010#\u001a\u00020\u0004HÆ\u0003J{\u0010$\u001a\u00020\u00002\\\b\u0002\u0010\u0002\u001aV\u0012\u0004\u0012\u00020\u0004\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u00060\u0003j*\u0012\u0004\u0012\u00020\u0004\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u0006`\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0004HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0005HÖ\u0001J\t\u0010)\u001a\u00020\u0004HÖ\u0001Rp\u0010\u0002\u001aV\u0012\u0004\u0012\u00020\u0004\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u00060\u0003j*\u0012\u0004\u0012\u00020\u0004\u0012 \u0012\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\u0006`\u00068\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u00020\b8\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\t\u001a\u00020\u00048\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006*"}, d2 = {"Lcom/marrow2/data/lesson/remote/model/MarkLessonCompleteRequestBody;", "", "result", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "lastSubmittedOn", "", "courseId", "<init>", "(Ljava/util/HashMap;JLjava/lang/String;)V", "getResult", "()Ljava/util/HashMap;", "setResult", "(Ljava/util/HashMap;)V", "getLastSubmittedOn", "()J", "setLastSubmittedOn", "(J)V", "getCourseId", "()Ljava/lang/String;", "setCourseId", "(Ljava/lang/String;)V", "addAnswer", "", "parentId", "mcqId", "answerIndex", "addAll", "allAnswers", "", "Lcom/marrow2/data/mcq/local/model/McqAnswerRepoModel;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MarkLessonCompleteRequestBody {
    public static final int $stable = 8;
    private String courseId;
    private long lastSubmittedOn;
    private HashMap<String, HashMap<String, Integer>> result;

    public MarkLessonCompleteRequestBody(HashMap<String, HashMap<String, Integer>> map, long j, String str) {
        toMagicModuleMetaRepoModel.write(map, "");
        toMagicModuleMetaRepoModel.write(str, "");
        this.result = map;
        this.lastSubmittedOn = j;
        this.courseId = str;
    }

    public /* synthetic */ MarkLessonCompleteRequestBody(HashMap map, long j, String str, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? new HashMap() : map, (i & 2) != 0 ? 0L : j, str);
    }

    @JsonProperty("result")
    public final HashMap<String, HashMap<String, Integer>> getResult() {
        return this.result;
    }

    public final void setResult(HashMap<String, HashMap<String, Integer>> map) {
        toMagicModuleMetaRepoModel.write(map, "");
        this.result = map;
    }

    @JsonProperty("last_submitted_on")
    public final long getLastSubmittedOn() {
        return this.lastSubmittedOn;
    }

    public final void setLastSubmittedOn(long j) {
        this.lastSubmittedOn = j;
    }

    @JsonProperty(FilterParams.KEY_COURSE_ID)
    public final String getCourseId() {
        return this.courseId;
    }

    public final void setCourseId(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.courseId = str;
    }

    private final void addAnswer(String parentId, String mcqId, int answerIndex) {
        HashMap<String, Integer> map = this.result.get(parentId);
        if (map == null) {
            map = new HashMap<>();
        }
        this.result.put(parentId, map);
        this.result.put(parentId, map);
        map.put(mcqId, Integer.valueOf(answerIndex));
    }

    public final void addAll(String parentId, List<dropTable> allAnswers) {
        toMagicModuleMetaRepoModel.write(parentId, "");
        toMagicModuleMetaRepoModel.write(allAnswers, "");
        for (dropTable droptable : allAnswers) {
            addAnswer(parentId, droptable.getMediaBrowserCompatItemReceiver(), droptable.getMediaBrowserCompatCustomActionResultReceiver());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MarkLessonCompleteRequestBody copy$default(MarkLessonCompleteRequestBody markLessonCompleteRequestBody, HashMap map, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            map = markLessonCompleteRequestBody.result;
        }
        if ((i & 2) != 0) {
            j = markLessonCompleteRequestBody.lastSubmittedOn;
        }
        if ((i & 4) != 0) {
            str = markLessonCompleteRequestBody.courseId;
        }
        return markLessonCompleteRequestBody.copy(map, j, str);
    }

    public final HashMap<String, HashMap<String, Integer>> component1() {
        return this.result;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getLastSubmittedOn() {
        return this.lastSubmittedOn;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCourseId() {
        return this.courseId;
    }

    public final MarkLessonCompleteRequestBody copy(HashMap<String, HashMap<String, Integer>> result, long lastSubmittedOn, String courseId) {
        toMagicModuleMetaRepoModel.write(result, "");
        toMagicModuleMetaRepoModel.write(courseId, "");
        return new MarkLessonCompleteRequestBody(result, lastSubmittedOn, courseId);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MarkLessonCompleteRequestBody)) {
            return false;
        }
        MarkLessonCompleteRequestBody markLessonCompleteRequestBody = (MarkLessonCompleteRequestBody) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.result, markLessonCompleteRequestBody.result) && this.lastSubmittedOn == markLessonCompleteRequestBody.lastSubmittedOn && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.courseId, (Object) markLessonCompleteRequestBody.courseId);
    }

    public final int hashCode() {
        return (((this.result.hashCode() * 31) + Long.hashCode(this.lastSubmittedOn)) * 31) + this.courseId.hashCode();
    }

    public final String toString() {
        HashMap<String, HashMap<String, Integer>> map = this.result;
        long j = this.lastSubmittedOn;
        String str = this.courseId;
        StringBuilder sb = new StringBuilder("MarkLessonCompleteRequestBody(result=");
        sb.append(map);
        sb.append(", lastSubmittedOn=");
        sb.append(j);
        sb.append(", courseId=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
