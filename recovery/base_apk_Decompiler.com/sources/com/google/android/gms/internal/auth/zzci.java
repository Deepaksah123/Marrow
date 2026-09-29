package com.google.android.gms.internal.auth;

import android.net.Uri;
import kotlin.AppCompatCheckBox;

/* JADX INFO: loaded from: classes5.dex */
public final class zzci {
    private final AppCompatCheckBox zza;

    public final String zza(Uri uri, String str, String str2, String str3) {
        AppCompatCheckBox appCompatCheckBox;
        if (uri != null) {
            appCompatCheckBox = (AppCompatCheckBox) this.zza.get(uri.toString());
        } else {
            appCompatCheckBox = null;
        }
        if (appCompatCheckBox == null) {
            return null;
        }
        return (String) appCompatCheckBox.get("".concat(str3));
    }

    zzci(AppCompatCheckBox appCompatCheckBox) {
        this.zza = appCompatCheckBox;
    }
}
