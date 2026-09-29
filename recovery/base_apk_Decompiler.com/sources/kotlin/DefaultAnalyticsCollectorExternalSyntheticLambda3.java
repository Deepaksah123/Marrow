package kotlin;

import android.content.Context;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda3;", "", "<init>", "()V", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda3$RemoteActionCompatParcelizer;", "p0", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda51;", "p1", "", "p2", "", "p3", "Landroid/content/Context;", "p4", "Lorg/json/JSONObject;", "read", "(Lo/DefaultAnalyticsCollectorExternalSyntheticLambda3$RemoteActionCompatParcelizer;Lo/DefaultAnalyticsCollectorExternalSyntheticLambda51;Ljava/lang/String;ZLandroid/content/Context;)Lorg/json/JSONObject;", "", "write", "Ljava/util/Map;", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {1, 4, 0})
public final class DefaultAnalyticsCollectorExternalSyntheticLambda3 {
    public static final DefaultAnalyticsCollectorExternalSyntheticLambda3 INSTANCE = new DefaultAnalyticsCollectorExternalSyntheticLambda3();

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private static final Map<RemoteActionCompatParcelizer, String> AudioAttributesCompatParcelizer = VideoTimelineResponseBody.AudioAttributesCompatParcelizer(setAction.write(RemoteActionCompatParcelizer.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL"), setAction.write(RemoteActionCompatParcelizer.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS"));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda3$RemoteActionCompatParcelizer;", "", "<init>", "(Ljava/lang/String;I)V", "IconCompatParcelizer", "write"}, k = 1, mv = {1, 4, 0})
    public enum RemoteActionCompatParcelizer {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS
    }

    private DefaultAnalyticsCollectorExternalSyntheticLambda3() {
    }

    @getMagicModuleMeta
    public static final JSONObject read(RemoteActionCompatParcelizer p0, DefaultAnalyticsCollectorExternalSyntheticLambda51 p1, String p2, boolean p3, Context p4) throws JSONException {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p4, "");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", AudioAttributesCompatParcelizer.get(p0));
        String strAudioAttributesCompatParcelizer = lambdaonVideoDisabled18.AudioAttributesCompatParcelizer();
        if (strAudioAttributesCompatParcelizer != null) {
            jSONObject.put("app_user_id", strAudioAttributesCompatParcelizer);
        }
        DefaultAnalyticsCollectorMediaPeriodQueueTracker.write(jSONObject, p1, p2, p3);
        try {
            DefaultAnalyticsCollectorMediaPeriodQueueTracker.read(jSONObject, p4);
        } catch (Exception e) {
            DefaultAnalyticsCollectorExternalSyntheticLambda68.read.RemoteActionCompatParcelizer(lambdaonPositionDiscontinuity43.APP_EVENTS, "AppEvents", "Fetching extended device info parameters failed: '%s'", e.toString());
        }
        JSONObject jSONObject2 = DefaultAnalyticsCollectorMediaPeriodQueueTracker.read();
        if (jSONObject2 != null) {
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject.put(next, jSONObject2.get(next));
            }
        }
        jSONObject.put("application_package_name", p4.getPackageName());
        return jSONObject;
    }
}
