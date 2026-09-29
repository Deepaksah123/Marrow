package com.marrow2.data.custom_module.remote.model;

import com.marrow.data.models.custommodule.CustomModule;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/marrow/data/models/custommodule/CustomModule;", "Lcom/marrow2/data/custom_module/remote/model/CustomModuleLSModel;", "toLSModel", "(Lcom/marrow/data/models/custommodule/CustomModule;)Lcom/marrow2/data/custom_module/remote/model/CustomModuleLSModel;"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class CustomModuleLSModelKt {
    public static final CustomModuleLSModel toLSModel(CustomModule customModule) {
        toMagicModuleMetaRepoModel.write(customModule, "");
        String str = customModule.id;
        FilterParams lSModel = FilterParamsKt.toLSModel(customModule.params);
        com.marrow.data.models.custommodule.FilterParams responseParams = customModule.getResponseParams();
        return new CustomModuleLSModel(str, lSModel, responseParams != null ? FilterParamsKt.toLSModel(responseParams) : null, customModule.getWarningMsg(), customModule.mcqCount, customModule.status, customModule.taskStatus, customModule.createdOn, customModule.getSubmittedOn(), customModule.getInviteCode(), customModule.getModuleOwner(), customModule.getIsExpired(), customModule.getTestName(), customModule.getModuleMessage(), customModule.getExpiredOn(), customModule.getStartDateTime(), customModule.getExamDurationSeconds(), customModule.getUserInitiatedExamStartedOn());
    }
}
