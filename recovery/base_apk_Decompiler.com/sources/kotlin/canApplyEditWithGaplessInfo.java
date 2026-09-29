package kotlin;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes5.dex */
public abstract class canApplyEditWithGaplessInfo extends SeekerUnseekableSeeker implements maybeSkipRemainingMetaAtomHeaderBytes {
    public canApplyEditWithGaplessInfo() {
        super("com.google.android.play.core.integrity.protocol.IRequestDialogCallback");
    }

    @Override // kotlin.SeekerUnseekableSeeker
    protected final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        Bundle bundle = (Bundle) getTimeUsForTableIndex.write(parcel, Bundle.CREATOR);
        getTimeUsForTableIndex.read(parcel);
        b(bundle);
        return true;
    }
}
