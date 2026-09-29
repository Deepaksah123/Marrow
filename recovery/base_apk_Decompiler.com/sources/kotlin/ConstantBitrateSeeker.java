package kotlin;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes5.dex */
final class ConstantBitrateSeeker implements ServiceConnection {
    final /* synthetic */ IndexSeeker AudioAttributesCompatParcelizer;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.AudioAttributesCompatParcelizer.read.RemoteActionCompatParcelizer("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.AudioAttributesCompatParcelizer.write().post(new readUnsignedVarint(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.AudioAttributesCompatParcelizer.read.RemoteActionCompatParcelizer("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.AudioAttributesCompatParcelizer.write().post(new getTimeUs(this));
    }

    /* synthetic */ ConstantBitrateSeeker(IndexSeeker indexSeeker) {
        this.AudioAttributesCompatParcelizer = indexSeeker;
    }
}
