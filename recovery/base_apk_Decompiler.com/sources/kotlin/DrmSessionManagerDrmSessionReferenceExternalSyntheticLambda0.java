package kotlin;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public class DrmSessionManagerDrmSessionReferenceExternalSyntheticLambda0 implements IInterface {
    private final IBinder read;
    private final String write = "com.google.android.finsky.externalreferrer.IGetInstallReferrerService";

    public final Parcel RemoteActionCompatParcelizer() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.write);
        return parcelObtain;
    }

    public final Parcel read(Parcel parcel) throws RemoteException {
        Parcel parcelObtain = Parcel.obtain();
        try {
            try {
                this.read.transact(1, parcel, parcelObtain, 0);
                parcelObtain.readException();
                return parcelObtain;
            } catch (RuntimeException e) {
                parcelObtain.recycle();
                throw e;
            }
        } finally {
            parcel.recycle();
        }
    }

    public DrmSessionManagerDrmSessionReferenceExternalSyntheticLambda0(IBinder iBinder) {
        this.read = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.read;
    }
}
