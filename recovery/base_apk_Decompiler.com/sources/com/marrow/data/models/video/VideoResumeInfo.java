package com.marrow.data.models.video;

/* JADX INFO: loaded from: classes3.dex */
public class VideoResumeInfo {
    private String mReferenceId;
    private long mResumeTimeMs;
    private long mTotalDurationMs;
    private String mVideoId;

    public VideoResumeInfo(String str, long j, String str2, long j2) {
        this.mVideoId = str;
        this.mResumeTimeMs = j;
        this.mReferenceId = str2;
        this.mTotalDurationMs = j2;
    }

    public String getVideoId() {
        return this.mVideoId;
    }

    public void setVideoId(String str) {
        this.mVideoId = str;
    }

    public long getResumeTimeMs() {
        return this.mResumeTimeMs;
    }

    public void setResumeTimeMs(long j) {
        this.mResumeTimeMs = j;
    }

    public long getTotalDurationMs() {
        return this.mTotalDurationMs;
    }

    public String getReferenceId() {
        return this.mReferenceId;
    }
}
