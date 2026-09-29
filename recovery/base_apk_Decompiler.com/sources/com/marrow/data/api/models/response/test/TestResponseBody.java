package com.marrow.data.api.models.response.test;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.marrow.data.api.models.response.mcq.McqResponseBody;
import com.marrow.data.api.models.response.mcq.TestGroup;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class TestResponseBody {
    private static final String KEY_ANSWERS_CHANGED = "answer_changed";
    private static final String KEY_GUESSED = "guessed";
    private static final String KEY_MY_ANSWER = "my_answer";
    private static final String KEY_QUESTIONS = "questions";
    private static final String KEY_STARRED = "mark_reviewed";
    private static final String KEY_TEST_GROUP = "test_groups";
    private static final String KEY_TEST_ID = "_id";

    @JsonProperty("questions")
    public McqResponseBody[] questions;

    @JsonProperty("_id")
    public String testId;

    @JsonProperty(KEY_TEST_GROUP)
    public TestGroup[] testGroup = null;

    @JsonIgnore
    public HashMap<String, Integer> myAnswer = new HashMap<>();

    @JsonIgnore
    public HashMap<String, Integer> answersChanged = new HashMap<>();

    @JsonIgnore
    public HashMap<String, Integer> mcqStarredMap = new HashMap<>();

    @JsonIgnore
    public HashMap<String, Integer> mcqGuessedMap = new HashMap<>();

    @JsonSetter(KEY_STARRED)
    public HashMap<String, Integer> getMcqStarredMap(JsonNode jsonNode) {
        if (!jsonNode.isArray()) {
            return new HashMap<>();
        }
        Iterator<JsonNode> it = ((ArrayNode) jsonNode).iterator();
        while (it.hasNext()) {
            this.mcqStarredMap.put(it.next().asText(), 1);
        }
        return this.mcqStarredMap;
    }

    @JsonSetter(KEY_GUESSED)
    public HashMap<String, Integer> getMcqGuessedMap(JsonNode jsonNode) {
        if (!jsonNode.isArray()) {
            return new HashMap<>();
        }
        Iterator<JsonNode> it = ((ArrayNode) jsonNode).iterator();
        while (it.hasNext()) {
            this.mcqGuessedMap.put(it.next().asText(), 1);
        }
        return this.mcqGuessedMap;
    }

    @JsonProperty("my_answer")
    public void setAnswer(JsonNode jsonNode) {
        if (jsonNode.isArray()) {
            return;
        }
        Iterator<String> itFieldNames = jsonNode.fieldNames();
        while (itFieldNames.hasNext()) {
            String next = itFieldNames.next();
            this.myAnswer.put(next, Integer.valueOf(jsonNode.findValue(next).asInt()));
        }
    }

    @JsonProperty(KEY_ANSWERS_CHANGED)
    public void setAnswersChanged(JsonNode jsonNode) {
        if (jsonNode.isArray()) {
            return;
        }
        Iterator<String> itFieldNames = jsonNode.fieldNames();
        while (itFieldNames.hasNext()) {
            String next = itFieldNames.next();
            this.answersChanged.put(next, Integer.valueOf(jsonNode.findValue(next).asInt()));
        }
    }
}
