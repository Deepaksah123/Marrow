package com.google.android.gms.internal.auth;

import android.net.Uri;
import kotlin.setTitleOptional;

/* JADX INFO: loaded from: classes5.dex */
public final class zzcr {
    private static final setTitleOptional zza = new setTitleOptional();

    public static Uri zza(String str) {
        synchronized (zzcr.class) {
            setTitleOptional settitleoptional = zza;
            Uri uri = (Uri) settitleoptional.get("com.google.android.gms.auth_account");
            if (uri != null) {
                return uri;
            }
            Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.auth_account"))));
            settitleoptional.put("com.google.android.gms.auth_account", uri2);
            return uri2;
        }
    }
}
