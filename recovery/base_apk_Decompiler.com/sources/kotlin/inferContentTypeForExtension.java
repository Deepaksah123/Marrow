package kotlin;

import com.marrow.data.models.video.cache.VideoCacheInfo;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface inferContentTypeForExtension {
    Object AudioAttributesCompatParcelizer();

    Object AudioAttributesCompatParcelizer(String str, SampleVideos<? super ColorParser> sampleVideos);

    Object AudioAttributesCompatParcelizer(SampleVideos<? super List<? extends VideoCacheInfo>> sampleVideos);

    Object IconCompatParcelizer(String str, SampleVideos<? super getContentMetadata> sampleVideos);

    Object IconCompatParcelizer(SampleVideos<? super getShowPopup> sampleVideos);

    Object RemoteActionCompatParcelizer(String str, boolean z, SampleVideos<? super Boolean> sampleVideos);

    Object RemoteActionCompatParcelizer(SampleVideos<? super Boolean> sampleVideos);

    Object read(String str, SampleVideos<? super String> sampleVideos);

    Object read(SampleVideos<? super Integer> sampleVideos);

    Object write(List<String> list, SampleVideos<? super getShowPopup> sampleVideos);

    Object write(SampleVideos<? super Integer> sampleVideos);
}
