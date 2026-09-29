package com.marrow2.data.test.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.IntermediateLoginResponseBody;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0007\u0010\u0010"}, d2 = {"Lcom/marrow2/data/test/remote/model/GTSubjectAnalyticsV2ResponseModel;", "", "<init>", "()V", "Lcom/fasterxml/jackson/databind/JsonNode;", "p0", "", "setTopicStat", "(Lcom/fasterxml/jackson/databind/JsonNode;)V", "", "Lcom/marrow2/data/test/remote/model/TestProgressV2ResponseModel;", "testProgressData", "Ljava/util/List;", "getTestProgressData", "()Ljava/util/List;", "setTestProgressData", "(Ljava/util/List;)V", "Lcom/marrow2/data/test/remote/model/TopicStatV2ResponseModel;", "topicStat", "getTopicStat", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GTSubjectAnalyticsV2ResponseModel {
    public static final String KEY_CORRECT = "correct";
    public static final String KEY_PERCENTAGE = "percentage";
    public static final String KEY_SKIPPED = "skipped";
    public static final String KEY_TITLE = "title";
    public static final String KEY_TOTAL = "total";
    public static final String KEY_WEAK_LESSONS = "weak_lessons";
    public static final String KEY_WEAK_LESSON_COUNT = "weak_lesson_count";
    public static final String KEY_WL_TITLE = "title";
    public static final String KEY_WRONG = "wrong";

    @JsonProperty("test_progress_data")
    private List<TestProgressV2ResponseModel> testProgressData;
    private List<TopicStatV2ResponseModel> topicStat;
    public static final int $stable = 8;

    public final List<TestProgressV2ResponseModel> getTestProgressData() {
        return this.testProgressData;
    }

    public final void setTestProgressData(List<TestProgressV2ResponseModel> list) {
        this.testProgressData = list;
    }

    public final List<TopicStatV2ResponseModel> getTopicStat() {
        return this.topicStat;
    }

    public final void setTopicStat(List<TopicStatV2ResponseModel> list) {
        this.topicStat = list;
    }

    @JsonProperty("topic_stat")
    public final void setTopicStat(JsonNode p0) {
        List listRemoteActionCompatParcelizer;
        JsonNode jsonNode = p0;
        toMagicModuleMetaRepoModel.write(jsonNode, "");
        if (p0.isObject()) {
            Iterator<String> itFieldNames = p0.fieldNames();
            ArrayList arrayList = new ArrayList();
            while (itFieldNames.hasNext()) {
                String next = itFieldNames.next();
                JsonNode jsonNode2 = jsonNode.get(next);
                JsonNode jsonNode3 = jsonNode2.get(KEY_WEAK_LESSONS);
                if (jsonNode3 == null || !jsonNode3.isArray()) {
                    listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<JsonNode> it = jsonNode3.iterator();
                    while (it.hasNext()) {
                        JsonNode jsonNode4 = it.next().get("title");
                        String strAsText = jsonNode4 != null ? jsonNode4.asText() : null;
                        if (strAsText == null) {
                            strAsText = "";
                        }
                        arrayList2.add(new WeakLessonV2ResponseModel(strAsText));
                    }
                    listRemoteActionCompatParcelizer = arrayList2;
                }
                toMagicModuleMetaRepoModel.write((Object) next);
                JsonNode jsonNode5 = jsonNode2.get("correct");
                int iAsInt = jsonNode5 != null ? jsonNode5.asInt() : 0;
                JsonNode jsonNode6 = jsonNode2.get("wrong");
                int iAsInt2 = jsonNode6 != null ? jsonNode6.asInt() : 0;
                JsonNode jsonNode7 = jsonNode2.get("skipped");
                int iAsInt3 = jsonNode7 != null ? jsonNode7.asInt() : 0;
                JsonNode jsonNode8 = jsonNode2.get("total");
                int iAsInt4 = jsonNode8 != null ? jsonNode8.asInt() : 0;
                JsonNode jsonNode9 = jsonNode2.get("percentage");
                double dAsDouble = jsonNode9 != null ? jsonNode9.asDouble() : 0.0d;
                JsonNode jsonNode10 = jsonNode2.get("title");
                String strAsText2 = jsonNode10 != null ? jsonNode10.asText() : null;
                String str = strAsText2 == null ? "" : strAsText2;
                JsonNode jsonNode11 = jsonNode2.get(KEY_WEAK_LESSON_COUNT);
                arrayList.add(new TopicStatV2ResponseModel(next, iAsInt, iAsInt2, iAsInt3, iAsInt4, dAsDouble, str, jsonNode11 != null ? jsonNode11.asInt() : 0, listRemoteActionCompatParcelizer));
                jsonNode = p0;
            }
            this.topicStat = arrayList;
        }
    }
}
