package com.marrow.data.api.models.response.custommodule;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.marrow.data.api.models.response.mcq.McqResponseBody;
import com.marrow.data.models.custommodule.CustomModule;
import com.marrow.data.models.custommodule.FilterParams;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00182\u00020\u00012\u00020\u0002:\u0001\u0018B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0007R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0004\n\u0002\u0010\bR.\u0010\t\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nj\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f`\r8\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R&\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u000fj\n\u0012\u0004\u0012\u00020\u000b\u0018\u0001`\u00108\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0015\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/marrow/data/api/models/response/custommodule/CustomModuleResponseBody;", "Lcom/marrow/data/models/custommodule/CustomModule;", "Ljava/io/Serializable;", "<init>", "()V", "questions", "", "Lcom/marrow/data/api/models/response/mcq/McqResponseBody;", "[Lcom/marrow/data/api/models/response/mcq/McqResponseBody;", "answerMap", "Ljava/util/HashMap;", "", "", "Lkotlin/collections/HashMap;", "guessedMcqs", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "setAnswer", "", "jsonNode", "Lcom/fasterxml/jackson/databind/JsonNode;", "customModule", "getCustomModule", "()Lcom/marrow/data/models/custommodule/CustomModule;", "Companion", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CustomModuleResponseBody extends CustomModule implements Serializable {
    private static final String KEY_GUESSED = "guessed";
    private static final String KEY_MY_ANSWER = "my_answer";
    private static final String KEY_QUESTIONS = "questions";

    @JsonProperty(KEY_GUESSED)
    public ArrayList<String> guessedMcqs;

    @JsonProperty("questions")
    public McqResponseBody[] questions = new McqResponseBody[0];

    @JsonIgnore
    public HashMap<String, Integer> answerMap = new HashMap<>();

    @JsonProperty("my_answer")
    public final void setAnswer(JsonNode jsonNode) {
        toMagicModuleMetaRepoModel.write(jsonNode, "");
        if (jsonNode.isArray()) {
            return;
        }
        Iterator<String> itFieldNames = jsonNode.fieldNames();
        while (itFieldNames.hasNext()) {
            String next = itFieldNames.next();
            this.answerMap.put(next, Integer.valueOf(jsonNode.findValue(next).asInt()));
        }
    }

    public final CustomModule getCustomModule() {
        CustomModule customModule = new CustomModule();
        customModule.id = this.id;
        customModule.createdOn = this.createdOn;
        customModule.setInviteCode(getInviteCode());
        customModule.mcqCount = this.mcqCount;
        String warningMsg = getWarningMsg();
        if (warningMsg == null) {
            warningMsg = "";
        }
        customModule.setWarningMsg(warningMsg);
        FilterParams responseParams = getResponseParams();
        if (responseParams == null) {
            responseParams = this.params;
        }
        customModule.setResponseParams(responseParams);
        customModule.params = this.params;
        customModule.taskStatus = this.taskStatus;
        customModule.status = this.status;
        customModule.setExpired(getIsExpired());
        customModule.setTestName(getTestName());
        customModule.setModuleOwner(getModuleOwner());
        customModule.setModuleMessage(getModuleMessage());
        customModule.setExpiredOn(getExpiredOn());
        customModule.setStartDateTime(getStartDateTime());
        customModule.setExamDurationSeconds(getExamDurationSeconds());
        return customModule;
    }
}
