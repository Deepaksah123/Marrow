package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import com.google.android.gms.common.internal.Preconditions;
import kotlin.maybeGetTypeVariable;

/* JADX INFO: loaded from: classes3.dex */
public class LifecycleActivity {
    private final Object zza;

    public LifecycleActivity(Activity activity) {
        Preconditions.checkNotNull(activity, "Activity must not be null");
        this.zza = activity;
    }

    public final maybeGetTypeVariable zzb() {
        return (maybeGetTypeVariable) this.zza;
    }

    public final boolean zzc() {
        return this.zza instanceof Activity;
    }

    public final boolean zzd() {
        return this.zza instanceof maybeGetTypeVariable;
    }

    public LifecycleActivity(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    public final Activity zza() {
        return (Activity) this.zza;
    }
}
