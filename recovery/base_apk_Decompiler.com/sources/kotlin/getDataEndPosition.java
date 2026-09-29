package kotlin;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes5.dex */
public class getDataEndPosition implements IInterface {
    private final IBinder RemoteActionCompatParcelizer;
    private final String read;

    protected final Parcel AudioAttributesCompatParcelizer() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.read);
        return parcelObtain;
    }

    protected final void write(int i, Parcel parcel) throws RemoteException {
        try {
            this.RemoteActionCompatParcelizer.transact(i, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    protected getDataEndPosition(IBinder iBinder, String str) {
        this.RemoteActionCompatParcelizer = iBinder;
        this.read = str;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.RemoteActionCompatParcelizer;
    }
}
