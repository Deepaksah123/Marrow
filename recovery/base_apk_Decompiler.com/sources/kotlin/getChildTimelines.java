package kotlin;

import android.app.UiModeManager;
import android.app.usage.UsageStatsManager;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Insets;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Callable;
import kotlin.RendererCapabilitiesAdaptiveSupport;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class getChildTimelines {
    private static int AudioAttributesCompatParcelizer = -1;
    private final CleverTapInstanceConfig IconCompatParcelizer;
    private final Context MediaBrowserCompatCustomActionResultReceiver;
    private final copyWithPlaceholderTimeline RatingCompat;
    private IconCompatParcelizer write;
    private final Object read = new Object();
    private boolean RemoteActionCompatParcelizer = false;
    private final Object AudioAttributesImplApi21Parcelizer = new Object();
    private boolean AudioAttributesImplBaseParcelizer = false;
    private String AudioAttributesImplApi26Parcelizer = null;
    private boolean MediaMetadataCompat = false;
    private final ArrayList<generateMediaPeriodEventTime> MediaDescriptionCompat = new ArrayList<>();
    private String MediaBrowserCompatSearchResultReceiver = null;
    private String MediaBrowserCompatItemReceiver = null;

    /* JADX INFO: loaded from: classes2.dex */
    class IconCompatParcelizer {
        private final String AudioAttributesImplApi21Parcelizer;
        private final int AudioAttributesImplBaseParcelizer;
        private final double MediaBrowserCompatCustomActionResultReceiver;
        private int MediaBrowserCompatItemReceiver;
        private final double onCustomAction;
        private final String write;
        private final String MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = MediaDescriptionCompat();
        private final String MediaBrowserCompatSearchResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        private final String MediaMetadataCompat = MediaBrowserCompatMediaItem();
        private final String AudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
        private final String MediaBrowserCompatMediaItem = MediaBrowserCompatItemReceiver();
        private final String AudioAttributesCompatParcelizer = IconCompatParcelizer();
        private final int IconCompatParcelizer = AudioAttributesCompatParcelizer();
        private final String MediaDescriptionCompat = AudioAttributesImplBaseParcelizer();
        private final String read = RemoteActionCompatParcelizer();
        private final String RemoteActionCompatParcelizer = write();
        private final int RatingCompat = 70500;

        static /* synthetic */ int AudioAttributesImplBaseParcelizer(IconCompatParcelizer iconCompatParcelizer) {
            int i = iconCompatParcelizer.MediaBrowserCompatItemReceiver;
            iconCompatParcelizer.MediaBrowserCompatItemReceiver = i + 1;
            return i;
        }

        IconCompatParcelizer() {
            RemoteActionCompatParcelizer remoteActionCompatParcelizerMediaMetadataCompat = MediaMetadataCompat();
            this.onCustomAction = remoteActionCompatParcelizerMediaMetadataCompat.read;
            this.MediaBrowserCompatCustomActionResultReceiver = remoteActionCompatParcelizerMediaMetadataCompat.IconCompatParcelizer;
            this.AudioAttributesImplBaseParcelizer = remoteActionCompatParcelizerMediaMetadataCompat.RemoteActionCompatParcelizer;
            this.MediaBrowserCompatItemReceiver = getChildTimelines.this.onSkipToQueueItem();
            this.AudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
            this.write = read();
        }

        private RemoteActionCompatParcelizer MediaMetadataCompat() {
            int iWidth;
            int iHeight;
            float f;
            float f2;
            int i;
            WindowManager windowManagerOnSkipToNext = getChildTimelines.this.onSkipToNext();
            if (windowManagerOnSkipToNext == null) {
                RendererWakeupListener.MediaMetadataCompat();
                return new RemoteActionCompatParcelizer(0, 0.0d, 0.0d);
            }
            if (Build.VERSION.SDK_INT >= 30) {
                WindowMetrics currentWindowMetrics = windowManagerOnSkipToNext.getCurrentWindowMetrics();
                Configuration configuration = getChildTimelines.this.MediaBrowserCompatCustomActionResultReceiver.getResources().getConfiguration();
                Insets insetsIgnoringVisibility = currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemGestures());
                iWidth = (currentWindowMetrics.getBounds().width() - insetsIgnoringVisibility.right) - insetsIgnoringVisibility.left;
                iHeight = (currentWindowMetrics.getBounds().height() - insetsIgnoringVisibility.top) - insetsIgnoringVisibility.bottom;
                f = configuration.densityDpi;
                f2 = configuration.densityDpi;
                i = configuration.densityDpi;
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManagerOnSkipToNext.getDefaultDisplay().getMetrics(displayMetrics);
                iWidth = displayMetrics.widthPixels;
                iHeight = displayMetrics.heightPixels;
                f = displayMetrics.xdpi;
                f2 = displayMetrics.ydpi;
                i = displayMetrics.densityDpi;
            }
            return new RemoteActionCompatParcelizer(i, RemoteActionCompatParcelizer(iWidth / f), RemoteActionCompatParcelizer(iHeight / f2));
        }

        private String RemoteActionCompatParcelizer() {
            if (!getChildTimelines.this.MediaBrowserCompatCustomActionResultReceiver.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
                if (getChildTimelines.this.MediaBrowserCompatCustomActionResultReceiver.getPackageManager().hasSystemFeature("android.hardware.bluetooth")) {
                    return "classic";
                }
                return "none";
            }
            return "ble";
        }

        private int AudioAttributesCompatParcelizer() {
            try {
                return getChildTimelines.this.MediaBrowserCompatCustomActionResultReceiver.getPackageManager().getPackageInfo(getChildTimelines.this.MediaBrowserCompatCustomActionResultReceiver.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                RendererWakeupListener.MediaBrowserCompatItemReceiver();
                return 0;
            }
        }

        private String IconCompatParcelizer() {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) getChildTimelines.this.MediaBrowserCompatCustomActionResultReceiver.getSystemService("phone");
                if (telephonyManager != null) {
                    return telephonyManager.getNetworkOperatorName();
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }

        private String write() {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) getChildTimelines.this.MediaBrowserCompatCustomActionResultReceiver.getSystemService("phone");
                return telephonyManager != null ? telephonyManager.getSimCountryIso() : "";
            } catch (Throwable unused) {
                return "";
            }
        }

        private static String AudioAttributesImplApi26Parcelizer() {
            return Build.MANUFACTURER;
        }

        private String read() {
            int appStandbyBucket = ((UsageStatsManager) getChildTimelines.this.MediaBrowserCompatCustomActionResultReceiver.getSystemService("usagestats")).getAppStandbyBucket();
            if (appStandbyBucket == 10) {
                return AppMeasurementSdk.ConditionalUserProperty.ACTIVE;
            }
            if (appStandbyBucket == 20) {
                return "working_set";
            }
            if (appStandbyBucket == 30) {
                return "frequent";
            }
            if (appStandbyBucket == 40) {
                return "rare";
            }
            if (appStandbyBucket == 45) {
                return "restricted";
            }
            return "";
        }

        private static String MediaBrowserCompatItemReceiver() {
            return Build.MODEL.replace(AudioAttributesImplApi26Parcelizer(), "");
        }

        private String AudioAttributesImplBaseParcelizer() {
            return RendererCapabilitiesListener.RemoteActionCompatParcelizer(getChildTimelines.this.MediaBrowserCompatCustomActionResultReceiver);
        }

        private static String MediaBrowserCompatCustomActionResultReceiver() {
            return "Android";
        }

        private static String MediaBrowserCompatMediaItem() {
            return Build.VERSION.RELEASE;
        }

        private String MediaDescriptionCompat() {
            try {
                return getChildTimelines.this.MediaBrowserCompatCustomActionResultReceiver.getPackageManager().getPackageInfo(getChildTimelines.this.MediaBrowserCompatCustomActionResultReceiver.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException unused) {
                RendererWakeupListener.MediaBrowserCompatItemReceiver();
                return null;
            }
        }

        private static String AudioAttributesImplApi21Parcelizer() {
            String language = Locale.getDefault().getLanguage();
            if ("".equals(language)) {
                language = "xx";
            }
            String country = Locale.getDefault().getCountry();
            if ("".equals(country)) {
                country = "XX";
            }
            StringBuilder sb = new StringBuilder();
            sb.append(language);
            sb.append("_");
            sb.append(country);
            return sb.toString();
        }

        private static double RemoteActionCompatParcelizer(double d) {
            return Math.round(d * 100.0d) / 100.0d;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static class RemoteActionCompatParcelizer {
        public final double IconCompatParcelizer;
        public final int RemoteActionCompatParcelizer;
        public final double read;

        public RemoteActionCompatParcelizer(int i, double d, double d2) {
            this.RemoteActionCompatParcelizer = i;
            this.read = d;
            this.IconCompatParcelizer = d2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WindowManager onSkipToNext() {
        Display display;
        if (this.MediaBrowserCompatCustomActionResultReceiver == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                DisplayManager displayManager = (DisplayManager) this.MediaBrowserCompatCustomActionResultReceiver.getSystemService(DisplayManager.class);
                if (displayManager != null && (display = displayManager.getDisplay(0)) != null) {
                    return (WindowManager) this.MediaBrowserCompatCustomActionResultReceiver.createDisplayContext(display).createWindowContext(2, null).getSystemService(WindowManager.class);
                }
            } catch (Exception e) {
                e.getMessage();
                RendererWakeupListener.MediaMetadataCompat();
            }
        }
        return (WindowManager) this.MediaBrowserCompatCustomActionResultReceiver.getSystemService("window");
    }

    public static int IconCompatParcelizer(Context context) {
        return ((PackageItemInfo) context.getApplicationInfo()).icon;
    }

    public static int AudioAttributesCompatParcelizer(Context context) {
        if (AudioAttributesCompatParcelizer == -1) {
            try {
                if (((UiModeManager) context.getSystemService("uimode")).getCurrentModeType() == 4) {
                    AudioAttributesCompatParcelizer = 3;
                    return 3;
                }
            } catch (Exception e) {
                RendererWakeupListener.MediaBrowserCompatItemReceiver();
                e.printStackTrace();
            }
            try {
                AudioAttributesCompatParcelizer = context.getResources().getBoolean(RendererCapabilitiesAdaptiveSupport.AudioAttributesCompatParcelizer.ctIsTablet) ? 2 : 1;
            } catch (Exception e2) {
                RendererWakeupListener.MediaBrowserCompatItemReceiver();
                e2.printStackTrace();
                AudioAttributesCompatParcelizer = 0;
            }
        }
        return AudioAttributesCompatParcelizer;
    }

    getChildTimelines(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, copyWithPlaceholderTimeline copywithplaceholdertimeline) {
        this.MediaBrowserCompatCustomActionResultReceiver = context;
        this.IconCompatParcelizer = cleverTapInstanceConfig;
        this.RatingCompat = copywithplaceholdertimeline;
    }

    public final void write() {
        IconCompatParcelizer(onSetShuffleMode());
    }

    public final String RemoteActionCompatParcelizer(String str) {
        if (RendererCapabilitiesListener.write(str)) {
            RendererWakeupListener rendererWakeupListenerOnSetRating = onSetRating();
            this.IconCompatParcelizer.write();
            rendererWakeupListenerOnSetRating.AudioAttributesCompatParcelizer();
            String strConcat = "__h".concat(String.valueOf(str));
            IconCompatParcelizer(strConcat);
            return strConcat;
        }
        String strOnSetPlaybackSpeed = onSetPlaybackSpeed();
        ParcelableVolumeInfo();
        RemoteActionCompatParcelizer(21, str, setSessionImpl());
        RendererWakeupListener rendererWakeupListenerOnSetRating2 = onSetRating();
        this.IconCompatParcelizer.write();
        rendererWakeupListenerOnSetRating2.AudioAttributesCompatParcelizer();
        return strOnSetPlaybackSpeed;
    }

    public final void IconCompatParcelizer(String str) {
        onSetRating().write(this.IconCompatParcelizer.write(), "Force updating the device ID to ".concat(String.valueOf(str)));
        synchronized (this.AudioAttributesImplApi21Parcelizer) {
            RendererCapabilitiesFormatSupport.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, onStop(), str);
        }
    }

    public final JSONObject IconCompatParcelizer() {
        try {
            return AnalyticsCollector.write(this, this.RatingCompat, this.AudioAttributesImplBaseParcelizer, RatingCompat() != null ? new setPlayerError(this.MediaBrowserCompatCustomActionResultReceiver, this.IconCompatParcelizer).RemoteActionCompatParcelizer() : false);
        } catch (Throwable unused) {
            RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = this.IconCompatParcelizer.MediaBrowserCompatItemReceiver();
            this.IconCompatParcelizer.write();
            rendererWakeupListenerMediaBrowserCompatItemReceiver.IconCompatParcelizer();
            return new JSONObject();
        }
    }

    public final String RemoteActionCompatParcelizer() {
        return onSetRepeatMode().read;
    }

    public final int read() {
        return onSetRepeatMode().IconCompatParcelizer;
    }

    public final String AudioAttributesImplBaseParcelizer() {
        return onSetRepeatMode().AudioAttributesCompatParcelizer;
    }

    public final Context MediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final String AudioAttributesImplApi26Parcelizer() {
        return onSetRepeatMode().RemoteActionCompatParcelizer;
    }

    public final int AudioAttributesImplApi21Parcelizer() {
        return onSetRepeatMode().AudioAttributesImplBaseParcelizer;
    }

    public final String MediaBrowserCompatCustomActionResultReceiver() {
        String strOnRemoveQueueItemAt = onRemoveQueueItemAt();
        return strOnRemoveQueueItemAt != null ? strOnRemoveQueueItemAt : setSessionImpl();
    }

    public final String RatingCompat() {
        String str;
        synchronized (this.read) {
            str = this.AudioAttributesImplApi26Parcelizer;
        }
        return str;
    }

    public final double MediaBrowserCompatMediaItem() {
        return onSetRepeatMode().MediaBrowserCompatCustomActionResultReceiver;
    }

    public final String MediaBrowserCompatSearchResultReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final String onCustomAction() {
        return onSetRepeatMode().AudioAttributesImplApi26Parcelizer;
    }

    public final String AudioAttributesCompatParcelizer() {
        return onSetRepeatMode().write;
    }

    public final String handleMediaPlayPauseIfPendingOnHandler() {
        return onSetRepeatMode().MediaBrowserCompatMediaItem;
    }

    public final String onAddQueueItem() {
        return onSetRepeatMode().MediaDescriptionCompat;
    }

    public final String MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return onSetRepeatMode().MediaBrowserCompatSearchResultReceiver;
    }

    public final String onCommand() {
        return onSetRepeatMode().MediaMetadataCompat;
    }

    public final int onMediaButtonEvent() {
        return onSetRepeatMode().RatingCompat;
    }

    public final int MediaMetadataCompat() {
        return onSetRepeatMode().MediaBrowserCompatItemReceiver;
    }

    public final void onPlay() {
        IconCompatParcelizer.AudioAttributesImplBaseParcelizer(onSetRepeatMode());
    }

    private String PlaybackStateCompat() {
        return onSetRepeatMode().AudioAttributesImplApi21Parcelizer;
    }

    private String MediaSessionCompatQueueItem() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final String MediaDescriptionCompat() {
        return TextUtils.isEmpty(MediaSessionCompatQueueItem()) ? PlaybackStateCompat() : MediaSessionCompatQueueItem();
    }

    public final ArrayList<generateMediaPeriodEventTime> onPlayFromMediaId() {
        ArrayList<generateMediaPeriodEventTime> arrayList = (ArrayList) this.MediaDescriptionCompat.clone();
        this.MediaDescriptionCompat.clear();
        return arrayList;
    }

    public final String onPause() {
        return onSetRepeatMode().MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final double onFastForward() {
        return onSetRepeatMode().onCustomAction;
    }

    public final Boolean onPlayFromSearch() {
        BluetoothAdapter defaultAdapter;
        try {
            if (this.MediaBrowserCompatCustomActionResultReceiver.getPackageManager().checkPermission("android.permission.BLUETOOTH", this.MediaBrowserCompatCustomActionResultReceiver.getPackageName()) != 0 || (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) == null) {
                return null;
            }
            return Boolean.valueOf(defaultAdapter.isEnabled());
        } catch (Throwable unused) {
            return null;
        }
    }

    public final boolean onPrepare() {
        String strMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        return strMediaBrowserCompatCustomActionResultReceiver != null && strMediaBrowserCompatCustomActionResultReceiver.startsWith("__i");
    }

    public final boolean onPlayFromUri() {
        boolean z;
        synchronized (this.read) {
            z = this.MediaMetadataCompat;
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Boolean onPrepareFromSearch() {
        /*
            r2 = this;
            android.content.Context r0 = r2.MediaBrowserCompatCustomActionResultReceiver
            java.lang.String r1 = "android.permission.ACCESS_NETWORK_STATE"
            int r0 = r0.checkCallingOrSelfPermission(r1)
            if (r0 != 0) goto L2f
            android.content.Context r2 = r2.MediaBrowserCompatCustomActionResultReceiver
            java.lang.String r0 = "connectivity"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.net.ConnectivityManager r2 = (android.net.ConnectivityManager) r2
            if (r2 == 0) goto L2f
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()
            if (r2 == 0) goto L29
            int r0 = r2.getType()
            r1 = 1
            if (r0 != r1) goto L29
            boolean r2 = r2.isConnected()
            if (r2 != 0) goto L2a
        L29:
            r1 = 0
        L2a:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            return r2
        L2f:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getChildTimelines.onPrepareFromSearch():java.lang.Boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int onSkipToQueueItem() {
        return RendererCapabilitiesFormatSupport.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, "local_in_app_count", 0);
    }

    final void write(final String str) {
        RendererWakeupListener rendererWakeupListenerOnSetRating = onSetRating();
        StringBuilder sb = new StringBuilder();
        sb.append(this.IconCompatParcelizer.write());
        sb.append(":async_deviceID");
        rendererWakeupListenerOnSetRating.write(sb.toString(), "DeviceInfo() called");
        TracksExternalSyntheticLambda0.AudioAttributesCompatParcelizer(this.IconCompatParcelizer).IconCompatParcelizer().read("getDeviceCachedInfo", new Callable<Void>() { // from class: o.getChildTimelines.3
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public Void call() throws Exception {
                getChildTimelines.this.onSetRepeatMode();
                return null;
            }
        });
        isTrackSupported istracksupportedIconCompatParcelizer = TracksExternalSyntheticLambda0.AudioAttributesCompatParcelizer(this.IconCompatParcelizer).IconCompatParcelizer();
        istracksupportedIconCompatParcelizer.RemoteActionCompatParcelizer(new TracksGroupExternalSyntheticLambda0() { // from class: o.getPeriodCount
            @Override // kotlin.TracksGroupExternalSyntheticLambda0
            public final void read(Object obj) {
                this.write.read((String) obj);
            }
        });
        istracksupportedIconCompatParcelizer.read("initDeviceID", new Callable<String>() { // from class: o.getChildTimelines.1
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public String call() throws Exception {
                return getChildTimelines.this.AudioAttributesCompatParcelizer(str);
            }
        });
    }

    final /* synthetic */ void read(String str) {
        RendererWakeupListener rendererWakeupListenerOnSetRating = onSetRating();
        StringBuilder sb = new StringBuilder();
        sb.append(this.IconCompatParcelizer.write());
        sb.append(":async_deviceID");
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder("DeviceID initialized successfully!");
        sb2.append(Thread.currentThread());
        rendererWakeupListenerOnSetRating.write(string, sb2.toString());
        PlayerTimelineChangeReason.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, this.IconCompatParcelizer).AudioAttributesCompatParcelizer(str);
    }

    public final void onPrepareFromMediaId() {
        String strMediaSessionCompatToken = MediaSessionCompatToken();
        if (strMediaSessionCompatToken == null) {
            this.IconCompatParcelizer.MediaBrowserCompatItemReceiver().write(this.IconCompatParcelizer.write(), "Unable to set current user OptOut state from storage: storage key is null");
            return;
        }
        boolean zIconCompatParcelizer = RendererCapabilitiesFormatSupport.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, this.IconCompatParcelizer, strMediaSessionCompatToken);
        this.RatingCompat.write(zIconCompatParcelizer);
        RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = this.IconCompatParcelizer.MediaBrowserCompatItemReceiver();
        String strWrite = this.IconCompatParcelizer.write();
        StringBuilder sb = new StringBuilder("Set current user OptOut state from storage to: ");
        sb.append(zIconCompatParcelizer);
        sb.append(" for key: ");
        sb.append(strMediaSessionCompatToken);
        rendererWakeupListenerMediaBrowserCompatItemReceiver.write(strWrite, sb.toString());
    }

    public final void onRemoveQueueItem() {
        String strOnSeekTo = onSeekTo();
        if (strOnSeekTo == null) {
            this.IconCompatParcelizer.MediaBrowserCompatItemReceiver().write(this.IconCompatParcelizer.write(), "Unable to set current user allowed system events and communications flag from storage: storage key is null");
            return;
        }
        boolean zIconCompatParcelizer = RendererCapabilitiesFormatSupport.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, this.IconCompatParcelizer, strOnSeekTo);
        this.RatingCompat.read(zIconCompatParcelizer);
        RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = this.IconCompatParcelizer.MediaBrowserCompatItemReceiver();
        String strWrite = this.IconCompatParcelizer.write();
        StringBuilder sb = new StringBuilder("Set current user allowed system events and communications flag state from storage to: ");
        sb.append(zIconCompatParcelizer);
        sb.append(" for key: ");
        sb.append(strOnSeekTo);
        rendererWakeupListenerMediaBrowserCompatItemReceiver.write(strWrite, sb.toString());
    }

    private String MediaSessionCompatToken() {
        String strMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        if (strMediaBrowserCompatCustomActionResultReceiver == null) {
            return null;
        }
        return "OptOut:".concat(String.valueOf(strMediaBrowserCompatCustomActionResultReceiver));
    }

    private String onSeekTo() {
        String strMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        if (strMediaBrowserCompatCustomActionResultReceiver == null) {
            return null;
        }
        return "allowSystemEvents:".concat(String.valueOf(strMediaBrowserCompatCustomActionResultReceiver));
    }

    final void onRewind() {
        boolean zIconCompatParcelizer = RendererCapabilitiesFormatSupport.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, this.IconCompatParcelizer, "NetworkInfo");
        this.IconCompatParcelizer.MediaBrowserCompatItemReceiver().write(this.IconCompatParcelizer.write(), "Setting device network info reporting state from storage to ".concat(String.valueOf(zIconCompatParcelizer)));
        this.AudioAttributesImplBaseParcelizer = zIconCompatParcelizer;
    }

    private String onRemoveQueueItemAt() {
        String strWrite = RendererCapabilitiesFormatSupport.write(this.MediaBrowserCompatCustomActionResultReceiver, onStop(), (String) null);
        return (this.IconCompatParcelizer.MediaBrowserCompatSearchResultReceiver() && strWrite == null) ? RendererCapabilitiesFormatSupport.write(this.MediaBrowserCompatCustomActionResultReceiver, "deviceId", (String) null) : strWrite;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a3 A[Catch: all -> 0x006c, TRY_LEAVE, TryCatch #2 {all -> 0x006c, blocks: (B:11:0x0065, B:17:0x006f, B:19:0x00a3), top: B:58:0x0065, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b5 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void onPrepareFromUri() {
        /*
            Method dump skipped, instruction units count: 379
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getChildTimelines.onPrepareFromUri():void");
    }

    private String onSetCaptioningEnabled() {
        String strOnSetShuffleMode;
        String string;
        synchronized (this) {
            RendererWakeupListener rendererWakeupListenerOnSetRating = onSetRating();
            StringBuilder sb = new StringBuilder();
            sb.append(this.IconCompatParcelizer.write());
            sb.append(":async_deviceID");
            rendererWakeupListenerOnSetRating.write(sb.toString(), "generateDeviceID() called!");
            String strRatingCompat = RatingCompat();
            if (strRatingCompat != null) {
                StringBuilder sb2 = new StringBuilder("__g");
                sb2.append(strRatingCompat);
                string = sb2.toString();
            } else {
                synchronized (this.AudioAttributesImplApi21Parcelizer) {
                    strOnSetShuffleMode = onSetShuffleMode();
                }
                string = strOnSetShuffleMode;
            }
            IconCompatParcelizer(string);
            RendererWakeupListener rendererWakeupListenerOnSetRating2 = onSetRating();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.IconCompatParcelizer.write());
            sb3.append(":async_deviceID");
            rendererWakeupListenerOnSetRating2.write(sb3.toString(), "generateDeviceID() done executing!");
        }
        return string;
    }

    private static String onSetShuffleMode() {
        StringBuilder sb = new StringBuilder("__");
        sb.append(UUID.randomUUID().toString().replace("-", ""));
        return sb.toString();
    }

    private RendererWakeupListener onSetRating() {
        return this.IconCompatParcelizer.MediaBrowserCompatItemReceiver();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public IconCompatParcelizer onSetRepeatMode() {
        if (this.write == null) {
            this.write = new IconCompatParcelizer();
        }
        return this.write;
    }

    private String onStop() {
        StringBuilder sb = new StringBuilder("deviceId:");
        sb.append(this.IconCompatParcelizer.write());
        return sb.toString();
    }

    private String setSessionImpl() {
        return RendererCapabilitiesFormatSupport.write(this.MediaBrowserCompatCustomActionResultReceiver, onSkipToPrevious(), (String) null);
    }

    private String onSkipToPrevious() {
        StringBuilder sb = new StringBuilder("fallbackId:");
        sb.append(this.IconCompatParcelizer.write());
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String AudioAttributesCompatParcelizer(String str) {
        RendererWakeupListener rendererWakeupListenerOnSetRating = onSetRating();
        StringBuilder sb = new StringBuilder();
        sb.append(this.IconCompatParcelizer.write());
        sb.append(":async_deviceID");
        rendererWakeupListenerOnSetRating.write(sb.toString(), "Called initDeviceID()");
        if (this.IconCompatParcelizer.read()) {
            if (str == null) {
                RemoteActionCompatParcelizer(18, new String[0]);
                this.IconCompatParcelizer.MediaBrowserCompatItemReceiver().RemoteActionCompatParcelizer();
            }
        } else if (str != null) {
            RemoteActionCompatParcelizer(19, new String[0]);
            this.IconCompatParcelizer.MediaBrowserCompatItemReceiver().RemoteActionCompatParcelizer();
        }
        RendererWakeupListener rendererWakeupListenerOnSetRating2 = onSetRating();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.IconCompatParcelizer.write());
        sb2.append(":async_deviceID");
        rendererWakeupListenerOnSetRating2.write(sb2.toString(), "Calling _getDeviceID");
        String strOnRemoveQueueItemAt = onRemoveQueueItemAt();
        RendererWakeupListener rendererWakeupListenerOnSetRating3 = onSetRating();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.IconCompatParcelizer.write());
        sb3.append(":async_deviceID");
        rendererWakeupListenerOnSetRating3.write(sb3.toString(), "Called _getDeviceID");
        if (strOnRemoveQueueItemAt != null && strOnRemoveQueueItemAt.trim().length() > 2) {
            onSetRating().write(this.IconCompatParcelizer.write(), "CleverTap ID already present for profile");
            if (str != null) {
                RemoteActionCompatParcelizer(20, strOnRemoveQueueItemAt, str);
                RendererWakeupListener rendererWakeupListenerOnSetRating4 = onSetRating();
                this.IconCompatParcelizer.write();
                rendererWakeupListenerOnSetRating4.AudioAttributesCompatParcelizer();
            }
            return strOnRemoveQueueItemAt;
        }
        if (this.IconCompatParcelizer.read()) {
            return RemoteActionCompatParcelizer(str);
        }
        if (!this.IconCompatParcelizer.onCommand()) {
            RendererWakeupListener rendererWakeupListenerOnSetRating5 = onSetRating();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(this.IconCompatParcelizer.write());
            sb4.append(":async_deviceID");
            rendererWakeupListenerOnSetRating5.write(sb4.toString(), "Calling generateDeviceID()");
            String strOnSetCaptioningEnabled = onSetCaptioningEnabled();
            RendererWakeupListener rendererWakeupListenerOnSetRating6 = onSetRating();
            StringBuilder sb5 = new StringBuilder();
            sb5.append(this.IconCompatParcelizer.write());
            sb5.append(":async_deviceID");
            rendererWakeupListenerOnSetRating6.write(sb5.toString(), "Called generateDeviceID()");
            return strOnSetCaptioningEnabled;
        }
        onPrepareFromUri();
        String strOnSetCaptioningEnabled2 = onSetCaptioningEnabled();
        RendererWakeupListener rendererWakeupListenerOnSetRating7 = onSetRating();
        StringBuilder sb6 = new StringBuilder();
        sb6.append(this.IconCompatParcelizer.write());
        sb6.append(":async_deviceID");
        rendererWakeupListenerOnSetRating7.write(sb6.toString(), "initDeviceID() done executing!");
        return strOnSetCaptioningEnabled2;
    }

    private String RemoteActionCompatParcelizer(int i, String... strArr) {
        generateMediaPeriodEventTime generatemediaperiodeventtime = lambdaonAudioDecoderReleased8.read(514, i, strArr);
        this.MediaDescriptionCompat.add(generatemediaperiodeventtime);
        return generatemediaperiodeventtime.RemoteActionCompatParcelizer();
    }

    private void ParcelableVolumeInfo() {
        RendererCapabilitiesFormatSupport.write(this.MediaBrowserCompatCustomActionResultReceiver, onStop());
    }

    private String onSetPlaybackSpeed() {
        String string;
        synchronized (this) {
            String sessionImpl = setSessionImpl();
            if (sessionImpl != null) {
                return sessionImpl;
            }
            synchronized (this.AudioAttributesImplApi21Parcelizer) {
                StringBuilder sb = new StringBuilder("__i");
                sb.append(UUID.randomUUID().toString().replace("-", ""));
                string = sb.toString();
                MediaBrowserCompatCustomActionResultReceiver(string);
            }
            return string;
        }
    }

    private void MediaBrowserCompatCustomActionResultReceiver(String str) {
        onSetRating().write(this.IconCompatParcelizer.write(), "Updating the fallback id - ".concat(String.valueOf(str)));
        RendererCapabilitiesFormatSupport.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, onSkipToPrevious(), str);
    }
}
