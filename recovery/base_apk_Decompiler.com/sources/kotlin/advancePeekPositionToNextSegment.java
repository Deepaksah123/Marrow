package kotlin;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class advancePeekPositionToNextSegment {
    private final Context AudioAttributesCompatParcelizer;
    public final JpegExtractor RemoteActionCompatParcelizer;
    private final IntentFilter write;
    private Set read = new HashSet();
    private getMotionPhotoMetadata IconCompatParcelizer = null;
    private volatile boolean AudioAttributesImplBaseParcelizer = false;

    public advancePeekPositionToNextSegment(JpegExtractor jpegExtractor, IntentFilter intentFilter, Context context) {
        this.RemoteActionCompatParcelizer = jpegExtractor;
        this.write = intentFilter;
        this.AudioAttributesCompatParcelizer = MotionPhotoDescriptionContainerItem.IconCompatParcelizer(context);
    }

    private final void RemoteActionCompatParcelizer() {
        getMotionPhotoMetadata getmotionphotometadata;
        if (!this.read.isEmpty() && this.IconCompatParcelizer == null) {
            this.IconCompatParcelizer = new getMotionPhotoMetadata(this);
            if (Build.VERSION.SDK_INT >= 33) {
                this.AudioAttributesCompatParcelizer.registerReceiver(this.IconCompatParcelizer, this.write, 2);
            } else {
                this.AudioAttributesCompatParcelizer.registerReceiver(this.IconCompatParcelizer, this.write);
            }
        }
        if (!this.read.isEmpty() || (getmotionphotometadata = this.IconCompatParcelizer) == null) {
            return;
        }
        this.AudioAttributesCompatParcelizer.unregisterReceiver(getmotionphotometadata);
        this.IconCompatParcelizer = null;
    }

    public final void IconCompatParcelizer(finishWriteSampleData finishwritesampledata) {
        synchronized (this) {
            this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer("registerListener", new Object[0]);
            readAmfDate.AudioAttributesCompatParcelizer(finishwritesampledata, "Registered Play Core listener should not be null.");
            this.read.add(finishwritesampledata);
            RemoteActionCompatParcelizer();
        }
    }

    protected abstract void read(Context context, Intent intent);

    public final void write(Object obj) {
        synchronized (this) {
            Iterator it = new HashSet(this.read).iterator();
            while (it.hasNext()) {
                ((finishWriteSampleData) it.next()).RemoteActionCompatParcelizer(obj);
            }
        }
    }

    public final void write(finishWriteSampleData finishwritesampledata) {
        synchronized (this) {
            this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer("unregisterListener", new Object[0]);
            readAmfDate.AudioAttributesCompatParcelizer(finishwritesampledata, "Unregistered Play Core listener should not be null.");
            this.read.remove(finishwritesampledata);
            RemoteActionCompatParcelizer();
        }
    }
}
