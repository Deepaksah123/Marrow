package com.marrow.data.api.models.response.sync;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0017\u0010\u0001\u001a\u00020\u00008\u0007¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/marrow/data/api/models/response/sync/SyncResult;", "SINGLE_SYNC_RESULT", "Lcom/marrow/data/api/models/response/sync/SyncResult;", "getSINGLE_SYNC_RESULT", "()Lcom/marrow/data/api/models/response/sync/SyncResult;"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class SyncResultKt {
    private static final SyncResult SINGLE_SYNC_RESULT = new SyncResult(1, 1, 1, true);

    public static final SyncResult getSINGLE_SYNC_RESULT() {
        return SINGLE_SYNC_RESULT;
    }
}
