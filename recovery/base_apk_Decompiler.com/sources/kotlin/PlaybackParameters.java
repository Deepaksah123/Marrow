package kotlin;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.lambdaonAudioDecoderInitialized4;
import org.apache.commons.compress.archivers.zip.UnixStat;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class PlaybackParameters extends PlayerCommandsExternalSyntheticLambda0 {
    private final CleverTapInstanceConfig AudioAttributesCompatParcelizer;
    private final PlayerListener AudioAttributesImplApi21Parcelizer;
    private final onDroppedVideoFrames AudioAttributesImplApi26Parcelizer;
    private final isTypeSupported AudioAttributesImplBaseParcelizer;
    private final getUids IconCompatParcelizer;
    private final copyWithPlaceholderTimeline MediaBrowserCompatCustomActionResultReceiver;
    private final getChildTimelines MediaBrowserCompatItemReceiver;
    private final getDefaultPositionUs MediaBrowserCompatSearchResultReceiver;
    private final lambdaonAudioCodecError11 MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final addAllCommands RemoteActionCompatParcelizer;
    private final lambdaonAudioDecoderInitialized4 handleMediaPlayPauseIfPendingOnHandler;
    private final lambdasetVideoSurface17 read;
    private final Context write;
    private final HashMap<String, Integer> MediaBrowserCompatMediaItem = new HashMap<>(8);
    private final Object RatingCompat = new Object();
    private final HashMap<String, Long> MediaDescriptionCompat = new HashMap<>();
    private final HashMap<String, Long> MediaMetadataCompat = new HashMap<>();

    PlaybackParameters(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, lambdasetVideoSurface17 lambdasetvideosurface17, lambdaonAudioDecoderInitialized4 lambdaonaudiodecoderinitialized4, lambdaonAudioCodecError11 lambdaonaudiocodecerror11, copyWithPlaceholderTimeline copywithplaceholdertimeline, getChildTimelines getchildtimelines, addAllCommands addallcommands, getUids getuids, PlayerListener playerListener, getDefaultPositionUs getdefaultpositionus, onDroppedVideoFrames ondroppedvideoframes, isTypeSupported istypesupported) {
        this.write = context;
        this.AudioAttributesCompatParcelizer = cleverTapInstanceConfig;
        this.read = lambdasetvideosurface17;
        this.handleMediaPlayPauseIfPendingOnHandler = lambdaonaudiodecoderinitialized4;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = lambdaonaudiocodecerror11;
        this.MediaBrowserCompatCustomActionResultReceiver = copywithplaceholdertimeline;
        this.MediaBrowserCompatItemReceiver = getchildtimelines;
        this.RemoteActionCompatParcelizer = addallcommands;
        this.AudioAttributesImplApi21Parcelizer = playerListener;
        this.IconCompatParcelizer = getuids;
        this.MediaBrowserCompatSearchResultReceiver = getdefaultpositionus;
        this.AudioAttributesImplApi26Parcelizer = ondroppedvideoframes;
        this.AudioAttributesImplBaseParcelizer = istypesupported;
    }

    public final void IconCompatParcelizer(final String str, final ArrayList<String> arrayList) {
        this.AudioAttributesImplBaseParcelizer.read().read("addMultiValuesForKey", new Callable() { // from class: o.r8lambda1MjYvs9QC6Ez5KfGcBxwgv5lWak
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(arrayList, str);
            }
        });
    }

    final /* synthetic */ Void RemoteActionCompatParcelizer(ArrayList arrayList, String str) throws Exception {
        RemoteActionCompatParcelizer((ArrayList<String>) arrayList, str, "$add");
        return null;
    }

    public final void AudioAttributesCompatParcelizer(String str, Number number) {
        IconCompatParcelizer(number, str, "$incr");
    }

    public final void IconCompatParcelizer(String str, Number number) {
        IconCompatParcelizer(number, str, "$decr");
    }

    @Override // kotlin.PlayerCommandsExternalSyntheticLambda0
    public final void RemoteActionCompatParcelizer() {
        if (this.AudioAttributesCompatParcelizer.MediaMetadataCompat()) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("t", 1);
            jSONObject.put("evtName", "wzrk_fetch");
            jSONObject.put("evtData", jSONObject2);
        } catch (JSONException unused) {
        }
        RemoteActionCompatParcelizer(jSONObject);
    }

    public final void read() {
        this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(false);
        write();
    }

    public final void write() {
        if (this.AudioAttributesCompatParcelizer.onCustomAction()) {
            this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(true);
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver().IconCompatParcelizer(this.AudioAttributesCompatParcelizer.write(), "App Launched Events disabled in the Android Manifest file");
        } else {
            if (this.MediaBrowserCompatCustomActionResultReceiver.onPrepareFromSearch()) {
                this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver().write(this.AudioAttributesCompatParcelizer.write(), "App Launched has already been triggered. Will not trigger it ");
                return;
            }
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver().write(this.AudioAttributesCompatParcelizer.write(), "Firing App Launched event");
            this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer(true);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("evtName", "App Launched");
                jSONObject.put("evtData", this.MediaBrowserCompatItemReceiver.IconCompatParcelizer());
            } catch (Throwable unused) {
            }
            this.read.write(this.write, jSONObject, 4);
        }
    }

    public final void IconCompatParcelizer(String str, Map<String, Object> map) {
        String string;
        if (str == null || str.equals("")) {
            return;
        }
        generateMediaPeriodEventTime generatemediaperiodeventtimeAudioAttributesImplApi26Parcelizer = lambdaonAudioDecoderInitialized4.AudioAttributesImplApi26Parcelizer(str);
        if (generatemediaperiodeventtimeAudioAttributesImplApi26Parcelizer.write() > 0) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read(generatemediaperiodeventtimeAudioAttributesImplApi26Parcelizer);
            return;
        }
        generateMediaPeriodEventTime generatemediaperiodeventtimeIconCompatParcelizer = this.handleMediaPlayPauseIfPendingOnHandler.IconCompatParcelizer(str);
        if (generatemediaperiodeventtimeIconCompatParcelizer.write() > 0) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read(generatemediaperiodeventtimeIconCompatParcelizer);
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            generateMediaPeriodEventTime generatemediaperiodeventtimeWrite = lambdaonAudioDecoderInitialized4.write(str);
            if (generatemediaperiodeventtimeWrite.write() != 0) {
                jSONObject.put("wzrk_error", AnalyticsCollector.AudioAttributesCompatParcelizer(generatemediaperiodeventtimeWrite));
            }
            String string2 = generatemediaperiodeventtimeWrite.read().toString();
            JSONObject jSONObject2 = new JSONObject();
            for (String str2 : map.keySet()) {
                Object obj = map.get(str2);
                generateMediaPeriodEventTime generatemediaperiodeventtimeRemoteActionCompatParcelizer = lambdaonAudioDecoderInitialized4.RemoteActionCompatParcelizer(str2);
                String string3 = generatemediaperiodeventtimeRemoteActionCompatParcelizer.read().toString();
                if (generatemediaperiodeventtimeRemoteActionCompatParcelizer.write() != 0) {
                    jSONObject.put("wzrk_error", AnalyticsCollector.AudioAttributesCompatParcelizer(generatemediaperiodeventtimeRemoteActionCompatParcelizer));
                }
                try {
                    generateMediaPeriodEventTime generatemediaperiodeventtimeWrite2 = lambdaonAudioDecoderInitialized4.write(obj, lambdaonAudioDecoderInitialized4.AudioAttributesCompatParcelizer.Event);
                    Object obj2 = generatemediaperiodeventtimeWrite2.read();
                    if (generatemediaperiodeventtimeWrite2.write() != 0) {
                        jSONObject.put("wzrk_error", AnalyticsCollector.AudioAttributesCompatParcelizer(generatemediaperiodeventtimeWrite2));
                    }
                    jSONObject2.put(string3, obj2);
                } catch (IllegalArgumentException unused) {
                    String[] strArr = new String[3];
                    strArr[0] = string2;
                    strArr[1] = string3;
                    if (obj == null) {
                        string = "";
                    } else {
                        string = obj.toString();
                    }
                    strArr[2] = string;
                    generateMediaPeriodEventTime generatemediaperiodeventtime = lambdaonAudioDecoderReleased8.read(512, 7, strArr);
                    this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver().IconCompatParcelizer(this.AudioAttributesCompatParcelizer.write(), generatemediaperiodeventtime.RemoteActionCompatParcelizer());
                    this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read(generatemediaperiodeventtime);
                }
            }
            jSONObject.put("evtName", string2);
            jSONObject.put("evtData", jSONObject2);
            this.read.write(this.write, jSONObject, 4);
        } catch (Throwable unused2) {
        }
    }

    public final void read(boolean z, CTInAppNotification cTInAppNotification, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObjectAudioAttributesCompatParcelizer = AnalyticsCollector.AudioAttributesCompatParcelizer(cTInAppNotification);
            if (bundle != null) {
                for (String str : bundle.keySet()) {
                    Object obj = bundle.get(str);
                    if (obj != null) {
                        jSONObjectAudioAttributesCompatParcelizer.put(str, obj);
                    }
                }
            }
            if (!z) {
                jSONObject.put("evtName", "Notification Viewed");
            } else {
                try {
                    this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(jSONObjectAudioAttributesCompatParcelizer);
                } catch (Throwable unused) {
                }
                jSONObject.put("evtName", "Notification Clicked");
            }
            jSONObject.put("evtData", jSONObjectAudioAttributesCompatParcelizer);
            this.read.write(this.write, jSONObject, 4);
        } catch (Throwable unused2) {
        }
    }

    public final void RemoteActionCompatParcelizer(String str) {
        try {
            RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver();
            String strWrite = this.AudioAttributesCompatParcelizer.write();
            StringBuilder sb = new StringBuilder("Referrer received: ");
            sb.append(str);
            rendererWakeupListenerMediaBrowserCompatItemReceiver.write(strWrite, sb.toString());
            if (str != null) {
                int iCurrentTimeMillis = (int) (System.currentTimeMillis() / 1000);
                if (this.MediaBrowserCompatMediaItem.containsKey(str) && iCurrentTimeMillis - this.MediaBrowserCompatMediaItem.get(str).intValue() < 10) {
                    this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver().write(this.AudioAttributesCompatParcelizer.write(), "Skipping install referrer due to duplicate within 10 seconds");
                    return;
                }
                this.MediaBrowserCompatMediaItem.put(str, Integer.valueOf(iCurrentTimeMillis));
                StringBuilder sb2 = new StringBuilder("wzrk://track?install=true&");
                sb2.append(str);
                RemoteActionCompatParcelizer(Uri.parse(sb2.toString()), true);
            }
        } catch (Throwable unused) {
        }
    }

    public final void IconCompatParcelizer(Bundle bundle) {
        String string;
        if (this.AudioAttributesCompatParcelizer.MediaMetadataCompat()) {
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver().IconCompatParcelizer(this.AudioAttributesCompatParcelizer.write(), "is Analytics Only - will not process Notification Clicked event.");
            return;
        }
        if (bundle == null || bundle.isEmpty() || bundle.get("wzrk_pn") == null) {
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver().IconCompatParcelizer(this.AudioAttributesCompatParcelizer.write(), "Push notification not from CleverTap - will not process Notification Clicked event.");
            return;
        }
        try {
            string = bundle.getString("wzrk_acct_id");
        } catch (Throwable unused) {
            string = null;
        }
        if ((string != null || !this.AudioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver()) && !this.AudioAttributesCompatParcelizer.write().equals(string)) {
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver().IconCompatParcelizer(this.AudioAttributesCompatParcelizer.write(), "Push notification not targeted at this instance, not processing Notification Clicked Event");
            return;
        }
        if (bundle.containsKey("wzrk_inapp")) {
            read(bundle);
            return;
        }
        if (bundle.containsKey("wzrk_inbox")) {
            MediaBrowserCompatCustomActionResultReceiver(bundle);
            return;
        }
        if (bundle.containsKey("wzrk_adunit")) {
            AudioAttributesImplBaseParcelizer(bundle);
            return;
        }
        if (!bundle.containsKey("wzrk_id") || bundle.getString("wzrk_id") == null) {
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver().IconCompatParcelizer(this.AudioAttributesCompatParcelizer.write(), "Push notification ID Tag is null, not processing Notification Clicked event for:  ".concat(String.valueOf(bundle)));
            return;
        }
        if (RemoteActionCompatParcelizer(AudioAttributesImplApi21Parcelizer(bundle), this.MediaDescriptionCompat, 5000)) {
            RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver();
            String strWrite = this.AudioAttributesCompatParcelizer.write();
            StringBuilder sb = new StringBuilder("Already processed Notification Clicked event for ");
            sb.append(bundle);
            sb.append(", dropping duplicate.");
            rendererWakeupListenerMediaBrowserCompatItemReceiver.IconCompatParcelizer(strWrite, sb.toString());
            return;
        }
        try {
            this.read.write(this.write, addIf.RemoteActionCompatParcelizer(bundle), 4);
            this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(addIf.IconCompatParcelizer(bundle));
        } catch (Throwable unused2) {
        }
        if (this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer() != null) {
            this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer();
            RendererCapabilitiesListener.RemoteActionCompatParcelizer(bundle);
        } else {
            RendererWakeupListener.MediaBrowserCompatItemReceiver();
        }
    }

    private void MediaBrowserCompatCustomActionResultReceiver(final Bundle bundle) {
        this.AudioAttributesImplBaseParcelizer.read().read("testInboxNotification", new Callable() { // from class: o.PlayerCommandsBuilder
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(bundle);
            }
        });
    }

    final /* synthetic */ Void AudioAttributesCompatParcelizer(Bundle bundle) throws Exception {
        try {
            bundle.getString("wzrk_inbox");
            RendererWakeupListener.MediaMetadataCompat();
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONObject.put("inbox_notifs", jSONArray);
            JSONObject jSONObject2 = new JSONObject(bundle.getString("wzrk_inbox"));
            jSONObject2.put("_id", String.valueOf(System.currentTimeMillis() / 1000));
            jSONArray.put(jSONObject2);
            new getDefaultPositionMs(this.AudioAttributesCompatParcelizer, this.AudioAttributesImplApi21Parcelizer, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer).IconCompatParcelizer(jSONObject, null, this.write);
        } catch (Throwable unused) {
            RendererWakeupListener.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
        return null;
    }

    private void read(final Bundle bundle) {
        this.AudioAttributesImplBaseParcelizer.read().read("testInappNotification", new Callable() { // from class: o.Player1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.RemoteActionCompatParcelizer.write(bundle);
            }
        });
    }

    final /* synthetic */ Void write(Bundle bundle) throws Exception {
        try {
            String string = bundle.getString("wzrk_inapp_type");
            JSONObject jSONObject = new JSONObject(bundle.getString("wzrk_inapp"));
            JSONArray jSONArray = new JSONArray();
            if ("image-interstitial".equals(string) || "advanced-builder".equals(string)) {
                jSONArray.put(read(jSONObject));
            } else {
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("inapp_notifs", jSONArray);
            this.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer(jSONObject2, null, this.write);
        } catch (Throwable unused) {
            RendererWakeupListener.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
        return null;
    }

    private JSONObject read(JSONObject jSONObject) throws JSONException {
        String strAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(jSONObject.optString("imageInterstitialConfig"));
        if (strAudioAttributesImplApi21Parcelizer != null) {
            jSONObject.put("type", "custom-html");
            Object objOpt = jSONObject.opt("d");
            if (objOpt instanceof JSONObject) {
                JSONObject jSONObject2 = new JSONObject(((JSONObject) objOpt).toString());
                jSONObject2.put("html", strAudioAttributesImplApi21Parcelizer);
                jSONObject.put("d", jSONObject2);
                return jSONObject;
            }
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("html", strAudioAttributesImplApi21Parcelizer);
            jSONObject.put("d", jSONObject3);
            return jSONObject;
        }
        this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver().IconCompatParcelizer(this.AudioAttributesCompatParcelizer.write(), "Failed to parse the image-interstitial notification");
        return null;
    }

    private String AudioAttributesImplApi21Parcelizer(String str) {
        try {
            String strWrite = RendererCapabilitiesListener.write(this.write, "image_interstitial.html");
            if (strWrite == null || str == null) {
                return null;
            }
            String[] strArrSplit = strWrite.split("\"##Vars##\"");
            if (strArrSplit.length != 2) {
                return null;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(strArrSplit[0]);
            sb.append(str);
            sb.append(strArrSplit[1]);
            return sb.toString();
        } catch (IOException unused) {
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver().IconCompatParcelizer(this.AudioAttributesCompatParcelizer.write(), "Failed to read the image-interstitial HTML file");
            return null;
        }
    }

    public final void RemoteActionCompatParcelizer(Bundle bundle) {
        if (bundle == null || bundle.isEmpty() || bundle.get("wzrk_pn") == null) {
            RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver();
            String strWrite = this.AudioAttributesCompatParcelizer.write();
            StringBuilder sb = new StringBuilder("Push notification: ");
            sb.append(bundle == null ? "NULL" : bundle.toString());
            sb.append(" not from CleverTap - will not process Notification Viewed event.");
            rendererWakeupListenerMediaBrowserCompatItemReceiver.IconCompatParcelizer(strWrite, sb.toString());
            return;
        }
        if (!bundle.containsKey("wzrk_id") || bundle.getString("wzrk_id") == null) {
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver().IconCompatParcelizer(this.AudioAttributesCompatParcelizer.write(), "Push notification ID Tag is null, not processing Notification Viewed event for:  ".concat(String.valueOf(bundle)));
            return;
        }
        if (RemoteActionCompatParcelizer(AudioAttributesImplApi21Parcelizer(bundle), this.MediaMetadataCompat, 2000)) {
            RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver2 = this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver();
            String strWrite2 = this.AudioAttributesCompatParcelizer.write();
            StringBuilder sb2 = new StringBuilder("Already processed Notification Viewed event for ");
            sb2.append(bundle);
            sb2.append(", dropping duplicate.");
            rendererWakeupListenerMediaBrowserCompatItemReceiver2.IconCompatParcelizer(strWrite2, sb2.toString());
            return;
        }
        this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver();
        RendererWakeupListener.handleMediaPlayPauseIfPendingOnHandler();
        this.read.write(this.write, addIf.AudioAttributesCompatParcelizer(bundle), 6);
    }

    public final void AudioAttributesCompatParcelizer(final Map<String, Object> map) {
        if (map == null || map.isEmpty() || this.MediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver() == null) {
            return;
        }
        this.AudioAttributesImplBaseParcelizer.read().read("profilePush", new Callable() { // from class: o.Player
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.write.read(map);
            }
        });
    }

    final /* synthetic */ Void read(Map map) throws Exception {
        IconCompatParcelizer((Map<String, Object>) map);
        return null;
    }

    public final void AudioAttributesCompatParcelizer(final String str, final ArrayList<String> arrayList) {
        this.AudioAttributesImplBaseParcelizer.read().read("removeMultiValuesForKey", new Callable() { // from class: o.PlayerCommands
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.read.IconCompatParcelizer(arrayList, str);
            }
        });
    }

    final /* synthetic */ Void IconCompatParcelizer(ArrayList arrayList, String str) throws Exception {
        RemoteActionCompatParcelizer((ArrayList<String>) arrayList, str, "$remove");
        return null;
    }

    public final void read(final String str) {
        this.AudioAttributesImplBaseParcelizer.read().read("removeValueForKey", new Callable() { // from class: o.updatePositionUs
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.write.write(str);
            }
        });
    }

    final /* synthetic */ Void write(String str) throws Exception {
        MediaBrowserCompatItemReceiver(str);
        return null;
    }

    public final void IconCompatParcelizer(JSONObject jSONObject) {
        this.read.write(this.write, jSONObject, 5);
    }

    final void AudioAttributesCompatParcelizer(String str) {
        generateMediaPeriodEventTime generatemediaperiodeventtime = lambdaonAudioDecoderReleased8.read(512, 1, str);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read(generatemediaperiodeventtime);
        this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver().IconCompatParcelizer(this.AudioAttributesCompatParcelizer.write(), generatemediaperiodeventtime.RemoteActionCompatParcelizer());
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    final void read(HashMap<String, Object> map, ArrayList<HashMap<String, Object>> arrayList) {
        Iterator<String> it;
        int i;
        if (map == null || arrayList == null) {
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver().IconCompatParcelizer(this.AudioAttributesCompatParcelizer.write(), "Invalid Charged event: details and or items is null");
            return;
        }
        if (arrayList.size() > 50) {
            generateMediaPeriodEventTime generatemediaperiodeventtimeIconCompatParcelizer = lambdaonAudioDecoderReleased8.IconCompatParcelizer(522);
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver().IconCompatParcelizer(this.AudioAttributesCompatParcelizer.write(), generatemediaperiodeventtimeIconCompatParcelizer.RemoteActionCompatParcelizer());
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read(generatemediaperiodeventtimeIconCompatParcelizer);
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            it = map.keySet().iterator();
        } catch (Throwable unused) {
            return;
        }
        while (true) {
            i = 2;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            Object obj = map.get(next);
            generateMediaPeriodEventTime generatemediaperiodeventtimeRemoteActionCompatParcelizer = lambdaonAudioDecoderInitialized4.RemoteActionCompatParcelizer(next);
            String string = generatemediaperiodeventtimeRemoteActionCompatParcelizer.read().toString();
            if (generatemediaperiodeventtimeRemoteActionCompatParcelizer.write() != 0) {
                jSONObject2.put("wzrk_error", AnalyticsCollector.AudioAttributesCompatParcelizer(generatemediaperiodeventtimeRemoteActionCompatParcelizer));
            }
            try {
                generateMediaPeriodEventTime generatemediaperiodeventtimeWrite = lambdaonAudioDecoderInitialized4.write(obj, lambdaonAudioDecoderInitialized4.AudioAttributesCompatParcelizer.Event);
                Object obj2 = generatemediaperiodeventtimeWrite.read();
                if (generatemediaperiodeventtimeWrite.write() != 0) {
                    jSONObject2.put("wzrk_error", AnalyticsCollector.AudioAttributesCompatParcelizer(generatemediaperiodeventtimeWrite));
                }
                jSONObject.put(string, obj2);
            } catch (IllegalArgumentException unused2) {
                String[] strArr = new String[3];
                strArr[0] = "Charged";
                strArr[1] = string;
                strArr[2] = obj != null ? obj.toString() : "";
                generateMediaPeriodEventTime generatemediaperiodeventtime = lambdaonAudioDecoderReleased8.read(UnixStat.DEFAULT_LINK_PERM, 7, strArr);
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read(generatemediaperiodeventtime);
                this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver().IconCompatParcelizer(this.AudioAttributesCompatParcelizer.write(), generatemediaperiodeventtime.RemoteActionCompatParcelizer());
            }
            return;
        }
        JSONArray jSONArray = new JSONArray();
        for (HashMap<String, Object> map2 : arrayList) {
            JSONObject jSONObject3 = new JSONObject();
            for (String str : map2.keySet()) {
                Object obj3 = map2.get(str);
                generateMediaPeriodEventTime generatemediaperiodeventtimeRemoteActionCompatParcelizer2 = lambdaonAudioDecoderInitialized4.RemoteActionCompatParcelizer(str);
                String string2 = generatemediaperiodeventtimeRemoteActionCompatParcelizer2.read().toString();
                if (generatemediaperiodeventtimeRemoteActionCompatParcelizer2.write() != 0) {
                    jSONObject2.put("wzrk_error", AnalyticsCollector.AudioAttributesCompatParcelizer(generatemediaperiodeventtimeRemoteActionCompatParcelizer2));
                }
                try {
                    generateMediaPeriodEventTime generatemediaperiodeventtimeWrite2 = lambdaonAudioDecoderInitialized4.write(obj3, lambdaonAudioDecoderInitialized4.AudioAttributesCompatParcelizer.Event);
                    Object obj4 = generatemediaperiodeventtimeWrite2.read();
                    if (generatemediaperiodeventtimeWrite2.write() != 0) {
                        jSONObject2.put("wzrk_error", AnalyticsCollector.AudioAttributesCompatParcelizer(generatemediaperiodeventtimeWrite2));
                    }
                    jSONObject3.put(string2, obj4);
                } catch (IllegalArgumentException unused3) {
                    String[] strArr2 = new String[i];
                    strArr2[0] = string2;
                    strArr2[1] = obj3 != null ? obj3.toString() : "";
                    generateMediaPeriodEventTime generatemediaperiodeventtime2 = lambdaonAudioDecoderReleased8.read(UnixStat.DEFAULT_LINK_PERM, 15, strArr2);
                    this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver().IconCompatParcelizer(this.AudioAttributesCompatParcelizer.write(), generatemediaperiodeventtime2.RemoteActionCompatParcelizer());
                    this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read(generatemediaperiodeventtime2);
                    i = 2;
                }
            }
            jSONArray.put(jSONObject3);
            i = 2;
        }
        jSONObject.put("Items", jSONArray);
        jSONObject2.put("evtName", "Charged");
        jSONObject2.put("evtData", jSONObject);
        this.read.write(this.write, jSONObject2, 4);
    }

    final void RemoteActionCompatParcelizer(Uri uri, boolean z) {
        synchronized (this) {
            if (uri == null) {
                return;
            }
            try {
                JSONObject jSONObjectWrite = getEventTimeForErrorEvent.write(uri);
                if (jSONObjectWrite.has("us")) {
                    this.MediaBrowserCompatCustomActionResultReceiver.write(jSONObjectWrite.get("us").toString());
                }
                if (jSONObjectWrite.has("um")) {
                    this.MediaBrowserCompatCustomActionResultReceiver.read(jSONObjectWrite.get("um").toString());
                }
                if (jSONObjectWrite.has("uc")) {
                    this.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(jSONObjectWrite.get("uc").toString());
                }
                jSONObjectWrite.put("referrer", uri.toString());
                if (z) {
                    jSONObjectWrite.put("install", true);
                }
                AudioAttributesCompatParcelizer(jSONObjectWrite);
            } catch (Throwable unused) {
                RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver();
                this.AudioAttributesCompatParcelizer.write();
                rendererWakeupListenerMediaBrowserCompatItemReceiver.IconCompatParcelizer();
            }
        }
    }

    final void AudioAttributesCompatParcelizer(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            if (jSONObject != null && jSONObject.length() > 0) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    try {
                        String next = itKeys.next();
                        jSONObject2.put(next, jSONObject.getString(next));
                    } catch (ClassCastException unused) {
                    }
                }
            }
            this.read.write(this.write, jSONObject2, 1);
        } catch (Throwable unused2) {
        }
    }

    final void write(final String str, final ArrayList<String> arrayList) {
        this.AudioAttributesImplBaseParcelizer.read().read("setMultiValuesForKey", new Callable() { // from class: o.PlayerCommand
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.RemoteActionCompatParcelizer.read(arrayList, str);
            }
        });
    }

    final /* synthetic */ Void read(ArrayList arrayList, String str) throws Exception {
        RemoteActionCompatParcelizer((ArrayList<String>) arrayList, str, "$set");
        return null;
    }

    private void IconCompatParcelizer(String str) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read(lambdaonAudioDecoderReleased8.read(523, 23, str));
        RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver();
        String strWrite = this.AudioAttributesCompatParcelizer.write();
        StringBuilder sb = new StringBuilder("Invalid multi-value property key ");
        sb.append(str);
        sb.append(" profile multi value operation aborted");
        rendererWakeupListenerMediaBrowserCompatItemReceiver.IconCompatParcelizer(strWrite, sb.toString());
    }

    private void RemoteActionCompatParcelizer(ArrayList<String> arrayList, String str, String str2) {
        if (str == null) {
            return;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            AudioAttributesCompatParcelizer(str);
            return;
        }
        generateMediaPeriodEventTime generatemediaperiodeventtimeAudioAttributesCompatParcelizer = lambdaonAudioDecoderInitialized4.AudioAttributesCompatParcelizer(str);
        if (generatemediaperiodeventtimeAudioAttributesCompatParcelizer.write() != 0) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read(generatemediaperiodeventtimeAudioAttributesCompatParcelizer);
        }
        String string = generatemediaperiodeventtimeAudioAttributesCompatParcelizer.read() != null ? generatemediaperiodeventtimeAudioAttributesCompatParcelizer.read().toString() : null;
        if (string == null || string.isEmpty()) {
            IconCompatParcelizer(str);
        } else {
            write(arrayList, string, str2);
        }
    }

    private void IconCompatParcelizer(Number number, String str, String str2) {
        if (str == null || number == null) {
            return;
        }
        try {
            generateMediaPeriodEventTime generatemediaperiodeventtimeRemoteActionCompatParcelizer = lambdaonAudioDecoderInitialized4.RemoteActionCompatParcelizer(str);
            String string = generatemediaperiodeventtimeRemoteActionCompatParcelizer.read().toString();
            if (string.isEmpty()) {
                generateMediaPeriodEventTime generatemediaperiodeventtime = lambdaonAudioDecoderReleased8.read(512, 2, string);
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read(generatemediaperiodeventtime);
                this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver().IconCompatParcelizer(this.AudioAttributesCompatParcelizer.write(), generatemediaperiodeventtime.RemoteActionCompatParcelizer());
                return;
            }
            if (number.intValue() >= 0 && number.doubleValue() >= 0.0d && number.floatValue() >= BitmapDescriptorFactory.HUE_RED) {
                if (generatemediaperiodeventtimeRemoteActionCompatParcelizer.write() != 0) {
                    this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read(generatemediaperiodeventtimeRemoteActionCompatParcelizer);
                }
                this.read.RemoteActionCompatParcelizer(new JSONObject().put(string, new JSONObject().put(str2, number)), false);
                return;
            }
            generateMediaPeriodEventTime generatemediaperiodeventtime2 = lambdaonAudioDecoderReleased8.read(512, 25, string);
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read(generatemediaperiodeventtime2);
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver().IconCompatParcelizer(this.AudioAttributesCompatParcelizer.write(), generatemediaperiodeventtime2.RemoteActionCompatParcelizer());
        } catch (Throwable unused) {
            RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver();
            this.AudioAttributesCompatParcelizer.write();
            rendererWakeupListenerMediaBrowserCompatItemReceiver.IconCompatParcelizer();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void IconCompatParcelizer(Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                Object obj = map.get(str);
                generateMediaPeriodEventTime generatemediaperiodeventtimeRemoteActionCompatParcelizer = lambdaonAudioDecoderInitialized4.RemoteActionCompatParcelizer(str);
                String string = generatemediaperiodeventtimeRemoteActionCompatParcelizer.read().toString();
                if (generatemediaperiodeventtimeRemoteActionCompatParcelizer.write() != 0) {
                    this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read(generatemediaperiodeventtimeRemoteActionCompatParcelizer);
                }
                if (string.isEmpty()) {
                    generateMediaPeriodEventTime generatemediaperiodeventtime = lambdaonAudioDecoderReleased8.read(512, 2, new String[0]);
                    this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read(generatemediaperiodeventtime);
                    this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver().IconCompatParcelizer(this.AudioAttributesCompatParcelizer.write(), generatemediaperiodeventtime.RemoteActionCompatParcelizer());
                } else {
                    try {
                        generateMediaPeriodEventTime generatemediaperiodeventtimeWrite = lambdaonAudioDecoderInitialized4.write(obj, lambdaonAudioDecoderInitialized4.AudioAttributesCompatParcelizer.Profile);
                        Object string2 = generatemediaperiodeventtimeWrite.read();
                        if (generatemediaperiodeventtimeWrite.write() != 0) {
                            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read(generatemediaperiodeventtimeWrite);
                        }
                        if (string.equalsIgnoreCase("Phone")) {
                            try {
                                string2 = string2.toString();
                                String strAudioAttributesImplApi26Parcelizer = this.MediaBrowserCompatItemReceiver.AudioAttributesImplApi26Parcelizer();
                                if (strAudioAttributesImplApi26Parcelizer == null || strAudioAttributesImplApi26Parcelizer.isEmpty()) {
                                    if (!string2.startsWith("+")) {
                                        generateMediaPeriodEventTime generatemediaperiodeventtime2 = lambdaonAudioDecoderReleased8.read(512, 4, string2);
                                        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read(generatemediaperiodeventtime2);
                                        this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver().IconCompatParcelizer(this.AudioAttributesCompatParcelizer.write(), generatemediaperiodeventtime2.RemoteActionCompatParcelizer());
                                    }
                                }
                                RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver();
                                String strWrite = this.AudioAttributesCompatParcelizer.write();
                                StringBuilder sb = new StringBuilder();
                                sb.append("Profile phone is: ");
                                sb.append((Object) string2);
                                sb.append(" device country code is: ");
                                if (strAudioAttributesImplApi26Parcelizer == null) {
                                    strAudioAttributesImplApi26Parcelizer = "null";
                                }
                                sb.append(strAudioAttributesImplApi26Parcelizer);
                                rendererWakeupListenerMediaBrowserCompatItemReceiver.write(strWrite, sb.toString());
                            } catch (Exception e) {
                                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read(lambdaonAudioDecoderReleased8.read(512, 5, new String[0]));
                                RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver2 = this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver();
                                String strWrite2 = this.AudioAttributesCompatParcelizer.write();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("Invalid phone number: ");
                                sb2.append(e.getLocalizedMessage());
                                rendererWakeupListenerMediaBrowserCompatItemReceiver2.IconCompatParcelizer(strWrite2, sb2.toString());
                            }
                        }
                        jSONObject.put(string, string2);
                    } catch (Throwable unused) {
                        String[] strArr = new String[2];
                        strArr[0] = obj != null ? obj.toString() : "";
                        strArr[1] = string;
                        generateMediaPeriodEventTime generatemediaperiodeventtime3 = lambdaonAudioDecoderReleased8.read(512, 3, strArr);
                        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read(generatemediaperiodeventtime3);
                        this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver().IconCompatParcelizer(this.AudioAttributesCompatParcelizer.write(), generatemediaperiodeventtime3.RemoteActionCompatParcelizer());
                    }
                }
            }
            RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver3 = this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver();
            String strWrite3 = this.AudioAttributesCompatParcelizer.write();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Constructed custom profile: ");
            sb3.append(jSONObject);
            rendererWakeupListenerMediaBrowserCompatItemReceiver3.write(strWrite3, sb3.toString());
            this.read.RemoteActionCompatParcelizer(jSONObject, false);
        } catch (Throwable unused2) {
            RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver4 = this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver();
            this.AudioAttributesCompatParcelizer.write();
            rendererWakeupListenerMediaBrowserCompatItemReceiver4.IconCompatParcelizer();
        }
    }

    private void MediaBrowserCompatItemReceiver(String str) {
        if (str == null) {
            str = "";
        }
        try {
            generateMediaPeriodEventTime generatemediaperiodeventtimeRemoteActionCompatParcelizer = lambdaonAudioDecoderInitialized4.RemoteActionCompatParcelizer(str);
            String string = generatemediaperiodeventtimeRemoteActionCompatParcelizer.read().toString();
            if (string.isEmpty()) {
                generateMediaPeriodEventTime generatemediaperiodeventtime = lambdaonAudioDecoderReleased8.read(512, 6, new String[0]);
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read(generatemediaperiodeventtime);
                this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver().IconCompatParcelizer(this.AudioAttributesCompatParcelizer.write(), generatemediaperiodeventtime.RemoteActionCompatParcelizer());
                return;
            }
            if (generatemediaperiodeventtimeRemoteActionCompatParcelizer.write() != 0) {
                this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.read(generatemediaperiodeventtimeRemoteActionCompatParcelizer);
            }
            if (string.toLowerCase().contains("identity")) {
                RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver();
                String strWrite = this.AudioAttributesCompatParcelizer.write();
                StringBuilder sb = new StringBuilder("Cannot remove value for key ");
                sb.append(string);
                sb.append(" from user profile");
                rendererWakeupListenerMediaBrowserCompatItemReceiver.write(strWrite, sb.toString());
                return;
            }
            this.read.RemoteActionCompatParcelizer(new JSONObject().put(string, new JSONObject().put("$delete", true)), true);
            RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver2 = this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver();
            String strWrite2 = this.AudioAttributesCompatParcelizer.write();
            StringBuilder sb2 = new StringBuilder("removing value for key ");
            sb2.append(string);
            sb2.append(" from user profile");
            rendererWakeupListenerMediaBrowserCompatItemReceiver2.write(strWrite2, sb2.toString());
        } catch (Throwable unused) {
            RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver3 = this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver();
            this.AudioAttributesCompatParcelizer.write();
            rendererWakeupListenerMediaBrowserCompatItemReceiver3.IconCompatParcelizer();
        }
    }

    private void write(ArrayList<String> arrayList, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(str2, new JSONArray((Collection) arrayList));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(str, jSONObject);
            this.read.RemoteActionCompatParcelizer(jSONObject2, false);
            RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver = this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver();
            String strWrite = this.AudioAttributesCompatParcelizer.write();
            StringBuilder sb = new StringBuilder("Constructed multi-value profile push: ");
            sb.append(jSONObject2);
            rendererWakeupListenerMediaBrowserCompatItemReceiver.write(strWrite, sb.toString());
        } catch (Throwable unused) {
            RendererWakeupListener rendererWakeupListenerMediaBrowserCompatItemReceiver2 = this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver();
            this.AudioAttributesCompatParcelizer.write();
            rendererWakeupListenerMediaBrowserCompatItemReceiver2.IconCompatParcelizer();
        }
    }

    private static String AudioAttributesImplApi21Parcelizer(Bundle bundle) {
        Object obj = bundle.get("wzrk_dd");
        if (obj != null) {
            boolean zEqualsIgnoreCase = obj instanceof String ? "true".equalsIgnoreCase((String) obj) : false;
            if (obj instanceof Boolean) {
                zEqualsIgnoreCase = ((Boolean) obj).booleanValue();
            }
            if (zEqualsIgnoreCase) {
                return bundle.getString("wzrk_pid");
            }
        }
        return bundle.getString("wzrk_id");
    }

    private boolean RemoteActionCompatParcelizer(String str, HashMap<String, Long> map, int i) {
        boolean z;
        synchronized (this.RatingCompat) {
            z = false;
            try {
                long jAudioAttributesCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer();
                if (map.containsKey(str) && jAudioAttributesCompatParcelizer - map.get(str).longValue() < i) {
                    z = true;
                }
                map.put(str, Long.valueOf(jAudioAttributesCompatParcelizer));
            } catch (Throwable unused) {
            }
        }
        return z;
    }

    public final void write(JSONObject jSONObject) {
        this.read.write(this.write, jSONObject, 2);
    }

    private void RemoteActionCompatParcelizer(JSONObject jSONObject) {
        this.read.write(this.write, jSONObject, 7);
    }

    private void AudioAttributesImplBaseParcelizer(Bundle bundle) {
        try {
            new TimelineRemotableTimeline(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, this.IconCompatParcelizer).IconCompatParcelizer(AnalyticsCollector.write(bundle), null, this.write);
        } catch (Throwable unused) {
            RendererWakeupListener.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
    }

    final void read(boolean z, CTInboxMessage cTInboxMessage, Bundle bundle) {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObjectIconCompatParcelizer = AnalyticsCollector.IconCompatParcelizer(cTInboxMessage);
            if (bundle != null) {
                for (String str : bundle.keySet()) {
                    Object obj = bundle.get(str);
                    if (obj != null) {
                        jSONObjectIconCompatParcelizer.put(str, obj);
                    }
                }
            }
            if (!z) {
                jSONObject.put("evtName", "Notification Viewed");
            } else {
                try {
                    this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(jSONObjectIconCompatParcelizer);
                } catch (Throwable unused) {
                }
                jSONObject.put("evtName", "Notification Clicked");
            }
            jSONObject.put("evtData", jSONObjectIconCompatParcelizer);
            this.read.write(this.write, jSONObject, 4);
        } catch (Throwable unused2) {
        }
    }
}
