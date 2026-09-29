package com.marrow.data.models.mcq;

/* JADX INFO: loaded from: classes.dex */
public class McqAnswer {
    public static final double SILLY_MISTAKE_THRESHOLD = 85.0d;
    public static final int SKIP_INDEX = -1;
    private int firstAnswer;
    private String[] highYieldIds;
    private boolean isRight;
    private boolean isSillyMistake;
    private boolean isStarred;
    private boolean mIsGuessed;
    private String mMCQId;
    private String mParentId;
    private int mServerAnswer;
    private String parentMcqId;

    public String getMcqId() {
        return this.mMCQId;
    }

    public void setMcqId(String str) {
        this.mMCQId = str;
    }

    public int getSelectedAnswer() {
        return this.mServerAnswer;
    }

    public int getSelectedAnswerIndex() {
        return this.mServerAnswer - 1;
    }

    public int getServerAnswer() {
        return this.mServerAnswer;
    }

    public void setSelectedAnswerIndex(int i) {
        setServerAnswer(i + 1);
    }

    public boolean isFirstAnswerSkipped() {
        return this.firstAnswer == 0;
    }

    public void setFirstAnswerIndex(int i) {
        setFirstAnswer(i + 1);
    }

    public void setFirstAnswer(int i) {
        this.firstAnswer = i;
    }

    public void setServerAnswer(int i) {
        this.mServerAnswer = i;
    }

    public String getParentId() {
        return this.mParentId;
    }

    public void setParentId(String str) {
        this.mParentId = str;
    }

    public boolean isAnswerSkipped() {
        return this.mServerAnswer == 0;
    }

    public void setGuessed(boolean z) {
        this.mIsGuessed = z;
    }

    public boolean isGuessed() {
        return this.mIsGuessed;
    }

    public static int getSelectedAnswerIndex(McqAnswer mcqAnswer) {
        if (mcqAnswer != null) {
            return mcqAnswer.getSelectedAnswerIndex();
        }
        return -1;
    }

    public boolean isStarred() {
        return this.isStarred;
    }

    public void setStarred(boolean z) {
        this.isStarred = z;
    }

    public int getFirstAnswer() {
        return this.firstAnswer;
    }

    public boolean hasChangeDiff() {
        return this.firstAnswer != this.mServerAnswer;
    }

    public boolean isRight() {
        return this.isRight;
    }

    public void setRight(boolean z) {
        this.isRight = z;
    }

    public void setSillyMistake(boolean z) {
        this.isSillyMistake = z;
    }

    public boolean isSillyMistake() {
        return this.isSillyMistake;
    }

    public void setParentMcqId(String str) {
        this.parentMcqId = str;
    }

    public String getParentMcqId() {
        return this.parentMcqId;
    }

    public String[] getHighYieldIds() {
        return this.highYieldIds;
    }

    public void setHighYieldIds(String[] strArr) {
        this.highYieldIds = strArr;
    }
}
