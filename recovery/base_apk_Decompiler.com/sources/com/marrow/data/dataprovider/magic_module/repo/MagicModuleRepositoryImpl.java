package com.marrow.data.dataprovider.magic_module.repo;

import com.marrow.data.api.models.Failed;
import com.marrow.data.api.models.MarrowError;
import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.api.models.Success;
import com.marrow.data.dataprovider.magic_module.local.MagicModuleLocal;
import com.marrow.data.dataprovider.magic_module.local.model.MagicModuleMetaLSModel;
import com.marrow.data.dataprovider.magic_module.remote.MagicModuleRemote;
import com.marrow.data.dataprovider.magic_module.remote.model.MagicModuleFeedbackRequestBody;
import com.marrow.data.dataprovider.magic_module.remote.model.MagicModuleModel;
import com.marrow.data.dataprovider.magic_module.remote.model.MagicModuleSubmissionRequestBody;
import com.marrow.data.dataprovider.magic_module.remote.model.MagicModuleSubmissionResponseBody;
import com.marrow.data.dataprovider.magic_module.remote.model.MagicModuleTimelineRSModel;
import com.marrow.data.dataprovider.magic_module.repo.model.MagicModuleMetaRepoModel;
import com.marrow.data.dataprovider.magic_module.repo.model.MagicModuleRepoModelsKt;
import com.marrow.data.dataprovider.magic_module.usecase.model.MagicModuleMetaDataKt;
import com.marrow.data.dataprovider.magic_module.usecase.model.MagicModuleStatusUcModel;
import com.marrow.data.models.magicModule.MagicModuleTimeline;
import com.marrow.data.models.mcq.McqAnswer;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.LessonDynamicResponseBody;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.RenewEligibleCreator;
import kotlin.VideoTimelineResponseBody;
import kotlin.accessgetEmptyStatecp;
import kotlin.getAnswerMap;
import kotlin.getQues;
import kotlin.getSubjectTitle;
import kotlin.setSdkPayload;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J1\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\f0\u00192\u0006\u0010\u0003\u001a\u00020\u00162\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bH\u0016¢\u0006\u0004\b\u001d\u0010\u000fJ\u0017\u0010\u001f\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 JA\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020%0\f0\u000b2\u0006\u0010\u0003\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00162\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00160#H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020!2\u0006\u0010\u0003\u001a\u00020\u0016H\u0016¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0016H\u0016¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0010H\u0016¢\u0006\u0004\b,\u0010-J\u0019\u00100\u001a\f\u0012\b\u0012\u00060.j\u0002`/0#H\u0016¢\u0006\u0004\b0\u00101R\u0014\u00102\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105"}, d2 = {"Lcom/marrow/data/dataprovider/magic_module/repo/MagicModuleRepositoryImpl;", "Lcom/marrow/data/dataprovider/magic_module/repo/MagicModuleRepository;", "Lcom/marrow/data/dataprovider/magic_module/local/MagicModuleLocal;", "p0", "Lcom/marrow/data/dataprovider/magic_module/remote/MagicModuleRemote;", "p1", "<init>", "(Lcom/marrow/data/dataprovider/magic_module/local/MagicModuleLocal;Lcom/marrow/data/dataprovider/magic_module/remote/MagicModuleRemote;)V", "Lcom/marrow/data/dataprovider/magic_module/repo/model/MagicModuleMetaRepoModel;", "getMagicModuleMetaData", "()Lcom/marrow/data/dataprovider/magic_module/repo/model/MagicModuleMetaRepoModel;", "Lo/LessonDynamicResponseBody;", "Lcom/marrow/data/api/models/MarrowResponse;", "Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleModel;", "downloadMagicModuleModule", "()Lo/LessonDynamicResponseBody;", "", "saveMagicModuleModule", "(Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleModel;)V", "", "isDetailDownloaded", "()Z", "", "", "Lcom/marrow/data/models/mcq/McqAnswer;", "Lo/accessgetEmptyStatecp;", "Lcom/marrow/data/dataprovider/magic_module/usecase/model/MagicModuleStatusUcModel;", "markComplete", "(Ljava/lang/String;[Lcom/marrow/data/models/mcq/McqAnswer;)Lo/accessgetEmptyStatecp;", "downloadMagicModuleDetail", "Lcom/marrow/data/dataprovider/magic_module/repo/model/MagicModuleStatRepoModel;", "getMagicModuleStat", "()Lcom/marrow/data/dataprovider/magic_module/usecase/model/MagicModuleStatusUcModel;", "", "p2", "", "p3", "", "submitFeedback", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;)Lo/LessonDynamicResponseBody;", "getAnsweredMcqCount", "(Ljava/lang/String;)I", "invalidateDetail", "(Ljava/lang/String;)V", "setMagicModuleDownloadTime", "()V", "Lcom/marrow/data/models/magicModule/MagicModuleTimeline;", "Lcom/marrow/data/dataprovider/magic_module/local/model/MagicModuleTimelineLSModel;", "getMagicModuleTimeline", "()Ljava/util/List;", "magicModuleLocal", "Lcom/marrow/data/dataprovider/magic_module/local/MagicModuleLocal;", "magicModuleRemote", "Lcom/marrow/data/dataprovider/magic_module/remote/MagicModuleRemote;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MagicModuleRepositoryImpl implements MagicModuleRepository {
    private final MagicModuleLocal magicModuleLocal;
    private final MagicModuleRemote magicModuleRemote;

    @setSdkPayload
    public MagicModuleRepositoryImpl(MagicModuleLocal magicModuleLocal, MagicModuleRemote magicModuleRemote) {
        toMagicModuleMetaRepoModel.write(magicModuleLocal, "");
        toMagicModuleMetaRepoModel.write(magicModuleRemote, "");
        this.magicModuleLocal = magicModuleLocal;
        this.magicModuleRemote = magicModuleRemote;
    }

    @Override // com.marrow.data.dataprovider.magic_module.repo.MagicModuleRepository
    public final MagicModuleMetaRepoModel getMagicModuleMetaData() {
        MagicModuleMetaLSModel magicModuleMetaData = this.magicModuleLocal.getMagicModuleMetaData();
        if (magicModuleMetaData != null) {
            return MagicModuleRepoModelsKt.toMagicModuleMetaRepoModel(magicModuleMetaData);
        }
        return null;
    }

    @Override // com.marrow.data.dataprovider.magic_module.repo.MagicModuleRepository
    public final LessonDynamicResponseBody<MarrowResponse<MagicModuleModel>> downloadMagicModuleModule() {
        return this.magicModuleRemote.fetchMagicModuleMeta();
    }

    @Override // com.marrow.data.dataprovider.magic_module.repo.MagicModuleRepository
    public final void saveMagicModuleModule(MagicModuleModel p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.magicModuleLocal.saveMagicModuleModel(p0);
    }

    @Override // com.marrow.data.dataprovider.magic_module.repo.MagicModuleRepository
    public final boolean isDetailDownloaded() {
        int magicModuleSavedMcqCount;
        MagicModuleMetaLSModel magicModuleMetaData = this.magicModuleLocal.getMagicModuleMetaData();
        return (magicModuleMetaData == null || (magicModuleSavedMcqCount = this.magicModuleLocal.getMagicModuleSavedMcqCount(magicModuleMetaData.getId())) == 0 || magicModuleSavedMcqCount != magicModuleMetaData.getMcqCount()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarrowResponse markComplete$lambda$2(getAnswerMap getanswermap, Object obj) {
        toMagicModuleMetaRepoModel.write(obj, "");
        return (MarrowResponse) getanswermap.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarrowResponse markComplete$lambda$1(String str, MagicModuleRepositoryImpl magicModuleRepositoryImpl, MarrowResponse marrowResponse) {
        toMagicModuleMetaRepoModel.write(marrowResponse, "");
        if (marrowResponse instanceof Failed) {
            return new Failed(((Failed) marrowResponse).getError());
        }
        if (marrowResponse instanceof MarrowError) {
            return new MarrowError(((MarrowError) marrowResponse).getThrowable());
        }
        if (!(marrowResponse instanceof Success)) {
            throw new RenewEligibleCreator();
        }
        Success success = (Success) marrowResponse;
        MagicModuleStatusUcModel magicModuleStatsLSModel = MagicModuleMetaDataKt.toMagicModuleStatsLSModel((MagicModuleSubmissionResponseBody) success.getData(), str);
        magicModuleRepositoryImpl.magicModuleLocal.saveMagicModuleModel(((MagicModuleSubmissionResponseBody) success.getData()).getModuleData());
        magicModuleRepositoryImpl.magicModuleLocal.saveMagicModuleStats(magicModuleStatsLSModel);
        List<MagicModuleTimelineRSModel> timeline = ((MagicModuleSubmissionResponseBody) success.getData()).getTimeline();
        if (timeline != null) {
            magicModuleRepositoryImpl.magicModuleLocal.saveMagicModuleTimeline(MagicModuleMetaDataKt.toMagicModuleTimelineIndexLSModel(timeline));
        }
        return new Success(MagicModuleMetaDataKt.toMagicModuleStatusUcModel((MagicModuleSubmissionResponseBody) success.getData(), str));
    }

    @Override // com.marrow.data.dataprovider.magic_module.repo.MagicModuleRepository
    public final LessonDynamicResponseBody<MarrowResponse<MagicModuleModel>> downloadMagicModuleDetail() {
        String id;
        MagicModuleMetaLSModel magicModuleMetaData = this.magicModuleLocal.getMagicModuleMetaData();
        if (magicModuleMetaData == null || (id = magicModuleMetaData.getId()) == null) {
            throw new IllegalArgumentException("Smart recall module not found");
        }
        LessonDynamicResponseBody<MarrowResponse<MagicModuleModel>> lessonDynamicResponseBodyDownloadMagicModuleDetail = this.magicModuleRemote.downloadMagicModuleDetail(id);
        final getAnswerMap getanswermap = new getAnswerMap() { // from class: com.marrow.data.dataprovider.magic_module.repo.MagicModuleRepositoryImpl$$ExternalSyntheticLambda0
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return MagicModuleRepositoryImpl.downloadMagicModuleDetail$lambda$0(this.f$0, (MarrowResponse) obj);
            }
        };
        LessonDynamicResponseBody lessonDynamicResponseBody = lessonDynamicResponseBodyDownloadMagicModuleDetail.read(new getSubjectTitle() { // from class: com.marrow.data.dataprovider.magic_module.repo.MagicModuleRepositoryImpl$$ExternalSyntheticLambda1
            @Override // kotlin.getSubjectTitle
            public final Object apply(Object obj) {
                return MagicModuleRepositoryImpl.downloadMagicModuleDetail$lambda$1(getanswermap, obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lessonDynamicResponseBody, "");
        return lessonDynamicResponseBody;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarrowResponse downloadMagicModuleDetail$lambda$1(getAnswerMap getanswermap, Object obj) {
        toMagicModuleMetaRepoModel.write(obj, "");
        return (MarrowResponse) getanswermap.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarrowResponse downloadMagicModuleDetail$lambda$0(MagicModuleRepositoryImpl magicModuleRepositoryImpl, MarrowResponse marrowResponse) {
        toMagicModuleMetaRepoModel.write(marrowResponse, "");
        if (!(marrowResponse instanceof Failed) && !(marrowResponse instanceof MarrowError)) {
            if (!(marrowResponse instanceof Success)) {
                throw new RenewEligibleCreator();
            }
            Success success = (Success) marrowResponse;
            magicModuleRepositoryImpl.magicModuleLocal.saveMagicModuleModel((MagicModuleModel) success.getData());
            List<MagicModuleTimelineRSModel> timeline = ((MagicModuleModel) success.getData()).getTimeline();
            if (timeline != null) {
                magicModuleRepositoryImpl.magicModuleLocal.saveMagicModuleTimeline(MagicModuleMetaDataKt.toMagicModuleTimelineIndexLSModel(timeline));
            }
        }
        return marrowResponse;
    }

    @Override // com.marrow.data.dataprovider.magic_module.repo.MagicModuleRepository
    public final MagicModuleStatusUcModel getMagicModuleStat() {
        return this.magicModuleLocal.getMagicModuleStats();
    }

    @Override // com.marrow.data.dataprovider.magic_module.repo.MagicModuleRepository
    public final LessonDynamicResponseBody<MarrowResponse<Object>> submitFeedback(String p0, int p1, String p2, List<String> p3) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        return this.magicModuleRemote.submitMagicModuleFeedback(p0, new MagicModuleFeedbackRequestBody(p1, p2, p3));
    }

    @Override // com.marrow.data.dataprovider.magic_module.repo.MagicModuleRepository
    public final int getAnsweredMcqCount(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return this.magicModuleLocal.getAnsweredMcqCount(p0);
    }

    @Override // com.marrow.data.dataprovider.magic_module.repo.MagicModuleRepository
    public final void invalidateDetail(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.magicModuleLocal.invalidateDetail(p0);
    }

    @Override // com.marrow.data.dataprovider.magic_module.repo.MagicModuleRepository
    public final void setMagicModuleDownloadTime() {
        this.magicModuleLocal.setMagicModuleDownloadTime();
    }

    @Override // com.marrow.data.dataprovider.magic_module.repo.MagicModuleRepository
    public final List<MagicModuleTimeline> getMagicModuleTimeline() {
        return this.magicModuleLocal.getMagicModuleTimeline();
    }

    @Override // com.marrow.data.dataprovider.magic_module.repo.MagicModuleRepository
    public final accessgetEmptyStatecp<MarrowResponse<MagicModuleStatusUcModel>> markComplete(final String p0, McqAnswer[] p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap(getQues.write(VideoTimelineResponseBody.read(p1.length), 16));
        for (McqAnswer mcqAnswer : p1) {
            Pair pair = new Pair(mcqAnswer.getMcqId(), Integer.valueOf(mcqAnswer.getSelectedAnswer()));
            linkedHashMap.put(pair.write(), pair.IconCompatParcelizer());
        }
        accessgetEmptyStatecp<MarrowResponse<MagicModuleSubmissionResponseBody>> accessgetemptystatecpSubmitMagicModuleAnswers = this.magicModuleRemote.submitMagicModuleAnswers(p0, new MagicModuleSubmissionRequestBody(linkedHashMap));
        final getAnswerMap getanswermap = new getAnswerMap() { // from class: com.marrow.data.dataprovider.magic_module.repo.MagicModuleRepositoryImpl$$ExternalSyntheticLambda2
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return MagicModuleRepositoryImpl.markComplete$lambda$1(p0, this, (MarrowResponse) obj);
            }
        };
        accessgetEmptyStatecp accessgetemptystatecpRemoteActionCompatParcelizer = accessgetemptystatecpSubmitMagicModuleAnswers.RemoteActionCompatParcelizer(new getSubjectTitle() { // from class: com.marrow.data.dataprovider.magic_module.repo.MagicModuleRepositoryImpl$$ExternalSyntheticLambda3
            @Override // kotlin.getSubjectTitle
            public final Object apply(Object obj) {
                return MagicModuleRepositoryImpl.markComplete$lambda$2(getanswermap, obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(accessgetemptystatecpRemoteActionCompatParcelizer, "");
        return accessgetemptystatecpRemoteActionCompatParcelizer;
    }
}
