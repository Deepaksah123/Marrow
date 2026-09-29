package kotlin;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class writeSubtitleSampleData extends readScratch implements writeToOutput {
    @Override // kotlin.readScratch
    protected final boolean AudioAttributesCompatParcelizer(int i, Parcel parcel) throws RemoteException {
        if (i != 2) {
            return false;
        }
        Bundle bundle = (Bundle) writeSampleData.write(parcel, Bundle.CREATOR);
        writeSampleData.RemoteActionCompatParcelizer(parcel);
        RemoteActionCompatParcelizer(bundle);
        return true;
    }
}
