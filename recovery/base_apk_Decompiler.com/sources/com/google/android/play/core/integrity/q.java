package com.google.android.play.core.integrity;

import android.content.Context;
import kotlin.VbriSeeker;

/* JADX INFO: loaded from: classes5.dex */
final class q implements x {
    private Context a;

    public final q a(Context context) {
        this.a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.x
    public final s b() {
        VbriSeeker.AudioAttributesCompatParcelizer(this.a, Context.class);
        return new s(this.a, null);
    }

    private q() {
        throw null;
    }

    /* synthetic */ q(p pVar) {
    }
}
