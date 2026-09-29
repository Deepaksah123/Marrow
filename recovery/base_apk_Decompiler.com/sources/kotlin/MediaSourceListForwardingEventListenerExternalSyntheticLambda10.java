package kotlin;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.ResolveInfo;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.widget.RemoteViews;
import android.widget.Toast;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.marrow.data.models.test.TestIndex;
import in.juspay.hypersdk.core.PaymentConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import kotlin.SimpleExoPlayer;
import kotlin.getContentPositionMsInternal;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class MediaSourceListForwardingEventListenerExternalSyntheticLambda10 {
    public static Bitmap read(String str, Context context) throws NullPointerException {
        Bitmap bitmapRemoteActionCompatParcelizer;
        if (str == null || str.equals("") || (bitmapRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str, context)) == null) {
            return null;
        }
        return bitmapRemoteActionCompatParcelizer;
    }

    private static Bitmap AudioAttributesCompatParcelizer(Drawable drawable) throws NullPointerException {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return bitmapCreateBitmap;
    }

    private static Bitmap RemoteActionCompatParcelizer(String str, Context context) {
        SimpleExoPlayer simpleExoPlayerRemoteActionCompatParcelizer = getContentPositionMsInternal.RemoteActionCompatParcelizer(getContentPositionMsInternal.RemoteActionCompatParcelizer.write, new SeekParameters(str, false, context, null, -1L, -1));
        if (simpleExoPlayerRemoteActionCompatParcelizer.getAudioAttributesCompatParcelizer() == SimpleExoPlayer.write.MediaBrowserCompatItemReceiver) {
            return simpleExoPlayerRemoteActionCompatParcelizer.getRead();
        }
        Objects.toString(simpleExoPlayerRemoteActionCompatParcelizer.getAudioAttributesCompatParcelizer());
        RendererWakeupListener.MediaMetadataCompat();
        return null;
    }

    static String read(Bundle bundle, String str) {
        try {
            Object obj = bundle.get(str);
            if (obj != null) {
                return obj.toString();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    static int AudioAttributesCompatParcelizer(Context context) {
        return ((PackageItemInfo) context.getApplicationInfo()).icon;
    }

    static ArrayList<onDrmSessionManagerError> RemoteActionCompatParcelizer(Bundle bundle, String str) {
        ArrayList<onDrmSessionManagerError> arrayList = new ArrayList<>();
        int i = 1;
        for (String str2 : bundle.keySet()) {
            if (str2.contains("pt_img") && !str2.endsWith("_alt_text")) {
                String string = bundle.getString(str2);
                StringBuilder sb = new StringBuilder();
                sb.append(str2);
                sb.append("_alt_text");
                String string2 = sb.toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(i);
                arrayList.add(new onDrmSessionManagerError(string, bundle.getString(string2, sb2.toString())));
                i++;
            }
        }
        return arrayList;
    }

    static ArrayList<String> read(Bundle bundle) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : bundle.keySet()) {
            if (str.contains("pt_dl")) {
                arrayList.add(bundle.getString(str));
            }
        }
        return arrayList;
    }

    static ArrayList<String> AudioAttributesCompatParcelizer(Bundle bundle) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : bundle.keySet()) {
            if (str.contains("pt_bt")) {
                arrayList.add(bundle.getString(str));
            }
        }
        return arrayList;
    }

    static ArrayList<String> AudioAttributesImplApi26Parcelizer(Bundle bundle) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : bundle.keySet()) {
            if (str.contains("pt_st")) {
                arrayList.add(bundle.getString(str));
            }
        }
        return arrayList;
    }

    static ArrayList<String> AudioAttributesImplBaseParcelizer(Bundle bundle) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String str : bundle.keySet()) {
            if (str.contains("pt_price") && !str.contains("pt_price_list")) {
                arrayList.add(bundle.getString(str));
            }
        }
        return arrayList;
    }

    public static Map<String, String> AudioAttributesCompatParcelizer(Bundle bundle, boolean z) {
        HashMap map = new HashMap();
        for (String str : onLoadCanceled.read) {
            map.put(str, AudioAttributesCompatParcelizer(bundle, z, str));
        }
        return map;
    }

    private static String AudioAttributesCompatParcelizer(Bundle bundle, boolean z, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_dark");
        String string = bundle.getString(sb.toString());
        return (!z || string == null) ? bundle.getString(str) : string;
    }

    public static void AudioAttributesCompatParcelizer(int i, Bitmap bitmap, RemoteViews remoteViews) {
        remoteViews.setImageViewBitmap(i, bitmap);
    }

    public static void write(int i, String str, RemoteViews remoteViews, Context context) {
        IconCompatParcelizer(i, str, remoteViews, context, null);
    }

    public static void IconCompatParcelizer(int i, String str, RemoteViews remoteViews, Context context, String str2) {
        System.currentTimeMillis();
        Bitmap bitmapRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str, context);
        write(Boolean.FALSE);
        if (bitmapRemoteActionCompatParcelizer != null) {
            remoteViews.setImageViewBitmap(i, bitmapRemoteActionCompatParcelizer);
            if (!TextUtils.isEmpty(str2)) {
                remoteViews.setContentDescription(i, str2);
            }
            System.currentTimeMillis();
            onDrmSessionAcquired.IconCompatParcelizer();
            return;
        }
        onDrmSessionAcquired.RemoteActionCompatParcelizer();
        write(Boolean.TRUE);
    }

    public static void read(int i, int i2, RemoteViews remoteViews) {
        remoteViews.setImageViewResource(i, i2);
    }

    public static String AudioAttributesCompatParcelizer(Context context, long j) {
        return DateUtils.formatDateTime(context, j, 1);
    }

    public static String write(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i = ((PackageItemInfo) applicationInfo).labelRes;
        if (i == 0) {
            return ((PackageItemInfo) applicationInfo).nonLocalizedLabel.toString();
        }
        return context.getString(i);
    }

    static Bundle RemoteActionCompatParcelizer(JSONObject jSONObject) {
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(next);
            String strOptString = jSONObject.optString(next);
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() <= 0) {
                bundle.putStringArray(next, new String[0]);
            } else if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.optString(0) != null) {
                String[] strArr = new String[jSONArrayOptJSONArray.length()];
                for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                    strArr[i] = jSONArrayOptJSONArray.optString(i);
                }
                bundle.putStringArray(next, strArr);
            } else if (strOptString != null) {
                bundle.putString(next, strOptString);
            } else {
                System.err.println("unable to transform json to bundle ".concat(String.valueOf(next)));
            }
        }
        return bundle;
    }

    static void read(Context context, int i) {
        ((NotificationManager) context.getSystemService("notification")).cancel(i);
    }

    static int MediaBrowserCompatCustomActionResultReceiver(Bundle bundle) {
        String str = TestIndex.ALL_INDIA_ID;
        String string = TestIndex.ALL_INDIA_ID;
        for (String str2 : bundle.keySet()) {
            if (str2.contains("pt_timer_threshold")) {
                string = bundle.getString(str2);
            }
        }
        if (string != null) {
            str = string;
        }
        return Integer.parseInt(str);
    }

    static void write(Context context, Intent intent) {
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        String packageName = context.getPackageName();
        Iterator<ResolveInfo> it = listQueryIntentActivities.iterator();
        while (it.hasNext()) {
            if (packageName.equals(((PackageItemInfo) it.next().activityInfo).packageName)) {
                intent.setPackage(packageName);
                return;
            }
        }
    }

    static void IconCompatParcelizer(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, Bundle bundle) {
        PlayerTimelineChangeReason playerTimelineChangeReasonWrite;
        if (cleverTapInstanceConfig != null) {
            playerTimelineChangeReasonWrite = PlayerTimelineChangeReason.RemoteActionCompatParcelizer(context, cleverTapInstanceConfig);
        } else {
            playerTimelineChangeReasonWrite = PlayerTimelineChangeReason.write(context);
        }
        HashMap<String, Object> mapAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(bundle);
        String strMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(bundle);
        if (strMediaBrowserCompatItemReceiver == null || strMediaBrowserCompatItemReceiver.isEmpty()) {
            return;
        }
        if (playerTimelineChangeReasonWrite != null) {
            playerTimelineChangeReasonWrite.read(strMediaBrowserCompatItemReceiver, mapAudioAttributesImplApi21Parcelizer);
        } else {
            onDrmSessionAcquired.RemoteActionCompatParcelizer();
        }
    }

    static void write(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, Bundle bundle, String str) {
        PlayerTimelineChangeReason playerTimelineChangeReasonWrite;
        if (cleverTapInstanceConfig != null) {
            playerTimelineChangeReasonWrite = PlayerTimelineChangeReason.RemoteActionCompatParcelizer(context, cleverTapInstanceConfig);
        } else {
            playerTimelineChangeReasonWrite = PlayerTimelineChangeReason.write(context);
        }
        HashMap<String, Object> mapWrite = write(bundle, str, bundle.getString(str));
        String strMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(bundle);
        if (strMediaBrowserCompatItemReceiver == null || strMediaBrowserCompatItemReceiver.isEmpty()) {
            return;
        }
        if (playerTimelineChangeReasonWrite != null) {
            playerTimelineChangeReasonWrite.read(strMediaBrowserCompatItemReceiver, mapWrite);
        } else {
            onDrmSessionAcquired.RemoteActionCompatParcelizer();
        }
    }

    static void RemoteActionCompatParcelizer(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, String str, HashMap<String, Object> map) {
        PlayerTimelineChangeReason playerTimelineChangeReasonWrite;
        if (cleverTapInstanceConfig != null) {
            playerTimelineChangeReasonWrite = PlayerTimelineChangeReason.RemoteActionCompatParcelizer(context, cleverTapInstanceConfig);
        } else {
            playerTimelineChangeReasonWrite = PlayerTimelineChangeReason.write(context);
        }
        if (str.isEmpty()) {
            return;
        }
        if (playerTimelineChangeReasonWrite != null) {
            playerTimelineChangeReasonWrite.read(str, map);
        } else {
            onDrmSessionAcquired.RemoteActionCompatParcelizer();
        }
    }

    static HashMap<String, Object> write(Bundle bundle) {
        bundle.remove(PaymentConstants.Category.CONFIG);
        HashMap<String, Object> map = new HashMap<>();
        for (String str : bundle.keySet()) {
            if (str.contains("wzrk_") || str.equals("pt_id")) {
                Object obj = bundle.get(str);
                if (obj instanceof Bundle) {
                    map.putAll(write((Bundle) obj));
                } else {
                    map.put(str, bundle.get(str));
                }
            }
        }
        return map;
    }

    private static String MediaBrowserCompatItemReceiver(Bundle bundle) {
        String string = null;
        for (String str : bundle.keySet()) {
            if (str.contains("pt_event_name")) {
                string = bundle.getString(str);
            }
        }
        return string;
    }

    private static HashMap<String, Object> write(Bundle bundle, String str, String str2) {
        HashMap<String, Object> map = new HashMap<>();
        for (String str3 : bundle.keySet()) {
            if (str3.contains("pt_event_property")) {
                if (bundle.getString(str3) != null && !bundle.getString(str3).isEmpty()) {
                    if (str3.contains("pt_event_property_")) {
                        String[] strArrSplit = str3.split("pt_event_property_");
                        if (bundle.getString(str3).equalsIgnoreCase(str)) {
                            map.put(strArrSplit[1], str2);
                        } else {
                            map.put(strArrSplit[1], bundle.getString(str3));
                        }
                    } else {
                        onDrmSessionAcquired.IconCompatParcelizer();
                    }
                } else {
                    onDrmSessionAcquired.IconCompatParcelizer();
                }
            }
        }
        return map;
    }

    private static HashMap<String, Object> AudioAttributesImplApi21Parcelizer(Bundle bundle) {
        HashMap<String, Object> map = new HashMap<>();
        for (String str : bundle.keySet()) {
            if (str.contains("pt_event_property")) {
                if (bundle.getString(str) != null && !bundle.getString(str).isEmpty()) {
                    if (str.contains("pt_event_property_")) {
                        map.put(str.split("pt_event_property_")[1], bundle.getString(str));
                    } else {
                        onDrmSessionAcquired.IconCompatParcelizer();
                    }
                } else {
                    onDrmSessionAcquired.IconCompatParcelizer();
                }
            }
        }
        return map;
    }

    public static int write(Bundle bundle, long j) {
        String string = TestIndex.ALL_INDIA_ID;
        for (String str : bundle.keySet()) {
            if (str.contains("pt_timer_end")) {
                string = bundle.getString(str);
            }
        }
        if (string.contains("$D_")) {
            string = string.split("\\$D_")[1];
        }
        int i = (int) (Long.parseLong(string) - (j / 1000));
        if (string.equals(TestIndex.ALL_INDIA_ID)) {
            return Integer.MIN_VALUE;
        }
        return i;
    }

    public static boolean AudioAttributesCompatParcelizer(Context context, int i) {
        for (StatusBarNotification statusBarNotification : ((NotificationManager) context.getSystemService("notification")).getActiveNotifications()) {
            if (statusBarNotification.getId() == i) {
                return true;
            }
        }
        return false;
    }

    public static Notification RemoteActionCompatParcelizer(Context context, int i) {
        for (StatusBarNotification statusBarNotification : ((NotificationManager) context.getSystemService("notification")).getActiveNotifications()) {
            if (statusBarNotification.getId() == i) {
                return statusBarNotification.getNotification();
            }
        }
        return null;
    }

    public static ArrayList<Integer> IconCompatParcelizer(Context context) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (StatusBarNotification statusBarNotification : ((NotificationManager) context.getSystemService("notification")).getActiveNotifications()) {
            if (statusBarNotification.getPackageName().equalsIgnoreCase(context.getPackageName())) {
                arrayList.add(Integer.valueOf(statusBarNotification.getId()));
            }
        }
        return arrayList;
    }

    static void AudioAttributesCompatParcelizer(Context context, Bundle bundle, CleverTapInstanceConfig cleverTapInstanceConfig) {
        PlayerTimelineChangeReason playerTimelineChangeReasonWrite;
        if (cleverTapInstanceConfig != null) {
            playerTimelineChangeReasonWrite = PlayerTimelineChangeReason.RemoteActionCompatParcelizer(context, cleverTapInstanceConfig);
        } else {
            playerTimelineChangeReasonWrite = PlayerTimelineChangeReason.write(context);
        }
        if (playerTimelineChangeReasonWrite != null) {
            playerTimelineChangeReasonWrite.read(bundle);
        }
    }

    static JSONArray IconCompatParcelizer(Bundle bundle) {
        String string = bundle.getString("wzrk_acts");
        if (string == null) {
            return null;
        }
        try {
            return new JSONArray(string);
        } catch (Throwable th) {
            th.getLocalizedMessage();
            onDrmSessionAcquired.RemoteActionCompatParcelizer();
            return null;
        }
    }

    static void read(final Context context, final String str, CleverTapInstanceConfig cleverTapInstanceConfig) {
        if (cleverTapInstanceConfig != null) {
            TracksExternalSyntheticLambda0.AudioAttributesCompatParcelizer(cleverTapInstanceConfig).write().read("PushTemplatesUtils#showToast", new Callable<Void>() { // from class: o.MediaSourceListForwardingEventListenerExternalSyntheticLambda10.2
                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
                public Void call() {
                    if (TextUtils.isEmpty(str)) {
                        return null;
                    }
                    Toast.makeText(context, str, 0).show();
                    return null;
                }
            });
        }
    }

    static void read(Context context) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager != null) {
            if (notificationManager.getNotificationChannel("pt_silent_sound_channel") == null || !(notificationManager.getNotificationChannel("pt_silent_sound_channel") == null || read(notificationManager.getNotificationChannel("pt_silent_sound_channel")))) {
                StringBuilder sb = new StringBuilder("android.resource://");
                sb.append(context.getPackageName());
                sb.append("/raw/pt_silent_sound");
                Uri uri = Uri.parse(sb.toString());
                NotificationChannel notificationChannel = new NotificationChannel("pt_silent_sound_channel", onLoadCanceled.AudioAttributesCompatParcelizer, 4);
                if (uri != null) {
                    notificationChannel.setSound(uri, new AudioAttributes.Builder().setUsage(5).build());
                }
                notificationChannel.setDescription("A channel to silently update notifications");
                notificationChannel.setShowBadge(false);
                notificationManager.createNotificationChannel(notificationChannel);
            }
        }
    }

    static void RemoteActionCompatParcelizer(Context context) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
        if (notificationManager == null || notificationManager.getNotificationChannel("pt_silent_sound_channel") == null || !read(notificationManager.getNotificationChannel("pt_silent_sound_channel"))) {
            return;
        }
        notificationManager.deleteNotificationChannel("pt_silent_sound_channel");
    }

    private static boolean read(NotificationChannel notificationChannel) {
        return (notificationChannel == null || notificationChannel.getImportance() == 0) ? false : true;
    }

    public static Bitmap write(Context context, int i, String str, String str2) {
        int iIconCompatParcelizer = IconCompatParcelizer(str, str2);
        try {
            Drawable drawable = _isNaN.getDrawable(context, i);
            if (drawable == null) {
                return null;
            }
            Drawable drawableMutate = drawable.mutate();
            drawableMutate.setColorFilter(new PorterDuffColorFilter(iIconCompatParcelizer, PorterDuff.Mode.SRC_IN));
            return AudioAttributesCompatParcelizer(drawableMutate);
        } catch (Exception unused) {
            return null;
        }
    }

    public static int IconCompatParcelizer(String str, String str2) {
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            onDrmSessionAcquired.RemoteActionCompatParcelizer();
            return Color.parseColor(str2);
        }
    }

    public static Integer read(String str) {
        try {
            return Integer.valueOf(Color.parseColor(str));
        } catch (Exception unused) {
            onDrmSessionAcquired.RemoteActionCompatParcelizer();
            return null;
        }
    }

    private static void write(Boolean bool) {
        onLoadCanceled.RemoteActionCompatParcelizer = bool.booleanValue();
    }

    public static boolean RemoteActionCompatParcelizer() {
        return onLoadCanceled.RemoteActionCompatParcelizer;
    }

    public static int RemoteActionCompatParcelizer(Bundle bundle) {
        String string = bundle.getString("pt_flip_interval");
        if (string != null) {
            try {
                return Math.max(Integer.parseInt(string), 4000);
            } catch (Exception unused) {
                onDrmSessionAcquired.RemoteActionCompatParcelizer();
            }
        }
        return 4000;
    }

    static void AudioAttributesCompatParcelizer(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("wzrk_pid");
        File dir = new ContextWrapper(context.getApplicationContext()).getDir("pt_dir", 0);
        String absolutePath = dir.getAbsolutePath();
        String[] list = dir.list();
        if (list != null) {
            for (String str : list) {
                if (stringExtra != null && str.contains(stringExtra)) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(absolutePath);
                    sb.append("/");
                    sb.append(str);
                    if (!new File(sb.toString()).delete()) {
                        onDrmSessionAcquired.RemoteActionCompatParcelizer();
                    }
                } else if (stringExtra == null && str.contains("null")) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(absolutePath);
                    sb2.append("/");
                    sb2.append(str);
                    if (!new File(sb2.toString()).delete()) {
                        onDrmSessionAcquired.RemoteActionCompatParcelizer();
                    }
                }
            }
        }
    }
}
