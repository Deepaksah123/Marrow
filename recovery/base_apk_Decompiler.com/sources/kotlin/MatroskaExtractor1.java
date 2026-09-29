package kotlin;

import android.os.IBinder;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class MatroskaExtractor1 extends handleBlockAddIDExtraData {
    private /* synthetic */ getHdrStaticInfo RemoteActionCompatParcelizer;
    private /* synthetic */ IBinder write;

    MatroskaExtractor1(getHdrStaticInfo gethdrstaticinfo, IBinder iBinder) {
        this.RemoteActionCompatParcelizer = gethdrstaticinfo;
        this.write = iBinder;
    }

    @Override // kotlin.handleBlockAddIDExtraData
    public final void read() {
        this.RemoteActionCompatParcelizer.IconCompatParcelizer.MediaBrowserCompatSearchResultReceiver = setSubtitleEndTime.write(this.write);
        assertOutputInitialized.MediaBrowserCompatCustomActionResultReceiver(this.RemoteActionCompatParcelizer.IconCompatParcelizer);
        this.RemoteActionCompatParcelizer.IconCompatParcelizer.AudioAttributesImplApi21Parcelizer = false;
        Iterator it = this.RemoteActionCompatParcelizer.IconCompatParcelizer.read.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.RemoteActionCompatParcelizer.IconCompatParcelizer.read.clear();
    }
}
