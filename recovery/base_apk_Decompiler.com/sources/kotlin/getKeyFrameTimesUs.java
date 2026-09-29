package kotlin;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getKeyFrameTimesUs extends readAmfType implements TagPayloadReaderUnsupportedFormatException {
    public static TagPayloadReaderUnsupportedFormatException RemoteActionCompatParcelizer(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
        return iInterfaceQueryLocalInterface instanceof TagPayloadReaderUnsupportedFormatException ? (TagPayloadReaderUnsupportedFormatException) iInterfaceQueryLocalInterface : new readAmfStrictArray(iBinder);
    }
}
