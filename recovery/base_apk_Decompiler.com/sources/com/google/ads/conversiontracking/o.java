package com.google.ads.conversiontracking;

import android.content.Intent;
import android.net.Uri;
import in.juspay.hypersdk.ota.Constants;

/* JADX INFO: loaded from: classes4.dex */
public class o {
    private static final Uri a;
    private static final Uri b;

    static {
        Uri uri = Uri.parse("http://plus.google.com/");
        a = uri;
        b = uri.buildUpon().appendPath("circles").appendPath("find").build();
    }

    public static Intent a() {
        return new Intent("android.settings.DATE_SETTINGS");
    }

    public static Intent a(String str) {
        Uri uriFromParts = Uri.fromParts(Constants.PACKAGE_DIR_NAME, str, null);
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(uriFromParts);
        return intent;
    }

    public static Intent b(String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(d(str));
        intent.setPackage("com.android.vending");
        intent.addFlags(524288);
        return intent;
    }

    public static Intent c(String str) {
        Uri uri = Uri.parse("bazaar://search?q=pname:".concat(String.valueOf(str)));
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(uri);
        intent.setFlags(524288);
        return intent;
    }

    private static Uri d(String str) {
        return Uri.parse("market://details").buildUpon().appendQueryParameter("id", str).build();
    }
}
