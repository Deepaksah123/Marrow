package com.marrow.data.models.mcq;

import kotlin.parseDolbyChannelConfiguration;

/* JADX INFO: loaded from: classes5.dex */
public class McqPager {
    public static final int TYPE_CORRECT = 1;
    public static final int TYPE_SKIPPED = 0;
    public static final int TYPE_UNANSWERED = -2;
    public static final int TYPE_WRONG = -1;
    private String[] mMainMcqIds;
    private String mParentId;
    private boolean mResumeExplanation;
    private int startIndex = 0;

    public int getStartIndex() {
        return this.startIndex;
    }

    public void setStartIndex(int i) {
        this.startIndex = i;
    }

    public void setMainMcqIds(String[] strArr) {
        this.mMainMcqIds = strArr;
    }

    public String[] getMainMcqIds() {
        return this.mMainMcqIds;
    }

    public int getAnsweredCount() {
        return getTotal() - getPlaybackCount();
    }

    public int getPlaybackCount() {
        String[] strArr = this.mMainMcqIds;
        if (strArr == null) {
            return 0;
        }
        return strArr.length;
    }

    public String getParentId() {
        return this.mParentId;
    }

    public String[] getPagerMcqIds() {
        return this.mMainMcqIds;
    }

    public int getTotal() {
        String[] strArr = this.mMainMcqIds;
        if (strArr == null) {
            return 0;
        }
        return strArr.length;
    }

    public void setParentId(String str) {
        this.mParentId = str;
    }

    public String getMcqId(int i) {
        return this.mMainMcqIds[i];
    }

    public void setResumeExplanation(boolean z) {
        this.mResumeExplanation = z;
    }

    public boolean isResumeExplnation() {
        return this.mResumeExplanation;
    }

    public boolean isFirstMcq(String str) {
        return getPlaybackCount() != 0 && parseDolbyChannelConfiguration.RemoteActionCompatParcelizer(getMcqId(getStartIndex()), str);
    }

    public int getOriginalPosition(String str) {
        int total = getTotal();
        for (int i = 0; i < total; i++) {
            if (this.mMainMcqIds[i].equals(str)) {
                return i;
            }
        }
        return -1;
    }

    public int getPlaybackIndex(String str) {
        if (this.mMainMcqIds == null) {
            return -1;
        }
        String[] pagerMcqIds = getPagerMcqIds();
        for (int i = 0; i < pagerMcqIds.length; i++) {
            if (parseDolbyChannelConfiguration.RemoteActionCompatParcelizer(str, pagerMcqIds[i])) {
                return i;
            }
        }
        return -1;
    }
}
