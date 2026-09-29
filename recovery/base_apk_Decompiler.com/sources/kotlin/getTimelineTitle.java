package kotlin;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class getTimelineTitle extends AtomicReference<MarkIncompleteResponseBody> implements MarkIncompleteResponseBody {
    public getTimelineTitle() {
    }

    public getTimelineTitle(MarkIncompleteResponseBody markIncompleteResponseBody) {
        lazySet(markIncompleteResponseBody);
    }

    public final boolean AudioAttributesCompatParcelizer(MarkIncompleteResponseBody markIncompleteResponseBody) {
        return getSubjectId.write(this, markIncompleteResponseBody);
    }

    @Override // kotlin.MarkIncompleteResponseBody
    public final void aL_() {
        getSubjectId.RemoteActionCompatParcelizer(this);
    }

    @Override // kotlin.MarkIncompleteResponseBody
    public final boolean write() {
        return getSubjectId.AudioAttributesCompatParcelizer(get());
    }
}
