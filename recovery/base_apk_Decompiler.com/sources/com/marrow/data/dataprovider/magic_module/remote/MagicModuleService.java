package com.marrow.data.dataprovider.magic_module.remote;

import com.marrow.data.api.models.response.ApiResponse;
import com.marrow.data.dataprovider.magic_module.remote.model.MagicModuleFeedbackRequestBody;
import com.marrow.data.dataprovider.magic_module.remote.model.MagicModuleModel;
import com.marrow.data.dataprovider.magic_module.remote.model.MagicModuleSubmissionRequestBody;
import com.marrow.data.dataprovider.magic_module.remote.model.MagicModuleSubmissionResponseBody;
import kotlin.LessonDynamicResponseBody;
import kotlin.Metadata;
import kotlin.accessgetEmptyStatecp;
import kotlin.getReviewTimeMs;
import kotlin.getTimeTook;
import kotlin.setMcqTimingDetails;
import kotlin.setRankRange;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\t\u0010\nJ/\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00030\r2\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\u000bH'¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00030\u00022\b\b\u0001\u0010\b\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\u0011H'¢\u0006\u0004\b\u0012\u0010\u0013À\u0006\u0003"}, d2 = {"Lcom/marrow/data/dataprovider/magic_module/remote/MagicModuleService;", "", "Lo/LessonDynamicResponseBody;", "Lcom/marrow/data/api/models/response/ApiResponse;", "Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleModel;", "getMagicModuleMeta", "()Lo/LessonDynamicResponseBody;", "", "p0", "getMagicModuleDetail", "(Ljava/lang/String;)Lo/LessonDynamicResponseBody;", "Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleSubmissionRequestBody;", "p1", "Lo/accessgetEmptyStatecp;", "Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleSubmissionResponseBody;", "submitMagicModule", "(Ljava/lang/String;Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleSubmissionRequestBody;)Lo/accessgetEmptyStatecp;", "Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleFeedbackRequestBody;", "submitFeedback", "(Ljava/lang/String;Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleFeedbackRequestBody;)Lo/LessonDynamicResponseBody;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MagicModuleService {
    @setMcqTimingDetails(read = "smart_recall/{id}")
    LessonDynamicResponseBody<ApiResponse<MagicModuleModel>> getMagicModuleDetail(@setRankRange(IconCompatParcelizer = "id") String p0);

    @setMcqTimingDetails(read = "smart_recall")
    LessonDynamicResponseBody<ApiResponse<MagicModuleModel>> getMagicModuleMeta();

    @getReviewTimeMs(read = "smart_recall/{id}/feedback")
    LessonDynamicResponseBody<ApiResponse<Object>> submitFeedback(@setRankRange(IconCompatParcelizer = "id") String p0, @getTimeTook MagicModuleFeedbackRequestBody p1);

    @getReviewTimeMs(read = "smart_recall/{id}/result")
    accessgetEmptyStatecp<ApiResponse<MagicModuleSubmissionResponseBody>> submitMagicModule(@setRankRange(IconCompatParcelizer = "id") String p0, @getTimeTook MagicModuleSubmissionRequestBody p1);
}
