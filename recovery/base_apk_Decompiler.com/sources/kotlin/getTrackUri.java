package kotlin;

import android.app.Application;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.PlayerTimelineChangeReason;

/* JADX INFO: loaded from: classes3.dex */
public final class getTrackUri extends RtspMediaPeriodListener {
    private final RenewEligible RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getTrackUri(final Application application, boolean z) {
        super(updateLoadingFinished.AudioAttributesCompatParcelizer);
        toMagicModuleMetaRepoModel.write(application, "");
        this.RemoteActionCompatParcelizer = getRenewExpiresOn.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.lambdanew0comgoogleandroidexoplayer2sourcertspRtspMediaPeriodRtpLoadInfo
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return getTrackUri.write(application);
            }
        });
        PlaybackParametersExternalSyntheticLambda0.write(application);
        PlayerTimelineChangeReason.IconCompatParcelizer(PlayerTimelineChangeReason.AudioAttributesCompatParcelizer.OFF);
    }

    private final PlayerTimelineChangeReason write() {
        return (PlayerTimelineChangeReason) this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PlayerTimelineChangeReason write(Application application) {
        return PlayerTimelineChangeReason.write(application);
    }

    @Override // kotlin.RtspMediaPeriodListener
    public final void AudioAttributesCompatParcelizer(String str, Map<String, ? extends Object> map) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(map, "");
        PlayerTimelineChangeReason playerTimelineChangeReasonWrite = write();
        if (playerTimelineChangeReasonWrite != null) {
            playerTimelineChangeReasonWrite.read(str, map);
        }
        AudioAttributesCompatParcelizer(map);
        resumeLoad resumeload = resumeLoad.RemoteActionCompatParcelizer;
        RtspMediaPeriodSampleStreamImpl.write(str);
    }

    @Override // kotlin.RtspMediaPeriodListener
    public final void write(Map<String, ? extends Object> map, Map<updateLoadingFinished, ? extends List<String>> map2) {
        List<String> list;
        toMagicModuleMetaRepoModel.write(map, "");
        toMagicModuleMetaRepoModel.write(map2, "");
        if (!map2.isEmpty() && (list = map2.get(updateLoadingFinished.AudioAttributesCompatParcelizer)) != null && !list.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
                List<String> list2 = map2.get(updateLoadingFinished.AudioAttributesCompatParcelizer);
                toMagicModuleMetaRepoModel.write(list2);
                if (!list2.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            map = linkedHashMap;
        }
        PlayerTimelineChangeReason playerTimelineChangeReasonWrite = write();
        if (playerTimelineChangeReasonWrite != null) {
            playerTimelineChangeReasonWrite.read(map);
        }
    }

    @Override // kotlin.RtspMediaPeriodListener
    public final void AudioAttributesCompatParcelizer(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        PlayerTimelineChangeReason playerTimelineChangeReasonWrite = write();
        if (playerTimelineChangeReasonWrite != null) {
            playerTimelineChangeReasonWrite.write(str);
        }
    }

    @Override // kotlin.RtspMediaPeriodListener
    public final void IconCompatParcelizer(Map<String, ? extends Object> map) {
        toMagicModuleMetaRepoModel.write(map, "");
        PlayerTimelineChangeReason playerTimelineChangeReasonWrite = write();
        if (playerTimelineChangeReasonWrite != null) {
            playerTimelineChangeReasonWrite.RemoteActionCompatParcelizer(map);
        }
    }

    @Override // kotlin.RtspMediaPeriodListener
    public final void IconCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
    }
}
