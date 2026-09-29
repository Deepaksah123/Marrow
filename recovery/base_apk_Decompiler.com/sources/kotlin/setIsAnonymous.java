package kotlin;

import java.util.concurrent.locks.LockSupport;

/* JADX INFO: loaded from: classes4.dex */
final class setIsAnonymous<T> extends isReviewAvailable<T> {
    private final CollegeJsonParser RemoteActionCompatParcelizer;
    private final Thread write;

    @Override // kotlin.getTncConsentDate
    protected final boolean be_() {
        return true;
    }

    public setIsAnonymous(CurrentQuery currentQuery, Thread thread, CollegeJsonParser collegeJsonParser) {
        super(currentQuery, true, true);
        this.write = thread;
        this.RemoteActionCompatParcelizer = collegeJsonParser;
    }

    @Override // kotlin.getTncConsentDate
    protected final void b_(Object obj) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(Thread.currentThread(), this.write)) {
            return;
        }
        LockSupport.unpark(this.write);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final T AudioAttributesImplBaseParcelizer() throws Throwable {
        CollegeJsonParser collegeJsonParser = this.RemoteActionCompatParcelizer;
        if (collegeJsonParser != null) {
            collegeJsonParser.read(false);
        }
        while (!Thread.interrupted()) {
            try {
                CollegeJsonParser collegeJsonParser2 = this.RemoteActionCompatParcelizer;
                long jAudioAttributesImplBaseParcelizer = collegeJsonParser2 != null ? collegeJsonParser2.AudioAttributesImplBaseParcelizer() : Long.MAX_VALUE;
                if (!MediaBrowserCompatMediaItem()) {
                    LockSupport.parkNanos(this, jAudioAttributesImplBaseParcelizer);
                } else {
                    T t = (T) isEmailVerified.IconCompatParcelizer(handleMediaPlayPauseIfPendingOnHandler());
                    setUserSubmittedTimestampMs setusersubmittedtimestampms = t instanceof setUserSubmittedTimestampMs ? (setUserSubmittedTimestampMs) t : null;
                    if (setusersubmittedtimestampms == null) {
                        return t;
                    }
                    throw setusersubmittedtimestampms.RemoteActionCompatParcelizer;
                }
            } finally {
                CollegeJsonParser collegeJsonParser3 = this.RemoteActionCompatParcelizer;
                if (collegeJsonParser3 != null) {
                    collegeJsonParser3.AudioAttributesCompatParcelizer(false);
                }
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        RemoteActionCompatParcelizer((Throwable) interruptedException);
        throw interruptedException;
    }
}
