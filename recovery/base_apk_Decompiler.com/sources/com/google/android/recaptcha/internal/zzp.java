package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaErrorCode;
import com.google.android.recaptcha.RecaptchaException;
import java.util.Map;
import kotlin.VideoTimelineResponseBody;
import kotlin.setAction;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
public final class zzp extends Exception {
    public static final zzo zza = new zzo(null);
    private static final Map zzb = VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write(zzpb.JS_NETWORK_ERROR, new zzp(zzn.zze, zzl.zzm, null)), setAction.write(zzpb.JS_INTERNAL_ERROR, new zzp(zzn.zzc, zzl.zzk, null)), setAction.write(zzpb.JS_INVALID_SITE_KEY, new zzp(zzn.zzf, zzl.zzn, null)), setAction.write(zzpb.JS_INVALID_SITE_KEY_TYPE, new zzp(zzn.zzg, zzl.zzo, null)), setAction.write(zzpb.JS_THIRD_PARTY_APP_PACKAGE_NAME_NOT_ALLOWED, new zzp(zzn.zzh, zzl.zzp, null)), setAction.write(zzpb.JS_INVALID_ACTION, new zzp(zzn.zzi, zzl.zzq, null)), setAction.write(zzpb.JS_PROGRAM_ERROR, new zzp(zzn.zzc, zzl.zzu, null)));
    private final zzn zzc;
    private final zzl zzd;
    private final String zze;
    private final Map zzf = VideoTimelineResponseBody.RemoteActionCompatParcelizer(setAction.write(zzn.zze, new RecaptchaException(RecaptchaErrorCode.NETWORK_ERROR, null, 2, null)), setAction.write(zzn.zzk, new RecaptchaException(RecaptchaErrorCode.NETWORK_ERROR, null, 2, null)), setAction.write(zzn.zzf, new RecaptchaException(RecaptchaErrorCode.INVALID_SITEKEY, null, 2, null)), setAction.write(zzn.zzg, new RecaptchaException(RecaptchaErrorCode.INVALID_KEYTYPE, null, 2, null)), setAction.write(zzn.zzh, new RecaptchaException(RecaptchaErrorCode.INVALID_PACKAGE_NAME, null, 2, null)), setAction.write(zzn.zzi, new RecaptchaException(RecaptchaErrorCode.INVALID_ACTION, null, 2, null)), setAction.write(zzn.zzc, new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, null, 2, null)));

    public zzp(zzn zznVar, zzl zzlVar, String str) {
        this.zzc = zznVar;
        this.zzd = zzlVar;
        this.zze = str;
    }

    public final RecaptchaException zzc() {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.zzd, zzl.zzT)) {
            return new RecaptchaException(RecaptchaErrorCode.INVALID_TIMEOUT, null, 2, null);
        }
        RecaptchaException recaptchaException = (RecaptchaException) this.zzf.get(this.zzc);
        return recaptchaException == null ? new RecaptchaException(RecaptchaErrorCode.INTERNAL_ERROR, null, 2, null) : recaptchaException;
    }

    public final zzl zza() {
        return this.zzd;
    }

    public final zzn zzb() {
        return this.zzc;
    }

    public final String zzd() {
        return this.zze;
    }
}
