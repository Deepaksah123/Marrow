package kotlin;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public final class readAmfStrictArray extends readAmfDouble implements TagPayloadReaderUnsupportedFormatException {
    readAmfStrictArray(IBinder iBinder) {
        super(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.TagPayloadReaderUnsupportedFormatException
    public final void IconCompatParcelizer(String str, Bundle bundle, VideoTagPayloadReader videoTagPayloadReader) throws RemoteException {
        Parcel parcelAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        parcelAudioAttributesCompatParcelizer.writeString(str);
        readAmfEcmaArray.IconCompatParcelizer(parcelAudioAttributesCompatParcelizer, bundle);
        parcelAudioAttributesCompatParcelizer.writeStrongBinder(videoTagPayloadReader);
        read(3, parcelAudioAttributesCompatParcelizer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.TagPayloadReaderUnsupportedFormatException
    public final void write(String str, Bundle bundle, VideoTagPayloadReader videoTagPayloadReader) throws RemoteException {
        Parcel parcelAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        parcelAudioAttributesCompatParcelizer.writeString(str);
        readAmfEcmaArray.IconCompatParcelizer(parcelAudioAttributesCompatParcelizer, bundle);
        parcelAudioAttributesCompatParcelizer.writeStrongBinder(videoTagPayloadReader);
        read(2, parcelAudioAttributesCompatParcelizer);
    }
}
