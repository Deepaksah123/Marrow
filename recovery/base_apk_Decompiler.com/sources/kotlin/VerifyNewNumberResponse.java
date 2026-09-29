package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final /* synthetic */ class VerifyNewNumberResponse {
    public static final <T> NewNumberOtpResendRequest<T> write(NewNumberOtpResendRequest<? extends T> newNumberOtpResendRequest, int i, setAddressLine2 setaddressline2) {
        if (i < 0 && i != -2 && i != -1) {
            throw new IllegalArgumentException("Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ".concat(String.valueOf(i)).toString());
        }
        if (i == -1 && setaddressline2 != setAddressLine2.read) {
            throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
        }
        if (i == -1) {
            setaddressline2 = setAddressLine2.AudioAttributesCompatParcelizer;
            i = 0;
        }
        int i2 = i;
        setAddressLine2 setaddressline22 = setaddressline2;
        if (newNumberOtpResendRequest instanceof getPbConfig) {
            return ((getPbConfig) newNumberOtpResendRequest).write(VideoSessionResponseBody.RemoteActionCompatParcelizer, i2, setaddressline22);
        }
        return new getMinBitRateReq(newNumberOtpResendRequest, null, i2, setaddressline22, 2, null);
    }

    public static final <T> NewNumberOtpResendRequest<T> read(NewNumberOtpResendRequest<? extends T> newNumberOtpResendRequest) {
        return VerifyNewNumberRequest.read(newNumberOtpResendRequest, -1);
    }
}
