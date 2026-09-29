package com.google.android.play.core.integrity;

import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import kotlin.allocateHdrStaticInfo;
import kotlin.isTimeUsInIndex;
import kotlin.parseAudioSampleEntry;

/* JADX INFO: loaded from: classes5.dex */
final class af extends parseAudioSampleEntry {
    final /* synthetic */ byte[] a;
    final /* synthetic */ Long b;
    final /* synthetic */ Parcelable c;
    final /* synthetic */ TaskCompletionSource d;
    final /* synthetic */ IntegrityTokenRequest e;
    final /* synthetic */ aj f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    af(aj ajVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l, Parcelable parcelable, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.a = bArr;
        this.b = l;
        this.c = parcelable;
        this.d = taskCompletionSource2;
        this.e = integrityTokenRequest;
        this.f = ajVar;
    }

    @Override // kotlin.parseAudioSampleEntry
    public final void a(Exception exc) {
        if (exc instanceof isTimeUsInIndex) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // kotlin.parseAudioSampleEntry
    public final void b() {
        try {
            ((allocateHdrStaticInfo) this.f.a.AudioAttributesCompatParcelizer()).IconCompatParcelizer(aj.a(this.f, this.a, this.b, this.c), new ai(this.f, this.d));
        } catch (RemoteException e) {
            this.f.b.RemoteActionCompatParcelizer(e, "requestIntegrityToken(%s)", this.e);
            this.d.trySetException(new IntegrityServiceException(-100, e));
        }
    }
}
