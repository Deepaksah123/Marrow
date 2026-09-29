package com.google.android.gms.wallet.callback;

import com.google.android.gms.wallet.PaymentData;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BasePaymentDataCallbacks {
    protected void onPaymentAuthorized(PaymentData paymentData, OnCompleteListener<PaymentAuthorizationResult> onCompleteListener) {
    }

    protected void onPaymentDataChanged(IntermediatePaymentData intermediatePaymentData, OnCompleteListener<PaymentDataRequestUpdate> onCompleteListener) {
    }
}
