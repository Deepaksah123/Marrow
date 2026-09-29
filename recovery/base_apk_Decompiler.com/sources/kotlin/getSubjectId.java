package kotlin;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public enum getSubjectId implements MarkIncompleteResponseBody {
    DISPOSED;

    @Override // kotlin.MarkIncompleteResponseBody
    public final void aL_() {
    }

    @Override // kotlin.MarkIncompleteResponseBody
    public final boolean write() {
        return true;
    }

    public static boolean AudioAttributesCompatParcelizer(MarkIncompleteResponseBody markIncompleteResponseBody) {
        return markIncompleteResponseBody == DISPOSED;
    }

    public static boolean AudioAttributesCompatParcelizer(AtomicReference<MarkIncompleteResponseBody> atomicReference, MarkIncompleteResponseBody markIncompleteResponseBody) {
        setHasPyt.AudioAttributesCompatParcelizer(markIncompleteResponseBody, "d is null");
        if (setBackInvokedCallbackEnabled.read(atomicReference, null, markIncompleteResponseBody)) {
            return true;
        }
        markIncompleteResponseBody.aL_();
        if (atomicReference.get() == DISPOSED) {
            return false;
        }
        read();
        return false;
    }

    public static boolean write(AtomicReference<MarkIncompleteResponseBody> atomicReference, MarkIncompleteResponseBody markIncompleteResponseBody) {
        MarkIncompleteResponseBody markIncompleteResponseBody2;
        do {
            markIncompleteResponseBody2 = atomicReference.get();
            if (markIncompleteResponseBody2 == DISPOSED) {
                if (markIncompleteResponseBody == null) {
                    return false;
                }
                markIncompleteResponseBody.aL_();
                return false;
            }
        } while (!setBackInvokedCallbackEnabled.read(atomicReference, markIncompleteResponseBody2, markIncompleteResponseBody));
        return true;
    }

    public static boolean RemoteActionCompatParcelizer(AtomicReference<MarkIncompleteResponseBody> atomicReference) {
        MarkIncompleteResponseBody andSet;
        MarkIncompleteResponseBody markIncompleteResponseBody = atomicReference.get();
        getSubjectId getsubjectid = DISPOSED;
        if (markIncompleteResponseBody == getsubjectid || (andSet = atomicReference.getAndSet(getsubjectid)) == getsubjectid) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.aL_();
        return true;
    }

    public static boolean read(MarkIncompleteResponseBody markIncompleteResponseBody, MarkIncompleteResponseBody markIncompleteResponseBody2) {
        if (markIncompleteResponseBody2 == null) {
            getPaymentRefIds.RemoteActionCompatParcelizer(new NullPointerException("next is null"));
            return false;
        }
        if (markIncompleteResponseBody == null) {
            return true;
        }
        markIncompleteResponseBody2.aL_();
        read();
        return false;
    }

    private static void read() {
        getPaymentRefIds.RemoteActionCompatParcelizer(new getTagExpiryMs("Disposable already set!"));
    }

    public static boolean read(AtomicReference<MarkIncompleteResponseBody> atomicReference, MarkIncompleteResponseBody markIncompleteResponseBody) {
        if (setBackInvokedCallbackEnabled.read(atomicReference, null, markIncompleteResponseBody)) {
            return true;
        }
        if (atomicReference.get() != DISPOSED) {
            return false;
        }
        markIncompleteResponseBody.aL_();
        return false;
    }
}
