package com.marrow.data.api.models.response.gta;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.marrow.data.models.test.TestSubjectStat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u0007\u0010\u000fR*\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017"}, d2 = {"Lcom/marrow/data/api/models/response/gta/GtaResponseBody;", "", "<init>", "()V", "Lcom/fasterxml/jackson/databind/JsonNode;", "p0", "", "setSubjectStat", "(Lcom/fasterxml/jackson/databind/JsonNode;)V", "", "Lcom/marrow/data/models/test/TestSubjectStat;", "subjectStat", "Ljava/util/List;", "getSubjectStat", "()Ljava/util/List;", "(Ljava/util/List;)V", "", "Lcom/marrow/data/api/models/response/gta/TestProgress;", "testProgressData", "[Lcom/marrow/data/api/models/response/gta/TestProgress;", "getTestProgressData", "()[Lcom/marrow/data/api/models/response/gta/TestProgress;", "setTestProgressData", "([Lcom/marrow/data/api/models/response/gta/TestProgress;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class GtaResponseBody {
    private List<? extends TestSubjectStat> subjectStat;

    @JsonProperty("test_progress_data")
    private TestProgress[] testProgressData;

    public final List<TestSubjectStat> getSubjectStat() {
        return this.subjectStat;
    }

    public final void setSubjectStat(List<? extends TestSubjectStat> list) {
        this.subjectStat = list;
    }

    public final TestProgress[] getTestProgressData() {
        return this.testProgressData;
    }

    public final void setTestProgressData(TestProgress[] testProgressArr) {
        this.testProgressData = testProgressArr;
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
                TestSubjectStat testSubjectStat = new TestSubjectStat();
                testSubjectStat.subjectId = next;
                if (jsonNode.get("percentile") != null) {
                    testSubjectStat.percentile = jsonNode.get("percentile").asDouble();
                }
                arrayList.add(testSubjectStat);
            }
            this.subjectStat = arrayList;
        }
    }
}
