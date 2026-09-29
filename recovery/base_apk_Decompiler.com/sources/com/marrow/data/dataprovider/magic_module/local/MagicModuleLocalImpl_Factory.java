package com.marrow.data.dataprovider.magic_module.local;

import kotlin.DashMediaSource1;
import kotlin.ServerSideAdInsertionMediaSourceAdPlaybackStateUpdater;
import kotlin.getStreamPositionUsForContent;
import kotlin.getSubmittedOn;
import kotlin.getTestId;
import kotlin.onInitializationFailed;
import kotlin.setCompositeSequenceableLoaderFactory;
import kotlin.setManifestParser;

/* JADX INFO: loaded from: classes5.dex */
public final class MagicModuleLocalImpl_Factory implements getSubmittedOn<MagicModuleLocalImpl> {
    private final getTestId<DashMediaSource1> magicModuleTimelineIndexTableProvider;
    private final getTestId<onInitializationFailed> mcqAnswerTableProvider;
    private final getTestId<ServerSideAdInsertionMediaSourceAdPlaybackStateUpdater> mcqDataProviderLocalProvider;
    private final getTestId<setCompositeSequenceableLoaderFactory> mcqIndexTableProvider;
    private final getTestId<setManifestParser> mcqParentTableProvider;
    private final getTestId<getStreamPositionUsForContent> prefRepositoryProvider;

    private MagicModuleLocalImpl_Factory(getTestId<getStreamPositionUsForContent> gettestid, getTestId<ServerSideAdInsertionMediaSourceAdPlaybackStateUpdater> gettestid2, getTestId<setManifestParser> gettestid3, getTestId<onInitializationFailed> gettestid4, getTestId<setCompositeSequenceableLoaderFactory> gettestid5, getTestId<DashMediaSource1> gettestid6) {
        this.prefRepositoryProvider = gettestid;
        this.mcqDataProviderLocalProvider = gettestid2;
        this.mcqParentTableProvider = gettestid3;
        this.mcqAnswerTableProvider = gettestid4;
        this.mcqIndexTableProvider = gettestid5;
        this.magicModuleTimelineIndexTableProvider = gettestid6;
    }

    @Override // kotlin.setDescriptionList
    public final MagicModuleLocalImpl get() {
        return newInstance(this.prefRepositoryProvider.get(), this.mcqDataProviderLocalProvider.get(), this.mcqParentTableProvider.get(), this.mcqAnswerTableProvider.get(), this.mcqIndexTableProvider.get(), this.magicModuleTimelineIndexTableProvider.get());
    }

    public static MagicModuleLocalImpl_Factory create(getTestId<getStreamPositionUsForContent> gettestid, getTestId<ServerSideAdInsertionMediaSourceAdPlaybackStateUpdater> gettestid2, getTestId<setManifestParser> gettestid3, getTestId<onInitializationFailed> gettestid4, getTestId<setCompositeSequenceableLoaderFactory> gettestid5, getTestId<DashMediaSource1> gettestid6) {
        return new MagicModuleLocalImpl_Factory(gettestid, gettestid2, gettestid3, gettestid4, gettestid5, gettestid6);
    }

    public static MagicModuleLocalImpl newInstance(getStreamPositionUsForContent getstreampositionusforcontent, ServerSideAdInsertionMediaSourceAdPlaybackStateUpdater serverSideAdInsertionMediaSourceAdPlaybackStateUpdater, setManifestParser setmanifestparser, onInitializationFailed oninitializationfailed, setCompositeSequenceableLoaderFactory setcompositesequenceableloaderfactory, DashMediaSource1 dashMediaSource1) {
        return new MagicModuleLocalImpl(getstreampositionusforcontent, serverSideAdInsertionMediaSourceAdPlaybackStateUpdater, setmanifestparser, oninitializationfailed, setcompositesequenceableloaderfactory, dashMediaSource1);
    }
}
