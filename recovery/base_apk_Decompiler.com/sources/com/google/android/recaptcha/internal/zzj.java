package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import kotlin.getYearOfAdmission;

/* JADX INFO: loaded from: classes3.dex */
public final class zzj {
    public static final Task zza(getYearOfAdmission getyearofadmission) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource(new CancellationTokenSource().getToken());
        getyearofadmission.RemoteActionCompatParcelizer(new zzi(taskCompletionSource, getyearofadmission));
        return taskCompletionSource.getTask();
    }
}
