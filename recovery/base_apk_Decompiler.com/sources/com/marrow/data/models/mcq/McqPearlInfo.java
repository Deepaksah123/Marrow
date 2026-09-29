package com.marrow.data.models.mcq;

/* JADX INFO: loaded from: classes.dex */
public class McqPearlInfo {
    private String mMcqId;
    private String mPearlId;

    public McqPearlInfo(String str, String str2) {
        this.mMcqId = str;
        this.mPearlId = str2;
    }

    public String getMcqId() {
        return this.mMcqId;
    }

    public void setMcqId(String str) {
        this.mMcqId = str;
    }

    public String getPearlId() {
        return this.mPearlId;
    }

    public void setPearlId(String str) {
        this.mPearlId = str;
    }

    public static McqPearlInfo[] newArray(String str, String[] strArr) {
        if (strArr == null) {
            return null;
        }
        int length = strArr.length;
        McqPearlInfo[] mcqPearlInfoArr = new McqPearlInfo[length];
        for (int i = 0; i < length; i++) {
            mcqPearlInfoArr[i] = new McqPearlInfo(str, strArr[i]);
        }
        return mcqPearlInfoArr;
    }
}
