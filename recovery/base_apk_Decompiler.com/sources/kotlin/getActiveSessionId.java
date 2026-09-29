package kotlin;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface getActiveSessionId extends IInterface {
    int RemoteActionCompatParcelizer(Bundle bundle) throws RemoteException;

    public static abstract class read extends Binder implements getActiveSessionId {
        public read() {
            attachInterface(this, "com.facebook.ppml.receiver.IReceiverService");
        }

        public static getActiveSessionId IconCompatParcelizer(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof getActiveSessionId)) {
                return (getActiveSessionId) iInterfaceQueryLocalInterface;
            }
            return new IconCompatParcelizer(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                if (i == 1598968902) {
                    parcel2.writeString("com.facebook.ppml.receiver.IReceiverService");
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface("com.facebook.ppml.receiver.IReceiverService");
            int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            parcel2.writeInt(iRemoteActionCompatParcelizer);
            return true;
        }

        static class IconCompatParcelizer implements getActiveSessionId {
            private IBinder IconCompatParcelizer;

            IconCompatParcelizer(IBinder iBinder) {
                this.IconCompatParcelizer = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.IconCompatParcelizer;
            }

            @Override // kotlin.getActiveSessionId
            public final int RemoteActionCompatParcelizer(Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.facebook.ppml.receiver.IReceiverService");
                    if (bundle != null) {
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                    } else {
                        parcelObtain.writeInt(0);
                    }
                    this.IconCompatParcelizer.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }
    }
}
