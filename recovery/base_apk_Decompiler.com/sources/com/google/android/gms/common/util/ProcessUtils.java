package com.google.android.gms.common.util;

import android.app.Application;

/* JADX INFO: loaded from: classes.dex */
public class ProcessUtils {
    private static String zza;
    private static int zzb;

    public static String getMyProcessName() {
        if (zza == null) {
            zza = Application.getProcessName();
        }
        return zza;
    }

    private ProcessUtils() {
    }
}
