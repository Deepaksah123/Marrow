package kotlin;

import android.os.PowerManager;
import java.util.WeakHashMap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\b\u001a\u0012\u0012\b\u0012\u00060\u0005R\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b"}, d2 = {"Lo/setEnableAudioFloatOutput;", "", "<init>", "()V", "Ljava/util/WeakHashMap;", "Landroid/os/PowerManager$WakeLock;", "Landroid/os/PowerManager;", "", "IconCompatParcelizer", "Ljava/util/WeakHashMap;", "read", "()Ljava/util/WeakHashMap;"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class setEnableAudioFloatOutput {
    public static final setEnableAudioFloatOutput INSTANCE = new setEnableAudioFloatOutput();
    private static final WeakHashMap<PowerManager.WakeLock, String> IconCompatParcelizer = new WeakHashMap<>();

    private setEnableAudioFloatOutput() {
    }

    public static WeakHashMap<PowerManager.WakeLock, String> read() {
        return IconCompatParcelizer;
    }
}
