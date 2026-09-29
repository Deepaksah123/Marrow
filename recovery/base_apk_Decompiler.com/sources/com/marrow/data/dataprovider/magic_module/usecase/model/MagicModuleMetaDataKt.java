package com.marrow.data.dataprovider.magic_module.usecase.model;

import com.marrow.data.dataprovider.magic_module.remote.model.MagicModuleStatsRSModel;
import com.marrow.data.dataprovider.magic_module.remote.model.MagicModuleSubmissionResponseBody;
import com.marrow.data.dataprovider.magic_module.remote.model.MagicModuleTimelineRSModel;
import com.marrow.data.dataprovider.magic_module.repo.model.MagicModuleMetaRepoModel;
import com.marrow.data.models.magicModule.MagicModuleTimeline;
import java.util.ArrayList;
import java.util.List;
import kotlin.IntermediateLoginResponseBody;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0007\u001a\u00060\u0003j\u0002`\u0006*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\u0005\u001a\u001d\u0010\u0007\u001a\u00060\u0003j\u0002`\u0006*\u00020\b2\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\t\u001a5\u0010\u0011\u001a\u00020\u0010*\u00020\n2\u000e\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u000b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012\u001a!\u0010\u0017\u001a\f\u0012\b\u0012\u00060\u0015j\u0002`\u00160\u0013*\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u0019\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001b\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001a\"\u0014\u0010\u001d\u001a\u00020\u001c8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e*\n\u0010\u001f\"\u00020\u00032\u00020\u0003*\u000e\u0010 \"\u0002`\u00162\u00060\u0015j\u0002`\u0016"}, d2 = {"Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleSubmissionResponseBody;", "", "p0", "Lcom/marrow/data/dataprovider/magic_module/usecase/model/MagicModuleStatusUcModel;", "toMagicModuleStatusUcModel", "(Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleSubmissionResponseBody;Ljava/lang/String;)Lcom/marrow/data/dataprovider/magic_module/usecase/model/MagicModuleStatusUcModel;", "Lcom/marrow/data/dataprovider/magic_module/usecase/model/MagicModuleStatsLSModel;", "toMagicModuleStatsLSModel", "Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleStatsRSModel;", "(Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleStatsRSModel;Ljava/lang/String;)Lcom/marrow/data/dataprovider/magic_module/usecase/model/MagicModuleStatusUcModel;", "Lcom/marrow/data/dataprovider/magic_module/repo/model/MagicModuleMetaRepoModel;", "Lcom/marrow/data/dataprovider/magic_module/repo/model/MagicModuleStatRepoModel;", "", "p1", "", "p2", "Lcom/marrow/data/dataprovider/magic_module/usecase/model/MagicModuleMetaUcModel;", "toMagicModuleMetaDataUcModel", "(Lcom/marrow/data/dataprovider/magic_module/repo/model/MagicModuleMetaRepoModel;Lcom/marrow/data/dataprovider/magic_module/usecase/model/MagicModuleStatusUcModel;IZ)Lcom/marrow/data/dataprovider/magic_module/usecase/model/MagicModuleMetaUcModel;", "", "Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleTimelineRSModel;", "Lcom/marrow/data/models/magicModule/MagicModuleTimeline;", "Lcom/marrow/data/dataprovider/magic_module/local/model/MagicModuleTimelineLSModel;", "toMagicModuleTimelineIndexLSModel", "(Ljava/util/List;)Ljava/util/List;", "DEFAULT_MCQ_COUNT", "I", "DEFAULT_CORRECT_MCQ_COUNT", "", "DEFAULT_SUBMITTED_ON", "J", "MagicModuleStatsLSModel", "MagicModuleTimelineUCModel"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class MagicModuleMetaDataKt {
    public static final int DEFAULT_CORRECT_MCQ_COUNT = 0;
    public static final int DEFAULT_MCQ_COUNT = 0;
    public static final long DEFAULT_SUBMITTED_ON = 0;

    public static final MagicModuleStatusUcModel toMagicModuleStatusUcModel(MagicModuleSubmissionResponseBody magicModuleSubmissionResponseBody, String str) {
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionResponseBody, "");
        toMagicModuleMetaRepoModel.write(str, "");
        return new MagicModuleStatusUcModel(magicModuleSubmissionResponseBody.getMagicModuleStat().getModuleCompleted(), magicModuleSubmissionResponseBody.getMagicModuleStat().getCorrected(), magicModuleSubmissionResponseBody.getMagicModuleStat().getNeedRevision(), str);
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

    public static /* synthetic */ MagicModuleMetaUcModel toMagicModuleMetaDataUcModel$default(MagicModuleMetaRepoModel magicModuleMetaRepoModel, MagicModuleStatusUcModel magicModuleStatusUcModel, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = Integer.MIN_VALUE;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        return toMagicModuleMetaDataUcModel(magicModuleMetaRepoModel, magicModuleStatusUcModel, i, z);
    }

    public static final MagicModuleMetaUcModel toMagicModuleMetaDataUcModel(MagicModuleMetaRepoModel magicModuleMetaRepoModel, MagicModuleStatusUcModel magicModuleStatusUcModel, int i, boolean z) {
        toMagicModuleMetaRepoModel.write(magicModuleMetaRepoModel, "");
        return new MagicModuleMetaUcModel(magicModuleMetaRepoModel.getId(), magicModuleMetaRepoModel.getModuleName(), magicModuleMetaRepoModel.getStatus(), magicModuleMetaRepoModel.isFirstModule(), magicModuleMetaRepoModel.getCreatedOn(), null, magicModuleMetaRepoModel.getMcqCount(), magicModuleMetaRepoModel.getCorrectCount(), magicModuleMetaRepoModel.getSubmittedOn(), magicModuleStatusUcModel, i, magicModuleMetaRepoModel.getErrorCode(), z, 32, null);
    }

    public static final List<MagicModuleTimeline> toMagicModuleTimelineIndexLSModel(List<MagicModuleTimelineRSModel> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        List<MagicModuleTimelineRSModel> list2 = list;
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
        for (MagicModuleTimelineRSModel magicModuleTimelineRSModel : list2) {
            String id = magicModuleTimelineRSModel.getId();
            String title = magicModuleTimelineRSModel.getTitle();
            Integer correctCount = magicModuleTimelineRSModel.getCorrectCount();
            int iIntValue = correctCount != null ? correctCount.intValue() : 0;
            Integer mcqCount = magicModuleTimelineRSModel.getMcqCount();
            int iIntValue2 = mcqCount != null ? mcqCount.intValue() : 0;
            Long submittedOn = magicModuleTimelineRSModel.getSubmittedOn();
            arrayList.add(new MagicModuleTimeline(id, title, iIntValue, iIntValue2, submittedOn != null ? submittedOn.longValue() : 0L));
        }
        return arrayList;
    }
}
