package kotlin;

import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\nJ\u0017\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u000b\u001a\u00020\u000f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u0010\u001a\u0004\b\u0007\u0010\u0011R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0016\u0010\r\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u000b\u0010\u0011R\u001a\u0010\u001b\u001a\u00020\u00188\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0011\u0010\u0013\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u001cR\u0011\u0010\u0016\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\r\u0010\u001c"}, d2 = {"Lo/SimpleBasePlayerExternalSyntheticLambda0;", "", "Lorg/json/JSONObject;", "p0", "<init>", "(Lorg/json/JSONObject;)V", "Lo/SimpleBasePlayerExternalSyntheticLambda1;", "write", "(Lorg/json/JSONObject;)Lo/SimpleBasePlayerExternalSyntheticLambda1;", "", "(I)Lo/SimpleBasePlayerExternalSyntheticLambda1;", "AudioAttributesCompatParcelizer", "Lo/SimpleBasePlayerExternalSyntheticLambda16;", "RemoteActionCompatParcelizer", "(I)Lo/SimpleBasePlayerExternalSyntheticLambda16;", "", "Ljava/lang/String;", "()Ljava/lang/String;", "Lorg/json/JSONArray;", "AudioAttributesImplApi21Parcelizer", "Lorg/json/JSONArray;", "IconCompatParcelizer", "AudioAttributesImplBaseParcelizer", "read", "", "Z", "()Z", "MediaBrowserCompatItemReceiver", "()I", "MediaBrowserCompatCustomActionResultReceiver"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SimpleBasePlayerExternalSyntheticLambda0 {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final JSONArray RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final JSONArray IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final String read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final boolean MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final String AudioAttributesCompatParcelizer;
    private final JSONArray write;

    public SimpleBasePlayerExternalSyntheticLambda0(JSONObject jSONObject) {
        toMagicModuleMetaRepoModel.write(jSONObject, "");
        String strOptString = jSONObject.optString("eventName", "");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strOptString, "");
        this.AudioAttributesCompatParcelizer = strOptString;
        this.IconCompatParcelizer = jSONObject.optJSONArray("eventProperties");
        this.write = jSONObject.optJSONArray("itemProperties");
        this.RemoteActionCompatParcelizer = jSONObject.optJSONArray("geoRadius");
        this.read = jSONObject.optString("profileAttrName", null);
        this.MediaBrowserCompatItemReceiver = jSONObject.optBoolean("firstTimeOnly", false);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final boolean getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final int AudioAttributesImplBaseParcelizer() {
        JSONArray jSONArray = this.IconCompatParcelizer;
        if (jSONArray != null) {
            return jSONArray.length();
        }
        return 0;
    }

    public final int read() {
        JSONArray jSONArray = this.write;
        if (jSONArray != null) {
            return jSONArray.length();
        }
        return 0;
    }

    public final int RemoteActionCompatParcelizer() {
        JSONArray jSONArray = this.RemoteActionCompatParcelizer;
        if (jSONArray != null) {
            return jSONArray.length();
        }
        return 0;
    }

    private static SimpleBasePlayerExternalSyntheticLambda1 write(JSONObject p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        SimpleBasePlayerExternalSyntheticLambda13 simpleBasePlayerExternalSyntheticLambda13 = new SimpleBasePlayerExternalSyntheticLambda13(p0.opt("propertyValue"), null, 2, null);
        SimpleBasePlayerExternalSyntheticLambda12 simpleBasePlayerExternalSyntheticLambda12Write = SimpleBasePlayerExternalSyntheticLambda11.write(p0, "operator");
        String strOptString = p0.optString("propertyName", "");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strOptString, "");
        return new SimpleBasePlayerExternalSyntheticLambda1(strOptString, simpleBasePlayerExternalSyntheticLambda12Write, simpleBasePlayerExternalSyntheticLambda13);
    }

    public final SimpleBasePlayerExternalSyntheticLambda1 write(int p0) {
        JSONArray jSONArray;
        JSONObject jSONObjectOptJSONObject;
        if (PlayerPlaybackSuppressionReason.IconCompatParcelizer(this.IconCompatParcelizer, p0) || (jSONArray = this.IconCompatParcelizer) == null || (jSONObjectOptJSONObject = jSONArray.optJSONObject(p0)) == null) {
            return null;
        }
        return write(jSONObjectOptJSONObject);
    }

    public final SimpleBasePlayerExternalSyntheticLambda1 AudioAttributesCompatParcelizer(int p0) {
        JSONArray jSONArray;
        JSONObject jSONObjectOptJSONObject;
        if (PlayerPlaybackSuppressionReason.IconCompatParcelizer(this.write, p0) || (jSONArray = this.write) == null || (jSONObjectOptJSONObject = jSONArray.optJSONObject(p0)) == null) {
            return null;
        }
        return write(jSONObjectOptJSONObject);
    }

    public final SimpleBasePlayerExternalSyntheticLambda16 RemoteActionCompatParcelizer(int p0) {
        JSONArray jSONArray;
        JSONObject jSONObjectOptJSONObject;
        if (PlayerPlaybackSuppressionReason.IconCompatParcelizer(this.RemoteActionCompatParcelizer, p0) || (jSONArray = this.RemoteActionCompatParcelizer) == null || (jSONObjectOptJSONObject = jSONArray.optJSONObject(p0)) == null) {
            return null;
        }
        return new SimpleBasePlayerExternalSyntheticLambda16(jSONObjectOptJSONObject.optDouble("lat"), jSONObjectOptJSONObject.optDouble("lng"), jSONObjectOptJSONObject.optDouble("rad"));
    }
}
