package kotlin;

import com.marrow.data.api.models.request.sync.SyncParam;
import com.marrow.data.api.models.response.lesson.VideoBookmarkTimeline;
import com.marrow.data.models.video.TimelinePYTMap;
import com.marrow2.core.network.model.NetworkApiResponse;
import com.marrow2.core.sync.PaginatedSyncTask;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.BandwidthMeterEventListener;

/* JADX INFO: loaded from: classes3.dex */
@getPlanOldPrice
public final class getCustomData extends PaginatedSyncTask<List<? extends VideoBookmarkTimeline>> {
    private static int AudioAttributesImplApi21Parcelizer = 1;
    private static int MediaBrowserCompatCustomActionResultReceiver;
    private final BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0 AudioAttributesCompatParcelizer;
    private final updateSelectedBaseUrl IconCompatParcelizer;
    private final getLastAvailableSegmentNum RemoteActionCompatParcelizer;
    private final AllocatorAllocationNode read;

    public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~i4;
        int i9 = ~i3;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i3 | i4);
        int i12 = i10 | i11;
        int i13 = (~(i7 | i4)) | (~(i7 | i9)) | (~(i9 | i4));
        int i14 = i4 + i6 + i5 + (669352129 * i) + (266941808 * i2);
        int i15 = i14 * i14;
        int i16 = (720661947 * i4) + 1572077568 + ((-1243901369) * i6) + (1165201990 * i12) + (i11 * (-1165201990)) + ((-1165201990) * i13) + (1885863936 * i5) + ((-1100480512) * i) + ((-1249902592) * i2) + ((-491520000) * i15);
        int i17 = (i4 * 1617402437) + 56426783 + (i6 * 1617401273) + (i12 * (-582)) + (i11 * 582) + (i13 * 582) + (i5 * 1617401855) + (i * 1244927807) + (i2 * (-404665712)) + (i15 * (-45350912));
        int i18 = i16 + (i17 * i17 * 1565261824);
        return i18 != 1 ? i18 != 2 ? i18 != 3 ? i18 != 4 ? i18 != 5 ? IconCompatParcelizer(objArr) : AudioAttributesImplApi26Parcelizer(objArr) : write(objArr) : read(objArr) : RemoteActionCompatParcelizer(objArr) : AudioAttributesCompatParcelizer(objArr);
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        getCustomData getcustomdata = (getCustomData) objArr[0];
        Object obj = objArr[1];
        ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer;
        int i3 = (((i2 ^ 9) | (i2 & 9)) << 1) - (((~i2) & 9) | (i2 & (-10)));
        MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
        int i4 = i3 % 2;
        int i5 = zzfe.read();
        int i6 = zzfe.read();
        Object objRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(zzfe.read(), zzfe.read(), new Object[]{getcustomdata, (List) obj}, i5, 36151829, i6, -36151824);
        int i7 = MediaBrowserCompatCustomActionResultReceiver;
        int i8 = i7 & 35;
        int i9 = (i7 | 35) & (~i8);
        int i10 = i8 << 1;
        int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
        AudioAttributesImplApi21Parcelizer = i11 % 128;
        if (i11 % 2 != 0) {
            return objRemoteActionCompatParcelizer;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer;
        int i3 = (i2 ^ 61) + ((i2 & 61) << 1);
        MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = zzfe.read();
            int i5 = zzfe.read();
            return (BandwidthMeterEventListener.IconCompatParcelizer) RemoteActionCompatParcelizer(zzfe.read(), zzfe.read(), new Object[0], i4, 927173938, i5, -927173936);
        }
        int i6 = zzfe.read();
        int i7 = zzfe.read();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @setSdkPayload
    public getCustomData(ServerSideAdInsertionMediaSourceSampleStreamImpl serverSideAdInsertionMediaSourceSampleStreamImpl, BundledChunkExtractor bundledChunkExtractor, BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0 bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0, updateSelectedBaseUrl updateselectedbaseurl, getLastAvailableSegmentNum getlastavailablesegmentnum) {
        super(serverSideAdInsertionMediaSourceSampleStreamImpl, bundledChunkExtractor);
        toMagicModuleMetaRepoModel.write(serverSideAdInsertionMediaSourceSampleStreamImpl, "");
        toMagicModuleMetaRepoModel.write(bundledChunkExtractor, "");
        toMagicModuleMetaRepoModel.write(bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0, "");
        int i = AudioAttributesImplApi21Parcelizer;
        int i2 = ((i ^ 114) + ((i & 114) << 1)) - 1;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(updateselectedbaseurl, "");
            toMagicModuleMetaRepoModel.write(getlastavailablesegmentnum, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        toMagicModuleMetaRepoModel.write(updateselectedbaseurl, "");
        toMagicModuleMetaRepoModel.write(getlastavailablesegmentnum, "");
        this.AudioAttributesCompatParcelizer = bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0;
        this.IconCompatParcelizer = updateselectedbaseurl;
        this.RemoteActionCompatParcelizer = getlastavailablesegmentnum;
        this.read = AllocatorAllocationNode.MediaBrowserCompatSearchResultReceiver;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        getCustomData getcustomdata = (getCustomData) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver;
        int i3 = (i2 | 43) << 1;
        int i4 = -(i2 ^ 43);
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        AudioAttributesImplApi21Parcelizer = i5 % 128;
        int i6 = i5 % 2;
        Object obj = null;
        AllocatorAllocationNode allocatorAllocationNode = getcustomdata.read;
        if (i6 == 0) {
            obj.hashCode();
            throw null;
        }
        int i7 = ((i2 | 95) << 1) - (i2 ^ 95);
        AudioAttributesImplApi21Parcelizer = i7 % 128;
        if (i7 % 2 != 0) {
            return allocatorAllocationNode;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        long j;
        getCustomData getcustomdata = (getCustomData) objArr[0];
        SampleVideos<? super NetworkApiResponse<List<VideoBookmarkTimeline>>> sampleVideos = (SampleVideos) objArr[1];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 69;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        SyncParam syncParamWrite = getcustomdata.IconCompatParcelizer.write();
        if (syncParamWrite != null) {
            int i4 = AudioAttributesImplApi21Parcelizer + 23;
            MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
            if (i4 % 2 == 0) {
                j = syncParamWrite.lastUpdated;
            } else {
                long j2 = syncParamWrite.lastUpdated;
                throw null;
            }
        } else {
            int i5 = MediaBrowserCompatCustomActionResultReceiver + 59;
            AudioAttributesImplApi21Parcelizer = i5 % 128;
            int i6 = i5 % 2;
            j = 0;
        }
        Object obj = getcustomdata.AudioAttributesCompatParcelizer.read(j, sampleVideos);
        int i7 = AudioAttributesImplApi21Parcelizer;
        int i8 = i7 & 43;
        int i9 = -(-(i7 | 43));
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        MediaBrowserCompatCustomActionResultReceiver = i10 % 128;
        int i11 = i10 % 2;
        return obj;
    }

    private static /* synthetic */ Object AudioAttributesImplApi26Parcelizer(Object[] objArr) {
        VideoBookmarkTimeline videoBookmarkTimeline;
        getCustomData getcustomdata = (getCustomData) objArr[0];
        List list = (List) objArr[1];
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer;
        int i3 = i2 & 69;
        int i4 = ((i2 ^ 69) | i3) << 1;
        int i5 = -((i2 | 69) & (~i3));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        MediaBrowserCompatCustomActionResultReceiver = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            list.isEmpty();
            throw null;
        }
        if (list.isEmpty()) {
            int i7 = AudioAttributesImplApi21Parcelizer;
            int i8 = (i7 ^ 1) + ((i7 & 1) << 1);
            MediaBrowserCompatCustomActionResultReceiver = i8 % 128;
            int i9 = i8 % 2;
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            int i10 = MediaBrowserCompatCustomActionResultReceiver;
            int i11 = i10 & 107;
            int i12 = (i10 ^ 107) | i11;
            int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
            AudioAttributesImplApi21Parcelizer = i13 % 128;
            if (i13 % 2 != 0) {
                return getshowpopup;
            }
            obj.hashCode();
            throw null;
        }
        getcustomdata.IconCompatParcelizer.IconCompatParcelizer(list.toArray(new VideoBookmarkTimeline[0]));
        ArrayList arrayList = new ArrayList();
        int i14 = MediaBrowserCompatCustomActionResultReceiver;
        int i15 = (i14 & 55) + (i14 | 55);
        AudioAttributesImplApi21Parcelizer = i15 % 128;
        int i16 = i15 % 2;
        ArrayList arrayList2 = arrayList;
        Iterator it = list.iterator();
        int i17 = AudioAttributesImplApi21Parcelizer;
        int i18 = i17 ^ 107;
        int i19 = -(-((i17 & 107) << 1));
        int i20 = (i18 & i19) + (i19 | i18);
        MediaBrowserCompatCustomActionResultReceiver = i20 % 128;
        while (true) {
            int i21 = i20 % 2;
            if (!it.hasNext()) {
                getLastAvailableSegmentNum getlastavailablesegmentnum = getcustomdata.RemoteActionCompatParcelizer;
                int i22 = MediaBrowserCompatCustomActionResultReceiver;
                int i23 = i22 & 7;
                int i24 = (i23 - (~((i22 ^ 7) | i23))) - 1;
                AudioAttributesImplApi21Parcelizer = i24 % 128;
                int i25 = i24 % 2;
                getlastavailablesegmentnum.IconCompatParcelizer(arrayList2.toArray(new TimelinePYTMap[0]));
                getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
                int i26 = MediaBrowserCompatCustomActionResultReceiver;
                int i27 = (i26 ^ 98) + ((i26 & 98) << 1);
                int i28 = (i27 ^ (-1)) + (i27 << 1);
                AudioAttributesImplApi21Parcelizer = i28 % 128;
                int i29 = i28 % 2;
                return getshowpopup2;
            }
            int i30 = AudioAttributesImplApi21Parcelizer + 83;
            MediaBrowserCompatCustomActionResultReceiver = i30 % 128;
            if (i30 % 2 != 0) {
                videoBookmarkTimeline = (VideoBookmarkTimeline) it.next();
                int i31 = 56 / 0;
            } else {
                videoBookmarkTimeline = (VideoBookmarkTimeline) it.next();
            }
            int i32 = AudioAttributesImplApi21Parcelizer;
            int i33 = (i32 & (-104)) | ((~i32) & 103);
            int i34 = -(-((i32 & 103) << 1));
            int i35 = ((i33 | i34) << 1) - (i34 ^ i33);
            MediaBrowserCompatCustomActionResultReceiver = i35 % 128;
            int i36 = i35 % 2;
            List<String> pytIds = videoBookmarkTimeline.getPytIds();
            if (pytIds == null) {
                int i37 = AudioAttributesImplApi21Parcelizer;
                int i38 = ((i37 ^ 61) | (i37 & 61)) << 1;
                int i39 = -(((~i37) & 61) | (i37 & (-62)));
                int i40 = (i38 ^ i39) + ((i39 & i38) << 1);
                MediaBrowserCompatCustomActionResultReceiver = i40 % 128;
                int i41 = i40 % 2;
                pytIds = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
                int i42 = MediaBrowserCompatCustomActionResultReceiver;
                int i43 = ((i42 ^ 1) | (i42 & 1)) << 1;
                int i44 = -(((~i42) & 1) | (i42 & (-2)));
                int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
                AudioAttributesImplApi21Parcelizer = i45 % 128;
                if (i45 % 2 == 0) {
                    int i46 = 4 % 3;
                }
            }
            List<String> list2 = pytIds;
            ArrayList arrayList3 = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) list2, 10));
            int i47 = AudioAttributesImplApi21Parcelizer;
            int i48 = i47 & 79;
            int i49 = (((i47 | 79) & (~i48)) - (~(i48 << 1))) - 1;
            MediaBrowserCompatCustomActionResultReceiver = i49 % 128;
            int i50 = i49 % 2;
            ArrayList arrayList4 = arrayList3;
            Iterator<T> it2 = list2.iterator();
            int i51 = (-2) - ((AudioAttributesImplApi21Parcelizer + 18) ^ (-1));
            MediaBrowserCompatCustomActionResultReceiver = i51 % 128;
            while (true) {
                int i52 = i51 % 2;
                if (it2.hasNext()) {
                    TimelinePYTMap timelinePYTMap = new TimelinePYTMap(videoBookmarkTimeline.getId(), (String) it2.next());
                    int i53 = MediaBrowserCompatCustomActionResultReceiver;
                    int i54 = i53 & 117;
                    int i55 = (((i53 ^ 117) | i54) << 1) - ((i53 | 117) & (~i54));
                    AudioAttributesImplApi21Parcelizer = i55 % 128;
                    int i56 = i55 % 2;
                    arrayList4.add(timelinePYTMap);
                    int i57 = MediaBrowserCompatCustomActionResultReceiver;
                    int i58 = i57 & 119;
                    i51 = ((i57 | 119) & (~i58)) + (i58 << 1);
                    AudioAttributesImplApi21Parcelizer = i51 % 128;
                }
            }
            IntermediateLoginResponseBody.IconCompatParcelizer((Collection) arrayList2, (Iterable) arrayList4);
            int i59 = AudioAttributesImplApi21Parcelizer;
            int i60 = i59 & 87;
            int i61 = (i59 | 87) & (~i60);
            int i62 = i60 << 1;
            i20 = (i61 ^ i62) + ((i61 & i62) << 1);
            MediaBrowserCompatCustomActionResultReceiver = i20 % 128;
        }
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer;
        int i3 = ((i2 | 33) << 1) - (((~i2) & 33) | (i2 & (-34)));
        MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
        if (i3 % 2 != 0) {
            BandwidthMeterEventListener.IconCompatParcelizer iconCompatParcelizer = BandwidthMeterEventListener.IconCompatParcelizer.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        BandwidthMeterEventListener.IconCompatParcelizer iconCompatParcelizer2 = BandwidthMeterEventListener.IconCompatParcelizer.INSTANCE;
        int i4 = MediaBrowserCompatCustomActionResultReceiver;
        int i5 = (i4 & 1) + (i4 | 1);
        AudioAttributesImplApi21Parcelizer = i5 % 128;
        int i6 = i5 % 2;
        return iconCompatParcelizer2;
    }

    @Override // com.marrow2.core.sync.PaginatedSyncTask
    public final Object IconCompatParcelizer(SampleVideos<? super NetworkApiResponse<List<? extends VideoBookmarkTimeline>>> sampleVideos) {
        int i = zzfe.read();
        int i2 = zzfe.read();
        return RemoteActionCompatParcelizer(zzfe.read(), zzfe.read(), new Object[]{this, sampleVideos}, i, -730070948, i2, 730070952);
    }

    @Override // com.marrow2.core.sync.PaginatedSyncTask
    public final AllocatorAllocationNode RemoteActionCompatParcelizer() {
        int i = zzfe.read();
        int i2 = zzfe.read();
        return (AllocatorAllocationNode) RemoteActionCompatParcelizer(zzfe.read(), zzfe.read(), new Object[]{this}, i, -743052580, i2, 743052580);
    }

    private static BandwidthMeterEventListener.IconCompatParcelizer write() {
        int i = zzfe.read();
        int i2 = zzfe.read();
        return (BandwidthMeterEventListener.IconCompatParcelizer) RemoteActionCompatParcelizer(zzfe.read(), zzfe.read(), new Object[0], i, 927173938, i2, -927173936);
    }

    @Override // com.marrow2.core.sync.PaginatedSyncTask
    public final /* synthetic */ BandwidthMeterEventListener IconCompatParcelizer() {
        int i = zzfe.read();
        int i2 = zzfe.read();
        return (BandwidthMeterEventListener) RemoteActionCompatParcelizer(zzfe.read(), zzfe.read(), new Object[]{this}, i, -1596061759, i2, 1596061762);
    }

    @Override // com.marrow2.core.sync.PaginatedSyncTask
    public final /* synthetic */ Object IconCompatParcelizer(List<? extends VideoBookmarkTimeline> list, boolean z, SampleVideos sampleVideos) {
        return RemoteActionCompatParcelizer(zzfe.read(), zzfe.read(), new Object[]{this, list, Boolean.valueOf(z), sampleVideos}, zzfe.read(), -213453075, zzfe.read(), 213453076);
    }

    private Object read(List<VideoBookmarkTimeline> list) {
        int i = zzfe.read();
        int i2 = zzfe.read();
        return RemoteActionCompatParcelizer(zzfe.read(), zzfe.read(), new Object[]{this, list}, i, 36151829, i2, -36151824);
    }
}
