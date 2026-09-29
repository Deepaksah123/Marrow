package kotlin;

import java.security.SecureRandom;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdaonLoadError3comgoogleandroidexoplayer2MediaSourceListForwardingEventListener {
    static {
        new SecureRandom();
    }

    public static byte[] RemoteActionCompatParcelizer(lambdaonDrmSessionReleased11comgoogleandroidexoplayer2MediaSourceListForwardingEventListener lambdaondrmsessionreleased11comgoogleandroidexoplayer2mediasourcelistforwardingeventlistener) {
        byte[] bArrAudioAttributesCompatParcelizer;
        int iWrite = lambdaondrmsessionreleased11comgoogleandroidexoplayer2mediasourcelistforwardingeventlistener.write();
        byte[] bArr = new byte[iWrite];
        if (lambdaondrmsessionreleased11comgoogleandroidexoplayer2mediasourcelistforwardingeventlistener.AudioAttributesCompatParcelizer() == lambdaonDrmSessionManagerError8comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.AudioAttributesImplBaseParcelizer) {
            onDrmKeysRestored ondrmkeysrestored = new onDrmKeysRestored();
            ondrmkeysrestored.RemoteActionCompatParcelizer();
            ondrmkeysrestored.read();
            bArrAudioAttributesCompatParcelizer = ondrmkeysrestored.AudioAttributesCompatParcelizer();
        } else {
            bArrAudioAttributesCompatParcelizer = null;
        }
        lambdaonDrmKeysLoaded7comgoogleandroidexoplayer2MediaSourceListForwardingEventListener.IconCompatParcelizer(bArrAudioAttributesCompatParcelizer);
        if (bArrAudioAttributesCompatParcelizer != null) {
            System.arraycopy(bArrAudioAttributesCompatParcelizer, 0, bArr, 0, Math.min(bArrAudioAttributesCompatParcelizer.length, iWrite));
        }
        return bArr;
    }
}
