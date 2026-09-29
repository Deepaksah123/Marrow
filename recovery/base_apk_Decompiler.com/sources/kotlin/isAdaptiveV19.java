package kotlin;

import android.R;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.cloudmessaging.CloudMessagingReceiver;
import in.juspay.hypersdk.analytics.LogConstants;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin._coercedTypeDesc;

/* JADX INFO: loaded from: classes5.dex */
public final class isAdaptiveV19 {
    private static final AtomicInteger write = new AtomicInteger((int) SystemClock.elapsedRealtime());

    static read AudioAttributesCompatParcelizer(Context context, bypassRead bypassread) {
        Bundle bundleAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(context.getPackageManager(), context.getPackageName());
        return read(context, context, bypassread, RemoteActionCompatParcelizer(context, bypassread.write(), bundleAudioAttributesCompatParcelizer), bundleAudioAttributesCompatParcelizer);
    }

    private static read read(Context context, Context context2, bypassRead bypassread, String str, Bundle bundle) {
        String packageName = context2.getPackageName();
        Resources resources = context2.getResources();
        PackageManager packageManager = context2.getPackageManager();
        _coercedTypeDesc.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = new _coercedTypeDesc.AudioAttributesImplBaseParcelizer(context2, str);
        String strWrite = bypassread.write(resources, packageName, "gcm.n.title");
        if (!TextUtils.isEmpty(strWrite)) {
            audioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer((CharSequence) strWrite);
        }
        String strWrite2 = bypassread.write(resources, packageName, "gcm.n.body");
        if (!TextUtils.isEmpty(strWrite2)) {
            audioAttributesImplBaseParcelizer.read((CharSequence) strWrite2);
            audioAttributesImplBaseParcelizer.read(new _coercedTypeDesc.AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer(strWrite2));
        }
        audioAttributesImplBaseParcelizer.MediaBrowserCompatItemReceiver(read(packageManager, resources, packageName, bypassread.write("gcm.n.icon"), bundle));
        Uri uriWrite = write(packageName, bypassread, resources);
        if (uriWrite != null) {
            audioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(uriWrite);
        }
        audioAttributesImplBaseParcelizer.read(read(context, bypassread, packageName, packageManager));
        PendingIntent pendingIntent = read(context, context2, bypassread);
        if (pendingIntent != null) {
            audioAttributesImplBaseParcelizer.IconCompatParcelizer(pendingIntent);
        }
        Integer numIconCompatParcelizer = IconCompatParcelizer(context2, bypassread.write("gcm.n.color"), bundle);
        if (numIconCompatParcelizer != null) {
            audioAttributesImplBaseParcelizer.IconCompatParcelizer(numIconCompatParcelizer.intValue());
        }
        audioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(!bypassread.RemoteActionCompatParcelizer("gcm.n.sticky"));
        audioAttributesImplBaseParcelizer.MediaBrowserCompatItemReceiver(bypassread.RemoteActionCompatParcelizer("gcm.n.local_only"));
        String strWrite3 = bypassread.write("gcm.n.ticker");
        if (strWrite3 != null) {
            audioAttributesImplBaseParcelizer.MediaBrowserCompatItemReceiver(strWrite3);
        }
        Integer num = bypassread.read();
        if (num != null) {
            audioAttributesImplBaseParcelizer.AudioAttributesImplApi26Parcelizer(num.intValue());
        }
        Integer numAudioAttributesImplApi21Parcelizer = bypassread.AudioAttributesImplApi21Parcelizer();
        if (numAudioAttributesImplApi21Parcelizer != null) {
            audioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer(numAudioAttributesImplApi21Parcelizer.intValue());
        }
        Integer numAudioAttributesCompatParcelizer = bypassread.AudioAttributesCompatParcelizer();
        if (numAudioAttributesCompatParcelizer != null) {
            audioAttributesImplBaseParcelizer.read(numAudioAttributesCompatParcelizer.intValue());
        }
        Long l = bypassread.read("gcm.n.event_time");
        if (l != null) {
            audioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer(true);
            audioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(l.longValue());
        }
        long[] jArrMediaBrowserCompatCustomActionResultReceiver = bypassread.MediaBrowserCompatCustomActionResultReceiver();
        if (jArrMediaBrowserCompatCustomActionResultReceiver != null) {
            audioAttributesImplBaseParcelizer.write(jArrMediaBrowserCompatCustomActionResultReceiver);
        }
        int[] iArrIconCompatParcelizer = bypassread.IconCompatParcelizer();
        if (iArrIconCompatParcelizer != null) {
            audioAttributesImplBaseParcelizer.read(iArrIconCompatParcelizer[0], iArrIconCompatParcelizer[1], iArrIconCompatParcelizer[2]);
        }
        audioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(IconCompatParcelizer(bypassread));
        return new read(audioAttributesImplBaseParcelizer, RemoteActionCompatParcelizer(bypassread));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    private static int IconCompatParcelizer(bypassRead bypassread) {
        boolean zRemoteActionCompatParcelizer = bypassread.RemoteActionCompatParcelizer("gcm.n.default_sound");
        ?? r0 = zRemoteActionCompatParcelizer;
        if (bypassread.RemoteActionCompatParcelizer("gcm.n.default_vibrate_timings")) {
            r0 = (zRemoteActionCompatParcelizer ? 1 : 0) | 2;
        }
        return bypassread.RemoteActionCompatParcelizer("gcm.n.default_light_settings") ? r0 | 4 : r0;
    }

    private static int read(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0) {
                return identifier2;
            }
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i == 0) {
            try {
                i = ((PackageItemInfo) packageManager.getApplicationInfo(str, 0)).icon;
            } catch (PackageManager.NameNotFoundException e) {
                e.toString();
            }
        }
        return i != 0 ? i : R.drawable.sym_def_app_icon;
    }

    private static Integer IconCompatParcelizer(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
            }
        }
        int i = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i == 0) {
            return null;
        }
        try {
            return Integer.valueOf(_isNaN.getColor(context, i));
        } catch (Resources.NotFoundException unused2) {
            return null;
        }
    }

    private static Uri write(String str, bypassRead bypassread, Resources resources) {
        String strAudioAttributesImplApi26Parcelizer = bypassread.AudioAttributesImplApi26Parcelizer();
        if (TextUtils.isEmpty(strAudioAttributesImplApi26Parcelizer)) {
            return null;
        }
        if (!LogConstants.DEFAULT_CHANNEL.equals(strAudioAttributesImplApi26Parcelizer) && resources.getIdentifier(strAudioAttributesImplApi26Parcelizer, "raw", str) != 0) {
            StringBuilder sb = new StringBuilder("android.resource://");
            sb.append(str);
            sb.append("/raw/");
            sb.append(strAudioAttributesImplApi26Parcelizer);
            return Uri.parse(sb.toString());
        }
        return RingtoneManager.getDefaultUri(2);
    }

    private static PendingIntent read(Context context, bypassRead bypassread, String str, PackageManager packageManager) {
        Intent intentRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(str, bypassread, packageManager);
        if (intentRemoteActionCompatParcelizer == null) {
            return null;
        }
        intentRemoteActionCompatParcelizer.addFlags(67108864);
        intentRemoteActionCompatParcelizer.putExtras(bypassread.AudioAttributesImplBaseParcelizer());
        if (AudioAttributesCompatParcelizer(bypassread)) {
            intentRemoteActionCompatParcelizer.putExtra("gcm.n.analytics_data", bypassread.MediaBrowserCompatItemReceiver());
        }
        return PendingIntent.getActivity(context, RemoteActionCompatParcelizer(), intentRemoteActionCompatParcelizer, 1140850688);
    }

    private static Intent RemoteActionCompatParcelizer(String str, bypassRead bypassread, PackageManager packageManager) {
        String strWrite = bypassread.write("gcm.n.click_action");
        if (!TextUtils.isEmpty(strWrite)) {
            Intent intent = new Intent(strWrite);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri uriRemoteActionCompatParcelizer = bypassread.RemoteActionCompatParcelizer();
        if (uriRemoteActionCompatParcelizer != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(uriRemoteActionCompatParcelizer);
            return intent2;
        }
        return packageManager.getLaunchIntentForPackage(str);
    }

    private static Bundle AudioAttributesCompatParcelizer(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null && ((PackageItemInfo) applicationInfo).metaData != null) {
                return ((PackageItemInfo) applicationInfo).metaData;
            }
        } catch (PackageManager.NameNotFoundException e) {
            e.toString();
        }
        return Bundle.EMPTY;
    }

    private static String RemoteActionCompatParcelizer(Context context, String str, Bundle bundle) {
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion < 26) {
                return null;
            }
            NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
            if (!TextUtils.isEmpty(str) && notificationManager.getNotificationChannel(str) != null) {
                return str;
            }
            String string = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
            if (!TextUtils.isEmpty(string) && notificationManager.getNotificationChannel(string) != null) {
                return string;
            }
            if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", context.getString(com.marrow.R.string.fcm_fallback_notification_channel_label), 3));
            }
            return "fcm_fallback_notification_channel";
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    private static int RemoteActionCompatParcelizer() {
        return write.incrementAndGet();
    }

    private static PendingIntent read(Context context, Context context2, bypassRead bypassread) {
        if (AudioAttributesCompatParcelizer(bypassread)) {
            return RemoteActionCompatParcelizer(context, context2, new Intent(CloudMessagingReceiver.IntentActionKeys.NOTIFICATION_DISMISS).putExtras(bypassread.MediaBrowserCompatItemReceiver()));
        }
        return null;
    }

    private static PendingIntent RemoteActionCompatParcelizer(Context context, Context context2, Intent intent) {
        return PendingIntent.getBroadcast(context, RemoteActionCompatParcelizer(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context2, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra(CloudMessagingReceiver.IntentKeys.WRAPPED_INTENT, intent), 1140850688);
    }

    private static boolean AudioAttributesCompatParcelizer(bypassRead bypassread) {
        return bypassread.RemoteActionCompatParcelizer("google.c.a.e");
    }

    private static String RemoteActionCompatParcelizer(bypassRead bypassread) {
        String strWrite = bypassread.write("gcm.n.tag");
        if (!TextUtils.isEmpty(strWrite)) {
            return strWrite;
        }
        StringBuilder sb = new StringBuilder("FCM-Notification:");
        sb.append(SystemClock.uptimeMillis());
        return sb.toString();
    }

    public static class read {
        public final int AudioAttributesCompatParcelizer = 0;
        public final String RemoteActionCompatParcelizer;
        public final _coercedTypeDesc.AudioAttributesImplBaseParcelizer read;

        read(_coercedTypeDesc.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer, String str) {
            this.read = audioAttributesImplBaseParcelizer;
            this.RemoteActionCompatParcelizer = str;
        }
    }
}
