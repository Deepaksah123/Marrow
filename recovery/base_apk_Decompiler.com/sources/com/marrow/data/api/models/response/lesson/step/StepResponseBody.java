package com.marrow.data.api.models.response.lesson.step;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.marrow.data.api.models.response.mcq.McqResponseBody;
import com.marrow.data.models.lesson.StepIndex;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class StepResponseBody extends StepIndex {
    public static final String KEY_MY_ANSWER = "my_answer";
    public static final String KEY_QUESTIONS = "questions";

    @JsonIgnore
    public HashMap<String, Integer> answerMap = new HashMap<>();

    @JsonProperty(KEY_QUESTIONS)
    public McqResponseBody[] questions;

    @JsonProperty(KEY_MY_ANSWER)
    public void setAnswer(JsonNode jsonNode) {
        if (jsonNode.isArray()) {
            return;
        }
        Iterator<String> itFieldNames = jsonNode.fieldNames();
        while (itFieldNames.hasNext()) {
            String next = itFieldNames.next();
            this.answerMap.put(next, Integer.valueOf(jsonNode.findValue(next).asInt()));
        }
    }
}
