package com.marrow.data.models.test;

/* JADX INFO: loaded from: classes5.dex */
public class TestRecommendationItem {
    public static final int TYPE_EXPIRED = 2;
    public static final int TYPE_LIVE = 1;
    public static final int TYPE_UPCOMING = 3;
    public TestMini item;
    public int type;

    public static TestRecommendationItem newInstance(int i, TestMini testMini) {
        TestRecommendationItem testRecommendationItem = new TestRecommendationItem();
        testRecommendationItem.type = i;
        testRecommendationItem.item = testMini;
        return testRecommendationItem;
    }
}
