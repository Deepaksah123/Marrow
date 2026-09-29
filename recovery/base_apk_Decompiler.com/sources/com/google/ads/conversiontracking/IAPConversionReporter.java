package com.google.ads.conversiontracking;

import android.content.Context;
import com.google.ads.conversiontracking.g;

/* JADX INFO: loaded from: classes4.dex */
public class IAPConversionReporter extends GoogleConversionReporter {
    private final Context a;
    private final boolean b;
    private final String c;
    private final g.d d = g.d.IAP_CONVERSION;
    private final String e;

    public IAPConversionReporter(Context context, String str, String str2, boolean z) {
        this.a = context;
        this.c = str;
        this.e = str2;
        this.b = z;
    }

    @Override // com.google.ads.conversiontracking.GoogleConversionReporter
    public void report() {
        g.c cVarC = new g.c().e(this.c).a(this.d).c(this.e);
        if (g.a(this.a, cVarC, this.b)) {
            a(this.a, cVarC, true, this.b, true);
        }
    }

    public static void reportWithProductId(Context context, String str, String str2, boolean z) {
        new IAPConversionReporter(context, str, str2, z).report();
    }
}
