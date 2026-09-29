package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class onSpanTouched implements getSubmittedOn<CmcdConfiguration> {
    private static int AudioAttributesCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    private final getTestId<ServerSideAdInsertionMediaSourceSampleStreamImpl> read;

    public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i4;
        int i8 = ~(i7 | i3);
        int i9 = ~i;
        int i10 = ~(i9 | i3);
        int i11 = i8 | i10;
        int i12 = ~i3;
        int i13 = ~(i12 | i4);
        int i14 = (~(i | i7)) | i13 | i10;
        int i15 = (~(i9 | i4)) | (~(i12 | i9)) | i13;
        int i16 = i3 + i4 + i2 + ((-954185507) * i6) + (2055044340 * i5);
        int i17 = i16 * i16;
        int i18 = ((1110557339 * i3) - 760807424) + ((-878567756) * i4) + ((-1537228134) * i11) + (i14 * 768614067) + (768614067 * i15) + ((-1647181824) * i2) + (1313472512 * i6) + (606601216 * i5) + ((-1232666624) * i17);
        int i19 = (i3 * 1290134917) + 267690129 + (i4 * 1290136780) + (i11 * (-1242)) + (i14 * 621) + (i15 * 621) + (i2 * 1290136159) + (i6 * 826674179) + (i5 * 1594648204) + (i17 * 572063744);
        int i20 = i18 + (i19 * i19 * 607715328);
        return i20 != 1 ? i20 != 2 ? write(objArr) : read(objArr) : IconCompatParcelizer(objArr);
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        onSpanTouched onspantouched = (onSpanTouched) objArr[0];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 48;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        AudioAttributesCompatParcelizer = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            int i4 = StyledPlayerControlViewLayoutManager4.read();
            int i5 = StyledPlayerControlViewLayoutManager4.read();
            int i6 = StyledPlayerControlViewLayoutManager4.read();
            obj.hashCode();
            throw null;
        }
        int i7 = StyledPlayerControlViewLayoutManager4.read();
        int i8 = StyledPlayerControlViewLayoutManager4.read();
        int i9 = StyledPlayerControlViewLayoutManager4.read();
        CmcdConfiguration cmcdConfiguration = (CmcdConfiguration) RemoteActionCompatParcelizer(i7, i8, 1200849257, -1200849255, StyledPlayerControlViewLayoutManager4.read(), i9, new Object[]{onspantouched});
        int i10 = AudioAttributesCompatParcelizer;
        int i11 = ((i10 ^ 13) | (i10 & 13)) << 1;
        int i12 = -(((~i10) & 13) | (i10 & (-14)));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        RemoteActionCompatParcelizer = i13 % 128;
        if (i13 % 2 == 0) {
            return cmcdConfiguration;
        }
        throw null;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        int i = 2 % 2;
        getTestId<ServerSideAdInsertionMediaSourceSampleStreamImpl> gettestid = ((onSpanTouched) objArr[0]).read;
        throw null;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        ServerSideAdInsertionMediaSourceSampleStreamImpl serverSideAdInsertionMediaSourceSampleStreamImpl = (ServerSideAdInsertionMediaSourceSampleStreamImpl) objArr[0];
        BundledChunkExtractor bundledChunkExtractor = (BundledChunkExtractor) objArr[1];
        BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0 bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0 = (BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0) objArr[2];
        withRemovedAdGroupCount withremovedadgroupcount = (withRemovedAdGroupCount) objArr[3];
        ServerSideAdInsertionMediaSourceMediaPeriodImpl serverSideAdInsertionMediaSourceMediaPeriodImpl = (ServerSideAdInsertionMediaSourceMediaPeriodImpl) objArr[4];
        withAllAdsReset withalladsreset = (withAllAdsReset) objArr[5];
        int i = 2 % 2;
        CmcdConfiguration cmcdConfiguration = new CmcdConfiguration(serverSideAdInsertionMediaSourceSampleStreamImpl, bundledChunkExtractor, bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0, withremovedadgroupcount, serverSideAdInsertionMediaSourceMediaPeriodImpl, withalladsreset);
        int i2 = AudioAttributesCompatParcelizer;
        int i3 = i2 ^ 13;
        int i4 = ((((i2 & 13) | i3) << 1) - (~(-i3))) - 1;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return cmcdConfiguration;
    }

    public static CmcdConfiguration AudioAttributesCompatParcelizer(ServerSideAdInsertionMediaSourceSampleStreamImpl serverSideAdInsertionMediaSourceSampleStreamImpl, BundledChunkExtractor bundledChunkExtractor, BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0 bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0, withRemovedAdGroupCount withremovedadgroupcount, ServerSideAdInsertionMediaSourceMediaPeriodImpl serverSideAdInsertionMediaSourceMediaPeriodImpl, withAllAdsReset withalladsreset) {
        int i = StyledPlayerControlViewLayoutManager4.read();
        int i2 = StyledPlayerControlViewLayoutManager4.read();
        int i3 = StyledPlayerControlViewLayoutManager4.read();
        return (CmcdConfiguration) RemoteActionCompatParcelizer(i, i2, -181343274, 181343274, StyledPlayerControlViewLayoutManager4.read(), i3, new Object[]{serverSideAdInsertionMediaSourceSampleStreamImpl, bundledChunkExtractor, bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0, withremovedadgroupcount, serverSideAdInsertionMediaSourceMediaPeriodImpl, withalladsreset});
    }

    private CmcdConfiguration write() {
        int i = StyledPlayerControlViewLayoutManager4.read();
        int i2 = StyledPlayerControlViewLayoutManager4.read();
        int i3 = StyledPlayerControlViewLayoutManager4.read();
        return (CmcdConfiguration) RemoteActionCompatParcelizer(i, i2, 1200849257, -1200849255, StyledPlayerControlViewLayoutManager4.read(), i3, new Object[]{this});
    }

    @Override // kotlin.setDescriptionList
    public final /* synthetic */ Object get() {
        int i = StyledPlayerControlViewLayoutManager4.read();
        int i2 = StyledPlayerControlViewLayoutManager4.read();
        int i3 = StyledPlayerControlViewLayoutManager4.read();
        return RemoteActionCompatParcelizer(i, i2, 10093275, -10093274, StyledPlayerControlViewLayoutManager4.read(), i3, new Object[]{this});
    }
}
