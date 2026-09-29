package kotlin;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TagPayloadReader extends readAmfType implements VideoTagPayloadReader {
    @Override // kotlin.readAmfType
    protected final boolean write(int i, Parcel parcel) throws RemoteException {
        if (i == 2) {
            Bundle bundle = (Bundle) readAmfEcmaArray.RemoteActionCompatParcelizer(parcel, Bundle.CREATOR);
            readAmfEcmaArray.AudioAttributesCompatParcelizer(parcel);
            AudioAttributesCompatParcelizer(bundle);
            return true;
        }
        if (i != 3) {
            return false;
        }
        Bundle bundle2 = (Bundle) readAmfEcmaArray.RemoteActionCompatParcelizer(parcel, Bundle.CREATOR);
        readAmfEcmaArray.AudioAttributesCompatParcelizer(parcel);
        read(bundle2);
        return true;
    }
}
