package com.google.android.play.core.integrity;

import android.content.Context;
import kotlin.Mp3ExtractorExternalSyntheticLambda1;
import kotlin.evaluate;
import kotlin.getTrackTypeForHdlr;

/* JADX INFO: loaded from: classes5.dex */
public final class bp implements Mp3ExtractorExternalSyntheticLambda1 {
    private final evaluate a;
    private final evaluate b;
    private final evaluate c;

    @Override // kotlin.evaluate
    public final /* bridge */ /* synthetic */ Object a() {
        return new bn((Context) this.a.a(), (getTrackTypeForHdlr) this.b.a(), ((au) this.c).a(), new j());
    }

    public bp(evaluate evaluateVar, evaluate evaluateVar2, evaluate evaluateVar3, evaluate evaluateVar4) {
        this.a = evaluateVar;
        this.b = evaluateVar2;
        this.c = evaluateVar3;
    }
}
