package kotlin;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
final class EbmlProcessor extends outputImageTrack {
    private /* synthetic */ String AudioAttributesCompatParcelizer;
    private /* synthetic */ TaskCompletionSource RemoteActionCompatParcelizer;
    private /* synthetic */ floatElement write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EbmlProcessor(floatElement floatelement, TaskCompletionSource taskCompletionSource, String str, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.write = floatelement;
        this.AudioAttributesCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, o.TagPayloadReaderUnsupportedFormatException] */
    @Override // kotlin.outputImageTrack
    public final void RemoteActionCompatParcelizer() {
        try {
            ?? Write = this.write.AudioAttributesCompatParcelizer.write();
            floatElement floatelement = this.write;
            Write.write(floatelement.read, floatElement.RemoteActionCompatParcelizer(floatelement, this.AudioAttributesCompatParcelizer), new integerElement(this.write, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer));
        } catch (RemoteException e) {
            floatElement.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "requestUpdateInfo(%s)", this.AudioAttributesCompatParcelizer);
            this.RemoteActionCompatParcelizer.trySetException(new RuntimeException(e));
        }
    }
}
