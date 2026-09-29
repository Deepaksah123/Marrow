package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface setLibraries {
    Object AudioAttributesCompatParcelizer(int i, SampleVideos<? super Integer> sampleVideos);

    Object AudioAttributesCompatParcelizer(SampleVideos<? super Integer> sampleVideos);

    Object IconCompatParcelizer(SampleVideos<? super List<String>> sampleVideos);

    Object RemoteActionCompatParcelizer();

    Object RemoteActionCompatParcelizer(String str);

    Object RemoteActionCompatParcelizer(String str, SampleVideos<? super ListenerSetListenerHolder> sampleVideos);

    Object read(SampleVideos<? super Integer> sampleVideos);

    Object write(String str);

    Object write(List<String> list);
}
