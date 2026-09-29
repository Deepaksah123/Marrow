package com.google.android.play.core.integrity;

import android.content.Context;
import kotlin.VbriSeeker;

/* JADX INFO: loaded from: classes5.dex */
final class u implements av {
    private Context a;

    public final u a(Context context) {
        this.a = context;
        return this;
    }

    @Override // com.google.android.play.core.integrity.av
    public final aw b() {
        VbriSeeker.AudioAttributesCompatParcelizer(this.a, Context.class);
        return new w(this.a, null);
    }

    private u() {
        throw null;
    }

    /* synthetic */ u(t tVar) {
    }
}
