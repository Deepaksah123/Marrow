package kotlin;

import android.graphics.Path;
import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class setColorInfo {
    private static final PointF write = new PointF();

    public static boolean IconCompatParcelizer(float f, float f2, float f3) {
        return f >= f2 && f <= f3;
    }

    public static float RemoteActionCompatParcelizer(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    public static int read(int i, int i2, float f) {
        return (int) (i + (f * (i2 - i)));
    }

    public static PointF AudioAttributesCompatParcelizer(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static void AudioAttributesCompatParcelizer(setMediaItemsInternal setmediaitemsinternal, Path path) {
        path.reset();
        PointF pointFRemoteActionCompatParcelizer = setmediaitemsinternal.RemoteActionCompatParcelizer();
        path.moveTo(pointFRemoteActionCompatParcelizer.x, pointFRemoteActionCompatParcelizer.y);
        write.set(pointFRemoteActionCompatParcelizer.x, pointFRemoteActionCompatParcelizer.y);
        for (int i = 0; i < setmediaitemsinternal.AudioAttributesCompatParcelizer().size(); i++) {
            isLoadingPossible isloadingpossible = setmediaitemsinternal.AudioAttributesCompatParcelizer().get(i);
            PointF pointFIconCompatParcelizer = isloadingpossible.IconCompatParcelizer();
            PointF pointFAudioAttributesCompatParcelizer = isloadingpossible.AudioAttributesCompatParcelizer();
            PointF pointF = isloadingpossible.read();
            PointF pointF2 = write;
            if (pointFIconCompatParcelizer.equals(pointF2) && pointFAudioAttributesCompatParcelizer.equals(pointF)) {
                path.lineTo(pointF.x, pointF.y);
            } else {
                path.cubicTo(pointFIconCompatParcelizer.x, pointFIconCompatParcelizer.y, pointFAudioAttributesCompatParcelizer.x, pointFAudioAttributesCompatParcelizer.y, pointF.x, pointF.y);
            }
            pointF2.set(pointF.x, pointF.y);
        }
        if (setmediaitemsinternal.write()) {
            path.close();
        }
    }

    static int AudioAttributesCompatParcelizer(float f, float f2) {
        return write((int) f, (int) f2);
    }

    private static int write(int i, int i2) {
        return i - (i2 * IconCompatParcelizer(i, i2));
    }

    private static int IconCompatParcelizer(int i, int i2) {
        int i3 = i / i2;
        return ((i ^ i2) < 0 && i % i2 != 0) ? i3 - 1 : i3;
    }

    public static int RemoteActionCompatParcelizer(int i) {
        return Math.max(0, Math.min(255, i));
    }

    public static float AudioAttributesCompatParcelizer(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static void IconCompatParcelizer(maybeTriggerPendingMessages maybetriggerpendingmessages, int i, List<maybeTriggerPendingMessages> list, maybeTriggerPendingMessages maybetriggerpendingmessages2, surfaceChanged surfacechanged) {
        if (maybetriggerpendingmessages.IconCompatParcelizer(surfacechanged.AudioAttributesCompatParcelizer(), i)) {
            list.add(maybetriggerpendingmessages2.write(surfacechanged.AudioAttributesCompatParcelizer()).IconCompatParcelizer(surfacechanged));
        }
    }
}
