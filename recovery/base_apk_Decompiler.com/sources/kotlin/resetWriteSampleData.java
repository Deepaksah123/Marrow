package kotlin;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class resetWriteSampleData extends formatSubtitleTimecode implements scaleTimecodeToUs {
    resetWriteSampleData(IBinder iBinder) {
        super(iBinder);
    }

    @Override // kotlin.scaleTimecodeToUs
    public final void RemoteActionCompatParcelizer(String str, Bundle bundle, writeToOutput writetooutput) throws RemoteException {
        Parcel parcelWrite = write();
        parcelWrite.writeString(str);
        writeSampleData.RemoteActionCompatParcelizer(parcelWrite, bundle);
        writeSampleData.AudioAttributesCompatParcelizer(parcelWrite, writetooutput);
        AudioAttributesCompatParcelizer(parcelWrite);
    }
}
