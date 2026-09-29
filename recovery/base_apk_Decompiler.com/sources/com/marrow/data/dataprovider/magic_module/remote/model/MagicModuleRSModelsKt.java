package com.marrow.data.dataprovider.magic_module.remote.model;

import com.marrow.data.dataprovider.magic_module.local.model.MagicModuleMetaLSModel;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleModel;", "Lcom/marrow/data/dataprovider/magic_module/local/model/MagicModuleMetaLSModel;", "toMagicModuleMetaLSModel", "(Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleModel;)Lcom/marrow/data/dataprovider/magic_module/local/model/MagicModuleMetaLSModel;"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class MagicModuleRSModelsKt {
    public static final MagicModuleMetaLSModel toMagicModuleMetaLSModel(MagicModuleModel magicModuleModel) {
        toMagicModuleMetaRepoModel.write(magicModuleModel, "");
        String id = magicModuleModel.getId();
        boolean zIsFirstModule = magicModuleModel.isFirstModule();
        long createdOnDateMs = magicModuleModel.getCreatedOnDateMs();
        String title = magicModuleModel.getTitle();
        int mcqCount = magicModuleModel.getMcqCount();
        int status = magicModuleModel.getStatus();
        Long submittedOn = magicModuleModel.getSubmittedOn();
        long jLongValue = submittedOn != null ? submittedOn.longValue() : Long.MIN_VALUE;
        Integer correctCount = magicModuleModel.getCorrectCount();
        return new MagicModuleMetaLSModel(id, title, zIsFirstModule, createdOnDateMs, mcqCount, status, jLongValue, correctCount != null ? correctCount.intValue() : Integer.MIN_VALUE, null, magicModuleModel.getError_code(), 256, null);
    }
}
