package com.google.android.gms.cloudmessaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzt {
    private final Context zza;
    private int zzb;
    private int zzc = 0;

    public final int zza() {
        PackageInfo packageInfo;
        int i;
        synchronized (this) {
            if (this.zzb == 0) {
                try {
                    packageInfo = Wrappers.packageManager(this.zza).getPackageInfo("com.google.android.gms", 0);
                } catch (PackageManager.NameNotFoundException e) {
                    String strValueOf = String.valueOf(e);
                    StringBuilder sb = new StringBuilder(String.valueOf(strValueOf).length() + 23);
                    sb.append("Failed to find package ");
                    sb.append(strValueOf);
                    Log.w("Metadata", sb.toString());
                    packageInfo = null;
                }
                if (packageInfo != null) {
                    this.zzb = packageInfo.versionCode;
                }
                i = this.zzb;
            } else {
                i = this.zzb;
            }
        }
        return i;
    }

    public final int zzb() {
        synchronized (this) {
            int i = this.zzc;
            if (i != 0) {
                return i;
            }
            PackageManager packageManager = this.zza.getPackageManager();
            if (Wrappers.packageManager(this.zza).checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
                Log.e("Metadata", "Google Play services missing or without correct permission.");
                return 0;
            }
            int i2 = 1;
            if (!PlatformVersion.isAtLeastO()) {
                Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
                intent.setPackage("com.google.android.gms");
                List<ResolveInfo> listQueryIntentServices = packageManager.queryIntentServices(intent, 0);
                if (listQueryIntentServices != null && listQueryIntentServices.size() > 0) {
                    this.zzc = 1;
                    return 1;
                }
            }
            Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
            intent2.setPackage("com.google.android.gms");
            List<ResolveInfo> listQueryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
            if (listQueryBroadcastReceivers != null && listQueryBroadcastReceivers.size() > 0) {
                this.zzc = 2;
                return 2;
            }
            Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
            if (PlatformVersion.isAtLeastO()) {
                this.zzc = 2;
                i2 = 2;
            } else {
                this.zzc = 1;
            }
            return i2;
        }
    }

    public zzt(Context context) {
        this.zza = context;
    }
}
