package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class CmcdConfigurationHeaderKey implements getSubmittedOn<getCustomData> {
    private static int AudioAttributesCompatParcelizer = 1;
    private static int write;
    private final getTestId<ServerSideAdInsertionMediaSourceSampleStreamImpl> IconCompatParcelizer;

    public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~(i5 | i6);
        int i8 = (~i2) | (~i6);
        int i9 = (~i8) | i5;
        int i10 = (~(i6 | i2)) | (~((~i5) | i2)) | (~(i8 | i5));
        int i11 = i2 + i5 + i3 + ((-101282902) * i) + ((-829309908) * i4);
        int i12 = i11 * i11;
        int i13 = ((i2 * 42798203) - 224002048) + (42798203 * i5) + ((-1233194106) * i7) + (1828579084 * i9) + (1233194106 * i10) + ((-1190395904) * i3) + (1710751744 * i) + ((-1643118592) * i4) + ((-1134166016) * i12);
        int i14 = (i2 * 1745018779) + 1790267665 + (i5 * 1745018779) + (i7 * (-58)) + (i9 * (-116)) + (i10 * 58) + (i3 * 1745018721) + (i * (-1587019414)) + (i4 * (-1871011668)) + (i12 * 1017511936);
        int i15 = i13 + (i14 * i14 * (-1139146752));
        return i15 != 1 ? i15 != 2 ? AudioAttributesCompatParcelizer(objArr) : write(objArr) : read(objArr);
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        CmcdConfigurationHeaderKey cmcdConfigurationHeaderKey = (CmcdConfigurationHeaderKey) objArr[0];
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 & 69;
        int i4 = ((i2 ^ 69) | i3) << 1;
        int i5 = -((i2 | 69) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        AudioAttributesCompatParcelizer = i6 % 128;
        int i7 = i6 % 2;
        int iIconCompatParcelizer = DrmUtil.IconCompatParcelizer();
        int iIconCompatParcelizer2 = DrmUtil.IconCompatParcelizer();
        getCustomData getcustomdata = (getCustomData) RemoteActionCompatParcelizer(DrmUtil.IconCompatParcelizer(), 1203601378, new Object[]{cmcdConfigurationHeaderKey}, iIconCompatParcelizer2, DrmUtil.IconCompatParcelizer(), -1203601377, iIconCompatParcelizer);
        int i8 = AudioAttributesCompatParcelizer;
        int i9 = i8 & 65;
        int i10 = (i8 | 65) & (~i9);
        int i11 = -(-(i9 << 1));
        int i12 = ((i10 | i11) << 1) - (i10 ^ i11);
        write = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 63 / 0;
        }
        return getcustomdata;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        int i = 2 % 2;
        getTestId<ServerSideAdInsertionMediaSourceSampleStreamImpl> gettestid = ((CmcdConfigurationHeaderKey) objArr[0]).IconCompatParcelizer;
        throw null;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        ServerSideAdInsertionMediaSourceSampleStreamImpl serverSideAdInsertionMediaSourceSampleStreamImpl = (ServerSideAdInsertionMediaSourceSampleStreamImpl) objArr[0];
        BundledChunkExtractor bundledChunkExtractor = (BundledChunkExtractor) objArr[1];
        BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0 bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0 = (BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0) objArr[2];
        updateSelectedBaseUrl updateselectedbaseurl = (updateSelectedBaseUrl) objArr[3];
        getLastAvailableSegmentNum getlastavailablesegmentnum = (getLastAvailableSegmentNum) objArr[4];
        int i = 2 % 2;
        getCustomData getcustomdata = new getCustomData(serverSideAdInsertionMediaSourceSampleStreamImpl, bundledChunkExtractor, bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0, updateselectedbaseurl, getlastavailablesegmentnum);
        int i2 = AudioAttributesCompatParcelizer;
        int i3 = ((i2 ^ 72) + ((i2 & 72) << 1)) - 1;
        write = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 7 / 0;
        }
        return getcustomdata;
    }

    public static getCustomData write(ServerSideAdInsertionMediaSourceSampleStreamImpl serverSideAdInsertionMediaSourceSampleStreamImpl, BundledChunkExtractor bundledChunkExtractor, BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0 bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0, updateSelectedBaseUrl updateselectedbaseurl, getLastAvailableSegmentNum getlastavailablesegmentnum) {
        int iIconCompatParcelizer = DrmUtil.IconCompatParcelizer();
        int iIconCompatParcelizer2 = DrmUtil.IconCompatParcelizer();
        return (getCustomData) RemoteActionCompatParcelizer(DrmUtil.IconCompatParcelizer(), 1363716016, new Object[]{serverSideAdInsertionMediaSourceSampleStreamImpl, bundledChunkExtractor, bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0, updateselectedbaseurl, getlastavailablesegmentnum}, iIconCompatParcelizer2, DrmUtil.IconCompatParcelizer(), -1363716014, iIconCompatParcelizer);
    }

    private getCustomData write() {
        int iIconCompatParcelizer = DrmUtil.IconCompatParcelizer();
        int iIconCompatParcelizer2 = DrmUtil.IconCompatParcelizer();
        return (getCustomData) RemoteActionCompatParcelizer(DrmUtil.IconCompatParcelizer(), 1203601378, new Object[]{this}, iIconCompatParcelizer2, DrmUtil.IconCompatParcelizer(), -1203601377, iIconCompatParcelizer);
    }

    @Override // kotlin.setDescriptionList
    public final /* synthetic */ Object get() {
        int iIconCompatParcelizer = DrmUtil.IconCompatParcelizer();
        int iIconCompatParcelizer2 = DrmUtil.IconCompatParcelizer();
        return RemoteActionCompatParcelizer(DrmUtil.IconCompatParcelizer(), -941725062, new Object[]{this}, iIconCompatParcelizer2, DrmUtil.IconCompatParcelizer(), 941725062, iIconCompatParcelizer);
    }
}
