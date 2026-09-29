package kotlin;

import android.text.TextUtils;
import com.clevertap.android.sdk.displayunits.model.CleverTapDisplayUnit;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdasetPlayWhenReady1 {
    private HashMap<String, CleverTapDisplayUnit> read = new HashMap<>();

    public final void read() {
        synchronized (this) {
            this.read.clear();
            RendererWakeupListener.AudioAttributesImplApi21Parcelizer();
        }
    }

    public final ArrayList<CleverTapDisplayUnit> RemoteActionCompatParcelizer(JSONArray jSONArray) {
        synchronized (this) {
            read();
            if (jSONArray != null && jSONArray.length() > 0) {
                ArrayList<CleverTapDisplayUnit> arrayList = new ArrayList<>();
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        CleverTapDisplayUnit cleverTapDisplayUnitRemoteActionCompatParcelizer = CleverTapDisplayUnit.RemoteActionCompatParcelizer((JSONObject) jSONArray.get(i));
                        if (TextUtils.isEmpty(cleverTapDisplayUnitRemoteActionCompatParcelizer.read())) {
                            this.read.put(cleverTapDisplayUnitRemoteActionCompatParcelizer.write(), cleverTapDisplayUnitRemoteActionCompatParcelizer);
                            arrayList.add(cleverTapDisplayUnitRemoteActionCompatParcelizer);
                        } else {
                            RendererWakeupListener.AudioAttributesImplApi21Parcelizer();
                        }
                    } catch (Exception e) {
                        e.getLocalizedMessage();
                        RendererWakeupListener.AudioAttributesImplApi21Parcelizer();
                        return null;
                    }
                }
                return arrayList.isEmpty() ? null : arrayList;
            }
            RendererWakeupListener.AudioAttributesImplApi21Parcelizer();
            return null;
        }
    }
}
