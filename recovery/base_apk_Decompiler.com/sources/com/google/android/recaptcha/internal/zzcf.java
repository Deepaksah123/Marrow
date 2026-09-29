package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
public final class zzcf extends zzce {
    private final MagicModuleSubmissionRequestBody zza;
    private final String zzb;

    public zzcf(MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, String str, Object obj) {
        super(obj);
        this.zza = magicModuleSubmissionRequestBody;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzce
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        Collection collectionRemoteActionCompatParcelizer;
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) method.getName(), (Object) this.zzb)) {
            return false;
        }
        zzpi zzpiVarZzf = zzpl.zzf();
        if (objArr != null) {
            collectionRemoteActionCompatParcelizer = new ArrayList(objArr.length);
            for (Object obj2 : objArr) {
                zzpj zzpjVarZzf = zzpk.zzf();
                zzpjVarZzf.zzv(obj2.toString());
                collectionRemoteActionCompatParcelizer.add((zzpk) zzpjVarZzf.zzj());
            }
        } else {
            collectionRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        zzpiVarZzf.zzd(collectionRemoteActionCompatParcelizer);
        zzpl zzplVar = (zzpl) zzpiVarZzf.zzj();
        MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody = this.zza;
        byte[] bArrZzd = zzplVar.zzd();
        magicModuleSubmissionRequestBody.invoke(objArr, zzfy.zzh().zzi(bArrZzd, 0, bArrZzd.length));
        return true;
    }
}
