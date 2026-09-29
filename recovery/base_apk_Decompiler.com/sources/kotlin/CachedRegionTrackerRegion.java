package kotlin;

import com.marrow2.ui.qbank.score.QbankScoreViewModel;

/* JADX INFO: loaded from: classes3.dex */
public final class CachedRegionTrackerRegion implements getSubmittedOn<onSpanRemoved> {
    private static int AudioAttributesCompatParcelizer = 0;
    private static int write = 1;
    private final getTestId<ServerSideAdInsertionMediaSourceSampleStreamImpl> read;

    public static /* synthetic */ Object write(int i, int i2, int i3, int i4, int i5, int i6, Object[] objArr) {
        int i7 = ~i;
        int i8 = ~(i7 | i3);
        int i9 = ~(i | i3);
        int i10 = i7 | (~i3);
        int i11 = i9 | (~(i10 | i6));
        int i12 = (~i6) | i10;
        int i13 = i + i3 + i5 + (770105990 * i2) + ((-157043368) * i4);
        int i14 = i13 * i13;
        int i15 = ((315592168 * i) - 1432092672) + ((-1000312294) * i3) + ((-1315904462) * i8) + ((-657952231) * i11) + (657952231 * i12) + ((-342360064) * i5) + ((-2121269248) * i2) + (1950351360 * i4) + ((-66846720) * i14);
        int i16 = (i * 105828664) + 1394048361 + (i3 * 105827886) + (i8 * (-778)) + (i11 * (-389)) + (i12 * 389) + (i5 * 105828275) + (i2 * (-227623502)) + (i4 * 619312264) + (i14 * 1925971968);
        int i17 = i15 + (i16 * i16 * 261881856);
        return i17 != 1 ? i17 != 2 ? read(objArr) : write(objArr) : IconCompatParcelizer(objArr);
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        onSpanRemoved onspanremoved;
        CachedRegionTrackerRegion cachedRegionTrackerRegion = (CachedRegionTrackerRegion) objArr[0];
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 ^ 9;
        int i4 = -(-((i2 & 9) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        AudioAttributesCompatParcelizer = i5 % 128;
        if (i5 % 2 != 0) {
            int iAudioAttributesCompatParcelizer = QbankScoreViewModel.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer();
            int iAudioAttributesCompatParcelizer2 = QbankScoreViewModel.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer();
            onspanremoved = (onSpanRemoved) write(-1993611092, QbankScoreViewModel.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(), 1993611094, QbankScoreViewModel.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer, new Object[]{cachedRegionTrackerRegion});
            int i6 = 44 / 0;
        } else {
            int iAudioAttributesCompatParcelizer3 = QbankScoreViewModel.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer();
            int iAudioAttributesCompatParcelizer4 = QbankScoreViewModel.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer();
            onspanremoved = (onSpanRemoved) write(-1993611092, QbankScoreViewModel.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(), 1993611094, QbankScoreViewModel.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer4, iAudioAttributesCompatParcelizer3, new Object[]{cachedRegionTrackerRegion});
        }
        int i7 = AudioAttributesCompatParcelizer;
        int i8 = i7 ^ 101;
        int i9 = -(-((i7 & 101) << 1));
        int i10 = (i8 & i9) + (i9 | i8);
        write = i10 % 128;
        int i11 = i10 % 2;
        return onspanremoved;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        int i = 2 % 2;
        getTestId<ServerSideAdInsertionMediaSourceSampleStreamImpl> gettestid = ((CachedRegionTrackerRegion) objArr[0]).read;
        throw null;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        ServerSideAdInsertionMediaSourceSampleStreamImpl serverSideAdInsertionMediaSourceSampleStreamImpl = (ServerSideAdInsertionMediaSourceSampleStreamImpl) objArr[0];
        BundledChunkExtractor bundledChunkExtractor = (BundledChunkExtractor) objArr[1];
        BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0 bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0 = (BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0) objArr[2];
        getNowPeriodTimeUs getnowperiodtimeus = (getNowPeriodTimeUs) objArr[3];
        onDashManifestPublishTimeExpired ondashmanifestpublishtimeexpired = (onDashManifestPublishTimeExpired) objArr[4];
        getPlatform getplatform = (getPlatform) objArr[5];
        int i = 2 % 2;
        onSpanRemoved onspanremoved = new onSpanRemoved(serverSideAdInsertionMediaSourceSampleStreamImpl, bundledChunkExtractor, bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0, getnowperiodtimeus, ondashmanifestpublishtimeexpired, getplatform);
        int i2 = write + 13;
        AudioAttributesCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        return onspanremoved;
    }

    public static onSpanRemoved read(ServerSideAdInsertionMediaSourceSampleStreamImpl serverSideAdInsertionMediaSourceSampleStreamImpl, BundledChunkExtractor bundledChunkExtractor, BandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0 bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0, getNowPeriodTimeUs getnowperiodtimeus, onDashManifestPublishTimeExpired ondashmanifestpublishtimeexpired, getPlatform getplatform) {
        int iAudioAttributesCompatParcelizer = QbankScoreViewModel.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = QbankScoreViewModel.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer();
        return (onSpanRemoved) write(1837962473, QbankScoreViewModel.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(), -1837962473, QbankScoreViewModel.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer, new Object[]{serverSideAdInsertionMediaSourceSampleStreamImpl, bundledChunkExtractor, bandwidthMeterEventListenerEventDispatcherExternalSyntheticLambda0, getnowperiodtimeus, ondashmanifestpublishtimeexpired, getplatform});
    }

    private onSpanRemoved read() {
        int iAudioAttributesCompatParcelizer = QbankScoreViewModel.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = QbankScoreViewModel.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer();
        return (onSpanRemoved) write(-1993611092, QbankScoreViewModel.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(), 1993611094, QbankScoreViewModel.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer, new Object[]{this});
    }

    @Override // kotlin.setDescriptionList
    public final /* synthetic */ Object get() {
        int iAudioAttributesCompatParcelizer = QbankScoreViewModel.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = QbankScoreViewModel.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer();
        return write(-402713854, QbankScoreViewModel.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(), 402713855, QbankScoreViewModel.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer2, iAudioAttributesCompatParcelizer, new Object[]{this});
    }
}
