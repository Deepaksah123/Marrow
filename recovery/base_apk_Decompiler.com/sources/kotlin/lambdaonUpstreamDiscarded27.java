package kotlin;

import android.os.Bundle;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda68;
import kotlin.Metadata;
import org.apache.commons.compress.utils.CharsetNames;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\u0018\u0000 !2\u00020\u0001:\u0002!\u001aBG\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB+\b\u0012\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\t\u0012\u0006\u0010\u0006\u001a\u00020\t\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J=\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0012J%\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001fR\u0014\u0010!\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010 R\u0011\u0010\u0016\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0014R\u001a\u0010\u001a\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010 \u001a\u0004\b\"\u0010\u0014R\u001a\u0010%\u001a\u00020\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\u0016\u0010$R\u001a\u0010'\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b!\u0010\u0012"}, d2 = {"Lo/lambdaonUpstreamDiscarded27;", "Ljava/io/Serializable;", "", "p0", "p1", "", "p2", "Landroid/os/Bundle;", "p3", "", "p4", "p5", "Ljava/util/UUID;", "p6", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;ZZLjava/util/UUID;)V", "(Ljava/lang/String;ZZLjava/lang/String;)V", "MediaBrowserCompatCustomActionResultReceiver", "()Ljava/lang/String;", "read", "()Z", "Lorg/json/JSONObject;", "write", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Landroid/os/Bundle;Ljava/util/UUID;)Lorg/json/JSONObject;", "toString", "", "AudioAttributesCompatParcelizer", "(Landroid/os/Bundle;)Ljava/util/Map;", "", "writeReplace", "()Ljava/lang/Object;", "Ljava/lang/String;", "Z", "IconCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "Lorg/json/JSONObject;", "()Lorg/json/JSONObject;", "RemoteActionCompatParcelizer", "MediaBrowserCompatItemReceiver", "AudioAttributesImplApi26Parcelizer"}, k = 1, mv = {1, 4, 0})
public final class lambdaonUpstreamDiscarded27 implements Serializable {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final HashSet<String> RemoteActionCompatParcelizer = new HashSet<>();

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final String read;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final JSONObject RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final String AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final boolean AudioAttributesCompatParcelizer;

    public /* synthetic */ lambdaonUpstreamDiscarded27(String str, boolean z, boolean z2, String str2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, z, z2, str2);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final JSONObject getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final boolean getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public lambdaonUpstreamDiscarded27(String str, String str2, Double d, Bundle bundle, boolean z, boolean z2, UUID uuid) throws JSONException, lambdaonMetadata50 {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.AudioAttributesCompatParcelizer = z;
        this.IconCompatParcelizer = z2;
        this.AudioAttributesImplApi26Parcelizer = str2;
        this.RemoteActionCompatParcelizer = write(str, str2, d, bundle, uuid);
        this.read = MediaBrowserCompatCustomActionResultReceiver();
    }

    private lambdaonUpstreamDiscarded27(String str, boolean z, boolean z2, String str2) {
        JSONObject jSONObject = new JSONObject(str);
        this.RemoteActionCompatParcelizer = jSONObject;
        this.AudioAttributesCompatParcelizer = z;
        String strOptString = jSONObject.optString("_eventName");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strOptString, "");
        this.AudioAttributesImplApi26Parcelizer = strOptString;
        this.read = str2;
        this.IconCompatParcelizer = z2;
    }

    public final boolean read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean AudioAttributesCompatParcelizer() {
        if (this.read == null) {
            return true;
        }
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) MediaBrowserCompatCustomActionResultReceiver(), (Object) this.read);
    }

    private final JSONObject write(String p0, String p1, Double p2, Bundle p3, UUID p4) throws JSONException {
        Companion.IconCompatParcelizer(p1);
        JSONObject jSONObject = new JSONObject();
        String strIconCompatParcelizer = DefaultAnalyticsCollectorExternalSyntheticLambda47.IconCompatParcelizer(p1);
        jSONObject.put("_eventName", strIconCompatParcelizer);
        jSONObject.put("_eventName_md5", Companion.write(strIconCompatParcelizer));
        jSONObject.put("_logTime", System.currentTimeMillis() / 1000);
        jSONObject.put("_ui", p0);
        if (p4 != null) {
            jSONObject.put("_session_id", p4);
        }
        if (p3 != null) {
            Map<String, String> mapAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(p3);
            for (String str : mapAudioAttributesCompatParcelizer.keySet()) {
                jSONObject.put(str, mapAudioAttributesCompatParcelizer.get(str));
            }
        }
        if (p2 != null) {
            jSONObject.put("_valueToSum", p2.doubleValue());
        }
        if (this.IconCompatParcelizer) {
            jSONObject.put("_inBackground", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        }
        if (this.AudioAttributesCompatParcelizer) {
            jSONObject.put("_implicitlyLogged", IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            return jSONObject;
        }
        DefaultAnalyticsCollectorExternalSyntheticLambda68.read readVar = DefaultAnalyticsCollectorExternalSyntheticLambda68.read;
        lambdaonPositionDiscontinuity43 lambdaonpositiondiscontinuity43 = lambdaonPositionDiscontinuity43.APP_EVENTS;
        String string = jSONObject.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        readVar.RemoteActionCompatParcelizer(lambdaonpositiondiscontinuity43, "AppEvents", "Created app event '%s'", string);
        return jSONObject;
    }

    private final Map<String, String> AudioAttributesCompatParcelizer(Bundle p0) {
        HashMap map = new HashMap();
        for (String str : p0.keySet()) {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
            Companion.IconCompatParcelizer(str);
            Object obj = p0.get(str);
            if (!(obj instanceof String) && !(obj instanceof Number)) {
                toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
                String str2 = String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{obj, str}, 2));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
                throw new lambdaonMetadata50(str2);
            }
            map.put(str, obj.toString());
        }
        DefaultAnalyticsCollectorExternalSyntheticLambda27.AudioAttributesCompatParcelizer(map);
        DefaultAnalyticsCollectorExternalSyntheticLambda47.write(map, this.AudioAttributesImplApi26Parcelizer);
        DefaultAnalyticsCollectorExternalSyntheticLambda20.RemoteActionCompatParcelizer(map, this.AudioAttributesImplApi26Parcelizer);
        return map;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\t\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000e"}, d2 = {"Lo/lambdaonUpstreamDiscarded27$AudioAttributesCompatParcelizer;", "Ljava/io/Serializable;", "", "p0", "", "p1", "p2", "p3", "<init>", "(Ljava/lang/String;ZZLjava/lang/String;)V", "", "readResolve", "()Ljava/lang/Object;", "write", "Ljava/lang/String;", "read", "RemoteActionCompatParcelizer", "Z", "AudioAttributesCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {1, 4, 0})
    public static final class AudioAttributesCompatParcelizer implements Serializable {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final String write;
        private final boolean RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final boolean AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: write, reason: from kotlin metadata */
        private final String read;

        public AudioAttributesCompatParcelizer(String str, boolean z, boolean z2, String str2) {
            toMagicModuleMetaRepoModel.write(str, "");
            this.write = str;
            this.AudioAttributesCompatParcelizer = z;
            this.RemoteActionCompatParcelizer = z2;
            this.read = str2;
        }

        private final Object readResolve() throws ObjectStreamException, JSONException {
            return new lambdaonUpstreamDiscarded27(this.write, this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, this.read, null);
        }
    }

    private final Object writeReplace() throws ObjectStreamException {
        String string = this.RemoteActionCompatParcelizer.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return new AudioAttributesCompatParcelizer(string, this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, this.read);
    }

    public final String toString() {
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        String strOptString = this.RemoteActionCompatParcelizer.optString("_eventName");
        boolean z = this.AudioAttributesCompatParcelizer;
        String str = String.format("\"%s\", implicit: %b, json: %s", Arrays.copyOf(new Object[]{strOptString, Boolean.valueOf(z), this.RemoteActionCompatParcelizer.toString()}, 3));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        return str;
    }

    private final String MediaBrowserCompatCustomActionResultReceiver() {
        String string = this.RemoteActionCompatParcelizer.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return Companion.write(string);
    }

    /* JADX INFO: renamed from: o.lambdaonUpstreamDiscarded27$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\tH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/facebook/appevents/AppEvent$Companion;", "", "()V", "MAX_IDENTIFIER_LENGTH", "", "serialVersionUID", "", "validatedIdentifiers", "Ljava/util/HashSet;", "", "Lkotlin/collections/HashSet;", "md5Checksum", "toHash", "validateIdentifier", "", "identifier", "facebook-core_release"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static void IconCompatParcelizer(String str) {
            boolean zContains;
            if (str != null) {
                String str2 = str;
                if (str2.length() != 0 && str.length() <= 40) {
                    synchronized (lambdaonUpstreamDiscarded27.RemoteActionCompatParcelizer) {
                        zContains = lambdaonUpstreamDiscarded27.RemoteActionCompatParcelizer.contains(str);
                        getShowPopup getshowpopup = getShowPopup.INSTANCE;
                    }
                    if (zContains) {
                        return;
                    }
                    if (new newYearNameItem("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").write(str2)) {
                        synchronized (lambdaonUpstreamDiscarded27.RemoteActionCompatParcelizer) {
                            lambdaonUpstreamDiscarded27.RemoteActionCompatParcelizer.add(str);
                        }
                        return;
                    } else {
                        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
                        String str3 = String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", Arrays.copyOf(new Object[]{str}, 1));
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
                        throw new lambdaonMetadata50(str3);
                    }
                }
            }
            if (str == null) {
                str = "<None Provided>";
            }
            toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
            String str4 = String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[]{str, 40}, 2));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str4, "");
            throw new lambdaonMetadata50(str4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String write(String str) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("MD5");
                Charset charsetForName = Charset.forName(CharsetNames.UTF_8);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(charsetForName, "");
                if (str == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                byte[] bytes = str.getBytes(charsetForName);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bytes, "");
                messageDigest.update(bytes, 0, bytes.length);
                byte[] bArrDigest = messageDigest.digest();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(bArrDigest, "");
                return DefaultAnalyticsCollectorExternalSyntheticLambda29.RemoteActionCompatParcelizer(bArrDigest);
            } catch (UnsupportedEncodingException e) {
                DefaultAnalyticsCollectorMediaPeriodQueueTracker.IconCompatParcelizer("Failed to generate checksum: ", e);
                return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE;
            } catch (NoSuchAlgorithmException e2) {
                DefaultAnalyticsCollectorMediaPeriodQueueTracker.IconCompatParcelizer("Failed to generate checksum: ", e2);
                return SessionDescription.SUPPORTED_SDP_VERSION;
            }
        }
    }
}
