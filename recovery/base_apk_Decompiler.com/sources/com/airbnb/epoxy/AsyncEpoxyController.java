package com.airbnb.epoxy;

import android.os.Handler;
import kotlin.getBufferedPosition;
import kotlin.getContentBufferedPosition;

/* JADX INFO: loaded from: classes4.dex */
public abstract class AsyncEpoxyController extends getContentBufferedPosition {
    public AsyncEpoxyController() {
        this(true);
    }

    public AsyncEpoxyController(boolean z) {
        this(z, z);
    }

    public AsyncEpoxyController(boolean z, boolean z2) {
        super(getHandler(z), getHandler(z2));
    }

    private static Handler getHandler(boolean z) {
        return z ? getBufferedPosition.RemoteActionCompatParcelizer() : getBufferedPosition.RemoteActionCompatParcelizer;
    }
}
