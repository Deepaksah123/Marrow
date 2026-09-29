package kotlin;

import android.util.Pair;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.drm.WidevineUtil;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class UnwrappingBeanSerializer {
    public static Pair<Long, Long> IconCompatParcelizer(PropertySerializerMapDouble propertySerializerMapDouble) {
        Map<String, String> mapMediaBrowserCompatItemReceiver = propertySerializerMapDouble.MediaBrowserCompatItemReceiver();
        if (mapMediaBrowserCompatItemReceiver == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(AudioAttributesCompatParcelizer(mapMediaBrowserCompatItemReceiver, WidevineUtil.PROPERTY_LICENSE_DURATION_REMAINING)), Long.valueOf(AudioAttributesCompatParcelizer(mapMediaBrowserCompatItemReceiver, WidevineUtil.PROPERTY_PLAYBACK_DURATION_REMAINING)));
    }

    private static long AudioAttributesCompatParcelizer(Map<String, String> map, String str) {
        if (map == null) {
            return C.TIME_UNSET;
        }
        try {
            String str2 = map.get(str);
            return str2 != null ? Long.parseLong(str2) : C.TIME_UNSET;
        } catch (NumberFormatException unused) {
            return C.TIME_UNSET;
        }
    }
}
