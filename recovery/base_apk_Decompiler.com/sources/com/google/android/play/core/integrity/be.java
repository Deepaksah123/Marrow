package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import kotlin.linearlyInterpolate;
import kotlin.parseAudioSampleEntry;

/* JADX INFO: loaded from: classes5.dex */
final class be extends parseAudioSampleEntry {
    final /* synthetic */ Context a;
    final /* synthetic */ bn b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    be(bn bnVar, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.a = context;
        this.b = bnVar;
    }

    @Override // kotlin.parseAudioSampleEntry
    public final void b() {
        this.b.d.trySetResult(Integer.valueOf(linearlyInterpolate.RemoteActionCompatParcelizer(this.a)));
    }
}
