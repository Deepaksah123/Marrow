package kotlin;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class getSgst<T> extends getEmptyState<T> implements Callable<T> {
    private Callable<? extends T> write;

    public getSgst(Callable<? extends T> callable) {
        this.write = callable;
    }

    @Override // kotlin.getEmptyState
    public final void RemoteActionCompatParcelizer(InteractiveVideoElementUiModelKt<? super T> interactiveVideoElementUiModelKt) {
        MarkIncompleteResponseBody markIncompleteResponseBodyIconCompatParcelizer = StubResponseBody.IconCompatParcelizer();
        interactiveVideoElementUiModelKt.IconCompatParcelizer(markIncompleteResponseBodyIconCompatParcelizer);
        if (markIncompleteResponseBodyIconCompatParcelizer.write()) {
            return;
        }
        try {
            T tCall = this.write.call();
            if (markIncompleteResponseBodyIconCompatParcelizer.write()) {
                return;
            }
            if (tCall == null) {
                interactiveVideoElementUiModelKt.aK_();
            } else {
                interactiveVideoElementUiModelKt.AudioAttributesCompatParcelizer(tCall);
            }
        } catch (Throwable th) {
            getEndTimeMs.RemoteActionCompatParcelizer(th);
            if (!markIncompleteResponseBodyIconCompatParcelizer.write()) {
                interactiveVideoElementUiModelKt.IconCompatParcelizer(th);
            } else {
                getPaymentRefIds.RemoteActionCompatParcelizer(th);
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public final T call() throws Exception {
        return this.write.call();
    }
}
