package com.google.ads.conversiontracking;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* JADX INFO: loaded from: classes4.dex */
public class InstallReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("referrer");
        if (!"com.android.vending.INSTALL_REFERRER".equals(intent.getAction()) || stringExtra == null) {
            return;
        }
        AdWordsConversionReporter.registerReferrer(context, Uri.parse("http://hostname/").buildUpon().appendQueryParameter("referrer", stringExtra).build());
    }
}
