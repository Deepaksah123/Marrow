package kotlin;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\r\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B'\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048G¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u000e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0010\u0010\u000f"}, d2 = {"Lo/lambdasetPlayer1comgoogleandroidexoplayer2analyticsDefaultAnalyticsCollector;", "", "", "p0", "", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "IconCompatParcelizer", "Ljava/util/List;", "()Ljava/util/List;", "read", "Ljava/lang/String;", "AudioAttributesCompatParcelizer", "()Ljava/lang/String;", "AudioAttributesImplApi21Parcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {1, 4, 0})
public final class lambdasetPlayer1comgoogleandroidexoplayer2analyticsDefaultAnalyticsCollector {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Set<lambdasetPlayer1comgoogleandroidexoplayer2analyticsDefaultAnalyticsCollector> write = new CopyOnWriteArraySet();
    private final String AudioAttributesCompatParcelizer;
    private final List<String> IconCompatParcelizer;
    private final String read;

    public /* synthetic */ lambdasetPlayer1comgoogleandroidexoplayer2analyticsDefaultAnalyticsCollector(String str, List list, String str2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, list, str2);
    }

    public static final /* synthetic */ Set read() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdasetPlayer1comgoogleandroidexoplayer2analyticsDefaultAnalyticsCollector.class)) {
            return null;
        }
        try {
            return write;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdasetPlayer1comgoogleandroidexoplayer2analyticsDefaultAnalyticsCollector.class);
            return null;
        }
    }

    private lambdasetPlayer1comgoogleandroidexoplayer2analyticsDefaultAnalyticsCollector(String str, List<String> list, String str2) {
        this.read = str;
        this.AudioAttributesCompatParcelizer = str2;
        this.IconCompatParcelizer = list;
    }

    public final String AudioAttributesCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return null;
        }
        try {
            return this.read;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
            return null;
        }
    }

    public final String AudioAttributesImplApi21Parcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return null;
        }
        try {
            return this.AudioAttributesCompatParcelizer;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
            return null;
        }
    }

    /* JADX INFO: renamed from: o.lambdasetPlayer1comgoogleandroidexoplayer2analyticsDefaultAnalyticsCollector$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\r0\tH\u0007¢\u0006\u0004\b\u0007\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\r0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011"}, d2 = {"Lo/lambdasetPlayer1comgoogleandroidexoplayer2analyticsDefaultAnalyticsCollector$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lorg/json/JSONObject;", "p0", "", "IconCompatParcelizer", "(Lorg/json/JSONObject;)V", "", "", "write", "()Ljava/util/Set;", "Lo/lambdasetPlayer1comgoogleandroidexoplayer2analyticsDefaultAnalyticsCollector;", "RemoteActionCompatParcelizer", "(Ljava/lang/String;)V", "", "Ljava/util/Set;"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        @getMagicModuleMeta
        public static Set<lambdasetPlayer1comgoogleandroidexoplayer2analyticsDefaultAnalyticsCollector> IconCompatParcelizer() {
            return new HashSet(lambdasetPlayer1comgoogleandroidexoplayer2analyticsDefaultAnalyticsCollector.read());
        }

        @getMagicModuleMeta
        public final void RemoteActionCompatParcelizer(String p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            try {
                lambdasetPlayer1comgoogleandroidexoplayer2analyticsDefaultAnalyticsCollector.read().clear();
                Companion companion = this;
                IconCompatParcelizer(new JSONObject(p0));
            } catch (JSONException unused) {
            }
        }

        @getMagicModuleMeta
        public static Set<String> write() {
            HashSet hashSet = new HashSet();
            Iterator it = lambdasetPlayer1comgoogleandroidexoplayer2analyticsDefaultAnalyticsCollector.read().iterator();
            while (it.hasNext()) {
                hashSet.add(((lambdasetPlayer1comgoogleandroidexoplayer2analyticsDefaultAnalyticsCollector) it.next()).AudioAttributesCompatParcelizer());
            }
            return hashSet;
        }

        private static void IconCompatParcelizer(JSONObject p0) {
            Iterator<String> itKeys = p0.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObjectOptJSONObject = p0.optJSONObject(next);
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("k");
                    String strOptString2 = jSONObjectOptJSONObject.optString("v");
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strOptString, "");
                    String str = strOptString;
                    if (str.length() != 0) {
                        Set set = lambdasetPlayer1comgoogleandroidexoplayer2analyticsDefaultAnalyticsCollector.read();
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(next, "");
                        List listWrite = TestGroupLSModel.write(str, new String[]{","}, 0, 6);
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strOptString2, "");
                        set.add(new lambdasetPlayer1comgoogleandroidexoplayer2analyticsDefaultAnalyticsCollector(next, listWrite, strOptString2, null));
                    }
                }
            }
        }
    }

    public final List<String> IconCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return null;
        }
        try {
            return new ArrayList(this.IconCompatParcelizer);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
            return null;
        }
    }

    @getMagicModuleMeta
    public static final Set<String> RemoteActionCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdasetPlayer1comgoogleandroidexoplayer2analyticsDefaultAnalyticsCollector.class)) {
            return null;
        }
        try {
            return Companion.write();
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdasetPlayer1comgoogleandroidexoplayer2analyticsDefaultAnalyticsCollector.class);
            return null;
        }
    }

    @getMagicModuleMeta
    public static final Set<lambdasetPlayer1comgoogleandroidexoplayer2analyticsDefaultAnalyticsCollector> write() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdasetPlayer1comgoogleandroidexoplayer2analyticsDefaultAnalyticsCollector.class)) {
            return null;
        }
        try {
            return Companion.IconCompatParcelizer();
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdasetPlayer1comgoogleandroidexoplayer2analyticsDefaultAnalyticsCollector.class);
            return null;
        }
    }

    @getMagicModuleMeta
    public static final void read(String str) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(lambdasetPlayer1comgoogleandroidexoplayer2analyticsDefaultAnalyticsCollector.class)) {
            return;
        }
        try {
            INSTANCE.RemoteActionCompatParcelizer(str);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, lambdasetPlayer1comgoogleandroidexoplayer2analyticsDefaultAnalyticsCollector.class);
        }
    }
}
