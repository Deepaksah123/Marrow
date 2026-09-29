package com.google.ads.conversiontracking;

import android.os.Looper;

/* JADX INFO: loaded from: classes4.dex */
public final class p {
    public static void a(String str) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalStateException(str);
        }
    }
}
