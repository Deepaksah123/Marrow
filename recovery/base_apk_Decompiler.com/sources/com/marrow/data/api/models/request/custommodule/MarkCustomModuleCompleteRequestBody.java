package com.marrow.data.api.models.request.custommodule;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.api.models.request.MarrowRequestBody;
import com.marrow.data.models.mcq.McqAnswer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MarkCustomModuleCompleteRequestBody extends MarrowRequestBody {

    @JsonProperty("result")
    Map<String, Integer> result;

    @JsonProperty("status")
    public int status;

    public MarkCustomModuleCompleteRequestBody(int i) {
        super(i);
        this.result = new HashMap();
        this.status = 2;
    }

    public void addAnswer(String str, int i) {
        this.result.put(str, Integer.valueOf(i));
    }

    public void addAll(McqAnswer... mcqAnswerArr) {
        if (mcqAnswerArr != null) {
            for (McqAnswer mcqAnswer : mcqAnswerArr) {
                addAnswer(mcqAnswer.getMcqId(), mcqAnswer.getSelectedAnswer());
            }
        }
    }
}
