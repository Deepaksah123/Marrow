package kotlin;

import com.marrow.data.models.video.cache.VideoCacheInfo;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface r8lambdahwqn2ZMkGwWGxPzI0ba91qAvjnc {
    Object AudioAttributesCompatParcelizer();

    Object AudioAttributesCompatParcelizer(String str);

    Object AudioAttributesCompatParcelizer(SampleVideos<? super Map<String, ? extends VideoCacheInfo>> sampleVideos);

    Object IconCompatParcelizer(List<String> list);

    Object RemoteActionCompatParcelizer(SampleVideos<? super Integer> sampleVideos);

    Object read(SampleVideos<? super List<String>> sampleVideos);

    Object write(String str);

    Object write(SampleVideos<? super Integer> sampleVideos);
}
