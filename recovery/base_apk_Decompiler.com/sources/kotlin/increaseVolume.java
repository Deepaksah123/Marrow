package kotlin;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import in.juspay.hyper.constants.LogLevel;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class increaseVolume {
    private final copyWithPlaceholderTimeline AudioAttributesCompatParcelizer;
    private final getCreatedOnDateMs<Integer> AudioAttributesImplApi21Parcelizer;
    private final lambdaprepare7 AudioAttributesImplApi26Parcelizer;
    private final getCreatedOnDateMs<Integer> AudioAttributesImplBaseParcelizer;
    private final getUids IconCompatParcelizer;
    private final getMaxStars MediaBrowserCompatCustomActionResultReceiver;
    private final getChildTimelines MediaBrowserCompatItemReceiver;
    private final lambdaonAudioCodecError11 MediaBrowserCompatSearchResultReceiver;
    private final PlaylistTimeline1 MediaMetadataCompat;
    private final CleverTapInstanceConfig RemoteActionCompatParcelizer;
    private final setVideoSize read;
    private final Context write;

    public increaseVolume(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, copyWithPlaceholderTimeline copywithplaceholdertimeline, getUids getuids, getChildTimelines getchildtimelines, setVideoSize setvideosize, getMaxStars getmaxstars, lambdaprepare7 lambdaprepare7Var, lambdaonAudioCodecError11 lambdaonaudiocodecerror11, getCreatedOnDateMs<Integer> getcreatedondatems, getCreatedOnDateMs<Integer> getcreatedondatems2, PlaylistTimeline1 playlistTimeline1) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(cleverTapInstanceConfig, "");
        toMagicModuleMetaRepoModel.write(copywithplaceholdertimeline, "");
        toMagicModuleMetaRepoModel.write(getuids, "");
        toMagicModuleMetaRepoModel.write(getchildtimelines, "");
        toMagicModuleMetaRepoModel.write(setvideosize, "");
        toMagicModuleMetaRepoModel.write(getmaxstars, "");
        toMagicModuleMetaRepoModel.write(lambdaprepare7Var, "");
        toMagicModuleMetaRepoModel.write(lambdaonaudiocodecerror11, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems2, "");
        toMagicModuleMetaRepoModel.write(playlistTimeline1, "");
        this.write = context;
        this.RemoteActionCompatParcelizer = cleverTapInstanceConfig;
        this.AudioAttributesCompatParcelizer = copywithplaceholdertimeline;
        this.IconCompatParcelizer = getuids;
        this.MediaBrowserCompatItemReceiver = getchildtimelines;
        this.read = setvideosize;
        this.MediaBrowserCompatCustomActionResultReceiver = getmaxstars;
        this.AudioAttributesImplApi26Parcelizer = lambdaprepare7Var;
        this.MediaBrowserCompatSearchResultReceiver = lambdaonaudiocodecerror11;
        this.AudioAttributesImplApi21Parcelizer = getcreatedondatems;
        this.AudioAttributesImplBaseParcelizer = getcreatedondatems2;
        this.MediaMetadataCompat = playlistTimeline1;
    }

    public final JSONObject write(String str) {
        String strWrite = this.RemoteActionCompatParcelizer.write();
        String strIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer();
        if (strWrite == null || strIconCompatParcelizer == null) {
            this.MediaMetadataCompat.IconCompatParcelizer(this.RemoteActionCompatParcelizer.write(), "Account ID/token not found, unable to configure queue request");
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            AudioAttributesCompatParcelizer(jSONObject, str);
            MediaBrowserCompatCustomActionResultReceiver(jSONObject);
            MediaBrowserCompatSearchResultReceiver(jSONObject);
            RemoteActionCompatParcelizer(jSONObject);
            AudioAttributesImplApi21Parcelizer(jSONObject);
            IconCompatParcelizer(jSONObject);
            MediaBrowserCompatItemReceiver(jSONObject);
            AudioAttributesImplApi26Parcelizer(jSONObject);
            write(jSONObject);
            MediaMetadataCompat(jSONObject);
            MediaDescriptionCompat(jSONObject);
            AudioAttributesImplBaseParcelizer(jSONObject);
            AudioAttributesCompatParcelizer(jSONObject);
            read(jSONObject);
            RatingCompat(jSONObject);
            onCommand(jSONObject);
            MediaBrowserCompatMediaItem(jSONObject);
            return jSONObject;
        } catch (JSONException e) {
            PlaylistTimeline1 playlistTimeline1 = this.MediaMetadataCompat;
            this.RemoteActionCompatParcelizer.write();
            playlistTimeline1.IconCompatParcelizer();
            return null;
        }
    }

    private static void AudioAttributesCompatParcelizer(JSONObject jSONObject, String str) throws JSONException {
        if (str != null) {
            jSONObject.put("d_src", str);
        }
    }

    private final void MediaBrowserCompatCustomActionResultReceiver(JSONObject jSONObject) throws JSONException {
        String strMediaBrowserCompatCustomActionResultReceiver = this.MediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver();
        String str = strMediaBrowserCompatCustomActionResultReceiver;
        if (str != null && str.length() != 0) {
            jSONObject.put("g", strMediaBrowserCompatCustomActionResultReceiver);
        } else {
            this.MediaMetadataCompat.write(this.RemoteActionCompatParcelizer.write(), "CRITICAL: Couldn't finalise on a device ID! Using error device ID instead!");
        }
    }

    private static void MediaBrowserCompatSearchResultReceiver(JSONObject jSONObject) throws JSONException {
        jSONObject.put("type", "meta");
    }

    private final void RemoteActionCompatParcelizer(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectIconCompatParcelizer = this.MediaBrowserCompatItemReceiver.IconCompatParcelizer();
        if (this.AudioAttributesCompatParcelizer.onSetPlaybackSpeed()) {
            jSONObjectIconCompatParcelizer.put("wv_init", true);
        }
        jSONObject.put("af", jSONObjectIconCompatParcelizer);
    }

    private final void AudioAttributesImplApi21Parcelizer(JSONObject jSONObject) throws JSONException {
        long jIconCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(this.write);
        if (jIconCompatParcelizer > 0) {
            jSONObject.put("_i", jIconCompatParcelizer);
        }
        long jWrite = this.MediaBrowserCompatCustomActionResultReceiver.write(this.write);
        if (jWrite > 0) {
            jSONObject.put("_j", jWrite);
        }
    }

    private final void IconCompatParcelizer(JSONObject jSONObject) throws JSONException {
        String strWrite = this.RemoteActionCompatParcelizer.write();
        String strIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer();
        jSONObject.put("id", strWrite);
        jSONObject.put("tk", strIconCompatParcelizer);
        jSONObject.put("l_ts", this.AudioAttributesImplBaseParcelizer.invoke().intValue());
        jSONObject.put("f_ts", this.AudioAttributesImplApi21Parcelizer.invoke().intValue());
    }

    private final void MediaBrowserCompatItemReceiver(JSONObject jSONObject) throws JSONException {
        jSONObject.put("ct_pi", setIsLoading.AudioAttributesCompatParcelizer(this.write, this.RemoteActionCompatParcelizer, this.MediaBrowserCompatSearchResultReceiver).read().toString());
    }

    private final void AudioAttributesImplApi26Parcelizer(JSONObject jSONObject) throws JSONException {
        jSONObject.put("ddnd", (PlayerPlaybackSuppressionReason.AudioAttributesCompatParcelizer(this.write) && (this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer() == null || this.IconCompatParcelizer.AudioAttributesImplBaseParcelizer().IconCompatParcelizer())) ? false : true);
    }

    private final void write(JSONObject jSONObject) throws JSONException {
        if (this.AudioAttributesCompatParcelizer.onPrepareFromMediaId()) {
            jSONObject.put("bk", 1);
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer(false);
        }
    }

    private final void MediaMetadataCompat(JSONObject jSONObject) throws JSONException {
        jSONObject.put("rtl", AnalyticsCollector.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(this.write).IconCompatParcelizer()));
    }

    private final void MediaDescriptionCompat(JSONObject jSONObject) throws JSONException {
        if (this.AudioAttributesCompatParcelizer.onPrepareFromUri()) {
            return;
        }
        jSONObject.put("rct", this.AudioAttributesCompatParcelizer.onPlay());
        jSONObject.put("ait", this.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem());
    }

    private final void AudioAttributesImplBaseParcelizer(JSONObject jSONObject) throws JSONException {
        jSONObject.put("frs", this.AudioAttributesCompatParcelizer.onPlayFromSearch());
        this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer(false);
    }

    private static void AudioAttributesCompatParcelizer(JSONObject jSONObject) throws JSONException {
        if (PlayerTimelineChangeReason.write() == 3) {
            jSONObject.put(LogLevel.DEBUG, true);
        }
    }

    private final void read(JSONObject jSONObject) {
        try {
            JSONObject jSONObjectAudioAttributesCompatParcelizer = this.read.AudioAttributesCompatParcelizer(this.write);
            if (jSONObjectAudioAttributesCompatParcelizer == null || jSONObjectAudioAttributesCompatParcelizer.length() <= 0) {
                return;
            }
            jSONObject.put("arp", jSONObjectAudioAttributesCompatParcelizer);
        } catch (JSONException e) {
            PlaylistTimeline1 playlistTimeline1 = this.MediaMetadataCompat;
            this.RemoteActionCompatParcelizer.write();
            playlistTimeline1.IconCompatParcelizer();
        }
    }

    private final void RatingCompat(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            String strOnFastForward = this.AudioAttributesCompatParcelizer.onFastForward();
            if (strOnFastForward != null) {
                jSONObject2.put("us", strOnFastForward);
            }
            String strHandleMediaPlayPauseIfPendingOnHandler = this.AudioAttributesCompatParcelizer.handleMediaPlayPauseIfPendingOnHandler();
            if (strHandleMediaPlayPauseIfPendingOnHandler != null) {
                jSONObject2.put("um", strHandleMediaPlayPauseIfPendingOnHandler);
            }
            String strMediaBrowserCompatSearchResultReceiver = this.AudioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver();
            if (strMediaBrowserCompatSearchResultReceiver != null) {
                jSONObject2.put("uc", strMediaBrowserCompatSearchResultReceiver);
            }
            if (jSONObject2.length() > 0) {
                jSONObject.put("ref", jSONObject2);
            }
        } catch (JSONException e) {
            PlaylistTimeline1 playlistTimeline1 = this.MediaMetadataCompat;
            this.RemoteActionCompatParcelizer.write();
            playlistTimeline1.IconCompatParcelizer();
        }
    }

    private final void onCommand(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectOnPause = this.AudioAttributesCompatParcelizer.onPause();
        if (jSONObjectOnPause == null || jSONObjectOnPause.length() <= 0) {
            return;
        }
        jSONObject.put("wzrk_ref", jSONObjectOnPause);
    }

    private final void MediaBrowserCompatMediaItem(JSONObject jSONObject) throws JSONException {
        Rfont rfontMediaBrowserCompatItemReceiver = this.IconCompatParcelizer.MediaBrowserCompatItemReceiver();
        if (rfontMediaBrowserCompatItemReceiver != null) {
            RendererWakeupListener.MediaMetadataCompat();
            jSONObject.put("imp", rfontMediaBrowserCompatItemReceiver.IconCompatParcelizer());
            if (jSONObject.put("tlc", rfontMediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(this.write)) != null) {
                return;
            }
        }
        this.MediaMetadataCompat.write(this.RemoteActionCompatParcelizer.write(), "controllerManager.getInAppFCManager() is NULL, not Attaching InAppFC to Header");
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
    }
}
