package kotlin;

import com.marrow.data.models.custommodule.CustomModule;
import com.marrow2.data.custom_module.remote.model.CustomModuleLSModel;
import com.marrow2.data.custom_module.remote.model.FilterParams;
import com.marrow2.data.custom_module.remote.model.FilterParamsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class savePassword {
    public static final CustomModule RemoteActionCompatParcelizer(CustomModuleLSModel customModuleLSModel) {
        toMagicModuleMetaRepoModel.write(customModuleLSModel, "");
        CustomModule customModule = new CustomModule();
        customModule.id = customModuleLSModel.getId();
        customModule.params = FilterParamsKt.toOldModel(customModuleLSModel.getParams());
        FilterParams responseParams = customModuleLSModel.getResponseParams();
        customModule.setResponseParams(responseParams != null ? FilterParamsKt.toOldModel(responseParams) : null);
        customModule.status = customModuleLSModel.getStatus();
        customModule.taskStatus = customModuleLSModel.getTaskStatus();
        customModule.createdOn = customModuleLSModel.getCreatedOn();
        customModule.setSubmittedOn(customModuleLSModel.getSubmittedOn());
        customModule.setInviteCode(customModuleLSModel.getInviteCode());
        customModule.setModuleOwner(customModuleLSModel.getModuleOwner());
        customModule.setExpired(customModuleLSModel.isExpired());
        customModule.setTestName(customModuleLSModel.getTestName());
        customModule.setModuleMessage(customModuleLSModel.getModuleMessage());
        customModule.mcqCount = customModuleLSModel.getMcqCount();
        customModule.setExpiredOn(customModuleLSModel.getExpiredOn());
        customModule.setStartDateTime(customModuleLSModel.getStartDateTime());
        customModule.setExamDurationSeconds(customModuleLSModel.getExamDurationSeconds());
        customModule.setUserInitiatedExamStartedOn(customModuleLSModel.getUserInitiatedExamStartedOn());
        return customModule;
    }
}
