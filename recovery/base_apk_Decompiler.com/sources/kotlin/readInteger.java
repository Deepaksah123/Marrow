package kotlin;

import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
final class readInteger extends outputImageTrack {
    private /* synthetic */ floatElement AudioAttributesCompatParcelizer;
    private /* synthetic */ String RemoteActionCompatParcelizer;
    private /* synthetic */ TaskCompletionSource write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    readInteger(floatElement floatelement, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, String str) {
        super(taskCompletionSource);
        this.AudioAttributesCompatParcelizer = floatelement;
        this.write = taskCompletionSource2;
        this.RemoteActionCompatParcelizer = str;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, o.TagPayloadReaderUnsupportedFormatException] */
    @Override // kotlin.outputImageTrack
    public final void RemoteActionCompatParcelizer() {
        try {
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer.write().IconCompatParcelizer(this.AudioAttributesCompatParcelizer.read, floatElement.read(), new binaryElement(this.AudioAttributesCompatParcelizer, this.write));
        } catch (RemoteException e) {
            floatElement.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(e, "completeUpdate(%s)", this.RemoteActionCompatParcelizer);
            this.write.trySetException(new RuntimeException(e));
        }
    }
}
