package com.google.android.gms.auth.api.signin;

import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.PendingResultUtil;

/* JADX INFO: loaded from: classes3.dex */
final class zbb implements PendingResultUtil.ResultConverter {
    @Override // com.google.android.gms.common.internal.PendingResultUtil.ResultConverter
    public final /* synthetic */ Object convert(Result result) {
        return ((GoogleSignInResult) result).getSignInAccount();
    }

    private zbb() {
    }

    /* synthetic */ zbb(zba zbaVar) {
    }
}
