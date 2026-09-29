package com.razorpay;

/* JADX INFO: loaded from: classes5.dex */
enum NetworkType {
    WIFI("wifi"),
    CELLULAR("cellular"),
    BLUETOOTH("bluetooth"),
    UNKNOWN("unknown");

    private String mNetworkTypeName;

    NetworkType(String str) {
        this.mNetworkTypeName = str;
    }

    final String getNetworkTypeName() {
        return this.mNetworkTypeName;
    }
}
