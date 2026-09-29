package com.google.ads.conversiontracking;

import android.content.Context;
import android.net.Uri;
import com.google.ads.conversiontracking.g;

/* JADX INFO: loaded from: classes4.dex */
public class AdWordsConversionReporter extends GoogleConversionReporter {
    private final Context a;
    private final String b;
    private final String c;
    private final g.d d;
    private final String e;
    private final String f;
    private final boolean g;

    public AdWordsConversionReporter(Context context, String str, String str2, String str3, boolean z) {
        this(context, str, str2, str3, null, z);
    }

    public AdWordsConversionReporter(Context context, String str, String str2, String str3, String str4, boolean z) {
        g.d dVar;
        this.a = context;
        this.b = str;
        this.c = str2;
        this.e = str3;
        this.f = str4;
        this.g = z;
        if (this instanceof DoubleClickConversionReporter) {
            dVar = g.d.DOUBLECLICK_CONVERSION;
        } else {
            dVar = g.d.GOOGLE_CONVERSION;
        }
        this.d = dVar;
    }

    @Override // com.google.ads.conversiontracking.GoogleConversionReporter
    public void report() {
        boolean z;
        g.c cVarC = new g.c().a(this.b).a(this.d).b(this.c).c(this.e);
        String str = this.f;
        if (str != null) {
            cVarC.d(str);
        }
        if (this.d == g.d.GOOGLE_CONVERSION) {
            c cVarA = c.a(this.a);
            cVarA.c(this.b);
            cVarC.a(cVarA.d(this.b));
        }
        if (g.a(this.a, cVarC, this.g)) {
            try {
                if (this.d == g.d.GOOGLE_CONVERSION) {
                    cVarC.a(g.a(this.a, this.b));
                    z = true;
                } else {
                    z = false;
                }
                a(this.a, cVarC, true, this.g, z);
            } catch (Exception unused) {
            }
        }
    }

    public static boolean registerReferrer(Context context, Uri uri) {
        if (uri == null) {
            return false;
        }
        new StringBuilder(String.valueOf(String.valueOf(uri)).length() + 13);
        g.b bVarA = g.a(uri);
        if (bVarA == null) {
            new StringBuilder(String.valueOf(String.valueOf(uri)).length() + 31);
            return false;
        }
        boolean zA = g.a(context, bVarA);
        if (zA) {
            new StringBuilder(String.valueOf(String.valueOf(uri)).length() + 25);
            return zA;
        }
        new StringBuilder(String.valueOf(String.valueOf(uri)).length() + 20);
        return zA;
    }

    public static void reportWithConversionId(Context context, String str, String str2, String str3, boolean z) {
        new AdWordsConversionReporter(context, str, str2, str3, z).report();
    }

    public static void reportWithConversionId(Context context, String str, String str2, String str3, String str4, boolean z) {
        new AdWordsConversionReporter(context, str, str2, str3, str4, z).report();
    }
}
