package kotlin;

import android.hardware.Camera;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public final class featureAndInstanceUidArguments {
    public static final LinkedList AudioAttributesCompatParcelizer() {
        int numberOfCameras = Camera.getNumberOfCameras();
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < numberOfCameras; i++) {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(i, cameraInfo);
            int i2 = cameraInfo.facing;
            linkedList.add(new getTypeForPcmEncoding(String.valueOf(i), i2 != 0 ? i2 != 1 ? "" : "front" : "back", String.valueOf(cameraInfo.orientation)));
        }
        return linkedList;
    }
}
