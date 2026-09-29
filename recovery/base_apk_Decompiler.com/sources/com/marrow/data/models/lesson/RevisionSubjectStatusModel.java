package com.marrow.data.models.lesson;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ8\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\nJ\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\nR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\nR\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\n"}, d2 = {"Lcom/marrow/data/models/lesson/RevisionSubjectStatusModel;", "", "", "p0", "p1", "p2", "p3", "<init>", "(IIII)V", "component1", "()I", "component2", "component3", "component4", "copy", "(IIII)Lcom/marrow/data/models/lesson/RevisionSubjectStatusModel;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "totalVideoCount", "I", "getTotalVideoCount", "completedVideoCount", "getCompletedVideoCount", "completedARQBankCount", "getCompletedARQBankCount", "totalARQBankCount", "getTotalARQBankCount"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevisionSubjectStatusModel {
    private final int completedARQBankCount;
    private final int completedVideoCount;
    private final int totalARQBankCount;
    private final int totalVideoCount;

    public RevisionSubjectStatusModel(int i, int i2, int i3, int i4) {
        this.totalVideoCount = i;
        this.completedVideoCount = i2;
        this.completedARQBankCount = i3;
        this.totalARQBankCount = i4;
    }

    public final int getTotalVideoCount() {
        return this.totalVideoCount;
    }

    public final int getCompletedVideoCount() {
        return this.completedVideoCount;
    }

    public final int getCompletedARQBankCount() {
        return this.completedARQBankCount;
    }

    public final int getTotalARQBankCount() {
        return this.totalARQBankCount;
    }

    public static /* synthetic */ RevisionSubjectStatusModel copy$default(RevisionSubjectStatusModel revisionSubjectStatusModel, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = revisionSubjectStatusModel.totalVideoCount;
        }
        if ((i5 & 2) != 0) {
            i2 = revisionSubjectStatusModel.completedVideoCount;
        }
        if ((i5 & 4) != 0) {
            i3 = revisionSubjectStatusModel.completedARQBankCount;
        }
        if ((i5 & 8) != 0) {
            i4 = revisionSubjectStatusModel.totalARQBankCount;
        }
        return revisionSubjectStatusModel.copy(i, i2, i3, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTotalVideoCount() {
        return this.totalVideoCount;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getCompletedVideoCount() {
        return this.completedVideoCount;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getCompletedARQBankCount() {
        return this.completedARQBankCount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getTotalARQBankCount() {
        return this.totalARQBankCount;
    }

    public final RevisionSubjectStatusModel copy(int p0, int p1, int p2, int p3) {
        return new RevisionSubjectStatusModel(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof RevisionSubjectStatusModel)) {
            return false;
        }
        RevisionSubjectStatusModel revisionSubjectStatusModel = (RevisionSubjectStatusModel) p0;
        return this.totalVideoCount == revisionSubjectStatusModel.totalVideoCount && this.completedVideoCount == revisionSubjectStatusModel.completedVideoCount && this.completedARQBankCount == revisionSubjectStatusModel.completedARQBankCount && this.totalARQBankCount == revisionSubjectStatusModel.totalARQBankCount;
    }

    public final int hashCode() {
        return (((((Integer.hashCode(this.totalVideoCount) * 31) + Integer.hashCode(this.completedVideoCount)) * 31) + Integer.hashCode(this.completedARQBankCount)) * 31) + Integer.hashCode(this.totalARQBankCount);
    }

    public final String toString() {
        int i = this.totalVideoCount;
        int i2 = this.completedVideoCount;
        int i3 = this.completedARQBankCount;
        int i4 = this.totalARQBankCount;
        StringBuilder sb = new StringBuilder("RevisionSubjectStatusModel(totalVideoCount=");
        sb.append(i);
        sb.append(", completedVideoCount=");
        sb.append(i2);
        sb.append(", completedARQBankCount=");
        sb.append(i3);
        sb.append(", totalARQBankCount=");
        sb.append(i4);
        sb.append(")");
        return sb.toString();
    }
}
