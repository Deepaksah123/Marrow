package in.juspay.services;

import com.marrow.data.models.video.VideoPlaybackConfiguration;
import in.juspay.hypersdk.core.Constants;
import kotlin.Metadata;
import kotlin.getShowPopup;
import org.json.JSONObject;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'GLOBAL' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:293)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:266)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B#\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00058\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010j\u0002\b\u0013j\u0002\b\u0014"}, d2 = {"Lin/juspay/services/TenantMap;", "", "", "p0", "p1", "Lorg/json/JSONObject;", "p2", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V", "logsEndPoints", "Lorg/json/JSONObject;", "getLogsEndPoints", "()Lorg/json/JSONObject;", "releaseConfigTemplateUrl", "Ljava/lang/String;", "getReleaseConfigTemplateUrl", "()Ljava/lang/String;", "tenant", "getTenant", "GLOBAL", VideoPlaybackConfiguration.WIDEVINE_LVL_DEFAULT}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TenantMap {
    private static final /* synthetic */ TenantMap[] $VALUES;
    public static final TenantMap DEFAULT;
    public static final TenantMap GLOBAL;
    private final JSONObject logsEndPoints;
    private final String releaseConfigTemplateUrl;
    private final String tenant;

    static {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("sandboxLogUrl", "https://debug.logs.juspay.net/godel/analytics");
        jSONObject.put("prodLogUrl", "https://logs.juspay.io/godel/analytics");
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        GLOBAL = new TenantMap("GLOBAL", 0, "juspayglobal", "https://payments.%sjuspay.io/hyper/bundles/in.juspay.merchants/%s/android/%s/release-config.json?toss=%s", jSONObject);
        DEFAULT = new TenantMap(VideoPlaybackConfiguration.WIDEVINE_LVL_DEFAULT, 1, "juspay", Constants.RELEASE_CONFIG_TEMPLATE_URL, null);
        $VALUES = $values();
    }

    private TenantMap(String str, int i, String str2, String str3, JSONObject jSONObject) {
        this.tenant = str2;
        this.releaseConfigTemplateUrl = str3;
        this.logsEndPoints = jSONObject;
    }

    public final JSONObject getLogsEndPoints() {
        return this.logsEndPoints;
    }

    public final String getReleaseConfigTemplateUrl() {
        return this.releaseConfigTemplateUrl;
    }

    public final String getTenant() {
        return this.tenant;
    }

    private static final /* synthetic */ TenantMap[] $values() {
        return new TenantMap[]{GLOBAL, DEFAULT};
    }

    public static TenantMap valueOf(String str) {
        return (TenantMap) Enum.valueOf(TenantMap.class, str);
    }

    public static TenantMap[] values() {
        return (TenantMap[]) $VALUES.clone();
    }
}
