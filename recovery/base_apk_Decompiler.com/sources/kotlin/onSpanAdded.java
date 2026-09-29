package kotlin;

import com.google.android.exoplayer2.video.VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9;
import com.marrow.data.models.common.CourseConfigV2;
import com.marrow2.core.network.model.NetworkApiResponse;
import com.marrow2.core.sync.PaginatedSyncTask;
import kotlin.BandwidthMeterEventListener;

/* JADX INFO: loaded from: classes3.dex */
@getPlanOldPrice
public final class onSpanAdded extends PaginatedSyncTask<CourseConfigV2> {
    private static int AudioAttributesImplApi21Parcelizer = 0;
    private static int AudioAttributesImplApi26Parcelizer = 1;
    private final withLastAdRemoved AudioAttributesCompatParcelizer;
    private final BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0 IconCompatParcelizer;
    private final getStreamPositionUsForContent RemoteActionCompatParcelizer;
    private final AllocatorAllocationNode read;

    public static /* synthetic */ Object write(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~(i7 | i);
        int i9 = ~i;
        int i10 = ~((~i5) | i9);
        int i11 = ~(i9 | i4);
        int i12 = i10 | i11;
        int i13 = (~(i5 | i7)) | i11 | i8;
        int i14 = i + i4 + i2 + ((-168536539) * i6) + (1787681333 * i3);
        int i15 = i14 * i14;
        int i16 = ((-1349843359) * i) + 1460535296 + ((-923239215) * i4) + ((-1716058528) * i8) + (i12 * (-1289454384)) + ((-1289454384) * i13) + (366215168 * i2) + (1604583424 * i6) + (216268800 * i3) + (1778253824 * i15);
        int i17 = (i * (-925914073)) + 175428941 + (i4 * (-925912777)) + (i8 * (-864)) + (i12 * 432) + (i13 * 432) + (i2 * (-925913209)) + (i6 * 1252505731) + (i3 * 30625011) + (i15 * (-2030960640));
        int i18 = i16 + (i17 * i17 * 899809280);
        return i18 != 1 ? i18 != 2 ? i18 != 3 ? i18 != 4 ? i18 != 5 ? read(objArr) : AudioAttributesImplApi21Parcelizer(objArr) : write(objArr) : AudioAttributesCompatParcelizer(objArr) : IconCompatParcelizer(objArr) : RemoteActionCompatParcelizer(objArr);
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer;
        int i3 = ((i2 ^ 85) | (i2 & 85)) << 1;
        int i4 = -(((~i2) & 85) | (i2 & (-86)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        AudioAttributesImplApi26Parcelizer = i5 % 128;
        int i6 = i5 % 2;
        int iIconCompatParcelizer = VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9.IconCompatParcelizer();
        BandwidthMeterEventListener.IconCompatParcelizer iconCompatParcelizer = (BandwidthMeterEventListener.IconCompatParcelizer) write(462560646, VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9.IconCompatParcelizer(), new Object[0], VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9.IconCompatParcelizer(), -462560646, iIconCompatParcelizer, VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9.IconCompatParcelizer());
        int i7 = AudioAttributesImplApi26Parcelizer;
        int i8 = i7 & 45;
        int i9 = i8 + ((i7 ^ 45) | i8);
        AudioAttributesImplApi21Parcelizer = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 73 / 0;
        }
        return iconCompatParcelizer;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        onSpanAdded onspanadded = (onSpanAdded) objArr[0];
        Object obj = objArr[1];
        ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer;
        int i3 = ((i2 | 25) << 1) - (i2 ^ 25);
        AudioAttributesImplApi26Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        int iIconCompatParcelizer = VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9.IconCompatParcelizer();
        Object objWrite = write(-910363339, VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9.IconCompatParcelizer(), new Object[]{onspanadded, (CourseConfigV2) obj}, VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9.IconCompatParcelizer(), 910363342, iIconCompatParcelizer, VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9.IconCompatParcelizer());
        int i5 = AudioAttributesImplApi26Parcelizer;
        int i6 = (((i5 ^ 73) | (i5 & 73)) << 1) - (((~i5) & 73) | (i5 & (-74)));
        AudioAttributesImplApi21Parcelizer = i6 % 128;
        int i7 = i6 % 2;
        return objWrite;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @setSdkPayload
    public onSpanAdded(ServerSideAdInsertionMediaSourceSampleStreamImpl serverSideAdInsertionMediaSourceSampleStreamImpl, BundledChunkExtractor bundledChunkExtractor, BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0 bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0, getStreamPositionUsForContent getstreampositionusforcontent, withLastAdRemoved withlastadremoved) {
        super(serverSideAdInsertionMediaSourceSampleStreamImpl, bundledChunkExtractor);
        toMagicModuleMetaRepoModel.write(serverSideAdInsertionMediaSourceSampleStreamImpl, "");
        toMagicModuleMetaRepoModel.write(bundledChunkExtractor, "");
        int i = AudioAttributesImplApi26Parcelizer;
        int i2 = (i & (-32)) | ((~i) & 31);
        int i3 = -(-((i & 31) << 1));
        int i4 = ((i2 | i3) << 1) - (i3 ^ i2);
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0, "");
            toMagicModuleMetaRepoModel.write(getstreampositionusforcontent, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        toMagicModuleMetaRepoModel.write(bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0, "");
        toMagicModuleMetaRepoModel.write(getstreampositionusforcontent, "");
        toMagicModuleMetaRepoModel.write(withlastadremoved, "");
        this.IconCompatParcelizer = bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0;
        this.RemoteActionCompatParcelizer = getstreampositionusforcontent;
        this.AudioAttributesCompatParcelizer = withlastadremoved;
        this.read = AllocatorAllocationNode.AudioAttributesCompatParcelizer;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        onSpanAdded onspanadded = (onSpanAdded) objArr[0];
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer;
        int i3 = i2 + 2;
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        int i5 = i4 % 2;
        AllocatorAllocationNode allocatorAllocationNode = onspanadded.read;
        int i6 = i2 + 7;
        AudioAttributesImplApi21Parcelizer = i6 % 128;
        if (i6 % 2 == 0) {
            return allocatorAllocationNode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object AudioAttributesImplApi21Parcelizer(Object[] objArr) {
        int iOnPrepareFromUri;
        getStreamPositionUsForContent getstreampositionusforcontent;
        onSpanAdded onspanadded = (onSpanAdded) objArr[0];
        SampleVideos<? super NetworkApiResponse<CourseConfigV2>> sampleVideos = (SampleVideos) objArr[1];
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 51;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0 bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0 = onspanadded.IconCompatParcelizer;
        int iOnRemoveQueueItem = onspanadded.RemoteActionCompatParcelizer.onRemoveQueueItem();
        int i4 = AudioAttributesImplApi21Parcelizer;
        int i5 = i4 ^ 99;
        int i6 = ((i4 & 99) | i5) << 1;
        int i7 = -i5;
        int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
        AudioAttributesImplApi26Parcelizer = i8 % 128;
        if (i8 % 2 == 0) {
            iOnPrepareFromUri = onspanadded.RemoteActionCompatParcelizer.onPrepareFromUri();
            getstreampositionusforcontent = onspanadded.RemoteActionCompatParcelizer;
            int i9 = 41 / 0;
        } else {
            iOnPrepareFromUri = onspanadded.RemoteActionCompatParcelizer.onPrepareFromUri();
            getstreampositionusforcontent = onspanadded.RemoteActionCompatParcelizer;
        }
        int iAudioAttributesImplApi21Parcelizer = getstreampositionusforcontent.AudioAttributesImplApi21Parcelizer("course_config_data_version");
        int i10 = AudioAttributesImplApi21Parcelizer;
        int i11 = (i10 ^ 95) + ((i10 & 95) << 1);
        AudioAttributesImplApi26Parcelizer = i11 % 128;
        if (i11 % 2 == 0) {
            bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0.RemoteActionCompatParcelizer(iOnRemoveQueueItem, iOnPrepareFromUri, iAudioAttributesImplApi21Parcelizer, sampleVideos);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objRemoteActionCompatParcelizer = bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0.RemoteActionCompatParcelizer(iOnRemoveQueueItem, iOnPrepareFromUri, iAudioAttributesImplApi21Parcelizer, sampleVideos);
        int i12 = AudioAttributesImplApi21Parcelizer;
        int i13 = i12 & 51;
        int i14 = (((i12 ^ 51) | i13) << 1) - ((i12 | 51) & (~i13));
        AudioAttributesImplApi26Parcelizer = i14 % 128;
        int i15 = i14 % 2;
        return objRemoteActionCompatParcelizer;
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        onSpanAdded onspanadded = (onSpanAdded) objArr[0];
        CourseConfigV2 courseConfigV2 = (CourseConfigV2) objArr[1];
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer;
        int i3 = (i2 & 11) + (i2 | 11);
        AudioAttributesImplApi21Parcelizer = i3 % 128;
        if (i3 % 2 == 0) {
            onspanadded.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(courseConfigV2);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            int i4 = AudioAttributesImplApi21Parcelizer;
            int i5 = i4 & 83;
            int i6 = (i4 ^ 83) | i5;
            int i7 = (i5 ^ i6) + ((i6 & i5) << 1);
            AudioAttributesImplApi26Parcelizer = i7 % 128;
            int i8 = i7 % 2;
            return getshowpopup;
        }
        onspanadded.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(courseConfigV2);
        getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
        throw null;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 35;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            BandwidthMeterEventListener.IconCompatParcelizer iconCompatParcelizer = BandwidthMeterEventListener.IconCompatParcelizer.INSTANCE;
            obj.hashCode();
            throw null;
        }
        BandwidthMeterEventListener.IconCompatParcelizer iconCompatParcelizer2 = BandwidthMeterEventListener.IconCompatParcelizer.INSTANCE;
        int i3 = AudioAttributesImplApi21Parcelizer;
        int i4 = (i3 & 123) + (i3 | 123);
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            return iconCompatParcelizer2;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.marrow2.core.sync.PaginatedSyncTask
    public final Object IconCompatParcelizer(SampleVideos<? super NetworkApiResponse<CourseConfigV2>> sampleVideos) {
        int iIconCompatParcelizer = VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9.IconCompatParcelizer();
        return write(1776519067, VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9.IconCompatParcelizer(), new Object[]{this, sampleVideos}, VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9.IconCompatParcelizer(), -1776519062, iIconCompatParcelizer, VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9.IconCompatParcelizer());
    }

    @Override // com.marrow2.core.sync.PaginatedSyncTask
    public final AllocatorAllocationNode RemoteActionCompatParcelizer() {
        int iIconCompatParcelizer = VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9.IconCompatParcelizer();
        return (AllocatorAllocationNode) write(1623813583, VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9.IconCompatParcelizer(), new Object[]{this}, VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9.IconCompatParcelizer(), -1623813579, iIconCompatParcelizer, VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9.IconCompatParcelizer());
    }

    private static BandwidthMeterEventListener.IconCompatParcelizer write() {
        int iIconCompatParcelizer = VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9.IconCompatParcelizer();
        return (BandwidthMeterEventListener.IconCompatParcelizer) write(462560646, VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9.IconCompatParcelizer(), new Object[0], VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9.IconCompatParcelizer(), -462560646, iIconCompatParcelizer, VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9.IconCompatParcelizer());
    }

    @Override // com.marrow2.core.sync.PaginatedSyncTask
    public final /* bridge */ /* synthetic */ BandwidthMeterEventListener IconCompatParcelizer() {
        int iIconCompatParcelizer = VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9.IconCompatParcelizer();
        return (BandwidthMeterEventListener) write(107759681, VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9.IconCompatParcelizer(), new Object[]{this}, VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9.IconCompatParcelizer(), -107759679, iIconCompatParcelizer, VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9.IconCompatParcelizer());
    }

    private Object AudioAttributesCompatParcelizer(CourseConfigV2 courseConfigV2) {
        int iIconCompatParcelizer = VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9.IconCompatParcelizer();
        return write(-910363339, VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9.IconCompatParcelizer(), new Object[]{this, courseConfigV2}, VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9.IconCompatParcelizer(), 910363342, iIconCompatParcelizer, VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9.IconCompatParcelizer());
    }

    @Override // com.marrow2.core.sync.PaginatedSyncTask
    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(CourseConfigV2 courseConfigV2, boolean z, SampleVideos sampleVideos) {
        Object[] objArr = {this, courseConfigV2, Boolean.valueOf(z), sampleVideos};
        int iIconCompatParcelizer = VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9.IconCompatParcelizer();
        return write(-1144437343, VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9.IconCompatParcelizer(), objArr, VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9.IconCompatParcelizer(), 1144437344, iIconCompatParcelizer, VideoRendererEventListener$EventDispatcher$$ExternalSyntheticLambda9.IconCompatParcelizer());
    }
}
