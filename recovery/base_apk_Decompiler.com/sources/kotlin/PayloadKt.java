package kotlin;

import android.R;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class PayloadKt<T> extends LessonDynamicResponseBody<T> {
    private Callable<? extends T> IconCompatParcelizer;

    public PayloadKt(Callable<? extends T> callable) {
        this.IconCompatParcelizer = callable;
    }

    @Override // kotlin.LessonDynamicResponseBody
    public final void IconCompatParcelizer(MarkCompleteResponseBody<? super T> markCompleteResponseBody) {
        MarkIncompleteResponseBody markIncompleteResponseBodyIconCompatParcelizer = StubResponseBody.IconCompatParcelizer();
        markCompleteResponseBody.IconCompatParcelizer(markIncompleteResponseBodyIconCompatParcelizer);
        if (markIncompleteResponseBodyIconCompatParcelizer.write()) {
            return;
        }
        try {
            R.color colorVar = (Object) setHasPyt.AudioAttributesCompatParcelizer(this.IconCompatParcelizer.call(), "The callable returned a null value");
            if (markIncompleteResponseBodyIconCompatParcelizer.write()) {
                return;
            }
            markCompleteResponseBody.AudioAttributesCompatParcelizer(colorVar);
        } catch (Throwable th) {
            getEndTimeMs.RemoteActionCompatParcelizer(th);
            if (!markIncompleteResponseBodyIconCompatParcelizer.write()) {
                markCompleteResponseBody.IconCompatParcelizer(th);
            } else {
                getPaymentRefIds.RemoteActionCompatParcelizer(th);
            }
        }
    }
}
