package kotlin;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes.dex */
public final class getSequenceId<T> extends CountDownLatch implements MarkCompleteResponseBody<T>, InteractiveVideoElementUiModelKt<T> {
    private T IconCompatParcelizer;
    private MarkIncompleteResponseBody RemoteActionCompatParcelizer;
    private Throwable read;
    private volatile boolean write;

    public getSequenceId() {
        super(1);
    }

    private void AudioAttributesCompatParcelizer() {
        this.write = true;
        MarkIncompleteResponseBody markIncompleteResponseBody = this.RemoteActionCompatParcelizer;
        if (markIncompleteResponseBody != null) {
            markIncompleteResponseBody.aL_();
        }
    }

    @Override // kotlin.MarkCompleteResponseBody
    public final void IconCompatParcelizer(MarkIncompleteResponseBody markIncompleteResponseBody) {
        this.RemoteActionCompatParcelizer = markIncompleteResponseBody;
        if (this.write) {
            markIncompleteResponseBody.aL_();
        }
    }

    @Override // kotlin.MarkCompleteResponseBody
    public final void AudioAttributesCompatParcelizer(T t) {
        this.IconCompatParcelizer = t;
        countDown();
    }

    @Override // kotlin.MarkCompleteResponseBody
    public final void IconCompatParcelizer(Throwable th) {
        this.read = th;
        countDown();
    }

    @Override // kotlin.InteractiveVideoElementUiModelKt
    public final void aK_() {
        countDown();
    }

    public final T IconCompatParcelizer() {
        if (getCount() != 0) {
            try {
                ModuleSubscriptionData.RemoteActionCompatParcelizer();
                await();
            } catch (InterruptedException e) {
                AudioAttributesCompatParcelizer();
                throw OrderDetails.RemoteActionCompatParcelizer(e);
            }
        }
        Throwable th = this.read;
        if (th != null) {
            throw OrderDetails.RemoteActionCompatParcelizer(th);
        }
        return this.IconCompatParcelizer;
    }
}
