package com.google.android.recaptcha.internal;

import com.google.android.exoplayer2.analytics.AnalyticsListener;

/* JADX INFO: loaded from: classes3.dex */
public final class zzx {
    public static final zzw zza = new zzw(null);
    public static final zzx zzb = new zzx(9999);
    public static final zzx zzc = new zzx(1000);
    public static final zzx zzd = new zzx(1001);
    public static final zzx zze = new zzx(1002);
    public static final zzx zzf = new zzx(1003);
    public static final zzx zzg = new zzx(1004);
    public static final zzx zzh = new zzx(1005);
    public static final zzx zzi = new zzx(AnalyticsListener.EVENT_BANDWIDTH_ESTIMATE);
    public static final zzx zzj = new zzx(AnalyticsListener.EVENT_AUDIO_ENABLED);
    public static final zzx zzk = new zzx(AnalyticsListener.EVENT_AUDIO_DECODER_INITIALIZED);
    public static final zzx zzl = new zzx(AnalyticsListener.EVENT_AUDIO_INPUT_FORMAT_CHANGED);
    public static final zzx zzm = new zzx(AnalyticsListener.EVENT_AUDIO_POSITION_ADVANCING);
    private final int zzn;

    private zzx(int i) {
        this.zzn = i;
    }

    public final int zza() {
        return this.zzn;
    }
}
