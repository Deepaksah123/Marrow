package kotlin;

import com.facebook.FacebookRequestError;
import com.google.android.gms.wallet.WalletConstants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0081\u0001\b\u0000\u0012\u001c\u0010\u0005\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0004\u0018\u00010\u0002\u0012\u001c\u0010\u0006\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0004\u0018\u00010\u0002\u0012\u001c\u0010\u0007\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013R'\u0010\u0015\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0012\u0010\u0014R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R'\u0010\u0016\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014R\u0016\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R'\u0010\u0012\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0004\u0018\u00010\u00028\u0006¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0017"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda55;", "", "", "", "", "p0", "p1", "p2", "", "p3", "p4", "p5", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "Lcom/facebook/FacebookRequestError$read;", "IconCompatParcelizer", "(IIZ)Lcom/facebook/FacebookRequestError$read;", "AudioAttributesCompatParcelizer", "(Lcom/facebook/FacebookRequestError$read;)Ljava/lang/String;", "Ljava/util/Map;", "RemoteActionCompatParcelizer", "write", "Ljava/lang/String;", "read", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatItemReceiver"}, k = 1, mv = {1, 4, 0})
public final class DefaultAnalyticsCollectorExternalSyntheticLambda55 {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static DefaultAnalyticsCollectorExternalSyntheticLambda55 read;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final Map<Integer, Set<Integer>> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final Map<Integer, Set<Integer>> AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final Map<Integer, Set<Integer>> write;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final String IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final String MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final String read;

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultAnalyticsCollectorExternalSyntheticLambda55(Map<Integer, ? extends Set<Integer>> map, Map<Integer, ? extends Set<Integer>> map2, Map<Integer, ? extends Set<Integer>> map3, String str, String str2, String str3) {
        this.write = map;
        this.AudioAttributesCompatParcelizer = map2;
        this.RemoteActionCompatParcelizer = map3;
        this.IconCompatParcelizer = str;
        this.MediaBrowserCompatCustomActionResultReceiver = str2;
        this.read = str3;
    }

    public final String AudioAttributesCompatParcelizer(FacebookRequestError.read p0) {
        if (p0 == null) {
            return null;
        }
        int i = DefaultAnalyticsCollectorExternalSyntheticLambda56.RemoteActionCompatParcelizer[p0.ordinal()];
        if (i == 1) {
            return this.IconCompatParcelizer;
        }
        if (i == 2) {
            return this.read;
        }
        if (i != 3) {
            return null;
        }
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final FacebookRequestError.read IconCompatParcelizer(int p0, int p1, boolean p2) {
        Set<Integer> set;
        Set<Integer> set2;
        Set<Integer> set3;
        if (p2) {
            return FacebookRequestError.read.TRANSIENT;
        }
        Map<Integer, Set<Integer>> map = this.write;
        if (map != null && map.containsKey(Integer.valueOf(p0)) && ((set3 = this.write.get(Integer.valueOf(p0))) == null || set3.contains(Integer.valueOf(p1)))) {
            return FacebookRequestError.read.OTHER;
        }
        Map<Integer, Set<Integer>> map2 = this.RemoteActionCompatParcelizer;
        if (map2 != null && map2.containsKey(Integer.valueOf(p0)) && ((set2 = this.RemoteActionCompatParcelizer.get(Integer.valueOf(p0))) == null || set2.contains(Integer.valueOf(p1)))) {
            return FacebookRequestError.read.LOGIN_RECOVERABLE;
        }
        Map<Integer, Set<Integer>> map3 = this.AudioAttributesCompatParcelizer;
        if (map3 != null && map3.containsKey(Integer.valueOf(p0)) && ((set = this.AudioAttributesCompatParcelizer.get(Integer.valueOf(p0))) == null || set.contains(Integer.valueOf(p1)))) {
            return FacebookRequestError.read.TRANSIENT;
        }
        return FacebookRequestError.read.OTHER;
    }

    /* JADX INFO: renamed from: o.DefaultAnalyticsCollectorExternalSyntheticLambda55$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\"\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\r\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\f\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00068CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda55$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lorg/json/JSONArray;", "p0", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda55;", "write", "(Lorg/json/JSONArray;)Lo/DefaultAnalyticsCollectorExternalSyntheticLambda55;", "Lorg/json/JSONObject;", "", "", "", "RemoteActionCompatParcelizer", "(Lorg/json/JSONObject;)Ljava/util/Map;", "IconCompatParcelizer", "()Lo/DefaultAnalyticsCollectorExternalSyntheticLambda55;", "read", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda55;"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        public final DefaultAnalyticsCollectorExternalSyntheticLambda55 IconCompatParcelizer() {
            DefaultAnalyticsCollectorExternalSyntheticLambda55 defaultAnalyticsCollectorExternalSyntheticLambda55;
            synchronized (this) {
                if (DefaultAnalyticsCollectorExternalSyntheticLambda55.read == null) {
                    Companion companion = DefaultAnalyticsCollectorExternalSyntheticLambda55.INSTANCE;
                    DefaultAnalyticsCollectorExternalSyntheticLambda55.read = read();
                }
                defaultAnalyticsCollectorExternalSyntheticLambda55 = DefaultAnalyticsCollectorExternalSyntheticLambda55.read;
                if (defaultAnalyticsCollectorExternalSyntheticLambda55 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.FacebookRequestErrorClassification");
                }
            }
            return defaultAnalyticsCollectorExternalSyntheticLambda55;
        }

        private static DefaultAnalyticsCollectorExternalSyntheticLambda55 read() {
            return new DefaultAnalyticsCollectorExternalSyntheticLambda55(null, VideoTimelineResponseBody.AudioAttributesCompatParcelizer(setAction.write(2, null), setAction.write(4, null), setAction.write(9, null), setAction.write(17, null), setAction.write(341, null)), VideoTimelineResponseBody.AudioAttributesCompatParcelizer(setAction.write(102, null), setAction.write(190, null), setAction.write(Integer.valueOf(WalletConstants.ERROR_CODE_UNSUPPORTED_API_VERSION), null)), null, null, null);
        }

        private static Map<Integer, Set<Integer>> RemoteActionCompatParcelizer(JSONObject p0) {
            int iOptInt;
            HashSet hashSet;
            JSONArray jSONArrayOptJSONArray = p0.optJSONArray("items");
            if (jSONArrayOptJSONArray.length() == 0) {
                return null;
            }
            HashMap map = new HashMap();
            int length = jSONArrayOptJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(i);
                if (jSONObjectOptJSONObject != null && (iOptInt = jSONObjectOptJSONObject.optInt("code")) != 0) {
                    JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("subcodes");
                    if (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() <= 0) {
                        hashSet = null;
                    } else {
                        hashSet = new HashSet();
                        int length2 = jSONArrayOptJSONArray2.length();
                        for (int i2 = 0; i2 < length2; i2++) {
                            int iOptInt2 = jSONArrayOptJSONArray2.optInt(i2);
                            if (iOptInt2 != 0) {
                                hashSet.add(Integer.valueOf(iOptInt2));
                            }
                        }
                    }
                    map.put(Integer.valueOf(iOptInt), hashSet);
                }
            }
            return map;
        }

        @getMagicModuleMeta
        public final DefaultAnalyticsCollectorExternalSyntheticLambda55 write(JSONArray p0) {
            String strOptString;
            if (p0 == null) {
                return null;
            }
            int length = p0.length();
            Map<Integer, Set<Integer>> mapRemoteActionCompatParcelizer = null;
            Map<Integer, Set<Integer>> mapRemoteActionCompatParcelizer2 = null;
            Map<Integer, Set<Integer>> mapRemoteActionCompatParcelizer3 = null;
            String strOptString2 = null;
            String strOptString3 = null;
            String strOptString4 = null;
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = p0.optJSONObject(i);
                if (jSONObjectOptJSONObject != null && (strOptString = jSONObjectOptJSONObject.optString("name")) != null) {
                    if (TestGroupLSModel.read(strOptString, "other", true)) {
                        strOptString2 = jSONObjectOptJSONObject.optString("recovery_message", null);
                        mapRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(jSONObjectOptJSONObject);
                    } else if (TestGroupLSModel.read(strOptString, "transient", true)) {
                        strOptString3 = jSONObjectOptJSONObject.optString("recovery_message", null);
                        mapRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(jSONObjectOptJSONObject);
                    } else if (TestGroupLSModel.read(strOptString, "login_recoverable", true)) {
                        strOptString4 = jSONObjectOptJSONObject.optString("recovery_message", null);
                        mapRemoteActionCompatParcelizer3 = RemoteActionCompatParcelizer(jSONObjectOptJSONObject);
                    }
                }
            }
            return new DefaultAnalyticsCollectorExternalSyntheticLambda55(mapRemoteActionCompatParcelizer, mapRemoteActionCompatParcelizer2, mapRemoteActionCompatParcelizer3, strOptString2, strOptString3, strOptString4);
        }
    }
}
