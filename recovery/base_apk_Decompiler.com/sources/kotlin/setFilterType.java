package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class setFilterType implements MarkIncompleteResponseBody, getFilterType {
    private volatile boolean AudioAttributesCompatParcelizer;
    private List<MarkIncompleteResponseBody> RemoteActionCompatParcelizer;

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
            List<MarkIncompleteResponseBody> list = this.RemoteActionCompatParcelizer;
            this.RemoteActionCompatParcelizer = null;
            RemoteActionCompatParcelizer(list);
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
                    List linkedList = this.RemoteActionCompatParcelizer;
                    if (linkedList == null) {
                        linkedList = new LinkedList();
                        this.RemoteActionCompatParcelizer = linkedList;
                    }
                    linkedList.add(markIncompleteResponseBody);
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
            List<MarkIncompleteResponseBody> list = this.RemoteActionCompatParcelizer;
            if (list != null) {
                if (list.remove(markIncompleteResponseBody)) {
                    return true;
                }
            }
            return false;
        }
    }

    private static void RemoteActionCompatParcelizer(List<MarkIncompleteResponseBody> list) {
        if (list != null) {
            Iterator<MarkIncompleteResponseBody> it = list.iterator();
            ArrayList arrayList = null;
            while (it.hasNext()) {
                try {
                    it.next().aL_();
                } catch (Throwable th) {
                    getEndTimeMs.RemoteActionCompatParcelizer(th);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(th);
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
