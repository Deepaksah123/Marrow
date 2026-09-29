package com.marrow.data.models.review;

import kotlin.parseDolbyChannelConfiguration;

/* JADX INFO: loaded from: classes5.dex */
public class ReviewFilter {
    public static final int TYPE_FILTER_BOOKMARKED = -6;
    public static final int TYPE_FILTER_CHANGED_BY_YOU = -8;
    public static final int TYPE_FILTER_GUESSED = -1;
    public static final int TYPE_FILTER_GUESSED_RIGHT = -10;
    public static final int TYPE_FILTER_GUESSED_WRONG = -9;
    public static final int TYPE_FILTER_HIGH_YIELD_IDS = -12;
    public static final int TYPE_FILTER_NEW_OR_UPDATED = -7;
    public static final int TYPE_FILTER_NONE = 0;
    public static final int TYPE_FILTER_RIGHT = -4;
    public static final int TYPE_FILTER_SILLY_MISTAKES = -11;
    public static final int TYPE_FILTER_SKIPPED = -5;
    public static final int TYPE_FILTER_SUBJECT = -2;
    public static final int TYPE_FILTER_WRONG = -3;
    private String mFilterId;
    private String mFilterText;
    private int mFilterType;

    public ReviewFilter() {
    }

    public ReviewFilter(int i, String str, String str2) {
        this.mFilterType = i;
        this.mFilterId = str;
        this.mFilterText = str2;
    }

    public ReviewFilter(int i, String str) {
        this.mFilterType = i;
        this.mFilterId = String.valueOf(i);
        this.mFilterText = str;
    }

    public int getFilterType() {
        return this.mFilterType;
    }

    public void setFilterType(int i) {
        this.mFilterType = i;
    }

    public String getFilterId() {
        return this.mFilterId;
    }

    public void setFilterId(String str) {
        this.mFilterId = str;
    }

    public String getFilterText() {
        return this.mFilterText;
    }

    public void setFilterText(String str) {
        this.mFilterText = str;
    }

    public static String[] toStringArray(ReviewFilter[] reviewFilterArr) {
        if (reviewFilterArr == null) {
            return null;
        }
        String[] strArr = new String[reviewFilterArr.length];
        for (int i = 0; i < reviewFilterArr.length; i++) {
            strArr[i] = reviewFilterArr[i].getFilterText();
        }
        return strArr;
    }

    public boolean equals(Object obj) {
        if (obj instanceof ReviewFilter) {
            ReviewFilter reviewFilter = (ReviewFilter) obj;
            return parseDolbyChannelConfiguration.RemoteActionCompatParcelizer(this.mFilterText, reviewFilter.mFilterText) && parseDolbyChannelConfiguration.RemoteActionCompatParcelizer(this.mFilterId, reviewFilter.mFilterId) && this.mFilterType == reviewFilter.mFilterType;
        }
        return super.equals(obj);
    }
}
