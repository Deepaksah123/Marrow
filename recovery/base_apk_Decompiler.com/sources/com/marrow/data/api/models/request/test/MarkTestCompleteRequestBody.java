package com.marrow.data.api.models.request.test;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.api.models.request.MarrowRequestBody;
import com.marrow.data.models.mcq.McqAnswer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class MarkTestCompleteRequestBody extends MarrowRequestBody {

    @JsonProperty("answer_changed")
    public Map<String, Integer> answersChanged;

    @JsonProperty("time_taken_for_1st_attempt")
    public int firstAttemptTimeSeconds;

    @JsonProperty("force_submit")
    public boolean forceSubmit;

    @JsonProperty("guessed")
    public ArrayList<String> guessed;

    @JsonProperty("is_discarded")
    boolean isDiscarded;

    @JsonProperty("ntr")
    public int ntr;

    @JsonProperty("result")
    public Map<String, Integer> result;

    @JsonProperty("time_taken_for_review_attempt")
    public int reviewAttemptTimeSeconds;

    @JsonProperty("mark_reviewed")
    public ArrayList<String> starredList;

    @JsonProperty("time_taken")
    public int timeTook;

    public MarkTestCompleteRequestBody(int i, boolean z, boolean z2) {
        super(i);
        this.answersChanged = new HashMap();
        this.result = new HashMap();
        this.guessed = new ArrayList<>();
        this.ntr = 1;
        this.forceSubmit = false;
        this.starredList = new ArrayList<>();
        this.isDiscarded = z;
        this.forceSubmit = z2;
    }

    public void putAnswers(McqAnswer... mcqAnswerArr) {
        if (mcqAnswerArr != null) {
            for (McqAnswer mcqAnswer : mcqAnswerArr) {
                int selectedAnswer = mcqAnswer.getSelectedAnswer();
                int firstAnswer = mcqAnswer.getFirstAnswer();
                String mcqId = mcqAnswer.getMcqId();
                this.result.put(mcqId, Integer.valueOf(mcqAnswer.getSelectedAnswer()));
                if (!mcqAnswer.isAnswerSkipped() && mcqAnswer.isGuessed()) {
                    this.guessed.add(mcqId);
                }
                if (!mcqAnswer.isAnswerSkipped() && mcqAnswer.isStarred()) {
                    this.starredList.add(mcqId);
                }
                if (!mcqAnswer.isFirstAnswerSkipped() && firstAnswer != selectedAnswer) {
                    this.answersChanged.put(mcqId, Integer.valueOf(firstAnswer));
                }
            }
        }
    }
}
