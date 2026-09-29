package com.google.android.recaptcha.internal;

/* JADX INFO: loaded from: classes3.dex */
final class zzlz extends IllegalArgumentException {
    zzlz(int i, int i2) {
        StringBuilder sb = new StringBuilder("Unpaired surrogate at index ");
        sb.append(i);
        sb.append(" of ");
        sb.append(i2);
        super(sb.toString());
    }
}
