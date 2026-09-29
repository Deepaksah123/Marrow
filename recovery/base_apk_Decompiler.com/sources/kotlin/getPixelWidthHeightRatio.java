package kotlin;

import com.marrow.data.models.custommodule.CustomModule;
import com.marrow2.data.custom_module.remote.model.CustomModuleLSModel;
import com.marrow2.data.custom_module.remote.model.FilterParams;
import com.marrow2.data.custom_module.remote.model.FilterParamsKt;
import com.marrow2.domain.custom_module.model.CustomModuleUCModel;
import org.apache.commons.compress.archivers.zip.UnixStat;

/* JADX INFO: loaded from: classes3.dex */
public final class getPixelWidthHeightRatio {
    public static final CustomModuleUCModel AudioAttributesCompatParcelizer(CustomModuleLSModel customModuleLSModel) {
        toMagicModuleMetaRepoModel.write(customModuleLSModel, "");
        String id = customModuleLSModel.getId();
        FilterParams responseParams = customModuleLSModel.getResponseParams();
        if (responseParams == null) {
            responseParams = new FilterParams(false, 0, 0, false, null, null, null, null, null, null, null, false, UnixStat.PERM_MASK, null);
        }
        FilterParams params = customModuleLSModel.getParams();
        int status = customModuleLSModel.getStatus();
        int taskStatus = customModuleLSModel.getTaskStatus();
        long createdOn = customModuleLSModel.getCreatedOn();
        long submittedOn = customModuleLSModel.getSubmittedOn();
        String inviteCode = customModuleLSModel.getInviteCode();
        String moduleMessage = customModuleLSModel.getModuleMessage();
        return new CustomModuleUCModel(id, params, responseParams, status, taskStatus, createdOn, submittedOn, inviteCode, customModuleLSModel.getModuleOwner(), customModuleLSModel.isExpired(), customModuleLSModel.getTestName(), moduleMessage, customModuleLSModel.getMcqCount(), customModuleLSModel.getExpiredOn(), customModuleLSModel.getStartDateTime(), toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) customModuleLSModel.getModuleOwner(), (Object) CustomModule.MODULE_OWNER_FACULTY), customModuleLSModel.getExamDurationSeconds(), customModuleLSModel.getUserInitiatedExamStartedOn());
    }

    public static final CustomModuleUCModel RemoteActionCompatParcelizer(CustomModule customModule) {
        FilterParams filterParams;
        toMagicModuleMetaRepoModel.write(customModule, "");
        String str = customModule.id;
        com.marrow.data.models.custommodule.FilterParams responseParams = customModule.getResponseParams();
        if (responseParams == null || (filterParams = FilterParamsKt.toLSModel(responseParams)) == null) {
            filterParams = new FilterParams(false, 0, 0, false, null, null, null, null, null, null, null, false, UnixStat.PERM_MASK, null);
        }
        return new CustomModuleUCModel(str, FilterParamsKt.toLSModel(customModule.params), filterParams, customModule.status, customModule.taskStatus, customModule.createdOn, customModule.getSubmittedOn(), customModule.getInviteCode(), customModule.getModuleOwner(), customModule.getIsExpired(), customModule.getTestName(), customModule.getModuleMessage(), customModule.mcqCount, customModule.getExpiredOn(), customModule.getStartDateTime(), toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) customModule.getModuleOwner(), (Object) CustomModule.MODULE_OWNER_FACULTY), customModule.getExamDurationSeconds(), customModule.getUserInitiatedExamStartedOn());
    }
}
