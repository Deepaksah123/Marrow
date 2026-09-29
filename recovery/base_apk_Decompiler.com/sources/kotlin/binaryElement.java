package kotlin;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
final class binaryElement extends DefaultEbmlReader1 {
    binaryElement(floatElement floatelement, TaskCompletionSource taskCompletionSource) {
        super(floatelement, new JpegExtractor("OnCompleteUpdateCallback"), taskCompletionSource);
    }

    @Override // kotlin.DefaultEbmlReader1, kotlin.VideoTagPayloadReader
    public final void read(Bundle bundle) throws RemoteException {
        super.read(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.AudioAttributesCompatParcelizer.trySetException(new MatroskaExtractor(bundle.getInt("error.code", -2)));
        } else {
            this.AudioAttributesCompatParcelizer.trySetResult(null);
        }
    }
}
