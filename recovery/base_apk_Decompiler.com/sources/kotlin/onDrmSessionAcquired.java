package kotlin;

import android.os.Process;
import kotlin.MediaSourceListForwardingEventListenerExternalSyntheticLambda4;

/* JADX INFO: loaded from: classes.dex */
public final class onDrmSessionAcquired {
    public static int AudioAttributesCompatParcelizer;
    public static int write;

    private static int write() {
        return MediaSourceListForwardingEventListenerExternalSyntheticLambda4.RemoteActionCompatParcelizer();
    }

    public static void RemoteActionCompatParcelizer() {
        write();
        MediaSourceListForwardingEventListenerExternalSyntheticLambda4.write.RemoteActionCompatParcelizer.getWrite();
    }

    public static void IconCompatParcelizer() {
        write();
        MediaSourceListForwardingEventListenerExternalSyntheticLambda4.write.write.getWrite();
    }

    public static void read() {
        write();
        MediaSourceListForwardingEventListenerExternalSyntheticLambda4.write.write.getWrite();
    }

    public static int AudioAttributesCompatParcelizer() {
        int i = AudioAttributesCompatParcelizer;
        int i2 = i % 9034103;
        AudioAttributesCompatParcelizer = i + 1;
        if (i2 != 0) {
            return write;
        }
        int elapsedCpuTime = (int) Process.getElapsedCpuTime();
        write = elapsedCpuTime;
        return elapsedCpuTime;
    }
}
