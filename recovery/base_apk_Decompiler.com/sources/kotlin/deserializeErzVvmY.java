package kotlin;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import kotlin.UShortSerializer;

/* JADX INFO: loaded from: classes2.dex */
public interface deserializeErzVvmY extends IInterface {
    public static final String write = "androidx$room$IMultiInstanceInvalidationService".replace('$', '.');

    void AudioAttributesCompatParcelizer(int i, String[] strArr) throws RemoteException;

    int IconCompatParcelizer(UShortSerializer uShortSerializer, String str) throws RemoteException;

    void RemoteActionCompatParcelizer(UShortSerializer uShortSerializer, int i) throws RemoteException;

    public static abstract class IconCompatParcelizer extends Binder implements deserializeErzVvmY {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public IconCompatParcelizer() {
            attachInterface(this, write);
        }

        public static deserializeErzVvmY read(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(write);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof deserializeErzVvmY)) {
                return (deserializeErzVvmY) iInterfaceQueryLocalInterface;
            }
            return new read(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = write;
            if (i > 0 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i == 1) {
                int iIconCompatParcelizer = IconCompatParcelizer(UShortSerializer.write.write(parcel.readStrongBinder()), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeInt(iIconCompatParcelizer);
            } else if (i == 2) {
                RemoteActionCompatParcelizer(UShortSerializer.write.write(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
            } else if (i == 3) {
                AudioAttributesCompatParcelizer(parcel.readInt(), parcel.createStringArray());
            } else {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }

        static class read implements deserializeErzVvmY {
            private IBinder RemoteActionCompatParcelizer;

            read(IBinder iBinder) {
                this.RemoteActionCompatParcelizer = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.RemoteActionCompatParcelizer;
            }

            @Override // kotlin.deserializeErzVvmY
            public final int IconCompatParcelizer(UShortSerializer uShortSerializer, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(write);
                    parcelObtain.writeStrongInterface(uShortSerializer);
                    parcelObtain.writeString(str);
                    this.RemoteActionCompatParcelizer.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.deserializeErzVvmY
            public final void RemoteActionCompatParcelizer(UShortSerializer uShortSerializer, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(write);
                    parcelObtain.writeStrongInterface(uShortSerializer);
                    parcelObtain.writeInt(i);
                    this.RemoteActionCompatParcelizer.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.deserializeErzVvmY
            public final void AudioAttributesCompatParcelizer(int i, String[] strArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(write);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStringArray(strArr);
                    this.RemoteActionCompatParcelizer.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }
    }
}
