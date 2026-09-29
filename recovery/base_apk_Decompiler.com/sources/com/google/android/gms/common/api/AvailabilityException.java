package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.internal.Preconditions;
import java.util.ArrayList;
import kotlin.setTitleOptional;

/* JADX INFO: loaded from: classes3.dex */
public class AvailabilityException extends Exception {
    private final setTitleOptional zaa;

    public AvailabilityException(setTitleOptional settitleoptional) {
        this.zaa = settitleoptional;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConnectionResult getConnectionResult(GoogleApi<? extends Api.ApiOptions> googleApi) {
        setTitleOptional settitleoptional = this.zaa;
        ApiKey<O> apiKey = googleApi.getApiKey();
        V v = settitleoptional.get(apiKey);
        String strZaa = apiKey.zaa();
        StringBuilder sb = new StringBuilder("The given API (");
        sb.append(strZaa);
        sb.append(") was not part of the availability request.");
        Preconditions.checkArgument(v != 0, sb.toString());
        return (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.get(apiKey));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        boolean z = true;
        for (ApiKey apiKey : this.zaa.keySet()) {
            ConnectionResult connectionResult = (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.get(apiKey));
            z &= !connectionResult.isSuccess();
            String strZaa = apiKey.zaa();
            String strValueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder();
            sb.append(strZaa);
            sb.append(": ");
            sb.append(strValueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConnectionResult getConnectionResult(HasApiKey<? extends Api.ApiOptions> hasApiKey) {
        setTitleOptional settitleoptional = this.zaa;
        ApiKey<O> apiKey = hasApiKey.getApiKey();
        V v = settitleoptional.get(apiKey);
        String strZaa = apiKey.zaa();
        StringBuilder sb = new StringBuilder("The given API (");
        sb.append(strZaa);
        sb.append(") was not part of the availability request.");
        Preconditions.checkArgument(v != 0, sb.toString());
        return (ConnectionResult) Preconditions.checkNotNull((ConnectionResult) this.zaa.get(apiKey));
    }
}
