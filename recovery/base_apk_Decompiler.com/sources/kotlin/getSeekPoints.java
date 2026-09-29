package kotlin;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public interface getSeekPoints extends IInterface {

    public static abstract class AudioAttributesCompatParcelizer extends getErrorCodeForMediaDrmException implements getSeekPoints {

        public static class read extends DrmSessionManagerDrmSessionReferenceExternalSyntheticLambda0 implements getSeekPoints {
            read(IBinder iBinder) {
                super(iBinder);
            }

            @Override // kotlin.getSeekPoints
            public final Bundle read(Bundle bundle) throws RemoteException {
                Parcel parcelRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
                DrmUtil.IconCompatParcelizer(parcelRemoteActionCompatParcelizer, bundle);
                Parcel parcel = read(parcelRemoteActionCompatParcelizer);
                Bundle bundle2 = (Bundle) DrmUtil.read(parcel, Bundle.CREATOR);
                parcel.recycle();
                return bundle2;
            }
        }

        public static getSeekPoints RemoteActionCompatParcelizer(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            return iInterfaceQueryLocalInterface instanceof getSeekPoints ? (getSeekPoints) iInterfaceQueryLocalInterface : new read(iBinder);
        }

        @Override // kotlin.getErrorCodeForMediaDrmException
        public final boolean RemoteActionCompatParcelizer(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
            if (i != 1) {
                return false;
            }
            Bundle bundle = read((Bundle) DrmUtil.read(parcel, Bundle.CREATOR));
            parcel2.writeNoException();
            DrmUtil.write(parcel2, bundle);
            return true;
        }
    }

    Bundle read(Bundle bundle) throws RemoteException;
}
