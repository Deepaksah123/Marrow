package kotlin;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class getKeyFrameTagPositions {
    private static final Map AudioAttributesCompatParcelizer;

    static {
        new HashSet(Arrays.asList("app_update", "review"));
        new HashSet(Arrays.asList("native", "unity"));
        AudioAttributesCompatParcelizer = new HashMap();
        new JpegExtractor("PlayCoreVersion");
    }

    public static Map write() {
        Map map;
        synchronized (getKeyFrameTagPositions.class) {
            Map map2 = AudioAttributesCompatParcelizer;
            if (!map2.containsKey("app_update")) {
                HashMap map3 = new HashMap();
                map3.put("java", 11004);
                map2.put("app_update", map3);
            }
            map = (Map) map2.get("app_update");
        }
        return map;
    }
}
