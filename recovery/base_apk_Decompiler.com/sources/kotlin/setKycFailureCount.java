package kotlin;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class setKycFailureCount {
    public static final void RemoteActionCompatParcelizer(setLastName<?> setlastname, Throwable th) {
        if (th != null) {
            cancellationExceptionAudioAttributesCompatParcelizer = th instanceof CancellationException ? (CancellationException) th : null;
            if (cancellationExceptionAudioAttributesCompatParcelizer == null) {
                cancellationExceptionAudioAttributesCompatParcelizer = getJSONArray.AudioAttributesCompatParcelizer("Channel was consumed, consumer had failed", th);
            }
        }
        setlastname.RemoteActionCompatParcelizer(cancellationExceptionAudioAttributesCompatParcelizer);
    }
}
