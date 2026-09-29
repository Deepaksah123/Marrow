package com.google.android.exoplayer2.source.dash;

import android.os.SystemClock;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.SeekParameters;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.chunk.BaseMediaChunkIterator;
import com.google.android.exoplayer2.source.chunk.BundledChunkExtractor;
import com.google.android.exoplayer2.source.chunk.Chunk;
import com.google.android.exoplayer2.source.chunk.ChunkExtractor;
import com.google.android.exoplayer2.source.chunk.ContainerMediaChunk;
import com.google.android.exoplayer2.source.chunk.InitializationChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.SingleSampleMediaChunk;
import com.google.android.exoplayer2.source.dash.DashChunkSource;
import com.google.android.exoplayer2.source.dash.PlayerEmsgHandler;
import com.google.android.exoplayer2.source.dash.manifest.AdaptationSet;
import com.google.android.exoplayer2.source.dash.manifest.BaseUrl;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.RangedUri;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.CmcdConfiguration;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DataSpec;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.LoadErrorHandlingPolicy;
import com.google.android.exoplayer2.upstream.LoaderErrorThrower;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.onMoovContainerAtomRead;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public class DefaultDashChunkSource implements DashChunkSource {
    private final int[] adaptationSetIndices;
    private final BaseUrlExclusionList baseUrlExclusionList;
    private final CmcdConfiguration cmcdConfiguration;
    private final DataSource dataSource;
    private final long elapsedRealtimeOffsetMs;
    private IOException fatalError;
    private DashManifest manifest;
    private final LoaderErrorThrower manifestLoaderErrorThrower;
    private final int maxSegmentsPerLoad;
    private boolean missingLastSegment;
    private int periodIndex;
    private final PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler;
    protected final RepresentationHolder[] representationHolders;
    private ExoTrackSelection trackSelection;
    private final int trackType;

    public static final class Factory implements DashChunkSource.Factory {
        private final ChunkExtractor.Factory chunkExtractorFactory;
        private final DataSource.Factory dataSourceFactory;
        private final int maxSegmentsPerLoad;

        public Factory(DataSource.Factory factory) {
            this(factory, 1);
        }

        public Factory(DataSource.Factory factory, int i) {
            this(BundledChunkExtractor.FACTORY, factory, i);
        }

        public Factory(ChunkExtractor.Factory factory, DataSource.Factory factory2, int i) {
            this.chunkExtractorFactory = factory;
            this.dataSourceFactory = factory2;
            this.maxSegmentsPerLoad = i;
        }

        @Override // com.google.android.exoplayer2.source.dash.DashChunkSource.Factory
        public final DashChunkSource createDashChunkSource(LoaderErrorThrower loaderErrorThrower, DashManifest dashManifest, BaseUrlExclusionList baseUrlExclusionList, int i, int[] iArr, ExoTrackSelection exoTrackSelection, int i2, long j, boolean z, List<Format> list, PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler, TransferListener transferListener, PlayerId playerId, CmcdConfiguration cmcdConfiguration) {
            DataSource dataSourceCreateDataSource = this.dataSourceFactory.createDataSource();
            if (transferListener != null) {
                dataSourceCreateDataSource.addTransferListener(transferListener);
            }
            return new DefaultDashChunkSource(this.chunkExtractorFactory, loaderErrorThrower, dashManifest, baseUrlExclusionList, i, iArr, exoTrackSelection, i2, dataSourceCreateDataSource, j, this.maxSegmentsPerLoad, z, list, playerTrackEmsgHandler, playerId, cmcdConfiguration);
        }
    }

    public DefaultDashChunkSource(ChunkExtractor.Factory factory, LoaderErrorThrower loaderErrorThrower, DashManifest dashManifest, BaseUrlExclusionList baseUrlExclusionList, int i, int[] iArr, ExoTrackSelection exoTrackSelection, int i2, DataSource dataSource, long j, int i3, boolean z, List<Format> list, PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler, PlayerId playerId, CmcdConfiguration cmcdConfiguration) {
        this.manifestLoaderErrorThrower = loaderErrorThrower;
        this.manifest = dashManifest;
        this.baseUrlExclusionList = baseUrlExclusionList;
        this.adaptationSetIndices = iArr;
        this.trackSelection = exoTrackSelection;
        this.trackType = i2;
        this.dataSource = dataSource;
        this.periodIndex = i;
        this.elapsedRealtimeOffsetMs = j;
        this.maxSegmentsPerLoad = i3;
        this.playerTrackEmsgHandler = playerTrackEmsgHandler;
        this.cmcdConfiguration = cmcdConfiguration;
        long periodDurationUs = dashManifest.getPeriodDurationUs(i);
        ArrayList<Representation> representations = getRepresentations();
        this.representationHolders = new RepresentationHolder[exoTrackSelection.length()];
        int i4 = 0;
        while (i4 < this.representationHolders.length) {
            Representation representation = representations.get(exoTrackSelection.getIndexInTrackGroup(i4));
            BaseUrl baseUrlSelectBaseUrl = baseUrlExclusionList.selectBaseUrl(representation.baseUrls);
            RepresentationHolder[] representationHolderArr = this.representationHolders;
            if (baseUrlSelectBaseUrl == null) {
                baseUrlSelectBaseUrl = representation.baseUrls.get(0);
            }
            int i5 = i4;
            representationHolderArr[i5] = new RepresentationHolder(periodDurationUs, representation, baseUrlSelectBaseUrl, factory.createProgressiveMediaExtractor(i2, representation.format, z, list, playerTrackEmsgHandler, playerId), 0L, representation.getIndex());
            i4 = i5 + 1;
        }
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public long getAdjustedSeekPositionUs(long j, SeekParameters seekParameters) {
        for (RepresentationHolder representationHolder : this.representationHolders) {
            if (representationHolder.segmentIndex != null) {
                long segmentCount = representationHolder.getSegmentCount();
                if (segmentCount != 0) {
                    long segmentNum = representationHolder.getSegmentNum(j);
                    long segmentStartTimeUs = representationHolder.getSegmentStartTimeUs(segmentNum);
                    return seekParameters.resolveSeekPositionUs(j, segmentStartTimeUs, (segmentStartTimeUs >= j || (segmentCount != -1 && segmentNum >= (representationHolder.getFirstSegmentNum() + segmentCount) - 1)) ? segmentStartTimeUs : representationHolder.getSegmentStartTimeUs(segmentNum + 1));
                }
            }
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.dash.DashChunkSource
    public void updateManifest(DashManifest dashManifest, int i) {
        try {
            this.manifest = dashManifest;
            this.periodIndex = i;
            long periodDurationUs = dashManifest.getPeriodDurationUs(i);
            ArrayList<Representation> representations = getRepresentations();
            for (int i2 = 0; i2 < this.representationHolders.length; i2++) {
                Representation representation = representations.get(this.trackSelection.getIndexInTrackGroup(i2));
                RepresentationHolder[] representationHolderArr = this.representationHolders;
                representationHolderArr[i2] = representationHolderArr[i2].copyWithNewRepresentation(periodDurationUs, representation);
            }
        } catch (BehindLiveWindowException e) {
            this.fatalError = e;
        }
    }

    @Override // com.google.android.exoplayer2.source.dash.DashChunkSource
    public void updateTrackSelection(ExoTrackSelection exoTrackSelection) {
        this.trackSelection = exoTrackSelection;
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public void maybeThrowError() throws IOException {
        IOException iOException = this.fatalError;
        if (iOException != null) {
            throw iOException;
        }
        this.manifestLoaderErrorThrower.maybeThrowError();
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public int getPreferredQueueSize(long j, List<? extends MediaChunk> list) {
        if (this.fatalError != null || this.trackSelection.length() < 2) {
            return list.size();
        }
        return this.trackSelection.evaluateQueueSize(j, list);
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public boolean shouldCancelLoad(long j, Chunk chunk, List<? extends MediaChunk> list) {
        if (this.fatalError != null) {
            return false;
        }
        return this.trackSelection.shouldCancelChunkLoad(j, chunk, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0173  */
    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void getNextChunk(long r33, long r35, java.util.List<? extends com.google.android.exoplayer2.source.chunk.MediaChunk> r37, com.google.android.exoplayer2.source.chunk.ChunkHolder r38) {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DefaultDashChunkSource.getNextChunk(long, long, java.util.List, com.google.android.exoplayer2.source.chunk.ChunkHolder):void");
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public void onChunkLoadCompleted(Chunk chunk) {
        ChunkIndex chunkIndex;
        if (chunk instanceof InitializationChunk) {
            int iIndexOf = this.trackSelection.indexOf(((InitializationChunk) chunk).trackFormat);
            RepresentationHolder representationHolder = this.representationHolders[iIndexOf];
            if (representationHolder.segmentIndex == null && (chunkIndex = representationHolder.chunkExtractor.getChunkIndex()) != null) {
                this.representationHolders[iIndexOf] = representationHolder.copyWithNewSegmentIndex(new DashWrappingSegmentIndex(chunkIndex, representationHolder.representation.presentationTimeOffsetUs));
            }
        }
        PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler = this.playerTrackEmsgHandler;
        if (playerTrackEmsgHandler != null) {
            playerTrackEmsgHandler.onChunkLoadCompleted(chunk);
        }
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public boolean onChunkLoadError(Chunk chunk, boolean z, LoadErrorHandlingPolicy.LoadErrorInfo loadErrorInfo, LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
        LoadErrorHandlingPolicy.FallbackSelection fallbackSelectionFor;
        if (!z) {
            return false;
        }
        PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler = this.playerTrackEmsgHandler;
        if (playerTrackEmsgHandler != null && playerTrackEmsgHandler.onChunkLoadError(chunk)) {
            return true;
        }
        if (!this.manifest.dynamic && (chunk instanceof MediaChunk) && (loadErrorInfo.exception instanceof HttpDataSource.InvalidResponseCodeException) && ((HttpDataSource.InvalidResponseCodeException) loadErrorInfo.exception).responseCode == 404) {
            RepresentationHolder representationHolder = this.representationHolders[this.trackSelection.indexOf(chunk.trackFormat)];
            long segmentCount = representationHolder.getSegmentCount();
            if (segmentCount != -1 && segmentCount != 0) {
                if (((MediaChunk) chunk).getNextChunkIndex() > (representationHolder.getFirstSegmentNum() + segmentCount) - 1) {
                    this.missingLastSegment = true;
                    return true;
                }
            }
        }
        RepresentationHolder representationHolder2 = this.representationHolders[this.trackSelection.indexOf(chunk.trackFormat)];
        BaseUrl baseUrlSelectBaseUrl = this.baseUrlExclusionList.selectBaseUrl(representationHolder2.representation.baseUrls);
        if (baseUrlSelectBaseUrl != null && !representationHolder2.selectedBaseUrl.equals(baseUrlSelectBaseUrl)) {
            return true;
        }
        LoadErrorHandlingPolicy.FallbackOptions fallbackOptionsCreateFallbackOptions = createFallbackOptions(this.trackSelection, representationHolder2.representation.baseUrls);
        if ((fallbackOptionsCreateFallbackOptions.isFallbackAvailable(2) || fallbackOptionsCreateFallbackOptions.isFallbackAvailable(1)) && (fallbackSelectionFor = loadErrorHandlingPolicy.getFallbackSelectionFor(fallbackOptionsCreateFallbackOptions, loadErrorInfo)) != null && fallbackOptionsCreateFallbackOptions.isFallbackAvailable(fallbackSelectionFor.type)) {
            if (fallbackSelectionFor.type == 2) {
                ExoTrackSelection exoTrackSelection = this.trackSelection;
                return exoTrackSelection.excludeTrack(exoTrackSelection.indexOf(chunk.trackFormat), fallbackSelectionFor.exclusionDurationMs);
            }
            if (fallbackSelectionFor.type == 1) {
                this.baseUrlExclusionList.exclude(representationHolder2.selectedBaseUrl, fallbackSelectionFor.exclusionDurationMs);
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.source.chunk.ChunkSource
    public void release() {
        for (RepresentationHolder representationHolder : this.representationHolders) {
            ChunkExtractor chunkExtractor = representationHolder.chunkExtractor;
            if (chunkExtractor != null) {
                chunkExtractor.release();
            }
        }
    }

    private LoadErrorHandlingPolicy.FallbackOptions createFallbackOptions(ExoTrackSelection exoTrackSelection, List<BaseUrl> list) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int length = exoTrackSelection.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            if (exoTrackSelection.isTrackExcluded(i2, jElapsedRealtime)) {
                i++;
            }
        }
        int priorityCount = BaseUrlExclusionList.getPriorityCount(list);
        return new LoadErrorHandlingPolicy.FallbackOptions(priorityCount, priorityCount - this.baseUrlExclusionList.getPriorityCountAfterExclusion(list), length, i);
    }

    private long getSegmentNum(RepresentationHolder representationHolder, MediaChunk mediaChunk, long j, long j2, long j3) {
        if (mediaChunk != null) {
            return mediaChunk.getNextChunkIndex();
        }
        return Util.constrainValue(representationHolder.getSegmentNum(j), j2, j3);
    }

    private ArrayList<Representation> getRepresentations() {
        List<AdaptationSet> list = this.manifest.getPeriod(this.periodIndex).adaptationSets;
        ArrayList<Representation> arrayList = new ArrayList<>();
        for (int i : this.adaptationSetIndices) {
            arrayList.addAll(list.get(i).representations);
        }
        return arrayList;
    }

    private long getAvailableLiveDurationUs(long j, long j2) {
        if (!this.manifest.dynamic || this.representationHolders[0].getSegmentCount() == 0) {
            return C.TIME_UNSET;
        }
        return Math.max(0L, Math.min(getNowPeriodTimeUs(j), this.representationHolders[0].getSegmentEndTimeUs(this.representationHolders[0].getLastAvailableSegmentNum(j))) - j2);
    }

    private long getNowPeriodTimeUs(long j) {
        return this.manifest.availabilityStartTimeMs == C.TIME_UNSET ? C.TIME_UNSET : j - Util.msToUs(this.manifest.availabilityStartTimeMs + this.manifest.getPeriod(this.periodIndex).startMs);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected com.google.android.exoplayer2.source.chunk.Chunk newInitializationChunk(com.google.android.exoplayer2.source.dash.DefaultDashChunkSource.RepresentationHolder r14, com.google.android.exoplayer2.upstream.DataSource r15, com.google.android.exoplayer2.Format r16, int r17, java.lang.Object r18, com.google.android.exoplayer2.source.dash.manifest.RangedUri r19, com.google.android.exoplayer2.source.dash.manifest.RangedUri r20, com.google.android.exoplayer2.upstream.CmcdHeadersFactory r21) {
        /*
            r13 = this;
            r0 = r14
            r1 = r19
            r2 = r21
            com.google.android.exoplayer2.source.dash.manifest.Representation r3 = r0.representation
            if (r1 == 0) goto L16
            com.google.android.exoplayer2.source.dash.manifest.BaseUrl r4 = r0.selectedBaseUrl
            java.lang.String r4 = r4.url
            r5 = r20
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r4 = r1.attemptMerge(r5, r4)
            if (r4 == 0) goto L1a
            goto L19
        L16:
            r5 = r20
            r4 = r5
        L19:
            r1 = r4
        L1a:
            if (r2 != 0) goto L21
            o.onMoovContainerAtomRead r2 = kotlin.onMoovContainerAtomRead.AudioAttributesCompatParcelizer()
            goto L2b
        L21:
            java.lang.String r4 = "i"
            com.google.android.exoplayer2.upstream.CmcdHeadersFactory r2 = r2.setObjectType(r4)
            o.onMoovContainerAtomRead r2 = r2.createHttpRequestHeaders()
        L2b:
            com.google.android.exoplayer2.source.dash.manifest.BaseUrl r4 = r0.selectedBaseUrl
            java.lang.String r4 = r4.url
            r5 = 0
            com.google.android.exoplayer2.upstream.DataSpec r8 = com.google.android.exoplayer2.source.dash.DashUtil.buildDataSpec(r3, r4, r1, r5, r2)
            com.google.android.exoplayer2.source.chunk.InitializationChunk r1 = new com.google.android.exoplayer2.source.chunk.InitializationChunk
            com.google.android.exoplayer2.source.chunk.ChunkExtractor r12 = r0.chunkExtractor
            r6 = r1
            r7 = r15
            r9 = r16
            r10 = r17
            r11 = r18
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.DefaultDashChunkSource.newInitializationChunk(com.google.android.exoplayer2.source.dash.DefaultDashChunkSource$RepresentationHolder, com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.Format, int, java.lang.Object, com.google.android.exoplayer2.source.dash.manifest.RangedUri, com.google.android.exoplayer2.source.dash.manifest.RangedUri, com.google.android.exoplayer2.upstream.CmcdHeadersFactory):com.google.android.exoplayer2.source.chunk.Chunk");
    }

    protected Chunk newMediaChunk(RepresentationHolder representationHolder, DataSource dataSource, int i, Format format, int i2, Object obj, long j, int i3, long j2, long j3, CmcdHeadersFactory cmcdHeadersFactory) {
        onMoovContainerAtomRead<String, String> onmoovcontaineratomreadCreateHttpRequestHeaders;
        onMoovContainerAtomRead<String, String> onmoovcontaineratomreadCreateHttpRequestHeaders2;
        Representation representation = representationHolder.representation;
        long segmentStartTimeUs = representationHolder.getSegmentStartTimeUs(j);
        RangedUri segmentUrl = representationHolder.getSegmentUrl(j);
        if (representationHolder.chunkExtractor == null) {
            long segmentEndTimeUs = representationHolder.getSegmentEndTimeUs(j);
            int i4 = representationHolder.isSegmentAvailableAtFullNetworkSpeed(j, j3) ? 0 : 8;
            if (cmcdHeadersFactory == null) {
                onmoovcontaineratomreadCreateHttpRequestHeaders2 = onMoovContainerAtomRead.AudioAttributesCompatParcelizer();
            } else {
                onmoovcontaineratomreadCreateHttpRequestHeaders2 = cmcdHeadersFactory.setChunkDurationUs(segmentEndTimeUs - segmentStartTimeUs).setObjectType(CmcdHeadersFactory.getObjectType(this.trackSelection)).createHttpRequestHeaders();
            }
            return new SingleSampleMediaChunk(dataSource, DashUtil.buildDataSpec(representation, representationHolder.selectedBaseUrl.url, segmentUrl, i4, onmoovcontaineratomreadCreateHttpRequestHeaders2), format, i2, obj, segmentStartTimeUs, segmentEndTimeUs, j, i, format);
        }
        int i5 = 1;
        int i6 = 1;
        while (i5 < i3) {
            RangedUri rangedUriAttemptMerge = segmentUrl.attemptMerge(representationHolder.getSegmentUrl(((long) i5) + j), representationHolder.selectedBaseUrl.url);
            if (rangedUriAttemptMerge == null) {
                break;
            }
            i6++;
            i5++;
            segmentUrl = rangedUriAttemptMerge;
        }
        long j4 = (((long) i6) + j) - 1;
        long segmentEndTimeUs2 = representationHolder.getSegmentEndTimeUs(j4);
        long j5 = representationHolder.periodDurationUs;
        long j6 = (j5 == C.TIME_UNSET || j5 > segmentEndTimeUs2) ? -9223372036854775807L : j5;
        int i7 = representationHolder.isSegmentAvailableAtFullNetworkSpeed(j4, j3) ? 0 : 8;
        if (cmcdHeadersFactory == null) {
            onmoovcontaineratomreadCreateHttpRequestHeaders = onMoovContainerAtomRead.AudioAttributesCompatParcelizer();
        } else {
            onmoovcontaineratomreadCreateHttpRequestHeaders = cmcdHeadersFactory.setChunkDurationUs(segmentEndTimeUs2 - segmentStartTimeUs).setObjectType(CmcdHeadersFactory.getObjectType(this.trackSelection)).createHttpRequestHeaders();
        }
        return new ContainerMediaChunk(dataSource, DashUtil.buildDataSpec(representation, representationHolder.selectedBaseUrl.url, segmentUrl, i7, onmoovcontaineratomreadCreateHttpRequestHeaders), format, i2, obj, segmentStartTimeUs, segmentEndTimeUs2, j2, j6, j, i6, -representation.presentationTimeOffsetUs, representationHolder.chunkExtractor);
    }

    private RepresentationHolder updateSelectedBaseUrl(int i) {
        RepresentationHolder representationHolder = this.representationHolders[i];
        BaseUrl baseUrlSelectBaseUrl = this.baseUrlExclusionList.selectBaseUrl(representationHolder.representation.baseUrls);
        if (baseUrlSelectBaseUrl == null || baseUrlSelectBaseUrl.equals(representationHolder.selectedBaseUrl)) {
            return representationHolder;
        }
        RepresentationHolder representationHolderCopyWithNewSelectedBaseUrl = representationHolder.copyWithNewSelectedBaseUrl(baseUrlSelectBaseUrl);
        this.representationHolders[i] = representationHolderCopyWithNewSelectedBaseUrl;
        return representationHolderCopyWithNewSelectedBaseUrl;
    }

    protected static final class RepresentationSegmentIterator extends BaseMediaChunkIterator {
        private final long nowPeriodTimeUs;
        private final RepresentationHolder representationHolder;

        public RepresentationSegmentIterator(RepresentationHolder representationHolder, long j, long j2, long j3) {
            super(j, j2);
            this.representationHolder = representationHolder;
            this.nowPeriodTimeUs = j3;
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        public final DataSpec getDataSpec() {
            checkInBounds();
            long currentIndex = getCurrentIndex();
            return DashUtil.buildDataSpec(this.representationHolder.representation, this.representationHolder.selectedBaseUrl.url, this.representationHolder.getSegmentUrl(currentIndex), this.representationHolder.isSegmentAvailableAtFullNetworkSpeed(currentIndex, this.nowPeriodTimeUs) ? 0 : 8, onMoovContainerAtomRead.AudioAttributesCompatParcelizer());
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        public final long getChunkStartTimeUs() {
            checkInBounds();
            return this.representationHolder.getSegmentStartTimeUs(getCurrentIndex());
        }

        @Override // com.google.android.exoplayer2.source.chunk.MediaChunkIterator
        public final long getChunkEndTimeUs() {
            checkInBounds();
            return this.representationHolder.getSegmentEndTimeUs(getCurrentIndex());
        }
    }

    protected static final class RepresentationHolder {
        final ChunkExtractor chunkExtractor;
        private final long periodDurationUs;
        public final Representation representation;
        public final DashSegmentIndex segmentIndex;
        private final long segmentNumShift;
        public final BaseUrl selectedBaseUrl;

        RepresentationHolder(long j, Representation representation, BaseUrl baseUrl, ChunkExtractor chunkExtractor, long j2, DashSegmentIndex dashSegmentIndex) {
            this.periodDurationUs = j;
            this.representation = representation;
            this.selectedBaseUrl = baseUrl;
            this.segmentNumShift = j2;
            this.chunkExtractor = chunkExtractor;
            this.segmentIndex = dashSegmentIndex;
        }

        final RepresentationHolder copyWithNewRepresentation(long j, Representation representation) throws BehindLiveWindowException {
            long j2;
            long segmentNum;
            long segmentNum2;
            DashSegmentIndex index = this.representation.getIndex();
            DashSegmentIndex index2 = representation.getIndex();
            if (index == null) {
                return new RepresentationHolder(j, representation, this.selectedBaseUrl, this.chunkExtractor, this.segmentNumShift, index);
            }
            if (!index.isExplicit()) {
                return new RepresentationHolder(j, representation, this.selectedBaseUrl, this.chunkExtractor, this.segmentNumShift, index2);
            }
            long segmentCount = index.getSegmentCount(j);
            if (segmentCount == 0) {
                return new RepresentationHolder(j, representation, this.selectedBaseUrl, this.chunkExtractor, this.segmentNumShift, index2);
            }
            long firstSegmentNum = index.getFirstSegmentNum();
            long timeUs = index.getTimeUs(firstSegmentNum);
            long j3 = segmentCount + firstSegmentNum;
            long j4 = j3 - 1;
            long timeUs2 = index.getTimeUs(j4);
            long durationUs = index.getDurationUs(j4, j);
            long firstSegmentNum2 = index2.getFirstSegmentNum();
            long timeUs3 = index2.getTimeUs(firstSegmentNum2);
            long j5 = this.segmentNumShift;
            long j6 = timeUs2 + durationUs;
            if (j6 == timeUs3) {
                segmentNum = j3 - firstSegmentNum2;
                j2 = j5;
            } else {
                if (j6 < timeUs3) {
                    throw new BehindLiveWindowException();
                }
                if (timeUs3 < timeUs) {
                    segmentNum2 = j5 - (index2.getSegmentNum(timeUs, j) - firstSegmentNum);
                    return new RepresentationHolder(j, representation, this.selectedBaseUrl, this.chunkExtractor, segmentNum2, index2);
                }
                j2 = j5;
                segmentNum = index.getSegmentNum(timeUs3, j) - firstSegmentNum2;
            }
            segmentNum2 = j2 + segmentNum;
            return new RepresentationHolder(j, representation, this.selectedBaseUrl, this.chunkExtractor, segmentNum2, index2);
        }

        final RepresentationHolder copyWithNewSegmentIndex(DashSegmentIndex dashSegmentIndex) {
            return new RepresentationHolder(this.periodDurationUs, this.representation, this.selectedBaseUrl, this.chunkExtractor, this.segmentNumShift, dashSegmentIndex);
        }

        final RepresentationHolder copyWithNewSelectedBaseUrl(BaseUrl baseUrl) {
            return new RepresentationHolder(this.periodDurationUs, this.representation, baseUrl, this.chunkExtractor, this.segmentNumShift, this.segmentIndex);
        }

        public final long getFirstSegmentNum() {
            return this.segmentIndex.getFirstSegmentNum() + this.segmentNumShift;
        }

        public final long getFirstAvailableSegmentNum(long j) {
            return this.segmentIndex.getFirstAvailableSegmentNum(this.periodDurationUs, j) + this.segmentNumShift;
        }

        public final long getSegmentCount() {
            return this.segmentIndex.getSegmentCount(this.periodDurationUs);
        }

        public final long getSegmentStartTimeUs(long j) {
            return this.segmentIndex.getTimeUs(j - this.segmentNumShift);
        }

        public final long getSegmentEndTimeUs(long j) {
            return getSegmentStartTimeUs(j) + this.segmentIndex.getDurationUs(j - this.segmentNumShift, this.periodDurationUs);
        }

        public final long getSegmentNum(long j) {
            return this.segmentIndex.getSegmentNum(j, this.periodDurationUs) + this.segmentNumShift;
        }

        public final RangedUri getSegmentUrl(long j) {
            return this.segmentIndex.getSegmentUrl(j - this.segmentNumShift);
        }

        public final long getLastAvailableSegmentNum(long j) {
            return (getFirstAvailableSegmentNum(j) + this.segmentIndex.getAvailableSegmentCount(this.periodDurationUs, j)) - 1;
        }

        public final boolean isSegmentAvailableAtFullNetworkSpeed(long j, long j2) {
            return this.segmentIndex.isExplicit() || j2 == C.TIME_UNSET || getSegmentEndTimeUs(j) <= j2;
        }
    }
}
