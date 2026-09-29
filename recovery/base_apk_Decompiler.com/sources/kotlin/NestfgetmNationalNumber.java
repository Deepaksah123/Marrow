package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\u0010R(\u0010\u0015\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017"}, d2 = {"Lo/NestfgetmNationalNumber;", "T", "Lo/setWvVideoLevel;", "Lo/CurrentQuery;", "p0", "Lo/SampleVideos;", "p1", "<init>", "(Lo/CurrentQuery;Lo/SampleVideos;)V", "", "", "write", "(Lo/CurrentQuery;Ljava/lang/Object;)V", "", "AudioAttributesImplApi26Parcelizer", "()Z", "(Ljava/lang/Object;)V", "Ljava/lang/ThreadLocal;", "Lo/getSubscriptionExpiresOn;", "AudioAttributesCompatParcelizer", "Ljava/lang/ThreadLocal;", "read", "threadLocalIsSet", "Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NestfgetmNationalNumber<T> extends setWvVideoLevel<T> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final ThreadLocal<Pair<CurrentQuery, Object>> read;
    private volatile boolean threadLocalIsSet;

    public NestfgetmNationalNumber(CurrentQuery currentQuery, SampleVideos<? super T> sampleVideos) {
        super(currentQuery.get(NestfputmNationalNumber.INSTANCE) == null ? currentQuery.plus(NestfputmNationalNumber.INSTANCE) : currentQuery, sampleVideos);
        this.read = new ThreadLocal<>();
        if (sampleVideos.getWrite().get(getPlaybackInterval.INSTANCE) instanceof getPlatform) {
            return;
        }
        Object objRemoteActionCompatParcelizer = getBufferMultiplier.RemoteActionCompatParcelizer(currentQuery, null);
        getBufferMultiplier.AudioAttributesCompatParcelizer(currentQuery, objRemoteActionCompatParcelizer);
        write(currentQuery, objRemoteActionCompatParcelizer);
    }

    public final void write(CurrentQuery p0, Object p1) {
        this.threadLocalIsSet = true;
        this.read.set(setAction.write(p0, p1));
    }

    public final boolean AudioAttributesImplApi26Parcelizer() {
        boolean z = this.threadLocalIsSet && this.read.get() == null;
        this.read.remove();
        return !z;
    }

    @Override // kotlin.setWvVideoLevel, kotlin.isReviewAvailable
    public final void write(Object p0) {
        if (this.threadLocalIsSet) {
            Pair<CurrentQuery, Object> pair = this.read.get();
            if (pair != null) {
                getBufferMultiplier.AudioAttributesCompatParcelizer(pair.RemoteActionCompatParcelizer(), pair.read());
            }
            this.read.remove();
        }
        Object obj = setUserStartedTimestampMs.read(p0, this.write);
        SampleVideos<T> sampleVideos = this.write;
        CurrentQuery write = sampleVideos.getWrite();
        Object objRemoteActionCompatParcelizer = getBufferMultiplier.RemoteActionCompatParcelizer(write, null);
        NestfgetmNationalNumber<?> nestfgetmNationalNumber = objRemoteActionCompatParcelizer != getBufferMultiplier.read ? TestStat.read(sampleVideos, write, objRemoteActionCompatParcelizer) : null;
        try {
            this.write.resumeWith(obj);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            if (nestfgetmNationalNumber == null || nestfgetmNationalNumber.AudioAttributesImplApi26Parcelizer()) {
                getBufferMultiplier.AudioAttributesCompatParcelizer(write, objRemoteActionCompatParcelizer);
            }
        } catch (Throwable th) {
            if (nestfgetmNationalNumber == null || nestfgetmNationalNumber.AudioAttributesImplApi26Parcelizer()) {
                getBufferMultiplier.AudioAttributesCompatParcelizer(write, objRemoteActionCompatParcelizer);
            }
            throw th;
        }
    }
}
