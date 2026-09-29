package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0002B3\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\r2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001e\u0010\u0014\u001a\u00020\u00132\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0094@¢\u0006\u0004\b\u0014\u0010\u0015"}, d2 = {"Lo/getMinBitRateReq;", "T", "Lo/getEncryptedPlaybackVersion;", "Lo/NewNumberOtpResendRequest;", "p0", "Lo/CurrentQuery;", "p1", "", "p2", "Lo/setAddressLine2;", "p3", "<init>", "(Lo/NewNumberOtpResendRequest;Lo/CurrentQuery;ILo/setAddressLine2;)V", "Lo/getDidReBuffer;", "AudioAttributesCompatParcelizer", "(Lo/CurrentQuery;ILo/setAddressLine2;)Lo/getDidReBuffer;", "write", "()Lo/NewNumberOtpResendRequest;", "Lo/getValidationToken;", "", "IconCompatParcelizer", "(Lo/getValidationToken;Lo/SampleVideos;)Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getMinBitRateReq<T> extends getEncryptedPlaybackVersion<T, T> {
    public /* synthetic */ getMinBitRateReq(NewNumberOtpResendRequest newNumberOtpResendRequest, VideoSessionResponseBody videoSessionResponseBody, int i, setAddressLine2 setaddressline2, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(newNumberOtpResendRequest, (i2 & 2) != 0 ? VideoSessionResponseBody.RemoteActionCompatParcelizer : videoSessionResponseBody, (i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? setAddressLine2.read : setaddressline2);
    }

    public getMinBitRateReq(NewNumberOtpResendRequest<? extends T> newNumberOtpResendRequest, CurrentQuery currentQuery, int i, setAddressLine2 setaddressline2) {
        super(newNumberOtpResendRequest, currentQuery, i, setaddressline2);
    }

    @Override // kotlin.getDidReBuffer
    protected final getDidReBuffer<T> AudioAttributesCompatParcelizer(CurrentQuery p0, int p1, setAddressLine2 p2) {
        return new getMinBitRateReq(this.read, p0, p1, p2);
    }

    @Override // kotlin.getDidReBuffer
    public final NewNumberOtpResendRequest<T> write() {
        return (NewNumberOtpResendRequest<T>) this.read;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlin.getEncryptedPlaybackVersion
    protected final Object IconCompatParcelizer(getValidationToken<? super T> getvalidationtoken, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objWrite = this.read.write((getValidationToken<? super S>) getvalidationtoken, sampleVideos);
        return objWrite == getYear.IconCompatParcelizer() ? objWrite : getShowPopup.INSTANCE;
    }
}
