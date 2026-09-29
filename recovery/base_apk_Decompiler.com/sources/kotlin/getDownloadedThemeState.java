package kotlin;

import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import in.juspay.hyper.constants.LogCategory;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004:\u0001IB\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000e\u0010\u001b\u001a\u00028\u0000H\u0091@¢\u0006\u0002\u0010\u001cJ\u000e\u0010\u001d\u001a\u00028\u0000H\u0082@¢\u0006\u0002\u0010\u001cJ0\u0010\u001e\u001a\u00020\u001f*\u00020 2\u001c\u0010!\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#\u0012\u0006\u0012\u0004\u0018\u00010\r0\"H\u0096\u0002¢\u0006\u0002\u0010$JB\u0010\u001e\u001a\u00020\u001f\"\u0004\b\u0001\u0010%*\b\u0012\u0004\u0012\u0002H%0&2\"\u0010!\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H%\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#\u0012\u0006\u0012\u0004\u0018\u00010\r0'H\u0096\u0002¢\u0006\u0002\u0010(JV\u0010\u001e\u001a\u00020\u001f\"\u0004\b\u0001\u0010)\"\u0004\b\u0002\u0010%*\u000e\u0012\u0004\u0012\u0002H)\u0012\u0004\u0012\u0002H%0*2\u0006\u0010+\u001a\u0002H)2\"\u0010!\u001a\u001e\b\u0001\u0012\u0004\u0012\u0002H%\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#\u0012\u0006\u0012\u0004\u0018\u00010\r0'H\u0096\u0002¢\u0006\u0002\u0010,J \u0010-\u001a\u00020\u001f*\f0\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010.\u001a\u00020\u000fH\u0001J\u0010\u0010/\u001a\u00020\u001f2\u0006\u00100\u001a\u00020\rH\u0002J\u0010\u00101\u001a\u00020\u001f2\u0006\u00102\u001a\u000203H\u0016J\u001c\u00104\u001a\u00020\u001f2\n\u00105\u001a\u0006\u0012\u0002\b\u0003062\u0006\u00107\u001a\u00020\u0019H\u0016J\u0012\u00108\u001a\u00020\u001f2\b\u0010\u001a\u001a\u0004\u0018\u00010\rH\u0016J\u000e\u00109\u001a\u00020\u001fH\u0082@¢\u0006\u0002\u0010\u001cJ\u0010\u0010:\u001a\u00020\u001f2\u0006\u00100\u001a\u00020\rH\u0002J\u001a\u0010;\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\r2\b\u0010<\u001a\u0004\u0018\u00010\rH\u0016J\u0018\u0010=\u001a\u00020>2\u0006\u00100\u001a\u00020\r2\b\u0010<\u001a\u0004\u0018\u00010\rJ\u001a\u0010?\u001a\u00020\u00192\u0006\u00100\u001a\u00020\r2\b\u0010\u001a\u001a\u0004\u0018\u00010\rH\u0002J\u001c\u0010@\u001a\u000e\u0018\u00010\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u00100\u001a\u00020\rH\u0002J\u000e\u0010A\u001a\u00028\u0000H\u0082@¢\u0006\u0002\u0010\u001cJ*\u0010B\u001a\u00028\u00002\u0010\u0010C\u001a\f0\u0016R\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\rH\u0082@¢\u0006\u0002\u0010DJ\u001a\u0010E\u001a\u00020\u001f2\u0010\u0010F\u001a\f0\u0016R\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0002J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010G\u001a\u0004\u0018\u00010HH\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004R\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0011R \u0010\u0014\u001a\u0014\u0012\u000e\u0012\f0\u0016R\b\u0012\u0004\u0012\u00028\u00000\u0000\u0018\u00010\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006J"}, d2 = {"Lkotlinx/coroutines/selects/SelectImplementation;", "R", "Lkotlinx/coroutines/CancelHandler;", "Lkotlinx/coroutines/selects/SelectBuilder;", "Lkotlinx/coroutines/selects/SelectInstanceInternal;", LogCategory.CONTEXT, "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "getContext", "()Lkotlin/coroutines/CoroutineContext;", NotesDispatchAddressRequestKt.KEY_STATE, "Lkotlinx/atomicfu/AtomicRef;", "", "inRegistrationPhase", "", "getInRegistrationPhase", "()Z", "isSelected", "isCancelled", "clauses", "", "Lkotlinx/coroutines/selects/SelectImplementation$ClauseData;", "disposableHandleOrSegment", "indexInSegment", "", "internalResult", "doSelect", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "doSelectSuspend", "invoke", "", "Lkotlinx/coroutines/selects/SelectClause0;", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(Lkotlinx/coroutines/selects/SelectClause0;Lkotlin/jvm/functions/Function1;)V", "Q", "Lkotlinx/coroutines/selects/SelectClause1;", "Lkotlin/Function2;", "(Lkotlinx/coroutines/selects/SelectClause1;Lkotlin/jvm/functions/Function2;)V", "P", "Lkotlinx/coroutines/selects/SelectClause2;", "param", "(Lkotlinx/coroutines/selects/SelectClause2;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "register", "reregister", "checkClauseObject", "clauseObject", "disposeOnCompletion", "disposableHandle", "Lkotlinx/coroutines/DisposableHandle;", "invokeOnCancellation", "segment", "Lkotlinx/coroutines/internal/Segment;", "index", "selectInRegistrationPhase", "waitUntilSelected", "reregisterClause", "trySelect", "result", "trySelectDetailed", "Lkotlinx/coroutines/selects/TrySelectDetailedResult;", "trySelectInternal", "findClause", "complete", "processResultAndInvokeBlockRecoveringException", "clause", "(Lkotlinx/coroutines/selects/SelectImplementation$ClauseData;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cleanup", "selectedClause", "cause", "", "ClauseData", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class getDownloadedThemeState<R> implements setMaxMcqCount, getEncryptSalt<R> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater RemoteActionCompatParcelizer = AtomicReferenceFieldUpdater.newUpdater(getDownloadedThemeState.class, Object.class, "state$volatile");
    private int AudioAttributesCompatParcelizer;
    private Object IconCompatParcelizer;
    private List<getDownloadedThemeState<R>.write> read;
    private volatile /* synthetic */ Object state$volatile;
    private final CurrentQuery write;

    public final class write {
    }

    @Override // kotlin.getDownloadVersion
    /* JADX INFO: renamed from: read, reason: from getter */
    public final CurrentQuery getWrite() {
        return this.write;
    }

    @Override // kotlin.setVerified
    public final void write(setTotalFramesDropped<?> settotalframesdropped, int i) {
        this.IconCompatParcelizer = settotalframesdropped;
        this.AudioAttributesCompatParcelizer = i;
    }

    @Override // kotlin.getDownloadVersion
    public final boolean IconCompatParcelizer(Object obj, Object obj2) {
        return write(obj, obj2) == 0;
    }

    public final getLastUpdatedMs RemoteActionCompatParcelizer(Object obj, Object obj2) {
        return getDownloadStatus.read(write(obj, obj2));
    }

    private final int write(Object obj, Object obj2) {
        while (true) {
            Object obj3 = RemoteActionCompatParcelizer.get(this);
            if (!(obj3 instanceof setStateRank)) {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj3, getDownloadStatus.AudioAttributesCompatParcelizer) || (obj3 instanceof write)) {
                    return 3;
                }
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj3, getDownloadStatus.RemoteActionCompatParcelizer)) {
                    return 2;
                }
                if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj3, getDownloadStatus.read)) {
                    if (!(obj3 instanceof List)) {
                        throw new IllegalStateException("Unexpected state: ".concat(String.valueOf(obj3)).toString());
                    }
                    if (DateDeserializersDateBasedDeserializer.IconCompatParcelizer(RemoteActionCompatParcelizer, this, obj3, IntermediateLoginResponseBody.read((Collection<? extends Object>) obj3, obj))) {
                        return 1;
                    }
                } else if (DateDeserializersDateBasedDeserializer.IconCompatParcelizer(RemoteActionCompatParcelizer, this, obj3, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(obj))) {
                    return 1;
                }
            }
        }
    }

    @Override // kotlin.setMaxMcqCount
    public final void AudioAttributesCompatParcelizer(Throwable th) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = RemoteActionCompatParcelizer;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (obj == getDownloadStatus.AudioAttributesCompatParcelizer) {
                return;
            }
        } while (!DateDeserializersDateBasedDeserializer.IconCompatParcelizer(atomicReferenceFieldUpdater, this, obj, getDownloadStatus.RemoteActionCompatParcelizer));
    }
}
