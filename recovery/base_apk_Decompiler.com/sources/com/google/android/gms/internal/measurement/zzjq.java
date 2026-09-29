package com.google.android.gms.internal.measurement;

import android.os.Process;

/* JADX INFO: loaded from: classes5.dex */
public class zzjq {
    public static int AudioAttributesCompatParcelizer;
    public static int read;

    public static int RemoteActionCompatParcelizer() {
        int i = read;
        int i2 = i % 8994589;
        read = i + 1;
        if (i2 != 0) {
            return AudioAttributesCompatParcelizer;
        }
        int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
        AudioAttributesCompatParcelizer = startElapsedRealtime;
        return startElapsedRealtime;
    }
}
