package com.marrow.data.dataprovider.magic_module.repo.model;

import com.marrow.data.dataprovider.magic_module.local.model.MagicModuleMetaLSModel;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003*\u000e\u0010\u0006\"\u0002`\u00042\u00060\u0005j\u0002`\u0004"}, d2 = {"Lcom/marrow/data/dataprovider/magic_module/local/model/MagicModuleMetaLSModel;", "Lcom/marrow/data/dataprovider/magic_module/repo/model/MagicModuleMetaRepoModel;", "toMagicModuleMetaRepoModel", "(Lcom/marrow/data/dataprovider/magic_module/local/model/MagicModuleMetaLSModel;)Lcom/marrow/data/dataprovider/magic_module/repo/model/MagicModuleMetaRepoModel;", "Lcom/marrow/data/dataprovider/magic_module/usecase/model/MagicModuleStatsLSModel;", "Lcom/marrow/data/dataprovider/magic_module/usecase/model/MagicModuleStatusUcModel;", "MagicModuleStatRepoModel"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class MagicModuleRepoModelsKt {
    public static final MagicModuleMetaRepoModel toMagicModuleMetaRepoModel(MagicModuleMetaLSModel magicModuleMetaLSModel) {
        toMagicModuleMetaRepoModel.write(magicModuleMetaLSModel, "");
        return new MagicModuleMetaRepoModel(magicModuleMetaLSModel.getId(), magicModuleMetaLSModel.isFirstModule(), magicModuleMetaLSModel.getCreatedOn(), magicModuleMetaLSModel.getTitle(), magicModuleMetaLSModel.getMcqCount(), magicModuleMetaLSModel.getStatus(), magicModuleMetaLSModel.getSubmittedOn(), magicModuleMetaLSModel.getCorrectCount(), magicModuleMetaLSModel.getErrorCode());
    }
}
