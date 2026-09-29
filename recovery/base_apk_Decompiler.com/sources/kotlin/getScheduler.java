package kotlin;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes5.dex */
public final class getScheduler implements ServiceConnection {
    public lambdamaybeLoadSupplier2 AudioAttributesCompatParcelizer;
    public boolean write = false;

    public getScheduler(lambdamaybeLoadSupplier2 lambdamaybeloadsupplier2) {
        this.AudioAttributesCompatParcelizer = lambdamaybeloadsupplier2;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.write = true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.write = false;
        this.AudioAttributesCompatParcelizer.write();
    }

    public final boolean write() {
        return this.write;
    }

    public final lambdamaybeLoadSupplier2 read() {
        return this.AudioAttributesCompatParcelizer;
    }
}
