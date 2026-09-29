package kotlin;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: loaded from: classes3.dex */
final class MotionPhotoDescription implements ServiceConnection {
    final /* synthetic */ startReadingMotionPhoto write;

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.write.IconCompatParcelizer.AudioAttributesCompatParcelizer("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        startReadingMotionPhoto startreadingmotionphoto = this.write;
        startreadingmotionphoto.RemoteActionCompatParcelizer().post(new peekMarker(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.write.IconCompatParcelizer.AudioAttributesCompatParcelizer("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        startReadingMotionPhoto startreadingmotionphoto = this.write;
        startreadingmotionphoto.RemoteActionCompatParcelizer().post(new StartOffsetExtractorOutput(this));
    }

    /* synthetic */ MotionPhotoDescription(startReadingMotionPhoto startreadingmotionphoto) {
        this.write = startreadingmotionphoto;
    }
}
