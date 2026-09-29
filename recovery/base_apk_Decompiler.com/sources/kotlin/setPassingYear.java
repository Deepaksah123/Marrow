package kotlin;

import com.google.android.exoplayer2.text.ttml.TtmlNode;
import java.util.concurrent.CancellationException;
import kotlin.CurrentQuery;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bg\u0018\u0000 12\u00020\u0001:\u00011J\u0011\u0010\f\u001a\u00060\u000ej\u0002`\rH'¢\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\bH&J\u001f\u0010\u0011\u001a\u00020\u00122\u0010\b\u0002\u0010\u0013\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\rH&¢\u0006\u0002\u0010\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0017J\u0014\u0010\u0011\u001a\u00020\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0015H'J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH'J\u000e\u0010\u001e\u001a\u00020\u0012H¦@¢\u0006\u0002\u0010\u001fJ6\u0010$\u001a\u00020%2'\u0010&\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00120(j\u0002`'H&¢\u0006\u0002\u0010+JJ\u0010$\u001a\u00020%2\b\b\u0002\u0010,\u001a\u00020\b2\b\b\u0002\u0010-\u001a\u00020\b2'\u0010&\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u0015¢\u0006\f\b)\u0012\b\b*\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\u00120(j\u0002`'H'¢\u0006\u0002\u0010.J\u0011\u0010/\u001a\u00020\u00002\u0006\u00100\u001a\u00020\u0000H\u0097\u0002R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u00008&X§\u0004¢\u0006\f\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\tR\u0012\u0010\n\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\tR\u0012\u0010\u000b\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00000\u0017X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0012\u0010 \u001a\u00020!X¦\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u00062"}, d2 = {"Lkotlinx/coroutines/Job;", "Lkotlin/coroutines/CoroutineContext$Element;", "parent", "getParent$annotations", "()V", "getParent", "()Lkotlinx/coroutines/Job;", "isActive", "", "()Z", "isCompleted", "isCancelled", "getCancellationException", "Lkotlinx/coroutines/CancellationException;", "Ljava/util/concurrent/CancellationException;", "()Ljava/util/concurrent/CancellationException;", TtmlNode.START, "cancel", "", "cause", "(Ljava/util/concurrent/CancellationException;)V", "", "children", "Lkotlin/sequences/Sequence;", "getChildren", "()Lkotlin/sequences/Sequence;", "attachChild", "Lkotlinx/coroutines/ChildHandle;", "child", "Lkotlinx/coroutines/ChildJob;", "join", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onJoin", "Lkotlinx/coroutines/selects/SelectClause0;", "getOnJoin", "()Lkotlinx/coroutines/selects/SelectClause0;", "invokeOnCompletion", "Lkotlinx/coroutines/DisposableHandle;", "handler", "Lkotlinx/coroutines/CompletionHandler;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;", "onCancelling", "invokeImmediately", "(ZZLkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/DisposableHandle;", "plus", "other", "Key", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface setPassingYear extends CurrentQuery.write {
    public static final write b_ = write.write;

    setYearOfPassout AudioAttributesCompatParcelizer(boolean z, boolean z2, getAnswerMap<? super Throwable, getShowPopup> getanswermap);

    CancellationException MediaBrowserCompatItemReceiver();

    boolean MediaBrowserCompatMediaItem();

    boolean MediaBrowserCompatSearchResultReceiver();

    boolean MediaMetadataCompat();

    setWrong RemoteActionCompatParcelizer(setStateTotalAttempt setstatetotalattempt);

    setYearOfPassout RemoteActionCompatParcelizer(getAnswerMap<? super Throwable, getShowPopup> getanswermap);

    void RemoteActionCompatParcelizer(CancellationException cancellationException);

    Object a_(SampleVideos<? super getShowPopup> sampleVideos);

    getTopRankers<setPassingYear> bk_();

    boolean read();

    public static final class read {
        public static <R> R AudioAttributesCompatParcelizer(setPassingYear setpassingyear, R r, MagicModuleSubmissionRequestBody<? super R, ? super CurrentQuery.write, ? extends R> magicModuleSubmissionRequestBody) {
            return (R) CurrentQuery.write.DefaultImpls.fold(setpassingyear, r, magicModuleSubmissionRequestBody);
        }

        public static <E extends CurrentQuery.write> E AudioAttributesCompatParcelizer(setPassingYear setpassingyear, CurrentQuery.IconCompatParcelizer<E> iconCompatParcelizer) {
            return (E) CurrentQuery.write.DefaultImpls.get(setpassingyear, iconCompatParcelizer);
        }

        public static CurrentQuery read(setPassingYear setpassingyear, CurrentQuery.IconCompatParcelizer<?> iconCompatParcelizer) {
            return CurrentQuery.write.DefaultImpls.minusKey(setpassingyear, iconCompatParcelizer);
        }

        public static CurrentQuery read(setPassingYear setpassingyear, CurrentQuery currentQuery) {
            return CurrentQuery.write.DefaultImpls.AudioAttributesCompatParcelizer(setpassingyear, currentQuery);
        }
    }

    public static final class write implements CurrentQuery.IconCompatParcelizer<setPassingYear> {
        static final /* synthetic */ write write = new write();

        private write() {
        }
    }
}
