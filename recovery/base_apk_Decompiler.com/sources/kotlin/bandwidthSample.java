package kotlin;

import com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector$$ExternalSyntheticLambda19;
import java.util.List;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes3.dex */
public final class bandwidthSample {
    private static int AudioAttributesImplApi21Parcelizer = 0;
    private static int AudioAttributesImplApi26Parcelizer = 1;
    private setPassingYear AudioAttributesCompatParcelizer;
    private final TopUserCompanion AudioAttributesImplBaseParcelizer;
    private final String IconCompatParcelizer;
    private setPassingYear RemoteActionCompatParcelizer;
    private final AssetDataSourceAssetDataSourceException read;
    private final transferEnded write;

    public static /* synthetic */ Object RemoteActionCompatParcelizer(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~((~i3) | i4);
        int i8 = ~((~i4) | i);
        int i9 = i8 | i7;
        int i10 = i8 | (~((~i) | i4));
        int i11 = i4 + i + i6 + (762724209 * i2) + (1201824936 * i5);
        int i12 = i11 * i11;
        int i13 = ((-126223985) * i4) + 43253760 + (1339426419 * i) + ((-1465650404) * i7) + (1465650404 * i9) + (1414658446 * i10) + ((-1540882432) * i6) + (1302855680 * i2) + (1514143744 * i5) + (1905524736 * i12);
        int i14 = ((i4 * 162561953) - 555857873) + (i * 162559997) + (i7 * 1956) + (i9 * (-1956)) + (i10 * 978) + (i6 * 162560975) + (i2 * 701011807) + (i5 * 237771736) + (i12 * (-223608832));
        switch (i13 + (i14 * i14 * 703332352)) {
            case 1:
                return RemoteActionCompatParcelizer(objArr);
            case 2:
                return IconCompatParcelizer(objArr);
            case 3:
                return AudioAttributesCompatParcelizer(objArr);
            case 4:
                return read(objArr);
            case 5:
                return MediaBrowserCompatItemReceiver(objArr);
            case 6:
                return AudioAttributesImplBaseParcelizer(objArr);
            default:
                return write(objArr);
        }
    }

    @setSdkPayload
    public bandwidthSample(transferEnded transferended, AssetDataSourceAssetDataSourceException assetDataSourceAssetDataSourceException, TopUserCompanion topUserCompanion) {
        toMagicModuleMetaRepoModel.write(transferended, "");
        toMagicModuleMetaRepoModel.write(assetDataSourceAssetDataSourceException, "");
        toMagicModuleMetaRepoModel.write(topUserCompanion, "");
        this.write = transferended;
        this.read = assetDataSourceAssetDataSourceException;
        this.AudioAttributesImplBaseParcelizer = topUserCompanion;
        this.IconCompatParcelizer = "SyncLoggerV2";
    }

    private static /* synthetic */ Object AudioAttributesImplBaseParcelizer(Object[] objArr) {
        bandwidthSample bandwidthsample = (bandwidthSample) objArr[0];
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 53;
        int i3 = i2 % 128;
        AudioAttributesImplApi26Parcelizer = i3;
        int i4 = i2 % 2;
        transferEnded transferended = bandwidthsample.write;
        int i5 = i3 & 121;
        int i6 = (i3 | 121) & (~i5);
        int i7 = -(-(i5 << 1));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        AudioAttributesImplApi21Parcelizer = i8 % 128;
        int i9 = i8 % 2;
        return transferended;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        bandwidthSample bandwidthsample = (bandwidthSample) objArr[0];
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer;
        int i3 = i2 | 105;
        int i4 = (i3 << 1) - ((~(i2 & 105)) & i3);
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        int i5 = i4 % 2;
        AssetDataSourceAssetDataSourceException assetDataSourceAssetDataSourceException = bandwidthsample.read;
        if (i5 == 0) {
            return assetDataSourceAssetDataSourceException;
        }
        throw null;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        bandwidthSample bandwidthsample = (bandwidthSample) objArr[0];
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer;
        int i3 = (-2) - (((i2 ^ 24) + ((i2 & 24) << 1)) ^ (-1));
        int i4 = i3 % 128;
        AudioAttributesImplApi26Parcelizer = i4;
        int i5 = i3 % 2;
        String str = bandwidthsample.IconCompatParcelizer;
        int i6 = i4 + 3;
        AudioAttributesImplApi21Parcelizer = i6 % 128;
        int i7 = i6 % 2;
        return str;
    }

    private static /* synthetic */ Object MediaBrowserCompatItemReceiver(Object[] objArr) {
        bandwidthSample bandwidthsample = (bandwidthSample) objArr[0];
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer;
        int i3 = (i2 | 99) << 1;
        int i4 = -(((~i2) & 99) | (i2 & (-100)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        AudioAttributesImplApi21Parcelizer = i5 % 128;
        int i6 = i5 % 2;
        buildResolutionString.IconCompatParcelizer(bandwidthsample.IconCompatParcelizer, "executeNonContentSync: Initiating non-content sync");
        TopUserCompanion topUserCompanion = bandwidthsample.AudioAttributesImplBaseParcelizer;
        IconCompatParcelizer iconCompatParcelizer = bandwidthsample.new IconCompatParcelizer(null);
        int i7 = AudioAttributesImplApi21Parcelizer + 85;
        AudioAttributesImplApi26Parcelizer = i7 % 128;
        int i8 = i7 % 2;
        bandwidthsample.AudioAttributesCompatParcelizer = C0201setMcqCount.IconCompatParcelizer(topUserCompanion, null, null, iconCompatParcelizer, 3);
        int i9 = AudioAttributesImplApi26Parcelizer;
        int i10 = ((i9 ^ 17) | (i9 & 17)) << 1;
        int i11 = -(((~i9) & 17) | (i9 & (-18)));
        int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
        AudioAttributesImplApi21Parcelizer = i12 % 128;
        int i13 = i12 % 2;
        return null;
    }

    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private static int IconCompatParcelizer = 0;
        private static int write = 1;
        private int AudioAttributesCompatParcelizer;
        private Object RemoteActionCompatParcelizer;

        public static /* synthetic */ Object AudioAttributesCompatParcelizer(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
            int i7 = ~i;
            int i8 = ~(i7 | i2 | i3);
            int i9 = (~((~i3) | i2)) | (~(i2 | i));
            int i10 = i2 + i + i5 + (32217706 * i4) + (238734613 * i6);
            int i11 = i10 * i10;
            int i12 = (((-3446596) * i2) - 528416768) + (677943110 * i) + (i8 * 1806788795) + ((-1806788795) * i7) + (1806788795 * i9) + ((-1810235392) * i5) + ((-154927104) * i4) + ((-131989504) * i6) + ((-1876361216) * i11);
            int i13 = ((i2 * 1127137324) - 440746823) + (i * 1127135646) + (i8 * 839) + (i7 * (-839)) + (i9 * 839) + (i5 * 1127136485) + (i4 * 976419026) + (i6 * 1106960329) + (i11 * 279773184);
            int i14 = i12 + (i13 * i13 * (-1943076864));
            return i14 != 1 ? i14 != 2 ? i14 != 3 ? read(objArr) : write(objArr) : IconCompatParcelizer(objArr) : RemoteActionCompatParcelizer(objArr);
        }

        private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
            IconCompatParcelizer iconCompatParcelizer;
            int i;
            IconCompatParcelizer iconCompatParcelizer2 = (IconCompatParcelizer) objArr[0];
            Object obj = objArr[1];
            int i2 = 2 % 2;
            int i3 = write + 2;
            int i4 = (i3 ^ (-1)) + (i3 << 1);
            IconCompatParcelizer = i4 % 128;
            Object obj2 = null;
            if (i4 % 2 != 0) {
                getYear.IconCompatParcelizer();
                int i5 = iconCompatParcelizer2.AudioAttributesCompatParcelizer;
                throw null;
            }
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i6 = iconCompatParcelizer2.AudioAttributesCompatParcelizer;
            if (i6 != 0) {
                int i7 = write;
                int i8 = ((i7 ^ 16) + ((i7 & 16) << 1)) - 1;
                IconCompatParcelizer = i8 % 128;
                int i9 = i8 % 2;
                if (i6 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                int i10 = i7 | 83;
                int i11 = i10 << 1;
                int i12 = -(i10 & (~(i7 & 83)));
                int i13 = (i11 & i12) + (i12 | i11);
                IconCompatParcelizer = i13 % 128;
                int i14 = i13 % 2;
                Object obj3 = iconCompatParcelizer2.RemoteActionCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
                int i15 = IconCompatParcelizer;
                int i16 = (i15 & 113) + (i15 | 113);
                write = i16 % 128;
                int i17 = i16 % 2;
            } else {
                SdkPayloadData.IconCompatParcelizer(obj);
                List<ByteArrayDataSource> listAudioAttributesCompatParcelizer = transferStarted.AudioAttributesCompatParcelizer();
                if (listAudioAttributesCompatParcelizer.isEmpty()) {
                    int i18 = write;
                    int i19 = (i18 & 7) + (i18 | 7);
                    IconCompatParcelizer = i19 % 128;
                    if (i19 % 2 != 0) {
                        buildResolutionString.IconCompatParcelizer((String) bandwidthSample.RemoteActionCompatParcelizer(-1963824326, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), 1963824330, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), new Object[]{bandwidthSample.this}, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer()), "executeNonContentSync: No non-content syncs found. Aborting.");
                        obj2.hashCode();
                        throw null;
                    }
                    buildResolutionString.IconCompatParcelizer((String) bandwidthSample.RemoteActionCompatParcelizer(-1963824326, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), 1963824330, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), new Object[]{bandwidthSample.this}, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer()), "executeNonContentSync: No non-content syncs found. Aborting.");
                    int i20 = (-2) - ((IconCompatParcelizer + 46) ^ (-1));
                    write = i20 % 128;
                    if (i20 % 2 != 0) {
                        return getShowPopup.INSTANCE;
                    }
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                    obj2.hashCode();
                    throw null;
                }
                String str = (String) bandwidthSample.RemoteActionCompatParcelizer(-1963824326, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), 1963824330, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), new Object[]{bandwidthSample.this}, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer());
                int size = listAudioAttributesCompatParcelizer.size();
                StringBuilder sb = new StringBuilder("executeNonContentSync: Enqueuing ");
                int i21 = IconCompatParcelizer;
                int i22 = i21 & 55;
                int i23 = i22 + ((i21 ^ 55) | i22);
                write = i23 % 128;
                if (i23 % 2 == 0) {
                    sb.append(size);
                    sb.append(" non-content sync tasks");
                    sb.toString();
                    throw null;
                }
                sb.append(size);
                sb.append(" non-content sync tasks");
                String string = sb.toString();
                int i24 = IconCompatParcelizer + 17;
                write = i24 % 128;
                int i25 = i24 % 2;
                buildResolutionString.IconCompatParcelizer(str, string);
                transferEnded transferended = (transferEnded) bandwidthSample.RemoteActionCompatParcelizer(676925640, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), -676925634, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), new Object[]{bandwidthSample.this}, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer());
                int i26 = IconCompatParcelizer + 53;
                int i27 = i26 % 128;
                write = i27;
                if (i26 % 2 == 0) {
                    iconCompatParcelizer = iconCompatParcelizer2;
                    iconCompatParcelizer2.RemoteActionCompatParcelizer = null;
                    i = 0;
                } else {
                    iconCompatParcelizer = iconCompatParcelizer2;
                    iconCompatParcelizer2.RemoteActionCompatParcelizer = null;
                    i = 1;
                }
                int i28 = ((i27 & (-58)) | ((~i27) & 57)) + ((i27 & 57) << 1);
                IconCompatParcelizer = i28 % 128;
                if (i28 % 2 != 0) {
                    iconCompatParcelizer2.AudioAttributesCompatParcelizer = i;
                    transferEnded.IconCompatParcelizer(1834845208, setScheme.IconCompatParcelizer(), new Object[]{transferended, listAudioAttributesCompatParcelizer, iconCompatParcelizer}, -1834845204, setScheme.IconCompatParcelizer(), setScheme.IconCompatParcelizer(), setScheme.IconCompatParcelizer());
                    obj2.hashCode();
                    throw null;
                }
                iconCompatParcelizer2.AudioAttributesCompatParcelizer = i;
                if (transferEnded.IconCompatParcelizer(1834845208, setScheme.IconCompatParcelizer(), new Object[]{transferended, listAudioAttributesCompatParcelizer, iconCompatParcelizer}, -1834845204, setScheme.IconCompatParcelizer(), setScheme.IconCompatParcelizer(), setScheme.IconCompatParcelizer()) == objIconCompatParcelizer) {
                    int i29 = IconCompatParcelizer;
                    int i30 = ((i29 ^ 86) + ((i29 & 86) << 1)) - 1;
                    int i31 = i30 % 128;
                    write = i31;
                    int i32 = i30 % 2;
                    int i33 = i31 + 59;
                    IconCompatParcelizer = i33 % 128;
                    int i34 = i33 % 2;
                    return objIconCompatParcelizer;
                }
            }
            getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
            int i35 = IconCompatParcelizer;
            int i36 = ((i35 & 14) + (i35 | 14)) - 1;
            write = i36 % 128;
            if (i36 % 2 == 0) {
                int i37 = 48 / 0;
            }
            return getshowpopup2;
        }

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return (SampleVideos) AudioAttributesCompatParcelizer(-2026152052, 2026152054, DefaultAnalyticsCollector$$ExternalSyntheticLambda19.AudioAttributesCompatParcelizer(), new Object[]{this, obj, sampleVideos}, DefaultAnalyticsCollector$$ExternalSyntheticLambda19.AudioAttributesCompatParcelizer(), DefaultAnalyticsCollector$$ExternalSyntheticLambda19.AudioAttributesCompatParcelizer(), DefaultAnalyticsCollector$$ExternalSyntheticLambda19.AudioAttributesCompatParcelizer());
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return AudioAttributesCompatParcelizer(-1826592943, 1826592943, DefaultAnalyticsCollector$$ExternalSyntheticLambda19.AudioAttributesCompatParcelizer(), new Object[]{this, topUserCompanion, sampleVideos}, DefaultAnalyticsCollector$$ExternalSyntheticLambda19.AudioAttributesCompatParcelizer(), DefaultAnalyticsCollector$$ExternalSyntheticLambda19.AudioAttributesCompatParcelizer(), DefaultAnalyticsCollector$$ExternalSyntheticLambda19.AudioAttributesCompatParcelizer());
        }

        private Object AudioAttributesCompatParcelizer(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return AudioAttributesCompatParcelizer(484796118, -484796115, DefaultAnalyticsCollector$$ExternalSyntheticLambda19.AudioAttributesCompatParcelizer(), new Object[]{this, topUserCompanion, sampleVideos}, DefaultAnalyticsCollector$$ExternalSyntheticLambda19.AudioAttributesCompatParcelizer(), DefaultAnalyticsCollector$$ExternalSyntheticLambda19.AudioAttributesCompatParcelizer(), DefaultAnalyticsCollector$$ExternalSyntheticLambda19.AudioAttributesCompatParcelizer());
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            return AudioAttributesCompatParcelizer(2053402944, -2053402943, DefaultAnalyticsCollector$$ExternalSyntheticLambda19.AudioAttributesCompatParcelizer(), new Object[]{this, obj}, DefaultAnalyticsCollector$$ExternalSyntheticLambda19.AudioAttributesCompatParcelizer(), DefaultAnalyticsCollector$$ExternalSyntheticLambda19.AudioAttributesCompatParcelizer(), DefaultAnalyticsCollector$$ExternalSyntheticLambda19.AudioAttributesCompatParcelizer());
        }

        private static /* synthetic */ Object read(Object[] objArr) {
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) objArr[0];
            Object obj = objArr[1];
            Object obj2 = objArr[2];
            int i = 2 % 2;
            int i2 = IconCompatParcelizer;
            int i3 = (i2 & (-28)) | ((~i2) & 27);
            int i4 = -(-((i2 & 27) << 1));
            int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
            write = i5 % 128;
            TopUserCompanion topUserCompanion = (TopUserCompanion) obj;
            SampleVideos sampleVideos = (SampleVideos) obj2;
            if (i5 % 2 != 0) {
                return AudioAttributesCompatParcelizer(484796118, -484796115, DefaultAnalyticsCollector$$ExternalSyntheticLambda19.AudioAttributesCompatParcelizer(), new Object[]{iconCompatParcelizer, topUserCompanion, sampleVideos}, DefaultAnalyticsCollector$$ExternalSyntheticLambda19.AudioAttributesCompatParcelizer(), DefaultAnalyticsCollector$$ExternalSyntheticLambda19.AudioAttributesCompatParcelizer(), DefaultAnalyticsCollector$$ExternalSyntheticLambda19.AudioAttributesCompatParcelizer());
            }
            AudioAttributesCompatParcelizer(484796118, -484796115, DefaultAnalyticsCollector$$ExternalSyntheticLambda19.AudioAttributesCompatParcelizer(), new Object[]{iconCompatParcelizer, topUserCompanion, sampleVideos}, DefaultAnalyticsCollector$$ExternalSyntheticLambda19.AudioAttributesCompatParcelizer(), DefaultAnalyticsCollector$$ExternalSyntheticLambda19.AudioAttributesCompatParcelizer(), DefaultAnalyticsCollector$$ExternalSyntheticLambda19.AudioAttributesCompatParcelizer());
            throw null;
        }

        private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) objArr[0];
            Object obj = objArr[1];
            int i = 2 % 2;
            IconCompatParcelizer iconCompatParcelizer2 = bandwidthSample.this.new IconCompatParcelizer((SampleVideos) objArr[2]);
            int i2 = write + 83;
            IconCompatParcelizer = i2 % 128;
            if (i2 % 2 == 0) {
                return iconCompatParcelizer2;
            }
            throw null;
        }

        private static /* synthetic */ Object write(Object[] objArr) {
            IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) objArr[0];
            TopUserCompanion topUserCompanion = (TopUserCompanion) objArr[1];
            SampleVideos<?> sampleVideos = (SampleVideos) objArr[2];
            int i = 2 % 2;
            int i2 = IconCompatParcelizer;
            int i3 = (-2) - ((((i2 | 116) << 1) - (i2 ^ 116)) ^ (-1));
            write = i3 % 128;
            int i4 = i3 % 2;
            IconCompatParcelizer iconCompatParcelizer2 = (IconCompatParcelizer) iconCompatParcelizer.create(topUserCompanion, sampleVideos);
            if (i4 != 0) {
                Object[] objArr2 = {iconCompatParcelizer2, getShowPopup.INSTANCE};
                return AudioAttributesCompatParcelizer(2053402944, -2053402943, DefaultAnalyticsCollector$$ExternalSyntheticLambda19.AudioAttributesCompatParcelizer(), objArr2, DefaultAnalyticsCollector$$ExternalSyntheticLambda19.AudioAttributesCompatParcelizer(), DefaultAnalyticsCollector$$ExternalSyntheticLambda19.AudioAttributesCompatParcelizer(), DefaultAnalyticsCollector$$ExternalSyntheticLambda19.AudioAttributesCompatParcelizer());
            }
            Object[] objArr3 = {iconCompatParcelizer2, getShowPopup.INSTANCE};
            AudioAttributesCompatParcelizer(2053402944, -2053402943, DefaultAnalyticsCollector$$ExternalSyntheticLambda19.AudioAttributesCompatParcelizer(), objArr3, DefaultAnalyticsCollector$$ExternalSyntheticLambda19.AudioAttributesCompatParcelizer(), DefaultAnalyticsCollector$$ExternalSyntheticLambda19.AudioAttributesCompatParcelizer(), DefaultAnalyticsCollector$$ExternalSyntheticLambda19.AudioAttributesCompatParcelizer());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        bandwidthSample bandwidthsample = (bandwidthSample) objArr[0];
        getCreatedOnDateMs getcreatedondatems = (getCreatedOnDateMs) objArr[1];
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer;
        int i3 = i2 & 103;
        int i4 = (i2 ^ 103) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        AudioAttributesImplApi26Parcelizer = i5 % 128;
        int i6 = i5 % 2;
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        buildResolutionString.IconCompatParcelizer(bandwidthsample.IconCompatParcelizer, "startPostUserSync: Initiating post-user sync");
        TopUserCompanion topUserCompanion = bandwidthsample.AudioAttributesImplBaseParcelizer;
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = bandwidthsample.new RemoteActionCompatParcelizer(getcreatedondatems, null);
        int i7 = AudioAttributesImplApi21Parcelizer;
        int i8 = i7 & 15;
        int i9 = (i8 - (~((i7 ^ 15) | i8))) - 1;
        AudioAttributesImplApi26Parcelizer = i9 % 128;
        bandwidthsample.RemoteActionCompatParcelizer = C0201setMcqCount.IconCompatParcelizer(topUserCompanion, null, null, remoteActionCompatParcelizer, i9 % 2 == 0 ? 5 : 3);
        return null;
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private static int AudioAttributesImplApi26Parcelizer = 1;
        private static int IconCompatParcelizer;
        private /* synthetic */ getCreatedOnDateMs<getShowPopup> RemoteActionCompatParcelizer;
        private Object read;
        private int write;

        public static /* synthetic */ Object IconCompatParcelizer(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
            int i7 = ~i3;
            int i8 = ~i6;
            int i9 = (~(i8 | i)) | i7;
            int i10 = (~(i7 | (~i) | i6)) | (~(i8 | i7 | i));
            int i11 = (~(i | i6)) | (~(i3 | i6));
            int i12 = i3 + i6 + i5 + ((-1520811122) * i4) + (1880343047 * i2);
            int i13 = i12 * i12;
            int i14 = (((-88056299) * i3) - 1254686720) + (875799021 * i6) + ((-481927660) * i9) + (i10 * 481927660) + (481927660 * i11) + (393871360 * i5) + ((-206831616) * i4) + (408289280 * i2) + ((-683737088) * i13);
            int i15 = ((i3 * (-660833811)) - 1995073173) + (i6 * (-660833531)) + (i9 * (-140)) + (i10 * 140) + (i11 * 140) + (i5 * (-660833671)) + (i4 * 644061726) + (i2 * (-2012083377)) + (i13 * (-1027145728));
            int i16 = i14 + (i15 * i15 * 814809088);
            return i16 != 1 ? i16 != 2 ? i16 != 3 ? IconCompatParcelizer(objArr) : write(objArr) : RemoteActionCompatParcelizer(objArr) : AudioAttributesCompatParcelizer(objArr);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0072 A[PHI: r6
          0x0072: PHI (r6v3 java.lang.Object) = (r6v1 java.lang.Object), (r6v4 java.lang.Object) binds: [B:8:0x0033, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0035 A[PHI: r7
          0x0035: PHI (r7v5 int) = (r7v4 int), (r7v22 int) binds: [B:8:0x0033, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static /* synthetic */ java.lang.Object IconCompatParcelizer(java.lang.Object[] r18) {
            /*
                Method dump skipped, instruction units count: 440
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.bandwidthSample.RemoteActionCompatParcelizer.IconCompatParcelizer(java.lang.Object[]):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        RemoteActionCompatParcelizer(getCreatedOnDateMs<getShowPopup> getcreatedondatems, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = getcreatedondatems;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            int iWrite = StandardIntegrityManagerStandardIntegrityTokenProvider.write();
            int iWrite2 = StandardIntegrityManagerStandardIntegrityTokenProvider.write();
            int iWrite3 = StandardIntegrityManagerStandardIntegrityTokenProvider.write();
            return (SampleVideos) IconCompatParcelizer(iWrite, StandardIntegrityManagerStandardIntegrityTokenProvider.write(), new Object[]{this, obj, sampleVideos}, 934516603, iWrite3, iWrite2, -934516601);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            int iWrite = StandardIntegrityManagerStandardIntegrityTokenProvider.write();
            int iWrite2 = StandardIntegrityManagerStandardIntegrityTokenProvider.write();
            int iWrite3 = StandardIntegrityManagerStandardIntegrityTokenProvider.write();
            return IconCompatParcelizer(iWrite, StandardIntegrityManagerStandardIntegrityTokenProvider.write(), new Object[]{this, topUserCompanion, sampleVideos}, 684351429, iWrite3, iWrite2, -684351426);
        }

        private Object RemoteActionCompatParcelizer(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            int iWrite = StandardIntegrityManagerStandardIntegrityTokenProvider.write();
            int iWrite2 = StandardIntegrityManagerStandardIntegrityTokenProvider.write();
            int iWrite3 = StandardIntegrityManagerStandardIntegrityTokenProvider.write();
            return IconCompatParcelizer(iWrite, StandardIntegrityManagerStandardIntegrityTokenProvider.write(), new Object[]{this, topUserCompanion, sampleVideos}, -1816569662, iWrite3, iWrite2, 1816569663);
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            int iWrite = StandardIntegrityManagerStandardIntegrityTokenProvider.write();
            int iWrite2 = StandardIntegrityManagerStandardIntegrityTokenProvider.write();
            int iWrite3 = StandardIntegrityManagerStandardIntegrityTokenProvider.write();
            return IconCompatParcelizer(iWrite, StandardIntegrityManagerStandardIntegrityTokenProvider.write(), new Object[]{this, obj}, 2102847564, iWrite3, iWrite2, -2102847564);
        }

        private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) objArr[0];
            TopUserCompanion topUserCompanion = (TopUserCompanion) objArr[1];
            SampleVideos<?> sampleVideos = (SampleVideos) objArr[2];
            int i = 2 % 2;
            int i2 = IconCompatParcelizer;
            int i3 = (i2 & 5) + (i2 | 5);
            AudioAttributesImplApi26Parcelizer = i3 % 128;
            int i4 = i3 % 2;
            RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = (RemoteActionCompatParcelizer) remoteActionCompatParcelizer.create(topUserCompanion, sampleVideos);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            int i5 = IconCompatParcelizer;
            int i6 = ((i5 | 89) << 1) - (i5 ^ 89);
            AudioAttributesImplApi26Parcelizer = i6 % 128;
            Object obj = null;
            if (i6 % 2 == 0) {
                int iWrite = StandardIntegrityManagerStandardIntegrityTokenProvider.write();
                int iWrite2 = StandardIntegrityManagerStandardIntegrityTokenProvider.write();
                int iWrite3 = StandardIntegrityManagerStandardIntegrityTokenProvider.write();
                IconCompatParcelizer(iWrite, StandardIntegrityManagerStandardIntegrityTokenProvider.write(), new Object[]{remoteActionCompatParcelizer2, getshowpopup}, 2102847564, iWrite3, iWrite2, -2102847564);
                obj.hashCode();
                throw null;
            }
            int iWrite4 = StandardIntegrityManagerStandardIntegrityTokenProvider.write();
            int iWrite5 = StandardIntegrityManagerStandardIntegrityTokenProvider.write();
            int iWrite6 = StandardIntegrityManagerStandardIntegrityTokenProvider.write();
            Object objIconCompatParcelizer = IconCompatParcelizer(iWrite4, StandardIntegrityManagerStandardIntegrityTokenProvider.write(), new Object[]{remoteActionCompatParcelizer2, getshowpopup}, 2102847564, iWrite6, iWrite5, -2102847564);
            int i7 = AudioAttributesImplApi26Parcelizer + 47;
            IconCompatParcelizer = i7 % 128;
            if (i7 % 2 == 0) {
                return objIconCompatParcelizer;
            }
            obj.hashCode();
            throw null;
        }

        private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) objArr[0];
            Object obj = objArr[1];
            int i = 2 % 2;
            RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = bandwidthSample.this.new RemoteActionCompatParcelizer(remoteActionCompatParcelizer.RemoteActionCompatParcelizer, (SampleVideos) objArr[2]);
            int i2 = IconCompatParcelizer;
            int i3 = i2 & 17;
            int i4 = i3 + ((i2 ^ 17) | i3);
            AudioAttributesImplApi26Parcelizer = i4 % 128;
            RemoteActionCompatParcelizer remoteActionCompatParcelizer3 = remoteActionCompatParcelizer2;
            if (i4 % 2 == 0) {
                int i5 = 66 / 0;
            }
            return remoteActionCompatParcelizer3;
        }

        private static /* synthetic */ Object write(Object[] objArr) {
            RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) objArr[0];
            Object obj = objArr[1];
            Object obj2 = objArr[2];
            int i = 2 % 2;
            int i2 = AudioAttributesImplApi26Parcelizer;
            int i3 = (((i2 | 70) << 1) - (i2 ^ 70)) - 1;
            IconCompatParcelizer = i3 % 128;
            int i4 = i3 % 2;
            int iWrite = StandardIntegrityManagerStandardIntegrityTokenProvider.write();
            int iWrite2 = StandardIntegrityManagerStandardIntegrityTokenProvider.write();
            Object objIconCompatParcelizer = IconCompatParcelizer(iWrite, StandardIntegrityManagerStandardIntegrityTokenProvider.write(), new Object[]{remoteActionCompatParcelizer, (TopUserCompanion) obj, (SampleVideos) obj2}, -1816569662, StandardIntegrityManagerStandardIntegrityTokenProvider.write(), iWrite2, 1816569663);
            int i5 = IconCompatParcelizer + 99;
            AudioAttributesImplApi26Parcelizer = i5 % 128;
            if (i5 % 2 != 0) {
                return objIconCompatParcelizer;
            }
            Object obj3 = null;
            obj3.hashCode();
            throw null;
        }
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        bandwidthSample bandwidthsample = (bandwidthSample) objArr[0];
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer;
        int i3 = i2 & 41;
        int i4 = (i2 | 41) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 & i5) + (i4 | i5);
        int i7 = i6 % 128;
        AudioAttributesImplApi21Parcelizer = i7;
        int i8 = i6 % 2;
        setPassingYear setpassingyear = bandwidthsample.RemoteActionCompatParcelizer;
        Object obj = null;
        if (setpassingyear != null) {
            int i9 = ((i7 & 86) + (i7 | 86)) - 1;
            AudioAttributesImplApi26Parcelizer = i9 % 128;
            if (i9 % 2 == 0) {
                setpassingyear.RemoteActionCompatParcelizer((CancellationException) null);
                bandwidthsample.RemoteActionCompatParcelizer = null;
                obj.hashCode();
                throw null;
            }
            setpassingyear.RemoteActionCompatParcelizer((CancellationException) null);
            bandwidthsample.RemoteActionCompatParcelizer = null;
            int i10 = AudioAttributesImplApi26Parcelizer;
            int i11 = i10 & 97;
            int i12 = i11 + ((i10 ^ 97) | i11);
            AudioAttributesImplApi21Parcelizer = i12 % 128;
            int i13 = i12 % 2;
        }
        int i14 = AudioAttributesImplApi21Parcelizer;
        int i15 = ((i14 & 97) - (~(-(-(i14 | 97))))) - 1;
        AudioAttributesImplApi26Parcelizer = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = 21 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        bandwidthSample bandwidthsample = (bandwidthSample) objArr[0];
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer;
        int i3 = i2 & 51;
        int i4 = ((i2 ^ 51) | i3) << 1;
        int i5 = -((i2 | 51) & (~i3));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        int i7 = i6 % 128;
        AudioAttributesImplApi21Parcelizer = i7;
        int i8 = i6 % 2;
        setPassingYear setpassingyear = bandwidthsample.AudioAttributesCompatParcelizer;
        Object obj = null;
        if (setpassingyear != null) {
            int i9 = i7 + 103;
            AudioAttributesImplApi26Parcelizer = i9 % 128;
            if (i9 % 2 == 0) {
                setpassingyear.RemoteActionCompatParcelizer((CancellationException) null);
                bandwidthsample.AudioAttributesCompatParcelizer = null;
                int i10 = 28 / 0;
            } else {
                setpassingyear.RemoteActionCompatParcelizer((CancellationException) null);
                bandwidthsample.AudioAttributesCompatParcelizer = null;
            }
        }
        int i11 = AudioAttributesImplApi26Parcelizer + 105;
        AudioAttributesImplApi21Parcelizer = i11 % 128;
        if (i11 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ AssetDataSourceAssetDataSourceException read(bandwidthSample bandwidthsample) {
        int iIconCompatParcelizer = MediaSessionConnectorCustomActionProvider.IconCompatParcelizer();
        int iIconCompatParcelizer2 = MediaSessionConnectorCustomActionProvider.IconCompatParcelizer();
        return (AssetDataSourceAssetDataSourceException) RemoteActionCompatParcelizer(-1550388649, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), iIconCompatParcelizer, 1550388650, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), new Object[]{bandwidthsample}, iIconCompatParcelizer2);
    }

    public static final /* synthetic */ transferEnded RemoteActionCompatParcelizer(bandwidthSample bandwidthsample) {
        int iIconCompatParcelizer = MediaSessionConnectorCustomActionProvider.IconCompatParcelizer();
        int iIconCompatParcelizer2 = MediaSessionConnectorCustomActionProvider.IconCompatParcelizer();
        return (transferEnded) RemoteActionCompatParcelizer(676925640, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), iIconCompatParcelizer, -676925634, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), new Object[]{bandwidthsample}, iIconCompatParcelizer2);
    }

    public static final /* synthetic */ String write(bandwidthSample bandwidthsample) {
        int iIconCompatParcelizer = MediaSessionConnectorCustomActionProvider.IconCompatParcelizer();
        int iIconCompatParcelizer2 = MediaSessionConnectorCustomActionProvider.IconCompatParcelizer();
        return (String) RemoteActionCompatParcelizer(-1963824326, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), iIconCompatParcelizer, 1963824330, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), new Object[]{bandwidthsample}, iIconCompatParcelizer2);
    }

    public final void write() {
        int iIconCompatParcelizer = MediaSessionConnectorCustomActionProvider.IconCompatParcelizer();
        int iIconCompatParcelizer2 = MediaSessionConnectorCustomActionProvider.IconCompatParcelizer();
        RemoteActionCompatParcelizer(-332918724, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), iIconCompatParcelizer, 332918729, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), new Object[]{this}, iIconCompatParcelizer2);
    }

    public final void write(getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        int iIconCompatParcelizer = MediaSessionConnectorCustomActionProvider.IconCompatParcelizer();
        int iIconCompatParcelizer2 = MediaSessionConnectorCustomActionProvider.IconCompatParcelizer();
        RemoteActionCompatParcelizer(-207938581, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), iIconCompatParcelizer, 207938584, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), new Object[]{this, getcreatedondatems}, iIconCompatParcelizer2);
    }

    public final void RemoteActionCompatParcelizer() {
        int iIconCompatParcelizer = MediaSessionConnectorCustomActionProvider.IconCompatParcelizer();
        int iIconCompatParcelizer2 = MediaSessionConnectorCustomActionProvider.IconCompatParcelizer();
        RemoteActionCompatParcelizer(-453977428, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), iIconCompatParcelizer, 453977428, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), new Object[]{this}, iIconCompatParcelizer2);
    }

    public final void read() {
        int iIconCompatParcelizer = MediaSessionConnectorCustomActionProvider.IconCompatParcelizer();
        int iIconCompatParcelizer2 = MediaSessionConnectorCustomActionProvider.IconCompatParcelizer();
        RemoteActionCompatParcelizer(-829923494, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), iIconCompatParcelizer, 829923496, MediaSessionConnectorCustomActionProvider.IconCompatParcelizer(), new Object[]{this}, iIconCompatParcelizer2);
    }
}
