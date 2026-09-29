package com.google.android.recaptcha.internal;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;

/* JADX INFO: loaded from: classes3.dex */
public final class zzeh implements zzen {
    private final Context zzb;

    @Override // com.google.android.recaptcha.internal.zzen
    public final Object zza(Object... objArr) {
        Context context = this.zzb;
        Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.google.android.gsf.gservices"), null, null, new String[]{"android_id"}, null);
        if (cursorQuery == null || !cursorQuery.moveToFirst() || cursorQuery.getColumnCount() < 2) {
            return "";
        }
        long j = Long.parseLong(cursorQuery.getString(1));
        cursorQuery.close();
        return String.valueOf(j);
    }

    public zzeh(Context context) {
        this.zzb = context;
    }

    @Override // com.google.android.recaptcha.internal.zzen
    public final /* synthetic */ Object cs(Object[] objArr) {
        return zzel.zza(this, objArr);
    }
}
