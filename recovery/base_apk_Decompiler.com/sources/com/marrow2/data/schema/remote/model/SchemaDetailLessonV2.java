package com.marrow2.data.schema.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.marrow.data.api.models.response.lesson.step.StepResponseBody;
import com.marrow.data.api.models.response.mcq.McqResponseBody;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010%\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J4\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u000fR\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000fR\u001a\u0010\u001f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u000fR(\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0012\"\u0004\b$\u0010%R&\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00180&8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*"}, d2 = {"Lcom/marrow2/data/schema/remote/model/SchemaDetailLessonV2;", "", "", "p0", "p1", "", "Lcom/marrow/data/api/models/response/mcq/McqResponseBody;", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Lcom/fasterxml/jackson/databind/JsonNode;", "", "setAnswer", "(Lcom/fasterxml/jackson/databind/JsonNode;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/marrow2/data/schema/remote/model/SchemaDetailLessonV2;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "lessonId", "Ljava/lang/String;", "getLessonId", "stepId", "getStepId", StepResponseBody.KEY_QUESTIONS, "Ljava/util/List;", "getQuestions", "setQuestions", "(Ljava/util/List;)V", "", "answerMap", "Ljava/util/Map;", "getAnswerMap", "()Ljava/util/Map;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SchemaDetailLessonV2 {
    public static final int $stable = 8;
    private final Map<String, Integer> answerMap;
    private final String lessonId;
    private List<? extends McqResponseBody> questions;
    private final String stepId;

    public SchemaDetailLessonV2(@JsonProperty("_id") String str, @JsonProperty("step_id") String str2, @JsonProperty(StepResponseBody.KEY_QUESTIONS) List<? extends McqResponseBody> list) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.lessonId = str;
        this.stepId = str2;
        this.questions = list;
        this.answerMap = new LinkedHashMap();
    }

    public /* synthetic */ SchemaDetailLessonV2(String str, String str2, List list, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list);
    }

    public final String getLessonId() {
        return this.lessonId;
    }

    public final String getStepId() {
        return this.stepId;
    }

    public final List<McqResponseBody> getQuestions() {
        return this.questions;
    }

    public final void setQuestions(List<? extends McqResponseBody> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.questions = list;
    }

    public final Map<String, Integer> getAnswerMap() {
        return this.answerMap;
    }

    @JsonProperty(StepResponseBody.KEY_MY_ANSWER)
    public final void setAnswer(JsonNode p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0.isArray()) {
            return;
        }
        Iterator<String> itFieldNames = p0.fieldNames();
        while (itFieldNames.hasNext()) {
            String next = itFieldNames.next();
            this.answerMap.put(next, Integer.valueOf(p0.findValue(next).asInt()));
        }
    }

    public SchemaDetailLessonV2() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SchemaDetailLessonV2 copy$default(SchemaDetailLessonV2 schemaDetailLessonV2, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = schemaDetailLessonV2.lessonId;
        }
        if ((i & 2) != 0) {
            str2 = schemaDetailLessonV2.stepId;
        }
        if ((i & 4) != 0) {
            list = schemaDetailLessonV2.questions;
        }
        return schemaDetailLessonV2.copy(str, str2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getLessonId() {
        return this.lessonId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getStepId() {
        return this.stepId;
    }

    public final List<McqResponseBody> component3() {
        return this.questions;
    }

    public final SchemaDetailLessonV2 copy(@JsonProperty("_id") String p0, @JsonProperty("step_id") String p1, @JsonProperty(StepResponseBody.KEY_QUESTIONS) List<? extends McqResponseBody> p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        return new SchemaDetailLessonV2(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SchemaDetailLessonV2)) {
            return false;
        }
        SchemaDetailLessonV2 schemaDetailLessonV2 = (SchemaDetailLessonV2) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.lessonId, (Object) schemaDetailLessonV2.lessonId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.stepId, (Object) schemaDetailLessonV2.stepId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.questions, schemaDetailLessonV2.questions);
    }

    public final int hashCode() {
        return (((this.lessonId.hashCode() * 31) + this.stepId.hashCode()) * 31) + this.questions.hashCode();
    }

    public final String toString() {
        String str = this.lessonId;
        String str2 = this.stepId;
        List<? extends McqResponseBody> list = this.questions;
        StringBuilder sb = new StringBuilder("SchemaDetailLessonV2(lessonId=");
        sb.append(str);
        sb.append(", stepId=");
        sb.append(str2);
        sb.append(", questions=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
