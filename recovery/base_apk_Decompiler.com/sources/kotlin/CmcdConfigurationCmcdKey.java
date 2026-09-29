package kotlin;

import com.google.android.exoplayer2.source.MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda2;

/* JADX INFO: loaded from: classes3.dex */
public final class CmcdConfigurationCmcdKey implements getSubmittedOn<CmcdConfigurationFactory1> {
    private static int AudioAttributesCompatParcelizer = 0;
    private static int write = 1;
    private final getTestId<BundledChunkExtractor> IconCompatParcelizer;

    public static /* synthetic */ Object read(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i3;
        int i9 = ~(i7 | i8);
        int i10 = ~i2;
        int i11 = ~(i8 | i10);
        int i12 = i9 | i11;
        int i13 = (~(i2 | i8 | i4)) | (~(i7 | i3)) | (~(i10 | i7));
        int i14 = i4 + i3 + i + ((-1336646162) * i6) + (1706069763 * i5);
        int i15 = i14 * i14;
        int i16 = ((i4 * (-1709230891)) - 203685888) + ((-1709230891) * i3) + ((-1137600936) * i12) + (568800468 * i11) + ((-568800468) * i13) + (2016935936 * i) + ((-602931200) * i6) + ((-1331167232) * i5) + ((-1604583424) * i15);
        int i17 = ((i4 * 112646815) - 831444653) + (i3 * 112646815) + (i12 * 520) + (i11 * (-260)) + (i13 * 260) + (i * 112647075) + (i6 * (-2078048118)) + (i5 * (-2015059991)) + (i15 * (-829161472));
        int i18 = i16 + (i17 * i17 * (-1266417664));
        return i18 != 1 ? i18 != 2 ? IconCompatParcelizer(objArr) : AudioAttributesCompatParcelizer(objArr) : write(objArr);
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        CmcdConfigurationCmcdKey cmcdConfigurationCmcdKey = (CmcdConfigurationCmcdKey) objArr[0];
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer;
        int i3 = i2 & 33;
        int i4 = (i2 | 33) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        write = i6 % 128;
        if (i6 % 2 != 0) {
            int iIconCompatParcelizer = MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda2.IconCompatParcelizer();
            return (CmcdConfigurationFactory1) read(MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda2.IconCompatParcelizer(), new Object[]{cmcdConfigurationCmcdKey}, iIconCompatParcelizer, 17839213, -17839213, MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda2.IconCompatParcelizer(), MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda2.IconCompatParcelizer());
        }
        int iIconCompatParcelizer2 = MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda2.IconCompatParcelizer();
        throw null;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        int i = 2 % 2;
        getTestId<BundledChunkExtractor> gettestid = ((CmcdConfigurationCmcdKey) objArr[0]).IconCompatParcelizer;
        throw null;
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        int i = 2 % 2;
        CmcdConfigurationFactory1 cmcdConfigurationFactory1 = new CmcdConfigurationFactory1((BundledChunkExtractor) objArr[0], (BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0) objArr[1], (ServerSideAdInsertionMediaSourceSampleStreamImpl) objArr[2], (DebugTextViewHelper) objArr[3]);
        int i2 = write;
        int i3 = i2 & 51;
        int i4 = -(-((i2 ^ 51) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        AudioAttributesCompatParcelizer = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 79 / 0;
        }
        return cmcdConfigurationFactory1;
    }

    public static CmcdConfigurationFactory1 IconCompatParcelizer(BundledChunkExtractor bundledChunkExtractor, BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0 bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0, ServerSideAdInsertionMediaSourceSampleStreamImpl serverSideAdInsertionMediaSourceSampleStreamImpl, DebugTextViewHelper debugTextViewHelper) {
        int iIconCompatParcelizer = MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda2.IconCompatParcelizer();
        return (CmcdConfigurationFactory1) read(MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda2.IconCompatParcelizer(), new Object[]{bundledChunkExtractor, bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0, serverSideAdInsertionMediaSourceSampleStreamImpl, debugTextViewHelper}, iIconCompatParcelizer, 135395899, -135395897, MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda2.IconCompatParcelizer(), MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda2.IconCompatParcelizer());
    }

    private CmcdConfigurationFactory1 RemoteActionCompatParcelizer() {
        int iIconCompatParcelizer = MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda2.IconCompatParcelizer();
        return (CmcdConfigurationFactory1) read(MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda2.IconCompatParcelizer(), new Object[]{this}, iIconCompatParcelizer, 17839213, -17839213, MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda2.IconCompatParcelizer(), MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda2.IconCompatParcelizer());
    }

    @Override // kotlin.setDescriptionList
    public final /* synthetic */ Object get() {
        int iIconCompatParcelizer = MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda2.IconCompatParcelizer();
        return read(MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda2.IconCompatParcelizer(), new Object[]{this}, iIconCompatParcelizer, -739550905, 739550906, MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda2.IconCompatParcelizer(), MediaSourceEventListener$EventDispatcher$$ExternalSyntheticLambda2.IconCompatParcelizer());
    }
}
