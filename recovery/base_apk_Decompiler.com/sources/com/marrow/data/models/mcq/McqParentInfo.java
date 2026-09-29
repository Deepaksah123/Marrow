package com.marrow.data.models.mcq;

/* JADX INFO: loaded from: classes3.dex */
public class McqParentInfo {
    public static final String PARENT_TYPE_CUSTOM_MODULE = "cm";
    public static final String PARENT_TYPE_MAGIC_MODULE = "recall";
    public static final String PARENT_TYPE_MCQ = "mcq";
    public static final String PARENT_TYPE_PEARL = "pearl";
    public static final String PARENT_TYPE_STEP = "step";
    public static final String PARENT_TYPE_TEST = "test";
    private String mMCQId;
    private int mOrder;
    private String mParentId;
    private String mParentType;
    private String parentMcqId;

    public String getMCQId() {
        return this.mMCQId;
    }

    public void setMCQId(String str) {
        this.mMCQId = str;
    }

    public String getParentId() {
        return this.mParentId;
    }

    public void setParentId(String str) {
        this.mParentId = str;
    }

    public String getParentType() {
        return this.mParentType;
    }

    public void setParentType(String str) {
        this.mParentType = str;
    }

    public boolean isStep() {
        return PARENT_TYPE_STEP.equals(this.mParentType);
    }

    public boolean isTest() {
        return "test".equals(this.mParentType);
    }

    public int getSortOrder() {
        return this.mOrder;
    }

    public void setSortOrder(int i) {
        this.mOrder = i;
    }

    public String getParentMcqId() {
        return this.parentMcqId;
    }

    public void setParentMcqId(String str) {
        this.parentMcqId = str;
    }
}
