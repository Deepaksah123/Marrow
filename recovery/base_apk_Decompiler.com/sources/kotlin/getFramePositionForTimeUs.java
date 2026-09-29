package kotlin;

import android.view.View;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Iterator;
import java.util.List;
import kotlin.NioPathSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class getFramePositionForTimeUs extends NioPathSerializer.read {
    private final View AudioAttributesCompatParcelizer;
    private int IconCompatParcelizer;
    private final int[] read;
    private int write;

    public getFramePositionForTimeUs(View view) {
        super(0);
        this.read = new int[2];
        this.AudioAttributesCompatParcelizer = view;
    }

    @Override // o.NioPathSerializer.read
    public final void write(NioPathSerializer nioPathSerializer) {
        this.AudioAttributesCompatParcelizer.getLocationOnScreen(this.read);
        this.IconCompatParcelizer = this.read[1];
    }

    @Override // o.NioPathSerializer.read
    public final NioPathSerializer.RemoteActionCompatParcelizer write(NioPathSerializer nioPathSerializer, NioPathSerializer.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.AudioAttributesCompatParcelizer.getLocationOnScreen(this.read);
        int i = this.IconCompatParcelizer - this.read[1];
        this.write = i;
        this.AudioAttributesCompatParcelizer.setTranslationY(i);
        return remoteActionCompatParcelizer;
    }

    @Override // o.NioPathSerializer.read
    public final WindowInsetsCompat AudioAttributesCompatParcelizer(WindowInsetsCompat windowInsetsCompat, List<NioPathSerializer> list) {
        Iterator<NioPathSerializer> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((it.next().IconCompatParcelizer() & WindowInsetsCompat.MediaBrowserCompatItemReceiver.IconCompatParcelizer()) != 0) {
                this.AudioAttributesCompatParcelizer.setTranslationY(BinarySearchSeekerSeekOperationParams.RemoteActionCompatParcelizer(this.write, 0, r0.AudioAttributesCompatParcelizer()));
                break;
            }
        }
        return windowInsetsCompat;
    }

    @Override // o.NioPathSerializer.read
    public final void IconCompatParcelizer(NioPathSerializer nioPathSerializer) {
        this.AudioAttributesCompatParcelizer.setTranslationY(BitmapDescriptorFactory.HUE_RED);
    }
}
