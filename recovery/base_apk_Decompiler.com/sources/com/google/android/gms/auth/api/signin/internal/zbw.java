package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import kotlin.JsonAnyFormatVisitor;
import kotlin.JsonFormatVisitable;

/* JADX INFO: loaded from: classes3.dex */
final class zbw implements JsonAnyFormatVisitor.AudioAttributesCompatParcelizer {
    final /* synthetic */ SignInHubActivity zba;

    @Override // o.JsonAnyFormatVisitor.AudioAttributesCompatParcelizer
    public final JsonFormatVisitable onCreateLoader(int i, Bundle bundle) {
        return new zbc(this.zba, GoogleApiClient.getAllClients());
    }

    @Override // o.JsonAnyFormatVisitor.AudioAttributesCompatParcelizer
    public final /* synthetic */ void onLoadFinished(JsonFormatVisitable jsonFormatVisitable, Object obj) {
        SignInHubActivity signInHubActivity = this.zba;
        signInHubActivity.setResult(SignInHubActivity.zba(signInHubActivity), SignInHubActivity.zbb(signInHubActivity));
        this.zba.finish();
    }

    @Override // o.JsonAnyFormatVisitor.AudioAttributesCompatParcelizer
    public final void onLoaderReset(JsonFormatVisitable jsonFormatVisitable) {
    }

    /* synthetic */ zbw(SignInHubActivity signInHubActivity, zbv zbvVar) {
        this.zba = signInHubActivity;
    }
}
