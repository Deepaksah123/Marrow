package kotlin;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes5.dex */
public final class getContainerAtomOfType extends getDataEndPosition implements allocateHdrStaticInfo {
    getContainerAtomOfType(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.allocateHdrStaticInfo
    public final void IconCompatParcelizer(Bundle bundle, canTrimSamplesWithTimestampChange cantrimsampleswithtimestampchange) throws RemoteException {
        Parcel parcelAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        getTimeUsForTableIndex.IconCompatParcelizer(parcelAudioAttributesCompatParcelizer, bundle);
        parcelAudioAttributesCompatParcelizer.writeStrongBinder(cantrimsampleswithtimestampchange);
        write(2, parcelAudioAttributesCompatParcelizer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.allocateHdrStaticInfo
    public final void IconCompatParcelizer(Bundle bundle, maybeSkipRemainingMetaAtomHeaderBytes maybeskipremainingmetaatomheaderbytes) throws RemoteException {
        Parcel parcelAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        getTimeUsForTableIndex.IconCompatParcelizer(parcelAudioAttributesCompatParcelizer, bundle);
        parcelAudioAttributesCompatParcelizer.writeStrongBinder(maybeskipremainingmetaatomheaderbytes);
        write(3, parcelAudioAttributesCompatParcelizer);
    }
}
