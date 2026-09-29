package com.marrow.data.dataprovider.magic_module.remote;

import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.dataprovider.magic_module.remote.model.MagicModuleFeedbackRequestBody;
import com.marrow.data.dataprovider.magic_module.remote.model.MagicModuleModel;
import com.marrow.data.dataprovider.magic_module.remote.model.MagicModuleSubmissionRequestBody;
import com.marrow.data.dataprovider.magic_module.remote.model.MagicModuleSubmissionResponseBody;
import kotlin.LessonDynamicResponseBody;
import kotlin.Metadata;
import kotlin.accessgetEmptyStatecp;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00030\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u00030\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\b\u001a\u00020\u0007H&¢\u0006\u0004\b\u0012\u0010\u0013À\u0006\u0003"}, d2 = {"Lcom/marrow/data/dataprovider/magic_module/remote/MagicModuleRemote;", "", "Lo/LessonDynamicResponseBody;", "Lcom/marrow/data/api/models/MarrowResponse;", "Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleModel;", "fetchMagicModuleMeta", "()Lo/LessonDynamicResponseBody;", "", "p0", "Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleSubmissionRequestBody;", "p1", "Lo/accessgetEmptyStatecp;", "Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleSubmissionResponseBody;", "submitMagicModuleAnswers", "(Ljava/lang/String;Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleSubmissionRequestBody;)Lo/accessgetEmptyStatecp;", "Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleFeedbackRequestBody;", "submitMagicModuleFeedback", "(Ljava/lang/String;Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleFeedbackRequestBody;)Lo/LessonDynamicResponseBody;", "downloadMagicModuleDetail", "(Ljava/lang/String;)Lo/LessonDynamicResponseBody;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MagicModuleRemote {
    LessonDynamicResponseBody<MarrowResponse<MagicModuleModel>> downloadMagicModuleDetail(String p0);

    LessonDynamicResponseBody<MarrowResponse<MagicModuleModel>> fetchMagicModuleMeta();

    accessgetEmptyStatecp<MarrowResponse<MagicModuleSubmissionResponseBody>> submitMagicModuleAnswers(String p0, MagicModuleSubmissionRequestBody p1);

    LessonDynamicResponseBody<MarrowResponse<Object>> submitMagicModuleFeedback(String p0, MagicModuleFeedbackRequestBody p1);
}
