package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.List;
import kotlin.IntermediateLoginResponseBody;
import kotlin.getOrderDetails;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
public final class zzch extends zzce {
    private final zzcg zza;
    private final String zzb;

    public zzch(zzcg zzcgVar, String str, Object obj) {
        super(obj);
        this.zza = zzcgVar;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzce
    public final boolean zza(Object obj, Method method, Object[] objArr) {
        List listRemoteActionCompatParcelizer;
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) method.getName(), (Object) this.zzb)) {
            return false;
        }
        zzcg zzcgVar = this.zza;
        if (objArr == null || (listRemoteActionCompatParcelizer = getOrderDetails.read(objArr)) == null) {
            listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        zzcgVar.zzb(listRemoteActionCompatParcelizer);
        return true;
    }
}
