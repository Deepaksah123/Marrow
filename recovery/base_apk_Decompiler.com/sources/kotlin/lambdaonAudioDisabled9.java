package kotlin;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdaonAudioDisabled9 {
    public static Map<String, Object> IconCompatParcelizer(Map<String, Object> map) {
        HashMap map2 = new HashMap();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key.contains(".")) {
                String[] strArrIconCompatParcelizer = IconCompatParcelizer(key);
                int length = strArrIconCompatParcelizer.length;
                Map map3 = map2;
                for (int i = 0; i < strArrIconCompatParcelizer.length; i++) {
                    String str = strArrIconCompatParcelizer[i];
                    if (i == length - 1) {
                        map3.put(str, entry.getValue());
                    } else if (!(map3.get(str) instanceof Map)) {
                        HashMap map4 = new HashMap();
                        map3.put(str, map4);
                        map3 = map4;
                    } else {
                        map3 = (Map) lambdaonAudioSessionIdChanged54.write(map3.get(str));
                    }
                }
            } else {
                map2.put(entry.getKey(), entry.getValue());
            }
        }
        return map2;
    }

    public static Object IconCompatParcelizer(Object obj, Object obj2) {
        if (obj2 == null) {
            return obj;
        }
        if ((obj2 instanceof Number) || (obj2 instanceof Boolean) || (obj2 instanceof String) || (obj2 instanceof Character) || (obj instanceof Number) || (obj instanceof Boolean) || (obj instanceof String) || (obj instanceof Character)) {
            return obj2;
        }
        boolean z = obj2 instanceof Map;
        Iterable iterableKeySet = z ? ((Map) obj2).keySet() : (Iterable) obj2;
        boolean z2 = obj instanceof Map;
        Iterable iterableKeySet2 = z2 ? ((Map) obj).keySet() : (Iterable) obj;
        Map map = z ? (Map) obj2 : null;
        Map map2 = z2 ? (Map) obj : null;
        if (!z2 && !z) {
            return null;
        }
        HashMap map3 = new HashMap();
        if (iterableKeySet2 != null) {
            for (Object obj3 : iterableKeySet2) {
                if (map != null && map2 != null) {
                    Object obj4 = map.get(obj3);
                    Object obj5 = map2.get(obj3);
                    if (obj4 == null && obj5 != null) {
                        map3.put(obj3, obj5);
                    }
                }
            }
        }
        for (Object obj6 : iterableKeySet) {
            map3.put(obj6, IconCompatParcelizer(map2 != null ? map2.get(obj6) : null, map != null ? map.get(obj6) : null));
        }
        return map3;
    }

    private static String[] IconCompatParcelizer(String str) {
        try {
            return str.split("\\.");
        } catch (Throwable th) {
            th.printStackTrace();
            return new String[0];
        }
    }
}
