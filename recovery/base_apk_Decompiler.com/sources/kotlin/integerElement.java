package kotlin;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
final class integerElement extends DefaultEbmlReader1 {
    private final String RemoteActionCompatParcelizer;
    private /* synthetic */ floatElement write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    integerElement(floatElement floatelement, TaskCompletionSource taskCompletionSource, String str) {
        super(floatelement, new JpegExtractor("OnRequestInstallCallback"), taskCompletionSource);
        this.write = floatelement;
        this.RemoteActionCompatParcelizer = str;
    }

    @Override // kotlin.DefaultEbmlReader1, kotlin.VideoTagPayloadReader
    public final void AudioAttributesCompatParcelizer(Bundle bundle) throws RemoteException {
        super.AudioAttributesCompatParcelizer(bundle);
        if (bundle.getInt("error.code", -2) != 0) {
            this.AudioAttributesCompatParcelizer.trySetException(new MatroskaExtractor(bundle.getInt("error.code", -2)));
        } else {
            this.AudioAttributesCompatParcelizer.trySetResult(floatElement.IconCompatParcelizer(this.write, bundle, this.RemoteActionCompatParcelizer));
        }
    }
}
