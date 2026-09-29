package kotlin;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
class DefaultEbmlReader1 extends TagPayloadReader {
    final TaskCompletionSource AudioAttributesCompatParcelizer;
    private JpegExtractor IconCompatParcelizer;
    private /* synthetic */ floatElement RemoteActionCompatParcelizer;

    DefaultEbmlReader1(floatElement floatelement, JpegExtractor jpegExtractor, TaskCompletionSource taskCompletionSource) {
        this.RemoteActionCompatParcelizer = floatelement;
        this.IconCompatParcelizer = jpegExtractor;
        this.AudioAttributesCompatParcelizer = taskCompletionSource;
    }

    @Override // kotlin.VideoTagPayloadReader
    public void AudioAttributesCompatParcelizer(Bundle bundle) throws RemoteException {
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer("onRequestInfo", new Object[0]);
    }

    @Override // kotlin.VideoTagPayloadReader
    public void read(Bundle bundle) throws RemoteException {
        this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer("onCompleteUpdate", new Object[0]);
    }
}
