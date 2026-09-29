package com.marrow.data.dataprovider.magic_module.local;

import com.marrow.data.api.models.response.mcq.McqResponseBody;
import com.marrow.data.dataprovider.magic_module.local.model.MagicModuleMetaLSModel;
import com.marrow.data.dataprovider.magic_module.remote.model.MagicModuleModel;
import com.marrow.data.dataprovider.magic_module.remote.model.MagicModuleRSModelsKt;
import com.marrow.data.dataprovider.magic_module.remote.model.MagicModuleStatsRSModel;
import com.marrow.data.dataprovider.magic_module.usecase.model.MagicModuleMetaDataKt;
import com.marrow.data.dataprovider.magic_module.usecase.model.MagicModuleStatusUcModel;
import com.marrow.data.models.magicModule.MagicModuleTimeline;
import com.marrow.data.models.mcq.McqAnswer;
import com.marrow.data.models.mcq.McqParentInfo;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.DashMediaSource1;
import kotlin.DefaultDashChunkSourceRepresentationSegmentIterator;
import kotlin.Metadata;
import kotlin.ServerSideAdInsertionMediaSourceAdPlaybackStateUpdater;
import kotlin.VideoTimelineResponseBody;
import kotlin.getStreamPositionUsForContent;
import kotlin.onInitializationFailed;
import kotlin.setCompositeSequenceableLoaderFactory;
import kotlin.setManifestParser;
import kotlin.setSdkPayload;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001d\u001a\u00020\u00142\n\u0010\u0003\u001a\u00060\u001bj\u0002`\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\n\u0018\u00010\u001bj\u0004\u0018\u0001`\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0017H\u0016¢\u0006\u0004\b!\u0010\u001aJ\u0017\u0010\"\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0014H\u0016¢\u0006\u0004\b$\u0010%J!\u0010)\u001a\u00020\u00142\u0010\u0010\u0003\u001a\f\u0012\b\u0012\u00060'j\u0002`(0&H\u0016¢\u0006\u0004\b)\u0010*J\u0019\u0010+\u001a\f\u0012\b\u0012\u00060'j\u0002`(0&H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00101\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00105\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108"}, d2 = {"Lcom/marrow/data/dataprovider/magic_module/local/MagicModuleLocalImpl;", "Lcom/marrow/data/dataprovider/magic_module/local/MagicModuleLocal;", "Lo/getStreamPositionUsForContent;", "p0", "Lo/ServerSideAdInsertionMediaSourceAdPlaybackStateUpdater;", "p1", "Lo/setManifestParser;", "p2", "Lo/onInitializationFailed;", "p3", "Lo/setCompositeSequenceableLoaderFactory;", "p4", "Lo/DashMediaSource1;", "p5", "<init>", "(Lo/getStreamPositionUsForContent;Lo/ServerSideAdInsertionMediaSourceAdPlaybackStateUpdater;Lo/setManifestParser;Lo/onInitializationFailed;Lo/setCompositeSequenceableLoaderFactory;Lo/DashMediaSource1;)V", "Lcom/marrow/data/dataprovider/magic_module/local/model/MagicModuleMetaLSModel;", "getMagicModuleMetaData", "()Lcom/marrow/data/dataprovider/magic_module/local/model/MagicModuleMetaLSModel;", "Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleModel;", "", "saveMagicModuleModel", "(Lcom/marrow/data/dataprovider/magic_module/remote/model/MagicModuleModel;)V", "", "", "getMagicModuleSavedMcqCount", "(Ljava/lang/String;)I", "Lcom/marrow/data/dataprovider/magic_module/usecase/model/MagicModuleStatusUcModel;", "Lcom/marrow/data/dataprovider/magic_module/usecase/model/MagicModuleStatsLSModel;", "saveMagicModuleStats", "(Lcom/marrow/data/dataprovider/magic_module/usecase/model/MagicModuleStatusUcModel;)V", "getMagicModuleStats", "()Lcom/marrow/data/dataprovider/magic_module/usecase/model/MagicModuleStatusUcModel;", "getAnsweredMcqCount", "invalidateDetail", "(Ljava/lang/String;)V", "setMagicModuleDownloadTime", "()V", "", "Lcom/marrow/data/models/magicModule/MagicModuleTimeline;", "Lcom/marrow/data/dataprovider/magic_module/local/model/MagicModuleTimelineLSModel;", "saveMagicModuleTimeline", "(Ljava/util/List;)V", "getMagicModuleTimeline", "()Ljava/util/List;", "prefRepository", "Lo/getStreamPositionUsForContent;", "mcqDataProviderLocal", "Lo/ServerSideAdInsertionMediaSourceAdPlaybackStateUpdater;", "mcqParentTable", "Lo/setManifestParser;", "mcqAnswerTable", "Lo/onInitializationFailed;", "mcqIndexTable", "Lo/setCompositeSequenceableLoaderFactory;", "magicModuleTimelineIndexTable", "Lo/DashMediaSource1;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MagicModuleLocalImpl implements MagicModuleLocal {
    private final DashMediaSource1 magicModuleTimelineIndexTable;
    private final onInitializationFailed mcqAnswerTable;
    private final ServerSideAdInsertionMediaSourceAdPlaybackStateUpdater mcqDataProviderLocal;
    private final setCompositeSequenceableLoaderFactory mcqIndexTable;
    private final setManifestParser mcqParentTable;
    private final getStreamPositionUsForContent prefRepository;

    @setSdkPayload
    public MagicModuleLocalImpl(getStreamPositionUsForContent getstreampositionusforcontent, ServerSideAdInsertionMediaSourceAdPlaybackStateUpdater serverSideAdInsertionMediaSourceAdPlaybackStateUpdater, setManifestParser setmanifestparser, onInitializationFailed oninitializationfailed, setCompositeSequenceableLoaderFactory setcompositesequenceableloaderfactory, DashMediaSource1 dashMediaSource1) {
        toMagicModuleMetaRepoModel.write(getstreampositionusforcontent, "");
        toMagicModuleMetaRepoModel.write(serverSideAdInsertionMediaSourceAdPlaybackStateUpdater, "");
        toMagicModuleMetaRepoModel.write(setmanifestparser, "");
        toMagicModuleMetaRepoModel.write(oninitializationfailed, "");
        toMagicModuleMetaRepoModel.write(setcompositesequenceableloaderfactory, "");
        toMagicModuleMetaRepoModel.write(dashMediaSource1, "");
        this.prefRepository = getstreampositionusforcontent;
        this.mcqDataProviderLocal = serverSideAdInsertionMediaSourceAdPlaybackStateUpdater;
        this.mcqParentTable = setmanifestparser;
        this.mcqAnswerTable = oninitializationfailed;
        this.mcqIndexTable = setcompositesequenceableloaderfactory;
        this.magicModuleTimelineIndexTable = dashMediaSource1;
    }

    @Override // com.marrow.data.dataprovider.magic_module.local.MagicModuleLocal
    public final MagicModuleMetaLSModel getMagicModuleMetaData() {
        return this.prefRepository.PlaybackStateCompatCustomAction();
    }

    @Override // com.marrow.data.dataprovider.magic_module.local.MagicModuleLocal
    public final void saveMagicModuleModel(MagicModuleModel p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        MagicModuleMetaLSModel magicModuleMetaLSModelPlaybackStateCompatCustomAction = this.prefRepository.PlaybackStateCompatCustomAction();
        if (magicModuleMetaLSModelPlaybackStateCompatCustomAction != null && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) magicModuleMetaLSModelPlaybackStateCompatCustomAction.getId(), (Object) p0.getId())) {
            this.mcqAnswerTable.read("parent_id", magicModuleMetaLSModelPlaybackStateCompatCustomAction.getId());
            this.mcqParentTable.read("parent_id", magicModuleMetaLSModelPlaybackStateCompatCustomAction.getId());
        }
        this.prefRepository.RemoteActionCompatParcelizer(MagicModuleRSModelsKt.toMagicModuleMetaLSModel(p0));
        List<McqResponseBody> mcqResponseList = p0.getMcqResponseList();
        List<McqResponseBody> list = mcqResponseList;
        if (list == null || list.isEmpty()) {
            return;
        }
        Iterator<T> it = mcqResponseList.iterator();
        while (it.hasNext()) {
            ((McqResponseBody) it.next()).setDontConsider(true);
        }
        List<McqParentInfo> listIconCompatParcelizer = DefaultDashChunkSourceRepresentationSegmentIterator.IconCompatParcelizer(mcqResponseList, McqParentInfo.PARENT_TYPE_MAGIC_MODULE, p0.getId());
        String id = p0.getId();
        Map<String, Integer> answerMap = p0.getAnswerMap();
        if (answerMap == null) {
            answerMap = VideoTimelineResponseBody.read();
        }
        List<McqAnswer> listAudioAttributesCompatParcelizer = DefaultDashChunkSourceRepresentationSegmentIterator.AudioAttributesCompatParcelizer(mcqResponseList, id, answerMap);
        MagicModuleStatsRSModel magicModuleRsStat = p0.getMagicModuleRsStat();
        if (magicModuleRsStat != null) {
            saveMagicModuleStats(MagicModuleMetaDataKt.toMagicModuleStatsLSModel(magicModuleRsStat, p0.getId()));
        }
        this.mcqParentTable.IconCompatParcelizer(listIconCompatParcelizer.toArray(new McqParentInfo[0]));
        this.mcqAnswerTable.IconCompatParcelizer(listAudioAttributesCompatParcelizer.toArray(new McqAnswer[0]));
        this.mcqIndexTable.IconCompatParcelizer(list.toArray(new McqResponseBody[0]));
    }

    @Override // com.marrow.data.dataprovider.magic_module.local.MagicModuleLocal
    public final int getMagicModuleSavedMcqCount(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return this.mcqDataProviderLocal.AudioAttributesCompatParcelizer(p0);
    }

    @Override // com.marrow.data.dataprovider.magic_module.local.MagicModuleLocal
    public final void saveMagicModuleStats(MagicModuleStatusUcModel p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.prefRepository.RemoteActionCompatParcelizer(p0);
    }

    @Override // com.marrow.data.dataprovider.magic_module.local.MagicModuleLocal
    public final MagicModuleStatusUcModel getMagicModuleStats() {
        return this.prefRepository.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
    }

    @Override // com.marrow.data.dataprovider.magic_module.local.MagicModuleLocal
    public final int getAnsweredMcqCount(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return this.mcqAnswerTable.MediaMetadataCompat(p0);
    }

    @Override // com.marrow.data.dataprovider.magic_module.local.MagicModuleLocal
    public final void invalidateDetail(String p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.mcqAnswerTable.read("parent_id", p0);
        this.mcqParentTable.read("parent_id", p0);
        this.prefRepository.onFastForward();
        this.prefRepository.onPause();
    }

    @Override // com.marrow.data.dataprovider.magic_module.local.MagicModuleLocal
    public final void setMagicModuleDownloadTime() {
        this.prefRepository.getActivityResultRegistry();
    }

    @Override // com.marrow.data.dataprovider.magic_module.local.MagicModuleLocal
    public final void saveMagicModuleTimeline(List<MagicModuleTimeline> p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.magicModuleTimelineIndexTable.ah_();
        this.magicModuleTimelineIndexTable.IconCompatParcelizer(p0.toArray(new MagicModuleTimeline[0]));
    }

    @Override // com.marrow.data.dataprovider.magic_module.local.MagicModuleLocal
    public final List<MagicModuleTimeline> getMagicModuleTimeline() {
        List<MagicModuleTimeline> listWrite = this.magicModuleTimelineIndexTable.write();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listWrite, "");
        return listWrite;
    }
}
