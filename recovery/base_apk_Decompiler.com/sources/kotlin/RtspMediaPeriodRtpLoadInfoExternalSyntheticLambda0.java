package kotlin;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.hardware.display.DisplayManager;
import android.media.MediaRouter;
import android.os.Build;
import android.os.Handler;
import android.view.Display;
import com.marrow.TrainingApplication;
import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import kotlin.RtspMediaSource;
import kotlin.parseCea708AccessibilityChannel;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class RtspMediaPeriodRtpLoadInfoExternalSyntheticLambda0 implements RtspMediaSource {
    private static boolean AudioAttributesCompatParcelizer = false;
    private RtspMediaSource.RemoteActionCompatParcelizer AudioAttributesImplApi26Parcelizer;
    private final onRebuffer AudioAttributesImplBaseParcelizer;
    private MarkIncompleteResponseBody MediaBrowserCompatCustomActionResultReceiver;
    private final Context MediaBrowserCompatItemReceiver;
    private MediaRouter MediaBrowserCompatMediaItem;
    private final DisplayManager MediaBrowserCompatSearchResultReceiver;
    private final Handler MediaMetadataCompat;
    private final PackageManager onAddQueueItem;
    private final int IconCompatParcelizer = 999;
    private final int read = 888;
    private final String RemoteActionCompatParcelizer = "android.intent.action.HDMI_PLUGGED";
    private final IntentFilter write = new IntentFilter("android.intent.action.HDMI_PLUGGED");
    private MediaRouter.SimpleCallback RatingCompat = new MediaRouter.SimpleCallback() { // from class: o.RtspMediaPeriodRtpLoadInfoExternalSyntheticLambda0.2
        @Override // android.media.MediaRouter.SimpleCallback, android.media.MediaRouter.Callback
        public final void onRouteAdded(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            RtspMediaPeriodRtpLoadInfoExternalSyntheticLambda0.this.MediaBrowserCompatMediaItem();
        }

        @Override // android.media.MediaRouter.SimpleCallback, android.media.MediaRouter.Callback
        public final void onRouteRemoved(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            RtspMediaPeriodRtpLoadInfoExternalSyntheticLambda0.this.MediaBrowserCompatMediaItem();
        }

        @Override // android.media.MediaRouter.SimpleCallback, android.media.MediaRouter.Callback
        public final void onRouteChanged(MediaRouter mediaRouter, MediaRouter.RouteInfo routeInfo) {
            RtspMediaPeriodRtpLoadInfoExternalSyntheticLambda0.this.MediaBrowserCompatMediaItem();
        }
    };
    private DisplayManager.DisplayListener MediaDescriptionCompat = new DisplayManager.DisplayListener() { // from class: o.RtspMediaPeriodRtpLoadInfoExternalSyntheticLambda0.4
        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i) {
            RtspMediaPeriodRtpLoadInfoExternalSyntheticLambda0.this.MediaBrowserCompatMediaItem();
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i) {
            RtspMediaPeriodRtpLoadInfoExternalSyntheticLambda0.this.MediaBrowserCompatMediaItem();
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i) {
            RtspMediaPeriodRtpLoadInfoExternalSyntheticLambda0.this.MediaBrowserCompatMediaItem();
        }
    };
    private BroadcastReceiver AudioAttributesImplApi21Parcelizer = new BroadcastReceiver() { // from class: o.RtspMediaPeriodRtpLoadInfoExternalSyntheticLambda0.5
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equalsIgnoreCase("android.intent.action.HDMI_PLUGGED") || !intent.getBooleanExtra(NotesDispatchAddressRequestKt.KEY_STATE, false) || RtspMediaPeriodRtpLoadInfoExternalSyntheticLambda0.this.AudioAttributesImplApi26Parcelizer == null) {
                return;
            }
            RtspMediaPeriodRtpLoadInfoExternalSyntheticLambda0.this.AudioAttributesImplApi26Parcelizer.e_("HDMI_PLUGGED");
        }
    };
    private final getSampleFormats handleMediaPlayPauseIfPendingOnHandler = TrainingApplication.read().MediaBrowserCompatSearchResultReceiver();
    private final getStreamPositionUsForContent onCustomAction = TrainingApplication.read().MediaDescriptionCompat();

    public RtspMediaPeriodRtpLoadInfoExternalSyntheticLambda0(Context context, Handler handler, onRebuffer onrebuffer) {
        this.AudioAttributesImplBaseParcelizer = onrebuffer;
        this.MediaBrowserCompatMediaItem = (MediaRouter) context.getSystemService("media_router");
        this.MediaBrowserCompatSearchResultReceiver = (DisplayManager) context.getSystemService("display");
        this.MediaMetadataCompat = handler;
        this.onAddQueueItem = context.getPackageManager();
        this.MediaBrowserCompatItemReceiver = context;
    }

    @Override // kotlin.RtspMediaSource
    public final void AudioAttributesCompatParcelizer(RtspMediaSource.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.AudioAttributesImplApi26Parcelizer = remoteActionCompatParcelizer;
    }

    @Override // kotlin.RtspMediaSource
    public final int read() {
        if (MediaBrowserCompatCustomActionResultReceiver()) {
            if (((Boolean) updateShuffleButton.IconCompatParcelizer(MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), -1519222840, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), 1519222843, new Object[]{this.MediaBrowserCompatItemReceiver}, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer())).booleanValue()) {
                return 999;
            }
        }
        return MediaBrowserCompatCustomActionResultReceiver() ? 888 : 0;
    }

    @Override // kotlin.RtspMediaSource
    public final void MediaBrowserCompatItemReceiver() {
        this.MediaBrowserCompatMediaItem.removeCallback(this.RatingCompat);
        MarkIncompleteResponseBody markIncompleteResponseBody = this.MediaBrowserCompatCustomActionResultReceiver;
        if (markIncompleteResponseBody != null) {
            markIncompleteResponseBody.aL_();
        }
        if (this.MediaMetadataCompat != null) {
            this.MediaBrowserCompatSearchResultReceiver.unregisterDisplayListener(this.MediaDescriptionCompat);
        }
        try {
            this.MediaBrowserCompatItemReceiver.unregisterReceiver(this.AudioAttributesImplApi21Parcelizer);
        } catch (Exception unused) {
        }
    }

    @Override // kotlin.RtspMediaSource
    public final void AudioAttributesImplApi21Parcelizer() {
        MediaBrowserCompatMediaItem();
        this.MediaBrowserCompatMediaItem.addCallback(2, this.RatingCompat);
        AudioAttributesImplBaseParcelizer();
        Handler handler = this.MediaMetadataCompat;
        if (handler != null) {
            this.MediaBrowserCompatSearchResultReceiver.registerDisplayListener(this.MediaDescriptionCompat, handler);
        }
        try {
            this.MediaBrowserCompatItemReceiver.unregisterReceiver(this.AudioAttributesImplApi21Parcelizer);
            if (Build.VERSION.SDK_INT >= 34) {
                this.MediaBrowserCompatItemReceiver.registerReceiver(this.AudioAttributesImplApi21Parcelizer, this.write, 4);
            } else {
                this.MediaBrowserCompatItemReceiver.registerReceiver(this.AudioAttributesImplApi21Parcelizer, this.write);
            }
        } catch (Exception unused) {
        }
    }

    private void AudioAttributesImplBaseParcelizer() {
        String str = this.handleMediaPlayPauseIfPendingOnHandler.read();
        final String[] strArrSplit = parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer((CharSequence) str) ? new String[0] : str.split(",");
        boolean zMediaBrowserCompatCustomActionResultReceiver = this.handleMediaPlayPauseIfPendingOnHandler.MediaBrowserCompatCustomActionResultReceiver();
        if (!parseCea608AccessibilityChannel.read(strArrSplit) || zMediaBrowserCompatCustomActionResultReceiver) {
            this.MediaBrowserCompatCustomActionResultReceiver = parseCea708AccessibilityChannel.write(new parseCea708AccessibilityChannel.RemoteActionCompatParcelizer() { // from class: o.RtspMediaSource2
                @Override // o.parseCea708AccessibilityChannel.RemoteActionCompatParcelizer
                public final Object write() {
                    return this.IconCompatParcelizer.IconCompatParcelizer(strArrSplit);
                }
            }).write(PlanBUpgradeData.read()).AudioAttributesCompatParcelizer(getDeeplink.read()).RemoteActionCompatParcelizer(new getTimelineId() { // from class: o.setForceUseRtpTcp
                @Override // kotlin.getTimelineId
                public final void RemoteActionCompatParcelizer(Object obj) throws Exception {
                    this.IconCompatParcelizer.AudioAttributesCompatParcelizer((Boolean) obj);
                }
            }, new getTimelineId() { // from class: o.RtspMediaSourceFactory
                @Override // kotlin.getTimelineId
                public final void RemoteActionCompatParcelizer(Object obj) {
                    buildResolutionString.IconCompatParcelizer("RASBERRY CRASH", ((Throwable) obj).getMessage());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean IconCompatParcelizer(String[] strArr) {
        return Boolean.valueOf(RemoteActionCompatParcelizer(strArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AudioAttributesCompatParcelizer(Boolean bool) throws Exception {
        RtspMediaSource.RemoteActionCompatParcelizer remoteActionCompatParcelizer;
        if (bool.booleanValue() || (remoteActionCompatParcelizer = this.AudioAttributesImplApi26Parcelizer) == null) {
            return;
        }
        remoteActionCompatParcelizer.write("non_mobile_device");
    }

    private boolean RemoteActionCompatParcelizer(String[] strArr) {
        boolean z;
        String lowerCase = RatingCompat().toLowerCase();
        boolean zMediaBrowserCompatCustomActionResultReceiver = this.handleMediaPlayPauseIfPendingOnHandler.MediaBrowserCompatCustomActionResultReceiver();
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                z = true;
                break;
            }
            if (lowerCase.contains(strArr[i])) {
                z = false;
                break;
            }
            i++;
        }
        boolean zHasSystemFeature = this.onAddQueueItem.hasSystemFeature("android.hardware.camera.front");
        boolean zHasSystemFeature2 = this.onAddQueueItem.hasSystemFeature("android.hardware.microphone");
        boolean z2 = this.MediaBrowserCompatItemReceiver.getResources().getConfiguration().touchscreen != 1;
        HashMap map = new HashMap();
        map.put("isCameraHardwarePresent", String.valueOf(zHasSystemFeature));
        map.put("hasMicroPhone", String.valueOf(zHasSystemFeature2));
        map.put("hasTouchConfig", String.valueOf(z2));
        getTrackGroup.AudioAttributesCompatParcelizer("hardware_specs", dispatchTouchEvent.AudioAttributesCompatParcelizer(map));
        return z && (!zMediaBrowserCompatCustomActionResultReceiver || (z2 && zHasSystemFeature && zHasSystemFeature2));
    }

    private static String RatingCompat() {
        BufferedReader bufferedReader;
        StringBuilder sb = new StringBuilder();
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/cpuinfo"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            sb.append(line);
            sb.append("\n");
            return sb.toString();
        }
        bufferedReader.close();
        return sb.toString();
    }

    private String MediaMetadataCompat() {
        Display displayMediaDescriptionCompat = MediaDescriptionCompat();
        if (displayMediaDescriptionCompat == null) {
            return null;
        }
        try {
            return (String) Display.class.getMethod("getOwnerPackageName", new Class[0]).invoke(displayMediaDescriptionCompat, new Object[0]);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private String MediaBrowserCompatSearchResultReceiver() {
        Display[] displays = this.MediaBrowserCompatSearchResultReceiver.getDisplays();
        JSONArray jSONArray = new JSONArray();
        if (displays == null) {
            return jSONArray.toString();
        }
        for (Display display : displays) {
            jSONArray.put(display.toString());
        }
        return jSONArray.toString();
    }

    private Display MediaDescriptionCompat() {
        Display[] displays = this.MediaBrowserCompatSearchResultReceiver.getDisplays();
        if (displays == null) {
            return null;
        }
        for (Display display : displays) {
            if (display.getDisplayId() != 0) {
                return display;
            }
        }
        return null;
    }

    @Override // kotlin.RtspMediaSource
    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        MediaRouter.RouteInfo defaultRoute = this.MediaBrowserCompatMediaItem.getDefaultRoute();
        boolean z = defaultRoute == this.MediaBrowserCompatMediaItem.getSelectedRoute(2);
        return !z || (z && defaultRoute.getPresentationDisplay() != null) || ((Boolean) updateShuffleButton.IconCompatParcelizer(MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), -1519222840, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), 1519222843, new Object[]{this.MediaBrowserCompatItemReceiver}, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer())).booleanValue();
    }

    @Override // kotlin.RtspMediaSource
    public final String AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompatMediaItem.getDefaultRoute().toString();
    }

    @Override // kotlin.RtspMediaSource
    public final String write() {
        return this.MediaBrowserCompatMediaItem.getSelectedRoute(2).toString();
    }

    @Override // kotlin.RtspMediaSource
    public final String RemoteActionCompatParcelizer() {
        String strMediaMetadataCompat = MediaMetadataCompat();
        if (MediaDescriptionCompat() == null) {
            return null;
        }
        try {
            this.onAddQueueItem.getApplicationIcon(strMediaMetadataCompat);
            return strMediaMetadataCompat;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    @Override // kotlin.RtspMediaSource
    @Deprecated
    public final void AudioAttributesImplApi26Parcelizer() {
        if (MediaDescriptionCompat() == null || AudioAttributesCompatParcelizer) {
            return;
        }
        AudioAttributesCompatParcelizer = true;
        new getPlaylistProtectionSchemes(this.AudioAttributesImplBaseParcelizer).AudioAttributesCompatParcelizer(new Exception(MediaBrowserCompatSearchResultReceiver()), "display_info");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void MediaBrowserCompatMediaItem() {
        if (this.AudioAttributesImplApi26Parcelizer != null) {
            if (dispatchTouchEvent.IconCompatParcelizer(this.MediaBrowserCompatItemReceiver)) {
                this.AudioAttributesImplApi26Parcelizer.write("chrome_os");
            }
            String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            if (MediaBrowserCompatCustomActionResultReceiver() || strRemoteActionCompatParcelizer != null) {
                this.AudioAttributesImplApi26Parcelizer.e_(strRemoteActionCompatParcelizer);
            }
        }
    }

    public final JSONObject IconCompatParcelizer() {
        String string;
        int categoryCount = this.MediaBrowserCompatMediaItem.getCategoryCount();
        JSONObject jSONObject = new JSONObject();
        MediaRouter.RouteInfo defaultRoute = this.MediaBrowserCompatMediaItem.getDefaultRoute();
        MediaRouter.RouteInfo selectedRoute = this.MediaBrowserCompatMediaItem.getSelectedRoute(2);
        MediaRouter.RouteInfo selectedRoute2 = this.MediaBrowserCompatMediaItem.getSelectedRoute(1);
        MediaRouter.RouteInfo selectedRoute3 = this.MediaBrowserCompatMediaItem.getSelectedRoute(8388608);
        boolean z = selectedRoute == defaultRoute;
        boolean z2 = selectedRoute2 == defaultRoute;
        boolean z3 = selectedRoute2 == defaultRoute;
        String string2 = "null";
        if (!z) {
            if (selectedRoute == null) {
                string = "null";
            } else {
                string = selectedRoute.toString();
            }
            isDvbProfileDeclared.write(jSONObject, "video_route", string);
        }
        if (z2) {
            if (selectedRoute2 != null) {
                string2 = selectedRoute2.toString();
            }
            isDvbProfileDeclared.write(jSONObject, "audio_route", string2);
        }
        if (selectedRoute3 != null && !z3) {
            isDvbProfileDeclared.write(jSONObject, "user_route", selectedRoute3.toString());
        }
        Display displayMediaDescriptionCompat = MediaDescriptionCompat();
        isDvbProfileDeclared.AudioAttributesCompatParcelizer(jSONObject, "is_default_video_route", Boolean.valueOf(z));
        isDvbProfileDeclared.AudioAttributesCompatParcelizer(jSONObject, "is_default_audio_route", Boolean.valueOf(z2));
        isDvbProfileDeclared.AudioAttributesCompatParcelizer(jSONObject, "is_default_user_route", Boolean.valueOf(selectedRoute3 == defaultRoute));
        isDvbProfileDeclared.AudioAttributesCompatParcelizer(jSONObject, "is_casted", Boolean.valueOf(MediaBrowserCompatCustomActionResultReceiver()));
        isDvbProfileDeclared.AudioAttributesCompatParcelizer(jSONObject, "is_sdex_mode_enabled", Boolean.valueOf(((Boolean) updateShuffleButton.IconCompatParcelizer(MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), -1519222840, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), 1519222843, new Object[]{this.MediaBrowserCompatItemReceiver}, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer())).booleanValue()));
        if (displayMediaDescriptionCompat != null) {
            isDvbProfileDeclared.write(jSONObject, "displays", MediaBrowserCompatSearchResultReceiver());
            isDvbProfileDeclared.write(jSONObject, "culprit_display", displayMediaDescriptionCompat.toString());
        }
        int routeCount = this.MediaBrowserCompatMediaItem.getRouteCount();
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < routeCount; i++) {
            jSONArray.put(this.MediaBrowserCompatMediaItem.getRouteAt(i).toString());
        }
        JSONArray jSONArray2 = new JSONArray();
        for (int i2 = 0; i2 < categoryCount; i2++) {
            MediaRouter.RouteCategory categoryAt = this.MediaBrowserCompatMediaItem.getCategoryAt(i2);
            List<MediaRouter.RouteInfo> routes = categoryAt.getRoutes(null);
            JSONObject jSONObject2 = new JSONObject();
            isDvbProfileDeclared.write(jSONObject2, "info", categoryAt.toString());
            isDvbProfileDeclared.read(jSONObject2, "route_len", Integer.valueOf(routes.size()));
            JSONArray jSONArray3 = new JSONArray();
            for (int i3 = 0; i3 < routes.size(); i3++) {
                jSONArray3.put(routes.get(i3).toString());
            }
            isDvbProfileDeclared.write(jSONObject2, "routes", jSONArray3);
            jSONArray2.put(jSONObject2);
        }
        isDvbProfileDeclared.write(jSONObject, "all_routes", jSONArray);
        isDvbProfileDeclared.write(jSONObject, "all_categories", jSONArray2);
        return jSONObject;
    }
}
