package com.razorpay;

/* JADX INFO: loaded from: classes.dex */
public interface PaymentResultListener {
    void onPaymentError(int i, String str);

    void onPaymentSuccess(String str);
}
