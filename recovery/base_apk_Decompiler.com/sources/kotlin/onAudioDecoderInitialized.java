package kotlin;

import android.os.Build;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
final class onAudioDecoderInitialized {
    private final HashSet<onAudioDecoderReleased> write = new HashSet<>();

    onAudioDecoderInitialized() {
    }

    public final boolean write(onAudioDecoderReleased onaudiodecoderreleased, boolean z) {
        if (z) {
            if (Build.VERSION.SDK_INT < onaudiodecoderreleased.write) {
                access3000.AudioAttributesCompatParcelizer(String.format("%s is not supported pre SDK %d", onaudiodecoderreleased.name(), Integer.valueOf(onaudiodecoderreleased.write)));
                return false;
            }
            return this.write.add(onaudiodecoderreleased);
        }
        return this.write.remove(onaudiodecoderreleased);
    }

    public final boolean AudioAttributesCompatParcelizer(onAudioDecoderReleased onaudiodecoderreleased) {
        return this.write.contains(onaudiodecoderreleased);
    }
}
