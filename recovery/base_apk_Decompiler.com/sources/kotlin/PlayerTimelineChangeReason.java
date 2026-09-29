package kotlin;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import kotlin.SimpleBasePlayerPlaceholderUid;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class PlayerTimelineChangeReason implements SimpleBasePlayerPlaceholderUid.write {
    private static HashMap<String, PlayerTimelineChangeReason> AudioAttributesCompatParcelizer;
    private static setCurrentAd RemoteActionCompatParcelizer;
    private static CleverTapInstanceConfig read;
    private WeakReference<Object> AudioAttributesImplApi21Parcelizer;
    private WeakReference<Object> AudioAttributesImplApi26Parcelizer;
    private final Context MediaBrowserCompatCustomActionResultReceiver;
    private PlaylistTimeline MediaBrowserCompatItemReceiver;
    private static int write = AudioAttributesCompatParcelizer.INFO.AudioAttributesCompatParcelizer();
    private static final HashMap<String, setContentPositionMs> AudioAttributesImplBaseParcelizer = new HashMap<>();
    private static onDroppedVideoFrames IconCompatParcelizer = onDroppedVideoFrames.IconCompatParcelizer;

    public static setCurrentAd AudioAttributesCompatParcelizer() {
        return null;
    }

    public enum AudioAttributesCompatParcelizer {
        OFF(-1),
        INFO(0),
        DEBUG(2),
        VERBOSE(3);

        private final int AudioAttributesImplApi26Parcelizer;

        AudioAttributesCompatParcelizer(int i) {
            this.AudioAttributesImplApi26Parcelizer = i;
        }

        public final int AudioAttributesCompatParcelizer() {
            return this.AudioAttributesImplApi26Parcelizer;
        }
    }

    public static PlayerTimelineChangeReason write(Context context, String str) {
        return AudioAttributesCompatParcelizer(context, str);
    }

    public static void IconCompatParcelizer(Context context, String str, CharSequence charSequence, String str2) {
        PlayerTimelineChangeReason playerTimelineChangeReasonAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(context);
        if (playerTimelineChangeReasonAudioAttributesCompatParcelizer == null) {
            RendererWakeupListener.MediaMetadataCompat();
            return;
        }
        try {
            playerTimelineChangeReasonAudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver().MediaBrowserCompatMediaItem().read().read("createNotificationChannel", new Callable<Void>(context, str, charSequence, 5, str2, true, playerTimelineChangeReasonAudioAttributesCompatParcelizer) { // from class: o.PlayerTimelineChangeReason.1
                private /* synthetic */ String AudioAttributesCompatParcelizer;
                private /* synthetic */ String IconCompatParcelizer;
                private /* synthetic */ PlayerTimelineChangeReason MediaBrowserCompatItemReceiver;
                private /* synthetic */ Context RemoteActionCompatParcelizer;
                private /* synthetic */ CharSequence write;
                private /* synthetic */ int read = 5;
                private /* synthetic */ boolean AudioAttributesImplBaseParcelizer = true;

                {
                    this.AudioAttributesCompatParcelizer = str2;
                    this.MediaBrowserCompatItemReceiver = playerTimelineChangeReasonAudioAttributesCompatParcelizer;
                }

                /* JADX INFO: Access modifiers changed from: private */
                @Override // java.util.concurrent.Callable
                /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
                public Void call() {
                    NotificationManager notificationManager = (NotificationManager) this.RemoteActionCompatParcelizer.getSystemService("notification");
                    if (notificationManager == null) {
                        return null;
                    }
                    NotificationChannel notificationChannel = new NotificationChannel(this.IconCompatParcelizer, this.write, this.read);
                    notificationChannel.setDescription(this.AudioAttributesCompatParcelizer);
                    notificationChannel.setShowBadge(this.AudioAttributesImplBaseParcelizer);
                    notificationManager.createNotificationChannel(notificationChannel);
                    RendererWakeupListener rendererWakeupListenerHandleMediaPlayPauseIfPendingOnHandler = this.MediaBrowserCompatItemReceiver.handleMediaPlayPauseIfPendingOnHandler();
                    this.MediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer();
                    this.write.toString();
                    rendererWakeupListenerHandleMediaPlayPauseIfPendingOnHandler.AudioAttributesCompatParcelizer();
                    return null;
                }
            });
        } catch (Throwable unused) {
            RendererWakeupListener rendererWakeupListenerHandleMediaPlayPauseIfPendingOnHandler = playerTimelineChangeReasonAudioAttributesCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler();
            playerTimelineChangeReasonAudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer();
            rendererWakeupListenerHandleMediaPlayPauseIfPendingOnHandler.IconCompatParcelizer();
        }
    }

    public static int write() {
        return write;
    }

    public static void IconCompatParcelizer(int i) {
        write = i;
    }

    public static void IconCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        write = audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    private static PlayerTimelineChangeReason read(Context context, String str) {
        CleverTapInstanceConfig cleverTapInstanceConfig = read;
        if (cleverTapInstanceConfig != null) {
            return RemoteActionCompatParcelizer(context, cleverTapInstanceConfig, str);
        }
        CleverTapInstanceConfig cleverTapInstanceConfig2 = read(context);
        read = cleverTapInstanceConfig2;
        if (cleverTapInstanceConfig2 != null) {
            return RemoteActionCompatParcelizer(context, cleverTapInstanceConfig2, str);
        }
        return null;
    }

    public static PlayerTimelineChangeReason write(Context context) {
        return read(context, (String) null);
    }

    private static PlayerTimelineChangeReason AudioAttributesCompatParcelizer(Context context, String str) {
        HashMap<String, PlayerTimelineChangeReason> map = AudioAttributesCompatParcelizer;
        if (map == null) {
            return RemoteActionCompatParcelizer(context, str);
        }
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            PlayerTimelineChangeReason playerTimelineChangeReason = AudioAttributesCompatParcelizer.get(it.next());
            if (playerTimelineChangeReason != null && ((str == null && playerTimelineChangeReason.MediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer().MediaBrowserCompatSearchResultReceiver()) || playerTimelineChangeReason.AudioAttributesImplApi26Parcelizer().equals(str))) {
                return playerTimelineChangeReason;
            }
        }
        return null;
    }

    public static getAdDurationUs write(Bundle bundle) {
        boolean z = false;
        if (bundle == null) {
            return new getAdDurationUs(false, false);
        }
        boolean zContainsKey = bundle.containsKey("wzrk_pn");
        if (zContainsKey && bundle.containsKey("nm")) {
            z = true;
        }
        return new getAdDurationUs(zContainsKey, z);
    }

    public static void read(Context context, Bundle bundle) {
        String string;
        if (bundle != null) {
            try {
                string = bundle.getString("wzrk_acct_id");
            } catch (Throwable unused) {
                string = null;
            }
            HashMap<String, PlayerTimelineChangeReason> map = AudioAttributesCompatParcelizer;
            if (map == null) {
                PlayerTimelineChangeReason playerTimelineChangeReasonRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(context, string);
                if (playerTimelineChangeReasonRemoteActionCompatParcelizer != null) {
                    playerTimelineChangeReasonRemoteActionCompatParcelizer.read(bundle);
                    return;
                }
                return;
            }
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext()) {
                PlayerTimelineChangeReason playerTimelineChangeReason = AudioAttributesCompatParcelizer.get(it.next());
                if (playerTimelineChangeReason != null && ((string == null && playerTimelineChangeReason.MediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer().MediaBrowserCompatSearchResultReceiver()) || playerTimelineChangeReason.AudioAttributesImplApi26Parcelizer().equals(string))) {
                    playerTimelineChangeReason.read(bundle);
                    return;
                }
            }
        }
    }

    public static PlayerTimelineChangeReason RemoteActionCompatParcelizer(Context context, CleverTapInstanceConfig cleverTapInstanceConfig) {
        return RemoteActionCompatParcelizer(context, cleverTapInstanceConfig, (String) null);
    }

    private static PlayerTimelineChangeReason RemoteActionCompatParcelizer(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, String str) {
        if (cleverTapInstanceConfig == null) {
            RendererWakeupListener.MediaMetadataCompat();
            return null;
        }
        if (AudioAttributesCompatParcelizer == null) {
            AudioAttributesCompatParcelizer = new HashMap<>();
        }
        PlayerTimelineChangeReason playerTimelineChangeReason = AudioAttributesCompatParcelizer.get(cleverTapInstanceConfig.write());
        if (playerTimelineChangeReason == null) {
            playerTimelineChangeReason = new PlayerTimelineChangeReason(context, cleverTapInstanceConfig, str);
            AudioAttributesCompatParcelizer.put(cleverTapInstanceConfig.write(), playerTimelineChangeReason);
        } else if (playerTimelineChangeReason.MediaMetadataCompat().read() && RendererCapabilitiesListener.write(str) && playerTimelineChangeReason.onCommand()) {
            playerTimelineChangeReason.MediaBrowserCompatItemReceiver.onCustomAction().write(null, null, str);
        }
        cleverTapInstanceConfig.write();
        RendererWakeupListener.RatingCompat();
        return playerTimelineChangeReason;
    }

    public static boolean RemoteActionCompatParcelizer() {
        return copyWithPlaceholderTimeline.AudioAttributesImplBaseParcelizer();
    }

    public static void IconCompatParcelizer() {
        HashMap<String, PlayerTimelineChangeReason> map = AudioAttributesCompatParcelizer;
        if (map != null) {
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext()) {
                PlayerTimelineChangeReason playerTimelineChangeReason = AudioAttributesCompatParcelizer.get(it.next());
                if (playerTimelineChangeReason != null) {
                    try {
                        playerTimelineChangeReason.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer().IconCompatParcelizer();
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    public static void RemoteActionCompatParcelizer(Activity activity, String str) {
        if (AudioAttributesCompatParcelizer == null) {
            AudioAttributesCompatParcelizer(activity.getApplicationContext(), null, str);
        }
        copyWithPlaceholderTimeline.AudioAttributesCompatParcelizer(true);
        if (AudioAttributesCompatParcelizer == null) {
            RendererWakeupListener.MediaMetadataCompat();
            return;
        }
        String strWrite = copyWithPlaceholderTimeline.write();
        copyWithPlaceholderTimeline.IconCompatParcelizer(activity);
        if (strWrite == null || !strWrite.equals(activity.getLocalClassName())) {
            copyWithPlaceholderTimeline.RemoteActionCompatParcelizer();
        }
        if (copyWithPlaceholderTimeline.AudioAttributesCompatParcelizer() <= 0) {
            copyWithPlaceholderTimeline.IconCompatParcelizer(IconCompatParcelizer.IconCompatParcelizer());
        }
        Iterator<String> it = AudioAttributesCompatParcelizer.keySet().iterator();
        while (it.hasNext()) {
            PlayerTimelineChangeReason playerTimelineChangeReason = AudioAttributesCompatParcelizer.get(it.next());
            if (playerTimelineChangeReason != null) {
                try {
                    playerTimelineChangeReason.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer().read();
                } catch (Throwable th) {
                    th.getLocalizedMessage();
                    RendererWakeupListener.MediaMetadataCompat();
                }
            }
        }
    }

    public static void IconCompatParcelizer(Context context) {
        HashMap<String, PlayerTimelineChangeReason> map = AudioAttributesCompatParcelizer;
        if (map == null) {
            PlayerTimelineChangeReason playerTimelineChangeReasonWrite = write(context);
            if (playerTimelineChangeReasonWrite != null) {
                if (playerTimelineChangeReasonWrite.MediaMetadataCompat().RatingCompat()) {
                    playerTimelineChangeReasonWrite.MediaBrowserCompatItemReceiver.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().RemoteActionCompatParcelizer(context);
                    return;
                } else {
                    RendererWakeupListener.MediaBrowserCompatItemReceiver();
                    return;
                }
            }
            return;
        }
        Iterator<String> it = map.keySet().iterator();
        while (it.hasNext()) {
            PlayerTimelineChangeReason playerTimelineChangeReason = AudioAttributesCompatParcelizer.get(it.next());
            if (playerTimelineChangeReason != null && playerTimelineChangeReason.MediaMetadataCompat().MediaMetadataCompat()) {
                RendererWakeupListener.AudioAttributesImplApi21Parcelizer();
            } else if (playerTimelineChangeReason == null || !playerTimelineChangeReason.MediaMetadataCompat().RatingCompat()) {
                RendererWakeupListener.AudioAttributesImplApi21Parcelizer();
            } else {
                playerTimelineChangeReason.MediaBrowserCompatItemReceiver.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().RemoteActionCompatParcelizer(context);
            }
        }
    }

    public final void IconCompatParcelizer(boolean z) {
        this.MediaBrowserCompatItemReceiver.RatingCompat().AudioAttributesCompatParcelizer(z);
    }

    private PlayerTimelineChangeReason(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, String str) {
        this(context, cleverTapInstanceConfig, isCanceled.AudioAttributesCompatParcelizer(context, cleverTapInstanceConfig, str), onDroppedVideoFrames.IconCompatParcelizer);
    }

    private PlayerTimelineChangeReason(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, PlaylistTimeline playlistTimeline, onDroppedVideoFrames ondroppedvideoframes) {
        this.MediaBrowserCompatCustomActionResultReceiver = context;
        this.MediaBrowserCompatItemReceiver = playlistTimeline;
        IconCompatParcelizer = ondroppedvideoframes;
        RendererWakeupListener rendererWakeupListenerHandleMediaPlayPauseIfPendingOnHandler = handleMediaPlayPauseIfPendingOnHandler();
        StringBuilder sb = new StringBuilder();
        sb.append(cleverTapInstanceConfig.write());
        sb.append(":async_deviceID");
        rendererWakeupListenerHandleMediaPlayPauseIfPendingOnHandler.write(sb.toString(), "CoreState is set");
        RatingCompat();
        cleverTapInstanceConfig.write();
        cleverTapInstanceConfig.IconCompatParcelizer();
        cleverTapInstanceConfig.AudioAttributesCompatParcelizer();
        RendererWakeupListener.MediaBrowserCompatCustomActionResultReceiver();
    }

    private void RatingCompat() {
        this.MediaBrowserCompatItemReceiver.MediaBrowserCompatMediaItem().read().read("CleverTapAPI#initializeDeviceInfo", new Callable() { // from class: o.PlayerMessage
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.read.MediaDescriptionCompat();
            }
        });
        if (IconCompatParcelizer.IconCompatParcelizer() - copyWithPlaceholderTimeline.AudioAttributesCompatParcelizer() > 5) {
            this.MediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer().onPlay();
        }
        this.MediaBrowserCompatItemReceiver.MediaBrowserCompatMediaItem().read().read("setStatesAsync", new Callable() { // from class: o.getMediaItemIndex
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.write.MediaBrowserCompatSearchResultReceiver();
            }
        });
        this.MediaBrowserCompatItemReceiver.MediaBrowserCompatMediaItem().read().read("saveConfigtoSharedPrefs", new Callable() { // from class: o.cancel
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.RemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer();
            }
        });
        this.MediaBrowserCompatItemReceiver.MediaBrowserCompatMediaItem().read().read("recordDeviceIDErrors", new Callable() { // from class: o.getLooper
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.read.MediaBrowserCompatMediaItem();
            }
        });
    }

    final /* synthetic */ Void MediaDescriptionCompat() throws Exception {
        if (!MediaMetadataCompat().MediaBrowserCompatSearchResultReceiver()) {
            return null;
        }
        generatePlayingMediaPeriodEventTime.write(this.MediaBrowserCompatCustomActionResultReceiver, this.MediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer(), this.MediaBrowserCompatItemReceiver.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
        return null;
    }

    final /* synthetic */ Void MediaBrowserCompatSearchResultReceiver() throws Exception {
        this.MediaBrowserCompatItemReceiver.onCommand().AudioAttributesCompatParcelizer();
        this.MediaBrowserCompatItemReceiver.onCommand().write();
        this.MediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer().onRewind();
        this.MediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer().onPrepareFromMediaId();
        this.MediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer().onRemoveQueueItem();
        return null;
    }

    final /* synthetic */ Void AudioAttributesImplBaseParcelizer() throws Exception {
        String strOnPause = MediaMetadataCompat().onPause();
        if (strOnPause == null) {
            RendererWakeupListener.MediaMetadataCompat();
            return null;
        }
        RendererCapabilitiesFormatSupport.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, RendererCapabilitiesFormatSupport.AudioAttributesCompatParcelizer(MediaMetadataCompat(), "instance"), strOnPause);
        return null;
    }

    final /* synthetic */ Void MediaBrowserCompatMediaItem() throws Exception {
        if (this.MediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer().MediaBrowserCompatCustomActionResultReceiver() == null) {
            return null;
        }
        this.MediaBrowserCompatItemReceiver.onCustomAction().RemoteActionCompatParcelizer();
        return null;
    }

    public final void AudioAttributesCompatParcelizer(String str, String str2) {
        if (str2 == null || str2.isEmpty()) {
            this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(str);
        } else {
            IconCompatParcelizer(str, new ArrayList<>(Collections.singletonList(str2)));
        }
    }

    public final void IconCompatParcelizer(String str, ArrayList<String> arrayList) {
        this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer().IconCompatParcelizer(str, arrayList);
    }

    public final String AudioAttributesImplApi26Parcelizer() {
        return this.MediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer().write();
    }

    public final ArrayList<CTInboxMessage> MediaBrowserCompatItemReceiver() {
        RendererWakeupListener.MediaBrowserCompatItemReceiver();
        ArrayList<CTInboxMessage> arrayList = new ArrayList<>();
        synchronized (this.MediaBrowserCompatItemReceiver.write().RemoteActionCompatParcelizer()) {
            if (this.MediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver().read() != null) {
                for (clearPositionDiscontinuity clearpositiondiscontinuity : this.MediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver().read().write()) {
                    clearpositiondiscontinuity.MediaDescriptionCompat().toString();
                    RendererWakeupListener.MediaMetadataCompat();
                    arrayList.add(new CTInboxMessage(clearpositiondiscontinuity.MediaDescriptionCompat()));
                }
                return arrayList;
            }
            handleMediaPlayPauseIfPendingOnHandler().IconCompatParcelizer(AudioAttributesImplApi26Parcelizer(), "Notification Inbox not initialized");
            return arrayList;
        }
    }

    public final void IconCompatParcelizer(String str, Number number) {
        this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer().IconCompatParcelizer(str, number);
    }

    public final PlaylistTimeline MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final int AudioAttributesImplApi21Parcelizer() {
        synchronized (this.MediaBrowserCompatItemReceiver.write().RemoteActionCompatParcelizer()) {
            if (this.MediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver().read() != null) {
                return this.MediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver().read().RemoteActionCompatParcelizer();
            }
            handleMediaPlayPauseIfPendingOnHandler().IconCompatParcelizer(AudioAttributesImplApi26Parcelizer(), "Notification Inbox not initialized");
            return -1;
        }
    }

    private CTInboxMessage AudioAttributesImplApi21Parcelizer(String str) {
        RendererWakeupListener.MediaBrowserCompatItemReceiver();
        synchronized (this.MediaBrowserCompatItemReceiver.write().RemoteActionCompatParcelizer()) {
            if (this.MediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver().read() != null) {
                clearPositionDiscontinuity clearpositiondiscontinuityIconCompatParcelizer = this.MediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver().read().IconCompatParcelizer(str);
                return clearpositiondiscontinuityIconCompatParcelizer != null ? new CTInboxMessage(clearpositiondiscontinuityIconCompatParcelizer.MediaDescriptionCompat()) : null;
            }
            handleMediaPlayPauseIfPendingOnHandler().IconCompatParcelizer(AudioAttributesImplApi26Parcelizer(), "Notification Inbox not initialized");
            return null;
        }
    }

    private void read(CTInboxMessage cTInboxMessage) {
        if (this.MediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver().read() != null) {
            this.MediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver().read().RemoteActionCompatParcelizer(cTInboxMessage);
        } else {
            handleMediaPlayPauseIfPendingOnHandler().IconCompatParcelizer(AudioAttributesImplApi26Parcelizer(), "Notification Inbox not initialized");
        }
    }

    @Override // o.SimpleBasePlayerPlaceholderUid.write
    public final void write(CTInboxMessage cTInboxMessage, Bundle bundle, HashMap<String, String> map) {
        this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer().read(true, cTInboxMessage, bundle);
        RendererWakeupListener.MediaMetadataCompat();
        if (map == null || map.isEmpty()) {
            return;
        }
        RendererWakeupListener.MediaMetadataCompat();
    }

    @Override // o.SimpleBasePlayerPlaceholderUid.write
    public final void AudioAttributesCompatParcelizer(final CTInboxMessage cTInboxMessage, final Bundle bundle) {
        this.MediaBrowserCompatItemReceiver.MediaBrowserCompatMediaItem().read().read("handleMessageDidShow", new Callable() { // from class: o.getDeleteAfterDelivery
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.read.read(cTInboxMessage, bundle);
            }
        });
    }

    final /* synthetic */ Void read(CTInboxMessage cTInboxMessage, Bundle bundle) throws Exception {
        cTInboxMessage.write();
        RendererWakeupListener.MediaBrowserCompatItemReceiver();
        if (AudioAttributesImplApi21Parcelizer(cTInboxMessage.write()).MediaBrowserCompatCustomActionResultReceiver()) {
            return null;
        }
        read(cTInboxMessage);
        this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer().read(false, cTInboxMessage, bundle);
        return null;
    }

    private void write(Map<String, Object> map) {
        this.MediaBrowserCompatItemReceiver.onCustomAction().write(map, null);
    }

    public final void RemoteActionCompatParcelizer(Map<String, Object> map) {
        write(map);
    }

    public final void write(HashMap<String, Object> map, ArrayList<HashMap<String, Object>> arrayList) {
        this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer().read(map, arrayList);
    }

    public final void IconCompatParcelizer(String str) {
        if (str == null || str.trim().isEmpty()) {
            return;
        }
        read(str, (Map<String, Object>) null);
    }

    public final void read(String str, Map<String, Object> map) {
        this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer().IconCompatParcelizer(str, map);
    }

    public final void read(Bundle bundle) {
        this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer().IconCompatParcelizer(bundle);
    }

    public final void read(Map<String, Object> map) {
        this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(map);
    }

    public final void write(String str) {
        String strOnMediaButtonEvent = this.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer().onMediaButtonEvent();
        if (str != null) {
            if (strOnMediaButtonEvent == null || strOnMediaButtonEvent.isEmpty() || !strOnMediaButtonEvent.equals(str)) {
                handleMediaPlayPauseIfPendingOnHandler().IconCompatParcelizer(AudioAttributesImplApi26Parcelizer(), "Screen changed to ".concat(String.valueOf(str)));
                this.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer().RemoteActionCompatParcelizer(str);
                this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer((JSONObject) null);
            }
        }
    }

    public final void read(String str, String str2) {
        if (str2 == null || str2.isEmpty()) {
            this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(str);
        } else {
            AudioAttributesCompatParcelizer(str, new ArrayList<>(Collections.singletonList(str2)));
        }
    }

    public final void AudioAttributesCompatParcelizer(String str, ArrayList<String> arrayList) {
        this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(str, arrayList);
    }

    public final void MediaBrowserCompatCustomActionResultReceiver(String str) {
        this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer().read(str);
    }

    public static setCurrentAd read() {
        return RemoteActionCompatParcelizer;
    }

    public final void write(String str, Number number) {
        this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer(str, number);
    }

    public static void IconCompatParcelizer(String str, setContentPositionMs setcontentpositionms) {
        AudioAttributesImplBaseParcelizer.put(str, setcontentpositionms);
    }

    public static setContentPositionMs read(String str) {
        return AudioAttributesImplBaseParcelizer.get(str);
    }

    public static setContentPositionMs RemoteActionCompatParcelizer(String str) {
        return AudioAttributesImplBaseParcelizer.remove(str);
    }

    public final void RemoteActionCompatParcelizer(String str, ArrayList<String> arrayList) {
        this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer().write(str, arrayList);
    }

    final void AudioAttributesCompatParcelizer(final String str) {
        final String strWrite = this.MediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer().write();
        if (this.MediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver() == null) {
            RendererWakeupListener rendererWakeupListenerHandleMediaPlayPauseIfPendingOnHandler = handleMediaPlayPauseIfPendingOnHandler();
            StringBuilder sb = new StringBuilder();
            sb.append(strWrite);
            sb.append(":async_deviceID");
            rendererWakeupListenerHandleMediaPlayPauseIfPendingOnHandler.write(sb.toString(), "ControllerManager not set yet! Returning from deviceIDCreated()");
            return;
        }
        final SimpleBasePlayerPeriodData simpleBasePlayerPeriodDataOnAddQueueItem = this.MediaBrowserCompatItemReceiver.onAddQueueItem();
        final getPeriodIndexFromWindowPosition getperiodindexfromwindowpositionMediaBrowserCompatCustomActionResultReceiver = this.MediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver();
        final RendererCapabilitiesDecoderSupport rendererCapabilitiesDecoderSupport = RendererCapabilitiesDecoderSupport.read();
        final handleSetVideoOutput handlesetvideooutputMediaMetadataCompat = this.MediaBrowserCompatItemReceiver.MediaMetadataCompat();
        this.MediaBrowserCompatItemReceiver.MediaBrowserCompatSearchResultReceiver().AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
        this.MediaBrowserCompatItemReceiver.MediaBrowserCompatMediaItem().IconCompatParcelizer().read("initStores", new Callable() { // from class: o.blockUntilDelivered
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.RemoteActionCompatParcelizer.IconCompatParcelizer(simpleBasePlayerPeriodDataOnAddQueueItem, rendererCapabilitiesDecoderSupport, getperiodindexfromwindowpositionMediaBrowserCompatCustomActionResultReceiver, str, strWrite, handlesetvideooutputMediaMetadataCompat);
            }
        });
        if (this.MediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver().MediaBrowserCompatItemReceiver() == null) {
            RendererWakeupListener rendererWakeupListenerHandleMediaPlayPauseIfPendingOnHandler2 = handleMediaPlayPauseIfPendingOnHandler();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strWrite);
            sb2.append(":async_deviceID");
            rendererWakeupListenerHandleMediaPlayPauseIfPendingOnHandler2.write(sb2.toString(), "Initializing InAppFC after Device ID Created = ".concat(String.valueOf(str)));
            this.MediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver().write(new Rfont(this.MediaBrowserCompatCustomActionResultReceiver, this.MediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer(), str, this.MediaBrowserCompatItemReceiver.onAddQueueItem(), this.MediaBrowserCompatItemReceiver.MediaDescriptionCompat(), this.MediaBrowserCompatItemReceiver.MediaBrowserCompatMediaItem(), IconCompatParcelizer));
        }
        lambdasetVideoTextureView20 lambdasetvideotextureview20AudioAttributesCompatParcelizer = this.MediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver().AudioAttributesCompatParcelizer();
        if (lambdasetvideotextureview20AudioAttributesCompatParcelizer != null && TextUtils.isEmpty(lambdasetvideotextureview20AudioAttributesCompatParcelizer.write())) {
            RendererWakeupListener rendererWakeupListenerHandleMediaPlayPauseIfPendingOnHandler3 = handleMediaPlayPauseIfPendingOnHandler();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(strWrite);
            sb3.append(":async_deviceID");
            rendererWakeupListenerHandleMediaPlayPauseIfPendingOnHandler3.write(sb3.toString(), "Initializing Feature Flags after Device ID Created = ".concat(String.valueOf(str)));
            lambdasetvideotextureview20AudioAttributesCompatParcelizer.IconCompatParcelizer(str);
        }
        getPeriodPosition getperiodpositionIconCompatParcelizer = this.MediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver().IconCompatParcelizer();
        if (getperiodpositionIconCompatParcelizer != null && TextUtils.isEmpty(getperiodpositionIconCompatParcelizer.read().AudioAttributesCompatParcelizer())) {
            RendererWakeupListener rendererWakeupListenerHandleMediaPlayPauseIfPendingOnHandler4 = handleMediaPlayPauseIfPendingOnHandler();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(strWrite);
            sb4.append(":async_deviceID");
            rendererWakeupListenerHandleMediaPlayPauseIfPendingOnHandler4.write(sb4.toString(), "Initializing Product Config after Device ID Created = ".concat(String.valueOf(str)));
            getperiodpositionIconCompatParcelizer.write(str);
        }
        RendererWakeupListener rendererWakeupListenerHandleMediaPlayPauseIfPendingOnHandler5 = handleMediaPlayPauseIfPendingOnHandler();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(strWrite);
        sb5.append(":async_deviceID");
        rendererWakeupListenerHandleMediaPlayPauseIfPendingOnHandler5.write(sb5.toString(), "Got device id from DeviceInfo, notifying user profile initialized to SyncListener");
        this.MediaBrowserCompatItemReceiver.read().AudioAttributesCompatParcelizer(str);
        this.MediaBrowserCompatItemReceiver.read().MediaMetadataCompat();
    }

    final /* synthetic */ Void IconCompatParcelizer(SimpleBasePlayerPeriodData simpleBasePlayerPeriodData, RendererCapabilitiesDecoderSupport rendererCapabilitiesDecoderSupport, getPeriodIndexFromWindowPosition getperiodindexfromwindowposition, String str, String str2, handleSetVideoOutput handlesetvideooutput) throws Exception {
        if (simpleBasePlayerPeriodData.getWrite() == null) {
            access6500 access6500VarIconCompatParcelizer = RendererCapabilitiesDecoderSupport.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, getperiodindexfromwindowposition, str, str2);
            simpleBasePlayerPeriodData.RemoteActionCompatParcelizer(access6500VarIconCompatParcelizer);
            handlesetvideooutput.AudioAttributesCompatParcelizer();
            this.MediaBrowserCompatItemReceiver.read().IconCompatParcelizer(access6500VarIconCompatParcelizer);
        }
        if (simpleBasePlayerPeriodData.getAudioAttributesCompatParcelizer() != null) {
            return null;
        }
        setTracks settracks = RendererCapabilitiesDecoderSupport.read(this.MediaBrowserCompatCustomActionResultReceiver, str, str2);
        simpleBasePlayerPeriodData.IconCompatParcelizer(settracks);
        this.MediaBrowserCompatItemReceiver.read().IconCompatParcelizer(settracks);
        return null;
    }

    private CleverTapInstanceConfig MediaMetadataCompat() {
        return this.MediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RendererWakeupListener handleMediaPlayPauseIfPendingOnHandler() {
        return MediaMetadataCompat().MediaBrowserCompatItemReceiver();
    }

    private boolean onCommand() {
        return this.MediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer().onPrepare();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void read(android.app.Activity r6, java.lang.String r7) {
        /*
            java.lang.String r0 = "wzrk_from"
            java.lang.String r1 = "wzrk_acct_id"
            java.util.HashMap<java.lang.String, o.PlayerTimelineChangeReason> r2 = kotlin.PlayerTimelineChangeReason.AudioAttributesCompatParcelizer
            r3 = 0
            if (r2 != 0) goto L10
            android.content.Context r2 = r6.getApplicationContext()
            AudioAttributesCompatParcelizer(r2, r3, r7)
        L10:
            java.util.HashMap<java.lang.String, o.PlayerTimelineChangeReason> r7 = kotlin.PlayerTimelineChangeReason.AudioAttributesCompatParcelizer
            if (r7 != 0) goto L18
            kotlin.RendererWakeupListener.MediaMetadataCompat()
            return
        L18:
            r7 = 1
            android.content.Intent r2 = r6.getIntent()     // Catch: java.lang.Throwable -> L30
            android.net.Uri r2 = r2.getData()     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L31
            java.lang.String r4 = r2.toString()     // Catch: java.lang.Throwable -> L31
            android.os.Bundle r4 = kotlin.getEventTimeForErrorEvent.read(r4, r7)     // Catch: java.lang.Throwable -> L31
            java.lang.String r4 = r4.getString(r1)     // Catch: java.lang.Throwable -> L31
            goto L32
        L30:
            r2 = r3
        L31:
            r4 = r3
        L32:
            r5 = 0
            android.content.Intent r6 = r6.getIntent()     // Catch: java.lang.Throwable -> L6d
            android.os.Bundle r3 = r6.getExtras()     // Catch: java.lang.Throwable -> L6d
            if (r3 == 0) goto L6d
            boolean r6 = r3.isEmpty()     // Catch: java.lang.Throwable -> L6d
            if (r6 != 0) goto L6d
            boolean r6 = r3.containsKey(r0)     // Catch: java.lang.Throwable -> L6d
            if (r6 == 0) goto L56
            java.lang.String r6 = "CTPushNotificationReceiver"
            java.lang.Object r0 = r3.get(r0)     // Catch: java.lang.Throwable -> L6d
            boolean r6 = r6.equals(r0)     // Catch: java.lang.Throwable -> L6d
            if (r6 == 0) goto L56
            goto L57
        L56:
            r7 = r5
        L57:
            if (r7 == 0) goto L5f
            java.util.Objects.toString(r3)     // Catch: java.lang.Throwable -> L6c
            kotlin.RendererWakeupListener.MediaMetadataCompat()     // Catch: java.lang.Throwable -> L6c
        L5f:
            boolean r6 = r3.containsKey(r1)     // Catch: java.lang.Throwable -> L6c
            if (r6 == 0) goto L6c
            java.lang.Object r6 = r3.get(r1)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L6c
            r4 = r6
        L6c:
            r5 = r7
        L6d:
            if (r5 == 0) goto L71
            if (r2 == 0) goto La2
        L71:
            java.util.HashMap<java.lang.String, o.PlayerTimelineChangeReason> r6 = kotlin.PlayerTimelineChangeReason.AudioAttributesCompatParcelizer     // Catch: java.lang.Throwable -> L9b
            java.util.Set r6 = r6.keySet()     // Catch: java.lang.Throwable -> L9b
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> L9b
        L7b:
            boolean r7 = r6.hasNext()     // Catch: java.lang.Throwable -> L9b
            if (r7 == 0) goto La2
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> L9b
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L9b
            java.util.HashMap<java.lang.String, o.PlayerTimelineChangeReason> r0 = kotlin.PlayerTimelineChangeReason.AudioAttributesCompatParcelizer     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r7 = r0.get(r7)     // Catch: java.lang.Throwable -> L9b
            o.PlayerTimelineChangeReason r7 = (kotlin.PlayerTimelineChangeReason) r7     // Catch: java.lang.Throwable -> L9b
            if (r7 == 0) goto L7b
            o.PlaylistTimeline r7 = r7.MediaBrowserCompatItemReceiver     // Catch: java.lang.Throwable -> L9b
            o.copyWithPlaybackState r7 = r7.AudioAttributesCompatParcelizer()     // Catch: java.lang.Throwable -> L9b
            r7.read(r3, r2, r4)     // Catch: java.lang.Throwable -> L9b
            goto L7b
        L9b:
            r6 = move-exception
            r6.getLocalizedMessage()
            kotlin.RendererWakeupListener.MediaMetadataCompat()
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.PlayerTimelineChangeReason.read(android.app.Activity, java.lang.String):void");
    }

    private static PlayerTimelineChangeReason RemoteActionCompatParcelizer(Context context, String str) {
        return AudioAttributesCompatParcelizer(context, str, null);
    }

    private static PlayerTimelineChangeReason AudioAttributesCompatParcelizer(Context context, String str, String str2) {
        if (str == null) {
            try {
                return read(context, str2);
            } catch (Throwable th) {
                th.getCause();
                RendererWakeupListener.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                return null;
            }
        }
        StringBuilder sb = new StringBuilder("instance:");
        sb.append(str);
        String strWrite = RendererCapabilitiesFormatSupport.write(context, sb.toString(), "");
        if (!strWrite.isEmpty()) {
            CleverTapInstanceConfig cleverTapInstanceConfigIconCompatParcelizer = CleverTapInstanceConfig.IconCompatParcelizer(strWrite);
            RendererWakeupListener.MediaMetadataCompat();
            if (cleverTapInstanceConfigIconCompatParcelizer != null) {
                return RemoteActionCompatParcelizer(context, cleverTapInstanceConfigIconCompatParcelizer, str2);
            }
            return null;
        }
        try {
            PlayerTimelineChangeReason playerTimelineChangeReasonWrite = write(context);
            if (playerTimelineChangeReasonWrite != null) {
                if (playerTimelineChangeReasonWrite.MediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer().write().equals(str)) {
                    return playerTimelineChangeReasonWrite;
                }
            }
            return null;
        } catch (Throwable th2) {
            th2.getCause();
            RendererWakeupListener.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
        return null;
        return null;
    }

    public static ArrayList<PlayerTimelineChangeReason> RemoteActionCompatParcelizer(Context context) {
        ArrayList<PlayerTimelineChangeReason> arrayList = new ArrayList<>();
        HashMap<String, PlayerTimelineChangeReason> map = AudioAttributesCompatParcelizer;
        if (map == null || map.isEmpty()) {
            PlayerTimelineChangeReason playerTimelineChangeReasonWrite = write(context);
            if (playerTimelineChangeReasonWrite != null) {
                arrayList.add(playerTimelineChangeReasonWrite);
            }
            return arrayList;
        }
        arrayList.addAll(AudioAttributesCompatParcelizer.values());
        return arrayList;
    }

    private static CleverTapInstanceConfig read(Context context) {
        RendererState.IconCompatParcelizer(context);
        String strWrite = RendererState.write();
        String strRemoteActionCompatParcelizer = RendererState.RemoteActionCompatParcelizer();
        String strAudioAttributesCompatParcelizer = RendererState.AudioAttributesCompatParcelizer();
        String strMediaBrowserCompatMediaItem = RendererState.MediaBrowserCompatMediaItem();
        String strHandleMediaPlayPauseIfPendingOnHandler = RendererState.handleMediaPlayPauseIfPendingOnHandler();
        String strMediaBrowserCompatItemReceiver = RendererState.MediaBrowserCompatItemReceiver();
        if (strWrite == null || strRemoteActionCompatParcelizer == null) {
            RendererWakeupListener.MediaBrowserCompatCustomActionResultReceiver();
            return null;
        }
        if (strAudioAttributesCompatParcelizer == null) {
            RendererWakeupListener.MediaBrowserCompatCustomActionResultReceiver();
        }
        CleverTapInstanceConfig cleverTapInstanceConfigIconCompatParcelizer = CleverTapInstanceConfig.IconCompatParcelizer(context, strWrite, strRemoteActionCompatParcelizer, strAudioAttributesCompatParcelizer);
        if (strMediaBrowserCompatMediaItem != null && !strMediaBrowserCompatMediaItem.trim().isEmpty()) {
            cleverTapInstanceConfigIconCompatParcelizer.RemoteActionCompatParcelizer(strMediaBrowserCompatMediaItem);
        }
        if (strHandleMediaPlayPauseIfPendingOnHandler != null && !strHandleMediaPlayPauseIfPendingOnHandler.trim().isEmpty()) {
            cleverTapInstanceConfigIconCompatParcelizer.write(strHandleMediaPlayPauseIfPendingOnHandler);
        }
        if (strMediaBrowserCompatItemReceiver != null && !strMediaBrowserCompatItemReceiver.trim().isEmpty()) {
            cleverTapInstanceConfigIconCompatParcelizer.read(strMediaBrowserCompatItemReceiver);
        }
        return cleverTapInstanceConfigIconCompatParcelizer;
    }

    private static PlayerTimelineChangeReason AudioAttributesCompatParcelizer(Context context) {
        HashMap<String, PlayerTimelineChangeReason> map;
        PlayerTimelineChangeReason playerTimelineChangeReasonWrite = write(context);
        if (playerTimelineChangeReasonWrite == null && (map = AudioAttributesCompatParcelizer) != null && !map.isEmpty()) {
            Iterator<String> it = AudioAttributesCompatParcelizer.keySet().iterator();
            while (it.hasNext()) {
                playerTimelineChangeReasonWrite = AudioAttributesCompatParcelizer.get(it.next());
                if (playerTimelineChangeReasonWrite != null) {
                    break;
                }
            }
        }
        return playerTimelineChangeReasonWrite;
    }

    public static void AudioAttributesCompatParcelizer(setCurrentAd setcurrentad) {
        RemoteActionCompatParcelizer = setcurrentad;
    }

    public final Future<?> RemoteActionCompatParcelizer(final getAdCountInAdGroup getadcountinadgroup, final Context context, final Bundle bundle) {
        CleverTapInstanceConfig cleverTapInstanceConfigAudioAttributesImplApi26Parcelizer = this.MediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer();
        try {
            return this.MediaBrowserCompatItemReceiver.MediaBrowserCompatMediaItem().read().RemoteActionCompatParcelizer("CleverTapAPI#renderPushNotification", new Callable() { // from class: o.PlayerPositionInfoExternalSyntheticLambda0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return this.read.RemoteActionCompatParcelizer(getadcountinadgroup, bundle, context);
                }
            });
        } catch (Throwable unused) {
            RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = cleverTapInstanceConfigAudioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver();
            cleverTapInstanceConfigAudioAttributesImplApi26Parcelizer.write();
            rendererWakeupListenerMediaBrowserCompatItemReceiver.write();
            return null;
        }
    }

    final /* synthetic */ Void RemoteActionCompatParcelizer(getAdCountInAdGroup getadcountinadgroup, Bundle bundle, Context context) throws Exception {
        synchronized (this.MediaBrowserCompatItemReceiver.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().read()) {
            this.MediaBrowserCompatItemReceiver.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().AudioAttributesCompatParcelizer(getadcountinadgroup);
            if (bundle != null && bundle.containsKey("notificationId")) {
                this.MediaBrowserCompatItemReceiver.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().write(context, bundle, bundle.getInt("notificationId"));
            } else {
                this.MediaBrowserCompatItemReceiver.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().write(context, bundle, -1000);
            }
        }
        return null;
    }

    public final void write(getAdCountInAdGroup getadcountinadgroup, Context context, Bundle bundle) {
        CleverTapInstanceConfig cleverTapInstanceConfigAudioAttributesImplApi26Parcelizer = this.MediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer();
        try {
            synchronized (this.MediaBrowserCompatItemReceiver.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().read()) {
                RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = cleverTapInstanceConfigAudioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver();
                String strWrite = cleverTapInstanceConfigAudioAttributesImplApi26Parcelizer.write();
                StringBuilder sb = new StringBuilder("rendering push on caller thread with id = ");
                sb.append(Thread.currentThread().getId());
                rendererWakeupListenerMediaBrowserCompatItemReceiver.write(strWrite, sb.toString());
                this.MediaBrowserCompatItemReceiver.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().AudioAttributesCompatParcelizer(getadcountinadgroup);
                if (bundle != null && bundle.containsKey("notificationId")) {
                    this.MediaBrowserCompatItemReceiver.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().write(context, bundle, bundle.getInt("notificationId"));
                } else {
                    this.MediaBrowserCompatItemReceiver.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().write(context, bundle, -1000);
                }
            }
        } catch (Throwable unused) {
            RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver2 = cleverTapInstanceConfigAudioAttributesImplApi26Parcelizer.MediaBrowserCompatItemReceiver();
            cleverTapInstanceConfigAudioAttributesImplApi26Parcelizer.write();
            rendererWakeupListenerMediaBrowserCompatItemReceiver2.write();
        }
    }
}
