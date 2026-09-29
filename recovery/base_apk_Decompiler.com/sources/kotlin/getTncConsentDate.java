package kotlin;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.CurrentQuery;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;
import kotlin.setPassingYear;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
@getRenewGrpId
@Metadata(d1 = {"\u0000ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\f\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\n¹\u0001º\u0001»\u0001¼\u0001½\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u0004J\u001f\u0010\u001f\u001a\u00020 2\u0014\u0010!\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0004\u0012\u00020\u001b0\"H\u0082\bJ\u001c\u0010'\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u000eH\u0002J \u0010*\u001a\u0004\u0018\u00010+2\u0006\u0010\u001c\u001a\u00020(2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0-H\u0002J\u001e\u0010.\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020+2\f\u0010,\u001a\b\u0012\u0004\u0012\u00020+0-H\u0002J\u001a\u00100\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u000eH\u0002J\u001a\u00103\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u000eH\u0002J\u0018\u00104\u001a\u00020\u001b2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020+H\u0002J\u0010\u00108\u001a\u00020\u00052\u0006\u00107\u001a\u00020+H\u0002J\u0016\u00109\u001a\u00020\u001b*\u0002062\b\u00107\u001a\u0004\u0018\u00010+H\u0002J/\u0010:\u001a\u00020\u001b2\u0006\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010+2\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020<\u0012\u0004\u0012\u00020\u00050\"H\u0082\bJ\u0006\u0010=\u001a\u00020\u0005J\u0012\u0010>\u001a\u00020?2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000eH\u0002J\b\u0010@\u001a\u00020\u001bH\u0014J\u000f\u0010A\u001a\u00060Cj\u0002`B¢\u0006\u0002\u0010DJ!\u0010E\u001a\u00060Cj\u0002`B*\u00020+2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010GH\u0004¢\u0006\u0002\u0010HJ4\u0010N\u001a\u00020O2'\u0010P\u001a#\u0012\u0015\u0012\u0013\u0018\u00010+¢\u0006\f\bR\u0012\b\bS\u0012\u0004\b\b(7\u0012\u0004\u0012\u00020\u001b0\"j\u0002`Q¢\u0006\u0002\u0010TJD\u0010N\u001a\u00020O2\u0006\u0010U\u001a\u00020\u00052\u0006\u0010V\u001a\u00020\u00052'\u0010P\u001a#\u0012\u0015\u0012\u0013\u0018\u00010+¢\u0006\f\bR\u0012\b\bS\u0012\u0004\b\b(7\u0012\u0004\u0012\u00020\u001b0\"j\u0002`Q¢\u0006\u0002\u0010WJ\u001d\u0010X\u001a\u00020O2\u0006\u0010V\u001a\u00020\u00052\u0006\u0010Y\u001a\u00020<H\u0000¢\u0006\u0002\bZJ+\u0010[\u001a\u00020\u00052\u0006\u0010Y\u001a\u00020<2\u0018\u0010\\\u001a\u0014\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u00050]H\u0082\bJ\u0010\u0010^\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020_H\u0002J\u0010\u0010`\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020<H\u0002J\u000e\u0010a\u001a\u00020\u001bH\u0086@¢\u0006\u0002\u0010bJ\b\u0010c\u001a\u00020\u0005H\u0002J\u000e\u0010d\u001a\u00020\u001bH\u0082@¢\u0006\u0002\u0010bJ\u001e\u0010k\u001a\u00020\u001b2\n\u0010l\u001a\u0006\u0012\u0002\b\u00030m2\b\u0010n\u001a\u0004\u0018\u00010\u000eH\u0002J\u0015\u0010o\u001a\u00020\u001b2\u0006\u0010Y\u001a\u00020<H\u0000¢\u0006\u0002\bpJ\u001d\u0010s\u001a\u00020\u001b2\u000e\u00107\u001a\n\u0018\u00010Cj\u0004\u0018\u0001`BH\u0016¢\u0006\u0002\u0010tJ\b\u0010u\u001a\u00020GH\u0014J\u0012\u0010s\u001a\u00020\u00052\b\u00107\u001a\u0004\u0018\u00010+H\u0017J\u0010\u0010v\u001a\u00020\u001b2\u0006\u00107\u001a\u00020+H\u0016J\u000e\u0010w\u001a\u00020\u001b2\u0006\u0010x\u001a\u00020\u0003J\u0010\u0010y\u001a\u00020\u00052\u0006\u00107\u001a\u00020+H\u0016J\u0010\u0010z\u001a\u00020\u00052\b\u00107\u001a\u0004\u0018\u00010+J\u0017\u0010{\u001a\u00020\u00052\b\u00107\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0002\b|J\u0014\u0010}\u001a\u0004\u0018\u00010\u000e2\b\u00107\u001a\u0004\u0018\u00010\u000eH\u0002J'\u0010~\u001a\u00020\u007f2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010G2\n\b\u0002\u00107\u001a\u0004\u0018\u00010+H\u0080\b¢\u0006\u0003\b\u0080\u0001J\u0012\u0010\u0081\u0001\u001a\u00060Cj\u0002`BH\u0016¢\u0006\u0002\u0010DJ\u0013\u0010\u0082\u0001\u001a\u00020+2\b\u00107\u001a\u0004\u0018\u00010\u000eH\u0002J\u0015\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u000e2\b\u00107\u001a\u0004\u0018\u00010\u000eH\u0002J\u0013\u0010\u0084\u0001\u001a\u0004\u0018\u0001062\u0006\u0010\u001c\u001a\u000201H\u0002J\u0019\u0010\u0085\u0001\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u0002012\u0006\u0010/\u001a\u00020+H\u0002J\u0019\u0010\u0086\u0001\u001a\u00020\u00052\b\u0010)\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0003\b\u0087\u0001J\u001b\u0010\u0088\u0001\u001a\u0004\u0018\u00010\u000e2\b\u0010)\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0003\b\u0089\u0001J\u001f\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000e2\b\u0010)\u001a\u0004\u0018\u00010\u000eH\u0002J\u001d\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u0002012\b\u0010)\u001a\u0004\u0018\u00010\u000eH\u0002J&\u0010\u008f\u0001\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020(2\b\u0010\u0090\u0001\u001a\u00030\u0091\u00012\b\u0010)\u001a\u0004\u0018\u00010\u000eH\u0082\u0010J%\u0010\u0092\u0001\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020(2\b\u0010\u0093\u0001\u001a\u00030\u0091\u00012\b\u0010)\u001a\u0004\u0018\u00010\u000eH\u0002J\u0011\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0091\u0001*\u00030\u0095\u0001H\u0002J\u0010\u0010\u009a\u0001\u001a\u00020\u00102\u0007\u0010\u0090\u0001\u001a\u00020\u0002J\u0018\u0010\u009b\u0001\u001a\u00020\u001b2\u0007\u0010\u009c\u0001\u001a\u00020+H\u0010¢\u0006\u0003\b\u009d\u0001J\u0012\u0010U\u001a\u00020\u001b2\b\u00107\u001a\u0004\u0018\u00010+H\u0014J\u0012\u0010¡\u0001\u001a\u00020\u00052\u0007\u0010\u009c\u0001\u001a\u00020+H\u0014J\u0013\u0010¢\u0001\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000eH\u0014J\u0013\u0010£\u0001\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000eH\u0014J\t\u0010¤\u0001\u001a\u00020GH\u0016J\t\u0010¥\u0001\u001a\u00020GH\u0007J\u000f\u0010¦\u0001\u001a\u00020GH\u0010¢\u0006\u0003\b§\u0001J\u0013\u0010¨\u0001\u001a\u00020G2\b\u0010\u001c\u001a\u0004\u0018\u00010\u000eH\u0002J\t\u0010¬\u0001\u001a\u0004\u0018\u00010+J\u0011\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0003\b®\u0001J\u0011\u0010¯\u0001\u001a\u0004\u0018\u00010\u000eH\u0084@¢\u0006\u0002\u0010bJ\u0011\u0010°\u0001\u001a\u0004\u0018\u00010\u000eH\u0082@¢\u0006\u0002\u0010bJ\u001f\u0010¶\u0001\u001a\u00020\u001b2\n\u0010l\u001a\u0006\u0012\u0002\b\u00030m2\b\u0010n\u001a\u0004\u0018\u00010\u000eH\u0002J \u0010·\u0001\u001a\u0004\u0018\u00010\u000e2\b\u0010n\u001a\u0004\u0018\u00010\u000e2\t\u0010¸\u0001\u001a\u0004\u0018\u00010\u000eH\u0002R\u0015\u0010\b\u001a\u0006\u0012\u0002\b\u00030\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\rX\u0082\u0004R\u0011\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\rX\u0082\u0004R(\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00108@@@X\u0080\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0017\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b%\u0010$R\u0011\u0010&\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0016\u0010I\u001a\u0004\u0018\u00010+8DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010L\u001a\u00020\u00058DX\u0084\u0004¢\u0006\u0006\u001a\u0004\bM\u0010$R\u0017\u0010e\u001a\u00020f8F¢\u0006\f\u0012\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u0014\u0010q\u001a\u00020\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\br\u0010$R\u001f\u0010\u008c\u0001\u001a\u0004\u0018\u00010+*\u0004\u0018\u00010\u000e8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001b\u0010\u0096\u0001\u001a\t\u0012\u0004\u0012\u00020\u00010\u0097\u00018F¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0016\u0010\u009e\u0001\u001a\u00020\u00058TX\u0094\u0004¢\u0006\u0007\u001a\u0005\b\u009e\u0001\u0010$R\u0016\u0010\u009f\u0001\u001a\u00020\u00058PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b \u0001\u0010$R\u001b\u0010©\u0001\u001a\u00020\u0005*\u0002018BX\u0082\u0004¢\u0006\b\u001a\u0006\b©\u0001\u0010ª\u0001R\u0013\u0010«\u0001\u001a\u00020\u00058F¢\u0006\u0007\u001a\u0005\b«\u0001\u0010$R#\u0010±\u0001\u001a\u0007\u0012\u0002\b\u00030²\u00018DX\u0084\u0004¢\u0006\u000f\u0012\u0005\b³\u0001\u0010h\u001a\u0006\b´\u0001\u0010µ\u0001¨\u0006¾\u0001"}, d2 = {"Lkotlinx/coroutines/JobSupport;", "Lkotlinx/coroutines/Job;", "Lkotlinx/coroutines/ChildJob;", "Lkotlinx/coroutines/ParentJob;", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "", "<init>", "(Z)V", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "_state", "Lkotlinx/atomicfu/AtomicRef;", "", "_parentHandle", "Lkotlinx/coroutines/ChildHandle;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "parentHandle", "getParentHandle$kotlinx_coroutines_core", "()Lkotlinx/coroutines/ChildHandle;", "setParentHandle$kotlinx_coroutines_core", "(Lkotlinx/coroutines/ChildHandle;)V", "parent", "getParent", "()Lkotlinx/coroutines/Job;", "initParentJob", "", NotesDispatchAddressRequestKt.KEY_STATE, "getState$kotlinx_coroutines_core", "()Ljava/lang/Object;", "loopOnState", "", "block", "Lkotlin/Function1;", "isActive", "()Z", "isCompleted", "isCancelled", "finalizeFinishingState", "Lkotlinx/coroutines/JobSupport$Finishing;", "proposedUpdate", "getFinalRootCause", "", "exceptions", "", "addSuppressedExceptions", "rootCause", "tryFinalizeSimpleState", "Lkotlinx/coroutines/Incomplete;", "update", "completeStateFinalization", "notifyCancelling", "list", "Lkotlinx/coroutines/NodeList;", "cause", "cancelParent", "notifyCompletion", "notifyHandlers", "predicate", "Lkotlinx/coroutines/JobNode;", TtmlNode.START, "startInternal", "", "onStart", "getCancellationException", "Lkotlinx/coroutines/CancellationException;", "Ljava/util/concurrent/CancellationException;", "()Ljava/util/concurrent/CancellationException;", "toCancellationException", "message", "", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;", "completionCause", "getCompletionCause", "()Ljava/lang/Throwable;", "completionCauseHandled", "getCompletionCauseHandled", "invokeOnCompletion", "Lkotlinx/coroutines/DisposableHandle;", "handler", "Lkotlinx/coroutines/CompletionHandler;", "Lkotlin/ParameterName;", "name", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;", "onCancelling", "invokeImmediately", "(ZZLkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;", "invokeOnCompletionInternal", "node", "invokeOnCompletionInternal$kotlinx_coroutines_core", "tryPutNodeIntoList", "tryAdd", "Lkotlin/Function2;", "promoteEmptyToNodeList", "Lkotlinx/coroutines/Empty;", "promoteSingleToNodeList", "join", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "joinInternal", "joinSuspend", "onJoin", "Lkotlinx/coroutines/selects/SelectClause0;", "getOnJoin$annotations", "()V", "getOnJoin", "()Lkotlinx/coroutines/selects/SelectClause0;", "registerSelectForOnJoin", "select", "Lkotlinx/coroutines/selects/SelectInstance;", "ignoredParam", "removeNode", "removeNode$kotlinx_coroutines_core", "onCancelComplete", "getOnCancelComplete$kotlinx_coroutines_core", "cancel", "(Ljava/util/concurrent/CancellationException;)V", "cancellationExceptionMessage", "cancelInternal", "parentCancelled", "parentJob", "childCancelled", "cancelCoroutine", "cancelImpl", "cancelImpl$kotlinx_coroutines_core", "cancelMakeCompleting", "defaultCancellationException", "Lkotlinx/coroutines/JobCancellationException;", "defaultCancellationException$kotlinx_coroutines_core", "getChildJobCancellationCause", "createCauseException", "makeCancelling", "getOrPromoteCancellingList", "tryMakeCancelling", "makeCompleting", "makeCompleting$kotlinx_coroutines_core", "makeCompletingOnce", "makeCompletingOnce$kotlinx_coroutines_core", "tryMakeCompleting", "tryMakeCompletingSlowPath", "exceptionOrNull", "getExceptionOrNull", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "tryWaitForChild", "child", "Lkotlinx/coroutines/ChildHandleNode;", "continueCompleting", "lastChild", "nextChild", "Lkotlinx/coroutines/internal/LockFreeLinkedListNode;", "children", "Lkotlin/sequences/Sequence;", "getChildren", "()Lkotlin/sequences/Sequence;", "attachChild", "handleOnCompletionException", "exception", "handleOnCompletionException$kotlinx_coroutines_core", "isScopedCoroutine", "handlesException", "getHandlesException$kotlinx_coroutines_core", "handleJobException", "onCompletionInternal", "afterCompletion", "toString", "toDebugString", "nameString", "nameString$kotlinx_coroutines_core", "stateString", "isCancelling", "(Lkotlinx/coroutines/Incomplete;)Z", "isCompletedExceptionally", "getCompletionExceptionOrNull", "getCompletedInternal", "getCompletedInternal$kotlinx_coroutines_core", "awaitInternal", "awaitSuspend", "onAwaitInternal", "Lkotlinx/coroutines/selects/SelectClause1;", "getOnAwaitInternal$annotations", "getOnAwaitInternal", "()Lkotlinx/coroutines/selects/SelectClause1;", "onAwaitInternalRegFunc", "onAwaitInternalProcessResFunc", "result", "SelectOnJoinCompletionHandler", "Finishing", "ChildCompletion", "AwaitContinuation", "SelectOnAwaitCompletionHandler", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class getTncConsentDate implements setStateTotalAttempt, setTncConsentDate {
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;
    private static final byte[] $$a = {TarConstants.LF_CHR, -23, 108, 101, 58, -58, -25, 35, -44, -12, -8, 4, -18, -8, -6, 8};
    private static final int $$b = 28;
    private static final /* synthetic */ AtomicReferenceFieldUpdater write = AtomicReferenceFieldUpdater.newUpdater(getTncConsentDate.class, Object.class, "_state$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater IconCompatParcelizer = AtomicReferenceFieldUpdater.newUpdater(getTncConsentDate.class, Object.class, "_parentHandle$volatile");

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            byte[] r0 = kotlin.getTncConsentDate.$$a
            int r6 = r6 * 3
            int r1 = 13 - r6
            int r8 = r8 * 4
            int r8 = 111 - r8
            byte[] r1 = new byte[r1]
            int r6 = 12 - r6
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r7
            goto L30
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            int r7 = r7 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L30:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-7)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getTncConsentDate.a(byte, short, short, java.lang.Object[]):void");
    }

    protected boolean AudioAttributesImplApi21Parcelizer(Throwable th) {
        return false;
    }

    public boolean MediaBrowserCompatCustomActionResultReceiver() {
        return false;
    }

    protected void RemoteActionCompatParcelizer(Object obj) {
    }

    protected void b_(Object obj) {
    }

    public boolean bd_() {
        return true;
    }

    protected boolean be_() {
        return false;
    }

    protected void onAddQueueItem() {
    }

    @Override // o.CurrentQuery.write, kotlin.CurrentQuery
    public <R> R fold(R r, MagicModuleSubmissionRequestBody<? super R, ? super CurrentQuery.write, ? extends R> magicModuleSubmissionRequestBody) {
        return (R) setPassingYear.read.AudioAttributesCompatParcelizer(this, r, magicModuleSubmissionRequestBody);
    }

    @Override // o.CurrentQuery.write, kotlin.CurrentQuery
    public <E extends CurrentQuery.write> E get(CurrentQuery.IconCompatParcelizer<E> iconCompatParcelizer) {
        return (E) setPassingYear.read.AudioAttributesCompatParcelizer(this, iconCompatParcelizer);
    }

    @Override // o.CurrentQuery.write, kotlin.CurrentQuery
    public CurrentQuery minusKey(CurrentQuery.IconCompatParcelizer<?> iconCompatParcelizer) {
        return setPassingYear.read.read(this, iconCompatParcelizer);
    }

    @Override // kotlin.CurrentQuery
    public CurrentQuery plus(CurrentQuery currentQuery) {
        return setPassingYear.read.read(this, currentQuery);
    }

    public getTncConsentDate(boolean z) {
        this._state$volatile = z ? isEmailVerified.write : isEmailVerified.IconCompatParcelizer;
    }

    @Override // o.CurrentQuery.write
    public final CurrentQuery.IconCompatParcelizer<?> getKey() {
        return setPassingYear.b_;
    }

    public final setWrong onCommand() {
        return (setWrong) IconCompatParcelizer.get(this);
    }

    private void read(setWrong setwrong) {
        IconCompatParcelizer.set(this, setwrong);
    }

    public final setPassingYear onCustomAction() {
        setWrong setwrongOnCommand = onCommand();
        if (setwrongOnCommand != null) {
            return setwrongOnCommand.RemoteActionCompatParcelizer();
        }
        return null;
    }

    protected final void read(setPassingYear setpassingyear) {
        getCollegeId.write();
        if (setpassingyear == null) {
            read(setEmail.INSTANCE);
            return;
        }
        setpassingyear.MediaMetadataCompat();
        setWrong setwrongRemoteActionCompatParcelizer = setpassingyear.RemoteActionCompatParcelizer(this);
        read(setwrongRemoteActionCompatParcelizer);
        if (MediaBrowserCompatMediaItem()) {
            setwrongRemoteActionCompatParcelizer.write();
            read(setEmail.INSTANCE);
        }
    }

    public final Object handleMediaPlayPauseIfPendingOnHandler() {
        return write.get(this);
    }

    @Override // kotlin.setPassingYear
    public boolean read() {
        Object objHandleMediaPlayPauseIfPendingOnHandler = handleMediaPlayPauseIfPendingOnHandler();
        return (objHandleMediaPlayPauseIfPendingOnHandler instanceof getPassingYear) && ((getPassingYear) objHandleMediaPlayPauseIfPendingOnHandler).bi_();
    }

    @Override // kotlin.setPassingYear
    public final boolean MediaBrowserCompatMediaItem() {
        return !(handleMediaPlayPauseIfPendingOnHandler() instanceof getPassingYear);
    }

    @Override // kotlin.setPassingYear
    public final boolean MediaBrowserCompatSearchResultReceiver() {
        Object objHandleMediaPlayPauseIfPendingOnHandler = handleMediaPlayPauseIfPendingOnHandler();
        if (objHandleMediaPlayPauseIfPendingOnHandler instanceof setUserSubmittedTimestampMs) {
            return true;
        }
        return (objHandleMediaPlayPauseIfPendingOnHandler instanceof IconCompatParcelizer) && ((IconCompatParcelizer) objHandleMediaPlayPauseIfPendingOnHandler).write();
    }

    private final Object IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer, Object obj) throws Throwable {
        Throwable thWrite;
        getCollegeId.write();
        getCollegeId.write();
        getCollegeId.write();
        setUserSubmittedTimestampMs setusersubmittedtimestampms = obj instanceof setUserSubmittedTimestampMs ? (setUserSubmittedTimestampMs) obj : null;
        Throwable th = setusersubmittedtimestampms != null ? setusersubmittedtimestampms.RemoteActionCompatParcelizer : null;
        synchronized (iconCompatParcelizer) {
            iconCompatParcelizer.write();
            List<Throwable> listAudioAttributesCompatParcelizer = iconCompatParcelizer.AudioAttributesCompatParcelizer(th);
            thWrite = write(iconCompatParcelizer, (List<? extends Throwable>) listAudioAttributesCompatParcelizer);
            if (thWrite != null) {
                RemoteActionCompatParcelizer(thWrite, listAudioAttributesCompatParcelizer);
            }
        }
        if (thWrite != null && thWrite != th) {
            obj = new setUserSubmittedTimestampMs(thWrite);
        }
        if (thWrite != null && (AudioAttributesCompatParcelizer(thWrite) || AudioAttributesImplApi21Parcelizer(thWrite))) {
            toMagicModuleMetaRepoModel.read(obj, "");
            ((setUserSubmittedTimestampMs) obj).AudioAttributesCompatParcelizer();
        }
        RemoteActionCompatParcelizer(obj);
        DateDeserializersDateBasedDeserializer.IconCompatParcelizer(write, this, iconCompatParcelizer, isEmailVerified.write(obj));
        getCollegeId.write();
        IconCompatParcelizer((getPassingYear) iconCompatParcelizer, obj);
        return obj;
    }

    private final Throwable write(IconCompatParcelizer iconCompatParcelizer, List<? extends Throwable> list) {
        Object next;
        Object obj = null;
        if (list.isEmpty()) {
            if (iconCompatParcelizer.write()) {
                return new setDegree(IconCompatParcelizer(), null, this);
            }
            return null;
        }
        List<? extends Throwable> list2 = list;
        Iterator<T> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (!(((Throwable) next) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) next;
        if (th != null) {
            return th;
        }
        Throwable th2 = list.get(0);
        if (th2 instanceof getPincode) {
            Iterator<T> it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                Throwable th3 = (Throwable) next2;
                if (th3 != th2 && (th3 instanceof getPincode)) {
                    obj = next2;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    private static void RemoteActionCompatParcelizer(Throwable th, List<? extends Throwable> list) {
        if (list.size() > 1) {
            Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
            Throwable thIconCompatParcelizer = !getCollegeId.RemoteActionCompatParcelizer() ? th : accessgetVideoConfigurationC0cp.IconCompatParcelizer(th);
            for (Throwable thIconCompatParcelizer2 : list) {
                if (getCollegeId.RemoteActionCompatParcelizer()) {
                    thIconCompatParcelizer2 = accessgetVideoConfigurationC0cp.IconCompatParcelizer(thIconCompatParcelizer2);
                }
                if (thIconCompatParcelizer2 != th && thIconCompatParcelizer2 != thIconCompatParcelizer && !(thIconCompatParcelizer2 instanceof CancellationException) && setNewSetFromMap.add(thIconCompatParcelizer2)) {
                    getPlanName.IconCompatParcelizer(th, thIconCompatParcelizer2);
                }
            }
        }
    }

    private final boolean read(getPassingYear getpassingyear, Object obj) throws Throwable {
        getCollegeId.write();
        getCollegeId.write();
        if (!DateDeserializersDateBasedDeserializer.IconCompatParcelizer(write, this, getpassingyear, isEmailVerified.write(obj))) {
            return false;
        }
        RemoteActionCompatParcelizer(obj);
        IconCompatParcelizer(getpassingyear, obj);
        return true;
    }

    private final void IconCompatParcelizer(getPassingYear getpassingyear, Object obj) throws Throwable {
        setWrong setwrongOnCommand = onCommand();
        if (setwrongOnCommand != null) {
            setwrongOnCommand.write();
            read(setEmail.INSTANCE);
        }
        setUserSubmittedTimestampMs setusersubmittedtimestampms = obj instanceof setUserSubmittedTimestampMs ? (setUserSubmittedTimestampMs) obj : null;
        Throwable th = setusersubmittedtimestampms != null ? setusersubmittedtimestampms.RemoteActionCompatParcelizer : null;
        if (getpassingyear instanceof getDefaultCourseEdition) {
            try {
                ((getDefaultCourseEdition) getpassingyear).write(th);
                return;
            } catch (Throwable th2) {
                StringBuilder sb = new StringBuilder("Exception in completion handler ");
                sb.append(getpassingyear);
                sb.append(" for ");
                sb.append(this);
                IconCompatParcelizer((Throwable) new TestMiniCompanion(sb.toString(), th2));
                return;
            }
        }
        isYearUpdateRequired audioAttributesCompatParcelizer = getpassingyear.getAudioAttributesCompatParcelizer();
        if (audioAttributesCompatParcelizer != null) {
            AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void RemoteActionCompatParcelizer(kotlin.isYearUpdateRequired r6, java.lang.Throwable r7) throws java.lang.Throwable {
        /*
            r5 = this;
            r0 = 4
            r6.AudioAttributesCompatParcelizer(r0)
            o.setReBufferCount r6 = (kotlin.setReBufferCount) r6
            java.lang.Object r0 = r6.AudioAttributesImplBaseParcelizer()
            java.lang.String r1 = ""
            kotlin.toMagicModuleMetaRepoModel.read(r0, r1)
            o.setPrepareTimestampMs r0 = (kotlin.setPrepareTimestampMs) r0
            r1 = 0
        L12:
            boolean r2 = kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r0, r6)
            if (r2 != 0) goto L59
            boolean r2 = r0 instanceof kotlin.getDefaultCourseEdition
            if (r2 == 0) goto L54
            r2 = r0
            o.getDefaultCourseEdition r2 = (kotlin.getDefaultCourseEdition) r2
            boolean r2 = r2.IconCompatParcelizer()
            if (r2 == 0) goto L54
            r2 = r0
            o.getDefaultCourseEdition r2 = (kotlin.getDefaultCourseEdition) r2     // Catch: java.lang.Throwable -> L2c
            r2.write(r7)     // Catch: java.lang.Throwable -> L2c
            goto L54
        L2c:
            r2 = move-exception
            r3 = r1
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            if (r3 == 0) goto L37
            kotlin.getPlanName.IconCompatParcelizer(r3, r2)
            if (r3 != 0) goto L54
        L37:
            o.TestMiniCompanion r1 = new o.TestMiniCompanion
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Exception in completion handler "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r4 = " for "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r1.<init>(r3, r2)
            o.getShowPopup r2 = kotlin.getShowPopup.INSTANCE
        L54:
            o.setPrepareTimestampMs r0 = r0.AudioAttributesImplApi21Parcelizer()
            goto L12
        L59:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L60
            r5.IconCompatParcelizer(r1)
        L60:
            r5.AudioAttributesCompatParcelizer(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getTncConsentDate.RemoteActionCompatParcelizer(o.isYearUpdateRequired, java.lang.Throwable):void");
    }

    private final boolean AudioAttributesCompatParcelizer(Throwable th) {
        if (be_()) {
            return true;
        }
        boolean z = th instanceof CancellationException;
        setWrong setwrongOnCommand = onCommand();
        return (setwrongOnCommand == null || setwrongOnCommand == setEmail.INSTANCE) ? z : setwrongOnCommand.AudioAttributesCompatParcelizer(th) || z;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void AudioAttributesCompatParcelizer(kotlin.isYearUpdateRequired r6, java.lang.Throwable r7) throws java.lang.Throwable {
        /*
            r5 = this;
            r0 = 1
            r6.AudioAttributesCompatParcelizer(r0)
            o.setReBufferCount r6 = (kotlin.setReBufferCount) r6
            java.lang.Object r0 = r6.AudioAttributesImplBaseParcelizer()
            java.lang.String r1 = ""
            kotlin.toMagicModuleMetaRepoModel.read(r0, r1)
            o.setPrepareTimestampMs r0 = (kotlin.setPrepareTimestampMs) r0
            r1 = 0
        L12:
            boolean r2 = kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r0, r6)
            if (r2 != 0) goto L53
            boolean r2 = r0 instanceof kotlin.getDefaultCourseEdition
            if (r2 == 0) goto L4e
            r2 = r0
            o.getDefaultCourseEdition r2 = (kotlin.getDefaultCourseEdition) r2
            r2 = r0
            o.getDefaultCourseEdition r2 = (kotlin.getDefaultCourseEdition) r2     // Catch: java.lang.Throwable -> L26
            r2.write(r7)     // Catch: java.lang.Throwable -> L26
            goto L4e
        L26:
            r2 = move-exception
            r3 = r1
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            if (r3 == 0) goto L31
            kotlin.getPlanName.IconCompatParcelizer(r3, r2)
            if (r3 != 0) goto L4e
        L31:
            o.TestMiniCompanion r1 = new o.TestMiniCompanion
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Exception in completion handler "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r4 = " for "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r1.<init>(r3, r2)
            o.getShowPopup r2 = kotlin.getShowPopup.INSTANCE
        L4e:
            o.setPrepareTimestampMs r0 = r0.AudioAttributesImplApi21Parcelizer()
            goto L12
        L53:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L5a
            r5.IconCompatParcelizer(r1)
        L5a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getTncConsentDate.AudioAttributesCompatParcelizer(o.isYearUpdateRequired, java.lang.Throwable):void");
    }

    private final int AudioAttributesImplApi21Parcelizer(Object obj) {
        if (obj instanceof CollegeYear) {
            if (((CollegeYear) obj).bi_()) {
                return 0;
            }
            if (!DateDeserializersDateBasedDeserializer.IconCompatParcelizer(write, this, obj, isEmailVerified.write)) {
                return -1;
            }
            onAddQueueItem();
            return 1;
        }
        byte b = (byte) 0;
        byte b2 = (byte) (b - 1);
        Object[] objArr = new Object[1];
        a(b, b2, (byte) (b2 + 1), objArr);
        if (!Class.forName((String) objArr[0]).isInstance(obj)) {
            return 0;
        }
        if (!DateDeserializersDateBasedDeserializer.IconCompatParcelizer(write, this, obj, ((asInstitute) obj).getAudioAttributesCompatParcelizer())) {
            return -1;
        }
        onAddQueueItem();
        return 1;
    }

    @Override // kotlin.setPassingYear
    public final CancellationException MediaBrowserCompatItemReceiver() {
        Object objHandleMediaPlayPauseIfPendingOnHandler = handleMediaPlayPauseIfPendingOnHandler();
        if (objHandleMediaPlayPauseIfPendingOnHandler instanceof IconCompatParcelizer) {
            Throwable thAudioAttributesCompatParcelizer = ((IconCompatParcelizer) objHandleMediaPlayPauseIfPendingOnHandler).AudioAttributesCompatParcelizer();
            if (thAudioAttributesCompatParcelizer != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(isVerified.read(this));
                sb.append(" is cancelling");
                CancellationException cancellationException = read(thAudioAttributesCompatParcelizer, sb.toString());
                if (cancellationException != null) {
                    return cancellationException;
                }
            }
            throw new IllegalStateException("Job is still new or active: ".concat(String.valueOf(this)).toString());
        }
        if (objHandleMediaPlayPauseIfPendingOnHandler instanceof getPassingYear) {
            throw new IllegalStateException("Job is still new or active: ".concat(String.valueOf(this)).toString());
        }
        if (objHandleMediaPlayPauseIfPendingOnHandler instanceof setUserSubmittedTimestampMs) {
            return read(this, ((setUserSubmittedTimestampMs) objHandleMediaPlayPauseIfPendingOnHandler).RemoteActionCompatParcelizer);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(isVerified.read(this));
        sb2.append(" has completed normally");
        return new setDegree(sb2.toString(), null, this);
    }

    public static /* synthetic */ CancellationException read(getTncConsentDate gettncconsentdate, Throwable th) {
        return gettncconsentdate.read(th, (String) null);
    }

    private CancellationException read(Throwable th, String str) {
        CancellationException cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (str == null) {
            str = IconCompatParcelizer();
        }
        return new setDegree(str, th, this);
    }

    @Override // kotlin.setPassingYear
    public final setYearOfPassout RemoteActionCompatParcelizer(getAnswerMap<? super Throwable, getShowPopup> getanswermap) {
        return RemoteActionCompatParcelizer(true, (getDefaultCourseEdition) new setInstitute(getanswermap));
    }

    @Override // kotlin.setPassingYear
    public final setYearOfPassout AudioAttributesCompatParcelizer(boolean z, boolean z2, getAnswerMap<? super Throwable, getShowPopup> getanswermap) {
        setInstitute setinstitute;
        if (z) {
            setinstitute = new FIDStatus(getanswermap);
        } else {
            setinstitute = new setInstitute(getanswermap);
        }
        return RemoteActionCompatParcelizer(z2, setinstitute);
    }

    public final setYearOfPassout RemoteActionCompatParcelizer(boolean z, getDefaultCourseEdition getdefaultcourseedition) {
        boolean zAudioAttributesCompatParcelizer;
        getdefaultcourseedition.RemoteActionCompatParcelizer(this);
        while (true) {
            Object objHandleMediaPlayPauseIfPendingOnHandler = handleMediaPlayPauseIfPendingOnHandler();
            if (objHandleMediaPlayPauseIfPendingOnHandler instanceof CollegeYear) {
                CollegeYear collegeYear = (CollegeYear) objHandleMediaPlayPauseIfPendingOnHandler;
                if (!collegeYear.bi_()) {
                    write(collegeYear);
                } else if (DateDeserializersDateBasedDeserializer.IconCompatParcelizer(write, this, objHandleMediaPlayPauseIfPendingOnHandler, getdefaultcourseedition)) {
                    break;
                }
            } else {
                if (!(objHandleMediaPlayPauseIfPendingOnHandler instanceof getPassingYear)) {
                    if (z) {
                        Object objHandleMediaPlayPauseIfPendingOnHandler2 = handleMediaPlayPauseIfPendingOnHandler();
                        setUserSubmittedTimestampMs setusersubmittedtimestampms = objHandleMediaPlayPauseIfPendingOnHandler2 instanceof setUserSubmittedTimestampMs ? (setUserSubmittedTimestampMs) objHandleMediaPlayPauseIfPendingOnHandler2 : null;
                        getdefaultcourseedition.write(setusersubmittedtimestampms != null ? setusersubmittedtimestampms.RemoteActionCompatParcelizer : null);
                    }
                    return setEmail.INSTANCE;
                }
                getPassingYear getpassingyear = (getPassingYear) objHandleMediaPlayPauseIfPendingOnHandler;
                isYearUpdateRequired audioAttributesCompatParcelizer = getpassingyear.getAudioAttributesCompatParcelizer();
                if (audioAttributesCompatParcelizer != null) {
                    if (getdefaultcourseedition.IconCompatParcelizer()) {
                        IconCompatParcelizer iconCompatParcelizer = getpassingyear instanceof IconCompatParcelizer ? (IconCompatParcelizer) getpassingyear : null;
                        Throwable thAudioAttributesCompatParcelizer = iconCompatParcelizer != null ? iconCompatParcelizer.AudioAttributesCompatParcelizer() : null;
                        if (thAudioAttributesCompatParcelizer == null) {
                            zAudioAttributesCompatParcelizer = audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(getdefaultcourseedition, 5);
                        } else {
                            if (z) {
                                getdefaultcourseedition.write(thAudioAttributesCompatParcelizer);
                            }
                            return setEmail.INSTANCE;
                        }
                    } else {
                        zAudioAttributesCompatParcelizer = audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(getdefaultcourseedition, 1);
                    }
                    if (zAudioAttributesCompatParcelizer) {
                        break;
                    }
                } else {
                    toMagicModuleMetaRepoModel.read(objHandleMediaPlayPauseIfPendingOnHandler, "");
                    RemoteActionCompatParcelizer((getDefaultCourseEdition) objHandleMediaPlayPauseIfPendingOnHandler);
                }
            }
        }
        return getdefaultcourseedition;
    }

    private final void write(CollegeYear collegeYear) {
        isYearUpdateRequired isyearupdaterequired = new isYearUpdateRequired();
        DateDeserializersDateBasedDeserializer.IconCompatParcelizer(write, this, collegeYear, collegeYear.bi_() ? isyearupdaterequired : new asInstitute(isyearupdaterequired));
    }

    private final void RemoteActionCompatParcelizer(getDefaultCourseEdition getdefaultcourseedition) {
        getdefaultcourseedition.RemoteActionCompatParcelizer(new isYearUpdateRequired());
        DateDeserializersDateBasedDeserializer.IconCompatParcelizer(write, this, getdefaultcourseedition, getdefaultcourseedition.AudioAttributesImplApi21Parcelizer());
    }

    @Override // kotlin.setPassingYear
    public final Object a_(SampleVideos<? super getShowPopup> sampleVideos) {
        if (!MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()) {
            getUserConfig.read(sampleVideos.getWrite());
            return getShowPopup.INSTANCE;
        }
        Object objRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(sampleVideos);
        return objRemoteActionCompatParcelizer == getYear.IconCompatParcelizer() ? objRemoteActionCompatParcelizer : getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String IconCompatParcelizer() {
        return "Job was cancelled";
    }

    public void read(Throwable th) throws Throwable {
        IconCompatParcelizer((Object) th);
    }

    @Override // kotlin.setStateTotalAttempt
    public final void write(setTncConsentDate settncconsentdate) throws Throwable {
        IconCompatParcelizer(settncconsentdate);
    }

    public boolean MediaBrowserCompatItemReceiver(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return IconCompatParcelizer((Object) th) && bd_();
    }

    public final boolean RemoteActionCompatParcelizer(Throwable th) {
        return IconCompatParcelizer((Object) th);
    }

    public final boolean IconCompatParcelizer(Object obj) throws Throwable {
        Object objMediaBrowserCompatItemReceiver = isEmailVerified.AudioAttributesCompatParcelizer;
        if (MediaBrowserCompatCustomActionResultReceiver() && (objMediaBrowserCompatItemReceiver = write(obj)) == isEmailVerified.read) {
            return true;
        }
        if (objMediaBrowserCompatItemReceiver == isEmailVerified.AudioAttributesCompatParcelizer) {
            objMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(obj);
        }
        if (objMediaBrowserCompatItemReceiver == isEmailVerified.AudioAttributesCompatParcelizer || objMediaBrowserCompatItemReceiver == isEmailVerified.read) {
            return true;
        }
        if (objMediaBrowserCompatItemReceiver == isEmailVerified.MediaBrowserCompatItemReceiver) {
            return false;
        }
        b_(objMediaBrowserCompatItemReceiver);
        return true;
    }

    @Override // kotlin.setTncConsentDate
    public final CancellationException RatingCompat() {
        Throwable thAudioAttributesCompatParcelizer;
        Object objHandleMediaPlayPauseIfPendingOnHandler = handleMediaPlayPauseIfPendingOnHandler();
        if (objHandleMediaPlayPauseIfPendingOnHandler instanceof IconCompatParcelizer) {
            thAudioAttributesCompatParcelizer = ((IconCompatParcelizer) objHandleMediaPlayPauseIfPendingOnHandler).AudioAttributesCompatParcelizer();
        } else if (objHandleMediaPlayPauseIfPendingOnHandler instanceof setUserSubmittedTimestampMs) {
            thAudioAttributesCompatParcelizer = ((setUserSubmittedTimestampMs) objHandleMediaPlayPauseIfPendingOnHandler).RemoteActionCompatParcelizer;
        } else {
            if (objHandleMediaPlayPauseIfPendingOnHandler instanceof getPassingYear) {
                throw new IllegalStateException("Cannot be cancelling child in this state: ".concat(String.valueOf(objHandleMediaPlayPauseIfPendingOnHandler)).toString());
            }
            thAudioAttributesCompatParcelizer = null;
        }
        CancellationException cancellationException = thAudioAttributesCompatParcelizer instanceof CancellationException ? (CancellationException) thAudioAttributesCompatParcelizer : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        StringBuilder sb = new StringBuilder("Parent job is ");
        sb.append(MediaDescriptionCompat(objHandleMediaPlayPauseIfPendingOnHandler));
        return new setDegree(sb.toString(), thAudioAttributesCompatParcelizer, this);
    }

    private final Throwable AudioAttributesCompatParcelizer(Object obj) {
        if (obj == null || (obj instanceof Throwable)) {
            Throwable th = (Throwable) obj;
            return th == null ? new setDegree(IconCompatParcelizer(), null, this) : th;
        }
        toMagicModuleMetaRepoModel.read(obj, "");
        return ((setTncConsentDate) obj).RatingCompat();
    }

    private final isYearUpdateRequired write(getPassingYear getpassingyear) {
        isYearUpdateRequired audioAttributesCompatParcelizer = getpassingyear.getAudioAttributesCompatParcelizer();
        if (audioAttributesCompatParcelizer != null) {
            return audioAttributesCompatParcelizer;
        }
        if (getpassingyear instanceof CollegeYear) {
            return new isYearUpdateRequired();
        }
        if (getpassingyear instanceof getDefaultCourseEdition) {
            RemoteActionCompatParcelizer((getDefaultCourseEdition) getpassingyear);
            return null;
        }
        throw new IllegalStateException("State should have list: ".concat(String.valueOf(getpassingyear)).toString());
    }

    private final boolean AudioAttributesCompatParcelizer(getPassingYear getpassingyear, Throwable th) throws Throwable {
        getCollegeId.write();
        getCollegeId.write();
        isYearUpdateRequired isyearupdaterequiredWrite = write(getpassingyear);
        if (isyearupdaterequiredWrite == null) {
            return false;
        }
        if (!DateDeserializersDateBasedDeserializer.IconCompatParcelizer(write, this, getpassingyear, new IconCompatParcelizer(isyearupdaterequiredWrite, th))) {
            return false;
        }
        RemoteActionCompatParcelizer(isyearupdaterequiredWrite, th);
        return true;
    }

    private final Object write(Object obj, Object obj2) {
        if (!(obj instanceof getPassingYear)) {
            return isEmailVerified.AudioAttributesCompatParcelizer;
        }
        if ((!(obj instanceof CollegeYear) && !(obj instanceof getDefaultCourseEdition)) || (obj instanceof setTestPattern) || (obj2 instanceof setUserSubmittedTimestampMs)) {
            return RemoteActionCompatParcelizer((getPassingYear) obj, obj2);
        }
        return read((getPassingYear) obj, obj2) ? obj2 : isEmailVerified.RemoteActionCompatParcelizer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object RemoteActionCompatParcelizer(getPassingYear getpassingyear, Object obj) throws Throwable {
        isYearUpdateRequired isyearupdaterequiredWrite = write(getpassingyear);
        if (isyearupdaterequiredWrite == null) {
            return isEmailVerified.RemoteActionCompatParcelizer;
        }
        IconCompatParcelizer iconCompatParcelizer = getpassingyear instanceof IconCompatParcelizer ? (IconCompatParcelizer) getpassingyear : null;
        if (iconCompatParcelizer == null) {
            iconCompatParcelizer = new IconCompatParcelizer(isyearupdaterequiredWrite, null);
        }
        MagicModuleUseCaseImplWhenMappings.write writeVar = new MagicModuleUseCaseImplWhenMappings.write();
        synchronized (iconCompatParcelizer) {
            if (iconCompatParcelizer.read()) {
                return isEmailVerified.AudioAttributesCompatParcelizer;
            }
            iconCompatParcelizer.MediaBrowserCompatItemReceiver();
            if (iconCompatParcelizer != getpassingyear && !DateDeserializersDateBasedDeserializer.IconCompatParcelizer(write, this, getpassingyear, iconCompatParcelizer)) {
                return isEmailVerified.RemoteActionCompatParcelizer;
            }
            getCollegeId.write();
            boolean zWrite = iconCompatParcelizer.write();
            setUserSubmittedTimestampMs setusersubmittedtimestampms = obj instanceof setUserSubmittedTimestampMs ? (setUserSubmittedTimestampMs) obj : null;
            if (setusersubmittedtimestampms != null) {
                iconCompatParcelizer.write(setusersubmittedtimestampms.RemoteActionCompatParcelizer);
            }
            writeVar.write = zWrite ^ true ? iconCompatParcelizer.AudioAttributesCompatParcelizer() : 0;
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            Throwable th = (Throwable) writeVar.write;
            if (th != null) {
                RemoteActionCompatParcelizer(isyearupdaterequiredWrite, th);
            }
            isYearUpdateRequired isyearupdaterequired = isyearupdaterequiredWrite;
            setTestPattern settestpatternRemoteActionCompatParcelizer = RemoteActionCompatParcelizer((setPrepareTimestampMs) isyearupdaterequired);
            if (settestpatternRemoteActionCompatParcelizer != null && write(iconCompatParcelizer, settestpatternRemoteActionCompatParcelizer, obj)) {
                return isEmailVerified.read;
            }
            isyearupdaterequiredWrite.AudioAttributesCompatParcelizer(2);
            setTestPattern settestpatternRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer((setPrepareTimestampMs) isyearupdaterequired);
            if (settestpatternRemoteActionCompatParcelizer2 != null && write(iconCompatParcelizer, settestpatternRemoteActionCompatParcelizer2, obj)) {
                return isEmailVerified.read;
            }
            return IconCompatParcelizer(iconCompatParcelizer, obj);
        }
    }

    private static Throwable AudioAttributesImplBaseParcelizer(Object obj) {
        setUserSubmittedTimestampMs setusersubmittedtimestampms = obj instanceof setUserSubmittedTimestampMs ? (setUserSubmittedTimestampMs) obj : null;
        if (setusersubmittedtimestampms != null) {
            return setusersubmittedtimestampms.RemoteActionCompatParcelizer;
        }
        return null;
    }

    private final boolean write(IconCompatParcelizer iconCompatParcelizer, setTestPattern settestpattern, Object obj) {
        while (getUserConfig.write(settestpattern.write, false, new AudioAttributesCompatParcelizer(this, iconCompatParcelizer, settestpattern, obj)) == setEmail.INSTANCE) {
            settestpattern = RemoteActionCompatParcelizer((setPrepareTimestampMs) settestpattern);
            if (settestpattern == null) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(IconCompatParcelizer iconCompatParcelizer, setTestPattern settestpattern, Object obj) {
        getCollegeId.write();
        setTestPattern settestpattern2 = settestpattern;
        setTestPattern settestpatternRemoteActionCompatParcelizer = RemoteActionCompatParcelizer((setPrepareTimestampMs) settestpattern2);
        if (settestpatternRemoteActionCompatParcelizer == null || !write(iconCompatParcelizer, settestpatternRemoteActionCompatParcelizer, obj)) {
            iconCompatParcelizer.getAudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(2);
            setTestPattern settestpatternRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer((setPrepareTimestampMs) settestpattern2);
            if (settestpatternRemoteActionCompatParcelizer2 == null || !write(iconCompatParcelizer, settestpatternRemoteActionCompatParcelizer2, obj)) {
                b_(IconCompatParcelizer(iconCompatParcelizer, obj));
            }
        }
    }

    private static setTestPattern RemoteActionCompatParcelizer(setPrepareTimestampMs setpreparetimestampms) {
        while (setpreparetimestampms.bg_()) {
            setpreparetimestampms = setpreparetimestampms.AudioAttributesImplApi26Parcelizer();
        }
        while (true) {
            setpreparetimestampms = setpreparetimestampms.AudioAttributesImplApi21Parcelizer();
            if (!setpreparetimestampms.bg_()) {
                if (setpreparetimestampms instanceof setTestPattern) {
                    return (setTestPattern) setpreparetimestampms;
                }
                if (setpreparetimestampms instanceof isYearUpdateRequired) {
                    return null;
                }
            }
        }
    }

    static final class read extends getTotalSolvedModule implements MagicModuleSubmissionRequestBody<setStateResult<? super setPassingYear>, SampleVideos<? super getShowPopup>, Object> {
        private Object AudioAttributesCompatParcelizer;
        private /* synthetic */ Object IconCompatParcelizer;
        private Object read;
        private int write;

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
        
            if (r7.IconCompatParcelizer(((kotlin.setTestPattern) r1).write, r6) == r0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
        
            if (r4.IconCompatParcelizer(r7, r6) == r0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0085, code lost:
        
            return r0;
         */
        /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0070 -> B:27:0x0086). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0083 -> B:27:0x0086). Please report as a decompilation issue!!! */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r6.write
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r1 = r6.read
                o.setPrepareTimestampMs r1 = (kotlin.setPrepareTimestampMs) r1
                java.lang.Object r3 = r6.AudioAttributesCompatParcelizer
                o.setReBufferCount r3 = (kotlin.setReBufferCount) r3
                java.lang.Object r4 = r6.IconCompatParcelizer
                o.setStateResult r4 = (kotlin.setStateResult) r4
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L86
            L1e:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L26:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                goto L8b
            L2a:
                kotlin.SdkPayloadData.IconCompatParcelizer(r7)
                java.lang.Object r7 = r6.IconCompatParcelizer
                o.setStateResult r7 = (kotlin.setStateResult) r7
                o.getTncConsentDate r1 = kotlin.getTncConsentDate.this
                java.lang.Object r1 = r1.handleMediaPlayPauseIfPendingOnHandler()
                boolean r4 = r1 instanceof kotlin.setTestPattern
                if (r4 == 0) goto L4b
                o.setTestPattern r1 = (kotlin.setTestPattern) r1
                o.setStateTotalAttempt r1 = r1.write
                r2 = r6
                o.SampleVideos r2 = (kotlin.SampleVideos) r2
                r6.write = r3
                java.lang.Object r6 = r7.IconCompatParcelizer(r1, r2)
                if (r6 != r0) goto L8b
                goto L85
            L4b:
                boolean r3 = r1 instanceof kotlin.getPassingYear
                if (r3 == 0) goto L8b
                o.getPassingYear r1 = (kotlin.getPassingYear) r1
                o.isYearUpdateRequired r1 = r1.getAudioAttributesCompatParcelizer()
                if (r1 == 0) goto L8b
                o.setReBufferCount r1 = (kotlin.setReBufferCount) r1
                java.lang.Object r3 = r1.AudioAttributesImplBaseParcelizer()
                java.lang.String r4 = ""
                kotlin.toMagicModuleMetaRepoModel.read(r3, r4)
                o.setPrepareTimestampMs r3 = (kotlin.setPrepareTimestampMs) r3
                r4 = r7
                r5 = r3
                r3 = r1
                r1 = r5
            L68:
                boolean r7 = kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r1, r3)
                if (r7 != 0) goto L8b
                boolean r7 = r1 instanceof kotlin.setTestPattern
                if (r7 == 0) goto L86
                r7 = r1
                o.setTestPattern r7 = (kotlin.setTestPattern) r7
                o.setStateTotalAttempt r7 = r7.write
                r6.IconCompatParcelizer = r4
                r6.AudioAttributesCompatParcelizer = r3
                r6.read = r1
                r6.write = r2
                java.lang.Object r7 = r4.IconCompatParcelizer(r7, r6)
                if (r7 != r0) goto L86
            L85:
                return r0
            L86:
                o.setPrepareTimestampMs r1 = r1.AudioAttributesImplApi21Parcelizer()
                goto L68
            L8b:
                o.getShowPopup r6 = kotlin.getShowPopup.INSTANCE
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: o.getTncConsentDate.read.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        read(SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            read readVar = getTncConsentDate.this.new read(sampleVideos);
            readVar.IconCompatParcelizer = obj;
            return readVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(setStateResult<? super setPassingYear> setstateresult, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(setstateresult, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // kotlin.setPassingYear
    public final getTopRankers<setPassingYear> bk_() {
        return StateResult.IconCompatParcelizer((MagicModuleSubmissionRequestBody) new read(null));
    }

    @Override // kotlin.setPassingYear
    public final setWrong RemoteActionCompatParcelizer(setStateTotalAttempt setstatetotalattempt) {
        setTestPattern settestpattern = new setTestPattern(setstatetotalattempt);
        settestpattern.RemoteActionCompatParcelizer(this);
        while (true) {
            Object objHandleMediaPlayPauseIfPendingOnHandler = handleMediaPlayPauseIfPendingOnHandler();
            if (objHandleMediaPlayPauseIfPendingOnHandler instanceof CollegeYear) {
                CollegeYear collegeYear = (CollegeYear) objHandleMediaPlayPauseIfPendingOnHandler;
                if (!collegeYear.bi_()) {
                    write(collegeYear);
                } else if (DateDeserializersDateBasedDeserializer.IconCompatParcelizer(write, this, objHandleMediaPlayPauseIfPendingOnHandler, settestpattern)) {
                    break;
                }
            } else {
                if (!(objHandleMediaPlayPauseIfPendingOnHandler instanceof getPassingYear)) {
                    Object objHandleMediaPlayPauseIfPendingOnHandler2 = handleMediaPlayPauseIfPendingOnHandler();
                    setUserSubmittedTimestampMs setusersubmittedtimestampms = objHandleMediaPlayPauseIfPendingOnHandler2 instanceof setUserSubmittedTimestampMs ? (setUserSubmittedTimestampMs) objHandleMediaPlayPauseIfPendingOnHandler2 : null;
                    settestpattern.write(setusersubmittedtimestampms != null ? setusersubmittedtimestampms.RemoteActionCompatParcelizer : null);
                    return setEmail.INSTANCE;
                }
                isYearUpdateRequired audioAttributesCompatParcelizer = ((getPassingYear) objHandleMediaPlayPauseIfPendingOnHandler).getAudioAttributesCompatParcelizer();
                if (audioAttributesCompatParcelizer != null) {
                    setTestPattern settestpattern2 = settestpattern;
                    if (!audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(settestpattern2, 7)) {
                        boolean zAudioAttributesCompatParcelizer = audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(settestpattern2, 3);
                        Object objHandleMediaPlayPauseIfPendingOnHandler3 = handleMediaPlayPauseIfPendingOnHandler();
                        if (objHandleMediaPlayPauseIfPendingOnHandler3 instanceof IconCompatParcelizer) {
                            thAudioAttributesCompatParcelizer = ((IconCompatParcelizer) objHandleMediaPlayPauseIfPendingOnHandler3).AudioAttributesCompatParcelizer();
                        } else {
                            getCollegeId.write();
                            setUserSubmittedTimestampMs setusersubmittedtimestampms2 = objHandleMediaPlayPauseIfPendingOnHandler3 instanceof setUserSubmittedTimestampMs ? (setUserSubmittedTimestampMs) objHandleMediaPlayPauseIfPendingOnHandler3 : null;
                            if (setusersubmittedtimestampms2 != null) {
                                thAudioAttributesCompatParcelizer = setusersubmittedtimestampms2.RemoteActionCompatParcelizer;
                            }
                        }
                        settestpattern.write(thAudioAttributesCompatParcelizer);
                        if (zAudioAttributesCompatParcelizer) {
                            getCollegeId.write();
                        } else {
                            return setEmail.INSTANCE;
                        }
                    }
                } else {
                    toMagicModuleMetaRepoModel.read(objHandleMediaPlayPauseIfPendingOnHandler, "");
                    RemoteActionCompatParcelizer((getDefaultCourseEdition) objHandleMediaPlayPauseIfPendingOnHandler);
                }
            }
        }
        return settestpattern;
    }

    public void IconCompatParcelizer(Throwable th) throws Throwable {
        throw th;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(onFastForward());
        sb.append('@');
        sb.append(isVerified.IconCompatParcelizer(this));
        return sb.toString();
    }

    private String onFastForward() {
        StringBuilder sb = new StringBuilder();
        sb.append(RemoteActionCompatParcelizer());
        sb.append('{');
        sb.append(MediaDescriptionCompat(handleMediaPlayPauseIfPendingOnHandler()));
        sb.append('}');
        return sb.toString();
    }

    public String RemoteActionCompatParcelizer() {
        return isVerified.read(this);
    }

    private static String MediaDescriptionCompat(Object obj) {
        if (!(obj instanceof IconCompatParcelizer)) {
            return obj instanceof getPassingYear ? ((getPassingYear) obj).bi_() ? "Active" : "New" : obj instanceof setUserSubmittedTimestampMs ? "Cancelled" : "Completed";
        }
        IconCompatParcelizer iconCompatParcelizer = (IconCompatParcelizer) obj;
        return iconCompatParcelizer.write() ? "Cancelling" : iconCompatParcelizer.read() ? "Completing" : "Active";
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00060\u0002j\u0002`\u00012\u00020\u0003B!\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\t0$2\b\u0010%\u001a\u0004\u0018\u00010\tJ\u000e\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020\tJ\u000e\u0010)\u001a\b\u0012\u0004\u0012\u00020\t0*H\u0002J\b\u0010+\u001a\u00020,H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\t\u0010\u000e\u001a\u00020\u000fX\u0082\u0004R$\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00078F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0015X\u0082\u0004R(\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0015X\u0082\u0004R(\u0010\u001b\u001a\u0004\u0018\u00010\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b \u0010\u0011R\u0011\u0010!\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b!\u0010\u0011R\u0014\u0010\"\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0011¨\u0006-"}, d2 = {"Lkotlinx/coroutines/JobSupport$Finishing;", "Lkotlinx/coroutines/internal/SynchronizedObject;", "", "Lkotlinx/coroutines/Incomplete;", "list", "Lkotlinx/coroutines/NodeList;", "isCompleting", "", "rootCause", "", "<init>", "(Lkotlinx/coroutines/NodeList;ZLjava/lang/Throwable;)V", "getList", "()Lkotlinx/coroutines/NodeList;", "_isCompleting", "Lkotlinx/atomicfu/AtomicBoolean;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "()Z", "setCompleting", "(Z)V", "_rootCause", "Lkotlinx/atomicfu/AtomicRef;", "getRootCause", "()Ljava/lang/Throwable;", "setRootCause", "(Ljava/lang/Throwable;)V", "_exceptionsHolder", "exceptionsHolder", "getExceptionsHolder", "()Ljava/lang/Object;", "setExceptionsHolder", "(Ljava/lang/Object;)V", "isSealed", "isCancelling", "isActive", "sealLocked", "", "proposedException", "addExceptionLocked", "", "exception", "allocateList", "Ljava/util/ArrayList;", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer implements getPassingYear {
        private final isYearUpdateRequired AudioAttributesCompatParcelizer;
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile = 0;
        private volatile /* synthetic */ Object _rootCause$volatile;
        private static final /* synthetic */ AtomicIntegerFieldUpdater RemoteActionCompatParcelizer = AtomicIntegerFieldUpdater.newUpdater(IconCompatParcelizer.class, "_isCompleting$volatile");
        private static final /* synthetic */ AtomicReferenceFieldUpdater write = AtomicReferenceFieldUpdater.newUpdater(IconCompatParcelizer.class, Object.class, "_rootCause$volatile");
        private static final /* synthetic */ AtomicReferenceFieldUpdater read = AtomicReferenceFieldUpdater.newUpdater(IconCompatParcelizer.class, Object.class, "_exceptionsHolder$volatile");

        @Override // kotlin.getPassingYear
        /* JADX INFO: renamed from: bf_, reason: from getter */
        public final isYearUpdateRequired getAudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public IconCompatParcelizer(isYearUpdateRequired isyearupdaterequired, Throwable th) {
            this.AudioAttributesCompatParcelizer = isyearupdaterequired;
            this._rootCause$volatile = th;
        }

        public final boolean read() {
            return RemoteActionCompatParcelizer.get(this) != 0;
        }

        public final void MediaBrowserCompatItemReceiver() {
            RemoteActionCompatParcelizer.set(this, 1);
        }

        public final Throwable AudioAttributesCompatParcelizer() {
            return (Throwable) write.get(this);
        }

        private void IconCompatParcelizer(Throwable th) {
            write.set(this, th);
        }

        private final Object AudioAttributesImplApi26Parcelizer() {
            return read.get(this);
        }

        private final void write(Object obj) {
            read.set(this, obj);
        }

        public final boolean AudioAttributesImplBaseParcelizer() {
            return AudioAttributesImplApi26Parcelizer() == isEmailVerified.MediaBrowserCompatCustomActionResultReceiver;
        }

        public final boolean write() {
            return AudioAttributesCompatParcelizer() != null;
        }

        @Override // kotlin.getPassingYear
        public final boolean bi_() {
            return AudioAttributesCompatParcelizer() == null;
        }

        public final List<Throwable> AudioAttributesCompatParcelizer(Throwable th) {
            AbstractList abstractListAudioAttributesImplApi21Parcelizer;
            Object objAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
            if (objAudioAttributesImplApi26Parcelizer == null) {
                abstractListAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
            } else if (objAudioAttributesImplApi26Parcelizer instanceof Throwable) {
                AbstractList abstractListAudioAttributesImplApi21Parcelizer2 = AudioAttributesImplApi21Parcelizer();
                abstractListAudioAttributesImplApi21Parcelizer2.add(objAudioAttributesImplApi26Parcelizer);
                abstractListAudioAttributesImplApi21Parcelizer = abstractListAudioAttributesImplApi21Parcelizer2;
            } else {
                if (!(objAudioAttributesImplApi26Parcelizer instanceof ArrayList)) {
                    throw new IllegalStateException("State is ".concat(String.valueOf(objAudioAttributesImplApi26Parcelizer)).toString());
                }
                abstractListAudioAttributesImplApi21Parcelizer = (ArrayList) objAudioAttributesImplApi26Parcelizer;
            }
            Throwable thAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            if (thAudioAttributesCompatParcelizer != null) {
                abstractListAudioAttributesImplApi21Parcelizer.add(0, thAudioAttributesCompatParcelizer);
            }
            if (th != null && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(th, thAudioAttributesCompatParcelizer)) {
                abstractListAudioAttributesImplApi21Parcelizer.add(th);
            }
            write(isEmailVerified.MediaBrowserCompatCustomActionResultReceiver);
            return abstractListAudioAttributesImplApi21Parcelizer;
        }

        public final void write(Throwable th) {
            Throwable thAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
            if (thAudioAttributesCompatParcelizer == null) {
                IconCompatParcelizer(th);
                return;
            }
            if (th != thAudioAttributesCompatParcelizer) {
                Object objAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer();
                if (objAudioAttributesImplApi26Parcelizer == null) {
                    write((Object) th);
                    return;
                }
                if (!(objAudioAttributesImplApi26Parcelizer instanceof Throwable)) {
                    if (!(objAudioAttributesImplApi26Parcelizer instanceof ArrayList)) {
                        throw new IllegalStateException("State is ".concat(String.valueOf(objAudioAttributesImplApi26Parcelizer)).toString());
                    }
                    ((ArrayList) objAudioAttributesImplApi26Parcelizer).add(th);
                } else {
                    if (th == objAudioAttributesImplApi26Parcelizer) {
                        return;
                    }
                    AbstractCollection abstractCollectionAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
                    abstractCollectionAudioAttributesImplApi21Parcelizer.add(objAudioAttributesImplApi26Parcelizer);
                    abstractCollectionAudioAttributesImplApi21Parcelizer.add(th);
                    write(abstractCollectionAudioAttributesImplApi21Parcelizer);
                }
            }
        }

        private static ArrayList<Throwable> AudioAttributesImplApi21Parcelizer() {
            return new ArrayList<>(4);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Finishing[cancelling=");
            sb.append(write());
            sb.append(", completing=");
            sb.append(read());
            sb.append(", rootCause=");
            sb.append(AudioAttributesCompatParcelizer());
            sb.append(", exceptions=");
            sb.append(AudioAttributesImplApi26Parcelizer());
            sb.append(", list=");
            sb.append(getAudioAttributesCompatParcelizer());
            sb.append(']');
            return sb.toString();
        }
    }

    static final class AudioAttributesCompatParcelizer extends getDefaultCourseEdition {
        private final Object IconCompatParcelizer;
        private final IconCompatParcelizer RemoteActionCompatParcelizer;
        private final getTncConsentDate read;
        private final setTestPattern write;

        @Override // kotlin.getDefaultCourseEdition
        public final boolean IconCompatParcelizer() {
            return false;
        }

        public AudioAttributesCompatParcelizer(getTncConsentDate gettncconsentdate, IconCompatParcelizer iconCompatParcelizer, setTestPattern settestpattern, Object obj) {
            this.read = gettncconsentdate;
            this.RemoteActionCompatParcelizer = iconCompatParcelizer;
            this.write = settestpattern;
            this.IconCompatParcelizer = obj;
        }

        @Override // kotlin.getDefaultCourseEdition
        public final void write(Throwable th) {
            this.read.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, this.write, this.IconCompatParcelizer);
        }
    }

    static final class RemoteActionCompatParcelizer<T> extends setStateSolvedCount<T> {
        private final getTncConsentDate write;

        public RemoteActionCompatParcelizer(SampleVideos<? super T> sampleVideos, getTncConsentDate gettncconsentdate) {
            super(sampleVideos, 1);
            this.write = gettncconsentdate;
        }

        @Override // kotlin.setStateSolvedCount
        public final Throwable read(setPassingYear setpassingyear) {
            Throwable thAudioAttributesCompatParcelizer;
            Object objHandleMediaPlayPauseIfPendingOnHandler = this.write.handleMediaPlayPauseIfPendingOnHandler();
            return (!(objHandleMediaPlayPauseIfPendingOnHandler instanceof IconCompatParcelizer) || (thAudioAttributesCompatParcelizer = ((IconCompatParcelizer) objHandleMediaPlayPauseIfPendingOnHandler).AudioAttributesCompatParcelizer()) == null) ? objHandleMediaPlayPauseIfPendingOnHandler instanceof setUserSubmittedTimestampMs ? ((setUserSubmittedTimestampMs) objHandleMediaPlayPauseIfPendingOnHandler).RemoteActionCompatParcelizer : setpassingyear.MediaBrowserCompatItemReceiver() : thAudioAttributesCompatParcelizer;
        }

        @Override // kotlin.setStateSolvedCount
        protected final String MediaBrowserCompatItemReceiver() {
            return "AwaitContinuation";
        }
    }

    public final Throwable bl_() {
        Object objHandleMediaPlayPauseIfPendingOnHandler = handleMediaPlayPauseIfPendingOnHandler();
        if (objHandleMediaPlayPauseIfPendingOnHandler instanceof getPassingYear) {
            throw new IllegalStateException("This job has not completed yet".toString());
        }
        return AudioAttributesImplBaseParcelizer(objHandleMediaPlayPauseIfPendingOnHandler);
    }

    public final Object MediaDescriptionCompat() throws Throwable {
        Object objHandleMediaPlayPauseIfPendingOnHandler = handleMediaPlayPauseIfPendingOnHandler();
        if (objHandleMediaPlayPauseIfPendingOnHandler instanceof getPassingYear) {
            throw new IllegalStateException("This job has not completed yet".toString());
        }
        if (objHandleMediaPlayPauseIfPendingOnHandler instanceof setUserSubmittedTimestampMs) {
            throw ((setUserSubmittedTimestampMs) objHandleMediaPlayPauseIfPendingOnHandler).RemoteActionCompatParcelizer;
        }
        return isEmailVerified.IconCompatParcelizer(objHandleMediaPlayPauseIfPendingOnHandler);
    }

    protected final Object read(SampleVideos<Object> sampleVideos) throws Throwable {
        Object objHandleMediaPlayPauseIfPendingOnHandler;
        do {
            objHandleMediaPlayPauseIfPendingOnHandler = handleMediaPlayPauseIfPendingOnHandler();
            if (!(objHandleMediaPlayPauseIfPendingOnHandler instanceof getPassingYear)) {
                if (objHandleMediaPlayPauseIfPendingOnHandler instanceof setUserSubmittedTimestampMs) {
                    Throwable th = ((setUserSubmittedTimestampMs) objHandleMediaPlayPauseIfPendingOnHandler).RemoteActionCompatParcelizer;
                    if (getCollegeId.RemoteActionCompatParcelizer() && (sampleVideos instanceof getNextQuery)) {
                        throw accessgetVideoConfigurationC0cp.read(th, (getNextQuery) sampleVideos);
                    }
                    throw th;
                }
                return isEmailVerified.IconCompatParcelizer(objHandleMediaPlayPauseIfPendingOnHandler);
            }
        } while (AudioAttributesImplApi21Parcelizer(objHandleMediaPlayPauseIfPendingOnHandler) < 0);
        return write(sampleVideos);
    }

    private final Object write(SampleVideos<Object> sampleVideos) {
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = new RemoteActionCompatParcelizer(getYear.IconCompatParcelizer(sampleVideos), this);
        remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
        setStatePercentile.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer, getUserConfig.write(this, new setEmailVerified(remoteActionCompatParcelizer)));
        Object objAudioAttributesCompatParcelizer = remoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
        if (objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer()) {
            getAnsweredMcqCount.write(sampleVideos);
        }
        return objAudioAttributesCompatParcelizer;
    }

    @Override // kotlin.setPassingYear
    public final boolean MediaMetadataCompat() {
        int iAudioAttributesImplApi21Parcelizer;
        do {
            iAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer(handleMediaPlayPauseIfPendingOnHandler());
            if (iAudioAttributesImplApi21Parcelizer == 0) {
                return false;
            }
        } while (iAudioAttributesImplApi21Parcelizer != 1);
        return true;
    }

    private final boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        Object objHandleMediaPlayPauseIfPendingOnHandler;
        do {
            objHandleMediaPlayPauseIfPendingOnHandler = handleMediaPlayPauseIfPendingOnHandler();
            if (!(objHandleMediaPlayPauseIfPendingOnHandler instanceof getPassingYear)) {
                return false;
            }
        } while (AudioAttributesImplApi21Parcelizer(objHandleMediaPlayPauseIfPendingOnHandler) < 0);
        return true;
    }

    private final Object RemoteActionCompatParcelizer(SampleVideos<? super getShowPopup> sampleVideos) {
        setStateSolvedCount setstatesolvedcount = new setStateSolvedCount(getYear.IconCompatParcelizer(sampleVideos), 1);
        setstatesolvedcount.MediaBrowserCompatCustomActionResultReceiver();
        setStateSolvedCount setstatesolvedcount2 = setstatesolvedcount;
        setStatePercentile.AudioAttributesCompatParcelizer(setstatesolvedcount2, getUserConfig.write(this, new setToken(setstatesolvedcount2)));
        Object objAudioAttributesCompatParcelizer = setstatesolvedcount.AudioAttributesCompatParcelizer();
        if (objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer()) {
            getAnsweredMcqCount.write(sampleVideos);
        }
        return objAudioAttributesCompatParcelizer == getYear.IconCompatParcelizer() ? objAudioAttributesCompatParcelizer : getShowPopup.INSTANCE;
    }

    public final void read(getDefaultCourseEdition getdefaultcourseedition) {
        Object objHandleMediaPlayPauseIfPendingOnHandler;
        do {
            objHandleMediaPlayPauseIfPendingOnHandler = handleMediaPlayPauseIfPendingOnHandler();
            if (!(objHandleMediaPlayPauseIfPendingOnHandler instanceof getDefaultCourseEdition)) {
                if (!(objHandleMediaPlayPauseIfPendingOnHandler instanceof getPassingYear) || ((getPassingYear) objHandleMediaPlayPauseIfPendingOnHandler).getAudioAttributesCompatParcelizer() == null) {
                    return;
                }
                getdefaultcourseedition.bh_();
                return;
            }
            if (objHandleMediaPlayPauseIfPendingOnHandler != getdefaultcourseedition) {
                return;
            }
        } while (!DateDeserializersDateBasedDeserializer.IconCompatParcelizer(write, this, objHandleMediaPlayPauseIfPendingOnHandler, isEmailVerified.write));
    }

    @Override // kotlin.setPassingYear, kotlin.setLastName
    public void RemoteActionCompatParcelizer(CancellationException cancellationException) throws Throwable {
        if (cancellationException == null) {
            cancellationException = new setDegree(IconCompatParcelizer(), null, this);
        }
        read(cancellationException);
    }

    private final Object write(Object obj) {
        Object objWrite;
        do {
            Object objHandleMediaPlayPauseIfPendingOnHandler = handleMediaPlayPauseIfPendingOnHandler();
            if (!(objHandleMediaPlayPauseIfPendingOnHandler instanceof getPassingYear) || ((objHandleMediaPlayPauseIfPendingOnHandler instanceof IconCompatParcelizer) && ((IconCompatParcelizer) objHandleMediaPlayPauseIfPendingOnHandler).read())) {
                return isEmailVerified.AudioAttributesCompatParcelizer;
            }
            objWrite = write(objHandleMediaPlayPauseIfPendingOnHandler, new setUserSubmittedTimestampMs(AudioAttributesCompatParcelizer(obj)));
        } while (objWrite == isEmailVerified.RemoteActionCompatParcelizer);
        return objWrite;
    }

    private final Object MediaBrowserCompatItemReceiver(Object obj) throws Throwable {
        Throwable thAudioAttributesCompatParcelizer = null;
        while (true) {
            Object objHandleMediaPlayPauseIfPendingOnHandler = handleMediaPlayPauseIfPendingOnHandler();
            if (!(objHandleMediaPlayPauseIfPendingOnHandler instanceof IconCompatParcelizer)) {
                if (!(objHandleMediaPlayPauseIfPendingOnHandler instanceof getPassingYear)) {
                    return isEmailVerified.MediaBrowserCompatItemReceiver;
                }
                if (thAudioAttributesCompatParcelizer == null) {
                    thAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(obj);
                }
                getPassingYear getpassingyear = (getPassingYear) objHandleMediaPlayPauseIfPendingOnHandler;
                if (getpassingyear.bi_()) {
                    if (AudioAttributesCompatParcelizer(getpassingyear, thAudioAttributesCompatParcelizer)) {
                        return isEmailVerified.AudioAttributesCompatParcelizer;
                    }
                } else {
                    Object objWrite = write(objHandleMediaPlayPauseIfPendingOnHandler, new setUserSubmittedTimestampMs(thAudioAttributesCompatParcelizer));
                    if (objWrite != isEmailVerified.AudioAttributesCompatParcelizer) {
                        if (objWrite != isEmailVerified.RemoteActionCompatParcelizer) {
                            return objWrite;
                        }
                    } else {
                        throw new IllegalStateException("Cannot happen in ".concat(String.valueOf(objHandleMediaPlayPauseIfPendingOnHandler)).toString());
                    }
                }
            } else {
                synchronized (objHandleMediaPlayPauseIfPendingOnHandler) {
                    if (((IconCompatParcelizer) objHandleMediaPlayPauseIfPendingOnHandler).AudioAttributesImplBaseParcelizer()) {
                        return isEmailVerified.MediaBrowserCompatItemReceiver;
                    }
                    boolean zWrite = ((IconCompatParcelizer) objHandleMediaPlayPauseIfPendingOnHandler).write();
                    if (obj != null || !zWrite) {
                        if (thAudioAttributesCompatParcelizer == null) {
                            thAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(obj);
                        }
                        ((IconCompatParcelizer) objHandleMediaPlayPauseIfPendingOnHandler).write(thAudioAttributesCompatParcelizer);
                    }
                    Throwable thAudioAttributesCompatParcelizer2 = zWrite ? null : ((IconCompatParcelizer) objHandleMediaPlayPauseIfPendingOnHandler).AudioAttributesCompatParcelizer();
                    if (thAudioAttributesCompatParcelizer2 != null) {
                        RemoteActionCompatParcelizer(((IconCompatParcelizer) objHandleMediaPlayPauseIfPendingOnHandler).getAudioAttributesCompatParcelizer(), thAudioAttributesCompatParcelizer2);
                    }
                    return isEmailVerified.AudioAttributesCompatParcelizer;
                }
            }
        }
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver(Object obj) {
        Object objWrite;
        do {
            objWrite = write(handleMediaPlayPauseIfPendingOnHandler(), obj);
            if (objWrite == isEmailVerified.AudioAttributesCompatParcelizer) {
                return false;
            }
            if (objWrite == isEmailVerified.read) {
                return true;
            }
        } while (objWrite == isEmailVerified.RemoteActionCompatParcelizer);
        b_(objWrite);
        return true;
    }

    public final Object AudioAttributesImplApi26Parcelizer(Object obj) {
        Object objWrite;
        do {
            objWrite = write(handleMediaPlayPauseIfPendingOnHandler(), obj);
            if (objWrite == isEmailVerified.AudioAttributesCompatParcelizer) {
                StringBuilder sb = new StringBuilder("Job ");
                sb.append(this);
                sb.append(" is already complete or completing, but is being completed with ");
                sb.append(obj);
                throw new IllegalStateException(sb.toString(), AudioAttributesImplBaseParcelizer(obj));
            }
        } while (objWrite == isEmailVerified.RemoteActionCompatParcelizer);
        return objWrite;
    }
}
