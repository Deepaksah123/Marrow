package kotlin;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes5.dex */
public final class getAtomTypeString extends getDataEndPosition implements getChildAtomOfTypeCount {
    getAtomTypeString(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.getChildAtomOfTypeCount
    public final void IconCompatParcelizer(Bundle bundle, AtomContainerAtom atomContainerAtom) throws RemoteException {
        Parcel parcelAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        getTimeUsForTableIndex.IconCompatParcelizer(parcelAudioAttributesCompatParcelizer, bundle);
        parcelAudioAttributesCompatParcelizer.writeStrongBinder(atomContainerAtom);
        write(3, parcelAudioAttributesCompatParcelizer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.getChildAtomOfTypeCount
    public final void write(Bundle bundle, AtomContainerAtom atomContainerAtom) throws RemoteException {
        Parcel parcelAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        getTimeUsForTableIndex.IconCompatParcelizer(parcelAudioAttributesCompatParcelizer, bundle);
        parcelAudioAttributesCompatParcelizer.writeStrongBinder(atomContainerAtom);
        write(2, parcelAudioAttributesCompatParcelizer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.getChildAtomOfTypeCount
    public final void write(Bundle bundle, maybeSkipRemainingMetaAtomHeaderBytes maybeskipremainingmetaatomheaderbytes) throws RemoteException {
        Parcel parcelAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        getTimeUsForTableIndex.IconCompatParcelizer(parcelAudioAttributesCompatParcelizer, bundle);
        parcelAudioAttributesCompatParcelizer.writeStrongBinder(maybeskipremainingmetaatomheaderbytes);
        write(6, parcelAudioAttributesCompatParcelizer);
    }
}
