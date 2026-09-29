package kotlin;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public class readAmfDouble implements IInterface {
    private final String RemoteActionCompatParcelizer = "com.google.android.play.core.appupdate.protocol.IAppUpdateService";
    private final IBinder write;

    protected final Parcel AudioAttributesCompatParcelizer() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.RemoteActionCompatParcelizer);
        return parcelObtain;
    }

    protected final void read(int i, Parcel parcel) throws RemoteException {
        try {
            this.write.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    protected readAmfDouble(IBinder iBinder) {
        this.write = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.write;
    }
}
