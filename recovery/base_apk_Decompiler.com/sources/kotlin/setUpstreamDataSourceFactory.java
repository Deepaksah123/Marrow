package kotlin;

import com.marrow.data.models.LessonMcqUpdateInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface setUpstreamDataSourceFactory {
    Object AudioAttributesCompatParcelizer(String str);

    Object AudioAttributesCompatParcelizer(List<? extends LessonMcqUpdateInfo> list);

    Object read(String str);

    Object write(String str);

    Object write(ArrayList<String> arrayList, SampleVideos<? super Map<String, ? extends List<Integer>>> sampleVideos);
}
