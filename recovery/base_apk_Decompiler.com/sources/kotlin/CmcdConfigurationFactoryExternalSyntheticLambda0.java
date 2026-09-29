package kotlin;

import kotlin.setPreferImmediatelyAvailableCredentials;

/* JADX INFO: loaded from: classes3.dex */
public final class CmcdConfigurationFactoryExternalSyntheticLambda0 implements getSubmittedOn<CmcdConfigurationFactory> {
    private static int IconCompatParcelizer = 1;
    private static int RemoteActionCompatParcelizer;
    private final getTestId<BundledChunkExtractor> read;

    public static /* synthetic */ Object IconCompatParcelizer(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i2;
        int i8 = ~i3;
        int i9 = ~(i7 | i8 | i5);
        int i10 = ~i5;
        int i11 = (~(i7 | i10)) | (~(i8 | i2 | i5));
        int i12 = (~(i5 | i7)) | (~(i8 | i10));
        int i13 = i2 + i3 + i + ((-1255669517) * i6) + (533247121 * i4);
        int i14 = i13 * i13;
        int i15 = ((i2 * (-1895547823)) - 858849280) + ((-1895547823) * i3) + (i9 * (-204618832)) + (i11 * (-204618832)) + ((-204618832) * i12) + ((-2100166656) * i) + (760610816 * i6) + ((-1057882112) * i4) + (1344208896 * i14);
        int i16 = ((i2 * (-122328301)) - 2132886715) + (i3 * (-122328301)) + (i9 * 272) + (i11 * 272) + (i12 * 272) + (i * (-122328029)) + (i6 * (-1196579527)) + (i4 * 656595923) + (i14 * 138215424);
        int i17 = i15 + (i16 * i16 * (-833028096));
        return i17 != 1 ? i17 != 2 ? write(objArr) : read(objArr) : AudioAttributesCompatParcelizer(objArr);
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        CmcdConfigurationFactoryExternalSyntheticLambda0 cmcdConfigurationFactoryExternalSyntheticLambda0 = (CmcdConfigurationFactoryExternalSyntheticLambda0) objArr[0];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer;
        int i3 = i2 ^ 101;
        int i4 = ((i2 & 101) | i3) << 1;
        int i5 = -i3;
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        IconCompatParcelizer = i6 % 128;
        int i7 = i6 % 2;
        CmcdConfigurationFactory cmcdConfigurationFactory = (CmcdConfigurationFactory) IconCompatParcelizer(setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read(), 1860481467, -1860481467, new Object[]{cmcdConfigurationFactoryExternalSyntheticLambda0}, setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read(), setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read(), setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read());
        int i8 = RemoteActionCompatParcelizer;
        int i9 = ((i8 & 4) + (i8 | 4)) - 1;
        IconCompatParcelizer = i9 % 128;
        int i10 = i9 % 2;
        return cmcdConfigurationFactory;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        int i = 2 % 2;
        getTestId<BundledChunkExtractor> gettestid = ((CmcdConfigurationFactoryExternalSyntheticLambda0) objArr[0]).read;
        throw null;
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        BundledChunkExtractor bundledChunkExtractor = (BundledChunkExtractor) objArr[0];
        BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0 bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0 = (BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0) objArr[1];
        ServerSideAdInsertionMediaSourceSampleStreamImpl serverSideAdInsertionMediaSourceSampleStreamImpl = (ServerSideAdInsertionMediaSourceSampleStreamImpl) objArr[2];
        getNowPeriodTimeUs getnowperiodtimeus = (getNowPeriodTimeUs) objArr[3];
        onInitializationFailed oninitializationfailed = (onInitializationFailed) objArr[4];
        setManifestParser setmanifestparser = (setManifestParser) objArr[5];
        loadSampleFormat loadsampleformat = (loadSampleFormat) objArr[6];
        createFallbackOptions createfallbackoptions = (createFallbackOptions) objArr[7];
        int i = 2 % 2;
        CmcdConfigurationFactory cmcdConfigurationFactory = new CmcdConfigurationFactory(bundledChunkExtractor, bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0, serverSideAdInsertionMediaSourceSampleStreamImpl, getnowperiodtimeus, oninitializationfailed, setmanifestparser, loadsampleformat, createfallbackoptions);
        int i2 = RemoteActionCompatParcelizer;
        int i3 = (((i2 & (-120)) | ((~i2) & 119)) - (~(-(-((i2 & 119) << 1))))) - 1;
        IconCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        return cmcdConfigurationFactory;
    }

    public static CmcdConfigurationFactory IconCompatParcelizer(BundledChunkExtractor bundledChunkExtractor, BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0 bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0, ServerSideAdInsertionMediaSourceSampleStreamImpl serverSideAdInsertionMediaSourceSampleStreamImpl, getNowPeriodTimeUs getnowperiodtimeus, onInitializationFailed oninitializationfailed, setManifestParser setmanifestparser, loadSampleFormat loadsampleformat, createFallbackOptions createfallbackoptions) {
        Object[] objArr = {bundledChunkExtractor, bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0, serverSideAdInsertionMediaSourceSampleStreamImpl, getnowperiodtimeus, oninitializationfailed, setmanifestparser, loadsampleformat, createfallbackoptions};
        int i = setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read();
        return (CmcdConfigurationFactory) IconCompatParcelizer(setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read(), -2101026949, 2101026950, objArr, setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read(), i, setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read());
    }

    private CmcdConfigurationFactory AudioAttributesCompatParcelizer() {
        int i = setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read();
        return (CmcdConfigurationFactory) IconCompatParcelizer(setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read(), 1860481467, -1860481467, new Object[]{this}, setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read(), i, setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read());
    }

    @Override // kotlin.setDescriptionList
    public final /* synthetic */ Object get() {
        int i = setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read();
        return IconCompatParcelizer(setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read(), 227452228, -227452226, new Object[]{this}, setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read(), i, setPreferImmediatelyAvailableCredentials.MediaDescriptionCompat.read());
    }
}
