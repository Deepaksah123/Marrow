package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.Map;
import kotlin.getUserBadgedLabel;

/* JADX INFO: loaded from: classes4.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {
    private final Object AudioAttributesCompatParcelizer;
    private final SidecarInterface.SidecarCallback IconCompatParcelizer;
    private final getUserBadgedLabel RemoteActionCompatParcelizer;
    private final Map<IBinder, SidecarWindowLayoutInfo> read;
    private SidecarDeviceState write;

    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState == null) {
            return;
        }
        synchronized (this.AudioAttributesCompatParcelizer) {
            if (getUserBadgedLabel.read(this.write, sidecarDeviceState)) {
                return;
            }
            this.write = sidecarDeviceState;
            this.IconCompatParcelizer.onDeviceStateChanged(sidecarDeviceState);
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        synchronized (this.AudioAttributesCompatParcelizer) {
            if (this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this.read.get(iBinder), sidecarWindowLayoutInfo)) {
                return;
            }
            this.read.put(iBinder, sidecarWindowLayoutInfo);
            this.IconCompatParcelizer.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
        }
    }
}
