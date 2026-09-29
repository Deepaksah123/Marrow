package kotlin;

import java.security.SecureRandom;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
final class WoqMarrowthon {
    private long AudioAttributesCompatParcelizer;
    private long IconCompatParcelizer;
    private long RemoteActionCompatParcelizer;
    private final SecureRandom read;
    private String write;

    WoqMarrowthon() {
        AudioAttributesCompatParcelizer();
        this.read = new SecureRandom();
    }

    protected final void AudioAttributesCompatParcelizer() {
        this.RemoteActionCompatParcelizer = 0L;
        this.AudioAttributesCompatParcelizer = 0L;
        this.write = Long.toHexString(new SecureRandom().nextLong());
        this.IconCompatParcelizer = System.currentTimeMillis() / 1000;
    }

    public final JSONObject write() {
        return AudioAttributesCompatParcelizer(true);
    }

    public final JSONObject RemoteActionCompatParcelizer() {
        return AudioAttributesCompatParcelizer(false);
    }

    private JSONObject AudioAttributesCompatParcelizer(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("$mp_event_id", Long.toHexString(this.read.nextLong()));
            jSONObject.put("$mp_session_id", this.write);
            jSONObject.put("$mp_session_seq_id", z ? this.RemoteActionCompatParcelizer : this.AudioAttributesCompatParcelizer);
            jSONObject.put("$mp_session_start_sec", this.IconCompatParcelizer);
        } catch (JSONException unused) {
        }
        if (z) {
            this.RemoteActionCompatParcelizer++;
            return jSONObject;
        }
        this.AudioAttributesCompatParcelizer++;
        return jSONObject;
    }
}
