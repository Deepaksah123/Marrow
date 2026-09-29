package kotlin;

import com.marrow.data.api.models.response.payment.PaymentStatusResponseKt;
import in.juspay.hypersdk.core.PaymentConstants;
import java.io.File;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0013\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\f\u001a\u00020\b¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0012\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0011\u0010\t\u001a\u00020\u00138G¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\f\u001a\u0004\u0018\u00010\u00168G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0017R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0019"}, d2 = {"Lo/clearCurrentSession;", "", "", "p0", "<init>", "(Ljava/lang/String;)V", "Ljava/io/File;", "(Ljava/io/File;)V", "", "IconCompatParcelizer", "()V", "", "write", "(Lo/clearCurrentSession;)I", "toString", "()Ljava/lang/String;", "RemoteActionCompatParcelizer", "Ljava/lang/String;", "read", "", "AudioAttributesCompatParcelizer", "()Z", "Lorg/json/JSONObject;", "()Lorg/json/JSONObject;", "", "Ljava/lang/Long;"}, k = 1, mv = {1, 4, 0})
public final class clearCurrentSession {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private String read;
    private String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private Long AudioAttributesCompatParcelizer;

    public clearCurrentSession(String str) {
        this.AudioAttributesCompatParcelizer = Long.valueOf(System.currentTimeMillis() / 1000);
        this.RemoteActionCompatParcelizer = str;
        StringBuffer stringBuffer = new StringBuffer("error_log_");
        Long l = this.AudioAttributesCompatParcelizer;
        if (l == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
        }
        String string = stringBuffer.append(l.longValue()).append(".json").toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        this.read = string;
    }

    public clearCurrentSession(File file) {
        toMagicModuleMetaRepoModel.write(file, "");
        String name = file.getName();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(name, "");
        this.read = name;
        JSONObject jSONObjectAudioAttributesCompatParcelizer = getReadingMediaPeriod.AudioAttributesCompatParcelizer(name);
        if (jSONObjectAudioAttributesCompatParcelizer != null) {
            this.AudioAttributesCompatParcelizer = Long.valueOf(jSONObjectAudioAttributesCompatParcelizer.optLong(PaymentConstants.TIMESTAMP, 0L));
            this.RemoteActionCompatParcelizer = jSONObjectAudioAttributesCompatParcelizer.optString(PaymentStatusResponseKt.KEY_ERROR_MESSAGE, null);
        }
    }

    public final int write(clearCurrentSession p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Long l = this.AudioAttributesCompatParcelizer;
        if (l == null) {
            return -1;
        }
        long jLongValue = l.longValue();
        Long l2 = p0.AudioAttributesCompatParcelizer;
        if (l2 != null) {
            return (l2.longValue() > jLongValue ? 1 : (l2.longValue() == jLongValue ? 0 : -1));
        }
        return 1;
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return (this.RemoteActionCompatParcelizer == null || this.AudioAttributesCompatParcelizer == null) ? false : true;
    }

    public final void write() {
        if (AudioAttributesCompatParcelizer()) {
            getReadingMediaPeriod.AudioAttributesCompatParcelizer(this.read, toString());
        }
    }

    public final void IconCompatParcelizer() {
        getReadingMediaPeriod.write(this.read);
    }

    public final String toString() {
        JSONObject jSONObjectRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (jSONObjectRemoteActionCompatParcelizer == null) {
            return super.toString();
        }
        String string = jSONObjectRemoteActionCompatParcelizer.toString();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    private JSONObject RemoteActionCompatParcelizer() {
        JSONObject jSONObject = new JSONObject();
        try {
            Long l = this.AudioAttributesCompatParcelizer;
            if (l != null) {
                jSONObject.put(PaymentConstants.TIMESTAMP, l.longValue());
            }
            jSONObject.put(PaymentStatusResponseKt.KEY_ERROR_MESSAGE, this.RemoteActionCompatParcelizer);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }
}
