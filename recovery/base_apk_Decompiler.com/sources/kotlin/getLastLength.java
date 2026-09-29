package kotlin;

import android.os.Bundle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class getLastLength {
    private static final Map write;

    static {
        new HashSet(Arrays.asList("native", "unity"));
        write = new HashMap();
        new getCurrentTrack("PlayCoreVersion");
    }

    private static Map IconCompatParcelizer() {
        Map map;
        synchronized (getLastLength.class) {
            map = write;
            map.put("java", 11004);
        }
        return map;
    }

    public static Bundle RemoteActionCompatParcelizer() {
        Bundle bundle = new Bundle();
        Map mapIconCompatParcelizer = IconCompatParcelizer();
        bundle.putInt("playcore_version_code", ((Integer) mapIconCompatParcelizer.get("java")).intValue());
        if (mapIconCompatParcelizer.containsKey("native")) {
            bundle.putInt("playcore_native_version", ((Integer) mapIconCompatParcelizer.get("native")).intValue());
        }
        if (mapIconCompatParcelizer.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", ((Integer) mapIconCompatParcelizer.get("unity")).intValue());
        }
        return bundle;
    }
}
