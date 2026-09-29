package kotlin;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.module.kotlin.ExtensionsKt;
import com.marrow.data.models.common.CourseResponseKeyConstantsKt;
import com.marrow.data.models.custommodule.FilterParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/SntpClientNtpTimeCallback;", "", "<init>", "()V", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SntpClientNtpTimeCallback {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o.SntpClientNtpTimeCallback$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010$\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\n\u001a \u0012\u0004\u0012\u00020\u0004\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017"}, d2 = {"Lo/SntpClientNtpTimeCallback$IconCompatParcelizer;", "", "<init>", "()V", "", "p0", "", "", "", "Lo/writeTimestamp;", "IconCompatParcelizer", "(Ljava/lang/String;)Ljava/util/Map;", "Lo/ExperimentalBandwidthMeterExternalSyntheticLambda0;", "write", "(Ljava/lang/String;)Lo/ExperimentalBandwidthMeterExternalSyntheticLambda0;", "Lo/SlidingPercentileBandwidthStatisticSample;", "read", "(Ljava/lang/String;)Lo/SlidingPercentileBandwidthStatisticSample;", "Lo/PercentileTimeToFirstByteEstimator;", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;)Lo/PercentileTimeToFirstByteEstimator;", "Lo/setTimeToFirstByteEstimator;", "RemoteActionCompatParcelizer", "(Ljava/lang/String;)Lo/setTimeToFirstByteEstimator;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: o.SntpClientNtpTimeCallback$IconCompatParcelizer$IconCompatParcelizer, reason: collision with other inner class name */
        public static final class C0049IconCompatParcelizer extends TypeReference<PercentileTimeToFirstByteEstimator> {
        }

        /* JADX INFO: renamed from: o.SntpClientNtpTimeCallback$IconCompatParcelizer$RemoteActionCompatParcelizer */
        public static final class RemoteActionCompatParcelizer extends TypeReference<SlidingPercentileBandwidthStatisticSample> {
        }

        /* JADX INFO: renamed from: o.SntpClientNtpTimeCallback$IconCompatParcelizer$write */
        public static final class write extends TypeReference<setTimeToFirstByteEstimator> {
        }

        private Companion() {
        }

        public static Map<String, Map<String, List<writeTimestamp>>> IconCompatParcelizer(String p0) throws JSONException {
            toMagicModuleMetaRepoModel.write(p0, "");
            JSONObject jSONObject = new JSONObject(p0);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> itKeys = jSONObject.keys();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(itKeys, "");
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                JSONObject jSONObject2 = jSONObject.getJSONObject(next);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Iterator<String> itKeys2 = jSONObject2.keys();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(itKeys2, "keys(...)");
                while (itKeys2.hasNext()) {
                    String next2 = itKeys2.next();
                    JSONArray jSONArray = jSONObject2.getJSONArray(next2);
                    ArrayList arrayList = new ArrayList();
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        int i2 = jSONArray.getJSONObject(i).getInt(FilterParams.KEY_COURSE_ID);
                        JSONArray jSONArray2 = jSONArray.getJSONObject(i).getJSONArray(CourseResponseKeyConstantsKt.KEY_EDITIONS);
                        int length2 = jSONArray2.length();
                        int i3 = 0;
                        while (i3 < length2) {
                            arrayList.add(new writeTimestamp(i2, jSONArray2.getInt(i3)));
                            i3++;
                            jSONObject = jSONObject;
                            itKeys = itKeys;
                        }
                    }
                    linkedHashMap2.put(next2, arrayList);
                }
                linkedHashMap.put(next, linkedHashMap2);
            }
            return linkedHashMap;
        }

        public static ExperimentalBandwidthMeterExternalSyntheticLambda0 write(String p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Object objIconCompatParcelizer = new setDownloadingStatesToQueued().IconCompatParcelizer(p0, (Class<Object>) ExperimentalBandwidthMeterExternalSyntheticLambda0.class);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objIconCompatParcelizer, "");
            return (ExperimentalBandwidthMeterExternalSyntheticLambda0) objIconCompatParcelizer;
        }

        public static SlidingPercentileBandwidthStatisticSample read(String p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return (SlidingPercentileBandwidthStatisticSample) ExtensionsKt.jacksonObjectMapper().readValue(p0, new RemoteActionCompatParcelizer());
        }

        public static PercentileTimeToFirstByteEstimator AudioAttributesCompatParcelizer(String p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return (PercentileTimeToFirstByteEstimator) ExtensionsKt.jacksonObjectMapper().readValue(p0, new C0049IconCompatParcelizer());
        }

        public static setTimeToFirstByteEstimator RemoteActionCompatParcelizer(String p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return (setTimeToFirstByteEstimator) ExtensionsKt.jacksonObjectMapper().readValue(p0, new write());
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
