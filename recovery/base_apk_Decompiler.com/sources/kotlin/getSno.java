package kotlin;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class getSno implements MarkIncompleteResponseBody, getFilterType {
    private volatile boolean AudioAttributesCompatParcelizer;
    private getPaymentFlag<MarkIncompleteResponseBody> write;

    @Override // kotlin.MarkIncompleteResponseBody
    public final void aL_() {
        if (this.AudioAttributesCompatParcelizer) {
            return;
        }
        synchronized (this) {
            if (this.AudioAttributesCompatParcelizer) {
                return;
            }
            this.AudioAttributesCompatParcelizer = true;
            getPaymentFlag<MarkIncompleteResponseBody> getpaymentflag = this.write;
            this.write = null;
            RemoteActionCompatParcelizer(getpaymentflag);
        }
    }

    @Override // kotlin.MarkIncompleteResponseBody
    public final boolean write() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.getFilterType
    public final boolean read(MarkIncompleteResponseBody markIncompleteResponseBody) {
        setHasPyt.AudioAttributesCompatParcelizer(markIncompleteResponseBody, "d is null");
        if (!this.AudioAttributesCompatParcelizer) {
            synchronized (this) {
                if (!this.AudioAttributesCompatParcelizer) {
                    getPaymentFlag<MarkIncompleteResponseBody> getpaymentflag = this.write;
                    if (getpaymentflag == null) {
                        getpaymentflag = new getPaymentFlag<>();
                        this.write = getpaymentflag;
                    }
                    getpaymentflag.RemoteActionCompatParcelizer(markIncompleteResponseBody);
                    return true;
                }
            }
        }
        markIncompleteResponseBody.aL_();
        return false;
    }

    @Override // kotlin.getFilterType
    public final boolean RemoteActionCompatParcelizer(MarkIncompleteResponseBody markIncompleteResponseBody) {
        if (!IconCompatParcelizer(markIncompleteResponseBody)) {
            return false;
        }
        markIncompleteResponseBody.aL_();
        return true;
    }

    @Override // kotlin.getFilterType
    public final boolean IconCompatParcelizer(MarkIncompleteResponseBody markIncompleteResponseBody) {
        setHasPyt.AudioAttributesCompatParcelizer(markIncompleteResponseBody, "Disposable item is null");
        if (this.AudioAttributesCompatParcelizer) {
            return false;
        }
        synchronized (this) {
            if (this.AudioAttributesCompatParcelizer) {
                return false;
            }
            getPaymentFlag<MarkIncompleteResponseBody> getpaymentflag = this.write;
            if (getpaymentflag != null) {
                if (getpaymentflag.AudioAttributesCompatParcelizer(markIncompleteResponseBody)) {
                    return true;
                }
            }
            return false;
        }
    }

    public final void read() {
        if (this.AudioAttributesCompatParcelizer) {
            return;
        }
        synchronized (this) {
            if (this.AudioAttributesCompatParcelizer) {
                return;
            }
            getPaymentFlag<MarkIncompleteResponseBody> getpaymentflag = this.write;
            this.write = null;
            RemoteActionCompatParcelizer(getpaymentflag);
        }
    }

    private static void RemoteActionCompatParcelizer(getPaymentFlag<MarkIncompleteResponseBody> getpaymentflag) {
        if (getpaymentflag != null) {
            ArrayList arrayList = null;
            for (Object obj : getpaymentflag.RemoteActionCompatParcelizer()) {
                if (obj instanceof MarkIncompleteResponseBody) {
                    try {
                        ((MarkIncompleteResponseBody) obj).aL_();
                    } catch (Throwable th) {
                        getEndTimeMs.RemoteActionCompatParcelizer(th);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(th);
                    }
                }
            }
            if (arrayList != null) {
                if (arrayList.size() == 1) {
                    throw OrderDetails.RemoteActionCompatParcelizer((Throwable) arrayList.get(0));
                }
                throw new getPytIds(arrayList);
            }
        }
    }
}
