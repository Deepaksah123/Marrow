package com.google.android.recaptcha.internal;

import java.util.Collection;
import kotlin.IntermediateLoginResponseBody;
import kotlin.getAnswerMap;
import kotlin.getOrderDetails;
import kotlin.getSubmissionTimestamp;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcv implements zzdd {
    public static final zzcv zza = new zzcv();

    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i, zzcj zzcjVar, zzpq... zzpqVarArr) throws zzae {
        String strRemoteActionCompatParcelizer;
        String str;
        if (zzpqVarArr.length != 1) {
            throw new zzae(4, 3, null);
        }
        Object objZza = zzcjVar.zzc().zza(zzpqVarArr[0]);
        if (true != (objZza instanceof Object)) {
            objZza = null;
        }
        if (objZza == null) {
            throw new zzae(4, 5, null);
        }
        if (objZza instanceof int[]) {
            strRemoteActionCompatParcelizer = getOrderDetails.read((int[]) objZza, ",", "[", "]", -1, "...", null);
        } else {
            if (objZza instanceof byte[]) {
                str = new String((byte[]) objZza, getSubmissionTimestamp.IconCompatParcelizer);
            } else if (objZza instanceof long[]) {
                strRemoteActionCompatParcelizer = getOrderDetails.IconCompatParcelizer((long[]) objZza, ",", "[", "]", -1, "...", null);
            } else if (objZza instanceof short[]) {
                strRemoteActionCompatParcelizer = getOrderDetails.RemoteActionCompatParcelizer((short[]) objZza, ",", "[", "]", -1, "...", (getAnswerMap<? super Short, ? extends CharSequence>) null);
            } else if (objZza instanceof float[]) {
                strRemoteActionCompatParcelizer = getOrderDetails.RemoteActionCompatParcelizer((float[]) objZza, ",", "[", "]", -1, "...", (getAnswerMap<? super Float, ? extends CharSequence>) null);
            } else if (objZza instanceof double[]) {
                strRemoteActionCompatParcelizer = getOrderDetails.write((double[]) objZza, ",", "[", "]", -1, "...", (getAnswerMap<? super Double, ? extends CharSequence>) null);
            } else if (objZza instanceof char[]) {
                str = new String((char[]) objZza);
            } else if (objZza instanceof Object[]) {
                strRemoteActionCompatParcelizer = getOrderDetails.RemoteActionCompatParcelizer((Object[]) objZza, ",", "[", "]", 0, (CharSequence) null, (getAnswerMap) null, 56);
            } else {
                if (!(objZza instanceof Collection)) {
                    throw new zzae(4, 5, null);
                }
                strRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) objZza, ",", "[", "]", 0, null, null, 56);
            }
            strRemoteActionCompatParcelizer = str;
        }
        zzcjVar.zzc().zzf(i, strRemoteActionCompatParcelizer);
    }

    private zzcv() {
    }
}
