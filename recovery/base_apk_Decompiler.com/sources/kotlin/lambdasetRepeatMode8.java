package kotlin;

import android.content.Context;
import android.location.Location;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.common.Scopes;
import java.util.Iterator;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdasetRepeatMode8 extends lambdasetVideoSurface17 implements getWindowCount {
    private final Context AudioAttributesCompatParcelizer;
    private final getUids AudioAttributesImplApi21Parcelizer;
    private final lambdasetTrackSelectionParameters14 AudioAttributesImplApi26Parcelizer;
    private final r8lambda3EoLwxJB4A25pAog2xOLUUC2nk AudioAttributesImplBaseParcelizer;
    private final copyWithPlaceholderTimeline IconCompatParcelizer;
    private final getChildTimelines MediaBrowserCompatCustomActionResultReceiver;
    private final PlayerListener MediaBrowserCompatItemReceiver;
    private final getVolumeFromManager MediaBrowserCompatMediaItem;
    private final RendererWakeupListener MediaBrowserCompatSearchResultReceiver;
    private final getTrackSupport MediaMetadataCompat;
    private final setPlayerError RatingCompat;
    private final lambdaprepare7 RemoteActionCompatParcelizer;
    private final RendererCapabilitiesTunnelingSupport handleMediaPlayPauseIfPendingOnHandler;
    private final lambdaonAudioCodecError11 onAddQueueItem;
    private final CleverTapInstanceConfig read;
    private Runnable write = null;
    private Runnable MediaDescriptionCompat = null;

    public lambdasetRepeatMode8(lambdaprepare7 lambdaprepare7Var, Context context, CleverTapInstanceConfig cleverTapInstanceConfig, lambdasetTrackSelectionParameters14 lambdasettrackselectionparameters14, RendererCapabilitiesTunnelingSupport rendererCapabilitiesTunnelingSupport, addAllCommands addallcommands, getTrackSupport gettracksupport, getChildTimelines getchildtimelines, lambdaonAudioCodecError11 lambdaonaudiocodecerror11, getVolumeFromManager getvolumefrommanager, copyWithPlaceholderTimeline copywithplaceholdertimeline, PlayerListener playerListener, r8lambda3EoLwxJB4A25pAog2xOLUUC2nk r8lambda3eolwxjb4a25paog2xoluuc2nk, getUids getuids, setPlayerError setplayererror) {
        this.RemoteActionCompatParcelizer = lambdaprepare7Var;
        this.AudioAttributesCompatParcelizer = context;
        this.read = cleverTapInstanceConfig;
        this.AudioAttributesImplApi26Parcelizer = lambdasettrackselectionparameters14;
        this.handleMediaPlayPauseIfPendingOnHandler = rendererCapabilitiesTunnelingSupport;
        this.MediaMetadataCompat = gettracksupport;
        this.MediaBrowserCompatCustomActionResultReceiver = getchildtimelines;
        this.onAddQueueItem = lambdaonaudiocodecerror11;
        this.MediaBrowserCompatMediaItem = getvolumefrommanager;
        this.AudioAttributesImplBaseParcelizer = r8lambda3eolwxjb4a25paog2xoluuc2nk;
        this.MediaBrowserCompatSearchResultReceiver = cleverTapInstanceConfig.MediaBrowserCompatItemReceiver();
        this.IconCompatParcelizer = copywithplaceholdertimeline;
        this.MediaBrowserCompatItemReceiver = playerListener;
        this.AudioAttributesImplApi21Parcelizer = getuids;
        this.RatingCompat = setplayererror;
        addallcommands.write(this);
    }

    public final void read(Context context, JSONObject jSONObject, int i) {
        if (i == 6) {
            this.read.MediaBrowserCompatItemReceiver().write(this.read.write(), "Pushing Notification Viewed event onto separate queue");
            AudioAttributesCompatParcelizer(context, jSONObject, i);
        } else if (i == 8) {
            RemoteActionCompatParcelizer(context, jSONObject);
        } else {
            IconCompatParcelizer(context, jSONObject, i);
        }
    }

    private void RemoteActionCompatParcelizer(Context context, JSONObject jSONObject) {
        read(context, lambdasetVideoSurfaceHolder18.VARIABLES, jSONObject);
    }

    @Override // kotlin.getWindowCount
    public final void RemoteActionCompatParcelizer(Context context) {
        write(context);
    }

    public final void IconCompatParcelizer(final Context context, final lambdasetVideoSurfaceHolder18 lambdasetvideosurfaceholder18) {
        TracksExternalSyntheticLambda0.AudioAttributesCompatParcelizer(this.read).read().read("CommsManager#flushQueueAsync", new Callable<Void>() { // from class: o.lambdasetRepeatMode8.5
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Void call() {
                if (lambdasetvideosurfaceholder18 == lambdasetVideoSurfaceHolder18.PUSH_NOTIFICATION_VIEWED) {
                    lambdasetRepeatMode8.this.MediaBrowserCompatSearchResultReceiver.write(lambdasetRepeatMode8.this.read.write(), "Pushing Notification Viewed event onto queue flush sync");
                } else {
                    lambdasetRepeatMode8.this.MediaBrowserCompatSearchResultReceiver.write(lambdasetRepeatMode8.this.read.write(), "Pushing event onto queue flush sync");
                }
                lambdasetRepeatMode8.this.RemoteActionCompatParcelizer(context, lambdasetvideosurfaceholder18);
                return null;
            }
        });
    }

    public final void RemoteActionCompatParcelizer(Context context, lambdasetVideoSurfaceHolder18 lambdasetvideosurfaceholder18) {
        RemoteActionCompatParcelizer(context, lambdasetvideosurfaceholder18, (String) null);
    }

    @Override // kotlin.lambdasetVideoSurface17
    public final void RemoteActionCompatParcelizer(Context context, lambdasetVideoSurfaceHolder18 lambdasetvideosurfaceholder18, String str) {
        RemoteActionCompatParcelizer(context, lambdasetvideosurfaceholder18, str, false);
    }

    @Override // kotlin.lambdasetVideoSurface17
    public final void RemoteActionCompatParcelizer(final Context context, final lambdasetVideoSurfaceHolder18 lambdasetvideosurfaceholder18, final String str, final boolean z) {
        if (!getVolumeFromManager.RemoteActionCompatParcelizer(context)) {
            this.MediaBrowserCompatSearchResultReceiver.write(this.read.write(), "Network connectivity unavailable. Will retry later");
            this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatCustomActionResultReceiver();
            this.AudioAttributesImplApi21Parcelizer.read(new JSONArray(), false);
        } else if (this.IconCompatParcelizer.onRewind()) {
            this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(this.read.write(), "CleverTap Instance has been set to offline, won't send events queue");
            this.AudioAttributesImplApi21Parcelizer.MediaBrowserCompatCustomActionResultReceiver();
            this.AudioAttributesImplApi21Parcelizer.read(new JSONArray(), false);
        } else if (this.MediaBrowserCompatMediaItem.IconCompatParcelizer(lambdasetvideosurfaceholder18)) {
            this.MediaBrowserCompatMediaItem.write(lambdasetvideosurfaceholder18, new Runnable() { // from class: o.lambdaupdateStateAndInformListeners31
                @Override // java.lang.Runnable
                public final void run() {
                    this.IconCompatParcelizer.IconCompatParcelizer(context, lambdasetvideosurfaceholder18, str, z);
                }
            });
        } else {
            this.MediaBrowserCompatSearchResultReceiver.write(this.read.write(), "Pushing Notification Viewed event onto queue DB flush");
            this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(context, lambdasetvideosurfaceholder18, str, z);
        }
    }

    final /* synthetic */ void IconCompatParcelizer(Context context, lambdasetVideoSurfaceHolder18 lambdasetvideosurfaceholder18, String str, boolean z) {
        this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(context, lambdasetvideosurfaceholder18, str, z);
    }

    private void read(final Context context, final lambdasetVideoSurfaceHolder18 lambdasetvideosurfaceholder18, JSONObject jSONObject) {
        if (!getVolumeFromManager.RemoteActionCompatParcelizer(context)) {
            this.MediaBrowserCompatSearchResultReceiver.write(this.read.write(), "Network connectivity unavailable. Event won't be sent.");
            return;
        }
        if (this.IconCompatParcelizer.onRewind()) {
            this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(this.read.write(), "CleverTap Instance has been set to offline, won't send event");
            return;
        }
        final JSONArray jSONArrayPut = new JSONArray().put(jSONObject);
        if (this.MediaBrowserCompatMediaItem.IconCompatParcelizer(lambdasetvideosurfaceholder18)) {
            this.MediaBrowserCompatMediaItem.write(lambdasetvideosurfaceholder18, new Runnable() { // from class: o.lambdasetVideoSurfaceView19
                @Override // java.lang.Runnable
                public final void run() {
                    this.IconCompatParcelizer.read(context, lambdasetvideosurfaceholder18, jSONArrayPut);
                }
            });
        } else {
            this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(context, lambdasetvideosurfaceholder18, jSONArrayPut, null, false);
        }
    }

    final /* synthetic */ void read(Context context, lambdasetVideoSurfaceHolder18 lambdasetvideosurfaceholder18, JSONArray jSONArray) {
        this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(context, lambdasetvideosurfaceholder18, jSONArray, null, false);
    }

    private static int IconCompatParcelizer() {
        return (int) (System.currentTimeMillis() / 1000);
    }

    private void IconCompatParcelizer(Context context, JSONObject jSONObject, int i) {
        String str;
        synchronized (this.MediaBrowserCompatItemReceiver.IconCompatParcelizer()) {
            try {
                if (copyWithPlaceholderTimeline.read() == 0) {
                    copyWithPlaceholderTimeline.MediaBrowserCompatCustomActionResultReceiver();
                }
                if (i == 1) {
                    str = "page";
                } else if (i == 2) {
                    write(jSONObject, context);
                    if (jSONObject.has("bk")) {
                        this.IconCompatParcelizer.IconCompatParcelizer(true);
                        jSONObject.remove("bk");
                    }
                    if (this.IconCompatParcelizer.onSeekTo()) {
                        jSONObject.put("gf", true);
                        this.IconCompatParcelizer.onSetShuffleMode();
                        jSONObject.put("gfSDKVersion", this.IconCompatParcelizer.onCustomAction());
                        this.IconCompatParcelizer.onSetRepeatMode();
                    }
                    str = "ping";
                } else if (i == 3) {
                    str = Scopes.PROFILE;
                } else if (i == 5) {
                    str = "data";
                } else {
                    str = "event";
                }
                String strOnMediaButtonEvent = this.IconCompatParcelizer.onMediaButtonEvent();
                if (strOnMediaButtonEvent != null) {
                    jSONObject.put("n", strOnMediaButtonEvent);
                }
                jSONObject.put(CmcdHeadersFactory.STREAMING_FORMAT_SS, this.IconCompatParcelizer.RatingCompat());
                jSONObject.put("pg", copyWithPlaceholderTimeline.read());
                jSONObject.put("type", str);
                jSONObject.put("ep", IconCompatParcelizer());
                jSONObject.put("f", this.IconCompatParcelizer.onPrepare());
                jSONObject.put("lsl", this.IconCompatParcelizer.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
                read(context, jSONObject);
                generateMediaPeriodEventTime generatemediaperiodeventtime = this.onAddQueueItem.read();
                if (generatemediaperiodeventtime != null) {
                    jSONObject.put("wzrk_error", AnalyticsCollector.AudioAttributesCompatParcelizer(generatemediaperiodeventtime));
                }
                this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(jSONObject);
                this.RemoteActionCompatParcelizer.write(context, jSONObject, i);
                RemoteActionCompatParcelizer(context, jSONObject, i);
                write(context);
            } catch (Throwable unused) {
                RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = this.read.MediaBrowserCompatItemReceiver();
                this.read.write();
                jSONObject.toString();
                rendererWakeupListenerMediaBrowserCompatItemReceiver.IconCompatParcelizer();
            }
        }
    }

    private void RemoteActionCompatParcelizer(Context context, JSONObject jSONObject, int i) {
        String strAudioAttributesCompatParcelizer = lambdasetTrackSelectionParameters14.AudioAttributesCompatParcelizer(jSONObject);
        Location locationOnAddQueueItem = this.IconCompatParcelizer.onAddQueueItem();
        AudioAttributesCompatParcelizer(strAudioAttributesCompatParcelizer, i);
        if (lambdasetTrackSelectionParameters14.MediaBrowserCompatItemReceiver(jSONObject)) {
            this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi26Parcelizer().read(lambdasetTrackSelectionParameters14.IconCompatParcelizer(jSONObject), lambdasetTrackSelectionParameters14.write(jSONObject), locationOnAddQueueItem);
            return;
        }
        if (!getVolumeFromManager.RemoteActionCompatParcelizer(context) && lambdasetTrackSelectionParameters14.MediaBrowserCompatCustomActionResultReceiver(jSONObject)) {
            this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi26Parcelizer().RemoteActionCompatParcelizer(strAudioAttributesCompatParcelizer, lambdasetTrackSelectionParameters14.read(jSONObject), locationOnAddQueueItem);
            return;
        }
        if (i == 3) {
            this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi26Parcelizer().write(this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(jSONObject), locationOnAddQueueItem);
        } else {
            if (lambdasetTrackSelectionParameters14.AudioAttributesImplApi21Parcelizer(jSONObject) || !lambdasetTrackSelectionParameters14.MediaBrowserCompatCustomActionResultReceiver(jSONObject)) {
                return;
            }
            this.AudioAttributesImplApi21Parcelizer.AudioAttributesImplApi26Parcelizer().RemoteActionCompatParcelizer(strAudioAttributesCompatParcelizer, lambdasetTrackSelectionParameters14.read(jSONObject), locationOnAddQueueItem);
        }
    }

    private void AudioAttributesCompatParcelizer(Context context, JSONObject jSONObject, int i) {
        synchronized (this.MediaBrowserCompatItemReceiver.IconCompatParcelizer()) {
            try {
                jSONObject.put(CmcdHeadersFactory.STREAMING_FORMAT_SS, this.IconCompatParcelizer.RatingCompat());
                jSONObject.put("type", "event");
                jSONObject.put("ep", IconCompatParcelizer());
                generateMediaPeriodEventTime generatemediaperiodeventtime = this.onAddQueueItem.read();
                if (generatemediaperiodeventtime != null) {
                    jSONObject.put("wzrk_error", AnalyticsCollector.AudioAttributesCompatParcelizer(generatemediaperiodeventtime));
                }
                this.read.MediaBrowserCompatItemReceiver().write(this.read.write(), "Pushing Notification Viewed event onto DB");
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(context, jSONObject);
                RemoteActionCompatParcelizer(context, jSONObject, i);
                this.read.MediaBrowserCompatItemReceiver().write(this.read.write(), "Pushing Notification Viewed event onto queue flush");
                AudioAttributesCompatParcelizer(context);
            } catch (Throwable unused) {
                RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = this.read.MediaBrowserCompatItemReceiver();
                this.read.write();
                jSONObject.toString();
                rendererWakeupListenerMediaBrowserCompatItemReceiver.IconCompatParcelizer();
            }
        }
    }

    @Override // kotlin.lambdasetVideoSurface17
    public final void RemoteActionCompatParcelizer(JSONObject jSONObject, boolean z) {
        Object jSONObject2;
        try {
            String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
            JSONObject jSONObject3 = new JSONObject();
            if (jSONObject != null && jSONObject.length() > 0) {
                Iterator<String> itKeys = jSONObject.keys();
                setDeviceInfo setdeviceinfoAudioAttributesCompatParcelizer = setIsLoading.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, this.read, this.onAddQueueItem);
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    try {
                        try {
                            jSONObject2 = jSONObject.getJSONObject(next);
                        } catch (Throwable unused) {
                            jSONObject2 = jSONObject.get(next);
                        }
                    } catch (JSONException unused2) {
                        jSONObject2 = null;
                    }
                    if (jSONObject2 != null) {
                        jSONObject3.put(next, jSONObject2);
                        if (setdeviceinfoAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(next) && !this.MediaBrowserCompatCustomActionResultReceiver.onPrepare()) {
                            if (z) {
                                try {
                                    this.RatingCompat.RemoteActionCompatParcelizer(strRemoteActionCompatParcelizer, next);
                                } catch (Throwable unused3) {
                                }
                            } else {
                                this.RatingCompat.write(strRemoteActionCompatParcelizer, next, jSONObject2.toString());
                            }
                        }
                    }
                }
            }
            try {
                String strAudioAttributesImplBaseParcelizer = this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplBaseParcelizer();
                if (strAudioAttributesImplBaseParcelizer != null && !strAudioAttributesImplBaseParcelizer.equals("")) {
                    jSONObject3.put("Carrier", strAudioAttributesImplBaseParcelizer);
                }
                String strAudioAttributesImplApi26Parcelizer = this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer();
                if (strAudioAttributesImplApi26Parcelizer != null && !strAudioAttributesImplApi26Parcelizer.equals("")) {
                    jSONObject3.put("cc", strAudioAttributesImplApi26Parcelizer);
                }
                jSONObject3.put("tz", TimeZone.getDefault().getID());
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put(Scopes.PROFILE, jSONObject3);
                write(this.AudioAttributesCompatParcelizer, jSONObject4, 3);
            } catch (JSONException unused4) {
                this.read.MediaBrowserCompatItemReceiver().write(this.read.write(), "FATAL: Creating basic profile update event failed!");
            }
        } catch (Throwable unused5) {
            RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = this.read.MediaBrowserCompatItemReceiver();
            this.read.write();
            rendererWakeupListenerMediaBrowserCompatItemReceiver.IconCompatParcelizer();
        }
    }

    @Override // kotlin.lambdasetVideoSurface17
    public final void write() {
        if (this.IconCompatParcelizer.onPlayFromMediaId()) {
            return;
        }
        TracksExternalSyntheticLambda0.AudioAttributesCompatParcelizer(this.read).read().read("CleverTapAPI#pushInitialEventsAsync", new Callable<Void>() { // from class: o.lambdasetRepeatMode8.3
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Void call() {
                try {
                    lambdasetRepeatMode8.this.read.MediaBrowserCompatItemReceiver().write(lambdasetRepeatMode8.this.read.write(), "Queuing daily events");
                    lambdasetRepeatMode8.this.RemoteActionCompatParcelizer((JSONObject) null, false);
                } catch (Throwable unused) {
                    RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = lambdasetRepeatMode8.this.read.MediaBrowserCompatItemReceiver();
                    lambdasetRepeatMode8.this.read.write();
                    rendererWakeupListenerMediaBrowserCompatItemReceiver.IconCompatParcelizer();
                }
                return null;
            }
        });
    }

    /* JADX INFO: renamed from: o.lambdasetRepeatMode8$4, reason: invalid class name */
    final class AnonymousClass4 implements Callable<Void> {
        private /* synthetic */ int RemoteActionCompatParcelizer;
        private /* synthetic */ JSONObject read;
        private /* synthetic */ Context write;

        AnonymousClass4(JSONObject jSONObject, int i, Context context) {
            this.read = jSONObject;
            this.RemoteActionCompatParcelizer = i;
            this.write = context;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Void call() {
            if (lambdasetRepeatMode8.this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer(this.read, this.RemoteActionCompatParcelizer)) {
                return null;
            }
            if (lambdasetRepeatMode8.this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(this.read, this.RemoteActionCompatParcelizer)) {
                RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = lambdasetRepeatMode8.this.read.MediaBrowserCompatItemReceiver();
                String strWrite = lambdasetRepeatMode8.this.read.write();
                StringBuilder sb = new StringBuilder("App Launched not yet processed, re-queuing event ");
                sb.append(this.read);
                sb.append("after 2s");
                rendererWakeupListenerMediaBrowserCompatItemReceiver.IconCompatParcelizer(strWrite, sb.toString());
                getTrackSupport gettracksupport = lambdasetRepeatMode8.this.MediaMetadataCompat;
                final Context context = this.write;
                final JSONObject jSONObject = this.read;
                final int i = this.RemoteActionCompatParcelizer;
                gettracksupport.postDelayed(new Runnable() { // from class: o.lambdasetVolume16
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(context, jSONObject, i);
                    }
                }, 2000L);
            } else {
                int i2 = this.RemoteActionCompatParcelizer;
                if (i2 != 7 && i2 != 6) {
                    lambdasetRepeatMode8.this.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(this.write);
                    lambdasetRepeatMode8.this.write();
                    lambdasetRepeatMode8.this.read(this.write, this.read, this.RemoteActionCompatParcelizer);
                } else {
                    lambdasetRepeatMode8.this.read(this.write, this.read, i2);
                }
            }
            return null;
        }

        final /* synthetic */ void RemoteActionCompatParcelizer(final Context context, final JSONObject jSONObject, final int i) {
            TracksExternalSyntheticLambda0.AudioAttributesCompatParcelizer(lambdasetRepeatMode8.this.read).read().read("queueEventWithDelay", new Callable<Void>() { // from class: o.lambdasetRepeatMode8.4.5
                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
                public Void call() {
                    lambdasetRepeatMode8.this.handleMediaPlayPauseIfPendingOnHandler.RemoteActionCompatParcelizer(context);
                    lambdasetRepeatMode8.this.write();
                    lambdasetRepeatMode8.this.read(context, jSONObject, i);
                    return null;
                }
            });
        }
    }

    @Override // kotlin.lambdasetVideoSurface17
    public final Future<?> write(Context context, JSONObject jSONObject, int i) {
        return TracksExternalSyntheticLambda0.AudioAttributesCompatParcelizer(this.read).read().RemoteActionCompatParcelizer("queueEvent", new AnonymousClass4(jSONObject, i, context));
    }

    private void write(final Context context) {
        if (this.write == null) {
            this.write = new Runnable() { // from class: o.lambdasetRepeatMode8.2
                @Override // java.lang.Runnable
                public final void run() {
                    lambdasetRepeatMode8.this.IconCompatParcelizer(context, lambdasetVideoSurfaceHolder18.REGULAR);
                    lambdasetRepeatMode8.this.IconCompatParcelizer(context, lambdasetVideoSurfaceHolder18.PUSH_NOTIFICATION_VIEWED);
                }
            };
        }
        this.MediaMetadataCompat.removeCallbacks(this.write);
        this.MediaMetadataCompat.postDelayed(this.write, this.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer());
        this.MediaBrowserCompatSearchResultReceiver.write(this.read.write(), "Scheduling delayed queue flush on main event loop");
    }

    private static void write(JSONObject jSONObject, Context context) {
        try {
            jSONObject.put("mc", RendererCapabilitiesListener.RemoteActionCompatParcelizer());
        } catch (Throwable unused) {
        }
        try {
            jSONObject.put("nt", RendererCapabilitiesListener.write(context));
        } catch (Throwable unused2) {
        }
    }

    private static void read(Context context, JSONObject jSONObject) {
        try {
            if ("event".equals(jSONObject.getString("type")) && "App Launched".equals(jSONObject.getString("evtName"))) {
                jSONObject.put("pai", context.getPackageName());
            }
        } catch (Throwable unused) {
        }
    }

    private String RemoteActionCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver();
    }

    private void AudioAttributesCompatParcelizer(final Context context) {
        if (this.MediaDescriptionCompat == null) {
            this.MediaDescriptionCompat = new Runnable() { // from class: o.lambdasetRepeatMode8.1
                @Override // java.lang.Runnable
                public final void run() {
                    lambdasetRepeatMode8.this.read.MediaBrowserCompatItemReceiver().write(lambdasetRepeatMode8.this.read.write(), "Pushing Notification Viewed event onto queue flush async");
                    lambdasetRepeatMode8.this.IconCompatParcelizer(context, lambdasetVideoSurfaceHolder18.PUSH_NOTIFICATION_VIEWED);
                }
            };
        }
        this.MediaMetadataCompat.removeCallbacks(this.MediaDescriptionCompat);
        this.MediaMetadataCompat.post(this.MediaDescriptionCompat);
    }

    private void AudioAttributesCompatParcelizer(String str, int i) {
        if (i == 4) {
            this.AudioAttributesImplBaseParcelizer.AudioAttributesImplBaseParcelizer(str);
        }
    }
}
