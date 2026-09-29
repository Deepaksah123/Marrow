package kotlin;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class getLeafAtomOfType extends SeekerUnseekableSeeker implements AtomContainerAtom {
    public getLeafAtomOfType() {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
    }

    @Override // kotlin.SeekerUnseekableSeeker
    protected final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            Bundle bundle = (Bundle) getTimeUsForTableIndex.write(parcel, Bundle.CREATOR);
            getTimeUsForTableIndex.read(parcel);
            e(bundle);
            return true;
        }
        if (i == 3) {
            Bundle bundle2 = (Bundle) getTimeUsForTableIndex.write(parcel, Bundle.CREATOR);
            getTimeUsForTableIndex.read(parcel);
            c(bundle2);
            return true;
        }
        if (i == 4) {
            Bundle bundle3 = (Bundle) getTimeUsForTableIndex.write(parcel, Bundle.CREATOR);
            getTimeUsForTableIndex.read(parcel);
            d(bundle3);
            return true;
        }
        if (i != 5) {
            return false;
        }
        Bundle bundle4 = (Bundle) getTimeUsForTableIndex.write(parcel, Bundle.CREATOR);
        getTimeUsForTableIndex.read(parcel);
        b(bundle4);
        return true;
    }
}
