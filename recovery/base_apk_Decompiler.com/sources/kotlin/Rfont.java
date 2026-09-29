package kotlin;

import android.content.Context;
import android.content.SharedPreferences;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class Rfont {
    private final CleverTapInstanceConfig AudioAttributesCompatParcelizer;
    private final isTypeSupported AudioAttributesImplApi21Parcelizer;
    private final lambdaupdateStateAndInformListeners37 AudioAttributesImplBaseParcelizer;
    private final onDroppedVideoFrames IconCompatParcelizer;
    private final SimpleBasePlayerPeriodData MediaBrowserCompatItemReceiver;
    private final Context RemoteActionCompatParcelizer;
    private String read;
    private final SimpleDateFormat write = new SimpleDateFormat("ddMMyyyy", Locale.US);

    Rfont(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, final String str, SimpleBasePlayerPeriodData simpleBasePlayerPeriodData, lambdaupdateStateAndInformListeners37 lambdaupdatestateandinformlisteners37, isTypeSupported istypesupported, onDroppedVideoFrames ondroppedvideoframes) {
        this.AudioAttributesCompatParcelizer = cleverTapInstanceConfig;
        this.RemoteActionCompatParcelizer = context;
        this.read = str;
        this.MediaBrowserCompatItemReceiver = simpleBasePlayerPeriodData;
        this.AudioAttributesImplBaseParcelizer = lambdaupdatestateandinformlisteners37;
        this.AudioAttributesImplApi21Parcelizer = istypesupported;
        this.IconCompatParcelizer = ondroppedvideoframes;
        istypesupported.read().read("initInAppFCManager", new Callable() { // from class: o.Rating
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.read.read(str);
            }
        });
    }

    final /* synthetic */ Void read(String str) throws Exception {
        AudioAttributesImplApi26Parcelizer(str);
        return null;
    }

    public final boolean write(CTInAppNotification cTInAppNotification, MagicModuleSubmissionRequestBody<JSONObject, String, Boolean> magicModuleSubmissionRequestBody) {
        if (cTInAppNotification == null) {
            return false;
        }
        try {
            String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(cTInAppNotification);
            if (strRemoteActionCompatParcelizer == null) {
                return true;
            }
            if (magicModuleSubmissionRequestBody.invoke(cTInAppNotification.onCustomAction(), strRemoteActionCompatParcelizer).booleanValue()) {
                return false;
            }
            if (cTInAppNotification.getIconCompatParcelizer()) {
                return true;
            }
            if (!IconCompatParcelizer(cTInAppNotification) && !read(cTInAppNotification)) {
                if (!write(cTInAppNotification)) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    public final void AudioAttributesCompatParcelizer(String str) {
        this.AudioAttributesImplBaseParcelizer.read();
        this.read = str;
        AudioAttributesImplApi26Parcelizer(str);
    }

    public final void AudioAttributesCompatParcelizer(final Context context, CTInAppNotification cTInAppNotification) {
        final String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(cTInAppNotification);
        if (strRemoteActionCompatParcelizer == null) {
            return;
        }
        this.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer().read("recordInAppImpressionsAndCounts", new Callable() { // from class: o.Rlayout
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.read.AudioAttributesCompatParcelizer(strRemoteActionCompatParcelizer, context);
            }
        });
    }

    final /* synthetic */ Void AudioAttributesCompatParcelizer(String str, Context context) throws Exception {
        this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(str);
        RemoteActionCompatParcelizer(str);
        RendererCapabilitiesFormatSupport.AudioAttributesCompatParcelizer(context, AudioAttributesImplApi21Parcelizer(RemoteActionCompatParcelizer("istc_inapp", this.read)), AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer("istc_inapp", this.read), 0) + 1);
        return null;
    }

    public final int IconCompatParcelizer() {
        return AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer("istc_inapp", this.read), 0);
    }

    public final JSONArray AudioAttributesCompatParcelizer(Context context) {
        try {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry<String, ?> entry : RendererCapabilitiesFormatSupport.IconCompatParcelizer(context, AudioAttributesImplApi21Parcelizer(RemoteActionCompatParcelizer("counts_per_inapp", this.read))).getAll().entrySet()) {
                if (entry.getValue() instanceof String) {
                    String[] strArrSplit = ((String) entry.getValue()).split(",");
                    if (strArrSplit.length == 2) {
                        JSONArray jSONArray2 = new JSONArray();
                        jSONArray2.put(0, entry.getKey());
                        jSONArray2.put(1, Integer.parseInt(strArrSplit[0]));
                        jSONArray2.put(2, Integer.parseInt(strArrSplit[1]));
                        jSONArray.put(jSONArray2);
                    }
                }
            }
            return jSONArray;
        } catch (Throwable unused) {
            RendererWakeupListener.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            return null;
        }
    }

    public final void read(Context context, JSONObject jSONObject) {
        try {
            if (jSONObject.has("inapp_stale")) {
                JSONArray jSONArray = jSONObject.getJSONArray("inapp_stale");
                SharedPreferences.Editor editorEdit = RendererCapabilitiesFormatSupport.IconCompatParcelizer(context, AudioAttributesImplApi21Parcelizer(RemoteActionCompatParcelizer("counts_per_inapp", this.read))).edit();
                for (int i = 0; i < jSONArray.length(); i++) {
                    Object obj = jSONArray.get(i);
                    if (obj instanceof Integer) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(obj);
                        editorEdit.remove(sb.toString());
                        Objects.toString(obj);
                        RendererWakeupListener.MediaBrowserCompatItemReceiver();
                    } else if (obj instanceof String) {
                        editorEdit.remove((String) obj);
                        Objects.toString(obj);
                        RendererWakeupListener.MediaBrowserCompatItemReceiver();
                    }
                }
                RendererCapabilitiesFormatSupport.write(editorEdit);
            }
        } catch (Throwable unused) {
            RendererWakeupListener.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
    }

    public final void read(Context context, int i, int i2) {
        synchronized (this) {
            RendererCapabilitiesFormatSupport.AudioAttributesCompatParcelizer(context, AudioAttributesImplApi21Parcelizer(RemoteActionCompatParcelizer("istmcd_inapp", this.read)), i);
            RendererCapabilitiesFormatSupport.AudioAttributesCompatParcelizer(context, AudioAttributesImplApi21Parcelizer(RemoteActionCompatParcelizer("imc", this.read)), i2);
        }
    }

    private String read() {
        return this.AudioAttributesCompatParcelizer.write();
    }

    private RendererWakeupListener RemoteActionCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver();
    }

    private int[] IconCompatParcelizer(String str) {
        String string = RendererCapabilitiesFormatSupport.IconCompatParcelizer(this.RemoteActionCompatParcelizer, AudioAttributesImplApi21Parcelizer(RemoteActionCompatParcelizer("counts_per_inapp", this.read))).getString(str, null);
        if (string == null) {
            return new int[]{0, 0};
        }
        try {
            String[] strArrSplit = string.split(",");
            if (strArrSplit.length != 2) {
                return new int[]{0, 0};
            }
            return new int[]{Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1])};
        } catch (Throwable unused) {
            return new int[]{0, 0};
        }
    }

    private static String RemoteActionCompatParcelizer(CTInAppNotification cTInAppNotification) {
        if (cTInAppNotification.getRemoteActionCompatParcelizer() != null && !cTInAppNotification.getRemoteActionCompatParcelizer().isEmpty()) {
            try {
                return cTInAppNotification.getRemoteActionCompatParcelizer();
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private int AudioAttributesCompatParcelizer(String str, int i) {
        if (this.AudioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver()) {
            int iRemoteActionCompatParcelizer = RendererCapabilitiesFormatSupport.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, AudioAttributesImplApi21Parcelizer(str), -1000);
            return iRemoteActionCompatParcelizer != -1000 ? iRemoteActionCompatParcelizer : RendererCapabilitiesFormatSupport.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, str, i);
        }
        return RendererCapabilitiesFormatSupport.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, AudioAttributesImplApi21Parcelizer(str), i);
    }

    private static String RemoteActionCompatParcelizer(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    private String AudioAttributesCompatParcelizer(String str, String str2) {
        if (this.AudioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver()) {
            String strWrite = RendererCapabilitiesFormatSupport.write(this.RemoteActionCompatParcelizer, AudioAttributesImplApi21Parcelizer(str), str2);
            return strWrite != null ? strWrite : RendererCapabilitiesFormatSupport.write(this.RemoteActionCompatParcelizer, str, str2);
        }
        return RendererCapabilitiesFormatSupport.write(this.RemoteActionCompatParcelizer, AudioAttributesImplApi21Parcelizer(str), str2);
    }

    private boolean write(CTInAppNotification cTInAppNotification) {
        String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(cTInAppNotification);
        if (strRemoteActionCompatParcelizer == null) {
            return false;
        }
        if (AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer("istc_inapp", this.read), 0) >= AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer("istmcd_inapp", this.read), 1)) {
            return true;
        }
        try {
            int onCommand = cTInAppNotification.getOnCommand();
            if (onCommand == -1) {
                return false;
            }
            return IconCompatParcelizer(strRemoteActionCompatParcelizer)[0] >= onCommand;
        } catch (Throwable unused) {
            return true;
        }
    }

    private boolean read(CTInAppNotification cTInAppNotification) {
        String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(cTInAppNotification);
        if (strRemoteActionCompatParcelizer == null || cTInAppNotification.getOnCustomAction() == -1) {
            return false;
        }
        try {
            return IconCompatParcelizer(strRemoteActionCompatParcelizer)[1] >= cTInAppNotification.getOnCustomAction();
        } catch (Exception unused) {
            return true;
        }
    }

    private boolean IconCompatParcelizer(CTInAppNotification cTInAppNotification) {
        String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(cTInAppNotification);
        if (strRemoteActionCompatParcelizer == null) {
            return false;
        }
        try {
            if (this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(strRemoteActionCompatParcelizer) >= (cTInAppNotification.getMediaBrowserCompatItemReceiver() >= 0 ? cTInAppNotification.getMediaBrowserCompatItemReceiver() : 1000)) {
                return true;
            }
            return this.AudioAttributesImplBaseParcelizer.getWrite() >= AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer("imc", this.read), 1);
        } catch (Throwable unused) {
            return true;
        }
    }

    private void RemoteActionCompatParcelizer(String str) {
        int[] iArrIconCompatParcelizer = IconCompatParcelizer(str);
        iArrIconCompatParcelizer[0] = iArrIconCompatParcelizer[0] + 1;
        iArrIconCompatParcelizer[1] = iArrIconCompatParcelizer[1] + 1;
        SharedPreferences.Editor editorEdit = RendererCapabilitiesFormatSupport.IconCompatParcelizer(this.RemoteActionCompatParcelizer, AudioAttributesImplApi21Parcelizer(RemoteActionCompatParcelizer("counts_per_inapp", this.read))).edit();
        StringBuilder sb = new StringBuilder();
        sb.append(iArrIconCompatParcelizer[0]);
        sb.append(",");
        sb.append(iArrIconCompatParcelizer[1]);
        editorEdit.putString(str, sb.toString());
        RendererCapabilitiesFormatSupport.write(editorEdit);
    }

    private void AudioAttributesImplApi26Parcelizer(String str) {
        RendererWakeupListener rendererWakeupListenerRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        StringBuilder sb = new StringBuilder();
        sb.append(this.AudioAttributesCompatParcelizer.write());
        sb.append(":async_deviceID");
        rendererWakeupListenerRemoteActionCompatParcelizer.write(sb.toString(), "InAppFCManager init() called");
        try {
            MediaBrowserCompatCustomActionResultReceiver(str);
            String str2 = this.write.format(this.IconCompatParcelizer.read());
            if (str2.equals(AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer("ict_date", str), "20140428"))) {
                return;
            }
            RendererCapabilitiesFormatSupport.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, AudioAttributesImplApi21Parcelizer(RemoteActionCompatParcelizer("ict_date", str)), str2);
            RendererCapabilitiesFormatSupport.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, AudioAttributesImplApi21Parcelizer(RemoteActionCompatParcelizer("istc_inapp", str)), 0);
            SharedPreferences sharedPreferencesIconCompatParcelizer = RendererCapabilitiesFormatSupport.IconCompatParcelizer(this.RemoteActionCompatParcelizer, AudioAttributesImplApi21Parcelizer(RemoteActionCompatParcelizer("counts_per_inapp", str)));
            SharedPreferences.Editor editorEdit = sharedPreferencesIconCompatParcelizer.edit();
            Map<String, ?> all = sharedPreferencesIconCompatParcelizer.getAll();
            for (String str3 : all.keySet()) {
                Object obj = all.get(str3);
                if (!(obj instanceof String)) {
                    editorEdit.remove(str3);
                } else {
                    String[] strArrSplit = ((String) obj).split(",");
                    if (strArrSplit.length != 2) {
                        editorEdit.remove(str3);
                    } else {
                        try {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("0,");
                            sb2.append(strArrSplit[1]);
                            editorEdit.putString(str3, sb2.toString());
                        } catch (Throwable unused) {
                            RendererWakeupListener rendererWakeupListenerRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer();
                            read();
                            rendererWakeupListenerRemoteActionCompatParcelizer2.IconCompatParcelizer();
                        }
                    }
                }
            }
            RendererCapabilitiesFormatSupport.write(editorEdit);
        } catch (Exception e) {
            RendererWakeupListener rendererWakeupListenerRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer();
            String str4 = read();
            StringBuilder sb3 = new StringBuilder("Failed to init inapp manager ");
            sb3.append(e.getLocalizedMessage());
            rendererWakeupListenerRemoteActionCompatParcelizer3.write(str4, sb3.toString());
        }
    }

    private void MediaBrowserCompatCustomActionResultReceiver(String str) {
        SharedPreferences sharedPreferencesIconCompatParcelizer = RendererCapabilitiesFormatSupport.IconCompatParcelizer(this.RemoteActionCompatParcelizer, "counts_per_inapp");
        SharedPreferences sharedPreferencesIconCompatParcelizer2 = RendererCapabilitiesFormatSupport.IconCompatParcelizer(this.RemoteActionCompatParcelizer, RemoteActionCompatParcelizer("counts_per_inapp", str));
        SharedPreferences sharedPreferencesIconCompatParcelizer3 = RendererCapabilitiesFormatSupport.IconCompatParcelizer(this.RemoteActionCompatParcelizer, AudioAttributesImplApi21Parcelizer(RemoteActionCompatParcelizer("counts_per_inapp", str)));
        getAnswerMap getanswermap = new getAnswerMap() { // from class: o.Rplurals
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return Boolean.valueOf(((String) obj).split(",").length == 2);
            }
        };
        if (PlayerPlaybackSuppressionReason.write(sharedPreferencesIconCompatParcelizer2)) {
            RendererWakeupListener.MediaBrowserCompatItemReceiver();
            new lambdaupdateStateAndInformListeners58(sharedPreferencesIconCompatParcelizer2, sharedPreferencesIconCompatParcelizer3, String.class, getanswermap).RemoteActionCompatParcelizer();
            RendererWakeupListener.MediaBrowserCompatItemReceiver();
        } else if (PlayerPlaybackSuppressionReason.write(sharedPreferencesIconCompatParcelizer)) {
            RendererWakeupListener.MediaBrowserCompatItemReceiver();
            new lambdaupdateStateAndInformListeners58(sharedPreferencesIconCompatParcelizer, sharedPreferencesIconCompatParcelizer3, String.class, getanswermap).RemoteActionCompatParcelizer();
            RendererWakeupListener.MediaBrowserCompatItemReceiver();
        }
        access6500 write = this.MediaBrowserCompatItemReceiver.getWrite();
        access6700 remoteActionCompatParcelizer = this.MediaBrowserCompatItemReceiver.getRemoteActionCompatParcelizer();
        if (write != null && remoteActionCompatParcelizer != null) {
            JSONArray jSONArrayAudioAttributesCompatParcelizer = remoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
            if (jSONArrayAudioAttributesCompatParcelizer.length() > 0) {
                RendererWakeupListener.MediaBrowserCompatItemReceiver();
                write.IconCompatParcelizer(jSONArrayAudioAttributesCompatParcelizer);
                remoteActionCompatParcelizer.read();
                RendererWakeupListener.MediaBrowserCompatItemReceiver();
            }
        }
        if (AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer("ict_date", str), (String) null) != null || AudioAttributesCompatParcelizer("ict_date", (String) null) == null) {
            return;
        }
        RendererWakeupListener.MediaMetadataCompat();
        RendererCapabilitiesFormatSupport.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, AudioAttributesImplApi21Parcelizer(RemoteActionCompatParcelizer("ict_date", str)), AudioAttributesCompatParcelizer("ict_date", "20140428"));
        RendererCapabilitiesFormatSupport.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, AudioAttributesImplApi21Parcelizer(RemoteActionCompatParcelizer("istc_inapp", str)), AudioAttributesCompatParcelizer(AudioAttributesImplApi21Parcelizer("istc_inapp"), 0));
    }

    private String AudioAttributesImplApi21Parcelizer(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(":");
        sb.append(read());
        return sb.toString();
    }
}
