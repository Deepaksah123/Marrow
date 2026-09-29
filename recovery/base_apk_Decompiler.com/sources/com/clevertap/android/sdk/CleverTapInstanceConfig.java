package com.clevertap.android.sdk;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.AnalyticsCollector;
import kotlin.PlayerTimelineChangeReason;
import kotlin.RendererState;
import kotlin.RendererWakeupListener;
import kotlin.getAdGroupIndexAfterPositionUs;
import kotlin.getAdState;
import kotlin.getAdsId;
import kotlin.getTimelines;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class CleverTapInstanceConfig implements Parcelable {
    public static final Parcelable.Creator<CleverTapInstanceConfig> CREATOR = new Parcelable.Creator<CleverTapInstanceConfig>() { // from class: com.clevertap.android.sdk.CleverTapInstanceConfig.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CleverTapInstanceConfig createFromParcel(Parcel parcel) {
            return IconCompatParcelizer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CleverTapInstanceConfig[] newArray(int i) {
            return write(i);
        }

        private static CleverTapInstanceConfig IconCompatParcelizer(Parcel parcel) {
            return new CleverTapInstanceConfig(parcel, (byte) 0);
        }

        private static CleverTapInstanceConfig[] write(int i) {
            return new CleverTapInstanceConfig[i];
        }
    };
    private boolean AudioAttributesCompatParcelizer;
    private String AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private boolean IconCompatParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private boolean MediaBrowserCompatItemReceiver;
    private String[] MediaBrowserCompatMediaItem;
    private boolean MediaBrowserCompatSearchResultReceiver;
    private boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private String MediaDescriptionCompat;
    private String MediaMetadataCompat;
    private int RatingCompat;
    private String RemoteActionCompatParcelizer;
    private String handleMediaPlayPauseIfPendingOnHandler;
    private boolean onAddQueueItem;
    private RendererWakeupListener onCommand;
    private String onCustomAction;
    private String onFastForward;
    private boolean onMediaButtonEvent;
    private boolean onPause;
    private final ArrayList<getAdsId> onPlayFromMediaId;
    private String read;
    private String write;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* synthetic */ CleverTapInstanceConfig(Parcel parcel, byte b) {
        this(parcel);
    }

    public static CleverTapInstanceConfig IconCompatParcelizer(Context context, String str, String str2, String str3) {
        return AudioAttributesCompatParcelizer(RendererState.IconCompatParcelizer(context), str, str2, str3);
    }

    private static CleverTapInstanceConfig AudioAttributesCompatParcelizer(RendererState rendererState, String str, String str2, String str3) {
        return new CleverTapInstanceConfig(rendererState, str, str2, str3, true);
    }

    public static CleverTapInstanceConfig IconCompatParcelizer(String str) {
        try {
            return new CleverTapInstanceConfig(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public CleverTapInstanceConfig(CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.onPlayFromMediaId = getAdState.read();
        this.MediaBrowserCompatMediaItem = getTimelines.write;
        this.write = cleverTapInstanceConfig.write;
        this.read = cleverTapInstanceConfig.read;
        this.RemoteActionCompatParcelizer = cleverTapInstanceConfig.RemoteActionCompatParcelizer;
        this.onCustomAction = cleverTapInstanceConfig.onCustomAction;
        this.onFastForward = cleverTapInstanceConfig.onFastForward;
        this.AudioAttributesImplApi21Parcelizer = cleverTapInstanceConfig.AudioAttributesImplApi21Parcelizer;
        this.onAddQueueItem = cleverTapInstanceConfig.onAddQueueItem;
        this.IconCompatParcelizer = cleverTapInstanceConfig.IconCompatParcelizer;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = cleverTapInstanceConfig.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        this.AudioAttributesImplApi26Parcelizer = cleverTapInstanceConfig.AudioAttributesImplApi26Parcelizer;
        this.onCommand = cleverTapInstanceConfig.onCommand;
        this.onMediaButtonEvent = cleverTapInstanceConfig.onMediaButtonEvent;
        this.MediaBrowserCompatItemReceiver = cleverTapInstanceConfig.MediaBrowserCompatItemReceiver;
        this.MediaBrowserCompatCustomActionResultReceiver = cleverTapInstanceConfig.MediaBrowserCompatCustomActionResultReceiver;
        this.onPause = cleverTapInstanceConfig.onPause;
        this.AudioAttributesCompatParcelizer = cleverTapInstanceConfig.AudioAttributesCompatParcelizer;
        this.MediaBrowserCompatSearchResultReceiver = cleverTapInstanceConfig.MediaBrowserCompatSearchResultReceiver;
        this.MediaMetadataCompat = cleverTapInstanceConfig.MediaMetadataCompat;
        this.handleMediaPlayPauseIfPendingOnHandler = cleverTapInstanceConfig.handleMediaPlayPauseIfPendingOnHandler;
        this.AudioAttributesImplBaseParcelizer = cleverTapInstanceConfig.AudioAttributesImplBaseParcelizer;
        this.MediaBrowserCompatMediaItem = cleverTapInstanceConfig.MediaBrowserCompatMediaItem;
        this.RatingCompat = cleverTapInstanceConfig.RatingCompat;
        Iterator<getAdsId> it = cleverTapInstanceConfig.onPlayFromMediaId.iterator();
        while (it.hasNext()) {
            write(it.next());
        }
        this.MediaDescriptionCompat = cleverTapInstanceConfig.MediaDescriptionCompat;
    }

    private CleverTapInstanceConfig(RendererState rendererState, String str, String str2, String str3, boolean z) {
        this.onPlayFromMediaId = getAdState.read();
        this.MediaBrowserCompatMediaItem = getTimelines.write;
        this.write = str;
        this.read = str2;
        this.RemoteActionCompatParcelizer = str3;
        this.onAddQueueItem = true;
        this.IconCompatParcelizer = false;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = true;
        int iAudioAttributesCompatParcelizer = PlayerTimelineChangeReason.AudioAttributesCompatParcelizer.INFO.AudioAttributesCompatParcelizer();
        this.AudioAttributesImplApi26Parcelizer = iAudioAttributesCompatParcelizer;
        this.onCommand = new RendererWakeupListener(iAudioAttributesCompatParcelizer);
        this.MediaBrowserCompatCustomActionResultReceiver = false;
        this.onMediaButtonEvent = rendererState.onPlayFromMediaId();
        this.MediaBrowserCompatItemReceiver = rendererState.onAddQueueItem();
        this.onPause = rendererState.onFastForward();
        this.AudioAttributesCompatParcelizer = rendererState.onCommand();
        this.MediaMetadataCompat = rendererState.MediaBrowserCompatCustomActionResultReceiver();
        this.handleMediaPlayPauseIfPendingOnHandler = rendererState.RatingCompat();
        this.MediaBrowserCompatSearchResultReceiver = rendererState.onPlay();
        this.AudioAttributesImplBaseParcelizer = rendererState.read();
        if (this.onAddQueueItem) {
            this.RatingCompat = rendererState.AudioAttributesImplBaseParcelizer();
            this.MediaBrowserCompatMediaItem = rendererState.MediaMetadataCompat();
            StringBuilder sb = new StringBuilder("Setting Profile Keys from Manifest: ");
            sb.append(Arrays.toString(this.MediaBrowserCompatMediaItem));
            read("ON_USER_LOGIN", sb.toString());
        } else {
            this.RatingCompat = 0;
        }
        AudioAttributesCompatParcelizer(rendererState);
        String strAudioAttributesImplApi26Parcelizer = rendererState.AudioAttributesImplApi26Parcelizer();
        this.MediaDescriptionCompat = strAudioAttributesImplApi26Parcelizer == null ? SessionDescription.SUPPORTED_SDP_VERSION : strAudioAttributesImplApi26Parcelizer;
    }

    private void AudioAttributesCompatParcelizer(RendererState rendererState) {
        String[] strArrSplit;
        String[] strArrSplit2;
        try {
            String strOnCustomAction = rendererState.onCustomAction();
            if (strOnCustomAction != null && (strArrSplit2 = strOnCustomAction.split(",")) != null && strArrSplit2.length == 4) {
                write(new getAdsId(strArrSplit2[0].trim(), strArrSplit2[1].trim(), strArrSplit2[2].trim(), strArrSplit2[3].trim()));
            }
            String strMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = rendererState.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            if (strMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == null || (strArrSplit = strMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.split(",")) == null || strArrSplit.length != 4) {
                return;
            }
            write(new getAdsId(strArrSplit[0].trim(), strArrSplit[1].trim(), strArrSplit[2].trim(), strArrSplit[3].trim()));
        } catch (Exception unused) {
            RendererWakeupListener.MediaMetadataCompat();
        }
    }

    private CleverTapInstanceConfig(String str) throws Throwable {
        this.onPlayFromMediaId = getAdState.read();
        this.MediaBrowserCompatMediaItem = getTimelines.write;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("accountId")) {
                this.write = jSONObject.getString("accountId");
            }
            if (jSONObject.has("accountToken")) {
                this.read = jSONObject.getString("accountToken");
            }
            if (jSONObject.has("proxyDomain")) {
                this.onCustomAction = jSONObject.getString("proxyDomain");
            }
            if (jSONObject.has("spikyProxyDomain")) {
                this.onFastForward = jSONObject.getString("spikyProxyDomain");
            }
            if (jSONObject.has("customHandshakeDomain")) {
                this.AudioAttributesImplApi21Parcelizer = jSONObject.optString("customHandshakeDomain", null);
            }
            if (jSONObject.has("accountRegion")) {
                this.RemoteActionCompatParcelizer = jSONObject.getString("accountRegion");
            }
            if (jSONObject.has("analyticsOnly")) {
                this.IconCompatParcelizer = jSONObject.getBoolean("analyticsOnly");
            }
            if (jSONObject.has("isDefaultInstance")) {
                this.onAddQueueItem = jSONObject.getBoolean("isDefaultInstance");
            }
            if (jSONObject.has("useGoogleAdId")) {
                this.onMediaButtonEvent = jSONObject.getBoolean("useGoogleAdId");
            }
            if (jSONObject.has("disableAppLaunchedEvent")) {
                this.MediaBrowserCompatItemReceiver = jSONObject.getBoolean("disableAppLaunchedEvent");
            }
            if (jSONObject.has("personalization")) {
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = jSONObject.getBoolean("personalization");
            }
            if (jSONObject.has("debugLevel")) {
                this.AudioAttributesImplApi26Parcelizer = jSONObject.getInt("debugLevel");
            }
            this.onCommand = new RendererWakeupListener(this.AudioAttributesImplApi26Parcelizer);
            if (jSONObject.has("packageName")) {
                this.handleMediaPlayPauseIfPendingOnHandler = jSONObject.getString("packageName");
            }
            if (jSONObject.has("createdPostAppLaunch")) {
                this.MediaBrowserCompatCustomActionResultReceiver = jSONObject.getBoolean("createdPostAppLaunch");
            }
            if (jSONObject.has("sslPinning")) {
                this.onPause = jSONObject.getBoolean("sslPinning");
            }
            if (jSONObject.has("backgroundSync")) {
                this.AudioAttributesCompatParcelizer = jSONObject.getBoolean("backgroundSync");
            }
            if (jSONObject.has("getEnableCustomCleverTapId")) {
                this.MediaBrowserCompatSearchResultReceiver = jSONObject.getBoolean("getEnableCustomCleverTapId");
            }
            if (jSONObject.has("fcmSenderId")) {
                this.MediaMetadataCompat = jSONObject.getString("fcmSenderId");
            }
            if (jSONObject.has("beta")) {
                this.AudioAttributesImplBaseParcelizer = jSONObject.getBoolean("beta");
            }
            if (jSONObject.has("identityTypes")) {
                this.MediaBrowserCompatMediaItem = (String[]) AnalyticsCollector.read(jSONObject.getJSONArray("identityTypes"));
            }
            if (jSONObject.has("encryptionLevel")) {
                this.RatingCompat = jSONObject.getInt("encryptionLevel");
            }
            if (jSONObject.has("allowedPushTypes")) {
                JSONArray jSONArray = jSONObject.getJSONArray("allowedPushTypes");
                for (int i = 0; i < jSONArray.length(); i++) {
                    getAdsId getadsid = getAdsId.read(jSONArray.getJSONObject(i));
                    if (getadsid != null) {
                        write(getadsid);
                    }
                }
            }
            this.MediaDescriptionCompat = jSONObject.optString("encryptionInTransit", SessionDescription.SUPPORTED_SDP_VERSION);
        } catch (Throwable th) {
            th.getCause();
            RendererWakeupListener.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            throw th;
        }
    }

    private CleverTapInstanceConfig(Parcel parcel) {
        this.onPlayFromMediaId = getAdState.read();
        this.MediaBrowserCompatMediaItem = getTimelines.write;
        this.write = parcel.readString();
        this.read = parcel.readString();
        this.RemoteActionCompatParcelizer = parcel.readString();
        this.onCustomAction = parcel.readString();
        this.onFastForward = parcel.readString();
        this.AudioAttributesImplApi21Parcelizer = parcel.readString();
        this.IconCompatParcelizer = parcel.readByte() != 0;
        this.onAddQueueItem = parcel.readByte() != 0;
        this.onMediaButtonEvent = parcel.readByte() != 0;
        this.MediaBrowserCompatItemReceiver = parcel.readByte() != 0;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = parcel.readByte() != 0;
        this.AudioAttributesImplApi26Parcelizer = parcel.readInt();
        this.MediaBrowserCompatCustomActionResultReceiver = parcel.readByte() != 0;
        this.onPause = parcel.readByte() != 0;
        this.AudioAttributesCompatParcelizer = parcel.readByte() != 0;
        this.MediaBrowserCompatSearchResultReceiver = parcel.readByte() != 0;
        this.MediaMetadataCompat = parcel.readString();
        this.handleMediaPlayPauseIfPendingOnHandler = parcel.readString();
        this.onCommand = new RendererWakeupListener(this.AudioAttributesImplApi26Parcelizer);
        this.AudioAttributesImplBaseParcelizer = parcel.readByte() != 0;
        this.MediaBrowserCompatMediaItem = parcel.createStringArray();
        this.RatingCompat = parcel.readInt();
        this.MediaDescriptionCompat = parcel.readString();
        try {
            JSONArray jSONArray = new JSONArray(parcel.readString());
            for (int i = 0; i < jSONArray.length(); i++) {
                getAdsId getadsid = getAdsId.read(jSONArray.getJSONObject(i));
                if (getadsid != null) {
                    write(getadsid);
                }
            }
        } catch (JSONException unused) {
            RendererWakeupListener.MediaMetadataCompat();
        }
    }

    public final String write() {
        return this.write;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String IconCompatParcelizer() {
        return this.read;
    }

    public final ArrayList<getAdsId> AudioAttributesImplApi26Parcelizer() {
        return this.onPlayFromMediaId;
    }

    private void write(getAdsId getadsid) {
        if (this.onPlayFromMediaId.contains(getadsid)) {
            return;
        }
        this.onPlayFromMediaId.add(getadsid);
    }

    private int onMediaButtonEvent() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final String AudioAttributesImplApi21Parcelizer() {
        return this.onCustomAction;
    }

    public final void RemoteActionCompatParcelizer(String str) {
        this.onCustomAction = str;
    }

    public final String MediaBrowserCompatMediaItem() {
        return this.onFastForward;
    }

    public final void write(String str) {
        this.onFastForward = str;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final void read(String str) {
        this.AudioAttributesImplApi21Parcelizer = str;
    }

    private String onFastForward() {
        return this.MediaMetadataCompat;
    }

    public final RendererWakeupListener MediaBrowserCompatItemReceiver() {
        if (this.onCommand == null) {
            this.onCommand = new RendererWakeupListener(this.AudioAttributesImplApi26Parcelizer);
        }
        return this.onCommand;
    }

    private String onPrepareFromMediaId() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public final String[] MediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final boolean MediaMetadataCompat() {
        return this.IconCompatParcelizer;
    }

    private boolean onPlayFromUri() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final boolean MediaBrowserCompatSearchResultReceiver() {
        return this.onAddQueueItem;
    }

    public final void read(String str, String str2) {
        this.onCommand.write(AudioAttributesCompatParcelizer(str), str2);
    }

    public final void IconCompatParcelizer(String str, String str2, Throwable th) {
        RendererWakeupListener rendererWakeupListener = this.onCommand;
        AudioAttributesCompatParcelizer(str);
        rendererWakeupListener.IconCompatParcelizer();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.write);
        parcel.writeString(this.read);
        parcel.writeString(this.RemoteActionCompatParcelizer);
        parcel.writeString(this.onCustomAction);
        parcel.writeString(this.onFastForward);
        parcel.writeString(this.AudioAttributesImplApi21Parcelizer);
        parcel.writeByte(this.IconCompatParcelizer ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.onAddQueueItem ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.onMediaButtonEvent ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.MediaBrowserCompatItemReceiver ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.AudioAttributesImplApi26Parcelizer);
        parcel.writeByte(this.MediaBrowserCompatCustomActionResultReceiver ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.onPause ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.AudioAttributesCompatParcelizer ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.MediaBrowserCompatSearchResultReceiver ? (byte) 1 : (byte) 0);
        parcel.writeString(this.MediaMetadataCompat);
        parcel.writeString(this.handleMediaPlayPauseIfPendingOnHandler);
        parcel.writeByte(this.AudioAttributesImplBaseParcelizer ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.MediaBrowserCompatMediaItem);
        parcel.writeInt(this.RatingCompat);
        parcel.writeString(this.MediaDescriptionCompat);
        parcel.writeString(onPlayFromMediaId().toString());
    }

    public final boolean read() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final boolean RatingCompat() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean MediaDescriptionCompat() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final boolean onCustomAction() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final boolean handleMediaPlayPauseIfPendingOnHandler() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.onPause;
    }

    public final boolean onCommand() {
        return this.onMediaButtonEvent;
    }

    public final void onPlay() {
        this.MediaBrowserCompatCustomActionResultReceiver = true;
    }

    public final int AudioAttributesImplBaseParcelizer() {
        return this.RatingCompat;
    }

    public final boolean onAddQueueItem() {
        try {
            return Integer.parseInt(this.MediaDescriptionCompat) > 0;
        } catch (NumberFormatException unused) {
            RendererWakeupListener.MediaMetadataCompat();
            return false;
        }
    }

    public final String onPause() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("accountId", write());
            jSONObject.put("accountToken", IconCompatParcelizer());
            jSONObject.put("accountRegion", AudioAttributesCompatParcelizer());
            jSONObject.put("proxyDomain", AudioAttributesImplApi21Parcelizer());
            jSONObject.put("spikyProxyDomain", MediaBrowserCompatMediaItem());
            jSONObject.put("customHandshakeDomain", RemoteActionCompatParcelizer());
            jSONObject.put("fcmSenderId", onFastForward());
            jSONObject.put("analyticsOnly", MediaMetadataCompat());
            jSONObject.put("isDefaultInstance", MediaBrowserCompatSearchResultReceiver());
            jSONObject.put("useGoogleAdId", onCommand());
            jSONObject.put("disableAppLaunchedEvent", onCustomAction());
            jSONObject.put("personalization", handleMediaPlayPauseIfPendingOnHandler());
            jSONObject.put("debugLevel", onMediaButtonEvent());
            jSONObject.put("createdPostAppLaunch", MediaDescriptionCompat());
            jSONObject.put("sslPinning", MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
            jSONObject.put("backgroundSync", RatingCompat());
            jSONObject.put("getEnableCustomCleverTapId", read());
            jSONObject.put("packageName", onPrepareFromMediaId());
            jSONObject.put("beta", onPlayFromUri());
            jSONObject.put("encryptionLevel", AudioAttributesImplBaseParcelizer());
            jSONObject.put("encryptionInTransit", this.MediaDescriptionCompat);
            jSONObject.put("allowedPushTypes", onPlayFromMediaId());
            return jSONObject.toString();
        } catch (Throwable th) {
            th.getCause();
            RendererWakeupListener.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            return null;
        }
    }

    private JSONArray onPlayFromMediaId() {
        JSONArray jSONArray = new JSONArray();
        for (getAdsId getadsid : AudioAttributesImplApi26Parcelizer()) {
            if (getadsid != getAdGroupIndexAfterPositionUs.IconCompatParcelizer) {
                jSONArray.put(getadsid.write());
            }
        }
        return jSONArray;
    }

    private String AudioAttributesCompatParcelizer(String str) {
        StringBuilder sb = new StringBuilder("[");
        sb.append(!TextUtils.isEmpty(str) ? ":".concat(String.valueOf(str)) : "");
        sb.append(":");
        sb.append(this.write);
        sb.append("]");
        return sb.toString();
    }
}
