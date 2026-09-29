package com.google.android.gms.internal.p000authapi;

import android.os.RemoteException;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zbai implements RemoteCall {
    public static int IconCompatParcelizer;
    public static int read;
    public final /* synthetic */ zbaq zba;

    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void accept(Object obj, Object obj2) throws RemoteException {
        this.zba.zbb((zbar) obj, (TaskCompletionSource) obj2);
    }

    public static int write() {
        int i = read;
        int i2 = i % 8363941;
        read = i + 1;
        if (i2 != 0) {
            return IconCompatParcelizer;
        }
        int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
        IconCompatParcelizer = iFreeMemory;
        return iFreeMemory;
    }
}
