package kotlin;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes5.dex */
public abstract class parseFullAtomVersion extends SeekerUnseekableSeeker implements getChildAtomOfTypeCount {
    public static getChildAtomOfTypeCount IconCompatParcelizer(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
        return iInterfaceQueryLocalInterface instanceof getChildAtomOfTypeCount ? (getChildAtomOfTypeCount) iInterfaceQueryLocalInterface : new getAtomTypeString(iBinder);
    }
}
