package com.marrow.data.models.lesson;

import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\rJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000bJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0019\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u001c\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u001f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\u000bR\u001a\u0010!\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\r"}, d2 = {"Lcom/marrow/data/models/lesson/LessonSyncUserLocalModel;", "", "", "p0", "", "p1", "p2", "p3", "<init>", "(IJIJ)V", "component1", "()I", "component2", "()J", "component3", "component4", "copy", "(IJIJ)Lcom/marrow/data/models/lesson/LessonSyncUserLocalModel;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "status", "I", "getStatus", "lastAttemptedTime", "J", "getLastAttemptedTime", "lessonActivityStatus", "getLessonActivityStatus", "lastUpdated", "getLastUpdated"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LessonSyncUserLocalModel {
    private final long lastAttemptedTime;
    private final long lastUpdated;
    private final int lessonActivityStatus;
    private final int status;

    public LessonSyncUserLocalModel(int i, long j, int i2, long j2) {
        this.status = i;
        this.lastAttemptedTime = j;
        this.lessonActivityStatus = i2;
        this.lastUpdated = j2;
    }

    public /* synthetic */ LessonSyncUserLocalModel(int i, long j, int i2, long j2, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0L : j, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? 0L : j2);
    }

    public final int getStatus() {
        return this.status;
    }

    public final long getLastAttemptedTime() {
        return this.lastAttemptedTime;
    }

    public final int getLessonActivityStatus() {
        return this.lessonActivityStatus;
    }

    public final long getLastUpdated() {
        return this.lastUpdated;
    }

    public LessonSyncUserLocalModel() {
        this(0, 0L, 0, 0L, 15, null);
    }

    public static /* synthetic */ LessonSyncUserLocalModel copy$default(LessonSyncUserLocalModel lessonSyncUserLocalModel, int i, long j, int i2, long j2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = lessonSyncUserLocalModel.status;
        }
        if ((i3 & 2) != 0) {
            j = lessonSyncUserLocalModel.lastAttemptedTime;
        }
        long j3 = j;
        if ((i3 & 4) != 0) {
            i2 = lessonSyncUserLocalModel.lessonActivityStatus;
        }
        int i4 = i2;
        if ((i3 & 8) != 0) {
            j2 = lessonSyncUserLocalModel.lastUpdated;
        }
        return lessonSyncUserLocalModel.copy(i, j3, i4, j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final long getLastAttemptedTime() {
        return this.lastAttemptedTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getLessonActivityStatus() {
        return this.lessonActivityStatus;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getLastUpdated() {
        return this.lastUpdated;
    }

    public final LessonSyncUserLocalModel copy(int p0, long p1, int p2, long p3) {
        return new LessonSyncUserLocalModel(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof LessonSyncUserLocalModel)) {
            return false;
        }
        LessonSyncUserLocalModel lessonSyncUserLocalModel = (LessonSyncUserLocalModel) p0;
        return this.status == lessonSyncUserLocalModel.status && this.lastAttemptedTime == lessonSyncUserLocalModel.lastAttemptedTime && this.lessonActivityStatus == lessonSyncUserLocalModel.lessonActivityStatus && this.lastUpdated == lessonSyncUserLocalModel.lastUpdated;
    }

    public final int hashCode() {
        return (((((Integer.hashCode(this.status) * 31) + Long.hashCode(this.lastAttemptedTime)) * 31) + Integer.hashCode(this.lessonActivityStatus)) * 31) + Long.hashCode(this.lastUpdated);
    }

    public final String toString() {
        int i = this.status;
        long j = this.lastAttemptedTime;
        int i2 = this.lessonActivityStatus;
        long j2 = this.lastUpdated;
        StringBuilder sb = new StringBuilder("LessonSyncUserLocalModel(status=");
        sb.append(i);
        sb.append(", lastAttemptedTime=");
        sb.append(j);
        sb.append(", lessonActivityStatus=");
        sb.append(i2);
        sb.append(", lastUpdated=");
        sb.append(j2);
        sb.append(")");
        return sb.toString();
    }
}
