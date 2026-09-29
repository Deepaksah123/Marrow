package kotlin;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public class getErrorCodeForMediaDrmException extends Binder implements IInterface {
    public getErrorCodeForMediaDrmException() {
        attachInterface(this, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return RemoteActionCompatParcelizer(i, parcel, parcel2);
    }

    protected boolean RemoteActionCompatParcelizer(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        throw null;
    }
}
