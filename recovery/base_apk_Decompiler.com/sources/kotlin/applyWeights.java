package kotlin;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\t\u0010\nR$\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0013\u001a\u00060\u0002j\u0002`\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u0018\u0010\t\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012"}, d2 = {"Lo/applyWeights;", "T", "", "<init>", "()V", "AudioAttributesCompatParcelizer", "()Ljava/lang/Object;", "p0", "", "IconCompatParcelizer", "(Ljava/lang/Object;)V", "Ljava/util/concurrent/atomic/AtomicReference;", "Lo/applyInverseWeights;", "Lo/read;", "RemoteActionCompatParcelizer", "Ljava/util/concurrent/atomic/AtomicReference;", "read", "Lo/SynchronizedObject;", "Ljava/lang/Object;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class applyWeights<T> {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private T IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final AtomicReference<applyInverseWeights> read = new AtomicReference<>(addInto.read);

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final Object write = new Object();

    public final T AudioAttributesCompatParcelizer() {
        long jIconCompatParcelizer = multiplyConjugateInto.IconCompatParcelizer();
        if (jIconCompatParcelizer == realIdx.AudioAttributesCompatParcelizer()) {
            return this.IconCompatParcelizer;
        }
        return (T) this.read.get().write(jIconCompatParcelizer);
    }

    public final void IconCompatParcelizer(T p0) {
        long jIconCompatParcelizer = multiplyConjugateInto.IconCompatParcelizer();
        if (jIconCompatParcelizer == realIdx.AudioAttributesCompatParcelizer()) {
            this.IconCompatParcelizer = p0;
            return;
        }
        synchronized (this.write) {
            applyInverseWeights applyinverseweights = this.read.get();
            if (applyinverseweights.read(jIconCompatParcelizer, p0)) {
                return;
            }
            this.read.set(applyinverseweights.write(jIconCompatParcelizer, p0));
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
        }
    }
}
