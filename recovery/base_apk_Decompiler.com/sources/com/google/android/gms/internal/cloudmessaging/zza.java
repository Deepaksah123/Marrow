package com.google.android.gms.internal.cloudmessaging;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
public final class zza {
    public static final int zza;

    /* JADX WARN: Removed duplicated region for block: B:13:0x002b  */
    static {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L7
            goto L2b
        L7:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            r2 = 0
            if (r0 < r1) goto L2d
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            int r0 = r0.length()
            r1 = 1
            if (r0 != r1) goto L2d
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            char r0 = r0.charAt(r2)
            r1 = 83
            if (r0 < r1) goto L2d
            java.lang.String r0 = android.os.Build.VERSION.CODENAME
            char r0 = r0.charAt(r2)
            r1 = 90
            if (r0 > r1) goto L2d
        L2b:
            r2 = 33554432(0x2000000, float:9.403955E-38)
        L2d:
            com.google.android.gms.internal.cloudmessaging.zza.zza = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.cloudmessaging.zza.<clinit>():void");
    }

    public static PendingIntent zza(Context context, int i, Intent intent, int i2) {
        return PendingIntent.getBroadcast(context, 0, intent, i2);
    }
}
