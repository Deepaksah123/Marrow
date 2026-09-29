package com.google.ads.conversiontracking;

import android.content.Context;
import com.google.ads.conversiontracking.g;

/* JADX INFO: loaded from: classes4.dex */
public abstract class GoogleConversionReporter {
    public abstract void report();

    protected void a(final Context context, final g.c cVar, final boolean z, final boolean z2, final boolean z3) {
        new Thread(new Runnable() { // from class: com.google.ads.conversiontracking.GoogleConversionReporter.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    String strA = g.a(context, cVar);
                    if (strA != null) {
                        g.a(context).a(strA, cVar, z, z2, z3);
                    }
                } catch (Exception unused) {
                }
            }
        }).start();
    }
}
