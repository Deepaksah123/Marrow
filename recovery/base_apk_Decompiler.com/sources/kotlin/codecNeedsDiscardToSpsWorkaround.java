package kotlin;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.measurement.AppMeasurement;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.messaging.FirebaseMessagingService;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import kotlin.processOutputMediaFormatChanged;

/* JADX INFO: loaded from: classes5.dex */
public final class codecNeedsDiscardToSpsWorkaround {
    public static void write(Intent intent) {
        if (RemoteActionCompatParcelizer(intent)) {
            IconCompatParcelizer("_nr", intent.getExtras());
        }
        if (AudioAttributesImplApi26Parcelizer(intent)) {
            AudioAttributesCompatParcelizer(processOutputMediaFormatChanged.AudioAttributesCompatParcelizer.MESSAGE_DELIVERED, intent, needsDisableAdaptationWorkaround.read());
        }
    }

    public static void RemoteActionCompatParcelizer(Bundle bundle) {
        onAddQueueItem(bundle);
        IconCompatParcelizer("_no", bundle);
    }

    public static void IconCompatParcelizer(Intent intent) {
        IconCompatParcelizer("_nd", intent.getExtras());
    }

    public static void read(Intent intent) {
        IconCompatParcelizer("_nf", intent.getExtras());
    }

    public static boolean RemoteActionCompatParcelizer(Intent intent) {
        if (intent == null || AudioAttributesCompatParcelizer(intent)) {
            return false;
        }
        return AudioAttributesCompatParcelizer(intent.getExtras());
    }

    public static boolean AudioAttributesCompatParcelizer(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(bundle.getString("google.c.a.e"));
    }

    private static boolean AudioAttributesImplApi26Parcelizer(Intent intent) {
        if (intent == null || AudioAttributesCompatParcelizer(intent)) {
            return false;
        }
        return AudioAttributesCompatParcelizer();
    }

    private static boolean AudioAttributesCompatParcelizer(Intent intent) {
        return FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction());
    }

    private static boolean AudioAttributesCompatParcelizer() {
        Context contextAudioAttributesCompatParcelizer;
        SharedPreferences sharedPreferences;
        ApplicationInfo applicationInfo;
        try {
            FirebaseApp.write();
            contextAudioAttributesCompatParcelizer = FirebaseApp.write().AudioAttributesCompatParcelizer();
            sharedPreferences = contextAudioAttributesCompatParcelizer.getSharedPreferences("com.google.firebase.messaging", 0);
        } catch (PackageManager.NameNotFoundException | IllegalStateException unused) {
        }
        if (sharedPreferences.contains("export_to_big_query")) {
            return sharedPreferences.getBoolean("export_to_big_query", false);
        }
        PackageManager packageManager = contextAudioAttributesCompatParcelizer.getPackageManager();
        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextAudioAttributesCompatParcelizer.getPackageName(), 128)) != null && ((PackageItemInfo) applicationInfo).metaData != null && ((PackageItemInfo) applicationInfo).metaData.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
            return ((PackageItemInfo) applicationInfo).metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
        }
        return false;
    }

    private static void onAddQueueItem(Bundle bundle) {
        TrackSampleTable trackSampleTable;
        if (bundle == null || !IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(bundle.getString("google.c.a.tc")) || (trackSampleTable = (TrackSampleTable) FirebaseApp.write().AudioAttributesCompatParcelizer(TrackSampleTable.class)) == null) {
            return;
        }
        String string = bundle.getString("google.c.a.c_id");
        trackSampleTable.write(AppMeasurement.FCM_ORIGIN, "_ln", string);
        Bundle bundle2 = new Bundle();
        bundle2.putString("source", "Firebase");
        bundle2.putString("medium", "notification");
        bundle2.putString("campaign", string);
        trackSampleTable.RemoteActionCompatParcelizer(AppMeasurement.FCM_ORIGIN, "_cmp", bundle2);
    }

    private static void IconCompatParcelizer(String str, Bundle bundle) {
        try {
            FirebaseApp.write();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String str2 = read(bundle);
            if (str2 != null) {
                bundle2.putString("_nmid", str2);
            }
            String strWrite = write(bundle);
            if (strWrite != null) {
                bundle2.putString("_nmn", strWrite);
            }
            String strMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(bundle);
            if (!TextUtils.isEmpty(strMediaBrowserCompatCustomActionResultReceiver)) {
                bundle2.putString("label", strMediaBrowserCompatCustomActionResultReceiver);
            }
            String strAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer(bundle);
            if (!TextUtils.isEmpty(strAudioAttributesImplApi26Parcelizer)) {
                bundle2.putString("message_channel", strAudioAttributesImplApi26Parcelizer);
            }
            String strMediaBrowserCompatSearchResultReceiver = MediaBrowserCompatSearchResultReceiver(bundle);
            if (strMediaBrowserCompatSearchResultReceiver != null) {
                bundle2.putString("_nt", strMediaBrowserCompatSearchResultReceiver);
            }
            String strMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(bundle);
            if (strMediaBrowserCompatItemReceiver != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(strMediaBrowserCompatItemReceiver));
                } catch (NumberFormatException unused) {
                }
            }
            String strOnCommand = onCommand(bundle);
            if (strOnCommand != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(strOnCommand));
                } catch (NumberFormatException unused2) {
                }
            }
            String strMediaDescriptionCompat = MediaDescriptionCompat(bundle);
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", strMediaDescriptionCompat);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                bundle2.toString();
            }
            TrackSampleTable trackSampleTable = (TrackSampleTable) FirebaseApp.write().AudioAttributesCompatParcelizer(TrackSampleTable.class);
            if (trackSampleTable != null) {
                trackSampleTable.RemoteActionCompatParcelizer(AppMeasurement.FCM_ORIGIN, str, bundle2);
            }
        } catch (IllegalStateException unused3) {
        }
    }

    private static void AudioAttributesCompatParcelizer(processOutputMediaFormatChanged.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, Intent intent, DrmUtilApi18 drmUtilApi18) {
        processOutputMediaFormatChanged processoutputmediaformatchangedIconCompatParcelizer;
        if (drmUtilApi18 == null || (processoutputmediaformatchangedIconCompatParcelizer = IconCompatParcelizer(audioAttributesCompatParcelizer, intent)) == null) {
            return;
        }
        try {
            drmUtilApi18.write("FCM_CLIENT_EVENT_LOGGING", DrmSessionManagerDrmSessionReference.IconCompatParcelizer("proto"), new isMediaDrmStateException() { // from class: o.MediaCodecRenderer
                @Override // kotlin.isMediaDrmStateException
                public final Object AudioAttributesCompatParcelizer(Object obj) {
                    return ((resetInputBuffer) obj).AudioAttributesCompatParcelizer();
                }
            }).AudioAttributesCompatParcelizer(isNotProvisionedException.AudioAttributesCompatParcelizer(resetInputBuffer.RemoteActionCompatParcelizer().IconCompatParcelizer(processoutputmediaformatchangedIconCompatParcelizer).RemoteActionCompatParcelizer()));
        } catch (RuntimeException unused) {
        }
    }

    private static int MediaBrowserCompatMediaItem(Bundle bundle) {
        Object obj = bundle.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Objects.toString(obj);
            return 0;
        }
    }

    private static String IconCompatParcelizer(Bundle bundle) {
        return bundle.getString("collapse_key");
    }

    private static String read(Bundle bundle) {
        return bundle.getString("google.c.a.c_id");
    }

    private static String write(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    private static String MediaBrowserCompatCustomActionResultReceiver(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    private static String AudioAttributesImplApi26Parcelizer(Bundle bundle) {
        return bundle.getString("google.c.a.m_c");
    }

    private static String MediaBrowserCompatItemReceiver(Bundle bundle) {
        return bundle.getString("google.c.a.ts");
    }

    private static String AudioAttributesImplBaseParcelizer(Bundle bundle) {
        String string = bundle.getString("google.message_id");
        return string == null ? bundle.getString("message_id") : string;
    }

    private static String IconCompatParcelizer() {
        return FirebaseApp.write().AudioAttributesCompatParcelizer().getPackageName();
    }

    private static String AudioAttributesImplApi21Parcelizer(Bundle bundle) {
        String string = bundle.getString("google.to");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) Tasks.await(BatchBuffer.write(FirebaseApp.write()).write());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
    }

    private static String MediaDescriptionCompat(Bundle bundle) {
        if (bundle != null && bypassRead.write(bundle)) {
            return "display";
        }
        return "data";
    }

    private static processOutputMediaFormatChanged.IconCompatParcelizer RatingCompat(Bundle bundle) {
        if (bundle != null && bypassRead.write(bundle)) {
            return processOutputMediaFormatChanged.IconCompatParcelizer.DISPLAY_NOTIFICATION;
        }
        return processOutputMediaFormatChanged.IconCompatParcelizer.DATA_MESSAGE;
    }

    private static String MediaBrowserCompatSearchResultReceiver(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    private static String onCommand(Bundle bundle) {
        if (bundle.containsKey("google.c.a.udt")) {
            return bundle.getString("google.c.a.udt");
        }
        return null;
    }

    private static long MediaMetadataCompat(Bundle bundle) {
        if (bundle.containsKey("google.c.sender.id")) {
            try {
                return Long.parseLong(bundle.getString("google.c.sender.id"));
            } catch (NumberFormatException unused) {
            }
        }
        FirebaseApp firebaseAppWrite = FirebaseApp.write();
        String strIconCompatParcelizer = firebaseAppWrite.read().IconCompatParcelizer();
        if (strIconCompatParcelizer != null) {
            try {
                return Long.parseLong(strIconCompatParcelizer);
            } catch (NumberFormatException unused2) {
            }
        }
        String strRemoteActionCompatParcelizer = firebaseAppWrite.read().RemoteActionCompatParcelizer();
        try {
            if (!strRemoteActionCompatParcelizer.startsWith("1:")) {
                return Long.parseLong(strRemoteActionCompatParcelizer);
            }
            String[] strArrSplit = strRemoteActionCompatParcelizer.split(":");
            if (strArrSplit.length < 2) {
                return 0L;
            }
            String str = strArrSplit[1];
            if (str.isEmpty()) {
                return 0L;
            }
            return Long.parseLong(str);
        } catch (NumberFormatException unused3) {
            return 0L;
        }
    }

    private static processOutputMediaFormatChanged IconCompatParcelizer(processOutputMediaFormatChanged.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        processOutputMediaFormatChanged.read readVarAudioAttributesCompatParcelizer = processOutputMediaFormatChanged.write().read(MediaBrowserCompatMediaItem(extras)).RemoteActionCompatParcelizer(audioAttributesCompatParcelizer).write(AudioAttributesImplApi21Parcelizer(extras)).MediaBrowserCompatCustomActionResultReceiver(IconCompatParcelizer()).IconCompatParcelizer(processOutputMediaFormatChanged.write.ANDROID).AudioAttributesCompatParcelizer(RatingCompat(extras));
        String strAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(extras);
        if (strAudioAttributesImplBaseParcelizer != null) {
            readVarAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(strAudioAttributesImplBaseParcelizer);
        }
        String strMediaBrowserCompatSearchResultReceiver = MediaBrowserCompatSearchResultReceiver(extras);
        if (strMediaBrowserCompatSearchResultReceiver != null) {
            readVarAudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer(strMediaBrowserCompatSearchResultReceiver);
        }
        String strIconCompatParcelizer = IconCompatParcelizer(extras);
        if (strIconCompatParcelizer != null) {
            readVarAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(strIconCompatParcelizer);
        }
        String strMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(extras);
        if (strMediaBrowserCompatCustomActionResultReceiver != null) {
            readVarAudioAttributesCompatParcelizer.IconCompatParcelizer(strMediaBrowserCompatCustomActionResultReceiver);
        }
        String strWrite = write(extras);
        if (strWrite != null) {
            readVarAudioAttributesCompatParcelizer.read(strWrite);
        }
        long jMediaMetadataCompat = MediaMetadataCompat(extras);
        if (jMediaMetadataCompat > 0) {
            readVarAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(jMediaMetadataCompat);
        }
        return readVarAudioAttributesCompatParcelizer.read();
    }
}
