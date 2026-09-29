package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public class setWvVideoLevel<T> extends isReviewAvailable<T> implements getNextQuery {
    public final SampleVideos<T> write;

    @Override // kotlin.getTncConsentDate
    public final boolean be_() {
        return true;
    }

    @Override // kotlin.getNextQuery
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public setWvVideoLevel(CurrentQuery currentQuery, SampleVideos<? super T> sampleVideos) {
        super(currentQuery, true, true);
        this.write = sampleVideos;
    }

    @Override // kotlin.getNextQuery
    public final getNextQuery getCallerFrame() {
        SampleVideos<T> sampleVideos = this.write;
        if (sampleVideos instanceof getNextQuery) {
            return (getNextQuery) sampleVideos;
        }
        return null;
    }

    @Override // kotlin.getTncConsentDate
    public void b_(Object obj) {
        setEncryptedPlaybackVersion.read(getYear.IconCompatParcelizer(this.write), setUserStartedTimestampMs.read(obj, this.write));
    }

    @Override // kotlin.isReviewAvailable
    public void write(Object obj) {
        SampleVideos<T> sampleVideos = this.write;
        sampleVideos.resumeWith(setUserStartedTimestampMs.read(obj, sampleVideos));
    }
}
