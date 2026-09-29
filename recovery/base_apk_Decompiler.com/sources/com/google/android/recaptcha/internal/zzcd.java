package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import java.util.Arrays;
import kotlin.C0201setMcqCount;
import kotlin.TopUserCompanion;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcd {
    private final WebView zza;
    private final TopUserCompanion zzb;

    public final void zzb(String str, String... strArr) {
        C0201setMcqCount.IconCompatParcelizer(this.zzb, null, null, new zzcc((String[]) Arrays.copyOf(strArr, strArr.length), this, str, null), 3);
    }

    public zzcd(WebView webView, TopUserCompanion topUserCompanion) {
        this.zza = webView;
        this.zzb = topUserCompanion;
    }
}
