package kotlin;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public interface VideoTagPayloadReader extends IInterface {
    void AudioAttributesCompatParcelizer(Bundle bundle) throws RemoteException;

    void read(Bundle bundle) throws RemoteException;
}
