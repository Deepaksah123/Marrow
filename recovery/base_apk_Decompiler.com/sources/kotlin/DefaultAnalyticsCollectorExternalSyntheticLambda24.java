package kotlin;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class DefaultAnalyticsCollectorExternalSyntheticLambda24 {
    private static SharedPreferences IconCompatParcelizer;
    private static final Set<String> RemoteActionCompatParcelizer = new CopyOnWriteArraySet();
    private static final Map<String, Long> read = new ConcurrentHashMap();

    private static void AudioAttributesCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda24.class)) {
            return;
        }
        try {
            SharedPreferences sharedPreferences = lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer().getSharedPreferences("com.facebook.internal.SKU_DETAILS", 0);
            SharedPreferences sharedPreferences2 = lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer().getSharedPreferences("com.facebook.internal.PURCHASE", 0);
            if (sharedPreferences.contains("LAST_CLEARED_TIME")) {
                sharedPreferences.edit().clear().apply();
                sharedPreferences2.edit().clear().apply();
            }
            SharedPreferences sharedPreferences3 = lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer().getSharedPreferences("com.facebook.internal.iap.PRODUCT_DETAILS", 0);
            IconCompatParcelizer = sharedPreferences3;
            Set<String> set = RemoteActionCompatParcelizer;
            set.addAll(sharedPreferences3.getStringSet("PURCHASE_DETAILS_SET", new HashSet()));
            Iterator<String> it = set.iterator();
            while (it.hasNext()) {
                String[] strArrSplit = it.next().split(";", 2);
                read.put(strArrSplit[0], Long.valueOf(Long.parseLong(strArrSplit[1])));
            }
            IconCompatParcelizer();
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda24.class);
        }
    }

    public static void write(Map<String, JSONObject> map, Map<String, JSONObject> map2) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda24.class)) {
            return;
        }
        try {
            AudioAttributesCompatParcelizer();
            IconCompatParcelizer(new HashMap(read(RemoteActionCompatParcelizer(map), map2)));
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda24.class);
        }
    }

    private static void IconCompatParcelizer(Map<String, String> map) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda24.class)) {
            return;
        }
        try {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key != null && value != null) {
                    DefaultAnalyticsCollectorExternalSyntheticLambda31.read(key, value, false);
                }
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda24.class);
        }
    }

    private static Map<String, JSONObject> RemoteActionCompatParcelizer(Map<String, JSONObject> map) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda24.class)) {
            return null;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            for (Map.Entry entry : new HashMap(map).entrySet()) {
                try {
                    JSONObject jSONObject = (JSONObject) entry.getValue();
                    if (jSONObject.has("purchaseToken")) {
                        String string = jSONObject.getString("purchaseToken");
                        if (read.containsKey(string)) {
                            map.remove(entry.getKey());
                        } else {
                            Set<String> set = RemoteActionCompatParcelizer;
                            StringBuilder sb = new StringBuilder();
                            sb.append(string);
                            sb.append(';');
                            sb.append(jCurrentTimeMillis);
                            set.add(sb.toString());
                        }
                    }
                } catch (Exception unused) {
                }
            }
            IconCompatParcelizer.edit().putStringSet("PURCHASE_DETAILS_SET", RemoteActionCompatParcelizer).apply();
            return new HashMap(map);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda24.class);
            return null;
        }
    }

    private static void IconCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda24.class)) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            long j = IconCompatParcelizer.getLong("LAST_CLEARED_TIME", 0L);
            if (j == 0) {
                IconCompatParcelizer.edit().putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
                return;
            }
            if (jCurrentTimeMillis - j > 604800) {
                for (Map.Entry entry : new HashMap(read).entrySet()) {
                    String str = (String) entry.getKey();
                    Long l = (Long) entry.getValue();
                    if (jCurrentTimeMillis - l.longValue() > 86400) {
                        Set<String> set = RemoteActionCompatParcelizer;
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        sb.append(";");
                        sb.append(l);
                        set.remove(sb.toString());
                        read.remove(str);
                    }
                }
                IconCompatParcelizer.edit().putStringSet("PURCHASE_DETAILS_SET", RemoteActionCompatParcelizer).putLong("LAST_CLEARED_TIME", jCurrentTimeMillis).apply();
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda24.class);
        }
    }

    public static boolean read() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda24.class)) {
            return false;
        }
        try {
            AudioAttributesCompatParcelizer();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            long j = IconCompatParcelizer.getLong("LAST_QUERY_PURCHASE_HISTORY_TIME", 0L);
            if (j != 0 && jCurrentTimeMillis - j < 86400) {
                return false;
            }
            IconCompatParcelizer.edit().putLong("LAST_QUERY_PURCHASE_HISTORY_TIME", jCurrentTimeMillis).apply();
            return true;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda24.class);
            return false;
        }
    }

    private static Map<String, String> read(Map<String, JSONObject> map, Map<String, JSONObject> map2) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda24.class)) {
            return null;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            HashMap map3 = new HashMap();
            for (Map.Entry<String, JSONObject> entry : map.entrySet()) {
                JSONObject jSONObject = map2.get(entry.getKey());
                JSONObject value = entry.getValue();
                if (value != null && value.has("purchaseTime")) {
                    try {
                        if (jCurrentTimeMillis - (value.getLong("purchaseTime") / 1000) <= 86400 && jSONObject != null) {
                            map3.put(value.toString(), jSONObject.toString());
                        }
                    } catch (Exception unused) {
                    }
                }
            }
            return map3;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda24.class);
            return null;
        }
    }
}
