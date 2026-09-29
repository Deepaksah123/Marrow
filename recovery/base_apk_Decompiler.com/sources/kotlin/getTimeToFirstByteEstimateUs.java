package kotlin;

import com.marrow2.core.network.model.NetworkApiResponse;

/* JADX INFO: loaded from: classes3.dex */
public final class getTimeToFirstByteEstimateUs {
    private static int AudioAttributesCompatParcelizer = 1;
    private static int write;

    public static /* synthetic */ Object AudioAttributesCompatParcelizer(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i4;
        int i9 = (~(i7 | i8)) | i6;
        int i10 = ~(i3 | i4);
        int i11 = i9 | i10;
        int i12 = ~i6;
        int i13 = (~(i12 | i4)) | (~(i12 | i3)) | i10;
        int i14 = (~(i7 | i4)) | (~(i8 | i3));
        int i15 = i3 + i4 + i5 + (1040777104 * i) + ((-1861505373) * i2);
        int i16 = i15 * i15;
        int i17 = (i3 * (-1036928585)) + 527892480 + ((-1036928585) * i4) + ((-562525036) * i11) + (562525036 * i13) + ((-281262518) * i14) + ((-1318191104) * i5) + (1608515584 * i) + ((-1123418112) * i2) + ((-2114519040) * i16);
        int i18 = (i3 * 1703033811) + 1712528133 + (i4 * 1703033811) + (i11 * 1508) + (i13 * (-1508)) + (i14 * 754) + (i5 * 1703034565) + (i * (-2114876976)) + (i2 * 1880022383) + (i16 * (-720175104));
        return i17 + ((i18 * i18) * (-739180544)) != 1 ? read(objArr) : RemoteActionCompatParcelizer(objArr);
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        NetworkApiResponse networkApiResponse = (NetworkApiResponse) objArr[0];
        BandwidthMeterEventListener bandwidthMeterEventListener = (BandwidthMeterEventListener) objArr[1];
        ServerSideAdInsertionMediaSourceSampleStreamImpl serverSideAdInsertionMediaSourceSampleStreamImpl = (ServerSideAdInsertionMediaSourceSampleStreamImpl) objArr[2];
        String str = (String) objArr[3];
        int i = 2 % 2;
        int i2 = write;
        int i3 = i2 & 15;
        int i4 = ((i2 ^ 15) | i3) << 1;
        int i5 = -((i2 | 15) & (~i3));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        AudioAttributesCompatParcelizer = i6 % 128;
        int i7 = i6 % 2;
        int iIconCompatParcelizer = setScheme.IconCompatParcelizer();
        int iIconCompatParcelizer2 = setScheme.IconCompatParcelizer();
        boolean zBooleanValue = ((Boolean) AudioAttributesCompatParcelizer(setScheme.IconCompatParcelizer(), new Object[]{networkApiResponse, bandwidthMeterEventListener, serverSideAdInsertionMediaSourceSampleStreamImpl, str}, setScheme.IconCompatParcelizer(), -93001308, 93001309, iIconCompatParcelizer2, iIconCompatParcelizer)).booleanValue();
        int i8 = AudioAttributesCompatParcelizer;
        int i9 = i8 ^ 31;
        int i10 = -(-((i8 & 31) << 1));
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        write = i11 % 128;
        if (i11 % 2 == 0) {
            return Boolean.valueOf(zBooleanValue);
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01fc A[PHI: r6
      0x01fc: PHI (r6v6 java.lang.String) = (r6v5 java.lang.String), (r6v13 java.lang.String) binds: [B:50:0x01fa, B:47:0x01f0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0213 A[PHI: r6
      0x0213: PHI (r6v11 java.lang.String) = (r6v5 java.lang.String), (r6v13 java.lang.String) binds: [B:50:0x01fa, B:47:0x01f0] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object RemoteActionCompatParcelizer(java.lang.Object[] r27) {
        /*
            Method dump skipped, instruction units count: 854
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getTimeToFirstByteEstimateUs.RemoteActionCompatParcelizer(java.lang.Object[]):java.lang.Object");
    }

    public static final /* synthetic */ boolean write(NetworkApiResponse networkApiResponse, BandwidthMeterEventListener bandwidthMeterEventListener, ServerSideAdInsertionMediaSourceSampleStreamImpl serverSideAdInsertionMediaSourceSampleStreamImpl, String str) {
        int iIconCompatParcelizer = setScheme.IconCompatParcelizer();
        int iIconCompatParcelizer2 = setScheme.IconCompatParcelizer();
        return ((Boolean) AudioAttributesCompatParcelizer(setScheme.IconCompatParcelizer(), new Object[]{networkApiResponse, bandwidthMeterEventListener, serverSideAdInsertionMediaSourceSampleStreamImpl, str}, setScheme.IconCompatParcelizer(), 1492573908, -1492573908, iIconCompatParcelizer2, iIconCompatParcelizer)).booleanValue();
    }

    private static final <T> boolean AudioAttributesCompatParcelizer(NetworkApiResponse<T> networkApiResponse, BandwidthMeterEventListener bandwidthMeterEventListener, ServerSideAdInsertionMediaSourceSampleStreamImpl serverSideAdInsertionMediaSourceSampleStreamImpl, String str) {
        int iIconCompatParcelizer = setScheme.IconCompatParcelizer();
        int iIconCompatParcelizer2 = setScheme.IconCompatParcelizer();
        return ((Boolean) AudioAttributesCompatParcelizer(setScheme.IconCompatParcelizer(), new Object[]{networkApiResponse, bandwidthMeterEventListener, serverSideAdInsertionMediaSourceSampleStreamImpl, str}, setScheme.IconCompatParcelizer(), -93001308, 93001309, iIconCompatParcelizer2, iIconCompatParcelizer)).booleanValue();
    }
}
