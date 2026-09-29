package com.google.android.exoplayer2.source.dash.offline;

import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.offline.SegmentDownloader;
import com.google.android.exoplayer2.source.dash.BaseUrlExclusionList;
import com.google.android.exoplayer2.source.dash.DashSegmentIndex;
import com.google.android.exoplayer2.source.dash.DashUtil;
import com.google.android.exoplayer2.source.dash.DashWrappingSegmentIndex;
import com.google.android.exoplayer2.source.dash.manifest.AdaptationSet;
import com.google.android.exoplayer2.source.dash.manifest.DashManifest;
import com.google.android.exoplayer2.source.dash.manifest.DashManifestParser;
import com.google.android.exoplayer2.source.dash.manifest.Period;
import com.google.android.exoplayer2.source.dash.manifest.RangedUri;
import com.google.android.exoplayer2.source.dash.manifest.Representation;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.ParsingLoadable;
import com.google.android.exoplayer2.upstream.cache.CacheDataSource;
import com.google.android.exoplayer2.util.RunnableFutureTask;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.ObjectIdWriter;
import kotlin.onMoovContainerAtomRead;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class DashDownloader extends SegmentDownloader<DashManifest> {
    private final BaseUrlExclusionList baseUrlExclusionList;

    public DashDownloader(MediaItem mediaItem, CacheDataSource.Factory factory) {
        this(mediaItem, factory, new ObjectIdWriter());
    }

    public DashDownloader(MediaItem mediaItem, CacheDataSource.Factory factory, Executor executor) {
        this(mediaItem, new DashManifestParser(), factory, executor, 20000L);
    }

    @Deprecated
    public DashDownloader(MediaItem mediaItem, ParsingLoadable.Parser<DashManifest> parser, CacheDataSource.Factory factory, Executor executor) {
        this(mediaItem, parser, factory, executor, 20000L);
    }

    public DashDownloader(MediaItem mediaItem, ParsingLoadable.Parser<DashManifest> parser, CacheDataSource.Factory factory, Executor executor, long j) {
        super(mediaItem, parser, factory, executor, j);
        this.baseUrlExclusionList = new BaseUrlExclusionList();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.offline.SegmentDownloader
    public final List<SegmentDownloader.Segment> getSegments(DataSource dataSource, DashManifest dashManifest, boolean z) throws InterruptedException, IOException {
        ArrayList<SegmentDownloader.Segment> arrayList = new ArrayList<>();
        for (int i = 0; i < dashManifest.getPeriodCount(); i++) {
            Period period = dashManifest.getPeriod(i);
            long jMsToUs = Util.msToUs(period.startMs);
            long periodDurationUs = dashManifest.getPeriodDurationUs(i);
            int i2 = 0;
            for (List<AdaptationSet> list = period.adaptationSets; i2 < list.size(); list = list) {
                addSegmentsForAdaptationSet(dataSource, list.get(i2), jMsToUs, periodDurationUs, z, arrayList);
                i2++;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00b9 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void addSegmentsForAdaptationSet(com.google.android.exoplayer2.upstream.DataSource r29, com.google.android.exoplayer2.source.dash.manifest.AdaptationSet r30, long r31, long r33, boolean r35, java.util.ArrayList<com.google.android.exoplayer2.offline.SegmentDownloader.Segment> r36) throws java.lang.InterruptedException, java.io.IOException {
        /*
            r28 = this;
            r7 = r28
            r8 = r30
            r9 = r35
            r10 = r36
            r0 = 0
            r11 = r0
        La:
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.Representation> r0 = r8.representations
            int r0 = r0.size()
            if (r11 >= r0) goto Lbe
            java.util.List<com.google.android.exoplayer2.source.dash.manifest.Representation> r0 = r8.representations
            java.lang.Object r0 = r0.get(r11)
            com.google.android.exoplayer2.source.dash.manifest.Representation r0 = (com.google.android.exoplayer2.source.dash.manifest.Representation) r0
            int r1 = r8.type     // Catch: java.io.IOException -> Lb3
            r12 = r29
            com.google.android.exoplayer2.source.dash.DashSegmentIndex r13 = r7.getSegmentIndex(r12, r1, r0, r9)     // Catch: java.io.IOException -> Laf
            if (r13 == 0) goto La3
            r14 = r33
            long r16 = r13.getSegmentCount(r14)
            r1 = -1
            int r1 = (r16 > r1 ? 1 : (r16 == r1 ? 0 : -1))
            if (r1 == 0) goto L9b
            com.google.android.exoplayer2.source.dash.BaseUrlExclusionList r1 = r7.baseUrlExclusionList
            o.initExtraTracks<com.google.android.exoplayer2.source.dash.manifest.BaseUrl> r2 = r0.baseUrls
            com.google.android.exoplayer2.source.dash.manifest.BaseUrl r1 = r1.selectBaseUrl(r2)
            java.lang.Object r1 = com.google.android.exoplayer2.util.Util.castNonNull(r1)
            com.google.android.exoplayer2.source.dash.manifest.BaseUrl r1 = (com.google.android.exoplayer2.source.dash.manifest.BaseUrl) r1
            java.lang.String r6 = r1.url
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r18 = r0.getInitializationUri()
            if (r18 == 0) goto L58
            r1 = r28
            r2 = r0
            r3 = r6
            r4 = r31
            r19 = r6
            r6 = r18
            com.google.android.exoplayer2.offline.SegmentDownloader$Segment r1 = r1.createSegment(r2, r3, r4, r6)
            r10.add(r1)
            goto L5a
        L58:
            r19 = r6
        L5a:
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r6 = r0.getIndexUri()
            if (r6 == 0) goto L6e
            r1 = r28
            r2 = r0
            r3 = r19
            r4 = r31
            com.google.android.exoplayer2.offline.SegmentDownloader$Segment r1 = r1.createSegment(r2, r3, r4, r6)
            r10.add(r1)
        L6e:
            long r20 = r13.getFirstSegmentNum()
            r4 = r20
        L74:
            long r1 = r16 + r20
            r22 = 1
            long r1 = r1 - r22
            int r1 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r1 > 0) goto Lb9
            long r1 = r13.getTimeUs(r4)
            com.google.android.exoplayer2.source.dash.manifest.RangedUri r6 = r13.getSegmentUrl(r4)
            long r24 = r31 + r1
            r1 = r28
            r2 = r0
            r3 = r19
            r26 = r4
            r4 = r24
            com.google.android.exoplayer2.offline.SegmentDownloader$Segment r1 = r1.createSegment(r2, r3, r4, r6)
            r10.add(r1)
            long r4 = r26 + r22
            goto L74
        L9b:
            com.google.android.exoplayer2.offline.DownloadException r0 = new com.google.android.exoplayer2.offline.DownloadException
            java.lang.String r1 = "Unbounded segment index"
            r0.<init>(r1)
            throw r0
        La3:
            r14 = r33
            com.google.android.exoplayer2.offline.DownloadException r0 = new com.google.android.exoplayer2.offline.DownloadException     // Catch: java.io.IOException -> Lad
            java.lang.String r1 = "Missing segment index"
            r0.<init>(r1)     // Catch: java.io.IOException -> Lad
            throw r0     // Catch: java.io.IOException -> Lad
        Lad:
            r0 = move-exception
            goto Lb7
        Laf:
            r0 = move-exception
        Lb0:
            r14 = r33
            goto Lb7
        Lb3:
            r0 = move-exception
            r12 = r29
            goto Lb0
        Lb7:
            if (r9 == 0) goto Lbd
        Lb9:
            int r11 = r11 + 1
            goto La
        Lbd:
            throw r0
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.offline.DashDownloader.addSegmentsForAdaptationSet(com.google.android.exoplayer2.upstream.DataSource, com.google.android.exoplayer2.source.dash.manifest.AdaptationSet, long, long, boolean, java.util.ArrayList):void");
    }

    private SegmentDownloader.Segment createSegment(Representation representation, String str, long j, RangedUri rangedUri) {
        return new SegmentDownloader.Segment(j, DashUtil.buildDataSpec(representation, str, rangedUri, 0, onMoovContainerAtomRead.AudioAttributesCompatParcelizer()));
    }

    private DashSegmentIndex getSegmentIndex(final DataSource dataSource, final int i, final Representation representation, boolean z) throws InterruptedException, IOException {
        DashSegmentIndex index = representation.getIndex();
        if (index != null) {
            return index;
        }
        ChunkIndex chunkIndex = (ChunkIndex) execute(new RunnableFutureTask<ChunkIndex, IOException>() { // from class: com.google.android.exoplayer2.source.dash.offline.DashDownloader.1
            /* JADX INFO: Access modifiers changed from: protected */
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.google.android.exoplayer2.util.RunnableFutureTask
            public ChunkIndex doWork() throws IOException {
                return DashUtil.loadChunkIndex(dataSource, i, representation);
            }
        }, z);
        if (chunkIndex == null) {
            return null;
        }
        return new DashWrappingSegmentIndex(chunkIndex, representation.presentationTimeOffsetUs);
    }
}
