package kotlin;

import com.marrow.data.models.pearl.Pearl;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface storeIncremental {
    Object AudioAttributesCompatParcelizer(String str);

    Object IconCompatParcelizer(String str, SampleVideos<? super isMetadataEqual> sampleVideos);

    Object RemoteActionCompatParcelizer(String str, int i);

    Object read();

    void read(List<? extends Pearl> list);
}
