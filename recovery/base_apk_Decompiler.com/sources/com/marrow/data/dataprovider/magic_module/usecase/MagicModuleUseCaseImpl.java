package com.marrow.data.dataprovider.magic_module.usecase;

import com.marrow.data.api.models.Failed;
import com.marrow.data.api.models.MarrowError;
import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.dataprovider.magic_module.remote.model.MagicModuleModel;
import com.marrow.data.dataprovider.magic_module.repo.MagicModuleRepository;
import com.marrow.data.dataprovider.magic_module.repo.model.MagicModuleMetaRepoModel;
import com.marrow.data.dataprovider.magic_module.usecase.model.MagicModuleMetaDataKt;
import com.marrow.data.dataprovider.magic_module.usecase.model.MagicModuleMetaUcModel;
import com.marrow.data.dataprovider.magic_module.usecase.model.MagicModuleStatusUcModel;
import com.marrow.data.models.ResponseError;
import com.marrow.data.models.magicModule.MagicModuleTimeline;
import com.marrow.data.models.mcq.McqAnswer;
import com.marrow.data.utils.product.exceptions.ResponseErrorException;
import java.util.ArrayList;
import java.util.List;
import kotlin.BundledChunkExtractor;
import kotlin.ChunkHolder;
import kotlin.LessonDynamicResponseBody;
import kotlin.Metadata;
import kotlin.accessgetEmptyStatecp;
import kotlin.getAnswerMap;
import kotlin.getSubjectTitle;
import kotlin.setSdkPayload;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.withLastAdRemoved;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B)\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0003\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00110\u00102\u0006\u0010\u0003\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00110\u001c2\u0006\u0010\u0003\u001a\u00020\u00192\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJA\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00110\u00102\u0006\u0010\u0003\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020 2\u0006\u0010\u0007\u001a\u00020\u00192\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00190!H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0015H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u0019\u0010,\u001a\f\u0012\b\u0012\u00060*j\u0002`+0!H\u0016¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020 H\u0016¢\u0006\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00102\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00106\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107"}, d2 = {"Lcom/marrow/data/dataprovider/magic_module/usecase/MagicModuleUseCaseImpl;", "Lcom/marrow/data/dataprovider/magic_module/usecase/MagicModuleUseCase;", "Lcom/marrow/data/dataprovider/magic_module/repo/MagicModuleRepository;", "p0", "Lo/ChunkHolder;", "p1", "Lo/withLastAdRemoved;", "p2", "Lo/BundledChunkExtractor;", "p3", "<init>", "(Lcom/marrow/data/dataprovider/magic_module/repo/MagicModuleRepository;Lo/ChunkHolder;Lo/withLastAdRemoved;Lo/BundledChunkExtractor;)V", "Lcom/marrow/data/dataprovider/magic_module/usecase/MagicModuleParentType;", "Lcom/marrow/data/dataprovider/magic_module/usecase/model/MagicModuleMetaUcModel;", "getMagicModuleMetaData", "(Lcom/marrow/data/dataprovider/magic_module/usecase/MagicModuleParentType;)Lcom/marrow/data/dataprovider/magic_module/usecase/model/MagicModuleMetaUcModel;", "Lo/LessonDynamicResponseBody;", "Lcom/marrow/data/api/models/MarrowResponse;", "Lcom/marrow/data/dataprovider/magic_module/repo/model/MagicModuleMetaRepoModel;", "downloadMagicModuleMeta", "()Lo/LessonDynamicResponseBody;", "", "Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleModel;", "downloadMagicModuleDetail", "(Z)Lo/LessonDynamicResponseBody;", "", "", "Lcom/marrow/data/models/mcq/McqAnswer;", "Lo/accessgetEmptyStatecp;", "Lcom/marrow/data/dataprovider/magic_module/usecase/model/MagicModuleStatusUcModel;", "markComplete", "(Ljava/lang/String;[Lcom/marrow/data/models/mcq/McqAnswer;)Lo/accessgetEmptyStatecp;", "", "", "", "submitFeedback", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;)Lo/LessonDynamicResponseBody;", "isMagicModuleIntroAlreadyShown", "()Z", "", "setMagicModuleIntroShown", "()V", "Lcom/marrow/data/models/magicModule/MagicModuleTimeline;", "Lcom/marrow/data/dataprovider/magic_module/usecase/model/MagicModuleTimelineUCModel;", "getMagicModuleTimeline", "()Ljava/util/List;", "getTotalSolvedModules", "()I", "magicModuleRepository", "Lcom/marrow/data/dataprovider/magic_module/repo/MagicModuleRepository;", "subscriptionRepository", "Lo/ChunkHolder;", "courseConfigRepository", "Lo/withLastAdRemoved;", "preferenceDataProvider", "Lo/BundledChunkExtractor;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MagicModuleUseCaseImpl implements MagicModuleUseCase {
    private final withLastAdRemoved courseConfigRepository;
    private final MagicModuleRepository magicModuleRepository;
    private final BundledChunkExtractor preferenceDataProvider;
    private final ChunkHolder subscriptionRepository;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MagicModuleParentType.values().length];
            try {
                iArr[MagicModuleParentType.HOME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MagicModuleParentType.CUSTOM_MODULE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @setSdkPayload
    public MagicModuleUseCaseImpl(MagicModuleRepository magicModuleRepository, ChunkHolder chunkHolder, withLastAdRemoved withlastadremoved, BundledChunkExtractor bundledChunkExtractor) {
        toMagicModuleMetaRepoModel.write(magicModuleRepository, "");
        toMagicModuleMetaRepoModel.write(chunkHolder, "");
        toMagicModuleMetaRepoModel.write(withlastadremoved, "");
        toMagicModuleMetaRepoModel.write(bundledChunkExtractor, "");
        this.magicModuleRepository = magicModuleRepository;
        this.subscriptionRepository = chunkHolder;
        this.courseConfigRepository = withlastadremoved;
        this.preferenceDataProvider = bundledChunkExtractor;
    }

    @Override // com.marrow.data.dataprovider.magic_module.usecase.MagicModuleUseCase
    public final MagicModuleMetaUcModel getMagicModuleMetaData(MagicModuleParentType p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        MagicModuleMetaRepoModel magicModuleMetaData = this.magicModuleRepository.getMagicModuleMetaData();
        if (magicModuleMetaData == null || !this.subscriptionRepository.IconCompatParcelizer("mcq") || !this.courseConfigRepository.IconCompatParcelizer().isMagicModuleEnabled()) {
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[p0.ordinal()];
        if (i == 1) {
            return MagicModuleMetaDataKt.toMagicModuleMetaDataUcModel(magicModuleMetaData, this.magicModuleRepository.getMagicModuleStat(), this.magicModuleRepository.getAnsweredMcqCount(magicModuleMetaData.getId()), !magicModuleMetaData.isFirstModule() && magicModuleMetaData.getStatus() == 0 && this.preferenceDataProvider.getOnBackPressedDispatcher());
        }
        if (i != 2) {
            return null;
        }
        return MagicModuleMetaDataKt.toMagicModuleMetaDataUcModel$default(magicModuleMetaData, this.magicModuleRepository.getMagicModuleStat(), this.magicModuleRepository.getAnsweredMcqCount(magicModuleMetaData.getId()), false, 4, null);
    }

    @Override // com.marrow.data.dataprovider.magic_module.usecase.MagicModuleUseCase
    public final LessonDynamicResponseBody<MarrowResponse<MagicModuleMetaRepoModel>> downloadMagicModuleMeta() {
        if (!this.subscriptionRepository.IconCompatParcelizer("mcq")) {
            LessonDynamicResponseBody<MarrowResponse<MagicModuleMetaRepoModel>> lessonDynamicResponseBodyRemoteActionCompatParcelizer = LessonDynamicResponseBody.RemoteActionCompatParcelizer(new Failed(new ResponseError(ResponseError.NO_INTERNET_ERROR, "Locked for free users", false, 4, null)));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lessonDynamicResponseBodyRemoteActionCompatParcelizer, "");
            return lessonDynamicResponseBodyRemoteActionCompatParcelizer;
        }
        final MagicModuleMetaRepoModel magicModuleMetaData = this.magicModuleRepository.getMagicModuleMetaData();
        LessonDynamicResponseBody<MarrowResponse<MagicModuleModel>> lessonDynamicResponseBodyDownloadMagicModuleModule = this.magicModuleRepository.downloadMagicModuleModule();
        final getAnswerMap getanswermap = new getAnswerMap() { // from class: com.marrow.data.dataprovider.magic_module.usecase.MagicModuleUseCaseImpl$$ExternalSyntheticLambda0
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return MagicModuleUseCaseImpl.downloadMagicModuleMeta$lambda$0(magicModuleMetaData, this, (MarrowResponse) obj);
            }
        };
        LessonDynamicResponseBody lessonDynamicResponseBody = lessonDynamicResponseBodyDownloadMagicModuleModule.read(new getSubjectTitle() { // from class: com.marrow.data.dataprovider.magic_module.usecase.MagicModuleUseCaseImpl$$ExternalSyntheticLambda1
            @Override // kotlin.getSubjectTitle
            public final Object apply(Object obj) {
                return MagicModuleUseCaseImpl.downloadMagicModuleMeta$lambda$1(getanswermap, obj);
            }
        });
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lessonDynamicResponseBody, "");
        return lessonDynamicResponseBody;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MarrowResponse downloadMagicModuleMeta$lambda$1(getAnswerMap getanswermap, Object obj) {
        toMagicModuleMetaRepoModel.write(obj, "");
        return (MarrowResponse) getanswermap.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.marrow.data.api.models.MarrowResponse downloadMagicModuleMeta$lambda$0(com.marrow.data.dataprovider.magic_module.repo.model.MagicModuleMetaRepoModel r3, com.marrow.data.dataprovider.magic_module.usecase.MagicModuleUseCaseImpl r4, com.marrow.data.api.models.MarrowResponse r5) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.data.dataprovider.magic_module.usecase.MagicModuleUseCaseImpl.downloadMagicModuleMeta$lambda$0(com.marrow.data.dataprovider.magic_module.repo.model.MagicModuleMetaRepoModel, com.marrow.data.dataprovider.magic_module.usecase.MagicModuleUseCaseImpl, com.marrow.data.api.models.MarrowResponse):com.marrow.data.api.models.MarrowResponse");
    }

    @Override // com.marrow.data.dataprovider.magic_module.usecase.MagicModuleUseCase
    public final LessonDynamicResponseBody<MarrowResponse<MagicModuleModel>> downloadMagicModuleDetail(boolean p0) {
        if (!this.subscriptionRepository.IconCompatParcelizer("mcq")) {
            LessonDynamicResponseBody<MarrowResponse<MagicModuleModel>> lessonDynamicResponseBodyRemoteActionCompatParcelizer = LessonDynamicResponseBody.RemoteActionCompatParcelizer(new MarrowError(new IllegalArgumentException("Locked for free users")));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lessonDynamicResponseBodyRemoteActionCompatParcelizer, "");
            return lessonDynamicResponseBodyRemoteActionCompatParcelizer;
        }
        if (!p0 && this.magicModuleRepository.isDetailDownloaded()) {
            LessonDynamicResponseBody<MarrowResponse<MagicModuleModel>> lessonDynamicResponseBodyRemoteActionCompatParcelizer2 = LessonDynamicResponseBody.RemoteActionCompatParcelizer(new MarrowError(new ResponseErrorException(new ResponseError(200, "module is ready", false, 4, null))));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lessonDynamicResponseBodyRemoteActionCompatParcelizer2, "");
            return lessonDynamicResponseBodyRemoteActionCompatParcelizer2;
        }
        return this.magicModuleRepository.downloadMagicModuleDetail();
    }

    @Override // com.marrow.data.dataprovider.magic_module.usecase.MagicModuleUseCase
    public final accessgetEmptyStatecp<MarrowResponse<MagicModuleStatusUcModel>> markComplete(String p0, McqAnswer[] p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        if (!this.subscriptionRepository.IconCompatParcelizer("mcq")) {
            accessgetEmptyStatecp<MarrowResponse<MagicModuleStatusUcModel>> accessgetemptystatecp = accessgetEmptyStatecp.read(new MarrowError(new IllegalArgumentException("Locked for free users")));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(accessgetemptystatecp, "");
            return accessgetemptystatecp;
        }
        return this.magicModuleRepository.markComplete(p0, p1);
    }

    @Override // com.marrow.data.dataprovider.magic_module.usecase.MagicModuleUseCase
    public final LessonDynamicResponseBody<MarrowResponse<Object>> submitFeedback(String p0, int p1, String p2, List<String> p3) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        return this.magicModuleRepository.submitFeedback(p0, p1, p2, p3);
    }

    @Override // com.marrow.data.dataprovider.magic_module.usecase.MagicModuleUseCase
    public final boolean isMagicModuleIntroAlreadyShown() {
        return this.preferenceDataProvider.addObserverForBackInvokerlambda7();
    }

    @Override // com.marrow.data.dataprovider.magic_module.usecase.MagicModuleUseCase
    public final void setMagicModuleIntroShown() {
        this.preferenceDataProvider.addOnTrimMemoryListener();
    }

    @Override // com.marrow.data.dataprovider.magic_module.usecase.MagicModuleUseCase
    public final List<MagicModuleTimeline> getMagicModuleTimeline() {
        ArrayList arrayList = new ArrayList();
        List<MagicModuleTimeline> magicModuleTimeline = this.magicModuleRepository.getMagicModuleTimeline();
        if (magicModuleTimeline != null && !magicModuleTimeline.isEmpty()) {
            arrayList.addAll(this.magicModuleRepository.getMagicModuleTimeline());
            int totalSolvedModules = getTotalSolvedModules();
            StringBuilder sb = new StringBuilder("Module ");
            sb.append(totalSolvedModules + 1);
            arrayList.add(new MagicModuleTimeline("", sb.toString(), 0, 0, 0L));
        }
        return arrayList;
    }

    @Override // com.marrow.data.dataprovider.magic_module.usecase.MagicModuleUseCase
    public final int getTotalSolvedModules() {
        MagicModuleStatusUcModel magicModuleStat = this.magicModuleRepository.getMagicModuleStat();
        if (magicModuleStat != null) {
            return magicModuleStat.getModulesCompleted();
        }
        return 0;
    }
}
