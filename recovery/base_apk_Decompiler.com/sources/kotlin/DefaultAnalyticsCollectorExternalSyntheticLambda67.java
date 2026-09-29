package kotlin;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\fR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda67;", "", "<init>", "()V", "", "p0", "Lorg/json/JSONObject;", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;)Lorg/json/JSONObject;", "p1", "", "IconCompatParcelizer", "(Ljava/lang/String;Lorg/json/JSONObject;)V", "Ljava/util/concurrent/ConcurrentHashMap;", "read", "Ljava/util/concurrent/ConcurrentHashMap;"}, k = 1, mv = {1, 4, 0})
public final class DefaultAnalyticsCollectorExternalSyntheticLambda67 {
    public static final DefaultAnalyticsCollectorExternalSyntheticLambda67 INSTANCE = new DefaultAnalyticsCollectorExternalSyntheticLambda67();

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private static final ConcurrentHashMap<String, JSONObject> IconCompatParcelizer = new ConcurrentHashMap<>();

    private DefaultAnalyticsCollectorExternalSyntheticLambda67() {
    }

    @getMagicModuleMeta
    public static final JSONObject AudioAttributesCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return IconCompatParcelizer.get(p0);
    }

    @getMagicModuleMeta
    public static final void IconCompatParcelizer(String p0, JSONObject p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        IconCompatParcelizer.put(p0, p1);
    }
}
