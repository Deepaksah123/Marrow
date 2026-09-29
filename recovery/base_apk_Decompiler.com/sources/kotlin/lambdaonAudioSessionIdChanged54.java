package kotlin;

import android.text.Editable;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdaonAudioSessionIdChanged54 {
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> T write(Object obj) {
        return obj;
    }

    public static Map<String, Object> AudioAttributesCompatParcelizer(String str) {
        if (str == null) {
            return null;
        }
        try {
            return IconCompatParcelizer(new JSONObject(str));
        } catch (JSONException unused) {
            RendererWakeupListener.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            return null;
        }
    }

    public static JSONArray IconCompatParcelizer(Iterable<?> iterable) throws JSONException {
        if (iterable == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (Object objIconCompatParcelizer : iterable) {
            if (objIconCompatParcelizer instanceof Map) {
                objIconCompatParcelizer = write((Map<String, ?>) write(objIconCompatParcelizer));
            } else if (objIconCompatParcelizer instanceof Iterable) {
                objIconCompatParcelizer = IconCompatParcelizer((Iterable<?>) objIconCompatParcelizer);
            } else if (objIconCompatParcelizer == null) {
                objIconCompatParcelizer = JSONObject.NULL;
            }
            jSONArray.put(objIconCompatParcelizer);
        }
        return jSONArray;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> java.util.Map<java.lang.String, T> IconCompatParcelizer(org.json.JSONObject r6) {
        /*
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Iterator r2 = r6.keys()
        Ld:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L4a
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r6.opt(r3)
            if (r4 == 0) goto L41
            java.lang.Object r5 = org.json.JSONObject.NULL
            if (r4 == r5) goto L41
            boolean r5 = r4 instanceof org.json.JSONObject
            if (r5 == 0) goto L2e
            org.json.JSONObject r4 = (org.json.JSONObject) r4
            java.util.Map r4 = IconCompatParcelizer(r4)
            goto L42
        L2e:
            boolean r5 = r4 instanceof org.json.JSONArray
            if (r5 == 0) goto L39
            org.json.JSONArray r4 = (org.json.JSONArray) r4
            java.util.List r4 = IconCompatParcelizer(r4)
            goto L42
        L39:
            java.lang.Object r5 = org.json.JSONObject.NULL
            boolean r5 = r5.equals(r4)
            if (r5 == 0) goto L42
        L41:
            r4 = r0
        L42:
            java.lang.Object r4 = write(r4)
            r1.put(r3, r4)
            goto Ld
        L4a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.lambdaonAudioSessionIdChanged54.IconCompatParcelizer(org.json.JSONObject):java.util.Map");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> java.util.List<T> IconCompatParcelizer(org.json.JSONArray r5) {
        /*
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r5.length()
            r1.<init>(r2)
            r2 = 0
        Le:
            int r3 = r5.length()
            if (r2 >= r3) goto L43
            java.lang.Object r3 = r5.opt(r2)
            if (r3 == 0) goto L3c
            java.lang.Object r4 = org.json.JSONObject.NULL
            if (r3 == r4) goto L3c
            boolean r4 = r3 instanceof org.json.JSONObject
            if (r4 == 0) goto L29
            org.json.JSONObject r3 = (org.json.JSONObject) r3
            java.util.Map r3 = IconCompatParcelizer(r3)
            goto L3d
        L29:
            boolean r4 = r3 instanceof org.json.JSONArray
            if (r4 == 0) goto L34
            org.json.JSONArray r3 = (org.json.JSONArray) r3
            java.util.List r3 = IconCompatParcelizer(r3)
            goto L3d
        L34:
            java.lang.Object r4 = org.json.JSONObject.NULL
            boolean r4 = r4.equals(r3)
            if (r4 == 0) goto L3d
        L3c:
            r3 = r0
        L3d:
            r1.add(r3)
            int r2 = r2 + 1
            goto Le
        L43:
            java.lang.Object r5 = write(r1)
            java.util.List r5 = (java.util.List) r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.lambdaonAudioSessionIdChanged54.IconCompatParcelizer(org.json.JSONArray):java.util.List");
    }

    private static JSONObject write(Map<String, ?> map) throws JSONException {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof Map) {
                value = write((Map<String, ?>) write(value));
            } else if (value instanceof Iterable) {
                value = IconCompatParcelizer((Iterable<?>) value);
            } else if (value instanceof Editable) {
                value = value.toString();
            } else if (value == null) {
                value = JSONObject.NULL;
            }
            jSONObject.put(key, value);
        }
        return jSONObject;
    }

    public static String read(Map<String, ?> map) {
        if (map == null) {
            return null;
        }
        try {
            return write(map).toString();
        } catch (JSONException unused) {
            Objects.toString(map);
            RendererWakeupListener.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            return null;
        }
    }
}
