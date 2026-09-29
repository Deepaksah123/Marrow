package kotlin;

import com.google.android.play.core.integrity.StandardIntegrityException;
import com.marrow.data.api.models.response.ApiResponse;
import com.marrow.data.models.common.NetworkStat;
import com.marrow.di.app.data.NetworkModule;
import com.marrow.utils.exceptions.PlayIntegrityExceptionUtil;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class getPlaylistProtectionSchemes implements parseLongAttr {
    private final onRebuffer write;

    static /* synthetic */ void AudioAttributesCompatParcelizer() throws Exception {
    }

    static /* synthetic */ void IconCompatParcelizer() throws Exception {
    }

    static /* synthetic */ NetworkStat RemoteActionCompatParcelizer(NetworkStat networkStat) throws Exception {
        return networkStat;
    }

    @setSdkPayload
    public getPlaylistProtectionSchemes(onRebuffer onrebuffer) {
        this.write = onrebuffer;
    }

    private accessgetEmptyStatecp<ApiResponse<Object>> IconCompatParcelizer(final Throwable th, final Map<String, String> map) {
        final NetworkStat networkStat = new NetworkStat();
        return ((updateClippedDuration) NetworkModule.write("http://ip-api.com/").read(updateClippedDuration.class)).AudioAttributesCompatParcelizer().read(new getVariantWithAudioGroup(networkStat)).RemoteActionCompatParcelizer(new getSubjectTitle() { // from class: o.getSegmentEncryptionIV
            @Override // kotlin.getSubjectTitle
            public final Object apply(Object obj) {
                return this.IconCompatParcelizer.write(th, networkStat, map, (NetworkStat) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ApiResponse write(Throwable th, NetworkStat networkStat, Map map, NetworkStat networkStat2) throws Exception {
        if (th instanceof getNoOfQuestions) {
            RtspHeadersBuilder.IconCompatParcelizer().write("font_crash", ((getNoOfQuestions) th).IconCompatParcelizer(PlayIntegrityExceptionUtil.TAG_NON_FATAL), MediaPeriodCallback.RemoteActionCompatParcelizer(new Object[]{updateLoadingFinished.RemoteActionCompatParcelizer}));
            return ApiResponse.create(new Object());
        }
        if ((th instanceof StandardIntegrityException) && PlayIntegrityExceptionUtil.INSTANCE.isSuppressed(th)) {
            StringBuilder sb = new StringBuilder("StandardIntegrityException Suppressed : \n");
            sb.append(th.getMessage());
            buildResolutionString.IconCompatParcelizer("logPlayIntegrity", sb.toString());
            RtspHeadersBuilder.IconCompatParcelizer().write(PlayIntegrityExceptionUtil.EVENT_NAME, PlayIntegrityExceptionUtil.INSTANCE.toAnalyticMap(th, PlayIntegrityExceptionUtil.TAG_NON_FATAL), MediaPeriodCallback.RemoteActionCompatParcelizer(new Object[]{updateLoadingFinished.RemoteActionCompatParcelizer}));
            return ApiResponse.create(new Object());
        }
        boolean z = networkStat2 != networkStat;
        boolean z2 = parseDescriptor.read(th);
        write(th, map, networkStat2);
        if (!z && z2) {
            return ApiResponse.create(new Object());
        }
        getExternalPeriodUid.RemoteActionCompatParcelizer(th, map, networkStat2);
        return ApiResponse.create(new Object());
    }

    private void write(Throwable th, Map<String, String> map, NetworkStat networkStat) {
        HashMap map2 = new HashMap(map);
        map2.put("net", String.valueOf(parseDescriptor.read(th)));
        map2.put("ip", networkStat.query);
        map2.put("isp", networkStat.isp);
        for (int i = 0; i <= 2; i++) {
            if (th != null) {
                map2.put("title".concat(String.valueOf(i)), th.getClass().getSimpleName());
                map2.put("er_msg".concat(String.valueOf(i)), th.getMessage());
                th = th.getCause();
            } else {
                map2.put("title".concat(String.valueOf(i)), "NA");
                map2.put("er_msg".concat(String.valueOf(i)), "NA");
            }
        }
        this.write.read(map2);
    }

    @Override // kotlin.parseLongAttr
    public final void AudioAttributesCompatParcelizer(Throwable th, String str) {
        HashMap map = new HashMap();
        map.put("key", str);
        write(th, map);
    }

    @Override // kotlin.parseLongAttr
    public final void read(Throwable th, String str, Map<String, String> map) {
        map.put("key", str);
        write(th, map);
    }

    @Override // kotlin.parseLongAttr
    public final void write(Throwable th, Map<String, String> map) {
        IconCompatParcelizer(th, map).RemoteActionCompatParcelizer(PlanBUpgradeData.read()).AudioAttributesCompatParcelizer(PlanBUpgradeData.read()).IconCompatParcelizer(new getTimelineId() { // from class: o.getVariantWithVideoGroup
            @Override // kotlin.getTimelineId
            public final void RemoteActionCompatParcelizer(Object obj) throws Exception {
                getPlaylistProtectionSchemes.AudioAttributesCompatParcelizer();
            }
        }, new getTimelineId() { // from class: o.parseEncryptionScheme
            @Override // kotlin.getTimelineId
            public final void RemoteActionCompatParcelizer(Object obj) throws Exception {
                getPlaylistProtectionSchemes.IconCompatParcelizer();
            }
        });
    }
}
