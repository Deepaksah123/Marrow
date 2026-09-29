package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final class UserConfigDeserializer<E> extends getKycFailureCount<E> implements getShowPearlDeletionPopup<E> {
    @Override // kotlin.isReviewAvailable
    public final /* synthetic */ void AudioAttributesCompatParcelizer(getShowPopup getshowpopup) {
        onPause();
    }

    @Override // kotlin.getShowPearlDeletionPopup
    public final /* synthetic */ UserConfigSerializer onPlay() {
        return AudioAttributesImplApi26Parcelizer();
    }

    public UserConfigDeserializer(CurrentQuery currentQuery, fromCursor<E> fromcursor) {
        super(currentQuery, fromcursor);
    }

    @Override // kotlin.isReviewAvailable, kotlin.getTncConsentDate, kotlin.setPassingYear
    public final boolean read() {
        return super.read();
    }

    private void onPause() {
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().write((Throwable) null);
    }

    @Override // kotlin.isReviewAvailable
    public final void read(Throwable th, boolean z) {
        if (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().write(th) || z) {
            return;
        }
        YearItem.read(getWrite(), th);
    }
}
