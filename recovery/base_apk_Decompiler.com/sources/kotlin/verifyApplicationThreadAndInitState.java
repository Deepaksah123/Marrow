package kotlin;

import com.clevertap.android.sdk.inapp.CTInAppAction;
import com.clevertap.android.sdk.inapp.CTInAppNotification;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u0000 \u00142\u00020\u0001:\u0004\u0014\u0011\u0019\u0017B;\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0003\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0003\u001a\u00020\u0010¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u0018J3\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u001d2\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\b\u0010\u0005\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u0019\u0010\u001eJ#\u0010\u0014\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u001b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u0014\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0010H\u0016¢\u0006\u0004\b \u0010!J\u0019\u0010#\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0011\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0019\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010#\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010)R\u0014\u0010\u0017\u001a\u00020\f8\u0004X\u0084\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0017\u0010\u0014\u001a\u00020\u00108\u0007¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b\u0011\u0010!R \u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u001d8\u0004X\u0085\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010.R\u001e\u0010,\u001a\f\u0012\b\u0012\u0006*\u00020\u00060\u00060/8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0011\u00100R\u0014\u0010%\u001a\u00020\u00138\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b#\u00101R\u0014\u0010'\u001a\u00020\u00138\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b2\u00101\u0082\u0001\u000234"}, d2 = {"Lo/verifyApplicationThreadAndInitState;", "", "Lo/updateStateAndInformListeners;", "p0", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "p1", "Lo/lambdaupdateStateAndInformListeners54;", "p2", "Lo/SimpleBasePlayerExternalSyntheticLambda6;", "p3", "Lo/verifyApplicationThreadAndInitState$IconCompatParcelizer;", "p4", "Lo/RendererWakeupListener;", "p5", "<init>", "(Lo/updateStateAndInformListeners;Lcom/clevertap/android/sdk/inapp/CTInAppNotification;Lo/lambdaupdateStateAndInformListeners54;Lo/SimpleBasePlayerExternalSyntheticLambda6;Lo/verifyApplicationThreadAndInitState$IconCompatParcelizer;Lo/RendererWakeupListener;)V", "", "read", "(Ljava/lang/String;)Ljava/lang/String;", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;)Ljava/lang/Boolean;", "", "IconCompatParcelizer", "()V", "write", "", "Lo/getPlaceholderState;", "Lorg/json/JSONObject;", "", "(Ljava/util/List;Lorg/json/JSONObject;)Ljava/util/Map;", "(Lo/getPlaceholderState;Lorg/json/JSONObject;)Ljava/lang/Object;", "toString", "()Ljava/lang/String;", "Lcom/clevertap/android/sdk/inapp/CTInAppAction;", "RemoteActionCompatParcelizer", "(Lcom/clevertap/android/sdk/inapp/CTInAppAction;)Ljava/lang/String;", "AudioAttributesImplApi21Parcelizer", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "AudioAttributesImplApi26Parcelizer", "Lo/SimpleBasePlayerExternalSyntheticLambda6;", "Lo/verifyApplicationThreadAndInitState$IconCompatParcelizer;", "MediaBrowserCompatCustomActionResultReceiver", "Lo/RendererWakeupListener;", "AudioAttributesImplBaseParcelizer", "Ljava/lang/String;", "Ljava/util/Map;", "Ljava/lang/ref/WeakReference;", "Ljava/lang/ref/WeakReference;", "Z", "MediaBrowserCompatItemReceiver", "Lo/verifyApplicationThreadAndInitState$write;", "Lo/verifyApplicationThreadAndInitState$read;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class verifyApplicationThreadAndInitState {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final CTInAppNotification read;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final SimpleBasePlayerExternalSyntheticLambda6 write;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final Map<String, Object> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final RendererWakeupListener IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final boolean AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final boolean AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final WeakReference<lambdaupdateStateAndInformListeners54> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private IconCompatParcelizer RemoteActionCompatParcelizer;

    public interface IconCompatParcelizer {
        void AudioAttributesCompatParcelizer(verifyApplicationThreadAndInitState verifyapplicationthreadandinitstate);
    }

    public final /* synthetic */ class RemoteActionCompatParcelizer {
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[handleIncreaseDeviceVolume.values().length];
            try {
                iArr[handleIncreaseDeviceVolume.AudioAttributesImplApi26Parcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[handleIncreaseDeviceVolume.IconCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[handleIncreaseDeviceVolume.AudioAttributesCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[handleIncreaseDeviceVolume.read.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[handleIncreaseDeviceVolume.write.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            write = iArr;
        }
    }

    private verifyApplicationThreadAndInitState(updateStateAndInformListeners updatestateandinformlisteners, CTInAppNotification cTInAppNotification, lambdaupdateStateAndInformListeners54 lambdaupdatestateandinformlisteners54, SimpleBasePlayerExternalSyntheticLambda6 simpleBasePlayerExternalSyntheticLambda6, IconCompatParcelizer iconCompatParcelizer, RendererWakeupListener rendererWakeupListener) {
        this.read = cTInAppNotification;
        this.write = simpleBasePlayerExternalSyntheticLambda6;
        this.RemoteActionCompatParcelizer = iconCompatParcelizer;
        this.IconCompatParcelizer = rendererWakeupListener;
        this.AudioAttributesCompatParcelizer = updatestateandinformlisteners.getIconCompatParcelizer();
        List<getPlaceholderState> list = updatestateandinformlisteners.read();
        CustomTemplateInAppData onFastForward = cTInAppNotification.getOnFastForward();
        this.MediaBrowserCompatCustomActionResultReceiver = write(list, onFastForward != null ? onFastForward.write() : null);
        this.AudioAttributesImplBaseParcelizer = new WeakReference<>(lambdaupdatestateandinformlisteners54);
        CustomTemplateInAppData onFastForward2 = cTInAppNotification.getOnFastForward();
        this.AudioAttributesImplApi21Parcelizer = onFastForward2 != null ? onFastForward2.getIconCompatParcelizer() : false;
        this.AudioAttributesImplApi26Parcelizer = updatestateandinformlisteners.getRead();
    }

    /* JADX INFO: renamed from: o.verifyApplicationThreadAndInitState$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/verifyApplicationThreadAndInitState$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/updateStateAndInformListeners;", "p0", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "p1", "Lo/lambdaupdateStateAndInformListeners54;", "p2", "Lo/SimpleBasePlayerExternalSyntheticLambda6;", "p3", "Lo/verifyApplicationThreadAndInitState$IconCompatParcelizer;", "p4", "Lo/RendererWakeupListener;", "p5", "Lo/verifyApplicationThreadAndInitState;", "AudioAttributesCompatParcelizer", "(Lo/updateStateAndInformListeners;Lcom/clevertap/android/sdk/inapp/CTInAppNotification;Lo/lambdaupdateStateAndInformListeners54;Lo/SimpleBasePlayerExternalSyntheticLambda6;Lo/verifyApplicationThreadAndInitState$IconCompatParcelizer;Lo/RendererWakeupListener;)Lo/verifyApplicationThreadAndInitState;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: o.verifyApplicationThreadAndInitState$AudioAttributesCompatParcelizer$IconCompatParcelizer */
        public final /* synthetic */ class IconCompatParcelizer {
            public static final /* synthetic */ int[] write;

            static {
                int[] iArr = new int[handleClearVideoOutput.values().length];
                try {
                    iArr[handleClearVideoOutput.write.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[handleClearVideoOutput.RemoteActionCompatParcelizer.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                write = iArr;
            }
        }

        private Companion() {
        }

        public static verifyApplicationThreadAndInitState AudioAttributesCompatParcelizer(updateStateAndInformListeners p0, CTInAppNotification p1, lambdaupdateStateAndInformListeners54 p2, SimpleBasePlayerExternalSyntheticLambda6 p3, IconCompatParcelizer p4, RendererWakeupListener p5) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            toMagicModuleMetaRepoModel.write(p3, "");
            toMagicModuleMetaRepoModel.write(p5, "");
            int i = IconCompatParcelizer.write[p0.getWrite().ordinal()];
            if (i == 1) {
                return new read(p0, p1, p2, p3, p4, p5);
            }
            if (i != 2) {
                throw new RenewEligibleCreator();
            }
            return new write(p0, p1, p2, p3, p4, p5);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void IconCompatParcelizer() {
        if (this.AudioAttributesImplApi21Parcelizer) {
            return;
        }
        lambdaupdateStateAndInformListeners54 lambdaupdatestateandinformlisteners54 = this.AudioAttributesImplBaseParcelizer.get();
        if (lambdaupdatestateandinformlisteners54 != null) {
            lambdaupdatestateandinformlisteners54.AudioAttributesCompatParcelizer(this.read, null);
        } else {
            this.IconCompatParcelizer.IconCompatParcelizer("CustomTemplates", "Cannot set template as presented");
        }
    }

    public final void write() {
        IconCompatParcelizer iconCompatParcelizer = this.RemoteActionCompatParcelizer;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.AudioAttributesCompatParcelizer(this);
        }
        this.RemoteActionCompatParcelizer = null;
        if (!this.AudioAttributesImplApi21Parcelizer || this.AudioAttributesImplApi26Parcelizer) {
            lambdaupdateStateAndInformListeners54 lambdaupdatestateandinformlisteners54 = this.AudioAttributesImplBaseParcelizer.get();
            if (lambdaupdatestateandinformlisteners54 != null) {
                lambdaupdatestateandinformlisteners54.read(this.read, null);
            } else {
                this.IconCompatParcelizer.IconCompatParcelizer("CustomTemplates", "Cannot set template as dismissed");
            }
            this.AudioAttributesImplBaseParcelizer.clear();
        }
    }

    private final Map<String, Object> write(List<getPlaceholderState> p0, JSONObject p1) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (getPlaceholderState getplaceholderstate : p0) {
            Object objAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(getplaceholderstate, p1);
            if (objAudioAttributesCompatParcelizer == null) {
                objAudioAttributesCompatParcelizer = getplaceholderstate.write();
            }
            if (objAudioAttributesCompatParcelizer != null) {
                linkedHashMap.put(getplaceholderstate.AudioAttributesCompatParcelizer(), objAudioAttributesCompatParcelizer);
            }
        }
        return linkedHashMap;
    }

    private final Object AudioAttributesCompatParcelizer(getPlaceholderState p0, JSONObject p1) {
        if (p1 != null && p1.has(p0.AudioAttributesCompatParcelizer())) {
            try {
                int i = RemoteActionCompatParcelizer.write[p0.read().ordinal()];
                if (i == 1) {
                    return p1.getString(p0.AudioAttributesCompatParcelizer());
                }
                if (i == 2) {
                    return Boolean.valueOf(p1.getBoolean(p0.AudioAttributesCompatParcelizer()));
                }
                if (i == 3) {
                    Object objWrite = p0.write();
                    return objWrite instanceof Byte ? Byte.valueOf((byte) p1.getInt(p0.AudioAttributesCompatParcelizer())) : objWrite instanceof Short ? Short.valueOf((short) p1.getInt(p0.AudioAttributesCompatParcelizer())) : objWrite instanceof Integer ? Integer.valueOf(p1.getInt(p0.AudioAttributesCompatParcelizer())) : objWrite instanceof Long ? Long.valueOf(p1.getLong(p0.AudioAttributesCompatParcelizer())) : objWrite instanceof Float ? Float.valueOf((float) p1.getDouble(p0.AudioAttributesCompatParcelizer())) : Double.valueOf(p1.getDouble(p0.AudioAttributesCompatParcelizer()));
                }
                if (i == 4) {
                    return p1.getString(p0.AudioAttributesCompatParcelizer());
                }
                if (i != 5) {
                    throw new RenewEligibleCreator();
                }
                CTInAppAction.Companion companion = CTInAppAction.INSTANCE;
                JSONObject jSONObjectOptJSONObject = p1.optJSONObject(p0.AudioAttributesCompatParcelizer());
                return CTInAppAction.Companion.IconCompatParcelizer(jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONObject("actions") : null);
            } catch (JSONException unused) {
                RendererWakeupListener rendererWakeupListener = this.IconCompatParcelizer;
                StringBuilder sb = new StringBuilder("Received argument with invalid type. Expected type: ");
                sb.append(p0.read());
                sb.append(" for argument: ");
                sb.append(p0.AudioAttributesCompatParcelizer());
                rendererWakeupListener.IconCompatParcelizer("CustomTemplates", sb.toString());
            }
        }
        return null;
    }

    public String toString() {
        String string;
        StringBuilder sb = new StringBuilder("CustomTemplateContext {\ntemplateName = ");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(",\nargs = {\n");
        Map<String, Object> map = this.MediaBrowserCompatCustomActionResultReceiver;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            StringBuilder sb2 = new StringBuilder("\t");
            sb2.append(entry.getKey());
            sb2.append(" = ");
            if (entry.getValue() instanceof CTInAppAction) {
                StringBuilder sb3 = new StringBuilder("Action {");
                Object value = entry.getValue();
                sb3.append(RemoteActionCompatParcelizer(value instanceof CTInAppAction ? (CTInAppAction) value : null));
                sb3.append('}');
                string = sb3.toString();
            } else {
                string = entry.getValue().toString();
            }
            sb2.append(string);
            arrayList.add(sb2.toString());
        }
        sb.append(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(arrayList, ",\n", null, null, 0, null, null, 62));
        sb.append("\n}}");
        return sb.toString();
    }

    private static String RemoteActionCompatParcelizer(CTInAppAction p0) {
        lambdaupdateStateAndInformListeners38 remoteActionCompatParcelizer;
        CustomTemplateInAppData audioAttributesCompatParcelizer;
        String remoteActionCompatParcelizer2;
        return (p0 == null || (audioAttributesCompatParcelizer = p0.getAudioAttributesCompatParcelizer()) == null || (remoteActionCompatParcelizer2 = audioAttributesCompatParcelizer.getRemoteActionCompatParcelizer()) == null) ? (p0 == null || (remoteActionCompatParcelizer = p0.getRemoteActionCompatParcelizer()) == null) ? "" : remoteActionCompatParcelizer.toString() : remoteActionCompatParcelizer2;
    }

    public static final class read extends verifyApplicationThreadAndInitState {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public read(updateStateAndInformListeners updatestateandinformlisteners, CTInAppNotification cTInAppNotification, lambdaupdateStateAndInformListeners54 lambdaupdatestateandinformlisteners54, SimpleBasePlayerExternalSyntheticLambda6 simpleBasePlayerExternalSyntheticLambda6, IconCompatParcelizer iconCompatParcelizer, RendererWakeupListener rendererWakeupListener) {
            super(updatestateandinformlisteners, cTInAppNotification, lambdaupdatestateandinformlisteners54, simpleBasePlayerExternalSyntheticLambda6, iconCompatParcelizer, rendererWakeupListener, null);
            toMagicModuleMetaRepoModel.write(updatestateandinformlisteners, "");
            toMagicModuleMetaRepoModel.write(cTInAppNotification, "");
            toMagicModuleMetaRepoModel.write(lambdaupdatestateandinformlisteners54, "");
            toMagicModuleMetaRepoModel.write(simpleBasePlayerExternalSyntheticLambda6, "");
            toMagicModuleMetaRepoModel.write(rendererWakeupListener, "");
        }
    }

    public static final class write extends verifyApplicationThreadAndInitState {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write(updateStateAndInformListeners updatestateandinformlisteners, CTInAppNotification cTInAppNotification, lambdaupdateStateAndInformListeners54 lambdaupdatestateandinformlisteners54, SimpleBasePlayerExternalSyntheticLambda6 simpleBasePlayerExternalSyntheticLambda6, IconCompatParcelizer iconCompatParcelizer, RendererWakeupListener rendererWakeupListener) {
            super(updatestateandinformlisteners, cTInAppNotification, lambdaupdatestateandinformlisteners54, simpleBasePlayerExternalSyntheticLambda6, iconCompatParcelizer, rendererWakeupListener, null);
            toMagicModuleMetaRepoModel.write(updatestateandinformlisteners, "");
            toMagicModuleMetaRepoModel.write(cTInAppNotification, "");
            toMagicModuleMetaRepoModel.write(lambdaupdatestateandinformlisteners54, "");
            toMagicModuleMetaRepoModel.write(simpleBasePlayerExternalSyntheticLambda6, "");
            toMagicModuleMetaRepoModel.write(rendererWakeupListener, "");
        }
    }

    public final String read(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Object obj = this.MediaBrowserCompatCustomActionResultReceiver.get(p0);
        if (!(obj instanceof String)) {
            obj = null;
        }
        return (String) obj;
    }

    public final Boolean AudioAttributesCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Object obj = this.MediaBrowserCompatCustomActionResultReceiver.get(p0);
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        return (Boolean) obj;
    }

    public /* synthetic */ verifyApplicationThreadAndInitState(updateStateAndInformListeners updatestateandinformlisteners, CTInAppNotification cTInAppNotification, lambdaupdateStateAndInformListeners54 lambdaupdatestateandinformlisteners54, SimpleBasePlayerExternalSyntheticLambda6 simpleBasePlayerExternalSyntheticLambda6, IconCompatParcelizer iconCompatParcelizer, RendererWakeupListener rendererWakeupListener, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(updatestateandinformlisteners, cTInAppNotification, lambdaupdatestateandinformlisteners54, simpleBasePlayerExternalSyntheticLambda6, iconCompatParcelizer, rendererWakeupListener);
    }
}
