package com.google.android.recaptcha.internal;

import android.net.TrafficStats;
import android.webkit.URLUtil;
import com.google.android.exoplayer2.source.rtsp.RtspHeaders;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import kotlin.IntermediateLoginResponseBody;
import kotlin.getAvcProfileAndLevel;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbo implements zzbn {
    private final String zza;

    private static final void zzb(byte[] bArr) {
        for (zznf zznfVar : zzni.zzk(bArr).zzH()) {
            if (IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new String[]{"INIT_TOTAL", "EXECUTE_TOTAL"}).contains(zznfVar.zzj().name()) && zznfVar.zzT()) {
                zznfVar.zzJ();
                zznfVar.zzK();
                zznfVar.zzj();
                zznfVar.zzg().zzk();
                zznfVar.zzg().zzf();
                zznfVar.zzU();
            } else {
                zznfVar.zzJ();
                zznfVar.zzK();
                zznfVar.zzj();
                zznfVar.zzU();
            }
        }
    }

    @Override // com.google.android.recaptcha.internal.zzbn
    public final boolean zza(byte[] bArr) {
        HttpURLConnection httpURLConnection;
        try {
            TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
            zzb(bArr);
            if (URLUtil.isHttpUrl(this.zza)) {
                URLConnection uRLConnection = (URLConnection) getAvcProfileAndLevel.read(new URL(this.zza).openConnection());
                toMagicModuleMetaRepoModel.read(uRLConnection, "");
                httpURLConnection = (HttpURLConnection) uRLConnection;
            } else {
                if (!URLUtil.isHttpsUrl(this.zza)) {
                    throw new MalformedURLException("Recaptcha server url only allows using Http or Https.");
                }
                URLConnection uRLConnection2 = (URLConnection) getAvcProfileAndLevel.read(new URL(this.zza).openConnection());
                toMagicModuleMetaRepoModel.read(uRLConnection2, "");
                httpURLConnection = (HttpsURLConnection) uRLConnection2;
            }
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestProperty(RtspHeaders.CONTENT_TYPE, "application/x-protobuffer");
            httpURLConnection.connect();
            httpURLConnection.getOutputStream().write(bArr);
            return httpURLConnection.getResponseCode() == 200;
        } catch (Exception e) {
            e.getMessage();
            return false;
        }
    }

    public zzbo(String str) {
        this.zza = str;
    }
}
