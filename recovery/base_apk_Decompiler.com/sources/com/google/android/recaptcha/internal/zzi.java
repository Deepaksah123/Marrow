package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.CancellationException;
import kotlin.MagicModuleUseCase;
import kotlin.getAnswerMap;
import kotlin.getShowPopup;
import kotlin.getYearOfAdmission;

/* JADX INFO: loaded from: classes3.dex */
final class zzi extends MagicModuleUseCase implements getAnswerMap {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ getYearOfAdmission zzb;

    @Override // kotlin.getAnswerMap
    public final /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof CancellationException) {
            this.zza.setException((Exception) th);
        } else {
            Throwable thBl_ = this.zzb.bl_();
            if (thBl_ == null) {
                this.zza.setResult(this.zzb.write());
            } else {
                TaskCompletionSource taskCompletionSource = this.zza;
                Exception runtimeExecutionException = thBl_ instanceof Exception ? (Exception) thBl_ : null;
                if (runtimeExecutionException == null) {
                    runtimeExecutionException = new RuntimeExecutionException(thBl_);
                }
                taskCompletionSource.setException(runtimeExecutionException);
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzi(TaskCompletionSource taskCompletionSource, getYearOfAdmission getyearofadmission) {
        super(1);
        this.zza = taskCompletionSource;
        this.zzb = getyearofadmission;
    }
}
