package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import kotlin.getLeafAtomOfType;

/* JADX INFO: loaded from: classes5.dex */
class bi extends getLeafAtomOfType {
    final TaskCompletionSource a;
    final /* synthetic */ bn b;

    bi(bn bnVar, TaskCompletionSource taskCompletionSource) {
        this.b = bnVar;
        this.a = taskCompletionSource;
    }

    @Override // kotlin.AtomContainerAtom
    public final void b(Bundle bundle) throws RemoteException {
        this.b.a.AudioAttributesCompatParcelizer(this.a);
    }

    @Override // kotlin.AtomContainerAtom
    public void c(Bundle bundle) throws RemoteException {
        this.b.a.AudioAttributesCompatParcelizer(this.a);
    }

    @Override // kotlin.AtomContainerAtom
    public final void d(Bundle bundle) throws RemoteException {
        this.b.a.AudioAttributesCompatParcelizer(this.a);
    }

    @Override // kotlin.AtomContainerAtom
    public void e(Bundle bundle) throws RemoteException {
        this.b.a.AudioAttributesCompatParcelizer(this.a);
    }
}
