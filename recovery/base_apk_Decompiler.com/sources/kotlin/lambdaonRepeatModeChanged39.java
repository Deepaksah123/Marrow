package kotlin;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.facebook.GraphRequest;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
final class lambdaonRepeatModeChanged39 {
    private static SharedPreferences AudioAttributesImplBaseParcelizer = null;
    private static final String IconCompatParcelizer = "com.facebook.UserSettingsManager";
    private static AtomicBoolean AudioAttributesImplApi26Parcelizer = new AtomicBoolean(false);
    private static AtomicBoolean MediaBrowserCompatItemReceiver = new AtomicBoolean(false);
    private static AudioAttributesCompatParcelizer read = new AudioAttributesCompatParcelizer(true, "com.facebook.sdk.AutoInitEnabled");
    private static AudioAttributesCompatParcelizer write = new AudioAttributesCompatParcelizer(true, "com.facebook.sdk.AutoLogAppEventsEnabled");
    private static AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(true, "com.facebook.sdk.AdvertiserIDCollectionEnabled");
    private static AudioAttributesCompatParcelizer RemoteActionCompatParcelizer = new AudioAttributesCompatParcelizer(false, "auto_event_setup_enabled");
    private static AudioAttributesCompatParcelizer MediaBrowserCompatCustomActionResultReceiver = new AudioAttributesCompatParcelizer(true, "com.facebook.sdk.MonitorEnabled");

    lambdaonRepeatModeChanged39() {
    }

    static /* synthetic */ AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonRepeatModeChanged39.class)) {
            return null;
        }
        try {
            return AudioAttributesCompatParcelizer;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdaonRepeatModeChanged39.class);
            return null;
        }
    }

    static /* synthetic */ AudioAttributesCompatParcelizer RemoteActionCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonRepeatModeChanged39.class)) {
            return null;
        }
        try {
            return RemoteActionCompatParcelizer;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdaonRepeatModeChanged39.class);
            return null;
        }
    }

    static /* synthetic */ void read(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonRepeatModeChanged39.class)) {
            return;
        }
        try {
            RemoteActionCompatParcelizer(audioAttributesCompatParcelizer);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdaonRepeatModeChanged39.class);
        }
    }

    static /* synthetic */ AtomicBoolean write() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonRepeatModeChanged39.class)) {
            return null;
        }
        try {
            return MediaBrowserCompatItemReceiver;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdaonRepeatModeChanged39.class);
            return null;
        }
    }

    private static void MediaBrowserCompatItemReceiver() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonRepeatModeChanged39.class)) {
            return;
        }
        try {
            if (lambdaonMediaMetadataChanged48.onAddQueueItem() && AudioAttributesImplApi26Parcelizer.compareAndSet(false, true)) {
                AudioAttributesImplBaseParcelizer = lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer().getSharedPreferences("com.facebook.sdk.USER_SETTINGS", 0);
                write(write, AudioAttributesCompatParcelizer, read);
                MediaBrowserCompatCustomActionResultReceiver();
                MediaBrowserCompatSearchResultReceiver();
                MediaBrowserCompatMediaItem();
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdaonRepeatModeChanged39.class);
        }
    }

    private static void write(AudioAttributesCompatParcelizer... audioAttributesCompatParcelizerArr) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonRepeatModeChanged39.class)) {
            return;
        }
        for (AudioAttributesCompatParcelizer audioAttributesCompatParcelizer : audioAttributesCompatParcelizerArr) {
            try {
                if (audioAttributesCompatParcelizer == RemoteActionCompatParcelizer) {
                    MediaBrowserCompatCustomActionResultReceiver();
                } else if (audioAttributesCompatParcelizer.read == null) {
                    write(audioAttributesCompatParcelizer);
                    if (audioAttributesCompatParcelizer.read == null) {
                        IconCompatParcelizer(audioAttributesCompatParcelizer);
                    }
                } else {
                    RemoteActionCompatParcelizer(audioAttributesCompatParcelizer);
                }
            } catch (Throwable th) {
                getMinWindowSequenceNumber.read(th, lambdaonRepeatModeChanged39.class);
                return;
            }
        }
    }

    private static void MediaBrowserCompatCustomActionResultReceiver() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonRepeatModeChanged39.class)) {
            return;
        }
        try {
            write(RemoteActionCompatParcelizer);
            final long jCurrentTimeMillis = System.currentTimeMillis();
            if (RemoteActionCompatParcelizer.read == null || jCurrentTimeMillis - RemoteActionCompatParcelizer.write >= 604800000) {
                RemoteActionCompatParcelizer.read = null;
                RemoteActionCompatParcelizer.write = 0L;
                if (MediaBrowserCompatItemReceiver.compareAndSet(false, true)) {
                    lambdaonMediaMetadataChanged48.MediaBrowserCompatCustomActionResultReceiver().execute(new Runnable() { // from class: o.lambdaonRepeatModeChanged39.5
                        @Override // java.lang.Runnable
                        public final void run() {
                            DefaultAnalyticsCollectorExternalSyntheticLambda6 defaultAnalyticsCollectorExternalSyntheticLambda6AudioAttributesCompatParcelizer;
                            if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                                return;
                            }
                            try {
                                if (lambdaonRepeatModeChanged39.AudioAttributesCompatParcelizer().IconCompatParcelizer() && (defaultAnalyticsCollectorExternalSyntheticLambda6AudioAttributesCompatParcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda61.AudioAttributesCompatParcelizer(lambdaonMediaMetadataChanged48.write(), false)) != null && defaultAnalyticsCollectorExternalSyntheticLambda6AudioAttributesCompatParcelizer.getRead()) {
                                    DefaultAnalyticsCollectorExternalSyntheticLambda51 defaultAnalyticsCollectorExternalSyntheticLambda51Write = DefaultAnalyticsCollectorExternalSyntheticLambda51.write(lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer());
                                    if (((defaultAnalyticsCollectorExternalSyntheticLambda51Write == null || defaultAnalyticsCollectorExternalSyntheticLambda51Write.RemoteActionCompatParcelizer() == null) ? null : defaultAnalyticsCollectorExternalSyntheticLambda51Write.RemoteActionCompatParcelizer()) != null) {
                                        Bundle bundle = new Bundle();
                                        bundle.putString("advertiser_id", defaultAnalyticsCollectorExternalSyntheticLambda51Write.RemoteActionCompatParcelizer());
                                        bundle.putString("fields", "auto_event_setup_enabled");
                                        GraphRequest graphRequestAudioAttributesCompatParcelizer = GraphRequest.AudioAttributesCompatParcelizer(lambdaonMediaMetadataChanged48.write());
                                        graphRequestAudioAttributesCompatParcelizer.onAddQueueItem();
                                        graphRequestAudioAttributesCompatParcelizer.read(bundle);
                                        JSONObject read2 = graphRequestAudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver().getRead();
                                        if (read2 != null) {
                                            lambdaonRepeatModeChanged39.RemoteActionCompatParcelizer().read = Boolean.valueOf(read2.optBoolean("auto_event_setup_enabled", false));
                                            lambdaonRepeatModeChanged39.RemoteActionCompatParcelizer().write = jCurrentTimeMillis;
                                            lambdaonRepeatModeChanged39.read(lambdaonRepeatModeChanged39.RemoteActionCompatParcelizer());
                                        }
                                    }
                                }
                                lambdaonRepeatModeChanged39.write().set(false);
                            } catch (Throwable th) {
                                getMinWindowSequenceNumber.read(th, this);
                            }
                        }
                    });
                }
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdaonRepeatModeChanged39.class);
        }
    }

    private static void RemoteActionCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonRepeatModeChanged39.class)) {
            return;
        }
        try {
            RatingCompat();
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(AppMeasurementSdk.ConditionalUserProperty.VALUE, audioAttributesCompatParcelizer.read);
                jSONObject.put("last_timestamp", audioAttributesCompatParcelizer.write);
                AudioAttributesImplBaseParcelizer.edit().putString(audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer, jSONObject.toString()).commit();
                MediaBrowserCompatMediaItem();
            } catch (Exception e) {
                DefaultAnalyticsCollectorMediaPeriodQueueTracker.IconCompatParcelizer(IconCompatParcelizer, e);
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdaonRepeatModeChanged39.class);
        }
    }

    private static void write(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonRepeatModeChanged39.class)) {
            return;
        }
        try {
            RatingCompat();
            try {
                String string = AudioAttributesImplBaseParcelizer.getString(audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer, "");
                if (string.isEmpty()) {
                    return;
                }
                JSONObject jSONObject = new JSONObject(string);
                audioAttributesCompatParcelizer.read = Boolean.valueOf(jSONObject.getBoolean(AppMeasurementSdk.ConditionalUserProperty.VALUE));
                audioAttributesCompatParcelizer.write = jSONObject.getLong("last_timestamp");
                return;
            } catch (JSONException e) {
                DefaultAnalyticsCollectorMediaPeriodQueueTracker.IconCompatParcelizer(IconCompatParcelizer, e);
                return;
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdaonRepeatModeChanged39.class);
        }
        getMinWindowSequenceNumber.read(th, lambdaonRepeatModeChanged39.class);
    }

    private static void IconCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonRepeatModeChanged39.class)) {
            return;
        }
        try {
            RatingCompat();
            try {
                Context contextAudioAttributesCompatParcelizer = lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer();
                ApplicationInfo applicationInfo = contextAudioAttributesCompatParcelizer.getPackageManager().getApplicationInfo(contextAudioAttributesCompatParcelizer.getPackageName(), 128);
                if (applicationInfo == null || ((PackageItemInfo) applicationInfo).metaData == null || !((PackageItemInfo) applicationInfo).metaData.containsKey(audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer)) {
                    return;
                }
                audioAttributesCompatParcelizer.read = Boolean.valueOf(((PackageItemInfo) applicationInfo).metaData.getBoolean(audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer, audioAttributesCompatParcelizer.IconCompatParcelizer));
            } catch (PackageManager.NameNotFoundException e) {
                DefaultAnalyticsCollectorMediaPeriodQueueTracker.IconCompatParcelizer(IconCompatParcelizer, e);
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdaonRepeatModeChanged39.class);
        }
    }

    private static void MediaBrowserCompatSearchResultReceiver() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonRepeatModeChanged39.class)) {
            return;
        }
        try {
            Context contextAudioAttributesCompatParcelizer = lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer();
            ApplicationInfo applicationInfo = contextAudioAttributesCompatParcelizer.getPackageManager().getApplicationInfo(contextAudioAttributesCompatParcelizer.getPackageName(), 128);
            if (applicationInfo == null || ((PackageItemInfo) applicationInfo).metaData == null) {
                return;
            }
            ((PackageItemInfo) applicationInfo).metaData.containsKey("com.facebook.sdk.AutoLogAppEventsEnabled");
            ((PackageItemInfo) applicationInfo).metaData.containsKey("com.facebook.sdk.AdvertiserIDCollectionEnabled");
            read();
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdaonRepeatModeChanged39.class);
        }
    }

    private static void MediaBrowserCompatMediaItem() {
        int i;
        ApplicationInfo applicationInfo;
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonRepeatModeChanged39.class)) {
            return;
        }
        try {
            if (AudioAttributesImplApi26Parcelizer.get() && lambdaonMediaMetadataChanged48.onAddQueueItem()) {
                Context contextAudioAttributesCompatParcelizer = lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer();
                int i2 = (read.IconCompatParcelizer() ? 1 : 0) | ((write.IconCompatParcelizer() ? 1 : 0) << 1) | ((AudioAttributesCompatParcelizer.IconCompatParcelizer() ? 1 : 0) << 2) | ((MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer() ? 1 : 0) << 3);
                int i3 = 0;
                int i4 = AudioAttributesImplBaseParcelizer.getInt("com.facebook.sdk.USER_SETTINGS_BITMASK", 0);
                if (i4 != i2) {
                    AudioAttributesImplBaseParcelizer.edit().putInt("com.facebook.sdk.USER_SETTINGS_BITMASK", i2).commit();
                    try {
                        applicationInfo = contextAudioAttributesCompatParcelizer.getPackageManager().getApplicationInfo(contextAudioAttributesCompatParcelizer.getPackageName(), 128);
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    if (applicationInfo == null || ((PackageItemInfo) applicationInfo).metaData == null) {
                        i = 0;
                    } else {
                        String[] strArr = {"com.facebook.sdk.AutoInitEnabled", "com.facebook.sdk.AutoLogAppEventsEnabled", "com.facebook.sdk.AdvertiserIDCollectionEnabled", "com.facebook.sdk.MonitorEnabled"};
                        boolean[] zArr = {true, true, true, true};
                        i = 0;
                        for (int i5 = 0; i5 < 4; i5++) {
                            try {
                                i3 |= (((PackageItemInfo) applicationInfo).metaData.containsKey(strArr[i5]) ? 1 : 0) << i5;
                                i |= (((PackageItemInfo) applicationInfo).metaData.getBoolean(strArr[i5], zArr[i5]) ? 1 : 0) << i5;
                            } catch (PackageManager.NameNotFoundException unused2) {
                            }
                        }
                    }
                    lambdaonVideoFrameProcessingOffset20 lambdaonvideoframeprocessingoffset20 = new lambdaonVideoFrameProcessingOffset20(contextAudioAttributesCompatParcelizer);
                    Bundle bundle = new Bundle();
                    bundle.putInt("usage", i3);
                    bundle.putInt("initial", i);
                    bundle.putInt("previous", i4);
                    bundle.putInt("current", i2);
                    lambdaonvideoframeprocessingoffset20.IconCompatParcelizer(bundle);
                }
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdaonRepeatModeChanged39.class);
        }
    }

    static void AudioAttributesImplBaseParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonRepeatModeChanged39.class)) {
            return;
        }
        try {
            Context contextAudioAttributesCompatParcelizer = lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer();
            ApplicationInfo applicationInfo = contextAudioAttributesCompatParcelizer.getPackageManager().getApplicationInfo(contextAudioAttributesCompatParcelizer.getPackageName(), 128);
            if (applicationInfo == null || ((PackageItemInfo) applicationInfo).metaData == null || !((PackageItemInfo) applicationInfo).metaData.getBoolean("com.facebook.sdk.AutoAppLinkEnabled", false)) {
                return;
            }
            lambdaonVideoFrameProcessingOffset20 lambdaonvideoframeprocessingoffset20 = new lambdaonVideoFrameProcessingOffset20(contextAudioAttributesCompatParcelizer);
            Bundle bundle = new Bundle();
            if (!DefaultAnalyticsCollectorMediaPeriodQueueTracker.IconCompatParcelizer()) {
                bundle.putString("SchemeWarning", "You haven't set the Auto App Link URL scheme: fb<YOUR APP ID> in AndroidManifest");
            }
            lambdaonvideoframeprocessingoffset20.IconCompatParcelizer("fb_auto_applink", bundle);
        } catch (PackageManager.NameNotFoundException unused) {
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdaonRepeatModeChanged39.class);
        }
    }

    private static void RatingCompat() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonRepeatModeChanged39.class)) {
            return;
        }
        try {
            if (AudioAttributesImplApi26Parcelizer.get()) {
            } else {
                throw new lambdaonMediaItemTransition30("The UserSettingManager has not been initialized successfully");
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdaonRepeatModeChanged39.class);
        }
    }

    public static boolean IconCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonRepeatModeChanged39.class)) {
            return false;
        }
        try {
            MediaBrowserCompatItemReceiver();
            return read.IconCompatParcelizer();
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdaonRepeatModeChanged39.class);
            return false;
        }
    }

    public static boolean AudioAttributesImplApi21Parcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonRepeatModeChanged39.class)) {
            return false;
        }
        try {
            MediaBrowserCompatItemReceiver();
            return write.IconCompatParcelizer();
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdaonRepeatModeChanged39.class);
            return false;
        }
    }

    public static boolean read() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonRepeatModeChanged39.class)) {
            return false;
        }
        try {
            MediaBrowserCompatItemReceiver();
            return AudioAttributesCompatParcelizer.IconCompatParcelizer();
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdaonRepeatModeChanged39.class);
            return false;
        }
    }

    public static boolean AudioAttributesImplApi26Parcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdaonRepeatModeChanged39.class)) {
            return false;
        }
        try {
            MediaBrowserCompatItemReceiver();
            return RemoteActionCompatParcelizer.IconCompatParcelizer();
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdaonRepeatModeChanged39.class);
            return false;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class AudioAttributesCompatParcelizer {
        String AudioAttributesCompatParcelizer;
        boolean IconCompatParcelizer;
        Boolean read;
        long write;

        AudioAttributesCompatParcelizer(boolean z, String str) {
            this.IconCompatParcelizer = z;
            this.AudioAttributesCompatParcelizer = str;
        }

        final boolean IconCompatParcelizer() {
            Boolean bool = this.read;
            return bool == null ? this.IconCompatParcelizer : bool.booleanValue();
        }
    }
}
