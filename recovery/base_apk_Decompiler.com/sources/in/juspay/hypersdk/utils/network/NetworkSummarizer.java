package in.juspay.hypersdk.utils.network;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import kotlin.C0156TypeKt;
import kotlin.IntermediateLoginResponseBody;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Lin/juspay/hypersdk/utils/network/NetworkSummarizer;", "", "<init>", "()V", "Lo/TypeKt;", "p0", "", "p1", "", "addMetric", "(Lo/TypeKt;J)V", "", "", "p2", "Lin/juspay/hypersdk/utils/network/NetworkSummarizer$Summary;", "publishSummary", "(Ljava/lang/String;Ljava/lang/String;Z)Lin/juspay/hypersdk/utils/network/NetworkSummarizer$Summary;", "", "Lin/juspay/hypersdk/utils/network/NetworkSummarizer$Metric;", "metrics", "Ljava/util/List;", "totalLatency", "J", "Metric", "Summary"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NetworkSummarizer {
    private List<Metric> metrics = new Vector();
    private long totalLatency;

    public final void addMetric(C0156TypeKt p0, long p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        URL urlOnCommand = p0.getRequest().getUrl().onCommand();
        this.totalLatency += p1;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(urlOnCommand, "");
        C0156TypeKt networkResponse = p0.getNetworkResponse();
        int code = networkResponse != null ? networkResponse.getCode() : p0.getCode();
        String str = String.format("%dms", Arrays.copyOf(new Object[]{Long.valueOf(p1)}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        this.metrics.add(new Metric(urlOnCommand, code, str, p0.read("x-cache")));
    }

    public final Summary publishSummary(String p0, String p1, boolean p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        String str = String.format("%dms", Arrays.copyOf(new Object[]{Integer.valueOf(Integer.max(1, (int) (this.totalLatency / ((long) this.metrics.size()))))}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        Summary summary = new Summary(str, p0, p1, this.metrics, p2);
        this.metrics = new Vector();
        this.totalLatency = 0L;
        return summary;
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J:\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000eJ\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0010R\u0017\u0010\u001c\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0010R\u001a\u0010\u001f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u000eR\u001a\u0010\"\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\fR\u001c\u0010%\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010\u001d\u001a\u0004\b&\u0010\u0010"}, d2 = {"Lin/juspay/hypersdk/utils/network/NetworkSummarizer$Metric;", "", "Ljava/net/URL;", "p0", "", "p1", "", "p2", "p3", "<init>", "(Ljava/net/URL;ILjava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/net/URL;", "component2", "()I", "component3", "()Ljava/lang/String;", "component4", "copy", "(Ljava/net/URL;ILjava/lang/String;Ljava/lang/String;)Lin/juspay/hypersdk/utils/network/NetworkSummarizer$Metric;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "Lorg/json/JSONObject;", "toJSON", "()Lorg/json/JSONObject;", "toString", "latency", "Ljava/lang/String;", "getLatency", "status", "I", "getStatus", "url", "Ljava/net/URL;", "getUrl", "xCache", "getXCache"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Metric {
        private final String latency;
        private final int status;
        private final URL url;
        private final String xCache;

        public Metric(URL url, int i, String str, String str2) {
            toMagicModuleMetaRepoModel.write(url, "");
            toMagicModuleMetaRepoModel.write(str, "");
            this.url = url;
            this.status = i;
            this.latency = str;
            this.xCache = str2;
        }

        public final String getLatency() {
            return this.latency;
        }

        public final int getStatus() {
            return this.status;
        }

        public final URL getUrl() {
            return this.url;
        }

        public final String getXCache() {
            return this.xCache;
        }

        public final JSONObject toJSON() throws JSONException {
            JSONObject jSONObjectPut = new JSONObject().put("url", this.url.toString()).put("status", this.status).put("latency", this.latency);
            String str = this.xCache;
            if (str == null) {
                str = "NA";
            }
            JSONObject jSONObjectPut2 = jSONObjectPut.put("x_cache", str);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jSONObjectPut2, "");
            return jSONObjectPut2;
        }

        public static /* synthetic */ Metric copy$default(Metric metric, URL url, int i, String str, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                url = metric.url;
            }
            if ((i2 & 2) != 0) {
                i = metric.status;
            }
            if ((i2 & 4) != 0) {
                str = metric.latency;
            }
            if ((i2 & 8) != 0) {
                str2 = metric.xCache;
            }
            return metric.copy(url, i, str, str2);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final URL getUrl() {
            return this.url;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getStatus() {
            return this.status;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getLatency() {
            return this.latency;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getXCache() {
            return this.xCache;
        }

        public final Metric copy(URL p0, int p1, String p2, String p3) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            return new Metric(p0, p1, p2, p3);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof Metric)) {
                return false;
            }
            Metric metric = (Metric) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.url, metric.url) && this.status == metric.status && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.latency, (Object) metric.latency) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.xCache, (Object) metric.xCache);
        }

        public final int hashCode() {
            int iHashCode = this.url.hashCode();
            int iHashCode2 = Integer.hashCode(this.status);
            int iHashCode3 = this.latency.hashCode();
            String str = this.xCache;
            return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Metric(url=");
            sb.append(this.url);
            sb.append(", status=");
            sb.append(this.status);
            sb.append(", latency=");
            sb.append(this.latency);
            sb.append(", xCache=");
            sb.append(this.xCache);
            sb.append(')');
            return sb.toString();
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014JH\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u000eR\u0017\u0010 \u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000eR \u0010#\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0012R\u001a\u0010&\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010\u000eR\u001a\u0010(\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010\u000eR\u001a\u0010*\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0014"}, d2 = {"Lin/juspay/hypersdk/utils/network/NetworkSummarizer$Summary;", "", "", "p0", "p1", "p2", "", "Lin/juspay/hypersdk/utils/network/NetworkSummarizer$Metric;", "p3", "", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)Lin/juspay/hypersdk/utils/network/NetworkSummarizer$Summary;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Lorg/json/JSONObject;", "toJSON", "()Lorg/json/JSONObject;", "toString", "avgLatency", "Ljava/lang/String;", "getAvgLatency", "metrics", "Ljava/util/List;", "getMetrics", "sessionId", "getSessionId", "updateId", "getUpdateId", "updated", "Z", "getUpdated"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class Summary {
        private final String avgLatency;
        private final List<Metric> metrics;
        private final String sessionId;
        private final String updateId;
        private final boolean updated;

        public Summary(String str, String str2, String str3, List<Metric> list, boolean z) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            toMagicModuleMetaRepoModel.write(str3, "");
            toMagicModuleMetaRepoModel.write(list, "");
            this.avgLatency = str;
            this.sessionId = str2;
            this.updateId = str3;
            this.metrics = list;
            this.updated = z;
        }

        public final String getAvgLatency() {
            return this.avgLatency;
        }

        public final List<Metric> getMetrics() {
            return this.metrics;
        }

        public final String getSessionId() {
            return this.sessionId;
        }

        public final String getUpdateId() {
            return this.updateId;
        }

        public final boolean getUpdated() {
            return this.updated;
        }

        public final JSONObject toJSON() throws JSONException {
            JSONObject jSONObjectPut = new JSONObject().put("avg_latency", this.avgLatency).put("session_id", this.sessionId).put("update_id", this.updateId);
            List<Metric> list = this.metrics;
            ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Metric) it.next()).toJSON());
            }
            JSONObject jSONObjectPut2 = jSONObjectPut.put("metrics", arrayList).put("updated", this.updated);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(jSONObjectPut2, "");
            return jSONObjectPut2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Summary copy$default(Summary summary, String str, String str2, String str3, List list, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = summary.avgLatency;
            }
            if ((i & 2) != 0) {
                str2 = summary.sessionId;
            }
            String str4 = str2;
            if ((i & 4) != 0) {
                str3 = summary.updateId;
            }
            String str5 = str3;
            if ((i & 8) != 0) {
                list = summary.metrics;
            }
            List list2 = list;
            if ((i & 16) != 0) {
                z = summary.updated;
            }
            return summary.copy(str, str4, str5, list2, z);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getAvgLatency() {
            return this.avgLatency;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getSessionId() {
            return this.sessionId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getUpdateId() {
            return this.updateId;
        }

        public final List<Metric> component4() {
            return this.metrics;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final boolean getUpdated() {
            return this.updated;
        }

        public final Summary copy(String p0, String p1, String p2, List<Metric> p3, boolean p4) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            toMagicModuleMetaRepoModel.write(p3, "");
            return new Summary(p0, p1, p2, p3, p4);
        }

        public final boolean equals(Object p0) {
            if (this == p0) {
                return true;
            }
            if (!(p0 instanceof Summary)) {
                return false;
            }
            Summary summary = (Summary) p0;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.avgLatency, (Object) summary.avgLatency) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.sessionId, (Object) summary.sessionId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.updateId, (Object) summary.updateId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.metrics, summary.metrics) && this.updated == summary.updated;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v2, types: [int] */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v4 */
        public final int hashCode() {
            int iHashCode = this.avgLatency.hashCode();
            int iHashCode2 = this.sessionId.hashCode();
            int iHashCode3 = this.updateId.hashCode();
            int iHashCode4 = this.metrics.hashCode();
            boolean z = this.updated;
            ?? r4 = z;
            if (z) {
                r4 = 1;
            }
            return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + r4;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Summary(avgLatency=");
            sb.append(this.avgLatency);
            sb.append(", sessionId=");
            sb.append(this.sessionId);
            sb.append(", updateId=");
            sb.append(this.updateId);
            sb.append(", metrics=");
            sb.append(this.metrics);
            sb.append(", updated=");
            sb.append(this.updated);
            sb.append(')');
            return sb.toString();
        }
    }
}
