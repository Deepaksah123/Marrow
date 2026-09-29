package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.TaskCompletionSource;
import kotlin.isTimeUsInIndex;
import kotlin.parseAudioSampleEntry;

/* JADX INFO: loaded from: classes5.dex */
abstract class bm extends parseAudioSampleEntry {
    final /* synthetic */ bn f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bm(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        this.f = bnVar;
    }

    @Override // kotlin.parseAudioSampleEntry
    public final void a(Exception exc) {
        if (!(exc instanceof isTimeUsInIndex)) {
            super.a(exc);
        } else if (bn.l(this.f)) {
            super.a(new StandardIntegrityException(-2, exc));
        } else {
            super.a(new StandardIntegrityException(-9, exc));
        }
    }
}
