package com.google.android.play.core.integrity;

import android.content.Context;
import kotlin.Mp3Extractor;

/* JADX INFO: loaded from: classes5.dex */
final class z {
    private static s a;

    static s a(Context context) {
        s sVar;
        synchronized (z.class) {
            if (a == null) {
                q qVar = new q(null);
                qVar.a(Mp3Extractor.RemoteActionCompatParcelizer(context));
                a = qVar.b();
            }
            sVar = a;
        }
        return sVar;
    }
}
