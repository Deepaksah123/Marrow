package kotlin;

import com.google.firebase.perf.metrics.Trace;
import kotlin.avcProfileNumberToConst;
import kotlin.getScore;

/* JADX INFO: loaded from: classes3.dex */
public final class getCodecInfoAt {
    static {
        MediaCodecRendererDecoderInitializationException.IconCompatParcelizer();
    }

    public static Trace AudioAttributesCompatParcelizer(Trace trace, avcProfileNumberToConst.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        if (audioAttributesCompatParcelizer.RemoteActionCompatParcelizer() > 0) {
            trace.write(getScore.read.FRAMES_TOTAL.toString(), audioAttributesCompatParcelizer.RemoteActionCompatParcelizer());
        }
        if (audioAttributesCompatParcelizer.IconCompatParcelizer() > 0) {
            trace.write(getScore.read.FRAMES_SLOW.toString(), audioAttributesCompatParcelizer.IconCompatParcelizer());
        }
        if (audioAttributesCompatParcelizer.read() > 0) {
            trace.write(getScore.read.FRAMES_FROZEN.toString(), audioAttributesCompatParcelizer.read());
        }
        trace.MediaBrowserCompatItemReceiver();
        audioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        audioAttributesCompatParcelizer.IconCompatParcelizer();
        audioAttributesCompatParcelizer.read();
        return trace;
    }
}
