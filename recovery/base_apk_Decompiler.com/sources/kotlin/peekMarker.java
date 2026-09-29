package kotlin;

import android.os.IBinder;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class peekMarker extends outputImageTrack {
    private /* synthetic */ IBinder RemoteActionCompatParcelizer;
    private /* synthetic */ MotionPhotoDescription read;

    peekMarker(MotionPhotoDescription motionPhotoDescription, IBinder iBinder) {
        this.read = motionPhotoDescription;
        this.RemoteActionCompatParcelizer = iBinder;
    }

    @Override // kotlin.outputImageTrack
    public final void RemoteActionCompatParcelizer() {
        this.read.write.MediaBrowserCompatMediaItem = getKeyFrameTimesUs.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
        startReadingMotionPhoto.MediaBrowserCompatSearchResultReceiver(this.read.write);
        this.read.write.AudioAttributesImplApi21Parcelizer = false;
        Iterator it = this.read.write.AudioAttributesCompatParcelizer.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.read.write.AudioAttributesCompatParcelizer.clear();
    }
}
