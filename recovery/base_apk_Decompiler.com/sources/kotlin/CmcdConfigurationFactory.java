package kotlin;

import com.marrow.api.models.GCMRegistrationRequest;
import com.marrow.data.models.test.TestIndex;
import com.marrow2.core.network.model.NetworkApiResponse;
import com.marrow2.core.sync.PaginatedSyncTask;
import java.util.ArrayList;
import java.util.List;
import kotlin.BandwidthMeterEventListener;

/* JADX INFO: loaded from: classes3.dex */
@getPlanOldPrice
public final class CmcdConfigurationFactory extends PaginatedSyncTask<List<? extends TestIndex>> {
    private static int MediaBrowserCompatCustomActionResultReceiver = 0;
    private static int MediaBrowserCompatSearchResultReceiver = 1;
    private final setManifestParser AudioAttributesCompatParcelizer;
    private getNowPeriodTimeUs AudioAttributesImplApi21Parcelizer;
    private final ServerSideAdInsertionMediaSourceSampleStreamImpl AudioAttributesImplApi26Parcelizer;
    private final createFallbackOptions AudioAttributesImplBaseParcelizer;
    private final loadSampleFormat IconCompatParcelizer;
    private final BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0 MediaBrowserCompatItemReceiver;
    private final AllocatorAllocationNode RemoteActionCompatParcelizer;
    private final onInitializationFailed read;

    public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i4;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = i5 | i9;
        int i11 = ~i5;
        int i12 = i9 | (~(i11 | i4));
        int i13 = (~(i6 | i7 | i5)) | (~(i8 | i11 | i7));
        int i14 = i4 + i5 + i + ((-619979367) * i3) + (68302741 * i2);
        int i15 = i14 * i14;
        int i16 = (i4 * 561304900) + 382271488 + (561304900 * i5) + ((-1585293958) * i10) + (792646979 * i12) + ((-792646979) * i13) + ((-231342080) * i) + (1615200256 * i3) + ((-1821507584) * i2) + (428933120 * i15);
        int i17 = ((i4 * (-96142684)) - 56799437) + (i5 * (-96142684)) + (i10 * 1642) + (i12 * (-821)) + (i13 * 821) + (i * (-96141863)) + (i3 * (-1380774991)) + (i2 * (-1175232947)) + (i15 * (-118947840));
        int i18 = i16 + (i17 * i17 * (-1369505792));
        return i18 != 1 ? i18 != 2 ? i18 != 3 ? i18 != 4 ? i18 != 5 ? read(objArr) : MediaBrowserCompatItemReceiver(objArr) : IconCompatParcelizer(objArr) : RemoteActionCompatParcelizer(objArr) : write(objArr) : AudioAttributesCompatParcelizer(objArr);
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        CmcdConfigurationFactory cmcdConfigurationFactory = (CmcdConfigurationFactory) objArr[0];
        Object obj = objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver;
        int i3 = ((((i2 ^ 83) | (i2 & 83)) << 1) - (~(-(((~i2) & 83) | (i2 & (-84)))))) - 1;
        MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
        List list = (List) obj;
        Object[] objArr2 = new Object[3];
        if (i3 % 2 != 0) {
            objArr2[0] = cmcdConfigurationFactory;
            objArr2[1] = list;
            objArr2[2] = Boolean.valueOf(zBooleanValue);
            int iWrite = GCMRegistrationRequest.write();
            RemoteActionCompatParcelizer(GCMRegistrationRequest.write(), GCMRegistrationRequest.write(), GCMRegistrationRequest.write(), -514038832, 514038837, iWrite, objArr2);
            Object obj2 = null;
            obj2.hashCode();
            throw null;
        }
        objArr2[0] = cmcdConfigurationFactory;
        objArr2[1] = list;
        objArr2[2] = Boolean.valueOf(zBooleanValue);
        int iWrite2 = GCMRegistrationRequest.write();
        Object objRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(GCMRegistrationRequest.write(), GCMRegistrationRequest.write(), GCMRegistrationRequest.write(), -514038832, 514038837, iWrite2, objArr2);
        int i4 = MediaBrowserCompatCustomActionResultReceiver;
        int i5 = (i4 ^ 61) + ((i4 & 61) << 1);
        MediaBrowserCompatSearchResultReceiver = i5 % 128;
        int i6 = i5 % 2;
        return objRemoteActionCompatParcelizer;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 7;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        int iWrite = GCMRegistrationRequest.write();
        int iWrite2 = GCMRegistrationRequest.write();
        int iWrite3 = GCMRegistrationRequest.write();
        BandwidthMeterEventListener.read readVar = (BandwidthMeterEventListener.read) RemoteActionCompatParcelizer(iWrite2, GCMRegistrationRequest.write(), iWrite3, 1403692780, -1403692779, iWrite, new Object[0]);
        int i4 = MediaBrowserCompatSearchResultReceiver;
        int i5 = i4 & 53;
        int i6 = i5 + ((i4 ^ 53) | i5);
        MediaBrowserCompatCustomActionResultReceiver = i6 % 128;
        int i7 = i6 % 2;
        return readVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @setSdkPayload
    public CmcdConfigurationFactory(BundledChunkExtractor bundledChunkExtractor, BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0 bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0, ServerSideAdInsertionMediaSourceSampleStreamImpl serverSideAdInsertionMediaSourceSampleStreamImpl, getNowPeriodTimeUs getnowperiodtimeus, onInitializationFailed oninitializationfailed, setManifestParser setmanifestparser, loadSampleFormat loadsampleformat, createFallbackOptions createfallbackoptions) {
        super(serverSideAdInsertionMediaSourceSampleStreamImpl, bundledChunkExtractor);
        toMagicModuleMetaRepoModel.write(bundledChunkExtractor, "");
        toMagicModuleMetaRepoModel.write(bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0, "");
        int i = MediaBrowserCompatCustomActionResultReceiver;
        int i2 = (i & 113) + (i | 113);
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(serverSideAdInsertionMediaSourceSampleStreamImpl, "");
            toMagicModuleMetaRepoModel.write(getnowperiodtimeus, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        toMagicModuleMetaRepoModel.write(serverSideAdInsertionMediaSourceSampleStreamImpl, "");
        toMagicModuleMetaRepoModel.write(getnowperiodtimeus, "");
        toMagicModuleMetaRepoModel.write(oninitializationfailed, "");
        toMagicModuleMetaRepoModel.write(setmanifestparser, "");
        toMagicModuleMetaRepoModel.write(loadsampleformat, "");
        toMagicModuleMetaRepoModel.write(createfallbackoptions, "");
        this.MediaBrowserCompatItemReceiver = bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0;
        this.AudioAttributesImplApi26Parcelizer = serverSideAdInsertionMediaSourceSampleStreamImpl;
        this.AudioAttributesImplApi21Parcelizer = getnowperiodtimeus;
        this.read = oninitializationfailed;
        this.AudioAttributesCompatParcelizer = setmanifestparser;
        this.IconCompatParcelizer = loadsampleformat;
        this.AudioAttributesImplBaseParcelizer = createfallbackoptions;
        this.RemoteActionCompatParcelizer = AllocatorAllocationNode.MediaBrowserCompatMediaItem;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        CmcdConfigurationFactory cmcdConfigurationFactory = (CmcdConfigurationFactory) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver;
        int i3 = i2 ^ 31;
        int i4 = (i2 & 31) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        int i6 = i5 % 128;
        MediaBrowserCompatCustomActionResultReceiver = i6;
        int i7 = i5 % 2;
        AllocatorAllocationNode allocatorAllocationNode = cmcdConfigurationFactory.RemoteActionCompatParcelizer;
        if (i7 != 0) {
            throw null;
        }
        int i8 = (-2) - (((i6 & 86) + (i6 | 86)) ^ (-1));
        MediaBrowserCompatSearchResultReceiver = i8 % 128;
        int i9 = i8 % 2;
        return allocatorAllocationNode;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        CmcdConfigurationFactory cmcdConfigurationFactory = (CmcdConfigurationFactory) objArr[0];
        SampleVideos<? super NetworkApiResponse<List<TestIndex>>> sampleVideos = (SampleVideos) objArr[1];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver;
        int i3 = i2 & 31;
        int i4 = (((i2 ^ 31) | i3) << 1) - ((i2 | 31) & (~i3));
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        String strIconCompatParcelizer = cmcdConfigurationFactory.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer("test");
        BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0 bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0 = cmcdConfigurationFactory.MediaBrowserCompatItemReceiver;
        int i6 = MediaBrowserCompatSearchResultReceiver;
        int i7 = i6 & 55;
        int i8 = (i7 - (~(-(-((i6 ^ 55) | i7))))) - 1;
        MediaBrowserCompatCustomActionResultReceiver = i8 % 128;
        if (i8 % 2 == 0) {
            return bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0.AudioAttributesImplApi26Parcelizer(strIconCompatParcelizer, sampleVideos);
        }
        bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0.AudioAttributesImplApi26Parcelizer(strIconCompatParcelizer, sampleVideos);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object MediaBrowserCompatItemReceiver(Object[] objArr) {
        String id;
        CmcdConfigurationFactory cmcdConfigurationFactory = (CmcdConfigurationFactory) objArr[0];
        List list = (List) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver;
        int i3 = (i2 & 41) + (i2 | 41);
        MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        if (!(!zBooleanValue)) {
            int i4 = ((i2 | 1) << 1) - (i2 ^ 1);
            MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
            int i5 = i4 % 2;
            cmcdConfigurationFactory.AudioAttributesImplApi21Parcelizer.ah_();
            int i6 = MediaBrowserCompatCustomActionResultReceiver;
            int i7 = ((i6 & 104) + (i6 | 104)) - 1;
            MediaBrowserCompatSearchResultReceiver = i7 % 128;
            int i8 = i7 % 2;
        }
        List list2 = list;
        Object[] array = list2.toArray(new TestIndex[0]);
        int i9 = MediaBrowserCompatCustomActionResultReceiver;
        int i10 = (-2) - ((((i9 | 100) << 1) - (i9 ^ 100)) ^ (-1));
        MediaBrowserCompatSearchResultReceiver = i10 % 128;
        int i11 = i10 % 2;
        TestIndex[] testIndexArrWrite = buildRepresentation.write((TestIndex[]) array);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(testIndexArrWrite, "");
        TestIndex[] testIndexArr = testIndexArrWrite;
        ArrayList arrayList = new ArrayList(testIndexArr.length);
        int i12 = MediaBrowserCompatSearchResultReceiver;
        int i13 = ((i12 ^ 54) + ((i12 & 54) << 1)) - 1;
        int i14 = i13 % 128;
        MediaBrowserCompatCustomActionResultReceiver = i14;
        int i15 = i13 % 2;
        int length = testIndexArr.length;
        int i16 = i14 & 73;
        int i17 = (i14 | 73) & (~i16);
        int i18 = -(-(i16 << 1));
        int i19 = (i17 & i18) + (i17 | i18);
        MediaBrowserCompatSearchResultReceiver = i19 % 128;
        int i20 = i19 % 2;
        int i21 = 0;
        while (i21 < length) {
            int i22 = MediaBrowserCompatSearchResultReceiver;
            int i23 = i22 ^ 119;
            int i24 = -(-((i22 & 119) << 1));
            int i25 = ((i23 | i24) << 1) - (i24 ^ i23);
            MediaBrowserCompatCustomActionResultReceiver = i25 % 128;
            if (i25 % 2 != 0) {
                id = testIndexArr[i21].getId();
                int i26 = 30 / 0;
            } else {
                id = testIndexArr[i21].getId();
            }
            int i27 = MediaBrowserCompatCustomActionResultReceiver;
            int i28 = i27 ^ 99;
            int i29 = (i27 & 99) << 1;
            int i30 = (i28 & i29) + (i29 | i28);
            MediaBrowserCompatSearchResultReceiver = i30 % 128;
            int i31 = i30 % 2;
            arrayList.add(id);
            int i32 = i21 + 15;
            int i33 = i32 & (-14);
            int i34 = ((i32 ^ (-14)) | i33) << 1;
            int i35 = -((i32 | (-14)) & (~i33));
            i21 = (i35 | i34) + (i34 & i35);
            int i36 = MediaBrowserCompatCustomActionResultReceiver;
            int i37 = (((i36 & (-24)) | ((~i36) & 23)) - (~(-(-((i36 & 23) << 1))))) - 1;
            MediaBrowserCompatSearchResultReceiver = i37 % 128;
            int i38 = i37 % 2;
        }
        ArrayList arrayList2 = arrayList;
        Object[] array2 = list2.toArray(new TestIndex[0]);
        int i39 = MediaBrowserCompatCustomActionResultReceiver + 119;
        MediaBrowserCompatSearchResultReceiver = i39 % 128;
        if (i39 % 2 == 0) {
            buildRepresentation.IconCompatParcelizer((TestIndex[]) array2);
            cmcdConfigurationFactory.AudioAttributesCompatParcelizer.write((List<String>) arrayList2);
            obj.hashCode();
            throw null;
        }
        TestIndex[] testIndexArrIconCompatParcelizer = buildRepresentation.IconCompatParcelizer((TestIndex[]) array2);
        cmcdConfigurationFactory.AudioAttributesCompatParcelizer.write((List<String>) arrayList2);
        cmcdConfigurationFactory.read.IconCompatParcelizer((List<String>) arrayList2);
        cmcdConfigurationFactory.IconCompatParcelizer.AudioAttributesCompatParcelizer((List<String>) arrayList2);
        int i40 = MediaBrowserCompatSearchResultReceiver;
        int i41 = ((i40 | 59) << 1) - (i40 ^ 59);
        MediaBrowserCompatCustomActionResultReceiver = i41 % 128;
        if (i41 % 2 != 0) {
            cmcdConfigurationFactory.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer((List<String>) arrayList2);
            cmcdConfigurationFactory.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer((List<String>) arrayList2);
            int i42 = 65 / 0;
        } else {
            cmcdConfigurationFactory.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer((List<String>) arrayList2);
            cmcdConfigurationFactory.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer((List<String>) arrayList2);
        }
        cmcdConfigurationFactory.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(testIndexArrIconCompatParcelizer);
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i43 = MediaBrowserCompatSearchResultReceiver;
        int i44 = i43 ^ 89;
        int i45 = ((i43 & 89) | i44) << 1;
        int i46 = -i44;
        int i47 = (i45 ^ i46) + ((i45 & i46) << 1);
        MediaBrowserCompatCustomActionResultReceiver = i47 % 128;
        if (i47 % 2 != 0) {
            int i48 = 5 / 0;
        }
        return getshowpopup;
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        int i = 2 % 2;
        BandwidthMeterEventListener.read readVar = new BandwidthMeterEventListener.read("test");
        int i2 = MediaBrowserCompatCustomActionResultReceiver;
        int i3 = i2 & 15;
        int i4 = (i3 - (~(-(-((i2 ^ 15) | i3))))) - 1;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return readVar;
    }

    @Override // com.marrow2.core.sync.PaginatedSyncTask
    public final Object IconCompatParcelizer(SampleVideos<? super NetworkApiResponse<List<? extends TestIndex>>> sampleVideos) {
        int iWrite = GCMRegistrationRequest.write();
        int iWrite2 = GCMRegistrationRequest.write();
        int iWrite3 = GCMRegistrationRequest.write();
        return RemoteActionCompatParcelizer(iWrite2, GCMRegistrationRequest.write(), iWrite3, 1209503467, -1209503465, iWrite, new Object[]{this, sampleVideos});
    }

    @Override // com.marrow2.core.sync.PaginatedSyncTask
    public final AllocatorAllocationNode RemoteActionCompatParcelizer() {
        int iWrite = GCMRegistrationRequest.write();
        int iWrite2 = GCMRegistrationRequest.write();
        int iWrite3 = GCMRegistrationRequest.write();
        return (AllocatorAllocationNode) RemoteActionCompatParcelizer(iWrite2, GCMRegistrationRequest.write(), iWrite3, 497601146, -497601146, iWrite, new Object[]{this});
    }

    private static BandwidthMeterEventListener.read write() {
        int iWrite = GCMRegistrationRequest.write();
        int iWrite2 = GCMRegistrationRequest.write();
        int iWrite3 = GCMRegistrationRequest.write();
        return (BandwidthMeterEventListener.read) RemoteActionCompatParcelizer(iWrite2, GCMRegistrationRequest.write(), iWrite3, 1403692780, -1403692779, iWrite, new Object[0]);
    }

    @Override // com.marrow2.core.sync.PaginatedSyncTask
    public final /* synthetic */ BandwidthMeterEventListener IconCompatParcelizer() {
        int iWrite = GCMRegistrationRequest.write();
        int iWrite2 = GCMRegistrationRequest.write();
        int iWrite3 = GCMRegistrationRequest.write();
        return (BandwidthMeterEventListener) RemoteActionCompatParcelizer(iWrite2, GCMRegistrationRequest.write(), iWrite3, -1932375252, 1932375255, iWrite, new Object[]{this});
    }

    @Override // com.marrow2.core.sync.PaginatedSyncTask
    public final /* synthetic */ Object IconCompatParcelizer(List<? extends TestIndex> list, boolean z, SampleVideos sampleVideos) {
        Object[] objArr = {this, list, Boolean.valueOf(z), sampleVideos};
        int iWrite = GCMRegistrationRequest.write();
        return RemoteActionCompatParcelizer(GCMRegistrationRequest.write(), GCMRegistrationRequest.write(), GCMRegistrationRequest.write(), 187527116, -187527112, iWrite, objArr);
    }

    private Object IconCompatParcelizer(List<? extends TestIndex> list, boolean z) {
        Object[] objArr = {this, list, Boolean.valueOf(z)};
        int iWrite = GCMRegistrationRequest.write();
        return RemoteActionCompatParcelizer(GCMRegistrationRequest.write(), GCMRegistrationRequest.write(), GCMRegistrationRequest.write(), -514038832, 514038837, iWrite, objArr);
    }
}
