package com.marrow.data.api.models.request.lesson;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.api.models.request.MarrowRequestBody;
import com.marrow.data.models.mcq.McqAnswer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MarkLessonCompleteRequestBody extends MarrowRequestBody {

    @JsonProperty("last_submitted_on")
    public long lastCompletionTimeMs;

    @JsonProperty("result")
    Map<String, Map<String, Integer>> result;

    public MarkLessonCompleteRequestBody(int i) {
        super(i);
        this.result = new HashMap();
    }

    public void addAnswer(String str, String str2, int i) {
        Map<String, Integer> map = this.result.get(str);
        if (map == null) {
            map = new HashMap<>();
            this.result.put(str, map);
        }
        map.put(str2, Integer.valueOf(i));
    }

    public void addAll(String str, List<McqAnswer> list) {
        if (list != null) {
            for (McqAnswer mcqAnswer : list) {
                addAnswer(str, mcqAnswer.getMcqId(), mcqAnswer.getSelectedAnswer());
            }
        }
    }
}
