package kotlin;

import kotlin.C0177getRfBanners;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class buildAacLcAudioSpecificConfig {
    public static final Integer IconCompatParcelizer(String str, JSONObject jSONObject) {
        Object obj;
        try {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            obj = C0177getRfBanners.read(Integer.valueOf(jSONObject.getInt(str)));
        } catch (Throwable th) {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
            obj = C0177getRfBanners.read(SdkPayloadData.write(th));
        }
        if (C0177getRfBanners.RemoteActionCompatParcelizer(obj)) {
            obj = null;
        }
        return (Integer) obj;
    }

    public static final Boolean RemoteActionCompatParcelizer(String str, JSONObject jSONObject) {
        Object obj;
        try {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            obj = C0177getRfBanners.read(Boolean.valueOf(jSONObject.getBoolean(str)));
        } catch (Throwable th) {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
            obj = C0177getRfBanners.read(SdkPayloadData.write(th));
        }
        if (C0177getRfBanners.RemoteActionCompatParcelizer(obj)) {
            obj = null;
        }
        return (Boolean) obj;
    }

    public static final Long read(String str, JSONObject jSONObject) {
        Object obj;
        try {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            obj = C0177getRfBanners.read(Long.valueOf(jSONObject.getLong(str)));
        } catch (Throwable th) {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
            obj = C0177getRfBanners.read(SdkPayloadData.write(th));
        }
        if (C0177getRfBanners.RemoteActionCompatParcelizer(obj)) {
            obj = null;
        }
        return (Long) obj;
    }

    public static final String write(String str, JSONObject jSONObject) {
        Object obj;
        try {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer;
            Object obj2 = jSONObject.get(str);
            obj = C0177getRfBanners.read(obj2 instanceof String ? (String) obj2 : null);
        } catch (Throwable th) {
            C0177getRfBanners.IconCompatParcelizer iconCompatParcelizer2 = C0177getRfBanners.IconCompatParcelizer;
            obj = C0177getRfBanners.read(SdkPayloadData.write(th));
        }
        return (String) (C0177getRfBanners.RemoteActionCompatParcelizer(obj) ? null : obj);
    }
}
