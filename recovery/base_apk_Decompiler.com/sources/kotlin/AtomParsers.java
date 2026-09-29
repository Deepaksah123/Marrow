package kotlin;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes5.dex */
public abstract class AtomParsers extends SeekerUnseekableSeeker implements allocateHdrStaticInfo {
    public static allocateHdrStaticInfo IconCompatParcelizer(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
        return iInterfaceQueryLocalInterface instanceof allocateHdrStaticInfo ? (allocateHdrStaticInfo) iInterfaceQueryLocalInterface : new getContainerAtomOfType(iBinder);
    }
}
