package kotlin;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u0018\u001a\u00020\u0019J\u000e\u0010\u001a\u001a\u00020\u0016H\u0086@¢\u0006\u0002\u0010\u001bJ\u000e\u0010\u001c\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u0010\u001bJ\u0016\u0010\u001a\u001a\u00020\u00162\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00160\u001eH\u0005Jb\u0010\u001a\u001a\u00020\u0016\"\u0004\b\u0000\u0010\u001f2\u0006\u0010\u001d\u001a\u0002H\u001f2!\u0010 \u001a\u001d\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00190!2!\u0010$\u001a\u001d\u0012\u0013\u0012\u0011H\u001f¢\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u00160!H\u0083\b¢\u0006\u0002\u0010%J\u001e\u0010&\u001a\u00020\u00162\n\u0010'\u001a\u0006\u0012\u0002\b\u00030(2\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u0004J\b\u0010*\u001a\u00020\u0003H\u0002J\u0006\u0010+\u001a\u00020\u0016J\b\u0010,\u001a\u00020\u0016H\u0002J\u0010\u0010-\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020.H\u0002J\b\u0010/\u001a\u00020\u0019H\u0002J\f\u00100\u001a\u00020\u0019*\u00020\u0001H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004R\t\u0010\n\u001a\u00020\u000bX\u0082\u0004R\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004R\t\u0010\r\u001a\u00020\u000bX\u0082\u0004R\t\u0010\u000e\u001a\u00020\u000fX\u0082\u0004R\u0011\u0010\u0010\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R&\u0010\u0013\u001a\u001a\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00160\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Lkotlinx/coroutines/sync/SemaphoreAndMutexImpl;", "", "permits", "", "acquiredPermits", "<init>", "(II)V", TtmlNode.TAG_HEAD, "Lkotlinx/atomicfu/AtomicRef;", "Lkotlinx/coroutines/sync/SemaphoreSegment;", "deqIdx", "Lkotlinx/atomicfu/AtomicLong;", "tail", "enqIdx", "_availablePermits", "Lkotlinx/atomicfu/AtomicInt;", "availablePermits", "getAvailablePermits", "()I", "onCancellationRelease", "Lkotlin/Function3;", "", "", "Lkotlin/coroutines/CoroutineContext;", "tryAcquire", "", "acquire", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "acquireSlowPath", "waiter", "Lkotlinx/coroutines/CancellableContinuation;", "W", "suspend", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "onAcquired", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "onAcquireRegFunction", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "ignoredParam", "decPermits", "release", "coerceAvailablePermitsAtMaximum", "addAcquireToQueue", "Lkotlinx/coroutines/Waiter;", "tryResumeNextFromQueue", "tryResumeAcquire", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class setDownloadStartedTimeMs {
    private final getModuleData<Throwable, getShowPopup, CurrentQuery, getShowPopup> AudioAttributesImplBaseParcelizer;
    private final int MediaBrowserCompatItemReceiver;
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;
    private static final /* synthetic */ AtomicReferenceFieldUpdater RemoteActionCompatParcelizer = AtomicReferenceFieldUpdater.newUpdater(setDownloadStartedTimeMs.class, Object.class, "head$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater AudioAttributesCompatParcelizer = AtomicLongFieldUpdater.newUpdater(setDownloadStartedTimeMs.class, "deqIdx$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater read = AtomicReferenceFieldUpdater.newUpdater(setDownloadStartedTimeMs.class, Object.class, "tail$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater write = AtomicLongFieldUpdater.newUpdater(setDownloadStartedTimeMs.class, "enqIdx$volatile");
    private static final /* synthetic */ AtomicIntegerFieldUpdater IconCompatParcelizer = AtomicIntegerFieldUpdater.newUpdater(setDownloadStartedTimeMs.class, "_availablePermits$volatile");

    public setDownloadStartedTimeMs(int i, int i2) {
        this.MediaBrowserCompatItemReceiver = i;
        if (i <= 0) {
            throw new IllegalArgumentException("Semaphore should have at least 1 permit, but had ".concat(String.valueOf(i)).toString());
        }
        if (i2 < 0 || i2 > i) {
            throw new IllegalArgumentException("The number of acquired permits should be in 0..".concat(String.valueOf(i)).toString());
        }
        setLastUpdatedMs setlastupdatedms = new setLastUpdatedMs(0L, null, 2);
        this.head$volatile = setlastupdatedms;
        this.tail$volatile = setlastupdatedms;
        this._availablePermits$volatile = i - i2;
        this.AudioAttributesImplBaseParcelizer = new getModuleData() { // from class: o.setPixelRate
            @Override // kotlin.getModuleData
            public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                return setDownloadStartedTimeMs.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
            }
        };
    }

    public final int write() {
        return Math.max(IconCompatParcelizer.get(this), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesCompatParcelizer(setDownloadStartedTimeMs setdownloadstartedtimems) {
        setdownloadstartedtimems.AudioAttributesCompatParcelizer();
        return getShowPopup.INSTANCE;
    }

    public final boolean IconCompatParcelizer() {
        while (true) {
            int i = IconCompatParcelizer.get(this);
            if (i > this.MediaBrowserCompatItemReceiver) {
                RemoteActionCompatParcelizer();
            } else {
                if (i <= 0) {
                    return false;
                }
                if (IconCompatParcelizer.compareAndSet(this, i, i - 1)) {
                    return true;
                }
            }
        }
    }

    public final Object read(SampleVideos<? super getShowPopup> sampleVideos) {
        if (read() > 0) {
            return getShowPopup.INSTANCE;
        }
        Object objWrite = write(sampleVideos);
        return objWrite == getYear.IconCompatParcelizer() ? objWrite : getShowPopup.INSTANCE;
    }

    private final int read() {
        int andDecrement;
        do {
            andDecrement = IconCompatParcelizer.getAndDecrement(this);
        } while (andDecrement > this.MediaBrowserCompatItemReceiver);
        return andDecrement;
    }

    public final void AudioAttributesCompatParcelizer() {
        do {
            int andIncrement = IconCompatParcelizer.getAndIncrement(this);
            if (andIncrement >= this.MediaBrowserCompatItemReceiver) {
                RemoteActionCompatParcelizer();
                StringBuilder sb = new StringBuilder("The number of released permits cannot be greater than ");
                sb.append(this.MediaBrowserCompatItemReceiver);
                throw new IllegalStateException(sb.toString().toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!RatingCompat());
    }

    private final void RemoteActionCompatParcelizer() {
        int i;
        do {
            i = IconCompatParcelizer.get(this);
            if (i <= this.MediaBrowserCompatItemReceiver) {
                return;
            }
        } while (!IconCompatParcelizer.compareAndSet(this, i, this.MediaBrowserCompatItemReceiver));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean RemoteActionCompatParcelizer(setVerified setverified) {
        Object obj;
        setLastUpdatedMs setlastupdatedms = (setLastUpdatedMs) read.get(this);
        long andIncrement = write.getAndIncrement(this);
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = RemoteActionCompatParcelizer.IconCompatParcelizer;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = read;
        long j = andIncrement / ((long) setPytCount.read);
        loop0: while (true) {
            obj = VideoAnalyticInterimSession.read(setlastupdatedms, j, remoteActionCompatParcelizer);
            if (setWidevineMode.IconCompatParcelizer(obj)) {
                break;
            }
            setTotalFramesDropped settotalframesdroppedRemoteActionCompatParcelizer = setWidevineMode.RemoteActionCompatParcelizer(obj);
            while (true) {
                setTotalFramesDropped settotalframesdropped = (setTotalFramesDropped) atomicReferenceFieldUpdater.get(this);
                if (settotalframesdropped.AudioAttributesCompatParcelizer >= settotalframesdroppedRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer) {
                    break loop0;
                }
                if (settotalframesdroppedRemoteActionCompatParcelizer.MediaBrowserCompatMediaItem()) {
                    if (DateDeserializersDateBasedDeserializer.IconCompatParcelizer(atomicReferenceFieldUpdater, this, settotalframesdropped, settotalframesdroppedRemoteActionCompatParcelizer)) {
                        if (settotalframesdropped.AudioAttributesImplApi21Parcelizer()) {
                            settotalframesdropped.AudioAttributesImplBaseParcelizer();
                        }
                    } else if (settotalframesdroppedRemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer()) {
                        settotalframesdroppedRemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer();
                    }
                }
            }
        }
        setLastUpdatedMs setlastupdatedms2 = (setLastUpdatedMs) setWidevineMode.RemoteActionCompatParcelizer(obj);
        int i = (int) (andIncrement % ((long) setPytCount.read));
        if (!SefReader.RemoteActionCompatParcelizer(setlastupdatedms2.write(), i, null, setverified)) {
            if (SefReader.RemoteActionCompatParcelizer(setlastupdatedms2.write(), i, setPytCount.write, setPytCount.MediaBrowserCompatItemReceiver)) {
                if (setverified instanceof setStateRank) {
                    toMagicModuleMetaRepoModel.read(setverified, "");
                    ((setStateRank) setverified).read(getShowPopup.INSTANCE, this.AudioAttributesImplBaseParcelizer);
                } else if (setverified instanceof getDownloadVersion) {
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                } else {
                    throw new IllegalStateException("unexpected: ".concat(String.valueOf(setverified)).toString());
                }
                return true;
            }
            getCollegeId.write();
            return false;
        }
        setverified.write(setlastupdatedms2, i);
        return true;
    }

    final /* synthetic */ class RemoteActionCompatParcelizer extends MagicModuleRepositoryImpl_Factory implements MagicModuleSubmissionRequestBody<Long, setLastUpdatedMs, setLastUpdatedMs> {
        public static final RemoteActionCompatParcelizer IconCompatParcelizer = new RemoteActionCompatParcelizer();

        private static setLastUpdatedMs IconCompatParcelizer(long j, setLastUpdatedMs setlastupdatedms) {
            return setPytCount.write(j, setlastupdatedms);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ setLastUpdatedMs invoke(Long l, setLastUpdatedMs setlastupdatedms) {
            return IconCompatParcelizer(l.longValue(), setlastupdatedms);
        }

        RemoteActionCompatParcelizer() {
            super(2, setPytCount.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }
    }

    private final boolean RatingCompat() {
        Object obj;
        setLastUpdatedMs setlastupdatedms = (setLastUpdatedMs) RemoteActionCompatParcelizer.get(this);
        long andIncrement = AudioAttributesCompatParcelizer.getAndIncrement(this);
        long j = andIncrement / ((long) setPytCount.read);
        IconCompatParcelizer iconCompatParcelizer = IconCompatParcelizer.RemoteActionCompatParcelizer;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = RemoteActionCompatParcelizer;
        loop0: while (true) {
            obj = VideoAnalyticInterimSession.read(setlastupdatedms, j, iconCompatParcelizer);
            if (setWidevineMode.IconCompatParcelizer(obj)) {
                break;
            }
            setTotalFramesDropped settotalframesdroppedRemoteActionCompatParcelizer = setWidevineMode.RemoteActionCompatParcelizer(obj);
            while (true) {
                setTotalFramesDropped settotalframesdropped = (setTotalFramesDropped) atomicReferenceFieldUpdater.get(this);
                if (settotalframesdropped.AudioAttributesCompatParcelizer >= settotalframesdroppedRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer) {
                    break loop0;
                }
                if (settotalframesdroppedRemoteActionCompatParcelizer.MediaBrowserCompatMediaItem()) {
                    if (DateDeserializersDateBasedDeserializer.IconCompatParcelizer(atomicReferenceFieldUpdater, this, settotalframesdropped, settotalframesdroppedRemoteActionCompatParcelizer)) {
                        if (settotalframesdropped.AudioAttributesImplApi21Parcelizer()) {
                            settotalframesdropped.AudioAttributesImplBaseParcelizer();
                        }
                    } else if (settotalframesdroppedRemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer()) {
                        settotalframesdroppedRemoteActionCompatParcelizer.AudioAttributesImplBaseParcelizer();
                    }
                }
            }
        }
        setLastUpdatedMs setlastupdatedms2 = (setLastUpdatedMs) setWidevineMode.RemoteActionCompatParcelizer(obj);
        setlastupdatedms2.AudioAttributesCompatParcelizer();
        if (setlastupdatedms2.AudioAttributesCompatParcelizer > j) {
            return false;
        }
        int i = (int) (andIncrement % ((long) setPytCount.read));
        Object andSet = setlastupdatedms2.write().getAndSet(i, setPytCount.write);
        if (andSet == null) {
            int i2 = setPytCount.IconCompatParcelizer;
            for (int i3 = 0; i3 < i2; i3++) {
                if (setlastupdatedms2.write().get(i) == setPytCount.MediaBrowserCompatItemReceiver) {
                    return true;
                }
            }
            return !SefReader.RemoteActionCompatParcelizer(setlastupdatedms2.write(), i, setPytCount.write, setPytCount.AudioAttributesCompatParcelizer);
        }
        if (andSet == setPytCount.RemoteActionCompatParcelizer) {
            return false;
        }
        return AudioAttributesCompatParcelizer(andSet);
    }

    final /* synthetic */ class IconCompatParcelizer extends MagicModuleRepositoryImpl_Factory implements MagicModuleSubmissionRequestBody<Long, setLastUpdatedMs, setLastUpdatedMs> {
        public static final IconCompatParcelizer RemoteActionCompatParcelizer = new IconCompatParcelizer();

        private static setLastUpdatedMs IconCompatParcelizer(long j, setLastUpdatedMs setlastupdatedms) {
            return setPytCount.write(j, setlastupdatedms);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ setLastUpdatedMs invoke(Long l, setLastUpdatedMs setlastupdatedms) {
            return IconCompatParcelizer(l.longValue(), setlastupdatedms);
        }

        IconCompatParcelizer() {
            super(2, setPytCount.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }
    }

    private final boolean AudioAttributesCompatParcelizer(Object obj) {
        if (obj instanceof setStateRank) {
            toMagicModuleMetaRepoModel.read(obj, "");
            setStateRank setstaterank = (setStateRank) obj;
            Object obj2 = setstaterank.read(getShowPopup.INSTANCE, null, this.AudioAttributesImplBaseParcelizer);
            if (obj2 == null) {
                return false;
            }
            setstaterank.write(obj2);
            return true;
        }
        if (obj instanceof getDownloadVersion) {
            return ((getDownloadVersion) obj).IconCompatParcelizer(this, getShowPopup.INSTANCE);
        }
        throw new IllegalStateException("unexpected: ".concat(String.valueOf(obj)).toString());
    }

    private final Object write(SampleVideos<? super getShowPopup> sampleVideos) {
        setStateSolvedCount setstatesolvedcountIconCompatParcelizer = setStatePercentile.IconCompatParcelizer(getYear.IconCompatParcelizer(sampleVideos));
        try {
            if (!RemoteActionCompatParcelizer(setstatesolvedcountIconCompatParcelizer)) {
                IconCompatParcelizer(setstatesolvedcountIconCompatParcelizer);
            }
            Object objAudioAttributesCompatParcelizer = setstatesolvedcountIconCompatParcelizer.AudioAttributesCompatParcelizer();
            if (objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer()) {
                getAnsweredMcqCount.write(sampleVideos);
            }
            return objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer() ? objAudioAttributesCompatParcelizer : getShowPopup.INSTANCE;
        } catch (Throwable th) {
            setstatesolvedcountIconCompatParcelizer.AudioAttributesImplBaseParcelizer();
            throw th;
        }
    }

    protected final void IconCompatParcelizer(setStateRank<? super getShowPopup> setstaterank) {
        while (read() <= 0) {
            toMagicModuleMetaRepoModel.read(setstaterank, "");
            if (RemoteActionCompatParcelizer((setVerified) setstaterank)) {
                return;
            }
        }
        setstaterank.read(getShowPopup.INSTANCE, this.AudioAttributesImplBaseParcelizer);
    }
}
