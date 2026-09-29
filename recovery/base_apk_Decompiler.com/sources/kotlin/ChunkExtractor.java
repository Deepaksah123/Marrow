package kotlin;

import com.marrow.data.api.models.response.ApiResponse;
import com.marrow.data.api.models.response.Data;

/* JADX INFO: loaded from: classes3.dex */
public interface ChunkExtractor<T> extends ChunkExtractorTrackOutputProvider<T> {
    SearchTextResponseBody<ApiResponse<T[]>> RemoteActionCompatParcelizer();

    void read(Data<T[]> data);
}
