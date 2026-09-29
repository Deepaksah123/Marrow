package kotlin;

import com.marrow.data.models.video.cache.VideoCacheInfo;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface iterationFinished {
    Object AudioAttributesCompatParcelizer(String str, SampleVideos<? super getShowPopup> sampleVideos);

    Object AudioAttributesCompatParcelizer(SampleVideos<? super Integer> sampleVideos);

    Object IconCompatParcelizer(int i, SampleVideos<? super Integer> sampleVideos);

    Object RemoteActionCompatParcelizer(String str, SampleVideos<? super getLogLevel> sampleVideos);

    Object RemoteActionCompatParcelizer(List<String> list, SampleVideos<? super getShowPopup> sampleVideos);

    Object RemoteActionCompatParcelizer(SampleVideos<? super List<String>> sampleVideos);

    Object read(String str, SampleVideos<? super setLogLevel> sampleVideos);

    Object read(SampleVideos<? super Integer> sampleVideos);

    Object write(SampleVideos<? super List<? extends VideoCacheInfo>> sampleVideos);
}
