package kotlin;

import android.os.Bundle;
import com.marrow.data.models.common.PresenterBundle;
import java.io.Serializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class BaseUrl {
    public static PresenterBundle write(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        PresenterBundle presenterBundle = new PresenterBundle();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj instanceof String) {
                presenterBundle.put(str, (String) obj);
            }
            if (obj instanceof Double) {
                presenterBundle.put(str, ((Double) obj).doubleValue());
            }
            if (obj instanceof Long) {
                presenterBundle.put(str, ((Long) obj).longValue());
            }
            if (obj instanceof Integer) {
                presenterBundle.put(str, ((Integer) obj).intValue());
            }
            if (obj instanceof Boolean) {
                presenterBundle.put(str, ((Boolean) obj).booleanValue());
            }
            if (obj instanceof Serializable) {
                presenterBundle.putSerializable(str, (Serializable) obj);
            }
        }
        return presenterBundle;
    }

    public static void IconCompatParcelizer(PresenterBundle presenterBundle, Bundle bundle) {
        HashMap<String, String> stringMap = presenterBundle.getStringMap();
        for (String str : stringMap.keySet()) {
            bundle.putString(str, stringMap.get(str));
        }
        HashMap<String, Integer> integerMap = presenterBundle.getIntegerMap();
        for (String str2 : integerMap.keySet()) {
            bundle.putInt(str2, integerMap.get(str2).intValue());
        }
        HashMap<String, Double> doubleMap = presenterBundle.getDoubleMap();
        for (String str3 : doubleMap.keySet()) {
            bundle.putDouble(str3, doubleMap.get(str3).doubleValue());
        }
        HashMap<String, Boolean> booleanMap = presenterBundle.getBooleanMap();
        for (String str4 : booleanMap.keySet()) {
            bundle.putBoolean(str4, booleanMap.get(str4).booleanValue());
        }
        HashMap<String, Long> longMap = presenterBundle.getLongMap();
        for (String str5 : longMap.keySet()) {
            bundle.putLong(str5, longMap.get(str5).longValue());
        }
        HashMap<String, PresenterBundle> bundleMap = presenterBundle.getBundleMap();
        for (String str6 : bundleMap.keySet()) {
            PresenterBundle presenterBundle2 = bundleMap.get(str6);
            Bundle bundle2 = new Bundle();
            IconCompatParcelizer(presenterBundle2, bundle2);
            bundle.putBundle(str6, bundle2);
        }
        HashMap<String, Serializable> serializableMap = presenterBundle.getSerializableMap();
        for (String str7 : serializableMap.keySet()) {
            bundle.putSerializable(str7, serializableMap.get(str7));
        }
    }
}
