package kotlin;

import com.marrow.data.models.common.FeaturedCard;
import com.marrow2.core.network.model.NetworkApiResponse;
import com.marrow2.core.sync.PaginatedSyncTask;
import java.util.List;
import kotlin.BandwidthMeterEventListener;
import kotlin.addConnectionCallbacks;

/* JADX INFO: loaded from: classes3.dex */
@getPlanOldPrice
public final class CmcdConfiguration extends PaginatedSyncTask<List<? extends FeaturedCard>> {
    private static int AudioAttributesImplApi21Parcelizer = 0;
    private static int AudioAttributesImplApi26Parcelizer = 1;
    private final withRemovedAdGroupCount AudioAttributesCompatParcelizer;
    private final BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0 AudioAttributesImplBaseParcelizer;
    private final AllocatorAllocationNode IconCompatParcelizer;
    private final ServerSideAdInsertionMediaSourceMediaPeriodImpl RemoteActionCompatParcelizer;
    private final withAllAdsReset read;

    public static /* synthetic */ Object read(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i4;
        int i8 = ~((~i) | i7);
        int i9 = ~i3;
        int i10 = i8 | (~(i9 | i)) | (~(i4 | i));
        int i11 = i7 | i;
        int i12 = i9 | i11;
        int i13 = i4 + i + i2 + ((-1542968645) * i6) + (1789173782 * i5);
        int i14 = i13 * i13;
        int i15 = (1553370224 * i4) + 752877568 + ((-368479342) * i) + (i10 * 1186558865) + (1921849566 * i11) + (1186558865 * i12) + ((-1555038208) * i2) + (1802502144 * i6) + (148897792 * i5) + (289275904 * i14);
        int i16 = (i4 * (-930071408)) + 1959937684 + (i * (-930070194)) + (i10 * 607) + (i11 * (-1214)) + (i12 * 607) + (i2 * (-930070801)) + (i6 * 1059663509) + (i5 * (-1428764534)) + (i14 * 484573184);
        switch (i15 + (i16 * i16 * 411172864)) {
            case 1:
                return IconCompatParcelizer(objArr);
            case 2:
                return AudioAttributesCompatParcelizer(objArr);
            case 3:
                return read(objArr);
            case 4:
                return RemoteActionCompatParcelizer(objArr);
            case 5:
                return AudioAttributesImplApi21Parcelizer(objArr);
            case 6:
                return AudioAttributesImplApi26Parcelizer(objArr);
            default:
                return write(objArr);
        }
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        CmcdConfiguration cmcdConfiguration = (CmcdConfiguration) objArr[0];
        Object obj = objArr[1];
        ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer;
        int i3 = i2 & 107;
        int i4 = (i2 | 107) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        AudioAttributesImplApi26Parcelizer = i6 % 128;
        List list = (List) obj;
        if (i6 % 2 == 0) {
            int iIconCompatParcelizer = addConnectionCallbacks.write.IconCompatParcelizer();
            int iIconCompatParcelizer2 = addConnectionCallbacks.write.IconCompatParcelizer();
            int iIconCompatParcelizer3 = addConnectionCallbacks.write.IconCompatParcelizer();
            read(1684924439, iIconCompatParcelizer2, iIconCompatParcelizer, -1684924436, addConnectionCallbacks.write.IconCompatParcelizer(), new Object[]{cmcdConfiguration, list}, iIconCompatParcelizer3);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        int iIconCompatParcelizer4 = addConnectionCallbacks.write.IconCompatParcelizer();
        int iIconCompatParcelizer5 = addConnectionCallbacks.write.IconCompatParcelizer();
        int iIconCompatParcelizer6 = addConnectionCallbacks.write.IconCompatParcelizer();
        Object obj3 = read(1684924439, iIconCompatParcelizer5, iIconCompatParcelizer4, -1684924436, addConnectionCallbacks.write.IconCompatParcelizer(), new Object[]{cmcdConfiguration, list}, iIconCompatParcelizer6);
        int i7 = AudioAttributesImplApi21Parcelizer;
        int i8 = (i7 & (-4)) | ((~i7) & 3);
        int i9 = (i7 & 3) << 1;
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        AudioAttributesImplApi26Parcelizer = i10 % 128;
        int i11 = i10 % 2;
        return obj3;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer;
        int i3 = (i2 & (-72)) | ((~i2) & 71);
        int i4 = (i2 & 71) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        AudioAttributesImplApi21Parcelizer = i5 % 128;
        int i6 = i5 % 2;
        int iIconCompatParcelizer = addConnectionCallbacks.write.IconCompatParcelizer();
        int iIconCompatParcelizer2 = addConnectionCallbacks.write.IconCompatParcelizer();
        int iIconCompatParcelizer3 = addConnectionCallbacks.write.IconCompatParcelizer();
        BandwidthMeterEventListener.IconCompatParcelizer iconCompatParcelizer = (BandwidthMeterEventListener.IconCompatParcelizer) read(-202436183, iIconCompatParcelizer2, iIconCompatParcelizer, 202436188, addConnectionCallbacks.write.IconCompatParcelizer(), new Object[0], iIconCompatParcelizer3);
        int i7 = AudioAttributesImplApi26Parcelizer + 24;
        int i8 = (i7 ^ (-1)) + (i7 << 1);
        AudioAttributesImplApi21Parcelizer = i8 % 128;
        if (i8 % 2 == 0) {
            return iconCompatParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @setSdkPayload
    public CmcdConfiguration(ServerSideAdInsertionMediaSourceSampleStreamImpl serverSideAdInsertionMediaSourceSampleStreamImpl, BundledChunkExtractor bundledChunkExtractor, BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0 bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0, withRemovedAdGroupCount withremovedadgroupcount, ServerSideAdInsertionMediaSourceMediaPeriodImpl serverSideAdInsertionMediaSourceMediaPeriodImpl, withAllAdsReset withalladsreset) {
        super(serverSideAdInsertionMediaSourceSampleStreamImpl, bundledChunkExtractor);
        toMagicModuleMetaRepoModel.write(serverSideAdInsertionMediaSourceSampleStreamImpl, "");
        toMagicModuleMetaRepoModel.write(bundledChunkExtractor, "");
        toMagicModuleMetaRepoModel.write(bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0, "");
        int i = AudioAttributesImplApi26Parcelizer;
        int i2 = i | 75;
        int i3 = i2 << 1;
        int i4 = -((~(i & 75)) & i2);
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        AudioAttributesImplApi21Parcelizer = i5 % 128;
        int i6 = i5 % 2;
        toMagicModuleMetaRepoModel.write(withremovedadgroupcount, "");
        toMagicModuleMetaRepoModel.write(serverSideAdInsertionMediaSourceMediaPeriodImpl, "");
        toMagicModuleMetaRepoModel.write(withalladsreset, "");
        this.AudioAttributesImplBaseParcelizer = bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0;
        this.AudioAttributesCompatParcelizer = withremovedadgroupcount;
        this.RemoteActionCompatParcelizer = serverSideAdInsertionMediaSourceMediaPeriodImpl;
        this.read = withalladsreset;
        this.IconCompatParcelizer = AllocatorAllocationNode.IconCompatParcelizer;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        CmcdConfiguration cmcdConfiguration = (CmcdConfiguration) objArr[0];
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer;
        int i3 = i2 & 69;
        int i4 = i2 | 69;
        int i5 = (i3 & i4) + (i3 | i4);
        AudioAttributesImplApi21Parcelizer = i5 % 128;
        int i6 = i5 % 2;
        AllocatorAllocationNode allocatorAllocationNode = cmcdConfiguration.IconCompatParcelizer;
        int i7 = i2 + 63;
        AudioAttributesImplApi21Parcelizer = i7 % 128;
        if (i7 % 2 == 0) {
            return allocatorAllocationNode;
        }
        throw null;
    }

    private static /* synthetic */ Object AudioAttributesImplApi26Parcelizer(Object[] objArr) {
        CmcdConfiguration cmcdConfiguration = (CmcdConfiguration) objArr[0];
        SampleVideos<? super NetworkApiResponse<List<FeaturedCard>>> sampleVideos = (SampleVideos) objArr[1];
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer;
        int i3 = i2 ^ 107;
        int i4 = (((i2 & 107) | i3) << 1) - i3;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        int i5 = i4 % 2;
        BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0 bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0 = cmcdConfiguration.AudioAttributesImplBaseParcelizer;
        if (i5 == 0) {
            return bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0.IconCompatParcelizer(sampleVideos);
        }
        bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0.IconCompatParcelizer(sampleVideos);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        CmcdConfiguration cmcdConfiguration = (CmcdConfiguration) objArr[0];
        List list = (List) objArr[1];
        int i = 2 % 2;
        int i2 = (-2) - ((AudioAttributesImplApi26Parcelizer + 34) ^ (-1));
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        cmcdConfiguration.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
        int iIconCompatParcelizer = addConnectionCallbacks.write.IconCompatParcelizer();
        int iIconCompatParcelizer2 = addConnectionCallbacks.write.IconCompatParcelizer();
        int iIconCompatParcelizer3 = addConnectionCallbacks.write.IconCompatParcelizer();
        read(1207766978, iIconCompatParcelizer2, iIconCompatParcelizer, -1207766976, addConnectionCallbacks.write.IconCompatParcelizer(), new Object[]{cmcdConfiguration, list}, iIconCompatParcelizer3);
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = AudioAttributesImplApi26Parcelizer + 47;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopup;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007d A[PHI: r4 r6
      0x007d: PHI (r4v21 java.lang.Object) = (r4v20 java.lang.Object), (r4v26 java.lang.Object) binds: [B:18:0x007b, B:15:0x006e] A[DONT_GENERATE, DONT_INLINE]
      0x007d: PHI (r6v8 int) = (r6v7 int), (r6v20 int) binds: [B:18:0x007b, B:15:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0153 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object AudioAttributesCompatParcelizer(java.lang.Object[] r13) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.CmcdConfiguration.AudioAttributesCompatParcelizer(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object AudioAttributesImplApi21Parcelizer(Object[] objArr) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer;
        int i3 = ((i2 | 5) << 1) - (i2 ^ 5);
        AudioAttributesImplApi26Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        BandwidthMeterEventListener.IconCompatParcelizer iconCompatParcelizer = BandwidthMeterEventListener.IconCompatParcelizer.INSTANCE;
        int i5 = AudioAttributesImplApi21Parcelizer;
        int i6 = ((i5 | 29) << 1) - (i5 ^ 29);
        AudioAttributesImplApi26Parcelizer = i6 % 128;
        if (i6 % 2 != 0) {
            return iconCompatParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void RemoteActionCompatParcelizer(List<? extends FeaturedCard> list) {
        int iIconCompatParcelizer = addConnectionCallbacks.write.IconCompatParcelizer();
        int iIconCompatParcelizer2 = addConnectionCallbacks.write.IconCompatParcelizer();
        int iIconCompatParcelizer3 = addConnectionCallbacks.write.IconCompatParcelizer();
        read(1207766978, iIconCompatParcelizer2, iIconCompatParcelizer, -1207766976, addConnectionCallbacks.write.IconCompatParcelizer(), new Object[]{this, list}, iIconCompatParcelizer3);
    }

    @Override // com.marrow2.core.sync.PaginatedSyncTask
    public final Object IconCompatParcelizer(SampleVideos<? super NetworkApiResponse<List<? extends FeaturedCard>>> sampleVideos) {
        int iIconCompatParcelizer = addConnectionCallbacks.write.IconCompatParcelizer();
        int iIconCompatParcelizer2 = addConnectionCallbacks.write.IconCompatParcelizer();
        int iIconCompatParcelizer3 = addConnectionCallbacks.write.IconCompatParcelizer();
        return read(-890805253, iIconCompatParcelizer2, iIconCompatParcelizer, 890805259, addConnectionCallbacks.write.IconCompatParcelizer(), new Object[]{this, sampleVideos}, iIconCompatParcelizer3);
    }

    @Override // com.marrow2.core.sync.PaginatedSyncTask
    public final AllocatorAllocationNode RemoteActionCompatParcelizer() {
        int iIconCompatParcelizer = addConnectionCallbacks.write.IconCompatParcelizer();
        int iIconCompatParcelizer2 = addConnectionCallbacks.write.IconCompatParcelizer();
        int iIconCompatParcelizer3 = addConnectionCallbacks.write.IconCompatParcelizer();
        return (AllocatorAllocationNode) read(1304567580, iIconCompatParcelizer2, iIconCompatParcelizer, -1304567579, addConnectionCallbacks.write.IconCompatParcelizer(), new Object[]{this}, iIconCompatParcelizer3);
    }

    private static BandwidthMeterEventListener.IconCompatParcelizer read() {
        int iIconCompatParcelizer = addConnectionCallbacks.write.IconCompatParcelizer();
        int iIconCompatParcelizer2 = addConnectionCallbacks.write.IconCompatParcelizer();
        int iIconCompatParcelizer3 = addConnectionCallbacks.write.IconCompatParcelizer();
        return (BandwidthMeterEventListener.IconCompatParcelizer) read(-202436183, iIconCompatParcelizer2, iIconCompatParcelizer, 202436188, addConnectionCallbacks.write.IconCompatParcelizer(), new Object[0], iIconCompatParcelizer3);
    }

    @Override // com.marrow2.core.sync.PaginatedSyncTask
    public final /* bridge */ /* synthetic */ BandwidthMeterEventListener IconCompatParcelizer() {
        int iIconCompatParcelizer = addConnectionCallbacks.write.IconCompatParcelizer();
        int iIconCompatParcelizer2 = addConnectionCallbacks.write.IconCompatParcelizer();
        int iIconCompatParcelizer3 = addConnectionCallbacks.write.IconCompatParcelizer();
        return (BandwidthMeterEventListener) read(886449451, iIconCompatParcelizer2, iIconCompatParcelizer, -886449451, addConnectionCallbacks.write.IconCompatParcelizer(), new Object[]{this}, iIconCompatParcelizer3);
    }

    @Override // com.marrow2.core.sync.PaginatedSyncTask
    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(List<? extends FeaturedCard> list, boolean z, SampleVideos sampleVideos) {
        Object[] objArr = {this, list, Boolean.valueOf(z), sampleVideos};
        int iIconCompatParcelizer = addConnectionCallbacks.write.IconCompatParcelizer();
        return read(-286298916, addConnectionCallbacks.write.IconCompatParcelizer(), iIconCompatParcelizer, 286298920, addConnectionCallbacks.write.IconCompatParcelizer(), objArr, addConnectionCallbacks.write.IconCompatParcelizer());
    }

    private Object write(List<? extends FeaturedCard> list) {
        int iIconCompatParcelizer = addConnectionCallbacks.write.IconCompatParcelizer();
        int iIconCompatParcelizer2 = addConnectionCallbacks.write.IconCompatParcelizer();
        int iIconCompatParcelizer3 = addConnectionCallbacks.write.IconCompatParcelizer();
        return read(1684924439, iIconCompatParcelizer2, iIconCompatParcelizer, -1684924436, addConnectionCallbacks.write.IconCompatParcelizer(), new Object[]{this, list}, iIconCompatParcelizer3);
    }
}
