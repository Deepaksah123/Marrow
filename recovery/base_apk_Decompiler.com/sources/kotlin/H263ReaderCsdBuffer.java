package kotlin;

import android.os.Bundle;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class H263ReaderCsdBuffer implements onData, nalUnitData {
    private H264Reader RemoteActionCompatParcelizer;

    @Override // kotlin.onData
    public final void IconCompatParcelizer(String str, Bundle bundle) {
        H264Reader h264Reader = this.RemoteActionCompatParcelizer;
        if (h264Reader != null) {
            try {
                StringBuilder sb = new StringBuilder("$A$:");
                sb.append(AudioAttributesCompatParcelizer(str, bundle));
                h264Reader.AudioAttributesCompatParcelizer(sb.toString());
            } catch (JSONException unused) {
                DvbSubtitleReader.read().read("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }

    @Override // kotlin.nalUnitData
    public final void RemoteActionCompatParcelizer(H264Reader h264Reader) {
        this.RemoteActionCompatParcelizer = h264Reader;
        DvbSubtitleReader.read().IconCompatParcelizer("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    private static String AudioAttributesCompatParcelizer(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }
}
