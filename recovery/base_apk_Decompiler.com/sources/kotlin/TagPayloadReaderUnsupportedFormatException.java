package kotlin;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public interface TagPayloadReaderUnsupportedFormatException extends IInterface {
    void IconCompatParcelizer(String str, Bundle bundle, VideoTagPayloadReader videoTagPayloadReader) throws RemoteException;

    void write(String str, Bundle bundle, VideoTagPayloadReader videoTagPayloadReader) throws RemoteException;
}
