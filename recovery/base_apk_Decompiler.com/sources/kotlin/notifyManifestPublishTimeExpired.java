package kotlin;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006À\u0006\u0003"}, d2 = {"Lo/notifyManifestPublishTimeExpired;", "Ljava/io/Serializable;", "Lorg/json/JSONObject;", "p0", "", "fromJSON", "(Lorg/json/JSONObject;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface notifyManifestPublishTimeExpired extends Serializable {
    void fromJSON(JSONObject p0);
}
