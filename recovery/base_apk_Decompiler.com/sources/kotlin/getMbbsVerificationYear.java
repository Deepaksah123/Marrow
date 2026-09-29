package kotlin;

/* JADX INFO: loaded from: classes4.dex */
class getMbbsVerificationYear<T> extends isReviewAvailable<T> implements getYearOfAdmission<T> {
    public getMbbsVerificationYear(CurrentQuery currentQuery, boolean z) {
        super(currentQuery, true, z);
    }

    @Override // kotlin.getYearOfAdmission
    public final T write() {
        return (T) MediaDescriptionCompat();
    }

    private static /* synthetic */ <T> Object RemoteActionCompatParcelizer(getMbbsVerificationYear<T> getmbbsverificationyear, SampleVideos<? super T> sampleVideos) {
        Object obj = getmbbsverificationyear.read(sampleVideos);
        getYear.IconCompatParcelizer();
        return obj;
    }

    @Override // kotlin.getYearOfAdmission
    public final Object AudioAttributesCompatParcelizer(SampleVideos<? super T> sampleVideos) {
        return RemoteActionCompatParcelizer(this, sampleVideos);
    }
}
