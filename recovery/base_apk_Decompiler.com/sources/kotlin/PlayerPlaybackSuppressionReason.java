package kotlin;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.WindowInsetsCompat;
import java.util.Iterator;
import java.util.concurrent.Callable;
import kotlin.RendererCapabilitiesAdaptiveSupport;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class PlayerPlaybackSuppressionReason {
    public static final boolean write(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        return Build.VERSION.SDK_INT > 26 && read(context) > 26;
    }

    private static int read(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        return context.getApplicationContext().getApplicationInfo().targetSdkVersion;
    }

    public static final boolean read(Context context, String str) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(str, "");
        if (!AudioAttributesCompatParcelizer(context)) {
            return false;
        }
        try {
            Object systemService = context.getSystemService("notification");
            toMagicModuleMetaRepoModel.read(systemService, "");
            return ((NotificationManager) systemService).getNotificationChannel(str).getImportance() != 0;
        } catch (Exception unused) {
            RendererWakeupListener.MediaBrowserCompatItemReceiver();
            return false;
        }
    }

    public static final boolean AudioAttributesCompatParcelizer(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        try {
            return _deserializeFromEmpty.write(context).read();
        } catch (Exception e) {
            RendererWakeupListener.MediaBrowserCompatItemReceiver();
            e.printStackTrace();
            return true;
        }
    }

    public static final String RemoteActionCompatParcelizer(NotificationManager notificationManager, String str, Context context) {
        String string;
        toMagicModuleMetaRepoModel.write(notificationManager, "");
        toMagicModuleMetaRepoModel.write(context, "");
        try {
            String str2 = str;
            if (str2 != null && str2.length() != 0 && notificationManager.getNotificationChannel(str) != null) {
                return str;
            }
            String strIconCompatParcelizer = RendererState.IconCompatParcelizer(context).IconCompatParcelizer();
            String str3 = strIconCompatParcelizer;
            if (str3 != null && str3.length() != 0 && notificationManager.getNotificationChannel(strIconCompatParcelizer) != null) {
                return strIconCompatParcelizer;
            }
            String str4 = strIconCompatParcelizer;
            if (str4 == null || str4.length() == 0) {
                RendererWakeupListener.AudioAttributesImplApi21Parcelizer();
            } else {
                RendererWakeupListener.AudioAttributesImplApi21Parcelizer();
            }
            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                try {
                    string = context.getString(RendererCapabilitiesAdaptiveSupport.RemoteActionCompatParcelizer.ct_fcm_fallback_notification_channel_label);
                } catch (Exception unused) {
                    string = "Misc";
                }
                toMagicModuleMetaRepoModel.write((Object) string);
                NotificationChannel notificationChannel = new NotificationChannel("fcm_fallback_notification_channel", string, 3);
                notificationChannel.toString();
                RendererWakeupListener.AudioAttributesImplApi21Parcelizer();
                notificationManager.createNotificationChannel(notificationChannel);
            }
            return "fcm_fallback_notification_channel";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static final void write(final PlayerTimelineChangeReason playerTimelineChangeReason, final String str, final String str2, final Context context) {
        toMagicModuleMetaRepoModel.write(playerTimelineChangeReason, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(context, "");
        try {
            TracksExternalSyntheticLambda0.AudioAttributesCompatParcelizer(playerTimelineChangeReason.MediaBrowserCompatCustomActionResultReceiver().AudioAttributesImplApi26Parcelizer()).read().RemoteActionCompatParcelizer(str, new Callable() { // from class: o.PlayerPositionInfo
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return PlayerPlaybackSuppressionReason.RemoteActionCompatParcelizer(playerTimelineChangeReason, context, str2, str);
                }
            }).get();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void RemoteActionCompatParcelizer(PlayerTimelineChangeReason playerTimelineChangeReason, Context context, String str, String str2) {
        toMagicModuleMetaRepoModel.write(playerTimelineChangeReason, "");
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        try {
            playerTimelineChangeReason.MediaBrowserCompatCustomActionResultReceiver().IconCompatParcelizer().RemoteActionCompatParcelizer(context, lambdasetVideoSurfaceHolder18.PUSH_NOTIFICATION_VIEWED, str);
            return null;
        } catch (Exception unused) {
            playerTimelineChangeReason.MediaBrowserCompatCustomActionResultReceiver().AudioAttributesImplApi26Parcelizer().write();
            RendererWakeupListener.AudioAttributesImplApi21Parcelizer();
            return null;
        }
    }

    public static final boolean IconCompatParcelizer(JSONArray jSONArray, int i) {
        return jSONArray == null || i < 0 || i >= jSONArray.length();
    }

    public static final boolean write(SharedPreferences sharedPreferences) {
        toMagicModuleMetaRepoModel.write(sharedPreferences, "");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(sharedPreferences.getAll(), "");
        return !r1.isEmpty();
    }

    public static final JSONArray read(JSONArray jSONArray) {
        return jSONArray == null ? new JSONArray() : jSONArray;
    }

    public static final Pair<Boolean, JSONArray> AudioAttributesCompatParcelizer(JSONObject jSONObject, String str) {
        toMagicModuleMetaRepoModel.write(jSONObject, "");
        toMagicModuleMetaRepoModel.write(str, "");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return new Pair<>(Boolean.FALSE, null);
        }
        boolean z = jSONArrayOptJSONArray.length() > 0;
        if (jSONArrayOptJSONArray.length() <= 0) {
            jSONArrayOptJSONArray = null;
        }
        return new Pair<>(Boolean.valueOf(z), jSONArrayOptJSONArray);
    }

    public static final Pair<Boolean, JSONArray> read(JSONObject jSONObject, String str) {
        toMagicModuleMetaRepoModel.write(jSONObject, "");
        toMagicModuleMetaRepoModel.write(str, "");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
        if (jSONArrayOptJSONArray == null) {
            return new Pair<>(Boolean.FALSE, null);
        }
        boolean z = jSONArrayOptJSONArray.length() >= 0;
        if (jSONArrayOptJSONArray.length() < 0) {
            jSONArrayOptJSONArray = null;
        }
        return new Pair<>(Boolean.valueOf(z), jSONArrayOptJSONArray);
    }

    public static final void IconCompatParcelizer(JSONObject jSONObject, JSONObject jSONObject2) {
        toMagicModuleMetaRepoModel.write(jSONObject, "");
        toMagicModuleMetaRepoModel.write(jSONObject2, "");
        Iterator<String> itKeys = jSONObject2.keys();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(itKeys, "");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            jSONObject.put(next, jSONObject2.opt(next));
        }
    }

    public static final JSONObject AudioAttributesCompatParcelizer(JSONObject jSONObject) {
        toMagicModuleMetaRepoModel.write(jSONObject, "");
        JSONObject jSONObject2 = new JSONObject();
        IconCompatParcelizer(jSONObject2, jSONObject);
        return jSONObject2;
    }

    public static final boolean write(JSONObject jSONObject) {
        return jSONObject != null && jSONObject.length() > 0;
    }

    public static final String IconCompatParcelizer(String str, String str2, String str3) {
        toMagicModuleMetaRepoModel.write(str3, "");
        if (str2 == null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str3);
        sb.append(str2);
        return sb.toString();
    }

    public static final boolean RemoteActionCompatParcelizer(Location location) {
        toMagicModuleMetaRepoModel.write(location, "");
        double latitude = location.getLatitude();
        if (-90.0d > latitude || latitude > 90.0d) {
            return false;
        }
        double longitude = location.getLongitude();
        return -180.0d <= longitude && longitude <= 180.0d;
    }

    public static final JSONObject read(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final boolean AudioAttributesCompatParcelizer(String str) {
        String str2 = str;
        return !(str2 == null || TestGroupLSModel.IconCompatParcelizer((CharSequence) str2));
    }

    public static final void read(View view, final MagicModuleSubmissionRequestBody<? super _verifyEndArrayForSingle, ? super ViewGroup.MarginLayoutParams, getShowPopup> magicModuleSubmissionRequestBody) {
        toMagicModuleMetaRepoModel.write(view, "");
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
        InvalidTypeIdException.read(view, new finishBranchObject() { // from class: o.PlayerState
            @Override // kotlin.finishBranchObject
            public final WindowInsetsCompat onApplyWindowInsets(View view2, WindowInsetsCompat windowInsetsCompat) {
                return PlayerPlaybackSuppressionReason.AudioAttributesCompatParcelizer(magicModuleSubmissionRequestBody, view2, windowInsetsCompat);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final WindowInsetsCompat AudioAttributesCompatParcelizer(MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, View view, WindowInsetsCompat windowInsetsCompat) {
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
        toMagicModuleMetaRepoModel.write(view, "");
        toMagicModuleMetaRepoModel.write(windowInsetsCompat, "");
        _verifyEndArrayForSingle _verifyendarrayforsingle = windowInsetsCompat.read(WindowInsetsCompat.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer() | WindowInsetsCompat.MediaBrowserCompatItemReceiver.read());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(_verifyendarrayforsingle, "");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            magicModuleSubmissionRequestBody.invoke(_verifyendarrayforsingle, marginLayoutParams);
            view.setLayoutParams(marginLayoutParams);
            return WindowInsetsCompat.IconCompatParcelizer;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
