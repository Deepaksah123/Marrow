package kotlin;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
final class VarintReader extends handleBlockAddIDExtraData {
    private /* synthetic */ TaskCompletionSource read;
    private /* synthetic */ readUint write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VarintReader(readUint readuint, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2) {
        super(taskCompletionSource);
        this.write = readuint;
        this.read = taskCompletionSource2;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [android.os.IInterface, o.scaleTimecodeToUs] */
    @Override // kotlin.handleBlockAddIDExtraData
    public final void read() {
        try {
            ?? AudioAttributesCompatParcelizer = this.write.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
            String str = this.write.write;
            Bundle bundleRemoteActionCompatParcelizer = getLastLength.RemoteActionCompatParcelizer();
            readUint readuint = this.write;
            AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(str, bundleRemoteActionCompatParcelizer, new parseUnsignedVarintLength(readuint, this.read, readuint.write));
        } catch (RemoteException e) {
            readUint.RemoteActionCompatParcelizer.read(e, "error requesting in-app review for %s", this.write.write);
            this.read.trySetException(new RuntimeException(e));
        }
    }
}
