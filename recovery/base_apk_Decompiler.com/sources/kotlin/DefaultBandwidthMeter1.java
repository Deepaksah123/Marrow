package kotlin;

import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public interface DefaultBandwidthMeter1 {
    Object write(Throwable th, String str, HashMap<String, String> map);

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object AudioAttributesCompatParcelizer(DefaultBandwidthMeter1 defaultBandwidthMeter1, Throwable th, String str, HashMap map, SampleVideos sampleVideos, int i) {
        if ((i & 2) != 0) {
            str = "undefined";
        }
        if ((i & 4) != 0) {
            map = new HashMap();
        }
        return defaultBandwidthMeter1.write(th, str, map);
    }
}
