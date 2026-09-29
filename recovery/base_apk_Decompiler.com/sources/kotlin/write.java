package kotlin;

import android.app.Notification;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public interface write extends IInterface {
    public static final String read = "android$support$v4$app$INotificationSideChannel".replace('$', '.');

    void IconCompatParcelizer(String str, int i, String str2, Notification notification) throws RemoteException;

    void read(String str, int i, String str2) throws RemoteException;

    void write(String str) throws RemoteException;

    public static abstract class read extends Binder implements write {
        public read() {
            attachInterface(this, read);
        }

        public static write RemoteActionCompatParcelizer(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(read);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof write)) {
                return (write) iInterfaceQueryLocalInterface;
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
                IconCompatParcelizer(parcel.readString(), parcel.readInt(), parcel.readString(), (Notification) RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(parcel, Notification.CREATOR));
            } else if (i == 2) {
                read(parcel.readString(), parcel.readInt(), parcel.readString());
            } else if (i == 3) {
                write(parcel.readString());
            } else {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            return true;
        }

        static class IconCompatParcelizer implements write {
            private IBinder RemoteActionCompatParcelizer;

            IconCompatParcelizer(IBinder iBinder) {
                this.RemoteActionCompatParcelizer = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.RemoteActionCompatParcelizer;
            }

            @Override // kotlin.write
            public final void IconCompatParcelizer(String str, int i, String str2, Notification notification) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(read);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str2);
                    RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(parcelObtain, notification, 0);
                    this.RemoteActionCompatParcelizer.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.write
            public final void read(String str, int i, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(read);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str2);
                    this.RemoteActionCompatParcelizer.transact(2, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }

            @Override // kotlin.write
            public final void write(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(read);
                    parcelObtain.writeString(str);
                    this.RemoteActionCompatParcelizer.transact(3, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }
    }

    public static class RemoteActionCompatParcelizer {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T AudioAttributesCompatParcelizer(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void RemoteActionCompatParcelizer(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, 0);
            } else {
                parcel.writeInt(0);
            }
        }
    }
}
