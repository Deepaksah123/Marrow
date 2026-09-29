package kotlin;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public class formatSubtitleTimecode implements IInterface {
    private final String IconCompatParcelizer = "com.google.android.play.core.inappreview.protocol.IInAppReviewService";
    private final IBinder RemoteActionCompatParcelizer;

    protected final void AudioAttributesCompatParcelizer(Parcel parcel) throws RemoteException {
        try {
            this.RemoteActionCompatParcelizer.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    protected final Parcel write() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.IconCompatParcelizer);
        return parcelObtain;
    }

    protected formatSubtitleTimecode(IBinder iBinder) {
        this.RemoteActionCompatParcelizer = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.RemoteActionCompatParcelizer;
    }
}
