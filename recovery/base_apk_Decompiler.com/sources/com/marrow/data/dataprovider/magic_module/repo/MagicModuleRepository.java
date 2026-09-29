package com.marrow.data.dataprovider.magic_module.repo;

import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.dataprovider.magic_module.remote.model.MagicModuleModel;
import com.marrow.data.dataprovider.magic_module.repo.model.MagicModuleMetaRepoModel;
import com.marrow.data.dataprovider.magic_module.usecase.model.MagicModuleStatusUcModel;
import com.marrow.data.models.magicModule.MagicModuleTimeline;
import com.marrow.data.models.mcq.McqAnswer;
import java.util.List;
import kotlin.LessonDynamicResponseBody;
import kotlin.Metadata;
import kotlin.accessgetEmptyStatecp;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tH&¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\tH&¢\u0006\u0004\b\u000e\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000bH&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&¢\u0006\u0004\b\u0014\u0010\u0015J1\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\n0\u001a2\u0006\u0010\u000f\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H&¢\u0006\u0004\b\u001b\u0010\u001cJA\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\n0\t2\u0006\u0010\u000f\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00162\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00160\u001fH&¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\u001d2\u0006\u0010\u000f\u001a\u00020\u0016H&¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0016H&¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0010H&¢\u0006\u0004\b'\u0010(J\u0019\u0010+\u001a\f\u0012\b\u0012\u00060)j\u0002`*0\u001fH&¢\u0006\u0004\b+\u0010,À\u0006\u0003"}, d2 = {"Lcom/marrow/data/dataprovider/magic_module/repo/MagicModuleRepository;", "", "Lcom/marrow/data/dataprovider/magic_module/repo/model/MagicModuleMetaRepoModel;", "getMagicModuleMetaData", "()Lcom/marrow/data/dataprovider/magic_module/repo/model/MagicModuleMetaRepoModel;", "Lcom/marrow/data/dataprovider/magic_module/usecase/model/MagicModuleStatusUcModel;", "Lcom/marrow/data/dataprovider/magic_module/repo/model/MagicModuleStatRepoModel;", "getMagicModuleStat", "()Lcom/marrow/data/dataprovider/magic_module/usecase/model/MagicModuleStatusUcModel;", "Lo/LessonDynamicResponseBody;", "Lcom/marrow/data/api/models/MarrowResponse;", "Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleModel;", "downloadMagicModuleDetail", "()Lo/LessonDynamicResponseBody;", "downloadMagicModuleModule", "p0", "", "saveMagicModuleModule", "(Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleModel;)V", "", "isDetailDownloaded", "()Z", "", "", "Lcom/marrow/data/models/mcq/McqAnswer;", "p1", "Lo/accessgetEmptyStatecp;", "markComplete", "(Ljava/lang/String;[Lcom/marrow/data/models/mcq/McqAnswer;)Lo/accessgetEmptyStatecp;", "", "p2", "", "p3", "submitFeedback", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;)Lo/LessonDynamicResponseBody;", "getAnsweredMcqCount", "(Ljava/lang/String;)I", "invalidateDetail", "(Ljava/lang/String;)V", "setMagicModuleDownloadTime", "()V", "Lcom/marrow/data/models/magicModule/MagicModuleTimeline;", "Lcom/marrow/data/dataprovider/magic_module/local/model/MagicModuleTimelineLSModel;", "getMagicModuleTimeline", "()Ljava/util/List;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MagicModuleRepository {
    LessonDynamicResponseBody<MarrowResponse<MagicModuleModel>> downloadMagicModuleDetail();

    LessonDynamicResponseBody<MarrowResponse<MagicModuleModel>> downloadMagicModuleModule();

    int getAnsweredMcqCount(String p0);

    MagicModuleMetaRepoModel getMagicModuleMetaData();

    MagicModuleStatusUcModel getMagicModuleStat();

    List<MagicModuleTimeline> getMagicModuleTimeline();

    void invalidateDetail(String p0);

    boolean isDetailDownloaded();

    accessgetEmptyStatecp<MarrowResponse<MagicModuleStatusUcModel>> markComplete(String p0, McqAnswer[] p1);

    void saveMagicModuleModule(MagicModuleModel p0);

    void setMagicModuleDownloadTime();

    LessonDynamicResponseBody<MarrowResponse<Object>> submitFeedback(String p0, int p1, String p2, List<String> p3);
}
