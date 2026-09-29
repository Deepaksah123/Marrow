package kotlin;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.marrow.data.api.models.response.user.LoggedUserResponse;
import com.marrow.data.models.custommodule.FilterParams;
import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import in.juspay.hyper.constants.LogCategory;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.setMaxMcqCount;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00060\u0005j\u0002`\u00042\u00020\u0006B\u001d\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020!H\u0002J\b\u0010,\u001a\u00020!H\u0001J\u0015\u00100\u001a\n\u0018\u000102j\u0004\u0018\u0001`1H\u0016¢\u0006\u0002\u00103J\u000f\u00104\u001a\u0004\u0018\u00010\u0017H\u0010¢\u0006\u0002\b5J\u001f\u00106\u001a\u00020*2\b\u00107\u001a\u0004\u0018\u00010\u00172\u0006\u00108\u001a\u000209H\u0010¢\u0006\u0002\b:J\u0010\u0010;\u001a\u00020!2\u0006\u00108\u001a\u000209H\u0002J\u0012\u0010<\u001a\u00020!2\b\u00108\u001a\u0004\u0018\u000109H\u0016J\u0015\u0010=\u001a\u00020*2\u0006\u00108\u001a\u000209H\u0000¢\u0006\u0002\b>J\u0017\u0010?\u001a\u00020*2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020*0AH\u0082\bJ\u0018\u0010B\u001a\u00020*2\u0006\u0010C\u001a\u00020D2\b\u00108\u001a\u0004\u0018\u000109J\u001e\u0010E\u001a\u00020*2\n\u0010F\u001a\u0006\u0012\u0002\b\u00030G2\b\u00108\u001a\u0004\u0018\u000109H\u0002Jn\u0010H\u001a\u00020*\"\u0004\b\u0001\u0010I2K\u0010J\u001aG\u0012\u0013\u0012\u001109¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(8\u0012\u0013\u0012\u0011HI¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(N\u0012\u0013\u0012\u00110\u0010¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020*0K2\u0006\u00108\u001a\u0002092\u0006\u0010N\u001a\u0002HI¢\u0006\u0002\u0010OJ\u0010\u0010P\u001a\u0002092\u0006\u0010Q\u001a\u00020RH\u0016J\b\u0010S\u001a\u00020!H\u0002J\b\u0010T\u001a\u00020!H\u0002J\n\u0010U\u001a\u0004\u0018\u00010\u0017H\u0001J\n\u0010V\u001a\u0004\u0018\u00010\u0019H\u0002J\r\u0010W\u001a\u00020*H\u0000¢\u0006\u0002\bXJ\u001b\u0010Y\u001a\u00020*2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00028\u00000[H\u0016¢\u0006\u0002\u0010\\J:\u0010]\u001a\u00020*2\u0006\u0010N\u001a\u00028\u00002#\u0010J\u001a\u001f\u0012\u0013\u0012\u001109¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(8\u0012\u0004\u0012\u00020*\u0018\u00010^H\u0016¢\u0006\u0002\u0010_Jn\u0010]\u001a\u00020*\"\b\b\u0001\u0010I*\u00028\u00002\u0006\u0010N\u001a\u0002HI2M\u0010J\u001aI\u0012\u0013\u0012\u001109¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(8\u0012\u0013\u0012\u0011HI¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(N\u0012\u0013\u0012\u00110\u0010¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020*\u0018\u00010KH\u0016¢\u0006\u0002\u0010`J\u001c\u0010a\u001a\u00020*2\n\u0010F\u001a\u0006\u0012\u0002\b\u00030G2\u0006\u0010b\u001a\u00020\nH\u0016J6\u0010a\u001a\u00020*2'\u0010C\u001a#\u0012\u0015\u0012\u0013\u0018\u000109¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(8\u0012\u0004\u0012\u00020*0^j\u0002`cH\u0016¢\u0006\u0002\u0010dJ\u0015\u0010e\u001a\u00020*2\u0006\u0010C\u001a\u00020DH\u0000¢\u0006\u0002\bfJ\u0010\u0010g\u001a\u00020*2\u0006\u0010C\u001a\u00020\u0017H\u0002J\u001a\u0010h\u001a\u00020*2\u0006\u0010C\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u0017H\u0002J\u0010\u0010i\u001a\u00020*2\u0006\u0010j\u001a\u00020\nH\u0002J\u0086\u0001\u0010k\u001a\u0004\u0018\u00010\u0017\"\u0004\b\u0001\u0010I2\u0006\u0010\u001d\u001a\u00020l2\u0006\u0010m\u001a\u0002HI2\u0006\u0010\t\u001a\u00020\n2M\u0010J\u001aI\u0012\u0013\u0012\u001109¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(8\u0012\u0013\u0012\u0011HI¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(N\u0012\u0013\u0012\u00110\u0010¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020*\u0018\u00010K2\b\u0010n\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0002\u0010oJv\u0010p\u001a\u00020*\"\u0004\b\u0001\u0010I2\u0006\u0010m\u001a\u0002HI2\u0006\u0010\t\u001a\u00020\n2O\b\u0002\u0010J\u001aI\u0012\u0013\u0012\u001109¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(8\u0012\u0013\u0012\u0011HI¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(N\u0012\u0013\u0012\u00110\u0010¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020*\u0018\u00010KH\u0000¢\u0006\u0004\bq\u0010rJv\u0010s\u001a\u0004\u0018\u00010t\"\u0004\b\u0001\u0010I2\u0006\u0010m\u001a\u0002HI2\b\u0010n\u001a\u0004\u0018\u00010\u00172M\u0010J\u001aI\u0012\u0013\u0012\u001109¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(8\u0012\u0013\u0012\u0011HI¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(N\u0012\u0013\u0012\u00110\u0010¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020*\u0018\u00010KH\u0002¢\u0006\u0002\u0010uJ\u0012\u0010v\u001a\u00020w2\b\u0010m\u001a\u0004\u0018\u00010\u0017H\u0002J\b\u0010x\u001a\u00020*H\u0002J\r\u0010y\u001a\u00020*H\u0000¢\u0006\u0002\bzJ!\u0010T\u001a\u0004\u0018\u00010\u00172\u0006\u0010N\u001a\u00028\u00002\b\u0010n\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010{Jz\u0010T\u001a\u0004\u0018\u00010\u0017\"\b\b\u0001\u0010I*\u00028\u00002\u0006\u0010N\u001a\u0002HI2\b\u0010n\u001a\u0004\u0018\u00010\u00172M\u0010J\u001aI\u0012\u0013\u0012\u001109¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(8\u0012\u0013\u0012\u0011HI¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(N\u0012\u0013\u0012\u00110\u0010¢\u0006\f\bL\u0012\b\bM\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020*\u0018\u00010KH\u0016¢\u0006\u0002\u0010|J\u0012\u0010}\u001a\u0004\u0018\u00010\u00172\u0006\u0010~\u001a\u000209H\u0016J\u0011\u0010\u007f\u001a\u00020*2\u0007\u0010\u0080\u0001\u001a\u00020\u0017H\u0016J\u001c\u0010\u0081\u0001\u001a\u00020**\u00030\u0082\u00012\u0006\u0010N\u001a\u00028\u0000H\u0016¢\u0006\u0003\u0010\u0083\u0001J\u0016\u0010\u0084\u0001\u001a\u00020**\u00030\u0082\u00012\u0006\u0010~\u001a\u000209H\u0016J\"\u0010\u0085\u0001\u001a\u0002H\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0017H\u0010¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J\u001b\u0010\u0088\u0001\u001a\u0004\u0018\u0001092\b\u0010\u001d\u001a\u0004\u0018\u00010\u0017H\u0010¢\u0006\u0003\b\u0089\u0001J\t\u0010\u008a\u0001\u001a\u00020&H\u0016J\t\u0010\u008b\u0001\u001a\u00020&H\u0014R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\t\u0010\u0013\u001a\u00020\u0014X\u0082\u0004R\u0011\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u0016X\u0082\u0004R\u0011\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0016X\u0082\u0004R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u00178@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\"R\u0014\u0010#\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010\"R\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010\"R\u0014\u0010%\u001a\u00020&8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b'\u0010(R\u001c\u0010-\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u0006\u008c\u0001"}, d2 = {"Lkotlinx/coroutines/CancellableContinuationImpl;", "T", "Lkotlinx/coroutines/DispatchedTask;", "Lkotlinx/coroutines/CancellableContinuation;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/Waiter;", "delegate", "Lkotlin/coroutines/Continuation;", "resumeMode", "", "<init>", "(Lkotlin/coroutines/Continuation;I)V", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", LogCategory.CONTEXT, "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "_decisionAndIndex", "Lkotlinx/atomicfu/AtomicInt;", "_state", "Lkotlinx/atomicfu/AtomicRef;", "", "_parentHandle", "Lkotlinx/coroutines/DisposableHandle;", "parentHandle", "getParentHandle", "()Lkotlinx/coroutines/DisposableHandle;", NotesDispatchAddressRequestKt.KEY_STATE, "getState$kotlinx_coroutines_core", "()Ljava/lang/Object;", "isActive", "", "()Z", "isCompleted", "isCancelled", "stateDebugRepresentation", "", "getStateDebugRepresentation", "()Ljava/lang/String;", "initCancellability", "", "isReusable", "resetStateReusable", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "getStackTraceElement", "Lkotlinx/coroutines/internal/StackTraceElement;", "Ljava/lang/StackTraceElement;", "()Ljava/lang/StackTraceElement;", "takeState", "takeState$kotlinx_coroutines_core", "cancelCompletedResult", "takenState", "cause", "", "cancelCompletedResult$kotlinx_coroutines_core", "cancelLater", "cancel", "parentCancelled", "parentCancelled$kotlinx_coroutines_core", "callCancelHandlerSafely", "block", "Lkotlin/Function0;", "callCancelHandler", "handler", "Lkotlinx/coroutines/CancelHandler;", "callSegmentOnCancellation", "segment", "Lkotlinx/coroutines/internal/Segment;", "callOnCancellation", "R", "onCancellation", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", AppMeasurementSdk.ConditionalUserProperty.VALUE, "(Lkotlin/jvm/functions/Function3;Ljava/lang/Throwable;Ljava/lang/Object;)V", "getContinuationCancellationCause", "parent", "Lkotlinx/coroutines/Job;", "trySuspend", "tryResume", "getResult", "installParentHandle", "releaseClaimedReusableContinuation", "releaseClaimedReusableContinuation$kotlinx_coroutines_core", "resumeWith", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "resume", "Lkotlin/Function1;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)V", "invokeOnCancellation", "index", "Lkotlinx/coroutines/CompletionHandler;", "(Lkotlin/jvm/functions/Function1;)V", "invokeOnCancellationInternal", "invokeOnCancellationInternal$kotlinx_coroutines_core", "invokeOnCancellationImpl", "multipleHandlersError", "dispatchResume", FilterParams.KEY_MODE, "resumedState", "Lkotlinx/coroutines/NotCompleted;", "proposedUpdate", "idempotent", "(Lkotlinx/coroutines/NotCompleted;Ljava/lang/Object;ILkotlin/jvm/functions/Function3;Ljava/lang/Object;)Ljava/lang/Object;", "resumeImpl", "resumeImpl$kotlinx_coroutines_core", "(Ljava/lang/Object;ILkotlin/jvm/functions/Function3;)V", "tryResumeImpl", "Lkotlinx/coroutines/internal/Symbol;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Lkotlinx/coroutines/internal/Symbol;", "alreadyResumedError", "", "detachChildIfNonResuable", "detachChild", "detachChild$kotlinx_coroutines_core", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "tryResumeWithException", "exception", "completeResume", LoggedUserResponse.KEY_TOKEN, "resumeUndispatched", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Object;)V", "resumeUndispatchedWithException", "getSuccessfulResult", "getSuccessfulResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Object;", "getExceptionalResult", "getExceptionalResult$kotlinx_coroutines_core", "toString", "nameString", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class setStateSolvedCount<T> extends setCollegeName<T> implements setStateRank<T>, getNextQuery, setVerified {
    private final SampleVideos<T> AudioAttributesImplApi21Parcelizer;
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    private final CurrentQuery write;
    private static final /* synthetic */ AtomicIntegerFieldUpdater IconCompatParcelizer = AtomicIntegerFieldUpdater.newUpdater(setStateSolvedCount.class, "_decisionAndIndex$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater read = AtomicReferenceFieldUpdater.newUpdater(setStateSolvedCount.class, Object.class, "_state$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater AudioAttributesCompatParcelizer = AtomicReferenceFieldUpdater.newUpdater(setStateSolvedCount.class, Object.class, "_parentHandle$volatile");

    @Override // kotlin.getNextQuery
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.setCollegeName
    public final SampleVideos<T> write() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public setStateSolvedCount(SampleVideos<? super T> sampleVideos, int i) {
        super(i);
        this.AudioAttributesImplApi21Parcelizer = sampleVideos;
        getCollegeId.write();
        this.write = sampleVideos.getAudioAttributesImplApi26Parcelizer();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = setIsMockTest.INSTANCE;
    }

    @Override // kotlin.SampleVideos
    /* JADX INFO: renamed from: getContext, reason: from getter */
    public CurrentQuery getAudioAttributesImplApi26Parcelizer() {
        return this.write;
    }

    private final setYearOfPassout MediaBrowserCompatSearchResultReceiver() {
        return (setYearOfPassout) AudioAttributesCompatParcelizer.get(this);
    }

    private Object onPause() {
        return read.get(this);
    }

    @Override // kotlin.setStateRank
    public final boolean read() {
        return onPause() instanceof setShowLegalPopup;
    }

    @Override // kotlin.setStateRank
    public final boolean RemoteActionCompatParcelizer() {
        return !(onPause() instanceof setShowLegalPopup);
    }

    private final String RatingCompat() {
        Object objOnPause = onPause();
        return objOnPause instanceof setShowLegalPopup ? "Active" : objOnPause instanceof setUserSubmissionTimestamp ? "Cancelled" : "Completed";
    }

    public final void MediaBrowserCompatCustomActionResultReceiver() {
        setYearOfPassout setyearofpassoutOnCustomAction = onCustomAction();
        if (setyearofpassoutOnCustomAction == null || !RemoteActionCompatParcelizer()) {
            return;
        }
        setyearofpassoutOnCustomAction.write();
        AudioAttributesCompatParcelizer.set(this, setEmail.INSTANCE);
    }

    private final boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        if (!isUserCollegeDataAvailable.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer)) {
            return false;
        }
        SampleVideos<T> sampleVideos = this.AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.read(sampleVideos, "");
        return ((setInternetConnected) sampleVideos).AudioAttributesCompatParcelizer();
    }

    public final boolean AudioAttributesImplApi21Parcelizer() {
        getCollegeId.write();
        getCollegeId.write();
        Object obj = read.get(this);
        getCollegeId.write();
        if ((obj instanceof setMockTest) && ((setMockTest) obj).RemoteActionCompatParcelizer != null) {
            IconCompatParcelizer();
            return false;
        }
        IconCompatParcelizer.set(this, 536870911);
        read.set(this, setIsMockTest.INSTANCE);
        return true;
    }

    @Override // kotlin.getNextQuery
    public getNextQuery getCallerFrame() {
        SampleVideos<T> sampleVideos = this.AudioAttributesImplApi21Parcelizer;
        if (sampleVideos instanceof getNextQuery) {
            return (getNextQuery) sampleVideos;
        }
        return null;
    }

    @Override // kotlin.setCollegeName
    public final Object AudioAttributesImplApi26Parcelizer() {
        return onPause();
    }

    @Override // kotlin.setCollegeName
    public final void IconCompatParcelizer(Throwable th) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = read;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof setShowLegalPopup) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj instanceof setUserSubmittedTimestampMs) {
                return;
            }
            if (obj instanceof setMockTest) {
                setMockTest setmocktest = (setMockTest) obj;
                if (setmocktest.write()) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                if (DateDeserializersDateBasedDeserializer.IconCompatParcelizer(read, this, obj, setMockTest.RemoteActionCompatParcelizer(setmocktest, null, null, null, null, th, 15))) {
                    setmocktest.AudioAttributesCompatParcelizer(this, th);
                    return;
                }
            } else if (DateDeserializersDateBasedDeserializer.IconCompatParcelizer(read, this, obj, new setMockTest(obj, null, null, null, th, 14, null))) {
                return;
            }
        }
    }

    private final boolean AudioAttributesImplBaseParcelizer(Throwable th) {
        if (!MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
            return false;
        }
        SampleVideos<T> sampleVideos = this.AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.read(sampleVideos, "");
        return ((setInternetConnected) sampleVideos).AudioAttributesCompatParcelizer(th);
    }

    @Override // kotlin.setStateRank
    public final boolean write(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = read;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof setShowLegalPopup)) {
                return false;
            }
        } while (!DateDeserializersDateBasedDeserializer.IconCompatParcelizer(read, this, obj, new setUserSubmissionTimestamp(this, th, (obj instanceof setMaxMcqCount) || (obj instanceof setTotalFramesDropped))));
        setShowLegalPopup setshowlegalpopup = (setShowLegalPopup) obj;
        if (setshowlegalpopup instanceof setMaxMcqCount) {
            write((setMaxMcqCount) obj, th);
        } else if (setshowlegalpopup instanceof setTotalFramesDropped) {
            RemoteActionCompatParcelizer((setTotalFramesDropped<?>) obj);
        }
        MediaMetadataCompat();
        AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
        return true;
    }

    public final void read(Throwable th) {
        if (AudioAttributesImplBaseParcelizer(th)) {
            return;
        }
        write(th);
        MediaMetadataCompat();
    }

    public final void write(setMaxMcqCount setmaxmcqcount, Throwable th) {
        try {
            setmaxmcqcount.AudioAttributesCompatParcelizer(th);
        } catch (Throwable th2) {
            YearItem.read(getAudioAttributesImplApi26Parcelizer(), new TestMiniCompanion("Exception in invokeOnCancellation handler for ".concat(String.valueOf(this)), th2));
        }
    }

    private final void RemoteActionCompatParcelizer(setTotalFramesDropped<?> settotalframesdropped) {
        int i = IconCompatParcelizer.get(this) & 536870911;
        if (i == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken".toString());
        }
        try {
            settotalframesdropped.write(i, getAudioAttributesImplApi26Parcelizer());
        } catch (Throwable th) {
            YearItem.read(getAudioAttributesImplApi26Parcelizer(), new TestMiniCompanion("Exception in invokeOnCancellation handler for ".concat(String.valueOf(this)), th));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> void RemoteActionCompatParcelizer(getModuleData<? super Throwable, ? super R, ? super CurrentQuery, getShowPopup> getmoduledata, Throwable th, R r) {
        try {
            getmoduledata.AudioAttributesCompatParcelizer(th, r, getAudioAttributesImplApi26Parcelizer());
        } catch (Throwable th2) {
            YearItem.read(getAudioAttributesImplApi26Parcelizer(), new TestMiniCompanion("Exception in resume onCancellation handler for ".concat(String.valueOf(this)), th2));
        }
    }

    public Throwable read(setPassingYear setpassingyear) {
        return setpassingyear.MediaBrowserCompatItemReceiver();
    }

    private final boolean onCommand() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = IconCompatParcelizer;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended".toString());
            }
        } while (!IconCompatParcelizer.compareAndSet(this, i, (536870911 & i) + 536870912));
        return true;
    }

    private final boolean handleMediaPlayPauseIfPendingOnHandler() {
        int i;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = IconCompatParcelizer;
        do {
            i = atomicIntegerFieldUpdater.get(this);
            int i2 = i >> 29;
            if (i2 != 0) {
                if (i2 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed".toString());
            }
        } while (!IconCompatParcelizer.compareAndSet(this, i, (536870911 & i) + 1073741824));
        return true;
    }

    public final Object AudioAttributesCompatParcelizer() {
        setPassingYear setpassingyear;
        boolean zMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        if (onCommand()) {
            if (MediaBrowserCompatSearchResultReceiver() == null) {
                onCustomAction();
            }
            if (zMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
                AudioAttributesImplBaseParcelizer();
            }
            return getYear.IconCompatParcelizer();
        }
        if (zMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            AudioAttributesImplBaseParcelizer();
        }
        Object objOnPause = onPause();
        if (!(objOnPause instanceof setUserSubmittedTimestampMs)) {
            if (isUserCollegeDataAvailable.IconCompatParcelizer(this.RemoteActionCompatParcelizer) && (setpassingyear = (setPassingYear) getAudioAttributesImplApi26Parcelizer().get(setPassingYear.b_)) != null && !setpassingyear.read()) {
                CancellationException cancellationExceptionMediaBrowserCompatItemReceiver = setpassingyear.MediaBrowserCompatItemReceiver();
                IconCompatParcelizer((Throwable) cancellationExceptionMediaBrowserCompatItemReceiver);
                if (!getCollegeId.RemoteActionCompatParcelizer()) {
                    throw cancellationExceptionMediaBrowserCompatItemReceiver;
                }
                setStateSolvedCount<T> setstatesolvedcount = this;
                if (setstatesolvedcount instanceof getNextQuery) {
                    throw accessgetVideoConfigurationC0cp.read(cancellationExceptionMediaBrowserCompatItemReceiver, setstatesolvedcount);
                }
                throw cancellationExceptionMediaBrowserCompatItemReceiver;
            }
            return IconCompatParcelizer(objOnPause);
        }
        Throwable th = ((setUserSubmittedTimestampMs) objOnPause).RemoteActionCompatParcelizer;
        if (!getCollegeId.RemoteActionCompatParcelizer()) {
            throw th;
        }
        setStateSolvedCount<T> setstatesolvedcount2 = this;
        if (setstatesolvedcount2 instanceof getNextQuery) {
            throw accessgetVideoConfigurationC0cp.read(th, setstatesolvedcount2);
        }
        throw th;
    }

    private final setYearOfPassout onCustomAction() {
        setPassingYear setpassingyear = (setPassingYear) getAudioAttributesImplApi26Parcelizer().get(setPassingYear.b_);
        if (setpassingyear == null) {
            return null;
        }
        setYearOfPassout setyearofpassoutWrite = getUserConfig.write(setpassingyear, new TestMini(this));
        DateDeserializersDateBasedDeserializer.IconCompatParcelizer(AudioAttributesCompatParcelizer, this, null, setyearofpassoutWrite);
        return setyearofpassoutWrite;
    }

    public final void AudioAttributesImplBaseParcelizer() {
        Throwable th;
        SampleVideos<T> sampleVideos = this.AudioAttributesImplApi21Parcelizer;
        setInternetConnected setinternetconnected = sampleVideos instanceof setInternetConnected ? (setInternetConnected) sampleVideos : null;
        if (setinternetconnected == null || (th = setinternetconnected.read((setStateRank<?>) this)) == null) {
            return;
        }
        IconCompatParcelizer();
        write(th);
    }

    @Override // kotlin.SampleVideos
    public void resumeWith(Object result) {
        write(setUserStartedTimestampMs.write(result, this), this.RemoteActionCompatParcelizer, (getModuleData<? super Throwable, ? super Object, ? super CurrentQuery, getShowPopup>) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(getAnswerMap getanswermap, Throwable th) {
        getanswermap.invoke(th);
        return getShowPopup.INSTANCE;
    }

    @Override // kotlin.setStateRank
    public final void write(T t, final getAnswerMap<? super Throwable, getShowPopup> getanswermap) {
        write(t, this.RemoteActionCompatParcelizer, (getModuleData<? super Throwable, ? super T, ? super CurrentQuery, getShowPopup>) (getanswermap != null ? new getModuleData() { // from class: o.setStartTimestamp
            @Override // kotlin.getModuleData
            public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                return setStateSolvedCount.RemoteActionCompatParcelizer(getanswermap, (Throwable) obj);
            }
        } : null));
    }

    @Override // kotlin.setStateRank
    public final <R extends T> void read(R r, getModuleData<? super Throwable, ? super R, ? super CurrentQuery, getShowPopup> getmoduledata) {
        write(r, this.RemoteActionCompatParcelizer, getmoduledata);
    }

    @Override // kotlin.setVerified
    public final void write(setTotalFramesDropped<?> settotalframesdropped, int i) {
        int i2;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = IconCompatParcelizer;
        do {
            i2 = atomicIntegerFieldUpdater.get(this);
            if ((i2 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once".toString());
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i2, ((i2 >> 29) << 29) + i));
        RemoteActionCompatParcelizer((Object) settotalframesdropped);
    }

    @Override // kotlin.setStateRank
    public final void write(getAnswerMap<? super Throwable, getShowPopup> getanswermap) {
        setStatePercentile.AudioAttributesCompatParcelizer(this, new setMaxMcqCount.read(getanswermap));
    }

    public final void write(setMaxMcqCount setmaxmcqcount) {
        RemoteActionCompatParcelizer(setmaxmcqcount);
    }

    private final void RemoteActionCompatParcelizer(Object obj) {
        getCollegeId.write();
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = read;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof setIsMockTest)) {
                if ((obj2 instanceof setMaxMcqCount) || (obj2 instanceof setTotalFramesDropped)) {
                    RemoteActionCompatParcelizer(obj, obj2);
                } else {
                    boolean z = obj2 instanceof setUserSubmittedTimestampMs;
                    if (z) {
                        setUserSubmittedTimestampMs setusersubmittedtimestampms = (setUserSubmittedTimestampMs) obj2;
                        if (!setusersubmittedtimestampms.AudioAttributesCompatParcelizer()) {
                            RemoteActionCompatParcelizer(obj, obj2);
                        }
                        if (obj2 instanceof setUserSubmissionTimestamp) {
                            if (!z) {
                                setusersubmittedtimestampms = null;
                            }
                            Throwable th = setusersubmittedtimestampms != null ? setusersubmittedtimestampms.RemoteActionCompatParcelizer : null;
                            if (obj instanceof setMaxMcqCount) {
                                write((setMaxMcqCount) obj, th);
                                return;
                            } else {
                                toMagicModuleMetaRepoModel.read(obj, "");
                                RemoteActionCompatParcelizer((setTotalFramesDropped<?>) obj);
                                return;
                            }
                        }
                        return;
                    }
                    if (obj2 instanceof setMockTest) {
                        setMockTest setmocktest = (setMockTest) obj2;
                        if (setmocktest.write != null) {
                            RemoteActionCompatParcelizer(obj, obj2);
                        }
                        if (obj instanceof setTotalFramesDropped) {
                            return;
                        }
                        toMagicModuleMetaRepoModel.read(obj, "");
                        setMaxMcqCount setmaxmcqcount = (setMaxMcqCount) obj;
                        if (setmocktest.write()) {
                            write(setmaxmcqcount, setmocktest.AudioAttributesCompatParcelizer);
                            return;
                        } else {
                            if (DateDeserializersDateBasedDeserializer.IconCompatParcelizer(read, this, obj2, setMockTest.RemoteActionCompatParcelizer(setmocktest, null, setmaxmcqcount, null, null, null, 29))) {
                                return;
                            }
                        }
                    } else {
                        if (obj instanceof setTotalFramesDropped) {
                            return;
                        }
                        toMagicModuleMetaRepoModel.read(obj, "");
                        if (DateDeserializersDateBasedDeserializer.IconCompatParcelizer(read, this, obj2, new setMockTest(obj2, (setMaxMcqCount) obj, null, null, null, 28, null))) {
                            return;
                        }
                    }
                }
            } else if (DateDeserializersDateBasedDeserializer.IconCompatParcelizer(read, this, obj2, obj)) {
                return;
            }
        }
    }

    private static void RemoteActionCompatParcelizer(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder("It's prohibited to register multiple handlers, tried to register ");
        sb.append(obj);
        sb.append(", already has ");
        sb.append(obj2);
        throw new IllegalStateException(sb.toString().toString());
    }

    private final void AudioAttributesCompatParcelizer(int i) {
        if (handleMediaPlayPauseIfPendingOnHandler()) {
            return;
        }
        isUserCollegeDataAvailable.IconCompatParcelizer(this, i);
    }

    private static <R> Object RemoteActionCompatParcelizer(setShowLegalPopup setshowlegalpopup, R r, int i, getModuleData<? super Throwable, ? super R, ? super CurrentQuery, getShowPopup> getmoduledata, Object obj) {
        if (r instanceof setUserSubmittedTimestampMs) {
            getCollegeId.write();
            getCollegeId.write();
        } else if ((isUserCollegeDataAvailable.IconCompatParcelizer(i) || obj != null) && (getmoduledata != null || (setshowlegalpopup instanceof setMaxMcqCount) || obj != null)) {
            return new setMockTest(r, setshowlegalpopup instanceof setMaxMcqCount ? (setMaxMcqCount) setshowlegalpopup : null, getmoduledata, obj, null, 16, null);
        }
        return r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <R> void write(R r, int i, getModuleData<? super Throwable, ? super R, ? super CurrentQuery, getShowPopup> getmoduledata) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = read;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof setShowLegalPopup) {
            } else {
                if (obj instanceof setUserSubmissionTimestamp) {
                    setUserSubmissionTimestamp setusersubmissiontimestamp = (setUserSubmissionTimestamp) obj;
                    if (setusersubmissiontimestamp.RemoteActionCompatParcelizer()) {
                        if (getmoduledata != null) {
                            RemoteActionCompatParcelizer(getmoduledata, setusersubmissiontimestamp.RemoteActionCompatParcelizer, r);
                            return;
                        }
                        return;
                    }
                }
                AudioAttributesCompatParcelizer(r);
                throw new PlanDetailsCreator();
            }
        } while (!DateDeserializersDateBasedDeserializer.IconCompatParcelizer(read, this, obj, RemoteActionCompatParcelizer((setShowLegalPopup) obj, r, i, getmoduledata, null)));
        MediaMetadataCompat();
        AudioAttributesCompatParcelizer(i);
    }

    private final <R> accessgetVideoConfigurationC2cp write(R r, Object obj, getModuleData<? super Throwable, ? super R, ? super CurrentQuery, getShowPopup> getmoduledata) {
        Object obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = read;
        do {
            obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof setShowLegalPopup) {
            } else {
                if (!(obj2 instanceof setMockTest) || obj == null || ((setMockTest) obj2).RemoteActionCompatParcelizer != obj) {
                    return null;
                }
                getCollegeId.write();
                return setSolvedCount.read;
            }
        } while (!DateDeserializersDateBasedDeserializer.IconCompatParcelizer(read, this, obj2, RemoteActionCompatParcelizer((setShowLegalPopup) obj2, r, this.RemoteActionCompatParcelizer, getmoduledata, obj)));
        MediaMetadataCompat();
        return setSolvedCount.read;
    }

    private static Void AudioAttributesCompatParcelizer(Object obj) {
        throw new IllegalStateException("Already resumed, but proposed with update ".concat(String.valueOf(obj)).toString());
    }

    private final void MediaMetadataCompat() {
        if (MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
            return;
        }
        IconCompatParcelizer();
    }

    public final void IconCompatParcelizer() {
        setYearOfPassout setyearofpassoutMediaBrowserCompatSearchResultReceiver = MediaBrowserCompatSearchResultReceiver();
        if (setyearofpassoutMediaBrowserCompatSearchResultReceiver == null) {
            return;
        }
        setyearofpassoutMediaBrowserCompatSearchResultReceiver.write();
        AudioAttributesCompatParcelizer.set(this, setEmail.INSTANCE);
    }

    @Override // kotlin.setStateRank
    public final <R extends T> Object read(R r, Object obj, getModuleData<? super Throwable, ? super R, ? super CurrentQuery, getShowPopup> getmoduledata) {
        return write(r, obj, getmoduledata);
    }

    @Override // kotlin.setStateRank
    public final Object AudioAttributesCompatParcelizer(Throwable th) {
        return write(new setUserSubmittedTimestampMs(th), (Object) null, (getModuleData<? super Throwable, ? super setUserSubmittedTimestampMs, ? super CurrentQuery, getShowPopup>) null);
    }

    @Override // kotlin.setStateRank
    public final void write(Object obj) {
        getCollegeId.write();
        AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
    }

    @Override // kotlin.setStateRank
    public final void RemoteActionCompatParcelizer(getPlatform getplatform, T t) {
        SampleVideos<T> sampleVideos = this.AudioAttributesImplApi21Parcelizer;
        setInternetConnected setinternetconnected = sampleVideos instanceof setInternetConnected ? (setInternetConnected) sampleVideos : null;
        write(t, (setinternetconnected != null ? setinternetconnected.AudioAttributesCompatParcelizer : null) == getplatform ? 4 : this.RemoteActionCompatParcelizer, (getModuleData<? super Throwable, ? super T, ? super CurrentQuery, getShowPopup>) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.setCollegeName
    public final <T> T IconCompatParcelizer(Object obj) {
        return obj instanceof setMockTest ? (T) ((setMockTest) obj).read : obj;
    }

    @Override // kotlin.setCollegeName
    public final Throwable read(Object obj) {
        Throwable th = super.read(obj);
        if (th == null) {
            return null;
        }
        SampleVideos<T> sampleVideos = this.AudioAttributesImplApi21Parcelizer;
        return (getCollegeId.RemoteActionCompatParcelizer() && (sampleVideos instanceof getNextQuery)) ? accessgetVideoConfigurationC0cp.read(th, (getNextQuery) sampleVideos) : th;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(MediaBrowserCompatItemReceiver());
        sb.append('(');
        sb.append(isVerified.AudioAttributesCompatParcelizer(this.AudioAttributesImplApi21Parcelizer));
        sb.append("){");
        sb.append(RatingCompat());
        sb.append("}@");
        sb.append(isVerified.IconCompatParcelizer(this));
        return sb.toString();
    }

    protected String MediaBrowserCompatItemReceiver() {
        return "CancellableContinuation";
    }
}
