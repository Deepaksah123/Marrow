package com.google.android.play.core.integrity;

import android.content.Context;
import kotlin.Mp3Extractor;

/* JADX INFO: loaded from: classes5.dex */
final class ax {
    private static aw a;

    static aw a(Context context) {
        aw awVar;
        synchronized (ax.class) {
            if (a == null) {
                u uVar = new u(null);
                uVar.a(Mp3Extractor.RemoteActionCompatParcelizer(context));
                a = uVar.b();
            }
            awVar = a;
        }
        return awVar;
    }
}
