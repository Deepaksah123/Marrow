package com.google.android.gms.wallet.callback;

import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;

/* JADX INFO: loaded from: classes5.dex */
final class zzf implements OnCompleteListener<PaymentDataRequestUpdate> {
    private final OnCompleteListener<CallbackOutput> zza;

    @Override // com.google.android.gms.wallet.callback.OnCompleteListener
    /* JADX INFO: renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final void complete(PaymentDataRequestUpdate paymentDataRequestUpdate) {
        synchronized (this) {
            OnCompleteListener<CallbackOutput> onCompleteListener = this.zza;
            zzj zzjVarZza = CallbackOutput.zza();
            CallbackOutput callbackOutput = zzjVarZza.zza;
            callbackOutput.zza = 2;
            callbackOutput.zzb = 1;
            byte[] bArrSerializeToBytes = SafeParcelableSerializer.serializeToBytes(paymentDataRequestUpdate);
            CallbackOutput callbackOutput2 = zzjVarZza.zza;
            callbackOutput2.zzc = bArrSerializeToBytes;
            onCompleteListener.complete(callbackOutput2);
        }
    }

    zzf(OnCompleteListener<CallbackOutput> onCompleteListener) {
        this.zza = onCompleteListener;
    }
}
