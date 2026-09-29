package com.google.ads.conversiontracking;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class AdWordsAutomatedUsageReporter {
    public static void enableAutomatedUsageReporting(Context context, String str) {
        c.a(context).a(str);
    }

    public static void disableAutomatedUsageReporting(Context context, String str) {
        c.a(context).b(str);
    }
}
