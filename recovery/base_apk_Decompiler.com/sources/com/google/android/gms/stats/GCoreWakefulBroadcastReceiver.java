package com.google.android.gms.stats;

import android.content.Context;
import android.content.Intent;
import kotlin._trimByVisibility;

/* JADX INFO: loaded from: classes5.dex */
public abstract class GCoreWakefulBroadcastReceiver extends _trimByVisibility {
    public static boolean completeWakefulIntent(Context context, Intent intent) {
        if (intent == null) {
            return false;
        }
        return _trimByVisibility.completeWakefulIntent(intent);
    }
}
