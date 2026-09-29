package com.google.android.gms.common;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.errorprone.annotations.RestrictedInheritance;
import com.marrow.data.models.test.TestIndex;

/* JADX INFO: loaded from: classes5.dex */
@RestrictedInheritance(allowedOnPath = ".*javatests.*/com/google/android/gms/common/.*", explanation = "Sub classing of GMS Core's APIs are restricted to testing fakes.", link = "go/gmscore-restrictedinheritance")
public class PackageSignatureVerifier {
    static volatile zzac zza;
    private static zzad zzb;

    private static zzad zza(Context context) {
        zzad zzadVar;
        synchronized (PackageSignatureVerifier.class) {
            if (zzb == null) {
                zzb = new zzad(context);
            }
            zzadVar = zzb;
        }
        return zzadVar;
    }

    public PackageVerificationResult queryPackageSignatureVerified(Context context, String str) {
        boolean zHonorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(context);
        zza(context);
        if (!zzn.zzf()) {
            throw new zzae();
        }
        String strConcat = String.valueOf(str).concat(true != zHonorsDebugCertificates ? "-0" : TestIndex.ALL_INDIA_ID);
        if (zza != null && zza.zza.equals(strConcat)) {
            return zza.zzb;
        }
        zza(context);
        zzx zzxVarZzc = zzn.zzc(str, zHonorsDebugCertificates, false, false);
        if (!zzxVarZzc.zza) {
            Preconditions.checkNotNull(zzxVarZzc.zzb);
            return PackageVerificationResult.zza(str, zzxVarZzc.zzb, zzxVarZzc.zzc);
        }
        zzac zzacVar = new zzac(strConcat, PackageVerificationResult.zzd(str, zzxVarZzc.zzd));
        zza = zzacVar;
        return zzacVar.zzb;
    }

    public PackageVerificationResult queryPackageSignatureVerifiedWithRetry(Context context, String str) {
        try {
            PackageVerificationResult packageVerificationResultQueryPackageSignatureVerified = queryPackageSignatureVerified(context, str);
            packageVerificationResultQueryPackageSignatureVerified.zzb();
            return packageVerificationResultQueryPackageSignatureVerified;
        } catch (SecurityException unused) {
            PackageVerificationResult packageVerificationResultQueryPackageSignatureVerified2 = queryPackageSignatureVerified(context, str);
            packageVerificationResultQueryPackageSignatureVerified2.zzc();
            return packageVerificationResultQueryPackageSignatureVerified2;
        }
    }
}
