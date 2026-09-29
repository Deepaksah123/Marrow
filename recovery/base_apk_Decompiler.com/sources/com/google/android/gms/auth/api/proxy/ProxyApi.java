package com.google.android.gms.auth.api.proxy;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;

/* JADX INFO: loaded from: classes3.dex */
public interface ProxyApi {

    /* JADX INFO: loaded from: classes5.dex */
    public interface ProxyResult extends Result {
        ProxyResponse getResponse();
    }

    /* JADX INFO: loaded from: classes5.dex */
    public interface SpatulaHeaderResult extends Result {
        String getSpatulaHeader();
    }

    @Deprecated
    PendingResult<SpatulaHeaderResult> getSpatulaHeader(GoogleApiClient googleApiClient);

    @Deprecated
    PendingResult<ProxyResult> performProxyRequest(GoogleApiClient googleApiClient, ProxyRequest proxyRequest);
}
