package kotlin;

import com.marrow.data.models.subject.Subject;
import com.marrow2.data.subject.local.model.SubjectLSModel;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class getVideoFrameProcessingOffsetAverageString implements getPlayerStateString {
    private final getPixelAspectRatioString RemoteActionCompatParcelizer;

    @setSdkPayload
    public getVideoFrameProcessingOffsetAverageString(getPixelAspectRatioString getpixelaspectratiostring) {
        toMagicModuleMetaRepoModel.write(getpixelaspectratiostring, "");
        this.RemoteActionCompatParcelizer = getpixelaspectratiostring;
    }

    @Override // kotlin.getPlayerStateString
    public final Object IconCompatParcelizer(String str, SampleVideos<? super String> sampleVideos) {
        return this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(str, sampleVideos);
    }

    @Override // kotlin.getPlayerStateString
    public final Object write(String str, SampleVideos<? super SubjectLSModel> sampleVideos) {
        return this.RemoteActionCompatParcelizer.IconCompatParcelizer(str, sampleVideos);
    }

    @Override // kotlin.getPlayerStateString
    public final Object write(List<String> list, boolean z, SampleVideos<? super Map<String, String>> sampleVideos) {
        return this.RemoteActionCompatParcelizer.IconCompatParcelizer(list, z);
    }

    @Override // kotlin.getPlayerStateString
    public final Object AudioAttributesCompatParcelizer(CopyOnWriteMultiset copyOnWriteMultiset, SampleVideos<? super List<SubjectLSModel>> sampleVideos) {
        return this.RemoteActionCompatParcelizer.write(Subject.ROOT_PARENT_ID, copyOnWriteMultiset.read());
    }

    @Override // kotlin.getPlayerStateString
    public final Object RemoteActionCompatParcelizer(SampleVideos<? super Integer> sampleVideos) {
        return this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.getPlayerStateString
    public final Object read(SampleVideos<? super List<String>> sampleVideos) {
        return this.RemoteActionCompatParcelizer.IconCompatParcelizer();
    }

    @Override // kotlin.getPlayerStateString
    public final Object RemoteActionCompatParcelizer(List<CopyOnWriteMultiset> list, SampleVideos<? super List<isCached>> sampleVideos) {
        return this.RemoteActionCompatParcelizer.write(list, sampleVideos);
    }

    @Override // kotlin.getPlayerStateString
    public final Object RemoteActionCompatParcelizer(String str, SampleVideos<? super removeSpan> sampleVideos) {
        return this.RemoteActionCompatParcelizer.write(str, sampleVideos);
    }

    @Override // kotlin.getPlayerStateString
    public final Object read(String str, SampleVideos<? super Long> sampleVideos) {
        return this.RemoteActionCompatParcelizer.read(str, sampleVideos);
    }

    @Override // kotlin.getPlayerStateString
    public final Object write(String str, long j, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objAudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(str, j, sampleVideos);
        return objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer() ? objAudioAttributesCompatParcelizer : getShowPopup.INSTANCE;
    }

    @Override // kotlin.getPlayerStateString
    public final Object read(String str, long j, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objWrite = this.RemoteActionCompatParcelizer.write(str, j, sampleVideos);
        return objWrite == getYear.IconCompatParcelizer() ? objWrite : getShowPopup.INSTANCE;
    }

    @Override // kotlin.getPlayerStateString
    public final Object read(List<String> list, SampleVideos<? super List<SubjectLSModel>> sampleVideos) {
        return this.RemoteActionCompatParcelizer.read(list);
    }

    @Override // kotlin.getPlayerStateString
    public final Object AudioAttributesCompatParcelizer(String str, SampleVideos<? super List<getDebugString>> sampleVideos) {
        return this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(str, sampleVideos);
    }
}
