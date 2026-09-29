package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class zzin implements Runnable {
    final /* synthetic */ zzio zza;
    private final URL zzb;
    private final String zzc;
    private final zzgb zzd;

    public zzin(zzio zzioVar, String str, URL url, byte[] bArr, Map map, zzgb zzgbVar) {
        this.zza = zzioVar;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(url);
        Preconditions.checkNotNull(zzgbVar);
        this.zzb = url;
        this.zzd = zzgbVar;
        this.zzc = str;
    }

    private final void zzb(final int i, final Exception exc, final byte[] bArr, final Map map) {
        this.zza.zzt.zzaB().zzp(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzim
            @Override // java.lang.Runnable
            public final void run() {
                this.zza.zza(i, exc, bArr, map);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a3  */
    /* JADX WARN: Type inference failed for: r10v0, types: [com.google.android.gms.measurement.internal.zzin] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() throws java.lang.Throwable {
        /*
            r10 = this;
            com.google.android.gms.measurement.internal.zzio r0 = r10.zza
            r0.zzaz()
            r0 = 0
            r1 = 0
            com.google.android.gms.measurement.internal.zzio r2 = r10.zza     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L9e
            java.net.URL r3 = r10.zzb     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L9e
            java.net.URLConnection r3 = r3.openConnection()     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L9e
            boolean r4 = r3 instanceof java.net.HttpURLConnection     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L9e
            if (r4 == 0) goto L8a
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L9e
            r3.setDefaultUseCaches(r0)     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L9e
            com.google.android.gms.measurement.internal.zzgd r4 = r2.zzt     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L9e
            r4.zzf()     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L9e
            r4 = 60000(0xea60, float:8.4078E-41)
            r3.setConnectTimeout(r4)     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L9e
            com.google.android.gms.measurement.internal.zzgd r2 = r2.zzt     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L9e
            r2.zzf()     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L9e
            r2 = 61000(0xee48, float:8.5479E-41)
            r3.setReadTimeout(r2)     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L9e
            r3.setInstanceFollowRedirects(r0)     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L9e
            r2 = 1
            r3.setDoInput(r2)     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L9e
            int r2 = r3.getResponseCode()     // Catch: java.lang.Throwable -> L84 java.io.IOException -> L87
            java.util.Map r4 = r3.getHeaderFields()     // Catch: java.lang.Throwable -> L7a java.io.IOException -> L7f
            java.io.ByteArrayOutputStream r5 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L68
            r5.<init>()     // Catch: java.lang.Throwable -> L68
            java.io.InputStream r6 = r3.getInputStream()     // Catch: java.lang.Throwable -> L68
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]     // Catch: java.lang.Throwable -> L66
        L4a:
            int r8 = r6.read(r7)     // Catch: java.lang.Throwable -> L66
            if (r8 <= 0) goto L54
            r5.write(r7, r0, r8)     // Catch: java.lang.Throwable -> L66
            goto L4a
        L54:
            byte[] r0 = r5.toByteArray()     // Catch: java.lang.Throwable -> L66
            if (r6 == 0) goto L5d
            r6.close()     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L75
        L5d:
            if (r3 == 0) goto L62
            r3.disconnect()
        L62:
            r10.zzb(r2, r1, r0, r4)
            return
        L66:
            r0 = move-exception
            goto L6a
        L68:
            r0 = move-exception
            r6 = r1
        L6a:
            if (r6 == 0) goto L6f
            r6.close()     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L75
        L6f:
            throw r0     // Catch: java.lang.Throwable -> L70 java.io.IOException -> L75
        L70:
            r0 = move-exception
            r9 = r2
            r2 = r0
            r0 = r9
            goto L95
        L75:
            r0 = move-exception
            r9 = r2
            r2 = r0
            r0 = r9
            goto La1
        L7a:
            r0 = move-exception
            r9 = r2
            r2 = r0
            r0 = r9
            goto L85
        L7f:
            r0 = move-exception
            r9 = r2
            r2 = r0
            r0 = r9
            goto L88
        L84:
            r2 = move-exception
        L85:
            r4 = r1
            goto L95
        L87:
            r2 = move-exception
        L88:
            r4 = r1
            goto La1
        L8a:
            java.io.IOException r2 = new java.io.IOException     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L9e
            java.lang.String r3 = "Failed to obtain HTTP connection"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L9e
            throw r2     // Catch: java.lang.Throwable -> L92 java.io.IOException -> L9e
        L92:
            r2 = move-exception
            r3 = r1
            r4 = r3
        L95:
            if (r3 == 0) goto L9a
            r3.disconnect()
        L9a:
            r10.zzb(r0, r1, r1, r4)
            throw r2
        L9e:
            r2 = move-exception
            r3 = r1
            r4 = r3
        La1:
            if (r3 == 0) goto La6
            r3.disconnect()
        La6:
            r10.zzb(r0, r2, r1, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzin.run():void");
    }

    final /* synthetic */ void zza(int i, Exception exc, byte[] bArr, Map map) {
        zzgb zzgbVar = this.zzd;
        zzgbVar.zza.zzC(this.zzc, i, exc, bArr, map);
    }
}
