package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaException;
import java.util.UUID;
import kotlin.SampleVideos;
import kotlin.VideoSessionResponseBody;
import kotlin.getCollegeName;
import kotlin.getPincode;
import kotlin.setDownloadPercent;
import kotlin.setEncryptSalt;
import kotlin.setModifiedEndTimestampMs;

/* JADX INFO: loaded from: classes3.dex */
public final class zzam {
    private static zzaw zzb;
    public static final zzam zza = new zzam();
    private static final String zzc = UUID.randomUUID().toString();
    private static final setDownloadPercent zzd = setEncryptSalt.AudioAttributesCompatParcelizer(false);
    private static final zzt zze = new zzt();
    private static zzg zzf = new zzg(null, 1, 0 == true ? 1 : 0);

    public static final Object zzc(Application application, String str, long j, zzbq zzbqVar, SampleVideos sampleVideos) throws getPincode, RecaptchaException, ApiException {
        return setModifiedEndTimestampMs.RemoteActionCompatParcelizer(zze.zzb().getIconCompatParcelizer(), new zzah(application, str, j, null, null), sampleVideos);
    }

    public static final Task zzd(Application application, String str, long j) throws getPincode, RecaptchaException, ApiException {
        return zzj.zza(setModifiedEndTimestampMs.IconCompatParcelizer(zze.zzb(), VideoSessionResponseBody.RemoteActionCompatParcelizer, getCollegeName.write, new zzak(application, str, j, null)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [o.setDownloadPercent] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [o.setDownloadPercent] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object zza(android.app.Application r24, java.lang.String r25, long r26, com.google.android.recaptcha.internal.zzab r28, android.webkit.WebView r29, com.google.android.recaptcha.internal.zzbq r30, com.google.android.recaptcha.internal.zzt r31, kotlin.SampleVideos r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzam.zza(android.app.Application, java.lang.String, long, com.google.android.recaptcha.internal.zzab, android.webkit.WebView, com.google.android.recaptcha.internal.zzbq, com.google.android.recaptcha.internal.zzt, o.SampleVideos):java.lang.Object");
    }

    private zzam() {
    }

    public static final zzg zze() {
        return zzf;
    }

    public static final void zzf(zzg zzgVar) {
        zzf = zzgVar;
    }
}
