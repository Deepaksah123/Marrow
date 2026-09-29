package kotlin;

import android.graphics.drawable.Drawable;
import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class getConstantBitrateSeekMap {
    static amrSignatureWb IconCompatParcelizer(int i) {
        if (i == 0) {
            return new isWideBandValidFrameType();
        }
        if (i == 1) {
            return new frameSizeBytesByTypeWb();
        }
        return read();
    }

    static amrSignatureWb read() {
        return new isWideBandValidFrameType();
    }

    static getBitrateFromFrameSize RemoteActionCompatParcelizer() {
        return new getBitrateFromFrameSize();
    }

    public static void read(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof frameSizeBytesByTypeNb) {
            ((frameSizeBytesByTypeNb) background).handleMediaPlayPauseIfPendingOnHandler(f);
        }
    }

    public static void IconCompatParcelizer(View view) {
        Drawable background = view.getBackground();
        if (background instanceof frameSizeBytesByTypeNb) {
            RemoteActionCompatParcelizer(view, (frameSizeBytesByTypeNb) background);
        }
    }

    public static void RemoteActionCompatParcelizer(View view, frameSizeBytesByTypeNb framesizebytesbytypenb) {
        if (framesizebytesbytypenb.onRemoveQueueItem()) {
            framesizebytesbytypenb.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(checkAndPeekStreamMarker.write(view));
        }
    }
}
