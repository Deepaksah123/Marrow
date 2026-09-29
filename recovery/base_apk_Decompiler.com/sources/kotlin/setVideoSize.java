package kotlin;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class setVideoSize {
    private final String IconCompatParcelizer;
    private final RendererWakeupListener RemoteActionCompatParcelizer;
    private final getChildTimelines read;

    public setVideoSize(String str, RendererWakeupListener rendererWakeupListener, getChildTimelines getchildtimelines) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(rendererWakeupListener, "");
        toMagicModuleMetaRepoModel.write(getchildtimelines, "");
        this.IconCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = rendererWakeupListener;
        this.read = getchildtimelines;
    }

    private final String write() {
        String str = this.IconCompatParcelizer;
        if (str == null) {
            return null;
        }
        RendererWakeupListener rendererWakeupListener = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("New ARP Key = ARP:");
        sb.append(str);
        sb.append(':');
        sb.append(this.read.MediaBrowserCompatCustomActionResultReceiver());
        rendererWakeupListener.write(str, sb.toString());
        StringBuilder sb2 = new StringBuilder("ARP:");
        sb2.append(str);
        sb2.append(':');
        sb2.append(this.read.MediaBrowserCompatCustomActionResultReceiver());
        return sb2.toString();
    }

    private final String RemoteActionCompatParcelizer() {
        String str = this.IconCompatParcelizer;
        if (str == null) {
            return null;
        }
        this.RemoteActionCompatParcelizer.write(str, "Old ARP Key = ARP:".concat(String.valueOf(str)));
        return "ARP:".concat(String.valueOf(str));
    }

    public final JSONObject AudioAttributesCompatParcelizer(Context context) {
        SharedPreferences sharedPreferencesRemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(context, "");
        try {
            String strWrite = write();
            if (strWrite == null) {
                return null;
            }
            Map<String, ?> all = RendererCapabilitiesFormatSupport.IconCompatParcelizer(context, strWrite).getAll();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(all, "");
            if (!all.isEmpty()) {
                sharedPreferencesRemoteActionCompatParcelizer = RendererCapabilitiesFormatSupport.IconCompatParcelizer(context, strWrite);
            } else {
                sharedPreferencesRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(context, strWrite, RemoteActionCompatParcelizer());
            }
            Map<String, ?> all2 = sharedPreferencesRemoteActionCompatParcelizer.getAll();
            Iterator<Map.Entry<String, ?>> it = all2.entrySet().iterator();
            while (it.hasNext()) {
                Object value = it.next().getValue();
                toMagicModuleMetaRepoModel.write(value);
                if ((value instanceof Number) && ((Number) value).intValue() == -1) {
                    it.remove();
                }
            }
            JSONObject jSONObject = new JSONObject(all2);
            RendererWakeupListener rendererWakeupListener = this.RemoteActionCompatParcelizer;
            String str = this.IconCompatParcelizer;
            StringBuilder sb = new StringBuilder();
            sb.append("Fetched ARP for namespace key: ");
            sb.append(strWrite);
            sb.append(" values: ");
            sb.append(all2);
            rendererWakeupListener.write(str, sb.toString());
            return jSONObject;
        } catch (Exception e) {
            this.RemoteActionCompatParcelizer.IconCompatParcelizer();
            return null;
        }
    }

    public final void IconCompatParcelizer(Context context, JSONObject jSONObject) {
        String strWrite;
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(jSONObject, "");
        if (jSONObject.length() == 0 || (strWrite = write()) == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = RendererCapabilitiesFormatSupport.IconCompatParcelizer(context, strWrite).edit();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                Object obj = jSONObject.get(next);
                if (obj instanceof Number) {
                    editorEdit.putInt(next, ((Number) obj).intValue());
                } else if (obj instanceof String) {
                    if (((String) obj).length() < 100) {
                        editorEdit.putString(next, (String) obj);
                    } else {
                        RendererWakeupListener rendererWakeupListener = this.RemoteActionCompatParcelizer;
                        String str = this.IconCompatParcelizer;
                        StringBuilder sb = new StringBuilder();
                        sb.append("ARP update for key ");
                        sb.append(next);
                        sb.append(" rejected (string value too long)");
                        rendererWakeupListener.write(str, sb.toString());
                        getShowPopup getshowpopup = getShowPopup.INSTANCE;
                    }
                } else if (obj instanceof Boolean) {
                    editorEdit.putBoolean(next, ((Boolean) obj).booleanValue());
                } else {
                    RendererWakeupListener rendererWakeupListener2 = this.RemoteActionCompatParcelizer;
                    String str2 = this.IconCompatParcelizer;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("ARP update for key ");
                    sb2.append(next);
                    sb2.append(" rejected (invalid data type)");
                    rendererWakeupListener2.write(str2, sb2.toString());
                    getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
                }
            } catch (Exception unused) {
            }
        }
        RendererWakeupListener rendererWakeupListener3 = this.RemoteActionCompatParcelizer;
        String str3 = this.IconCompatParcelizer;
        StringBuilder sb3 = new StringBuilder("Stored ARP for namespace key: ");
        sb3.append(strWrite);
        sb3.append(" values: ");
        sb3.append(jSONObject);
        rendererWakeupListener3.write(str3, sb3.toString());
        RendererCapabilitiesFormatSupport.write(editorEdit);
    }

    private final SharedPreferences RemoteActionCompatParcelizer(Context context, String str, String str2) {
        SharedPreferences sharedPreferencesIconCompatParcelizer = RendererCapabilitiesFormatSupport.IconCompatParcelizer(context, str2);
        SharedPreferences sharedPreferencesIconCompatParcelizer2 = RendererCapabilitiesFormatSupport.IconCompatParcelizer(context, str);
        SharedPreferences.Editor editorEdit = sharedPreferencesIconCompatParcelizer2.edit();
        Map<String, ?> all = sharedPreferencesIconCompatParcelizer.getAll();
        toMagicModuleMetaRepoModel.write(all);
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            toMagicModuleMetaRepoModel.write(value);
            if (value instanceof Number) {
                editorEdit.putInt(key, ((Number) value).intValue());
            } else if (value instanceof String) {
                String str3 = (String) value;
                if (str3.length() < 100) {
                    editorEdit.putString(key, str3);
                } else {
                    RendererWakeupListener rendererWakeupListener = this.RemoteActionCompatParcelizer;
                    String str4 = this.IconCompatParcelizer;
                    StringBuilder sb = new StringBuilder("ARP update for key ");
                    sb.append(key);
                    sb.append(" rejected (string value too long)");
                    rendererWakeupListener.write(str4, sb.toString());
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                }
            } else if (value instanceof Boolean) {
                editorEdit.putBoolean(key, ((Boolean) value).booleanValue());
            } else {
                RendererWakeupListener rendererWakeupListener2 = this.RemoteActionCompatParcelizer;
                String str5 = this.IconCompatParcelizer;
                StringBuilder sb2 = new StringBuilder("ARP update for key ");
                sb2.append(key);
                sb2.append(" rejected (invalid data type)");
                rendererWakeupListener2.write(str5, sb2.toString());
                getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
            }
        }
        this.RemoteActionCompatParcelizer.write(this.IconCompatParcelizer, "Completed ARP update for namespace key: ".concat(String.valueOf(str)));
        RendererCapabilitiesFormatSupport.write(editorEdit);
        toMagicModuleMetaRepoModel.write(sharedPreferencesIconCompatParcelizer);
        SharedPreferences.Editor editorEdit2 = sharedPreferencesIconCompatParcelizer.edit();
        editorEdit2.clear();
        editorEdit2.apply();
        toMagicModuleMetaRepoModel.write(sharedPreferencesIconCompatParcelizer2);
        return sharedPreferencesIconCompatParcelizer2;
    }
}
