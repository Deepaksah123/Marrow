package kotlin;

import com.marrow2.data.magic_module.remote.model.MagicModuleModel;
import com.marrow2.data.magic_module.remote.model.MagicModuleSubmissionRequestBody;
import com.marrow2.data.magic_module.remote.model.MagicModuleSubmissionResponseBody;

/* JADX INFO: loaded from: classes3.dex */
public interface getCache {
    Object AudioAttributesCompatParcelizer(String str, SampleVideos<? super MagicModuleModel> sampleVideos);

    Object IconCompatParcelizer(String str, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, SampleVideos<? super MagicModuleSubmissionResponseBody> sampleVideos);

    Object RemoteActionCompatParcelizer(SampleVideos<? super MagicModuleModel> sampleVideos);
}
