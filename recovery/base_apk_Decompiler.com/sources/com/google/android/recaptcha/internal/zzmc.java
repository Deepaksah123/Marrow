package com.google.android.recaptcha.internal;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes3.dex */
public enum zzmc {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(BitmapDescriptorFactory.HUE_RED)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(Boolean.FALSE),
    STRING(""),
    BYTE_STRING(zzgw.zzb),
    ENUM(null),
    MESSAGE(null);

    private final Object zzk;

    zzmc(Object obj) {
        this.zzk = obj;
    }
}
