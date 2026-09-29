package kotlin;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class getDefaultPositionUs extends TimelinePeriodExternalSyntheticLambda0 {
    private final getUids AudioAttributesCompatParcelizer;
    private final RendererWakeupListener AudioAttributesImplApi21Parcelizer;
    private final lambdaupdateStateAndInformListeners59 AudioAttributesImplApi26Parcelizer;
    private final SimpleBasePlayerPeriodData MediaBrowserCompatCustomActionResultReceiver;
    private final handleRelease MediaBrowserCompatItemReceiver;
    private final boolean RemoteActionCompatParcelizer;
    private final CleverTapInstanceConfig read;
    private final copyWithPlaceholderTimeline write;

    public getDefaultPositionUs(CleverTapInstanceConfig cleverTapInstanceConfig, getUids getuids, boolean z, SimpleBasePlayerPeriodData simpleBasePlayerPeriodData, lambdaupdateStateAndInformListeners59 lambdaupdatestateandinformlisteners59, handleRelease handlerelease, copyWithPlaceholderTimeline copywithplaceholdertimeline) {
        this.read = cleverTapInstanceConfig;
        this.AudioAttributesImplApi21Parcelizer = cleverTapInstanceConfig.MediaBrowserCompatItemReceiver();
        this.AudioAttributesCompatParcelizer = getuids;
        this.RemoteActionCompatParcelizer = z;
        this.MediaBrowserCompatCustomActionResultReceiver = simpleBasePlayerPeriodData;
        this.AudioAttributesImplApi26Parcelizer = lambdaupdatestateandinformlisteners59;
        this.write = copywithplaceholdertimeline;
        this.MediaBrowserCompatItemReceiver = handlerelease;
    }

    @Override // kotlin.getPositionInWindowUs
    public final void IconCompatParcelizer(JSONObject jSONObject, String str, Context context) {
        RemoteActionCompatParcelizer(jSONObject, context, false);
    }

    public final void RemoteActionCompatParcelizer(JSONObject jSONObject, Context context, boolean z) {
        try {
            if (this.read.MediaMetadataCompat()) {
                this.AudioAttributesImplApi21Parcelizer.write(this.read.write(), "CleverTap instance is configured to analytics only, not processing inapp messages");
                return;
            }
            if (jSONObject != null && jSONObject.length() != 0) {
                invalidateState invalidatestate = new invalidateState(jSONObject, this.MediaBrowserCompatItemReceiver);
                setTracks audioAttributesCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver.getAudioAttributesCompatParcelizer();
                access6500 write = this.MediaBrowserCompatCustomActionResultReceiver.getWrite();
                setUid iconCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver.getIconCompatParcelizer();
                setWindowStartTimeMs read = this.MediaBrowserCompatCustomActionResultReceiver.getRead();
                access6700 remoteActionCompatParcelizer = this.MediaBrowserCompatCustomActionResultReceiver.getRemoteActionCompatParcelizer();
                if (audioAttributesCompatParcelizer == null || write == null || iconCompatParcelizer == null || remoteActionCompatParcelizer == null || read == null) {
                    this.AudioAttributesImplApi21Parcelizer.write(this.read.write(), "Stores are not initialised, ignoring inapps!!!!");
                    return;
                }
                this.AudioAttributesImplApi21Parcelizer.write(this.read.write(), "InApp: Processing response");
                int audioAttributesImplBaseParcelizer = invalidatestate.getAudioAttributesImplBaseParcelizer();
                int ratingCompat = invalidatestate.getRatingCompat();
                if (!this.RemoteActionCompatParcelizer && this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver() != null) {
                    RendererWakeupListener.MediaMetadataCompat();
                    this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver().read(context, ratingCompat, audioAttributesImplBaseParcelizer);
                    this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver().read(context, jSONObject);
                } else {
                    this.AudioAttributesImplApi21Parcelizer.write(this.read.write(), "controllerManager.getInAppFCManager() is NULL, not Updating InAppFC Limits");
                }
                Pair<Boolean, JSONArray> pairAudioAttributesImplApi26Parcelizer = invalidatestate.AudioAttributesImplApi26Parcelizer();
                if (pairAudioAttributesImplApi26Parcelizer.write().booleanValue()) {
                    RemoteActionCompatParcelizer(pairAudioAttributesImplApi26Parcelizer.IconCompatParcelizer(), audioAttributesCompatParcelizer, this.AudioAttributesImplApi26Parcelizer);
                }
                String mediaBrowserCompatSearchResultReceiver = invalidatestate.getMediaBrowserCompatSearchResultReceiver();
                if (!mediaBrowserCompatSearchResultReceiver.isEmpty()) {
                    write.AudioAttributesCompatParcelizer(mediaBrowserCompatSearchResultReceiver);
                }
                if (z) {
                    return;
                }
                Pair<Boolean, JSONArray> pairMediaBrowserCompatItemReceiver = invalidatestate.MediaBrowserCompatItemReceiver();
                if (pairMediaBrowserCompatItemReceiver.write().booleanValue()) {
                    IconCompatParcelizer(pairMediaBrowserCompatItemReceiver.IconCompatParcelizer());
                }
                Pair<Boolean, JSONArray> pair = invalidatestate.read();
                if (pair.write().booleanValue()) {
                    write(pair.IconCompatParcelizer());
                }
                Pair<Boolean, JSONArray> pairRemoteActionCompatParcelizer = invalidatestate.RemoteActionCompatParcelizer();
                if (pairRemoteActionCompatParcelizer.write().booleanValue()) {
                    write.write(pairRemoteActionCompatParcelizer.IconCompatParcelizer());
                }
                Pair<Boolean, JSONArray> pairAudioAttributesImplBaseParcelizer = invalidatestate.AudioAttributesImplBaseParcelizer();
                if (pairAudioAttributesImplBaseParcelizer.write().booleanValue()) {
                    write.AudioAttributesCompatParcelizer(pairAudioAttributesImplBaseParcelizer.IconCompatParcelizer());
                }
                List<Pair<String, lambdaaddMediaItems3comgoogleandroidexoplayer2SimpleBasePlayer>> listMediaBrowserCompatCustomActionResultReceiver = invalidatestate.MediaBrowserCompatCustomActionResultReceiver();
                setIsPlaceholder setisplaceholderRemoteActionCompatParcelizer = access6100.RemoteActionCompatParcelizer(context, this.AudioAttributesImplApi21Parcelizer, this.MediaBrowserCompatCustomActionResultReceiver);
                if (!listMediaBrowserCompatCustomActionResultReceiver.isEmpty()) {
                    setisplaceholderRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(listMediaBrowserCompatCustomActionResultReceiver);
                }
                if (this.IconCompatParcelizer) {
                    this.AudioAttributesImplApi21Parcelizer.write(this.read.write(), "Handling cache eviction");
                    setisplaceholderRemoteActionCompatParcelizer.IconCompatParcelizer(invalidatestate.AudioAttributesImplApi21Parcelizer());
                    return;
                } else {
                    this.AudioAttributesImplApi21Parcelizer.write(this.read.write(), "Ignoring cache eviction");
                    return;
                }
            }
            this.AudioAttributesImplApi21Parcelizer.write(this.read.write(), "There is no inapps data to handle");
        } catch (Throwable unused) {
            RendererWakeupListener.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
    }

    private static void RemoteActionCompatParcelizer(JSONArray jSONArray, setTracks settracks, lambdaupdateStateAndInformListeners59 lambdaupdatestateandinformlisteners59) {
        for (int i = 0; i < jSONArray.length(); i++) {
            String strOptString = jSONArray.optString(i);
            settracks.read(strOptString);
            lambdaupdatestateandinformlisteners59.AudioAttributesCompatParcelizer(strOptString);
        }
    }

    private void write(JSONArray jSONArray) {
        try {
            this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer().AudioAttributesCompatParcelizer(jSONArray, this.write.onAddQueueItem());
        } catch (Throwable th) {
            this.AudioAttributesImplApi21Parcelizer.write(this.read.write(), "InAppManager: Malformed AppLaunched ServerSide inApps");
            RendererWakeupListener rendererWakeupListener = this.AudioAttributesImplApi21Parcelizer;
            this.read.write();
            th.getMessage();
            rendererWakeupListener.IconCompatParcelizer();
        }
    }

    private void IconCompatParcelizer(final JSONArray jSONArray) {
        TracksExternalSyntheticLambda0.AudioAttributesCompatParcelizer(this.read).AudioAttributesCompatParcelizer("TAG_FEATURE_IN_APPS").read("InAppResponse#processResponse", new Callable<Void>() { // from class: o.getDefaultPositionUs.1
            /* JADX INFO: Access modifiers changed from: private */
            @Override // java.util.concurrent.Callable
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public Void call() {
                getDefaultPositionUs.this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer().write(jSONArray);
                return null;
            }
        });
    }
}
