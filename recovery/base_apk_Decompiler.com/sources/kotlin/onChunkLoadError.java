package kotlin;

import com.marrow.data.api.models.response.ApiResponse;
import com.marrow.data.models.tag.Tag;

/* JADX INFO: loaded from: classes3.dex */
public final class onChunkLoadError implements getPreferredQueueSize {
    private final SpannedDataExternalSyntheticLambda0 AudioAttributesCompatParcelizer;

    @setSdkPayload
    public onChunkLoadError(SpannedDataExternalSyntheticLambda0 spannedDataExternalSyntheticLambda0) {
        this.AudioAttributesCompatParcelizer = spannedDataExternalSyntheticLambda0;
    }

    @Override // kotlin.getPreferredQueueSize
    public final accessgetEmptyStatecp<ApiResponse<Tag[]>> read(String[] strArr) {
        return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(strArr);
    }
}
