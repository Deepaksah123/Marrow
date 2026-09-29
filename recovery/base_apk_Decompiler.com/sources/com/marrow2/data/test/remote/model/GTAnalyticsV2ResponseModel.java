package com.marrow2.data.test.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\f\u001a\u0004\b\u0013\u0010\u000e\"\u0004\b\u0007\u0010\u0010"}, d2 = {"Lcom/marrow2/data/test/remote/model/GTAnalyticsV2ResponseModel;", "", "<init>", "()V", "Lcom/fasterxml/jackson/databind/JsonNode;", "p0", "", "setSubjectStat", "(Lcom/fasterxml/jackson/databind/JsonNode;)V", "", "Lcom/marrow2/data/test/remote/model/TestProgressV2ResponseModel;", "testProgressData", "Ljava/util/List;", "getTestProgressData", "()Ljava/util/List;", "setTestProgressData", "(Ljava/util/List;)V", "Lcom/marrow2/data/test/remote/model/SubjectStatV2ResponseModel;", "subjectStat", "getSubjectStat", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GTAnalyticsV2ResponseModel {
    public static final String KEY_PERCENTAGE = "percentage";
    public static final String KEY_PERCENTILE = "percentile";
    public static final String KEY_TITLE = "title";
    public static final String KEY_TOTAL_COUNT = "total_count";
    private List<SubjectStatV2ResponseModel> subjectStat;

    @JsonProperty("test_progress_data")
    private List<TestProgressV2ResponseModel> testProgressData;
    public static final int $stable = 8;

    public final List<TestProgressV2ResponseModel> getTestProgressData() {
        return this.testProgressData;
    }

    public final void setTestProgressData(List<TestProgressV2ResponseModel> list) {
        this.testProgressData = list;
    }

    public final List<SubjectStatV2ResponseModel> getSubjectStat() {
        return this.subjectStat;
    }

    public final void setSubjectStat(List<SubjectStatV2ResponseModel> list) {
        this.subjectStat = list;
    }

    @JsonProperty("subject_stat")
    public final void setSubjectStat(JsonNode p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0.isObject()) {
            Iterator<String> itFieldNames = p0.fieldNames();
            ArrayList arrayList = new ArrayList();
            while (itFieldNames.hasNext()) {
                String next = itFieldNames.next();
                JsonNode jsonNode = p0.get(next);
                toMagicModuleMetaRepoModel.write((Object) next);
                JsonNode jsonNode2 = jsonNode.get("percentage");
                double dAsDouble = jsonNode2 != null ? jsonNode2.asDouble() : 0.0d;
                JsonNode jsonNode3 = jsonNode.get("title");
                String strAsText = jsonNode3 != null ? jsonNode3.asText() : null;
                String str = strAsText == null ? "" : strAsText;
                JsonNode jsonNode4 = jsonNode.get("percentile");
                double dAsDouble2 = jsonNode4 != null ? jsonNode4.asDouble() : 0.0d;
                JsonNode jsonNode5 = jsonNode.get(KEY_TOTAL_COUNT);
                arrayList.add(new SubjectStatV2ResponseModel(next, dAsDouble, str, dAsDouble2, jsonNode5 != null ? jsonNode5.asInt() : 0));
            }
            this.subjectStat = arrayList;
        }
    }
}
