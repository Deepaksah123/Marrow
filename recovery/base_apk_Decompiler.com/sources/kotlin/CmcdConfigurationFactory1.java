package kotlin;

import com.marrow.api.models.GCMRegistrationRequest;
import com.marrow.data.models.subject.Subject;
import com.marrow2.core.network.model.NetworkApiResponse;
import com.marrow2.core.sync.PaginatedSyncTask;
import java.util.List;
import kotlin.BandwidthMeterEventListener;

/* JADX INFO: loaded from: classes3.dex */
@getPlanOldPrice
public final class CmcdConfigurationFactory1 extends PaginatedSyncTask<List<? extends Subject>> {
    private static int MediaBrowserCompatCustomActionResultReceiver = 1;
    private static int MediaBrowserCompatItemReceiver;
    private final ServerSideAdInsertionMediaSourceSampleStreamImpl AudioAttributesCompatParcelizer;
    private final DebugTextViewHelper IconCompatParcelizer;
    private final AllocatorAllocationNode RemoteActionCompatParcelizer;
    private final BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0 read;

    public static /* synthetic */ Object read(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~(i7 | i6);
        int i9 = ~i3;
        int i10 = ~i6;
        int i11 = i8 | (~(i9 | i10 | i4));
        int i12 = (~(i6 | i9 | i4)) | (~(i10 | i7));
        int i13 = ~(i7 | i9);
        int i14 = i3 + i4 + i5 + (563899752 * i) + (667302295 * i2);
        int i15 = i14 * i14;
        int i16 = ((i3 * 1426164010) - 416808960) + (1426164010 * i4) + (i11 * 480671447) + (i12 * 480671447) + (480671447 * i13) + (1906835456 * i5) + ((-1270874112) * i) + (1914175488 * i2) + ((-1995833344) * i15);
        int i17 = (i3 * (-901935710)) + 144807674 + (i4 * (-901935710)) + (i11 * 171) + (i12 * 171) + (i13 * 171) + (i5 * (-901935539)) + (i * 42244168) + (i2 * (-913566613)) + (i15 * (-1006501888));
        int i18 = i16 + (i17 * i17 * (-1006239744));
        return i18 != 1 ? i18 != 2 ? i18 != 3 ? i18 != 4 ? i18 != 5 ? AudioAttributesCompatParcelizer(objArr) : MediaBrowserCompatCustomActionResultReceiver(objArr) : RemoteActionCompatParcelizer(objArr) : read(objArr) : write(objArr) : IconCompatParcelizer(objArr);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @setSdkPayload
    public CmcdConfigurationFactory1(BundledChunkExtractor bundledChunkExtractor, BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0 bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0, ServerSideAdInsertionMediaSourceSampleStreamImpl serverSideAdInsertionMediaSourceSampleStreamImpl, DebugTextViewHelper debugTextViewHelper) {
        super(serverSideAdInsertionMediaSourceSampleStreamImpl, bundledChunkExtractor);
        toMagicModuleMetaRepoModel.write(bundledChunkExtractor, "");
        toMagicModuleMetaRepoModel.write(bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0, "");
        toMagicModuleMetaRepoModel.write(serverSideAdInsertionMediaSourceSampleStreamImpl, "");
        toMagicModuleMetaRepoModel.write(debugTextViewHelper, "");
        this.read = bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0;
        this.AudioAttributesCompatParcelizer = serverSideAdInsertionMediaSourceSampleStreamImpl;
        this.IconCompatParcelizer = debugTextViewHelper;
        this.RemoteActionCompatParcelizer = AllocatorAllocationNode.MediaBrowserCompatItemReceiver;
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        CmcdConfigurationFactory1 cmcdConfigurationFactory1 = (CmcdConfigurationFactory1) objArr[0];
        Object obj = objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver;
        int i3 = i2 & 61;
        int i4 = i3 + ((i2 ^ 61) | i3);
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        List list = (List) obj;
        if (i4 % 2 != 0) {
            return read(new Object[]{cmcdConfigurationFactory1, list, Boolean.valueOf(zBooleanValue)}, GCMRegistrationRequest.write(), GCMRegistrationRequest.write(), -1703155387, 1703155391, GCMRegistrationRequest.write(), GCMRegistrationRequest.write());
        }
        read(new Object[]{cmcdConfigurationFactory1, list, Boolean.valueOf(zBooleanValue)}, GCMRegistrationRequest.write(), GCMRegistrationRequest.write(), -1703155387, 1703155391, GCMRegistrationRequest.write(), GCMRegistrationRequest.write());
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 123;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        int iWrite = GCMRegistrationRequest.write();
        BandwidthMeterEventListener.read readVar = (BandwidthMeterEventListener.read) read(new Object[0], GCMRegistrationRequest.write(), GCMRegistrationRequest.write(), 894029428, -894029427, GCMRegistrationRequest.write(), iWrite);
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 31;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 84 / 0;
        }
        return readVar;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        CmcdConfigurationFactory1 cmcdConfigurationFactory1 = (CmcdConfigurationFactory1) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver;
        int i3 = i2 + 32;
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        MediaBrowserCompatItemReceiver = i4 % 128;
        int i5 = i4 % 2;
        AllocatorAllocationNode allocatorAllocationNode = cmcdConfigurationFactory1.RemoteActionCompatParcelizer;
        int i6 = (((i2 ^ 109) | (i2 & 109)) << 1) - (((~i2) & 109) | (i2 & (-110)));
        MediaBrowserCompatItemReceiver = i6 % 128;
        if (i6 % 2 == 0) {
            return allocatorAllocationNode;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object MediaBrowserCompatCustomActionResultReceiver(Object[] objArr) {
        CmcdConfigurationFactory1 cmcdConfigurationFactory1 = (CmcdConfigurationFactory1) objArr[0];
        SampleVideos<? super NetworkApiResponse<List<Subject>>> sampleVideos = (SampleVideos) objArr[1];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver;
        int i3 = i2 & 87;
        int i4 = (((i2 | 87) & (~i3)) - (~(i3 << 1))) - 1;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        String strIconCompatParcelizer = cmcdConfigurationFactory1.AudioAttributesCompatParcelizer.IconCompatParcelizer("subject");
        BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0 bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0 = cmcdConfigurationFactory1.read;
        int i6 = MediaBrowserCompatItemReceiver;
        int i7 = ((i6 | 15) << 1) - (i6 ^ 15);
        MediaBrowserCompatCustomActionResultReceiver = i7 % 128;
        int i8 = i7 % 2;
        Object objMediaBrowserCompatItemReceiver = bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0.MediaBrowserCompatItemReceiver(strIconCompatParcelizer, sampleVideos);
        int i9 = MediaBrowserCompatCustomActionResultReceiver;
        int i10 = (((i9 & (-120)) | ((~i9) & 119)) - (~((i9 & 119) << 1))) - 1;
        MediaBrowserCompatItemReceiver = i10 % 128;
        if (i10 % 2 == 0) {
            return objMediaBrowserCompatItemReceiver;
        }
        throw null;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        CmcdConfigurationFactory1 cmcdConfigurationFactory1 = (CmcdConfigurationFactory1) objArr[0];
        List<? extends Subject> list = (List) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver;
        int i3 = i2 + 123;
        MediaBrowserCompatItemReceiver = i3 % 128;
        int i4 = i3 % 2;
        if (!(!zBooleanValue)) {
            int i5 = i2 & 75;
            int i6 = (i5 - (~(-(-((i2 ^ 75) | i5))))) - 1;
            MediaBrowserCompatItemReceiver = i6 % 128;
            if (i6 % 2 != 0) {
                cmcdConfigurationFactory1.IconCompatParcelizer.IconCompatParcelizer();
                int i7 = 9 / 0;
            } else {
                cmcdConfigurationFactory1.IconCompatParcelizer.IconCompatParcelizer();
            }
        }
        cmcdConfigurationFactory1.IconCompatParcelizer.read(list);
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i8 = MediaBrowserCompatCustomActionResultReceiver + 125;
        MediaBrowserCompatItemReceiver = i8 % 128;
        int i9 = i8 % 2;
        return getshowpopup;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        int i = 2 % 2;
        BandwidthMeterEventListener.read readVar = new BandwidthMeterEventListener.read("subject");
        int i2 = MediaBrowserCompatCustomActionResultReceiver;
        int i3 = ((i2 ^ 66) + ((i2 & 66) << 1)) - 1;
        MediaBrowserCompatItemReceiver = i3 % 128;
        if (i3 % 2 == 0) {
            return readVar;
        }
        throw null;
    }

    @Override // com.marrow2.core.sync.PaginatedSyncTask
    public final Object IconCompatParcelizer(SampleVideos<? super NetworkApiResponse<List<? extends Subject>>> sampleVideos) {
        int iWrite = GCMRegistrationRequest.write();
        return read(new Object[]{this, sampleVideos}, GCMRegistrationRequest.write(), GCMRegistrationRequest.write(), 80954826, -80954821, GCMRegistrationRequest.write(), iWrite);
    }

    @Override // com.marrow2.core.sync.PaginatedSyncTask
    public final AllocatorAllocationNode RemoteActionCompatParcelizer() {
        int iWrite = GCMRegistrationRequest.write();
        return (AllocatorAllocationNode) read(new Object[]{this}, GCMRegistrationRequest.write(), GCMRegistrationRequest.write(), -2142095953, 2142095956, GCMRegistrationRequest.write(), iWrite);
    }

    private static BandwidthMeterEventListener.read AudioAttributesCompatParcelizer() {
        int iWrite = GCMRegistrationRequest.write();
        return (BandwidthMeterEventListener.read) read(new Object[0], GCMRegistrationRequest.write(), GCMRegistrationRequest.write(), 894029428, -894029427, GCMRegistrationRequest.write(), iWrite);
    }

    @Override // com.marrow2.core.sync.PaginatedSyncTask
    public final /* synthetic */ BandwidthMeterEventListener IconCompatParcelizer() {
        int iWrite = GCMRegistrationRequest.write();
        return (BandwidthMeterEventListener) read(new Object[]{this}, GCMRegistrationRequest.write(), GCMRegistrationRequest.write(), -675195301, 675195303, GCMRegistrationRequest.write(), iWrite);
    }

    @Override // com.marrow2.core.sync.PaginatedSyncTask
    public final /* synthetic */ Object IconCompatParcelizer(List<? extends Subject> list, boolean z, SampleVideos sampleVideos) {
        Object[] objArr = {this, list, Boolean.valueOf(z), sampleVideos};
        int iWrite = GCMRegistrationRequest.write();
        return read(objArr, GCMRegistrationRequest.write(), GCMRegistrationRequest.write(), -1856019879, 1856019879, GCMRegistrationRequest.write(), iWrite);
    }

    private Object write(List<? extends Subject> list, boolean z) {
        Object[] objArr = {this, list, Boolean.valueOf(z)};
        int iWrite = GCMRegistrationRequest.write();
        return read(objArr, GCMRegistrationRequest.write(), GCMRegistrationRequest.write(), -1703155387, 1703155391, GCMRegistrationRequest.write(), iWrite);
    }
}
