package com.marrow.data.models.test;

import com.marrow.data.api.models.response.sync.CrossDeviceSyncResponseObject;

/* JADX INFO: loaded from: classes3.dex */
public class TestAttendeeData {
    private int mIsRanked;
    private int mPossibleScore;
    private int mRank;
    private double mScore;
    private int mStatus;
    private long mStatusTimeStamp;
    private String mTestId;
    private long mUserStartedTimestamp;
    private long userSubmittedTimestamp;

    public String getTestId() {
        return this.mTestId;
    }

    public void setTestId(String str) {
        this.mTestId = str;
    }

    public int getRank() {
        return this.mRank;
    }

    public void setRank(int i) {
        this.mRank = i;
    }

    public double getScore() {
        return this.mScore;
    }

    public void setScore(double d) {
        this.mScore = d;
    }

    public int getPossibleScore() {
        return this.mPossibleScore;
    }

    public void setPossibleScore(int i) {
        this.mPossibleScore = i;
    }

    public int getStatus() {
        return this.mStatus;
    }

    public void setStatus(int i) {
        this.mStatus = i;
    }

    public long getTestBeginTimestamp() {
        return this.mUserStartedTimestamp;
    }

    public void setTestBeginTimestamp(long j) {
        this.mUserStartedTimestamp = j;
    }

    public long getSubmissionTimestamp() {
        return this.userSubmittedTimestamp;
    }

    public void setSubmissionTimestamp(long j) {
        this.userSubmittedTimestamp = j;
    }

    public long getStatusTimestamp() {
        return this.mStatusTimeStamp;
    }

    public void setStatusTimestamp(long j) {
        this.mStatusTimeStamp = j;
    }

    public int getIsRanked() {
        return this.mIsRanked;
    }

    public void setRanked(int i) {
        this.mIsRanked = i;
    }

    public void fromSyncData(CrossDeviceSyncResponseObject crossDeviceSyncResponseObject) {
        this.mTestId = crossDeviceSyncResponseObject.contentId;
        this.mUserStartedTimestamp = crossDeviceSyncResponseObject.innerData.userStartedTimeStamp;
        this.userSubmittedTimestamp = crossDeviceSyncResponseObject.innerData.userSubmissionTimestamp;
        this.mStatusTimeStamp = crossDeviceSyncResponseObject.lastUpdated;
        this.mScore = crossDeviceSyncResponseObject.innerData.score;
        this.mPossibleScore = crossDeviceSyncResponseObject.innerData.possibleScore;
        this.mStatus = crossDeviceSyncResponseObject.innerData.status;
        this.mRank = crossDeviceSyncResponseObject.innerData.rank;
        this.mIsRanked = crossDeviceSyncResponseObject.innerData.isRanked;
    }
}
