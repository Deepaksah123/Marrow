package kotlin;

import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdasetTrackSelectionParameters14 {
    private final CleverTapInstanceConfig AudioAttributesCompatParcelizer;
    private final copyWithPlaceholderTimeline IconCompatParcelizer;
    private final RendererCapabilitiesCapabilities RemoteActionCompatParcelizer;
    private final getMutedFromManager read;
    private final r8lambda3EoLwxJB4A25pAog2xOLUUC2nk write;

    public lambdasetTrackSelectionParameters14(CleverTapInstanceConfig cleverTapInstanceConfig, copyWithPlaceholderTimeline copywithplaceholdertimeline, r8lambda3EoLwxJB4A25pAog2xOLUUC2nk r8lambda3eolwxjb4a25paog2xoluuc2nk, RendererCapabilitiesCapabilities rendererCapabilitiesCapabilities, getMutedFromManager getmutedfrommanager) {
        this.AudioAttributesCompatParcelizer = cleverTapInstanceConfig;
        this.write = r8lambda3eolwxjb4a25paog2xoluuc2nk;
        this.read = getmutedfrommanager;
        this.RemoteActionCompatParcelizer = rendererCapabilitiesCapabilities;
        this.IconCompatParcelizer = copywithplaceholdertimeline;
    }

    public final boolean AudioAttributesCompatParcelizer(JSONObject jSONObject, int i) {
        if (i == 8 || this.AudioAttributesCompatParcelizer.MediaDescriptionCompat()) {
            return false;
        }
        if (jSONObject.has("evtName")) {
            try {
                if (Arrays.asList(getTimelines.IconCompatParcelizer).contains(jSONObject.getString("evtName"))) {
                    return false;
                }
            } catch (JSONException unused) {
            }
        }
        return i == 4 && !this.IconCompatParcelizer.onPrepareFromSearch();
    }

    public final boolean RemoteActionCompatParcelizer(JSONObject jSONObject, int i) {
        if (i == 7 || i == 8) {
            return false;
        }
        if (this.read.AudioAttributesImplApi21Parcelizer()) {
            RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver();
            String strWrite = this.AudioAttributesCompatParcelizer.write();
            StringBuilder sb = new StringBuilder("CleverTap is muted, dropping event - ");
            sb.append(jSONObject.toString());
            rendererWakeupListenerMediaBrowserCompatItemReceiver.write(strWrite, sb.toString());
            return true;
        }
        if (!this.IconCompatParcelizer.onPlayFromUri()) {
            return false;
        }
        if (!this.IconCompatParcelizer.onCommand()) {
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver().IconCompatParcelizer(this.AudioAttributesCompatParcelizer.write(), "Current user is opted out dropping event: ".concat(String.valueOf(jSONObject)));
            return true;
        }
        if (i != 4 && i != 6) {
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver().IconCompatParcelizer(this.AudioAttributesCompatParcelizer.write(), "This is not RAISED_EVENT or NV_EVENT, not dropping event: ".concat(String.valueOf(jSONObject)));
            return false;
        }
        boolean zContains = Arrays.asList(lambdaonAudioDecoderInitialized4.RemoteActionCompatParcelizer).contains(jSONObject != null ? AudioAttributesCompatParcelizer(jSONObject) : null);
        boolean z = !zContains;
        if (!zContains) {
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver().IconCompatParcelizer(this.AudioAttributesCompatParcelizer.write(), "Current user is opted out dropping event: ".concat(String.valueOf(jSONObject)));
            return z;
        }
        this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver().IconCompatParcelizer(this.AudioAttributesCompatParcelizer.write(), "This is a system event, not dropping event: ".concat(String.valueOf(jSONObject)));
        return z;
    }

    public static boolean AudioAttributesImplApi21Parcelizer(JSONObject jSONObject) {
        try {
            if (jSONObject.has("evtName")) {
                return jSONObject.getString("evtName").equals("App Launched");
            }
            return false;
        } catch (JSONException unused) {
            return false;
        }
    }

    public static boolean MediaBrowserCompatCustomActionResultReceiver(JSONObject jSONObject) {
        return jSONObject.has("evtName");
    }

    public static String AudioAttributesCompatParcelizer(JSONObject jSONObject) {
        try {
            return jSONObject.getString("evtName");
        } catch (JSONException unused) {
            return null;
        }
    }

    public static Map<String, Object> read(JSONObject jSONObject) {
        if (jSONObject.has("evtName") && jSONObject.has("evtData")) {
            try {
                return lambdaonAudioSessionIdChanged54.IconCompatParcelizer(jSONObject.getJSONObject("evtData"));
            } catch (JSONException e) {
                e.getMessage();
                RendererWakeupListener.MediaMetadataCompat();
            }
        }
        return new HashMap();
    }

    public static boolean MediaBrowserCompatItemReceiver(JSONObject jSONObject) {
        try {
            if (jSONObject.has("evtName")) {
                return jSONObject.getString("evtName").equals("Charged");
            }
            return false;
        } catch (JSONException unused) {
            return false;
        }
    }

    public static List<Map<String, Object>> write(JSONObject jSONObject) {
        try {
            return lambdaonAudioSessionIdChanged54.IconCompatParcelizer(jSONObject.getJSONObject("evtData").getJSONArray("Items"));
        } catch (JSONException unused) {
            return new ArrayList();
        }
    }

    public static Map<String, Object> IconCompatParcelizer(JSONObject jSONObject) {
        try {
            Object objRemove = jSONObject.getJSONObject("evtData").remove("Items");
            Map<String, Object> mapIconCompatParcelizer = lambdaonAudioSessionIdChanged54.IconCompatParcelizer(jSONObject.getJSONObject("evtData"));
            jSONObject.getJSONObject("evtData").put("Items", objRemove);
            return mapIconCompatParcelizer;
        } catch (JSONException unused) {
            return new HashMap();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0090  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> RemoteActionCompatParcelizer(org.json.JSONObject r15) {
        /*
            Method dump skipped, instruction units count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.lambdasetTrackSelectionParameters14.RemoteActionCompatParcelizer(org.json.JSONObject):java.util.Map");
    }
}
