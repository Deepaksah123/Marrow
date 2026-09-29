package kotlin;

import com.marrow.data.api.models.response.common.RatingResponseBody;
import dagger.Lazy;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class createRetryAction implements clearFatalError {
    private final Lazy<LoadErrorHandlingPolicyFallbackSelection> read;

    @setSdkPayload
    public createRetryAction(Lazy<LoadErrorHandlingPolicyFallbackSelection> lazy) {
        toMagicModuleMetaRepoModel.write(lazy, "");
        this.read = lazy;
    }

    private final LoadErrorHandlingPolicyFallbackSelection write() {
        LoadErrorHandlingPolicyFallbackSelection loadErrorHandlingPolicyFallbackSelection = this.read.get();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(loadErrorHandlingPolicyFallbackSelection, "");
        return loadErrorHandlingPolicyFallbackSelection;
    }

    @Override // kotlin.clearFatalError
    public final Object AudioAttributesCompatParcelizer(LoadErrorHandlingPolicyFallbackType loadErrorHandlingPolicyFallbackType, int i, String str, String str2, String str3, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objRemoteActionCompatParcelizer = write().RemoteActionCompatParcelizer(loadErrorHandlingPolicyFallbackType, i, str, str2, str3, sampleVideos);
        return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
    }

    @Override // kotlin.clearFatalError
    public final Object read(int i, String str, String str2, String str3, List<Integer> list, LoadErrorHandlingPolicyFallbackType loadErrorHandlingPolicyFallbackType, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objWrite = write().write(i, str, str2, str3, list, loadErrorHandlingPolicyFallbackType, sampleVideos);
        return objWrite == getYear.IconCompatParcelizer() ? objWrite : getShowPopup.INSTANCE;
    }

    @Override // kotlin.clearFatalError
    public final Object write(String str, String str2, String str3, int i, List<String> list, SampleVideos<? super RatingResponseBody> sampleVideos) {
        return write().read(LoadErrorHandlingPolicyFallbackType.IconCompatParcelizer.getRemoteActionCompatParcelizer(), str, str2, str3, i, 1, list, sampleVideos);
    }

    @Override // kotlin.clearFatalError
    public final Object write(String str, int i, String str2, List<String> list, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objIconCompatParcelizer = write().IconCompatParcelizer(str, i, str2, list, sampleVideos);
        return objIconCompatParcelizer == getYear.IconCompatParcelizer() ? objIconCompatParcelizer : getShowPopup.INSTANCE;
    }
}
