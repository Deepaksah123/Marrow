package kotlin;

import android.content.Context;
import com.marrow.data.models.custommodule.FilterParams;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.VideoDownloadLimitResponse;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\fJ=\u0010\u000f\u001a\u00020\n2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u00072\u0018\u0010\t\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u000e0\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0012\u001a\u00020\n2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0014J\u000f\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u0019\u001a\u00020\n2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u0014R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001bR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u001cR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u001c"}, d2 = {"Lo/RtspMediaPeriodRtspLoaderWrapper;", "Lo/RtspMediaPeriodListener;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "", "", "", "p1", "", "AudioAttributesCompatParcelizer", "(Ljava/lang/String;Ljava/util/Map;)V", "Lo/updateLoadingFinished;", "", "write", "(Ljava/util/Map;Ljava/util/Map;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "IconCompatParcelizer", "(Ljava/lang/String;)V", "(Ljava/util/Map;)V", "()V", "Lorg/json/JSONObject;", "RemoteActionCompatParcelizer", "(Ljava/lang/String;Lorg/json/JSONObject;)V", "read", "Lo/VideoDownloadLimitResponse;", "Lo/VideoDownloadLimitResponse;", "Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RtspMediaPeriodRtspLoaderWrapper extends RtspMediaPeriodListener {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private String IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private VideoDownloadLimitResponse write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private String AudioAttributesCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RtspMediaPeriodRtspLoaderWrapper(Context context) {
        super(updateLoadingFinished.IconCompatParcelizer);
        toMagicModuleMetaRepoModel.write(context, "");
        this.write = VideoDownloadLimitResponse.AudioAttributesCompatParcelizer(context, "5431e7b93a7b469c39751ff7b12b0a77", "mixpanelSingleton");
    }

    @Override // kotlin.RtspMediaPeriodListener
    public final void AudioAttributesCompatParcelizer(String p0, Map<String, ? extends Object> p1) throws JSONException {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ? extends Object> entry : p1.entrySet()) {
            jSONObject.put(entry.getKey(), entry.getValue());
        }
        RemoteActionCompatParcelizer(p0, jSONObject);
    }

    @Override // kotlin.RtspMediaPeriodListener
    public final void write(Map<String, ? extends Object> p0, Map<updateLoadingFinished, ? extends List<String>> p1) {
        VideoDownloadLimitResponse.write writeVarWrite;
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        read(p0);
        List<String> orDefault = p1.getOrDefault(updateLoadingFinished.IconCompatParcelizer, null);
        if (orDefault == null) {
            orDefault = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ? extends Object> entry : p0.entrySet()) {
            if (!orDefault.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str = (String) entry2.getKey();
            Object value = entry2.getValue();
            VideoDownloadLimitResponse videoDownloadLimitResponse = this.write;
            if (videoDownloadLimitResponse != null && (writeVarWrite = videoDownloadLimitResponse.write()) != null) {
                writeVarWrite.RemoteActionCompatParcelizer(str, value);
            }
        }
    }

    @Override // kotlin.RtspMediaPeriodListener
    public final void IconCompatParcelizer(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        VideoDownloadLimitResponse videoDownloadLimitResponse = this.write;
        if (videoDownloadLimitResponse != null) {
            videoDownloadLimitResponse.AudioAttributesCompatParcelizer(p0);
        }
    }

    @Override // kotlin.RtspMediaPeriodListener
    public final void IconCompatParcelizer(Map<String, ? extends Object> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Object orDefault = p0.getOrDefault("Identity", null);
        String str = orDefault instanceof String ? (String) orDefault : null;
        if (str != null) {
            IconCompatParcelizer(str);
        }
    }

    @Override // kotlin.RtspMediaPeriodListener
    public final void IconCompatParcelizer() {
        read(VideoTimelineResponseBody.read());
        VideoDownloadLimitResponse videoDownloadLimitResponse = this.write;
        if (videoDownloadLimitResponse != null) {
            videoDownloadLimitResponse.MediaBrowserCompatCustomActionResultReceiver();
        }
    }

    private final void RemoteActionCompatParcelizer(String p0, JSONObject p1) throws JSONException {
        p1.put("build_version", 496);
        p1.putOpt(FilterParams.KEY_COURSE_ID, this.IconCompatParcelizer);
        p1.putOpt("edition", this.AudioAttributesCompatParcelizer);
        VideoDownloadLimitResponse videoDownloadLimitResponse = this.write;
        if (videoDownloadLimitResponse != null) {
            videoDownloadLimitResponse.read(p0, p1);
        }
        isTransportReady.RemoteActionCompatParcelizer(p1);
        resumeLoad resumeload = resumeLoad.write;
        RtspMediaPeriodSampleStreamImpl.write(p0);
    }

    private final void read(Map<String, ? extends Object> p0) {
        Object orDefault = p0.getOrDefault("current_course_id", null);
        this.IconCompatParcelizer = orDefault instanceof String ? (String) orDefault : null;
        Object orDefault2 = p0.getOrDefault("current_edition_id", null);
        this.AudioAttributesCompatParcelizer = orDefault2 instanceof String ? (String) orDefault2 : null;
    }

    @Override // kotlin.RtspMediaPeriodListener
    public final void AudioAttributesCompatParcelizer(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
    }
}
