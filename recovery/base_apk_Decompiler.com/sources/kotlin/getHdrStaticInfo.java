package kotlin;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes3.dex */
final class getHdrStaticInfo implements ServiceConnection {
    final /* synthetic */ assertOutputInitialized IconCompatParcelizer;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.IconCompatParcelizer.write.read("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        assertOutputInitialized assertoutputinitialized = this.IconCompatParcelizer;
        assertoutputinitialized.IconCompatParcelizer().post(new MatroskaExtractor1(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.IconCompatParcelizer.write.read("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        assertOutputInitialized assertoutputinitialized = this.IconCompatParcelizer;
        assertoutputinitialized.IconCompatParcelizer().post(new MatroskaExtractorTrack(this));
    }

    /* synthetic */ getHdrStaticInfo(assertOutputInitialized assertoutputinitialized) {
        this.IconCompatParcelizer = assertoutputinitialized;
    }
}
