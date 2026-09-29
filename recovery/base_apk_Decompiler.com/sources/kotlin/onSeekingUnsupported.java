package kotlin;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class onSeekingUnsupported extends RtspMediaPeriodListener {
    private final lambdaonVideoDisabled18 RemoteActionCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onSeekingUnsupported(lambdaonVideoDisabled18 lambdaonvideodisabled18) {
        super(updateLoadingFinished.read);
        toMagicModuleMetaRepoModel.write(lambdaonvideodisabled18, "");
        this.RemoteActionCompatParcelizer = lambdaonvideodisabled18;
    }

    @Override // kotlin.RtspMediaPeriodListener
    public final void AudioAttributesCompatParcelizer(String str, Map<String, ? extends Object> map) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(map, "");
        this.RemoteActionCompatParcelizer.IconCompatParcelizer(str, AudioAttributesCompatParcelizer(map));
        resumeLoad resumeload = resumeLoad.read;
        RtspMediaPeriodSampleStreamImpl.write(str);
    }

    @Override // kotlin.RtspMediaPeriodListener
    public final void AudioAttributesCompatParcelizer(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
    }

    @Override // kotlin.RtspMediaPeriodListener
    public final void IconCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
    }

    @Override // kotlin.RtspMediaPeriodListener
    public final void write(Map<String, ? extends Object> map, Map<updateLoadingFinished, ? extends List<String>> map2) {
        toMagicModuleMetaRepoModel.write(map, "");
        toMagicModuleMetaRepoModel.write(map2, "");
    }

    @Override // kotlin.RtspMediaPeriodListener
    public final void IconCompatParcelizer(Map<String, ? extends Object> map) {
        toMagicModuleMetaRepoModel.write(map, "");
    }
}
