package kotlin;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes5.dex */
public final class lambdamaybeLoadSupplier2 extends ResultReceiver {
    private String read;
    public HandlerThread write;

    public lambdamaybeLoadSupplier2(Handler handler, HandlerThread handlerThread) {
        super(handler);
        this.read = null;
        this.write = handlerThread;
    }

    public final String read() {
        return this.read;
    }

    @Override // android.os.ResultReceiver
    protected final void onReceiveResult(int i, Bundle bundle) {
        this.read = bundle.getString("result");
    }

    public final void write() {
        this.write.quit();
    }
}
