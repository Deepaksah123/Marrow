package com.google.android.gms.common;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.ClientLibraryUtils;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.UidVerifier;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import in.juspay.hyper.constants.LogSubCategory;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public class GooglePlayServicesUtilLight {
    static final int GMS_AVAILABILITY_NOTIFICATION_ID = 10436;
    static final int GMS_GENERAL_ERROR_NOTIFICATION_ID = 39789;
    public static final String GOOGLE_PLAY_GAMES_PACKAGE = "com.google.android.play.games";

    @Deprecated
    public static final String GOOGLE_PLAY_SERVICES_PACKAGE = "com.google.android.gms";

    @Deprecated
    public static final int GOOGLE_PLAY_SERVICES_VERSION_CODE = 12451000;
    public static final String GOOGLE_PLAY_STORE_PACKAGE = "com.android.vending";
    static boolean zza = false;
    private static boolean zzb = false;

    @Deprecated
    static final AtomicBoolean sCanceledAvailabilityNotification = new AtomicBoolean();
    private static final AtomicBoolean zzc = new AtomicBoolean();

    @Deprecated
    public static void cancelAvailabilityErrorNotifications(Context context) {
        if (sCanceledAvailabilityNotification.getAndSet(true)) {
            return;
        }
        try {
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            if (notificationManager != null) {
                notificationManager.cancel(GMS_AVAILABILITY_NOTIFICATION_ID);
            }
        } catch (SecurityException unused) {
        }
    }

    public static void enableUsingApkIndependentContext() {
        zzc.set(true);
    }

    @Deprecated
    public static void ensurePlayServicesAvailable(Context context, int i) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        int iIsGooglePlayServicesAvailable = GoogleApiAvailabilityLight.getInstance().isGooglePlayServicesAvailable(context, i);
        if (iIsGooglePlayServicesAvailable != 0) {
            Intent errorResolutionIntent = GoogleApiAvailabilityLight.getInstance().getErrorResolutionIntent(context, iIsGooglePlayServicesAvailable, "e");
            if (errorResolutionIntent != null) {
                throw new GooglePlayServicesRepairableException(iIsGooglePlayServicesAvailable, "Google Play Services not available", errorResolutionIntent);
            }
            throw new GooglePlayServicesNotAvailableException(iIsGooglePlayServicesAvailable);
        }
    }

    @Deprecated
    public static int getApkVersion(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    @Deprecated
    public static int getClientVersion(Context context) {
        Preconditions.checkState(true);
        return ClientLibraryUtils.getClientVersion(context, context.getPackageName());
    }

    @Deprecated
    public static PendingIntent getErrorPendingIntent(int i, Context context, int i2) {
        return GoogleApiAvailabilityLight.getInstance().getErrorResolutionPendingIntent(context, i, i2);
    }

    @Deprecated
    public static String getErrorString(int i) {
        return ConnectionResult.zza(i);
    }

    @Deprecated
    public static Intent getGooglePlayServicesAvailabilityRecoveryIntent(int i) {
        return GoogleApiAvailabilityLight.getInstance().getErrorResolutionIntent(null, i, null);
    }

    public static Context getRemoteContext(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static Resources getRemoteResource(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean honorsDebugCertificates(Context context) {
        if (!zza) {
            try {
                PackageInfo packageInfo = Wrappers.packageManager(context).getPackageInfo("com.google.android.gms", 64);
                GoogleSignatureVerifier.getInstance(context);
                if (packageInfo == null || GoogleSignatureVerifier.zzb(packageInfo, false) || !GoogleSignatureVerifier.zzb(packageInfo, true)) {
                    zzb = false;
                } else {
                    zzb = true;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            } finally {
                zza = true;
            }
        }
        return zzb || !DeviceProperties.isUserBuild();
    }

    @ResultIgnorabilityUnspecified
    @Deprecated
    public static int isGooglePlayServicesAvailable(Context context) {
        return isGooglePlayServicesAvailable(context, GOOGLE_PLAY_SERVICES_VERSION_CODE);
    }

    @Deprecated
    public static boolean isGooglePlayServicesUid(Context context, int i) {
        return UidVerifier.isGooglePlayServicesUid(context, i);
    }

    @Deprecated
    public static boolean isPlayServicesPossiblyUpdating(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return zza(context, "com.google.android.gms");
        }
        return false;
    }

    @Deprecated
    public static boolean isPlayStorePossiblyUpdating(Context context, int i) {
        if (i == 9) {
            return zza(context, "com.android.vending");
        }
        return false;
    }

    public static boolean isRestrictedUserProfile(Context context) {
        if (!PlatformVersion.isAtLeastJellyBeanMR2()) {
            return false;
        }
        Object systemService = context.getSystemService(LogSubCategory.Action.USER);
        Preconditions.checkNotNull(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    @Deprecated
    public static boolean isSidewinderDevice(Context context) {
        return DeviceProperties.isSidewinder(context);
    }

    @Deprecated
    public static boolean isUserRecoverableError(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    @Deprecated
    public static boolean uidHasPackageName(Context context, int i, String str) {
        return UidVerifier.uidHasPackageName(context, i, str);
    }

    static boolean zza(Context context, String str) {
        ApplicationInfo applicationInfo;
        boolean zEquals = str.equals("com.google.android.gms");
        if (PlatformVersion.isAtLeastLollipop()) {
            try {
                Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        return zEquals ? applicationInfo.enabled : applicationInfo.enabled && !isRestrictedUserProfile(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x007a  */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int isGooglePlayServicesAvailable(android.content.Context r7, int r8) {
        /*
            android.content.res.Resources r0 = r7.getResources()     // Catch: java.lang.Throwable -> L9
            int r1 = com.google.android.gms.common.R.string.common_google_play_services_unknown_issue     // Catch: java.lang.Throwable -> L9
            r0.getString(r1)     // Catch: java.lang.Throwable -> L9
        L9:
            java.lang.String r0 = r7.getPackageName()
            java.lang.String r1 = "com.google.android.gms"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L34
            java.util.concurrent.atomic.AtomicBoolean r0 = com.google.android.gms.common.GooglePlayServicesUtilLight.zzc
            boolean r0 = r0.get()
            if (r0 != 0) goto L34
            int r0 = com.google.android.gms.common.internal.zzah.zza(r7)
            if (r0 == 0) goto L2e
            int r2 = com.google.android.gms.common.GooglePlayServicesUtilLight.GOOGLE_PLAY_SERVICES_VERSION_CODE
            if (r0 != r2) goto L28
            goto L34
        L28:
            com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException r7 = new com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException
            r7.<init>(r0)
            throw r7
        L2e:
            com.google.android.gms.common.GooglePlayServicesMissingManifestValueException r7 = new com.google.android.gms.common.GooglePlayServicesMissingManifestValueException
            r7.<init>()
            throw r7
        L34:
            boolean r0 = com.google.android.gms.common.util.DeviceProperties.isWearableWithoutPlayStore(r7)
            r2 = 1
            r3 = 0
            if (r0 != 0) goto L44
            boolean r0 = com.google.android.gms.common.util.DeviceProperties.zzb(r7)
            if (r0 != 0) goto L44
            r0 = r2
            goto L45
        L44:
            r0 = r3
        L45:
            if (r8 < 0) goto L49
            r4 = r2
            goto L4a
        L49:
            r4 = r3
        L4a:
            com.google.android.gms.common.internal.Preconditions.checkArgument(r4)
            r7.getPackageName()
            android.content.pm.PackageManager r4 = r7.getPackageManager()
            if (r0 == 0) goto L5f
            java.lang.String r5 = "com.android.vending"
            r6 = 8256(0x2040, float:1.1569E-41)
            android.content.pm.PackageInfo r5 = r4.getPackageInfo(r5, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lab
            goto L60
        L5f:
            r5 = 0
        L60:
            r6 = 64
            android.content.pm.PackageInfo r6 = r4.getPackageInfo(r1, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lad
            com.google.android.gms.common.GoogleSignatureVerifier.getInstance(r7)
            boolean r7 = com.google.android.gms.common.GoogleSignatureVerifier.zzb(r6, r2)
            if (r7 == 0) goto Lab
            if (r0 == 0) goto L7a
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            boolean r7 = com.google.android.gms.common.GoogleSignatureVerifier.zzb(r5, r2)
            if (r7 == 0) goto Lab
        L7a:
            if (r0 == 0) goto L8c
            if (r5 == 0) goto L8c
            android.content.pm.Signature[] r7 = r5.signatures
            r7 = r7[r3]
            android.content.pm.Signature[] r0 = r6.signatures
            r0 = r0[r3]
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto Lab
        L8c:
            int r7 = r6.versionCode
            int r7 = com.google.android.gms.common.util.zza.zza(r7)
            int r8 = com.google.android.gms.common.util.zza.zza(r8)
            if (r7 >= r8) goto L9c
            int r7 = r6.versionCode
            r2 = 2
            goto Lad
        L9c:
            android.content.pm.ApplicationInfo r7 = r6.applicationInfo
            if (r7 != 0) goto La4
            android.content.pm.ApplicationInfo r7 = r4.getApplicationInfo(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lad
        La4:
            boolean r7 = r7.enabled
            if (r7 != 0) goto Laa
            r2 = 3
            goto Lad
        Laa:
            return r3
        Lab:
            r2 = 9
        Lad:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GooglePlayServicesUtilLight.isGooglePlayServicesAvailable(android.content.Context, int):int");
    }

    GooglePlayServicesUtilLight() {
    }
}
