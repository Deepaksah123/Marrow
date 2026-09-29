package com.marrow.data.api.models.response.sync;

import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000bJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0016\u0010\u001b\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d"}, d2 = {"Lcom/marrow/data/api/models/response/sync/SyncResult;", "", "", "p0", "p1", "p2", "", "p3", "<init>", "(IIIZ)V", "component1", "()I", "component2", "component3", "component4", "()Z", "copy", "(IIIZ)Lcom/marrow/data/api/models/response/sync/SyncResult;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "totalDataToSync", "I", "syncedSoFar", "recursionCount", "completed", "Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SyncResult {
    public boolean completed;
    public int recursionCount;
    public int syncedSoFar;
    public int totalDataToSync;

    public SyncResult(int i, int i2, int i3, boolean z) {
        this.totalDataToSync = i;
        this.syncedSoFar = i2;
        this.recursionCount = i3;
        this.completed = z;
    }

    public /* synthetic */ SyncResult(int i, int i2, int i3, boolean z, int i4, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3, (i4 & 8) != 0 ? false : z);
    }

    public SyncResult() {
        this(0, 0, 0, false, 15, null);
    }

    public static /* synthetic */ SyncResult copy$default(SyncResult syncResult, int i, int i2, int i3, boolean z, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = syncResult.totalDataToSync;
        }
        if ((i4 & 2) != 0) {
            i2 = syncResult.syncedSoFar;
        }
        if ((i4 & 4) != 0) {
            i3 = syncResult.recursionCount;
        }
        if ((i4 & 8) != 0) {
            z = syncResult.completed;
        }
        return syncResult.copy(i, i2, i3, z);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getTotalDataToSync() {
        return this.totalDataToSync;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSyncedSoFar() {
        return this.syncedSoFar;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getRecursionCount() {
        return this.recursionCount;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getCompleted() {
        return this.completed;
    }

    public final SyncResult copy(int p0, int p1, int p2, boolean p3) {
        return new SyncResult(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SyncResult)) {
            return false;
        }
        SyncResult syncResult = (SyncResult) p0;
        return this.totalDataToSync == syncResult.totalDataToSync && this.syncedSoFar == syncResult.syncedSoFar && this.recursionCount == syncResult.recursionCount && this.completed == syncResult.completed;
    }

    public final int hashCode() {
        return (((((Integer.hashCode(this.totalDataToSync) * 31) + Integer.hashCode(this.syncedSoFar)) * 31) + Integer.hashCode(this.recursionCount)) * 31) + Boolean.hashCode(this.completed);
    }

    public final String toString() {
        int i = this.totalDataToSync;
        int i2 = this.syncedSoFar;
        int i3 = this.recursionCount;
        boolean z = this.completed;
        StringBuilder sb = new StringBuilder("SyncResult(totalDataToSync=");
        sb.append(i);
        sb.append(", syncedSoFar=");
        sb.append(i2);
        sb.append(", recursionCount=");
        sb.append(i3);
        sb.append(", completed=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
