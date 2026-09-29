package com.marrow.data.models.mcq.bookmark;

import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\bJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0016\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\b"}, d2 = {"Lcom/marrow/data/models/mcq/bookmark/MultiBookmarkCounter;", "", "", "p0", "p1", "<init>", "(II)V", "component1", "()I", "component2", "copy", "(II)Lcom/marrow/data/models/mcq/bookmark/MultiBookmarkCounter;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "bookmarkType", "I", "getBookmarkType", "bookmarkCount", "getBookmarkCount"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MultiBookmarkCounter {
    private final int bookmarkCount;
    private final int bookmarkType;

    public MultiBookmarkCounter(int i, int i2) {
        this.bookmarkType = i;
        this.bookmarkCount = i2;
    }

    public /* synthetic */ MultiBookmarkCounter(int i, int i2, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2);
    }

    public final int getBookmarkType() {
        return this.bookmarkType;
    }

    public final int getBookmarkCount() {
        return this.bookmarkCount;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MultiBookmarkCounter() {
        int i = 0;
        this(i, i, 3, null);
    }

    public static /* synthetic */ MultiBookmarkCounter copy$default(MultiBookmarkCounter multiBookmarkCounter, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = multiBookmarkCounter.bookmarkType;
        }
        if ((i3 & 2) != 0) {
            i2 = multiBookmarkCounter.bookmarkCount;
        }
        return multiBookmarkCounter.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getBookmarkType() {
        return this.bookmarkType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getBookmarkCount() {
        return this.bookmarkCount;
    }

    public final MultiBookmarkCounter copy(int p0, int p1) {
        return new MultiBookmarkCounter(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof MultiBookmarkCounter)) {
            return false;
        }
        MultiBookmarkCounter multiBookmarkCounter = (MultiBookmarkCounter) p0;
        return this.bookmarkType == multiBookmarkCounter.bookmarkType && this.bookmarkCount == multiBookmarkCounter.bookmarkCount;
    }

    public final int hashCode() {
        return (Integer.hashCode(this.bookmarkType) * 31) + Integer.hashCode(this.bookmarkCount);
    }

    public final String toString() {
        int i = this.bookmarkType;
        int i2 = this.bookmarkCount;
        StringBuilder sb = new StringBuilder("MultiBookmarkCounter(bookmarkType=");
        sb.append(i);
        sb.append(", bookmarkCount=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }
}
