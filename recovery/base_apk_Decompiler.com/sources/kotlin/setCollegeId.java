package kotlin;

import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import in.juspay.hyper.constants.LogCategory;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0002J\b\u0010\r\u001a\u00020\fH\u0002J\u0012\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u0012\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\u000f\u0010\u0013\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0002\b\u0014R\t\u0010\t\u001a\u00020\nX\u0082\u0004¨\u0006\u0015"}, d2 = {"Lkotlinx/coroutines/DispatchedCoroutine;", "T", "Lkotlinx/coroutines/internal/ScopeCoroutine;", LogCategory.CONTEXT, "Lkotlin/coroutines/CoroutineContext;", "uCont", "Lkotlin/coroutines/Continuation;", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "_decision", "Lkotlinx/atomicfu/AtomicInt;", "trySuspend", "", "tryResume", "afterCompletion", "", NotesDispatchAddressRequestKt.KEY_STATE, "", "afterResume", "getResult", "getResult$kotlinx_coroutines_core", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setCollegeId<T> extends setWvVideoLevel<T> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater RemoteActionCompatParcelizer = AtomicIntegerFieldUpdater.newUpdater(setCollegeId.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public setCollegeId(CurrentQuery currentQuery, SampleVideos<? super T> sampleVideos) {
        super(currentQuery, sampleVideos);
    }

    private final boolean onPlayFromMediaId() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = RemoteActionCompatParcelizer;
        do {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!RemoteActionCompatParcelizer.compareAndSet(this, 0, 1));
        return true;
    }

    private final boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = RemoteActionCompatParcelizer;
        do {
            int i = atomicIntegerFieldUpdater.get(this);
            if (i != 0) {
                if (i == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!RemoteActionCompatParcelizer.compareAndSet(this, 0, 2));
        return true;
    }

    @Override // kotlin.setWvVideoLevel, kotlin.getTncConsentDate
    public final void b_(Object obj) {
        write(obj);
    }

    @Override // kotlin.setWvVideoLevel, kotlin.isReviewAvailable
    public final void write(Object obj) {
        if (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
            return;
        }
        setEncryptedPlaybackVersion.read(getYear.IconCompatParcelizer(this.write), setUserStartedTimestampMs.read(obj, this.write));
    }

    public final Object AudioAttributesImplApi26Parcelizer() {
        if (onPlayFromMediaId()) {
            return getYear.IconCompatParcelizer();
        }
        Object objIconCompatParcelizer = isEmailVerified.IconCompatParcelizer(handleMediaPlayPauseIfPendingOnHandler());
        if (objIconCompatParcelizer instanceof setUserSubmittedTimestampMs) {
            throw ((setUserSubmittedTimestampMs) objIconCompatParcelizer).RemoteActionCompatParcelizer;
        }
        return objIconCompatParcelizer;
    }
}
