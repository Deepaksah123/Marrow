package kotlin;

import android.app.Application;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.text.TextUtils;
import com.clevertap.android.sdk.pushnotification.CTNotificationIntentService;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class generatePlayingMediaPeriodEventTime {
    public static void write(Context context, getChildTimelines getchildtimelines, getContentResumeOffsetUs getcontentresumeoffsetus) {
        if (!RendererCapabilitiesListener.RemoteActionCompatParcelizer(context, "android.permission.INTERNET")) {
            RendererWakeupListener.MediaBrowserCompatItemReceiver();
        }
        RemoteActionCompatParcelizer(getchildtimelines);
        read(context);
        RemoteActionCompatParcelizer(context, getcontentresumeoffsetus);
        if (TextUtils.isEmpty(RendererState.IconCompatParcelizer(context).MediaBrowserCompatCustomActionResultReceiver())) {
            return;
        }
        RendererWakeupListener.MediaBrowserCompatCustomActionResultReceiver();
    }

    private static void RemoteActionCompatParcelizer(Context context) {
        String str = context.getApplicationInfo().className;
        if (str == null || str.isEmpty()) {
            RendererWakeupListener.MediaBrowserCompatCustomActionResultReceiver();
        } else if (str.equals("com.clevertap.android.sdk.Application")) {
            RendererWakeupListener.MediaBrowserCompatCustomActionResultReceiver();
        } else {
            RendererWakeupListener.MediaBrowserCompatCustomActionResultReceiver();
        }
    }

    private static void RemoteActionCompatParcelizer(Context context, getContentResumeOffsetUs getcontentresumeoffsetus) {
        try {
            read((Application) context.getApplicationContext(), toBundleWithOneWindowOnly.class.getName());
            IconCompatParcelizer((Application) context.getApplicationContext(), CTNotificationIntentService.class.getName());
            read((Application) context.getApplicationContext(), Rstyle.class);
            read((Application) context.getApplicationContext(), SimpleBasePlayerPlaceholderUid.class);
            read((Application) context.getApplicationContext(), "com.clevertap.android.geofence.CTGeofenceReceiver");
            read((Application) context.getApplicationContext(), "com.clevertap.android.geofence.CTLocationUpdateReceiver");
            read((Application) context.getApplicationContext(), "com.clevertap.android.geofence.CTGeofenceBootReceiver");
        } catch (Exception e) {
            e.toString();
            RendererWakeupListener.MediaMetadataCompat();
        }
        Iterator<getAdsId> it = getcontentresumeoffsetus.AudioAttributesCompatParcelizer().iterator();
        while (it.hasNext()) {
            if (it.next() == getAdGroupIndexAfterPositionUs.IconCompatParcelizer) {
                try {
                    IconCompatParcelizer((Application) context.getApplicationContext(), "com.clevertap.android.sdk.pushnotification.fcm.FcmMessageListenerService");
                } catch (Error e2) {
                    e2.getMessage();
                    RendererWakeupListener.MediaMetadataCompat();
                } catch (Exception e3) {
                    e3.toString();
                    RendererWakeupListener.MediaMetadataCompat();
                }
            }
        }
    }

    private static void RemoteActionCompatParcelizer(getChildTimelines getchildtimelines) {
        getchildtimelines.onMediaButtonEvent();
        RendererWakeupListener.MediaBrowserCompatCustomActionResultReceiver();
    }

    private static void read(Application application, Class cls) throws PackageManager.NameNotFoundException {
        ActivityInfo[] activityInfoArr = application.getPackageManager().getPackageInfo(application.getPackageName(), 1).activities;
        String name = cls.getName();
        for (ActivityInfo activityInfo : activityInfoArr) {
            if (((PackageItemInfo) activityInfo).name.equals(name)) {
                name.replaceFirst("com.clevertap.android.sdk.", "");
                RendererWakeupListener.MediaBrowserCompatCustomActionResultReceiver();
                return;
            }
        }
        name.replaceFirst("com.clevertap.android.sdk.", "");
        RendererWakeupListener.MediaBrowserCompatCustomActionResultReceiver();
    }

    private static void read(Application application, String str) throws PackageManager.NameNotFoundException {
        for (ActivityInfo activityInfo : application.getPackageManager().getPackageInfo(application.getPackageName(), 2).receivers) {
            if (((PackageItemInfo) activityInfo).name.equals(str)) {
                str.replaceFirst("com.clevertap.android.", "");
                RendererWakeupListener.MediaBrowserCompatCustomActionResultReceiver();
                return;
            }
        }
        str.replaceFirst("com.clevertap.android.", "");
        RendererWakeupListener.MediaBrowserCompatCustomActionResultReceiver();
    }

    private static void IconCompatParcelizer(Application application, String str) throws PackageManager.NameNotFoundException {
        for (ServiceInfo serviceInfo : application.getPackageManager().getPackageInfo(application.getPackageName(), 4).services) {
            if (((PackageItemInfo) serviceInfo).name.equals(str)) {
                str.replaceFirst("com.clevertap.android.sdk.", "");
                RendererWakeupListener.MediaBrowserCompatCustomActionResultReceiver();
                return;
            }
        }
        str.replaceFirst("com.clevertap.android.sdk.", "");
        RendererWakeupListener.MediaBrowserCompatCustomActionResultReceiver();
    }

    private static void read(Context context) {
        if (PlaybackParametersExternalSyntheticLambda0.RemoteActionCompatParcelizer || PlayerTimelineChangeReason.RemoteActionCompatParcelizer()) {
            return;
        }
        RendererWakeupListener.MediaBrowserCompatCustomActionResultReceiver();
        RemoteActionCompatParcelizer(context);
    }
}
