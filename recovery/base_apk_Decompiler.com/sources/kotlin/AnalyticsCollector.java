package kotlin;

import android.location.Location;
import android.os.Bundle;
import android.text.TextUtils;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class AnalyticsCollector {
    public static JSONObject IconCompatParcelizer(String str, PlaylistTimeline1 playlistTimeline1, String str2) {
        JSONObject jSONObject;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (Throwable th) {
                StringBuilder sb = new StringBuilder("Error reading guid cache: ");
                sb.append(th.toString());
                playlistTimeline1.write(str2, sb.toString());
                jSONObject = null;
            }
        } else {
            jSONObject = null;
        }
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    public static JSONObject write(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String string = bundle.getString("wzrk_adunit");
        RendererWakeupListener.MediaMetadataCompat();
        JSONArray jSONArray = new JSONArray();
        jSONObject.put("adUnit_notifs", jSONArray);
        jSONArray.put(new JSONObject(string));
        return jSONObject;
    }

    public static JSONObject write(getChildTimelines getchildtimelines, copyWithPlaceholderTimeline copywithplaceholdertimeline, boolean z, boolean z2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Location locationOnAddQueueItem = copywithplaceholdertimeline.onAddQueueItem();
        StringBuilder sb = new StringBuilder();
        sb.append(getchildtimelines.read());
        jSONObject.put("Build", sb.toString());
        jSONObject.put("Version", getchildtimelines.onPause());
        jSONObject.put("OS Version", getchildtimelines.onCommand());
        jSONObject.put("SDK Version", getchildtimelines.onMediaButtonEvent());
        if (locationOnAddQueueItem != null) {
            jSONObject.put("Latitude", locationOnAddQueueItem.getLatitude());
            jSONObject.put("Longitude", locationOnAddQueueItem.getLongitude());
        }
        if (getchildtimelines.RatingCompat() != null) {
            jSONObject.put(z2 ? "mt_GoogleAdID" : "GoogleAdID", getchildtimelines.RatingCompat());
            jSONObject.put("GoogleAdIDLimit", getchildtimelines.onPlayFromUri());
        }
        try {
            jSONObject.put("Make", getchildtimelines.onCustomAction());
            jSONObject.put("Model", getchildtimelines.handleMediaPlayPauseIfPendingOnHandler());
            jSONObject.put("Carrier", getchildtimelines.AudioAttributesImplBaseParcelizer());
            jSONObject.put("useIP", z);
            jSONObject.put("OS", getchildtimelines.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
            jSONObject.put("wdt", getchildtimelines.onFastForward());
            jSONObject.put("hgt", getchildtimelines.MediaBrowserCompatMediaItem());
            jSONObject.put("dpi", getchildtimelines.AudioAttributesImplApi21Parcelizer());
            jSONObject.put("dt", getChildTimelines.AudioAttributesCompatParcelizer(getchildtimelines.MediaBrowserCompatItemReceiver()));
            jSONObject.put("locale", getchildtimelines.MediaDescriptionCompat());
            jSONObject.put("abckt", getchildtimelines.AudioAttributesCompatParcelizer());
            if (getchildtimelines.MediaBrowserCompatSearchResultReceiver() != null) {
                jSONObject.put("lib", getchildtimelines.MediaBrowserCompatSearchResultReceiver());
            }
            RendererState.IconCompatParcelizer(getchildtimelines.MediaBrowserCompatItemReceiver());
            String strMediaBrowserCompatMediaItem = RendererState.MediaBrowserCompatMediaItem();
            if (!TextUtils.isEmpty(strMediaBrowserCompatMediaItem)) {
                jSONObject.put("proxyDomain", strMediaBrowserCompatMediaItem);
            }
            RendererState.IconCompatParcelizer(getchildtimelines.MediaBrowserCompatItemReceiver());
            String strHandleMediaPlayPauseIfPendingOnHandler = RendererState.handleMediaPlayPauseIfPendingOnHandler();
            if (!TextUtils.isEmpty(strHandleMediaPlayPauseIfPendingOnHandler)) {
                jSONObject.put("spikyProxyDomain", strHandleMediaPlayPauseIfPendingOnHandler);
            }
            if (RendererState.IconCompatParcelizer(getchildtimelines.MediaBrowserCompatItemReceiver()).onFastForward()) {
                jSONObject.put("sslpin", true);
            }
            if (!TextUtils.isEmpty(RendererState.IconCompatParcelizer(getchildtimelines.MediaBrowserCompatItemReceiver()).MediaBrowserCompatCustomActionResultReceiver())) {
                jSONObject.put("fcmsid", true);
            }
            String strAudioAttributesImplApi26Parcelizer = getchildtimelines.AudioAttributesImplApi26Parcelizer();
            if (strAudioAttributesImplApi26Parcelizer != null && !strAudioAttributesImplApi26Parcelizer.equals("")) {
                jSONObject.put("cc", strAudioAttributesImplApi26Parcelizer);
            }
            if (z) {
                Boolean boolOnPrepareFromSearch = getchildtimelines.onPrepareFromSearch();
                if (boolOnPrepareFromSearch != null) {
                    jSONObject.put("wifi", boolOnPrepareFromSearch);
                }
                Boolean boolOnPlayFromSearch = getchildtimelines.onPlayFromSearch();
                if (boolOnPlayFromSearch != null) {
                    jSONObject.put("BluetoothEnabled", boolOnPlayFromSearch);
                }
                String strRemoteActionCompatParcelizer = getchildtimelines.RemoteActionCompatParcelizer();
                if (strRemoteActionCompatParcelizer != null) {
                    jSONObject.put("BluetoothVersion", strRemoteActionCompatParcelizer);
                }
                String strOnAddQueueItem = getchildtimelines.onAddQueueItem();
                if (strOnAddQueueItem != null) {
                    jSONObject.put("Radio", strOnAddQueueItem);
                }
            }
            jSONObject.put("LIAMC", getchildtimelines.MediaMetadataCompat());
            for (Map.Entry<String, Integer> entry : copywithplaceholdertimeline.MediaMetadataCompat().entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public static JSONObject AudioAttributesCompatParcelizer(generateMediaPeriodEventTime generatemediaperiodeventtime) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("c", generatemediaperiodeventtime.write());
            jSONObject.put("d", generatemediaperiodeventtime.RemoteActionCompatParcelizer());
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static JSONArray IconCompatParcelizer(String[] strArr) {
        JSONArray jSONArray = new JSONArray();
        for (String str : strArr) {
            RendererWakeupListener.MediaMetadataCompat();
            jSONArray.put(str);
        }
        return jSONArray;
    }

    public static JSONObject AudioAttributesCompatParcelizer(CTInAppNotification cTInAppNotification) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObjectOnCustomAction = cTInAppNotification.onCustomAction();
        Iterator<String> itKeys = jSONObjectOnCustomAction.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (next.startsWith("wzrk_")) {
                jSONObject.put(next, jSONObjectOnCustomAction.get(next));
            }
        }
        return jSONObject;
    }

    public static JSONObject IconCompatParcelizer(CTInboxMessage cTInboxMessage) {
        return cTInboxMessage.MediaBrowserCompatItemReceiver();
    }

    public static <T> Object[] read(JSONArray jSONArray) {
        Object[] objArr = new Object[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                objArr[i] = jSONArray.get(i);
            } catch (JSONException e) {
                e.printStackTrace();
                return objArr;
            }
        }
        return objArr;
    }

    public static String IconCompatParcelizer(Object obj) {
        try {
            return obj.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public static ArrayList<?> AudioAttributesCompatParcelizer(JSONArray jSONArray) {
        ArrayList<?> arrayList = new ArrayList<>();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(jSONArray.get(i));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return arrayList;
    }
}
