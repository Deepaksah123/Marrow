package kotlin;

import kotlin.Metadata;
import kotlin.getPeriodIndexFromWindowPosition;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0013J\r\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0015J\r\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\r\u001a\u00020\u0011¢\u0006\u0004\b\r\u0010\u0016J\r\u0010\u000f\u001a\u00020\u0011¢\u0006\u0004\b\u000f\u0010\u0016J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0014\u0010\u0018J\r\u0010\u0010\u001a\u00020\f¢\u0006\u0004\b\u0010\u0010\u0015J\u001f\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\r\u0010\u0019R\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001aR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u001bR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u001cR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR(\u0010\u0014\u001a\u0004\u0018\u00010\u00172\b\u0010\u0003\u001a\u0004\u0018\u00010\u00178\u0006@GX\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u0010\u001e\"\u0004\b\u000f\u0010\u001f"}, d2 = {"Lo/access6500;", "Lo/setMaxSeekToPreviousPositionMs;", "Lo/containsType;", "p0", "Lo/getPeriodIndexFromWindowPosition;", "p1", "<init>", "(Lo/containsType;Lo/getPeriodIndexFromWindowPosition;)V", "", "MediaBrowserCompatCustomActionResultReceiver", "()V", "AudioAttributesImplBaseParcelizer", "Lorg/json/JSONArray;", "write", "(Lorg/json/JSONArray;)V", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "Lorg/json/JSONObject;", "read", "(Lorg/json/JSONObject;)V", "RemoteActionCompatParcelizer", "()Lorg/json/JSONArray;", "()Lorg/json/JSONObject;", "", "(Ljava/lang/String;)Lorg/json/JSONObject;", "(Ljava/lang/String;Ljava/lang/String;)V", "Lo/containsType;", "Lo/getPeriodIndexFromWindowPosition;", "Lorg/json/JSONArray;", "MediaBrowserCompatItemReceiver", "Ljava/lang/String;", "(Ljava/lang/String;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class access6500 implements setMaxSeekToPreviousPositionMs {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private JSONArray write;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private JSONArray read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final containsType IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final getPeriodIndexFromWindowPosition AudioAttributesCompatParcelizer;

    public access6500(containsType containstype, getPeriodIndexFromWindowPosition getperiodindexfromwindowposition) {
        toMagicModuleMetaRepoModel.write(containstype, "");
        toMagicModuleMetaRepoModel.write(getperiodindexfromwindowposition, "");
        this.IconCompatParcelizer = containstype;
        this.AudioAttributesCompatParcelizer = getperiodindexfromwindowposition;
    }

    public final void AudioAttributesCompatParcelizer(String str) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) str)) {
            return;
        }
        this.RemoteActionCompatParcelizer = str;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode == -1437347487) {
                if (str.equals("NO_MODE")) {
                    AudioAttributesImplBaseParcelizer();
                    MediaBrowserCompatCustomActionResultReceiver();
                    return;
                }
                return;
            }
            if (iHashCode == 2160) {
                if (str.equals("CS")) {
                    AudioAttributesImplBaseParcelizer();
                }
            } else if (iHashCode == 2656 && str.equals("SS")) {
                MediaBrowserCompatCustomActionResultReceiver();
            }
        }
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer("inapp_notifs_cs");
        this.write = null;
    }

    private final void AudioAttributesImplBaseParcelizer() {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer("inapp_notifs_ss");
    }

    public final void write(JSONArray p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.write = p0;
        getPeriodIndexFromWindowPosition getperiodindexfromwindowposition = this.AudioAttributesCompatParcelizer;
        String string = p0.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String strRemoteActionCompatParcelizer = getperiodindexfromwindowposition.RemoteActionCompatParcelizer(string, getPeriodIndexFromWindowPosition.AudioAttributesCompatParcelizer.read);
        if (strRemoteActionCompatParcelizer != null) {
            this.IconCompatParcelizer.AudioAttributesCompatParcelizer("inapp_notifs_cs", strRemoteActionCompatParcelizer);
        }
    }

    public final void AudioAttributesCompatParcelizer(JSONArray p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        containsType containstype = this.IconCompatParcelizer;
        String string = p0.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        containstype.AudioAttributesCompatParcelizer("inapp_notifs_ss", string);
    }

    public final void IconCompatParcelizer(JSONArray p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.read = p0;
        getPeriodIndexFromWindowPosition getperiodindexfromwindowposition = this.AudioAttributesCompatParcelizer;
        String string = p0.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        String strRemoteActionCompatParcelizer = getperiodindexfromwindowposition.RemoteActionCompatParcelizer(string, getPeriodIndexFromWindowPosition.AudioAttributesCompatParcelizer.read);
        if (strRemoteActionCompatParcelizer != null) {
            this.IconCompatParcelizer.AudioAttributesCompatParcelizer("inApp", strRemoteActionCompatParcelizer);
        }
    }

    public final void read(JSONObject p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        containsType containstype = this.IconCompatParcelizer;
        String string = p0.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        containstype.AudioAttributesCompatParcelizer("evaluated_ss", string);
    }

    public final void RemoteActionCompatParcelizer(JSONObject p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        containsType containstype = this.IconCompatParcelizer;
        String string = p0.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        containstype.AudioAttributesCompatParcelizer("suppressed_ss", string);
    }

    public final JSONArray read() {
        JSONArray jSONArray;
        JSONArray jSONArray2 = this.write;
        if (jSONArray2 != null) {
            toMagicModuleMetaRepoModel.read(jSONArray2, "");
            return jSONArray2;
        }
        String strWrite = this.IconCompatParcelizer.write("inapp_notifs_cs", "");
        String str = strWrite;
        if (str == null || TestGroupLSModel.IconCompatParcelizer((CharSequence) str)) {
            jSONArray = new JSONArray();
        } else {
            try {
                jSONArray = new JSONArray(this.AudioAttributesCompatParcelizer.write(strWrite, getPeriodIndexFromWindowPosition.AudioAttributesCompatParcelizer.read));
            } catch (Exception unused) {
                jSONArray = new JSONArray();
            }
        }
        this.write = jSONArray;
        toMagicModuleMetaRepoModel.read(jSONArray, "");
        return jSONArray;
    }

    public final JSONArray RemoteActionCompatParcelizer() {
        String strWrite = this.IconCompatParcelizer.write("inapp_notifs_ss", "");
        String str = strWrite;
        if (str == null || TestGroupLSModel.IconCompatParcelizer((CharSequence) str)) {
            return new JSONArray();
        }
        return new JSONArray(strWrite);
    }

    public final JSONObject write() {
        String strWrite = this.IconCompatParcelizer.write("evaluated_ss", "");
        String str = strWrite;
        if (str == null || TestGroupLSModel.IconCompatParcelizer((CharSequence) str)) {
            return new JSONObject();
        }
        try {
            return new JSONObject(strWrite);
        } catch (JSONException unused) {
            return RemoteActionCompatParcelizer(strWrite);
        }
    }

    public final JSONObject AudioAttributesCompatParcelizer() {
        String strWrite = this.IconCompatParcelizer.write("suppressed_ss", "");
        String str = strWrite;
        if (str == null || TestGroupLSModel.IconCompatParcelizer((CharSequence) str)) {
            return new JSONObject();
        }
        try {
            return new JSONObject(strWrite);
        } catch (JSONException unused) {
            return RemoteActionCompatParcelizer(strWrite);
        }
    }

    private static JSONObject RemoteActionCompatParcelizer(String p0) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("raised", new JSONArray(p0));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jSONObjectPut, "");
        return jSONObjectPut;
    }

    public final JSONArray IconCompatParcelizer() {
        JSONArray jSONArray;
        JSONArray jSONArray2 = this.read;
        if (jSONArray2 != null) {
            toMagicModuleMetaRepoModel.read(jSONArray2, "");
            return jSONArray2;
        }
        String strWrite = this.IconCompatParcelizer.write("inApp", "");
        String str = strWrite;
        if (str == null || TestGroupLSModel.IconCompatParcelizer((CharSequence) str)) {
            jSONArray = new JSONArray();
        } else {
            try {
                jSONArray = new JSONArray(this.AudioAttributesCompatParcelizer.write(strWrite, getPeriodIndexFromWindowPosition.AudioAttributesCompatParcelizer.read));
            } catch (Exception unused) {
                jSONArray = new JSONArray();
            }
        }
        this.read = jSONArray;
        toMagicModuleMetaRepoModel.read(jSONArray, "");
        return jSONArray;
    }

    @Override // kotlin.setMaxSeekToPreviousPositionMs
    public final void write(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        RendererCapabilitiesDecoderSupport.read.write();
        this.IconCompatParcelizer.IconCompatParcelizer(RendererCapabilitiesDecoderSupport.RemoteActionCompatParcelizer(1, p0, p1));
    }
}
