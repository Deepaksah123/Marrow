package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import kotlin.allocateHdrStaticInfo;
import kotlin.parseAudioSampleEntry;

/* JADX INFO: loaded from: classes5.dex */
final class ag extends parseAudioSampleEntry {
    final /* synthetic */ Bundle a;
    final /* synthetic */ Activity b;
    final /* synthetic */ TaskCompletionSource c;
    final /* synthetic */ int d;
    final /* synthetic */ aj e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ag(aj ajVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i) {
        super(taskCompletionSource);
        this.a = bundle;
        this.b = activity;
        this.c = taskCompletionSource2;
        this.d = i;
        this.e = ajVar;
    }

    @Override // kotlin.parseAudioSampleEntry
    public final void b() {
        try {
            allocateHdrStaticInfo allocatehdrstaticinfo = (allocateHdrStaticInfo) this.e.a.AudioAttributesCompatParcelizer();
            Bundle bundle = this.a;
            aj ajVar = this.e;
            allocatehdrstaticinfo.IconCompatParcelizer(bundle, ajVar.e.a(this.b, this.c, ajVar.a));
        } catch (RemoteException e) {
            this.e.b.RemoteActionCompatParcelizer(e, "requestAndShowDialog(%s)", Integer.valueOf(this.d));
            this.c.trySetException(new IntegrityServiceException(-100, e));
        }
    }
}
