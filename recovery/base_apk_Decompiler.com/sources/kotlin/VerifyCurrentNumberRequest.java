package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0012\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002BO\u0012(\u0010\b\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0013\u001a\u00020\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0094@¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R6\u0010\u0018\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lo/VerifyCurrentNumberRequest;", "T", "Lo/getDidReBuffer;", "Lkotlin/Function2;", "Lo/getShowPearlDeletionPopup;", "Lo/SampleVideos;", "", "", "p0", "Lo/CurrentQuery;", "p1", "", "p2", "Lo/setAddressLine2;", "p3", "<init>", "(Lo/MagicModuleSubmissionRequestBody;Lo/CurrentQuery;ILo/setAddressLine2;)V", "AudioAttributesCompatParcelizer", "(Lo/CurrentQuery;ILo/setAddressLine2;)Lo/getDidReBuffer;", "read", "(Lo/getShowPearlDeletionPopup;Lo/SampleVideos;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "write", "Lo/MagicModuleSubmissionRequestBody;"}, k = 1, mv = {2, 0, 0}, xi = 48)
class VerifyCurrentNumberRequest<T> extends getDidReBuffer<T> {
    private final MagicModuleSubmissionRequestBody<getShowPearlDeletionPopup<? super T>, SampleVideos<? super getShowPopup>, Object> write;

    /* JADX WARN: Multi-variable type inference failed */
    public VerifyCurrentNumberRequest(MagicModuleSubmissionRequestBody<? super getShowPearlDeletionPopup<? super T>, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody, CurrentQuery currentQuery, int i, setAddressLine2 setaddressline2) {
        super(currentQuery, i, setaddressline2);
        this.write = magicModuleSubmissionRequestBody;
    }

    @Override // kotlin.getDidReBuffer
    public getDidReBuffer<T> AudioAttributesCompatParcelizer(CurrentQuery p0, int p1, setAddressLine2 p2) {
        return new VerifyCurrentNumberRequest(this.write, p0, p1, p2);
    }

    private static /* synthetic */ <T> Object RemoteActionCompatParcelizer(VerifyCurrentNumberRequest<T> verifyCurrentNumberRequest, getShowPearlDeletionPopup<? super T> getshowpearldeletionpopup, SampleVideos<? super getShowPopup> sampleVideos) {
        Object objInvoke = ((VerifyCurrentNumberRequest) verifyCurrentNumberRequest).write.invoke(getshowpearldeletionpopup, sampleVideos);
        return objInvoke == getYear.IconCompatParcelizer() ? objInvoke : getShowPopup.INSTANCE;
    }

    @Override // kotlin.getDidReBuffer
    public String toString() {
        StringBuilder sb = new StringBuilder("block[");
        sb.append(this.write);
        sb.append("] -> ");
        sb.append(super.toString());
        return sb.toString();
    }

    @Override // kotlin.getDidReBuffer
    public Object read(getShowPearlDeletionPopup<? super T> getshowpearldeletionpopup, SampleVideos<? super getShowPopup> sampleVideos) {
        return RemoteActionCompatParcelizer(this, getshowpearldeletionpopup, sampleVideos);
    }
}
