package com.marrow.data.models.mcq;

import java.util.Locale;
import kotlin.parseDolbyChannelConfiguration;

/* JADX INFO: loaded from: classes3.dex */
public class QaPair {
    private McqAnswer mAnswer;
    private String mAnswerPointer;
    private String mId;
    private boolean mIsStarred;

    public QaPair() {
    }

    public QaPair(McqIndex mcqIndex, McqAnswer mcqAnswer) {
        this.mId = mcqIndex.getMcqId();
        if (mcqAnswer != null) {
            this.mIsStarred = mcqAnswer.isStarred();
        }
        this.mAnswerPointer = mcqIndex.getAnswerPointer();
        setAnswer(mcqAnswer);
    }

    public QaPair(String str, String str2, boolean z, McqAnswer mcqAnswer) {
        this.mId = str;
        this.mIsStarred = z;
        this.mAnswerPointer = str2;
        setAnswer(mcqAnswer);
    }

    private void setAnswer(McqAnswer mcqAnswer) {
        if (mcqAnswer == null) {
            this.mAnswer = null;
            return;
        }
        if (parseDolbyChannelConfiguration.RemoteActionCompatParcelizer(this.mId, mcqAnswer.getMcqId())) {
            this.mAnswer = mcqAnswer;
            return;
        }
        String str = this.mId;
        McqAnswer mcqAnswer2 = this.mAnswer;
        if (mcqAnswer2 != null) {
            throw new RuntimeException(String.format(Locale.getDefault(), "MCQ Id mismatch: Expected: %s, Actual: %s", str, mcqAnswer2.getMcqId()));
        }
        throw new RuntimeException(String.format(Locale.getDefault(), "MCQ Id mismatch: Expected: %s, Actual: %s", str, "No answer present"));
    }

    public boolean equals(Object obj) {
        return (obj instanceof QaPair) && parseDolbyChannelConfiguration.RemoteActionCompatParcelizer(this.mId, ((QaPair) obj).mId);
    }

    public boolean isAnswerAvailable() {
        McqAnswer mcqAnswer = this.mAnswer;
        return (mcqAnswer == null || mcqAnswer.getSelectedAnswerIndex() == -1) ? false : true;
    }

    public String getKey() {
        return this.mId;
    }

    public McqAnswer getAnswer() {
        return this.mAnswer;
    }

    public static String toString(QaPair qaPair) {
        if (qaPair == null) {
            return "null";
        }
        StringBuilder sb = new StringBuilder("[");
        sb.append(qaPair.getKey());
        sb.append(":");
        sb.append(qaPair.getAnswer());
        sb.append("]");
        return sb.toString();
    }

    private boolean isAnswerSkipped() {
        McqAnswer mcqAnswer = this.mAnswer;
        return mcqAnswer == null || mcqAnswer.getSelectedAnswerIndex() == -1;
    }

    public boolean isGuessed() {
        return !isAnswerSkipped() && this.mAnswer.isGuessed();
    }

    public static int getSelectedAnswerIndex(QaPair qaPair) {
        if (qaPair == null || qaPair.getAnswer() == null) {
            return -1;
        }
        return qaPair.getAnswer().getSelectedAnswerIndex();
    }

    public String getAnswerPointer() {
        return this.mAnswerPointer;
    }

    public String getMcqId() {
        return this.mId;
    }

    public boolean isStarred() {
        return this.mIsStarred;
    }
}
