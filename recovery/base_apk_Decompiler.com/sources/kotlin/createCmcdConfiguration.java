package kotlin;

import com.marrow2.ui.schema.listing.SchemaListViewModel;

/* JADX INFO: loaded from: classes3.dex */
public final class createCmcdConfiguration implements getSubmittedOn<isSessionIdLoggingAllowed> {
    private static int RemoteActionCompatParcelizer = 1;
    private static int read;
    private final getTestId<BundledChunkExtractor> AudioAttributesCompatParcelizer;

    public static /* synthetic */ Object write(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i5;
        int i8 = ~(i7 | i3);
        int i9 = ~i;
        int i10 = ~i3;
        int i11 = i8 | (~(i9 | i10 | i5));
        int i12 = (~(i3 | i9 | i5)) | (~(i10 | i7));
        int i13 = ~(i7 | i9);
        int i14 = i + i5 + i2 + (563899752 * i4) + (667302295 * i6);
        int i15 = i14 * i14;
        int i16 = ((i * 1426164010) - 416808960) + (1426164010 * i5) + (i11 * 480671447) + (i12 * 480671447) + (480671447 * i13) + (1906835456 * i2) + ((-1270874112) * i4) + (1914175488 * i6) + ((-1995833344) * i15);
        int i17 = (i * (-901935710)) + 144807674 + (i5 * (-901935710)) + (i11 * 171) + (i12 * 171) + (i13 * 171) + (i2 * (-901935539)) + (i4 * 42244168) + (i6 * (-913566613)) + (i15 * (-1006501888));
        int i18 = i16 + (i17 * i17 * (-1006239744));
        return i18 != 1 ? i18 != 2 ? read(objArr) : RemoteActionCompatParcelizer(objArr) : write(objArr);
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        createCmcdConfiguration createcmcdconfiguration = (createCmcdConfiguration) objArr[0];
        int i = 2 % 2;
        int i2 = read + 7;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        int i4 = SchemaListViewModel.onCommand.read();
        isSessionIdLoggingAllowed issessionidloggingallowed = (isSessionIdLoggingAllowed) write(1256044867, SchemaListViewModel.onCommand.read(), i4, SchemaListViewModel.onCommand.read(), -1256044865, new Object[]{createcmcdconfiguration}, SchemaListViewModel.onCommand.read());
        int i5 = (-2) - ((read + 92) ^ (-1));
        RemoteActionCompatParcelizer = i5 % 128;
        if (i5 % 2 != 0) {
            return issessionidloggingallowed;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        int i = 2 % 2;
        getTestId<BundledChunkExtractor> gettestid = ((createCmcdConfiguration) objArr[0]).AudioAttributesCompatParcelizer;
        throw null;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        BundledChunkExtractor bundledChunkExtractor = (BundledChunkExtractor) objArr[0];
        ServerSideAdInsertionMediaSourceSampleStreamImpl serverSideAdInsertionMediaSourceSampleStreamImpl = (ServerSideAdInsertionMediaSourceSampleStreamImpl) objArr[1];
        BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0 bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0 = (BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0) objArr[2];
        DashMediaSourceExternalSyntheticLambda0 dashMediaSourceExternalSyntheticLambda0 = (DashMediaSourceExternalSyntheticLambda0) objArr[3];
        onManifestLoadError onmanifestloaderror = (onManifestLoadError) objArr[4];
        replaceManifestUri replacemanifesturi = (replaceManifestUri) objArr[5];
        onManifestLoadCompleted onmanifestloadcompleted = (onManifestLoadCompleted) objArr[6];
        int i = 2 % 2;
        isSessionIdLoggingAllowed issessionidloggingallowed = new isSessionIdLoggingAllowed(bundledChunkExtractor, serverSideAdInsertionMediaSourceSampleStreamImpl, bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0, dashMediaSourceExternalSyntheticLambda0, onmanifestloaderror, replacemanifesturi, onmanifestloadcompleted);
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 | 97;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 97)) & i3);
        int i6 = (i4 & i5) + (i5 | i4);
        read = i6 % 128;
        if (i6 % 2 == 0) {
            return issessionidloggingallowed;
        }
        throw null;
    }

    public static isSessionIdLoggingAllowed write(BundledChunkExtractor bundledChunkExtractor, ServerSideAdInsertionMediaSourceSampleStreamImpl serverSideAdInsertionMediaSourceSampleStreamImpl, BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0 bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0, DashMediaSourceExternalSyntheticLambda0 dashMediaSourceExternalSyntheticLambda0, onManifestLoadError onmanifestloaderror, replaceManifestUri replacemanifesturi, onManifestLoadCompleted onmanifestloadcompleted) {
        Object[] objArr = {bundledChunkExtractor, serverSideAdInsertionMediaSourceSampleStreamImpl, bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0, dashMediaSourceExternalSyntheticLambda0, onmanifestloaderror, replacemanifesturi, onmanifestloadcompleted};
        return (isSessionIdLoggingAllowed) write(-285559085, SchemaListViewModel.onCommand.read(), SchemaListViewModel.onCommand.read(), SchemaListViewModel.onCommand.read(), 285559085, objArr, SchemaListViewModel.onCommand.read());
    }

    private isSessionIdLoggingAllowed read() {
        int i = SchemaListViewModel.onCommand.read();
        return (isSessionIdLoggingAllowed) write(1256044867, SchemaListViewModel.onCommand.read(), i, SchemaListViewModel.onCommand.read(), -1256044865, new Object[]{this}, SchemaListViewModel.onCommand.read());
    }

    @Override // kotlin.setDescriptionList
    public final /* synthetic */ Object get() {
        int i = SchemaListViewModel.onCommand.read();
        return write(1385364710, SchemaListViewModel.onCommand.read(), i, SchemaListViewModel.onCommand.read(), -1385364709, new Object[]{this}, SchemaListViewModel.onCommand.read());
    }
}
