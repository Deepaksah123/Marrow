package kotlin;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public interface AudioAttributesImplApi21Parcelizer extends IInterface {
    public static final String IconCompatParcelizer = "android$support$v4$os$IResultReceiver".replace('$', '.');

    void write(int i, Bundle bundle) throws RemoteException;

    public static abstract class read extends Binder implements AudioAttributesImplApi21Parcelizer {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        public read() {
            attachInterface(this, IconCompatParcelizer);
        }

        public static AudioAttributesImplApi21Parcelizer IconCompatParcelizer(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(IconCompatParcelizer);
            if (iInterfaceQueryLocalInterface != null && (iInterfaceQueryLocalInterface instanceof AudioAttributesImplApi21Parcelizer)) {
                return (AudioAttributesImplApi21Parcelizer) iInterfaceQueryLocalInterface;
            }
            return new C0019read(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            String str = IconCompatParcelizer;
            if (i > 0 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i == 1) {
                write(parcel.readInt(), (Bundle) RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(parcel, Bundle.CREATOR));
                return true;
            }
            return super.onTransact(i, parcel, parcel2, i2);
        }

        /* JADX INFO: renamed from: o.AudioAttributesImplApi21Parcelizer$read$read, reason: collision with other inner class name */
        static class C0019read implements AudioAttributesImplApi21Parcelizer {
            private IBinder AudioAttributesCompatParcelizer;

            C0019read(IBinder iBinder) {
                this.AudioAttributesCompatParcelizer = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.AudioAttributesCompatParcelizer;
            }

            @Override // kotlin.AudioAttributesImplApi21Parcelizer
            public final void write(int i, Bundle bundle) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(IconCompatParcelizer);
                    parcelObtain.writeInt(i);
                    RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(parcelObtain, bundle, 0);
                    this.AudioAttributesCompatParcelizer.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }
    }

    public static class RemoteActionCompatParcelizer {
        /* JADX INFO: Access modifiers changed from: private */
        public static <T> T RemoteActionCompatParcelizer(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static <T extends Parcelable> void AudioAttributesCompatParcelizer(Parcel parcel, T t, int i) {
            if (t != null) {
                parcel.writeInt(1);
                t.writeToParcel(parcel, 0);
            } else {
                parcel.writeInt(0);
            }
        }
    }
}
