package com.marrow2.data.magic_module.remote.model;

import kotlin.Metadata;
import kotlin.getAllClients;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\t\u001a\u00020\b*\u00020\u00002\u000e\u0010\u0003\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\f\u001a\u00020\u000b*\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u0010\u001a\u00020\u000f*\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0011\u0010\u0012\u001a\u00020\u0000*\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001d\u0010\u0017\u001a\u00060\u0001j\u0002`\u0016*\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001d\u0010\u0017\u001a\u00060\u0001j\u0002`\u0016*\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u001a*\n\u0010\u001b\"\u00020\u00012\u00020\u0001*\u000e\u0010\u001c\"\u0002`\u00162\u00060\u0001j\u0002`\u0016"}, d2 = {"Lcom/marrow2/data/magic_module/remote/model/MagicModuleMetaRepoModel;", "Lcom/marrow2/data/magic_module/remote/model/MagicModuleStatusUcModel;", "Lcom/marrow2/data/magic_module/remote/model/MagicModuleStatRepoModel;", "p0", "", "p1", "", "p2", "Lcom/marrow2/data/magic_module/remote/model/MagicModuleMetaUCData;", "toMagicModuleMetaDataUcModel", "(Lcom/marrow2/data/magic_module/remote/model/MagicModuleMetaRepoModel;Lcom/marrow2/data/magic_module/remote/model/MagicModuleStatusUcModel;IZ)Lcom/marrow2/data/magic_module/remote/model/MagicModuleMetaUCData;", "Lo/getAllClients;", "transformToVMModel", "(Lcom/marrow2/data/magic_module/remote/model/MagicModuleMetaUCData;ZZ)Lo/getAllClients;", "Lcom/marrow2/data/magic_module/remote/model/MagicModuleModel;", "Lcom/marrow2/data/magic_module/remote/model/MagicModuleMetaLSModel;", "toMagicModuleMetaLSModel", "(Lcom/marrow2/data/magic_module/remote/model/MagicModuleModel;)Lcom/marrow2/data/magic_module/remote/model/MagicModuleMetaLSModel;", "toMagicModuleMetaRepoModel", "(Lcom/marrow2/data/magic_module/remote/model/MagicModuleMetaLSModel;)Lcom/marrow2/data/magic_module/remote/model/MagicModuleMetaRepoModel;", "Lcom/marrow2/data/magic_module/remote/model/MagicModuleSubmissionResponseBody;", "", "Lcom/marrow2/data/magic_module/remote/model/MagicModuleStatsLSModel;", "toMagicModuleStatsLSModel", "(Lcom/marrow2/data/magic_module/remote/model/MagicModuleSubmissionResponseBody;Ljava/lang/String;)Lcom/marrow2/data/magic_module/remote/model/MagicModuleStatusUcModel;", "Lcom/marrow2/data/magic_module/remote/model/MagicModuleStatsRSModel;", "(Lcom/marrow2/data/magic_module/remote/model/MagicModuleStatsRSModel;Ljava/lang/String;)Lcom/marrow2/data/magic_module/remote/model/MagicModuleStatusUcModel;", "MagicModuleStatsLSModel", "MagicModuleStatRepoModel"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class MagicModuleDataKt {
    public static /* synthetic */ MagicModuleMetaUCData toMagicModuleMetaDataUcModel$default(MagicModuleMetaRepoModel magicModuleMetaRepoModel, MagicModuleStatusUcModel magicModuleStatusUcModel, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = Integer.MIN_VALUE;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return toMagicModuleMetaDataUcModel(magicModuleMetaRepoModel, magicModuleStatusUcModel, i, z);
    }

    public static final MagicModuleMetaUCData toMagicModuleMetaDataUcModel(MagicModuleMetaRepoModel magicModuleMetaRepoModel, MagicModuleStatusUcModel magicModuleStatusUcModel, int i, boolean z) {
        toMagicModuleMetaRepoModel.write(magicModuleMetaRepoModel, "");
        return new MagicModuleMetaUCData(magicModuleMetaRepoModel.getId(), magicModuleMetaRepoModel.getModuleName(), magicModuleMetaRepoModel.getStatus(), magicModuleMetaRepoModel.isFirstModule(), magicModuleMetaRepoModel.getCreatedOn(), magicModuleMetaRepoModel.getPausedOnTimeMs(), magicModuleMetaRepoModel.getMcqCount(), magicModuleMetaRepoModel.getCorrectCount(), magicModuleMetaRepoModel.getSubmittedOn(), magicModuleStatusUcModel, i, magicModuleMetaRepoModel.getErrorCode(), z);
    }

    public static final getAllClients transformToVMModel(MagicModuleMetaUCData magicModuleMetaUCData, boolean z, boolean z2) {
        toMagicModuleMetaRepoModel.write(magicModuleMetaUCData, "");
        return new getAllClients(magicModuleMetaUCData.getName(), magicModuleMetaUCData.getMcqCount(), z, z2);
    }

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

    public static final MagicModuleMetaRepoModel toMagicModuleMetaRepoModel(MagicModuleMetaLSModel magicModuleMetaLSModel) {
        toMagicModuleMetaRepoModel.write(magicModuleMetaLSModel, "");
        return new MagicModuleMetaRepoModel(magicModuleMetaLSModel.getId(), magicModuleMetaLSModel.isFirstModule(), magicModuleMetaLSModel.getCreatedOn(), magicModuleMetaLSModel.getPausedModuleDate(), magicModuleMetaLSModel.getTitle(), magicModuleMetaLSModel.getMcqCount(), magicModuleMetaLSModel.getStatus(), magicModuleMetaLSModel.getSubmittedOn(), magicModuleMetaLSModel.getCorrectCount(), magicModuleMetaLSModel.getErrorCode());
    }

    public static final MagicModuleStatusUcModel toMagicModuleStatsLSModel(MagicModuleSubmissionResponseBody magicModuleSubmissionResponseBody, String str) {
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionResponseBody, "");
        toMagicModuleMetaRepoModel.write(str, "");
        return toMagicModuleStatsLSModel(magicModuleSubmissionResponseBody.getMagicModuleStat(), str);
    }

    public static final MagicModuleStatusUcModel toMagicModuleStatsLSModel(MagicModuleStatsRSModel magicModuleStatsRSModel, String str) {
        toMagicModuleMetaRepoModel.write(magicModuleStatsRSModel, "");
        toMagicModuleMetaRepoModel.write(str, "");
        return new MagicModuleStatusUcModel(magicModuleStatsRSModel.getModuleCompleted(), magicModuleStatsRSModel.getCorrected(), magicModuleStatsRSModel.getNeedRevision(), str);
    }
}
