package com.marrow.data.dataprovider.magic_module.remote;

import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.api.models.ResponseExtensionsKt;
import com.marrow.data.dataprovider.magic_module.remote.model.MagicModuleFeedbackRequestBody;
import com.marrow.data.dataprovider.magic_module.remote.model.MagicModuleModel;
import com.marrow.data.dataprovider.magic_module.remote.model.MagicModuleSubmissionRequestBody;
import com.marrow.data.dataprovider.magic_module.remote.model.MagicModuleSubmissionResponseBody;
import kotlin.LessonDynamicResponseBody;
import kotlin.Metadata;
import kotlin.accessgetEmptyStatecp;
import kotlin.setSdkPayload;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00070\u000e2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lcom/marrow/data/dataprovider/magic_module/remote/MagicModuleRemoteImpl;", "Lcom/marrow/data/dataprovider/magic_module/remote/MagicModuleRemote;", "Lcom/marrow/data/dataprovider/magic_module/remote/MagicModuleService;", "p0", "<init>", "(Lcom/marrow/data/dataprovider/magic_module/remote/MagicModuleService;)V", "Lo/LessonDynamicResponseBody;", "Lcom/marrow/data/api/models/MarrowResponse;", "Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleModel;", "fetchMagicModuleMeta", "()Lo/LessonDynamicResponseBody;", "", "Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleSubmissionRequestBody;", "p1", "Lo/accessgetEmptyStatecp;", "Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleSubmissionResponseBody;", "submitMagicModuleAnswers", "(Ljava/lang/String;Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleSubmissionRequestBody;)Lo/accessgetEmptyStatecp;", "Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleFeedbackRequestBody;", "", "submitMagicModuleFeedback", "(Ljava/lang/String;Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleFeedbackRequestBody;)Lo/LessonDynamicResponseBody;", "downloadMagicModuleDetail", "(Ljava/lang/String;)Lo/LessonDynamicResponseBody;", "magicModuleService", "Lcom/marrow/data/dataprovider/magic_module/remote/MagicModuleService;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MagicModuleRemoteImpl implements MagicModuleRemote {
    private final MagicModuleService magicModuleService;

    @setSdkPayload
    public MagicModuleRemoteImpl(MagicModuleService magicModuleService) {
        toMagicModuleMetaRepoModel.write(magicModuleService, "");
        this.magicModuleService = magicModuleService;
    }

    @Override // com.marrow.data.dataprovider.magic_module.remote.MagicModuleRemote
    public final LessonDynamicResponseBody<MarrowResponse<MagicModuleModel>> fetchMagicModuleMeta() {
        return ResponseExtensionsKt.toMarrowResponse(this.magicModuleService.getMagicModuleMeta());
    }

    @Override // com.marrow.data.dataprovider.magic_module.remote.MagicModuleRemote
    public final accessgetEmptyStatecp<MarrowResponse<MagicModuleSubmissionResponseBody>> submitMagicModuleAnswers(String p0, MagicModuleSubmissionRequestBody p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return ResponseExtensionsKt.toMarrowResponse(this.magicModuleService.submitMagicModule(p0, p1));
    }

    @Override // com.marrow.data.dataprovider.magic_module.remote.MagicModuleRemote
    public final LessonDynamicResponseBody<MarrowResponse<Object>> submitMagicModuleFeedback(String p0, MagicModuleFeedbackRequestBody p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return ResponseExtensionsKt.toMarrowResponse(this.magicModuleService.submitFeedback(p0, p1));
    }

    @Override // com.marrow.data.dataprovider.magic_module.remote.MagicModuleRemote
    public final LessonDynamicResponseBody<MarrowResponse<MagicModuleModel>> downloadMagicModuleDetail(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return ResponseExtensionsKt.toMarrowResponse(this.magicModuleService.getMagicModuleDetail(p0));
    }
}
