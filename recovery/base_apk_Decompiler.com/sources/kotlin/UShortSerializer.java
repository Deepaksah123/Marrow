package kotlin;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes2.dex */
public interface UShortSerializer extends IInterface {
    public static final String read = "androidx$room$IMultiInstanceInvalidationCallback".replace('$', '.');

    void write(String[] strArr) throws RemoteException;

    public static abstract class write extends Binder implements UShortSerializer {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public write() {
            attachInterface(this, read);
        }

        public static UShortSerializer write(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(read);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof UShortSerializer)) {
                return (UShortSerializer) iInterfaceQueryLocalInterface;
            }
            return new IconCompatParcelizer(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = read;
            if (i > 0 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i == 1) {
                write(parcel.createStringArray());
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        static class IconCompatParcelizer implements UShortSerializer {
            private IBinder write;

            IconCompatParcelizer(IBinder iBinder) {
                this.write = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.write;
            }

            @Override // kotlin.UShortSerializer
            public final void write(String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(read);
                    parcelObtain.writeStringArray(strArr);
                    this.write.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }
    }
}
