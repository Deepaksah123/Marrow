package kotlin;

import kotlin.getFinalData;

/* JADX INFO: loaded from: classes2.dex */
public final class base64ToBase64Url implements parseAc3AnnexFFormat {
    private boolean RemoteActionCompatParcelizer;
    private DefaultAudioTrackBufferSizeProvider read;
    private DefaultAudioTrackBufferSizeProvider write;

    public base64ToBase64Url(DefaultAudioTrackBufferSizeProvider defaultAudioTrackBufferSizeProvider, DefaultAudioTrackBufferSizeProvider defaultAudioTrackBufferSizeProvider2, boolean z) {
        this.write = defaultAudioTrackBufferSizeProvider;
        this.read = defaultAudioTrackBufferSizeProvider2;
        this.RemoteActionCompatParcelizer = z;
    }

    @Override // kotlin.parseAc3AnnexFFormat
    public final byte[] RemoteActionCompatParcelizer(byte[] bArr) {
        Pair pairWrite;
        byte b = bArr[0];
        byte bIconCompatParcelizer = setClientAuthToken.IconCompatParcelizer((byte) setCustomerEmail.read(setCustomerEmail.read(setClientAuthToken.IconCompatParcelizer(bArr[1]) & 255) - setCustomerEmail.read(setClientAuthToken.IconCompatParcelizer(b) & 255)));
        int iIconCompatParcelizer = setClientAuthToken.IconCompatParcelizer((byte) setCustomerEmail.read(setCustomerEmail.read(setClientAuthToken.IconCompatParcelizer(bArr[2]) & 255) - setCustomerEmail.read(setClientAuthToken.IconCompatParcelizer(b) & 255))) & 255;
        if ((bIconCompatParcelizer & 255) == 3 && IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new Integer[]{7, 10}).contains(Integer.valueOf(iIconCompatParcelizer))) {
            int iIconCompatParcelizer2 = setClientAuthToken.IconCompatParcelizer((byte) setCustomerEmail.read(setCustomerEmail.read(setClientAuthToken.IconCompatParcelizer(bArr[3]) & 255) - setCustomerEmail.read(setClientAuthToken.IconCompatParcelizer(b) & 255))) & 255;
            int i = iIconCompatParcelizer2 + 11;
            byte[] bArrWrite = getOrderDetails.write(bArr, iIconCompatParcelizer2 + 4, i);
            int length = bArr.length - i;
            byte[] bArr2 = new byte[length];
            int length2 = bArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                bArr2[i2] = (byte) (bArr[(length2 - length) + i2] ^ bArrWrite[i2 % 7]);
            }
            pairWrite = setAction.write(bArr2, Boolean.valueOf(iIconCompatParcelizer == 10));
        } else {
            pairWrite = setAction.write(new byte[0], Boolean.FALSE);
        }
        byte[] bArr3 = (byte[]) pairWrite.RemoteActionCompatParcelizer();
        return (bArr3.length == 0 || !((Boolean) pairWrite.read()).booleanValue()) ? bArr3 : (byte[]) setForHeaderData.read(onProcessedStreamChange.read(new throwExceptionIfDeadlineIsReached(bArr3)), new byte[0]);
    }

    @Override // kotlin.parseAc3AnnexFFormat
    public final byte[] read(byte[] bArr) {
        if (this.RemoteActionCompatParcelizer) {
            bArr = (byte[]) setForHeaderData.read(onProcessedStreamChange.read(new createAudioTrackV21(bArr)));
        }
        if (bArr == null) {
            return new byte[0];
        }
        boolean z = this.RemoteActionCompatParcelizer;
        getFinalData.Companion companion = getFinalData.INSTANCE;
        byte bIconCompatParcelizer = (byte) getLow.IconCompatParcelizer(companion);
        int iIconCompatParcelizer = ((byte) getLow.IconCompatParcelizer(companion)) % 128;
        int i = iIconCompatParcelizer + 4;
        byte[] bArr2 = new byte[iIconCompatParcelizer + 11 + bArr.length];
        bArr2[0] = bIconCompatParcelizer;
        bArr2[1] = setClientAuthToken.IconCompatParcelizer((byte) setCustomerEmail.read(setCustomerEmail.read(setClientAuthToken.IconCompatParcelizer((byte) 3) & 255) + setCustomerEmail.read(setClientAuthToken.IconCompatParcelizer(bIconCompatParcelizer) & 255)));
        byte b = z ? (byte) 10 : (byte) 7;
        bArr2[2] = setClientAuthToken.IconCompatParcelizer((byte) setCustomerEmail.read(setCustomerEmail.read(setClientAuthToken.IconCompatParcelizer(b) & 255) + setCustomerEmail.read(setClientAuthToken.IconCompatParcelizer(bIconCompatParcelizer) & 255)));
        bArr2[3] = setClientAuthToken.IconCompatParcelizer((byte) setCustomerEmail.read(setCustomerEmail.read(setClientAuthToken.IconCompatParcelizer((byte) iIconCompatParcelizer) & 255) + setCustomerEmail.read(setClientAuthToken.IconCompatParcelizer(bIconCompatParcelizer) & 255)));
        byte[] bArrWrite = companion.write(iIconCompatParcelizer);
        int length = bArrWrite.length;
        for (int i2 = 0; i2 < length; i2++) {
            bArr2[i2 + 4] = bArrWrite[i2];
        }
        byte[] bArrWrite2 = getFinalData.INSTANCE.write(7);
        for (int i3 = 0; i3 < 7; i3++) {
            bArr2[i + i3] = bArrWrite2[i3];
        }
        int length2 = bArrWrite2.length;
        int length3 = bArr.length;
        for (int i4 = 0; i4 < length3; i4++) {
            bArr2[i + length2 + i4] = (byte) (bArrWrite2[i4 % 7] ^ bArr[i4]);
        }
        return bArr2;
    }
}
