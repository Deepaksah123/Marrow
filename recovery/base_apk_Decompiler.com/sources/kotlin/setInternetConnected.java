package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import in.juspay.hyper.constants.LogCategory;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00060\u0004j\u0002`\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0005B\u001d\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u0012\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0013H\u0016¢\u0006\u0002\u0010\u0015J\r\u0010\u001d\u001a\u00020\u001eH\u0000¢\u0006\u0002\b\u001fJ\r\u0010 \u001a\u00020!H\u0000¢\u0006\u0002\b\"J\r\u0010#\u001a\u00020!H\u0000¢\u0006\u0002\b$J\u0015\u0010%\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001aH\u0000¢\u0006\u0002\b&J\u001b\u0010'\u001a\u0004\u0018\u00010(2\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030)H\u0000¢\u0006\u0002\b*J\u0015\u0010+\u001a\u00020\u001e2\u0006\u0010,\u001a\u00020(H\u0000¢\u0006\u0002\b-J\u000f\u0010.\u001a\u0004\u0018\u00010\fH\u0010¢\u0006\u0002\b/J\u001b\u00103\u001a\u00020!2\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u000005H\u0016¢\u0006\u0002\u00106J\u001e\u00107\u001a\u00020!2\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u000005H\u0080\b¢\u0006\u0004\b8\u00106J\u0018\u00109\u001a\u00020\u001e2\b\u0010:\u001a\u0004\u0018\u00010\fH\u0080\b¢\u0006\u0002\b;J\u001e\u0010<\u001a\u00020!2\f\u00104\u001a\b\u0012\u0004\u0012\u00028\u000005H\u0080\b¢\u0006\u0004\b=\u00106J\u001f\u0010>\u001a\u00020!2\u0006\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00028\u0000H\u0000¢\u0006\u0004\bB\u0010CJ\b\u0010D\u001a\u00020EH\u0016R\u0010\u0010\u0006\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0010\u0010\u0016\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u0018X\u0082\u0004R\u001a\u0010\u0019\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001a\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\t\u0010?\u001a\u00020@X\u0096\u0005¨\u0006F"}, d2 = {"Lkotlinx/coroutines/internal/DispatchedContinuation;", "T", "Lkotlinx/coroutines/DispatchedTask;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlin/coroutines/Continuation;", "dispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "continuation", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlin/coroutines/Continuation;)V", "_state", "", "get_state$kotlinx_coroutines_core$annotations", "()V", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "getStackTraceElement", "Lkotlinx/coroutines/internal/StackTraceElement;", "Ljava/lang/StackTraceElement;", "()Ljava/lang/StackTraceElement;", "countOrElement", "_reusableCancellableContinuation", "Lkotlinx/atomicfu/AtomicRef;", "reusableCancellableContinuation", "Lkotlinx/coroutines/CancellableContinuationImpl;", "getReusableCancellableContinuation", "()Lkotlinx/coroutines/CancellableContinuationImpl;", "isReusable", "", "isReusable$kotlinx_coroutines_core", "awaitReusability", "", "awaitReusability$kotlinx_coroutines_core", "release", "release$kotlinx_coroutines_core", "claimReusableCancellableContinuation", "claimReusableCancellableContinuation$kotlinx_coroutines_core", "tryReleaseClaimedContinuation", "", "Lkotlinx/coroutines/CancellableContinuation;", "tryReleaseClaimedContinuation$kotlinx_coroutines_core", "postponeCancellation", "cause", "postponeCancellation$kotlinx_coroutines_core", "takeState", "takeState$kotlinx_coroutines_core", "delegate", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "resumeWith", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "resumeCancellableWith", "resumeCancellableWith$kotlinx_coroutines_core", "resumeCancelled", NotesDispatchAddressRequestKt.KEY_STATE, "resumeCancelled$kotlinx_coroutines_core", "resumeUndispatchedWith", "resumeUndispatchedWith$kotlinx_coroutines_core", "dispatchYield", LogCategory.CONTEXT, "Lkotlin/coroutines/CoroutineContext;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "dispatchYield$kotlinx_coroutines_core", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Object;)V", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setInternetConnected<T> extends setCollegeName<T> implements getNextQuery, SampleVideos<T> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater AudioAttributesImplApi21Parcelizer = AtomicReferenceFieldUpdater.newUpdater(setInternetConnected.class, Object.class, "_reusableCancellableContinuation$volatile");
    public final getPlatform AudioAttributesCompatParcelizer;
    public final Object IconCompatParcelizer;
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;
    public final SampleVideos<T> read;
    public Object write;

    @Override // kotlin.getNextQuery
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public setInternetConnected(getPlatform getplatform, SampleVideos<? super T> sampleVideos) {
        super(-1);
        this.AudioAttributesCompatParcelizer = getplatform;
        this.read = sampleVideos;
        this.write = setEncryptedPlaybackVersion.IconCompatParcelizer;
        this.IconCompatParcelizer = getBufferMultiplier.RemoteActionCompatParcelizer(getWrite());
    }

    @Override // kotlin.getNextQuery
    public final getNextQuery getCallerFrame() {
        SampleVideos<T> sampleVideos = this.read;
        if (sampleVideos instanceof getNextQuery) {
            return (getNextQuery) sampleVideos;
        }
        return null;
    }

    private final setStateSolvedCount<?> RemoteActionCompatParcelizer() {
        Object obj = AudioAttributesImplApi21Parcelizer.get(this);
        if (obj instanceof setStateSolvedCount) {
            return (setStateSolvedCount) obj;
        }
        return null;
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return AudioAttributesImplApi21Parcelizer.get(this) != null;
    }

    private void MediaBrowserCompatItemReceiver() {
        while (AudioAttributesImplApi21Parcelizer.get(this) == setEncryptedPlaybackVersion.write) {
        }
    }

    public final void read() {
        MediaBrowserCompatItemReceiver();
        setStateSolvedCount<?> setstatesolvedcountRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (setstatesolvedcountRemoteActionCompatParcelizer != null) {
            setstatesolvedcountRemoteActionCompatParcelizer.IconCompatParcelizer();
        }
    }

    public final setStateSolvedCount<T> IconCompatParcelizer() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AudioAttributesImplApi21Parcelizer;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                AudioAttributesImplApi21Parcelizer.set(this, setEncryptedPlaybackVersion.write);
                return null;
            }
            if (!(obj instanceof setStateSolvedCount)) {
                if (obj != setEncryptedPlaybackVersion.write && !(obj instanceof Throwable)) {
                    throw new IllegalStateException("Inconsistent state ".concat(String.valueOf(obj)).toString());
                }
            } else if (DateDeserializersDateBasedDeserializer.IconCompatParcelizer(AudioAttributesImplApi21Parcelizer, this, obj, setEncryptedPlaybackVersion.write)) {
                return (setStateSolvedCount) obj;
            }
        }
    }

    public final Throwable read(setStateRank<?> setstaterank) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AudioAttributesImplApi21Parcelizer;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != setEncryptedPlaybackVersion.write) {
                if (obj instanceof Throwable) {
                    if (!DateDeserializersDateBasedDeserializer.IconCompatParcelizer(AudioAttributesImplApi21Parcelizer, this, obj, null)) {
                        throw new IllegalArgumentException("Failed requirement.".toString());
                    }
                    return (Throwable) obj;
                }
                throw new IllegalStateException("Inconsistent state ".concat(String.valueOf(obj)).toString());
            }
        } while (!DateDeserializersDateBasedDeserializer.IconCompatParcelizer(AudioAttributesImplApi21Parcelizer, this, setEncryptedPlaybackVersion.write, setstaterank));
        return null;
    }

    public final boolean AudioAttributesCompatParcelizer(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = AudioAttributesImplApi21Parcelizer;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj, setEncryptedPlaybackVersion.write)) {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (DateDeserializersDateBasedDeserializer.IconCompatParcelizer(AudioAttributesImplApi21Parcelizer, this, obj, null)) {
                    return false;
                }
            } else if (DateDeserializersDateBasedDeserializer.IconCompatParcelizer(AudioAttributesImplApi21Parcelizer, this, setEncryptedPlaybackVersion.write, th)) {
                return true;
            }
        }
    }

    @Override // kotlin.setCollegeName
    public final Object AudioAttributesImplApi26Parcelizer() {
        Object obj = this.write;
        getCollegeId.write();
        this.write = setEncryptedPlaybackVersion.IconCompatParcelizer;
        return obj;
    }

    @Override // kotlin.setCollegeName
    public final SampleVideos<T> write() {
        return this;
    }

    @Override // kotlin.SampleVideos
    public final void resumeWith(Object result) {
        CurrentQuery context;
        Object objRemoteActionCompatParcelizer;
        Object objWrite = setUserStartedTimestampMs.write(result);
        if (this.AudioAttributesCompatParcelizer.IconCompatParcelizer(getWrite())) {
            this.write = objWrite;
            this.RemoteActionCompatParcelizer = 0;
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(getWrite(), this);
            return;
        }
        getCollegeId.write();
        getAddLine2 getaddline2 = getAddLine2.RemoteActionCompatParcelizer;
        CollegeJsonParser collegeJsonParser = getAddLine2.read();
        if (collegeJsonParser.read()) {
            this.write = objWrite;
            this.RemoteActionCompatParcelizer = 0;
            collegeJsonParser.RemoteActionCompatParcelizer((setCollegeName<?>) this);
            return;
        }
        setInternetConnected<T> setinternetconnected = this;
        collegeJsonParser.read(true);
        try {
            context = getWrite();
            objRemoteActionCompatParcelizer = getBufferMultiplier.RemoteActionCompatParcelizer(context, this.IconCompatParcelizer);
        } finally {
            try {
            } finally {
            }
        }
        try {
            this.read.resumeWith(result);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            while (collegeJsonParser.MediaBrowserCompatCustomActionResultReceiver()) {
            }
        } finally {
            getBufferMultiplier.AudioAttributesCompatParcelizer(context, objRemoteActionCompatParcelizer);
        }
    }

    public final void write(CurrentQuery currentQuery, T t) {
        this.write = t;
        this.RemoteActionCompatParcelizer = 1;
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(currentQuery, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DispatchedContinuation[");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", ");
        sb.append(isVerified.AudioAttributesCompatParcelizer(this.read));
        sb.append(']');
        return sb.toString();
    }

    @Override // kotlin.SampleVideos
    /* JADX INFO: renamed from: getContext */
    public final CurrentQuery getWrite() {
        return this.read.getWrite();
    }
}
