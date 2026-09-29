package com.marrow.data.dataprovider.magic_module.usecase;

import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.dataprovider.magic_module.remote.model.MagicModuleModel;
import com.marrow.data.dataprovider.magic_module.repo.model.MagicModuleMetaRepoModel;
import com.marrow.data.dataprovider.magic_module.usecase.model.MagicModuleMetaUcModel;
import com.marrow.data.dataprovider.magic_module.usecase.model.MagicModuleStatusUcModel;
import com.marrow.data.models.magicModule.MagicModuleTimeline;
import com.marrow.data.models.mcq.McqAnswer;
import java.util.List;
import kotlin.LessonDynamicResponseBody;
import kotlin.Metadata;
import kotlin.accessgetEmptyStatecp;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0007H&¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\b0\u00072\b\b\u0002\u0010\u0003\u001a\u00020\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\b0\u00142\u0006\u0010\u0003\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H&¢\u0006\u0004\b\u0016\u0010\u0017JA\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00102\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00100\u001aH&¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\fH&¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H&¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\f\u0012\b\u0012\u00060#j\u0002`$0\u001aH&¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0018H&¢\u0006\u0004\b'\u0010(À\u0006\u0003"}, d2 = {"Lcom/marrow/data/dataprovider/magic_module/usecase/MagicModuleUseCase;", "", "Lcom/marrow/data/dataprovider/magic_module/usecase/MagicModuleParentType;", "p0", "Lcom/marrow/data/dataprovider/magic_module/usecase/model/MagicModuleMetaUcModel;", "getMagicModuleMetaData", "(Lcom/marrow/data/dataprovider/magic_module/usecase/MagicModuleParentType;)Lcom/marrow/data/dataprovider/magic_module/usecase/model/MagicModuleMetaUcModel;", "Lo/LessonDynamicResponseBody;", "Lcom/marrow/data/api/models/MarrowResponse;", "Lcom/marrow/data/dataprovider/magic_module/repo/model/MagicModuleMetaRepoModel;", "downloadMagicModuleMeta", "()Lo/LessonDynamicResponseBody;", "", "Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleModel;", "downloadMagicModuleDetail", "(Z)Lo/LessonDynamicResponseBody;", "", "", "Lcom/marrow/data/models/mcq/McqAnswer;", "p1", "Lo/accessgetEmptyStatecp;", "Lcom/marrow/data/dataprovider/magic_module/usecase/model/MagicModuleStatusUcModel;", "markComplete", "(Ljava/lang/String;[Lcom/marrow/data/models/mcq/McqAnswer;)Lo/accessgetEmptyStatecp;", "", "p2", "", "p3", "submitFeedback", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;)Lo/LessonDynamicResponseBody;", "isMagicModuleIntroAlreadyShown", "()Z", "", "setMagicModuleIntroShown", "()V", "Lcom/marrow/data/models/magicModule/MagicModuleTimeline;", "Lcom/marrow/data/dataprovider/magic_module/usecase/model/MagicModuleTimelineUCModel;", "getMagicModuleTimeline", "()Ljava/util/List;", "getTotalSolvedModules", "()I"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MagicModuleUseCase {
    LessonDynamicResponseBody<MarrowResponse<MagicModuleModel>> downloadMagicModuleDetail(boolean p0);

    LessonDynamicResponseBody<MarrowResponse<MagicModuleMetaRepoModel>> downloadMagicModuleMeta();

    MagicModuleMetaUcModel getMagicModuleMetaData(MagicModuleParentType p0);

    List<MagicModuleTimeline> getMagicModuleTimeline();

    int getTotalSolvedModules();

    boolean isMagicModuleIntroAlreadyShown();

    accessgetEmptyStatecp<MarrowResponse<MagicModuleStatusUcModel>> markComplete(String p0, McqAnswer[] p1);

    void setMagicModuleIntroShown();

    LessonDynamicResponseBody<MarrowResponse<Object>> submitFeedback(String p0, int p1, String p2, List<String> p3);

    /* JADX INFO: loaded from: classes5.dex */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class DefaultImpls {
    }

    static /* synthetic */ LessonDynamicResponseBody downloadMagicModuleDetail$default(MagicModuleUseCase magicModuleUseCase, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: downloadMagicModuleDetail");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        return magicModuleUseCase.downloadMagicModuleDetail(z);
    }
}
