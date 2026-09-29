package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class isStreamingFormatLoggingAllowed implements getSubmittedOn<isTopBitrateLoggingAllowed> {
    private static int AudioAttributesCompatParcelizer = 0;
    private static int read = 1;
    private final getTestId<BundledChunkExtractor> RemoteActionCompatParcelizer;

    public static /* synthetic */ Object write(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i2;
        int i9 = ~(i7 | i8);
        int i10 = ~i6;
        int i11 = ~(i10 | i8);
        int i12 = i9 | i11 | (~(i4 | i6 | i2));
        int i13 = i7 | i10;
        int i14 = i9 | (~i13) | i11;
        int i15 = (~(i2 | i6)) | (~(i13 | i8)) | (~(i4 | i2));
        int i16 = i4 + i6 + i3 + ((-298151579) * i) + ((-427515960) * i5);
        int i17 = i16 * i16;
        int i18 = (i4 * (-431502880)) + 875560960 + ((-431502880) * i6) + ((-1881159201) * i12) + ((-532648894) * i14) + (1881159201 * i15) + (1449656320 * i3) + ((-16252928) * i) + (423624704 * i5) + (1109590016 * i17);
        int i19 = ((i4 * (-2003555040)) - 1632655964) + (i6 * (-2003555040)) + (i12 * (-423)) + (i14 * 846) + (i15 * 423) + (i3 * (-2003554617)) + (i * 1812671363) + (i5 * (-1519508360)) + (i17 * (-1288372224));
        int i20 = i18 + (i19 * i19 * (-1796407296));
        return i20 != 1 ? i20 != 2 ? IconCompatParcelizer(objArr) : read(objArr) : AudioAttributesCompatParcelizer(objArr);
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        isStreamingFormatLoggingAllowed isstreamingformatloggingallowed = (isStreamingFormatLoggingAllowed) objArr[0];
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer;
        int i3 = i2 & 67;
        int i4 = ((i2 | 67) & (~i3)) + (i3 << 1);
        read = i4 % 128;
        if (i4 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        isTopBitrateLoggingAllowed istopbitrateloggingallowed = (isTopBitrateLoggingAllowed) write(getHasMultipleThemes.read(), new Object[]{isstreamingformatloggingallowed}, getHasMultipleThemes.read(), getHasMultipleThemes.read(), -582608971, getHasMultipleThemes.read(), 582608972);
        int i5 = read;
        int i6 = ((i5 ^ 50) + ((i5 & 50) << 1)) - 1;
        AudioAttributesCompatParcelizer = i6 % 128;
        int i7 = i6 % 2;
        return istopbitrateloggingallowed;
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        int i = 2 % 2;
        getTestId<BundledChunkExtractor> gettestid = ((isStreamingFormatLoggingAllowed) objArr[0]).RemoteActionCompatParcelizer;
        throw null;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        int i = 2 % 2;
        isTopBitrateLoggingAllowed istopbitrateloggingallowed = new isTopBitrateLoggingAllowed((BundledChunkExtractor) objArr[0], (ServerSideAdInsertionMediaSourceSampleStreamImpl) objArr[1], (BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0) objArr[2], (onRemove) objArr[3]);
        int i2 = AudioAttributesCompatParcelizer;
        int i3 = (i2 & (-34)) | ((~i2) & 33);
        int i4 = (i2 & 33) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        read = i5 % 128;
        int i6 = i5 % 2;
        return istopbitrateloggingallowed;
    }

    public static isTopBitrateLoggingAllowed RemoteActionCompatParcelizer(BundledChunkExtractor bundledChunkExtractor, ServerSideAdInsertionMediaSourceSampleStreamImpl serverSideAdInsertionMediaSourceSampleStreamImpl, BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0 bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0, onRemove onremove) {
        int i = getHasMultipleThemes.read();
        int i2 = getHasMultipleThemes.read();
        return (isTopBitrateLoggingAllowed) write(getHasMultipleThemes.read(), new Object[]{bundledChunkExtractor, serverSideAdInsertionMediaSourceSampleStreamImpl, bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0, onremove}, i, i2, -221972610, getHasMultipleThemes.read(), 221972612);
    }

    private isTopBitrateLoggingAllowed AudioAttributesCompatParcelizer() {
        int i = getHasMultipleThemes.read();
        int i2 = getHasMultipleThemes.read();
        return (isTopBitrateLoggingAllowed) write(getHasMultipleThemes.read(), new Object[]{this}, i, i2, -582608971, getHasMultipleThemes.read(), 582608972);
    }

    @Override // kotlin.setDescriptionList
    public final /* synthetic */ Object get() {
        int i = getHasMultipleThemes.read();
        int i2 = getHasMultipleThemes.read();
        return write(getHasMultipleThemes.read(), new Object[]{this}, i, i2, 1044915057, getHasMultipleThemes.read(), -1044915057);
    }
}
