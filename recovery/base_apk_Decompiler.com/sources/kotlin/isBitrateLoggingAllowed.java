package kotlin;

import com.marrow.data.api.models.response.lesson.LessonIndexResponseBody;
import com.marrow.data.models.paginationV2.PageValue;
import com.marrow2.core.network.model.NetworkApiResponse;
import java.util.List;
import kotlin.BandwidthMeterEventListener;
import kotlin.FastSafeParcelableJsonResponse;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B\u0089\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u001c\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0%0$H\u0096@¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+R\u0014\u0010*\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010'\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010.R\u0014\u0010/\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00105\u001a\u0002018\u0017X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b2\u00104"}, d2 = {"Lo/isBitrateLoggingAllowed;", "Lo/getSegmentName;", "Lo/BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0;", "p0", "Lo/ServerSideAdInsertionMediaSourceSampleStreamImpl;", "p1", "Lo/BundledChunkExtractor;", "p2", "Lo/onDashManifestPublishTimeExpired;", "p3", "Lo/resolveUtcTimingElementHttp;", "p4", "Lo/scheduleManifestRefresh;", "p5", "Lo/copyWithNewRepresentation;", "p6", "Lo/onUtcTimestampLoadCompleted;", "p7", "Lo/setManifestParser;", "p8", "Lo/onInitializationFailed;", "p9", "Lo/newMediaChunk;", "p10", "Lo/releaseDisabledStreams;", "p11", "Lo/getAdjustedWindowDefaultStartPositionUs;", "p12", "Lo/DefaultDashChunkSourceRepresentationHolder;", "p13", "Lo/DefaultDashChunkSource;", "p14", "Lo/getPlatform;", "p15", "<init>", "(Lo/BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0;Lo/ServerSideAdInsertionMediaSourceSampleStreamImpl;Lo/BundledChunkExtractor;Lo/onDashManifestPublishTimeExpired;Lo/resolveUtcTimingElementHttp;Lo/scheduleManifestRefresh;Lo/copyWithNewRepresentation;Lo/onUtcTimestampLoadCompleted;Lo/setManifestParser;Lo/onInitializationFailed;Lo/newMediaChunk;Lo/releaseDisabledStreams;Lo/getAdjustedWindowDefaultStartPositionUs;Lo/DefaultDashChunkSourceRepresentationHolder;Lo/DefaultDashChunkSource;Lo/getPlatform;)V", "Lcom/marrow2/core/network/model/NetworkApiResponse;", "", "Lcom/marrow/data/api/models/response/lesson/LessonIndexResponseBody;", "IconCompatParcelizer", "(Lo/SampleVideos;)Ljava/lang/Object;", "Lo/BandwidthMeterEventListener$read;", "read", "()Lo/BandwidthMeterEventListener$read;", "AudioAttributesImplApi26Parcelizer", "Lo/BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0;", "Lo/ServerSideAdInsertionMediaSourceSampleStreamImpl;", "AudioAttributesCompatParcelizer", "Lo/BundledChunkExtractor;", "Lo/AllocatorAllocationNode;", "RemoteActionCompatParcelizer", "Lo/AllocatorAllocationNode;", "()Lo/AllocatorAllocationNode;", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
@getPlanOldPrice
public final class isBitrateLoggingAllowed extends getSegmentName {
    private static int AudioAttributesImplApi21Parcelizer = 1;
    private static int AudioAttributesImplBaseParcelizer = 0;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static int MediaBrowserCompatCustomActionResultReceiver = 1;
    private static int MediaBrowserCompatItemReceiver;
    private final BundledChunkExtractor AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0 read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final AllocatorAllocationNode write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final ServerSideAdInsertionMediaSourceSampleStreamImpl IconCompatParcelizer;

    public static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = (~(i7 | i4)) | (~(i7 | i5)) | (~(i4 | i5));
        int i9 = (~(i2 | i5)) | i4;
        int i10 = (~(i5 | i2 | i4)) | (~(i7 | (~i4) | (~i5)));
        int i11 = i2 + i4 + i6 + (862446602 * i) + (395103901 * i3);
        int i12 = i11 * i11;
        int i13 = (((-1892237052) * i2) - 438566912) + ((-683246085) * i4) + (i8 * 402996989) + ((-805993978) * i9) + (402996989 * i10) + ((-1489240064) * i6) + ((-128450560) * i) + ((-674496512) * i3) + ((-1108934656) * i12);
        int i14 = (i2 * 1384179468) + 550727958 + (i4 * 1384180977) + (i8 * 503) + (i9 * (-1006)) + (i10 * 503) + (i6 * 1384179971) + (i * 1640285726) + (i3 * 120803543) + (i12 * 2025127936);
        int i15 = i13 + (i14 * i14 * (-275709952));
        return i15 != 1 ? i15 != 2 ? i15 != 3 ? write(objArr) : RemoteActionCompatParcelizer(objArr) : AudioAttributesCompatParcelizer(objArr) : read(objArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @setSdkPayload
    public isBitrateLoggingAllowed(BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0 bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0, ServerSideAdInsertionMediaSourceSampleStreamImpl serverSideAdInsertionMediaSourceSampleStreamImpl, BundledChunkExtractor bundledChunkExtractor, onDashManifestPublishTimeExpired ondashmanifestpublishtimeexpired, resolveUtcTimingElementHttp resolveutctimingelementhttp, scheduleManifestRefresh schedulemanifestrefresh, copyWithNewRepresentation copywithnewrepresentation, onUtcTimestampLoadCompleted onutctimestamploadcompleted, setManifestParser setmanifestparser, onInitializationFailed oninitializationfailed, newMediaChunk newmediachunk, releaseDisabledStreams releasedisabledstreams, getAdjustedWindowDefaultStartPositionUs getadjustedwindowdefaultstartpositionus, DefaultDashChunkSourceRepresentationHolder defaultDashChunkSourceRepresentationHolder, DefaultDashChunkSource defaultDashChunkSource, getPlatform getplatform) {
        super(serverSideAdInsertionMediaSourceSampleStreamImpl, bundledChunkExtractor, ondashmanifestpublishtimeexpired, resolveutctimingelementhttp, schedulemanifestrefresh, copywithnewrepresentation, onutctimestamploadcompleted, setmanifestparser, oninitializationfailed, newmediachunk, releasedisabledstreams, getadjustedwindowdefaultstartpositionus, defaultDashChunkSourceRepresentationHolder, defaultDashChunkSource, getplatform);
        toMagicModuleMetaRepoModel.write(bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0, "");
        toMagicModuleMetaRepoModel.write(serverSideAdInsertionMediaSourceSampleStreamImpl, "");
        toMagicModuleMetaRepoModel.write(bundledChunkExtractor, "");
        int i = AudioAttributesImplApi21Parcelizer;
        int i2 = i | 119;
        int i3 = ((i2 << 1) - (~(-((~(i & 119)) & i2)))) - 1;
        AudioAttributesImplBaseParcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            Object obj = null;
            toMagicModuleMetaRepoModel.write(ondashmanifestpublishtimeexpired, "");
            toMagicModuleMetaRepoModel.write(resolveutctimingelementhttp, "");
            toMagicModuleMetaRepoModel.write(schedulemanifestrefresh, "");
            obj.hashCode();
            throw null;
        }
        toMagicModuleMetaRepoModel.write(ondashmanifestpublishtimeexpired, "");
        toMagicModuleMetaRepoModel.write(resolveutctimingelementhttp, "");
        toMagicModuleMetaRepoModel.write(schedulemanifestrefresh, "");
        int i4 = AudioAttributesImplBaseParcelizer;
        int i5 = i4 & 3;
        int i6 = (i4 ^ 3) | i5;
        int i7 = (i5 & i6) + (i6 | i5);
        AudioAttributesImplApi21Parcelizer = i7 % 128;
        if (i7 % 2 == 0) {
            Object obj2 = null;
            toMagicModuleMetaRepoModel.write(copywithnewrepresentation, "");
            toMagicModuleMetaRepoModel.write(onutctimestamploadcompleted, "");
            toMagicModuleMetaRepoModel.write(setmanifestparser, "");
            obj2.hashCode();
            throw null;
        }
        toMagicModuleMetaRepoModel.write(copywithnewrepresentation, "");
        toMagicModuleMetaRepoModel.write(onutctimestamploadcompleted, "");
        toMagicModuleMetaRepoModel.write(setmanifestparser, "");
        toMagicModuleMetaRepoModel.write(oninitializationfailed, "");
        toMagicModuleMetaRepoModel.write(newmediachunk, "");
        toMagicModuleMetaRepoModel.write(releasedisabledstreams, "");
        int i8 = AudioAttributesImplApi21Parcelizer + 41;
        AudioAttributesImplBaseParcelizer = i8 % 128;
        int i9 = i8 % 2;
        toMagicModuleMetaRepoModel.write(getadjustedwindowdefaultstartpositionus, "");
        toMagicModuleMetaRepoModel.write(defaultDashChunkSourceRepresentationHolder, "");
        toMagicModuleMetaRepoModel.write(defaultDashChunkSource, "");
        int i10 = AudioAttributesImplApi21Parcelizer;
        int i11 = ((i10 & (-116)) | (115 & (~i10))) + ((i10 & 115) << 1);
        AudioAttributesImplBaseParcelizer = i11 % 128;
        if (i11 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(getplatform, "");
            throw null;
        }
        toMagicModuleMetaRepoModel.write(getplatform, "");
        this.read = bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0;
        this.IconCompatParcelizer = serverSideAdInsertionMediaSourceSampleStreamImpl;
        this.AudioAttributesCompatParcelizer = bundledChunkExtractor;
        this.write = AllocatorAllocationNode.write;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        isBitrateLoggingAllowed isbitrateloggingallowed = (isBitrateLoggingAllowed) objArr[0];
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 55;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            return (BandwidthMeterEventListener.read) RemoteActionCompatParcelizer(new Object[]{isbitrateloggingallowed}, FastSafeParcelableJsonResponse.AnonymousClass5.AudioAttributesCompatParcelizer(), -313370253, FastSafeParcelableJsonResponse.AnonymousClass5.AudioAttributesCompatParcelizer(), 313370253, FastSafeParcelableJsonResponse.AnonymousClass5.AudioAttributesCompatParcelizer(), FastSafeParcelableJsonResponse.AnonymousClass5.AudioAttributesCompatParcelizer());
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        isBitrateLoggingAllowed isbitrateloggingallowed = (isBitrateLoggingAllowed) objArr[0];
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer;
        int i3 = ((i2 | 83) << 1) - (i2 ^ 83);
        AudioAttributesImplApi21Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        AllocatorAllocationNode allocatorAllocationNode = isbitrateloggingallowed.write;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 & 121;
        int i6 = (i2 | 121) & (~i5);
        int i7 = -(-(i5 << 1));
        int i8 = (i6 & i7) + (i6 | i7);
        AudioAttributesImplApi21Parcelizer = i8 % 128;
        if (i8 % 2 == 0) {
            int i9 = 35 / 0;
        }
        return allocatorAllocationNode;
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        Object objRemoteActionCompatParcelizer;
        isBitrateLoggingAllowed isbitrateloggingallowed = (isBitrateLoggingAllowed) objArr[0];
        SampleVideos<? super NetworkApiResponse<List<LessonIndexResponseBody>>> sampleVideos = (SampleVideos) objArr[1];
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer;
        int i3 = ((i2 & 2) + (i2 | 2)) - 1;
        AudioAttributesImplBaseParcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            objRemoteActionCompatParcelizer = isbitrateloggingallowed.read.RemoteActionCompatParcelizer(sampleVideos);
            int i4 = 59 / 0;
        } else {
            objRemoteActionCompatParcelizer = isbitrateloggingallowed.read.RemoteActionCompatParcelizer(sampleVideos);
        }
        int i5 = AudioAttributesImplBaseParcelizer;
        int i6 = i5 & 5;
        int i7 = (i5 | 5) & (~i6);
        int i8 = -(-(i6 << 1));
        int i9 = (i7 & i8) + (i7 | i8);
        AudioAttributesImplApi21Parcelizer = i9 % 128;
        if (i9 % 2 != 0) {
            return objRemoteActionCompatParcelizer;
        }
        throw null;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        int i = 2 % 2;
        BandwidthMeterEventListener.read readVar = new BandwidthMeterEventListener.read(PageValue.PAGE_VALUE_LESSON.concat(String.valueOf(((isBitrateLoggingAllowed) objArr[0]).AudioAttributesCompatParcelizer.onSetRating())));
        int i2 = AudioAttributesImplApi21Parcelizer;
        int i3 = i2 & 37;
        int i4 = (i2 | 37) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 & i5) + (i4 | i5);
        AudioAttributesImplBaseParcelizer = i6 % 128;
        int i7 = i6 % 2;
        return readVar;
    }

    /* JADX INFO: renamed from: o.isBitrateLoggingAllowed$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/isBitrateLoggingAllowed$IconCompatParcelizer;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    static {
        int i = MediaBrowserCompatItemReceiver + 29;
        MediaBrowserCompatCustomActionResultReceiver = i % 128;
        if (i % 2 == 0) {
            int i2 = 92 / 0;
        }
    }

    @Override // com.marrow2.core.sync.PaginatedSyncTask
    public final Object IconCompatParcelizer(SampleVideos<? super NetworkApiResponse<List<? extends LessonIndexResponseBody>>> sampleVideos) {
        return RemoteActionCompatParcelizer(new Object[]{this, sampleVideos}, FastSafeParcelableJsonResponse.AnonymousClass5.AudioAttributesCompatParcelizer(), -993431121, FastSafeParcelableJsonResponse.AnonymousClass5.AudioAttributesCompatParcelizer(), 993431123, FastSafeParcelableJsonResponse.AnonymousClass5.AudioAttributesCompatParcelizer(), FastSafeParcelableJsonResponse.AnonymousClass5.AudioAttributesCompatParcelizer());
    }

    @Override // com.marrow2.core.sync.PaginatedSyncTask
    public final AllocatorAllocationNode RemoteActionCompatParcelizer() {
        return (AllocatorAllocationNode) RemoteActionCompatParcelizer(new Object[]{this}, FastSafeParcelableJsonResponse.AnonymousClass5.AudioAttributesCompatParcelizer(), -1169682103, FastSafeParcelableJsonResponse.AnonymousClass5.AudioAttributesCompatParcelizer(), 1169682106, FastSafeParcelableJsonResponse.AnonymousClass5.AudioAttributesCompatParcelizer(), FastSafeParcelableJsonResponse.AnonymousClass5.AudioAttributesCompatParcelizer());
    }

    private BandwidthMeterEventListener.read read() {
        return (BandwidthMeterEventListener.read) RemoteActionCompatParcelizer(new Object[]{this}, FastSafeParcelableJsonResponse.AnonymousClass5.AudioAttributesCompatParcelizer(), -313370253, FastSafeParcelableJsonResponse.AnonymousClass5.AudioAttributesCompatParcelizer(), 313370253, FastSafeParcelableJsonResponse.AnonymousClass5.AudioAttributesCompatParcelizer(), FastSafeParcelableJsonResponse.AnonymousClass5.AudioAttributesCompatParcelizer());
    }

    @Override // com.marrow2.core.sync.PaginatedSyncTask
    public final /* synthetic */ BandwidthMeterEventListener IconCompatParcelizer() {
        return (BandwidthMeterEventListener) RemoteActionCompatParcelizer(new Object[]{this}, FastSafeParcelableJsonResponse.AnonymousClass5.AudioAttributesCompatParcelizer(), -267451679, FastSafeParcelableJsonResponse.AnonymousClass5.AudioAttributesCompatParcelizer(), 267451680, FastSafeParcelableJsonResponse.AnonymousClass5.AudioAttributesCompatParcelizer(), FastSafeParcelableJsonResponse.AnonymousClass5.AudioAttributesCompatParcelizer());
    }
}
