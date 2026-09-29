package kotlin;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes2.dex */
public final class interpolate {
    public volatile Object RemoteActionCompatParcelizer;
    public final CountDownLatch AudioAttributesCompatParcelizer = new CountDownLatch(1);
    private isInvalidJoinTransition read = new isInvalidJoinTransition();

    public final void IconCompatParcelizer(Object obj) {
        if (this.AudioAttributesCompatParcelizer.getCount() == 0) {
            return;
        }
        this.RemoteActionCompatParcelizer = obj;
        this.AudioAttributesCompatParcelizer.countDown();
    }
}
