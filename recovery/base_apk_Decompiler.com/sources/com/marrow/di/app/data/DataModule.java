package com.marrow.di.app.data;

import android.app.Application;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.marrow.data.dataprovider.magic_module.local.MagicModuleLocal;
import com.marrow.data.dataprovider.magic_module.local.MagicModuleLocalImpl;
import com.marrow.data.dataprovider.magic_module.remote.MagicModuleRemote;
import com.marrow.data.dataprovider.magic_module.remote.MagicModuleRemoteImpl;
import com.marrow.data.dataprovider.magic_module.remote.MagicModuleService;
import com.marrow.data.dataprovider.magic_module.repo.MagicModuleRepository;
import com.marrow.data.dataprovider.magic_module.repo.MagicModuleRepositoryImpl;
import com.marrow.data.dataprovider.magic_module.usecase.MagicModuleUseCase;
import com.marrow.data.dataprovider.magic_module.usecase.MagicModuleUseCaseImpl;
import kotlin.AdPlaybackState1;
import kotlin.AdPlaybackStateAdGroupExternalSyntheticLambda0;
import kotlin.BaseUrlExclusionList;
import kotlin.BundledChunkExtractor;
import kotlin.BundledChunkExtractorBindingTrackOutput;
import kotlin.BundledChunkExtractorExternalSyntheticLambda0;
import kotlin.Chunk;
import kotlin.DashMediaSource1;
import kotlin.DashMediaSourceExternalSyntheticLambda0;
import kotlin.DashMediaSourceExternalSyntheticLambda1;
import kotlin.DashMediaSourceIso8601Parser;
import kotlin.DashMediaSourceManifestCallback;
import kotlin.DashMediaSourceUtcTimestampCallback;
import kotlin.DashMediaSourceXsDateTimeParser;
import kotlin.DashSegmentIndex;
import kotlin.DefaultDashChunkSource;
import kotlin.DefaultDashChunkSourceFactory;
import kotlin.DefaultDashChunkSourceRepresentationHolder;
import kotlin.GTNudgeRequestModel;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.MediaChunk;
import kotlin.MediaChunkIterator1;
import kotlin.MediaParserChunkExtractor1;
import kotlin.Metadata;
import kotlin.RtspMediaSource1;
import kotlin.RtspMediaSourceRtspPlaybackException;
import kotlin.ServerSideAdInsertionMediaSourceAdPlaybackStateUpdater;
import kotlin.ServerSideAdInsertionMediaSourceMediaPeriodImpl;
import kotlin.SpannedData;
import kotlin.bind;
import kotlin.copyWithNewRepresentation;
import kotlin.copyWithNewSelectedBaseUrl;
import kotlin.createFallbackOptions;
import kotlin.createMediaPlaylistVariantUrl;
import kotlin.discardFrom;
import kotlin.endsWithLivePostrollPlaceHolder;
import kotlin.excludeTrack;
import kotlin.getAdCountInGroup;
import kotlin.getAdjustedWindowDefaultStartPositionUs;
import kotlin.getAvailableSegmentCount;
import kotlin.getDataHolder;
import kotlin.getDataSpec;
import kotlin.getFirstAvailableSegmentNum;
import kotlin.getFirstRepresentation;
import kotlin.getFirstSegmentNum;
import kotlin.getLastAvailableSegmentNum;
import kotlin.getMagicModuleMeta;
import kotlin.getNextChunk;
import kotlin.getNowPeriodTimeUs;
import kotlin.getPlanOldPrice;
import kotlin.getPlaylistProtectionSchemes;
import kotlin.getRepresentations;
import kotlin.getSegmentNum;
import kotlin.getSegmentUrl;
import kotlin.getStreamIndexToTrackGroupIndex;
import kotlin.getStreamPositionUsForContent;
import kotlin.identifyEmbeddedTracks;
import kotlin.isAdInErrorState;
import kotlin.isExplicit;
import kotlin.isIndexExplicit;
import kotlin.isLoadCompleted;
import kotlin.loadInitializationData;
import kotlin.loadManifest;
import kotlin.loadNtpTimeOffset;
import kotlin.loadSampleFormat;
import kotlin.maybeExecutePendingSeek;
import kotlin.maybeNotifyPrimaryTrackFormatChanged;
import kotlin.newChunkExtractor;
import kotlin.newInitializationChunk;
import kotlin.newMediaChunk;
import kotlin.onDashManifestPublishTimeExpired;
import kotlin.onInitializationFailed;
import kotlin.onManifestLoadCompleted;
import kotlin.onManifestLoadError;
import kotlin.onRebuffer;
import kotlin.onUtcTimestampLoadCompleted;
import kotlin.onUtcTimestampResolved;
import kotlin.parseClosedCaptionDescriptor;
import kotlin.parseLongAttr;
import kotlin.parseOptionalStringAttr;
import kotlin.processManifest;
import kotlin.releaseDisabledStreams;
import kotlin.removeExpiredExclusions;
import kotlin.replaceManifestUri;
import kotlin.resetSampleQueues;
import kotlin.resolveCacheKey;
import kotlin.resolveUtcTimingElementHttp;
import kotlin.scheduleManifestRefresh;
import kotlin.setCompositeSequenceableLoaderFactory;
import kotlin.setGateway;
import kotlin.setManifestParser;
import kotlin.shouldPlayAdGroup;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateSelectedBaseUrl;
import kotlin.withAdGroupTimeUs;
import kotlin.withAllAdsReset;
import kotlin.withAllAdsSkipped;
import kotlin.withLastAdRemoved;
import kotlin.withLivePostrollPlaceholderAppended;
import kotlin.withNewAdGroup;
import kotlin.withOriginalAdCount;
import kotlin.withRemovedAdGroupCount;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH'¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\rH'¢\u0006\u0004\b\u000b\u0010\u000fJ\u0017\u0010\u0007\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0010H'¢\u0006\u0004\b\u0007\u0010\u0012J\u0017\u0010\u000b\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u0013H'¢\u0006\u0004\b\u000b\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0016H'¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u0007\u001a\u00020\u001b2\u0006\u0010\u0005\u001a\u00020\u001aH'¢\u0006\u0004\b\u0007\u0010\u001cJ\u0017\u0010\u000b\u001a\u00020\u001e2\u0006\u0010\u0005\u001a\u00020\u001dH'¢\u0006\u0004\b\u000b\u0010\u001fJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020 H'¢\u0006\u0004\b\"\u0010#J\u0017\u0010\u0018\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020$H'¢\u0006\u0004\b\u0018\u0010&J\u0017\u0010\u0018\u001a\u00020!2\u0006\u0010\u0005\u001a\u00020 H'¢\u0006\u0004\b\u0018\u0010#J\u0017\u0010\"\u001a\u00020(2\u0006\u0010\u0005\u001a\u00020'H'¢\u0006\u0004\b\"\u0010)J\u0017\u0010,\u001a\u00020+2\u0006\u0010\u0005\u001a\u00020*H'¢\u0006\u0004\b,\u0010-J\u0017\u0010\u0018\u001a\u00020/2\u0006\u0010\u0005\u001a\u00020.H'¢\u0006\u0004\b\u0018\u00100J\u0017\u0010\u000b\u001a\u0002022\u0006\u0010\u0005\u001a\u000201H'¢\u0006\u0004\b\u000b\u00103J\u0017\u0010\u000b\u001a\u0002052\u0006\u0010\u0005\u001a\u000204H'¢\u0006\u0004\b\u000b\u00106J\u0017\u0010,\u001a\u0002082\u0006\u0010\u0005\u001a\u000207H'¢\u0006\u0004\b,\u00109J\u0017\u0010,\u001a\u00020;2\u0006\u0010\u0005\u001a\u00020:H'¢\u0006\u0004\b,\u0010<J\u0017\u0010\u0018\u001a\u00020>2\u0006\u0010\u0005\u001a\u00020=H'¢\u0006\u0004\b\u0018\u0010?J\u0017\u0010\u000b\u001a\u00020A2\u0006\u0010\u0005\u001a\u00020@H'¢\u0006\u0004\b\u000b\u0010BJ\u0017\u0010\u0007\u001a\u00020D2\u0006\u0010\u0005\u001a\u00020CH'¢\u0006\u0004\b\u0007\u0010E"}, d2 = {"Lcom/marrow/di/app/data/DataModule;", "", "<init>", "()V", "Lo/resetSampleQueues;", "p0", "Lo/maybeNotifyPrimaryTrackFormatChanged;", "RemoteActionCompatParcelizer", "(Lo/resetSampleQueues;)Lo/maybeNotifyPrimaryTrackFormatChanged;", "Lo/createMediaPlaylistVariantUrl;", "Lo/endsWithLivePostrollPlaceHolder;", "read", "(Lo/createMediaPlaylistVariantUrl;)Lo/endsWithLivePostrollPlaceHolder;", "Lo/withNewAdGroup;", "Lo/withOriginalAdCount;", "(Lo/withNewAdGroup;)Lo/withOriginalAdCount;", "Lo/excludeTrack;", "Lo/onRebuffer;", "(Lo/excludeTrack;)Lo/onRebuffer;", "Lo/isLoadCompleted;", "Lo/getNextChunk;", "(Lo/isLoadCompleted;)Lo/getNextChunk;", "Lo/getPlaylistProtectionSchemes;", "Lo/parseLongAttr;", "write", "(Lo/getPlaylistProtectionSchemes;)Lo/parseLongAttr;", "Lo/parseClosedCaptionDescriptor;", "Lo/getStreamIndexToTrackGroupIndex;", "(Lo/parseClosedCaptionDescriptor;)Lo/getStreamIndexToTrackGroupIndex;", "Lo/ServerSideAdInsertionMediaSourceAdPlaybackStateUpdater;", "Lo/ServerSideAdInsertionMediaSourceMediaPeriodImpl;", "(Lo/ServerSideAdInsertionMediaSourceAdPlaybackStateUpdater;)Lo/ServerSideAdInsertionMediaSourceMediaPeriodImpl;", "Lo/AdPlaybackState1;", "Lo/withRemovedAdGroupCount;", "AudioAttributesCompatParcelizer", "(Lo/AdPlaybackState1;)Lo/withRemovedAdGroupCount;", "Lo/MediaChunkIterator1;", "Lo/getDataSpec;", "(Lo/MediaChunkIterator1;)Lo/getDataSpec;", "Lo/isAdInErrorState;", "Lo/withAdGroupTimeUs;", "(Lo/isAdInErrorState;)Lo/withAdGroupTimeUs;", "Lo/withAllAdsSkipped;", "Lo/AdPlaybackStateAdGroupExternalSyntheticLambda0;", "IconCompatParcelizer", "(Lo/withAllAdsSkipped;)Lo/AdPlaybackStateAdGroupExternalSyntheticLambda0;", "Lo/shouldPlayAdGroup;", "Lo/withAllAdsReset;", "(Lo/shouldPlayAdGroup;)Lo/withAllAdsReset;", "Lo/DashSegmentIndex;", "Lo/DashMediaSourceIso8601Parser;", "(Lo/DashSegmentIndex;)Lo/DashMediaSourceIso8601Parser;", "Lo/getStreamPositionUsForContent;", "Lo/BundledChunkExtractor;", "(Lo/getStreamPositionUsForContent;)Lo/BundledChunkExtractor;", "Lcom/marrow/data/dataprovider/magic_module/repo/MagicModuleRepositoryImpl;", "Lcom/marrow/data/dataprovider/magic_module/repo/MagicModuleRepository;", "(Lcom/marrow/data/dataprovider/magic_module/repo/MagicModuleRepositoryImpl;)Lcom/marrow/data/dataprovider/magic_module/repo/MagicModuleRepository;", "Lcom/marrow/data/dataprovider/magic_module/remote/MagicModuleRemoteImpl;", "Lcom/marrow/data/dataprovider/magic_module/remote/MagicModuleRemote;", "(Lcom/marrow/data/dataprovider/magic_module/remote/MagicModuleRemoteImpl;)Lcom/marrow/data/dataprovider/magic_module/remote/MagicModuleRemote;", "Lcom/marrow/data/dataprovider/magic_module/local/MagicModuleLocalImpl;", "Lcom/marrow/data/dataprovider/magic_module/local/MagicModuleLocal;", "(Lcom/marrow/data/dataprovider/magic_module/local/MagicModuleLocalImpl;)Lcom/marrow/data/dataprovider/magic_module/local/MagicModuleLocal;", "Lcom/marrow/data/dataprovider/magic_module/usecase/MagicModuleUseCaseImpl;", "Lcom/marrow/data/dataprovider/magic_module/usecase/MagicModuleUseCase;", "(Lcom/marrow/data/dataprovider/magic_module/usecase/MagicModuleUseCaseImpl;)Lcom/marrow/data/dataprovider/magic_module/usecase/MagicModuleUseCase;", "Lo/Chunk;", "Lo/BundledChunkExtractorBindingTrackOutput;", "(Lo/Chunk;)Lo/BundledChunkExtractorBindingTrackOutput;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class DataModule {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @getPlanOldPrice
    public abstract withAdGroupTimeUs AudioAttributesCompatParcelizer(isAdInErrorState p0);

    @getPlanOldPrice
    public abstract withRemovedAdGroupCount AudioAttributesCompatParcelizer(AdPlaybackState1 p0);

    @getPlanOldPrice
    public abstract MagicModuleRemote IconCompatParcelizer(MagicModuleRemoteImpl p0);

    @getPlanOldPrice
    public abstract MagicModuleRepository IconCompatParcelizer(MagicModuleRepositoryImpl p0);

    @getPlanOldPrice
    public abstract AdPlaybackStateAdGroupExternalSyntheticLambda0 IconCompatParcelizer(withAllAdsSkipped p0);

    @getPlanOldPrice
    public abstract BundledChunkExtractorBindingTrackOutput RemoteActionCompatParcelizer(Chunk p0);

    @getPlanOldPrice
    public abstract getStreamIndexToTrackGroupIndex RemoteActionCompatParcelizer(parseClosedCaptionDescriptor p0);

    public abstract maybeNotifyPrimaryTrackFormatChanged RemoteActionCompatParcelizer(resetSampleQueues p0);

    @getPlanOldPrice
    public abstract onRebuffer RemoteActionCompatParcelizer(excludeTrack p0);

    @getPlanOldPrice
    public abstract MagicModuleUseCase read(MagicModuleUseCaseImpl p0);

    @getPlanOldPrice
    public abstract BundledChunkExtractor read(getStreamPositionUsForContent p0);

    @getPlanOldPrice
    public abstract DashMediaSourceIso8601Parser read(DashSegmentIndex p0);

    @getPlanOldPrice
    public abstract ServerSideAdInsertionMediaSourceMediaPeriodImpl read(ServerSideAdInsertionMediaSourceAdPlaybackStateUpdater p0);

    @getPlanOldPrice
    public abstract endsWithLivePostrollPlaceHolder read(createMediaPlaylistVariantUrl p0);

    @getPlanOldPrice
    public abstract getNextChunk read(isLoadCompleted p0);

    @getPlanOldPrice
    public abstract withOriginalAdCount read(withNewAdGroup p0);

    @getPlanOldPrice
    public abstract MagicModuleLocal write(MagicModuleLocalImpl p0);

    @getPlanOldPrice
    public abstract getDataSpec write(MediaChunkIterator1 p0);

    @getPlanOldPrice
    public abstract parseLongAttr write(getPlaylistProtectionSchemes p0);

    @getPlanOldPrice
    public abstract withAllAdsReset write(shouldPlayAdGroup p0);

    @getPlanOldPrice
    public abstract withRemovedAdGroupCount write(AdPlaybackState1 p0);

    @getMagicModuleMeta
    public static final MagicModuleService RemoteActionCompatParcelizer(@setGateway(IconCompatParcelizer = "v3.1") GTNudgeRequestModel gTNudgeRequestModel) {
        return INSTANCE.AudioAttributesCompatParcelizer(gTNudgeRequestModel);
    }

    /* JADX INFO: renamed from: com.marrow.di.app.data.DataModule$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0086\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0007\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u000e\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u000e\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0005\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u001c2\b\b\u0001\u0010\u0005\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u0007\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0007\u0010 J\u0019\u0010\u0019\u001a\u00020!2\b\b\u0001\u0010\u0005\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u0019\u0010\"J\u0019\u0010\u0014\u001a\u00020#2\b\b\u0001\u0010\u0005\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u0014\u0010$J\u0017\u0010\u0014\u001a\u00020%2\u0006\u0010\u0005\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0014\u0010&J\u0015\u0010\u0019\u001a\u00020'2\u0006\u0010\u0005\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010(J\u008a\u0003\u0010\u0007\u001a\u00030\u0081\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020)2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u0002062\u0006\u00109\u001a\u0002082\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020\u00162\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020A2\u0006\u0010D\u001a\u00020C2\u0006\u0010F\u001a\u00020E2\u0006\u0010H\u001a\u00020G2\u0006\u0010J\u001a\u00020I2\u0006\u0010L\u001a\u00020K2\u0006\u0010N\u001a\u00020M2\u0006\u0010P\u001a\u00020O2\u0006\u0010R\u001a\u00020Q2\u0006\u0010T\u001a\u00020S2\u0006\u0010V\u001a\u00020U2\u0006\u0010X\u001a\u00020W2\u0006\u0010Z\u001a\u00020Y2\u0006\u0010\\\u001a\u00020[2\u0006\u0010^\u001a\u00020]2\u0006\u0010_\u001a\u00020\u00062\u0006\u0010a\u001a\u00020`2\u0006\u0010c\u001a\u00020b2\u0006\u0010e\u001a\u00020d2\u0006\u0010g\u001a\u00020f2\u0006\u0010i\u001a\u00020h2\u0006\u0010k\u001a\u00020j2\u0006\u0010l\u001a\u00020\u00172\u0006\u0010n\u001a\u00020m2\u0006\u0010p\u001a\u00020o2\u0006\u0010r\u001a\u00020q2\u0006\u0010t\u001a\u00020s2\u0006\u0010v\u001a\u00020u2\u0006\u0010x\u001a\u00020w2\u0006\u0010z\u001a\u00020y2\u0006\u0010|\u001a\u00020{2\u0006\u0010~\u001a\u00020}2\u0007\u0010\u0080\u0001\u001a\u00020\u007fH\u0007¢\u0006\u0005\b\u0007\u0010\u0082\u0001"}, d2 = {"Lcom/marrow/di/app/data/DataModule$IconCompatParcelizer;", "", "<init>", "()V", "Lo/getAvailableSegmentCount;", "p0", "Lo/getStreamPositionUsForContent;", "RemoteActionCompatParcelizer", "(Lo/getAvailableSegmentCount;)Lo/getStreamPositionUsForContent;", "Lo/parseLongAttr;", "p1", "Lo/withLastAdRemoved;", "(Lo/getStreamPositionUsForContent;Lo/parseLongAttr;)Lo/withLastAdRemoved;", "Lo/getDataHolder;", "write", "(Lo/getStreamPositionUsForContent;)Lo/getDataHolder;", "Landroid/app/Application;", "Lo/RtspMediaSource1;", "(Landroid/app/Application;)Lo/RtspMediaSource1;", "Lo/maybeExecutePendingSeek;", "AudioAttributesCompatParcelizer", "(Lo/getStreamPositionUsForContent;Lo/parseLongAttr;)Lo/maybeExecutePendingSeek;", "Lo/getSegmentUrl;", "Lo/getSegmentNum;", "Lo/BundledChunkExtractorExternalSyntheticLambda0;", "read", "(Lo/getSegmentUrl;Lo/getSegmentNum;)Lo/BundledChunkExtractorExternalSyntheticLambda0;", "Lo/GTNudgeRequestModel;", "Lo/SpannedData;", "IconCompatParcelizer", "(Lo/GTNudgeRequestModel;)Lo/SpannedData;", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "(Landroid/app/Application;)Lcom/google/firebase/analytics/FirebaseAnalytics;", "Lo/removeExpiredExclusions;", "(Lo/GTNudgeRequestModel;)Lo/removeExpiredExclusions;", "Lcom/marrow/data/dataprovider/magic_module/remote/MagicModuleService;", "(Lo/GTNudgeRequestModel;)Lcom/marrow/data/dataprovider/magic_module/remote/MagicModuleService;", "Lo/releaseDisabledStreams;", "(Landroid/app/Application;)Lo/releaseDisabledStreams;", "Lo/getStreamIndexToTrackGroupIndex;", "(Landroid/app/Application;)Lo/getStreamIndexToTrackGroupIndex;", "Lo/getRepresentations;", "Lo/setCompositeSequenceableLoaderFactory;", "p2", "Lo/setManifestParser;", "p3", "Lo/onInitializationFailed;", "p4", "Lo/DashSegmentIndex;", "p5", "Lo/onUtcTimestampLoadCompleted;", "p6", "Lo/onDashManifestPublishTimeExpired;", "p7", "Lo/getNowPeriodTimeUs;", "p8", "Lo/loadSampleFormat;", "p9", "Lo/newChunkExtractor;", "p10", "p11", "Lo/updateSelectedBaseUrl;", "p12", "Lo/copyWithNewSelectedBaseUrl;", "p13", "Lo/newMediaChunk;", "p14", "Lo/getFirstSegmentNum;", "p15", "Lo/isIndexExplicit;", "p16", "Lo/onUtcTimestampResolved;", "p17", "Lo/resolveUtcTimingElementHttp;", "p18", "Lo/resolveCacheKey;", "p19", "Lo/DashMediaSourceExternalSyntheticLambda1;", "p20", "Lo/processManifest;", "p21", "Lo/createFallbackOptions;", "p22", "Lo/DashMediaSourceUtcTimestampCallback;", "p23", "Lo/newInitializationChunk;", "p24", "Lo/DashMediaSourceXsDateTimeParser;", "p25", "Lo/getFirstAvailableSegmentNum;", "p26", "Lo/scheduleManifestRefresh;", "p27", "Lo/copyWithNewRepresentation;", "p28", "p29", "Lo/DashMediaSourceExternalSyntheticLambda0;", "p30", "Lo/onManifestLoadError;", "p31", "Lo/onManifestLoadCompleted;", "p32", "Lo/getAdjustedWindowDefaultStartPositionUs;", "p33", "Lo/DefaultDashChunkSourceRepresentationHolder;", "p34", "Lo/replaceManifestUri;", "p35", "p36", "Lo/loadNtpTimeOffset;", "p37", "Lo/getLastAvailableSegmentNum;", "p38", "Lo/DashMediaSource1;", "p39", "Lo/DefaultDashChunkSource;", "p40", "Lo/DefaultDashChunkSourceFactory;", "p41", "Lo/loadManifest;", "p42", "Lo/isExplicit;", "p43", "Lo/DashMediaSourceManifestCallback;", "p44", "Lo/loadInitializationData;", "p45", "Lo/getFirstRepresentation;", "p46", "Lo/parseOptionalStringAttr;", "(Lo/getAvailableSegmentCount;Lo/getRepresentations;Lo/setCompositeSequenceableLoaderFactory;Lo/setManifestParser;Lo/onInitializationFailed;Lo/DashSegmentIndex;Lo/onUtcTimestampLoadCompleted;Lo/onDashManifestPublishTimeExpired;Lo/getNowPeriodTimeUs;Lo/loadSampleFormat;Lo/newChunkExtractor;Lo/getSegmentUrl;Lo/updateSelectedBaseUrl;Lo/copyWithNewSelectedBaseUrl;Lo/newMediaChunk;Lo/getFirstSegmentNum;Lo/isIndexExplicit;Lo/onUtcTimestampResolved;Lo/resolveUtcTimingElementHttp;Lo/resolveCacheKey;Lo/DashMediaSourceExternalSyntheticLambda1;Lo/processManifest;Lo/createFallbackOptions;Lo/DashMediaSourceUtcTimestampCallback;Lo/newInitializationChunk;Lo/DashMediaSourceXsDateTimeParser;Lo/getFirstAvailableSegmentNum;Lo/scheduleManifestRefresh;Lo/copyWithNewRepresentation;Lo/getStreamPositionUsForContent;Lo/DashMediaSourceExternalSyntheticLambda0;Lo/onManifestLoadError;Lo/onManifestLoadCompleted;Lo/getAdjustedWindowDefaultStartPositionUs;Lo/DefaultDashChunkSourceRepresentationHolder;Lo/replaceManifestUri;Lo/getSegmentNum;Lo/loadNtpTimeOffset;Lo/getLastAvailableSegmentNum;Lo/DashMediaSource1;Lo/DefaultDashChunkSource;Lo/DefaultDashChunkSourceFactory;Lo/loadManifest;Lo/isExplicit;Lo/DashMediaSourceManifestCallback;Lo/loadInitializationData;Lo/getFirstRepresentation;)Lo/parseOptionalStringAttr;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getPlanOldPrice
        public final getStreamPositionUsForContent RemoteActionCompatParcelizer(getAvailableSegmentCount p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new getAdCountInGroup(p0);
        }

        @getPlanOldPrice
        public final withLastAdRemoved RemoteActionCompatParcelizer(getStreamPositionUsForContent p0, parseLongAttr p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            return new withLivePostrollPlaceholderAppended(p0, p1);
        }

        @getPlanOldPrice
        public final getDataHolder write(getStreamPositionUsForContent p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new MediaChunk(p0);
        }

        @getPlanOldPrice
        public final RtspMediaSource1 write(Application p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new RtspMediaSourceRtspPlaybackException(p0);
        }

        @getPlanOldPrice
        public final maybeExecutePendingSeek AudioAttributesCompatParcelizer(getStreamPositionUsForContent p0, parseLongAttr p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            return new MediaParserChunkExtractor1(p0, p1);
        }

        public final BundledChunkExtractorExternalSyntheticLambda0 read(getSegmentUrl p0, getSegmentNum p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            return new bind(p0, p1);
        }

        @getPlanOldPrice
        public final SpannedData IconCompatParcelizer(@setGateway(IconCompatParcelizer = "v3.1") GTNudgeRequestModel p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Object obj = p0.read((Class<Object>) SpannedData.class);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(obj, "");
            return (SpannedData) obj;
        }

        @getPlanOldPrice
        public final FirebaseAnalytics RemoteActionCompatParcelizer(Application p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(p0);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(firebaseAnalytics, "");
            return firebaseAnalytics;
        }

        @getPlanOldPrice
        public final removeExpiredExclusions read(@setGateway(IconCompatParcelizer = "v3.1") GTNudgeRequestModel p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Object obj = p0.read((Class<Object>) discardFrom.class);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(obj, "");
            return new BaseUrlExclusionList((discardFrom) obj);
        }

        @getMagicModuleMeta
        public final MagicModuleService AudioAttributesCompatParcelizer(@setGateway(IconCompatParcelizer = "v3.1") GTNudgeRequestModel p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Object obj = p0.read((Class<Object>) MagicModuleService.class);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(obj, "");
            return (MagicModuleService) obj;
        }

        @getPlanOldPrice
        public final releaseDisabledStreams AudioAttributesCompatParcelizer(Application p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new identifyEmbeddedTracks(p0);
        }

        public final getStreamIndexToTrackGroupIndex read(Application p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new parseClosedCaptionDescriptor(p0);
        }

        @getPlanOldPrice
        public final parseOptionalStringAttr RemoteActionCompatParcelizer(getAvailableSegmentCount p0, getRepresentations p1, setCompositeSequenceableLoaderFactory p2, setManifestParser p3, onInitializationFailed p4, DashSegmentIndex p5, onUtcTimestampLoadCompleted p6, onDashManifestPublishTimeExpired p7, getNowPeriodTimeUs p8, loadSampleFormat p9, newChunkExtractor p10, getSegmentUrl p11, updateSelectedBaseUrl p12, copyWithNewSelectedBaseUrl p13, newMediaChunk p14, getFirstSegmentNum p15, isIndexExplicit p16, onUtcTimestampResolved p17, resolveUtcTimingElementHttp p18, resolveCacheKey p19, DashMediaSourceExternalSyntheticLambda1 p20, processManifest p21, createFallbackOptions p22, DashMediaSourceUtcTimestampCallback p23, newInitializationChunk p24, DashMediaSourceXsDateTimeParser p25, getFirstAvailableSegmentNum p26, scheduleManifestRefresh p27, copyWithNewRepresentation p28, getStreamPositionUsForContent p29, DashMediaSourceExternalSyntheticLambda0 p30, onManifestLoadError p31, onManifestLoadCompleted p32, getAdjustedWindowDefaultStartPositionUs p33, DefaultDashChunkSourceRepresentationHolder p34, replaceManifestUri p35, getSegmentNum p36, loadNtpTimeOffset p37, getLastAvailableSegmentNum p38, DashMediaSource1 p39, DefaultDashChunkSource p40, DefaultDashChunkSourceFactory p41, loadManifest p42, isExplicit p43, DashMediaSourceManifestCallback p44, loadInitializationData p45, getFirstRepresentation p46) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            toMagicModuleMetaRepoModel.write(p3, "");
            toMagicModuleMetaRepoModel.write(p4, "");
            toMagicModuleMetaRepoModel.write(p5, "");
            toMagicModuleMetaRepoModel.write(p6, "");
            toMagicModuleMetaRepoModel.write(p7, "");
            toMagicModuleMetaRepoModel.write(p8, "");
            toMagicModuleMetaRepoModel.write(p9, "");
            toMagicModuleMetaRepoModel.write(p10, "");
            toMagicModuleMetaRepoModel.write(p11, "");
            toMagicModuleMetaRepoModel.write(p12, "");
            toMagicModuleMetaRepoModel.write(p13, "");
            toMagicModuleMetaRepoModel.write(p14, "");
            toMagicModuleMetaRepoModel.write(p15, "");
            toMagicModuleMetaRepoModel.write(p16, "");
            toMagicModuleMetaRepoModel.write(p17, "");
            toMagicModuleMetaRepoModel.write(p18, "");
            toMagicModuleMetaRepoModel.write(p19, "");
            toMagicModuleMetaRepoModel.write(p20, "");
            toMagicModuleMetaRepoModel.write(p21, "");
            toMagicModuleMetaRepoModel.write(p22, "");
            toMagicModuleMetaRepoModel.write(p23, "");
            toMagicModuleMetaRepoModel.write(p24, "");
            toMagicModuleMetaRepoModel.write(p25, "");
            toMagicModuleMetaRepoModel.write(p26, "");
            toMagicModuleMetaRepoModel.write(p27, "");
            toMagicModuleMetaRepoModel.write(p28, "");
            toMagicModuleMetaRepoModel.write(p29, "");
            toMagicModuleMetaRepoModel.write(p30, "");
            toMagicModuleMetaRepoModel.write(p31, "");
            toMagicModuleMetaRepoModel.write(p32, "");
            toMagicModuleMetaRepoModel.write(p33, "");
            toMagicModuleMetaRepoModel.write(p34, "");
            toMagicModuleMetaRepoModel.write(p35, "");
            toMagicModuleMetaRepoModel.write(p36, "");
            toMagicModuleMetaRepoModel.write(p37, "");
            toMagicModuleMetaRepoModel.write(p38, "");
            toMagicModuleMetaRepoModel.write(p39, "");
            toMagicModuleMetaRepoModel.write(p40, "");
            toMagicModuleMetaRepoModel.write(p41, "");
            toMagicModuleMetaRepoModel.write(p42, "");
            toMagicModuleMetaRepoModel.write(p43, "");
            toMagicModuleMetaRepoModel.write(p44, "");
            toMagicModuleMetaRepoModel.write(p45, "");
            toMagicModuleMetaRepoModel.write(p46, "");
            return new parseOptionalStringAttr(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p14, p13, p15, p16, p17, p18, p19, p20, p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p33, p34, p31, p35, p32, p36, p37, p38, p39, p40, p41, p42, p43, p44, p45, p46);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
