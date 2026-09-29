package com.google.android.gms.common.internal;

import android.content.Context;
import android.media.AudioManager;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zaac {
    public static int AudioAttributesCompatParcelizer;
    public static int read;

    public static int write() {
        int i = AudioAttributesCompatParcelizer;
        int i2 = i % 5337699;
        AudioAttributesCompatParcelizer = i + 1;
        if (i2 != 0) {
            return read;
        }
        int streamMinVolume = ((AudioManager) ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getSystemService("audio")).getStreamMinVolume(3);
        read = streamMinVolume;
        return streamMinVolume;
    }
}
